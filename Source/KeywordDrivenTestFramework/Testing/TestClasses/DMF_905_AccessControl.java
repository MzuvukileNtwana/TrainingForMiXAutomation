/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.TestClasses;

import KeywordDrivenTestFramework.Core.BaseClass;
import static KeywordDrivenTestFramework.Core.BaseClass.SeleniumDriverInstance;
import KeywordDrivenTestFramework.Entities.Enums;
import KeywordDrivenTestFramework.Entities.TestEntity;
import KeywordDrivenTestFramework.Entities.TestResult;
import KeywordDrivenTestFramework.Testing.PageObjects.AccessControlDefaultDriverForNonFMUnitsPAgeObjects;
import KeywordDrivenTestFramework.Testing.PageObjects.AccessControlPageObjects;
import KeywordDrivenTestFramework.Testing.PageObjects.AddDriverPageObjects;
import KeywordDrivenTestFramework.Testing.PageObjects.AssetsPredefinedFiltersPageObjects;
import KeywordDrivenTestFramework.Testing.PageObjects.DriversEditObjects;
import KeywordDrivenTestFramework.Testing.PageObjects.DriversImportPageObjects;
import KeywordDrivenTestFramework.Testing.PageObjects.LatestlastpositiondateandtimereflectedonloadPageObjects;
import static java.lang.System.err;
import java.util.Random;

/**
 *
 * @author nmayekiso
 */
public class DMF_905_AccessControl extends BaseClass
{

    int counter = 1;
    TestEntity testData;
    String existingDriver;
    String currentDriver;
    int nameNumber;
    int registrationNumber;
    String strandNameNumber;
    String concatenate;
    String rowNumber;
    String error = "";

    public DMF_905_AccessControl(TestEntity testData)
    {
        this.testData = testData;
    }

    public TestResult executeTest()
    {

        this.setStartTime();

        if (!navigateToDriverManagementPage())
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To Navigate To Drivers Management Page", true);
            counter++;
            narrator.failedMessage("Failed To Navigate To Drivers Management Page - " + error);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To Navigate To Drivers Management Page", this.getTotalExecutionTime());
        }

        if (!addDriver())
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To Navigate To Drivers Management Access Control Page", true);
            counter++;
            narrator.failedMessage("Failed To Navigate To Drivers Management Access Control Page - " + error);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To Navigate To Drivers Management Access Control Page", this.getTotalExecutionTime());
        }

        if (!navigateToAccessControl())
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To Navigate To Access Control Tab", true);
            counter++;
            narrator.failedMessage("Failed To Navigate To Access Control Tab - " + error);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To Navigate To Access Control Tab", this.getTotalExecutionTime());
        }

        if (!selectExistingDriver())
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To click on Select existing driver", true);
            counter++;
            narrator.failedMessage("Failed To click on Select existing driver - " + error);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To click on Select existing driver", this.getTotalExecutionTime());
        }

        if (!clickSelect())
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To click on Select", true);
            counter++;
            narrator.failedMessage("Failed To click on Select - " + error);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To click on Select", this.getTotalExecutionTime());
        }

        if (!expandTree())
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To expand Tree", true);
            counter++;
            narrator.failedMessage("Failed To expand Tree - " + error);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To expand Tree", this.getTotalExecutionTime());
        }

        if (!validateCheckboxTreeSelection())
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to validate Checkbox Tree Selection", true);
            counter++;
            narrator.failedMessage("Failed to validate Checkbox Tree Selection - " + error);
            return new TestResult(testData, Enums.ResultStatus.FAIL, " Failed to validate Checkbox Tree Selection", this.getTotalExecutionTime());
        }

        if (!SelectFirstFiveAsset())
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to SelectFirstFiveAsset", true);
            counter++;
            narrator.failedMessage("Failed to SelectFirstFiveAsset - " + error);
            return new TestResult(testData, Enums.ResultStatus.FAIL, " Failed to SelectFirstFiveAsset", this.getTotalExecutionTime());
        }

        if (!clickSave())
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click save", true);
            counter++;
            narrator.failedMessage("Failed to click save - " + error);
            return new TestResult(testData, Enums.ResultStatus.FAIL, " Failed to click save", this.getTotalExecutionTime());
        }

        if (!removeDriver())
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to remove driver", true);
            counter++;
            narrator.failedMessage("Failed to remove driver - " + error);
            return new TestResult(testData, Enums.ResultStatus.FAIL, " Failed to remove driver", this.getTotalExecutionTime());
        }

        return new TestResult(testData, Enums.ResultStatus.PASS, "Successfully copied access control details from an existing driver", this.getTotalExecutionTime());
    }

    private boolean navigateToDriverManagementPage()
    {
        //Click Monitor Menu
        SeleniumDriverInstance.waitForElementByXpath(AccessControlPageObjects.MonitorMenuRelativeXpath(), 30);

        if (!SeleniumDriverInstance.clickElementbyXpath(AccessControlPageObjects.MonitorMenuRelativeXpath()))
        {
            error = "Failed to click on the Monitor Menu";
            return false;
        }
        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("Monitor Menu Clicked", false);

        //Click Drivers Sub Menu
        if (!SeleniumDriverInstance.clickElementbyXpath(AccessControlPageObjects.DriversSubMenuRelativeXpath()))
        {
            error = "Failed to click on the Drivers submenu";
            return false;
        }
        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("Drivers Sub Menu Clicked", false);

        return true;
    }

    private boolean addDriver()
    {

        if (!SeleniumDriverInstance.waitForElementByXpath(AddDriverPageObjects.DriverHeading(), 30))
        {
            error = "Failed to wait for the Driver Heading";
            return false;
        }

        if (!SeleniumDriverInstance.waitForElementByXpath(AddDriverPageObjects.ButtonAddDriverXpath(), 30))
        {
            error = "Failed to wait for the Add Driver Button";
            return false;
        }
        pause(2000);
        if (!SeleniumDriverInstance.clickElementByXpathUsingActions(AddDriverPageObjects.ButtonAddDriverXpath()))
        {
            if (!SeleniumDriverInstance.clickElementByXpathUsingActions(AddDriverPageObjects.ButtonAddDriverXpath()))
            {
                error = "Failed to click on the Add Driver Button";
                return false;
            }
        }

        try
        {
            Random rand = new Random();
            nameNumber = rand.nextInt(90) + 10;
            strandNameNumber = Integer.toString(nameNumber);
            concatenate = testData.getData("Name") + strandNameNumber + SeleniumDriverInstance.generateDateTimeStampVaule();
        }
        catch (Exception e)
        {
            e.getMessage();
        }

        if (!SeleniumDriverInstance.waitForElementByXpath(AssetsPredefinedFiltersPageObjects.TableSpinnerXpath(), 60))
        {
            error = "Failed to validate Table Spinner";
            err.println("[ERROR] " + error);
            return false;
        }

        if (!SeleniumDriverInstance.waitForElementByXpath(DriversEditObjects.DriverDetailsNameXpath(), 10))
        {
            pause(2000);
            if (!SeleniumDriverInstance.clickElementByXpathUsingActions(AddDriverPageObjects.ButtonAddDriverXpath()))
            {
                if (!SeleniumDriverInstance.clickElementByXpathUsingActions(AddDriverPageObjects.ButtonAddDriverXpath()))
                {
                    error = "Failed to click on the Add Driver Button";
                    return false;
                }
            }
        }

        if (!SeleniumDriverInstance.waitForElementByXpath(DriversEditObjects.DriverDetailsNameXpath(), 60))
        {
            if (!SeleniumDriverInstance.waitForElementByXpath(DriversEditObjects.DriverDetailsNameXpath(), 60))
            {
                error = "Failed to validate Name";
                err.println("[ERROR] " + error);
                return false;
            }
        }

        if (!SeleniumDriverInstance.waitForElementByXpath(DriversEditObjects.DriverDetailsNameXpath()))
        {
            error = "Failed to validate Name Again";
            err.println("[ERROR] " + error);
            return false;
        }

        if (!SeleniumDriverInstance.enterTextByXpath(DriversEditObjects.DriverDetailsNameXpath(), concatenate))
        {
            error = "Failed to enter Name";
            err.println("[ERROR] " + error);
            return false;
        }

        //Get Site from spreadsheet
        if (!SeleniumDriverInstance.selectByTextFromDropDownListusingXpath(DriversEditObjects.SiteXpath(), this.testData.getData("Site")))
        {
            error = "Failed to Select the Site";
            return false;
        }

        if (!SeleniumDriverInstance.CheckIfElementIsEnabled(DriversEditObjects.SaveDriverButtonXpath()))
        {
                     error = "Save Button is disabled";
            err.println("[ERROR] " + error);
            return false;
        }

        if (!SeleniumDriverInstance.clickElementByXpath(DriversEditObjects.SaveDriverButtonXpath()))
        {
              error = "Failed to Click Save Button";          
            err.println("[ERROR] " + error);
            return false;
        }
        currentDriver = concatenate;
//         //Click Driver
//        SeleniumDriverInstance.waitForElementByXpath(AccessControlPageObjects.SelectedDriverXpath());
        SeleniumDriverInstance.pause(2500);
//        if (!SeleniumDriverInstance.clickElementbyXpath(AccessControlPageObjects.SelectedDriverXpath()))
//            return false;
        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot(" - Successfully added driver", false);

        return true;
    }

    private boolean navigateToAccessControl()
    {
        //Click Access Control
        SeleniumDriverInstance.waitForElementByXpath(AccessControlPageObjects.AccessControlXpath(), 60);

        if (!SeleniumDriverInstance.clickElementbyXpath(AccessControlPageObjects.AccessControlXpath()))
        {
            error = "Failed to click on the Access Control Menu";
            return false;
        }
        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot(" - Successfully Navigate To Drivers Management Access Control Tab", false);

        return true;
    }

    private boolean selectExistingDriver()
    {
        pause(10000);
        //Click Driver     
        if (!SeleniumDriverInstance.clickElementByXpathUsingActions(AccessControlPageObjects.ExistingDriverLinkSelectionXpath()))
        {
            if (browserType.equals(browserType.IE))
            {
                if (!SeleniumDriverInstance.doubleClickElementByXpath(AccessControlPageObjects.ExistingDriverLinkSelectionXpath()))
                {
                    error = "{IE}Failed to Click Select an existing driver";
                    err.println("[ERROR]: " + error);
                    return false;
                }
            }
            else
            {
                error = "Failed to Click Select an existing driver";
                return false;
            }
        }
        if (!SeleniumDriverInstance.waitForElementByXpath(AccessControlPageObjects.RadioButtonXpath(), 5) && browserType.equals(browserType.IE))
        {

            if (!SeleniumDriverInstance.doubleClickElementByXpath(AccessControlPageObjects.ExistingDriverLinkSelectionXpath()))
            {
                error = "{IE}Failed to Click Select an existing driver (2)";
                err.println("[ERROR]: " + error);
                return false;
            }
        }
        if (!SeleniumDriverInstance.waitForElementByXpath(AccessControlPageObjects.RadioButtonXpath()))
        {
            error = "Failed to wait for the Radio button";
            return false;
        }

        existingDriver = SeleniumDriverInstance.getElementTextByXpath(AccessControlPageObjects.ExistingDriverXpath());
        if (!SeleniumDriverInstance.clickElementbyXpath(AccessControlPageObjects.RadioButtonXpath()))
        {
            error = "Failed to click on the Radio button";
            return false;
        }
        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot(" - Successfully copied access from existing driver", false);

        return true;
    }

    private boolean clickSelect()
    {
        //Click Select
        SeleniumDriverInstance.waitForElementByXpath(AccessControlPageObjects.SelectXpath());

        if (!SeleniumDriverInstance.clickElementbyXpath(AccessControlPageObjects.SelectXpath()))
        {
            error = "Failed to click on the Select Link";
            return false;
        }
        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot(" - Successfully clicked Select", false);

        return true;
    }

    private boolean clickCancel()
    {
        //Click Cancel
        SeleniumDriverInstance.waitForElementByXpath("//div[@class='modal-footer']//button[text()='Cancel']");

        if (!SeleniumDriverInstance.clickElementbyXpath("//div[@class='modal-footer']//button[text()='Cancel']"))
        {
            error = "Failed to click on the Cancel Button";
            return false;
        }
        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot(" - Successfully clicked cancel", false);

        return true;
    }

    private boolean expandTree()
    {
        pause(3000);
        SeleniumDriverInstance.waitForElementByXpath(AccessControlPageObjects.DVTAutomationTreeXpath(), 30);

        //Expand DVT Automation
        if (!SeleniumDriverInstance.clickElementbyXpath(AccessControlPageObjects.DVTAutomationTreeXpath()))
        {
            error = "Failed to click on the DVT Automation Tree to expand it";
            return false;
        }
        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("DVT Automation expanded", false);

//        if (!SeleniumDriverInstance.clickElementbyXpath(AccessControlPageObjects.InDefaultSiteTreeXpath()))
//        {
//            error = "Failed to click on the Default Site check box";
//            return false;
//        }
        if (!SeleniumDriverInstance.waitForElementByXpath(AccessControlPageObjects.InDefaultSiteTreeXpath(), 30))
        {
            error = "Failed to wait for defaultSite check box";
            err.println("[ERROR]: " + error);
            return false;
        }

        if (!SeleniumDriverInstance.clickElementbyXpath(AccessControlPageObjects.InDefaultSiteTreeXpath()))
        {
            error = "Failed to click on the Default Site check box";
            return false;
        }

        //Expand Default Site
        if (!SeleniumDriverInstance.clickElementbyXpath(AccessControlPageObjects.DefaultSiteTreeXpath()))
        {
            error = "Failed to click on the Default Site Tree";
            return false;
        }

        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("Default Site expanded", false);

        if (!SeleniumDriverInstance.waitForElementByXpath(AccessControlPageObjects.CoupeDefaultSiteTreeXpath(1)))
        {
            error = "Failed to find coupe roadster 1";
            err.println("[ERROR]: " + error);
            return false;
        }

        for (int i = 1; i < 10; i++)
        {
            if (!SeleniumDriverInstance.clickElementByXpath(AccessControlPageObjects.CoupeDefaultSiteTreeXpath(i)))
            {
                error = "Failed to find asset";
                err.println("[ERROR]: " + error);
                return false;
            }
        }

        //Default Fix
        if (!SeleniumDriverInstance.clickElementByXpath(AccessControlPageObjects.DefaultSiteCheckboxXpath()))
        {
            error = "Failed to select default site";
            err.println("[ERROR]: " + error);
            return false;
        }

        String assetsOperable = SeleniumDriverInstance.retrieveTextByXpath(AccessControlPageObjects.AssetsOperableXpath());
        String totalAssets = SeleniumDriverInstance.retrieveTextByXpath(AccessControlPageObjects.TotalAssetsXpath());

        testData.extractParameter("Assets Operable: " + assetsOperable, "Total Assets: " + totalAssets, "PASS");

        pause(2000);

        return true;
    }

    private boolean validateCheckboxTreeSelection()
    {
        //Check Organization checkbox      
        if (!SeleniumDriverInstance.checkBoxSelectionByXpath(AccessControlPageObjects.DVTAutomationCheckboxXpath(), false))
        {
            error = "Failed to Check the DVT Automation Check box";
            return false;
        }
        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("DVT Automation checked", false);

        //Check Default Site checkbox 
        if (!SeleniumDriverInstance.checkBoxSelectionByXpath(AccessControlPageObjects.DefaultSiteCheckboxXpath(), false))
        {
            error = "Failed to check the Default Site check box";
            return false;
        }
        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("Default Site checked", false);

        return true;
    }

    public boolean SelectFirstFiveAsset()
    {
        SeleniumDriverInstance.clickElementByXpath(AccessControlPageObjects.DVTAutomationCheckboxXpath());

        SeleniumDriverInstance.clickElementByXpath(AccessControlPageObjects.DVTAutomationCheckboxXpath());

        if (!SeleniumDriverInstance.waitForElementByXpath(AccessControlPageObjects.CoupeDefaultSiteTreeXpath(1)))
        {
            error = "Failed to find coupe roadster 1 (2)";
            err.println("[ERROR]: " + error);
            return false;
        }

        for (int i = 1; i < 10; i++)
        {

            if (!SeleniumDriverInstance.clickElementByXpath(AccessControlPageObjects.CoupeDefaultSiteTreeXpath(i)))
            {
                error = "Failed to find asset";
                err.println("[ERROR]: " + error);
                return false;
            }
        }

        SeleniumDriverInstance.takeScreenShot("SelectFirstFiveAsset", false);
        return true;
    }

    private boolean validateCheckedAssets()
    {
        //Check Organization checkbox      
        if (!SeleniumDriverInstance.checkBoxSelectionByXpath("//div[@class='tree-item-content']//input[@type='checkbox']", true))
        {
            error = "Failed to check the Asset check box";
            return false;
        }
        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("All assets checked", false);

        return true;
    }

    private boolean clickSave()
    {
        //Click Save
        SeleniumDriverInstance.waitForElementByXpath(AccessControlPageObjects.SaveButtonXpath());

        if (!SeleniumDriverInstance.clickElementbyXpath(AccessControlPageObjects.SaveButtonXpath()))
        {

            if (browserType.equals(browserType.IE))
            {
                if (!SeleniumDriverInstance.doubleClickElementByXpath(AccessControlPageObjects.SaveButtonXpath()))
                {
                    error = "{IE}Failed to Click Save";
                    err.println("[ERROR]: " + error);
                    return false;
                }
            }
            else
            {
                error = "Failed to Click Save";
                return false;
            }
        }

        if (!SeleniumDriverInstance.waitForElementByXpath(AccessControlPageObjects.OnScreenConfirmationXpath()))
        {
            error = "Failed to wait for popup confirmation";
            err.println("[ERROR]: " + error);
            return false;
        }

        if (!SeleniumDriverInstance.clickElementByXpath(AccessControlPageObjects.OnScreenConfirmationXpath()))
        {
            error = "Failed to click popup confirmation";
            err.println("[ERROR]: " + error);
            return false;
        }
        if (!SeleniumDriverInstance.waitForElementByXpath(AccessControlPageObjects.UpdateNotificationXpath()))
        {
            error = "Failed to wait for popup notification";
            err.println("[ERROR]: " + error);
            return false;
        }

        if (!SeleniumDriverInstance.waitForElementByXpath(AccessControlPageObjects.UpdateNotificationXpath(), 5) && browserType.equals(browserType.IE))
        {

            if (!SeleniumDriverInstance.doubleClickElementByXpath(AccessControlPageObjects.UpdateNotificationXpath()))
            {
                error = "{IE}Failed to Click Save";
                err.println("[ERROR]: " + error);
                return false;
            }
        }

        pause(2000);
        testData.extractParameter("Selected Driver: " + currentDriver, "Existing Driver: " + existingDriver, "PASS");
        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("Successfully clicked Save", false);

        return true;
    }

    private boolean removeDriver()
    {
        pause(2000);

        if (!SeleniumDriverInstance.waitForElementByXpath(DriversImportPageObjects.CancelButtonXpath()))
        {
            error = "Failed to wait for cancel button";
            err.println("[ERROR] " + error);
            return false;
        }

        if (!SeleniumDriverInstance.waitForElementByXpathClickable(DriversImportPageObjects.CancelButtonXpath()))
        {
            error = "Failed to wait for cancel button (2)";
            err.println("[ERROR] " + error);
            return false;
        }

        if (!SeleniumDriverInstance.clickElementByXpathUsingActions(DriversImportPageObjects.CancelButtonXpath()))
        {
            error = "Failed to click cancel";
            err.println("[ERROR] " + error);
            return false;
        }

//        if(!SeleniumDriverInstance.waitForElementByXpath(AccessControlPageObjects.OnScreenConfirmationCancelXpath()))
//        {
//            error = "Failed to wait for cancel";
//           err.println("[ERROR] " + error);
//           return false; 
//        }
//        
//        if(!SeleniumDriverInstance.clickElementByXpathUsingActions(AccessControlPageObjects.OnScreenConfirmationCancelXpath()))
//        {
//            error = "Failed to click cancel";
//           err.println("[ERROR] " + error);
//           return false; 
//        }
        pause(2000);

        if (!SeleniumDriverInstance.waitForElementByXpath(LatestlastpositiondateandtimereflectedonloadPageObjects.FiltertextfieldXpath(), 30))
        {
            error = "Failed to Enter driver Description";
            err.println("[ERROR] " + error);
            return false;
        }

        if (!SeleniumDriverInstance.enterTextByXpath(LatestlastpositiondateandtimereflectedonloadPageObjects.FiltertextfieldXpath(), concatenate))
        {
            error = "Failed to Enter driver Description";
            err.println("[ERROR] " + error);
            return false;
        }

        if (!SeleniumDriverInstance.waitForElementByXpath(AssetsPredefinedFiltersPageObjects.RefreshLinkXpath()))
        {
            error = "Failed to wait for the refresh link";
            err.println("[ERROR] " + error);
            return false;
        }
        pause(2000);
        if (!SeleniumDriverInstance.waitForElementByXpath(AssetsPredefinedFiltersPageObjects.SearchButtonXpath(), 30))
        {
            error = "Failed to wait for the search button";
            err.println("[ERROR] " + error);
            return false;
        }
        if (!SeleniumDriverInstance.clickElementByXpath(AssetsPredefinedFiltersPageObjects.SearchButtonXpath()))
        {
            error = "Failed to Click search2";
            err.println("[ERROR] " + error);
            return false;
        }
        pause(1500);

        if (!SeleniumDriverInstance.waitForElementByXpath(AssetsPredefinedFiltersPageObjects.TableSpinnerXpath(), 60))
        {
            error = "Failed to validate Table Spinner";
            err.println("[ERROR] " + error);
            return false;
        }

        pause(2000);
        if (!SeleniumDriverInstance.waitForElementByXpath(AccessControlDefaultDriverForNonFMUnitsPAgeObjects.ActionsXpath()))
        {
            error = "Failed to wait for button actions";
            err.println("[ERROR] " + error);
            return false;
        }

        if (!SeleniumDriverInstance.clickElementByXpath(AccessControlDefaultDriverForNonFMUnitsPAgeObjects.ActionsXpath()))
        {
            error = "Failed to click actions";
            err.println("[ERROR] " + error);
            return false;
        }

        pause(1500);
        if (!SeleniumDriverInstance.waitForElementByXpath(DriversImportPageObjects.RemoveXpath(), 20))
        {
            error = "Failed to wait for remove1";
            err.println("[ERROR] " + error);
            return false;
        }

        if (!SeleniumDriverInstance.clickElementByXpathUsingActions(DriversImportPageObjects.RemoveXpath()))
        {
            error = "Failed to click remove1";
            err.println("[ERROR] " + error);
            return false;
        }

        if (!SeleniumDriverInstance.waitForElementByXpath(DriversImportPageObjects.ConfirmRemoveDriverButtonXpath(), 10))
        {
            error = "Failed to click remove confirm";
            err.println("[ERROR] " + error);
            return false;
        }

        SeleniumDriverInstance.pause(1000);
        if (!SeleniumDriverInstance.clickElementByXpathUsingActions(DriversImportPageObjects.ConfirmRemoveDriverButtonXpath()))
        {
            pause(1500);
            if (!SeleniumDriverInstance.waitForElementByXpath(DriversImportPageObjects.RemoveXpath()))
            {
                error = "Failed to wait for remove ";
                err.println("[ERROR] " + error);
                return false;
            }

            if (!SeleniumDriverInstance.clickElementByXpathUsingActions(DriversImportPageObjects.RemoveXpath()))
            {
                error = "Failed to click remove1 (2)";
                err.println("[ERROR] " + error);
                return false;
            }

            pause(2000);
            if (!SeleniumDriverInstance.waitForElementByXpath(DriversImportPageObjects.ConfirmRemoveDriverButtonXpath(), 20))
            {
                error = " Failed to wait for remove confirm";
                err.println("[ERROR] " + error);
                return false;
            }

            if (!SeleniumDriverInstance.clickElementByXpathUsingActions(DriversImportPageObjects.ConfirmRemoveDriverButtonXpath()))
            {
                error = "Failed to click remove confirm";
                err.println("[ERROR] " + error);
                return false;
            }

        }

        if (!SeleniumDriverInstance.waitForElementByXpath(DriversImportPageObjects.RemovedSuccessffullyXpath()))
        {
            SeleniumDriverInstance.clickElementByXpathUsingActions(DriversImportPageObjects.ConfirmRemoveDriverButtonXpath());
        }

        //
        if (!SeleniumDriverInstance.waitForElementByXpath(DriversImportPageObjects.RemovedSuccessffullyXpath(), 30))
        {
            error = "Failed to validate removed confirmation";
            err.println("[ERROR] " + error);
            return false;
        }
        SeleniumDriverInstance.takeScreenShot("Successfully removed driver", false);

        return true;
    }
}
