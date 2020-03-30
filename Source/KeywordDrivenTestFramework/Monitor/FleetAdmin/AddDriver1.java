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
public class AddDriver1 extends BaseClass{
    
    int counter = 1;
    String errorMsg;
    TestEntity testData;
    
    public AddDriver1(TestEntity testData){
            
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
        pause(3000);
        
        
         if(!AddDriver()) {
            
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on Monitor Tab", true);
            counter++;
            narrator.failedMessage("Failed to click on Monitor Tab - "+errorMsg);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on Monitor Tab", this.getTotalExecutionTime());
        }
        pause(3000);
        
           if(!ClickButton()) {
            
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on add button", true);
            counter++;
            narrator.failedMessage("Failed to click on add button - "+errorMsg);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on add button", this.getTotalExecutionTime());
        }
           pause(3000);
           
             if(!AddDetails()) {
            
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to add details", true);
            counter++;
            narrator.failedMessage("Failed to add details - "+errorMsg);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to add deatails", this.getTotalExecutionTime());
        }
             pause(3000);
             
        
             if(!DownloadFile()) {
            
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on save button", true);
            counter++;
            narrator.failedMessage("Failed to click on save button - "+errorMsg);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on save button", this.getTotalExecutionTime());
        }
             pause(3000);
             
             if(!ClickSave()) {
            
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on save button", true);
            counter++;
            narrator.failedMessage("Failed to click on save button - "+errorMsg);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on save button", this.getTotalExecutionTime());
        }
             pause(3000);
                  if(!CheckDetails()) {
            
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to add details", true);
            counter++;
            narrator.failedMessage("Failed to add details - "+errorMsg);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to add deatails", this.getTotalExecutionTime());
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
        public boolean AddDriver(){
      
        if(!SeleniumDriverInstance.clickElementByXpath("(//a[@class='ng-binding'])[7]")) {
            errorMsg = "failed to click on monitor tab";
            return false;
        }
            SeleniumDriverInstance.takeScreenShot(counter+ "sucessfully cliked on monitor tab", false);
            counter++;
                  
            return true;
    }

     public boolean ClickButton(){
         
        
            if(!SeleniumDriverInstance.clickElementByXpath("//a[@fleet-tooltip='Add driver']")) {
            errorMsg = "failed to click on add button";
            return false;
        }
            SeleniumDriverInstance.takeScreenShot(counter+ "sucessfully cliked on add button", false);
            counter++;
                  
            return true;
    }
     
     
       public boolean AddDetails(){
         
        
          if(!SeleniumDriverInstance.enterTextByXpath("//input[@name='driverName']", "Anelisiwe Cetywayo")) {
            errorMsg = "failed to enter the description";
            return false;
        }
         if(!SeleniumDriverInstance.selectFromDropDownListUsingXpath("//select[@name='siteId']", "Default Site")) {
            errorMsg = "failed to select asset type";
            return false;
        }
         
         if(!SeleniumDriverInstance.enterTextByXpath("//input[@name='mobileNumber']", "+27123456789")) {
            errorMsg = "failed to enter the description";
            return false;
        }
         
          if(!SeleniumDriverInstance.selectFromDropDownListUsingXpath("//select[@name='country']", "South Africa")) {
            errorMsg = "failed to select asset type";
            return false;
        }
          
            if(!SeleniumDriverInstance.enterTextByXpath("//input[@name='email']", "test@mixAtoumatiom.com")) {
            errorMsg = "failed to enter the description";
            return false;
        }
            
                SeleniumDriverInstance.takeScreenShot(counter+ "sucessfully cliked on add button", false);
            counter++;
            return true;
        }
       
       
       public boolean CheckDetails(){
           
        SeleniumDriverInstance.clickElementbyXpath("//A[@ng-click='changeTab(tab)'][text()='Extended driver ID']");
        pause(3000);
        
     SeleniumDriverInstance.CheckIfElementDisplayedByXpath("//span[contains(text(), 'Smart card / Dallas tag')]");
           pause(3000);
           
       SeleniumDriverInstance.clickElementbyXpath("//a[contains(text(), 'Access control')]");
          pause(3000);
          
       SeleniumDriverInstance.CheckIfElementDisplayedByXpath("//span[contains(text(), '6 total assets')]");
        pause(3000);
        
        SeleniumDriverInstance.clickElementbyXpath("(//a[@ng-click='changeTab(tab)'])[4]");
          pause(3000);
          
       SeleniumDriverInstance.CheckIfElementDisplayedByXpath("//button[@type='reset']");
        pause(3000);
         SeleniumDriverInstance.clickElementbyXpath("//A[@ng-click='changeTab(tab)'][text()='Licences']");
          pause(3000);
          
       SeleniumDriverInstance.CheckIfElementDisplayedByXpath("//A[@ng-click='tabClicked(tab)'][text()='Licence categories']");
        pause(3000);
        
            SeleniumDriverInstance.clickElementbyXpath("//A[@ng-click='changeTab(tab)'][text()='Certifications']");
          pause(3000);
          
       SeleniumDriverInstance.CheckIfElementDisplayedByXpath("//A[@ng-click='tabClicked(tab)'][text()='Licences']");
        pause(3000);
        
            SeleniumDriverInstance.clickElementbyXpath("//A[@ng-click='changeTab(tab)'][text()='Hours of service']");
          pause(3000);
          
       SeleniumDriverInstance.CheckIfElementDisplayedByXpath("//LEGEND[@dmx-translate=''][text()='Hours of service settings']");
        pause(3000);
        
                SeleniumDriverInstance.clickElementbyXpath("//A[@ng-click='changeTab(tab)'][text()='MyMiX']");
          pause(3000);
          
       SeleniumDriverInstance.CheckIfElementDisplayedByXpath("//SPAN[@dmx-translate=''][text()='Enable for MyMiX']");
        pause(3000);
     
            SeleniumDriverInstance.takeScreenShot(counter+ " sucessfully cliked on save button", false);
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
         
         
          public boolean DownloadFile(){
         
        
        if(!SeleniumDriverInstance.clickElementByXpath("//BUTTON[@fleet-tooltip='Export drivers']")) {
            errorMsg = "failed to download a file";
            return false;
        }
            SeleniumDriverInstance.takeScreenShot(counter+ " sucessfully cliked on export button", false);
            counter++;
                  
            return true;
    }
         
}
  


