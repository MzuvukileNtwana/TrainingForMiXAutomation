/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package KeywordDrivenTestFramework.Testing.TestClasses.Assets;

import KeywordDrivenTestFramework.Core.BaseClass;
import static KeywordDrivenTestFramework.Core.BaseClass.SeleniumDriverInstance;
import static KeywordDrivenTestFramework.Core.BaseClass.SikuliDriverInstance;
import KeywordDrivenTestFramework.Entities.Enums;
import KeywordDrivenTestFramework.Entities.TestEntity;
import KeywordDrivenTestFramework.Entities.TestResult;
import KeywordDrivenTestFramework.Testing.PageObjects.AddAssetPageObject;
import KeywordDrivenTestFramework.Testing.PageObjects.AssetsPageObjects;
import KeywordDrivenTestFramework.Testing.PageObjects.TelematicsPageObj;
import KeywordDrivenTestFramework.Utilities.SikuliDriverUtility;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import org.apache.commons.io.comparator.LastModifiedFileComparator;
import org.apache.commons.io.filefilter.WildcardFileFilter;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.Key;

/**
 *
 * @author kbuso
 */
public class DownloadAndImportTemplateTestclass extends BaseClass {

    int counter = 1;
    TestEntity testData;
    FirefoxDriver driver;
    
    public DownloadAndImportTemplateTestclass(TestEntity testData)
     {
        SikuliDriverInstance = new SikuliDriverUtility(TelematicsPageObj.MixTeleImagesFolder());
        
        this.testData = testData;
    }
    
    public TestResult executeImportAssetListPageTest() {

        this.setStartTime();
        String regNo = SeleniumDriverInstance.generateDateTimeStampVaule();
        
        if (!DownloadTemplate()) 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To download template", true);
            counter++;
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To download template", this.getTotalExecutionTime());
        }
        
         if (!ValidateTemplate()) 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To validate template", true);
            counter++;
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To validate template", this.getTotalExecutionTime());
        }
         
         if (!AddAssetToTemaplate(regNo)) 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To add asset template", true);
            counter++;
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To add asset template", this.getTotalExecutionTime());
        }
         if (!ImportFile()) 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To import new created asset", true);
            counter++;
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To import new created asset", this.getTotalExecutionTime());
        }
         
         if (!searchAsset(regNo)) 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To find recent added asset", true);
            counter++;
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To find recent added asset", this.getTotalExecutionTime());
        }
         
          if (!verifyAddedAsset()) 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To verify recent added asset", true);
            counter++;
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To verify recent added asset", this.getTotalExecutionTime());
        }
          
           if (!MoveTemplateToReportsDirrectoryAsset()) 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To move template to reports directory", true);
            counter++;
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To move template to reports directory", this.getTotalExecutionTime());
        }
         
        return new TestResult(testData, Enums.ResultStatus.PASS, testData.TestDescription, this.getTotalExecutionTime());
      }
    
    public TestResult executeImportAssetPageTest() {

        this.setStartTime();
        String regNo = SeleniumDriverInstance.generateDateTimeStampVaule();
        
        if (!DownloadTemplate()) 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To download template", true);
            counter++;
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To download template", this.getTotalExecutionTime());
        }
        
        
         if (!AddAssetToTemaplate(regNo)) 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To add asset template", true);
            counter++;
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To add asset template", this.getTotalExecutionTime());
        }
         if (!ImportFile()) 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To import new created asset", true);
            counter++;
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To import new created asset", this.getTotalExecutionTime());
        }
         
         if (!searchAsset(regNo)) 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To find recent added asset", true);
            counter++;
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To find recent added asset", this.getTotalExecutionTime());
        }
         
          if (!verifyAddedAsset()) 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To verify recent added asset", true);
            counter++;
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To verify recent added asset", this.getTotalExecutionTime());
        }
           if (!MoveTemplateToReportsDirrectoryAsset()) 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To move template to reports directory", true);
            counter++;
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To move template to reports directory", this.getTotalExecutionTime());
        }
         
        return new TestResult(testData, Enums.ResultStatus.PASS, testData.TestDescription, this.getTotalExecutionTime());
      }
    
    public TestResult executeUpdateAssetListPageTest() {

        this.setStartTime();
    
         if (!UpdatingAnAsset()) 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To update asset template", true);
            counter++;
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To update asset template", this.getTotalExecutionTime());
        }
         
          if (!ValidateTemplate()) 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To validate update asset template column headers", true);
            counter++;
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To validate update asset template column headers", this.getTotalExecutionTime());
        }
         
         if (!ImportFile()) 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To import updated asset template", true);
            counter++;
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To import updated asset template", this.getTotalExecutionTime());
        }
         
         
         if (!searchAsset(testData.getData("update Asset description"))) 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To find recent added asset", true);
            counter++;
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To find recent added asset", this.getTotalExecutionTime());
        }
         
        if (!verifyAddedAsset()) 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To verify recent added asset", true);
            counter++;
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To verify recent added asset", this.getTotalExecutionTime());
        }
        
        if (!MoveTemplateToReportsDirrectoryAsset()) 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To Move Template To Reports Dirrectory", true);
            counter++;
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To Move Template To Reports Dirrectory", this.getTotalExecutionTime());
        }
         
         
        return new TestResult(testData, Enums.ResultStatus.PASS, testData.TestDescription, this.getTotalExecutionTime());
      }
    
    private boolean DownloadTemplate()
    {
        
        if (!SeleniumDriverInstance.waitForElementByXpath(TelematicsPageObj.DownloadImportButtonRelativeXpath()))
            return false;
        
        if (!SeleniumDriverInstance.clickElementByXpathUsingActions(TelematicsPageObj.DownloadImportButtonRelativeXpath()))
            return false;
        
        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("Download Template Button clicked", false);
        
        if (!SeleniumDriverInstance.waitForElementByXpath(TelematicsPageObj.ImportNewRecordsRadioButtonRelativeXpath()))
            return false;
        
        if (!SeleniumDriverInstance.clickElementByXpathUsingActions(TelematicsPageObj.ImportNewRecordsRadioButtonRelativeXpath()))
            return false;
        
        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("Import New Records Radio Button clicked", false);
        
        if (!SeleniumDriverInstance.clickElementByXpathUsingActions(TelematicsPageObj.DownloadButtonRelativeXpath()))
            return false;
        
        //Take Screenshot
        
       saveExportFile();
     
       SeleniumDriverInstance.takeScreenShot("Template downloaded", false);
        
        return true;
    }
    
    private boolean saveExportFile()
    {
        if(SeleniumDriverInstance.DriverUtility().equals("firefox"))
        {
            SeleniumDriverInstance.pause(5000);
            
            SikuliDriverInstance.MouseClickElement(TelematicsPageObj.SaveImageFirefox());
            SikuliDriverInstance.PressKey(Key.ENTER);
        }
        if(SeleniumDriverInstance.DriverUtility().toUpperCase().equals("INTERNET EXPLORER"))
        {
        SeleniumDriverInstance.pause(5000);
        //SikuliDriverInstance.viewIEDownloadsWindow();
        if(!SikuliDriverInstance.MouseClickElement(TelematicsPageObj.SaveImage()))
        {
            SikuliDriverInstance.PressKey(Key.ENTER);
        }
        if(SikuliDriverInstance.WaitSpecificTimeElementAppear(TelematicsPageObj.SaveImage(), 3))
        {   
            System.out.println("Error: Failed to download file");
            System.err.println("Error: Failed to download file");
            return false;
        }
            
            //Clear list and Close downloads window if available
            SikuliDriverInstance.MouseClickElement(TelematicsPageObj.ClearListImage());
            SikuliDriverInstance.MouseClickElement(TelematicsPageObj.CloseImage());
        }
        
        return true;
    }
    
    public File getTheNewestFile(String ext)
        {
            SeleniumDriverInstance.pause(10000);
            String file = new File("C:/Users/" + System.getProperty("user.name") + "/Downloads/").toString();
            
            File theNewestFile = null;
            File dir = new File(file);
            FileFilter fileFilter = new WildcardFileFilter("*." + ext);
            File[] files = dir.listFiles(fileFilter);

            if (files.length > 0) {
                /** The newest file comes first **/
                Arrays.sort(files, LastModifiedFileComparator.LASTMODIFIED_REVERSE);
                theNewestFile = files[0];
            }

            return theNewestFile;
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
                         
                         //adding header cell text to string
                         tempData += cell.toString()+";";
                     }
                     rec.add(tempData);
                     System.out.println("");
                 }
                 file.close();

             }
             catch (Exception e)
             {
                 e.printStackTrace();
             }
           return rec;
       }
     
    public boolean ValidateTemplate()
     {
         String Colheader = "";
         String MissingColheader = "";
         String UpdateTemplateMissingColheader = "";
         
         
         SeleniumDriverInstance.pause(10000);
         String [] ColumnHeaders = new String[]{"Asset description", "Asset type", "Registration number","Site","Fuel type",
                 "Target fuel consumption","Target hourly fuel consumption","Fleet number","Make","Model","Year","Chassis number",
         "Engine number","FM vehicle ID","Additional mobile device","Notes","Colour"};
         
         String [] UpdateTemplateColumnHeaders = new String[]{"Asset description", "Asset type", "FM vehicle ID","Registration number","Site","Fuel type",
                 "Target fuel consumption","Fleet number","Make","Model","Year","Chassis number",
         "Engine number","FM vehicle ID","Additional mobile device","Notes","Colour"};
         
        String tachoFile = getTheNewestFile("xlsx").toString();
          
        ArrayList <String> arr = readFile(tachoFile);
         
        if(!testData.TestCaseId.equals("DMF-1206_Download Import Template"))
           {
                for (int i = 0; i < ColumnHeaders.length; i++) {
                   if(!arr.toString().contains(ColumnHeaders[i]))
                   {
                       MissingColheader +=  ColumnHeaders[i]+ ";";
                       System.err.println("[ERROR]- Missing Column Headers");

                   }
                   else
                   {
                       Colheader += ColumnHeaders[i] + ";";
                   }
            }
        }
        else
        {
         for (int i = 0; i < UpdateTemplateColumnHeaders.length; i++) {
            if(!arr.get(0).contains(UpdateTemplateColumnHeaders[i]))
             {
                 UpdateTemplateMissingColheader += UpdateTemplateColumnHeaders[i];
                 System.err.println("[ERROR]- Update template Missing Column Headers");
             }
            else
            {
                Colheader += ColumnHeaders[i] + ";";
            }
            }
        }
       
        if(!MissingColheader.equals(""))
        {
            testData.extractParameter("Template Header missing columns",MissingColheader,"fail");
            return false;
        }
        
        if(!UpdateTemplateMissingColheader.equals(""))
        {
            testData.extractParameter("Template Header missing columns",MissingColheader,"fail");
            return false;
        }
        
        
        testData.extractParameter("Template Header",Colheader,"PASS");

        return true;
     }
     
    public boolean AddAssetToTemaplate( String reg)
     {
         
        try
             {
                 String filePath = getTheNewestFile("xlsx").toString();
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
                     Iterator<Cell> cellIterator = row.cellIterator();
                     String tempData = "";
                     
                     while (cellIterator.hasNext())
                     {
                         Cell cell = cellIterator.next();
                         
                         break;
                     }
                     
                     System.out.println("");
                 }
                 
                 if(!rowIterator.hasNext())
                 {
                    Random rand = new Random();
                    
                    
                    
                  
                     Row row = sheet.createRow(1);
                    
                     row.createCell(0).setCellValue(this.testData.getData("Asset description"));
                     row.createCell(2).setCellValue(this.testData.getData("Asset type"));
                     row.createCell(3).setCellValue(this.testData.getData("Asset icon"));
                     row.createCell(4).setCellValue(this.testData.getData("Asset icon colour"));
//                     row.createCell(5).setCellValue(this.testData.getData("Is connected trailer"));
                     row.createCell(6).setCellValue(reg);
                     row.createCell(7).setCellValue(this.testData.getData("Country"));
                     row.createCell(8).setCellValue(this.testData.getData("Site"));
                     row.createCell(9).setCellValue(this.testData.getData("Fuel type"));
                     row.createCell(10).setCellValue(this.testData.getData("Target fuel consumption (l/100km)"));
                     row.createCell(11).setCellValue(this.testData.getData("Target hourly fuel consumption (l/h)"));
                     row.createCell(12).setCellValue(this.testData.getData("Fleet number"));
                     row.createCell(13).setCellValue(this.testData.getData("Make"));
                     row.createCell(14).setCellValue(this.testData.getData("Model"));
                     row.createCell(15).setCellValue(this.testData.getData("Year"));
                     row.createCell(16).setCellValue(this.testData.getData("Chassis number"));
                     row.createCell(17).setCellValue(this.testData.getData("Engine number"));
                     row.createCell(18).setCellValue(this.testData.getData("Additional mobile device"));
                     row.createCell(19).setCellValue(this.testData.getData("Notes"));
                     row.createCell(20).setCellValue(this.testData.getData("Colour"));
                     
                     try {
                            SeleniumDriverInstance.pause(5000);
                            FileOutputStream out =  new FileOutputStream(new File(filePath));
                            workbook.write(out);
                            out.close();
                            System.out.println("added asset successfully");

                        } catch (FileNotFoundException e) {
                            System.err.println("Failed to add asset");
                            e.printStackTrace();
                        }
                     
                 }
                  
                System.out.println("");
                 
                file.close();

             }
             catch (Exception e)
             {
                 e.printStackTrace();
             }
           return true;
     }
    
    public boolean ImportFile()
     {
         
        try
             {
                 SeleniumDriverInstance.pause(10000);
                 String filePath = getTheNewestFile("xlsx").toString();

                if (!SeleniumDriverInstance.waitForElementByXpath(TelematicsPageObj.ImportAssetsButtonRelativeXpath()))
                    return false;
                
                if (!SeleniumDriverInstance.clickElementByXpathUsingActions(TelematicsPageObj.ImportAssetsButtonRelativeXpath()))
                    return false;
                
                SeleniumDriverInstance.takeScreenShot("import button clicked", false);
                
                
                SeleniumDriverInstance.pause(10000);
                if (!SeleniumDriverInstance.waitForElementByXpath(TelematicsPageObj.ChooseFileRelativeXpath()))
                    return false;
                
                SeleniumDriverInstance.pause(5000);
                //importing newly added asset
                if (!SeleniumDriverInstance.clickElementByXpathUsingActions(TelematicsPageObj.ChooseFileRelativeXpath1()))
                    return false;
                
                if (SeleniumDriverInstance.CheckIfElementDisplayedByXpath(TelematicsPageObj.ChooseFileRelativeXpath()))
                {
                    if (!SeleniumDriverInstance.clickElementByXpathUsingActions(TelematicsPageObj.ChooseFileRelativeXpath1()))
                        return false;
                    
                    SeleniumDriverInstance.clickElementByXpathUsingActions(TelematicsPageObj.ChooseFileRelativeXpath1());
                    SeleniumDriverInstance.waitForElementByXpath(TelematicsPageObj.ChooseFileRelativeXpath());
                    
                }
                
                
                
                SeleniumDriverInstance.takeScreenShot("chooseFileClicked", false);
                
                SeleniumDriverInstance.pause(5000);
                SikuliDriverInstance.TypeTextAtElement(filePath);
                
                if (!SikuliDriverInstance.PressKey(Key.ENTER))
                    return false;
                
                SeleniumDriverInstance.takeScreenShot("Template imported...", false);
                
             }
             catch (Exception e)
             {
                 e.printStackTrace();
             }
           return true;
     }
     
    public boolean UpdatingAnAsset()
     {
         
        if (!SeleniumDriverInstance.waitForElementByXpath(TelematicsPageObj.DownloadImportButtonRelativeXpath()))
            return false;
        
        //download button
        if (!SeleniumDriverInstance.clickElementByXpathUsingActions(TelematicsPageObj.DownloadImportButtonRelativeXpath()))
            return false;
        
        //Take Screenshot
       
        if (!SeleniumDriverInstance.waitForElementByXpath(TelematicsPageObj.updateExistingRecordRadioRelativeXpath()))
            return false;
         SeleniumDriverInstance.takeScreenShot("Download Template Button clicked", false);
         
         
        //Click Monitor Menu
        if (!SeleniumDriverInstance.clickElementByXpathUsingActions(TelematicsPageObj.updateExistingRecordRadioRelativeXpath()))
            return false;
         
        if (!SeleniumDriverInstance.waitForElementByXpath(TelematicsPageObj.DownloadButtonRelativeXpath()))
            return false;
        SeleniumDriverInstance.takeScreenShot("Import New Records Radio Button clicked", false);
        
        SeleniumDriverInstance.clickElementByXpathUsingActions(TelematicsPageObj.DownloadButtonRelativeXpath());
        
        
         saveExportFile();
         
        try
             {
                 SeleniumDriverInstance.pause(5000);
                 
                 boolean updated = false;
                 String tempData = "";
                 
                 String filePath = getTheNewestFile("xlsx").toString();
                 
                 FileInputStream file = new FileInputStream(new File(filePath));

                 //Create Workbook instance holding reference to .xlsx file
                 XSSFWorkbook workbook = new XSSFWorkbook(file);

                 //Get first/desired sheet from the workbook
                 XSSFSheet sheet = workbook.getSheetAt(0);

                 //Iterate through each rows one by one
                 Iterator<Row> rowIterator = sheet.iterator();
                 

                Row row = sheet.getRow(1);

                row.getCell(1).setCellValue(this.testData.getData("update Asset description"));

                       try 
                       {
                           row.getCell(1).setCellValue(this.testData.getData("update Asset description"));
                           
                           FileOutputStream out =  new FileOutputStream(new File(filePath));
                           
                           workbook.write(out);
                           
                           out.close();
                           
                           System.out.println("updated an existing asset successfully");

                       } catch (FileNotFoundException e) {
                           e.printStackTrace();
                       }
                        if(row.getCell(1).toString().equals(testData.getData("update Asset description")))
                        {
                            SeleniumDriverInstance.takeScreenShot("Asset updated", false);
                        }
                        else
                        {
                            SeleniumDriverInstance.takeScreenShot("Failed to update asset", false);
                            return false;
                        }


                System.out.println("");
            }
                    
             catch (Exception e)
             {
                 e.printStackTrace();
             }
           return true;
     }
      
    public boolean MoveTemplateToReportsDirrectoryAsset()
      {
        String tachoFile = getTheNewestFile("xlsx").toString();
        File file = new File(tachoFile);
        
        if(!file.renameTo(new File(this.reportDirectory + "\\"+ file.getName())))
            return false;
          
          return true;
      }
    
    public boolean searchAsset(String Asset)
    {
        SeleniumDriverInstance.pause(5000);
        if (!SeleniumDriverInstance.waitForElementByXpath(TelematicsPageObj.searchTextBoxRelativeXpath()))
            return false;
        
         SeleniumDriverInstance.clearTextByXpath(TelematicsPageObj.searchTextBoxRelativeXpath());
            
        if (!SeleniumDriverInstance.enterTextByXpath(TelematicsPageObj.searchTextBoxRelativeXpath(), Asset))
            return false;
        
        if (!SeleniumDriverInstance.clickElementByXpathUsingActions(TelematicsPageObj.searchIconRelativeXpath()))
            return false;

        SeleniumDriverInstance.pause(5000);
        SeleniumDriverInstance.takeScreenShot("recent added/updated asset searched", false);
        
       List<String> rec = SeleniumDriverInstance.getAssetsListOnGrid(TelematicsPageObj.AssetListGridRelativeXpath());
       
       String [] AssetList = rec.get(0).split("#");
       String myAsset= "";
       for(int j = 0; j < AssetList.length ; j++)
       {
           if(!AssetList[j].equals(""))
           {
                myAsset+= AssetList[j]+";";
           }
          
       }
       testData.extractParameter("Added/updated asset",myAsset , "PASS");
       return true;
    }
    
    public boolean verifyAddedAsset()
    {
        boolean isVisible = false;
        String missingFields="";
        String PresentFields="";
        String [] assetFields;
        String icon ="";
        if(!SeleniumDriverInstance.waitForPresenceOfElementByXpath(AssetsPageObjects.TableLoadingSpinnerXpath(), 30))
            return false;
        
        if (!SeleniumDriverInstance.waitForElementByXpath(TelematicsPageObj.AssetDecsriptionRelativeXpathText(this.testData.getData("Asset description"))))
        {
            if(!SeleniumDriverInstance.waitForElementByXpath(TelematicsPageObj.AssetDecsriptionRelativeXpathText(testData.getData("update Asset description"))))
                return false;
        }
            
        if (!SeleniumDriverInstance.clickElementByXpathUsingActions(TelematicsPageObj.AssetDecsriptionRelativeXpathText(this.testData.getData("Asset description"))))
        {
            if (!SeleniumDriverInstance.clickElementByXpathUsingActions(TelematicsPageObj.AssetDecsriptionRelativeXpathText(this.testData.getData("update Asset description"))))
                 return false;
        }
           
        
        if(!SeleniumDriverInstance.waitForElementByXpath(TelematicsPageObj.AssetStatusLabelRelativeXpathText(),30))
            return false;
        
        
        
        String country = SeleniumDriverInstance.retrievetextFromDropdownByXpath(TelematicsPageObj.CountryDropdownRelativeXpathText(this.testData.getData("Country")));
        String Site = SeleniumDriverInstance.retrievetextFromDropdownByXpath(TelematicsPageObj.SiteDropdownRelativeXpathText(this.testData.getData("Site")));
        String AssetDescription = SeleniumDriverInstance.retrieveValueByXpath(AddAssetPageObject.AssetsdescriptionXpath());
        String AssetType = SeleniumDriverInstance.retrievetextFromDropdownByXpath1(AddAssetPageObject.assetTypepXath());
        
        String RegistrationNumber = SeleniumDriverInstance.retrieveValueByXpath(AddAssetPageObject.RegistrationNumberXpath());
        
        String FuelType = SeleniumDriverInstance.retrieveValueByXpath(AddAssetPageObject.FuelTypeXpath());
        
        String TargetFuelConsumption = SeleniumDriverInstance.retrieveValueByXpath(AddAssetPageObject.FuelConsumptionXpath());
        String TargetHourlyFuelConsumption = SeleniumDriverInstance.retrieveValueByXpath(AddAssetPageObject.TargetHourlyFuelConsumptionXpath());
        String FleetNumber = SeleniumDriverInstance.retrieveValueByXpath(AddAssetPageObject.FleetNumberXpath());
        String Make = SeleniumDriverInstance.retrieveValueByXpath(AddAssetPageObject.VehicleMakeXpath());
        String Model = SeleniumDriverInstance.retrieveValueByXpath(AddAssetPageObject.VehicleModelXpath());
        String Year = SeleniumDriverInstance.retrieveValueByXpath(AddAssetPageObject.VehicleModelyearXpath());
        String ChassisNumber  = SeleniumDriverInstance.retrieveValueByXpath(AddAssetPageObject.ChassisnumberXpath());
        String EngineNumber = SeleniumDriverInstance.retrieveValueByXpath(AddAssetPageObject.EnginenumberXpath());
        String AdditionalMobileDevice = SeleniumDriverInstance.retrieveValueByXpath(AddAssetPageObject.MobileDeviceXpath());
        String Notes  = SeleniumDriverInstance.retrieveValueByXpath(AddAssetPageObject.NotesXpath());
        String AssetColour = SeleniumDriverInstance.retrieveValueByXpath(AddAssetPageObject.AssetColourXpath());
        
        Boolean AssetIcon = SeleniumDriverInstance.CheckIfElementDisplayedByXpath(TelematicsPageObj.AssetIconXpath());
        
        assetFields = new String[]{AssetDescription, "",AssetType,"","","",RegistrationNumber,country,  Site,
        FuelType ,TargetFuelConsumption,TargetHourlyFuelConsumption, FleetNumber,Make, Model, Year, ChassisNumber, EngineNumber, AdditionalMobileDevice, Notes, AssetColour};
        
        
        String tachoFile = getTheNewestFile("xlsx").toString();
          

        ArrayList <String> arr = readFile(tachoFile);
        
        String [] AssetList = arr.get(0).split(";");
        
        ArrayList <String> arr1 = new ArrayList<String>(Arrays.asList(AssetList));
       
        arr1.remove(1);
        
        for(int i = 0; i<assetFields.length; i++)
        {
            if(!assetFields[i].equals(""))
                {
                if(!arr.get(1).contains(assetFields[i]))
                {
                        
                    missingFields += AssetList[i]+";";
                        
                }

                else
                {
                    PresentFields += AssetList[i]+";";
                }

                }
            else
            {
                missingFields += "";
            }
        }
        
        if(!missingFields.equals(""))
        {
            testData.extractParameter("Missing text on the edit asset page",missingFields,"Fail");
            
        }
        
        if(!PresentFields.equals(""))
        {
            testData.extractParameter("text found on the edit asset page",PresentFields,"PASS");
            
        }
        
        if (!SeleniumDriverInstance.clickElementByXpathUsingActions(TelematicsPageObj.CancelButtonRelativeXpath()))
            return false;
        
        return true;
    }
        
    public boolean verifyUpdatedAsset()
    {
        boolean isVisible = false;
        String missingFields="";
        String PresentFields="";
        String [] assetFields;
        String icon ="";
        if(!SeleniumDriverInstance.waitForPresenceOfElementByXpath(AssetsPageObjects.TableLoadingSpinnerXpath(), 30))
            return false;
        
        
        if(!SeleniumDriverInstance.waitForElementByXpath(TelematicsPageObj.AssetDecsriptionRelativeXpathText(testData.getData("update Asset description"))))
            return false;



        if (!SeleniumDriverInstance.clickElementByXpathUsingActions(TelematicsPageObj.AssetDecsriptionRelativeXpathText(this.testData.getData("update Asset description"))))
             return false;
        
           
        
        if(!SeleniumDriverInstance.waitForElementByXpath(TelematicsPageObj.AssetStatusLabelRelativeXpathText(),30))
            return false;
        
        
        
        
             String AssetDescription = SeleniumDriverInstance.retrieveValueByXpath(AddAssetPageObject.AssetsdescriptionXpath());

                if(this.testData.getData("update Asset description").equals(AssetDescription))
                {
                        
                    missingFields = AssetDescription;
                        
                }

                else
                {
                    PresentFields += AssetDescription;
                }

        if(!missingFields.equals(""))
        {
            testData.extractParameter("Missing text on the edit asset page",missingFields,"Fail");
            
        }
        
        if(!PresentFields.equals(""))
        {
            testData.extractParameter("text found on the edit asset page",PresentFields,"PASS");
            
        }
        
        if (!SeleniumDriverInstance.clickElementByXpathUsingActions(TelematicsPageObj.CancelButtonRelativeXpath()))
            return false;
        
        return true;
    }
}
