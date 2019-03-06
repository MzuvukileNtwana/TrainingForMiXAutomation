/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.TestClasses.Login;

import KeywordDrivenTestFramework.Core.BaseClass;
import static KeywordDrivenTestFramework.Core.BaseClass.SeleniumDriverInstance;
import static KeywordDrivenTestFramework.Core.BaseClass.narrator;
import KeywordDrivenTestFramework.Entities.Enums;
import KeywordDrivenTestFramework.Entities.TestEntity;
import KeywordDrivenTestFramework.Entities.TestResult;
import KeywordDrivenTestFramework.Testing.PageObjects.MixTelematics_PageObjects;
import static java.lang.System.err;
import org.openqa.selenium.Keys;

/**
 *
 * @author RauvounW
 */
public class Navigate extends BaseClass
{

    int counter = 1;
    String error = "";
    TestEntity testData;
    boolean isNegative;
    String userName, Password;

    public Navigate(TestEntity testData) 
    {
        this.testData = testData;

    }
    
    public Navigate() { }

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
            System.out.println("Renavigating");
            NavigatetoMixTelematics();
        }
        pause(5000);
        return new TestResult(testData, Enums.ResultStatus.PASS, "Successfully navigated to mix.", this.getTotalExecutionTime());
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

}
