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
import KeywordDrivenTestFramework.Testing.PageObjects.SitePageObject;
import KeywordDrivenTestFramework.Testing.PageObjects.UsabilityAssetPageObjects;


/**
 *
 * @author mdevilliers
 */
public class NavigateToServerSideEvents extends BaseClass {

    int counter = 1;

    TestEntity testData;
    boolean isNegative;
    String reportMessage = "";

    public NavigateToServerSideEvents(TestEntity testData) {
        this.testData = testData;

    }

    public TestResult executeTest() {

        this.setStartTime();

        if (!NavigateToServerSideEvents()) 
        {
            SeleniumDriverInstance.takeScreenShot("Failed to navigate to Server Side Events page", true);
            counter++;
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to navigate to Server Side Events page", this.getTotalExecutionTime());
        }

        if (!ValidateServerSideEventsLanding()) 
        {
            SeleniumDriverInstance.takeScreenShot("Failed to validate ", true);
            counter++;
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to validate Server Side Events page", this.getTotalExecutionTime());
        }

        SeleniumDriverInstance.takeScreenShot("Successfully navigated to Server Side Events", false);
        return new TestResult(testData, Enums.ResultStatus.PASS, "Successfully navigated to Server Side Events", this.getTotalExecutionTime());
    }

    public boolean NavigateToServerSideEvents() {

        if (!SeleniumDriverInstance.clickElementbyXpath(SitePageObject.buttonMonitorXpath())) {
            testData.extractParameter("Actual Result", "Failed to click on the Manage item", "FAIL");
            return false;
        }
        
        if (!SeleniumDriverInstance.waitForElementByXpath(SitePageObject.buttonServerSideEventsXpath(),20)) {

            testData.extractParameter("Actual Result", "Failed to find Server Side Events", "FAIL");
            return false;
        }
        pause(2000);
        if (!SeleniumDriverInstance.clickElementbyXpath(SitePageObject.buttonServerSideEventsXpath())) {

            testData.extractParameter("Actual Result", "Failed to click on Server Side Events", "FAIL");
            return false;
        }

        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("Navigating to Server Side Events", false);
        return true;
    }

    
    public boolean ValidateServerSideEventsLanding() {

        ///Waits for the table to be finnish loading
        if (!SeleniumDriverInstance.waitForElementByXpath(UsabilityAssetPageObjects.TableLoadingSpinnerXpath(), 60)) 
        {
            testData.extractParameter("Actual Result:", "Failed to validate that the table has loaded", "FAIL");
            return false;
        } 
        
        if (!SeleniumDriverInstance.waitForElementByXpath(SitePageObject.labelServerSideEventsXpath(), 30)) {
            testData.extractParameter("Actual Result", "Failed to validate that Server Side Events heading is present", "FAIL");
            return false;
        }

        if (!SeleniumDriverInstance.waitForElementByXpath(SitePageObject.labelActiveXpath(), 40)) {
            testData.extractParameter("Actual Result", "Failed to validate that Active Tab is present", "FAIL");
            return false;
        }

        

        SeleniumDriverInstance.takeScreenShot("Successfully validated Server Side Events page", false);
        return true;
    }

}
