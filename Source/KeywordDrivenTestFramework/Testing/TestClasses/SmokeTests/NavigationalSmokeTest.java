/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.TestClasses.SmokeTests;

import KeywordDrivenTestFramework.Core.BaseClass;
import static KeywordDrivenTestFramework.Core.BaseClass.SeleniumDriverInstance;
import KeywordDrivenTestFramework.Entities.Enums;
import KeywordDrivenTestFramework.Entities.TestEntity;
import KeywordDrivenTestFramework.Entities.TestResult;
import KeywordDrivenTestFramework.Testing.PageObjects.NavigatePageObjects;
import KeywordDrivenTestFramework.Testing.PageObjects.SmokeTests.NavigationalPageObjects;



public class NavigationalSmokeTest extends BaseClass
{
    TestEntity testData;
    
    String globalErrorMessage = "";
    int failCount = 0;
    
    public NavigationalSmokeTest(TestEntity testData) 
    {
        this.testData = testData;
    }
    
    public TestResult executeTest()
    {
        this.setStartTime();
        
        if(!NavigateToPage())
        {
            SeleniumDriverInstance.takeScreenShot("Failed to navigate to "+testData.getData("SubMenu"), true);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to navigate to "+testData.getData("SubMenu")+" - " + globalErrorMessage, this.getTotalExecutionTime());
        }
        
        if(!Validate() || failCount > 0)
        {
            SeleniumDriverInstance.takeScreenShot("Failed to validate the elements on the "+testData.getData("SubMenu") + " page", true);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to validate the elements on the "+testData.getData("SubMenu") + " page - " + globalErrorMessage, this.getTotalExecutionTime());
        }
        
        return new TestResult(testData, Enums.ResultStatus.PASS, "Successfully navigated to " + testData.getData("SubMenu"), this.getTotalExecutionTime());
    }
     
    
    public boolean NavigateToPage()
    {
        SeleniumDriverInstance.waitForElementByXpath(NavigatePageObjects.MenuXpath("MANAGE"),60);
        SeleniumDriverInstance.waitForElementByXpath(NavigatePageObjects.MenuXpath("MEASURE"),60);
        SeleniumDriverInstance.waitForElementByXpath(NavigatePageObjects.MenuXpath("MONITOR"),60);
        if(!SeleniumDriverInstance.waitForElementByXpath(NavigatePageObjects.MenuXpath(testData.getData("Menu")),60))
        {
            globalErrorMessage = "Failed to wait for '"+testData.getData("Menu")+"' dropdown in nav bar";
            return false;
        }
        SeleniumDriverInstance.pause(5000);
        if(!SeleniumDriverInstance.clickElementByXpath(NavigatePageObjects.MenuXpath(testData.getData("Menu"))))
        {
                globalErrorMessage = "Failed to click '"+testData.getData("Menu")+"' dropdown in nav bar";
                return false;
        }
        else
        {
            testData.extractParameter("Menu", testData.getData("Menu"), "PASS");
        }
        SeleniumDriverInstance.pause(5000);
       if(!SeleniumDriverInstance.waitForElementByXpathVisibility(NavigationalPageObjects.SubMenuXpath(testData.getData("Menu"),testData.getData("SubMenu")),5))
       {
            globalErrorMessage = "Failed to wait for '"+testData.getData("SubMenu")+"' dropdown";
            return false;
       }
       SeleniumDriverInstance.pause(2000);
        
        if(!SeleniumDriverInstance.clickElementByXpath(NavigationalPageObjects.SubMenuXpath(testData.getData("Menu"),testData.getData("SubMenu"))))
        {
                globalErrorMessage = "Failed to click '"+testData.getData("SubMenu")+"' dropdown";
                return false;
        }
        else
        {
            testData.extractParameter("Sub Menu", testData.getData("SubMenu"), "PASS");
        }
        
        SeleniumDriverInstance.takeScreenShot("Successfully navigated to "+testData.getData("SubMenu"), false);
        return true;
    }
    public boolean Validate()
    {   
        //Validate the Page        
       if (!SeleniumDriverInstance.waitForElementByXpath(NavigatePageObjects.ValidateSpanTextXpath(testData.getData("Page Header")),20)) 
       {
            if (!SeleniumDriverInstance.waitForElementByXpath(NavigationalPageObjects.ValidateHeaderXpath(testData.getData("Page Header")),20)) 
            {
                if (!SeleniumDriverInstance.waitForElementByXpath(NavigationalPageObjects.ValidateHeaderTextXpath(testData.getData("Page Header")),20)) 
                { 
                    globalErrorMessage = "Failed to validate the '"+testData.getData("Page Header")+"' Page was loaded";
                    testData.extractParameter("Failed to validate the ",testData.getData("Page Header") +"Page was loaded", "FAIL");
                    return false;
                }
            }
       }
       SeleniumDriverInstance.pause(5000);
        if (!SeleniumDriverInstance.waitForElementByXpath(testData.getData("item1"),80)) 
        { 
            failCount++;
            globalErrorMessage = "Failed to validate the first item on the page";
            testData.extractParameter("First item validated for ", testData.getData("item1Name"), "FAIL");
            //return false;
        }
        else
        {
            testData.extractParameter("First item validated for ", testData.getData("item1Name"), "PASS");
        }
        
        
        if (!SeleniumDriverInstance.waitForElementByXpath(testData.getData("item2"),80)) 
        { 
            failCount++;
            globalErrorMessage = "Failed to validate the second item on the page";
            testData.extractParameter("Second item validated for ", testData.getData("item2Name"), "FAIL");
            //return false; 
        }
        else
        {
            testData.extractParameter("Second item validated for ", testData.getData("item2Name"), "PASS");
        }
        
        //Wait for error modal close button.
        if(SeleniumDriverInstance.waitForElementByXpath(NavigationalPageObjects.ErrorModalXpath(),3)) 
        { 
            failCount++;
            
            SeleniumDriverInstance.takeScreenShot("Error on page "+testData.getData("SubMenu"), false);
                        
            SeleniumDriverInstance.pause(1500);
            //Wait for and click error modal close button.
            if(!SeleniumDriverInstance.waitForElementByXpath(NavigationalPageObjects.ErrorModalCloseXpath() ,30))
            {
                globalErrorMessage = "Failed to wait for error modal close button.";
                testData.extractParameter("Second item validated for ", testData.getData("item2Name"), "FAIL");
                //return false;
            }
            if(!SeleniumDriverInstance.clickElementByXpath(NavigationalPageObjects.ErrorModalCloseXpath()))
            {
                globalErrorMessage = "Failed to wait for error modal close button.";
                testData.extractParameter("Second item validated for ", testData.getData("item2Name"), "FAIL");
                //return false;
            }
            
            //return false;
           
        }
        
        SeleniumDriverInstance.takeScreenShot("Successfully validated "+testData.getData("SubMenu") + " page loaded", false);
        return true;
    }
}
