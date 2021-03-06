/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Monitor.FleetAdmin;

import KeywordDrivenTestFramework.Core.BaseClass;
import KeywordDrivenTestFramework.Entities.Enums;
import KeywordDrivenTestFramework.Entities.TestEntity;
import KeywordDrivenTestFramework.Entities.TestResult;

/**
 *
 * @author MzuvukileN
 */
public class CreateNewAsset extends BaseClass {
    int counter = 1;
    String errorMsg;
    TestEntity testData;
    
    public CreateNewAsset(TestEntity testData){
        this.testData = testData;
    }
    
    public TestResult executeTest() throws InterruptedException {
        this.setStartTime();
        pause(1000);
        if(!ClickMonitor()){
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on Monitor Tab", false);
            counter++;
            narrator.failedMessage("Failed to click on Monitor Tab - "+errorMsg);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on Monitor Tab", this.getTotalExecutionTime());
        }
        pause(5000);
        if(!ClickAsset()){
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on assets Tab", false);
            counter++;
            narrator.failedMessage("Failed to click on assets Tab - "+errorMsg);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on assets Tab", this.getTotalExecutionTime());
        }
        pause(5000);
        if(!ClickAddButton()){
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on add button", false);
            counter++;
            narrator.failedMessage("Failed to click on add button - "+errorMsg);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on add button", this.getTotalExecutionTime());
        }
        pause(5000);
        if(!AddDetails()){
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to add details", false);
            counter++;
            narrator.failedMessage("Failed to add details - "+errorMsg);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to add details", this.getTotalExecutionTime());
        }
        pause(5000);
        if(!ClickSave()){
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on save button", false);
            counter++;
            narrator.failedMessage("Failed to click on save button - "+errorMsg);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on save button", this.getTotalExecutionTime());
        }
        pause(5000);
        return new TestResult(testData, Enums.ResultStatus.PASS, "Successfully added my first asset", this.getTotalExecutionTime());
    }
    
    public boolean ClickMonitor(){
        if(!SeleniumDriverInstance.clickElementByXpath("(//A[@href='#'])[1]")){
            errorMsg = "Could not click on monitor button.";
            return false;
        }
        SeleniumDriverInstance.takeScreenShot(counter + "- Clicked Monitor tab successfully -", false);
        counter++;
        return true;
    }
    
    public boolean ClickAsset(){
       if(!SeleniumDriverInstance.clickElementByXpath("//A[@ng-href='#/fleet-admin/assets'][text()='Assets']")){
            errorMsg = "Could not click on assets button.";
            return false;
        }
        SeleniumDriverInstance.takeScreenShot(counter + "- Clicked assets tab successfully -", false);
        counter++;
        return true; 
    }
    
    public boolean ClickAddButton(){
       if(!SeleniumDriverInstance.clickElementByXpath("//A[@fleet-tooltip='Add asset']")){
            errorMsg = "Could not click on add button.";
            return false;
        }
        SeleniumDriverInstance.takeScreenShot(counter + "- Clicked add button successfully -", false);
        counter++;
        return true; 
    }
    
    public boolean AddDetails(){
        if(!SeleniumDriverInstance.enterTextByXpath("(//INPUT[@type='text'])[1]", "Mzuvukile Ntwana")){
            errorMsg = "Could not add details";
            return false;
        }
        
        SeleniumDriverInstance.selectFromDropDownListUsingXpath("//select[@name = 'assetTypeId']", "Boat");
        
        SeleniumDriverInstance.enterTextByXpath("//INPUT[@ui-if='!duplicate']", "12345");
        
        SeleniumDriverInstance.selectFromDropDownListUsingXpath("//select[@name = 'siteId']", "Default Site");
                
        SeleniumDriverInstance.selectFromDropDownListUsingXpath("//select[@name = 'country']", "South Africa");
        
        SeleniumDriverInstance.enterTextByXpath("//INPUT[@ng-switch-when='true']", "6");
        
        SeleniumDriverInstance.takeScreenShot(counter + "- Added details successfully -", false);
        counter++;
        return true;
    }
    
    public boolean ClickSave(){
       if(!SeleniumDriverInstance.clickElementByXpath("//BUTTON[@class='btn-wide btn-small btn-success btn ng-scope ng-binding'][text()='Save']")){
            errorMsg = "Could not click on save button.";
            return false;
        }
        SeleniumDriverInstance.takeScreenShot(counter + "- Clicked save button successfully -", false);
        counter++;
        return true; 
    }
}
