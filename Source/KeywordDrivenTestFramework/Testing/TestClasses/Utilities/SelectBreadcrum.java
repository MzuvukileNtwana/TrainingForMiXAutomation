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
import KeywordDrivenTestFramework.Testing.PageObjects.UsabilityAssetPageObjects;
import KeywordDrivenTestFramework.Testing.PageObjects.UtilitiesPageObject;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.Keys;

/**
 *
 * @author mdevilliers
 */
public class SelectBreadcrum extends BaseClass {

    int counter = 1;

    TestEntity testData;
    boolean isNegative;
    String reportMessage = "";

    public SelectBreadcrum(TestEntity testData) {
        this.testData = testData;

    }

    public TestResult executeTest() {

        this.setStartTime();

//        if (!checkBreadcrum()) {
//
//            SeleniumDriverInstance.takeScreenShot(counter + "Breadcrum is selected", false);
//            return new TestResult(testData, Enums.ResultStatus.PASS, "Breadcrum is selected", this.getTotalExecutionTime());
//
//        }
        if (!selectOrganisationGroup()) 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to vailidate Configuration groups page", true);
            counter++;
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to vailidate Configuration groups page", this.getTotalExecutionTime());
        }

        if (!ValidateLandingPage()) 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to validate correct breadcrum selected", true);
            counter++;
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to validate that the correct breadcrum path has been selected", this.getTotalExecutionTime());
        }

        SeleniumDriverInstance.takeScreenShot(counter + "Successfully selected the Breadcrum", false);
        return new TestResult(testData, Enums.ResultStatus.PASS, "Successfully selected the Breadcrum", this.getTotalExecutionTime());
    }

    //Validates the Asset Landing Page
    public boolean checkBreadcrum() 
    {

        //Checks to see if the breadcrum was already selected
        List<String> columns = new ArrayList<>();

        int count = Integer.parseInt(testData.getData("ColumnCount"));

        for (int i = 1; i < count + 1; i++) {
            columns.add(testData.getData("BreadcrumColumn" + i));
        }

        for (int i = 0; i < count; i++) {
            if (!SeleniumDriverInstance.waitForElementByXpath(UtilitiesPageObject.BreadcrumAfterSelectionXpath(columns.get(i)), 15)) 
            {
                testData.extractParameter("Actual Result:", "Failed to validate the selected breadcrum", "FAIL");
                return false;
            }
        }

        return true;
    }

    //Selects the Organisation Group from what was specified in the test pack
    public boolean selectOrganisationGroup() 
    {
        ///Waits for the table to be finnish loading
        if (!SeleniumDriverInstance.waitForElementByXpath(UsabilityAssetPageObjects.TableLoadingSpinnerXpath(), 60)) 
        {
            testData.extractParameter("Actual Result:", "Failed to validate that the table has loaded", "FAIL");
            return false;
        }

        if (!SeleniumDriverInstance.clickElementbyXpath(UtilitiesPageObject.ButtonBreadcrumXpath())) 
        {
            testData.extractParameter("Actual Result", "Failed to click the breadcrum", "FAIL");
            return false;
        }

        if (!SeleniumDriverInstance.waitForElementByXpath(UtilitiesPageObject.HeadingSelectOrganisationGroupXpath(), 30)) 
        {
            testData.extractParameter("Actual Result", "Failed to validate that the Select Organisation Group window opened", "FAIL");
            return false;
            
        }

        //Validates that the columns are showing
        if (!SeleniumDriverInstance.waitForElementByXpath(UtilitiesPageObject.BreadcrumTreeItemXpath(testData.getData("BreadcrumColumn1")), 30)) 
        {
            testData.extractParameter("Actual Result", "Failed to validate that the columns are showing", "FAIL");
            return false;
        }

        List<String> columns = new ArrayList<>();

        int count = Integer.parseInt(testData.getData("ColumnCount"));

        for (int i = 1; i < count + 1; i++) 
        {
            columns.add(testData.getData("BreadcrumColumn" + i));
        }

        //Searches for the last item inputed into the test pack
        if (!SeleniumDriverInstance.enterTextByXpath(UtilitiesPageObject.InputFieldSelectOrginisationGroupXpath(), testData.getData("BreadcrumColumn" + count)))
        {
            testData.extractParameter("Actual Result", "Failed to enter the text into the Search input field", "FAIL");
            return false;
        }
        
        
        SeleniumDriverInstance.pressKey(Keys.ENTER);

        if (!SeleniumDriverInstance.waitForElementByXpath(UtilitiesPageObject.BreadcrumSearchResultHeadingXpath(), 30)) 
        {
            testData.extractParameter("Actual Result", "Failed to validate that the search result heading text is diplayed", "FAIL");
            return false;
        }

        //Gets the search result into view
        if (!SeleniumDriverInstance.scrollToElement(UtilitiesPageObject.BreadcrumItemAfterFilterXpath(columns))) 
        {
            testData.extractParameter("Actual Result", "Failed to scroll to the filter result", "FAIL");
            return false;
        }

        //Validates that the correct item has been searched
        if (!SeleniumDriverInstance.waitForElementByXpath(UtilitiesPageObject.BreadcrumItemAfterFilterXpath(columns), 30)) 
        {
            testData.extractParameter("Actual Result", "Failed to validate the filter result", "FAIL");
            return false;
        }

        //Waits for the search element to appear
        if (!SeleniumDriverInstance.waitForElementByXpath(UtilitiesPageObject.BreadcrumItemAfterFilterXpath(columns), 30)) 
        {
            testData.extractParameter("Actual Result:", "Failed to validate that the Heading: All is present", "FAIL");
            return false;
        }

        //Waits for the search element to appear
        if (!SeleniumDriverInstance.waitForElementByXpath(UtilitiesPageObject.BreadcrumItemAfterFilterXpath(columns), 30)) 
        {
            testData.extractParameter("Actual Result:", "Failed to validate that the Heading: All is present", "FAIL");
            return false;
        }

        //Waits for the search element to appear
        if (!SeleniumDriverInstance.waitForElementByXpath(UtilitiesPageObject.BreadcrumItemAfterFilterXpath(columns), 30)) 
        {
            testData.extractParameter("Actual Result:", "Failed to validate that the Heading: All is present", "FAIL");
            return false;
        }

        SeleniumDriverInstance.pause(1000);

        if (!SeleniumDriverInstance.waitForElementByXpath(UtilitiesPageObject.ButtonSelectXpath(), 30)) 
        {
            testData.extractParameter("Actual Result:", "Failed to validate that the Heading: All is present", "FAIL");
            return false;
        }

        //Selects the search result
        if (!SeleniumDriverInstance.clickElementbyXpath(UtilitiesPageObject.BreadcrumItemAfterFilterXpath(columns))) 
        {
            testData.extractParameter("Actual Result", "Failed to click on the filter result", "FAIL");
            return false;
        }

        //Select
        if (!SeleniumDriverInstance.clickElementbyXpath(UtilitiesPageObject.ButtonSelectXpath())) 
        {
            testData.extractParameter("Actual Result", "Failed to click the Select button", "FAIL");
            return false;
        }

        return true;
    }

    //Validates the Asset Landing Page
    public boolean ValidateLandingPage() 
    {
        //Waits for the table to be finnish loading
        if (!SeleniumDriverInstance.waitForElementByXpath(UsabilityAssetPageObjects.TableLoadingSpinnerXpath(), 60)) 
        {
            if (!SeleniumDriverInstance.waitForElementByXpath(UsabilityAssetPageObjects.TableLoadingSpinnerRolesXpath(), 60)) 
            {
                testData.extractParameter("Actual Result:", "Failed to validate that the table has loaded", "FAIL");
                return false;
            }
        }

        //Checks to see if the breadcrum was selected and updated correctly
        List<String> columns = new ArrayList<>();

        int count = Integer.parseInt(testData.getData("ColumnCount"));

        for (int i = 1; i < count + 1; i++) 
        {
            columns.add(testData.getData("BreadcrumColumn" + i));
        }

        for (int i = 0; i < count; i++) 
        {
            if (!SeleniumDriverInstance.waitForElementByXpath(UtilitiesPageObject.BreadcrumAfterSelectionXpath(columns.get(i)), 15)) {
                testData.extractParameter("Actual Result:", "Failed to validate the selected breadcrum", "FAIL");
                return false;
            }
        }

        return true;
    }

}
