/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package KeywordDrivenTestFramework.Testing.TestClasses.Assets;

import KeywordDrivenTestFramework.Core.BaseClass;
import static KeywordDrivenTestFramework.Core.BaseClass.SeleniumDriverInstance;
import KeywordDrivenTestFramework.Entities.Enums;
import KeywordDrivenTestFramework.Entities.TestEntity;
import KeywordDrivenTestFramework.Entities.TestResult;
import KeywordDrivenTestFramework.Testing.PageObjects.PassengersPageObjects;
import KeywordDrivenTestFramework.Testing.PageObjects.UtilitiesPageObject;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.Keys;

/**
 *
 * @author lmkhontwana
 */
public class PassengersOrganisationSelectorTestClass extends BaseClass {
    TestEntity testData;
    String failedMessage = "";
     public PassengersOrganisationSelectorTestClass(TestEntity testData) {
        this.testData = testData;
    }
    
      public TestResult executePassengersOrganisationSelectorTest() {

        this.setStartTime();
        
         if (!selectOrganisationGroup()) 
        {
            SeleniumDriverInstance.takeScreenShot("FailedToSelectOrganisation", true);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To Select Organisation", this.getTotalExecutionTime());
        }
        
        return new TestResult(testData, Enums.ResultStatus.PASS, testData.TestDescription, this.getTotalExecutionTime());
      }
   
     //Selects the Organisation Group from what was specified in the test pack
    private boolean selectOrganisationGroup() 
    {
       
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
        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("OrganisationFiltered", false);
        
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
        
        String selectedOrganisation = SeleniumDriverInstance.retrieveTextByXpathUsingAttribute(PassengersPageObjects.GetSelectedOrganisationRelativeXpath());
        if (selectedOrganisation.equals(testData.getData("BreadcrumColumn3"))) {
                
            testData.extractParameter("Selected Organisation ", selectedOrganisation, "PASS");
            //Take Screenshot
            SeleniumDriverInstance.takeScreenShot("OrganisationSelected", false);
        }else
        {
            testData.extractParameter("Selected Organisation ", selectedOrganisation, "FAIL");
            //Take Screenshot
            SeleniumDriverInstance.takeScreenShot("OrganisationSelected", true);
                
             //Select
            if (!SeleniumDriverInstance.clickElementbyXpath(UtilitiesPageObject.ButtonSelectXpath())) 
            {
                testData.extractParameter("Actual Result", "Failed to click the Select button", "FAIL");
                return false;
            }
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

     
     
}     