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
 * @author nmayekiso
 */
public class Login_LookandFeel extends BaseClass{
    
    int counter = 1;
    TestEntity testData;
    String error = "";
    
    public Login_LookandFeel(TestEntity testData) {
        this.testData = testData;
    }
    
    public TestResult executeTest()
    {    
        this.setStartTime();
        
        if (!NavigatetoMixTelematics()) 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to navigate to Mix Telematics URL", true);
            counter++;
            narrator.failedMessage("Failed to navigate to Mix Telematics URL - "+error);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to navigate to Mix Telematics URL", this.getTotalExecutionTime());
        }
        
        if (!ValidateMixTelematicsLogo()) 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to validate MixTelematics Logo", true);
            counter++;
            narrator.failedMessage("Failed to validate MixTelematics Logo - "+error);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to validate MixTelematics Logo", this.getTotalExecutionTime());
        }
        
        if (!ValidateLoginHeader()) 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to validate login header", true);
            counter++;
            narrator.failedMessage("Failed to validate login header - "+error);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to validate login header", this.getTotalExecutionTime());
        }
        
        if (!ClickOnLanguageDropdown()) 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click Language Dropdown", true);
            counter++;
            narrator.failedMessage("Failed to click Language Dropdown - "+error);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click Language Dropdown", this.getTotalExecutionTime());
        }
        
        if (!ClickKeepMeSignedInCheckbox()) 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click 'KEEP ME SIGNED IN' checkbox", true);
            counter++;
            narrator.failedMessage("Failed to click 'KEEP ME SIGNED IN' checkbox - "+error);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click 'KEEP ME SIGNED IN' checkbox", this.getTotalExecutionTime());
        }
        
        if (!ClickSignInButton()) 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to Click Sign In Button", true);
            counter++;
            narrator.failedMessage("ClickSignInButton - "+error);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "ClickSignInButton", this.getTotalExecutionTime());
        }
        
        if (!ValidateEmptyTextboxes()) 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to Validate Empty Textboxes", true);
            counter++;
            narrator.failedMessage("Failed to Validate Empty Textboxes - "+error);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to Validate Empty Textboxes", this.getTotalExecutionTime());
        }
        
        if (!ClickOnForgotPasswordLink()) 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on 'CLICK HERE'", true);
            counter++;
            narrator.failedMessage("Failed to click on 'CLICK HERE - "+error);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on 'CLICK HERE'", this.getTotalExecutionTime());
        }
        
        if (!EnterCorrectCredentials()) 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to Enter Credentials", true);
            counter++;
            narrator.failedMessage("Failed to Enter Credentials - "+error);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to Enter Credentials", this.getTotalExecutionTime());
        }
        
        if (!ClickOnContactUsLink()) 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on 'CONTACT US'", true);
            counter++;
            narrator.failedMessage("Failed to click on 'CONTACT US' - "+error);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on 'CONTACT US'", this.getTotalExecutionTime());
        }
        
        if (!ValidateContactUsPage()) 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to Validate Contact Us Page", true);
            counter++;
            narrator.failedMessage("Failed to Validate Contact Us Page - "+error);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to Validate Contact Us Page", this.getTotalExecutionTime());
        }
                
        return new TestResult(testData, Enums.ResultStatus.PASS, "Successfully Navigated and Validated Login Look and Feel: Design elements, Logo's, Clickable Links/ Dropdowns/ Tick boxes, Empty Username & Password text box, Links takes the user to the relevant page.", this.getTotalExecutionTime());
    }
    
    public boolean NavigatetoMixTelematics() 
    {
        //Navigates to Mix Telematics URL
        if (!SeleniumDriverInstance.navigateTo(MixTelematics_PageObjects.MixTelematicsURL()))
        {
            error = "Failed to navigate to Mix Telematics URL";
            return false;
        }

        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot(counter + " - Navigation to Mix Telematics URL successful", false);
        counter++;

        return true;
    }
    
    public boolean ValidateMixTelematicsLogo()
    {
        //Wait for MixTelematics Logo
        if (!SeleniumDriverInstance.waitForElementByXpath(MixTelematics_PageObjects.MixTelematicsLogoXpath(), 90))
        {
            error = "Failed to wait for Mix Telematics Logo";
            return false;
        }
        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("Successfully validated Mix Telematics logo", false);
        return true;
    }
    
    public boolean ValidateLoginHeader()
    {
        //Wait for Login header
         if (!SeleniumDriverInstance.waitForElementByXpath(MixTelematics_PageObjects.LoginHeaderXpath(), 90))
        {
            error = "Failed to wait for Login header";
            return false;
        }
        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("Successfully validated login header", false);
        return true;
    }
    
    public boolean ClickOnLanguageDropdown()
    {
        //Click Language dropdown
        if (!SeleniumDriverInstance.clickElementbyXpath(MixTelematics_PageObjects.EnglishLanguageDropdownXpath()))
        {
            error = "Failed to click English on language dropdown";
            return false;
        }
        SeleniumDriverInstance.waitForElementByXpath(MixTelematics_PageObjects.EnglishOptionDropdownXpath(), 90);
        SeleniumDriverInstance.clickElementbyXpath(MixTelematics_PageObjects.EnglishLanguageDropdownXpath());
        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("Successfully Clicked on Language Dropdown", false);
        return true;
    }
    
    public boolean ClickKeepMeSignedInCheckbox()
    {           
        if (!SeleniumDriverInstance.clickElementbyXpath(MixTelematics_PageObjects.LoginKeepMeSignIn()))
        {
            error = "Failed to click 'KEEP ME SIGNED IN' checkbox";
            err.println("[ERROR] Failed to click 'KEEP ME SIGNED IN' checkbox");
            return false;
        }
        
        SeleniumDriverInstance.takeScreenShot(counter + " - Clicked 'KEEP ME SIGNED IN' checkbox", false);
        return true;
    }
    
    public boolean ClickSignInButton()
    {           
        if (!SeleniumDriverInstance.clickElementbyXpath(MixTelematics_PageObjects.SignInButtonXpath()))
        {
            error = "Failed to click 'Sign In' button";
            err.println("[ERROR] Failed to click 'Sign In' button");
            return false;
        }
        SeleniumDriverInstance.waitForElementByXpath(MixTelematics_PageObjects.SignInModalOKXpath(), 15);
        SeleniumDriverInstance.clickElementByXpath(MixTelematics_PageObjects.SignInModalOKXpath());
        SeleniumDriverInstance.takeScreenShot(counter + " - Clicked 'Sign In' button", false);
        return true;
    }
    
    public boolean ClickOnForgotPasswordLink()
    {           
        if (!SeleniumDriverInstance.waitForElementByXpath(MixTelematics_PageObjects.LoginForgotPasswordXpath(),30))
        {
            error = "Failed to wait for Forgot password 'CLICK HERE' link";
            err.println("[ERROR] Failed to wait for Forgot password 'CLICK HERE' link");
            return false;
        }
        if (!SeleniumDriverInstance.clickElementbyXpath(MixTelematics_PageObjects.LoginForgotPasswordXpath()))
        {
            error = "Failed to click on Forgot password'CLICK HERE'";
            err.println("[ERROR] Failed to click on Forgot password 'CLICK HERE'");
            return false;
        }
        SeleniumDriverInstance.waitForElementByXpath(MixTelematics_PageObjects.ClickHereModalCancelXpath(), 15);
        SeleniumDriverInstance.clickElementByXpath(MixTelematics_PageObjects.ClickHereModalCancelXpath());
        SeleniumDriverInstance.takeScreenShot(counter + " - Clicked on 'CLICK HERE'", false);
        return true;
    }
    
    public boolean EnterCorrectCredentials()
    {

        //Enter Username
        SeleniumDriverInstance.waitForElementByXpath(MixTelematics_PageObjects.UsernameInputFieldXPath(), 45);

        
        SeleniumDriverInstance.clickElementbyXpath(MixTelematics_PageObjects.UsernameInputFieldXPath());
        
        if (!SeleniumDriverInstance.enterTextByXpath(MixTelematics_PageObjects.UsernameInputFieldXPath(), this.testData.getData("Username")))
        {
            error = "Failed to enter Username";
            return false;
        }
        
        //Enter Password
        if(!SeleniumDriverInstance.enterTextByXpath(MixTelematics_PageObjects.PasswordInputFieldXPath(), this.testData.getData("Password")))
        {
            error = "Failed to enter Password";
            return false;
        }else{
            SeleniumDriverInstance.takeScreenShot("Entered sign in credentials", false);
        }
        

        
        return true;
    }
    
    public boolean ClickOnContactUsLink()
    {  
        if (!SeleniumDriverInstance.moveToAndClickElementByXpath(MixTelematics_PageObjects.LoginContactUsXpath()))
        {
            error = "Failed to click on 'CONTACT US'";
            err.println("[ERROR] Failed to click on 'CONTACT US'");
            return false;
        }
        
        SeleniumDriverInstance.takeScreenShot(counter + " - Clicked on 'CONTACT US'", false);
        return true;
    }
    
    public boolean ValidateEmptyTextboxes()
    {    
        String usernameInputField = SeleniumDriverInstance.getElementTextByXpath(MixTelematics_PageObjects.UsernameInputFieldXPath());
        String passwordInputField = SeleniumDriverInstance.getElementTextByXpath(MixTelematics_PageObjects.PasswordInputFieldXPath());
        if (!usernameInputField.equals(""))
        {
            error = "Failed to validate Username Input Field";
            err.println("[ERROR] Failed to validate Username Input Field");
            return false;
        }
        
        if (!passwordInputField.equals(""))
        {
            error = "Failed to validate Password Input Field";
            err.println("[ERROR] Failed to validate Password Input Field");
            return false;
        }
        
        SeleniumDriverInstance.takeScreenShot(counter + " - Validated Username and Password Input Field", false);
        return true;
    }
    
    
    
    public boolean ValidateContactUsPage()
    {        

         // get the current window handle
         String parentHandle = SeleniumDriverInstance.Driver.getWindowHandle(); 
          while(parentHandle.equalsIgnoreCase(SeleniumDriverInstance.Driver.getWindowHandle()))
        {
            for (String winHandle : SeleniumDriverInstance.Driver.getWindowHandles()) {

                // switch focus of WebDriver to the next found window handle (that's your newly opened window)
                SeleniumDriverInstance.Driver.switchTo().window(winHandle); 
            }
        }
  
          

//        SeleniumDriverInstance.switchTo().window("");
//            SeleniumDriverInstance.closeCurrentTab();
//            SeleniumDriverInstance.switchToNewTab();
        
        if (!SeleniumDriverInstance.waitForElementByXpath("//h1[contains(text(),'Contact Us')]", 10))
        {
            error = "Failed to validate contact us link";
            err.println("[ERROR] Failed to validate contact us link");
            return false;
        }
        if (browserType.name().equals("Chrome"))
        {
            SeleniumDriverInstance.moveToNewTab();
            SeleniumDriverInstance.pause(1000);
            SeleniumDriverInstance.takeScreenShot("Validated the web page contact us page successfully", false);
        }
        else
        {
            SeleniumDriverInstance.pause(1000);
            SeleniumDriverInstance.takeScreenShot("Validated the web page contact us page successfully", false);
        }
        return true;
    }
    
    
}
