/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package KeywordDrivenTestFramework.Testing.TestClasses.Assets;

import KeywordDrivenTestFramework.Core.BaseClass;
import static KeywordDrivenTestFramework.Core.BaseClass.SeleniumDriverInstance;
import static KeywordDrivenTestFramework.Core.BaseClass.SikuliDriverInstance;
import static KeywordDrivenTestFramework.Core.BaseClass.browserType;
import KeywordDrivenTestFramework.Entities.Enums;
import KeywordDrivenTestFramework.Entities.TestEntity;
import KeywordDrivenTestFramework.Entities.TestResult;
import KeywordDrivenTestFramework.Testing.PageObjects.AssetsPageObjects;
import KeywordDrivenTestFramework.Testing.PageObjects.FleetAdmin.Assets.LanguagingAppliedWhenExportAssetPageObject;
import KeywordDrivenTestFramework.Testing.PageObjects.MixTeleImages;
import KeywordDrivenTestFramework.Testing.PageObjects.PassengersPageObjects;
import KeywordDrivenTestFramework.Testing.PageObjects.TelematicsPageObj;
import KeywordDrivenTestFramework.Utilities.ExcelReaderUtility;
import KeywordDrivenTestFramework.Utilities.ExcelWriterUtility;
import KeywordDrivenTestFramework.Utilities.SikuliDriverUtility;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.io.comparator.LastModifiedFileComparator;
import org.apache.commons.io.filefilter.WildcardFileFilter;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.sikuli.script.Key;

/**
 *
 * @author lmkhontwana
 */
public class DMF_66_PassengersExportTestClass extends BaseClass {
    TestEntity testData;
    String failedMessage = "";
    String workingDir="";
    ExcelReaderUtility excelReaderInstence;
    ExcelWriterUtility excelWriterInstence;
    String [] ColumnHeaders;
   
    
    
     public DMF_66_PassengersExportTestClass(TestEntity testData) 
     {
        this.testData = testData;
        excelReaderInstence = new ExcelReaderUtility();
        excelWriterInstence = new ExcelWriterUtility();
        SikuliDriverInstance = new SikuliDriverUtility(TelematicsPageObj.MixTeleImagesFolder());
        ColumnHeaders = new String[]{"Name","Passenger ID","Mobile number","Email address"};
    }
    
      public TestResult executePassengersExportTest() {

        this.setStartTime();
        
        if (!passengersExportTest()) 
        {
            SeleniumDriverInstance.takeScreenShot("FailedToExportOrValidatePassengers", true);
            return new TestResult(testData, Enums.ResultStatus.FAIL, failedMessage, this.getTotalExecutionTime());
        }
        
        if (!getDownloadPassengerTemplate()) 
        {
            SeleniumDriverInstance.takeScreenShot("Failed To Validate Passengers Template Headers", true);
            return new TestResult(testData, Enums.ResultStatus.FAIL, failedMessage, this.getTotalExecutionTime());
        }
        
        return new TestResult(testData, Enums.ResultStatus.PASS, testData.TestDescription, this.getTotalExecutionTime());
      }
      
    private boolean passengersExportTest()
     {
        try{
        List<String> passengersList = new ArrayList<String>();
        
         String ivalidLines = "";
          String filenameDateAndTime = "";
         boolean allDatamatches = true;
        
         
        //Get all assets on pages/grid
        if(browserType.equals(browserType.IE))
        {
           passengersList = SeleniumDriverInstance.getPassengersAndHeardersListOnGrid(PassengersPageObjects.PassengersTablRelativeXpath(),
                                                testData.getData("Pages To Read"),
                                                AssetsPageObjects.AssetGridNextPageButtonRelativeXpath());
        }
        else
        {
            passengersList = SeleniumDriverInstance.getPassengersAndHeardersListOnGrid(PassengersPageObjects.PassengersTablRelativeXpath(),
                                                AssetsPageObjects.AssetGridLastPageButtonRelativeXpath(),
                                                AssetsPageObjects.AssetGridNextPageButtonRelativeXpath());
        }
        if(passengersList.size() > 0) 
        {
            //Select columns from column chooser
            if(!SelectColumn()) return false;
            
            //Click Export Passengers Button
             if(browserType.equals(browserType.IE))
            {
                if (!SeleniumDriverInstance.clickElementbyXpath(PassengersPageObjects.ExportPassengersButtonRelativeXpath()))
                    return false;
            }else{
                if (!SeleniumDriverInstance.clickElementbyXpath(PassengersPageObjects.ExportPassengersButtonRelativeXpath()))
                    return false;
            }
            filenameDateAndTime = SeleniumDriverInstance.generateDateTimeStampVaule();
            //Take Screenshot
            SeleniumDriverInstance.takeScreenShot("ExportPassengersButtonClicked", false);
            //Pause for download
            SeleniumDriverInstance.pause(1000);
            
            //saveExportFile();
            if(!saveExportFile())
            {
                failedMessage = "Failed Save Downloaded file";
                   return false;
            }
            
            SeleniumDriverInstance.pause(3000);
          }
           return true;
        }
         catch (Exception e) {
             System.err.println("Error Exporting Passengers - " + e.getMessage());
            return  false;
        }
    }
    
    public boolean getDownloadPassengerTemplate()
     {
      try   
        {
          String downloadPath = new File("C:/Users/" + System.getProperty("user.name") + "/Downloads/").toString();
          File getLatestFile = excelReaderInstence.getLatestFilefromDir(downloadPath,"xlsx");
	  String fileName = getLatestFile.getName();
          
        if(fileName.equals(""))
        {
           System.out.println("[Fail] : Failed to find the file to validate "); 
        }
        else
        {
             testData.extractParameter("Validating Template Type - ","Excel File" , "Pass");
        }
        
        if(SeleniumDriverInstance.ValidateExcelTableHeaders(fileName, "Data",ColumnHeaders))
         {
             testData.extractParameter("Validating Template Header - ","Data Match" , "Pass");
         }
        else
        {
            testData.extractParameter("Validating Template Header - ","Data Not Matching" , "Fail");
            return false;
        }
  
         System.out.println("[Pass] : Successfully Validated Excel Headers "); 
         
        if(SeleniumDriverInstance.ValidateExcelTableContent(fileName, "Data", "//div[@class='fleet-grid full-height has-row-actions']/table/tbody"))
         {
             testData.extractParameter("Validating Template Content - ","Data Match" , "Pass");
         }
        else
        {
            testData.extractParameter("Validating Template Content - ","Data Match" , "Fail");
            return false;
        }
         
         //moving file to new loaction
         workingDir = System.getProperty("user.dir")+"\\"+  MoveTemplateToReportsDirrectoryAsset(downloadPath);
         workingDir= workingDir.replace("\\\\", "\\");
        }
        catch(Exception e)
        {
        
        }
        
        return true;
     }
    
    public boolean SelectColumn()
    {
        String[] gridColumns = new String[]{"Passenger name", "Passenger ID", "Mobile number", "Email address"};
        
        if(!displayColumnChooser()) return false;
        
        for(String colName : gridColumns)
        {
            if(!displayColumnChooser()) return false;

            //Click column chooser button if it is dismissed
            if(SeleniumDriverInstance.selectColumnChooserList(PassengersPageObjects.columnNameOnColumnChooserXpath(colName)))
            {
                //Click column chooser
                if(!SeleniumDriverInstance.clickElementByXpath(PassengersPageObjects.columnChooserXpath()))
                {
                    SeleniumDriverInstance.takeScreenShot("Failed to click column chooser", true);
                    System.err.println("Failed to click column chooser");
                    return false;
                }   
            } 
        }
        
        //Dismiss column chooser
        if(SeleniumDriverInstance.waitForElementByXpath(PassengersPageObjects.unorderedListColumnChooserXpath(), 3))
        {
            SeleniumDriverInstance.clickElementByXpath(PassengersPageObjects.filterBoxXpath());
        }
        
        return true;
    }
        
    public boolean displayColumnChooser()
    {
        //Display column chooser if it not displayed
        if(!SeleniumDriverInstance.waitForElementByXpath(PassengersPageObjects.unorderedListColumnChooserXpath(), 3))
        {
            if(!SeleniumDriverInstance.clickElementByXpathUsingActions(PassengersPageObjects.columnChooserXpath()))
            {
                SeleniumDriverInstance.takeScreenShot("Failed to click column chooser button", true);
                System.err.println("Failed to click column chooser button");
                return false;
            }  
        }
            
        return true;
    }
    
    public String MoveTemplateToReportsDirrectoryAsset(String dirPath)
     {
        String tachoFile = excelReaderInstence.getLatestFilefromDir(dirPath,"xlsx").toString();
        File file = new File(tachoFile);
        String path = this.reportDirectory + "\\"+ file.getName();
        if(!file.renameTo(new File(path)))
        {
            
        }
        //Validate file name
        if(!file.getName().contains("Passenger"))
          {
            testData.extractParameter("File name not in correct format", file.getName(), "FAIL"); 
          }
            testData.extractParameter("File name in correct format", file.getName(), "PASS");
         System.out.println("[Pass] : Successfully Moved Excel file from Downloads folder to Project Reports Folder"); 
          return path;
      }
    
    public boolean saveExportFile()
    {
        if(browserType.equals(Enums.BrowserType.FireFox))
        {
            SeleniumDriverInstance.pause(5000);
            
//           SikuliDriverInstance.MouseClickElement(LanguagingAppliedWhenExportAssetPageObject.saveImageFirefox());
//           SikuliDriverInstance.PressKey(Key.ENTER);
//            
         // SeleniumDriverInstance.pressKey(Keys.ENTER);
//            if(!SikuliDriverInstance.MouseClickElement(LanguagingAppliedWhenExportAssetPageObject.saveImageFirefox()))
//            {
//                testData.extractParameter("Firefox Result:", "Failed to export asset", "FAIL");
//                SeleniumDriverInstance.takeScreenShot("Failed to click save button", true);
//                System.err.println("Failed to click save button");
//                return false;
//            }

//            SikuliDriverInstance.PressKey(Key.ENTER);
        }
        else if(browserType.equals(Enums.BrowserType.IE))
        {
            SeleniumDriverInstance.pause(5000);
            
            if(!SikuliDriverInstance.MouseClickElement(LanguagingAppliedWhenExportAssetPageObject.saveImageDownloadIE()))
            {
               if(!SikuliDriverInstance.MouseClickElement(LanguagingAppliedWhenExportAssetPageObject.saveBlueImageIE()))
                {
                    testData.extractParameter("IE Result:", "Failed to export asset", "FAIL");
                    SeleniumDriverInstance.takeScreenShot("Failed to click save button", true);
                    System.err.println("Failed to click save button");
                    return false;   
                }
            }
            
            if(SikuliDriverInstance.WaitForElementToAppear(LanguagingAppliedWhenExportAssetPageObject.closeButton()))
            {
                SikuliDriverInstance.MouseClickElement(LanguagingAppliedWhenExportAssetPageObject.closeButton());
            }
            
        }
        return true;
    }
    
    private ArrayList<String> readFile(String filePath)
    {
           
           ArrayList<String> rec = new ArrayList<>();
                try
             {
                 FileInputStream file = new FileInputStream(new File(filePath));

                 //Create Workbook instance holding reference to .xlsx file
                 XSSFWorkbook workbook = new XSSFWorkbook(file);

                 //Get first/desired sheet from the workbook
                 XSSFSheet sheet = workbook.getSheetAt(0);

                 //Iterate through each rows one by one
                 Iterator<Row> rowIterator = sheet.iterator();
                 
                 while (rowIterator.hasNext())
                 {
                     Row row = rowIterator.next();
                     //For each row, iterate through all the columns
                     Iterator<Cell> cellIterator = row.cellIterator();
                     String tempData = "";
                     while (cellIterator.hasNext())
                     {
                         Cell cell = cellIterator.next();
                         //Check the cell type and format accordingly
                         tempData += cell.toString()+"#";
                     }
                     rec.add(tempData.substring(0,tempData.length()-1));
                 }
                 file.close();

             }
             catch (Exception e)
             {
                System.out.println("Error: Failed to read excel file - "+e.getMessage());
                System.err.println("Error: Failed to read excel file - "+e.getMessage());
             }
           return rec;
       }
   
    private File getTheNewestFile(String ext)
    {
        try{
            String file = new File("C:/Users/" + System.getProperty("user.name") + "/Downloads/").toString();
            
            
            File theNewestFile = null;
            File dir = new File(file);
            FileFilter fileFilter = new WildcardFileFilter("*." + ext);
            File[] files = dir.listFiles(fileFilter);

            if (files.length > 0) {
                // The newest file comes first
                Arrays.sort(files, LastModifiedFileComparator.LASTMODIFIED_REVERSE);
                theNewestFile = files[0];
            }

            return theNewestFile;
        }catch(Exception e) {
            System.err.println("Failed to get downloaded file - " + e.getMessage());
            failedMessage = "Failed to get downloaded file";
            return null;
        }
     }
        
    private boolean saveExportedFile()
    {
        switch(browserType)
        {
            case Chrome:
                    {
                        SeleniumDriverInstance.pause(6000);
                        return true;
                    }
            case FireFox:
                    {
                        SeleniumDriverInstance.pause(6000);
                        SikuliDriverInstance.MouseClickElement(MixTeleImages.SaveImageFirefox());
                        SikuliDriverInstance.PressKey(Key.ENTER);

                        if(!SikuliDriverInstance.WaitSpecificTimeElementAppear(MixTeleImages.SaveImageFirefox(),10))
                        {
                            SeleniumDriverInstance.takeScreenShot("FailedToDownload", true);
                            return false;
                        }
                        SeleniumDriverInstance.takeScreenShot("FileSaved", false);
                        return true;
                    }
            case IE:
                    {
                        SeleniumDriverInstance.pause(20000);
                        if(!SikuliDriverInstance.MouseDoubleClickElement(MixTeleImages.SaveImage()))
                        {
                            SikuliDriverInstance.PressKey(Key.ENTER);
                        }
                        SeleniumDriverInstance.pause(30000);
                        if(SikuliDriverInstance.WaitSpecificTimeElementAppear(MixTeleImages.SaveImage(), 20))
                        {   
                            SeleniumDriverInstance.takeScreenShot("FailedToDownload", true);
                            System.out.println("Error: Failed to download file");
                            System.err.println("Error: Failed to download file");
                            return false;
                        }

                        if(SikuliDriverInstance.WaitSpecificTimeElementAppear(MixTeleImages.ClearListImage(), 15))
                        { 
                            //Clear list and Close downloads window if available
                            SikuliDriverInstance.MouseClickElement(MixTeleImages.ClearListImage());
                            SikuliDriverInstance.MouseClickElement(MixTeleImages.CloseImage());
                        }
                        return true;
                    }
        }
        return false;
    }
    
   

     
}
