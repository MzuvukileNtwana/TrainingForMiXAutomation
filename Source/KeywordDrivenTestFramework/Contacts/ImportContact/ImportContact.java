/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Contacts.ImportContact;

import KeywordDrivenTestFramework.Entities.TestEntity;
import KeywordDrivenTestFramework.Entities.TestResult;


import KeywordDrivenTestFramework.Core.BaseClass;
import static KeywordDrivenTestFramework.Core.BaseClass.SeleniumDriverInstance;
import static KeywordDrivenTestFramework.Core.BaseClass.narrator;
import KeywordDrivenTestFramework.Entities.Enums;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;


/**
 *
 * @author AnelisiweC
 */
public class ImportContact extends BaseClass{

    
    int counter= 1;
 String errorMessage;
 TestEntity testData;
 public ImportContact (TestEntity testData){
     this.testData = testData;
    
     
    
}
 public TestResult executeTest() throws InterruptedException, IOException, AWTException{
     this.setStartTime();
      pause(1000);
        if(!ClickManage()){
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on Manage Tab", false);
            counter++;
            narrator.failedMessage("Failed to click on Manage Tab - "+errorMessage);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on Manage Tab", this.getTotalExecutionTime());
        }
           pause(1000);
          if(!ClickManageContact()){
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on Monitor Tab", false);
            counter++;
            narrator.failedMessage("Failed to click on Manage Contact Tab - "+errorMessage);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on Manage Contact Tab", this.getTotalExecutionTime());
        }
            pause(1000);
            if(!SearchContactAndRemove()){
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on search button", false);
            counter++;
            narrator.failedMessage("Failed to click on search button - "+errorMessage);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on search button", this.getTotalExecutionTime());
        }
          
            pause(1000);
            if(!ClickImportContactIcon()){
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on Click Import ContactIcon Tab", false);
            counter++;
            narrator.failedMessage("Failed to click on Click Import ContactIcon Tab - "+errorMessage);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on Click Import ContactIcon Tab", this.getTotalExecutionTime());
        }
            
            pause(1000);
            if(!ChooseFile()){
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on choose file button", false);
            counter++;
            narrator.failedMessage("Failed to click on Click Import ContactIcon Tab - "+errorMessage);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click choose file button", this.getTotalExecutionTime());
        }
            pause(1000);
            if(!UploadFile()){
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on choose file button", false);
            counter++;
            narrator.failedMessage("Failed to click on Click Import ContactIcon Tab - "+errorMessage);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click choose file button", this.getTotalExecutionTime());
        }
            
            pause(5000);
            if(!RetrieveAsset()){
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on close button", false);
            counter++;
            narrator.failedMessage("Failed to click on Click close button - "+errorMessage);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click close button", this.getTotalExecutionTime());
        }
           
            
    return new TestResult (testData,Enums.ResultStatus.PASS, "successfully cliked choose file button", this.getTotalExecutionTime());
    }
 
  public boolean ClickManage(){
    
    if(!SeleniumDriverInstance.clickElementByXpath("(//a[@class='dropdown-toggle ng-binding'])[2]")){
        
       errorMessage = "could not click on manage button";
        return false;
    }
   SeleniumDriverInstance.takeScreenShot(counter + "- Clicked manage tab successfully -", false);
   counter++;
    return true;
}
  
   public boolean ClickManageContact(){
    
    if(!SeleniumDriverInstance.clickElementByXpath("//A[@ng-href='#/contacts'][text()='Manage contacts']")){
        
       errorMessage = "could not click on manage contact button";
        return false;
    }
   SeleniumDriverInstance.takeScreenShot(counter + "- Clicked manage contact tab successfully -", false);
   counter++;
    return true;
}
   
    public boolean ClickImportContactIcon(){
    
    if(!SeleniumDriverInstance.clickElementByXpath("//a[@fleet-tooltip='Import contacts']")){
        
       errorMessage = "could not click on Import Contact Icon";
        return false;
    }
   SeleniumDriverInstance.takeScreenShot(counter + "- Clicked Import Contact Icon tab successfully -", false);
   counter++;
    return true;
}
     
    public boolean ChooseFile(){
    
    if(!SeleniumDriverInstance.clickElementByXpath("//span[@class='btn fileinput-button btn-success']")){
        
       errorMessage = "could not click on choose file";
        return false;
    }
   SeleniumDriverInstance.takeScreenShot(counter + "- Clicked choose file tab successfully -", false);
   counter++;
    return true;
}
//    CODE TO SEARCH AND REMOVE
    
    public boolean SearchContactAndRemove(){
    if(!SeleniumDriverInstance.enterTextByXpath("(//input[@type='text'])[1]","Anelisiwe")){  
       errorMessage = "could not click on search button";
        return false;
    }
    
        pause(1000);
        if(!SeleniumDriverInstance.clickElementByXpath("(//a[@fleet-tooltip='Actions'])[2]")){
          
            return false;
        }
     
        if(!SeleniumDriverInstance.clickElementByXpath("(//span[text() = 'Remove'])[1]")){
         return false;
        }
        pause(1000);
        if(!SeleniumDriverInstance.clickElementByXpath("(//button[text() = 'Remove'])[1]")){
         return false;
        }
       

   
    
   SeleniumDriverInstance.takeScreenShot(counter + "- Clicked search button successfully -", false);
   counter++;
    return true;
}
  
    
        public boolean UploadFile() throws AWTException{
    
    StringSelection filePath =  new StringSelection (System.getProperty("user.dir")+"\\Import files\\MiX_Contacts_Import_Tranning.xlsx");
       Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(filePath, null);
        Robot robot = new Robot();
        
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        pause(2000);
        robot.keyRelease(KeyEvent.VK_ENTER);
        
        return true;
//   SeleniumDriverInstance.takeScreenShot(counter + "- Clicked choose file tab successfully -", false);
//   counter++;
//    return true;
}
        

    
    public boolean RetrieveAsset(){

    String data = SeleniumDriverInstance.retrieveTextByXpath("(//span[text()='Anelisiwe Import'])[1]");
    testData.extractParameter("First Name", data , "PASS"); 
//    String data1 = SeleniumDriverInstance.retrieveTextByXpath("(//span[text()='Anelisiwe Import'])[1]");
//    testData.extractParameter("Last Name", data1, "Pass");
    String data2 = SeleniumDriverInstance.retrieveTextByXpath("(//span[text()='+27234567890'])[1]");
    testData.extractParameter("Cell No"  ,  data2, "PASS");
 

   SeleniumDriverInstance.takeScreenShot(counter + "- Data Extracted successfully -", false);
   counter++;
    return true;
}
}