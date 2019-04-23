/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.HistoricalTracking;

import KeywordDrivenTestFramework.Core.BaseClass;
import static KeywordDrivenTestFramework.Core.BaseClass.SeleniumDriverInstance;
import static KeywordDrivenTestFramework.Core.BaseClass.narrator;
import KeywordDrivenTestFramework.Entities.Enums;
import KeywordDrivenTestFramework.Entities.TestEntity;
import KeywordDrivenTestFramework.Entities.TestResult;

/**
 *
 * @author AnelisiweC
 */
public class HistoricalTracking12345 extends BaseClass {
    int counter= 1;
    String errorMsg;
    TestEntity testData;

 public HistoricalTracking12345 (TestEntity testData){
     this.testData = testData;
}
   

public TestResult executeTest() throws InterruptedException{
     this.setStartTime();
      pause(3000);
        if(!ClickMonitor()){
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on Monitor Tab", false);
            counter++;
            narrator.failedMessage("Failed to click on Monitor Tab - "+errorMsg);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on Monitor Tab", this.getTotalExecutionTime());
        }
        pause(3000);
        
         if(!HistoricalTracking()) {
            
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on Historical Tracking Tab", true);
            counter++;
            narrator.failedMessage("Failed to click on Historical Tracking Tab - "+errorMsg);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on Historical Tracking Tab", this.getTotalExecutionTime());
        }
         pause(3000);
         
         if(!ClickSearchIcon()) {
            
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on Click Search Icon", true);
            counter++;
            narrator.failedMessage("Failed to click on Click Search Icon - "+errorMsg);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on Click Search Icon", this.getTotalExecutionTime());
        }
         pause(3000);

         
    return new TestResult (testData, Enums.ResultStatus.PASS, "Successfully clicked to Historical Tracking tab", this.getTotalExecutionTime());
    }
  
  public boolean ClickMonitor(){
    
    if(!SeleniumDriverInstance.clickElementByXpath("(//A[@href='#'])[1]")){
        
       errorMsg = "could not click on monitor button";
        return false;
    }
   SeleniumDriverInstance.takeScreenShot(counter + "- Clicked Monitor tab successfully -", false);
   counter++;
    return true;
}
   public boolean HistoricalTracking(){
      
        if(!SeleniumDriverInstance.clickElementByXpath("//a[@href='#/tracking/historical-tracking']")) {
            errorMsg = "failed to click on Historical Tracking tab";
            return false;
        }
            SeleniumDriverInstance.takeScreenShot(counter+ "sucessfully cliked on Historical Tracking tab", false);
            counter++;
                  
            return true;
    }
   
   
   
    public boolean ClickSearchIcon(){
   if(!SeleniumDriverInstance.clickElementByXpath("//I[@class='icon-search icon-white']")) {
            errorMsg = "failed to click on Click Search Icon";
            return false;
    }
    pause(2000);
        if(!SeleniumDriverInstance.clickElementByXpath("(//a[@class ='ng-binding'])[72]")){
            return false;
        }
        pause(2000);
          if(!SeleniumDriverInstance.clickElementByXpath("(//INPUT[@type='radio'])[2]")){
            return false;
        }
          pause(2000);
          if(!SeleniumDriverInstance.EnterTextByXpath("//input[@id='LocationAutoAsset']", "Die Boord Test")){
            return false;
        }
          
            pause(2000);
          if(!SeleniumDriverInstance.clickElementByXpath("//li[@class='ui-menu-item']")){
            return false;
        }
          
              pause(2000);
          if(!SeleniumDriverInstance.waitForElementByXpath("//img[@src='img/map-icon-drag-pin.png']")){
            return false;
        }
       pause(2000);
    SeleniumDriverInstance.takeScreenShot(counter + "- Clicked add button tab successfully -", false);
    counter++;
    return true;
    
    }

}  