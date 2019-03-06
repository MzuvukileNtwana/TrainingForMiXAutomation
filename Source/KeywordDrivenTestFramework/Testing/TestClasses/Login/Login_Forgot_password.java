/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.TestClasses.Login;
import KeywordDrivenTestFramework.Core.BaseClass;
import static KeywordDrivenTestFramework.Core.BaseClass.SeleniumDriverInstance;
import KeywordDrivenTestFramework.Entities.Enums;
import KeywordDrivenTestFramework.Entities.TestEntity;
import KeywordDrivenTestFramework.Entities.TestResult;
import KeywordDrivenTestFramework.Testing.PageObjects.MixTelematics_PageObjects;
import static java.lang.System.err;

/**
 *
 * @author kmanakaza | Edited by Micah
 */
public class Login_Forgot_password extends BaseClass{

     int counter = 1;

    TestEntity testData;
    boolean isNegative;
    String reportMessage = "";
    
    
    public Login_Forgot_password(TestEntity testData) {
        this.testData = testData;
        
    }

    public TestResult executeTest() {

        this.setStartTime();
        
        if (!NavigatetoMixTelematics()) 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to navigate to Mix Telematics URL", true);
            counter++;
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to navigate to Mix Telematics URL", this.getTotalExecutionTime());
        }
        
        if (!EnterCorrectCredentials()) 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - " + reportMessage, true);
            counter++;
            return new TestResult(testData, Enums.ResultStatus.FAIL, reportMessage, this.getTotalExecutionTime());
        }
                        
        if(!ClickForgotPassword())
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - " + reportMessage, true);
            counter++;
            return new TestResult(testData, Enums.ResultStatus.FAIL, reportMessage, this.getTotalExecutionTime());
        }
            
        if(!ValidateForgotpasswordPage())
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to Validate the Forgot Password heading on the Forgot Password page", true);
            counter++;
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to Validate the Forgot Password heading on the Forgot Password page", this.getTotalExecutionTime());
        }
        
       if(!CompleteForm())
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - " + reportMessage, true);
            counter++;
            return new TestResult(testData, Enums.ResultStatus.FAIL, reportMessage, this.getTotalExecutionTime());
        }
       
       if(!ValidateForgotPasswordProccessComplete())
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - " + reportMessage, true);
            counter++;
            return new TestResult(testData, Enums.ResultStatus.FAIL, reportMessage, this.getTotalExecutionTime());
        }

        
        SeleniumDriverInstance.takeScreenShot("Successfully compelted the Forgot Password process", false);
        return new TestResult(testData, Enums.ResultStatus.PASS, "Successfully compelted the Forgot Password process", this.getTotalExecutionTime());
    }

    public boolean NavigatetoMixTelematics() 
    {
        //Navigates to Mix Telematics URL
        if (!SeleniumDriverInstance.navigateTo(MixTelematics_PageObjects.MixTelematicsURL()))
        {
            return false;
        }
        
        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot(counter + " - Navigation toMix Telematics URL successful", false);
        counter++;

        return true;
    }
    
         
     

    public boolean EnterCorrectCredentials()
    {
        if(!SeleniumDriverInstance.waitForElementByXpath(MixTelematics_PageObjects.UsernameInputFieldXPath(), 30))
        {
            testData.extractParameter("Username Input Field", "Failed to validate that the Username input field is present", testCaseId);
            return false;
        }
        
        //Enter Username
        if (!SeleniumDriverInstance.enterTextByXpath(MixTelematics_PageObjects.UsernameInputFieldXPath(), this.testData.getData("Username")))
        {
            reportMessage = "Failed to enter Username by Xpath";
            return false;
        }
        
        //Enter Password
        if(!SeleniumDriverInstance.enterTextByXpath(MixTelematics_PageObjects.PasswordInputFieldXPath(), this.testData.getData("Password")))
        {
            reportMessage = "Failed to enter Password by Xpath";
            return false;
        }
        
        
        return true;
    }
    
    
    public boolean ClickForgotPassword()
    {
        //Click Sign in Button
        if (!SeleniumDriverInstance.clickElementbyXpath(MixTelematics_PageObjects.LoginForgotPasswordXpath()))
        {
            err.println("[ERROR] Failed to click forgot password by Xpath");
            return false;
        }
        
        
        SeleniumDriverInstance.takeScreenShot("Successfully clicked Forgot Password", false);
        return true;
    }
    
    
        public boolean ValidateForgotpasswordPage()
    {                
        //Waits for the H5 heading of Forgot Password
        if (!SeleniumDriverInstance.waitForElementByXpath(MixTelematics_PageObjects.ForgotPasswordH5HeadingXpath(), 30))
        {
            err.println("[ERROR] Failed to validate the Forgot Password page");
            return false;
        }else{
            SeleniumDriverInstance.takeScreenShot("Successfully navigated to Forgot Password Page", false);
        }
        
        return true;
    }
        
        //Enters Username and clicks submit
        public boolean CompleteForm()
    {       
        //Waits for the H5 heading of Forgot Password
        if (!SeleniumDriverInstance.waitForElementByXpath(MixTelematics_PageObjects.ForgotPasswordH5HeadingXpath(),30))
        {
            err.println("[ERROR] Failed to validate the Forgot Password heading on the Forgot Password page");
            reportMessage = "Failed to validate the Forgot Password heading on the Forgot Password page";
            return false;
        }
        
        //Enters the username
        if(!SeleniumDriverInstance.enterTextByXpath(MixTelematics_PageObjects.ForgotPasswordUsernameInputXpath(), testData.getData("Username")))
        {
            err.println("[ERROR] Failed to enter the username by Xpath");
            return false;
        }
        
        //Clicks submit
        if(!SeleniumDriverInstance.clickElementbyXpath(MixTelematics_PageObjects.ForgotPasswordSubmitButtonXpath()))
        {
            err.println("[ERROR] Failed to click Submit button by Xpath");
            return false;
        }
        
        return true;
    }
        
    /*Validates that the forgot password process is complete by Looking for the thank you message that appears after
      you click submit*/
    public boolean ValidateForgotPasswordProccessComplete()
    {
        if(!SeleniumDriverInstance.waitForElementByXpath(MixTelematics_PageObjects.ForgotPasswordThankYouMessageXpath(), 30)){
            
            err.println("[ERROR] Failed to validate the Thank you message by Xpath");
            reportMessage = "Failed to validate the Thank you message by Xpath";
            SeleniumDriverInstance.takeScreenShot("Failed to validate the Thank you message by Xpath", true);
            return false;
        }
            
        return true;
    }
}
