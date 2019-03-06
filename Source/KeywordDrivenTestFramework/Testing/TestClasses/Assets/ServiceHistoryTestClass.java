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
import KeywordDrivenTestFramework.Testing.PageObjects.AddNewRolePageObjects;
import KeywordDrivenTestFramework.Testing.PageObjects.AssetsPageObjects;

/**
 *
 * @author lmkhontwana
 */
public class ServiceHistoryTestClass extends BaseClass
{

    int counter = 1;
    TestEntity testData;
    String failedMessage = "";
    String regNo = "";
    String error;

    public ServiceHistoryTestClass(TestEntity testData)
    {
        this.testData = testData;
    }

    public TestResult executeServiceHistoryTest()
    {

        this.setStartTime();

        if (!addServiceHistory())
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Add Entry On Service History", true);
            counter++;
            narrator.failedMessage("Add Entry On Service History - " + error);
            return new TestResult(testData, Enums.ResultStatus.FAIL, failedMessage, this.getTotalExecutionTime());
        }
        return new TestResult(testData, Enums.ResultStatus.PASS, "Service History Added successfully", this.getTotalExecutionTime());
    }

    private boolean clickEditButton(String _assetID)
    {
        SeleniumDriverInstance.waitForPresenceOfElementByXpath(AssetsPageObjects.TableLoadingSpinnerXpath(), 30);
        String rowNumber = SeleniumDriverInstance.getElementAttributeByXpath(AssetsPageObjects.AssetIdXpath(_assetID), "row");
        //Click Action Button
        if (!SeleniumDriverInstance.waitForElementByXpath(AssetsPageObjects.ActionButtonByRowXpath(rowNumber)))
        {
            error = "Failed to wait for Action button";
            return false;
        }

        if (!SeleniumDriverInstance.clickElementByXpathUsingActions(AssetsPageObjects.ActionButtonByRowXpath(rowNumber)))
        {
            error = "Failed to click Action button";
            return false;
        }

        if (!SeleniumDriverInstance.waitForfElementToBeClickableByXpath(AssetsPageObjects.EditAssetButtonFirstOnListRelativeXpathText(), 15)
                && browserType.equals(browserType.IE))
        {
            if (!SeleniumDriverInstance.clickElementByXpathUsingActions(AssetsPageObjects.ActionButtonFirstOnListRelativeXpathText()))
            {
                error = "Failed to click Action button first on lisst relative";
                return false;
            }
        }
        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("ActionButtonClicked", false);

        if (!SeleniumDriverInstance.clickElementByXpathUsingActions(AssetsPageObjects.EditAssetButtonRelativeXpath(rowNumber)))
        {
            error = "Failed to click Edit asset button relative";
            return false;
        }

        SeleniumDriverInstance.takeScreenShot("EditButtonClicked", false);

        return true;
    }

    private boolean clickEditButton()
    {
        //Click Action Button
        SeleniumDriverInstance.waitForElementByXpath(AssetsPageObjects.TableLoadingSpinnerXpath());

        if (!SeleniumDriverInstance.waitForElementByXpath(AssetsPageObjects.ActionButtonFirstOnListRelativeXpathText()))
        {
            error = "Failed to wait for Action button first on list";
            return false;
        }

        if (!SeleniumDriverInstance.clickElementByXpathUsingActions(AssetsPageObjects.ActionButtonFirstOnListRelativeXpathText()))
        {
            error = "Failed to click Action button first on list";
            return false;
        }

        if (!SeleniumDriverInstance.waitForfElementToBeClickableByXpath(AssetsPageObjects.EditAssetButtonFirstOnListRelativeXpathText(), 15)
                && browserType.equals(browserType.IE))
        {
            if (!SeleniumDriverInstance.clickElementByXpathUsingActions(AssetsPageObjects.ActionButtonFirstOnListRelativeXpathText()))
            {
                error = "Failed to click Action button First on list";
                return false;
            }
        }
        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("ActionButtonClicked", false);

        if (!SeleniumDriverInstance.clickElementByXpathUsingActions(AssetsPageObjects.EditAssetButtonFirstOnListRelativeXpathText()))
        {
            error = "Failed to click Edit Asset button ";
            return false;
        }

        SeleniumDriverInstance.takeScreenShot("EditButtonClicked", false);

        return true;
    }

    private boolean searchAsset(String assetToSearch)
    {
        SeleniumDriverInstance.waitForPresenceOfElementByXpath(AssetsPageObjects.TableLoadingSpinnerXpath(), 30);

        SeleniumDriverInstance.clearTextByXpath(AssetsPageObjects.SearchBoxRelativeXpath());
        if (!SeleniumDriverInstance.enterTextByXpath(AssetsPageObjects.SearchBoxRelativeXpath(), assetToSearch))
        {
            error = "Failed to enter asset to search";
            return false;
        }

        if (!SeleniumDriverInstance.clickElementbyXpath(AssetsPageObjects.SearchButtonRelativeXpath()))
        {
            error = "Failed to click search button relative";
            return false;
        }

        if (!SeleniumDriverInstance.waitForPresenceOfElementByXpath(AssetsPageObjects.TableLoadingSpinnerXpath(), 30))
        {
            error = "Failed to wait for Table loading";
            return false;
        }

        if (!SeleniumDriverInstance.waitForElementByXpath(AssetsPageObjects.SearchTextRelativeXpath(assetToSearch)))
        {
            error = "Failed to wait for Relative Search text ";
            return false;
        }

        SeleniumDriverInstance.takeScreenShot("AssetSearched", false);

        return true;
    }

    private boolean verifyTabNames()
    {
        //Wait for asset status
        if (!SeleniumDriverInstance.waitForElementByXpath(AssetsPageObjects.AssetStatusLabelRelativeXpathText()))
        {
            error = "Failed to wait for Asset Status Label";
            return false;
        }

        String regNo = testData.getData("Registration Number");

        if (regNo.equals(""))
        {
            regNo = SeleniumDriverInstance.retrieveEnteredTextByXpath(AssetsPageObjects.RegNoTextBoxRelativeXpath());
        }

        testData.extractParameter("Registration Number Used", regNo, "PASS");

        //Verify Columns
        String returnedText
                = SeleniumDriverInstance.verifyUlListByXpath(AssetsPageObjects.EditAssetTabsListRelativeXpathText(), testData.getData("Verified Columns"));

        testData.extractParameter("Columns To Verify", testData.getData("Verified Columns"), "PASS");

        switch (returnedText)
        {
            case "Error":
                return false;
            case "":
                testData.extractParameter("Verified Columns", "All columns found", "PASS");
                SeleniumDriverInstance.takeScreenShot("TabsVerified", false);
                break;
            default:
                testData.extractParameter("Verified Columns", "Missing Columns: " + returnedText, "FAIL");
                SeleniumDriverInstance.takeScreenShot("VerifyTabs", true);
                break;
        }

        return true;
    }

    private boolean addEntry()
    {

        if (!enableEngineHours())
        {
            failedMessage = "Failed to Enable Engine Hours";
        }

        //Click Service History
        if (!SeleniumDriverInstance.clickElementbyXpath(AssetsPageObjects.ServiceHistoryTabRelativeXpathText()))
        {
            error = "Failed to click Service History Tab";
            return false;
        }

        SeleniumDriverInstance.waitForPresenceOfElementByXpath(AssetsPageObjects.TableLoadingSpinnerXpath(), 10);

        if (!SeleniumDriverInstance.waitForElementByXpath(AssetsPageObjects.AddEntryButtonRelativeXpathText()))
        {
            error = "Failed to wait Add entry button";
            return false;
        }
        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("ServiceHistoryClicked", false);

        //Click Add Entry
        if (!SeleniumDriverInstance.clickElementbyXpath(AssetsPageObjects.AddEntryButtonRelativeXpathText()))
        {
            error = "Failed to click Add Entry Button";
            return false;
        }

        if (!SeleniumDriverInstance.waitForfElementToBeClickableByXpath(AssetsPageObjects.ServiceDateInputRelativeXpath(), 10))
        {
            error = "Failed to wait for Service DAte Input ";
            return false;
        }

        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("AddEntryClicked", false);
        try
        {
            String todaysDate = SeleniumDriverInstance.generateDateTimeString("yyyy-MM-dd");
            String systemDefaultDate = SeleniumDriverInstance.getElementAttributeByXpath(AssetsPageObjects.ServiceDateInputRelativeXpath(), "value");
            SeleniumDriverInstance.pause(2500);
            if (!systemDefaultDate.equals(todaysDate))
            {
                testData.extractParameter("Current Date", "Not Selected", "FAIL");
                SeleniumDriverInstance.takeScreenShot("CurrentDateNotSelected", true);

            }

            else
            {
                testData.extractParameter("Current Date", "Selected: " + todaysDate, "PASS");
                SeleniumDriverInstance.takeScreenShot("CurrentDateSelected", false);
            }

            //Get Odometer value
            int odometerValue = Integer.parseInt(SeleniumDriverInstance.getElementAttributeByXpath(AssetsPageObjects.OdometerInputRelativeXpath(), "value")) + 5;

            //Select previous date
            //Click Date Pop Up Button
            if (!SeleniumDriverInstance.clickElementbyXpath(AssetsPageObjects.ServiceHistoryDatePopUpButtonXpath()))
            {
                error = "Failed to click Service History Date pop up button";
                return false;
            }

            if (!SeleniumDriverInstance.waitForfElementToBeClickableByXpath(AssetsPageObjects.ServiceHistoryMonthsDatePickerClassXpath(), 10))
            {
                error = "Failed to wait for Service history Months Date Picker";
                return false;
            }
            //Work out dates
            int previousMonth = Integer.parseInt(todaysDate.substring(5, 7)) - 1;
            int previousDay = Integer.parseInt(todaysDate.substring(8, 10)) - 1;
            int previousYear = Integer.parseInt(todaysDate.substring(0, 4)) - 1;
            String pMonth = SeleniumDriverInstance.getMonthAbr(previousMonth);
            String pDay = String.valueOf(previousDay);
            String pYear = String.valueOf(previousYear);

            //For later use when you have to select month
            //        //Select Month
            //        if(!SeleniumDriverInstance.clickElementbyXpath(AssetsPageObjects.ServiceHistoryMonthsDatePickerClassXpath()))
            //             return false;
            //        
            //        if(!SeleniumDriverInstance.clickElementbyXpath(AssetsPageObjects.ServiceHistorySelectPreviousMonthClassXpath(pMonth)))
            //             return false;
            //        //Take Screenshot
            //        SeleniumDriverInstance.takeScreenShot("PrevoiusMonthSelected", false);
            //Select Day
            if (!SeleniumDriverInstance.clickElementbyXpath(AssetsPageObjects.ServiceHistoryDaysDatePickerClassXpath()))
            {
                error = "Failed to Click Service History Days DAte Picker";
                return false;
            }

            if (pDay.equals("0"))
            {
                if (pMonth.equals("Feb"))
                {
                    if (!SeleniumDriverInstance.clickElementbyXpath(AssetsPageObjects.ServiceHistorySelectPreviousDateClassXpath("27")))
                    {
                        error = "FAiled to click Service History Select Previos Date 27";
                        return false;
                    }
                }
                else if (!SeleniumDriverInstance.clickElementbyXpath(AssetsPageObjects.ServiceHistorySelectPreviousDateClassXpath("30")))
                {
                    error = "FAiled to click Service History Select Previos Date 30";
                    return false;
                }
                //Take Screenshot
                SeleniumDriverInstance.takeScreenShot("PrevoiusDaySelected", false);
            }
            else
            {
                if (!SeleniumDriverInstance.clickElementbyXpath(AssetsPageObjects.ServiceHistorySelectPreviousDateClassXpath(pDay)))
                {
                    error = "FAiled to click Service History Select Previos Date pDay";
                    return false;
                }
                //Take Screenshot
                SeleniumDriverInstance.takeScreenShot("PrevoiusDaySelected", false);
            }

            //For later use when you have to select a year
            //        //Select Year
            //         if(!SeleniumDriverInstance.clickElementbyXpath(AssetsPageObjects.ServiceHistoryYearDatePickerClassXpath()))
            //             return false;
            //         
            //        if(!SeleniumDriverInstance.clickElementbyXpath(AssetsPageObjects.ServiceHistorySelectPreviousYearClassXpath(pYear)))
            //             return false;
            //            //Take Screenshot
            //            SeleniumDriverInstance.takeScreenShot("PrevoiusYearSelected", false);
            //Select Done
            SeleniumDriverInstance.pause(2000);
            if (!SeleniumDriverInstance.doubleClickElementByXpath(AssetsPageObjects.ServiceHistoryDatePickerDoneButtonXpath()))

            {
                if (!SeleniumDriverInstance.clickElementbyXpath(AssetsPageObjects.ServiceHistoryDatePickerDoneButtonXpath()))

                {
                    error = "FAiled to click Service History Date Picker Done Button";
                    return false;
                }
            }

            //Take Screenshot
            SeleniumDriverInstance.takeScreenShot("PrevoiusDateSelected", false);

            //Clear input elements
            SeleniumDriverInstance.clearTextByXpath(AssetsPageObjects.ReferenceInputRelativeXpath());
            SeleniumDriverInstance.clearTextByXpath(AssetsPageObjects.TransactionAmountInputRelativeXpath());
            SeleniumDriverInstance.clearTextByXpath(AssetsPageObjects.OdometerInputRelativeXpath());
            SeleniumDriverInstance.clearTextByXpath(AssetsPageObjects.EngineHoursInputRelativeXpath());

            //Enter Service Date
            if (!testData.getData("Service Date").equals(""))
            {
                SeleniumDriverInstance.clearTextByXpath(AssetsPageObjects.ServiceDateInputRelativeXpath());
                if (!SeleniumDriverInstance.enterTextByXpath(AssetsPageObjects.ServiceDateInputRelativeXpath(), testData.getData("Service Date")))
                {
                    error = "Failed to enter Service Date";
                    return false;
                }
            }

            //Enter Reference
            if (!SeleniumDriverInstance.enterTextByXpath(AssetsPageObjects.ReferenceInputRelativeXpath(), testData.getData("Reference")))
            {
                error = "Failed to enter Reference ";
                return false;
            }
            //Enter Transaction Amount
            if (!SeleniumDriverInstance.enterTextByXpath(AssetsPageObjects.TransactionAmountInputRelativeXpath(), testData.getData("Transaction Amount")))
            {
                error = "Failed to enter Transaction Amount"
                        + "";
                return false;
            }
            //Enter Odometer
            //        if(!SeleniumDriverInstance.enterTextByXpath(AssetsPageObjects.OdometerInputRelativeXpath(),testData.getData("Odometer")))
            //            return false;
            if (!SeleniumDriverInstance.enterTextByXpath(AssetsPageObjects.OdometerInputRelativeXpath(), String.valueOf(odometerValue)))
            {
                error = "Failed to enter Odometer Value";
                return false;
            }
            //Enter Engine Hours
            if (!SeleniumDriverInstance.enterTextByXpath(AssetsPageObjects.EngineHoursInputRelativeXpath(), testData.getData("Engine Hours")))
            {
                error = "Failed to enter Engine Hours";
                return false;
            }
            //Enter Notes
            if (!SeleniumDriverInstance.enterTextByXpath(AssetsPageObjects.NotesTextareatRelativeXpath(), testData.getData("Notes")))
            {
                error = "Failed to enter Notes";
                return false;
            }

            SeleniumDriverInstance.takeScreenShot("ServiceHistoryDataEntered", false);

            //Click Save
            if (!SeleniumDriverInstance.clickElementbyXpath(AssetsPageObjects.ServiceHistorySaveButtonXpath()))
            {
                error = "Failed to click Service History Save button";
                return false;
            }

            //Wait for save popup
            if (!SeleniumDriverInstance.waitForfElementToBeClickableByXpath(AssetsPageObjects.ServiceEntrySavedRelativeXpathText()))
            {
                error = "Failed to wait for Service Entry Saved Relative";
                return false;
            }

            SeleniumDriverInstance.takeScreenShot("ServiceHistoryEntrySaved", false);

            //Remove Recent Added Entry
            if (!removeRecentAddedEntry())
            {
                failedMessage = "Failed To Remove Recent Added Entry";
                return false;
            }

            //Click Cancel to return to landing page.
            if (!SeleniumDriverInstance.clickElementbyXpath(AssetsPageObjects.ServiceHistoryCancelButtonXpath()))
            {
                error = "Failed to click Service History Cancel button";
                return false;
            }
        }
        catch (Exception e)
        {
            e.getMessage();
        }
        return true;
    }

    private boolean addServiceHistory()
    {

        regNo = testData.getData("Registration Number");
        //If Registration Number provided, search and select asset
        if (!regNo.equals(""))
        {
            if (!searchAsset(regNo))
            {
                failedMessage = "Failed to Search Asset";
                System.err.println(failedMessage);
                return false;
            }
            if (!clickEditButton(regNo))
            {
                failedMessage = "Failed to Click Edit Button with a parameter";
                System.err.println(failedMessage);
                return false;
            }

        }
        //Select First Asset on list
        else if (!clickEditButton())
        {
            failedMessage = "Failed to Click Edit Button";
            return false;
        }
        //Verify Tab names
        if (!verifyTabNames())
        {
            failedMessage = "Failed to verify Tab Names";
            return false;
        }
        //Add Entry
        if (!addEntry())
        {
            failedMessage = "Failed to add entry";
            return false;
        }

        return true;
    }

    public boolean enableEngineHours()
    {
        if (!SeleniumDriverInstance.retrieveTextByXpathUsingAttribute(AssetsPageObjects.getConfigurationGroupDropDownSelectedTextXpath()).equals("Engine Hours Enabled"))
        {
            if (browserType.equals(browserType.IE))
            {
                if (!SeleniumDriverInstance.clickElementByXpathUsingActions(AddNewRolePageObjects.ClickConfigurationGroupDropDownXpath()))
                {
                    error = "Failed to click Configuration Grooup drop down";
                    return false;
                }

                if (!SeleniumDriverInstance.clickElementByXpath(AddNewRolePageObjects.SelectConfigurationGroupEnableabledXpath()))
                {
                    error = "Failed to click Configuration group Enable";
                    return false;
                }
            }
            else if (!SeleniumDriverInstance.selectByTextFromDropDownListusingXpath(AddNewRolePageObjects.ClickConfigurationGroupDropDownXpath(), "Engine Hours Enabled"))
            {
                error = "Failed to select Engine Hours Enabled";
                return false;
            }
            //Take Screenshot
            SeleniumDriverInstance.takeScreenShot("EngineHoursEnabled", false);

            //Click Save
            if (!SeleniumDriverInstance.clickElementbyXpath(AssetsPageObjects.ServiceHistorySaveButtonXpath()))
            {
                error = "Failed to click Service History Save Button";
                return false;
            }

            //Wait for save popup
            if (!SeleniumDriverInstance.waitForfElementToBeClickableByXpath(AssetsPageObjects.ServiceHistoryAssetUpdatedTextXpath()))
            {
                error = "Failed to wait for Service history Asset Updated text";
                return false;
            }

            //Take Screenshot
            SeleniumDriverInstance.takeScreenShot("AssetUpdateSaved", false);
        }

        return true;
    }

    public boolean removeRecentAddedEntry()
    {
        while (SeleniumDriverInstance.waitForfElementToBeClickableByXpath(AssetsPageObjects.ServiceHistoryActionButtonXpath(), 10))
        {

            if (!SeleniumDriverInstance.clickElementbyXpath(AssetsPageObjects.ServiceHistoryActionButtonXpath()))
            {
                error = "Failed to click Service History Action button";
                return false;
            }

            if (!SeleniumDriverInstance.clickElementbyXpath(AssetsPageObjects.ServiceHistoryRemoveButtonXpath()))
            {
                error = "Failed to click Service History Remove Button";
                return false;
            }

            //Take Screenshot
            SeleniumDriverInstance.takeScreenShot("RemovingEntry", false);
            if (!SeleniumDriverInstance.clickElementbyXpath(AssetsPageObjects.ServiceHistoryRemoveModalButtonXpath()))
            {
                error = "FAiled to click Service History Remove Modal Button";
                return false;
            }

            //Take Screenshot
            SeleniumDriverInstance.takeScreenShot("EngineHoursEnabled", false);

            //Wait for save popup
            if (!SeleniumDriverInstance.waitForElementByXpath(AssetsPageObjects.ServiceHistoryRemoveSuccessTextXpath()))
            {
                error = "Failed to wait for Service History Remove Success Text";
                return false;
            }

            //Take Screenshot
            SeleniumDriverInstance.takeScreenShot("ServiceHistoryEntryRemoved", false);
        }

        return true;
    }

}
