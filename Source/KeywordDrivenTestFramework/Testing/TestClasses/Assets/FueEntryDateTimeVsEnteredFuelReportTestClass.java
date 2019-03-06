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
import KeywordDrivenTestFramework.Testing.PageObjects.PassengersPageObjects;

/**
 *
 * @author lmkhontwana
 */
public class FueEntryDateTimeVsEnteredFuelReportTestClass extends BaseClass {
    TestEntity testData;
    String failedMessage = "";String systemDefaultDate ="";String regNo = "";
    public FueEntryDateTimeVsEnteredFuelReportTestClass(TestEntity testData) {
        this.testData = testData;
    }
    
    public TestResult executeFueEntryDateTimeVsEnteredFuelReportTest() {

        this.setStartTime();
        
         if (!fueEntryDateTimeVsEnteredFuelReportTest()) 
        {
            SeleniumDriverInstance.takeScreenShot("FailedToAddFuelEntryAndValidatDateTimeOnEnteredFuelReport", true);
            return new TestResult(testData, Enums.ResultStatus.FAIL, failedMessage, this.getTotalExecutionTime());
        }
         
        return new TestResult(testData, Enums.ResultStatus.PASS, "Fuel Entry Added And DateTime Validated On Fuel Report Successfully", this.getTotalExecutionTime());
      }
      
    
    
     private boolean clickEditButton(String _assetID)
    {
        SeleniumDriverInstance.waitForPresenceOfElementByXpath(AssetsPageObjects.TableLoadingSpinnerXpath(), 30);
        String rowNumber = SeleniumDriverInstance.getElementAttributeByXpath(AssetsPageObjects.AssetIdXpath(_assetID), "row");
        //Click Action Button
        if (!SeleniumDriverInstance.waitForElementByXpath(AssetsPageObjects.ActionButtonByRowXpath(rowNumber)))
            return false;
        
        if (!SeleniumDriverInstance.clickElementByXpathUsingActions(AssetsPageObjects.ActionButtonByRowXpath(rowNumber)))
            return false;
        
        if(!SeleniumDriverInstance.waitForfElementToBeClickableByXpath(AssetsPageObjects.EditAssetButtonFirstOnListRelativeXpathText(), 15)
                && SeleniumDriverInstance.DriverUtility().toUpperCase().equals("INTERNET EXPLORER"))
        {
             if (!SeleniumDriverInstance.clickElementByXpathUsingActions(AssetsPageObjects.ActionButtonFirstOnListRelativeXpathText()))
                    return false;
        }
        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("ActionButtonClicked", false);
        
        if (!SeleniumDriverInstance.clickElementByXpathUsingActions(AssetsPageObjects.EditAssetButtonRelativeXpath(rowNumber)))
            return false;
        
        SeleniumDriverInstance.takeScreenShot("EditButtonClicked", false);
        
        return true;
    }
    
    private boolean clickEditButton()
    {
        //Click Action Button
        if(!SeleniumDriverInstance.waitForPresenceOfElementByXpath(AssetsPageObjects.TableLoadingSpinnerXpath(), 30))
            return false;
        
        if(!SeleniumDriverInstance.waitForElementByXpath(AssetsPageObjects.ActionButtonFirstOnListRelativeXpathText()))
            return false;
         
        
        if (!SeleniumDriverInstance.clickElementByXpathUsingActions(AssetsPageObjects.ActionButtonFirstOnListRelativeXpathText()))
            return false;
        
        if(!SeleniumDriverInstance.waitForfElementToBeClickableByXpath(AssetsPageObjects.EditAssetButtonFirstOnListRelativeXpathText(), 15)
                && SeleniumDriverInstance.DriverUtility().toUpperCase().equals("INTERNET EXPLORER"))
        {
             if (!SeleniumDriverInstance.clickElementByXpathUsingActions(AssetsPageObjects.ActionButtonFirstOnListRelativeXpathText()))
                    return false;
        }
        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("ActionButtonClicked", false);
        
        if (!SeleniumDriverInstance.clickElementByXpathUsingActions(AssetsPageObjects.EditAssetButtonFirstOnListRelativeXpathText()))
            return false;
        
        SeleniumDriverInstance.takeScreenShot("EditButtonClicked", false);
        
        return true;
    }
    
    private boolean searchAsset(String assetToSearch)
    {
        SeleniumDriverInstance.waitForPresenceOfElementByXpath(AssetsPageObjects.TableLoadingSpinnerXpath(), 30);
        
         SeleniumDriverInstance.clearTextByXpath(AssetsPageObjects.SearchBoxRelativeXpath());
        if (!SeleniumDriverInstance.enterTextByXpath(AssetsPageObjects.SearchBoxRelativeXpath(),assetToSearch))
            return false;
        
        if (!SeleniumDriverInstance.clickElementbyXpath(AssetsPageObjects.SearchButtonRelativeXpath()))
            return false;
        
        if(!SeleniumDriverInstance.waitForPresenceOfElementByXpath(AssetsPageObjects.TableLoadingSpinnerXpath(), 30))
            return false;
        
        if (!SeleniumDriverInstance.waitForElementByXpath(AssetsPageObjects.SearchTextRelativeXpath(assetToSearch)))
            return false;
        
        SeleniumDriverInstance.takeScreenShot("AssetSearched", false);
        
        return true;
    }
    
    
    private boolean addFuelData()
    { 
       
        //Wait for asset status
        if(!SeleniumDriverInstance.waitForElementByXpath(AssetsPageObjects.AssetStatusLabelRelativeXpathText()))
            return false;
       
        
        if (regNo.equals("")){
            regNo = SeleniumDriverInstance.retrieveEnteredTextByXpath(AssetsPageObjects.RegNoTextBoxRelativeXpath());
        }
        
        testData.extractParameter("Registration Number Used", regNo,"PASS");
        
         //Click Fuel Data Tab
        if(!SeleniumDriverInstance.clickElementByXpathUsingActions(AssetsPageObjects.FuelDataTabTextXpath()))
            return false;
        
        if(!SeleniumDriverInstance.waitForElementByXpath(AssetsPageObjects.ImportFuelButtonXpath()))
            return false;
        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("FuelDataTabClicked", false);
        
         //Click Add Entry
        if(!SeleniumDriverInstance.clickElementbyXpath(AssetsPageObjects.AddEntryButtonRelativeXpathText()))
             return false;
         
        if(!SeleniumDriverInstance.waitForfElementToBeClickableByXpath(PassengersPageObjects.AddFuelEntryDateInputRelativeXpath(),10))
            return false;
        
        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("AddEntryClicked", false);
        
       
        systemDefaultDate =  SeleniumDriverInstance.getElementAttributeByXpath(PassengersPageObjects.AddFuelEntryDateInputRelativeXpath(),"value");
        
        testData.extractParameter("Current Date", systemDefaultDate,"PASS");
        SeleniumDriverInstance.takeScreenShot("CurrentDate", false);
       
        //Get Previous used data
       int engineHours = Integer.parseInt(SeleniumDriverInstance.retrieveEnteredTextByXpath(AssetsPageObjects.EngineHoursInputRelativeXpath()))+1;
       int odometer = Integer.parseInt(SeleniumDriverInstance.retrieveEnteredTextByXpath(AssetsPageObjects.OdometerInputRelativeXpath()))+1;
       int amount = Integer.parseInt(SeleniumDriverInstance.retrieveEnteredTextByXpath(AssetsPageObjects.TransactionAmountInputRelativeXpath()))+1;
       int volume = Integer.parseInt(SeleniumDriverInstance.retrieveEnteredTextByXpath(PassengersPageObjects.AddFuelEntryVolumeInputRelativeXpath()))+1;
       
        
       //Clear input elements
       SeleniumDriverInstance.clearTextByXpath(PassengersPageObjects.AddFuelEntryVolumeInputRelativeXpath());
       SeleniumDriverInstance.clearTextByXpath(AssetsPageObjects.TransactionAmountInputRelativeXpath());
       SeleniumDriverInstance.clearTextByXpath(AssetsPageObjects.OdometerInputRelativeXpath());
       SeleniumDriverInstance.clearTextByXpath(AssetsPageObjects.EngineHoursInputRelativeXpath());
       
//        //Enter Volume
//        if(!SeleniumDriverInstance.enterTextByXpath(PassengersPageObjects.AddFuelEntryVolumeInputRelativeXpath(),testData.getData("Volume")))
//            return false;
//        //Enter Transaction Amount
//        if(!SeleniumDriverInstance.enterTextByXpath(AssetsPageObjects.TransactionAmountInputRelativeXpath(),testData.getData("Transaction Amount")))
//            return false;
//        //Enter Odometer
//        if(!SeleniumDriverInstance.enterTextByXpath(AssetsPageObjects.OdometerInputRelativeXpath(),testData.getData("Odometer")))
//            return false;
//        //Enter Engine Hours
//        if(!SeleniumDriverInstance.enterTextByXpath(AssetsPageObjects.EngineHoursInputRelativeXpath(),testData.getData("Engine Hours")))
//            return false;
        
        testData.extractParameter("Fuel Entry Data Entered", "Date: "+systemDefaultDate+"   Engine Hours: "+engineHours
                                                        +"   Odometer: "+odometer+"   Volume: "+volume
                                                        +"   Amount: "+amount,"PASS");
        //Enter Volume
        if(!SeleniumDriverInstance.enterTextByXpath(PassengersPageObjects.AddFuelEntryVolumeInputRelativeXpath(),String.valueOf(volume)))
            return false;
        //Enter Transaction Amount
        if(!SeleniumDriverInstance.enterTextByXpath(AssetsPageObjects.TransactionAmountInputRelativeXpath(),String.valueOf(amount)))
            return false;
        //Enter Odometer
        if(!SeleniumDriverInstance.enterTextByXpath(AssetsPageObjects.OdometerInputRelativeXpath(),String.valueOf(odometer)))
            return false;
        //Enter Engine Hours
        if(!SeleniumDriverInstance.enterTextByXpath(AssetsPageObjects.EngineHoursInputRelativeXpath(),String.valueOf(engineHours)))
            return false;
        
        
        
        SeleniumDriverInstance.takeScreenShot("FuelDataEntered", false);
        
        //Click Save
        if(!SeleniumDriverInstance.doubleClickElementByXpath(AssetsPageObjects.ServiceHistorySaveButtonXpath()))
             return false;
        
        //Wait for save popup
        if(!SeleniumDriverInstance.waitForfElementToBeClickableByXpath(PassengersPageObjects.FuelEntrySavedRelativeXpathText()))
            return false;
        
        SeleniumDriverInstance.takeScreenShot("FuelDataSaved", false);
        
        
        //Click Cancel to return to landing page.
        if(!SeleniumDriverInstance.clickElementbyXpath(AssetsPageObjects.ServiceHistoryCancelButtonXpath()))
             return false;
        
        return true;
    }

    private boolean navigateToAssetManagementPage()
    {
       
        //Click Monitor Menu
        if (!SeleniumDriverInstance.clickElementbyXpath(AssetsPageObjects.MonitorMenuRelativeXpath()))
            return false;
        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("MonitorMenuClicked", false);
        
         //Click TripTimeline Menu
        if (!SeleniumDriverInstance.clickElementbyXpath(AssetsPageObjects.AssetSubMenuRelativeXpath()))
            return false;
        
         //Check If Save changes pop up is present
        if(SeleniumDriverInstance.waitForfElementToBeClickableByXpath(AssetsPageObjects.ChangesNotSavedTextXpath(),4))
        {
             if (!SeleniumDriverInstance.clickElementbyXpath(AssetsPageObjects.YesButtonXpath()))
                 return false;
        }
        
        
        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("AssetSubMenuClicked", false);
        
         //Click TripTimeline Menu
        if (!SeleniumDriverInstance.waitForElementByXpath(AssetsPageObjects.AddAssetButtonRelativeXpath()))
            return false;
        
        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("LandedOnAssetManagementPage", false);
        
        return true;
    }
    
    private boolean viewFuelReportData()
    {
        //Click Measure Menu
        if (!SeleniumDriverInstance.clickElementbyXpath(PassengersPageObjects.MeasureMenuRelativeXpath()))
            return false;
        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("MeasureMenuClicked", false);
        
         //Click Reports Sub Menu
        if (!SeleniumDriverInstance.clickElementbyXpath(PassengersPageObjects.ReportsSubMenuRelativeXpath()))
            return false;
        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("ReportsSubMenuClicked", false);
        
        //Wait
        SeleniumDriverInstance.waitForPresenceOfElementByXpath(AssetsPageObjects.TableLoadingSpinnerXpath(), 30);
        
        if(!SeleniumDriverInstance.waitForfElementToBeClickableByXpath(PassengersPageObjects.ReportCategorySelectRelativeXpath()))
            return false;
        
        if(!selectReportType())
            {
               failedMessage = "Failed to Select Report Type";
               System.err.println(failedMessage);
               return false;
            }
        
        if(!SeleniumDriverInstance.waitForfElementToBeClickableByXpath(PassengersPageObjects.EnteredFuelReportRelativeXpath()))
            return false;
        //Click Entered Fuel Report
        if(!SeleniumDriverInstance.clickElementbyXpath(PassengersPageObjects.EnteredFuelReportRelativeXpath()))
            return false;
        //Wait
        SeleniumDriverInstance.waitForPresenceOfElementByXpath(AssetsPageObjects.TableLoadingSpinnerXpath(), 30);
        
        if(!SeleniumDriverInstance.waitForfElementToBeClickableByXpath(PassengersPageObjects.ExpandSiteAssetsRelativeXpath()))
            return false;
        //Click Expand Site Assets
        if(!SeleniumDriverInstance.clickElementbyXpath(PassengersPageObjects.ExpandSiteAssetsRelativeXpath()))
            return false;
        
        //Click Assets
        if(!SeleniumDriverInstance.clickElementbyXpath(PassengersPageObjects.SelectAssetOnTreeRelativeXpath(regNo)))
            return false;
        
        //Click Next
        if(!SeleniumDriverInstance.clickElementbyXpath(PassengersPageObjects.ReportNextButtonXpath()))
            return false;
        //Wait
        SeleniumDriverInstance.waitForPresenceOfElementByXpath(AssetsPageObjects.TableLoadingSpinnerXpath(), 30);
        
        
        if(browserType.equals(browserType.IE)){
            if(!SeleniumDriverInstance.clickElementByXpath(PassengersPageObjects.ReportPeriodSelectRelativeXpath()))
                return false; 

            if(!SeleniumDriverInstance.clickElementByXpath(PassengersPageObjects.ReportPeriodOptionRelativeXpath(testData.getData("Period"))))
                return false; 
        }
        else{
            if(!SeleniumDriverInstance.selectByTextFromDropDownListusingXpath(PassengersPageObjects.ReportPeriodSelectRelativeXpath(),testData.getData("Period")))
                 return false; 
        }
        testData.extractParameter("Report Period", testData.getData("Period"),"PASS");
        //Wait
        SeleniumDriverInstance.waitForPresenceOfElementByXpath(AssetsPageObjects.TableLoadingSpinnerXpath(), 30);
        
        //Click Next
        if(!SeleniumDriverInstance.clickElementbyXpath(PassengersPageObjects.ReportNextButtonXpath()))
            return false;
        
        
        if(browserType.equals(browserType.IE)){
            if(!SeleniumDriverInstance.clickElementByXpath(PassengersPageObjects.ReportActionSelectRelativeXpath()))
                return false; 

            if(!SeleniumDriverInstance.clickElementByXpath(PassengersPageObjects.ReportActionOptionRelativeXpath(testData.getData("Report Action"))))
                return false; 
        }
        else{
            if(!SeleniumDriverInstance.selectByTextFromDropDownListusingXpath(PassengersPageObjects.ReportActionSelectRelativeXpath(),testData.getData("Report Action")))
                 return false; 
        }
        
         testData.extractParameter("Report Action", testData.getData("Report Action"),"PASS");
         //Click Next
        if(!SeleniumDriverInstance.clickElementbyXpath(PassengersPageObjects.ReportRunButtonXpath()))
            return false;
        
        
        //Validate report here
        
        
        return true;
    }
    
    
    public boolean selectReportType() 
    {
        
        if (!SeleniumDriverInstance.retrieveReportCategoryTextByXpath(PassengersPageObjects.ReportCategorySelectRelativeXpath()).equals("Fuel Reports"))
        {
            if(browserType.equals(browserType.IE)){
                if(!SeleniumDriverInstance.clickElementByXpath(PassengersPageObjects.ReportCategorySelectRelativeXpath()))
                    return false; 
        
                if(!SeleniumDriverInstance.clickElementByXpath(PassengersPageObjects.SelectFuelReportRelativeXpath()))
                    return false; 
            }
            else{
                if(!SeleniumDriverInstance.selectByTextFromDropDownListusingXpath(PassengersPageObjects.ReportCategorySelectRelativeXpath(),"Fuel Reports"))
                     return false; 
            }
            
             //Wait
            SeleniumDriverInstance.waitForPresenceOfElementByXpath(AssetsPageObjects.TableLoadingSpinnerXpath(), 30);
               //Take Screenshot
            SeleniumDriverInstance.takeScreenShot("FuelReportsSelected", false);
        }
        
          return true;
    }  
    
    private boolean fueEntryDateTimeVsEnteredFuelReportTest() {
        
         regNo = testData.getData("Registration Number");
        //If Registration Number provided, search and select asset
        if (!regNo.equals("")) 
        {
                if(!searchAsset(regNo))
            {
               failedMessage = "Failed to Search Asset";
               System.err.println(failedMessage);
               return false;
            }
            if(!clickEditButton(regNo))
            {
               failedMessage = "Failed to Click Edit Button";
               System.err.println(failedMessage);
               return false;
            }
            
        }
        //Select First Asset on list
        else
        {
            if(!clickEditButton())
            {
               failedMessage = "Failed to Click Edit Button";
               System.err.println(failedMessage);
               return false;
            }
        }
        //Add Fuel data
        if(!addFuelData())
            {
               failedMessage = "Failed to Add Fuel Data";
               System.err.println(failedMessage);
               return false;
            }
         if(!viewFuelReportData())
            {
               failedMessage = "Failed to view Fuel Report Data";
               System.err.println(failedMessage);
               return false;
            }
        return true;
    }
    
}
