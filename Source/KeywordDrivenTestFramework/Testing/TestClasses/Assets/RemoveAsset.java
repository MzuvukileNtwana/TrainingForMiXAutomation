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
import KeywordDrivenTestFramework.Testing.PageObjects.AddAssetPageObject;
import KeywordDrivenTestFramework.Testing.PageObjects.AssetsPageObjects;
import KeywordDrivenTestFramework.Testing.PageObjects.TelematicsPageObj;
import static java.lang.System.err;

/**
 *
 * @author nmayekiso
 */
public class RemoveAsset extends BaseClass
{

    int counter = 1;
    TestEntity testData;
    int rowsBeforeRemove;
    int rowsAfterRemove;
    String regNumber = "";
    String registrationNumber = "";
    String assetDescription = "";
    String strandRandNumber;
    int randNumber;
    String concatenate;
    String error;

    public RemoveAsset(TestEntity testData)
    {
        this.testData = testData;
    }

    public TestResult executeTest()
    {
        this.setStartTime();

        if (!AddNewAsset())
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to add a new asset", true);
            counter++;
            narrator.failedMessage("Failed to add a new asset - " + error);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to add a new asset", this.getTotalExecutionTime());
        }

        if (!ValidateAssetsPresent())
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - No assets present", true);
            counter++;
            narrator.failedMessage("No assets present - " + error);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "No assets present", this.getTotalExecutionTime());
        }

        if (!FilterByRegistration())
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to filter", true);
            counter++;
            narrator.failedMessage("Failed to filter - " + error);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to filter", this.getTotalExecutionTime());
        }

        if (!ClickOnActionButton())
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to Click On Action Button", true);
            counter++;
            narrator.failedMessage("" + error);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to Click On Action Button", this.getTotalExecutionTime());
        }

        if (!ClickOnRemove())
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to Click On Remove", true);
            counter++;
            narrator.failedMessage("Failed to Click On Remove - " + error);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to Click On Remove", this.getTotalExecutionTime());
        }

        if (!ValidateButtonsInModalWindow())
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to Validate Buttons In Modal Window", true);
            counter++;
            narrator.failedMessage("Failed to Validate Buttons In Modal Window - " + error);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to Validate Buttons In Modal Window", this.getTotalExecutionTime());
        }

        if (!ClickRemoveButton())
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to Click On Remove Button", true);
            counter++;
            narrator.failedMessage("Failed to Click On Remove Button - " + error);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to Click On Remove Button", this.getTotalExecutionTime());
        }

        if (!clearFilterText())
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to clear Filter Text", true);
            counter++;
            narrator.failedMessage("Failed to clear Filter Text - " + error);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to clear Filter Text", this.getTotalExecutionTime());
        }

        if (!ValidateRemovedAsset(rowsBeforeRemove, rowsAfterRemove))
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to Remove Asset", true);
            counter++;
            narrator.failedMessage(" Failed to Remove Asset - " + error);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to Remove Asset", this.getTotalExecutionTime());
        }

        return new TestResult(testData, Enums.ResultStatus.PASS, "Successfully removed asset", this.getTotalExecutionTime());
    }

    public boolean AddNewAsset()
    {
        //click AddAsset button
        if (!SeleniumDriverInstance.clickElementbyXpath(AddAssetPageObject.AddAssetsButtonXpath()))
        {
            testData.extractParameter("Test result: ", "Could not click Add asset button", "FAIL");
            err.println("[ERROR] Failed to click Add asset button");
             error = "Failed to click Add asset button";
            return false;
        }

        //wait for  asset Details Form 
        if (!SeleniumDriverInstance.waitForElementByXpath(AddAssetPageObject.assetDetails()))
        {
            testData.extractParameter("Test result: ", "Failed to wait for asset details form", "FAIL");
            err.println("[ERROR] Failed to wait for asset details form");
             error = "Failed to wait for asset details form";
            return false;
        }

        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("Successfully Clicked on Add New Asset button", false);

        SeleniumDriverInstance.pause(2000);

        //Get Asset Description from spreadsheet
        if (!SeleniumDriverInstance.enterTextByXpath(AddAssetPageObject.AssetsdescriptionXpath(), this.testData.getData("Asset Description")))
        {
            testData.extractParameter("Test result: ", "Failed to enter Asset Description", "FAIL");
            err.println("[ERROR] Failed to enter Asset Description");
             error = "Failed to enter Asset Description";
            return false;
        }

        //Get Asset Type from spreadsheet
        if (!SeleniumDriverInstance.selectByTextFromDropDownListusingXpath(AddAssetPageObject.assetTypepXath(), this.testData.getData("Asset Type")))
        {
            testData.extractParameter("Test result: ", "Failed to select Asset Type", "FAIL");
            err.println("[ERROR] Failed to select Asset Type");
             error = "Failed to select Asset Type";
            return false;
        }

        //Get Site from spreadsheet
        if (!SeleniumDriverInstance.selectByTextFromDropDownListusingXpath(AddAssetPageObject.SiteXpath(), this.testData.getData("Site")))
        {
            testData.extractParameter("Test result: ", "Failed to select Asset Site name", "FAIL");
            err.println("[ERROR] Failed to select Asset Site name");
             error = " Failed to select Asset Site name";
            return false;
        }

        //Get Configuration group from spreadsheet  
        if (!SeleniumDriverInstance.selectByTextFromDropDownListusingXpath(AddAssetPageObject.ConfigurationGroupXpath(), this.testData.getData("Configuration Group")))
        {
            testData.extractParameter("Test result: ", "Failed to select configuration group", "FAIL");
            err.println("[ERROR] Failed to select configuration");
             error = "Failed to select configuration";
            return false;
        }

        concatenate = "C" + SeleniumDriverInstance.generateDateTimeStampVaule();
        if (!SeleniumDriverInstance.enterTextByXpath(AddAssetPageObject.RegistrationNumberXpath(), concatenate))
        {
            testData.extractParameter("Test result: ", "Failed to enter registration Number", "FAIL");
            err.println("[ERROR] Failed to enter registration Number");
             error = "Failed to enter registration Number";
            return false;
        }

        //Click on the Save button
        if (!SeleniumDriverInstance.clickElementByXpath(AddAssetPageObject.SaveAssetButtonXpath()))
        {
            testData.extractParameter("Test result: ", "Failed to Click Save Button", "FAIL");
            err.println("[ERROR] Failed to Click Save Button");
             error = "Failed to Click Save Button";
            return false;
        }

        if (!SeleniumDriverInstance.waitForElementByXpath(TelematicsPageObj.ButtonSaveDisabledXpath(), 5))
        {
            SeleniumDriverInstance.doubleClickElementByXpath(AddAssetPageObject.SaveAssetButtonXpath());
        }

        if (!SeleniumDriverInstance.waitForElementByXpath(TelematicsPageObj.ButtonSaveDisabledXpath(), 30))
        {
            err.println("[ERROR]: Failed to click Save");
             error = "Failed to click Save";
            return false;
        }

        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("Successfully Completed the required fields, and save button is enabled", false);

        SeleniumDriverInstance.pause(3000);
        //Click on the Cancel button
        if (!SeleniumDriverInstance.clickElementByXpath(AddAssetPageObject.cancelXpath()))
        {
            testData.extractParameter("Test result: ", "Failed to Click Cancel Button", "FAIL");
            err.println("[ERROR] Failed to Click Cancel Button");
             error = "Failed to Click Cancel Button";
            return false;
        }

        return true;
    }

    public boolean ValidateAssetsPresent()
    {
        //number of rows
        String rowsBefore = SeleniumDriverInstance.getElementTextByXpath(AssetsPageObjects.AllAssetsXpath());

        try
        {
            rowsBeforeRemove = Integer.parseInt(rowsBefore);
            //Click Action Button
            if (rowsBeforeRemove == 0)
            {
                SeleniumDriverInstance.takeScreenShot("-No assets present", false);
                return false;
            }
        }
        catch (NumberFormatException e)
        {
            testData.extractParameter("Result", "An exception was thrown on parseInt", "FAIL");
            System.err.println("[ERROR] Exception message: " + e);
            return false;
        }
        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("-Assets present", false);
        return true;
    }

    public boolean FilterByRegistration()
    {
        if (!SeleniumDriverInstance.enterTextByXpath(TelematicsPageObj.searchTextBoxRelativeXpath(), concatenate))
        {
            testData.extractParameter("Test result: ", "Failed to enter Registration", "FAIL");
            err.println("[ERROR] Failed to enter Registration");
             error = "Failed to enter Registration";
            return false;
        }

        if (!SeleniumDriverInstance.clickElementByXpath(TelematicsPageObj.ButtonSearchAssetXpath()))
        {
            SeleniumDriverInstance.moveToElementByXpath(TelematicsPageObj.ActionButtonByRowXpath("1"));

            if (!SeleniumDriverInstance.clickElementByXpath(TelematicsPageObj.ButtonSearchAssetXpath()))
            {
                testData.extractParameter("Test result: ", "Failed to Click Search Button", "FAIL");
                err.println("[ERROR] Failed to Click Search Button");
                 error = "Failed to Click Search Button";
                return false;
            }
        }

        SeleniumDriverInstance.waitForElementByXpath(TelematicsPageObj.SpinnerAssetGridXpath(), 120);
        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("-Searched successfully", false);
        return true;
    }

    public boolean ClickOnActionButton()
    {
        SeleniumDriverInstance.pause(3000);
        //number of rows
        String rowsBefore = SeleniumDriverInstance.getElementTextByXpath(AssetsPageObjects.AllAssetsXpath());
        rowsBeforeRemove = Integer.parseInt(rowsBefore);
        registrationNumber = SeleniumDriverInstance.getElementTextByXpath(AssetsPageObjects.AssetRegistrationXpath());
        assetDescription = SeleniumDriverInstance.getElementTextByXpath(AssetsPageObjects.AssetDescriptionTextXpath());

        //Click Action Button
        if (!SeleniumDriverInstance.clickElementbyXpath(AssetsPageObjects.ActionButtonXpath()))
        {
            SeleniumDriverInstance.takeScreenShot("Unable to click the action button", false);
            return false;
        }
        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("Successfully Clicked the action button", false);
        return true;
    }

    public boolean ClickOnRemove()
    {
        //Click Remove
        if (!SeleniumDriverInstance.clickElementbyXpath(AssetsPageObjects.AssetRemoveXpath()))
        {
            err.println("Failed to click the Remove button");
             error = "Failed to click the Remove button";
            return false;
        }
        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("Successfully Clicked Remove", false);
        return true;
    }

    public boolean ClickRemoveButton()
    {
        //Click Remove Button
        if (!SeleniumDriverInstance.clickElementbyXpath(AssetsPageObjects.AssetRemoveButtonXpath()))
        {
             error = "Failed to click Asset Remove button";
            return false;
        }
        testData.extractParameter("Removed asset state message", SeleniumDriverInstance.retrieveTextByXpath(AssetsPageObjects.popUpMessageXpath()), "PASS");
        SeleniumDriverInstance.pause(5000);
        String rowsAfter = SeleniumDriverInstance.getElementTextByXpath(AssetsPageObjects.AllAssetsXpath());
        rowsAfterRemove = Integer.parseInt(rowsAfter);
        if (!ValidateRemoveDisplayMessage())
        {
            error = "Failed to Validate Remove Display Message";
            return false;
        }

        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("Successfully Clicked Remove Button", false);
        return true;
    }

    public boolean ValidateRemovedAsset(int before, int after)
    {
        //Validate
        if (after >= before)
        {
            testData.extractParameter("Asset Description: " + assetDescription + "<br>Registration: " + registrationNumber, "Assets Before: " + before + "<br>Assets After: " + after, "FAIL");
            SeleniumDriverInstance.takeScreenShot("Could not Delete ", true);
            return false;
        }
        testData.extractParameter("Asset Description: " + assetDescription + "<br>Registration: " + registrationNumber, "Assets Before: " + before + "<br>Assets After: " + after, "PASS");
        SeleniumDriverInstance.takeScreenShot("Successfully Deleted ", false);
        return true;
    }

    public boolean ValidateRemoveDisplayMessage()
    {
        if (!SeleniumDriverInstance.waitForElementByXpath(AssetsPageObjects.RemovedDisplayMessageXpath(), 10))
        {
            testData.extractParameter("Additional Information: ", "Could not Validate Remove Display Message", "FAIL");
            err.println("[ERROR] Failed to validate Remove Display Message");
             error = " Failed to validate Remove Display Message ";
            return false;
        }
        SeleniumDriverInstance.takeScreenShot(counter + " - Validated Remove Display Message", false);
        return true;
    }

    public boolean ValidateButtonsInModalWindow()
    {
        if (!SeleniumDriverInstance.waitForElementByXpath(AssetsPageObjects.AssetRemoveButtonXpath(), 10))
        {
            testData.extractParameter("Additional Information: ", "Could not Validate Remove button in modal window", "FAIL");
            err.println("[ERROR] Failed to validate Remove button in modal window");
             error = "Failed to validate Remove button in modal window";
            return false;
        }

        if (!SeleniumDriverInstance.waitForElementByXpath(AssetsPageObjects.AssetCancelButtonXpath(), 10))
        {
            testData.extractParameter("Additional Information: ", "Could not Validate Cancel button in modal window", "FAIL");
            err.println("[ERROR] Failed to validate Cancel button in modal window");
             error = "Failed to validate Cancel button in modal window";
            return false;
        }
        SeleniumDriverInstance.takeScreenShot(counter + " - Validated Remove Display Message", false);
        return true;
    }

    public boolean EnterRegistrationNumber()
    {
        regNumber = retrieveTestParameterUsingTestCaseId(testData.getData("LinkedTestCaseID"), "registration Number");
        //Enter Registration Number
        if (!SeleniumDriverInstance.enterTextByXpath("//input[@type='text'][@ng-change='$directive.change()']", regNumber))
        {
             error = "Failed to enter regNumber";
            return false;
        }
        SeleniumDriverInstance.clickElementByXpath(TelematicsPageObj.ButtonSearchAssetXpath());
        SeleniumDriverInstance.waitForElementByXpath(TelematicsPageObj.SpinnerAssetGridXpath(), 120);
        SeleniumDriverInstance.takeScreenShot("Entered Registration Number ", false);
        return true;
    }

    public boolean ClickCancel()
    {
        //Click Cancel button
        if (!SeleniumDriverInstance.clickElementbyXpath(AssetsPageObjects.AssetCancelButtonXpath()))
        {
             error = "Failed to click Asset Cancel button";
            return false;
        }
        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("Successfully Clicked Cancel", false);
        return true;
    }

    private boolean clearFilterText()
    {
        //Clear Filtered Text
        if (!SeleniumDriverInstance.clearExistingTextByXpath("//div[@class='text-filter']//input[@type='text']"))
        {
             error = "Failed to clear existing text";
            return false;
        }

        SeleniumDriverInstance.clickElementByXpath("//a[@class='btn btn-small']//i[@class='icon-search']");
        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("Filtered text cleared", false);
        return true;
    }
}
