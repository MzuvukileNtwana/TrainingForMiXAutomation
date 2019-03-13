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
 * @author AnelisiweC
 */
public class CreateNewAsset1 extends BaseClass{
    
    int counter = 1;
    String errorMsg;
    TestEntity testData;
    
    
    public CreateNewAsset1(TestEntity testData){
            
        this.testData = testData;
    }
    
    public TestResult executeTest() throws InterruptedException{
        
        this.setStartTime();
        if(!ClickMonitor()) {
            
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on Monitor Tab", true);
            counter++;
            narrator.failedMessage("Failed to click on Monitor Tab - "+errorMsg);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on Monitor Tab", this.getTotalExecutionTime());
        }
        if(!ClickAsset()) {
            
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on assets Tab", true);
            counter++;
            narrator.failedMessage("Failed to click on assets Tab - "+errorMsg);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on assets Tab", this.getTotalExecutionTime());
        }
        
        
        if(!AddButton()) {
            
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on add button", true);
            counter++;
            narrator.failedMessage("Failed to click on add button - "+errorMsg);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on add button", this.getTotalExecutionTime());
        }
        if(!AddDetails()) {
            
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to add details", true);
            counter++;
            narrator.failedMessage("Failed to add details - "+errorMsg);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to add deatails", this.getTotalExecutionTime());
        }
        if(!ClickSave()) {
            
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on save button", true);
            counter++;
            narrator.failedMessage("Failed to click on save button - "+errorMsg);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on save button", this.getTotalExecutionTime());
        }
        
        return new TestResult (testData, Enums.ResultStatus.PASS, "Successfully added my first asset", this.getTotalExecutionTime());
    }
    
    public boolean ClickMonitor(){
      
        if(!SeleniumDriverInstance.clickElementByXpath("(//A[@href='#'])[1]")) {
            errorMsg = "failed to click on monitor tab";
            return false;
        }
            SeleniumDriverInstance.takeScreenShot(counter+ "sucessfully cliked on monitor tab", false);
            counter++;
                  
            return true;
    }
        
     public boolean ClickAsset(){
         
        
            if(!SeleniumDriverInstance.clickElementByXpath("//A[@ng-href='#/fleet-admin/assets'][text()='Assets']")) {
            errorMsg = "failed to click on assets tab";
            return false;
        }
            SeleniumDriverInstance.takeScreenShot(counter+ "sucessfully cliked on assets tab", false);
            counter++;
                  
            return true;
    }
     
     public boolean AddButton(){
         
        
            if(!SeleniumDriverInstance.clickElementByXpath("//A[@fleet-tooltip='Add asset']")) {
            errorMsg = "failed to click on add button";
            return false;
        }
            SeleniumDriverInstance.takeScreenShot(counter+ "sucessfully cliked on add button", false);
            counter++;
                  
            return true;
    }
     
      public boolean AddDetails(){
         
        
        if(!SeleniumDriverInstance.enterTextByXpath("(//INPUT[@type='text'])[1]", "Anelisiwe")) {
            errorMsg = "failed to enter the description";
            return false;
        }
        pause(5000);
        
         if(!SeleniumDriverInstance.enterTextByXpath("//INPUT[@ui-if='!duplicate']", "123451")) {
            errorMsg = "failed to enter the regtration number";
            return false;
        }
         pause(5000);
          if(!SeleniumDriverInstance.enterTextByXpath("//INPUT[@ng-switch-when='true']", "1")) {
            errorMsg = "failed to enter the fleet number";
            return false;
        }
          pause(5000);
          
        if(!SeleniumDriverInstance.selectFromDropDownListUsingXpath("//select[@name = \"assetTypeId\"]", "Boat")) {
            errorMsg = "failed to select asset type";
            return false;
        }
        pause(5000);
        if(!SeleniumDriverInstance.selectFromDropDownListUsingXpath("//select[@name = \"siteId\"]", "Default Site")) {
            errorMsg = "failed to select site";
            return false;
        }
        pause(5000);
        if(!SeleniumDriverInstance.selectFromDropDownListUsingXpath("//select[@name = \"country\"]", "South Africa")) {
            errorMsg = "failed to select country";
            return false;
            
        }
             
        SeleniumDriverInstance.takeScreenShot(counter+ "sucessfully enter aseets details", false);
        counter++;
                  
        return true;
    }
      
      
       public boolean ClickSave(){
         
        
        if(!SeleniumDriverInstance.clickElementByXpath("//BUTTON[@class='btn-wide btn-small btn-success btn ng-scope ng-binding'][text()='Save']")) {
            errorMsg = "failed to click on save button";
            return false;
        }
            SeleniumDriverInstance.takeScreenShot(counter+ " sucessfully cliked on save button", false);
            counter++;
                  
            return true;
    }
     
     }
     


