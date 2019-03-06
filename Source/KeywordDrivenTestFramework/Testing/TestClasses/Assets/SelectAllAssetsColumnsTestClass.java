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
public class SelectAllAssetsColumnsTestClass extends BaseClass
{

    int counter = 1;
    TestEntity testData;
    String failedMessage = "";
    String error = "";

    public SelectAllAssetsColumnsTestClass(TestEntity testData)
    {
        this.testData = testData;
    }

    public TestResult executeSelectAllColumnsTest()
    {

        this.setStartTime();
        if (!selectAllColumns())
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To Select All Assets Columns", true);
            counter++;
            narrator.failedMessage("Failed To Select All Assets Columns - " + error);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To Select All Assets Columns", this.getTotalExecutionTime());
        }
        return new TestResult(testData, Enums.ResultStatus.PASS, "All Assets Columns successfully", this.getTotalExecutionTime());
    }

    private boolean selectAllColumns()
    {
        SeleniumDriverInstance.pause(6000);
        if (!SeleniumDriverInstance.waitForElementByXpath(AssetsPageObjects.DownloadImportButtonRelativeXpath()))
        {
            error = "Failed to wait for the download import button";
            return false;
        }

        //Select all columns
        if (!SeleniumDriverInstance.clickOnColumnChooserList(AssetsPageObjects.ColumnChooserButtonRelativeXpath(),
                AssetsPageObjects.AssetIDRelativeXpath()))
        {
            error = "Failed to choose Asset ID column ";
            return false;
        }

        if (!SeleniumDriverInstance.clickElementbyXpath(AssetsPageObjects.AssetsHeaderLabelRelativeXpathText()))
        {
            error = "Failed to click on the Assets Header label";
            return false;
        }

        if (!SeleniumDriverInstance.clickOnColumnChooserList(AssetsPageObjects.ColumnChooserButtonRelativeXpath(),
                AssetsPageObjects.AssetTypeRelativeXpath()))
        {
            error = "Failed to choose Asset Type column";
            return false;
        }

        if (!SeleniumDriverInstance.clickElementbyXpath(AssetsPageObjects.AssetsHeaderLabelRelativeXpathText()))
        {
            error = "Failed to click on the Assets Header label";
            return false;
        }

        if (!SeleniumDriverInstance.clickOnColumnChooserList(AssetsPageObjects.ColumnChooserButtonRelativeXpath(),
                AssetsPageObjects.CountryRelativeXpath()))
        {
            error = "Failed to choose the Country column";
            return false;
        }

        if (!SeleniumDriverInstance.clickElementbyXpath(AssetsPageObjects.AssetsHeaderLabelRelativeXpathText()))
        {
            error = "Failed to click on the Assets Header label";
            return false;
        }

        if (!SeleniumDriverInstance.clickOnColumnChooserList(AssetsPageObjects.ColumnChooserButtonRelativeXpath(),
                AssetsPageObjects.ConfigUploadDateRelativeXpath()))
        {
            error = "Failed to choose the Config Upload Date column";
            return false;
        }

        if (!SeleniumDriverInstance.clickElementbyXpath(AssetsPageObjects.AssetsHeaderLabelRelativeXpathText()))
        {
            error = "Failed to click on the Assets Header label";
            return false;
        }

        if (!SeleniumDriverInstance.clickOnColumnChooserList(AssetsPageObjects.ColumnChooserButtonRelativeXpath(),
                AssetsPageObjects.ConfigurationGroupRelativeXpath()))
        {
            error = "Failed to choose the Configuration Group column";
            return false;
        }

        if (!SeleniumDriverInstance.clickElementbyXpath(AssetsPageObjects.AssetsHeaderLabelRelativeXpathText()))
        {

            error = "Failed to click on the Assets Header label";
            return false;
        }

        if (!SeleniumDriverInstance.clickOnColumnChooserList(AssetsPageObjects.ColumnChooserButtonRelativeXpath(),
                AssetsPageObjects.CountryRelativeXpath()))
        {
            error = "Failed to choose the Country column";
            return false;
        }

        if (!SeleniumDriverInstance.clickElementbyXpath(AssetsPageObjects.AssetsHeaderLabelRelativeXpathText()))
        {
            error = "Failed to click on the Assets Header label";
            return false;
        }

        if (!SeleniumDriverInstance.clickOnColumnChooserList(AssetsPageObjects.ColumnChooserButtonRelativeXpath(),
                AssetsPageObjects.EngineHoursRelativeXpath()))
        {
            error = "Failed to choose the Engine Hours column";
            return false;
        }

        if (!SeleniumDriverInstance.clickElementbyXpath(AssetsPageObjects.AssetsHeaderLabelRelativeXpathText()))
        {
            error = "Failed to click on the Assets Header label";
            return false;
        }

        if (!SeleniumDriverInstance.clickOnColumnChooserList(AssetsPageObjects.ColumnChooserButtonRelativeXpath(),
                AssetsPageObjects.FleetNumberRelativeXpath()))
        {
            error = "Failed to choose the Fleet Number column";
            return false;
        }

        if (!SeleniumDriverInstance.clickElementbyXpath(AssetsPageObjects.AssetsHeaderLabelRelativeXpathText()))
        {
            error = "Failed to click on the Assets Header label";
            return false;
        }

        if (!SeleniumDriverInstance.clickOnColumnChooserList(AssetsPageObjects.ColumnChooserButtonRelativeXpath(),
                AssetsPageObjects.ImeiRelativeXpath()))
        {
            error = "Failed to choose the Imei column";
            return false;
        }

        if (!SeleniumDriverInstance.clickElementbyXpath(AssetsPageObjects.AssetsHeaderLabelRelativeXpathText()))
        {
            error = "Failed to click on the Assets Header label";
            return false;
        }

        if (!SeleniumDriverInstance.clickOnColumnChooserList(AssetsPageObjects.ColumnChooserButtonRelativeXpath(),
                AssetsPageObjects.ImsiRelativeXpath()))
        {
            error = "Failed to choose the Imsi column";
            return false;
        }

        if (!SeleniumDriverInstance.clickElementbyXpath(AssetsPageObjects.AssetsHeaderLabelRelativeXpathText()))
        {
            error = "Failed to click on the Assets Header label";
            return false;
        }

        if (!SeleniumDriverInstance.clickOnColumnChooserList(AssetsPageObjects.ColumnChooserButtonRelativeXpath(),
                AssetsPageObjects.LastAvlRelativeXpath()))
        {
            error = "Failed to choose the Last Avl column";
            return false;
        }

        if (!SeleniumDriverInstance.clickElementbyXpath(AssetsPageObjects.AssetsHeaderLabelRelativeXpathText()))
        {
            error = "Failed to click on the Assets Header label";
            return false;
        }

        if (!SeleniumDriverInstance.clickOnColumnChooserList(AssetsPageObjects.ColumnChooserButtonRelativeXpath(),
                AssetsPageObjects.LastTripRelativeXpath()))
        {
            error = "Failed to choose the Last Trip column";
            return false;
        }

        if (!SeleniumDriverInstance.clickElementbyXpath(AssetsPageObjects.AssetsHeaderLabelRelativeXpathText()))
        {
            error = "Failed to click on the Assets Header label";
            return false;
        }

        if (!SeleniumDriverInstance.clickOnColumnChooserList(AssetsPageObjects.ColumnChooserButtonRelativeXpath(),
                AssetsPageObjects.MobileDeviceTypeRelativeXpath()))
        {
            error = "Failed to choose the Mobile Device Type column";
            return false;
        }

        if (!SeleniumDriverInstance.clickElementbyXpath(AssetsPageObjects.AssetsHeaderLabelRelativeXpathText()))
        {
            error = "Failed to click on the Assets Header label";
            return false;
        }

        if (!SeleniumDriverInstance.clickOnColumnChooserList(AssetsPageObjects.ColumnChooserButtonRelativeXpath(),
                AssetsPageObjects.MsisdnRelativeXpath()))
        {
            error = "Failed to choose the Msisdn column";
            return false;
        }

        if (!SeleniumDriverInstance.clickElementbyXpath(AssetsPageObjects.AssetsHeaderLabelRelativeXpathText()))
        {
            error = "Failed to click on the Assets Header label";
            return false;
        }

        if (!SeleniumDriverInstance.clickOnColumnChooserList(AssetsPageObjects.ColumnChooserButtonRelativeXpath(),
                AssetsPageObjects.OdometerRelativeXpath()))
        {
            error = "Failed to choose the Odometer column";
            return false;
        }

        if (!SeleniumDriverInstance.clickElementbyXpath(AssetsPageObjects.AssetsHeaderLabelRelativeXpathText()))
        {
            error = "Failed to click on the Assets Header label";
            return false;
        }

        if (!SeleniumDriverInstance.clickOnColumnChooserList(AssetsPageObjects.ColumnChooserButtonRelativeXpath(),
                AssetsPageObjects.RegistrationNumberRelativeXpath()))
        {
            error = "Failed to choose the Registration Number column";
            return false;
        }

        if (!SeleniumDriverInstance.clickElementbyXpath(AssetsPageObjects.AssetsHeaderLabelRelativeXpathText()))
        {
            error = "Failed to click on the Assets Header label";
            return false;
        }

        if (!SeleniumDriverInstance.clickOnColumnChooserList(AssetsPageObjects.ColumnChooserButtonRelativeXpath(),
                AssetsPageObjects.SiterRelativeXpath()))
        {
            error = "Failed to choose the Siter column";
            return false;
        }

        if (!SeleniumDriverInstance.clickElementbyXpath(AssetsPageObjects.AssetsHeaderLabelRelativeXpathText()))
        {
            error = "Failed to click on the Assets Header label";
            return false;
        }

        if (!SeleniumDriverInstance.clickOnColumnChooserList(AssetsPageObjects.ColumnChooserButtonRelativeXpath(),
                AssetsPageObjects.CurrentStateRelativeXpath()))
        {
            error = "Failed to choose the Current State column";
            return false;
        }

        if (!SeleniumDriverInstance.clickElementbyXpath(AssetsPageObjects.ColumnChooserButtonRelativeXpath()))
        {
            error = "Failed to finally click chooser button";
            return false;
        }

        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("AllColumnsSelected", false);

        SeleniumDriverInstance.clickElementbyXpath(AssetsPageObjects.AssetsHeaderLabelRelativeXpathText());

        return true;
    }

}
