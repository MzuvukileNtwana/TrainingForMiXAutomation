/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Monitor.FleetAdmin.Assets;

import KeywordDrivenTestFramework.Core.BaseClass;
import static KeywordDrivenTestFramework.Core.BaseClass.SeleniumDriverInstance;
import static KeywordDrivenTestFramework.Core.BaseClass.narrator;
import KeywordDrivenTestFramework.Entities.Enums;
import KeywordDrivenTestFramework.Entities.TestEntity;
import KeywordDrivenTestFramework.Entities.TestResult;
import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.LineNumberReader;
import java.util.Arrays;
import org.apache.commons.io.comparator.LastModifiedFileComparator;
import org.apache.commons.io.filefilter.WildcardFileFilter;

/**
 *
 * @author MsimeleloG
 */
public class ExportDiagnosticsInformation extends BaseClass{
    
    int counter = 1;
    String errorMsg = "";
    TestEntity testData;
    String defaultWindow;
    String popUpWindow;
    CheckDiagnosticWindowLoadInfo checkDiagnosticWindowNav;
    File getNewFile;
    String getFileSize;
    LineNumberReader textFileReader;
    
    public ExportDiagnosticsInformation (TestEntity testData) {
        
        this.testData = testData;
        checkDiagnosticWindowNav = new CheckDiagnosticWindowLoadInfo(testData);
    }
    
    public TestResult executeTest() throws InterruptedException {
        
        this.setStartTime();
        
        if(!checkDiagnosticWindowNav.navigateToMonitorTab()) {
            
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on Monitor Tab", true);
            counter++;
            narrator.failedMessage("Failed to click on Monitor Tab - "+errorMsg);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on Monitor Tab", this.getTotalExecutionTime());
        }
        
        if(!checkDiagnosticWindowNav.navigateToAssetsTab()) {
            
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on Assets", true);
            counter++;
            narrator.failedMessage("Failed to click on Assets - "+errorMsg);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on Assets", this.getTotalExecutionTime());
        }
        
        if(!checkDiagnosticWindowNav.isFilterClicked()) {
            
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on the filter", true);
            counter++;
            narrator.failedMessage("Failed to click on the filter - "+errorMsg);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on the filter", this.getTotalExecutionTime());
        }
        
        if(!checkDiagnosticWindowNav.addTextToFilter("MiX Automation Live Unit")) {
            
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to add text to filter", true);
            counter++;
            narrator.failedMessage("Failed to add text to filter - "+errorMsg);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to add text to filter", this.getTotalExecutionTime());
        }
        
        if(!checkDiagnosticWindowNav.clickOnSearchButton()) {
            
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click search button", true);
            counter++;
            narrator.failedMessage("Failed to click search button - "+errorMsg);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click search button", this.getTotalExecutionTime());
        }
        
        if(!checkDiagnosticWindowNav.clickOnDiagnosticsnLink()) {
            
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click diagnostics button", true);
            counter++;
            narrator.failedMessage("Failed to click diagnostics button - "+errorMsg);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click diagnostics button", this.getTotalExecutionTime());
        }
        pause(2000);
        if(!clickExportButton()) {
            
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click export button", true);
            counter++;
            narrator.failedMessage("Failed to click export button - "+errorMsg);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click export button", this.getTotalExecutionTime());
        }
        
        return new TestResult(testData, Enums.ResultStatus.PASS, "Successfully exported diagnostic information.", this.getTotalExecutionTime());
    }
    
    
    private File getNewestFileName(String ext) {
        
        String file = new File("C:/Users/" + System.getProperty("user.name") + "/Downloads/").toString();

        File theNewestFile = null;
        File dir = new File(file);
        FileFilter fileFilter = new WildcardFileFilter("*." + ext);
        File[] files = dir.listFiles(fileFilter);

        if (files.length > 0)
        {
            /**
             * The newest file comes first *
             */
            Arrays.sort(files, LastModifiedFileComparator.LASTMODIFIED_REVERSE);
            theNewestFile = files[0];
        }
        return theNewestFile;
    }
    
    
    public boolean clickExportButton() {
        
        if(!SeleniumDriverInstance.waitForElementByXpath("//A[@ng-show='(hasStatusInfo || unitDetails) && !showMix4KDiagnosticsInfo']")) {
            
            errorMsg = "Failed to click export button";
            return false;
        }
        
        SeleniumDriverInstance.clickElementByXpath("//A[@ng-show='(hasStatusInfo || unitDetails) && !showMix4KDiagnosticsInfo']");
        
        pause(30000);
        getNewFile = getNewestFileName("txt");
        getFileSize = (double) getNewFile.length() / 1024 + " kb";
        System.out.println(getNewFile);
        System.out.println(getNewFile.getAbsolutePath().indexOf("Diagnostics"));
        System.out.println(getFileSize);
        //textFileReader = new LineNumberReader(new FileReader(getNewFile));
        if(getNewFile == null) {
            
            errorMsg = "Failed to get the name of the downloaded file";
            testData.extractParameter("Extracted Data", "No such file exists", "Fail");
            return false;
        }
        if(!getNewFile.toString().contains("Diagnostics_MiX Automation Live Unit")) {
            
            errorMsg = "Failed to get the downloaded file";
            testData.extractParameter("Extracted Value", getNewFile.getAbsolutePath() + ".txt file with older name already exists", "Fail");
        }
        
        testData.extractParameter("Extracted Data", getNewFile.getAbsolutePath().substring(30) + " ", "Pass");
        testData.extractParameter("Extracted File Size", getFileSize, "PASS");
        /*
        String dirName = "C:\\Users\\MsimeleloG\\Downloads";
        File dir = new File(dirName);
        File[] fileName = dir.listFiles();
        
        
        System.out.println(fileName[0].getName());
        
        if(fileName[0].exists()) {
            
            double bytes = fileName[0].length();
            System.out.println("bytes : " + bytes);
			
        }
        else {
            
            System.out.println("File does not exist");
        }
        
        */
        SeleniumDriverInstance.takeScreenShot(counter + "- Clicked export button successfully - ", false);
        counter++;
        return true;
    }
    
    
    
    
    
}
