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
import org.openqa.selenium.Keys;
/**
 *
 * @author kmanakaza
 */
public class Login_to_MixTelematicsClickLinks extends BaseClass{

     int counter = 1;

    TestEntity testData;
    boolean isNegative;

    public Login_to_MixTelematicsClickLinks(TestEntity testData) {
        this.testData = testData;
        
    }

    public TestResult executeTest() {

        this.setStartTime();
        
        String value = testData.getData("isNegative");
        
        if(value.equals("yes")){
            isNegative = true;
        }
        
        

        if (!NavigatetoMixTelematics()) 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to navigate to Mix Telematics URL", true);
            counter++;
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to navigate to Mix Telematics URL", this.getTotalExecutionTime());
        }
        
        if(isNegative)
        {
            //Do Required field validation
            if(!ValidateMandatoryFields())
            {
                SeleniumDriverInstance.takeScreenShot(counter + " - Failed to Validate Mandatory Fields", true);
                counter++;
                return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to Validate Mandatory Fields", this.getTotalExecutionTime());
            }

            //Do invalid email and password format validation
            
            if(!ValidateUsernameFormat())
            {
                SeleniumDriverInstance.takeScreenShot(counter + " - Failed to Validate Username Format", true);
                counter++;
                return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to Validate Username Format", this.getTotalExecutionTime());
            }
              //Incorrect Credentials
            if(!ValidateIncorrectUsername())
            {
                SeleniumDriverInstance.takeScreenShot(counter + " - Failed to Validate Incorrect Username permutation", true);
                counter++;
                return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to Validate Incorrect Username permutation", this.getTotalExecutionTime());
            }
            
            if(!ValidateIncorrectPassword())
            {
                SeleniumDriverInstance.takeScreenShot(counter + " - Failed to Validate Incorrect Password permutation", true);
                counter++;
                return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to Validate Password permutation", this.getTotalExecutionTime());
            }
            
            if(!ValidateIncorrectCredentials())
            {
                SeleniumDriverInstance.takeScreenShot(counter + " - Failed to Validate Incorrect Credentials", true);
                counter++;
                return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to Validate Incorrect Credentials", this.getTotalExecutionTime());
            }
            
    
                    //Sign in must be disabled at all times
            
        }
        else
        {
            if (!EnterCorrectCredentials()) 
            {
                SeleniumDriverInstance.takeScreenShot(counter + " - Failed to Enter Credentials", true);
                counter++;
                return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to Enter Credentials", this.getTotalExecutionTime());
            }
            
                        
            if(!ClickContactUsLink())
            {
                SeleniumDriverInstance.takeScreenShot(counter + " - Failed to Click on contact us page", true);
                counter++;
                return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on contact us link", this.getTotalExecutionTime());
            }
            
            
            if(!ValidateContactUsPage())
            {
                SeleniumDriverInstance.takeScreenShot(counter + " - Failed to Validate contact us page", true);
                counter++;
                return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to Validate contact us page", this.getTotalExecutionTime());
            }

        }

        return new TestResult(testData, Enums.ResultStatus.PASS, "Validated the web page contact us page successfully.", this.getTotalExecutionTime());
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
    
    public boolean ValidateMandatoryFields()
    {
        if (!SeleniumDriverInstance.clickElementbyXpath("//div/label[text()='USERNAME']/../div/input"))
        {
            return false;
        }
        
        SeleniumDriverInstance.pressKey(Keys.TAB);
            
        SeleniumDriverInstance.pressKey(Keys.TAB);

        if(!SeleniumDriverInstance.waitForElementByXpath("//div/label[text()='USERNAME']/../div/span[text()='This field is required']"))
        {
            err.println("[ERROR] Failed to validate required field error message for Username");
            return false;
        }else{
            SeleniumDriverInstance.takeScreenShot(counter + " - Validated required field error message for Username", false);
        }
        

       if(!SeleniumDriverInstance.waitForElementByXpath("//div/label[text()='PASSWORD']/../div/span[text()='This field is required']"))
        {
            err.println("[ERROR] Failed to validate required field error message for Password");
            return false;
        }else{
           SeleniumDriverInstance.takeScreenShot(counter + " - Validated required field error message for Password", false);
       }
       
       if(!SeleniumDriverInstance.getElementAttributeByXpath(MixTelematics_PageObjects.SignInButtonXpath(), "disabled").equals("true"))
        {
            err.println("[ERROR] Failed to validate sign-in button status as disabled");
            return false;
        }else{
           SeleniumDriverInstance.takeScreenShot(counter + " - Validated sign-in button status as disabled", false);
       }

        return true;
    }
    
    
     public boolean ValidateUsernameFormat()
    {
     
        if(!SeleniumDriverInstance.getElementAttributeByXpath(MixTelematics_PageObjects.SignInButtonXpath(), "disabled").equals("true"))
        {
            err.println("[ERROR] Failed to validate sign-in button status as disabled");
            return false;
        }else{
             SeleniumDriverInstance.takeScreenShot(counter + " - Validated sign-in button status as disabled", false);
        }
        
        if (!SeleniumDriverInstance.enterTextByXpath("//div/label[text()='USERNAME']/../div/input", testData.getData("IncorrectUsernameFormat")))
            return false;

        SeleniumDriverInstance.pressKey(Keys.TAB);
        
        if(!SeleniumDriverInstance.waitForElementByXpath("//div/label[text()='USERNAME']/../div/span[text()='The value must be a valid email address']"))
        {
            err.println("[ERROR] Failed to validate Username format error message");
            return false;
        }else{
            SeleniumDriverInstance.takeScreenShot(counter + " - Validated Username format error message", false);
        }
        
        
        if(!SeleniumDriverInstance.getElementAttributeByXpath(MixTelematics_PageObjects.SignInButtonXpath(), "disabled").equals("true"))
        {
            err.println("[ERROR] Failed to validate sign-in button status as disabled");
            return false;
        }else{
            SeleniumDriverInstance.takeScreenShot(counter + " - Validated sign-in button status as disabled", false);
        }
        
        return true;
    }
     
     //Inputs incorrect username and correct password
     public boolean ValidateIncorrectUsername()
    {
     
        SeleniumDriverInstance.clearTextByXpath("//div/label[text()='USERNAME']/../div/input");
        
        SeleniumDriverInstance.clearTextByXpath("//div/label[text()='PASSWORD']/../div/input");
        
        if (!SeleniumDriverInstance.enterTextByXpath("//div/label[text()='USERNAME']/../div/input", testData.getData("IncorrectUsername")))
            return false;
        else{
            SeleniumDriverInstance.takeScreenShot(counter + " - Entered username", false);
        }
        
        
        if (!SeleniumDriverInstance.enterTextByXpath("//div/label[text()='PASSWORD']/../div/input", testData.getData("Password")))
            return false;
        else{
            SeleniumDriverInstance.takeScreenShot(counter + " - Entered Password", false);
        }
        
        if (!SeleniumDriverInstance.clickElementbyXpath(MixTelematics_PageObjects.SignInButtonXpath()))
        {
            return false;
        }
        
        
        if(!SeleniumDriverInstance.waitForElementByXpath("//h5[text()='Failed to login']"))
        {
            err.println("[ERROR] Failed to validate login error message");
            return false;
        }else{
            SeleniumDriverInstance.takeScreenShot(counter + " - Validate login error message", false);
        }
        
        if (!SeleniumDriverInstance.clickElementbyXpath(MixTelematics_PageObjects.okButtonXpath()))
            return false;
        
        
        return true;
    }
     
     
       //Inputs correct username and incorrect password
     public boolean ValidateIncorrectPassword()
    {
     
        SeleniumDriverInstance.clearTextByXpath("//div/label[text()='USERNAME']/../div/input");
        
        SeleniumDriverInstance.clearTextByXpath("//div/label[text()='PASSWORD']/../div/input");
        
        if (!SeleniumDriverInstance.enterTextByXpath("//div/label[text()='USERNAME']/../div/input", testData.getData("Username")))
            return false;

        if (!SeleniumDriverInstance.enterTextByXpath("//div/label[text()='PASSWORD']/../div/input", testData.getData("IncorrectPassword")))
            return false;
        else{
            SeleniumDriverInstance.takeScreenShot(counter + " - Entered Username and Password", false);
        }
        
        
        if (!SeleniumDriverInstance.clickElementbyXpath(MixTelematics_PageObjects.SignInButtonXpath()))
        {
            return false;
        }
        
        
        if(!SeleniumDriverInstance.waitForElementByXpath("//h5[text()='Failed to login']"))
        {
            err.println("[ERROR] Failed to validate login error message");
            return false;
        }else{
            SeleniumDriverInstance.takeScreenShot(counter + " - Validate login error message", false);
        }
        
        if (!SeleniumDriverInstance.clickElementbyXpath(MixTelematics_PageObjects.okButtonXpath()))
            return false;
        
        return true;
    }
     
     //Incorrect username and incorrect password
     public boolean ValidateIncorrectCredentials()
    {
     
        SeleniumDriverInstance.clearTextByXpath("//div/label[text()='USERNAME']/../div/input");
        
        SeleniumDriverInstance.clearTextByXpath("//div/label[text()='PASSWORD']/../div/input");
        
        if (!SeleniumDriverInstance.enterTextByXpath("//div/label[text()='USERNAME']/../div/input", testData.getData("IncorrectUsername")))
            return false;
        
        SeleniumDriverInstance.takeScreenShot(counter + " - Entered Username", false);
       

        if (!SeleniumDriverInstance.enterTextByXpath("//div/label[text()='PASSWORD']/../div/input", testData.getData("IncorrectPassword")))
            return false;
        else{
            SeleniumDriverInstance.takeScreenShot(counter + " - Entered Username and Password", false);
        }

        SeleniumDriverInstance.takeScreenShot(counter + " - Entered Password", false);
        
        if (!SeleniumDriverInstance.clickElementbyXpath(MixTelematics_PageObjects.SignInButtonXpath()))
        {
            return false;
        }
        
        
        if(!SeleniumDriverInstance.waitForElementByXpath("//h5[text()='Failed to login']"))
        {
            err.println("[ERROR] Failed to validate login error message");
            return false;
        }else{
            SeleniumDriverInstance.takeScreenShot(counter + " - Error Message Appeared", false);
        }
        
        if (!SeleniumDriverInstance.clickElementbyXpath(MixTelematics_PageObjects.okButtonXpath()))
            return false;
        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot(counter + " - Validate Inorrect Credentials Completed", false);
        return true;
    }
     
     //ValidateIncorrectCredentials

    public boolean EnterCorrectCredentials()
    {
        //Check for language change
        boolean langaugeEnglish = SeleniumDriverInstance.waitForElementByXpath(MixTelematics_PageObjects.EnglishLanguageDropdownXpath(), 15);
        
        if(!langaugeEnglish){
            
            if (!SeleniumDriverInstance.selectByTextFromDropDownListusingXpath(MixTelematics_PageObjects.IgpayLanguageDropdownXpath(), testData.getData("Language")))
            return false;
        }
        else{
            
            //Enter Username
            if (!SeleniumDriverInstance.enterTextByXpath(MixTelematics_PageObjects.UsernameInputFieldXPath(), this.testData.getData("Username"))) 
              {
                  return false;
              }

              //Enter Password
              if (!SeleniumDriverInstance.enterTextByXpath(MixTelematics_PageObjects.PasswordInputFieldXPath(), (this.testData.getData("Password")))) 
              {
                  return false;
              } 

        }
        
        SeleniumDriverInstance.takeScreenShot("Successfully entered valid credentials", false);
        
        return true;
    }
    
    public boolean ClickContactUsLink()
    {
        //Click Contact Us link
        if (!SeleniumDriverInstance.moveToAndClickElementByXpath(MixTelematics_PageObjects.LoginContactUsXpath()))
        {
            err.println("[ERROR] Failed to click on 'CONTACT US'");
            return false;
        }
        
        SeleniumDriverInstance.takeScreenShot(counter + " - Clicked on CONTACT US", false);
        return true;
        
      
        
    }
    
        public boolean ValidateContactUsPage()
    { 
        
        String parentHandle = SeleniumDriverInstance.Driver.getWindowHandle();
        
        while(parentHandle.equalsIgnoreCase(SeleniumDriverInstance.Driver.getWindowHandle()))
        {
            for (String winHandle : SeleniumDriverInstance.Driver.getWindowHandles()) 
            {
                // switch focus of WebDriver to the next found window handle (that's your newly opened window)
                SeleniumDriverInstance.Driver.switchTo().window(winHandle); 
            }
        }
        
        if (!SeleniumDriverInstance.waitForElementByXpath(MixTelematics_PageObjects.ContactUs(), 20))
        {
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
