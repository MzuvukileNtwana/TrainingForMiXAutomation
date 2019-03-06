/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package KeywordDrivenTestFramework.Testing.TestClasses.Assets;

import KeywordDrivenTestFramework.Core.BaseClass;
import static KeywordDrivenTestFramework.Core.BaseClass.SeleniumDriverInstance;
import static KeywordDrivenTestFramework.Core.BaseClass.SikuliDriverInstance;
import KeywordDrivenTestFramework.Entities.Enums;
import KeywordDrivenTestFramework.Entities.TestEntity;
import KeywordDrivenTestFramework.Entities.TestResult;
import KeywordDrivenTestFramework.Testing.PageObjects.AddAssetPageObject;
import KeywordDrivenTestFramework.Testing.PageObjects.AssetsPageObjects;
import KeywordDrivenTestFramework.Testing.PageObjects.TelematicsPageObj;
import KeywordDrivenTestFramework.Utilities.SikuliDriverUtility;

/**
 *
 * @author kbuso
 */
public class InspectAssetDetailsTestClass extends BaseClass {

    int counter = 1;
    TestEntity testData;
    
     public InspectAssetDetailsTestClass(TestEntity testData) {
        SikuliDriverInstance = new SikuliDriverUtility(TelematicsPageObj.MixTeleImagesFolder());
        this.testData = testData;
    }
    
      public TestResult executeTest() {

        this.setStartTime();
        
         if (!InspectEditAssetsPage()) 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To Inspect edit assets page elements", true);
            counter++;
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To Inspect edit assets page elements", this.getTotalExecutionTime());
        }
        
        return new TestResult(testData, Enums.ResultStatus.PASS, "Inspected edit assets page elements Successfully", this.getTotalExecutionTime());
      }
      
     private boolean InspectEditAssetsPage()
    {
        String IsNotDisplayed="";
        String IsDisplayed="";
        SeleniumDriverInstance.pause(3000);
        
        
        clickEditButton();
        
         if(!SeleniumDriverInstance.waitForElementByXpath(TelematicsPageObj.AssetStatusLabelRelativeXpathText()))
            return false;
        
        SeleniumDriverInstance.takeScreenShot("Edit asset page", false);
        
        Boolean AssetDescription = SeleniumDriverInstance.CheckIfElementDisplayedByXpath(AddAssetPageObject.AssetsdescriptionXpath());
        Boolean AssetType = SeleniumDriverInstance.CheckIfElementDisplayedByXpath(AddAssetPageObject.assetTypepXath());
        Boolean Site = SeleniumDriverInstance.CheckIfElementDisplayedByXpath(AddAssetPageObject.SiteXpath());
        Boolean RegistrationNumber = SeleniumDriverInstance.CheckIfElementDisplayedByXpath(AddAssetPageObject.RegistrationNumberXpath());
        Boolean ConfigurationGroup  = SeleniumDriverInstance.CheckIfElementDisplayedByXpath(AddAssetPageObject.ConfigurationGroupXpath());
        Boolean FuelType = SeleniumDriverInstance.CheckIfElementDisplayedByXpath(AddAssetPageObject.FuelTypeXpath());
        Boolean TargetFuelConsumption = SeleniumDriverInstance.CheckIfElementDisplayedByXpath(AddAssetPageObject.FuelConsumptionXpath());
        Boolean TargetHourlyFuelConsumption = SeleniumDriverInstance.CheckIfElementDisplayedByXpath(AddAssetPageObject.TargetHourlyFuelConsumptionXpath());
        Boolean FleetNumber = SeleniumDriverInstance.CheckIfElementDisplayedByXpath(AddAssetPageObject.FleetNumberXpath());
        Boolean Make = SeleniumDriverInstance.CheckIfElementDisplayedByXpath(AddAssetPageObject.VehicleMakeXpath());
        Boolean Model = SeleniumDriverInstance.CheckIfElementDisplayedByXpath(AddAssetPageObject.VehicleModelXpath());
        Boolean Year = SeleniumDriverInstance.CheckIfElementDisplayedByXpath(AddAssetPageObject.VehicleModelyearXpath());
        Boolean ChassisNumber  = SeleniumDriverInstance.CheckIfElementDisplayedByXpath(AddAssetPageObject.ChassisnumberXpath());
        Boolean EngineNumber = SeleniumDriverInstance.CheckIfElementDisplayedByXpath(AddAssetPageObject.EnginenumberXpath());
        Boolean AssetID = SeleniumDriverInstance.CheckIfElementDisplayedByXpath(AddAssetPageObject.AssetIDXpath());
        Boolean AdditionalMobileDevice = SeleniumDriverInstance.CheckIfElementDisplayedByXpath(AddAssetPageObject.MobileDeviceXpath());
        Boolean Notes  = SeleniumDriverInstance.CheckIfElementDisplayedByXpath(AddAssetPageObject.NotesXpath());
        Boolean TrackingIcon = SeleniumDriverInstance.CheckIfElementDisplayedByXpath(AddAssetPageObject.SelectedIconButtonXpath());
        Boolean SelectIcon = SeleniumDriverInstance.CheckIfElementDisplayedByXpath(AddAssetPageObject.SelectIconButtonXpath());
        Boolean AssetColour = SeleniumDriverInstance.CheckIfElementDisplayedByXpath(AddAssetPageObject.AssetColourXpath());
        
        Boolean [] assetFields = new Boolean[]{AssetDescription,AssetType, Site, RegistrationNumber,
        ConfigurationGroup, FuelType ,TargetFuelConsumption,TargetHourlyFuelConsumption, FleetNumber,
        Make, Model, Year, ChassisNumber, EngineNumber, AssetID,AdditionalMobileDevice, Notes, TrackingIcon, SelectIcon, AssetColour};
        
        String [] assetFieldsValues = new String[]{"Asset Description","Asset Type", "Site", "Registration Number","Configuration Group", 
            "Fuel Type" ,"Target Fuel Consumption" ,"Target Hourly Fuel Consumption" , "Fleet Number","Make", "Model", "Year", 
            "Chassis Number", "Engine Number", "AssetID" ,"Additional Mobile Device" , "Notes", "Tracking Icon", "SelectIcon", "Asset Colour"};
        
        for(int i =0; i<assetFields.length -1 ;i++)
        {
            if(assetFields[i].equals(false))
            {
                IsNotDisplayed += assetFieldsValues[i] + " ;";
            }
            else
            {
                IsDisplayed += assetFieldsValues[i] + " ;";
            }
        }
        
        if(!IsNotDisplayed.equals(""))
        {
            testData.extractParameter("Fields not displayed",IsNotDisplayed , "Fail");
        }
        
        testData.extractParameter("fields displayed",IsDisplayed , "Pass");
        
        if (!SeleniumDriverInstance.waitForElementByXpath(AddAssetPageObject.cancelXpath()))
            return false;
        
        SeleniumDriverInstance.takeScreenShot("Edit asset page verified", false);
        
        if (!SeleniumDriverInstance.clickElementByXpathUsingActions(AddAssetPageObject.cancelXpath()))
            return false;
        
        
        return true;
    }
     private boolean clickEditButton()
    {
        //Click Action Button
       
        int rownum = SeleniumDriverInstance.getAssetRowNumberListOnGrid(TelematicsPageObj.AssetListGridRelativeXpath());
        
        if (!SeleniumDriverInstance.waitForElementByXpath(TelematicsPageObj.ActionfirstRowDropdownXpath(rownum)))
            return false;
        
        if (!SeleniumDriverInstance.clickElementByXpathUsingActions(TelematicsPageObj.ActionfirstRowDropdownXpath(rownum)))
            return false;
        
        
        if(!SeleniumDriverInstance.waitForPresenceOfElementByXpath(AssetsPageObjects.TableLoadingSpinnerXpath(), 30))
            return false;
        
        if(!SeleniumDriverInstance.waitForElementByXpath(TelematicsPageObj.ActionButtonFirstOnListRelativeXpathText(rownum)))
            return false;
     
        if (!SeleniumDriverInstance.clickElementByXpathUsingActions(TelematicsPageObj.ActionButtonFirstOnListRelativeXpathText(rownum)))
            return false;
        
        if(!SeleniumDriverInstance.waitForfElementToBeClickableByXpath(TelematicsPageObj.ActionButtonFirstOnListRelativeXpathText(rownum), 15)
                && SeleniumDriverInstance.DriverUtility().toUpperCase().equals("INTERNET EXPLORER"))
        {
             if (!SeleniumDriverInstance.clickElementByXpathUsingActions(TelematicsPageObj.ActionButtonFirstOnListRelativeXpathText(rownum)))
                    return false;
        }
        
        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("ActionButtonClicked", false);
        
//        if (!SeleniumDriverInstance.clickElementByXpathUsingActions(AssetsPageObjects.EditAssetButtonFirstOnListRelativeXpathText()))
//            return false;
        
//         if (!SeleniumDriverInstance.clickElementByXpathUsingActions(AssetsPageObjects.EditAssetButtonFirstOnListRelativeXpathText()))
//            return false;
        
        SeleniumDriverInstance.takeScreenShot("EditButtonClicked", false);
        
        return true;
    }
}

    

