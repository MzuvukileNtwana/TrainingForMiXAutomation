/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package KeywordDrivenTestFramework.Testing.PageObjects;

/**
 *
 * @author lmkhontwana
 */
public class AssetsPageObjects 
{
    
    public static String FilterButtonXpath() 
    {
        return "//a[@class='btn btn-small']/i[@class='icon-search']";
    } 
   
    public static String AddDriverButtonRelativeXpath() 
    {
        return "//a[@fleet-tooltip='Add driver']";
    }
     public static String LiveTrackingHeaderRelativeXpath() 
    {
        return "//span[text()='Live tracking']";
    }
    
    public static String AssetRegistrationXpath() 
    {
        return "//span[text()='Registration number']/../../div[contains(@class,'cell')]";
    }
    
    public static String ActionButtonXpath() 
    {
        return "//a[@class='row-action']";
    }
    public static String RegNoGridValueXpath(String regNo) 
    {
        return "//div[contains(@class,'column-heading')]//span[text()='Registration number']/../../div[text()='" + regNo + "']";
    }
    
    public static String assetDescriptionXpath(String assetDescription) 
    {
        return "//a[text()='" + assetDescription + "']";
    }

    public static String ButtonImportFuelXpath()
    {
        return "//a[@fleet-tooltip='Import fuel']/i/..";
    }
    
    public static String ButtonDownloadImportTemplateXpath()
    {
        return "//a[@fleet-tooltip='Download import template']/i/..";
    }


    
    public static String FilterTextboxXpath() 
    {
        return "//div/div/input";
    }
    
     public static String ManageMenuRelativeXpath() 
    {
        return "//a[text()='MANAGE ']";
    }
     
     public static String MonitorMenuRelativeXpath() 
    {
        return "//a[text()='MONITOR ']";
    }
         
        public static String PassengerSubMenuRelativeXpath() 
    {
        return "//a[text()='Passengers']";
    }
        
       
   public static String CustomGroupSubMenuRelativeXpath() 
    {
        return "//a[text()='Custom groups']";
    }  
   
   public static String MessageBox()
   {
        return "//a[text()='Message box']";
   }
   
   
   
     public static String DefaultOptions()
   {
        return "//a[text()='Default options']";
   }
   
     public static String InstantMessaging()
   {
        return "//a[text()='Instant messaging']";
   }
   
   
   
   
     
    public static String AssetSubMenuRelativeXpath() 
    {
        return "//a[text()='Assets']";
    }
      
    public static String AddAssetButtonRelativeXpath() 
    {
        return "//a[@fleet-tooltip='Add asset']";
    }
    
    public static String PageheaderXpath()
    {
        return "//div[@class='row-fluid sub-menu-fixed']//div/../div/h5/span";
    }
        
    public static String NoMobileDeviceXpath() 
    {
        return "//span[text()='No Mobile device']";
    }
    public static String AssetIdXpath(String assetId) 
    {
        return "//div[text()='"+assetId+"']";
    }
    
    public static String assetIDXpath()
    {
        return "//span[contains(text(),'Registration number')]//..//..//div[@class='cell alt']";
    }
    //span[contains(text(),'Asset ID')]//..//..//div[@class='cell alt']
    
    public static String AssetDescriptionXpath(String assetDescription) 
    {
        return "//a[@class='row-action']/../../../..//a[text()='"+assetDescription+"']";
    }
    
    public static String AssetDescriptionTextXpath() 
    {
        return "//span[text()='Asset description']/../../div[contains(@class,'cell')]//a";
    }
    
    public static String AssetRegistrationXpath(String assetRegistration) 
    {
        return "//div[text()='"+assetRegistration+"']";
    }
    
    public static String ActionButtonByRowXpath(String row) 
    {
        return "//div[@row='"+ row +"']//a[@class='row-action']";
    }
    public static String actionButtonXpath(String rowNumber)
    {
        return "//div[@row='"+rowNumber+"']//a[@class='row-action']";
    }
    
     public static String ActionEditButtonsByRowXpath(String row) 
    {
        return "//ul[contains(@style,'block')]//a[@row-index= "+ row +" ][@event='Edit']";
    }
    
    
    public static String ActionDiagnosticButtonsByRowXpath(String row) 
    {
        //return "//a[@row-index='"+ row +"'][@event='Diagnostics']";
        return "//ul[contains(@style,'block')]//a[@row-index='"+ row +"'][@event='Diagnostics']";
    }
      
    public static String AssetRemoveXpath(String row) 
    {
        return "//a[@row-index='"+row+"']/span[text()='Remove']";
    }

    public static String AssetRemoveXpath() 
    {
        return "//a[@row-index='0']//span[text()='Remove']";
    }
    

    public static String AssetRemoveButtonXpath() 
    {
        return "//button[text()='Remove']";
    }
    
    public static String AssetCancelButtonXpath() 
    {
        return "//button[text()='Cancel']";
    }
    
    public static String AssetRowsCountXpath() 
    {
        return "//div/span[text()='Asset description']/../../div[contains(@class,'cell')]";
    }
    
    public static String BreadcrumXpath() 
    {
        return "//span[@class='text-overflow ng-binding']/../../../div[@class='miller-selector']/a";
    }
   
    public static String Breadcrum1Xpath(String breadcrum1) 
    {
        return "//a/span[text()='"+breadcrum1+"']/..";
    }
    
    public static String Breadcrum2Xpath(String breadcrum2) 
    {
        return "//a/span[text()='"+breadcrum2+"']/..";
    }
    
    public static String Breadcrum3Xpath(String breadcrum3) 
    {
        return "//a/span[text()='"+breadcrum3+"']/..";
    }
    
    public static String Breadcrum4Xpath(String breadcrum4) 
    {
        return "//a/span[text()='"+breadcrum4+"']/..";
    }
    
    public static String CancelButtonRelativeXpath() 
    {
        return "//a[text()='Cancel']";
    }
    
    public static String SelectButtonRelativeXpath() 
    {
        return "//a[text()='Select']";
    }
    
    public static String RemovedDisplayMessageXpath() 
    {
        return "//span[text()='Asset removed successfully']";
    }
    public static String popUpMessageXpath()
    {
        return "//div[@style='display: block;']//span[text()='Asset removed successfully']";
    }
    
    public static String AllAssetsXpath() 
    {
        return "//span[text()='All']/../span[contains(@class,'badge')]";
    }
    
    public static String NextPageButtonXpath() 
    {
        return "//i[@class='icon-chevron-right']";
    }
    
    public static String DuplicateButtonRelativeXpath(String row) 
    {
        return "//a[@row-index='"+row+"']/span[text()='Duplicate']/../../../../ul[contains(@style,'block')]/li/a[@event=\"Duplicate\"]";
    }
    
    public static String SearchBoxRelativeXpath() 
    {
        return "//div[contains(@class,'text-filter')]/input";
    }
    
    public static String removeButtonRemoveItemXpath()
    {
        return "//ul[contains(@style, 'display: block;')]//span[text()='Remove']/..";
    }
    
    public static String AssetRegNoByXpath(int rowNo)
    {
        return "//div[@name='assetListGrid']/div/div/div[4]/div[contains(@class,'cell')]["+rowNo+"]";
    }
    
    public static String SearchButtonRelativeXpath() 
    {
        return "//div[@class=\"text-filter\"]/a[@class='btn btn-small']";
    }
    public static String SearchTextRelativeXpath(String searchText) 
    {
        return "//div[text()='"+searchText+"']";
    }
    
    public static String clearFilterButtonXpath()
    {
        return "//i[@class='icon-remove-sign']";
    }
    
     public static String AssetIDErrorRelativeXpathText() 
    {
        return "//span[text()='FM Vehicle ID is in use']";
        
    }
    public static String RegNoErrorRelativeXpathText() 
    {
        return "//span[text()='Registration number already in use']";
    }
     public static String CancelButtonTextRelativeXpath() 
    {
        return "//button[text()='Cancel']";
    }
    public static String SaveButtonTextRelativeXpath() 
    {
        return "//button[text()='Save']";
    }
     
    public static String ImportFuelToolTipTextXpath()
    {
        return "//div/div[@class='tooltip-inner']/span[text()='Import fuel']";
    }
    
    public static String AssetIDTextBoxRelativeXpath() 
    {
        return "//input[contains(@class,'fm-vehicle-id')]";
    }
    public static String RegNoTextBoxRelativeXpath() 
    {
        return "//input[contains(@class,'registration-number')]";
    } 
     
    public static String AssetDuplicatedSuccessRelativeXpathText() 
    {
        return "//span[text()='Asset created successfully']";
    }
    
    public static String RegNoLabelRelativeXpathText() 
    {
        return "//label/span[text()='Registration number']";
    }
    
    public static String AssetIDLabelRelativeXpathText() 
    {
        return "//label/span[text()='Asset ID']";
    }
    public static String assetDetailsPageSpinnerXpath() 
    {
        return "//form[@name=\"assetDetailsForm\"]/../div[contains(@class,'loading-overlay') and contains(@style,'none')]";
    }
     public static String AssetStatusLabelRelativeXpathText() 
    {
        return "//span[@ng-show='asset.status']";
    }
     public static String AssetsHeaderLabelRelativeXpathText() 
    {
        return "//h5/span[text()='Assets']";
    }
      public static String WouldYouLikeToLabelRelativeXpathText() 
    {
        
        return "//p/strong[text()='Would you like to:']";
    }
    public static String regionalSettingTabXpath()
    {
        return "//a[text()='Regional settings']";
    }
    public static String regionalSettingTabSpinnerXpath()
    {
        return "//div[@id=\"MainView\"]/div/div[contains(@class,'loading-overlay') and contains(@style,'none')]";
    }
    public static String consumptionDropdownXpath()
    {
        return "//span[text()='Consumption']/../../select";
    }
    public static String webPageGridContentXpath(String column, String row)
    {
        return "//div[contains(@class,'column')]//span[contains(text(),'"+column+"')]/../..//div[@row='"+row+"']";
    }
    public static String lastColumnContentXpath(String column, String row)
    {
        return "//div[@name='assetListGrid']//div[@class='column last']//span[contains(text(),'"+column+"')]/../..//div[@row='"+row+"']";
    }
      public static String AssetListGridRelativeXpath() 
    {
        return "//div[@name='assetListGrid']";
    }
    public static String chooseFileButtonXpath()
    {
        return "//span[text()='Choose file']/../input";
    }
    public static String columnHeaderTitlesXpath()
    {
        return "//div[contains(@class,'column-heading')]/span[@class='title' and text()]";
    }
     
    public static String AssetGridLastPageButtonRelativeXpath() 
    {
        return "//button[@fleet-tooltip='Last page']";
    }
    
     public static String AssetGridNextPageButtonRelativeXpath() 
    {
        return "//button[@fleet-tooltip='Next page']";
    }
     public static String AssetGridAllButtonRelativeXpath() 
    {
        return "//span[text()='All']";
    }
     
     public static String PageNumberXpath(String pageNumber)
     {
         return "//button[@fleet-tooltip='Current page'][text()='"+pageNumber+"']";
     }
     
     public static String ExportAssetButtonRelativeXpath() 
    {
        return "//button[@fleet-tooltip='Export assets']";
    }
     
     
     public static String DownloadImportButtonRelativeXpath() 
    {
        return "//a[@fleet-tooltip='Download import template']";
    }
    
    public static String ImportNewRecordsRadioButtonRelativeXpath() 
    {
        return "//span[text()='Import new records']";
    }
    
    public static String DownloadButtonRelativeXpath() 
    {
        return "//a[text()='Download']";
    }
    
    public static String ImportAssetsButtonRelativeXpath() 
    {
        return "//a/i[@class='icon-import']";
    }
    
    public static String ImportAssetsTextBoxRelativeXpath() 
    {
        return "//span/input[@name='file']";
    }
    
    public static String updateExistingRecordRadioRelativeXpath() 
    {
        return "//span[text()='Update existing records']";
    }
    public static String lastColumnXpath()
    {
        return "//div[@name='assetListGrid']//div[@class='column last']//span[@class='title']";
    }
    
    public static String searchTextBoxRelativeXpath() 
    {
        return "//div/input[@class='ng-valid ng-dirty']";
    }
    public static String columnHeadersXpath(int num)
    {
        return "//div[@name='assetListGrid']//div[@class='column']["+num+"]//span[@class='title']";
    }
     public static String columnHeadersXpath()
    {
        return "//div[@name='assetListGrid']//div[@class='column']//span[@class='title']";
    }
    
    public static String ColumnChooserButtonRelativeXpath() 
    {
        return "//a[@class='btn btn-small column-chooser']";
    }
    public static String ColumnChooserListRelativeXpath() 
    {
        return "//ul[@class='dropdown-menu grid-column-chooser']";
    }
    public static String ConfigUploadDateRelativeXpath() 
    {
        return "//ul[@class='dropdown-menu grid-column-chooser'] [contains(@style,'block')]/li/a[@column-field='configUploadDate']";
    }
    public static String AssetIDRelativeXpath() 
    {
        return "//ul[@class='dropdown-menu grid-column-chooser'] [contains(@style,'block')]/li/a[@column-field='fmVehicleId']";
    }
    public static String AssetTypeRelativeXpath() 
    {
        return "//ul[@class='dropdown-menu grid-column-chooser'] [contains(@style,'block')]/li/a[@column-field='assetType']";
    }
    
    public static String ConfigurationGroupRelativeXpath() 
    {
        return "//ul[@class='dropdown-menu grid-column-chooser'] [contains(@style,'block')]/li/a[@column-field='configurationGroup']";
    }
    
    public static String CountryRelativeXpath() 
    {
        return "//ul[@class='dropdown-menu grid-column-chooser'] [contains(@style,'block')]/li/a[@column-field='country']";
    }
    
    public static String EngineHoursRelativeXpath() 
    {
        return "//ul[@class='dropdown-menu grid-column-chooser'] [contains(@style,'block')]/li/a[@column-field='engineHours']";
    }
    public static String FleetNumberRelativeXpath() 
    {
        return "//ul[@class='dropdown-menu grid-column-chooser'] [contains(@style,'block')]/li/a[@column-field='fleetNumber']";
    }
    public static String ImeiRelativeXpath() 
    {
        return "//ul[@class='dropdown-menu grid-column-chooser'] [contains(@style,'block')]/li/a[@column-field='imei']";
    }
    public static String ImsiRelativeXpath() 
    {
        return "//ul[@class='dropdown-menu grid-column-chooser'] [contains(@style,'block')]/li/a[@column-field='imsi']";
    }
    public static String LastAvlRelativeXpath() 
    {
        return "//ul[@class='dropdown-menu grid-column-chooser'] [contains(@style,'block')]/li/a[@column-field='lastAvl']";
    }
    public static String LastTripRelativeXpath() 
    {
        return "//ul[@class='dropdown-menu grid-column-chooser'] [contains(@style,'block')]/li/a[@column-field='lastTrip']";
    }
      public static String MobileDeviceTypeRelativeXpath() 
    {
        return "//ul[@class='dropdown-menu grid-column-chooser'] [contains(@style,'block')]/li/a[@column-field='mobileDeviceType']";
    }
    public static String MsisdnRelativeXpath() 
    {
        return "//ul[@class='dropdown-menu grid-column-chooser'] [contains(@style,'block')]/li/a[@column-field='msisdn']";
    }
    public static String OdometerRelativeXpath() 
    {
        return "//ul[@class='dropdown-menu grid-column-chooser'] [contains(@style,'block')]/li/a[@column-field='odometer']";
    }
    public static String RegistrationNumberRelativeXpath() 
    {
        return "//ul[@class='dropdown-menu grid-column-chooser'] [contains(@style,'block')]/li/a[@column-field='registrationNumber']";
    }
    public static String SiterRelativeXpath() 
    {
        return "//ul[@class='dropdown-menu grid-column-chooser'] [contains(@style,'block')]/li/a[@column-field='site']";
    }
    public static String CurrentStateRelativeXpath() 
    {
        return "//ul[@class='dropdown-menu grid-column-chooser'] [contains(@style,'block')]/li/a[@column-field='currentState']";
    }
    
   
     //Service History
    public static String EditAssetTabsListRelativeXpathText() 
    {
        return "//ul[@class='nav nav-tabs span12 full-height']";
    }
    public static String EditAssetButtonFirstOnListRelativeXpathText() 
    {
        return "//a[@row-index='0']/span[text()='Edit']/../../../../ul[contains(@style,'block')]/li/a[@event='Edit']";
    }
    public static String EditAssetButtonRelativeXpath(String row) 
    {
        return "//a[@row-index='"+row+"']/span[text()='Edit']/../../../../ul[contains(@style,'block')]/li/a[@event='Edit']";
    }   
     public static String ActionButtonFirstOnListRelativeXpathText() 
    {
        return "//div[@row='0']//a[@class='row-action']";
    }
   
    public static String ServiceHistoryTabRelativeXpathText() 
    {
        return "//li/a[text()='Service history']";
    } 
    public static String AddEntryButtonRelativeXpathText() 
    {
        return "//button[text()='Add entry']";
    }
    
    public static String ServiceDateInputRelativeXpath() 
    {
        return "//div[@type='date'][@today]/input";
    }
    
    public static String ReferenceInputRelativeXpath() 
    {
        return "//input[@name='reference']";
    }
     public static String TransactionAmountInputRelativeXpath() 
    {
        return "//input[@name='transactionAmount']";
    }
     public static String OdometerInputRelativeXpath() 
    {
        return "//input[@name='odometer']";
    }
    public static String EngineHoursInputRelativeXpath() 
    {
        return "//input[@name='engineHours']";
    }
    
    public static String NotesTextareatRelativeXpath() 
    {
        return "//textarea[@ng-model='assetServiceHistory.notes']";
    }
     
    public static String ServiceEntrySavedRelativeXpathText() 
    {
        return "//span[text()='Service entry saved successfully']";
    }
    
    public static String ServiceHistoryCancelButtonXpath() 
    {
        return "//div[@class='selection-btn-right pull-right']/button[text()='Cancel']";
    }
    
    public static String ServiceHistorySaveButtonXpath() 
    {
        return "//div[@class='selection-btn-right pull-right']/button[text()='Save']";
    }
    
    //spinner    
    public static String rightpaneAssetsPageSpinner()
    {
        return "//div[@class='paged-grid']//div[@class='loading-overlay'][@style='display: none;']";
    }
    public static String leftpaneAssetsPageSpinnerXpath()
    {
        return "//div[@class='white-box-shadow span3 full-height container-left']//div[@class='loading-overlay'][@style='display: none;']";
    }
    
   //  <editor-fold defaultstate="collapsed" desc="Diagnostics_RequestCurrentPositionFMUnits"> 
    
     public static String AssetDescriptionToValidateRelatieXpath()     
    {        
        return "//div/span[text()='Asset description']";
    }
    
     public static String AssetActionBtnRelatieXpath()     
    {        
        return "//div[@row='0']//a[@class='row-action']";
    }
     public static String RowIDXpath(String RowID) 
    {
        return "//div[text()='"+ RowID +"']";
    }
    
    public static String AssetConfigurationGroupsRelatieXpath() 
    {
        return "//a[text()='Configuration groups']";
    }
    
       public static String AssetManageconfigurationRelatieXpath() 
    {
        return "//a[text ()='Configuration groups:']";
    }
     
    public static String AssetActionButtonsRelatieXpath() 
    {
        return "//a[@class= cell alt'[@row='0']";
    }
      public static String AssetRowsFMCountXpath() 
    {
        return "//div/span[text()='Mobile device']/../../div[contains(@class,'cell alt')]";
    }
    
    public static String AssetsSearchButtonXpath()
    {
        return "//div[@class='text-filter']//a[1]";
    }
      
    
    public static String searchButtonXpath()
      {
          return "//div[@class='text-filter empty']//a/i[@class='icon-search']";
      }
      
    
    
     public static String AssetActionEditButtonDynamicRelatieXpath() 
    {
       return "";
    }
    
    public static String AssetActionEditButtonRelatieXpath()
    {
       return "//a[@row-index= 0][@event='Edit']";
    }
    
    public static String AssetMobileDeviceTemplateRelatieXpath() 
    {
        return "//a[text()='Mobile device templates']";
    }
    
    public static String AssetDeviceGSModemRelatieXpath() 
    {
        return "//a[text()='GSM modem']";
    }
    
    public static String AssetDeviceGSModemAVLTripFrequencyRelatieXpath() 
    {
        return "//div//span[text()='- Send AVL In trip frequency']";
    }
    
    public static String AssetDeviceGSModemAVLTripFrequencyInformationRelatieXpath() 
    {
        return "//div//i[@class='icon-info-sign icon-light']";
    }
     
    public static String AssetActionDiagnosticsButtonRelatieXpath() 
    {
        return "//a[@row-index= 0][@event='Diagnostics']";
    }
     
     public static String AssetDiagnosticsValidateButtonRelatieXpath() 
    {
        return "//a[text()='Request current status']";
    }
    
    public static String AssetDiagnosticsLatestPositionInformationRelatieXpath() 
    {
        return "//div//span[text()='Latest position information']";
    }
    

        public static String FilterXpath()     
    {        
        return "//div[@class='text-filter']/input";
    } 
    
       
        public static String ValidateFilterXpath()     
    {        
        return "//input[@style='width: 160px']";
    } 
 
    public static String AssetDiagnosticsRequestCurrentStatusRelatieXpath() 
    {
        return "//a[text()='Request current status']";
    }
    
    public static String AssetDiagnosticsQuickDownloadRelatieXpath() 
    {
        return "//a[text()='Quick download']";
    }
       
    public static String AssetDiagnosticsFullDownloadRelatieXpath() 
    {
        return "//a[text()='Full download']";
    }
    public static String AssetDiagnosticsCurrentStatusRequestedRelatieXpath() 
    {
        return "//div/span[text ()='Current status requested']";
    }
    //  </editor-fold>   
    
   //  <editor-fold defaultstate="collapsed" desc="Diagnostics_FunctionalityForAssetsWithFMUnits">
    

    public static String AssetVechileIDRelativeXpath() 
    {
        return "//ul[@class='dropdown-menu grid-column-chooser'] [contains(@style,'block')]/li/a[@column-field='vehicleId']";
    }
    
    public static String ColumnChooserButtonsRelativeXpath() 
    {
        return "//a[@class='btn btn-small column-chooser']";
    }

    public static String ColumnChooserAssetIDRelativeXpath() 
    {
        return "//span[@class='title']//a[@class='btn btn-small column-chooser']";
    }
    
    public static String AssetDiagnosticsCommsLogRelatieXpath() 
    {
        return "//div//div//div[text()='Comms log: ']/a";
    }
    
    public static String AssetDiagnosticsCommsLogValidateRelatieXpath() 
    {
        return "//div//span[text()='Automatically scroll to new items']";
    }
    
    public static String AssetDiagnosticsGenerateStatusInformationRelatieXpath() 
    {
       return "//div//span[text()='General status information']";
    }
     
    public static String AssetDiagnosticsPeripheralStatusInformationRelatieXpath() 
    {
       return "//div//span[text()='Peripheral status information']";
    }
    
    public static String AssetDiagnosticsGPSInformationRelatieXpath() 
    {
       return "//div//span[text()='GPS status information']";
    }
   //  </editor-fold>   


   //  <editor-fold defaultstate="collapsed" desc="Usability of the Assets Screen"> 
    
    //--------Usability of the Assets Screen--------
    
     
     
     //Heading: All - Above the table
     public static String HeadingAllXpath(){
         return "//li/strong[text()='All']";
     }
     
     //Heading: Assets
     public static String HeadingAssetsXpath(){
         return "//h5/span[text()='Assets']";
     }
     //Display All Assets
     public static String ClickableAllXpath(){
         return "//a[contains(@ng-click,'selectFilter')]/span[text()='All']/..";
     }
     
     
     //Not Downloading---------
     
     //Not Downloading Asset Filter
     public static String ClickableFilterNotDownloadingXpath()
     {
         return "//a[contains(@ng-click,'selectFilter')]/span[text()='Not downloading']";
     }
     
     //Not Downloading Asset Counter
     public static String CounterNotDownloadingXpath(){
         return "//a[contains(@ng-click,'selectFilter')]/span[text()='Not downloading']/../span[contains(@class,'right')]";
     }
     
     //Points to the Asset Description column and shows all the cells in that column. Used to count the total rows in the table.
     public static String TableRowsAssetDesciptionXpath(){
         return "//span[text()='Asset description']/../../div[contains(@class,'cell')]";
     }
     
     //Not Downloading Label
     public static String LabelNotDownloadingXpath(){
         return "//ul/li/strong[text()='No mobile device']";
     }
     
     //No Mobile Device--------
     
     //No Mobile Device Asset Filter
     public static String ClickableFilterNoMobileDeviceXpath()
     {
         return "//a[contains(@ng-click,'selectFilter')]/span[text()='No Mobile device']";
     }
     
     //No Mobile Device Asset Counter
     public static String CounterNoMobileDeviceXpath(){
         return "//a[contains(@ng-click,'selectFilter')]/span[text()='No Mobile device']/../span[contains(@class,'right')]";
     }
     
     //No Mobile Device Label
     public static String LabelNoMobileDeviceXpath(){
         return "//ul/li/strong[text()='No Mobile device']";
     }
     
     //Available--------
     
     //Available Asset Filter
     public static String ClickableFilterAvailableXpath()
     {
         return "//a[contains(@ng-click,'selectFilter')]/span[text()='Available']";
     }
     
     //Available Asset Counter
     public static String CounterAvailableXpath(){
         return "//a[contains(@ng-click,'selectFilter')]/span[text()='Available']/../span[contains(@class,'right')]";
     }
     
     //Available Label
     public static String LabelAvailableXpath(){
         return "//ul/li/strong[text()='Available']";
     }
     
     
     //Not available--------
     
     //Not available Asset Filter
     public static String ClickableFilterNotAvailableXpath()
     {
         return "//a[contains(@ng-click,'selectFilter')]/span[text()='Not available']";
     }
     
     //Not available Asset Counter
     public static String CounterNotAvailableXpath(){
         return "//a[contains(@ng-click,'selectFilter')]/span[text()='Not available']/../span[contains(@class,'right')]";
     }
     
     //Not available Label
     public static String LabelNotAvailableXpath(){
         return "//ul/li/strong[text()='Not available']";
     }
     
     
     //Decommissioned--------
     
     //Decommissioned Asset Filter
     public static String ClickableFilterDecommissionedXpath()
     {
         return "//a[contains(@ng-click,'selectFilter')]/span[text()='Decommissioned']";
     }
     
     //Decommissioned Asset Counter
     public static String CounterDecommissionedXpath(){
         return "//a[contains(@ng-click,'selectFilter')]/span[text()='Decommissioned']/../span[contains(@class,'right')]";
     }
     
     //Decommissioned Label
     public static String LabelDecommissionedXpath(){
         return "//ul/li/strong[text()='Decommissioned']";
     }
     
     
     //Reminders due soon--------
     
     //Reminders due soon Asset Filter
     public static String ClickableFilterRemindersDueSoonXpath()
     {
         return "//a[contains(@ng-click,'selectFilter')]/span[text()='Reminders due soon']";
     }
     
     //Reminders due soon Asset Counter
     public static String CounterRemindersDueSoonXpath(){
         return "//a[contains(@ng-click,'selectFilter')]/span[text()='Reminders due soon']/../span[contains(@class,'right')]";
     }
     
     //Reminders due soon Label
     public static String LabelRemindersDueSoonXpath(){
         return "//ul/li/strong[text()='Reminders due soon']";
     }
     
     //Reminders overdue--------
     
     //Reminders overdue Asset Filter
     public static String ClickableFilterRemindersOverdueXpath()
     {
         return "//a[contains(@ng-click,'selectFilter')]/span[text()='Reminders overdue']";
     }
     
     //Reminders overdue Asset Counter
     public static String CounterRemindersOverdueXpath(){
         return "//a[contains(@ng-click,'selectFilter')]/span[text()='Reminders overdue']/../span[contains(@class,'right')]";
     }
     
     //Reminders overdue Label
     public static String LabelRemindersOverdueXpath(){
         return "//ul/li/strong[text()='Reminders overdue']";
     }
     
     
    //No items to display message when table is empty
    public static String MessageNoItemsToDisplayXpath(){
        return "//span[text()='No items to display']";
     }
     
     
     //Row one
    public static String RowOneXpath(){
        return "//div/div[contains(@class,'cell')][@row='0']";
     }

    
    //Used to get random Asset Description from what is displayed in the table to filter on
    public static String RowDescriptionXpath(int rowID)
    {
        return "//span[text()='Asset description']/../../div[contains(@class,'cell')]/a[@row-index='"+ rowID +"']";
    }

    //All Row Counter
    public static String CounterAllXpath(){
        return "//a[contains(@ng-click,'selectFilter')]/span[text()='All']/../span[contains(@class,'right')]";
    }
    
    //Filter search Button
    public static String BtnFilterSearchXpath(){
        return "//input/../../div/a[@class='btn btn-small']/i[@class='icon-search']/..";
    }
    
    
    //Used to extract the text of one table row. After a filter has been done
    public static String RowDescriptionFilterXpath(){
        return "//span[text()='Asset description']/../../div[contains(@class,'cell')]/a";
    }
    
    //Table Asset Count
    public static String CountAssetTableXpath(){
        return "//li/span";
    }
    
    //Clear Filter button
    public static String BtnClearFilterFieldXpath(){
        return "//input/../../div/a[@class='clear-filter'][@style='']";
    }
    
    //Heading: Asset Detials
    public static String HeadingAssetDetialsXpath(){
        return "//h5[text()='Asset details']";
    }
    
    //Heading: Registration Number
    public static String HeadingRegistrationNumberXpath(){
        return "//div/label/span[text()='Registration number']";
    }
    
    //Input: Asset Description
    public static String InputAssetDescriptionXpath(){
        return "//div/label/span[text()='Asset description']/../../input";
    }
    
    //Input: Registration Number
    public static String InputRegistrationNumberXpath(){
        return "//div/label/span[text()='Registration number']/../../input";
    }
    
    //Table Loading Spinner
    public static String TableLoadingSpinnerXpath(){
        return "//div[@class='columns ui-sortable']/../div[@class='loading-overlay' and @style='display: none;']";
    }
    //right table spinner
    public static String rightSpinnerXpath(){
        return "//div[@class='row-fluid container-fixed-right']//div[@class='loading-overlay ng-scope'][@style='display: none;']";
    }
    //left table spinner
    public static String leftSpinnerXpath(){
        return "//div[@class='tab-pane active']//div[@class='fleet-grid full-height has-row-actions selection']/div[@class='loading-overlay ng-scope'][@style='display: none;']";
    }
    public static String AssetDetailsSpinnerXpath(){
        return "//div[@class='fa-detail-right well']/div[@class='loading-overlay ng-scope'][@style='display: none;']";
    }
    public static String editStreamPageSpinnerXpath(){
        return "//div[@class='tab-pane active ng-scope']/div[@class='loading-overlay ng-scope'][@style='display: none;']";
    }
    
    //Add stream form loading spinner
    public static String addStreamPageSpinnerXpath(){
        return "//form[@name='streamDetailsForm']/../div[@class='loading-overlay ng-scope' and @style='display: none;']";
    }
    //Filter Input
    public static String InputFilterFieldXpath(){
        return "//div[contains(@class,'text-filter')]/input";
    }
            
    //Button: Export Assets
    public static String BtnExportAssetsXpath(){
        return "//button[@fleet-tooltip='Export assets']";
    }
    
    //Button: Import Assets
    public static String BtnImportAssetsXpath(){
        return "//a[@fleet-tooltip='Import assets']";
    }
    
    //Button: Download import template
    public static String BtnDownloadImportTemplateXpath(){
        return "//a[@fleet-tooltip='Download import template']";
    }
    
    //Button: Add Asset
    public static String BtnAddAssetXpath(){
        return "//a[@fleet-tooltip='Add asset']";
    }
    
    //Row 0 Actions dropdown
    public static String Row1ActionDropDownXpath(){
        return "//div[contains(@style,'left')]/div[@row='0']/div/a";
    }
    
    //Mobile Device column heading
    public static String ColumnHeadingMobileDeviceXpath(){
        return "//div/span[@class][text()='Mobile device']";
    }
    
    //Mobile device first row
    public static String RowMobileDeviceColumnXpath(int rowID){
        return "//div/span[text()='Mobile device']/../../div[contains(@class,'cell')][@row='"+rowID+"']";
    }
    
    
    //Action edit
    public static String ActionEditXpath(){
        return "//body/ul[contains(@class,'grid-row-action-dropdown-menu')][contains(@style,'display: block')]/li/a[@event='Edit']";
    }
    
    //Action Duplicate
    public static String ActionDuplicateXpath(){
        return "//body/ul[contains(@class,'grid-row-action-dropdown-menu')][contains(@style,'display: block')]/li/a[@event='Duplicate']";
    }
    
    //Action edit
    public static String ActionRemoveXpath(){
        return "//body/ul[contains(@class,'grid-row-action-dropdown-menu')][contains(@style,'display: block')]/li/a[@event='Remove']";
    }
            
    //Action Show on historical tracking
    public static String ActionShowHistoricalTrackingXpath(){
        return "//body/ul[contains(@class,'grid-row-action-dropdown-menu')][contains(@style,'display: block')]/li/a[@event='ShowLastHistoricalTrip']";
    }
            
    //Action Show in tip timeline
    public static String ActionShowTripTimeLineXpath(){
        return "//body/ul[contains(@class,'grid-row-action-dropdown-menu')][contains(@style,'display: block')]/li/a[@event='ShowLastTimelineTrip']";
    }
            
    //Action diagnostics
    public static String ActionDiagnosticsXpath(){
        return "//body/ul[contains(@class,'grid-row-action-dropdown-menu')][contains(@style,'display: block')]/li/a[@event='Diagnostics']";
    }
            
    //Column Chooser
    public static String ButtonColumnChooserXpath(){
        return "//a[contains(@class,'column-chooser')]";
    }
    
    //ColumnSelectorAssetDescription
    public static String ColumnSelectorAssetDescriptionXpath(boolean checkTick){
        String append = "";
        if(checkTick){
            
            append = "/i";
            
        }
        
        return "//ul[contains(@class,'grid-column-chooser')][contains(@style,'top')]/li/a[@column-field='description']" + append;
    }
    
    
    //ColumnSelector Asset ID
    public static String ColumnSelectorAssetIDXpath(boolean checkTick){
        String append = "";
        if(checkTick){
            
            append = "/i";
            
        }
        
        return "//ul[contains(@class,'grid-column-chooser')][contains(@style,'top')]/li/a[@column-field='fmVehicleId']" + append;
    }
    
    
    //ColumnSelector assetType
    public static String ColumnSelectorAssetTypeXpath(boolean checkTick){
        String append = "";
        if(checkTick){
            
            append = "/i";
            
        }
        
        return "//ul[contains(@class,'grid-column-chooser')][contains(@style,'top')]/li/a[@column-field='assetType']" + append;
    }
    
    
    //ColumnSelector Config Upload Date
    public static String ColumnSelectorConfigUploadDateXpath(boolean checkTick){
        
        String append = "";
        if(checkTick){
            
            append = "/i";
            
        }
        return "//ul[contains(@class,'grid-column-chooser')][contains(@style,'top')]/li/a[@column-field='configUploadDate']" + append;
    }
    
    
    //ColumnSelector configuration Group
    public static String ColumnSelectorConfigurationGroupXpath(boolean checkTick){
        String append = "";
        if(checkTick){
            
            append = "/i";
            
        }
        
        return "//ul[contains(@class,'grid-column-chooser')][contains(@style,'top')]/li/a[@column-field='configurationGroup']" + append;
    }
    
    
    //ColumnSelector country
    public static String ColumnSelectorCountryXpath(boolean checkTick){
        String append = "";
        if(checkTick){
            
            append = "/i";
            
        }
        
        return "//ul[contains(@class,'grid-column-chooser')][contains(@style,'top')]/li/a[@column-field='country']" + append;
    }
    
    
    //ColumnSelector engineHours
    public static String ColumnSelectorEngineHoursXpath(boolean checkTick){
        String append = "";
        if(checkTick){
            
            append = "/i";
            
        }
        
        return "//ul[contains(@class,'grid-column-chooser')][contains(@style,'top')]/li/a[@column-field='engineHours']" + append;
    }
    
    
    //ColumnSelector fleetNumber
    public static String ColumnSelectorFleetNumberXpath(boolean checkTick){
        String append = "";
        if(checkTick){
            
            append = "/i";
            
        }
        
        return "//ul[contains(@class,'grid-column-chooser')][contains(@style,'top')]/li/a[@column-field='fleetNumber']" + append;
    }
    
    //ColumnSelector imei
    public static String ColumnSelectorIMEIXpath(boolean checkTick){
        String append = "";
        if(checkTick){
            
            append = "/i";
            
        }
        
        return "//ul[contains(@class,'grid-column-chooser')][contains(@style,'top')]/li/a[@column-field='imei']" + append;
    }
    
    
    //ColumnSelector imsi
    public static String ColumnSelectorIMSIXpath(boolean checkTick){
        String append = "";
        if(checkTick){
            
            append = "/i";
            
        }
        
        return "//ul[contains(@class,'grid-column-chooser')][contains(@style,'top')]/li/a[@column-field='imsi']" + append;
    }
    
    
    //ColumnSelector lastAvl
    public static String ColumnSelectorLastAvailableXpath(boolean checkTick){
        String append = "";
        if(checkTick){
            
            append = "/i";
            
        }
        
        return "//ul[contains(@class,'grid-column-chooser')][contains(@style,'top')]/li/a[@column-field='lastAvl']" + append;
    }
    
    
    //ColumnSelector lastTrip
    public static String ColumnSelectorLastTripXpath(boolean checkTick){
        String append = "";
        if(checkTick){
            
            append = "/i";
            
        }
        
        return "//ul[contains(@class,'grid-column-chooser')][contains(@style,'top')]/li/a[@column-field='lastTrip']" + append;
    }
    
    
    //ColumnSelector mobileDeviceType
    public static String ColumnSelectorMobileDeviceTypeXpath(boolean checkTick){
        String append = "";
        if(checkTick){
            
            append = "/i";
            
        }
        
        return "//ul[contains(@class,'grid-column-chooser')][contains(@style,'top')]/li/a[@column-field='mobileDeviceType']" + append;
    }
    
    
    //ColumnSelector msisdn
    public static String ColumnSelectorMSISDNXpath(boolean checkTick){
        String append = "";
        if(checkTick){
            
            append = "/i";
            
        }
        
        return "//ul[contains(@class,'grid-column-chooser')][contains(@style,'top')]/li/a[@column-field='msisdn']" + append;
    }
    
    
    //ColumnSelector odometer
    public static String ColumnSelectorOdometerXpath(boolean checkTick){
        String append = "";
        if(checkTick){
            
            append = "/i";
            
        }
        
        return "//ul[contains(@class,'grid-column-chooser')][contains(@style,'top')]/li/a[@column-field='odometer']" + append;
    }
    
    
    //ColumnSelector RegistrationNumber
    public static String ColumnSelectorRegistrationNumberXpath(boolean checkTick){
        String append = "";
        if(checkTick){
            
            append = "/i";
            
        }
        
        return "//ul[contains(@class,'grid-column-chooser')][contains(@style,'top')]/li/a[@column-field='registrationNumber']" + append;
    }
    
    
    //ColumnSelector site
    public static String ColumnSelectorSiteXpath(boolean checkTick){
        String append = "";
        if(checkTick){
            
            append = "/i";
            
        }
        
        return "//ul[contains(@class,'grid-column-chooser')][contains(@style,'top')]/li/a[@column-field='site']" + append;
    }
    
    //ColumnSelector currentState
    public static String ColumnSelectorCurrentStateXpath(boolean checkTick){
        String append = "";
        if(checkTick){
            
            append = "/i";
            
        }
        
        return "//ul[contains(@class,'grid-column-chooser')][contains(@style,'top')]/li/a[@column-field='currentState']" + append;
    }
    
    
     //  </editor-fold>   
     public static String TargetCostTextXpath() 
    {
        return "//div[@class='row-fluid']/strong";
    }
     public static String EditTargetCostButtonXpath() 
    {
        return "//a[@fleet-tooltip='Edit']";
    }
    public static String UpdateCostPerDistanceTextXpath() 
    {
        return "//span[text()='Update cost per distance']";
    }
     
     public static String TargetCostInputXpath() 
    {
        return "//input[@name='targetCostPerDistance']";
    }
     
    public static String SaveTargetCostButtonXpath() 
    {
        return "//div[@class='modal-footer']/button[text()='Save']";
    }
    

     public static String TargetCostSaveTextXpath() 
    {
        return "//span[text()='Target cost saved']";
    }
  
     public static String OtherCostDataTabTextXpath() 
    {
        return "//li/a[text()='Other cost data']";
    }
    
     public static String FuelDataTabTextXpath() 
    {
        return "//li/a[text()='Fuel data']";
    }
     public static String ImportFuelButtonXpath() 
    {
        return "//a[@fleet-tooltip='Import fuel']";
    }
     public static String DownloadImportFuelTemplateButtonXpath() 
    {
        return "//a[@fleet-tooltip='Download import template']";
    }
     
      public static String LiveTrackingSubMenuRelativeXpath() 
    {
        return "//a[text()='Live tracking']";
    }
      
     public static String DriversSubMenuRelativeXpath() 
    {
        return "//a[text()='Drivers']";
    }
     
    public static String PassangerSubxpath()
    {
        return "//div/h5/span[@class='ng-binding']";
    }
    
    public static String CustomGroupXpath()
    {
        return"//div/h5/span[@class='ng-binding']";
    }
    

    //MobileDeviceSettings
     public static String MobileDeviceSettingsTabTextXpath() 
    {
        return "//li/a[text()='Mobile device settings']";
    }
      public static String MobileDeviceDetailsHeaderTextXpath() 
    {
        return "//form[@name='assetCommissioningForm']//h5[text()='Mobile device details']";
    }
     public static String CommunicationDeviceDetailsHeaderTextXpath() 
    {
        return " //form[@name='assetCommissioningForm']//h5[text()='Communication details']";
    }
     public static String SatelliteDetailsHeaderTextXpath() 
    {
        return "//form[@name='assetCommissioningForm']//h5[text()='Satellite communication modem details']";
    }
     
     public static String MobileDeviceStringTextXpath() 
    {
        return "//form[@name='assetCommissioningForm']//p[text()='Details of the Mobile device installed in the asset']";
    }
     public static String MobileDeviceTypeNameXpath() 
    {
        return "//form[@name='assetCommissioningForm']//input[@name='deviceTypeName']";//use value attr
    }
    
      public static String ChangeMobileDeviceButtonXpath() 
    {
        return "//form[@name='assetCommissioningForm']//button[text()='Change mobile device']";
    }
       public static String RemoveMobileDeviceButtonXpath() 
    {
         return "//form[@name='assetCommissioningForm']//button[text()='Remove mobile device']";
    }
        public static String DownloadAssetConfigButtonXpath() 
    {
         return "//form[@name='assetCommissioningForm']//button[text()='Download asset config']";
    }
     public static String ChangeMobileDeviceHeaderTextXpath() 
    {
         return "//h5/span[text()='Change mobile device']";
    }
      public static String MobileDeviceTypeDropdownXpath() 
    {
         return "//form[@name='assetCommissioningForm']//select[@ng-model='changeMobileDeviceTemplate.deviceTypeId']";
    }
     public static String MobileDeviceCongigGroupDropdownXpath() 
    {
         return "//form[@name='assetCommissioningForm']//select[@ng-model='changeMobileDeviceTemplate.configGroupId']";
    }
     public static String ChangeMobileDeviceCancelButtonXpath() 
    {
         return "//div[@class='modal-footer']/button[text()='Cancel']";
    }
      public static String ChangeMobileDeviceChangeButtonXpath() 
    {
         return "//div[@class='modal-footer']/button[text()='Change']";
    }
       public static String RemoveMobileDeviceHeaderTextXpath() 
    {
         return "//h5/span[text()='Remove mobile device']";
    }
     public static String RemoveMobileDeviceStringTextXpath() 
    {
         return "//p[text()='Removing this mobile device will remove the mobile device details and mark the asset as decommissioned immediately']";
    }
     public static String RemoveMobileDeviceUponDecommisionedStringTextXpath() 
    {
         return "//p[text()='Upon decommissioning, the asset will be flagged as inactive (non-billable)']";
    } 
      public static String OverrideInactiveFlagCheckboxXpath() 
    {
         return "//input[@ng-model='removeMobileDeviceTemplate.makeAssetInactive']";
    }
       public static String RemoveMobileDeviceCheckingFlagStringTextXpath() 
    {
         return "//p[text()='Checking the box above will keep the asset flagged as active (billable)']";
    } 
       public static String RemoveMobileDeviceNotesTextXpath() 
    {
         return "//textarea[@ng-model='removeMobileDeviceTemplate.notes']";
    } 
     public static String RemoveMobileDeviceCancelButtonXpath() 
    {
         return "//div[@name='removeMobileDeviceModal']//div[@class='modal-footer']/button[text()='Cancel']";
    }   
     public static String RemoveMobileDeviceRemoveButtonXpath() 
    {
         return "//div[@class='modal-footer']/button[text()='Remove']";
    }
     
      public static String DownloadAssetConfigHeaderTextXpath() 
    {
         return "//h5/span[text()='Download asset config']";
    }
      public static String getDownloadAssetConfigPugSizeTextXpath() 
    {
        return "//select[@ng-model='assetDownloadConfigTemplate.plugSize']/option[@selected]";
    }
       public static String DownloadAssetConfigPugSizeDropdownXpath() 
    {
        return "//select[@ng-model='assetDownloadConfigTemplate.plugSize']";
    }
       public static String DownloadAssetConfigPugSizeDropdownXpath(String plugSize) 
    {
        return "//select[@ng-model='assetDownloadConfigTemplate.plugSize']/option[text()='"+plugSize+"']";
    } 
    
        public static String DownloadAssetConfigEventRationInputXpath() 
    {
        return "//input[@name='eventRatio']";//use value attri
    }
     public static String DownloadAssetConfigCancelButtonXpath() 
    {
         return "//div[@name='downloadAssetConfigModal']//div[@class='modal-footer']/button[text()='Cancel']";
    }      
      public static String DownloadAssetConfigDownloadButtonXpath() 
    {
         return "//div[@class='modal-footer']/button[text()='Download']";
    }  
      public static String SimCardPinCodeInputXpath() //click
    {
         return "//input[@name='simCardPinCode']";
    }  
      public static String ApnPointNameInputXpath() //click
    {
         return "//input[@name='gprsApnPointName']";
    }  
     public static String ApnUsernameInputXpath() //click
    {
         return "//input[@name='gprsApnUsername']";
    }  
     public static String gprsApnPasswordInputXpath() //click
    {
         return "//input[@name='gprsApnPassword']";
    }
      public static String MobileDeviceGSMCheckboxXpath() //moveTo
    {
         return "//label[@class='checkbox']/span[text()='GSM']";
    }  
     public static String MobileDeviceSMSCheckboxXpath() //moveTo
    {
         return "//label[@class='checkbox']/span[text()='SMS']";
    }  
     
     //SatelliteDetailsHeaderTextXpath for header
     public static String SatelliteDetailsStringTextXpath() 
    {
         return "//p[text()='Details of the satellite modem installed in the asset']";
    }
      public static String SatelliteDetailsIMEINumberInputXpath() 
    {
         return "//input[@name='iridiumImei']";
    }
     public static String SatelliteDetailsAirtimeContractInputXpath() 
    {
         return "//input[@ng-model='form.iridiumContract']";
    }
     public static String ChangeSatelliteModemButtonXpath() 
    {
         return "//button[text()='Change satellite modem']";
    }
      public static String RemoveSatelliteModemButtonXpath() 
    {
         return "//button[text()='Remove satellite modem']";
    }
      
    public static String AssetConfigChangedTextXpath() 
    {
         return "//span[text()='Asset configuration changed. ']";
    }  
    
      
       public static String ChangeSatelliteModemHeaderTextXpath() 
    {
         return "//h5/span[text()='Change satellite modem']";
    }
     public static String CurrentIMEINumberInputXpath() //use value attr
    {
         return "//div[@name='assetChangeSatelliteModemModal']//input[@ng-model='form.iridiumImei']";
    }  
      public static String NewIMEINumberInputXpath() //use value attr
    {
         return "//div[@name='assetChangeSatelliteModemModal']//input[@ng-model='assetChangeSatelliteModemTemplate.newImeiNumber']";
    }    
      public static String ChangeSatelliteModemNotesTextAreaXpath() //use value attr
    {
         return "//div[@name='assetChangeSatelliteModemModal']//textarea[@ng-model='assetChangeSatelliteModemTemplate.note']";
    }
     
       public static String ChangeSatelliteModemCancelButtonXpath() 
    {
         return "//div[@name='assetChangeSatelliteModemModal']//div[@class='modal-footer']/button[text()='Cancel']";
    }   
     public static String ChangeSatelliteModemChangeButtonXpath() 
    {
         return "//div[@name='assetChangeSatelliteModemModal']//div[@class='modal-footer']/button[text()='Change']";
    }
    
     public static String MobileDeviceTypeTableXpath() 
    {
         return "//table[@class=\"table table-condensed table-striped\"]/tbody";
    }
    
     public static String S3LineNotConnectedTextXpath() 
    {
         return "//tr//td[text()='S3']/..//a[text()='Not connected']";
    }
      
     public static String SelectedPeripheralDeviceTextXpath() 
    {
         return "//select[@ng-model='form.selectedPeripheralDevice']";
    }
     public static String SelectedPeripheralDeviceS3TextXpath(String line) 
    {
         return "//option[text()='"+line+"']";
    }
     
     //SaveButtonTextRelativeXpath
     
      public static String MobileDeviceUpdatedTextXpath() 
    {
         return "//span[text()='Mobile device successfully updated']";
    }
      public static String FormSaveButtonXpath() 
    {
         return "/div[contains(@style,'block')]//form[@name='modalForm']//button[text()='Save']";
    }
    
      public static String ChangesNotSavedTextXpath() 
    {
         return "//h5[text()='Changes not saved']";
    }
      public static String YesButtonXpath() 
    {
         return "//button[text()='Yes']";
    }
      
    
     public static String PassengersSubMenuRelativeXpath() 
    {
        return "//a[text()='Passengers']";
    }
    
     public static String AddPassengerButtonRelativeXpath() 
    {
        return "//a[@fleet-tooltip='Add passenger']";
    } 
     public static String LastRefreshTimeRelativeXpath() 
    {
        return "//span[@class='last-refresh-timer']/span";
    }
     
     public static String LastRefreshTimeRelativeTextXpath()
     {
        return "//span[@class='last-refresh-timer']/span[text()='a few seconds ago']";
     }
     
     public static String RefreshButtonRelativeXpath() 
    {
        return "//a/span[text()='Refresh']";
    }
     
      public static String AssetGridFirstPageButtonRelativeXpath() 
    {
        return "//button[@fleet-tooltip='First page']";
    } 
    
    public static String NumberOfPagesToExportXpath(String numberOfPages)
    {
        return "//button[@class='btn btn-small active ng-binding'][text()='"+numberOfPages+"']";
    }
      
    public static String FuelGridDataClassXpath() 
    {
        return "//div[@class='fleet-grid-container-wrapper no-vertical-scroll']";
    }   
    
    
    public static String ServiceHistoryDatePopUpButtonXpath() 
    {
        return "//div[@type='date'][@today]/span";
    }
     public static String ServiceHistoryDatePickerClassXpath() 
    {
        return "//div[@class='datepicker-widget']";
    }
     public static String ServiceHistorySelectPreviousDateClassXpath(String previousDate) 
    {
        return "//div[@class='datepicker-widget in']//div[text()='"+previousDate+"'][@ng-repeat='day in directive.daysInMonth']";
    }
    public static String ServiceHistoryMonthsDatePickerClassXpath() 
    {
        return "//div[@class='datepicker-widget in']//div[contains(@class,'month-of-year ng-binding')]";
    }
    public static String ServiceHistoryDaysDatePickerClassXpath() 
    {
        return "//div[@class='datepicker-widget in']//div[contains(@class,'day-of-month ng-binding')]";
    }
    public static String ServiceHistoryYearDatePickerClassXpath() 
    {
        return "//div[@class='datepicker-widget in']//div[contains(@class,'year ng-binding')][contains(@ng-class,'isYearSelector')]";
    }
    public static String ServiceHistorySelectPreviousYearClassXpath(String previousYear) 
    {
        return "//div[@class='datepicker-widget in']//div[contains(@class,'year ng-scope')]/span[text()='"+previousYear+"']";
    }
    public static String ServiceHistorySelectPreviousMonthClassXpath(String previousMonth) 
    {
        return "//div[@class='datepicker-widget in']//div[contains(@class,'month ng-scope')][text()='"+previousMonth+"']";
    }
    
    public static String ServiceHistoryDatePickerDoneButtonXpath() 
    {
        return "//div[@class='datepicker-widget in']//a[text()='Done']";
    }
     public static String ServiceHistoryAssetUpdatedTextXpath() 
    {
        return "//span[text()='Asset updated successfully']";
    }
     public static String getConfigurationGroupDropDownSelectedTextXpath() 
    {
        return "//select[@name='configurationGroupId']/option[@selected]";
    }
     public static String getFirstRowAssetIDTextXpath() 
    {
        return "//span[text()='Asset ID']/../..//div[@row='0']";
    }
    public static String getFirstRowRegNoTextXpath() 
    {
        return "//span[text()='Registration number']/../..//div[@row='0']";
    }
     //For cancel button ServiceHistoryCancelButtonXpath()
     //For save button ServiceHistorySaveButtonXpath() 

    
    public static String ServiceHistoryRemoveButtonXpath() 
    {
        return "//ul[contains(@style,'block')]//a/span[text()='Remove']";
    }
    public static String ServiceHistoryActionButtonXpath() 
    {
        return "//a[@fleet-tooltip='Actions']";
    } 
    public static String ServiceHistoryRemoveModalButtonXpath() 
    {
        return "//div[@class='modal-footer']//button[text()='Remove']";
    } 
    public static String ServiceHistoryRemoveSuccessTextXpath() 
    {
        return "//span[text()='Service entry removed successfully']";
    } 
    public static String btnActionsXpath()
    {
        return "//a[@class=\"row-action\"]";
    }
    
}
