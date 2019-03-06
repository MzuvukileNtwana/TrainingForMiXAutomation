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
import KeywordDrivenTestFramework.Testing.PageObjects.AssetsPageObjects;

/**
 *
 * @author lmkhontwana
 */
public class PassengerRefreshButtonTestClass extends BaseClass
{

    TestEntity testData;
    String error = "";

    public PassengerRefreshButtonTestClass(TestEntity testData)
    {
        this.testData = testData;
    }

    public TestResult executePassengerRefreshButtonTest()
    {

        this.setStartTime();

        if (!passengerRefreshButtonTest())
        {
            SeleniumDriverInstance.takeScreenShot("FailedToClickRefreshButtonOnPassenger", true);
            narrator.failedMessage("Failed To Click Refresh Button On Passenger - " + error);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To Click Refresh Button On Passenger - " + error, this.getTotalExecutionTime());
        }

        return new TestResult(testData, Enums.ResultStatus.PASS, testData.TestDescription, this.getTotalExecutionTime());
    }

    private boolean passengerRefreshButtonTest()
    {
        String expectedAfterRefreshValue = "a few seconds ago";
        String deaulftTime = "";
        String beforeRefresh = "";
        String afterRefresh = "";

        int timeInterval = 60000;
        if (!testData.getData("Time Interval").equals(""))
        {
            timeInterval = timeInterval * Integer.parseInt(testData.getData("Time Interval"));
        }

        deaulftTime = SeleniumDriverInstance.retrieveTextByXpath(AssetsPageObjects.LastRefreshTimeRelativeXpath());

        testData.extractParameter("Last Refresh Time Value", deaulftTime, "PASS");
        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("LastRefreshTime", false);

        SeleniumDriverInstance.pause(timeInterval);

        testData.extractParameter("Pause Time Interval", String.valueOf(timeInterval / 60000) + " minute(s)", "PASS");

        //Time vaule before refresh
        beforeRefresh = SeleniumDriverInstance.retrieveTextByXpath(AssetsPageObjects.LastRefreshTimeRelativeXpath());
        testData.extractParameter("Before Refresh Value", beforeRefresh, "PASS");
        SeleniumDriverInstance.takeScreenShot("BeforeRefreshValue", false);

        //Click Refresh Button
        if (!SeleniumDriverInstance.clickElementbyXpath(AssetsPageObjects.RefreshButtonRelativeXpath()))
        {
            error = "Failed to click Refresh button";
            return false;
        }
        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("RefreshButtonClicked", false);

        SeleniumDriverInstance.pause(7000);

        //Time vaule after refresh
        if (!SeleniumDriverInstance.waitForElementByXpath(AssetsPageObjects.LastRefreshTimeRelativeTextXpath()))
        {
            error = "Failed to wait for last refresh time";
            return false;
        }

        afterRefresh = SeleniumDriverInstance.retrieveTextByXpath(AssetsPageObjects.LastRefreshTimeRelativeXpath());
        if (afterRefresh.equals(expectedAfterRefreshValue))
        {
            testData.extractParameter("After Refresh Value", afterRefresh, "PASS");
            //Take Screenshot
            SeleniumDriverInstance.takeScreenShot("AfterRefreshValue", false);
        }
        else
        {
            testData.extractParameter("After Refresh Value", afterRefresh, "FAIL");
            //Take Screenshot
            SeleniumDriverInstance.takeScreenShot("AfterRefreshValue", true);
        }

        //Click Refresh Button
        SeleniumDriverInstance.clickElementbyXpath(AssetsPageObjects.RefreshButtonRelativeXpath());
        SeleniumDriverInstance.pause(7000);

        return true;
    }
}
