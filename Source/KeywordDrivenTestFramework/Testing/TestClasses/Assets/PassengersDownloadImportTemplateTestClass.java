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
import KeywordDrivenTestFramework.Testing.PageObjects.MixTeleImages;
import KeywordDrivenTestFramework.Testing.PageObjects.PassengersPageObjects;
import KeywordDrivenTestFramework.Utilities.SikuliDriverUtility;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileWriter;
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
public class PassengersDownloadImportTemplateTestClass extends BaseClass {
    TestEntity testData;
    String failedMessage = "";
    public PassengersDownloadImportTemplateTestClass(TestEntity testData) {
        this.testData = testData;
        SikuliDriverInstance = new SikuliDriverUtility(MixTeleImages.MixTeleImagesFolder());
    }
    
    public TestResult executePassengersDownloadImportTemplateTest() {

        this.setStartTime();
        
        if (!selectAllColumns()) 
        {
            SeleniumDriverInstance.takeScreenShot("FailedToSelectAllPassengerColumns", true);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To Select All Passenger Columns", this.getTotalExecutionTime());
        }
         if (!passengersImportTemplateTest()) 
        {
            SeleniumDriverInstance.takeScreenShot("FailedToDownloadOrValidatePassengersImportTemplate", true);
            return new TestResult(testData, Enums.ResultStatus.FAIL, failedMessage, this.getTotalExecutionTime());
        }
         if (!passengersUpdateTemplateTest()) 
        {
            SeleniumDriverInstance.takeScreenShot("FailedToDownloadOrValidatePassengersUpdateTemplate", true);
            return new TestResult(testData, Enums.ResultStatus.FAIL, failedMessage, this.getTotalExecutionTime());
        }
          if (!performCloseFunction()) 
        {
            SeleniumDriverInstance.takeScreenShot("FailedToPerformCloseFunctions", true);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To Perform Close Functions", this.getTotalExecutionTime());
        }
         
         
        return new TestResult(testData, Enums.ResultStatus.PASS, "Passengers Update and Import Template validated successfully", this.getTotalExecutionTime());
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
     
    private boolean selectDownloadTemplate(String template)
    {
        
        if (!SeleniumDriverInstance.waitForElementByXpath(PassengersPageObjects.DownloadImportTemplatedPassengersButtonRelativeXpath()))
            return false;
        
         //Click Download Import Template Button
         if(browserType.equals(browserType.IE))
        {
            if (!SeleniumDriverInstance.doubleClickElementByXpath(PassengersPageObjects.DownloadImportTemplatedPassengersButtonRelativeXpath()))
                return false;
        }else{
            if (!SeleniumDriverInstance.clickElementbyXpath(PassengersPageObjects.DownloadImportTemplatedPassengersButtonRelativeXpath()))
                return false;
        }
        
        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("DownloadTemplateButtonClicked", false);
       
        SeleniumDriverInstance.pause(3000);
        if (!SeleniumDriverInstance.waitForElementByXpath(template))
            return false;
        
         //Check if Download button is disabled
        if(!SeleniumDriverInstance.getElementEnabledStatusByXpath(PassengersPageObjects.PassengersTemplateDownloadButtonRelativeXpath()).equals("true"))
        {      
            System.out.println("[INFO] Download Button enabled before selecting template");
            return false;
        }
        
        if (!SeleniumDriverInstance.doubleClickElementByXpath(template))
            return false;
        
        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("RadioButtonClicked", false);
        
//        SeleniumDriverInstance.pause(2000);
//        if (!SeleniumDriverInstance.clickElementByXpathUsingActions(AssetsPageObjects.WouldYouLikeToLabelRelativeXpathText()))
//            return false;
//        
//         SeleniumDriverInstance.pause(3000);
        if (!SeleniumDriverInstance.clickElementByXpathUsingActions(PassengersPageObjects.PassengersTemplateDownloadButtonRelativeXpath()))
            return false;

        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("TemplateDownloaded", false);
        //Pause for download
        SeleniumDriverInstance.pause(10000);
        
        return true;
    }
    
    private boolean ValidateTemplate()
    {
      try{
        SeleniumDriverInstance.pause(3000);
        testData.extractParameter("Columns To Verify", testData.getData("Verified Columns"),"PASS");
        String [] ColumnHeaders = testData.getData("Verified Columns").split(";");
         
        String importTemplateFile = getTheNewestFile("xlsx").toString();
          
        ArrayList <String> importTemplateData = readFile(importTemplateFile);
        boolean missingCols = false; 
        String missingColsText = ""; 
        for(int i = 0; i < ColumnHeaders.length; i++) {
           if(!importTemplateData.toString().contains(ColumnHeaders[i]))
           {
               missingCols = true;
               missingColsText +=  ColumnHeaders[i]+ "<br>";
           }
        }
        
        testData.extractParameter("Import Template Columns",importTemplateData.toString(),"PASS");
        //testData.extractParameter("Required Import Template Columns",Arrays.toString(ColumnHeaders),"PASS");
        
        //Move file to reportDirectory
        File sourceFile = new File(importTemplateFile);
        if(!sourceFile.renameTo(new File(this.reportDirectory + "\\"+ sourceFile.getName())))
        {
            System.out.println("Error: Failed to Move File to report Directory");
            System.err.println("Error: Failed to Move File to report Directory");
        }
        
        
        if (missingCols) {
            testData.extractParameter("Missing ColumnHeaders",missingColsText,"FAIL");
            return  false;
        }
        else{
            testData.extractParameter("Missing ColumnHeaders","None","PASS");
        }
        
        return true;
       }
       catch (Exception e) {
            System.err.println("Error Validating Import Template - " + e.getMessage());
            return  false;
       }
    }
   
    private boolean passengersImportTemplateTest()
    {
        SeleniumDriverInstance.pause(3000);
        if (!selectDownloadTemplate(PassengersPageObjects.PassengersImportNewRecordsRadioButtonRelativeXpath())){
            failedMessage = "Failed to Download Import New Records Template";
            System.out.println("Error: Failed to Download Import New Records Template");
            System.err.println("Error: Failed to Download Import New Records Template");
            return false;
        }
          if(!saveExportedFile())
        {
            failedMessage = "Failed To Save Downloaded file";
            System.out.println("Error: Failed To Save Downloaded file");
            System.err.println("Error: Failed To Save Downloaded file");
            return false;
        }
           //SeleniumDriverInstance.pressKey(Keys.F5);
           SeleniumDriverInstance.pause(4000);
        if (!ValidateTemplate()){
            failedMessage = "Failed to Validate Import Template";
            System.out.println("Error: Failed to Validate Template");
            System.err.println("Error: Failed to Validate Template");
            return false;
        }
        
        return true;
    }
    
    
    private boolean passengersUpdateTemplateTest()
    {
        SeleniumDriverInstance.pause(3000);
        if (!selectDownloadTemplate(PassengersPageObjects.PassengersUpdateExistingRecordsRadioButtonRelativeXpath())){
            failedMessage = "Failed to Download Update Existing Records Template";
            System.out.println("Error: Failed to Download Update Existing Records Template");
            System.err.println("Error: Failed to Download Update Existing Records Template");
            return false;
        }
        if(!saveExportedFile())
        {
            failedMessage = "Failed To Save Downloaded file";
            System.out.println("Error: Failed To Save Downloaded file");
            System.err.println("Error: Failed To Save Downloaded file");
            return false;
        }
        //SeleniumDriverInstance.pressKey(Keys.F5);
        SeleniumDriverInstance.pause(4000);
        try{
        List<String> passengersList = new ArrayList<String>();
        
         String ivalidLines = "";
          String filenameDateAndTime = "";
         boolean allDatamatches = true;
        
         
        //Get all passengers on pages/grid
        passengersList = SeleniumDriverInstance.getPassengersAndHeardersListOnGrid(PassengersPageObjects.PassengersTablRelativeXpath(),
                                                AssetsPageObjects.AssetGridLastPageButtonRelativeXpath(),
                                                AssetsPageObjects.AssetGridNextPageButtonRelativeXpath());
            
            SeleniumDriverInstance.pause(3000);
                String exportedPassengersFile = getTheNewestFile("xlsx").toString();
                
                //Inspect Filename
                //inspectFilename(testData.getData("Filename"),exportedAssetsFile, filenameDateAndTime);
                
                
                ArrayList<String> exportedPassengersFileArrayData = readFile(exportedPassengersFile);
                //If assest list and excel export size are equal, compare data
                if(passengersList.size() <= exportedPassengersFileArrayData.size()){
                     int exportedIDColumnIndex =0;int gridIDColumnIndex =0;
                     String exportedDataString = Arrays.toString(exportedPassengersFileArrayData.toArray());
                    for (int i = 0; i < passengersList.size(); i++) {
                        String[] exportedLineArray = exportedPassengersFileArrayData.get(i).split("#");
                        String[] passengersLineArray = passengersList.get(i).split("#");
                        
                        
                        if(i==0)
                        {
                            //Get exported index
                            for (int k = 0; k < exportedLineArray.length; k++) {
                                if(exportedLineArray[k].contains("ID"))
                                {exportedIDColumnIndex = k;}
                            }
                            for (int k = 0; k < passengersLineArray.length; k++) {
                                if(passengersLineArray[k].contains("ID"))
                                {gridIDColumnIndex = k;}
                            }
                            for (int k = 0; k < exportedLineArray.length; k++) {
                                    if (!Arrays.toString(exportedLineArray).contains(passengersLineArray[k])) {
                                        if (Arrays.toString(exportedLineArray).contains("Name")) {
                                        
                                        }else{
                                        int exportedLine = i;
                                            ivalidLines += "Passenger list line -"+i+" is not equal to Exported list line-" +exportedLine+"\n";
                                            System.out.println("Error: Passenger list line -"+i+" is not equal to Exported list line-" +exportedLine);
                                            allDatamatches = false;
                                            failedMessage = "Data on Exported file does not correspond with Passengers data on landing screen";
                                        }
                                    }
                                }
                        }
                        else{
                            try{
                                for (int j = 0; j < exportedLineArray.length; j++) {
                                    if (!Arrays.toString(exportedLineArray).contains(passengersLineArray[j])) {
                                        if(exportedDataString.contains(passengersLineArray[j]))
                                        { }
                                        else if(j==exportedIDColumnIndex || j==gridIDColumnIndex){}
                                        else{
                                            int exportedLine = i;
                                            ivalidLines += "Passenger list line -"+i+" is not equal to Exported list line-" +exportedLine+"\n";
                                            System.out.println("Error: Passenger list line -"+i+" is not equal to Exported list line-" +exportedLine);
                                            allDatamatches = false;
                                            failedMessage = "Data on Exported file does not correspond with Passengers data on landing screen";
                                        }
                                    }
                                }
                            }
                            catch (Exception e) 
                            {

                            }
                        }
                    }
                }else{
                    System.out.println("Error: Passenger list size-"+passengersList.size()+" is not equal to Exported list size-" +exportedPassengersFileArrayData.size());
                    System.err.println("Error: Passenger list size-"+passengersList.size()+" is not equal to Exported list size-" +exportedPassengersFileArrayData.size());
                    failedMessage = "Passenger list size-"+passengersList.size()+" on landing page is not equal to Exported excel list size-" +exportedPassengersFileArrayData.size();
                    return false;
                }
               
               
                //Move file to reportDirectory
                File sourceFile = new File(exportedPassengersFile);
                if(!sourceFile.renameTo(new File(this.reportDirectory + "\\"+ sourceFile.getName())))
                {
                    System.out.println("Error: Failed to Copy File to report Directory");
                    System.err.println("Error: Failed to Copy File to report Directory");
                    //return false;
                }
                //Write asset data to file
                try{
                    String[] fileName = exportedPassengersFile.split("\\\\");
                    FileWriter writer = new FileWriter(this.reportDirectory + "\\"+fileName[4].substring(0,fileName[4].length()-5)+".txt");
                        writer.write(" Assest: "+System.getProperty("line.separator"));
                        
                        for(String line: passengersList){
                            writer.write(line+System.getProperty("line.separator"));
                        }
                        writer.close();
                }catch (Exception e) {
                        System.err.println("Error Writing Passengers List data to file - " + e.getMessage());
                        return  false;
                }
                
                if (allDatamatches) {
                    testData.extractParameter("Data Is Matching", "", "PASS");
                }else{
                    testData.extractParameter("Umatching Data", ivalidLines, "FAIL");
                    return  false;
                }
        
        return true;
      }
        catch (Exception e) {
            System.err.println("Error Exporting Passengers - " + e.getMessage());
            failedMessage = "Error Exporting Passengers - Failed to read passengers on landing page";
            System.out.println("Error Exporting Passengers - Failed to read passengers on landing page");
            return  false;
        }
        
    }
     
   
    private boolean performCloseFunction()
    {
        //Click Download Import Template Button
         if(browserType.equals(browserType.IE))
        {
            if(!SeleniumDriverInstance.doubleClickElementByXpath(PassengersPageObjects.DownloadImportTemplatedPassengersButtonRelativeXpath()))
                return false;
        }else{
            if(!SeleniumDriverInstance.clickElementbyXpath(PassengersPageObjects.DownloadImportTemplatedPassengersButtonRelativeXpath()))
                return false;
        }
         
        if(!SeleniumDriverInstance.waitForElementByXpath(PassengersPageObjects.PassengersTemplateCloseButtonRelativeXpath()))
            return false;
        //Click close button
        if (!SeleniumDriverInstance.clickElementByXpathUsingActions(PassengersPageObjects.PassengersTemplateCloseButtonRelativeXpath()))
            return false;
        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("CloseButtonClicked", false);
        
        if (!SeleniumDriverInstance.waitForInvisibilityOfElementByXpath(PassengersPageObjects.ModalBackdropRelativeXpath(),15))
            return false;
        
        if (!SeleniumDriverInstance.waitForElementByXpath(PassengersPageObjects.DownloadImportTemplatedPassengersButtonRelativeXpath()))
            return false;
        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("PassengersPageAfterClosedButton", false);
       
        //Click Download Import Template Button
         if(browserType.equals(browserType.IE))
        {
            if(!SeleniumDriverInstance.doubleClickElementByXpath(PassengersPageObjects.DownloadImportTemplatedPassengersButtonRelativeXpath()))
                return false;
        }else{
            if(!SeleniumDriverInstance.clickElementbyXpath(PassengersPageObjects.DownloadImportTemplatedPassengersButtonRelativeXpath()))
                return false;
        }
        
        if(!SeleniumDriverInstance.waitForElementByXpath(PassengersPageObjects.PassengersTemplateCancelButtonRelativeXpath()))
            return false;
       
        if (!SeleniumDriverInstance.clickElementbyXpath(PassengersPageObjects.PassengersTemplateCancelButtonRelativeXpath()))
        {
             if(browserType.equals(browserType.IE))
            {
                if(SeleniumDriverInstance.waitForElementByXpath(PassengersPageObjects.PassengersTemplateCancelButtonRelativeXpath(),5))
                {
                    if (!SeleniumDriverInstance.clickElementbyXpath(PassengersPageObjects.PassengersTemplateCancelButtonRelativeXpath()))
                        return false;
                } 
            }else{
                 return false;
             }
        }
        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("CancelButtonClicked", false);
        
        if(!SeleniumDriverInstance.waitForInvisibilityOfElementByXpath(PassengersPageObjects.ModalBackdropRelativeXpath(),15))
            return false;
        
        if (!SeleniumDriverInstance.waitForElementByXpath(PassengersPageObjects.DownloadImportTemplatedPassengersButtonRelativeXpath()))
            return false;
        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("PassengersPageAfterCancelButton", false);
        
        return true;
    }
    
    
    private boolean selectAllColumns()
    {
        //Wait for spinner
        if (!SeleniumDriverInstance.waitForElementByXpath(PassengersPageObjects.waitForPassengerLoadingSpinner(),45))
            return false;
        
        
        //Select All columns
        columnChooserOpen();
        if(SeleniumDriverInstance.selectColumnChooserList(PassengersPageObjects.columnChooserXpath("Email address")))
        {
            columnChooserOpen();
            if(SeleniumDriverInstance.selectColumnChooserList(PassengersPageObjects.columnChooserXpath("Email address")))return false;
        }
        columnChooserOpen();
        if(SeleniumDriverInstance.selectColumnChooserList(PassengersPageObjects.columnChooserXpath("Mobile number")))
        {
            columnChooserOpen();
            if(SeleniumDriverInstance.selectColumnChooserList(PassengersPageObjects.columnChooserXpath("Mobile number")))return false;
        }
        columnChooserOpen();
        if(SeleniumDriverInstance.selectColumnChooserList(PassengersPageObjects.columnChooserXpath("Passenger ID")))
        {
           columnChooserOpen();
           if(SeleniumDriverInstance.selectColumnChooserList(PassengersPageObjects.columnChooserXpath("Passenger ID")))return false;
        }
     
        
//        if(!SeleniumDriverInstance.selectPassengerColumnChooserList(PassengersPageObjects.ColumnChooserButtonRelativeXpath(),
//                                                                    PassengersPageObjects.emailAddressFromColumnSelector()))
//            return false;
//        
//        if(!SeleniumDriverInstance.clickElementbyXpath(PassengersPageObjects.PassengersHeaderLabelRelativeXpathText()))
//            return false;
//        
//        
//        if(!SeleniumDriverInstance.selectPassengerColumnChooserList(PassengersPageObjects.ColumnChooserButtonRelativeXpath(),
//                                                                    PassengersPageObjects.mobileNumberFromColumnSelector()))
//            return false; 
////        
//        if(!SeleniumDriverInstance.clickElementbyXpath(PassengersPageObjects.PassengersHeaderLabelRelativeXpathText()))
//            return false;
//        
//        SeleniumDriverInstance.pause(1000);
//        if(!SeleniumDriverInstance.selectPassengerColumnChooserList(PassengersPageObjects.ColumnChooserButtonRelativeXpath(),
//                                                                    PassengersPageObjects.passengerIDFromColumnSelector()))
//            return false;         
////                 
//        if(!SeleniumDriverInstance.clickElementbyXpath(PassengersPageObjects.ColumnChooserButtonRelativeXpath()))
//            return false;
        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("PassengersColumnsAllSelected", false);
        
        if(!SeleniumDriverInstance.clickElementbyXpath(PassengersPageObjects.PassengersHeaderLabelRelativeXpathText()))
            return false;
        
        return true;
    }
    
     public boolean columnChooser()
     {
          //validate if the column chooser is visible
        if(!SeleniumDriverInstance.waitForElementByXpath(PassengersPageObjects.columnChooserULXpath(),20))
         {
            if(!SeleniumDriverInstance.clickElementByXpath(PassengersPageObjects.columnChoosersXpath()))
             {
              System.err.println("[ERROR] Failed to click column chooser");
              return false;
             }
         }
        else
        {
             if(!SeleniumDriverInstance.clickElementByXpath(PassengersPageObjects.columnChoosersXpath()))
             {
              System.err.println("[ERROR] Failed to click column chooser");
              return false;
             }
        }
        pause(1000);
        return true;
    }
    
    public boolean columnChooserOpen()
     {
          //validate if the column chooser is visible
        if(!SeleniumDriverInstance.waitForElementByXpath(PassengersPageObjects.columnChooserULXpath(),10))
         {
            if(!SeleniumDriverInstance.clickElementByXpath(PassengersPageObjects.columnChoosersXpath()))
             {
              System.err.println("[ERROR] Failed to click column chooser");
              return false;
             }
         }
        return true;
    }
    
}

