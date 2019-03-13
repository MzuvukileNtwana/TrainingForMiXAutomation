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
 * @author AlungileN
 */
public class CreateNewAsset3 extends BaseClass {
    
    int counter =1;
    String errorMessage = "";
    TestEntity testData;
    
    
    public CreateNewAsset3(TestEntity testData){
        
        this.testData = testData;
    }
    
   public TestResult executeTest() throws InterruptedException{       
      this.setStartTime();
      pause(3000);
        if(!ClickMonitor()){
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on Monitor Tab", false);
            counter++;
            narrator.failedMessage("Failed to click on Monitor Tab - "+errorMessage);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on Monitor Tab", this.getTotalExecutionTime());
        }
        pause(3000);
        if(!ClickAsset()){
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on assets Tab", false);
            counter++;
            narrator.failedMessage("Failed to click on assets Tab - "+errorMessage);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on assets Tab", this.getTotalExecutionTime());
        }
        pause(3000);
        if(!AddAsset()){
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on add button", false);
            counter++;
            narrator.failedMessage("Failed to click on add button - "+errorMessage);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on add button", this.getTotalExecutionTime());
        }
        pause(3000);
        if(!AddDetails()){
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to add details", false);
            counter++;
            narrator.failedMessage("Failed to add details - "+errorMessage);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to add details", this.getTotalExecutionTime());
        }
        pause(3000);
        if(!Save()){
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on save button", false);
            counter++;
            narrator.failedMessage("Failed to click on save button - "+errorMessage);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on save button", this.getTotalExecutionTime());
        }
      return new TestResult (testData,Enums.ResultStatus.PASS, "successfully added my first except", this.getTotalExecutionTime());
   }     
   public boolean ClickMonitor(){
       
       if(!SeleniumDriverInstance.clickElementByXpath("(//A[@href='#'])[1]")){
           errorMessage = "Could not click on Monitor button";
           
           return false;
       } 
       SeleniumDriverInstance.takeScreenShot(counter + "- clicked monitor tab successfully", false);
       counter++;
       return true;
      
   
   } 
   public boolean ClickAsset () {
       if(!SeleniumDriverInstance.clickElementByXpath("//A[@ng-href='#/fleet-admin/assets'][text()='Assets']")){
           errorMessage = "Could not click on asset button";
           
           return false;
       } 
       SeleniumDriverInstance.takeScreenShot(counter + "- clicked asset tab successfully", false);
       counter++;
       return true;
   }
    public boolean AddAsset () {
      
      if(!SeleniumDriverInstance.clickElementByXpath("//I[@class='icon-plus icon-white']")){
           errorMessage = "Could not click on add asset button";
           
           return false;
       } 
       SeleniumDriverInstance.takeScreenShot(counter + "- clicked add asset button successfully", false);
       counter++;
       return true;
    
    }
    public boolean AddDetails () {
      if(!SeleniumDriverInstance.enterTextByXpath("(//INPUT[@type='text'])[1]", "Alungile Ndlendle")){
           errorMessage = "Could not add details";
           
           return false;
       } 
       SeleniumDriverInstance.selectFromDropDownListUsingXpath("//select[@name = 'assetTypeId']", "Boat");
       SeleniumDriverInstance.enterTextByXpath("//INPUT[@ui-if='!duplicate']", "123453");
       SeleniumDriverInstance.selectFromDropDownListUsingXpath("//select[@name = 'siteId']", "Default Site");
       SeleniumDriverInstance.selectFromDropDownListUsingXpath("//select[@name = 'country']", "South Africa");
       SeleniumDriverInstance.enterTextByXpath("//INPUT[@ng-switch-when='true']", "3");
       SeleniumDriverInstance.takeScreenShot(counter + "- add successfully", false);
       
       return true;  
    }
    public boolean Save() {
      
      if(!SeleniumDriverInstance.clickElementByXpath("//BUTTON[@class='btn-wide btn-small btn-success btn ng-scope ng-binding'][text()='Save']")){
           errorMessage = "Could not click on the save button";
           
           return false;
       } 
       SeleniumDriverInstance.takeScreenShot(counter + "- clicked save button successfully", false);
       counter++;
       return true;
    }
}
