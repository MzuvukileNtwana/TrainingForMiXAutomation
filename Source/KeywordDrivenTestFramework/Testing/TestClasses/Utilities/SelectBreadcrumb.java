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
import KeywordDrivenTestFramework.Testing.PageObjects.BreadCrumbPageObject;
import KeywordDrivenTestFramework.Testing.PageObjects.UtilitiesPageObject;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.Keys;

/**
 *
 * @author lmgulwa
 */
public class SelectBreadcrumb extends BaseClass
{

    int counter = 1;
    List<String> columns = new ArrayList<>();
    public String breadcrumbHeader, selectedName;

    TestEntity testData;
    String error = "";

    public SelectBreadcrumb(TestEntity testData)
    {
        this.testData = testData;
        breadcrumbHeader = this.testData.getData("BreadcrumHeader");
    }

    public SelectBreadcrumb(TestEntity testData, String BreadcrumHeader)
    {
        this.testData = testData;
        breadcrumbHeader = BreadcrumHeader;
    }

    public TestResult executeTest()
    {
        this.setStartTime();

        if (!selectItem())
        {
            SeleniumDriverInstance.takeScreenShot("Failed to select " + selectedName, true);
            counter++;
            narrator.failedMessage("Failed to select " + selectedName + " - " + error);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to select " + selectedName, this.getTotalExecutionTime());
        }

        if (!clickSelectButton())
        {
            SeleniumDriverInstance.takeScreenShot("Failed to click Select button", true);
            counter++;
            narrator.failedMessage("Failed to click Select button - " + error);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click Select button", this.getTotalExecutionTime());
        }

        if (!validatedSelectedItem(selectedName))
        {
            SeleniumDriverInstance.takeScreenShot("Failed to validate selected " + selectedName, true);
            counter++;
            narrator.failedMessage("Failed to validate selected " + selectedName + " - " + error);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to validate selected " + selectedName, this.getTotalExecutionTime());
        }

        SeleniumDriverInstance.takeScreenShot("Successfully selected " + selectedName, false);

        return new TestResult(testData, Enums.ResultStatus.PASS, "successfully selected " + selectedName, this.getTotalExecutionTime());
    }

    public boolean selectItem()
    {
        //Loads the columns to select from  the spreadsheet
        if (!LoadBreadCrums())
        {
            return false;
        }

        //Assign the name to select
        selectedName = columns.get((columns.size() - 1));

        //Click on the Breadcrumb
        if (!SeleniumDriverInstance.clickElementbyXpath(BreadCrumbPageObject.breadCrumbSelectorXpath()))
        {
            SeleniumDriverInstance.takeScreenShot("Failed to click on breadcrumb", true);
            System.err.println("Failed to click on breadcrumb");
            error = "Failed to click on breadcrumb";
            return false;
        }
        //Wait for Breadcrumb page header
        if (!SeleniumDriverInstance.waitForElementByXpath(BreadCrumbPageObject.selectDriverHeaderXpath(breadcrumbHeader), 60))
        {
            SeleniumDriverInstance.takeScreenShot("Failed to wait for Breadcrumb header", true);
            System.err.println("Failed to wait for Breadcrumb header");
            error = "Failed to wait for Breadcrumb header";
            return false;
        }

        //Searches for the first item inputed into the test pack
        if (!SeleniumDriverInstance.enterTextByXpath(UtilitiesPageObject.InputFieldSelectOrginisationGroupXpath(), columns.get(0)))
        {
            testData.extractParameter("Actual Result", "Failed to enter the text into the Search input field", "FAIL");
            error = "Failed to enter the text into the Search input field";
            return false;
        }

        SeleniumDriverInstance.pressKey(Keys.ENTER);

        if (!SeleniumDriverInstance.waitForElementByXpath(UtilitiesPageObject.BreadcrumSearchResultHeadingXpath(), 30))
        {
            testData.extractParameter("Actual Result", "Failed to validate that the search result heading text is diplayed", "FAIL");
            error = "Failed to validate that the search result heading text is diplayed";
            return false;
        }
        //Gets the search result into view
//       if(!scrollToSpecificElement(columns.get(0)))
//        {
//            testData.extractParameter("Actual Result", "Failed to scroll to the filtered element "+columns.get(0), "FAIL");
//            return false;
//        }
        //Selects the search result
        if (!SeleniumDriverInstance.waitForElementByXpath(UtilitiesPageObject.BreadcrumItemAfterFilteringXpath(columns.get(0)), 30))
        {
            testData.extractParameter("Actual Result", "Failed to wait for Filter element", "FAIL");
            error = "Failed to wait for Filter element";
            return false;
        }

        pause(1000);
        if (!SeleniumDriverInstance.moveToAndClickElementByXpath(UtilitiesPageObject.BreadcrumItemAfterFilteringXpath(columns.get(0))))
        {
            testData.extractParameter("Actual Result", "Failed to click on the filter result", "FAIL");
            error = "Failed to click on the filter result";
            return false;
        }

        for (String column : columns)
        {
            if (!scrollToSpecificElement(column))
            {
                return false;
            }

            if (!SeleniumDriverInstance.clickElementbyXpath(BreadCrumbPageObject.breadCrumbColumnsXpath(column)))
            {
                SeleniumDriverInstance.takeScreenShot("Failed to click on " + column, true);
                System.err.println("Failed to click on " + column);
                error = "Failed to click on" + column;
                return false;
            }

            //Wait for column spinner
            if (!SeleniumDriverInstance.waitForElementByXpath(BreadCrumbPageObject.columnSpinnerXpath(column), 60))
            {
                error = "Failed to wait for the column spinner";
                return false;

            }
        }

        //Validate that item is selected (Highlighted)
        if (!SeleniumDriverInstance.waitForElementByXpath(BreadCrumbPageObject.highlightedItemXpath(selectedName), 60))
        {
            SeleniumDriverInstance.takeScreenShot("Failed to highlight " + selectedName, true);
            System.err.println("Failed to highlight " + selectedName);
            error = "Failed to highlight";
            return false;
        }

        SeleniumDriverInstance.takeScreenShot("Selected " + selectedName, false);

        return true;
    }

    private boolean LoadBreadCrums()
    {
        //Checks to see if the breadcrum was selected and updated correctly

        try
        {
            columns.clear();
            int count = Integer.parseInt(testData.getData("ColumnCount"));

            for (int i = 1; i < (count + 1); i++)
            {
                columns.add(testData.getData("BreadcrumColumn" + i));
            }
        }
        catch (Exception e)
        {
            SeleniumDriverInstance.takeScreenShot("Failed to load columns from the testpack", true);
            return false;
        }

        return true;
    }

    public boolean clickSelectButton()
    {
        //Click Select button
        if (!SeleniumDriverInstance.clickElementbyXpath(BreadCrumbPageObject.btnSelectXpath()))
        {
            SeleniumDriverInstance.takeScreenShot("Failed to click on Select button", true);
            System.err.println("Failed to click on Select button");
            error = "Failed to click on Select button";
            return false;
        }
        return true;
    }

    public boolean validatedSelectedItem(String item)
    {
        if (!SeleniumDriverInstance.waitForElementByXpath(BreadCrumbPageObject.selectedDriverXpath(item), 80))
        {
            SeleniumDriverInstance.takeScreenShot("Failed to validate that " + item + " was selected", true);
            System.err.println("Failed to validate that " + item + " was selected");
            error = "Failed to validate that" + item + " was selected";
            return false;
        }
        return true;
    }

    public boolean scrollToSpecificElement(String name)
    {
        if (!SeleniumDriverInstance.scrollToElement(BreadCrumbPageObject.breadCrumbColumnsXpath(name)))
        {
            SeleniumDriverInstance.takeScreenShot("Failed to scroll to " + name, true);
            System.err.println("Failed to scroll to " + name);
            error = "Failed to scroll to " + name;
            return false;
        }
        return true;
    }

    public boolean selectItem(String ColumnCount, String BreadcrumColumn)
    {
        //Loads the columns to select from  the spreadsheet
        if (!LoadBreadCrums(ColumnCount, BreadcrumColumn))
        {
            return false;
        }

        //Assign the name to select
        selectedName = columns.get((columns.size() - 1));

        //Click on the Breadcrumb
        if (!SeleniumDriverInstance.clickElementbyXpath(BreadCrumbPageObject.breadCrumbSelectorXpath()))
        {
            SeleniumDriverInstance.takeScreenShot("Failed to click on breadcrumb", true);
            System.err.println("Failed to click on breadcrumb");
            error = "Failed to click on breadcrumb ";
            return false;
        }
        //Wait for Breadcrumb page header
        if (!SeleniumDriverInstance.waitForElementByXpath(BreadCrumbPageObject.selectDriverHeaderXpath(breadcrumbHeader), 60))
        {
            SeleniumDriverInstance.takeScreenShot("Failed to wait for Breadcrumb header", true);
            System.err.println("Failed to wait for Breadcrumb header");
            error = "Failed to wait for Breadcrumb header";
            return false;
        }

        //Searches for the first item inputed into the test pack
        if (!SeleniumDriverInstance.enterTextByXpath(UtilitiesPageObject.InputFieldSelectOrginisationGroupXpath(), columns.get(0)))
        {
            testData.extractParameter("Actual Result", "Failed to enter the text into the Search input field", "FAIL");
            error = "Failed to enter the text into the Search input field";
            return false;
        }

        SeleniumDriverInstance.pressKey(Keys.ENTER);

        if (!SeleniumDriverInstance.waitForElementByXpath(UtilitiesPageObject.BreadcrumSearchResultHeadingXpath(), 30))
        {
            testData.extractParameter("Actual Result", "Failed to validate that the search result heading text is diplayed", "FAIL");
            error = "Failed to validate that the search result heading text is diplayed";
            return false;
        }
        //Gets the search result into view
//       if(!scrollToSpecificElement(columns.get(0)))
//        {
//            testData.extractParameter("Actual Result", "Failed to scroll to the filtered element "+columns.get(0), "FAIL");
//            return false;
//        }
        //Selects the search result
        if (!SeleniumDriverInstance.waitForElementByXpath(UtilitiesPageObject.BreadcrumItemAfterFilteringXpath(columns.get(0))))
        {
            testData.extractParameter("Actual Result", "Failed to wait for Filter element", "FAIL");
            error = "Failed to wait for Filter element";
            return false;
        }
        if (!SeleniumDriverInstance.clickElementByXpath(UtilitiesPageObject.BreadcrumItemAfterFilteringXpath(columns.get(0))))
        {
            testData.extractParameter("Actual Result", "Failed to click on the filter result", "FAIL");
            error = "Failed to click on the filter result";
            return false;
        }

        for (String column : columns)
        {
            if (!scrollToSpecificElement(column))
            {
                return false;
            }
            if (!SeleniumDriverInstance.clickElementbyXpath(BreadCrumbPageObject.breadCrumbColumnsXpath(column)))
            {
                SeleniumDriverInstance.takeScreenShot("Failed to click on " + column, true);
                System.err.println("Failed to click on " + column);
                error = "Failed to click on " + column;
                return false;
            }
            //Wait for column spinner
            if (!SeleniumDriverInstance.waitForElementByXpath(BreadCrumbPageObject.columnSpinnerXpath(column), 60))
            {
                error = "Failed to wait for the column spinner ";
                return false;
            }
        }

        //Validate that item is selected (Highlighted)
        if (!SeleniumDriverInstance.waitForElementByXpath(BreadCrumbPageObject.highlightedItemXpath(selectedName), 60))
        {
            SeleniumDriverInstance.takeScreenShot("Failed to highlight " + selectedName, true);
            System.err.println("Failed to highlight " + selectedName);
            error = "Failed to highlight " + selectedName;
            return false;
        }

        SeleniumDriverInstance.takeScreenShot("Selected " + selectedName, false);

        return true;
    }

    private boolean LoadBreadCrums(String ColumnCount, String BreadcrumColumn)
    {
        //Checks to see if the breadcrum was selected and updated correctly
        try
        {
            columns.clear();
            int count = Integer.parseInt(ColumnCount);

            for (int i = 1; i < (count + 1); i++)
            {
                columns.add(testData.getData(BreadcrumColumn + i));
            }
        }
        catch (Exception e)
        {
            SeleniumDriverInstance.takeScreenShot("Failed to load columns from the testpack", true);
            return false;
        }

        return true;
    }
}
