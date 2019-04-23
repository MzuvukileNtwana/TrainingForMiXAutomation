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
import java.io.IOException;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author AnelisiweC
 */
public class ImportAsset12345 extends BaseClass{

    
    int counter= 1;
 String errorMessage;
 TestEntity testData;
 public ImportAsset12345 (TestEntity testData){
     this.testData = testData;
    
     
    
}
 public TestResult executeTest() throws InterruptedException, IOException, AWTException{
     this.setStartTime();
      pause(1000);
        if(!ClickMonitor()){
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on Monitor Tab", false);
            counter++;
            narrator.failedMessage("Failed to click on Monitor Tab - "+errorMessage);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on Monitor Tab", this.getTotalExecutionTime());
        }
        
         pause(1000);
        if(!ClickAsset()){
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on Monitor Tab", false);
            counter++;
            narrator.failedMessage("Failed to click on Monitor Tab - "+errorMessage);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on Monitor Tab", this.getTotalExecutionTime());
        }
        
         pause(1000);
        if(!SearchAsset()){
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on Monitor Tab", false);
            counter++;
            narrator.failedMessage("Failed to click on Monitor Tab - "+errorMessage);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on Monitor Tab", this.getTotalExecutionTime());
        }
        pause(1000);
         if(!ImportFile()){
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on assets Tab", false);
            counter++;
            narrator.failedMessage("Failed to click on assets Tab - "+errorMessage);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on assets Tab", this.getTotalExecutionTime());
        }
         
          pause(1000);
         if(!ChooseFile()){
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on assets Tab", false);
            counter++;
            narrator.failedMessage("Failed to click on assets Tab - "+errorMessage);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on assets Tab", this.getTotalExecutionTime());
        }
         
            pause(1000);
         if(!UploadFile()){
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on assets Tab", false);
            counter++;
            narrator.failedMessage("Failed to click on assets Tab - "+errorMessage);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on assets Tab", this.getTotalExecutionTime());
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
// Search code 
 public boolean SearchAsset(){
   if (!SeleniumDriverInstance.enterTextByXpath("//INPUT[@type='text']","Anelisiwe Cetywayo")){
        errorMessage = "could not click on add button";
        return false;
    }
   
    
    SeleniumDriverInstance.clickElementByXpath("(//i[@class='icon-search'])[1]");
   
    String Name=SeleniumDriverInstance.retrieveTextByXpath("//span[@class = 'badge badge-grey ng-binding']");
    if(!Name.contains("0")){
        pause(3000);
        if(!SeleniumDriverInstance.clickElementByXpath("//a[@class='row-action']")){
            return false;
        }
    
        if(!SeleniumDriverInstance.clickElementByXpath("//a[@event='Remove']")){
        return false;
        }
     
        if(!SeleniumDriverInstance.clickElementByXpath("//button[text() = 'Remove']")){
         return false;
        }
    }
   
    SeleniumDriverInstance.takeScreenShot(counter + "- Clicked add button tab successfully -", false);
    counter++;
    return true;
    
}
 public boolean ImportFile(){
   if(!SeleniumDriverInstance.clickElementByXpath("//i[@class='icon-import']")){
       errorMessage = "could not click on asset button";
        return false;
   }
   SeleniumDriverInstance.takeScreenShot(counter + "- Clicked asset tab successfully -", false);
   counter++;
    return true;
}
 
 public boolean ChooseFile(){
   if (!SeleniumDriverInstance.clickElementByXpath("//INPUT[@type='file']")){  
        errorMessage = "could not click on add button";
        return false;
    }
        return true;

}
 
 public boolean uplodFile(){
     pause(1000);
   if (!SeleniumDriverInstance.clickElementByXpath("//INPUT[@type='file']")){
        errorMessage = "could not click on add button";
        return false;
    }
        return true;

}

// Upload file from Desktop to site
    private boolean UploadFile() throws AWTException {
       
//       StringSelection filePath =  new StringSelection (System.getProperty("AnelisiweC.AFRICA")+"\\Import files\\Import_Asset.xlsx");
       StringSelection filePath =  new StringSelection (System.getProperty("user.dir")+"\\Import files\\Import_Asset.xlsx");
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
}
}