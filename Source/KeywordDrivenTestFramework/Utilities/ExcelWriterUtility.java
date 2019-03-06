
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Utilities;

//~--- non-JDK imports --------------------------------------------------------
import KeywordDrivenTestFramework.Entities.TestEntity;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import static java.lang.System.err;
import static java.lang.System.out;
import java.util.ArrayList;
import java.util.List;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;

/**
 *
 * @author fnell
 */
public class ExcelWriterUtility {

    List<TestEntity> testDataList;
    Sheet _workSheet;
    Workbook _workbook;
    static SXSSFWorkbook wb;
    static Sheet sh;
  

    public ExcelWriterUtility() {
        testDataList = new ArrayList<>();
        System.setProperty("java.awt.headless", "true");
    }

    public List<TestEntity> getTestDataFromExcelFile(String filePath) {
        _workbook = getExcelWorkbook(filePath);
        readExcelWorkSheet(_workbook);
        retrieveTestDataFromSheet();

        return testDataList;
    }

    public Workbook getExcelWorkbook(String filePath) {
        try (InputStream reader = new FileInputStream(filePath)) {
            return WorkbookFactory.create(reader);
        } catch (Exception e) {
            return null;
        }
    }

    private boolean readExcelWorkSheet(Workbook workbook) {
        try {
            _workSheet = workbook.getSheetAt(0);

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    private boolean retrieveTestDataFromSheet() {
        int lastColumn = 0;

        if (_workSheet == null) {
            return false;
        }

        try {
            for (Row row : _workSheet) {
                String firstCellValue = getCellValue(row.getCell(0));

                if (!firstCellValue.equals("")) {
                    lastColumn = row.getLastCellNum();
                    getTestParameters(row.getRowNum(), row.getRowNum() + 1, lastColumn);
                }
            }

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    private String getCellValue(Cell cell) {
        String cellValue = "";

        try {
            switch (cell.getCellType()) {
                case Cell.CELL_TYPE_STRING:
                    cellValue = cell.getRichStringCellValue().getString();

                    break;

                case Cell.CELL_TYPE_BLANK:
                    cellValue = cell.getRichStringCellValue().getString();

                    break;

                case Cell.CELL_TYPE_NUMERIC:
                    if (DateUtil.isCellDateFormatted(cell)) {
                        cellValue = cell.getDateCellValue().toString();
                    } else {
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

            if (cellValue == null) {
                cellValue = "";
            }
        } catch (Exception e) {
            return "";
        }

        return cellValue;
    }

    private void getTestParameters(int parameterRowIndex, int valueRowIndex, int lastColumn) {
        TestEntity testData = new TestEntity();
        Row parameterRow, valueRow;
        String testCaseId, methodName, testDescription = "";
        int testParemeterStartcolumn = 3;
        try {

            parameterRow = _workSheet.getRow(parameterRowIndex);
            valueRow = _workSheet.getRow(valueRowIndex);

            testCaseId = getCellValue(parameterRow.getCell(0)).trim();
            methodName = getCellValue(parameterRow.getCell(1)).trim();

            // Check the formatting of the inputfile, if the test description column is missing
            // and a test data paramter is present, reset the start column for data to 2.
            Cell checkCell = _workSheet.getRow(parameterRowIndex + 1).getCell(2);

            if (checkCell != null) {
                if (getCellValue(checkCell).equals("")) {
                    testDescription = getCellValue(parameterRow.getCell(2)).trim();
                } else {
                    testParemeterStartcolumn = 2;
                }
            }
            if (getCellValue(_workSheet.getRow(parameterRowIndex + 1).getCell(2)).equals("")) {
                testDescription = getCellValue(parameterRow.getCell(2)).trim();
            } else {
                testParemeterStartcolumn = 2;
            }

            testData.TestCaseId = testCaseId;
            testData.TestMethod = methodName;
            testData.TestDescription = testDescription;

            for (int i = testParemeterStartcolumn; i < lastColumn; i++) {
                String parameter = getCellValue(parameterRow.getCell(i)).trim();
                String value = getCellValue(valueRow.getCell(i)).trim();
                if (!parameter.equals("")) {
                    testData.addParameter(parameter, value);
                }
            }

            if (testDataList == null) {
                testDataList = new ArrayList<>();
            }

            if (!testData.TestCaseId.contains(";")) {
                out.println("[INFO] Adding keyword to test data list - " + testData.TestMethod);
            }

            testDataList.add(testData);
        } catch (Exception ex) {
            err.println("[ERROR] Failed to add test data to list - " + ex.getMessage());
        }
    }
    
    public void OverwriteExcelSheetOneRowFile(String fileName,String sheetName,List<String> data,String valueToCompare)
    {
        try
        {   
           File file = new File("C:/Users/" + System.getProperty("user.name") + "/Downloads/"+fileName);
           
           
           if(file.exists())
             {
               InputStream inp= new FileInputStream(file);
               Workbook wbs = WorkbookFactory.create(inp);
              
                 sh=wbs.getSheet(sheetName);
                 int k = sh.getLastRowNum();
                 Cell cell =null;
                 for(int i =sh.getLastRowNum(); i > 0 ; i-- )
                 {
                    cell = sh.getRow(i).getCell(1);
//                    String f = cell.getRichStringCellValue().getString();
                    
                    if(cell.getRichStringCellValue().getString().equals(valueToCompare)) 
                    {
                      for(int j =0; j < data.size(); j++ )
                        {
                         //This skips the first column
//                         Cell cell =null;
                         cell =sh.getRow(i).getCell((j+1));
                         cell.setCellValue(data.get(j));
                        //cell.setCellStyle(normalStyle);
                       }
                      break;
                    }
                    
                 }
                autoResizeColumns();
                file.canWrite();
               FileOutputStream out = new FileOutputStream(file);
                //InputStream is = new  FileInputStream(file);
                wbs.write(out);
                out.close();
//                wbs.dispose();
                System.out.println("Ëxcel sheet row Successfully Updated");
            }
         
       } 
        catch (Exception ex) {
            err.println("[ERROR] Failed to Update sheet row- " + ex.getMessage());
        }
          
    }
    
   
    
    private static CellStyle getNormalStyles()
    {
        CellStyle style = wb.createCellStyle();
        style.setBorderBottom(CellStyle.BORDER_THIN);
        style.setBottomBorderColor(IndexedColors.BLACK.getIndex());
        style.setBorderLeft(CellStyle.BORDER_THIN);
        style.setLeftBorderColor(IndexedColors.BLACK.getIndex());
        style.setBorderRight(CellStyle.BORDER_THIN);
        style.setRightBorderColor(IndexedColors.BLACK.getIndex());
        style.setBorderTop(CellStyle.BORDER_THIN);
        style.setTopBorderColor(IndexedColors.BLACK.getIndex());
        style.setAlignment(CellStyle.ALIGN_LEFT);
        
        return style;
    }
    private static CellStyle getNormalStyles2(Workbook wbs)
    {
        CellStyle style = wbs.createCellStyle();
        style.setBorderBottom(CellStyle.BORDER_THIN);
        style.setBottomBorderColor(IndexedColors.BLACK.getIndex());
        style.setBorderLeft(CellStyle.BORDER_THIN);
        style.setLeftBorderColor(IndexedColors.BLACK.getIndex());
        style.setBorderRight(CellStyle.BORDER_THIN);
        style.setRightBorderColor(IndexedColors.BLACK.getIndex());
        style.setBorderTop(CellStyle.BORDER_THIN);
        style.setTopBorderColor(IndexedColors.BLACK.getIndex());
        style.setAlignment(CellStyle.ALIGN_LEFT);
        
        return style;
    }
    
    private void autoResizeColumns()
     {
         sh.autoSizeColumn(20);
     }
}


//~ Formatted by Jindent --- http://www.jindent.com
