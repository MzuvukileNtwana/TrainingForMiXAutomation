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

/**
 *
 * @author lmkhontwana
 */
public class DuplicateAssetTestClass extends BaseClass
{

    int counter = 1;
    TestEntity testData;
    String failedMessage = "", error = "";
    String regNo = "";
    String assetID = "";

    public DuplicateAssetTestClass(TestEntity testData)
    {
        this.testData = testData;
    }

    public TestResult executeDuplicateAssetTest()
    {

        this.setStartTime();

        if (!duplicateAsset())
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To Duplicate Asset", true);
            counter++;
            narrator.failedMessage("Failed To Duplicate Asset  - "+error);
            return new TestResult(testData, Enums.ResultStatus.FAIL, failedMessage, this.getTotalExecutionTime());
        }
        return new TestResult(testData, Enums.ResultStatus.PASS, "Asset Duplicated successfully", this.getTotalExecutionTime());
    }

    private boolean clickDuplicateButton()
    {
        SeleniumDriverInstance.clickOnColumnChooserList(AssetsPageObjects.ColumnChooserButtonRelativeXpath(), AssetsPageObjects.AssetIDRelativeXpath());
        SeleniumDriverInstance.clickOnColumnChooserList(AssetsPageObjects.ColumnChooserButtonRelativeXpath(), AssetsPageObjects.RegistrationNumberRelativeXpath());

        SeleniumDriverInstance.waitForPresenceOfElementByXpath(AssetsPageObjects.TableLoadingSpinnerXpath(), 10);
        regNo = SeleniumDriverInstance.retrieveTextByXpath(AssetsPageObjects.getFirstRowRegNoTextXpath());
        assetID = SeleniumDriverInstance.retrieveTextByXpath(AssetsPageObjects.getFirstRowAssetIDTextXpath());
        String rowNumber = "0";
        //Click Action Button
        // SeleniumDriverInstance.pause(3000);
        if (!SeleniumDriverInstance.waitForElementByXpath(AssetsPageObjects.ActionButtonByRowXpath(rowNumber)))
        {
            error = "Failed to wait for actions button";
            return false;
        }
        if (!SeleniumDriverInstance.clickElementbyXpath(AssetsPageObjects.FilterTextboxXpath()))
        {
            error = "Failed to click filter textfield";
            return false;
        }
        if (!SeleniumDriverInstance.clickElementbyXpath(AssetsPageObjects.ActionButtonByRowXpath(rowNumber)))
        {
            error = "Failed to click actions button";
            return false;
        }
        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("ActionButtonClicked", false);

        if (!SeleniumDriverInstance.clickElementbyXpath(AssetsPageObjects.DuplicateButtonRelativeXpath(rowNumber)))
        {
            error = "Failed to click duplicate button";
            return false;
        }

        SeleniumDriverInstance.takeScreenShot("DuplicateButtonClicked", false);

        return true;
    }

    private boolean searchAsset(String assetToSearch)
    {
        SeleniumDriverInstance.waitForPresenceOfElementByXpath(AssetsPageObjects.TableLoadingSpinnerXpath(), 15);

        SeleniumDriverInstance.clearTextByXpath(AssetsPageObjects.SearchBoxRelativeXpath());
        if (!SeleniumDriverInstance.enterTextByXpath(AssetsPageObjects.SearchBoxRelativeXpath(), assetToSearch))
        {
            error = "Failed to filter asset to be searched";
            return false;
        }

        if (!SeleniumDriverInstance.clickElementbyXpath(AssetsPageObjects.SearchButtonRelativeXpath()))
        {
            error = "Failed to click search button";
            return false;
        }

        if (!SeleniumDriverInstance.waitForPresenceOfElementByXpath(AssetsPageObjects.TableLoadingSpinnerXpath(), 30))
        {
            error = "Failed to wait for spinner";
            return false;
        }

        if (!SeleniumDriverInstance.waitForElementByXpath(AssetsPageObjects.SearchTextRelativeXpath(assetToSearch)))
        {
            error = "Failed to wait for filtered asset";
            return false;
        }

        SeleniumDriverInstance.takeScreenShot("AssetSearched", false);

        return true;
    }

    private boolean duplicateAsset()
    {
//        regNo = testData.getData("Registration Number");
        //If Registration Number provided, search and select asset
        if (!regNo.equals(""))
        {
            if (!searchAsset(regNo))
            {
                error = "Failed to search Asset";
                failedMessage = "Failed to Search Asset";
                System.err.println(failedMessage);
                return false;
            }
        }
        //Click Duplicate Button
        if (!clickDuplicateButton())
        {
            error = "Failed to Click Duplicate Button";
            failedMessage = "Failed to Click Duplicate Button";
            return false;
        }

        //wait for Asset details page spinner to finish loading
        SeleniumDriverInstance.pause(1500);
        SeleniumDriverInstance.waitForElementByXpath(AssetsPageObjects.assetDetailsPageSpinnerXpath(), 80);

        if (!SeleniumDriverInstance.waitForElementByXpath(AssetsPageObjects.AssetStatusLabelRelativeXpathText()))
        {
            error = "Failed to wait for asset status label";
            return false;
        }
        //Get Asset ID and Reg No

        SeleniumDriverInstance.scrollToElement(AssetsPageObjects.RegNoTextBoxRelativeXpath());

        if (!SeleniumDriverInstance.enterTextByXpath(AssetsPageObjects.RegNoTextBoxRelativeXpath(), regNo))
        {
            error = "Failed to enter registration number";
            return false;
        }

        if (!SeleniumDriverInstance.clickElementbyXpath(AssetsPageObjects.RegNoLabelRelativeXpathText()))
        {
            error = "Failed to click registration number label";
            return false;
        }

        if (!SeleniumDriverInstance.waitForElementByXpath(AssetsPageObjects.RegNoErrorRelativeXpathText(), 20))
        {
            error = "Failed to wait for reg number error text";
            return false;
        }
        SeleniumDriverInstance.takeScreenShot("RegNoError", false);

        if (!assetID.equals(""))
        {
//            if (!SeleniumDriverInstance.enterTextByXpath(AssetsPageObjects.AssetIDTextBoxRelativeXpath(), " "))
//            {
//                error = "Failed to enter asset ID";
//                return false;
//            }

            SeleniumDriverInstance.scrollToElement(AssetsPageObjects.AssetIDLabelRelativeXpathText());
            if (!SeleniumDriverInstance.clickElementbyXpath(AssetsPageObjects.AssetIDLabelRelativeXpathText()))
            {
                error = "Failed to click asset ID label";
                return false;
            }

//            if (!SeleniumDriverInstance.waitForElementByXpath(AssetsPageObjects.AssetIDErrorRelativeXpathText(), 20))
//            {
//                error = "Failed to wait for asset ID error text";
//                return false;
//            }
            SeleniumDriverInstance.takeScreenShot("AssetIDError", false);
        }

        //Clear textboxes
        SeleniumDriverInstance.clearTextByXpath(AssetsPageObjects.AssetIDTextBoxRelativeXpath());
        SeleniumDriverInstance.clearTextByXpath(AssetsPageObjects.RegNoTextBoxRelativeXpath());

        //Enter empty string
//        if (!SeleniumDriverInstance.enterTextByXpath(AssetsPageObjects.AssetIDTextBoxRelativeXpath(), " "))
//        {
//            error = "Failed to enter asset ID ";
//            return false;
//        }
        //Enter new Reg No
        String NewRegeNo = generateDynamicRegNo();
        if (!SeleniumDriverInstance.enterTextByXpath(AssetsPageObjects.RegNoTextBoxRelativeXpath(), NewRegeNo))
        {
            error = "Failed to enter new registration number";
            return false;
        }
        SeleniumDriverInstance.takeScreenShot("NewRegNo", false);

        //SeleniumDriverInstance.pause(3000);
        if (!SeleniumDriverInstance.clickElementbyXpath(AssetsPageObjects.SaveButtonTextRelativeXpath()))
        {
            error = "Failed to click save button";
            return false;
        }

        if (!SeleniumDriverInstance.waitForElementByXpath(AssetsPageObjects.AssetDuplicatedSuccessRelativeXpathText(), 20))
        {
            error = "Failed to wait for success message";
            return false;
        }
        SeleniumDriverInstance.takeScreenShot("DuplicateAssetSaved", false);

        if (!SeleniumDriverInstance.clickElementbyXpath(AssetsPageObjects.CancelButtonTextRelativeXpath()))
        {
            error = "Failed to click cancel button";
            return false;
        }

        waitForAssetPageSpinner();

        if (!SeleniumDriverInstance.waitForElementByXpath(AssetsPageObjects.AddAssetButtonRelativeXpath()))
        {
            error = "Failed to wait for add asset button";
            return false;
        }

        testData.extractParameter("Parameters Used", "New Reg No: " + NewRegeNo
                + "<br>Reg No: " + regNo
                + "<br>Asset ID: " + assetID, "PASS");

        pause(1000);
        if (!searchAsset(NewRegeNo))
        {
            error = "Failed to Search Asset after Duplicating";
            failedMessage = "Failed to Search Asset after Duplicating";
            System.err.println(failedMessage);
            return false;
        }
        if (!deleteDuplicateAsset())
        {
            error = "Failed to Delete Asset after Duplicating";
            failedMessage = "Failed to Delete Asset after Duplicating";
            System.err.println(failedMessage);
            return false;
        }

        return true;
    }

    private String generateDynamicRegNo()
    {
        String dynamicRegNo = "";

        dynamicRegNo = SeleniumDriverInstance.generateDateTimeString();
        dynamicRegNo = dynamicRegNo.replace('-', ' ').replace('_', ' ').trim().replaceAll("\\s", "");

        return dynamicRegNo;
    }

    public boolean deleteDuplicateAsset()
    {
        waitForAssetPageSpinner();

        if (!SeleniumDriverInstance.clickElementByXpathUsingActions(TelematicsPageObj.ActionfirstRowDropdownXpath()))
        {
            error = "Failed to click actions button dropdown";
            return false;
        }

        if (!SeleniumDriverInstance.waitForElementByXpath(TelematicsPageObj.RemoveAssetRelatieXpath()))
        {
            error = "Failed to wait for remove asset";
            return false;
        }

        if (!SeleniumDriverInstance.clickElementByXpathUsingActions(TelematicsPageObj.RemoveAssetRelatieXpath()))
        {
            error = "Failed to click Remove asset";
            return false;
        }

        if (!SeleniumDriverInstance.waitForElementByXpath(TelematicsPageObj.RemoveAssetButtonRelatieXpath()))
        {
            error = "Failed to wait for remove button";
            return false;
        }

        if (!SeleniumDriverInstance.clickElementByXpathUsingActions(TelematicsPageObj.RemoveAssetButtonRelatieXpath()))
        {
            error = "Failed to click remove button";
            return false;
        }

        waitForAssetPageSpinner();
        SeleniumDriverInstance.takeScreenShot("DuplicatedAssetDeleted", false);

        return true;
    }

    private void waitForAssetPageSpinner()
    {
        SeleniumDriverInstance.pause(2000);
        SeleniumDriverInstance.waitForElementByXpath(AddAssetPageObject.assetLeftPageSpinnerXpath(), 80);
        SeleniumDriverInstance.waitForElementByXpath(AddAssetPageObject.assetRightPageSpinnerXpath(), 80);
        SeleniumDriverInstance.pause(1500);
    }
}
