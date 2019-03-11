/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Monitor.FleetAdmin.Assets;

import KeywordDrivenTestFramework.Core.BaseClass;
import KeywordDrivenTestFramework.Entities.Enums;
import KeywordDrivenTestFramework.Entities.TestEntity;
import KeywordDrivenTestFramework.Entities.TestResult;

/**
 *
 * @author NandiphaM
 */
public class CreateNewAsset2 extends BaseClass
{
 int counter= 1;
 String errorMessage;
 TestEntity testData;

 public CreateNewAsset2 (TestEntity testData){
     this.testData = testData;
     
             
 }
 public TestResult executeTest() throws InterruptedException{
     this.setStartTime();
      pause(1000);
        if(!ClickMonitor()){
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on Monitor Tab", false);
            counter++;
            narrator.failedMessage("Failed to click on Monitor Tab - "+errorMessage);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on Monitor Tab", this.getTotalExecutionTime());
        }
         pause(5000);
        if(!ClickAsset()){
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on assets Tab", false);
            counter++;
            narrator.failedMessage("Failed to click on assets Tab - "+errorMessage);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on assets Tab", this.getTotalExecutionTime());
        }
         pause(5000);
        if(!ClickAddButton()){
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on add button", false);
            counter++;
            narrator.failedMessage("Failed to click on add button - "+errorMessage);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on add button", this.getTotalExecutionTime());
        }
         pause(5000);
        if(!AddDetails()){
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to add details", false);
            counter++;
            narrator.failedMessage("Failed to add details - "+errorMessage);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to add details", this.getTotalExecutionTime());
        }
         pause(5000);
        if(!ClickSave()){
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on save button", false);
            counter++;
            narrator.failedMessage("Failed to click on save button - "+errorMessage);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on save button", this.getTotalExecutionTime());
        }

     return new TestResult (testData,Enums.ResultStatus.PASS, "successfully Added my first asset", this.getTotalExecutionTime());
 }

public boolean ClickMonitor(){
    
    if(!SeleniumDriverInstance.clickElementByXpath("(//A[@href='#'])[1]")){
        
       errorMessage = "could not click on monitor button";
        return false;
    }
   SeleniumDriverInstance.takeScreenShot(counter + "- Clicked Monitor tab successfully -", false);
   counter++;
    return true;
}
   
public boolean ClickAsset(){
   if(!SeleniumDriverInstance.clickElementByXpath("//A[@ng-href='#/fleet-admin/assets'][text()='Assets']")){
       errorMessage = "could not click on asset button";
        return false;
    }
   SeleniumDriverInstance.takeScreenShot(counter + "- Clicked asset tab successfully -", false);
   counter++;
    return true;
}

public boolean ClickAddButton(){
   if(!SeleniumDriverInstance.clickElementByXpath("//I[@class='icon-plus icon-white']")){
       errorMessage = "could not click on add button";
        return false;
    }
   SeleniumDriverInstance.takeScreenShot(counter + "- Clicked add button tab successfully -", false);
   counter++;
    return true;
}

public boolean AddDetails(){
   
    
    if(!SeleniumDriverInstance.enterTextByXpath("(//INPUT[@type='text'])[1]", "Nandipha Makhanya")){
       errorMessage = "could not on add details";
        return false;
    }
    SeleniumDriverInstance.selectFromDropDownListUsingXpath("//select[@name='assetTypeId']", "Boat");
   SeleniumDriverInstance.takeScreenShot(counter + "-  added details successfully -", false);
   SeleniumDriverInstance.enterTextByXpath("//INPUT[@ui-if='!duplicate']", "12342");
   
   SeleniumDriverInstance.selectFromDropDownListUsingXpath("//select[@name='siteId']", "Default site");
   SeleniumDriverInstance.selectFromDropDownListUsingXpath("//select[@name='country']", "South Africa");
   SeleniumDriverInstance.enterTextByXpath("//INPUT[@ng-switch-when='true']", "2");
    return true;
}
public boolean ClickSave(){
   if(!SeleniumDriverInstance.clickElementByXpath("//BUTTON[@class='btn-wide btn-small btn-success btn ng-scope ng-binding'][text()='Save']")){
       errorMessage = "could not click on add button";
        return false;
    }
   SeleniumDriverInstance.takeScreenShot(counter + "- Clicked add button tab successfully -", false);
   counter++;
    return true;
}
}


