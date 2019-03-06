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
import KeywordDrivenTestFramework.Testing.PageObjects.AddDriverPageObjects;
import KeywordDrivenTestFramework.Testing.PageObjects.SitePageObject;
import static java.lang.System.err;



/**
 *
 * @author mdevilliers
 */
public class NavigateOrganisationGroups extends BaseClass {

    int counter = 1;

    TestEntity testData;
    boolean isNegative;
    String reportMessage = "";
    String error = "";

    public NavigateOrganisationGroups(TestEntity testData) {
        this.testData = testData;

    }

    public TestResult executeTest() {

        this.setStartTime();

        if (!NavigateToOrganisationGroups()) 
        {
            SeleniumDriverInstance.takeScreenShot("Failed to naviagate to Configuration groups page", true);
            counter++;
            narrator.failedMessage("Failed to naviagate to Configuration groups page - "+error);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to naviagate to Configuration groups page", this.getTotalExecutionTime());
        }

        if (!ValidateOrganisationGroupsLanding()) 
        {
            SeleniumDriverInstance.takeScreenShot("Failed to vailidate Configuration groups page", true);
            counter++;
            narrator.failedMessage("Failed to vailidate Configuration groups page has been selected - "+error);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to vailidate Configuration groups page has been selected", this.getTotalExecutionTime());
        }

        SeleniumDriverInstance.takeScreenShot("Successfully naviagated to Configuration groups page", false);
        return new TestResult(testData, Enums.ResultStatus.PASS, "Successfully naviagated to Configuration groups page", this.getTotalExecutionTime());
    }

    public boolean NavigateToOrganisationGroups() {

           if (!SeleniumDriverInstance.waitForElementByXpath(SitePageObject.buttonMonitorXpath())) {
               error = "Failed to wait on the Monitor item";
            testData.extractParameter("Actual Result", "Failed to wait on the Monitor item", "FAIL");
            return false;
        }
        
        if (!SeleniumDriverInstance.clickElementbyXpath(SitePageObject.buttonMonitorXpath())) {
            error = "Failed to click on the Monitor item";
            testData.extractParameter("Actual Result", "Failed to click on the Monitor item", "FAIL");
            return false;
        }
        
        pause(1000);
          if (!SeleniumDriverInstance.waitForElementByXpath(SitePageObject.buttonOrganisationGroupsXpath())) {
              error = "Failed to wait on the Organisation Group item";
            testData.extractParameter("Actual Result", "Failed to wait on the Organisation Group item", "FAIL");
            return false;
        }

        if (!SeleniumDriverInstance.clickElementByXpathUsingActions(SitePageObject.buttonOrganisationGroupsXpath())) {
            error = "Failed to click on Organisation Group";
            testData.extractParameter("Actual Result", "Failed to click on Organisation Groups", "FAIL");
            return false;
        }

        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("Navigating to Organisation Groups", false);
        return true;
    }

    
    public boolean ValidateOrganisationGroupsLanding() {

        pause(2000);
        if(!SeleniumDriverInstance.waitForElementByXpath(AddDriverPageObjects.spinnerXpath(),15))
        {
            error = "Failed to validate spinner button";
           err.println("[ERROR] Failed to validate spinner button");
           return false; 
        }
        
        if (!SeleniumDriverInstance.waitForElementByXpath(SitePageObject.labelManageOrganisationGroupsXpath(), 30)) {
            error = "Failed to validate that Organisation Groups heading is present";
            testData.extractParameter("Actual Result", "Failed to validate that Organisation Groups heading is present", "FAIL");
            return false;
        }

        if (!SeleniumDriverInstance.waitForElementByXpath(SitePageObject.assetsLabelXpath(), 30)) {
            error = "Failed to validate that Assets Tab is present";
            testData.extractParameter("Actual Result", "Failed to validate that Assets Tab is present", "FAIL");
            return false;
        }

        if (!SeleniumDriverInstance.waitForElementByXpath(SitePageObject.driversLabelXpath(), 30)) {
            error = "Failed to validate that Drivers Tab is present";
            testData.extractParameter("Actual Result", "Failed to validate that Drivers Tab is present", "FAIL");
            return false;
        }

        SeleniumDriverInstance.takeScreenShot("Successfully validated Configuration Groups page", false);
        return true;
    }

}
