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
import KeywordDrivenTestFramework.Testing.PageObjects.AssetsPageObjects;
import KeywordDrivenTestFramework.Testing.PageObjects.MixTeleImages;
import KeywordDrivenTestFramework.Utilities.SikuliDriverUtility;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.io.comparator.LastModifiedFileComparator;
import org.apache.commons.io.filefilter.WildcardFileFilter;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Keys;
import org.sikuli.script.Key;

/**
 *
 * @author lmkhontwana
 */
public class FuelDataDownloadImportTemplateTestClass extends BaseClass {
    int counter = 1;
    TestEntity testData;
    String failedMessage = "";
    String regNo = "";
     public FuelDataDownloadImportTemplateTestClass(TestEntity testData) {
        this.testData = testData;
        SikuliDriverInstance = new SikuliDriverUtility(MixTeleImages.MixTeleImagesFolder());
    }
     
     public TestResult executeFuelDataDownloadImportTemplateTest() {

        this.setStartTime();
         
        if (!downloadFuelDataImportTemplateTest()) 
        {
            SeleniumDriverInstance.takeScreenShot(failedMessage, true);
            counter++;
            return new TestResult(testData, Enums.ResultStatus.FAIL, failedMessage, this.getTotalExecutionTime());
        }
        return new TestResult(testData, Enums.ResultStatus.PASS, "Fuel Data Import Template Downloaded Successfully", this.getTotalExecutionTime());
      }
     
     
     
    private boolean clickEditButton(String _assetID)
    {
        if(!SeleniumDriverInstance.waitForPresenceOfElementByXpath(AssetsPageObjects.TableLoadingSpinnerXpath(), 30))
        {
            testData.extractParameter("Error", "Failed to wait for table spinner4", "Fail");
            failedMessage = "Failed to wait for table spinner4";
            return false;
        }
        
        String rowNumber = SeleniumDriverInstance.getElementAttributeByXpath(AssetsPageObjects.assetIDXpath(), "row");

        if (!SeleniumDriverInstance.waitForElementByXpath(AssetsPageObjects.actionButtonXpath(rowNumber), 10))
        {
            testData.extractParameter("Error", "Failed to wait for action button", "Fail");
            failedMessage = "Failed to wait for action button";
            return false;
        }
        
        if (!SeleniumDriverInstance.moveToAndClickElementByXpath(AssetsPageObjects.actionButtonXpath(rowNumber)))
        {
            testData.extractParameter("Error", "Failed to click actions button2", "Fail");
            failedMessage = "Failed to click actions button2";
            return false;
        }
        
        if(!SeleniumDriverInstance.waitForfElementToBeClickableByXpath(AssetsPageObjects.EditAssetButtonFirstOnListRelativeXpathText(), 15) && SeleniumDriverInstance.DriverUtility().toUpperCase().equals("INTERNET EXPLORER"))
        {
            if (!SeleniumDriverInstance.clickElementByXpathUsingActions(AssetsPageObjects.ActionButtonFirstOnListRelativeXpathText()))
            {
                testData.extractParameter("Error", "Failed to click actions button3", "Fail");
                failedMessage = "Failed to click actions button3";
                return false;
            }
        }
        
        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("ActionButtonClicked", false);
        
        if (!SeleniumDriverInstance.clickElementByXpathUsingActions(AssetsPageObjects.EditAssetButtonRelativeXpath(rowNumber)))
        {
            testData.extractParameter("Error", "Failed to click Edit button", "Fail");
            failedMessage = "Failed to click Edit button";
            return false;
        }
        
        SeleniumDriverInstance.takeScreenShot("EditButtonClicked", false);
        
        return true;
    }
    
    private boolean clickEditButton()
    {
        //Click Action Button
        if(!SeleniumDriverInstance.waitForPresenceOfElementByXpath(AssetsPageObjects.TableLoadingSpinnerXpath(), 80))
        {
            testData.extractParameter("Error", "Failed to wait for table spinner3", "Fail");
            failedMessage = "Failed to wait for table spinner3";
            return false;
        }
        
        if(!SeleniumDriverInstance.waitForElementByXpath(AssetsPageObjects.ActionButtonFirstOnListRelativeXpathText(),10))
        {
            testData.extractParameter("Error", "Failed to wait for action button", "Fail");
            failedMessage = "Failed to wait for action button";
            return false;
        }
         
        
        if (!SeleniumDriverInstance.clickElementByXpathUsingActions(AssetsPageObjects.ActionButtonFirstOnListRelativeXpathText()))
        {
            testData.extractParameter("Error", "Failed to click the Actions button", "Fail");
            failedMessage = "Failed to click actions button";
            return false;
        }
           
        if(!SeleniumDriverInstance.waitForfElementToBeClickableByXpath(AssetsPageObjects.EditAssetButtonFirstOnListRelativeXpathText(), 15)
                && SeleniumDriverInstance.DriverUtility().toUpperCase().equals("INTERNET EXPLORER"))
        {
             if (!SeleniumDriverInstance.clickElementByXpathUsingActions(AssetsPageObjects.ActionButtonFirstOnListRelativeXpathText()))
                    return false;
        }
        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("ActionButtonClicked", false);
        
        if (!SeleniumDriverInstance.clickElementByXpathUsingActions(AssetsPageObjects.EditAssetButtonFirstOnListRelativeXpathText()))
            return false;
        
        SeleniumDriverInstance.takeScreenShot("EditButtonClicked", false);
        
        return true;
    }
    
    private boolean searchAsset(String assetToSearch)
    {
        if(!SeleniumDriverInstance.waitForPresenceOfElementByXpath(AssetsPageObjects.TableLoadingSpinnerXpath(), 80))
        {
            testData.extractParameter("Error", "Failed to wait for table spinner1", "Fail");
            failedMessage = "Failed to wait for table spinner1";
            return false;
        }
        
        SeleniumDriverInstance.clearTextByXpath(AssetsPageObjects.SearchBoxRelativeXpath());
        
        SeleniumDriverInstance.pause(1500);
        if (!SeleniumDriverInstance.enterTextByXpath(AssetsPageObjects.SearchBoxRelativeXpath(),assetToSearch))
        {
            testData.extractParameter("Error", "Failed to enter text on search asset filter", "Fail");
            failedMessage = "Failed to enter text on search asset filter";
            return false;
        }

        if (!SeleniumDriverInstance.moveToAndClickElementByXpath(AssetsPageObjects.SearchButtonRelativeXpath()))
        {
            testData.extractParameter("Error", "Failed to click the search button", "Fail");
            failedMessage = "Failed to click the search button";
            return false;
        }
        
        SeleniumDriverInstance.pressKey(Keys.ENTER);
        
        SeleniumDriverInstance.pause(1500);
        
        if(!SeleniumDriverInstance.waitForPresenceOfElementByXpath(AssetsPageObjects.TableLoadingSpinnerXpath(), 80))
        {
            testData.extractParameter("Error", "Failed to wait for table spinner2", "Fail");
            failedMessage = "Failed to wait for table spinner";
            return false;
        }

        SeleniumDriverInstance.takeScreenShot("AssetSearched", false);
        
        return true;
    }
   
    private boolean downloadFuelDataImportTemplate()
    {
         //Wait for asset status
        if(!SeleniumDriverInstance.waitForElementByXpath(AssetsPageObjects.AssetStatusLabelRelativeXpathText()))
        {
            testData.extractParameter("Error", "Failed to wait Asset status", "Fail");
            failedMessage = "Failed to wait for Asset status";
            return false;
        }
       
        String regNo=testData.getData("Registration Number");
        
        if (regNo.equals(""))
        {
            regNo = SeleniumDriverInstance.retrieveEnteredTextByXpath(AssetsPageObjects.RegNoTextBoxRelativeXpath());
        }
        
        testData.extractParameter("Registration Number Used", regNo,"PASS");
        //Click Fuel Data Tab
        if(!SeleniumDriverInstance.clickElementByXpathUsingActions(AssetsPageObjects.FuelDataTabTextXpath()))
        {
            testData.extractParameter("Error", "Failed to click on Fuel Data Tab", "Fail");
            failedMessage = "Failed to click on Fuel Data Tab";
            return false;
        }
        
        //Fuel Grid Data
        if(!SeleniumDriverInstance.waitForElementByXpath(AssetsPageObjects.FuelGridDataClassXpath()))
        {
            testData.extractParameter("Error", "Failed to wait for Fuel Grid Data Class", "Fail");
            failedMessage = "Failed to wait for Fuel Grid Data Class";
            return false;
        }
        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("FuelGridDataDisplayed", false);
        
        if(!SeleniumDriverInstance.waitForElementByXpath(AssetsPageObjects.ImportFuelButtonXpath()))
        {
            testData.extractParameter("Error", "Failed to wait for Import Fuel Button", "Fail");
            failedMessage = "Failed to wait for Import Fuel Button";
            return false;
        }
        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("FuelDataTabClicked", false);
        
        //Move to Save Button
        if(!SeleniumDriverInstance.moveToElementByXpath(AssetsPageObjects.ServiceHistorySaveButtonXpath()))
        {
            testData.extractParameter("Error", "Failed to move to Service History Save button", "Fail");
            failedMessage = "Failed to move to Service History Save button";
            return false;
        }
        
        SeleniumDriverInstance.pause(2000);
        SeleniumDriverInstance.takeScreenShot("MovedToSaveButton", false);
         
        //Move to Cancel Button
        if(!SeleniumDriverInstance.moveToElementByXpath(AssetsPageObjects.ServiceHistoryCancelButtonXpath()))
        {
            testData.extractParameter("Error", "Failed to move to Service History Cancel button", "Fail");
            failedMessage = "Failed to move to Service History Cancel button";
            return false;
        }
        
        SeleniumDriverInstance.pause(2000);
        SeleniumDriverInstance.takeScreenShot("MovedToCancelButton", false);

        //Hover over download Button
        if(!SeleniumDriverInstance.moveToElementByXpath(AssetsPageObjects.DownloadImportFuelTemplateButtonXpath()))
        {
            testData.extractParameter("Error", "Failed to move to Download Import Fuel Template button", "Fail");
            failedMessage = "Failed to move to Download Import Fuel Template button";
            return false;
        }
        
        SeleniumDriverInstance.pause(2000);
        SeleniumDriverInstance.takeScreenShot("HoveredOverDownloadImportButton", false);
         
        //Hover over import Button
        if(!SeleniumDriverInstance.moveToElementByXpath(AssetsPageObjects.ImportFuelButtonXpath()))
        {
            testData.extractParameter("Error", "Failed to move to Import Fuel button", "Fail");
            failedMessage = "Failed to move to Import Fuel button";
            return false;
        }
        
        SeleniumDriverInstance.pause(2000);
        SeleniumDriverInstance.takeScreenShot("HoveredOverImportFuelButton", false);
         
        //Click Download Import Fuel Template
        if(!SeleniumDriverInstance.clickElementByXpathUsingActions(AssetsPageObjects.DownloadImportFuelTemplateButtonXpath()))
        {
            testData.extractParameter("Error", "Failed to click the Download Import Fuel Template button", "Fail");
            failedMessage = "Failed to click the Download Import Fuel Template button";
            return false;
        }     
        
        if(!saveExportedFile())
        {
            failedMessage = "Failed Save Downloaded file";
            return false;
        }
        //Wait for downloaded file
        SeleniumDriverInstance.pause(5000);
        String importTemplate = getTheNewestFile("xlsx").toString();
        
        try
        {
            ArrayList<String> importTemplateFileArrayData = readFile(importTemplate);
            List<String> exportedColumns = new LinkedList (Arrays.asList(importTemplateFileArrayData.get(0).split("#")));
            List<String> parameterCols = new LinkedList (Arrays.asList(testData.getData("Verified Columns").split(";")));

             //Extract data
            testData.extractParameter("Columns To Verify", parameterCols.toString(),"PASS");
            testData.extractParameter("Fuel Data Import Template Columns", exportedColumns.toString(),"PASS");

            for (String _cols : exportedColumns)
            {
                boolean found = false;
                String index = "";
                for (String paraCol : parameterCols)
                {
                    //loop through parameter cols
                    if (_cols.contains(paraCol))
                    {
                        index = paraCol;
                        found = true;
                        break;
                    }
                }
                if (found)
                {
                    //remove if found to lessen the size
                    parameterCols.remove(index);
                }
            }

            if (!parameterCols.isEmpty())
            {
                testData.extractParameter("Fuel Data Import Template Missing Columns", parameterCols.toString(), "FAIL");
            }

             //Move file to reportDirectory
                File sourceFile = new File(importTemplate);
                if(!sourceFile.renameTo(new File(this.reportDirectory + "\\"+ sourceFile.getName())))
                {
                    System.out.println("Error: Failed to Copy File to report Directory");
                    System.err.println("Error: Failed to Copy File to report Directory");
                }
        }
        catch (Exception e) 
        {
            System.err.println("Failed to Validate Column Headers - " + e.getMessage());
            failedMessage = "Failed to Validate Column Headers";
            
            //Click Cancel to return to landing page.
            if(!SeleniumDriverInstance.clickElementbyXpath(AssetsPageObjects.ServiceHistoryCancelButtonXpath()))
            {
                testData.extractParameter("Error", "Failed to click on Service History Cancel button", "Fail");
                failedMessage = "Failed to click on Service History Cancel button";
                return false;
            }

            SeleniumDriverInstance.waitForPresenceOfElementByXpath(AssetsPageObjects.TableLoadingSpinnerXpath(), 30);
            return  false;
        }
         
     
        
         //Click Cancel to return to landing page.
        if(!SeleniumDriverInstance.clickElementbyXpath(AssetsPageObjects.ServiceHistoryCancelButtonXpath()))
        {
            testData.extractParameter("Error", "Failed to click on Service History Cancel button", "Fail");
            failedMessage = "Failed to click on Service History Cancel button";
            return false;
        }
        
        
        SeleniumDriverInstance.waitForPresenceOfElementByXpath(AssetsPageObjects.TableLoadingSpinnerXpath(), 30);
        
        SeleniumDriverInstance.pause(5000);
        
        return true;
    }
    
    private boolean downloadFuelDataImportTemplateTest() 
    {
        
        regNo = testData.getData("Registration Number");
        //If Registration Number provided, search and select asset
        if (!regNo.equals("")) 
        {
            if(!searchAsset(regNo))
            {
               failedMessage = "Failed to Search Asset";
               System.err.println(failedMessage);
               return false;
            }
            
            
            if(!clickEditButton(regNo))
            {
               failedMessage = "Failed to Click Edit Button1";
               System.err.println(failedMessage);
               return false;
            }    
        }
        //Select First Asset on list
        else
        {
            if(!clickEditButton())
            {
               failedMessage = "Failed to Click Edit Button2";
               System.err.println(failedMessage);
               return false;
            }
        }
        //Add Target Cost
        if(!downloadFuelDataImportTemplate())
            {
               failedMessage = "Failed to download Fuel Data Import Template";
               System.err.println(failedMessage);
               return false;
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
                        return true;
                    }
            case IE:
                    {
                        SeleniumDriverInstance.pause(20000);
                        if(!SikuliDriverInstance.MouseClickElement(MixTeleImages.SaveImage()))
                        {
                            SikuliDriverInstance.PressKey(Key.ENTER);
                        }
                        SeleniumDriverInstance.pause(3000);
                        
                        if(!SikuliDriverInstance.MouseClickElement(MixTeleImages.IEViewDownload()))
                        {
                            SikuliDriverInstance.PressKey(Key.ENTER);
                        }
                        
//                        if(SikuliDriverInstance.WaitSpecificTimeElementAppear(MixTeleImages.SaveImage(), 20))
//                        {   
//                            SeleniumDriverInstance.takeScreenShot("FailedToDownload", true);
//                            System.out.println("Error: Failed to download file");
//                            System.err.println("Error: Failed to download file");
//                            return false;
//                        }

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