/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.TestClasses.Utilities;

import KeywordDrivenTestFramework.Core.BaseClass;
import static KeywordDrivenTestFramework.Core.BaseClass.SeleniumDriverInstance;
import KeywordDrivenTestFramework.Entities.Enums;
import KeywordDrivenTestFramework.Entities.TestEntity;
import KeywordDrivenTestFramework.Entities.TestResult;
import KeywordDrivenTestFramework.Testing.PageObjects.LiveTrackingPageObjects;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

/**
 *
 * @author szeuch
 */
public class ScreenDisplayingUsersPreferredLanguage extends BaseClass
{
    TestEntity testData;
    
    String globalErrorMessage = "";
    
    public ScreenDisplayingUsersPreferredLanguage(TestEntity testData) 
    {
        this.testData = testData;
    }
    
    public TestResult executeTest()
    {
        this.setStartTime();
        
        if(!ValidatePage())
        {
            SeleniumDriverInstance.takeScreenShot("Failed to validate the Live Tracking page was loaded", true);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to validate the Live Tracking page was loaded - " + globalErrorMessage, this.getTotalExecutionTime());
        }
        
        if(!NavigateToCommandsToMobileDevice())
        {
            SeleniumDriverInstance.takeScreenShot("Failed to navigate to the required 'Commands To Mobile Device' modal", true);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to navigate to the required 'Commands To Mobile Device' modal - " + globalErrorMessage, this.getTotalExecutionTime());
        }
        
        if(!LanguageValidations())
        {
            SeleniumDriverInstance.takeScreenShot("Failed to validate the 'Commands To Mobile Device' modal", true);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to validate the 'Commands To Mobile Device' modal - " + globalErrorMessage, this.getTotalExecutionTime());
        }
        
        return new TestResult(testData, Enums.ResultStatus.PASS, "Successfully Validated the screen displayed the user's selected language", this.getTotalExecutionTime());
    }
    
    public boolean ValidatePage()
    {
        //Validate the Live Tracking Landing Page        
        if (!SeleniumDriverInstance.waitForElementByXpath(LiveTrackingPageObjects.LiveTrackingMultiLanguageSpanTextXpath(testData.getData("LiveTrackingLinkText")))) 
        {
            globalErrorMessage = "Failed to validate the Live Tracking Page was loaded";
            return false;
        }
        
        SeleniumDriverInstance.takeScreenShot("Successfully validate to the Live Tracking Page", false);
        
        return true;
    }
    
    public boolean NavigateToCommandsToMobileDevice()
    {
        //Click actions button
        int counter = 0;
        
        try
        {
            List <WebElement> assets = SeleniumDriverInstance.Driver.findElements(By.xpath("//tbody//tr//td[@column-field='assetDescription']//span"));
            
            for (int i = 0; i < assets.size(); i++) 
            {
                if (assets.get(i).getText().equalsIgnoreCase(testData.getData("AssetTrackingDescription"))) 
                {
                    counter = i + 1;
                    break;
                }
            }
        }
        catch(Exception e)
        {
            System.err.println("[Error] Failed to find actions button - " + e.getMessage());
            SeleniumDriverInstance.DriverExceptionDetail = e.getMessage();
            return false;
        }
        
        counter+=2;
        
        if (!SeleniumDriverInstance.clickElementByXpath("//ul[@class='over']//li["+counter+"]//div[@column='rowActions']//a")) 
        {
            return false;
        }
        
        if (!SeleniumDriverInstance.clickElementByXpath("//a[text()='"+testData.getData("CommandsToMobileDevice")+"']")) 
        {
            return false;
        }
        
        if (!SeleniumDriverInstance.waitForElementByXpath("//h5//span[text()='"+testData.getData("CommandsToMobileDevice")+"']")) 
        {
            globalErrorMessage = "Failed to validate the modal dialog opened";
            return false;
        }

        SeleniumDriverInstance.takeScreenShot("Successfully navigated to the Commands To Mobile Device modal", true);
        
        return true;
    }
    
    public boolean LanguageValidations()
    {
        //Alphabetical characters - SMS Limit
        if (!SeleniumDriverInstance.enterTextByXpath("//span[text()='"+testData.getData("IncreaseDailySMSLinkText")+"']/../..//input[@type='number']", testData.getData("AlphabeticalCharacters"))) 
        {
            return false;
        }
        
        SeleniumDriverInstance.pressKey(Keys.TAB);
        
        if (!SeleniumDriverInstance.waitForElementByXpath("//span[text()='"+testData.getData("InvalidNumberText")+"']")) 
        {
            return false;
        }
        
        SeleniumDriverInstance.clearTextByXpath("//span[text()='"+testData.getData("IncreaseDailySMSLinkText")+"']/../..//input[@type='number']");
        
        //ASCII characters - SMS Limit
        
        //Alphabetical characters - Satellite Message Limit
        
        //ASCII characters - Satellite Message Limit
        
        //1000 - Satellite Message Limit
        
        //Rest of the tests
        
        //Select the Set immobiliser/relay drive radio button
        if (!SeleniumDriverInstance.clickElementByXpath("//span[text()='"+testData.getData("SetImmobiliserRelayDriveRadioButtonLinkText")+"']")) 
        {
            return false;
        }
        
        SeleniumDriverInstance.takeScreenShot("Successfully validated the Commands To Mobile Device modal", true);
        
        return true;
    }
}
