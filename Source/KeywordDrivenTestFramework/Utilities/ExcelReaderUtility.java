/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Utilities;

import KeywordDrivenTestFramework.Entities.DataColumn;
import KeywordDrivenTestFramework.Entities.DataRow;
import KeywordDrivenTestFramework.Entities.TestEntity;
import java.io.File;
import java.io.FileFilter;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.NumberToTextConverter;

import java.io.FileInputStream;
import java.io.InputStream;
import static java.lang.System.err;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.io.filefilter.WildcardFileFilter;

/**
 *
 * @author fnell
 */
public class ExcelReaderUtility 
{
    LinkedList<DataRow> sourceDataList;
    List<TestEntity> testDataList;
    Sheet _workSheet;
    Workbook _workbook;
    public ExcelReaderUtility()
    {
        testDataList = new ArrayList<>();
        System.setProperty("java.awt.headless", "true"); 
    }
    
    public List<TestEntity> getTestDataFromExcelFile(String filePath)
    {
        _workbook = getExcelWorkbook(filePath);
        readExcelWorkSheet(_workbook);      
        retrieveTestDataFromSheet();      
        return testDataList;
    }
    
    public Workbook getExcelWorkbook(String filePath)
    {
         try(InputStream reader = new FileInputStream(filePath))
        { 
            return WorkbookFactory.create(reader);
        }
        catch(Exception e)
        {
            return null;
        } 
    }
    
    private boolean readExcelWorkSheetByName(Workbook workbook,String SheetName)
    {
        try
        {           
            _workSheet = workbook.getSheet(SheetName);
            return true;
        }
        catch(Exception e)
        {
            return false;
        }             
    } 
    
     private boolean readExcelWorkSheet(Workbook workbook, String sheetName)
    {
        try
        {           
            _workSheet = workbook.getSheet(sheetName);
            return true;
        }
        catch(Exception e)
        {
            return false;
        }             
    }
      
     public LinkedList<DataRow> retrieveDataRowsFromSheet(String workBookPath, String workSheetName)
    {
        LinkedList<DataRow> dataRows = new LinkedList<>();
        
        try
        {
            this.readExcelWorkSheet(this.getExcelWorkbook(workBookPath), workSheetName);
            
            Row firstRow = this._workSheet.getRow(0);
            
            int lastColumnIndex = firstRow.getLastCellNum();
            
            for(Row row : _workSheet)
            {
                DataRow currentRow = new DataRow();
                
                if(row.getRowNum() > 0)
                {
                    for(int i = 0; i < lastColumnIndex; i++)
                    {
                        Cell currentCell = row.getCell(i);
                        String cell = currentCell.toString();
                        DataColumn column;
                        
                        if(currentCell == null || "".equals(cell))
                        {
                            column = new DataColumn(this.getCellValue(firstRow.getCell(i))," ");
                        }
                        else
                        {
                            column = new DataColumn(this.getCellValue(firstRow.getCell(currentCell.getColumnIndex())),this.getCellValue(currentCell));
                        }
                        
                        currentRow.DataColumns.add(column);
                        
                    }
                    if(sourceDataList != null)
                        sourceDataList.add(currentRow);
                    dataRows.add(currentRow);
                }
                       
            }    
            
        }
        catch(Exception ex)
        {
            err.println("[ERROR] Failed to retrieve data rows from sheet - " + ex.getMessage());
        }
        return dataRows;
    }
     
    private boolean readExcelWorkSheet(Workbook workbook)
    {
        try
        {           
            _workSheet = workbook.getSheetAt(0);
            return true;
        }
        catch(Exception e)
        {
            return false;
        }             
    }    
    
    private boolean retrieveTestDataFromSheet()
    {
        int lastColumn = 0;
        if(_workSheet == null)
        {
            return false;
        }
        try
        {
            for (Row row : _workSheet) 
            {
                String firstCellValue = getCellValue(row.getCell(0));
                if(!firstCellValue.equals(""))
                {                    
                  lastColumn = row.getLastCellNum();
                  getTestParameters(row.getRowNum(), row.getRowNum() + 1,lastColumn);
                }
            }                         
             return true;
        }
        catch(Exception e)
        {
            return false;
        }
    }
    
    private String getCellValue(Cell cell)
    {
        String cellValue = "";
        try
        {
            switch (cell.getCellType()) 
            {
                case Cell.CELL_TYPE_STRING:
                    cellValue = cell.getRichStringCellValue().getString();
                    break;   
                case Cell.CELL_TYPE_BLANK:
                    cellValue = cell.getRichStringCellValue().getString();
                    break;
                case Cell.CELL_TYPE_NUMERIC:
                    if (DateUtil.isCellDateFormatted(cell)) 
                    {
                        cellValue = cell.getDateCellValue().toString();
                    } else 
                    {
                        cellValue = NumberToTextConverter.toText(cell.getNumericCellValue());          
                    }
                    break;
                case Cell.CELL_TYPE_BOOLEAN:
                    cellValue = String.valueOf(cell.getBooleanCellValue());
                    break;
                case Cell.CELL_TYPE_FORMULA:
                    cellValue = String.valueOf(cell.getCellFormula());
                    break;
                default:            
            }
            if(cellValue == null)
                cellValue = "";
        }
        catch(Exception e)
        {
            return "";
        }
        return cellValue;
    }
    
    private void getTestParameters(int parameterRowIndex, int valueRowIndex, int lastColumn)
    {
        TestEntity testData = new TestEntity();
        Row parameterRow, valueRow;
        String testCaseId, methodName, testDescription = "";
		int testParemeterStartcolumn = 3;
        
        parameterRow = _workSheet.getRow(parameterRowIndex);
        valueRow = _workSheet.getRow(valueRowIndex);
        
        
        testCaseId = getCellValue(parameterRow.getCell(0)).trim();
        methodName = getCellValue(parameterRow.getCell(1)).trim();
		// Check the formatting of the inputfile, if the test description column is missing
		// and a test data parameter is present, reset the start column for data to 2.
		if(getCellValue(_workSheet.getRow(parameterRowIndex + 1).getCell(2)).equals(""))
			testDescription = getCellValue(parameterRow.getCell(2)).trim();
		else
			testParemeterStartcolumn = 2;
        testData.TestCaseId = testCaseId;
        testData.TestMethod = methodName;
		testData.TestDescription = testDescription;
        
        if(valueRow != null)
        {
            for(int i = testParemeterStartcolumn; i < lastColumn; i ++)
            {
                String parameter = getCellValue(parameterRow.getCell(i)).trim();
                String value = getCellValue(valueRow.getCell(i)).trim();
                if(!parameter.equals(""))
                {
                    testData.addParameter(parameter, value);
                }           
            }
        }
        if(testDataList == null)
        {
            testDataList = new ArrayList<>();
        }
        testDataList.add(testData);
    }
    
    public boolean isFileDownloaded_Ext(String dirPath, String ext)
    {
	boolean flag=false;
	File dir = new File(dirPath);
	File[] files = dir.listFiles();
	if (files == null || files.length == 0)
        {
	    flag = false;
	}
	    
	for (int i = 1; i < files.length; i++)
        {
	    if(files[i].getName().contains(ext))
            {
	    	flag=true;
	    }
	}
	return flag;
   }
    
    public boolean isFileDownloaded(String downloadPath, String fileName) 
    {
	boolean flag = false;
	File dir = new File(downloadPath);
	File[] dir_contents = dir.listFiles();
	  	    
	for (int i = 0; i < dir_contents.length; i++) 
        {
	    if (dir_contents[i].getName().equals(fileName))
	    return flag=true;
	}

	    return flag;
    }
    
    public File getLatestFilefromDir(String dirPath,String ext)
    {
	File dir = new File(dirPath);
        FileFilter fileFilter = new WildcardFileFilter("*." + ext);
	File[] files = dir.listFiles(fileFilter);
	if (files == null || files.length == 0) 
         {
	    return null;
	 }
	
	File lastModifiedFile = files[0];
	for (int i = 1; i < files.length; i++) 
          {
	    if (lastModifiedFile.lastModified() < files[i].lastModified())
            {
	        lastModifiedFile = files[i];
	    }
	  }
	return lastModifiedFile;
    }
}
