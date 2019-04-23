/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Contacts.ImportContact;

import KeywordDrivenTestFramework.Core.BaseClass;
import static KeywordDrivenTestFramework.Core.BaseClass.SeleniumDriverInstance;
import KeywordDrivenTestFramework.Entities.Enums;
import KeywordDrivenTestFramework.Entities.TestEntity;
import KeywordDrivenTestFramework.Entities.TestResult;
import KeywordDrivenTestFramework.Testing.PageObjects.MixTelematics_PageObjects;
import java.awt.AWTException;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author AnelisiweC
 */
public class ContactUs extends BaseClass{

    
 int counter= 1;
 String errorMessage;
 TestEntity testData;
  ArrayList<String> browserTabs; //Declare array list
  
 public ContactUs (TestEntity testData){
    this.testData = testData;
}
 public TestResult executeTest() throws InterruptedException, IOException, AWTException{
     this.setStartTime();
      pause(5000);
      if (!NavigatetoMixTelematics()) 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to navigate to Mix Telematics URL", true);
            counter++;
            narrator.failedMessage("Failed to navigate to Mix Telematics URL - "+errorMessage);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to navigate to Mix Telematics URL", this.getTotalExecutionTime());
        }
      
        if(!ClickContact()){
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on Contact us Tab", false);
            counter++;
            narrator.failedMessage("Failed to click on Monitor Tab - "+errorMessage);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on Contact us Tab", this.getTotalExecutionTime());
        }
           pause(30000);
           
              if(!ExtractTest()){
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on Contact us Tab", false);
            counter++;
            narrator.failedMessage("Failed to click on Monitor Tab - "+errorMessage);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on Contact us Tab", this.getTotalExecutionTime());
        }
        
         return new TestResult (testData,Enums.ResultStatus.PASS, "successfully clicked on Contact us Tab", this.getTotalExecutionTime());
    }
  public boolean ClickContact(){
    
    if(!SeleniumDriverInstance.clickElementByXpath("//a[@href='http://www.mixtelematics.com/about-us/contact-us']")){
        
       errorMessage = "could not click on Contact us Tab";
        return false;
    }
   SeleniumDriverInstance.takeScreenShot(counter + "- Clicked Monitor tab successfully -", false);
   counter++;
    return true;
    }
  
  public boolean NavigatetoMixTelematics() 
    {
        //Navigates to Mix Telematics URL
        if (!SeleniumDriverInstance.navigateTo(MixTelematics_PageObjects.MixTelematicsURL())) 
        {
            errorMessage = "Failed to navigate to Mix Telematics URL";
            return false;
        }

        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot(counter + " - Navigation toMix Telematics URL successful", false);
        counter++;

        return true;
    }
  
    public boolean ExtractTest(){
        
    pause(3000);
    browserTabs = new ArrayList<String>(SeleniumDriverInstance.Driver.getWindowHandles()); //code to switch to the new TAB
    SeleniumDriverInstance.Driver.switchTo().window(browserTabs.get(1));
    pause(3000);  
    String data = SeleniumDriverInstance.retrieveTextByXpath("//h1[@class='uk-article-title']");
    testData.extractParameter("First Name", data , "PASS");

   SeleniumDriverInstance.takeScreenShot(counter + "- Clicked Monitor tab successfully -", false);
   counter++;
    return true;
    }
}
