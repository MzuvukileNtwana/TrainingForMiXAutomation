/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Monitor.FleetAdmin;

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
public class EventDescription extends BaseClass
{
 int counter= 1;
 String errorMessage;
 TestEntity testData;

 public EventDescription (TestEntity testData){
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
        if(!ClickServerSideEvents()){
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on Monitor Tab", false);
            counter++;
            narrator.failedMessage("Failed to click on Monitor Tab - "+errorMessage);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on Monitor Tab", this.getTotalExecutionTime());
        }
        
        pause(3000);
        if(!ClickAdd()){
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on Monitor Tab", false);
            counter++;
            narrator.failedMessage("Failed to click on Monitor Tab - "+errorMessage);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on Monitor Tab", this.getTotalExecutionTime());
        }
        pause(3000);
        if(!AddEventDescription()){
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
 
 public boolean ClickServerSideEvents(){
    
    if(!SeleniumDriverInstance.clickElementByXpath("(//a[@class='ng-binding'])[11]")){
        
       errorMessage = "could not click on monitor button";
        return false;
    }
   SeleniumDriverInstance.takeScreenShot(counter + "- Clicked Monitor tab successfully -", false);
   counter++;
    return true;
}
 
  public boolean ClickAdd(){
    
    if(!SeleniumDriverInstance.clickElementByXpath("//I[@class='icon-plus icon-white']")){
        
       errorMessage = "could not click on monitor button";
        return false;
    }
   SeleniumDriverInstance.takeScreenShot(counter + "- Clicked Monitor tab successfully -", false);
   counter++;
    return true;
}
  
  public boolean AddEventDescription(){
      
      
        pause(2000);
//        SeleniumDriverInstance.clickElementByXpath("(//INPUT[@type='text'])[1]");
//        pause(2000);
//        SeleniumDriverInstance.enterTextByXpath("(//INPUT[@type='text'])[1]", "Alungile");
//        pause(2000);
//        SeleniumDriverInstance.selectFromDropDownListUsingXpath("//SELECT[@ng-model='$controller.pageData.serverSideEventDetails.assetsDrivers']","Drivers");
//        pause(2000); 
//        SeleniumDriverInstance.clickElementByXpath("//SPAN[@dmx-translate=''][text()='Recurring']");
    
            SeleniumDriverInstance.EnterTextByXpath("(//input[@type='text'])[1]", "Anelisiwe");
            pause(2000);
            SeleniumDriverInstance.selectFromDropDownListUsingXpath("//SELECT[@ng-model='$controller.pageData.serverSideEventDetails.assetsDrivers']","Drivers");
            pause(2000);
            SeleniumDriverInstance.clickElementByXpath("(//INPUT[@type='radio'])[1]");
            pause(2000);
            SeleniumDriverInstance.clickElementByXpath("(//a[@class='ng-binding'])[72]");
            pause(2000);
            SeleniumDriverInstance.clickElementByXpath("//a[@class='btn btn-wide btn-small btn-success']");
//             pause(2000);
//            SeleniumDriverInstance.clickElementByXpath("//span[@class='daredevel-tree-anchor ui-icon icon-minus ng-scope']");
//            pause(2000);
//           SeleniumDriverInstance.clickElementByXpath("(//span[@class='ng-binding'])[14]");
           pause(2000); 
        SeleniumDriverInstance.clickElementByXpath("(//SPAN[@ui-if='!item.expanded && hasSupportedChildren(item)'])[3]");
        pause(2000); 
        SeleniumDriverInstance.clickElementByXpath("//SPAN[@class='ng-binding'][text()='Default Site']");
        pause(2000); 
        SeleniumDriverInstance.clickElementByXpath("//SPAN[@dmx-translate=''][text()='Next']");
          pause(2000);
          SeleniumDriverInstance.selectFromDropDownListUsingXpath("//SELECT[@class='span12 ng-pristine ng-valid ng-valid-dmx-required']","Over-speeding in location");
        pause(2000); 
        SeleniumDriverInstance.enterTextByXpath("(//INPUT[@type='number'])[1]","100");
        pause(2000);
        SeleniumDriverInstance.enterTextByXpath("(//INPUT[@type='number'])[2]","30");
        pause(2000);
        SeleniumDriverInstance.clickElementByXpath("//BUTTON[@class='btn ng-binding btn-success mb-10'][text()='Select locations']");
        pause(2000);
        SeleniumDriverInstance.enterTextByXpath("(//INPUT[@type='text'])[4]", "z. MiX");
        pause(2000);
        SeleniumDriverInstance.clickElementByXpath("(//INPUT[@type='checkbox'])[36]");
        pause(2000);
        SeleniumDriverInstance.clickElementByXpath("//BUTTON[@class='btn ng-scope ng-binding btn-wide btn-success'][text()='Select']");
        pause(2000);
        SeleniumDriverInstance.clickElementByXpath("//A[@ng-click='$controller.saveClick()']");
   SeleniumDriverInstance.takeScreenShot(counter + "- Clicked Monitor tab successfully -", false);
   counter++;
    return true;
            
        
      
    }
 //span[@class='add-on btn']
    
 
//     if(!SeleniumDriverInstance.selectByTextFromDropDownListUsingXpath("(//SELECT[@ng-model='$controller.pageData.serverSideEventDetails.assetsDrivers'])[1]", "Drivers")){
//        
//       errorMessage = "could not click on monitor button";
//        return false;
//    }
//     pause(1000);
//     if(!SeleniumDriverInstance.clickElementByXpath("(//INPUT[@type='radio'])[2]")){
//        
//       errorMessage = "could not click on monitor button";
//        return false;
//    }
  
  
//   public boolean ServerDetails(){
//        pause(2000);
//        SeleniumDriverInstance.clickElementByXpath("(//INPUT[@type='text'])[1]");
//        pause(2000);
//        SeleniumDriverInstance.enterTextByXpath("(//INPUT[@type='text'])[1]", "Alungile");
//        pause(2000);
//        SeleniumDriverInstance.selectFromDropDownListUsingXpath("//SELECT[@ng-model='$controller.pageData.serverSideEventDetails.assetsDrivers']","Drivers");
//        pause(2000); 
//        SeleniumDriverInstance.clickElementByXpath("//SPAN[@dmx-translate=''][text()='Recurring']");
//        pause(2000); 
//        SeleniumDriverInstance.clickElementByXpath("//I[@class='icon-calendar']");
//        pause(2000); 
//        SeleniumDriverInstance.clickElementByXpath("//DIV[@class='month-of-year ng-binding'][text()='Apr']");
//        pause(2000); 
//        SeleniumDriverInstance.clickElementByXpath("//DIV[@class='month ng-scope ng-binding'][text()='May']");
//        pause(2000); 
//        SeleniumDriverInstance.clickElementByXpath("//A[@ng-click='directive.done()'][text()='Done']");
//         pause(2000);
//        SeleniumDriverInstance.clickElementByXpath("//SPAN[@dmx-translate=''][text()='Next']");
//        pause(2000); 
//        SeleniumDriverInstance.clickElementByXpath("(//SPAN[@dmx-translate=''][text()='Groups'][text()='Groups'])[2]");
//        pause(2000); 
//        SeleniumDriverInstance.clickElementByXpath("(//SPAN[@ui-if='!item.expanded && hasSupportedChildren(item)'])[3]");
//        pause(2000); 
//        SeleniumDriverInstance.clickElementByXpath("//SPAN[@class='ng-binding'][text()='Default Site']");
//        pause(2000); 
//        SeleniumDriverInstance.clickElementByXpath("//SPAN[@dmx-translate=''][text()='Next']");
//        pause(2000);
//        SeleniumDriverInstance.selectFromDropDownListUsingXpath("//SELECT[@class='span12 ng-pristine ng-valid ng-valid-dmx-required']","Over-speeding in location");
//        pause(2000); 
//        SeleniumDriverInstance.enterTextByXpath("(//INPUT[@type='number'])[1]","100");
//        pause(2000);
//        SeleniumDriverInstance.enterTextByXpath("(//INPUT[@type='number'])[2]","30");
//        pause(2000);
//        SeleniumDriverInstance.clickElementByXpath("//BUTTON[@class='btn ng-binding btn-success mb-10'][text()='Select locations']");
//        pause(2000);
//        SeleniumDriverInstance.enterTextByXpath("(//INPUT[@type='text'])[4]", "z. MiX");
//        pause(2000);
//        SeleniumDriverInstance.clickElementByXpath("(//INPUT[@type='checkbox'])[36]");
//        pause(2000);
//        SeleniumDriverInstance.clickElementByXpath("//BUTTON[@class='btn ng-scope ng-binding btn-wide btn-success'][text()='Select']");
//        pause(2000);
//        SeleniumDriverInstance.clickElementByXpath("//A[@ng-click='$controller.saveClick()']");
//        
//        
//       SeleniumDriverInstance.takeScreenShot(counter + "- clicked add role button successfully", false);
//       counter++;
//       return true;
//
//}

   
}
 
 
 
 
