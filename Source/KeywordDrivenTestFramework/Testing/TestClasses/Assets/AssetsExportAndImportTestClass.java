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
import static org.hamcrest.text.IsEqualIgnoringWhiteSpace.equalToIgnoringWhiteSpace;


/**
 *
 * @author lmkhontwana
 */
public class AssetsExportAndImportTestClass extends BaseClass {
    int counter = 1;
    TestEntity testData;
    String failedMessage = "";
    public AssetsExportAndImportTestClass(TestEntity testData) {
        this.testData = testData;
        SikuliDriverInstance = new SikuliDriverUtility(MixTeleImages.MixTeleImagesFolder());
    }
    
    public TestResult executeAssetsExportTest() {

        this.setStartTime();
        if (!assetsExportWithHeaders()) 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To Export Asset", true);
            counter++;
            return new TestResult(testData, Enums.ResultStatus.FAIL, failedMessage, this.getTotalExecutionTime());
        }
        return new TestResult(testData, Enums.ResultStatus.PASS, "Asset(s) Exported and Validated successfully", this.getTotalExecutionTime());
      }
     
     
    public TestResult executeDownloadImportTemplateTest() {

        this.setStartTime();
         if (!DownloadImportTemplate()) 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To DownloadImportTemplate", true);
            counter++;
            return new TestResult(testData, Enums.ResultStatus.FAIL, failedMessage, this.getTotalExecutionTime());
        }
        return new TestResult(testData, Enums.ResultStatus.PASS, "Import Template Download and Validated successfully", this.getTotalExecutionTime());
      }
     
    private boolean assetsExport()
    {
        try{
        List<String> assetsList = new ArrayList<String>();
        
         String ivalidLines = "";
         boolean allDatamatches = true;
        //Get all assets on pages/grid
      assetsList = SeleniumDriverInstance.getAssetsListOnGrid(AssetsPageObjects.AssetListGridRelativeXpath(),
                                                    AssetsPageObjects.AssetGridLastPageButtonRelativeXpath(),
                                                    AssetsPageObjects.AssetGridNextPageButtonRelativeXpath());
         
        if (assetsList.size() > 0) {
            //Click Export Asset Button
            if (!SeleniumDriverInstance.clickElementbyXpath(AssetsPageObjects.ExportAssetButtonRelativeXpath()))
                return false;
            //Take Screenshot
            SeleniumDriverInstance.takeScreenShot("ExportAssetButtonClicked", false);
            //Pause for download
            SeleniumDriverInstance.pause(10000);
            
            saveExportFile();                       
            
            SeleniumDriverInstance.pause(3000);
                String exportedAssetsFile = getTheNewestFile("xlsx").toString();
                
                ArrayList<String> exportedAssetsFileArrayData = readFile(exportedAssetsFile);
                //If assest list and excel export size are equal, compare data
                if(assetsList.size() == exportedAssetsFileArrayData.size()-1){
                    for (int i = 0; i < assetsList.size(); i++) {
                        if (!exportedAssetsFileArrayData.get(i+1).contains(assetsList.get(i))) {
                            int exportedLine = i+1;
                            ivalidLines += "Asset list line -"+i+" is not equal to Exported list line-" +exportedLine+"\n";
                            System.out.println("Error: Asset list line -"+i+" is not equal to Exported list line-" +exportedLine);
                            allDatamatches = false;
                            failedMessage = "Data on Exported file does not correspond with data assets landing screen";
                        }
                    }
                }else{
                    System.out.println("Error: Asset list size-"+assetsList.size()+" is not equal to Exported list size-" +exportedAssetsFileArrayData.size());
                    System.err.println("Error: Asset list size-"+assetsList.size()+" is not equal to Exported list size-" +exportedAssetsFileArrayData.size());
                    failedMessage = "Asset list size-"+assetsList.size()+" is not equal to Exported list size-" +exportedAssetsFileArrayData.size();
                    return false;
                }
               
               
                //Copy file to reportDirectory
                File sourceFile = new File(exportedAssetsFile);
                if(!sourceFile.renameTo(new File(this.reportDirectory + "\\"+ sourceFile.getName())))
                {
                    System.out.println("Error: Failed to Copy File to report Directory");
                    System.err.println("Error: Failed to Copy File to report Directory");
                    //return false;
                }
                //Write asset data to file
                try{
                    String[] fileName = exportedAssetsFile.split("\\\\");
                    FileWriter writer = new FileWriter(this.reportDirectory + "\\"+fileName[4].substring(0,fileName[4].length()-5)+".txt");
                        writer.write(" Assest: "+System.getProperty("line.separator"));
                        
                        for(String line: assetsList){
                            writer.write(line+System.getProperty("line.separator"));
                        }
                        writer.close();
                }catch (Exception e) {
                        System.err.println("Error Writing Assets List data to file - " + e.getMessage());
                        return  false;
                }
                
                if (allDatamatches) {
                    testData.extractParameter("All Data Matching", "", "PASS");
                }else{
                    testData.extractParameter("Umatching Data", ivalidLines, "FAIL");
                    return  false;
                }
        }
        else{
             ivalidLines += "Asset list size-"+assetsList.size()+" :No Assets to display";
             testData.extractParameter("No Assets", ivalidLines, "PASS");
             System.out.println("Error: Asset list size-"+assetsList.size()+" :No Assets to display");
             System.err.println("Error: Asset list size-"+assetsList.size()+" :No Assets to display");
        }
       
       
        return true;
      }
        catch (Exception e) {
            System.err.println("Error Exporting Assets - " + e.getMessage());
            return  false;
        }
    }
    
    private boolean assetsExportWithHeaders()
    {
        try{
        List<String> assetsList = new ArrayList<String>();
        
         String ivalidLines = "";
          String filenameDateAndTime = "";
         boolean allDatamatches = true;
        
         
        
        SeleniumDriverInstance.clickElementByXpathUsingActions(AssetsPageObjects.AssetGridFirstPageButtonRelativeXpath());
        //Get all assets on pages/grid
        if(browserType.equals(browserType.IE))
        {
           assetsList = SeleniumDriverInstance.getAssetsListWithHeardersOnGrid(AssetsPageObjects.AssetListGridRelativeXpath(),
                                                AssetsPageObjects.PageNumberXpath(testData.getData("Pages To Read")),
                                                AssetsPageObjects.AssetGridNextPageButtonRelativeXpath());
        }else{
            assetsList = SeleniumDriverInstance.getAssetsListWithHeardersOnGrid(AssetsPageObjects.AssetListGridRelativeXpath(),
                                                AssetsPageObjects.AssetGridLastPageButtonRelativeXpath(),
                                                AssetsPageObjects.AssetGridNextPageButtonRelativeXpath());
        }
        if (assetsList.size() > 0) {
            //Click Export Asset Button
             if(browserType.equals(browserType.IE))
            {
                if (!SeleniumDriverInstance.doubleClickElementByXpath(AssetsPageObjects.ExportAssetButtonRelativeXpath()))
                    return false;
            }else{
                if (!SeleniumDriverInstance.clickElementbyXpath(AssetsPageObjects.ExportAssetButtonRelativeXpath()))
                    return false;
             }
            filenameDateAndTime = SeleniumDriverInstance.generateDateTimeStampVaule();
            //Take Screenshot
            SeleniumDriverInstance.takeScreenShot("ExportAssetButtonClicked", false);
            //Pause for download
            SeleniumDriverInstance.pause(10000);
            
            //saveExportFile();
            if(!saveExportedFile())
            {
                failedMessage = "Failed Save Downloaded file";
                   return false;
            }
            
            SeleniumDriverInstance.pause(3000);
                String exportedAssetsFile = getTheNewestFile("xlsx").toString();
                
                //Inspect Filename
                inspectFilename(testData.getData("Filename"),exportedAssetsFile, filenameDateAndTime);
                
                
                ArrayList<String> exportedAssetsFileArrayData = readFile(exportedAssetsFile);
                //If assest list and excel export size are equal, compare data
                if(assetsList.size() <= exportedAssetsFileArrayData.size()){
                    for (int i = 0; i < assetsList.size(); i++) {
                        
                        String[] exportedLineArray = exportedAssetsFileArrayData.get(i).split("#");
                        String[] assetLineArray = assetsList.get(i).split("#");
                        if(i==0)
                        {
                            for (String columnHeader : assetLineArray) {
                                if(!exportedAssetsFileArrayData.get(i).contains(columnHeader))
                                {
                                    int exportedLine = i;
                                        ivalidLines += "Asset list line -"+exportedAssetsFileArrayData.get(i)+" =! Exported list line-" +assetsList.get(i)+";\n\n";
                                        //ivalidLines += "Asset list line -"+i+" is not equal to Exported list line-" +exportedLine+"\n";
                                        System.out.println("Error: Asset list line -"+i+" is not equal to Exported list line-" +exportedLine);
                                        allDatamatches = false;
                                        failedMessage = "Data on Exported file does not correspond with assets data on landing screen";
                                }
                            }
                        }
                        else{
                            try{
                                for (int j = 0; j < exportedLineArray.length; j++) {
                                    if ((!equalToIgnoringWhiteSpace(exportedLineArray[j].replaceAll(".", "")).matches(assetLineArray[j])) && (!exportedLineArray[j].contains(assetLineArray[j]))) {
                                        int exportedLine = i;
                                        ivalidLines += "Asset list line -"+assetsList.get(i)+";\n\n<br><br><br>";
                                        //ivalidLines += "Asset list line -"+assetsList.get(i)+" =! Exported list line-" +assetsList.get(i)+";\n\n";
                                        //ivalidLines += "Asset list line -"+i+" is not equal to Exported list line-" +exportedLine+"\n";
                                        System.out.println("Error: Asset list line -"+i+" is not equal to Exported list line-" +exportedLine);
                                        allDatamatches = false;
                                        failedMessage = "Data on Exported file does not correspond with assets data on landing screen";
                                    }
                                }

                            }
                            catch (Exception e) 
                            {

                            }
                        }
                    }
                }else{
                    System.out.println("Error: Asset list size-"+assetsList.size()+" is not equal to Exported list size-" +exportedAssetsFileArrayData.size());
                    System.err.println("Error: Asset list size-"+assetsList.size()+" is not equal to Exported list size-" +exportedAssetsFileArrayData.size());
                    failedMessage = "Asset list size-"+assetsList.size()+" is not equal to Exported list size-" +exportedAssetsFileArrayData.size();
                    return false;
                }
               
               
                //Copy file to reportDirectory
                File sourceFile = new File(exportedAssetsFile);
                if(!sourceFile.renameTo(new File(this.reportDirectory + "\\"+ sourceFile.getName())))
                {
                    System.out.println("Error: Failed to Copy File to report Directory");
                    System.err.println("Error: Failed to Copy File to report Directory");
                    //return false;
                }
                //Write asset data to file
                try{
                    String[] fileName = exportedAssetsFile.split("\\\\");
                    FileWriter writer = new FileWriter(this.reportDirectory + "\\"+fileName[4].substring(0,fileName[4].length()-5)+".txt");
                        writer.write(" Assest: "+System.getProperty("line.separator"));
                        
                        for(String line: assetsList){
                            writer.write(line+System.getProperty("line.separator"));
                        }
                        writer.close();
                }catch (Exception e) {
                        System.err.println("Error Writing Assets List data to file - " + e.getMessage());
                        return  false;
                }
                
                if (allDatamatches) {
                    testData.extractParameter("Data Is Matching", "", "PASS");
                }else{
                    testData.extractParameter("Umatching Data", ivalidLines, "FAIL");
                    return  false;
                }
        }
        else{
             ivalidLines += "Asset list size-"+assetsList.size()+" :No Assets to display";
             testData.extractParameter("No Assets", ivalidLines, "PASS");
             System.out.println("Error: Asset list size-"+assetsList.size()+" :No Assets to display");
             System.err.println("Error: Asset list size-"+assetsList.size()+" :No Assets to display");
        }
       
        return true;
      }
        catch (Exception e) {
            System.err.println("Error Exporting Assets - " + e.getMessage());
            return  false;
        }
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
           // String file = new File("C:\\Users\\apeter.DVT\\Downloads").toString();
            
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
        
    private boolean saveExportFile()
    {
        if(SeleniumDriverInstance.DriverUtility().equals("firefox"))
        {
            SeleniumDriverInstance.pause(5000);
//            SikuliDriverInstance.MouseClickElement(MixTeleImages.SaveImageFirefox());
//            SikuliDriverInstance.PressKey(Key.ENTER);
            SeleniumDriverInstance.takeScreenShot("DownloadClicked", false);
        }
        if(SeleniumDriverInstance.DriverUtility().toUpperCase().equals("INTERNET EXPLORER"))
        {
            SeleniumDriverInstance.pause(20000);
            if(!SikuliDriverInstance.MouseClickElement(MixTeleImages.SaveImage()))
            {
                SikuliDriverInstance.PressKey(Key.ENTER);
            }
            if(SikuliDriverInstance.WaitSpecificTimeElementAppear(MixTeleImages.SaveImage(), 3))
            {   
                System.out.println("Error: Failed to download file");
                System.err.println("Error: Failed to download file");
                return false;
            }
            //Clear list and Close downloads window if available
            SikuliDriverInstance.MouseClickElement(MixTeleImages.ClearListImage());
            SikuliDriverInstance.MouseClickElement(MixTeleImages.CloseImage());
        }   SeleniumDriverInstance.takeScreenShot("DownloadClicked", false);
        
        return true;
    }
     
    private boolean DownloadTemplate()
    {
        
        if (!SeleniumDriverInstance.waitForElementByXpath(AssetsPageObjects.DownloadImportButtonRelativeXpath()))
            return false;
        
        SeleniumDriverInstance.clickElementByXpathUsingActions(AssetsPageObjects.AssetsHeaderLabelRelativeXpathText());
        
        if (!SeleniumDriverInstance.clickElementByXpathUsingActions(AssetsPageObjects.DownloadImportButtonRelativeXpath()))
            return false;
        
        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("Download Template Button clicked", false);
        
        
        if (!SeleniumDriverInstance.waitForElementByXpath(AssetsPageObjects.ImportNewRecordsRadioButtonRelativeXpath()))
            return false;
        
        
        if (!SeleniumDriverInstance.clickElementByXpathUsingActions(AssetsPageObjects.ImportNewRecordsRadioButtonRelativeXpath()))
            return false;
        
        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("Import New Records Radio Button clicked", false);
        
        SeleniumDriverInstance.pause(2000);
        if (!SeleniumDriverInstance.clickElementByXpathUsingActions(AssetsPageObjects.WouldYouLikeToLabelRelativeXpathText()))
            return false;
        
         SeleniumDriverInstance.pause(3000);
        if (!SeleniumDriverInstance.clickElementByXpathUsingActions(AssetsPageObjects.DownloadButtonRelativeXpath()))
            return false;

        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("Template downloaded", false);
       
        saveExportFile();
        
        return true;
    }
    
    private boolean ValidateTemplate()
    {
      try{
        SeleniumDriverInstance.pause(3000);
        String [] ColumnHeaders = new String[]{"Asset description", "Asset type", "Is connected trailer","Registration number","Site","Fuel type",
                 "Target fuel consumption","Target hourly fuel consumption","Fleet number","Make","Model","Year","Chassis number",
                 "Engine number","FM vehicle ID","Additional mobile device","Notes","Colour","Odometer","Site","Last trip","Country","Last trip Time zone",
                 "Status","Config upload date","Configuration group","Engine hours","Last position","IMEI","IMSI","MSISDN","Mobile device"};
         
        String importTemplateFile = getTheNewestFile("xlsx").toString();
          
        ArrayList <String> importTemplateData = readFile(importTemplateFile);
        boolean missingCols = false; 
        String missingColsText = ""; 
        for (int i = 0; i < ColumnHeaders.length; i++) {
           if(!importTemplateData.toString().contains(ColumnHeaders[i]))
           {
               missingCols = true;
               missingColsText +=  ColumnHeaders[i]+ "; ";
           }
        }
        
        testData.extractParameter("Import Template Columns",importTemplateData.toString(),"PASS");
        testData.extractParameter("Required Import Template Columns",Arrays.toString(ColumnHeaders),"PASS");
        
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
    
    private boolean DownloadImportTemplate()
    {
        SeleniumDriverInstance.pause(3000);
        if (!DownloadTemplate()){
            failedMessage = "Failed to Download Import Template";
            System.out.println("Error: Failed to Download Template");
            System.err.println("Error: Failed to Download Template");
            return false;
        }
        
        if (!ValidateTemplate()){
            failedMessage = "Failed to Validate Import Template";
            System.out.println("Error: Failed to Validate Template");
            System.err.println("Error: Failed to Validate Template");
            return false;
        }
        
        return true;
    }
    
    private boolean inspectFilename(String filenameParameter, String exportedFilename,String dateTimeStamp)
    {
        try{
            String[] fileName = exportedFilename.split("\\\\");
            String exportFile = fileName[4].substring(0,fileName[4].length());
             
            String dateFormated = dateTimeStamp.substring(6,8)+dateTimeStamp.substring(4,6);
//            
            //Append file name to date stamp
            String fileToValidate = filenameParameter+"_"+ dateTimeStamp.substring(0,4)+"_"+dateTimeStamp.substring(4,6)+"_"+dateTimeStamp.substring(6,8)
                     +"_"+dateTimeStamp.substring(8,10)+"_"+dateTimeStamp.substring(10,12);
             
            //Old filename
            //String fileToValidate = filenameParameter+"_"+ dateFormated;
             
             if (exportFile.contains(fileToValidate)) {
//               testData.extractParameter("Filename Inspected", "Exported Filename: "+exportFile
//                                                              + "\n\n\n\nGenerated Filename: "+fileToValidate, "PASS");
               testData.extractParameter("Filename Inspected", "Exported Filename: "+exportFile, "PASS"); 
            }
            else{
               testData.extractParameter("Filename Inspected", "Exported Filename: "+exportFile, "FAIL");  
            }
             
             
            return true;
        }catch(Exception e) {
            System.err.println("Failed to inspect file name - " + e.getMessage());
            failedMessage = "Failed to inspect file name";
            return false;
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
//                        SikuliDriverInstance.MouseClickElement(MixTeleImages.SaveImageFirefox());
//                        SikuliDriverInstance.PressKey(Key.ENTER);
//
//                        if(!SikuliDriverInstance.WaitSpecificTimeElementAppear(MixTeleImages.SaveImageFirefox(),10))
//                        {
//                            SeleniumDriverInstance.takeScreenShot("FailedToDownload", true);
//                            return false;
//                        }
//                        SeleniumDriverInstance.takeScreenShot("FileSaved", false);
//                        return true;
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
