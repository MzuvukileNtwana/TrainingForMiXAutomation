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
import KeywordDrivenTestFramework.Testing.PageObjects.LanguagingAppliedOnAddLocationPageObject;
import KeywordDrivenTestFramework.Testing.PageObjects.MixTelematics_PageObjects;

/**
 *
 * @author arala
 */
public class LanguagingAppliedOnLocation_Login extends BaseClass
{
 int counter = 1;
    String rowNumber;
    int count=0;
    TestEntity testData;

    public LanguagingAppliedOnLocation_Login(TestEntity testData) 
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
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to Select Language From DropDown", true);
            counter++;
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to Select Language From DropDown", this.getTotalExecutionTime());
        }
        
        if (!fillInLoginCredentialsAndSignIn())
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to fill In Login Credentials", true);
            counter++;
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to fill In Login Credentials", this.getTotalExecutionTime());
        }
                
        if (!clickButtonSignIn())
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click SignIn button", true);
            counter++;
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click SignIn button", this.getTotalExecutionTime());
        }
       
        return new TestResult(testData, Enums.ResultStatus.PASS, "Successfully login into Mix Telematics  using language other than english", this.getTotalExecutionTime());
    }
    
    public boolean NavigatetoMixTelematics() 
    {
        //Navigates to Mix Telematics URL
        if (!SeleniumDriverInstance.navigateTo(MixTelematics_PageObjects.MixTelematicsURL())) 
        {
            return false;
        }

        //Take Screenshot
        SeleniumDriverInstance.waitForElementByXpath(MixTelematics_PageObjects.SignInButtonXpath(), 15);
        SeleniumDriverInstance.takeScreenShot(counter + " - Navigation toMix Telematics URL successful", false);
        counter++;

        return true;
    } 
    
    public boolean SelectLanguageFromDropDown()
    {
        
        SeleniumDriverInstance.waitForElementByXpath(MixTelematics_PageObjects.EnglishLanguageDropdownXpath(), 15);
        
        if (!SeleniumDriverInstance.selectByTextFromDropDownListusingXpath(MixTelematics_PageObjects.EnglishLanguageDropdownXpath(), testData.getData("Language")))
            return false;

        SeleniumDriverInstance.takeScreenShot(counter + " - Successfully selected language from dropdown list", false);
        return true;
    }
    
    public boolean fillInLoginCredentialsAndSignIn()
    {        
        if (!SeleniumDriverInstance.enterTextByXpath(LanguagingAppliedOnAddLocationPageObject.userNameXpath(), testData.getData("Username")))
            return false;
        if (!SeleniumDriverInstance.enterTextByXpath(LanguagingAppliedOnAddLocationPageObject.passwordXpath(), testData.getData("Password")))
        {
            return false;
        }
            SeleniumDriverInstance.takeScreenShot(counter + " - Entered Username and Password", false);
        return true;
    }
    
      public boolean clickButtonSignIn()
    {
         if (!SeleniumDriverInstance.clickElementbyXpath(LanguagingAppliedOnAddLocationPageObject.signInRelativeXpath()))
        {
            return false;
        }
        SeleniumDriverInstance.takeScreenShot(counter + " - Successfully click button sign-in", false);
        return true;
    }
    
}

