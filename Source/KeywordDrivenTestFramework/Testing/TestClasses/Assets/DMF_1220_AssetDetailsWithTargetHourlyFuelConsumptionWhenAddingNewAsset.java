package KeywordDrivenTestFramework.Testing.TestClasses.Assets;

import KeywordDrivenTestFramework.Core.BaseClass;
import static KeywordDrivenTestFramework.Core.BaseClass.SeleniumDriverInstance;
import static KeywordDrivenTestFramework.Core.BaseClass.browserType;
import KeywordDrivenTestFramework.Entities.Enums;
import KeywordDrivenTestFramework.Entities.TestEntity;
import KeywordDrivenTestFramework.Entities.TestResult;
import KeywordDrivenTestFramework.Testing.PageObjects.AccessControlDefaultDriverForNonFMUnitsPAgeObjects;
import KeywordDrivenTestFramework.Testing.PageObjects.AddAssetPageObject;
import KeywordDrivenTestFramework.Testing.PageObjects.AddDriverPageObjects;
import KeywordDrivenTestFramework.Testing.PageObjects.AssetsPageObject.LanguagingAppliedToAssetsPageObjects;
import KeywordDrivenTestFramework.Testing.PageObjects.AssetsPageObjects;
import KeywordDrivenTestFramework.Testing.PageObjects.AssetsPredefinedFiltersPageObjects;
import KeywordDrivenTestFramework.Testing.PageObjects.DriversImportPageObjects;
import KeywordDrivenTestFramework.Testing.PageObjects.MobileDeviceSettingPageObjects;
import KeywordDrivenTestFramework.Testing.PageObjects.TelematicsPageObj;
import KeywordDrivenTestFramework.Testing.TestClasses.Utilities.SelectBreadcrum;
import static java.lang.System.err;
import java.util.concurrent.atomic.AtomicReference;

/**
 *
 * @author yduma
 */
public class DMF_1220_AssetDetailsWithTargetHourlyFuelConsumptionWhenAddingNewAsset extends BaseClass
{

    int counter = 1;
    TestEntity testData;
    String AssetName;
    SelectBreadcrum selectBreadcrum = new SelectBreadcrum(testData);
    String error;

    public DMF_1220_AssetDetailsWithTargetHourlyFuelConsumptionWhenAddingNewAsset(TestEntity testData)
    {
        this.testData = testData;
    }

    public TestResult executeTest()
    {

        this.setStartTime();

        if (!ClickAddAssetButton())
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To ClickAddAssetButton", true);
            counter++;
            narrator.failedMessage("Failed To ClickAddAssetButton - " + error);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To ClickAddAssetButton", this.getTotalExecutionTime());
        }

        if (!ClickConfigurationGroup())
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To ClickConfigurationGroup", true);
            counter++;
            narrator.failedMessage("Failed To ClickConfigurationGroup - " + error);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To ClickConfigurationGroup", this.getTotalExecutionTime());
        }

        if (!SelectConfigurationGroup())
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To SelectConfigurationGroup", true);
            counter++;
            narrator.failedMessage("Failed To SelectConfigurationGroup - " + error);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To SelectConfigurationGroup", this.getTotalExecutionTime());
        }

        if (!fillRequiredFields())
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To fillRequiredFields", true);
            counter++;
            narrator.failedMessage("Failed To fillRequiredFields - " + error);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To fillRequiredFields", this.getTotalExecutionTime());
        }

        if (!ValidateAddAssetsFields())
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To ValidateAddAssetsFields", true);
            counter++;
            narrator.failedMessage("Failed To ValidateAddAssetsFields - " + error);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To ValidateAddAssetsFields", this.getTotalExecutionTime());
        }

        if (!ValidateConfigGroupHasMobileDevice())
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To ValidateConfigGroupHasMobileDevice", true);
            counter++;
            narrator.failedMessage("Failed To ValidateConfigGroupHasMobileDevice - " + error);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To ValidateConfigGroupHasMobileDevice", this.getTotalExecutionTime());
        }

        if (!clickAssetPageName())
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To clickAssetPageName", true);
            counter++;
            narrator.failedMessage("Failed To clickAssetPageName - " + error);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To clickAssetPageName", this.getTotalExecutionTime());
        }

        if (!AddAndRemoveAsset(AssetName))
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To AddAndRemoveAsset", true);
            counter++;
            narrator.failedMessage("Failed To AddAndRemoveAsset - " + error);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To AddAndRemoveAsset", this.getTotalExecutionTime());
        }

        return new TestResult(testData, Enums.ResultStatus.PASS, testData.TestDescription, this.getTotalExecutionTime());
    }

    public boolean clickAssetPageName()
    {
        if (!SeleniumDriverInstance.clickElementByXpath(LanguagingAppliedToAssetsPageObjects.AssetPageNameLabelEnglishXpath()))
        {
            error = "Failed to click the AssetPageName";
            testData.extractParameter("Actual Result", error, "FAIL");
            return false;
        }

        if (!SeleniumDriverInstance.waitForElementByXpath(AssetsPredefinedFiltersPageObjects.RefreshLinkXpath(), 10))
        {
            error = "Failed to validate refresh button";
            err.println("[ERROR] " + error);
            return false;
        }

        if (!SeleniumDriverInstance.waitForElementByXpath(TelematicsPageObj.AssetSearchFilterXpath(), 10))
        {
            error = "Failed to wait for filter";
            err.println("[ERROR] " + error);
            return false;
        }

        return true;
    }

    public boolean ClickAddAssetButton()
    {
        if (!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.EngineHoursColumnXpath(), 5))
        {
            if (!SeleniumDriverInstance.clickElementByXpath(MobileDeviceSettingPageObjects.ColumnChooser()))
            {
                SeleniumDriverInstance.clickElementByXpath(MobileDeviceSettingPageObjects.ColumnChooser());
            }

            if (!SeleniumDriverInstance.clickElementByXpath(MobileDeviceSettingPageObjects.AssetEngineHoursColumnChooserXpath()))
            {
                SeleniumDriverInstance.clickElementByXpath(MobileDeviceSettingPageObjects.ColumnChooser());
                SeleniumDriverInstance.clickElementByXpath(MobileDeviceSettingPageObjects.AssetEngineHoursColumnChooserXpath());
            }
        }

        if (!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.EngineHoursColumnXpath()))
        {
            error = "Failed to wait for EngineHoursColumn";
            err.println("[ERROR]: " + error);
            return false;
        }

        if (!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.AddAssetButtonXpath()))
        {
            error = "Failed to wait for Add Asset Button";
            err.println("[ERROR]: " + error);
            return false;
        }

        if (!SeleniumDriverInstance.clickElementbyXpath(LanguagingAppliedToAssetsPageObjects.AddAssetButtonXpath()))
        {
            error = "Failed to Click Add Asset Button";
            err.println("[ERROR]: " + error);
            return false;
        }

        if (!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.CreateNewAssetPageLabelXpath()))
        {
            error = " Failed to wait for CreateNewAssetPageLabel";
            err.println("[ERROR]: " + error);
            return false;
        }

        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("ClickAddAssetButton", false);
        return true;
    }

    public boolean ClickConfigurationGroup()
    {
        SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.PageLoadingIcon(), 15);

        if (!SeleniumDriverInstance.clickElementByXpath(LanguagingAppliedToAssetsPageObjects.DropDownlistConfGroupXpath()))
        {
            error = "Failed to Click Configuration Group dropdownlist";
            err.println("[ERROR] " + error);
            return false;
        }

        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("ClickConfigurationGroup", false);
        return true;
    }

    public boolean SelectConfigurationGroup()
    {

        if (!SeleniumDriverInstance.selectByTextFromDropDownListusingXpath(AddAssetPageObject.DropDownlistConfGroupXpath(), testData.getData("ddlConfigGroup")))
        {
            error = " Failed to Select Configuration Group dropdownlist";
            err.println("[ERROR] " + error);
            return false;
        }

        SeleniumDriverInstance.clickElementByXpath(AddAssetPageObject.AssetsdescriptionXpath());

        while (SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.targetedHourlyFuelConsumptionInputFieldDisabledXpath(), 2))
        {

            if (browserType.equals(browserType.FireFox))
            {
                if (!SeleniumDriverInstance.selectByTextFromDropDownListusingXpath(AddAssetPageObject.DropDownlistConfGroupXpath(), testData.getData("ddlConfigGroup")))
                {
                    error = " {firefox} Failed to Select Configuration Group dropdownlist";
                    err.println("[ERROR] " + error);
                    return false;
                }
                if (!SeleniumDriverInstance.clickElementByXpath(AddAssetPageObject.AssetsdescriptionXpath()))
                {
                    error = "Failed to click asset description after select Configuration Group dropdownlist";
                    err.println("[ERROR] " + error);
                    return false;
                }
            }
            else
            {
                if (!SeleniumDriverInstance.selectByTextFromDropDownListusingXpath(AddAssetPageObject.DropDownlistConfGroupXpath(), testData.getData("ddlConfigGroup")))
                {
                    error = "Failed to Select Configuration Group dropdownlist";
                    err.println("[ERROR] " + error);
                    return false;
                }
                if (!SeleniumDriverInstance.clickElementByXpath(AddAssetPageObject.AssetsdescriptionXpath()))
                {
                    error = "Failed to click asset description after select Configuration Group dropdownlist";
                    err.println("[ERROR] " + error);
                    return false;
                }
            }

        }

        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("SelectConfigurationGroup", false);
        return true;
    }

    //-----------------------------------------------------------Creating uniqueId----------------------
    private static AtomicReference<Long> currentTime = new AtomicReference<>(System.currentTimeMillis());

    public static Long nextId()
    {
        Long prev;
        Long next = System.currentTimeMillis();
        do
        {
            prev = currentTime.get();
            next = next > prev ? next : prev + 1;
        }
        while (!currentTime.compareAndSet(prev, next));
        return next;
    }

    //------------------------------------------End----------------------------------------
    int count_ = 0;//fillRequiredFields

    public boolean fillRequiredFields()
    {
        if (!SeleniumDriverInstance.moveToAndEnterTextByXpath(LanguagingAppliedToAssetsPageObjects.AssetDescriptionInputFieldXpath(), testData.getData("assetType1") + this.count_))
        {
            error = "Failed to wait for Asset Description field";
            err.println("[ERROR]: " + error);
            return false;
        }
        this.count_++;

        Long AssetRegistrationNo = nextId();
        AssetName = "CA" + AssetRegistrationNo;
        testData.extractParameter("Asset Registration No", AssetName, "UNCHECKED");

        if (!SeleniumDriverInstance.moveToAndEnterTextByXpath(LanguagingAppliedToAssetsPageObjects.RegistrationNumberInputFieldXpath(), AssetName))
        {
            error = "Failed to enter Asset RegistrationNumber";
            err.println("[ERROR]: " + error);
            return false;
        }

        String fuelConsumption = AssetRegistrationNo.toString().substring(0, 3);

        if (!SeleniumDriverInstance.moveToAndEnterTextByXpath(LanguagingAppliedToAssetsPageObjects.TargetFuelConsumptionInputFieldXpath(), fuelConsumption))
        {
            error = " Failed to enter Asset Target Fuel consumption";
            err.println("[ERROR]: " + error);
            return false;
        }

        if (!SeleniumDriverInstance.moveToAndEnterTextByXpath(LanguagingAppliedToAssetsPageObjects.targetedHourlyFuelConsumptionInputFieldXpath(), fuelConsumption))
        {
            error = "Failed to enter Asset Targeted Hourly Fuel consumption";
            err.println("[ERROR]: " + error);
            return false;
        }

        if (!SeleniumDriverInstance.selectByTextFromDropDownListusingXpath(LanguagingAppliedToAssetsPageObjects.SelectAssetTypeDropDownListXpath(), testData.getData("assetType1")))
        {
            error = " Failed to Select Asset Type ";
            err.println("[ERROR]: " + error);
            return false;
        }

        if (!SeleniumDriverInstance.selectByTextFromDropDownListusingXpath(LanguagingAppliedToAssetsPageObjects.SelectSiteId_dropDownListXpath(), testData.getData("SiteId")))
        {
            error = "Failed to Select Asset Site";
            err.println("[ERROR]: " + error);
            return false;
        }

        return true;
    }

    public boolean ValidateAddAssetsFields()
    {
        if (!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.AssetDescriptionInputFieldXpath(), 10))
        {
            error = "Failed to wait for Asset Description field";
            err.println("[ERROR]: " + error);
            return false;
        }

        if (!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.RegistrationNumberInputFieldXpath(), 10))
        {
            error = " Failed to wait for registration number";
            err.println("[ERROR]: " + error);
            return false;
        }

        if (!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.FleetNumberInputXpath(), 10))
        {
            error = "Failed to Validate fleet Number";
            err.println("[ERROR]: " + error);
            return false;
        }

        if (!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.EnglisgConfigurationGroupIdDropDownListXpath(), 10))
        {
            error = "Failed to Validate ConfigurationGroupIdDropDownListXpath";
            err.println("[ERROR]: " + error);
            return false;
        }

        if (!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.EnglishFuelTypeDropDownListXpath(), 10))
        {
            error = "Failed to wait for FuelType DropDown List";
            err.println("[ERROR]: " + error);
            return false;
        }

        if (!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.targetedHourlyFuelConsumptionInputFieldXpath(), 10))
        {
            error = " Failed to wait for targeted Hourly Fuel Consumption Input Field";
            err.println("[ERROR]: " + error);
            return false;
        }

        if (!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.ModelInputFieldXpath(), 10))
        {
            error = "Failed to wait for model input field";
            err.println("[ERROR]: " + error);
            return false;
        }

        if (!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.ChassisNumberInputFieldXpath(), 10))
        {
            error = "Failed to wait for chassis Number inputfield";
            err.println("[ERROR]: " + error);
            return false;
        }

        if (!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.SelectAssetTypeDropDownListXpath(), 10))
        {
            error = "Failed to asset type dropdown list";
            err.println("[ERROR]: " + error);
            return false;
        }

        if (!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.SelectSiteId_dropDownListXpath(), 10))
        {
            error = "Failed to wait for Site ID dropdownlist";
            err.println("[ERROR]: " + error);
            return false;
        }

        if (!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.CountryDropDownListXpath(), 10))
        {
            error = "Failed to wait for Country drop down list";
            err.println("[ERROR]: " + error);
            return false;
        }

        if (!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.TargetFuelConsumptionInputFieldXpath(), 10))
        {
            error = "Failed to wait for Target Fuel Consumption Inputfield";
            err.println("[ERROR]: " + error);
            return false;
        }

        if (!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.MakeInputFieldXpath(), 10))
        {
            error = "Failed to wait for Make input field";
            err.println("[ERROR]: " + error);
            return false;
        }

        if (!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.yearInputFieldXpath(), 10))
        {
            error = "Failed to wait for year Input field";
            err.println("[ERROR]: " + error);
            return false;
        }

        if (!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.EngineNumberInputFieldXpath(), 25))
        {
            error = "Failed to wait for Engine Number InputField";
            err.println("[ERROR]: " + error);
            return false;
        }

        if (!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.AdditionalMobileDeviceInputFieldXpath(), 10))
        {
            error = "Failed to wait for Additional Mobiled Device InputField";
            err.println("[ERROR]: " + error);
            return false;
        }

        if (!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.NoteTextAreaInputFieldXpath(), 10))
        {
            error = "Failed to wait for Note Text area";
            err.println("[ERROR]: " + error);
            return false;
        }

        if (!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.ColourInputFieldXpath(), 10))
        {
            error = "Failed to wait for Colour Inputfield";
            err.println("[ERROR]: " + error);
            return false;
        }

        if (!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.AssetIconXpath(), 10))
        {
            error = "Failed to wait for AssetIcon field";
            err.println("[ERROR]: " + error);
            return false;
        }

        if (!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.SelectIconXpath(), 10))
        {
            error = " Failed to wait for Select Asset Icon";
            err.println("[ERROR]: " + error);
            return false;
        }

        if (!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.TrackingIconAndColourTextLabelXpath()))
        {
            error = "Failed to wait for .TrackingIconAndColourTextLabel";
            err.println("[ERROR]: " + error);
            return false;
        }

        if (!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.TrackingIconTextXpath()))
        {
            error = "Failed to wait for .TrackingIconText";
            err.println("[ERROR]: " + error);
            return false;
        }

        if (!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.ButtonCancelEnglishXpath(), 10))
        {
            error = "Failed to wait for button Cancel";
            err.println("[ERROR]: " + error);
            return false;
        }

        if (!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.ButtonSaveEnglishXpath(), 60))
        {
            error = "Failed to wait for button Save : ";
            err.println("[ERROR]: " + error);
            return false;
        }

        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("ClickConfigurationGroup", false);
        return true;
    }

    public boolean ValidateConfigGroupHasMobileDevice()
    {

        if (!SeleniumDriverInstance.clickElementbyXpath(LanguagingAppliedToAssetsPageObjects.ButtonSaveEnglishXpath()))
        {
            error = " Failed to click Button Save English";
            err.println("[ERROR]: " + error);
            return false;
        }

        SeleniumDriverInstance.waitForElementByXpathTest(LanguagingAppliedToAssetsPageObjects.PageLoadingIcon(), 15);

        if (!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.ConfigGroupNameXpath()))
        {
            error = "Failed to wait for ConfigGroup";
            err.println("[ERROR]: " + error);
            return false;
        }
        if (!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.ConfigGroupNameXpath()))
        {
            error = "Failed to wait for ConfigGroup";
            err.println("[ERROR]: " + error);
            return false;
        }

        String configGroup = SeleniumDriverInstance.getElementTextByXpath(LanguagingAppliedToAssetsPageObjects.ConfigGroupNameXpath());

        if (!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.MobileDeviceXpath()))
        {
            error = "Failed to wait for Mobile Device";
            err.println("[ERROR]: " + error);
            return false;
        }
        String MobileDevice = SeleniumDriverInstance.getElementTextByXpath(LanguagingAppliedToAssetsPageObjects.MobileDeviceXpath());

        testData.extractParameter("Mobile Device : ", MobileDevice + "<br>Configuration Group Name: " + configGroup, "PASS");

        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("ValidateConfigGroupHasMobileDevice", false);
        return true;
    }

    public boolean AddAndRemoveAsset(String asset)
    {

        if (!SeleniumDriverInstance.waitForElementByXpath(AddDriverPageObjects.AssetGridTableLoadingSpinnerXpath(), 30))
        {
            error = "Failed to wait for the table spinner";
            err.println("[ERROR] " + error);
            return false;
        }

        if (!SeleniumDriverInstance.waitForElementByXpath(AddDriverPageObjects.AssetGridTableLoadingSpinnerXpath(), 30))
        {
            error = "Failed to wait for the table spinner";
            err.println("[ERROR] " + error);
            return false;
        }

        if (!SeleniumDriverInstance.waitForElementByXpath(AssetsPredefinedFiltersPageObjects.RefreshLinkXpath(), 10))
        {
            error = " Failed to validate refresh button";
            err.println("[ERROR] " + error);
            return false;
        }

        if (!SeleniumDriverInstance.enterTextByXpath(TelematicsPageObj.AssetSearchFilterXpath(), asset))
        {
            error = "Failed to Enter driver Description";
            err.println("[ERROR] " + error);
            return false;
        }

        if (!SeleniumDriverInstance.clickElementByXpathUsingActions(AssetsPredefinedFiltersPageObjects.SearchButtonXpath()))
        {
            error = "Failed to Click search1";
            err.println("[ERROR] " + error);
            return false;
        }
        if (!SeleniumDriverInstance.waitForElementByXpath(AssetsPageObjects.TableLoadingSpinnerXpath(), 30))
        {
            error = "Failed to validate spinner";
            err.println("[ERROR] " + error);
            return false;
        }
        pause(3000);

        if (!SeleniumDriverInstance.waitForElementByXpath(AddDriverPageObjects.PSGLAndingPageSpinner(), 30))
        {
            error = "Failed to wait for the table spinner";
            err.println("[ERROR] " + error);
            return false;
        }
        SeleniumDriverInstance.pause(1500);

        if (!SeleniumDriverInstance.waitForElementByXpath(AssetsPredefinedFiltersPageObjects.RefreshLinkXpath(), 10))
        {
            error = "Failed to validate refresh button";
            err.println("[ERROR] " + error);
            return false;
        }

        //SeleniumDriverInstance.pause(1500);
        if (!SeleniumDriverInstance.clickElementByXpathUsingActions(AccessControlDefaultDriverForNonFMUnitsPAgeObjects.ActionButtonXpath()))
        {
            error = "Failed to click actions";
            err.println("[ERROR] " + error);
            return false;
        }

        if (!SeleniumDriverInstance.clickElementByXpathUsingActions(DriversImportPageObjects.RemoveXpath()))
        {
            error = " Failed to click remmove1";
            err.println("[ERROR] " + error);
            return false;
        }

        SeleniumDriverInstance.pause(1000);
        if (!SeleniumDriverInstance.clickElementByXpathUsingActions(DriversImportPageObjects.ConfirmRemoveDriverButtonXpath()))
        {
            error = "Failed to click remmove";
            err.println("[ERROR] " + error);
            return false;
        }

        if (!SeleniumDriverInstance.waitForElementByXpath(DriversImportPageObjects.RemoveAssetConfirmationXpath(), 3))
        {
            SeleniumDriverInstance.clickElementByXpathUsingActions(DriversImportPageObjects.ConfirmRemoveDriverButtonXpath());
        }

        //RemoveAssetXpath
        if (!SeleniumDriverInstance.waitForElementByXpath(DriversImportPageObjects.RemoveAssetConfirmationXpath(), 30))
        {
            error = "Failed to validate removed confirmation";
            err.println("[ERROR] " + error);
            return false;
        }

        SeleniumDriverInstance.clearTextByXpath(TelematicsPageObj.AssetSearchFilterXpath());

        SeleniumDriverInstance.takeScreenShot("Removed Asset", false);
        testData.extractParameter("Removed Asset:" + asset, "Successfully removed", "Pass");
        return true;
    }

}
