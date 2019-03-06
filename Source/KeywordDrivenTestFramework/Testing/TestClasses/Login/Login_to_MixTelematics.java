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
import KeywordDrivenTestFramework.Testing.PageObjects.UsabilityAssetPageObjects;
import static java.lang.System.err;
import static java.lang.System.out;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

/**
 *
 * @author fnell
 */
public class Login_to_MixTelematics extends BaseClass 
{

    int counter = 1, i=0;;
    String error = "";
    TestEntity testData;
    boolean isNegative;
    String userName, Password;

    public Login_to_MixTelematics(TestEntity testData) 
    {
        this.testData = testData;

    }
    
    public Login_to_MixTelematics() { }

    public TestResult executeTest() throws InterruptedException 
    {

        this.setStartTime();

        String value = testData.getData("isNegative");

        if (value.equals("yes")) {
            isNegative = true;
        }
        
        if (!NavigatetoMixTelematics()) 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to navigate to Mix Telematics URL", true);
            counter++;
            narrator.failedMessage("Failed to navigate to Mix Telematics URL - "+error);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to navigate to Mix Telematics URL", this.getTotalExecutionTime());
        }
        while(!SeleniumDriverInstance.waitForElementByXpathVisibility(MixTelematics_PageObjects.UsernameInputFieldXPath(),10))
        {
            if(i>3)
            {
                break;
            }
            System.out.println("Renavigating" +i);
            i++;
            NavigatetoMixTelematics();
        }
        pause(5000);
        if (isNegative) 
        {
            //Do Required field validation
            if (!ValidateMandatoryFields()) 
            {
                SeleniumDriverInstance.takeScreenShot(counter + " - Failed to Validate Mandatory Fields", true);
                counter++;
                narrator.failedMessage("Failed to Validate Mandatory Fields - "+error);
                return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to Validate Mandatory Fields", this.getTotalExecutionTime());
            }

            //Do invalid email and password format validation
            if (!ValidateUsernameFormat()) 
            {
                SeleniumDriverInstance.takeScreenShot(counter + " - Failed to Validate Username Format", true);
                counter++;
                narrator.failedMessage("Failed to Validate Username Format - "+error);
                return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to Validate Username Format", this.getTotalExecutionTime());
            }

            //Incorrect Credentials
            if (!ValidateIncorrectUsername()) 
            {
                SeleniumDriverInstance.takeScreenShot(counter + " - Failed to Validate Incorrect Username permutation", true);
                counter++;
                narrator.failedMessage("Failed to Validate Incorrect Username permutation - "+error);
                return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to Validate Incorrect Username permutation", this.getTotalExecutionTime());
            }

            if (!ValidateIncorrectPassword()) 
            {
                SeleniumDriverInstance.takeScreenShot(counter + " - Failed to Validate Incorrect Password permutation", true);
                counter++;
                narrator.failedMessage("Failed to Validate Password permutation - "+error);
                return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to Validate Password permutation", this.getTotalExecutionTime());
            }

            if (!ValidateIncorrectCredentials()) 
            {
                SeleniumDriverInstance.takeScreenShot(counter + " - Failed to Validate Incorrect Credentials", true);
                counter++;
                narrator.failedMessage("Failed to Validate Incorrect Credentials - "+error);
                return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to Validate Incorrect Credentials", this.getTotalExecutionTime());
            }

            //Sign in must be disabled at all times
        } else 
        {
            if (!SelectLanguageFromDropDown()) 
            {
                SeleniumDriverInstance.takeScreenShot(counter + " - Failed to Select English", true);
                counter++;
                narrator.failedMessage("Failed to Select English - "+error);
                return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to Select English", this.getTotalExecutionTime());
            }
            if (!EnterCorrectCredentials()) 
            {
                SeleniumDriverInstance.takeScreenShot(counter + " - Failed to Enter Credentials", true);
                counter++;
                narrator.failedMessage("Failed to Enter Credentials - "+error);
                return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to Enter Credentials", this.getTotalExecutionTime());
            }

            if (!ClickSignIn()) 
            {
                SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click sign in button", true);
                counter++;
                narrator.failedMessage("Failed to click sign in button - "+error);
                return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click sign in button", this.getTotalExecutionTime());
            }
            if(!SeleniumDriverInstance.waitForElementByXpath(UsabilityAssetPageObjects.TableLoadingSpinnerXpath(),5)) 
            {
                SeleniumDriverInstance.clickElementByXpath("(//A[@href='#'])[1]");
                Thread.sleep(1000);
                SeleniumDriverInstance.clickElementByXpath("//A[@ng-href='#/fleet-admin/assets'][text()='Assets']");                
            }    
            if (!ValidateLandingPage()) 
            {
                SeleniumDriverInstance.takeScreenShot(counter + " - Failed to Validate Landing Page", true);
                counter++;
                narrator.failedMessage("Failed to Validate Landing Page - "+error);
                //return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to Validate Landing Page", this.getTotalExecutionTime());

            }
        }

        return new TestResult(testData, Enums.ResultStatus.PASS, "Successfully checked login validation rules.", this.getTotalExecutionTime());
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
        SeleniumDriverInstance.takeScreenShot(counter + " - Navigation toMix Telematics URL successful", false);
        counter++;

        return true;
    }

    public boolean ValidateMandatoryFields() {
        SeleniumDriverInstance.waitForElementByXpath(MixTelematics_PageObjects.UsernameInputFieldXPath(),90);
        if (!SeleniumDriverInstance.clickElementbyXpath(MixTelematics_PageObjects.UsernameInputFieldXPath())) 
        {
            error = "Failed to click on username input field";
            return false;
        }

        SeleniumDriverInstance.pressKey(Keys.TAB);

        SeleniumDriverInstance.pressKey(Keys.TAB);

        if (!SeleniumDriverInstance.waitForElementByXpathVisibility(MixTelematics_PageObjects.UsernameEmptyFieldMessageXPath())) 
        {
            error = "Failed to validate required field error message for Username";
            err.println("[ERROR] Failed to validate required field error message for Username");
            return false;
        } else 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Validated required field error message for Username", false);
        }

        if (!SeleniumDriverInstance.waitForElementByXpathVisibility(MixTelematics_PageObjects.PasswordEmptyFieldMessageXPath())) 
        {
            error = "Failed to validate required field error message for Password";
            err.println("[ERROR] Failed to validate required field error message for Password");
            return false;
        } else 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Validated required field error message for Password", false);

        }

        return true;
    }

    public boolean ValidateUsernameFormat() 
    {

        if (!SeleniumDriverInstance.enterTextByXpath(MixTelematics_PageObjects.UsernameInputFieldXPath(), testData.getData("IncorrectUsernameFormat"))) 
        {
            error = "Failed to enter Incorrect username - "+testData.getData("IncorrectUsernameFormat");
            return false;
        }

        SeleniumDriverInstance.pressKey(Keys.TAB);

        if (!SeleniumDriverInstance.waitForElementByXpathVisibility(MixTelematics_PageObjects.UsernameIncorrectFormatMessageXPath())) 
        {
            error = "Failed to validate Username format error message";
            err.println("[ERROR] Failed to validate Username format error message");
            return false;
        } else 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Validated Username format error message", false);
        }

        return true;
    }

    //Inputs incorrect username and correct password
    public boolean ValidateIncorrectUsername() 
    {

        clearUsernameAndPasswordInputFields();

        if (!SeleniumDriverInstance.enterTextByXpath(MixTelematics_PageObjects.UsernameInputFieldXPath(), testData.getData("IncorrectUsername"))) 
        {
            error = "Failed to enter incorrect username1 - "+testData.getData("IncorrectUsername");
            return false;
        } else 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Entered username", false);
        }

        if (!SeleniumDriverInstance.enterTextByXpath(MixTelematics_PageObjects.PasswordInputFieldXPath(), testData.getData("Password"))) 
        {
            error = "Failed to enter password " + testData.getData("Password");
            return false;
        } else 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Entered Password", false);
        }

        if (!SeleniumDriverInstance.clickElementbyXpath(MixTelematics_PageObjects.SignInButtonXpath())) 
        {
            error = "Failed to click Sign In button";
            return false;
        }

        if (!SeleniumDriverInstance.waitForElementByXpathVisibility(MixTelematics_PageObjects.FailedToLoginMessageXPath())) 
        {
            error = "Failed to validate login error message, for incorrect username";
            err.println("[ERROR] Failed to validate login error message, for incorrect username");
            return false;
        } else 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Validate login error message", false);
        }

        if (!SeleniumDriverInstance.clickElementbyXpath(MixTelematics_PageObjects.okButtonXpath())) 
        {
            error = "Failed to click OK button";
            return false;
        }

        return true;
    }

    //Inputs correct username and incorrect password
    public boolean ValidateIncorrectPassword() 
    {

        clearUsernameAndPasswordInputFields();

        if (!SeleniumDriverInstance.enterTextByXpath(MixTelematics_PageObjects.UsernameInputFieldXPath(), testData.getData("Username"))) 
        {
            error = "Failed to enter username";
            return false;
        }

        if (!SeleniumDriverInstance.waitForElementByXpath(MixTelematics_PageObjects.PasswordInputFieldXPath(), 30)) 
        {
            error = "Failed to wait for Incorrect Password";
            return false;
        } else 
        if (!SeleniumDriverInstance.enterTextByXpath(MixTelematics_PageObjects.PasswordInputFieldXPath(), testData.getData("IncorrectPassword"))) 
        {
            error = "Failed to enter Incorrect Password";
            return false;
        } else 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Entered Username and Password", false);
        }

        SeleniumDriverInstance.pause(2500);
        if (!SeleniumDriverInstance.waitForElementByXpath(MixTelematics_PageObjects.SignInButtonXpath(),60)) 
        {
            if (!SeleniumDriverInstance.waitForElementByXpath(MixTelematics_PageObjects.SignInButtonXpath()))
            {
                error = "Failed to wait for Sign In Button1";
                return false;
            }
        }
        if (!SeleniumDriverInstance.clickElementbyXpath(MixTelematics_PageObjects.SignInButtonXpath())) 
        {
            error = "Failed to click Sign In Button1";
            return false;
        }

        if (!SeleniumDriverInstance.waitForElementByXpath(MixTelematics_PageObjects.FailedToLoginMessageXPath())) 
        {
            error = "Failed to validate login error message for Incorrect password";
            err.println("[ERROR] Failed to validate login error message for incorrect password");
            return false;
        } else 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Validate login error message", false);
        }

        if (!SeleniumDriverInstance.clickElementbyXpath(MixTelematics_PageObjects.okButtonXpath())) 
        {
            error = "Failed to click Ok button(Incorrect password)";
            return false;
        }

        return true;
    }

    //Incorrect username and incorrect password
    public boolean ValidateIncorrectCredentials() 
    {

        clearUsernameAndPasswordInputFields();

        if (!SeleniumDriverInstance.enterTextByXpath(MixTelematics_PageObjects.UsernameInputFieldXPath(), testData.getData("IncorrectUsername"))) 
        {
            error = "Failed to enter incorrect username2";
            return false;
        }

        SeleniumDriverInstance.takeScreenShot(counter + " - Entered Username", false);

        if (!SeleniumDriverInstance.enterTextByXpath(MixTelematics_PageObjects.PasswordInputFieldXPath(), testData.getData("IncorrectPassword"))) 
        {
            error = "Failed to enter incorrect password2";
            return false;
        } else 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Entered Username and Password", false);
        }

        SeleniumDriverInstance.takeScreenShot(counter + " - Entered Password", false);

        if (!SeleniumDriverInstance.clickElementbyXpath(MixTelematics_PageObjects.SignInButtonXpath())) 
        {
            error = "Failed to click Sign in button(Incorrect Username and Incorrect password)";
            return false;
        }

        if (!SeleniumDriverInstance.waitForElementByXpath(MixTelematics_PageObjects.FailedToLoginMessageXPath())) 
        {
            error = "Failed to validate login error message3";
            err.println("[ERROR] Failed to validate login error message3");
            return false;
        } else 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Error Message Appeared", false);
        }

        if (!SeleniumDriverInstance.clickElementbyXpath(MixTelematics_PageObjects.okButtonXpath())) 
        {
            error = "Failed to click OK button3";
            return false;
        }

        SeleniumDriverInstance.takeScreenShot(counter + " - Validate Inorrect Credentials Completed", false);
        return true;
    }

    
     public boolean SelectLanguageFromDropDown()
    {
      
          
        SeleniumDriverInstance.waitForElementByXpathVisibility(MixTelematics_PageObjects.EnglishLanguageDropdownXpath(), 60);
        
        SeleniumDriverInstance.pause(1000);
        if (!SeleniumDriverInstance.selectByTextFromDropDownListusingXpath(MixTelematics_PageObjects.EnglishLanguageDropdownXpath(), "English"))
        {
            error = "Failed to select English language";
            return false;
        }

        SeleniumDriverInstance.takeScreenShot(counter + " - Successfully selected language from dropdown list", false);
        return true;
    }
    
     //ValidateIncorrectCredentials
    public boolean EnterCorrectCredentials() 
    {
        
       
        if(customInputParameters != null && customInputParameters.containsKey("Username"))
        {    
            userName = customInputParameters.get("Username");
            out.println("[INFO] Overriding Test Pack Username with Custom Input Parameter..." + userName);
        }
        else
            userName = this.testData.getData("Username");
        
        if(customInputParameters != null && customInputParameters.containsKey("Password"))
        {
            Password = customInputParameters.get("Password");
            out.println("[INFO] Overriding Test Pack Password with Custom Input Parameter..." + Password);
        }
        else
            Password = this.testData.getData("Password");
                    
                    
        //Enter Username
        SeleniumDriverInstance.waitForElementByXpathVisibility(MixTelematics_PageObjects.UsernameInputFieldXPath(), 60);

        SeleniumDriverInstance.clickElementbyXpath(MixTelematics_PageObjects.UsernameInputFieldXPath());

        if (!SeleniumDriverInstance.enterTextByXpath(MixTelematics_PageObjects.UsernameInputFieldXPath(), userName)) 
        {
            error = "Failed to enter correct username4";
            return false;
        }

        //Enter Password
        if (!SeleniumDriverInstance.enterTextByXpath(MixTelematics_PageObjects.PasswordInputFieldXPath(), Password)) 
        {
            error = "Failed to enter correctpassword4";
            return false;
        } else 
        {
            SeleniumDriverInstance.takeScreenShot("Entered sign in credentials", false);
        }

        return true;
    }

    public boolean ClickSignIn() 
    {   
        //Check if username was entered
        SeleniumDriverInstance.waitForElementByXpath(MixTelematics_PageObjects.UsernameInputFieldXPath(),90);
        if(!SeleniumDriverInstance.Driver.findElement(By.xpath(MixTelematics_PageObjects.UsernameInputFieldXPath())).getAttribute("value").contains(userName))
        {
            SeleniumDriverInstance.clickElementbyXpath(MixTelematics_PageObjects.UsernameInputFieldXPath());
            SeleniumDriverInstance.clearExistingTextByXpath(MixTelematics_PageObjects.UsernameInputFieldXPath());
            SeleniumDriverInstance.clearExistingTextByXpath(MixTelematics_PageObjects.PasswordInputFieldXPath());
            if (!SeleniumDriverInstance.enterTextByXpath(MixTelematics_PageObjects.UsernameInputFieldXPath(), userName)) 
            {
                error = "Failed to enter correct username4";
                return false;
            }
            if (!SeleniumDriverInstance.enterTextByXpath(MixTelematics_PageObjects.PasswordInputFieldXPath(), Password)) 
            {
                error = "Failed to enter correctpassword4";
                return false;
            }
        }
                
        //Click Sign in Button
        if (!SeleniumDriverInstance.clickElementbyXpath(MixTelematics_PageObjects.SignInButtonXpath())) 
        {
            error = "Failed to click Sign In button4";
            return false;
        }

        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("Successfully Clicked Sign in on Mix Telematics", false);
        return true;
    }
   
    public boolean ValidateLandingPage() 
    {
        //Waits for the table to be finnish loading
        if (!SeleniumDriverInstance.waitForElementByXpath(UsabilityAssetPageObjects.TableLoadingSpinnerXpath(), 60)) 
        {
            error = "Failed to validate that the table has loaded";
            testData.extractParameter("Actual Result:", "Failed to validate that the table has loaded", "FAIL");
            return false;
        }
        
        //Waits for the table to be finnish loading
        if (!SeleniumDriverInstance.waitForElementByXpath(UsabilityAssetPageObjects.TableLoadingSpinnerXpath(), 60)) 
        {
            error = "Failed to validat that the table has loaded";
            testData.extractParameter("Actual Result:", "Failed to validat that the table has loaded", "FAIL");
            return false;
        }

        //Validate Asset Label appears on the landing page //span[text()='Assets']
        if (!SeleniumDriverInstance.waitForElementByXpathVisibility(MixTelematics_PageObjects.AssetLabelXpath())) 
        {
            error = "Failed to validate that the Asset label";
            testData.extractParameter("Actual Result:", "Failed to validate that the Asset label", "FAIL");
            return false;
        }
        
        //Waits for the table to finish load
        if (!SeleniumDriverInstance.waitForElementByXpath(UsabilityAssetPageObjects.TableLoadingSpinnerXpath(), 60)) {
            error = "Failed to validate that the table has loaded";
            testData.extractParameter("Actual Result:", "Failed to validate that the table has loaded", "FAIL");
            return false;
        }

        if (!SeleniumDriverInstance.waitForElementByXpath(MixTelematics_PageObjects.AllLabelXpath())) 
        {
            error = "Failed to validate that the All label";
            testData.extractParameter("Actual Result:", "Failed to validate that the All label", "FAIL");
            return false;
        }

        if (browserType != Enums.BrowserType.IE && !SeleniumDriverInstance.Driver.getCurrentUrl().contains("fleet-admin/assets")) 
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
