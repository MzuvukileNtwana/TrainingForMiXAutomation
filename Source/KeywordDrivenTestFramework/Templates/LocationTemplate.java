 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Templates;

import KeywordDrivenTestFramework.Core.BaseClass;
import static KeywordDrivenTestFramework.Core.BaseClass.SeleniumDriverInstance;
import static KeywordDrivenTestFramework.Core.BaseClass.narrator;
import KeywordDrivenTestFramework.Entities.Enums;
import KeywordDrivenTestFramework.Entities.TestEntity;
import KeywordDrivenTestFramework.Entities.TestResult;
import java.awt.AWTException;
import java.io.IOException;

/**
 *
 * @author AnelisiweC
 */
public class LocationTemplate extends BaseClass{

    
    int counter= 1;
    String errorMessage;
    TestEntity testData;
    public LocationTemplate (TestEntity testData){
     this.testData = testData;
    
     
    
}
 public TestResult executeTest() throws InterruptedException, IOException, AWTException{
     this.setStartTime();
      pause(3000);
        if(!ClickManage()){
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on Manage Tab", false);
            counter++;
            narrator.failedMessage("Failed to click on Manage Tab - "+errorMessage);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on Manage Tab", this.getTotalExecutionTime());
        }
         pause(3000);
        if(!ClickTemplate()){
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on Template Tab", false);
            counter++;
            narrator.failedMessage("Failed to click on Template Tab - "+errorMessage);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on Template Tab", this.getTotalExecutionTime());
        }
            pause(3000);
        if(!ClickLocationTemplate()){
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on Loaction Template Tab", false);
            counter++;
            narrator.failedMessage("Failed to click on Loaction Template Tab - "+errorMessage);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on Loaction Template Tab", this.getTotalExecutionTime());
        }
        
            pause(3000);
        if(!SearchField()){
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to add new location Template ", false);
            counter++;
            narrator.failedMessage("Failed to  add new location Template- "+errorMessage);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to  add new location Template", this.getTotalExecutionTime());
        }
             pause(3000);
        if(!checkTemplate("No items to display")){
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to add new location Template ", false);
            counter++;
            narrator.failedMessage("Failed to  add new location Template- "+errorMessage);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to  add new location Template", this.getTotalExecutionTime());
        }
        pause(3000);
        if(!SearchRemove()){
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to add new location Template ", false);
            counter++;
            narrator.failedMessage("Failed to  add new location Template- "+errorMessage);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to  add new location Template", this.getTotalExecutionTime());
        }
    return new TestResult (testData, Enums.ResultStatus.PASS, "Successfully Added location template name", this.getTotalExecutionTime());
    }
 public boolean ClickManage(){
    
    if(!SeleniumDriverInstance.clickElementByXpath("(//a[@class='dropdown-toggle ng-binding'])[2]")){
        
       errorMessage = "could not click on Manage button";
        return false;
    }
     pause(2000);
   SeleniumDriverInstance.takeScreenShot(counter + "- Clicked Manage tab successfully -", false);
   counter++;
    return true;
}
 
 public boolean ClickTemplate(){
    
    if(!SeleniumDriverInstance.clickElementByXpath("(//a[@class='ng-binding'])[34]")){
        
       errorMessage = "could not click on Template button";
        return false;
    }
     pause(2000);
   SeleniumDriverInstance.takeScreenShot(counter + "- Clicked Template tab successfully -", false);
   counter++;
    return true;
    }
 
  public boolean ClickLocationTemplate(){
    
    if(!SeleniumDriverInstance.clickElementByXpath("(//li[@class='ng-scope'])[71]")){
        
       errorMessage = "could not click on Loaction Template button";
        return false;
    }
    pause(3000);
   SeleniumDriverInstance.takeScreenShot(counter + "- Clicked Loaction Template tab successfully -", false);
   counter++;
    return true;
    }
   public boolean SearchRemove(){
    
    SeleniumDriverInstance.clickElementByXpath("//A[@fleet-tooltip='Actions']");
         pause(3000);
         SeleniumDriverInstance.clickElementByXpath("//I[@class='icon icon-remove-sign icon-red']");
         pause(3000);
         SeleniumDriverInstance.clickElementByXpath("(//ul//li//a//span[text() = 'Remove'])");
         pause(3000);
         SeleniumDriverInstance.clickElementByXpath("//BUTTON[@ng-show='$modal.okayButton'][text()='Remove']");
         pause(3000);
         SeleniumDriverInstance.takeScreenShot(counter + "- Search details successfully -", false);
        counter++;
        return true;
    
//      pause(1000);
//        if(!SeleniumDriverInstance.clickElementByXpath("//a[@fleet-tooltip='Actions']")){
//          
//            return false;
//        }
//     
//        if(!SeleniumDriverInstance.clickElementByXpath("(//span[@class='ng-binding'])[11]")){
//         return false;
//        }
//        pause(1000);
//        if(!SeleniumDriverInstance.clickElementByXpath("(//button[@type='submit'])[1]")){
//         return false;
//        }
//    pause(3000);
//   SeleniumDriverInstance.takeScreenShot(counter + "-   successfully  added new location Template -", false);
//   counter++;
//    return true;
    }
   
//     public boolean AddLocationTemplate(){
//    
//    if(!SeleniumDriverInstance.clickElementByXpath("//a[@class='btn btn-small btn-success']")){
//        
//       errorMessage = "could not click on Loaction Template button";
//        return false;
//    }
//    pause(1000);
//      if(!SeleniumDriverInstance.enterTextByXpath("//input[@type='text']", "12345MIX_Location Template 1234")){
//        
//       errorMessage = "could not  add new location Template ";
//        return false;
//    }
//    pause(1000);
//     if(!SeleniumDriverInstance.clickElementByXpath("//button[@class='btn ng-binding btn-small btn-success pull-right']")){
//        
//       errorMessage = "could not click on Loaction Template button";
//        return false;
//    }
//      pause(1000);
//      if(!SeleniumDriverInstance.enterTextByXpath("//input[@type='text']", "z. MiX")){
//        
//       errorMessage = "could not  add new location Template ";
//        return false;
//    }
//       pause(1000);
//     if(!SeleniumDriverInstance.clickElementByXpath("(//INPUT[@type='checkbox'])[9]")){
//        
//       errorMessage = "could not click on Loaction Template button";
//        return false;
//    }
//     
//         pause(1000);
//     if(!SeleniumDriverInstance.clickElementByXpath("//BUTTON[@class='btn btn-wide btn-small btn-success ng-scope ng-binding'][text()='Save']")){
//        
//       errorMessage = "could not click on Loaction Template button";
//        return false;
//    }
//    pause(3000);
//   SeleniumDriverInstance.takeScreenShot(counter + "- Clicked Loaction Template tab successfully -", false);
//   counter++;
//    return true;
//    }
//     
       public boolean SearchField(){
     
         if(!SeleniumDriverInstance.enterTextByXpath("(//INPUT[@type='text'])[1]", "Anelisiwe Cetywayo")){
     errorMessage = "Could not search details";
     return false;
     
         }
//         SeleniumDriverInstance.clickElementByXpath("//A[@fleet-tooltip='Actions']");
//         pause(3000);
//         SeleniumDriverInstance.clickElementByXpath("//I[@class='icon icon-remove-sign icon-red']");
//         pause(3000);
//         SeleniumDriverInstance.clickElementByXpath("(//ul//li//a//span[text() = 'Remove'])");
//         pause(3000);
//         SeleniumDriverInstance.clickElementByXpath("//BUTTON[@ng-show='$modal.okayButton'][text()='Remove']");
//         pause(3000);
         SeleniumDriverInstance.takeScreenShot(counter + "- Search details successfully -", false);
        counter++;
        return true;
         
     }
       
     public boolean checkTemplate(String textToCompare){
         
         String theText = SeleniumDriverInstance.retrieveTextByXpath("//SPAN[@class='badge ng-binding'][text()='No items to display']");
         System.out.println(theText);
         if(theText.equals(textToCompare)){
             
             ClickAddButton();
             pause(3000);
             AddDetails();
             pause(3000);
             CheckButtonZMix();
             pause(3000);
             ClickSave();   
         }
         SeleniumDriverInstance.takeScreenShot(counter + "- Clicked add button successfully -", false);
        counter++;
        return true;
     }  
     
       public boolean ClickAddButton(){
        if(!SeleniumDriverInstance.clickElementByXpath("//A[@class='btn btn-small btn-success']")){
            errorMessage = "Could not click on add button.";
            return false;
        }
        SeleniumDriverInstance.takeScreenShot(counter + "- Clicked add button successfully -", false);
        counter++;
        return true;
    }
     
     public boolean AddDetails(){
     
       if(!SeleniumDriverInstance.enterTextByXpath("(//INPUT[@type='text'])[1]", " Anelisiwe Cetywayo")){
     errorMessage = "Could not add details";
     return false;
     
     
     }
     
     SeleniumDriverInstance.clickElementByXpath("//BUTTON[@class='btn ng-binding btn-small btn-success pull-right'][text()='Select locations']");  
     
     SeleniumDriverInstance.takeScreenShot(counter + "- Added details successfully -", false);
        counter++;
        return true;
     }
     
       public boolean CheckButtonZMix(){
             //if(!SeleniumDriverInstance.Driver.findElement(By.xpath("//td//div//input")).isSelected())
             {
                if(!SeleniumDriverInstance.clickElementByXpath("(//INPUT[@type='checkbox'])[9]")){
                    errorMessage = "Could not click on check button.";
                    return false;
                } 
                SeleniumDriverInstance.clickElementByXpath("//BUTTON[@class='btn ng-scope ng-binding btn-wide btn-success'][text()='Select']");  
      
             }
             SeleniumDriverInstance.takeScreenShot(counter + "- Clicked check button successfully -", false);
               counter++;
               return true;
       }
      public boolean ClickSave(){
        if(!SeleniumDriverInstance.clickElementByXpath("//BUTTON[text()='Save']")){
            errorMessage = "Could not click on save button.";
            return false;
        }
       // SeleniumDriverInstance.clickElementByXpath("//BUTTON[@ng-show='$modal.okayButton'][text()='Yes']");
        SeleniumDriverInstance.clickElementByXpath("//BUTTON[@id='Close']");       
        SeleniumDriverInstance.takeScreenShot(counter + "- Clicked save and close button successfully -", false);
        counter++;
        return true;
    }
  
}

