/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.UserAdimn;

import KeywordDrivenTestFramework.Core.BaseClass;
import static KeywordDrivenTestFramework.Core.BaseClass.SeleniumDriverInstance;
import static KeywordDrivenTestFramework.Core.BaseClass.narrator;
import KeywordDrivenTestFramework.Entities.Enums;
import KeywordDrivenTestFramework.Entities.TestEntity;
import KeywordDrivenTestFramework.Entities.TestResult;
import java.text.SimpleDateFormat;

/**
 *
 * @author AnelisiweC
 */
public class AddUserAdmin extends BaseClass{
    
    int counter = 1;
    String errorMessage;
    TestEntity testData;
    
    public AddUserAdmin (TestEntity testData){
            
        this.testData = testData;
    }
    
  public TestResult executeTest() throws InterruptedException{
        
        this.setStartTime();
         pause(3000);
        if(!ClickManage()){
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on Manage Tab", false);
            counter++;
            narrator.failedMessage("Failed to click on Manage Tab - "+errorMessage);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on Manage Tab", this.getTotalExecutionTime());
        }
         pause(3000);
         
         if(!ClickUserAdmin()){
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on Manage Tab", false);
            counter++;
            narrator.failedMessage("Failed to click on Manage Tab - "+errorMessage);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on Manage Tab", this.getTotalExecutionTime());
        }
          pause(3000);
         
         if(!ClickToAdd()){
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on Manage Tab", false);
            counter++;
            narrator.failedMessage("Failed to click on Manage Tab - "+errorMessage);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on Manage Tab", this.getTotalExecutionTime());
        }
         
         
           pause(3000);
         
         if(!AddUser()){
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on Manage Tab", false);
            counter++;
            narrator.failedMessage("Failed to click on Manage Tab - "+errorMessage);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on Manage Tab", this.getTotalExecutionTime());
        }
         
          pause(3000);
         
         if(!ClickSelectGroup()){
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on Manage Tab", false);
            counter++;
            narrator.failedMessage("Failed to click on Manage Tab - "+errorMessage);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on Manage Tab", this.getTotalExecutionTime());
        }
           pause(3000);
         
         if(!ClickSave()){
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on Manage Tab", false);
            counter++;
            narrator.failedMessage("Failed to click on Manage Tab - "+errorMessage);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on Manage Tab", this.getTotalExecutionTime());
        }
          pause(3000);
         
         if(!ClickUsers()){
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on Manage Tab", false);
            counter++;
            narrator.failedMessage("Failed to click on Manage Tab - "+errorMessage);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on Manage Tab", this.getTotalExecutionTime());
        }
          pause(3000);
         if(!Remove()){
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on Manage Tab", false);
            counter++;
            narrator.failedMessage("Failed to click on Manage Tab - "+errorMessage);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on Manage Tab", this.getTotalExecutionTime());
        }
         
         pause(3000);
    return new TestResult (testData, Enums.ResultStatus.PASS, "Successfully added my first asset", this.getTotalExecutionTime());
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
 
  public boolean ClickUserAdmin(){
    
    if(!SeleniumDriverInstance.clickElementByXpath("(//a[@class='ng-binding'])[41]")){
        
       errorMessage = "could not click on Manage button";
        return false;
    }
     pause(2000);
   SeleniumDriverInstance.takeScreenShot(counter + "- Clicked Manage tab successfully -", false);
   counter++;
    return true;
}
   public boolean ClickToAdd(){
    
    if(!SeleniumDriverInstance.clickElementByXpath("//a[@fleet-tooltip='Add user']")){
        
       errorMessage = "could not click on Manage button";
        return false;
    }
     pause(2000);
   SeleniumDriverInstance.takeScreenShot(counter + "- Clicked Manage tab successfully -", false);
   counter++;
    return true;
}
   
   public boolean AddUser(){
    
    if(!SeleniumDriverInstance.EnterTextByXpath("(//input[@type='text'])[1]", "Anelisiwe")){
        
       errorMessage = "could not click on Manage button";
        return false;
    }
    
     if(!SeleniumDriverInstance.EnterTextByXpath("(//input[@type='text'])[2]", "Cetywayo")){
        
       errorMessage = "could not click on Manage button";
        return false;
    }
     pause(2000);
     String timeStamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date());
     if(!SeleniumDriverInstance.EnterTextByXpath("(//input[@type='text'])[3]", timeStamp + "@mixautomation.com")){
        
       errorMessage = "could not click on Manage button";
        return false;
    }  
    if(!SeleniumDriverInstance.EnterTextByXpath("(//input[@type='text'])[4]", "MiX Telematics")){
        
       errorMessage = "could not click on Manage button";
        return false;
    }
     pause(2000);
   SeleniumDriverInstance.takeScreenShot(counter + "- Clicked Manage tab successfully -", false);
   counter++;
    return true;
}
   public boolean ClickSelectGroup(){
    
    if(!SeleniumDriverInstance.clickElementByXpath("//a[@class='btn btn-small btn-success pull-right mt-5 ng-binding']")){
        
       errorMessage = "could not click on Manage button";
        return false;
    }
    pause(2000);
        if(!SeleniumDriverInstance.EnterTextByXpath("(//INPUT[@type='text'])[10]", "MiX Security Group")){
        
       errorMessage = "could not click on Manage button";
        return false;
    }
    pause(1000);
      if(!SeleniumDriverInstance.clickElementByXpath("(//INPUT[@ng-show='!singleSelect'])[1]")){
        
       errorMessage = "could not click on Manage button";
        return false;
    }
     pause(1000);
      if(!SeleniumDriverInstance.clickElementByXpath("//button[@class='btn ng-scope ng-binding btn-wide btn-success']")){
        
       errorMessage = "could not click on Manage button";
        return false;
    }
     pause(1000);
   SeleniumDriverInstance.takeScreenShot(counter + "- Clicked Manage tab successfully -", false);
   counter++;
    return true;
}
   
   
   public boolean ClickSave(){
    
    if(!SeleniumDriverInstance.clickElementByXpath("//button[@class='btn-wide btn-small btn-success btn ng-scope ng-binding']")){
        
       errorMessage = "could not click on save button";
        return false;
    }
     pause(5000);
   SeleniumDriverInstance.takeScreenShot(counter + "-  successfully saved -", false);
   counter++;
    return true;
}
      
   public boolean ClickUsers(){
    
    if(!SeleniumDriverInstance.clickElementByXpath("//DIV[@ui-if='title']")){
        
       errorMessage = "could not click on users tab";
        return false;
    }
     pause(5000);
   SeleniumDriverInstance.takeScreenShot(counter + "-  successfully cliked on users tab -", false);
   counter++;
    return true;
}
   
    public boolean Remove(){
        
       
//        
//        if(!SeleniumDriverInstance.clickElementByXpath("//button[@class='btn-wide btn-small btn ng-scope ng-binding']")){
//            return false;
//        }
    
    if(!SeleniumDriverInstance.EnterTextByXpath("//input[@type='text']", "Anelisiwe Cetywayo")){
        
       errorMessage = "could not click on save button";
        return false;
    }
       pause(2000);
     if(!SeleniumDriverInstance.clickElementByXpath("//i[@class='icon-search']")){
            return false;
        }
//     SeleniumDriverInstance.clickElementByXpath("//a[@class='btn btn-small']");
   
//    String Name=SeleniumDriverInstance.retrieveTextByXpath("//span[@class = 'badge badge-grey ng-binding']");
//    if(!Name.contains("0")){
        pause(2000);
        if(!SeleniumDriverInstance.clickElementByXpath("//a[@class='row-action']")){
            return false;
        }
     pause(6000);
        if(!SeleniumDriverInstance.clickElementByXpath("(//ul//li//a//span[text() = 'Remove'])")){
        return false;
        }
        
//        SeleniumDriverInstance.clickElementByXpath("//BUTTON[@ng-show='$modal.okayButton'][text()='Remove']");
//            pause(3000);
//            SeleniumDriverInstance.selectFromDropDownListUsingXpath("//SELECT[@ng-options='reason as (reason|translate) for reason in $controller.deleteUserTemplate.possibleReasons']", "No longer employed");
//            pause(2000);
//            SeleniumDriverInstance.clickElementByXpath("//BUTTON[@class='btn ng-scope ng-binding btn-wide btn-success'][text()='Delete']");
         


 pause(2000);
        if(!SeleniumDriverInstance.selectFromDropDownListUsingXpath("//SELECT[@ng-options='reason as (reason|translate) for reason in $controller.deleteUserTemplate.possibleReasons']", "Customer request")){  
        return false;
        }
        
//      pause(2000);
//        if(!SeleniumDriverInstance.clickElementByXpath("//SELECT[@ng-options='reason as (reason|translate) for reason in $controller.deleteUserTemplate.possibleReasons']")){  
//        return false;
//        }
        
        if(!SeleniumDriverInstance.clickElementByXpath("//button[@class='btn ng-scope ng-binding btn-wide btn-success']")){
         return false;
        }
    
    
     pause(5000);
   SeleniumDriverInstance.takeScreenShot(counter + "-  successfully saved -", false);
   counter++;
    return true;
}
   
}