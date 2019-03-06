/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.TestClasses;

import KeywordDrivenTestFramework.Core.BaseClass;
import static KeywordDrivenTestFramework.Core.BaseClass.SeleniumDriverInstance;
import KeywordDrivenTestFramework.Entities.Enums;
import KeywordDrivenTestFramework.Entities.TestEntity;
import KeywordDrivenTestFramework.Entities.TestResult;
import KeywordDrivenTestFramework.Testing.PageObjects.MixTelematics_PageObjects;

/**
 *
 * @author fnell
 */
public class Logout_MixTelematics extends BaseClass 
{
    TestEntity testData;
    
    String globalErrorMessage = "";

    public Logout_MixTelematics(TestEntity testData)
    {
        this.testData = testData;
    }

    public TestResult executeTest() 
    {
        this.setStartTime();
        
        if (!Validate()) 
        {
            SeleniumDriverInstance.takeScreenShot("Failed to validate the webpage was in the correct state to log out", true);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to validate the webpage was in the correct state to log out - " + globalErrorMessage, this.getTotalExecutionTime());
        }

        if (!Logout()) 
        {
            SeleniumDriverInstance.takeScreenShot("Failed to Logout of Mix Telematics Web App", true);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to Logout of Mix Telematics Web App - " + globalErrorMessage, this.getTotalExecutionTime());
        }
        
        if (!ValidateCompletion()) 
        {
            SeleniumDriverInstance.takeScreenShot("Failed to validate the logout was successful", true);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to validate the logout was successful - " + globalErrorMessage, this.getTotalExecutionTime());
        }
        
        return new TestResult(testData, Enums.ResultStatus.PASS, "Successfully Logged Out of the Mix Telematics Web Page", this.getTotalExecutionTime());
    }
    
    public boolean Validate()
    {
        //Validate the username text box is not present incase log out has already occured
        if (SeleniumDriverInstance.waitForElementByXpath(MixTelematics_PageObjects.LogOutUsernameValidationTextBoxXpath(), 3)) 
        {
            globalErrorMessage = "Failed to log out - the account has already been logged out";
            return false;
        }
        
        SeleniumDriverInstance.takeScreenShot("Successfully validate the Mix page was loaded", false);
        
        return true;
    }
    
    public boolean Logout()
    {
        //Logout of Mixtelematics web app
        //Did not find xpath
//        if(!SeleniumDriverInstance.clickElementbyXpath(MixTelematics_PageObjects.MainmenuIconXpath()))
//        {
//            return false;
//        }
        
        if (!SeleniumDriverInstance.clickElementbyXpath(MixTelematics_PageObjects.LogoutXpath()))
        {
            return false;
        }
        
        return true;
    }
    
    public boolean ValidateCompletion()
    {
        //Validates the username text box is present after the logout
        if (!SeleniumDriverInstance.waitForElementByXpath(MixTelematics_PageObjects.LogOutUsernameValidationTextBoxXpath())) 
        {
            globalErrorMessage = "Failed to validate the username text box was present after logout";
            return false;
        }
        
        SeleniumDriverInstance.takeScreenShot("Successfully Logged Out", false);
        
        return true;
    }
}
