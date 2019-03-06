/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package KeywordDrivenTestFramework.Testing.TestClasses.Assets;

import KeywordDrivenTestFramework.Core.BaseClass;
import static KeywordDrivenTestFramework.Core.BaseClass.SeleniumDriverInstance;
import static KeywordDrivenTestFramework.Core.BaseClass.browserType;
import KeywordDrivenTestFramework.Entities.Enums;
import KeywordDrivenTestFramework.Entities.TestEntity;
import KeywordDrivenTestFramework.Entities.TestResult;
import KeywordDrivenTestFramework.Testing.PageObjects.AssetsPageObject.LanguagingAppliedToAssetsPageObjects;
import KeywordDrivenTestFramework.Testing.TestClasses.Utilities.SelectBreadcrum;
import static java.lang.System.err;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import org.openqa.selenium.Keys;



/**
 *
 * @author YP Duma
 */
public class LanguagingAppliedOnTheAssetsDetails extends BaseClass {

    int counter = 1;
    TestEntity testData;
    SelectBreadcrum selectBreadcrum=new SelectBreadcrum(testData);
    
     public LanguagingAppliedOnTheAssetsDetails(TestEntity testData) {
        this.testData = testData;
    }
    
      public TestResult executeTest() {

        this.setStartTime();
            
        
        if(!selectOrganisationGroup()) 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To selectOrganisationGroup", true);
            counter++;
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To selectOrganisationGroup", this.getTotalExecutionTime());
        }
             
       if(!ClickAddAssetButton()) 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To ClickAddAssetButton", true);
            counter++;
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To ClickAddAssetButton", this.getTotalExecutionTime());
        }        
       
       if (!ValidateAddAssetPageInOtherLanguage()) 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To ValidateLandingPageInOtherLanguage", true);
            counter++;
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To ValidateLandingPageInOtherLanguage", this.getTotalExecutionTime());
        }
       
       if (!ValidateAllAssetDetailsFields()) 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To ValidateAllAssetDetailsFields", true);
            counter++;
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To ValidateAllAssetDetailsFields", this.getTotalExecutionTime());
        }
       
       
       if (!FocusCursorOnAssetDescriptionField()) 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To FocusCursorOnAssetDescriptionField", true);
            counter++;
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To FocusCursorOnAssetDescriptionField", this.getTotalExecutionTime());
        }
       
       if (!ValidateErrorMessage()) 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To ValidateErrorMessage", true);
            counter++;
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To ValidateErrorMessage", this.getTotalExecutionTime());
        }
       
       if (!ClickAssetTypeDropDownList()) 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To ClickAssetTypeDropDownList", true);
            counter++;
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To ClickAssetTypeDropDownList", this.getTotalExecutionTime());
        }
       
       if (!InspectOptions()) 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To InspectOptions", true);
            counter++;
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To InspectOptions", this.getTotalExecutionTime());
        }
       
       if (!TabOffTheDropdownList()) 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To TabOffTheDropdownList", true);
            counter++;
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To TabOffTheDropdownList", this.getTotalExecutionTime());
        }
       
       if (!FocusCursorOnRegistrationNumberField()) 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To FocusCursorOnRegistrationNumberField", true);
            counter++;
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To FocusCursorOnRegistrationNumberField", this.getTotalExecutionTime());
        }
       
       if (!ValidateRegistrationErrorMessage()) 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To ValidateRegistrationErrorMessage", true);
            counter++;
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To ValidateRegistrationErrorMessage", this.getTotalExecutionTime());
        }
       
       if (!ClickOnSiteDropdownList()) 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To ClickOnSiteDropdownList", true);
            counter++;
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To ClickOnSiteDropdownList", this.getTotalExecutionTime());
        }
       
       if (!ValidateSiteIdErrorMessage()) 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To ValidateSiteIdErrorMessage", true);
            counter++;
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To ValidateSiteIdErrorMessage", this.getTotalExecutionTime());
        }
       
       if (!ClickOnCountryDropdownList()) 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To ClickOnCountryDropdownList", true);
            counter++;
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To ClickOnCountryDropdownList", this.getTotalExecutionTime());
        }
       
       if (!ValidateCountryDropDownErrorMessage()) 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To ValidateCountryDropDownErrorMessage", true);
            counter++;
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To ValidateCountryDropDownErrorMessage", this.getTotalExecutionTime());
        }
       
       if (!ClickOnSelectIcon()) 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To ClickOnSelectIcon", true);
            counter++;
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To ClickOnSelectIcon", this.getTotalExecutionTime());
        }
       
       if (!ValidateSelectIcon()) 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To ValidateSelectIcon", true);
            counter++;
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To ValidateSelectIcon", this.getTotalExecutionTime());
        }
       
       if (!HoverHideShowIcon()) 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To HoverHideShowIcon", true);
            counter++;
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To HoverHideShowIcon", this.getTotalExecutionTime());
        }
       
       if (!ValidateHideShowIconText()) 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To ValidateHideShowIconText", true);
            counter++;
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To ValidateHideShowIconText", this.getTotalExecutionTime());
        }
       
       if (!CompleteRequiredField()) 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To CompleteRequiredField", true);
            counter++;
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To CompleteRequiredField", this.getTotalExecutionTime());
        }
       
       if (!ClickSaveButton()) 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To ClickSaveButton", true);
            counter++;
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To ClickSaveButton", this.getTotalExecutionTime());
        }
       
       if (!ValidateAfterSave()) 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To ValidateAfterSave", true);
            counter++;
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To ValidateAfterSave", this.getTotalExecutionTime());
        }
       
              
       if (!HoverOverImageAndValidate()) 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To HoverOverImage", true);
            counter++;
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To HoverOverImage", this.getTotalExecutionTime());
        }
       
       if (!ClickChangeImage()) 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To ClickChangeImage", true);
            counter++;
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To ClickChangeImage", this.getTotalExecutionTime());
        }
       
       if (!ValidateChangeImagePopUpWindow()) 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To ValidateChangeImagePopUpWindow", true);
            counter++;
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To ValidateChangeImagePopUpWindow", this.getTotalExecutionTime());
        }
       
       if (!ChangeOneField()) 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To ChangeOneField", true);
            counter++;
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To ChangeOneField", this.getTotalExecutionTime());
        }
       
       if (!ClickCancelButton()) 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To ClickCancelButton", true);
            counter++;
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To ClickCancelButton", this.getTotalExecutionTime());
        }
       
       if (!ValidatePopUpWindow()) 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To ValidatePopUpWindow", true);
            counter++;
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To ValidatePopUpWindow", this.getTotalExecutionTime());
        }
       
       if (!ClickButtonYes()) 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To ValidatePopUpWindow", true);
            counter++;
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To ValidatePopUpWindow", this.getTotalExecutionTime());
        }
       
        return new TestResult(testData, Enums.ResultStatus.PASS, testData.TestDescription, this.getTotalExecutionTime());
      }
      
     private boolean ValidateAddAssetPageInOtherLanguage()
    {
            SeleniumDriverInstance.waitForElementByXpathTest(LanguagingAppliedToAssetsPageObjects.PageLoadingIcon(),15);
        
            if (!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.HeadingCreateNewAssetXpath(),15))
            {
              err.println("[ERROR]: Failed to wait for Heading Create New Asset in prefered language");
              return false;
            }


          if (!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.ButtonCancelXpath(),10))
           {
              err.println("[ERROR]: Failed to wait for button Cancel");
              return false;
           }

          if (!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.ButtonCancelXpath(),10))
           {
              err.println("[ERROR]: Failed to wait for button Save");
              return false;
           }

      
          if (!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.AssetDetailsTabXpath(),10))
          {
              err.println("[ERROR]: Failed to wait for Asset Details Tab");
              return false;
          } 
          
          testData.extractParameter("Validate Add Asset LandingPage in the selected language", testData.getData("Language"), "PASS");
        
        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("ValidateAddAssetLanguaging", false);  
        return true;
    }
         
     
     public boolean ClickAddAssetButton()
     {
         if (!SeleniumDriverInstance.clickElementbyXpath(LanguagingAppliedToAssetsPageObjects.AddAssetButtonXpath()))
          {
              err.println("[ERROR]: Failed to Click Add Asset Button");
              return false;
          }
         
         //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("ClickAddAssetButton", false);  
        return true;
     }
     
    
     public boolean ValidateAllAssetDetailsFields()
     {
         if (!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.AssetDescriptionInputFieldXpath(),10))
              {
                err.println("[ERROR]: Failed to wait for Asset Description field");
                return false;
              }
         
          if(!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.RegistrationNumberInputFieldXpath(),10))
          {
              err.println("[ERROR]: Failed to wait for registration number");
              return false;
          }
        
        if(!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.FleetNumberInputXpath(),10))
          {
              err.println("[ERROR]: Failed to Validate fleet Number");
              return false;
          }
        
        if(!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.ConfigurationGroupIdDropDownListXpath(),10))
          {
              err.println("[ERROR]: Failed to Validate ConfigurationGroupIdDropDownListXpath");
              return false;
          }
        
        if(!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.FuelTypeDropDownListXpath(),10))
          {
              err.println("[ERROR]: Failed to Validate FuelTypeDropDownListXpath");
              return false;
          }
        
        if(!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.ModelInputFieldXpath(),10))
          {
              err.println("[ERROR]: Failed to wait for model input field");
              return false;
          }
        
        if(!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.ChassisNumberInputFieldXpath(),10))
          {
              err.println("[ERROR]: Failed to wait for chassis Number inputfield");
              return false;
          }
        
        if(!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.AssetTypeDropDownListXpath(),10))
          {
              err.println("[ERROR]: Failed to asset type dropdown list");
              return false;
          }
        
        if(!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.SiteId_dropDownListXpath(),10))
          {
              err.println("[ERROR]: Failed to wait for Site ID dropdownlist");
              return false;
          }
        
        if(!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.CountryDropDownListXpath(),10))
          {
              err.println("[ERROR]: Failed to wait for Country drop down list");
              return false;
          }
        
        if(!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.TargetFuelConsumptionInputFieldXpath(),10))
          {
              err.println("[ERROR]: Failed to wait for Target Fuel Consumption Inputfield");
              return false;
          }
        
        if(!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.MakeInputFieldXpath(),10))
          {
              err.println("[ERROR]: Failed to wait for Make input field");
              return false;
          }
        
        if(!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.yearInputFieldXpath(),10))
          {
              err.println("[ERROR]: Failed to wait for year Input field");
              return false;
          }
                
        if(!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.EngineNumberInputFieldXpath(),25))
          {
              err.println("[ERROR]: Failed to wait for Engine Number InputField");
              return false;
          }
        
        if(!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.AdditionalMobileDeviceInputFieldXpath(),10))
          {
              err.println("[ERROR]: Failed to wait for Additional Mobiled Device InputField");
              return false;
          }
        
        if(!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.NoteTextAreaInputFieldXpath(),10))
          {
              err.println("[ERROR]: Failed to wait for Note Text area");
              return false;
          }
        
        if(!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.ColourInputFieldXpath(),10))
          {
              err.println("[ERROR]: Failed to wait for Colour Inputfield");
              return false;
          }
        
        if(!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.AssetIconXpath(),10))
          {
              err.println("[ERROR]: Failed to wait for AssetIcon field");
              return false;
          }
        
         if(!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.SelectIconXpath(),10))
          {
              err.println("[ERROR]: Failed to wait for Select Asset Icon");
              return false;
          }
        
        if(!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.ButtonCancelXpath(),10))
          {
              err.println("[ERROR]: Failed to wait for button Cancel : ");
              return false;
          }
         
        if(!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.ButtonSaveXpath(),10))
          {
              err.println("[ERROR]: Failed to wait for button Save : ");
              return false;
          }
        
        testData.extractParameter("Validate Add Asset Fields in the selected language", testData.getData("Language"), "PASS");
        
          //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("SuccessfullyValidateAddAssetPage", false);  
        return true;
     }  
     
     public boolean FocusCursorOnAssetDescriptionField()
     {
         if (!SeleniumDriverInstance.clickElementbyXpath(LanguagingAppliedToAssetsPageObjects.AssetDescriptionInputFieldXpath()))
          {
              err.println("[ERROR]: Failed to Click Add Asset Button");
              return false;
          }
         
         SeleniumDriverInstance.pressKey(Keys.TAB);
         
         //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("FocusCursorOnAssetDescriptionField", false);  
        return true;
     }
     
     public boolean ValidateErrorMessage()
     {
          if (!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.ValidationMessageXpath(),10))
          {
              err.println("[ERROR]: Failed to wait for Validation Error Message");
              return false;
          }
         
         //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("ValidationErrorMessage", false);  
        return true;
     }
     
     public boolean ClickAssetTypeDropDownList()
     {
         if (!SeleniumDriverInstance.clickElementbyXpath(LanguagingAppliedToAssetsPageObjects.AssetTypeDropDownListXpath()))
          {
              err.println("[ERROR]: Failed to Click Asset Type Drop Down List");
              return false;
          }
         
         //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("ClickAssetTypeDropDownList", false);  
        return true;
     }
     
     public boolean InspectOptions()
     {
         if (!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.BoatXpath(),10))
              {
                err.println("[ERROR]: Failed to wait for Boats");
                return false;
              }
         
          if(!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.DangerousGoodsXpath(),10))
          {
              err.println("[ERROR]: Failed to wait for DangerousGoods");
              return false;
          }
        
        if(!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.EmergencyServiceVehicleXpath(),10))
          {
              err.println("[ERROR]: Failed to wait for EmergencyServiceVehicle");
              return false;
          }
        
        if(!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.FluidTransportServiceXpath(),10))
          {
              err.println("[ERROR]: Failed to wait for FluidTransportService");
              return false;
          }
        
        if(!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.HeavyPassengerVehicle_Bus_ArticulatedXpath(),10))
          {
              err.println("[ERROR]: Failed to wait for HeavyPassengerVehicle_Bus_Articulated");
              return false;
          }
        
        if(!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.Bus_DoubleDeckerXpath(),10))
          {
              err.println("[ERROR]: Failed to wait for Bus_DoubleDecker");
              return false;
          }
        
        if(!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.Bus_SingleDeckerXpath(),10))
          {
              err.println("[ERROR]: Failed to wait for Bus_SingleDecker");
              return false;
          }
        
        if(!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.HeavyVehicleArticulatedXpath(),10))
          {
              err.println("[ERROR]: Failed to wait for HeavyVehicleArticulated");
              return false;
          }
        
        if(!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.HeavyVehicleNonArticulatedXpath(),10))
          {
              err.println("[ERROR]: Failed to wait for HeavyVehicleNonArticulated");
              return false;
          }
        
        if(!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.RefridgiratedTransportXpath(),10))
          {
              err.println("[ERROR]: Failed to wait for RefridgiratedTransport");
              return false;
          }
        
        if(!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.LightDeliveryVehicleXpath(),10))
          {
              err.println("[ERROR]: Failed to wait for LightDeliveryVehicle");
              return false;
          }
        
        if(!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.MiniBusXpath(),10))
          {
              err.println("[ERROR]: Failed to wait for MiniBus");
              return false;
          }
        
        if(!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.LightVehicleXpath(),10))
          {
              err.println("[ERROR]: Failed to wait for LightVehicle");
              return false;
          }
                
        if(!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.MobilePlantEquipmentXpath(),25))
          {
              err.println("[ERROR]: Failed to wait for MobilePlantEquipment");
              return false;
          }
        
        if(!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.MotorCycleXpath(),10))
          {
              err.println("[ERROR]: Failed to wait for MotorCycle");
              return false;
          }
        
        if(!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.OtherXpath(),10))
          {
              err.println("[ERROR]: Failed to wait for Other");
              return false;
          }
        
        if(!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.PassengerVehicleXpath(),10))
          {
              err.println("[ERROR]: Failed to wait for PassengerVehicle");
              return false;
          }
        
        if(!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.StationaryPlanEquipmentXpath(),10))
          {
              err.println("[ERROR]: Failed to wait for StationaryPlanEquipment");
              return false;
          }
        
         if(!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.TrailerXpath(),10))
          {
              err.println("[ERROR]: Failed to wait for Trailer");
              return false;
          }
        
        if(!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.Train(),10))
          {
              err.println("[ERROR]: Failed to wait for Train : ");
              return false;
          }
         
          testData.extractParameter("Validate Asset Type dropdown list option in the selected language", testData.getData("Language"), "PASS");
          //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("SuccessfullyValidateAddAssetPage", false);  
        return true;
     }
     
     public boolean TabOffTheDropdownList() 
     {
         SeleniumDriverInstance.pressKey(Keys.TAB);       
         
         //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("TabOffTheDropdownList", false);  
        return true;
     }
     
     public boolean ValidateAssetTypeWarningMsg()
     {
         if(!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.ValidationMsgForAssetType(),10))
          {
              err.println("[ERROR]: Failed to wait for ValidateAssetTypeWarningMsg");
              return false;
          }
         
         //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("ValidateAssetTypeWarningMsg", false);  
        return true;
         
     }
     
     
     public boolean FocusCursorOnRegistrationNumberField()
     {
         if (!SeleniumDriverInstance.clickElementbyXpath(LanguagingAppliedToAssetsPageObjects.RegistrationNumberInputFieldXpath()))
          {
              err.println("[ERROR]: Failed to wait for Registration Number InputField");
              return false;
          }
         
         SeleniumDriverInstance.pressKey(Keys.TAB);
         
         //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("FocusCursorOnRegistrationNumberField", false);  
        return true;
     }
     
     public boolean ValidateRegistrationErrorMessage()
     {
          if (!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.ValidateRegistionWarningMessageXpath(),10))
          {
              err.println("[ERROR]: Failed to wait for ValidateRegistionWarningMessage");
              return false;
          }
         
         //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("ValidateRegistrationErrorMessage", false);  
        return true;
     }
     
     public boolean ClickOnSiteDropdownList()
     {
         if (!SeleniumDriverInstance.clickElementbyXpath(LanguagingAppliedToAssetsPageObjects.SiteId_dropDownListXpath()))
          {
              err.println("[ERROR]: Failed to wait for Site Drop down list");
              return false;
          }
         
         SeleniumDriverInstance.pressKey(Keys.TAB);
         
         //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("ClickOnSiteDropdownList", false);  
        return true;
     }
     
     public boolean ValidateSiteIdErrorMessage()
     {
          if (!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.SiteId_ValidationMessageXpath(),10))
          {
              err.println("[ERROR]: Failed to wait for SiteId_ValidationMessage");
              return false;
          }
         
         //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("ValidateSiteIdErrorMessage", false);  
        return true;
     }
     
     public boolean ClickOnCountryDropdownList()
     {
         if (!SeleniumDriverInstance.clickElementbyXpath(LanguagingAppliedToAssetsPageObjects.CountryDropDownListXpath()))
          {
              err.println("[ERROR]: Failed to wait for Site Drop down list");
              return false;
          }
         
         
         //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("ClickOnCountryDropdownList", false);  
        return true;
     }
     
     public boolean ValidateCountryDropDownErrorMessage()
     {
          if (!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.CountryDropDownListXpath(),10))
          {
              err.println("[ERROR]: Failed to wait for SiteId_ValidationMessage");
              return false;
          }
         
          testData.extractParameter("Validated Country Names in the prefered language", testData.getData("Language"), "PASS");
         //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("ValidateCountryDropDownErrorMessage", false);  
        return true;
     }
     
      public boolean ClickOnSelectIcon()
     {
         if (!SeleniumDriverInstance.clickElementbyXpath(LanguagingAppliedToAssetsPageObjects.SelectIconXpath()))
          {
              err.println("[ERROR]: Failed to wait for Select Icon");
              return false;
          }
         
         
         //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("ClickOnCountryDropdownList", false);  
        return true;
     }
     
     public boolean ValidateSelectIcon()
     {
          if (!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.ChooseIconHeadingWindowXpath(),10))
          {
              err.println("[ERROR]: Failed to wait for ChooseIconHeadingWindow");
              return false;
          }
          
          if (!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.SelectColourHeadingXpath(),10))
          {
              err.println("[ERROR]: Failed to wait for SelectColourHeading");
              return false;
          }
          
          if (!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.SelectButtonColourXpath(),10))
          {
              err.println("[ERROR]: Failed to wait for SelectButtonColour");
              return false;
          }
          
          if (!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.CancelButtonColourXpath(),10))
          {
              err.println("[ERROR]: Failed to wait for CancelButtonColour");
              return false;
          }
          
          if (!SeleniumDriverInstance.clickElementByXpath(LanguagingAppliedToAssetsPageObjects.CancelButtonColourXpath()))
          {
              err.println("[ERROR]: Failed to wait for CancelButtonColour");
              return false;
          }
         
          testData.extractParameter("Validated Country Names in the prefered language", testData.getData("Language"), "PASS");
         //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("ValidateCountryDropDownErrorMessage", false);  
        return true;
     }
     
     public boolean HoverHideShowIcon()
     {
         if (!SeleniumDriverInstance.hoverOverElementByXpath(LanguagingAppliedToAssetsPageObjects.Hide_ShowIconXpath()))
          {
              err.println("[ERROR]: Failed to wait for HoverHideShowIcon");
              return false;
          }
         
         //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("HoverHideShowIcon", false);  
        return true;
     }
     
     public boolean ValidateHideShowIconText()
     {
          if (!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.HoverTooltipTextXpath(),10))
          {
              err.println("[ERROR]: Failed to wait for HoverTooltipText");
              return false;
          }
         
         //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("ValidateHideShowIconText", false);  
        return true;
     }
     
     //-----------------------------------------------------------Creating uniqueId----------------------
     
        private static AtomicReference<Long> currentTime = new AtomicReference<>(System.currentTimeMillis());
               
 
        public static Long nextId()
        {
            Long prev; 
            Long next = System.currentTimeMillis();
            do {
                prev = currentTime.get();
                next = next > prev ? next : prev + 1;
            } while (!currentTime.compareAndSet(prev, next));
            return next;
        }
     
     //------------------------------------------End----------------------------------------
     
     public boolean CompleteRequiredField()
     {
         if (!SeleniumDriverInstance.moveToAndEnterTextByXpath(LanguagingAppliedToAssetsPageObjects.AssetDescriptionInputFieldXpath(),testData.getData("TypeAssetDescription")))
          {
              err.println("[ERROR]: Failed to enter Asset Description");
              return false;
          }
         
         Long AssetRegistrationNo = nextId();
         
         testData.extractParameter("Asset Registration No", "CA"+AssetRegistrationNo, "UNCHECKED");
         
         if (!SeleniumDriverInstance.moveToAndEnterTextByXpath(LanguagingAppliedToAssetsPageObjects.RegistrationNumberInputFieldXpath(),"CA"+AssetRegistrationNo))
          {
              err.println("[ERROR]: Failed to enter Asset RegistrationNumber");
              return false;
          }
         
         if (!SeleniumDriverInstance.clickElementbyXpath(LanguagingAppliedToAssetsPageObjects.AssetTypeDropDownListXpath()))
          {
              err.println("[ERROR]: Failed to click Asset Type");
              return false;
          }
         
         if (!SeleniumDriverInstance.selectByTextFromDropDownListusingXpath(LanguagingAppliedToAssetsPageObjects.SelectAssetTypeDropDownListXpath(),testData.getData("assetType1")))
          {
              err.println("[ERROR]: Failed to Select Asset Type");
              return false;
          }
         
         if (!SeleniumDriverInstance.clickElementbyXpath(LanguagingAppliedToAssetsPageObjects.SiteId_dropDownListXpath()))
          {
              err.println("[ERROR]: Failed to click Asset Site");
              return false;
          }
         if (!SeleniumDriverInstance.selectByTextFromDropDownListusingXpath(LanguagingAppliedToAssetsPageObjects.SelectSiteId_dropDownListXpath(),testData.getData("assetSite0")))
          {
              err.println("[ERROR]: Failed to Select Asset Site");
              return false;
          }
         
                  
         //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("CompleteRequiredField", false);
         return true;
     }
     
     public boolean ClickSaveButton()
     {
          if (!SeleniumDriverInstance.clickElementByXpath(LanguagingAppliedToAssetsPageObjects.ButtonSaveXpath()))
          {
              err.println("[ERROR]: Failed to Click Save Button");
              return false;
          }
         
         //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("ClickSaveButton", false);  
        return true;
     }
     
     public boolean ValidateAfterSave()
     {
         if (!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.AssetSuccessfulCreatedTextXpath(),10))
          {
              err.println("[ERROR]: Failed to wait for AssetSuccessfulCreatedText");
              return false;
          }
         
         SeleniumDriverInstance.waitForElementByXpathTest(LanguagingAppliedToAssetsPageObjects.PageLoadingIcon(),15);

         if (!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.NoConfigGroupTextXpath(),10))
          {
              SeleniumDriverInstance.clickElementByXpath(LanguagingAppliedToAssetsPageObjects.Hide());
          }
         
          if (!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.NoConfigGroupTextXpath(),10))
          {
              err.println("[ERROR]: Failed to wait for NoConfigGroupText");
              return false;
          }
          
          if (!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.NoMobileDeviceTextXpath(),10))
          {
              err.println("[ERROR]: Failed to wait for NoMobileDeviceText");
              return false;
          }
          
          SeleniumDriverInstance.moveToElementByXpath(LanguagingAppliedToAssetsPageObjects.Thumbnail());
          
          if (!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.ChangeStringXpath()))
          {
              SeleniumDriverInstance.clickElementByXpath(LanguagingAppliedToAssetsPageObjects.Hide());
              SeleniumDriverInstance.moveToElementByXpath(LanguagingAppliedToAssetsPageObjects.Thumbnail());
              SeleniumDriverInstance.moveToElementByXpath(LanguagingAppliedToAssetsPageObjects.Thumbnail());
              err.println("move To ChangeString");
          }
          
          SeleniumDriverInstance.moveToElementByXpath(LanguagingAppliedToAssetsPageObjects.Thumbnail());
          
          if (!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.ChangeStringXpath()))
          {
              err.println("[ERROR]: Failed to wait for ChangeString");
              return false;
          }
          
          if (!SeleniumDriverInstance.waitForElementByXpathTest(LanguagingAppliedToAssetsPageObjects.AssetStatus(),30))
          {
              err.println("[ERROR]: Failed to wait for AssetStatus");
              return false;
          }
         
         //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("ValidateAfterSave", false);  
        return true;
     }
     
     public boolean HoverOverImageAndValidate()
     {
         if (!SeleniumDriverInstance.moveToElementByXpath(LanguagingAppliedToAssetsPageObjects.ImageDisplayXpath()))
          {
              err.println("[ERROR]: Failed to Hover over Image");
              return false;
          }
         
         if (!SeleniumDriverInstance.waitForElementByXpathTest(LanguagingAppliedToAssetsPageObjects.ChangeStringXpath(),5))
          {
              SeleniumDriverInstance.moveToElementByXpath(LanguagingAppliedToAssetsPageObjects.ImageDisplayXpath());
              SeleniumDriverInstance.moveToElementByXpath(LanguagingAppliedToAssetsPageObjects.ImageDisplayXpath());
          }
         
         if (!SeleniumDriverInstance.waitForElementByXpathTest(LanguagingAppliedToAssetsPageObjects.ChangeStringXpath(),5))
          {
              err.println("[ERROR]: Failed to wait for Hover over Image");
              return false;
          }
         
         //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("HoverOverImage", false);  
        return true;
     }
     
     public boolean ClickChangeImage()
     {
         if (!SeleniumDriverInstance.clickElementByXpath(LanguagingAppliedToAssetsPageObjects.AssetDescriptionInputFieldXpath()))
          {
              err.println("[ERROR]: Failed to wait Change Image Button");
              return false;
          }       
         
         
         
        if(browserType.equals(browserType.IE))
        {

             SeleniumDriverInstance.hoverOverElementByXpath(LanguagingAppliedToAssetsPageObjects.ImageDisplayXpath());
             
             
              boolean found = false;
                  if (SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.assetImageUploadXpath(),15))
                  {
                        found = true;
                  }
                  
                  while(found==false)
                  {
                      if(!SeleniumDriverInstance.doubleClickElementbyXpath(LanguagingAppliedToAssetsPageObjects.IEChangeImageButtonXpath()))
                        {
                            SeleniumDriverInstance.hoverOverElementByXpath(LanguagingAppliedToAssetsPageObjects.ImageDisplayXpath());
                            if (!SeleniumDriverInstance.doubleClickElementByXpath(LanguagingAppliedToAssetsPageObjects.IEChangeImageButtonXpath()))
                            {
                                SeleniumDriverInstance.doubleClickElementByXpath(LanguagingAppliedToAssetsPageObjects.IEChangeImageButtonXpath());
                                SeleniumDriverInstance.pause(1000);
                                SeleniumDriverInstance.doubleClickElementByXpath(LanguagingAppliedToAssetsPageObjects.IEChangeImageButtonXpath());
                                SeleniumDriverInstance.doubleClickElementByXpath(LanguagingAppliedToAssetsPageObjects.IEChangeImageButtonXpath());
                                SeleniumDriverInstance.pause(1000);
                                SeleniumDriverInstance.doubleClickElementByXpath(LanguagingAppliedToAssetsPageObjects.IEChangeImageButtonXpath());
                                SeleniumDriverInstance.doubleClickElementbyXpath(LanguagingAppliedToAssetsPageObjects.IEChangeImageButtonXpath());
                            }
                        } 
                      
                      if (SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.assetImageUploadXpath(),15))
                        {
                              found = true;
                        }
                  }
              
                  if (!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.assetImageUploadXpath(),15))
                  {
                      SeleniumDriverInstance.pause(1000);
                      
                      if (!SeleniumDriverInstance.doubleClickElementbyXpath(LanguagingAppliedToAssetsPageObjects.IEChangeImageButtonXpath()))
                        {
                            err.println("[ERROR]: {IE}Failed to Click Change Image Button1");
                            return false;
                        }
                  }
                 

        }
        else
        {
            SeleniumDriverInstance.hoverOverElementByXpath(LanguagingAppliedToAssetsPageObjects.ImageDisplayXpath());
            
            if (!SeleniumDriverInstance.clickElementByXpath(LanguagingAppliedToAssetsPageObjects.ChangeImageButtonXpath()))
                {
                    err.println("[ERROR]: Failed to Click Change Image Button");
                    return false;
                } 
             
        }
       
         //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("ClickChangeImage", false);  
        return true;
     }
     
     public boolean ValidateChangeImagePopUpWindow()
     {
         if (!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.assetImageUploadXpath(),10))
          {
              err.println("[ERROR]: Failed to wait for assetImageUpload");
              return false;
          }
         
          if (!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.UploadAssetImageHeadingXpath(),10))
          {
              err.println("[ERROR]: Failed to wait for UploadAssetImageHeading");
              return false;
          }
          
          if (!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.ChooseImageTextXpath(),10))
          {
              err.println("[ERROR]: Failed to wait for ChooseImageText");
              return false;
          }
          
          if (!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.MaxFileSizeXpath(),10))
          {
              err.println("[ERROR]: Failed to wait for MaxFileSize");
              return false;
          }
          
          if (!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.ChooseFileButtonXpath(),10))
          {
              err.println("[ERROR]: Failed to wait for ChooseFileButton");
              return false;
          }
          
          if (!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.ButtonNo_languagingXpath(),10))
          {
              err.println("[ERROR]: Failed to wait for ButtonNo_languaging");
              return false;
          }
          
         
          
          
          if (!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.ButtonOkXpath(),10))
          {
              err.println("[ERROR]: Failed to wait for ButtonOk");
              return false;
          }        
           //Take Screenshot
            
          
//          if (!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.ButtonNo_languagingXpath()))
//          {
//              err.println("[ERROR]: Failed to click Button Close window");
//              return false;
//          }
         
        if (!SeleniumDriverInstance.clickElementbyXpath(LanguagingAppliedToAssetsPageObjects.buttonCloseXpath()))
          {
              err.println("[ERROR]: Failed to click Button Close window");
              return false;
          }
          SeleniumDriverInstance.takeScreenShot("ValidateChangeImagePopUpWindow", false);
        return true;
     }
     
     public boolean ChangeOneField()
     {
                 
         if (!SeleniumDriverInstance.waitForElementByXpathTest(LanguagingAppliedToAssetsPageObjects.AssetDescriptionInputFieldXpath(),30))
          {
              err.println("[ERROR]: Failed to Click Save Button");
              return false;
          }
         
         SeleniumDriverInstance.clearTextByXpath(LanguagingAppliedToAssetsPageObjects.AssetDescriptionInputFieldXpath());
         int count=0;
         
         String assetDescription = testData.getData("TypeAssetDescription")+count;
         
         if (!SeleniumDriverInstance.enterTextByXpath(LanguagingAppliedToAssetsPageObjects.AssetDescriptionInputFieldXpath(),assetDescription))
          {
              err.println("[ERROR]: Failed to Click Save Button");
              return false;
          }
         count++;
         //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("ChangeOneField", false);  
        return true;
     }
     
     public boolean ClickCancelButton()
     {
         if (!SeleniumDriverInstance.waitForElementByXpathTest(LanguagingAppliedToAssetsPageObjects.ButtonCancelXpath(),30))
          {
              err.println("[ERROR]: Failed to Wait for Button Cancel");
              return false;
          }
         
         if (!SeleniumDriverInstance.waitForElementByXpathTest(LanguagingAppliedToAssetsPageObjects.AssetStatus(),30))
          {
              err.println("[ERROR]: Failed to Wait for Button Cancel");
              return false;
          }
         
         if (!SeleniumDriverInstance.waitForElementByXpathTest(LanguagingAppliedToAssetsPageObjects.AssetDescriptionInputFieldXpath(),30))
          {
              err.println("[ERROR]: Failed to Wait for Button Cancel");
              return false;
          }
         
          if (!SeleniumDriverInstance.clickElementbyXpath(LanguagingAppliedToAssetsPageObjects.ButtonCancelXpath()))
          {
              err.println("[ERROR]: Failed to Click Button Cancel");
              return false;
          }
         
         //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("ClickCancelButton", false);  
        return true;
     }
     
     public boolean ValidatePopUpWindow()
     {
          if (!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.ChangesNotSavedPopUpXpath(),10))
          {
              err.println("[ERROR]: Failed to wait for ChangesNotSavedPopUp");
              return false;
          }
          
          if (!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.ConfirmDiscardChangesQuestionXpath(),10))
          {
              err.println("[ERROR]: Failed to wait for Confirm Discard Changes");
              return false;
          }
          
          if (!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.ButtonNoXpath(),10))
          {
              err.println("[ERROR]: Failed to wait for Button No");
              return false;
          }
          
          if (!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.ButtonYesXpath(),10))
          {
              err.println("[ERROR]: Failed to wait for Button No");
              return false;
          }
         
         //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("ValidatePopUpWindow", false);  
        return true;
     }
     
     public boolean selectOrganisationGroup()
    {
        if(!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.ColumnChooser(),30))
        {
            testData.extractParameter("Actual Result", "Failed to click the breadcrum", "FAIL");
            return false;
        }
       
        if(!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.ButtonBreadcrumXpath(),30))
        {
            testData.extractParameter("Actual Result", "Failed to wait for the breadcrum", "FAIL");
            return false;
        }
   //---------------------------------End wait -------------------------------------------------------------------------
        
        List<String> columns2 = new ArrayList<>();
        
        int count2 = Integer.parseInt(testData.getData("ColumnCount"));
        
        for (int i = 1; i < count2+1; i++) {
            columns2.add(testData.getData("BreadcrumColumn"+i));
        }
        //Getting current selected group names in the breadcrum
        String word = SeleniumDriverInstance.getElementTextByXpath(LanguagingAppliedToAssetsPageObjects.BreadcrumUrlXpath());
        
        int getIndex=word.lastIndexOf("/");
        String word2 = word.substring(getIndex+1);//get last group name that was selected
        String breadcrumb=testData.getData("BreadcrumColumn"+count2);
                
        testData.extractParameter("Extracted Selected Group Name : ", word2.trim()+"<br>Expected Group Name: "+breadcrumb, "UNCHECKED");
        
        //checks if selected group name in the breadcrum is the expected one, otherwise click on the breadcrum and select group of choice
        if(SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.CurrentlySelectedGroupNameXpath(breadcrumb), 30))
        {
            if(word2.trim().equalsIgnoreCase(breadcrumb))
            {
                testData.extractParameter("Actual Result", "already on prefered group from the breadcrum", "UNCHECKED");
                return true;
            }
            else
            {
                 if(!SeleniumDriverInstance.clickElementbyXpath(LanguagingAppliedToAssetsPageObjects.ButtonBreadcrumXpath()))
                    {
                        testData.extractParameter("Actual Result", "Failed to click the breadcrum", "FAIL");
                        return false;
                    }

        
                    if(!SeleniumDriverInstance.waitForElementByXpathTest(LanguagingAppliedToAssetsPageObjects.filterTextboxXpath(), 30))
                    {
                        testData.extractParameter("Actual Result", "Failed to validate that the Select Organisation Group window opened", "FAIL");
                        return false;
                    }

                    //Validates that the columns are showing
                   if(!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.BreadcrumTreeItemXpath(testData.getData("BreadcrumColumn1")), 30))
                   {
                       testData.extractParameter("Actual Result", "Failed to validate that the columns are showing", "FAIL");
                        return false;
                   }

                    List<String> columns = new ArrayList<>();

                    int count = Integer.parseInt(testData.getData("ColumnCount"));

                    for (int i = 1; i < count+1; i++) {
                        columns.add(testData.getData("BreadcrumColumn"+i));
                    }


                  //Searches for the last item inputed into the test pack

                    if(browserType.equals(browserType.IE))
                    {
                         if(!SeleniumDriverInstance.enterTextByXpath(LanguagingAppliedToAssetsPageObjects.InputFieldSelectOrginisationGroupXpath(), testData.getData("BreadcrumColumn"+count)))
                         {
                             err.println("[ERROR]: {IE}failed to enterText");
                             return false;
                         }             
                    }
                    else
                    {
                         if(!SeleniumDriverInstance.moveToAndEnterTextByXpath(LanguagingAppliedToAssetsPageObjects.InputFieldSelectOrginisationGroupXpath(), testData.getData("BreadcrumColumn"+count)))
                         {
                             err.println("[ERROR]: failed to enterText");      
                             return false;
                         }

                    }

                    SeleniumDriverInstance.pressKey(Keys.ENTER);

                    if(!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.BreadcrumSearchResultHeadingXpath(), 30))
                    {
                        testData.extractParameter("Actual Result", "Failed to validate that the search result heading text is diplayed", "FAIL");
                        return false;
                    }

                    //Gets the search result into view
                    if(!SeleniumDriverInstance.scrollToElement(LanguagingAppliedToAssetsPageObjects.BreadcrumItemAfterFilterXpath(columns)))
                    {
                        testData.extractParameter("Actual Result", "Failed to scroll to the filter result", "FAIL");
                        return false;
                    }


                    //Validates that the correct item has been searched
                    if(!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.BreadcrumItemAfterFilterXpath(columns), 30))
                    {
                        testData.extractParameter("Actual Result", "Failed to validate the filter result", "FAIL");
                        return false;
                    }

                    //Waits for the search element to appear
                    if(!SeleniumDriverInstance.waitForElementByXpathTest(LanguagingAppliedToAssetsPageObjects.BreadcrumItemAfterFilterXpath(columns), 30))
                    {
                        testData.extractParameter("Actual Result:", "Failed to validate that the Heading: All is present", "FAIL");
                        return false;
                    }


                    //Selects the search result
                    if(!SeleniumDriverInstance.clickElementbyXpath(LanguagingAppliedToAssetsPageObjects.BreadcrumItemAfterFilterXpath(columns)))
                    {
                        testData.extractParameter("Actual Result", "Failed to click on the filter result", "FAIL");
                        return false;
                    }

                    //Select
                    if(!SeleniumDriverInstance.clickElementbyXpath(LanguagingAppliedToAssetsPageObjects.ButtonSelectXpath()))
                    {
                        testData.extractParameter("Actual Result", "Failed to click the Select button", "FAIL");
                        return false;
                    }
            }
            
        }
        
        
        return true;
    }
     
     public boolean ClickButtonYes()
     {
         if (!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.ButtonYesXpath(),10))
          {
              err.println("[ERROR]: Failed to wait for Button Yes");
              return false;
          }
         
         if (!SeleniumDriverInstance.clickElementByXpath(LanguagingAppliedToAssetsPageObjects.ButtonYesXpath()))
          {
              err.println("[ERROR]: Failed to wait for Button Yes");
              return false;
          }
         
         return true;
     }

}
