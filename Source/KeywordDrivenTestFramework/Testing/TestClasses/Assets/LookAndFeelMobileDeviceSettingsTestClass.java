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
import KeywordDrivenTestFramework.Testing.PageObjects.ConfigAdminPageObjects;
import KeywordDrivenTestFramework.Testing.PageObjects.LatestlastpositiondateandtimereflectedonloadPageObjects;


/**
 *
 * @author lmkhontwana
 */
public class LookAndFeelMobileDeviceSettingsTestClass extends BaseClass {
    int counter = 1;
    TestEntity testData;
    String failedMessage = "";
    String regNo = "";
     public LookAndFeelMobileDeviceSettingsTestClass(TestEntity testData) {
        this.testData = testData; regNo = testData.getData("Registration Number");
    }
     
     public TestResult executeLookAndFeelMobileDeviceSettingsTest() {

        this.setStartTime();
         
        if (!lookAndFeelMobileDeviceSettingsTest()) 
        {
            SeleniumDriverInstance.takeScreenShot(failedMessage, true);
            counter++;
            return new TestResult(testData, Enums.ResultStatus.FAIL, failedMessage, this.getTotalExecutionTime());
        }
        return new TestResult(testData, Enums.ResultStatus.PASS, "Look And Feel Mobile Device Settings Functionality Viewed Successfully", this.getTotalExecutionTime());
      }
     
     
     
    private boolean clickEditButton(String _regNo)
    {
        
         SeleniumDriverInstance.waitForPresenceOfElementByXpath(AssetsPageObjects.TableLoadingSpinnerXpath(), 30);
         SeleniumDriverInstance.pause(3000);
        String rowNumber = "";
        if(!_regNo.equals("")){
            rowNumber = SeleniumDriverInstance.getElementAttributeByXpath(AssetsPageObjects.AssetIdXpath(_regNo), "row");
            
        }else{
            //Get asset with the reqiured feautures
            rowNumber =  String.valueOf(SeleniumDriverInstance.getAssetRowOnGridListWithCertainFeatures(AssetsPageObjects.AssetListGridRelativeXpath(),
                                                        AssetsPageObjects.AssetGridLastPageButtonRelativeXpath(),
                                                        AssetsPageObjects.AssetGridNextPageButtonRelativeXpath(),testData.getData("Mobile Device"),
                                                        testData.getData("Config Group")));
        }
        
       
        //Click Action Button
        if (!SeleniumDriverInstance.waitForElementByXpath(AssetsPageObjects.ActionButtonByRowXpath(rowNumber)))
            return false;
        
        if (!SeleniumDriverInstance.clickElementByXpathUsingActions(AssetsPageObjects.ActionButtonByRowXpath(rowNumber)))
            return false;
        
        if(!SeleniumDriverInstance.waitForfElementToBeClickableByXpath(AssetsPageObjects.EditAssetButtonFirstOnListRelativeXpathText(), 15)
                && browserType.equals(browserType.IE))
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

    private boolean lookAndFeelMobileDeviceSettingsTest() {
        
       
        //If Registration Number provided, search and select asset
        if (!regNo.equals("")) 
        {   
            if(!searchAsset(regNo))
            {
               failedMessage = "Failed to Search Asset";
               System.err.println(failedMessage);
               return false;
            }
        }
        if(!clickEditButton(regNo))
            {
               failedMessage = "Failed to Click Edit Button";
               System.err.println(failedMessage);
               return false;
            }
        
        if(!performlookAndFeel())
            {
               failedMessage = "Failed to perform look and feel";
               System.err.println(failedMessage);
               return false;
            }
        
        
        
        return true;
    }
    
    private boolean performlookAndFeel()
    {
         //Wait for asset status
        if(!SeleniumDriverInstance.waitForElementByXpath(AssetsPageObjects.AssetStatusLabelRelativeXpathText()))
            return false;
       
        
        if (regNo.equals("")){
            regNo = SeleniumDriverInstance.retrieveEnteredTextByXpath(AssetsPageObjects.RegNoTextBoxRelativeXpath());
        }
        
        testData.extractParameter("Registration Number Used", regNo,"PASS");
        //Click Mobile Device Settings
        if(!SeleniumDriverInstance.clickElementByXpathUsingActions(AssetsPageObjects.MobileDeviceSettingsTabTextXpath()))
            return false;
        
        
        SeleniumDriverInstance.waitForPresenceOfElementByXpath(AssetsPageObjects.TableLoadingSpinnerXpath(), 5);
         
         
         if(!SeleniumDriverInstance.waitForfElementToBeClickableByXpath(AssetsPageObjects.SatelliteDetailsStringTextXpath(),3))
         {
             if(!navigateToConfigAdminConfigurationGroups()){
                 failedMessage = "Failed to Config Mobile Deviece Line S3";
                 System.err.println(failedMessage);
                 navigateToAssetManagementPage();
                 return false;
             }
             if(!navigateToAssetManagementPage()){
                 failedMessage = "Failed To navigate To Asset Management Page";
                 System.err.println(failedMessage);
                 return false;
             }
             if(!lookAndFeelMobileDeviceSettingsTest())
            {
               failedMessage = "Failed to perform look and feel";
               System.err.println(failedMessage);
               navigateToAssetManagementPage();
               return false;
            }
         }
        else{
            //Mobile device details
            if (!inspectMobileDeviceDetails()) {
                    failedMessage = "Failed to inspect Mobile Device Details";
                   System.err.println(failedMessage);
                   navigateToAssetManagementPage();
                   return false;
            }


            //Click Download Asset Cofig Button
            if (!inspectDownloadAssetConfigDetails()) {
                    failedMessage = "Failed to inspect Download AssetConfig Details";
                   System.err.println(failedMessage);
                   navigateToAssetManagementPage();
                   return false;
            }


            //Communication details
            if (!inspectCommunicationDetails()) {
                    failedMessage = "Failed to inspect Communication Details";
                   System.err.println(failedMessage);
                   navigateToAssetManagementPage();
                   return false;
            }


            //Satalite Details
            if (!inspectSataliteDetails()) {
                   failedMessage = "Failed to inspect Satalite Details";
                   System.err.println(failedMessage);
                   navigateToAssetManagementPage();
                   return false;
            }

            //Navigate back to assets landing page
            if(!navigateToAssetManagementPage()){
                 failedMessage = "Failed To navigate To Asset Management Page";
                 System.err.println(failedMessage);
                 return false;
             }
        }
        
         return true;
    }
    
    private boolean navigateToConfigAdminConfigurationGroups()
    {
        
        //Click Manage Menu
        if (!SeleniumDriverInstance.clickElementbyXpath(AssetsPageObjects.ManageMenuRelativeXpath()))
        {
            return false;
        }
        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("ManageMenuClicked", false);
          
        //Click config groups link
        if (!SeleniumDriverInstance.clickElementbyXpath(ConfigAdminPageObjects.ItemConfigGroupsXpath()))
        {
            return false;
        }  
        
        //Wait for element and validate when it lands on the page
         if (!SeleniumDriverInstance.waitForElementByXpath(AssetsPageObjects.AssetManageconfigurationRelatieXpath(),30))
         {
            return false;
         }
         
        //Take Screenshot 
        SeleniumDriverInstance.takeScreenShot("ItemConfigGroupsClicked", false);

        //Wait for element and validate when it lands on the page
         if (!SeleniumDriverInstance.waitForElementByXpath(AssetsPageObjects.AssetDescriptionToValidateRelatieXpath(),30))
         {
            return false;
         }
        
        //Searches for Asset ID only
        if (!SeleniumDriverInstance.enterTextByXpath(LatestlastpositiondateandtimereflectedonloadPageObjects.FiltertextfieldXpath(), regNo))
        {
            return false;
        }
        
        //Wait for element and validate when it lands on the page
         if (!SeleniumDriverInstance.waitForElementByXpath(AssetsPageObjects.AssetsSearchButtonXpath(),30))
         {
            return false;
         }
        //Clicks the search button
        if (!SeleniumDriverInstance.clickElementbyXpath(AssetsPageObjects.AssetsSearchButtonXpath()))
        {
           return false;
        }
        
         if(!SeleniumDriverInstance.waitForElementByXpath(AssetsPageObjects.AssetActionBtnRelatieXpath(), 30))
         {
            return false;
         }
         
         SeleniumDriverInstance.pause(5000);
      
        //Get rowID from the excel spreadsheet   
        String rowNumber = "0";
         
        //Click Action Button
        if (!SeleniumDriverInstance.clickElementbyXpath(AssetsPageObjects.ActionButtonByRowXpath(rowNumber)))
            return false;
        
        //Click Edit link
        if (!SeleniumDriverInstance.clickElementbyXpath(AssetsPageObjects.ActionEditButtonsByRowXpath(rowNumber)))
        {
           return false;
        }
        //Take Screenshot 
        SeleniumDriverInstance.takeScreenShot("EditLinkClicked", false);
        
        //Click Mobile device template tab
        if (!SeleniumDriverInstance.clickElementbyXpath(AssetsPageObjects.AssetMobileDeviceTemplateRelatieXpath()))
        {
           return false;
        }
        //Take Screenshot 
        SeleniumDriverInstance.takeScreenShot("MobileDeviceTemplatesTab", false);
        
         SeleniumDriverInstance.waitForPresenceOfElementByXpath(AssetsPageObjects.TableLoadingSpinnerXpath(), 30);
         
         //Click S3<td> and Not connected<a>.
        if(SeleniumDriverInstance.clickElementbyXpath(AssetsPageObjects.S3LineNotConnectedTextXpath()))
        {
             SeleniumDriverInstance.waitForPresenceOfElementByXpath(AssetsPageObjects.TableLoadingSpinnerXpath(), 30);
             
              if(browserType.equals(browserType.IE)){
                if(!SeleniumDriverInstance.clickElementByXpath(AssetsPageObjects.SelectedPeripheralDeviceTextXpath()))
                    return false; 
        
                if(!SeleniumDriverInstance.clickElementByXpath(AssetsPageObjects.SelectedPeripheralDeviceS3TextXpath(testData.getData("Line"))))
                    return false; 
            }
            else{
                if(!SeleniumDriverInstance.selectByTextFromDropDownListusingXpath(AssetsPageObjects.SelectedPeripheralDeviceTextXpath(),testData.getData("Line")))
                     return false; 
            }
              SeleniumDriverInstance.pause(2000);
              //Take Screenshot
              SeleniumDriverInstance.takeScreenShot("S3LineSelected", false);
              
            //Click Save
            if(!SeleniumDriverInstance.clickElementbyXpath(AssetsPageObjects.SaveButtonTextRelativeXpath()))
                return false;
        
            if(!SeleniumDriverInstance.clickElementbyXpath(AssetsPageObjects.FormSaveButtonXpath()))
                return false;
             //Take Screenshot
            SeleniumDriverInstance.takeScreenShot("MobileDeviceConfirmation", false);
            
            
            //Wait for save popup
            if(!SeleniumDriverInstance.waitForfElementToBeClickableByXpath(AssetsPageObjects.MobileDeviceUpdatedTextXpath()))
                return false;
        
            //Take Screenshot
            SeleniumDriverInstance.takeScreenShot("MobileDeviceUpdated", false);
            
            
           return true;
        }else{
            //Take Screenshot 
            SeleniumDriverInstance.takeScreenShot("S3LineSelected", false);
        }    
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
    
    
    private boolean inspectSataliteDetails()
    {
        SeleniumDriverInstance.pause(4000);
        String imeiNumber = SeleniumDriverInstance.retrieveValueByXpath(AssetsPageObjects.SatelliteDetailsIMEINumberInputXpath());
        if (imeiNumber.equals("")) {
            
            imeiNumber = SeleniumDriverInstance.generateDateTimeStampVaule()+"0";
            if(!SeleniumDriverInstance.enterTextByXpath(AssetsPageObjects.SatelliteDetailsIMEINumberInputXpath(), imeiNumber))
                return false;
            
            SeleniumDriverInstance.takeScreenShot("IMEIEntered", false);
            
            if(!SeleniumDriverInstance.clickElementbyXpath(AssetsPageObjects.SaveButtonTextRelativeXpath()))
                 return false;
           
            //Wait for save popup
            if(!SeleniumDriverInstance.waitForfElementToBeClickableByXpath(AssetsPageObjects.AssetConfigChangedTextXpath()))
                return false;
            
          SeleniumDriverInstance.takeScreenShot("AssetConfigChanged", false);
            
        }
        
         testData.extractParameter("IMEI Number", imeiNumber,"PASS");
        if(!SeleniumDriverInstance.moveToElementByXpath(AssetsPageObjects.RemoveSatelliteModemButtonXpath()))
             return false;
        
        if(!SeleniumDriverInstance.clickElementbyXpath(AssetsPageObjects.ChangeSatelliteModemButtonXpath()))
                 return false;
        
        //Wait Change Satellite Modem Header
        if(!SeleniumDriverInstance.waitForfElementToBeClickableByXpath(AssetsPageObjects.ChangeSatelliteModemHeaderTextXpath()))
                return false;
        
        //Missing steps
        
        if(!SeleniumDriverInstance.moveToElementByXpath(AssetsPageObjects.CurrentIMEINumberInputXpath()))
             return false;
          
        if(!SeleniumDriverInstance.clickElementbyXpath(AssetsPageObjects.NewIMEINumberInputXpath()))
             return false;
       
        if(!SeleniumDriverInstance.clickElementbyXpath(AssetsPageObjects.ChangeSatelliteModemNotesTextAreaXpath()))
             return false;
         
        if(!SeleniumDriverInstance.moveToElementByXpath(AssetsPageObjects.ChangeSatelliteModemChangeButtonXpath()))
             return false;
         
        SeleniumDriverInstance.takeScreenShot("ChangeSatelliteModemWindow", false);
        
        if(!SeleniumDriverInstance.clickElementbyXpath(AssetsPageObjects.ChangeSatelliteModemCancelButtonXpath()))
             return false;
         
         
         return true;
    }
    
     private boolean inspectCommunicationDetails()
    {
        if(!SeleniumDriverInstance.waitForfElementToBeClickableByXpath(AssetsPageObjects.SimCardPinCodeInputXpath(),30))
            return false;
        
        SeleniumDriverInstance.pause(4000);
        
         SeleniumDriverInstance.scrollToElement(AssetsPageObjects.SimCardPinCodeInputXpath());
        if(!SeleniumDriverInstance.clickElementbyXpath(AssetsPageObjects.SimCardPinCodeInputXpath()))
            return false;
      
         SeleniumDriverInstance.clearTextByXpath(AssetsPageObjects.SimCardPinCodeInputXpath());
        if(!SeleniumDriverInstance.enterTextByXpath(AssetsPageObjects.ApnPointNameInputXpath(), testData.getData("APN")))
            return false;
        
        SeleniumDriverInstance.takeScreenShot("ApnPointNameEntered", false);
         
        if(!SeleniumDriverInstance.clickElementbyXpath(AssetsPageObjects.ApnUsernameInputXpath()))
            return false;
        
        if(!SeleniumDriverInstance.clickElementbyXpath(AssetsPageObjects.gprsApnPasswordInputXpath()))
            return false;
        
        if(!SeleniumDriverInstance.moveToElementByXpath(AssetsPageObjects.MobileDeviceGSMCheckboxXpath()))
             return false;
         
        if(!SeleniumDriverInstance.moveToElementByXpath(AssetsPageObjects.MobileDeviceSMSCheckboxXpath()))
             return false;
        
         SeleniumDriverInstance.takeScreenShot("CommunicationDetails", false);
        
        return true;
    }
     
     
    private boolean inspectDownloadAssetConfigDetails()
    {
        if(!SeleniumDriverInstance.waitForfElementToBeClickableByXpath(AssetsPageObjects.DownloadAssetConfigButtonXpath(),30))
            return false;
        
        SeleniumDriverInstance.pause(4000);
        if (!SeleniumDriverInstance.clickElementByXpathUsingActions(AssetsPageObjects.DownloadAssetConfigButtonXpath()))
            return false;
        
        if(!SeleniumDriverInstance.waitForfElementToBeClickableByXpath(AssetsPageObjects.DownloadAssetConfigHeaderTextXpath(),20))
            return false;
        
        if(!SeleniumDriverInstance.moveToElementByXpath(AssetsPageObjects.DownloadAssetConfigHeaderTextXpath()))
             return false;
        
        testData.extractParameter("Values Before Edit", "Plug Size: \t"+SeleniumDriverInstance.retrieveTextByXpathUsingAttribute(AssetsPageObjects.getDownloadAssetConfigPugSizeTextXpath())
                +"\n\n\nEvent Ratio: \t" +SeleniumDriverInstance.retrieveValueByXpath(AssetsPageObjects.DownloadAssetConfigEventRationInputXpath()),"PASS");
   
        SeleniumDriverInstance.takeScreenShot("BeforeEdit", false);
        if(browserType.equals(browserType.IE)){
                if(!SeleniumDriverInstance.clickElementByXpath(AssetsPageObjects.DownloadAssetConfigPugSizeDropdownXpath()))
                    return false; 
        
                if(!SeleniumDriverInstance.clickElementByXpath(AssetsPageObjects.DownloadAssetConfigPugSizeDropdownXpath(testData.getData("Plug Size"))))
                    return false; 
            }
            else{
                if(!SeleniumDriverInstance.selectByTextFromDropDownListusingXpath(AssetsPageObjects.DownloadAssetConfigPugSizeDropdownXpath(),testData.getData("Plug Size")))
                     return false; 
            }
         
        if(!SeleniumDriverInstance.enterTextByXpath(AssetsPageObjects.DownloadAssetConfigEventRationInputXpath(), testData.getData("Event Ratio")))
            return false;
        
         
        testData.extractParameter("Values After Edit", "Plug Size: \t"+testData.getData("Plug Size")
                +"\n\n\nEvent Ratio: \t" +SeleniumDriverInstance.retrieveValueByXpath(AssetsPageObjects.DownloadAssetConfigEventRationInputXpath()),"PASS");
         SeleniumDriverInstance.takeScreenShot("AfterEdit", false);
         
        if(!SeleniumDriverInstance.moveToElementByXpath(AssetsPageObjects.DownloadAssetConfigDownloadButtonXpath()))
             return false;
        
        SeleniumDriverInstance.takeScreenShot("DownloadAssetConfigWindow", false);
        
        if(!SeleniumDriverInstance.clickElementbyXpath(AssetsPageObjects.DownloadAssetConfigCancelButtonXpath()))
            return false;
        
        return true;
    }
     
    private boolean inspectMobileDeviceDetails()
    {
        
         if(!SeleniumDriverInstance.moveToElementByXpath(AssetsPageObjects.MobileDeviceStringTextXpath()))
             return false;
             
         String deviceType = SeleniumDriverInstance.retrieveValueByXpath(AssetsPageObjects.MobileDeviceTypeNameXpath());
         
         if(!deviceType.equals(""))
            testData.extractParameter("Device Type", deviceType,"PASS");
         else
             testData.extractParameter("Device Type", "Device Type Not Found","Fail");
         
         
        //Click Change Mobile Device Button
        if (!SeleniumDriverInstance.clickElementbyXpath(AssetsPageObjects.ChangeMobileDeviceButtonXpath()))
            return false;
        
        if(!SeleniumDriverInstance.waitForfElementToBeClickableByXpath(AssetsPageObjects.ChangeMobileDeviceHeaderTextXpath(),10))
            return false;
        
        if(!SeleniumDriverInstance.moveToElementByXpath(AssetsPageObjects.ChangeMobileDeviceHeaderTextXpath()))
             return false;
        
        if(!SeleniumDriverInstance.clickElementbyXpath(AssetsPageObjects.MobileDeviceTypeDropdownXpath()))
            return false;
         
         SeleniumDriverInstance.takeScreenShot("MobileDeviceTypeDropdown", false);
        
        SeleniumDriverInstance.clickElementbyXpath(AssetsPageObjects.MobileDeviceTypeDropdownXpath());
        
        
        if(!SeleniumDriverInstance.clickElementbyXpath(AssetsPageObjects.MobileDeviceCongigGroupDropdownXpath()))
            return false;
         
         SeleniumDriverInstance.takeScreenShot("MobileDeviceCongigGroupDropdown", false);
        
        SeleniumDriverInstance.clickElementbyXpath(AssetsPageObjects.MobileDeviceCongigGroupDropdownXpath());
        
        
        if(!SeleniumDriverInstance.moveToElementByXpath(AssetsPageObjects.ChangeMobileDeviceChangeButtonXpath()))
             return false;
        
        SeleniumDriverInstance.takeScreenShot("ChangeMobileDeviceWindow", false);
        
        
        if(!SeleniumDriverInstance.clickElementbyXpath(AssetsPageObjects.ChangeMobileDeviceCancelButtonXpath()))
             return false;
        
        
        if(!SeleniumDriverInstance.waitForfElementToBeClickableByXpath(AssetsPageObjects.RemoveMobileDeviceButtonXpath(),30))
            return false;
        
        //Click Remove Mobile Device Button
        SeleniumDriverInstance.pause(3000);
        if (!SeleniumDriverInstance.clickElementbyXpath(AssetsPageObjects.RemoveMobileDeviceButtonXpath()))
            return false;
        
        if(!SeleniumDriverInstance.waitForfElementToBeClickableByXpath(AssetsPageObjects.RemoveMobileDeviceHeaderTextXpath(),10))
            return false;
        
        if(!SeleniumDriverInstance.moveToElementByXpath(AssetsPageObjects.RemoveMobileDeviceHeaderTextXpath()))
             return false;
        
        if(!SeleniumDriverInstance.moveToElementByXpath(AssetsPageObjects.RemoveMobileDeviceStringTextXpath()))
             return false;
        
        if(!SeleniumDriverInstance.moveToElementByXpath(AssetsPageObjects.RemoveMobileDeviceUponDecommisionedStringTextXpath()))
             return false;
        
        //Missing few steps.
        
        if(!SeleniumDriverInstance.moveToElementByXpath(AssetsPageObjects.OverrideInactiveFlagCheckboxXpath()))
             return false;
        
        if(!SeleniumDriverInstance.moveToElementByXpath(AssetsPageObjects.RemoveMobileDeviceCheckingFlagStringTextXpath()))
             return false;
        
        if (!SeleniumDriverInstance.enterTextByXpath(AssetsPageObjects.RemoveMobileDeviceNotesTextXpath(), "Remove Notes"))
            return false;
        
        if(!SeleniumDriverInstance.moveToElementByXpath(AssetsPageObjects.RemoveMobileDeviceRemoveButtonXpath()))
             return false;
        
        SeleniumDriverInstance.takeScreenShot("RemoveMobileDeviceWindow", false);
        
        if (!SeleniumDriverInstance.clickElementbyXpath(AssetsPageObjects.RemoveMobileDeviceCancelButtonXpath()))
            return false;
        
        
        return true;
    }
      
      
}
