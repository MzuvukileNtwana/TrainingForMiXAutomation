/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.TestClasses.Login;

import KeywordDrivenTestFramework.Core.BaseClass;
import static KeywordDrivenTestFramework.Core.BaseClass.SeleniumDriverInstance;
import static KeywordDrivenTestFramework.Core.BaseClass.browserType;
import KeywordDrivenTestFramework.Entities.Enums;
import KeywordDrivenTestFramework.Entities.TestEntity;
import KeywordDrivenTestFramework.Entities.TestResult;
import KeywordDrivenTestFramework.Testing.PageObjects.MixTelematics_PageObjects;
import KeywordDrivenTestFramework.Testing.PageObjects.UsabilityAssetPageObjects;

/**
 *
 * @author elebese
 */
public class LogInNewUserValidation extends BaseClass
{
    int counter = 1;

    TestEntity testData;
    

    public LogInNewUserValidation(TestEntity testData) 
    {
        this.testData = testData;
    }
    
    public TestResult executeTest() 
    {

        this.setStartTime();

        if (!NavigatetoMixTelematics()) 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to navigate to Mix Telematics URL", true);
            counter++;
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to navigate to Mix Telematics URL", this.getTotalExecutionTime());
        }
        
        if (!SelectLanguageFromDropDown()) 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to Select English", true);
            counter++;
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to Select English", this.getTotalExecutionTime());
        }
        if (!EnterCorrectCredentials()) 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to Enter Credentials", true);
            counter++;
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to Enter Credentials", this.getTotalExecutionTime());
        }

        if (!ClickSignIn()) 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click sign in button", true);
            counter++;
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click sign in button", this.getTotalExecutionTime());
        }

        if (!ValidateLandingPage()) 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to Validate Landing Page", true);
            counter++;
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to Validate Landing Page", this.getTotalExecutionTime());

        }


        return new TestResult(testData, Enums.ResultStatus.PASS, "Successfully checked login validation rules.", this.getTotalExecutionTime());
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
    
    public boolean SelectLanguageFromDropDown()
    {
        
        SeleniumDriverInstance.waitForElementByXpath(MixTelematics_PageObjects.EnglishLanguageDropdownXpath(), 60);
        
        if (!SeleniumDriverInstance.selectByTextFromDropDownListusingXpath(MixTelematics_PageObjects.EnglishLanguageDropdownXpath(), "English"))
            return false;

        SeleniumDriverInstance.takeScreenShot(counter + " - Successfully selected language from dropdown list", false);
        return true;
    }
    
     //ValidateIncorrectCredentials
    public boolean EnterCorrectCredentials() 
    {

        //Enter Username
        SeleniumDriverInstance.waitForElementByXpath(MixTelematics_PageObjects.UsernameInputFieldXPath(), 45);

        SeleniumDriverInstance.clickElementbyXpath(MixTelematics_PageObjects.UsernameInputFieldXPath());

        if (!SeleniumDriverInstance.enterTextByXpath(MixTelematics_PageObjects.UsernameInputFieldXPath(), this.testData.getData("Username"))) 
        {
            return false;
        }

        //Enter Password
        if (!SeleniumDriverInstance.enterTextByXpath(MixTelematics_PageObjects.PasswordInputFieldXPath(), this.testData.getData("Password"))) 
        {
            return false;
        } else 
        {
            SeleniumDriverInstance.takeScreenShot("Entered sign in credentials", false);
        }

        return true;
    }

    public boolean ClickSignIn() 
    {
        //Click Sign in Button
        if (!SeleniumDriverInstance.clickElementbyXpath(MixTelematics_PageObjects.SignInButtonXpath())) 
        {
            return false;
        }

        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("Successfully Clicked Sign in on Mix Telematics", false);
        return true;
    }

    public boolean ValidateLandingPage() 
    {
        //Waits for the table to be finnish loading
        if (!SeleniumDriverInstance.waitForElementByXpath(UsabilityAssetPageObjects.TableLoadingSpinnerNewUserXpath(), 30)) 
        {
            testData.extractParameter("Actual Result:", "Failed to validat that the table has loaded", "FAIL");
            return false;
        }
        
        //Waits for the table to be finnish loading
        if (!SeleniumDriverInstance.waitForElementByXpath(UsabilityAssetPageObjects.TableLoadingSpinnerNewUserXpath(), 30)) 
        {
            testData.extractParameter("Actual Result:", "Failed to validat that the table has loaded", "FAIL");
            return false;
        }

        //Validate Asset Label appears on the landing page //span[text()='Assets']
        if (!SeleniumDriverInstance.waitForElementByXpath(MixTelematics_PageObjects.DatabaseAdministrationXpath())) 
        {
            testData.extractParameter("Actual Result:", "Failed to validate that the", "FAIL");
            return false;
        }
        
        if (browserType != Enums.BrowserType.IE && !SeleniumDriverInstance.Driver.getCurrentUrl().contains("administration-landing")) 
        {
            return false;
        }
        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("Successfully validated the landing page", false);
        return true;
    }

    public void clearUsernameAndPasswordInputFields() 
    {
        SeleniumDriverInstance.clearTextByXpath(MixTelematics_PageObjects.UsernameInputFieldXPath());

        SeleniumDriverInstance.clearTextByXpath(MixTelematics_PageObjects.PasswordInputFieldXPath());
    }
}
