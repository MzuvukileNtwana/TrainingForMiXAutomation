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
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author MsimeleloG
 */
public class CheckDiagnosticWindowLoadInfo extends BaseClass {
    
    int counter = 1;
    String errorMsg;
    TestEntity testData;
  //  WebDriver driver = new ChromeDriver();
    String defaultWindow;
    String popUpWindow;
    
    public CheckDiagnosticWindowLoadInfo(TestEntity testData) {
        
        this.testData = testData;
    }
    public TestResult executeTest() throws InterruptedException {
        
        this.setStartTime();
        
        if(!navigateToMonitorTab()) {
            
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on Monitor Tab", true);
            counter++;
            narrator.failedMessage("Failed to click on Monitor Tab - "+errorMsg);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on Monitor Tab", this.getTotalExecutionTime());
        }
        
        if(!navigateToAssetsTab()) {
            
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on Assets", true);
            counter++;
            narrator.failedMessage("Failed to click on Assets - "+errorMsg);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on Assets", this.getTotalExecutionTime());
        }
        
        if(!isFilterClicked()) {
            
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on the filter", true);
            counter++;
            narrator.failedMessage("Failed to click on the filter - "+errorMsg);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on the filter", this.getTotalExecutionTime());
        }
        
        if(!addTextToFilter("MiX Automation Live Unit")) {
            
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to add text to filter", true);
            counter++;
            narrator.failedMessage("Failed to add text to filter - "+errorMsg);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to add text to filter", this.getTotalExecutionTime());

        }
        
        if(!clickOnSearchButton()) {
            
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click search button", true);
            counter++;
            narrator.failedMessage("Failed to click search button - "+errorMsg);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click search button", this.getTotalExecutionTime());
        }
        
        if(!clickOnDiagnosticsnLink()) {
            
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click diagnostics button", true);
            counter++;
            narrator.failedMessage("Failed to click diagnostics button - "+errorMsg);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click diagnostics button", this.getTotalExecutionTime());
        }
        
        if(!clickGeneralStatusBar()) {
            
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click General Status Bar", true);
            counter++;
            narrator.failedMessage("Failed to click General Status Bar - "+errorMsg);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click General Status Bar", this.getTotalExecutionTime());
        }
        pause(2000);
        if(!verifyDriverField("MiX Driver")) {
            
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to verify driver field ", true);
            counter++;
            narrator.failedMessage("Failed to verify driver field - "+errorMsg);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to verify driver field", this.getTotalExecutionTime());
        }
          pause(2000);
        if(!verifyGPRSContextValue("+CGDCONT=1")) {
            
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to verify GPRS context field ", true);
            counter++;
            narrator.failedMessage("Failed to verify GPRS context field - "+errorMsg);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to verify GPRS context field", this.getTotalExecutionTime());
        }
        pause(1000);
        
        if(!clickGeneralStatusBar()) {
            
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click General Status Bar", true);
            counter++;
            narrator.failedMessage("Failed to click General Status Bar - "+errorMsg);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click General Status Bar", this.getTotalExecutionTime());
        }
        
        if(!clickLatestPositionInfoBar()) {
            
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click Latest Position Information Bar", true);
            counter++;
            narrator.failedMessage("Failed to click Latest Position Information Bar - "+errorMsg);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click Latest Position Information Bar", this.getTotalExecutionTime());
        }
        
        if(!verifyGPSVelocityLabel("GPS")) {
            
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to verify GPS label ", true);
            counter++;
            narrator.failedMessage("Failed to verify GPS label - "+errorMsg);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to verify GPS label", this.getTotalExecutionTime());
        }
        pause(1000);
        if(!verifyHDOPLabel("HDOP")) {
            
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to verify HDOP label ", true);
            counter++;
            narrator.failedMessage("Failed to verify HDOP label - "+errorMsg);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to verify HDOP label", this.getTotalExecutionTime());
        }
        
        return new TestResult(testData, Enums.ResultStatus.PASS, "Successfully Check that Diagnostics window load with info.", this.getTotalExecutionTime());
    }
    
    public boolean navigateToMonitorTab() {
        
        if(!SeleniumDriverInstance.waitForElementByXpath("(//A[@href='#'])[1]")) {
            
            errorMsg = "Failed to click on Monitor Tab";
            return false;
        }
        SeleniumDriverInstance.clickElementByXpath("(//A[@href='#'])[1]");
        SeleniumDriverInstance.takeScreenShot(counter + "- Clicked Monitor tab successfully -", false);
        counter++;
        return true;
    }
    
    public boolean navigateToAssetsTab() {
        
        if(!SeleniumDriverInstance.waitForElementByXpath("//A[@ng-href='#/fleet-admin/assets'][text()='Assets']")) {
            
            errorMsg = "Failed to click on Assets";
            return false;
        }
        SeleniumDriverInstance.clickElementByXpath("//A[@ng-href='#/fleet-admin/assets'][text()='Assets']");
        SeleniumDriverInstance.takeScreenShot(counter + "- Clicked Asset Tab successfully -", false);
        counter++;
        return true;
    }
    
    public boolean isFilterClicked() {
        if(!SeleniumDriverInstance.waitForElementByXpath("(//INPUT[@type='text'])[1]")) {
            
            errorMsg = "Failed to click on the filter";
            return false;
        }
        SeleniumDriverInstance.clickElementByXpath("(//INPUT[@type='text'])[1]");
        SeleniumDriverInstance.takeScreenShot(counter + "-Successfully clicked on the filter -", false);
        counter++;
        return true;
    }
    
    public boolean addTextToFilter(String textToEnter) {
        if(!SeleniumDriverInstance.waitForElementByXpath("(//INPUT[@type='text'])[1]")) {
            
            errorMsg = "Failed to add text to filter";
            return false;
        }
        
        SeleniumDriverInstance.EnterTextByXpath("(//INPUT[@type='text'])[1]", textToEnter);
        SeleniumDriverInstance.takeScreenShot(counter + "- Text addded successfully -", false);
        counter++;
        return true;
    }
    
    public boolean clickOnSearchButton() {
        if(!SeleniumDriverInstance.waitForElementByXpath("(//I[@class='icon-search'])[1]")) {
            
            errorMsg = "Failed to click on search button";
            return false;
        }
        SeleniumDriverInstance.clickElementByXpath("(//I[@class='icon-search'])[1]");
        SeleniumDriverInstance.takeScreenShot(counter + "- Clicked on search button successfully -", false);
        counter++;
        return true;
    }
    
    public boolean clickOnDiagnosticsnLink() throws InterruptedException {
        if(!SeleniumDriverInstance.waitForElementByXpath("//A[@class='row-action']")) {
            
            errorMsg = "Failed to click on dropdown link";
            return false;
        }
        
        SeleniumDriverInstance.clickElementByXpath("//A[@class='row-action']");       
        SeleniumDriverInstance.clickElementByXpath("//body/ul[@class= 'dropdown-menu grid-row-action-dropdown-menu'][contains(@style,'display: block')]/li/a[@event='Diagnostics']");
        Set<String> windowHandler = SeleniumDriverInstance.Driver.getWindowHandles(); // gets all instances of windows currently open on the test
        defaultWindow = (String) windowHandler.toArray()[0];
        popUpWindow = (String) windowHandler.toArray()[1];
        
        SeleniumDriverInstance.Driver.switchTo().window(popUpWindow);
        SeleniumDriverInstance.showBrowserWindow();
        SeleniumDriverInstance.Driver.manage().window().maximize();
        SeleniumDriverInstance.takeScreenShot(counter + "- clicked diagnostics and showed pop window successfully -", false);
        counter++;
        return true;
    }
    
    public boolean clickGeneralStatusBar() {
        
        if(!SeleniumDriverInstance.waitForElementByXpath("(//A[@class='accordion-btn-toggle'])[3]")) {
            
            errorMsg = "Failed to click on General Status bar";
            return false;
        }
        
        SeleniumDriverInstance.clickElementByXpath("(//A[@class='accordion-btn-toggle'])[3]");
        SeleniumDriverInstance.takeScreenShot(counter + "- Successfully clicked General Status Tab -", false);
        counter++;
        return true;
    }
    
    public boolean verifyDriverField(String textToCompare) {
        
        if(!SeleniumDriverInstance.waitForElementByXpath("//TD[@class='ng-binding'][text()='MiX DriverJM']")) {
            
            errorMsg = "Failed to find the required field";
            return false;
        }
        
        String extractedValue = SeleniumDriverInstance.retrieveTextByXpath("//TD[@class='ng-binding'][text()='MiX DriverJM']");
        System.out.println(extractedValue);
        if(!extractedValue.contains(textToCompare)) {
            
            errorMsg = "Driver value does not match with pre-described one";
            testData.extractParameter("Driver: ", extractedValue, "FAIL");
            SeleniumDriverInstance.takeScreenShot(counter + "- Driver value is not the same -", false);
            counter++;
            return false;
        }
        
        testData.extractParameter("Driver: ", extractedValue, "PASS");
        SeleniumDriverInstance.takeScreenShot(counter + "- Driver value matches the pre-described one -", false);
        counter++;
        return true;
    }
    
    public boolean verifyGPRSContextValue(String textToCompare) {
        
        if(!SeleniumDriverInstance.waitForElementByXpath("(//TD[@class='ng-binding'])[28]")) {
            
            errorMsg = "Failed to find the GPRS context field";
            return false;
        }
        String extractedValue = SeleniumDriverInstance.retrieveTextByXpath("(//TD[@class='ng-binding'])[28]");
        System.out.println(extractedValue);
        if(extractedValue.contains(textToCompare)) {
            
            testData.extractParameter("GPRS context: ", extractedValue, "PASS");
            SeleniumDriverInstance.takeScreenShot(counter + "- GPRS context value is the same -", true);
            counter++;
            return true;
        }
        
        else
        {
            errorMsg = "GPRS context value does not match with pre-described one";
            testData.extractParameter("GPRS context: ", extractedValue, "FAIL");
            SeleniumDriverInstance.takeScreenShot(counter + "- GPRS context value is not the same -", false);
            counter++;
            return false;
        }
//        SeleniumDriverInstance.takeScreenShot(counter + "- GPRS context value matches the pre-described one -", false);
//        counter++;
//        return true;
    }
    
    public boolean clickLatestPositionInfoBar() {
        
        if(!SeleniumDriverInstance.waitForElementByXpath("(//A[@class='accordion-btn-toggle'])[10]")) {
            
            errorMsg = "Failed to click on Latest Position Information bar";
            return false;
        }
        
        SeleniumDriverInstance.clickElementByXpath("(//A[@class='accordion-btn-toggle'])[10]");
        pause(1000);
        SeleniumDriverInstance.takeScreenShot(counter + "- Latest Position Information bar clicked successfully -", false);
        counter++;
        return true;
    }
    
    public boolean verifyGPSVelocityLabel(String textToCompare) {
        
        if(!SeleniumDriverInstance.waitForElementByXpath("(//TD)[217]")) {
            
            errorMsg = "Failed to find the GPS Velocity label";
            return false;
        }
        
        String extractedValue = SeleniumDriverInstance.retrieveTextByXpath("(//TD)[217]");
        System.out.println(extractedValue);
        if(!extractedValue.contains(textToCompare)) {
            
            errorMsg = "GPS velocity label is present";
            testData.extractParameter("GPS velocity label : ", extractedValue, "FAIL");
            SeleniumDriverInstance.takeScreenShot(counter + "- GPS velocity label is not presented -", false);
            counter++;
            return false;
        }
        
        testData.extractParameter("GPS velocity: ", extractedValue, "PASS");
        SeleniumDriverInstance.takeScreenShot(counter + "- GPS velocity label is presented -", false);
        counter++;
        return true;
    }
   
    public boolean verifyHDOPLabel(String textToCompare) {
        
        if(!SeleniumDriverInstance.waitForElementByXpath("(//TD)[225]")) {
            
            errorMsg = "Failed to find HDOP label";
            return false;
        }
        
        String extractedValue = SeleniumDriverInstance.retrieveTextByXpath("(//TD)[225]");
        System.out.println(extractedValue);
        if(extractedValue.contains(textToCompare)) {
            
            testData.extractParameter("HDOP Label : ", extractedValue, "PASS");
            SeleniumDriverInstance.takeScreenShot(counter + "- HDOP label is on the page -", true);
            counter++;
            return true;
            
        }
        else {
            
            errorMsg = "HDOP label is present";
            testData.extractParameter("HDOP label : ", extractedValue, "FAIL");
            SeleniumDriverInstance.takeScreenShot(counter + "- HDOP label is not presented -", false);
            counter++;
            return false;
        }
        
        //SeleniumDriverInstance.takeScreenShot(counter + "- HDOP label is presented -", false);
        //counter++;
        //return true;        
    }
    
    
}
