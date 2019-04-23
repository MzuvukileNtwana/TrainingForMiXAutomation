/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.LiveTracking;

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
public class LiveTracking12345 extends BaseClass {
     int counter= 1;
 String errorMessage;
 TestEntity testData;

 public LiveTracking12345 (TestEntity testData){
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
         if(!LiveTracking()){
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on Monitor Tab", false);
            counter++;
            narrator.failedMessage("Failed to click on Monitor Tab - "+errorMessage);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on Monitor Tab", this.getTotalExecutionTime());
        }
         
              pause(3000);
            if(!CheckedAssets()){
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on Monitor Tab", false);
            counter++;
            narrator.failedMessage("Failed to click on Monitor Tab - "+errorMessage);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on Monitor Tab", this.getTotalExecutionTime());
        }
            
            pause(3000);
         if(!LiveTrackingCheck()){
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on Monitor Tab", false);
            counter++;
            narrator.failedMessage("Failed to click on Monitor Tab - "+errorMessage);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on Monitor Tab", this.getTotalExecutionTime());
        }
         
          pause(3000);
         if(!LiveTrackingAsset()){
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on Monitor Tab", false);
            counter++;
            narrator.failedMessage("Failed to click on Monitor Tab - "+errorMessage);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on Monitor Tab", this.getTotalExecutionTime());
        }
         
         pause(3000);
            if(!CarAsset()){
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on Monitor Tab", false);
            counter++;
            narrator.failedMessage("Failed to click on Monitor Tab - "+errorMessage);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on Monitor Tab", this.getTotalExecutionTime());
        }
            
            pause(3000);
            if(!RetrieveAsset()){
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on Monitor Tab", false);
            counter++;
            narrator.failedMessage("Failed to click on Monitor Tab - "+errorMessage);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on Monitor Tab", this.getTotalExecutionTime());
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
public boolean LiveTracking(){
    
    if(!SeleniumDriverInstance.clickElementByXpath("(//a[@class='ng-binding'])[28]")){
        
       errorMessage = "could not click on a LiveTracking";
        return false;
    }
   SeleniumDriverInstance.takeScreenShot(counter + "- Clicked LiveTracking successfully -", false);
   counter++;
    return true;
}

public boolean CheckedAssets(){
    
    SeleniumDriverInstance.clickElementByXpath("(//INPUT[@type='checkbox'])[3]");
     pause(3000);
      SeleniumDriverInstance.enterTextByXpath("(//INPUT[@type='text'])[2]","MiX Automation Live Unit");
      pause(3000);
     SeleniumDriverInstance.isCheckBoxSelected("(//INPUT[@type='checkbox'])[3]");
      pause(3000);
    SeleniumDriverInstance.clickElementByXpath("(//INPUT[@type='checkbox'])[3]");
    SeleniumDriverInstance.takeScreenShot(counter + "- Clicked LiveTrackingCheck successfully -", false);
   counter++;
    return true;
}
public boolean LiveTrackingCheck(){
    
    if(!SeleniumDriverInstance.clickElementByXpath("(//A[@fleet-tooltip='Actions'])[2]")){
        
       errorMessage = "could not click on a LiveTrackingCheck";
        return false;
    }
   SeleniumDriverInstance.takeScreenShot(counter + "- Clicked LiveTrackingCheck successfully -", false);
   counter++;
    return true;
}

public boolean LiveTrackingAsset(){
    
    if(!SeleniumDriverInstance.clickElementByXpath("//a//span[text()='Go to asset']")){
        
       errorMessage = "could not click on a LiveTrackingCheck";
        return false;
    }
   SeleniumDriverInstance.takeScreenShot(counter + "- Clicked LiveTrackingCheck successfully -", false);
   counter++;
    return true;
}
public boolean CarAsset(){
    
    if(!SeleniumDriverInstance.clickElementByXpath("//div[@class='leaflet-zoom-animated leaflet-marker-icon']")){
        
       errorMessage = "could not click on a LiveTrackingCheck";
        return false;
    }
   SeleniumDriverInstance.takeScreenShot(counter + "- Clicked LiveTrackingCheck successfully -", false);
   counter++;
    return true;
}

public boolean RetrieveAsset(){
    /**testData.extractParameter("Site "+(c-1)+"(config)", "	Default Site" +  "<br>"{
       errorMessage = "could not click on a LiveTrackingCheck";
        return false;
    }*/
    String data = SeleniumDriverInstance.retrieveTextByXpath("(//TD[@class=''])[1]");
    testData.extractParameter("Extracted Data \t:\t" + data, "	Default Site", "Pass"); 
    String data1 = SeleniumDriverInstance.retrieveTextByXpath("//SPAN[@class='ng-binding'][text()='Identified driver']");
    testData.extractParameter("Extracted Data \t:\t" + data1, "	MiX Driver", "Pass");
     String data2 = SeleniumDriverInstance.retrieveTextByXpath("(//SPAN[@class='ng-binding'][text()='Location'][text()='Location'])[1]");
    testData.extractParameter("Extracted Data \t:\t" + data2, "z. MiX", "Pass");
     String data3 = SeleniumDriverInstance.retrieveTextByXpath("(//SPAN[@class='ng-binding'][text()='GPS Coordinates'][text()='GPS Coordinates'])[1]");
    testData.extractParameter("Extracted Data \t:\t" + data3, "	-33.9697495,18.7865009", "Pass");
     String data4 = SeleniumDriverInstance.retrieveTextByXpath("//SPAN[@class='ng-binding'][text()='Heading']");
    testData.extractParameter("Extracted Data \t:\t" + data4, "	None", "Pass");
     String data5 = SeleniumDriverInstance.retrieveTextByXpath("//SPAN[@class='ng-binding'][text()='Number of satellites']");
    testData.extractParameter("Extracted Data \t:\t" + data5, "	10", "Pass");
    String data6 = SeleniumDriverInstance.retrieveTextByXpath("//SPAN[@class='ng-binding'][text()='HDOP']");
    testData.extractParameter("Extracted Data \t:\t" + data6, "1", "Pass");
    String data7 = SeleniumDriverInstance.retrieveTextByXpath("(//SPAN[@class='ng-binding'][text()='Last position date and time'][text()='Last position date and time'])[1]");
    testData.extractParameter("Extracted Data \t:\t" + data7, "	2019/03/25 11:12:04 AM (CAT/SAST)", "Pass");
     String data8 = SeleniumDriverInstance.retrieveTextByXpath("(//SPAN[@class='ng-binding'][text()='Events on trail'][text()='Events on trail'])[1]");
    testData.extractParameter("Extracted Data \t:\t" + data8, "	2019/03/25 9:51:07 AM (CAT/SAST) - Over speeding - 81 km/h [...]", "Pass");
    String data9 = SeleniumDriverInstance.retrieveTextByXpath("(//SPAN[@class='ng-binding'][text()='Asset status'][text()='Asset status'])[1]");
    testData.extractParameter("Extracted Data \t:\t" + data9, "	Available", "Pass");
    String data10 = SeleniumDriverInstance.retrieveTextByXpath("(//SPAN[@class='ng-binding'][text()='Servicing and licensing status'][text()='Servicing and licensing status'])[1]");
    testData.extractParameter("Extracted Data \t:\t" + data10, "	OK", "Pass");

   SeleniumDriverInstance.takeScreenShot(counter + "- Clicked LiveTrackingCheck successfully -", false);
   counter++;
    return true;
}
}