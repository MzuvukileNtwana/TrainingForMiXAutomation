/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects;

/**
 *
 * @author arala
 */
public class MobileDeviceSettingPageObjects {
    
      public static String RefreshLinkTextXpath()
      {
          return "//a/i[@class='icon-refresh icon-green']/../span[text()='Refresh']";
      }
    
      public static String ButtonAddDriverXpath()
      {
          return "//a[@fleet-tooltip='Add driver']/i";
      }
      
      public static String getAllRegistrationNumber()
      {
          return "//span[text()='Registration number']/../..";
      }
      
      public static String NameGridColumnXpath()
      {
          return "//div/div[@class='column']/div/span[@class='title'][text()='Name']";
      }
      
      //Table Loading Spinner
      public static String TableLoadingSpinnerXpath()
      {
        return "//div[@class='loading-overlay'][@style='display: none;']";
      }
      
      public static String SatelliteCommunicationModemDetailsHeadingXpath()
      {
          return "//div/h5[text()='Satellite communication modem details']";
      }
            
      public static String EditAssetLabelXpath()
      {
          return "//div/h5/span[text()='Edit asset']";
      }
      
      public static String buttonSaveXpath()
      {
          return "//div[@class='page-header']/div/div/button[text()='Save']";
      }
      
      public static String buttonCancelXpath()
      {
          return "//div[@class='page-header']/div/div/button[text()='Cancel']";
      }
      
      public static String ConfigGroupLinkTextXpath()
      {
          return "//div[@class='row-fluid']/div/h5/a";
      }
      
      public static String AssetGridTableHeaderXpath()
      {
          return "//div[@class='page-header']/h5/span[text()='Assets']";
      }
      
      public static String ConfigGroupPageHeaderXpath()
      {
          return "//div/h5/span[text()='Configuration groups']";
      }
      
      public static String ActionButtonXpath(String rowNo)
      {
          return "//div[@class='column actions shadow']/div[@row='"+rowNo+"']/div/a[@class='row-action']";
      }
      
      public static String GetDriverColumnName2ValueByXpath()
      {
          return "//div[@class='column']/div/a[contains(@class,'cell')][@row-index='0']";
      }
      
      public static String notificationSuccessfullUpdatedXpath()
      {
          return "//div[@class='notification notification-placement notification-success']/span[text()='Asset updated successfully']";
      }
      
      public static String AssetConfigurationChangedTextXpath()
      {
          return "//div[@class='alert alert-success']/span/span[text()='Asset configuration changed. ']";
      }
      
      public static String ClickHereLinkTextXpath()
      {
          return "//div[@class='alert alert-success']/span/a";
      }
      
      public static String SimCardPinInputFieldXpath()
      {
          return "//div/label/span[text()='SIM card pin code']/../../input";
      }
      
      public static String GetFirstColumnAndRowNameXpath()
      {
          return "//div[@class='column']/div/a[contains(@class,'cell')][@row-index='0']";
      }
      
      public static String GetColumnAndRowUsingIdXpath(String row)
      {
          return "//div[@class='column']/div/a[contains(@class,'cell')][@row-index='"+row+"']";
      }
      
      public static String ButtonSeachTextFilterXpath()
      {
          return "//div[@id='MainView']/div[1]//div[@class='page-header']/div/div/input/../a/i[@class='icon-search']";
      }
      
      public static String SearchAssetTextFilterXpath()
      {
          return "//div[@id='MainView']/div[1]//div[@class='page-header']/div/div/input";
      }
      
      public static String getRegistrationNumberXpath(String row)
      {
          return "//div[@class='column']/div/../div/span[text()='Registration number']/../../div[@row='"+row+"']";
      }
      
      public static String getAssetTypeXpath(String regNo, String row)
      {
          return "//div/div/span[text()='Asset type']/../../div[text()='Light Vehicle']/../../div/div[text()='"+regNo+"']/../../div/div[text()='Light Vehicle'][@row='"+row+"']";
      }
      
      public static String AssetTypeColumnHeaderXpath()
      {
          return "//div/span[text()='Asset type']";
      }
      
      public static String getID_byColumAndRowXpath(String id)
      {
          return "//div[@class='column']/div/span[text()='Asset ID']/../../div[text()='"+id+"']";
      }
      
      public static String getRegistrationNumberRowByXpath(String registrationNo)
      {
          return "//div[@class='column']/div/span[text()='Registration number']/../../div[text()='"+registrationNo+"']";
      }
      
      public static String getID2_byColumAndRowXpath(String id)
      {
          return "//div[@class='column']/div/span/../../div[text()='"+id+"']";
         // return "//div[@class='column']/div/span[text()='Asset ID']/../../div[text()='"+id+"']";
      }
      
      public static String AssetIdGridColumnXpath()
      {
          return "//div[@class='column']/div/span[text()='Asset Id']";
      }
      
      public static String AssetIDGridColumnXpath()
      {
          return "//div[@class='column']/div/span[text()='Asset ID']";
      }
      
      public static String ddlItemAssetIdXpath()
      {
          return "//ul[@class='dropdown-menu grid-column-chooser'][contains(@style,'block')]/li/a[@column-field='vehicleId']/span[text()='Asset Id']/..";
      }
      
      public static String CompileActionButtonItemXpath(String rowIndex)
      {
          return "//ul[@class='dropdown-menu grid-row-action-dropdown-menu'][contains(@style,'block')]/li/a[@row-index='"+rowIndex+"']/i/../span[text()='Compile']";
      }
      
      public static String CompilePopUpWindowXpath()
      {
          return "//div[@name='compileAndUploadModal']//h5/span[text()='Upload Configuration']";
      }
      
      public static String AssetIDColumnChooserXpath()
      {
          return "//ul[contains(@style,'display: block')]/li/a[@column-field='fmVehicleId']/span[text()='Asset ID']";
      }
      
      public static String AssetEngineHoursColumnChooserXpath()
      {
          return "//ul[contains(@style,'display: block')]/li/a[@column-field='engineHours']/span[text()='Engine hours']";
      } 
      
      public static String ColumnChooser()
     {
        return "//div[@class='column-heading sortable']/span[@class='title']/a[@class='btn btn-small column-chooser']/i[@class='icon-choose-columns']";
     }  
      
      public static String AssetTypeColumnChooserXpath()
      {
          return "//a[@column-field='assetType']/span[text()='Asset type']/..";
      }
         
     public static String SearchFilterInputFieldXpath()
     {
        return "//div[@class='page-header']/div[@class='pull-right']/div[contains(@class,'text-filter')]/input";
     }
     
     public static String RadioButtonAllXpath()
     {
        return "//span[text()='All']/../../../..//input[@type='radio']";
     }
     
     public static String ButtonSearchIconXpath()
     {
         return "//div[@class='pull-right']/div/a/i[@class='icon-search']/..";
     }
      
     public static String TabAssetStatusLinkXpath()
     {
         return "//li/a[text()='Asset status']";
     }
     
     public static String TabAssetDetailsLinkXpath()
     {
         return "//li/a[text()='Asset details']";
     }
     
     public static String getTabAssetDetailsLinkAttributeXpath()
     {
         return "//li/a[text()='Asset details']/..";
     }
     
     public static String TabAccessControlLinkXpath()
     {
         return "//li/a[text()='Access control']";
     }
     
     public static String TabServiceHistoryLinkXpath()
     {
         return "//li/a[text()='Service history']";
     }
     
     public static String TabRemindersLinkXpath()
     {
         return "//li/a[text()='Reminders']";
     }
     
     public static String TabFuelDataLinkXpath()
     {
         return "//li/a[text()='Fuel data']";
     }
     
     public static String TabOtherCostDataLinkXpath()
     {
         return "//li/a[text()='Other cost data']";
     }
     
     public static String TabRecoveryLinkXpath()
     {
         return "//li/a[text()='Recovery']";
     }
     
     public static String TabMobileDeviceSettingsLinkXpath()
     {
         return "//li/a[text()='Mobile device settings']";
     }
     
     public static String TabRequiredDriverCertificateLinkXpath()
     {
         return "//li/a[text()='Required driver certificates']";
     }
     
     public static String TabRequiredDriverLicencesLinkXpath()
     {
         return "//li/a[text()='Required driver licences']";
     }
     
     public static String MobileDeviceDetailsHeadingXpath()
     {
         return "//fieldset/div/h5[text()='Mobile device details']";
     }
     
     public static String CommunicationDetailsHeadingXpath()
     {
         return "//fieldset/div/h5[text()='Communication details']";
     }
     
     public static String ButtonChangeMobileDeviceXpath()
     {
         return "//div/button[text()='Change mobile device']";
     }
     
     public static String ButtonRemoveMobileDeviceXpath()
     {
         return "//div/button[text()='Remove mobile device']";
     }
     
     public static String ButtonDownloadAssetConfigXpath()
     {
         return "//div/button[text()='Download asset config']";
     }
     
     public static String ChangeMobileDevicePopUpWindowXpath()
     {
         return "//div[@class='alert alert-success']/h5/span[text()='Change mobile device']";
     }
     
     public static String ddlDeviceTypeXpath()
     {
         return "//form[@name='assetCommissioningForm']//span[text()='New mobile device type']/../../select[@ng-model='changeMobileDeviceTemplate.deviceTypeId']";
     }
     
     public static String ddlConfigGroupXpath()
     {
         return "//form[@name='assetCommissioningForm']//span[text()='New configuration group']/../../select[@ng-model='changeMobileDeviceTemplate.configGroupId']";
     }
     
     public static String ButtonChangeXpath()
     {
         return "//div[@name='changeMobileDeviceModal']//../../button[text()='Change']";
     }
     
     public static String ButtonCancel_ChangeMobileDeviceXpath()
     {
         return "//div[@name='changeMobileDeviceModal']//button[text()='Cancel']";
        // return "//div[@name='changeMobileDeviceModal']//../../button[text()='Cancel']";
     }
     
     public static String RemoveMobileDeviceHeadingXpath()
     {
         return "//div[@class='alert alert-success']/h5/span[text()='Remove mobile device']";
     }
     
     public static String RemoveMobileDeviceFirstParagraphXpath()
     {
         return "//form[@name='removeMobileDeviceForm']/p[1]";
     }
     
     public static String MoveAssetToNominatedDecommissionedSiteXpath()
     {
         return "//form[@name='removeMobileDeviceForm']/div/label/input";
     }
     
     public static String MoveAssetToNominatedDecommissionedSiteStringXpath()
     {
         return "//form[@name='removeMobileDeviceForm']/div/label/span";
     }
     
     public static String DecommissionedSiteDropdownXpath()
     {
         return "//form[@name='removeMobileDeviceForm']/div/div/label/../select";
     }
     
     public static String UponDecommissioningStringXpath()
     {
         return "//form[@name='removeMobileDeviceForm']/p[2]";
     }
     
     public static String OverrideInactiveFlagXpath()
     {
         return "//form[@name='removeMobileDeviceForm']/label/input";
     }
     
     public static String CheckingTheBoxAboveStringXpath()
     {
         return "//form[@name='removeMobileDeviceForm']/p[3]";
     }
     
     public static String NotesTextAreaXpath()
     {
         return "//form[@name='removeMobileDeviceForm']/label[text()='Notes']/../textarea";
     }
     
     public static String ButtonCancelRemoveMobileDeviceXpath()
     {
         return "//div[@name='removeMobileDeviceModal']/div/button[text()='Cancel']";
     }
     
     public static String ButtonRemoveRemoveMobileDeviceXpath()
     {
         return "//div[@name='removeMobileDeviceModal']/div/button[text()='Remove']";
     }
     
     public static String DownloadAssetConfigHeadingXpath()
     {
         return "//div[@class='alert alert-success']/h5/span[text()='Download asset config']";
     }
     
     public static String SelectPlugSizeDropDownXpath()
     {
         return "//form[@name='downloadAssetConfigForm']/div/select";
     }
     
     public static String EventRatioFieldXpath()
     {
         return "//form[@name='downloadAssetConfigForm']/div/label/span[contains(text(),'Event ratio')]/../../input";
     }
     
     public static String EnterAnEventRationStringXpath()
     {
         return "//form[@name='downloadAssetConfigForm']/div/label/span[contains(text(),'Enter')]";
     }
     
     public static String ButtonCancelDownloadAssetConfigXpath()
     {
         return "//div[@name='downloadAssetConfigModal']/div/button[text()='Cancel']";
     }
     
     public static String ButtonDownloadDownloadAssetConfigXpath()
     {
         return "//div[@name='downloadAssetConfigModal']/div/button[text()='Download']";
     }
     
     public static String SimCardPinXpath()
     {
         return "//div[@ng-show='form.communicationCapable']/div/div/label/span[text()='SIM card pin code']/../../input";
     }
     
     public static String SimCardPinStringXpath()
     {
         return "//div[@ng-show='form.communicationCapable']/div/div/label/span[text()='SIM card pin code']";
     }
     
     public static String GPRSXpath()
     {
         return "//div[@ng-show='form.gprsCapable']/div/label/span[text()='GPRS']/../input";
     }
     
     public static String APNXpath()
     {
         return "//div[@ng-show='form.gprsCapable']/div//label/span[text()='APN']/../../input";
     }
     
     public static String EnterTheShortAPNXpath()
     {
         return "//div[@ng-show='form.gprsCapable']/div//label/span[text()='APN']/../../label/span[contains(text(),'Enter')]";
     }
     
     public static String APNUserNameStringXpath()
     {
         return "//div[@ng-show='form.gprsCapable']/div/div/div/label/span[text()='APN username']";
     }
     
     public static String APNPasswordStringXpath()
     {
         return "//div[@ng-show='form.gprsCapable']/div/div/div/label/span[text()='APN password']";
     }
     
     public static String GSMStringXpath()
     {
         return "//div[@ng-show='form.gsmCapable']/label/span[text()='GSM']";
     }
     
     public static String SMSStringXpath()
     {
         return "//div[@ng-show='form.smsCapable']/label/span[text()='SMS']";
     }
     
     public static String DetailsOfTheSatelliteModemStringXpath()
     {
         return "//div[@ng-show='form.iridiumSatelliteCapable']/p";
     }
     
     public static String IMEINumberFieldXpath()
     {
         return "//div[@ng-show='form.iridiumSatelliteCapable']/div/div/input[@name='iridiumImei']";
     }
     
     public static String AirtimeContractFieldXpath()
     {
         return "//div[@ng-show='form.iridiumSatelliteCapable']/div/div/input[@ng-model='form.iridiumContract']";
     }
     
     public static String ButtonChangeSatelliteModemXpath()
     {
         return "//button[text()='Change satellite modem']";
     }
     
     public static String ButtonRemoveSatelliteModemXpath()
     {
         return "//button[text()='Remove satellite modem']";
     }
     
     public static String ChangeSatelliteModemHeadingXpath()
     {
         return "//div[@class='alert alert-success']/h5/span[text()='Change satellite modem']";
     }
     
     public static String CurrentIMEInumberFieldXpath()
     {
         return "//form[@name='assetChangeSatelliteModemForm']/input[@ng-model='form.iridiumImei']";
     }
     
     public static String NewIMEInumberFieldXpath()
     {
         return "//form[@name='assetChangeSatelliteModemForm']/input[@name='newImeiNumber']";
     }
     
     public static String NotesStringXpath()
     {
         return "//form[@name='assetChangeSatelliteModemForm']/label[text()='Notes']";
     }
     
     public static String ButtonCancelChangeSatelliteModemXpath()
     {
         return "//div[@name='assetChangeSatelliteModemModal']/div/button[text()='Cancel']";
     }
     
     public static String ButtonChangeChangeSatelliteModemXpath()
     {
         return "//div[@name='assetChangeSatelliteModemModal']/div/button[text()='Change']";
     }
     
     public static String DetailsOfTheMobileDeviceInstalledStringXpath()
     {
         return "//form[@name='assetCommissioningForm']/fieldset/div/p[contains(text(),'Mobile')]";
     }
     
     public static String DeviceTypeFieldXpath()
     {
         return "//form[@name='assetCommissioningForm']/fieldset/div//input[@name='deviceTypeName']";
     }
}     


