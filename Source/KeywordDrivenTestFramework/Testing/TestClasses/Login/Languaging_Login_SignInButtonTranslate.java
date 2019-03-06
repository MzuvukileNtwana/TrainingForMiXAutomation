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
public class Languaging_Login_SignInButtonTranslate extends BaseClass{
    
    int counter = 1;
    TestEntity testData;

    public Languaging_Login_SignInButtonTranslate(TestEntity testData) {
        this.testData = testData;
    }
    
    public TestResult executeTest()
    {
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
        
        if (!ValidateTranslatedText())
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to Validate Translated Text", true);
            counter++;
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to Validate Translated Text", this.getTotalExecutionTime());
        }
                
        if (!clickButtonSignIn())
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to clickButtonSignIn", true);
            counter++;
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to clickButtonSignIn", this.getTotalExecutionTime());
        }
        
        return new TestResult(testData, Enums.ResultStatus.PASS, "Successfully Translated Sign In Button .", this.getTotalExecutionTime());
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
    
    public boolean ValidateTranslatedText()
    {        
        
        if(browserType.equals(browserType.IE))
        {
                       
             if (!SeleniumDriverInstance.enterTextByXpath(MixTelematics_PageObjects.UsernameXpath(testData.getData("Username_label_Identifier")), testData.getData("Username")))
            return false;

            if (!SeleniumDriverInstance.enterTextByXpath(MixTelematics_PageObjects.PasswordInputFieldXPath(testData.getData("password_label_Identifier")), testData.getData("Password")))
                return false;
            else{
                SeleniumDriverInstance.takeScreenShot(counter + " - Entered Username and Password", false);
            }
        
        }
        else
        {
                if (!SeleniumDriverInstance.moveToAndEnterTextByXpath(MixTelematics_PageObjects.UsernameXpath(testData.getData("Username_label_Identifier")), testData.getData("Username")))
                    return false;

                if (!SeleniumDriverInstance.moveToAndEnterTextByXpath(MixTelematics_PageObjects.PasswordInputFieldXPath(testData.getData("password_label_Identifier")), testData.getData("Password")))
                    return false;
                else{
                    SeleniumDriverInstance.takeScreenShot(counter + " - Entered Username and Password", false);
                }

                if (!SeleniumDriverInstance.waitForElementByXpath(MixTelematics_PageObjects.PigLatinSignInButtonXpath(testData.getData("ExpectedText")), 10))
                {
                    testData.extractParameter("Selected Language: "+testData.getData("Language"), "Expected Button Text: "+testData.getData("ExpectedText"), "FAIL");
                    err.println("[ERROR] Failed to validate pig latin text sign in button");
                    return false;
                }
        }
        
        testData.extractParameter("Selected Language: "+testData.getData("Language"), "Expected Button Text: "+testData.getData("ExpectedText"), "PASS");
        SeleniumDriverInstance.takeScreenShot(counter + " - Validated pig latin text sign in button", false);
        return true;
    }
    
    public boolean clickButtonSignIn()
    {
         if (!SeleniumDriverInstance.clickElementbyXpath(MixTelematics_PageObjects.PigLatinSignInButtonXpath(testData.getData("ExpectedText"))))
        {
            testData.extractParameter("Selected Language: "+testData.getData("Language"), "Expected Button Text: "+testData.getData("ExpectedText"), "FAIL");
            err.println("[ERROR] Failed to validate "+testData.getData("Language")+" text sign in button");
            return false;
        }
       
        SeleniumDriverInstance.takeScreenShot(counter + " - Successfully click button sign-in", false);
        return true;
    }
}
