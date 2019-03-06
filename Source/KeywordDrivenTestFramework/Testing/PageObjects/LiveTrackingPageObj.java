package KeywordDrivenTestFramework.Testing.PageObjects;

import static KeywordDrivenTestFramework.Core.BaseClass.browserType;
import static KeywordDrivenTestFramework.Core.BaseClass.currentEnvironment;

/**
 *
 * @author YP Duma
 */
public class LiveTrackingPageObj
{
    public static String MixTelematicsURL() {
        return currentEnvironment.PageUrl;
    }
    
    public static String CancelButtonXpath()
    {
        return "//button[text()='Send']/../button[text()='Cancel']";
    }
    
    public static String ShowSelectedAssetsLabel()
    {
        return "//span[text()='Show selected assets']";
    }
    
    public static String mapLayersContainerSpinnerXpath()
    {
        return "//div[@class='row-fluid']//div[@class='loading-overlay'][@style='display: none;']";
    }
    public static String assetsGridSpinnerXpath()
    {
        return "(//div[@class='tracking-search-container strong-grid mt-44 mobitech-tracking']//div[@class='loading-overlay ng-scope'][@style='display: none;'])[3]";
    }
    
    
    
    public static String LatitudeAndLongitudeXpath()
    {
        return "//span[text()='Latitude: ']/../../div/span[@class='labelFirst']";
    }
    
    public static String RadioButtonXpath()
    {
        return "//label/span[text() = 'Increase satellite message daily limit by']/../input";
    }
    
    public static String SendDisabledButtonXpath()
    {
        return "//button[@disabled='disabled' and text()='Send']";
    }
    
    public static String SendDisabledButtonXpath1()
    {
        return "//button[@disabled='disabled'][text()='Send']";
    }

    public static String SendButtonXpath()
    {
        return "//button[text()='Send']";
    }
    public static String IncreaseByTextBoxXpath()
    {
        return "//label/span[text() = 'Increase satellite message daily limit by']/../../input";
    }
    public static String CommandsToMobileDeviceXpath()
    {
        return "//a/span[text() = 'Commands to mobile device']";
    }
    public static String ActionButtonXpath()
    {
        return "//div[@rows='assets']//li/div/div/a[@fleet-tooltip='Actions']";
    }
    
    public static String RequestCurrentPositionXpath()
    {
        return "//ul[contains(@style,'display: block')]/li/a/i/../span[text()='Request current position']";
    }
    
    public static String RequestCurrentPostionPopWindowXpath()
    {
        return "//div[@class='modal-body']//span[text()='Request current position']";
    }
    
    public static String DropDownListTransportMethodXpath()
    {
        return "//select[@name='transportMethodId']";
    }
    
    
    public static String RequestCurrentPositionHeading()
    {
        return "//div[@class='alert alert-success']//span[text()='Request current position']";
    }
    
    public static String DropDownListValueTransportMethodXpath()
    {
        return "//select[@name='transportMethodId']/option[@value]";
    }
    
    public static String OptionSelectedXpath(String option)
    {
        return "//select[@name='transportMethodId']/option[text()='"+option+"']";
    }
    
    public static String RequiredFieldMsgXpath()
    {
        return "//select[@name='transportMethodId']/../span[text()='This field is required']";
    }
    
    public static String ButtonSubmitXpath()
    {
        return "//div[@name='requestPositionModal']/div[@class='modal-footer']/button[text()='Submit']";
    }
    
    public static String PositionRequestedMessageXpath()
    {
        return "//span[text()='Position requested']";
    }
    
    public static String ButtonCloseXpath()
    {
       return  "//div[@class='modal hide fade modal-mini in']//button[@class='close']";
        //return "//div[@class='alert alert-success']//span[text()='Request current position']/../..//button[text()='×']";
    }
    
    public static String ButtonXcloseXpath()
    {
        return "//div[@name='requestPositionModal']//button[text()='×']";
    }
    
    public static String spinner()
    {
        return "//div[@class=\"tracking-search-container strong-grid mobitech-tracking\"]/div[@style=\"display: none;\"][@class=\"loading-overlay ng-scope\"]";
    }
    
    public static String AssetFilterXpath()
    {
        return "//div[@class='input-reset-wrapper']/input[@ng-model='mainFilterQuery']";
    }
    
    public static String followAssetIconXpath()
    {
        return "//a[@id='btn-follow-assets']";
    }
    
    public static String FollowAssetSearchFilterXpath()
    {
        return "//div[@header-title='Select multiple assets to follow in a new window']//form[contains(@class,'filter-search')]/div/input";
    }
    
    public static String ClearTextByXpath()
    {
        return "//form[@class='filter-search nomargin form-inline ng-valid ng-dirty']//button[@type='reset']";
    }
    
    public static String FollowAssetCheckAllAssetsXpath()
    {
        return "//div[@eval-when='open']//tr[@class='light-blue']/th[@class='selection']/input[@ng-show='!singleSelect']";
    }
    
    public static String FollowAssetCheckOneAssetXpath(String assetName)
    {
        return "//tr/td/div/span[text()='"+assetName+"']/../../../td/input[@type='checkbox']";
    }
    
    public static String FollowAssetCancelButtonXpath()
    {
        return "//div[@class='modal-footer']/span/../button[text()='Cancel']";
    }
    
    public static String FollowAssetSelectButtonXpath()
    {
        return "//div[@class='modal-footer']/span/../button[text()='Select']";
    }
    
    public static String FollowAssetModalAssetListWindowXpath()
    {
        return "//div[@header-title='Select multiple assets to follow in a new window'][contains(@style,'display: block')]";
    }
    
    public static String FollowAssetbuttonCloseXpath()
    {
        return "//div[@header-title='Select multiple assets to follow in a new window'][contains(@style,'display: block')]//button[@class='close']";
    }
    
    public static String CheckedCheckboxesXpath()
    {
        return "//*[local-name()]/td/input[contains(@type,'checkbox')][contains(@checked,'checked')]";
        //return "//./td/input[contains(@type,'checkbox')][contains(@checked,'checked')]";
    }
    
    public static String NoOfSelectedCheckboxesXpath()
    {
        return "//div[@class='modal-footer']/span";
    }
    
    public static String FirstRowAssetDescriptionXpath(String assetDescription)
    {
        return "//tr/td/div/span[text()='"+assetDescription+"']/.";
    }
    
    public static String NoItemsToDisplayXpath()
    {
        return "//div[@eval-when='open']//span[text()='No items to display']";
    }
    
    public static String NoOfRowsXpath()
    {
        return "//div[@eval-when='open']//tbody/tr";
    }
    
    public static String CheckboxesXpath()
    {
        return "//div[@eval-when='open']//tbody/tr/td/input[contains(@type,'checkbox')]";
    }
    
    public static String RegistrationDescendingOrderXpath()
    {
        return "//div[@class='fleet-grid full-height selection']//tr[@class='light-blue']/th[@column-field='assetRegistration.title']/span[contains(@class,'caret-up')][contains(@style,'display: none')]";
    }
    
    public static String RegistrationAscendingOrderXpath()
    {
        return "//div[@class='fleet-grid full-height selection']//tr[@class='light-blue']/th[@column-field='assetRegistration.title']/span[contains(@class,'caret-down')][contains(@style,'display: none')]";
    }
    
    public static String RegistrationNoXpath()
    {
        return "//div[@class='fleet-grid full-height selection']//tr[@class='light-blue']/th[@column-field='assetRegistration.title']";
    }
    
    public static String DescriptionColunmXpath()
    {
        return "//div[@class='fleet-grid full-height selection']//tr[@class='light-blue']/th[@column-field='assetDescription.title']";
    }
    
    public static String DescriptionDescendingOrderXpath()
    {
        return "//div[@class='fleet-grid full-height selection']//tr[@class='light-blue']/th[@column-field='assetDescription.title']/span[contains(@class,'caret-up')][contains(@style,'display: none')]";
    }
    
    public static String DescriptionAscendingOrderXpath()
    {
        return "//div[@class='fleet-grid full-height selection']//tr[@class='light-blue']/th[@column-field='assetDescription.title']/span[contains(@class,'caret-down')][contains(@style,'display: none')]";
    }
    
    public static String FleetNumberColumnXpath()
    {
        return "//div[@class='fleet-grid full-height selection']//tr[@class='light-blue']/th[@column-field='fleetNumber.title']";
    }
    
    public static String FleetNumberDescendingOrderXpath()
    {
        return "//div[@class='fleet-grid full-height selection']//tr[@class='light-blue']/th[@column-field='fleetNumber.title']/span[contains(@class,'caret-up')][contains(@style,'display: none')]";
    }
    
    public static String FleetNumberAscendingOrderXpath()
    {
        return "//div[@class='fleet-grid full-height selection']//tr[@class='light-blue']/th[@column-field='fleetNumber.title']/span[contains(@class,'caret-down')][contains(@style,'display: none')]";
    }
    
    public static String SiteColumnXpath()
    {
        return "//div[@class='fleet-grid full-height selection']//tr[@class='light-blue']/th[@column-field='site']";
    }
    
    public static String SiteDescendingOrderXpath()
    {
        return "//div[@class='fleet-grid full-height selection']//tr[@class='light-blue']/th[@column-field='site']/span[contains(@class,'caret-up')][contains(@style,'display: none')]";
    }
    
    public static String SiteAscendingOrderXpath()
    {
        return "//div[@class='fleet-grid full-height selection']//tr[@class='light-blue']/th[@column-field='site']/span[contains(@class,'caret-down')][contains(@style,'display: none')]";
    }
    
    public static String SpinnerXpath()
    {
        return "//div[@filters='strongGridCustomFilers']//div[@class='loading-overlay ng-sc[contains(@style,'display: none')]ope'][contains(@style,'display: none')]";
    }
    
    public static String ZoomXpath()
    {
        return "//div[@class='leaflet-control-zoom leaflet-bar leaflet-control']";
    }
    
    public static String ColumnChooserXpath()
    {
        return "//*[local-name()]//div[@columns='assetGridColumns']//a[@class='btn btn-small column-chooser']";
    }
    
    public static String TrackingToolBarXpath()
    {
        return "//div[@class='tracking-docked-toolbar btn-inverse']";
    }
    
    public static String LabelLatitudeXpath()
    {
        return "//span[@class='labelFirst'][contains(text(),'Latitude')]";
    }
    
    public static String MapProviderDropDownListXpath()
    {
        return "//select[@ng-model='mapProvider']";
    }
    public static String ViewManyAssetsHeaderTitle()
    {
      return "//div[@header-title='Select multiple assets to follow in a new window']";    
    }
    public static String SelectViewNewWindowToDisplayXpath()
    {
        return "//a[@fleet-tooltip='View many assets in new window']";
    }
    
    public static String LoadingSpinnerByXpath()
    {
        return "//div[@fleet-loader='content']/div[@columns='assetGridColumns']/../div[@ng-show='contentLoadingStack && contentLoadingStack.length > 0' and @style='display: none;']";
    }
    
    public static String LoadingSpinnerLeftPaneXpath()
    {
        if(browserType.equals(browserType.IE)){
            return "//div[@fleet-loader='content']/div[@columns='assetGridColumns']/../div[@ng-show='contentLoadingStack && contentLoadingStack.length > 0' and @style='display: none;']";
        }else{
            return "//div[@class='left-pane']/div[4]/div[@fleet-loader='content']//../div[@ng-show='contentLoadingStack && contentLoadingStack.length > 0' and @style='display: none;']";
        }
        
    }
    
    public static String GoogleEarthMapIconXpath()
    {
        return "//li/a[@fleet-tooltip='Google Earth']/i";
    }    
    public static String LatitudeTextLabelXpath()
    {
        return "//div[@class='leaflet-control-coordinates leaflet-control']/div[@class='uiElement label']/span[@class='labelFirst']";
    }

    public static String SearchTheVehicleInAssetsNewWindowXpath()
    {
      //return "//div/div[@class='well no-margin']/div/form/div/input[@type='text'][@class='filter-search-input input-medium filter-clear span12 ng-pristine ng-valid']";
      //return "//*[local-name()]/div[@class=\"alert alert-success\"]/../form[@class='filter-search nomargin form-inline ng-pristine ng-valid']/div/input";
        return "//div[@header-title='Select multiple assets to follow in a new window']//form[contains(@class,'filter-search')]/div/input";
    }

    public static String FollowAssetIfTheyAreCheckAssetXpath(String assetName)
    {
        return "//tr/td/div/span[text()='"+assetName+"']/../../../td/input[@type='checkbox'][@checked='checked']";
        
       
    }
    public static String ButtonSelectInNewAssetsWindowClickByXpath()
    {
        return "//div[@name='assetListModal'][contains(@style,'display: block')]/div[@class='modal-footer']/button[@text='Select']";
    }

    public static String VieweLiveTrackingUnit()
    {
        return "//div[@class='container-tracking follow-new-window ng-scope']";
    }
    public static String ButtonStartTrackingClickUsingXpath()
    {
        return "//div[@class='active-tracking-link']/span[@class='no-margins']/a[@ng-click='startActiveTracking(0)']";
        //return "//span/a[@ng-click='startActiveTracking(0)']";
    }
    public static String ButtonStopTrackingClickUsingXpath()
    {
        return "//span/a[@ng-click='stopActiveTracking(0)']";
    }
    public static String HoverOverVehicleByXpath()
    {
        //return "//div[@class='map-marker map-marker-small orange']";
        return "//*[local-name()]/canvas/../i";
    }
    public static String CountAssetUSingLabelXpath()
    {
        return "//span[@class='selectable-limit pull-left ng-scope ng-binding']";
    }
    public static String GetInformationByXpath()
    {
        return "//div[@class=\"leaflet-popup-content-wrapper\"]//table";
    }
    
    public static String GetInformationTrowsByXpath()
    {
        return "//div[@class='leaflet-popup-content-wrapper']//table//tr";
    }
    
    public static String retrieveInfoByXpath()
    {
        return "//div[@class='follow-asset-header']/h5";
       // return "//div[@class='follow-asset-header']/h5/i";
    }
    public static String RetrieveCheckboxCounthowManyTickXpath()
    {
        return "//tr/td/div/span/../../../td/input[@type='checkbox'][@checked='checked']";
    }
    public static String CheckboxCheched()
    {
        return "//div[@name='assetListModal'][contains(@style,'display: block')]//tr[1]/td/div/span/../../../td/input[@type='checkbox']";
    }
    
    public static String getfirstItemOnOnByXpath()
    {
        return "//div[@name='assetListModal'][contains(@style,'display: block')]//tr[1]/td/div/span/../../../td[2]";
    }
    
    public static String RegistrationColumnDataXpath()
    {
        return "//td[@column-field='assetRegistration.title']";
    }
    
    public static String DescriptionColumnDataXpath()
    {
        return "//td[@column-field='assetDescription.title']";
    }
    
    public static String DiagnosticsActionButtonXpath()
    {
        return "//ul[contains(@style,'display: block')]/li/a/span[contains(text(),'Diagnostics')]/..";
    }
    
    public static String DiagnosticsAssetNameXpath()
    {
        return "//div[contains(@fleet-loader,'content')]/h4/span";
    }
    
    public static String DiagnosticsExportButtonXpath()
    {
        return "//div[contains(@fleet-loader,'content')]/div/a[contains(@fleet-tooltip,'Export')]";
    }
    
    public static String DiagnosticsRefreshLinkTextXpath()
    {
        return "//div[contains(@fleet-loader,'content')]/div/div/a/span[contains(text(),'Refresh now')]/..";
    }
    
    public static String DiagnosticsRefreshingCounterXpath()
    {
        return "//div[contains(@fleet-loader,'content')]/div/div/span";
    }
    
    public static String DiagnosticsTableXpath()
    {
        return "//div[contains(@style,'height: auto')]/div/div/table[contains(@class,'table table-condensed table-striped')][contains(@style,'table-layout:fixed;')]";
    }
    public static String PopUpDisplayAlertStartStop()
    {
        return "//span[@id='pop-alert-message']";
    }
     // Map Layers
     public static String TrackingXpath()
    {
        return "//div[@class='ng-scope']/h4[text()='TRACKING']/../ul";
       // return "//div[@class='ng-scope']/h4[text()='TRACKING']/../ul/li[@class='ng-scope']/a";
    }
    public static String MaplayersTree()
    {
        return "//div[@ng-show='contentLoadingStack.length > 0']/../ul/li";
    }
    public static String AssetMaplayer()
    {
        return "//div[@class='tree-sub-items ng-scope']/ul/li/div[@class='tree-item-content']//input[@type='checkbox']/../span";
    }
    public static String ClickMapLayersUsingXpath()
    {
        return "//a[@fleet-tooltip='Map layers']";
    }
    public static String ValidateMapLayersAppear()
    {
        return "//div/div[@ng-show='showLayerTool']";
    }
    public static String SelectCheckBoxEventByNameUsingXpath()
    {
        return "//ul[contains(@options,'layersTreeOptions')]/li/div/div/span[text()='Events on trail']/../input";
    }
    public static String CheckBoxClusteringXpath()
    {
        return "//ul[contains(@options,'layersTreeOptions')]/li/div/div/span[text()='Clustering']/../input";
    }
    public static String SelectCheckBoxLocationByNameUsingXpath()
    {
        return "//ul[contains(@options,'layersTreeOptions')]/li/div/div/span[text()='Location labels']/../input";
    }
    public static String ClickSaveButtonByXpath()
    {
        return "//button[@class='btn btn-success pull-right ng-binding'][text()='Save']";
    }
    public static String ButtonExpandUsingXPath()
    {
        return "//span[@ng-click='item.expanded = true']";
    }
    public static String CheckBoxAssetDescriptionUsingXpath()
    {
        return "//ul[contains(@options,'options')]/li/div/div/span[text()='Asset description']/../input";
    }
    public static String CheckBoxAssetIDUsingXpath()
    {
        return "//ul[contains(@options,'options')]/li/div/div/span[text()='Asset ID']/../input";
    }
    public static String ClickZoomOutUsingTitle()
    {
        return "//a [@title='Zoom out']";
    }
      public static String ClickZoomInUsingTitle()
    {
        return "//a [@title='Zoom in']";
    }
    
     public static String WaitExpandAssetLabelByXpath()
    {
        return "//div[@class='tree-sub-items ng-scope']";
    }
	 public static String MakeSureToobarAppearXpath()
    {
        return "//div[@class='tracking-docked-toolbar btn-inverse']";
    }
     
           //<editor-fold defaultstate="collapsed" Windows ="Iridium">
    public static String ButtonCloseMapLayer()
    {
        return "//button[@ng-click='showLayerTool = false']";
    }
    public static String FlagPositionByXpath()
    {
        return "//div/img[@class='leaflet-marker-icon leaflet-zoom-animated leaflet-clickable']";
    }
    public static String TrailPositionPopUpInfo()
    {
        return "//div[@class='leaflet-popup-content']";
    }
    public static String PositionInfoPopUp()
    {
        return "//div[@class='popover-content']/table/tbody/tr";
    }
    public static String SearchTextForAssetFilter()
    {
        return "//div[@class='pa-10 search-box btn-inverse']/div/input[@class='filter-search-input input-medium span12 ng-valid ng-dirty']";
    }
    public static String GetIridiumFilterWatchByXpath()
    {
        return "//div[@name='assetListModal'][contains(@style,'display: block')]//tr/td/div/span[@class='max-width-300 text-overflow ng-scope'][text()='Watch(Iridium)']";
    }
    
    public static String StartActiveTrackingButtonXpath()
    {
        return "//div/span/a[@class='btn btn-small active-tracking-button ng-binding'][text()='Start active tracking']";
    }
    public static String StartSatelliteTrackingXpath()
    {
        return "//div/span/a[@class='btn btn-small active-tracking-button ng-binding'][text()='Start satellite tracking']";
    }
    public static String StopSatelliteTrackingXpath()
    {
        return "//div/span/a[@class='btn btn-small active-tracking-button ng-binding'][text()='Stop satellite tracking']";
    }
    public static String FrequencyAndDurationTextStartActiveTracting()
    {
        return "//div[@class='help-block active-tracking-times']/span[@class='ng-binding'][text()='Frequency: 45 sec | Duration: 600 sec']";
    }
    public static String validateBlueBanner()
    {
        return "//div[@class='live-tracking-status-block notification-info ng-binding']";
    }
    
    public static String FrequencyAndDurationTextSatelliteTracting()
    {
        return "//div[@class='help-block active-tracking-times']/span[@class='ng-binding'][text()='Frequency: 300 sec | Duration: 1200 sec']";
    }
    
    public static String GetDriverInformationUsingXpath()
    {
        return "//div/span[@class='no-margin driver-label ng-scope ng-binding']";
    }
    
    public static String GetAssetsInformationUsingXpath()
    {
        return "//div//i[@class='icon-car mr-5']";
    }
    //<EDITOR>
         
    //  <editor-fold defaultstate="collapsed" desc="General Look And Feel Of LiveTracking">
    
     public static String LocationIconXpath()
    {
       return "//div[@class='pull-right dropdown']/a[@fleet-tooltip='Locations']";
    }
    
    public static String EventsIconXpath()
    {
        return "//div[@class='pull-right dropdown selection-criteria']/a[@fleet-tooltip='Events']";
    }
    
    public static String LeftSplitterAssetGridXpath()
    {
        return "//div[@fleet-loader='content']/div[@columns='assetGridColumns']/../../../../div[contains(@class,'left-pane')]";
    }
    
    public static String RightSplitterMapXpath()
    {
        return "//div[contains(@class,'right-pane')]";
    }
    
    public static String FilterXpath()
    {
        return "//input[contains(@ng-model,'mainFilterQuery')]";
    }
    
    public static String FilteredAssetDescriptionXpath(String assetDescription)
    {
        return "//tr/td/div/a/span[text()='"+assetDescription+"']/.";
    }
    
    public static String ShowSelectedAssetsCheckboxXpath()
    {
        return "//input[contains(@ng-model,'showSelectAssets')]";
    }
    
    public static String NoOfAssetsPlottedOnTheMapXpath()
    {
       // return "//*[local-name()]/div[@class='leaflet-marker-pane']/div/div/div/canvas";
        return "//div/canvas";
    }
    
    public static String CheckboxXpath()
    {
        return "//tr/td/div//input[@type='checkbox']";
    }
    
    public static String SelectAllCheckboxXpath()
    {
        return "//th[contains(@column-field,'showAssetOnMap')]/span/input[@type='checkbox']";
    }
    
    public static String NoItemsToDisplayAssetGridXpath()
    {
        return "//div[contains(@columns,'assetGridColumns')]/div/span[contains(text(),'No items to display')]";
    }
    
    public static String MovementStatusXpath(String count)
    {
        return "//div[@columns='assetGridColumns']//tbody/tr["+count+"]/td[contains(@column-field,'lastPosition.movementStatus')]/div/i[@fleet-tooltip]";
    }
    
    public static String CountGridAssetsXpath()
    {
        return "//div[@columns='assetGridColumns']//tbody/tr";
    }
    
    public static String getAssetNameXpath(String count)
    {
        return "//div[@columns='assetGridColumns']//tbody/tr["+count+"]/td[@column-field='assetDescription']/div/a/span";
    }
    
    public static String getAssetNameByRowXpath(String assetName)
    {
        return "//div[@columns='assetGridColumns']//tbody/tr/td//span[text()='"+assetName+"']/../../../../td[@column-field='showAssetOnMap']/div/span/input";
    }
    
    
    
    public static String AssetDescriptionAlwaysVisibleXpath()
    {
        return "//ul[contains(@style,'display: block')]/li/a[@class='disabled']/span[text()='Asset description']";
    }
    
    public static String AssetDescriptionAlwaysDisplayedXpath()
    {
        return "//ul[contains(@style,'display: block')]/li/a[@class='disabled']/span[text()='Asset description']/../i[contains(@style,'display')]";
    }
    
    public static String AssetIconColumnChooserItemXpath()
    {
        return "//*[local-name()]//ul[@class='dropdown-menu pull-right column-chooser-dropdown']/li/a/span[text()='Asset icon']/..";
    }
    
    public static String AssetIconColumnXpath()
    {
        return "//th[@column-field='assetIcon']";
    }
    
    public static String AssetIDColumnChooserXpath()
    {
        return "//ul[contains(@style,'display: block')]/li/a/span[text()='Asset ID']/..";
    }
    
    public static String AssetIDColumnXpath()
    {
        return "//th[@column-field='fmVehicleId']";
    }
    
    public static String DriverColumnChooserXpath()
    {
        return "//ul[contains(@style,'display: block')]/li/a/span[text()='Driver']/..";
    }
    
    public static String DriverColumnXpath()
    {
        return "//th[@column-field='lastPosition.driver']";
    }
    
    public static String DriverIdentifiedColumnChooserXpath()
    {
        return "//ul[contains(@style,'display: block')]/li/a/span[text()='Driver identified']/..";
    }
    
    public static String DriverIdentifiedColumnXpath()
    {
        return "//th[@column-field='lastPosition.driverIdentified']";
    }
    
    public static String GPSCoordinatesColumnChooserXpath()
    {
        return "//ul[contains(@style,'display: block')]/li/a/span[text()='GPS coordinates']/..";
    }
    
    public static String GPSCoordinatesColumnXpath()
    {
        return "//th[@column-field='lastPosition.latLng']";
    }
    
    public static String HeadingColumnChooserXpath()
    {
        return "//ul[contains(@style,'display: block')]/li/a/span[text()='Heading']/..";
    }
    
    public static String HeadingColumnXpath()
    {
        return "//th[@column-field='lastPosition.headingDescription']";
    }
    
    public static String IgnitionStatusColumnChooserXpath()
    {
        return "//ul[contains(@style,'display: block')]/li/a/span[text()='Ignition status']/..";
    }
    
    public static String IgnitionStatusColumnXpath()
    {
        return "//th[@column-field='ignitionStatus']";
    }
    
    public static String LastActiveEventColumnChooserXpath()
    {
        return "//ul[contains(@style,'display: block')]/li/a/span[text()='Last active event']/..";
    }
    
    public static String LastActiveEventColumnXpath()
    {
        return "//th[@column-field='lastActiveEvent']";
    }
    
    public static String LastPositionColumnChooserXpath()
    {
        return "//ul[contains(@style,'display: block')]/li/a/span[text()='Last position']/..";
    }
    
    public static String LastPositionColumnXpath()
    {
        return "//th[@column-field='lastPosition.timeStamp']";
    }
    
    public static String LocationColumnChooserXpath()
    {
        return "//ul[contains(@style,'display: block')]/li/a/span[text()='Location']/..";
    }
    
    public static String LocationColumnXpath()
    {
        return "//th[@column-field='lastPosition.location']";
    }
    
    public static String MobileDeviceTypeColumnChooserXpath()
    {
        return "//ul[contains(@style,'display: block')]/li/a/span[text()='Mobile device type']/..";
    }
    
    public static String MobileDeviceTypeColumnXpath()
    {
        return "//th[@column-field='mobileDevice']";
    }
    
    public static String TimeInIgnitionColumnChooserXpath()
    {
        return "//ul[contains(@style,'display: block')]/li/a/span[text()='Time in ignition']/..";
    }
    
    public static String TimeInIgnitionColumnXpath()
    {
        return "//th[@column-field='timeInIgnition']";
    }
    
    public static String FleetNumberColumnChooserXpath()
    {
        return "//ul[contains(@style,'display: block')]/li/a/span[text()='Fleet number']/..";
    }
    
    public static String FleetNumberLiveTrackingColumnXpath()
    {
        return "//th[@column-field='fleetNumber']";
    }
    
    public static String RegistrationColumnChooserXpath()
    {
        return "//ul[contains(@style,'display: block')]/li/a/span[text()='Registration']/..";
    }
    
    public static String RegistrationColumnXpath()
    {
        return "//th[@column-field='assetRegistration']";
    }
    
    public static String SiteColumnChooserXpath()
    {
        return "//ul[contains(@style,'display: block')]/li/a/span[text()='Site']/..";
    }
    
    public static String SiteLiveTrackingColumnXpath()
    {
        return "//th[@column-field='site']";
    }
    
    public static String ClearIconXpath()
    {
        return "//button[@ng-show='mainFilterQuery']/i[@class='icon-remove-sign']/..";
    }
    
     public static String LastColumnXpath()
    {
        return "//tr[1]/td[contains(@class,'last')]";
    }
     
    public static String LastRowXpath()
    {
        return "//tr[contains(@class,'last')]";
    }
    
    public static String MultipleAssetOnSameLocationOntheMap()
    {
        return "//*[local-name()]/div[contains(@class,'leaflet-marker')]/div/span";
    }
    
    public static String DistanceKeyXpath()
    {
        return "//*[local-name()]/div[@class='leaflet-bottom leaflet-left']/div[@class='leaflet-control-scale leaflet-control']";
    }
    
    public static String DeCartaIsNotDefaultMapXpath()
    {
        return "//*[local-name()]/div[contains(@class,'right-pane')]//div[contains(@ng-show,'defaultMapProvider')][contains(@style,'display: none')]";
    }
    
    public static String DeCartaIsDefaultMapXpath()
    {
        return "//*[local-name()]/div[contains(@class,'right-pane')]//div[contains(@ng-show,'defaultMapProvider')]";
    }
    
    //</editor-fold>     
 
     public static String SelectLockOnAssetXpath()
    {
        return "//span[text()='Lock on asset']/../i/../span";
    }
    public static String btnActionXpath()
    {
        return "//div[@ng-show='rowActions']/ul/li[2]/div/div/a[@fleet-tooltip='Actions']";
    }
    public static String BtnActionSecondOnTheListXpath()
    {
        return "//div[@ng-show='rowActions']/ul/li[3]/div/div/a[@fleet-tooltip='Actions']";
    }
    public static String BtnActionThirdOnTheListXpth()
    {
        return "//div[@ng-show='rowActions']/ul/li[4]/div/div/a[@fleet-tooltip='Actions']";
    }
    public static String IconGreyMovementStatusXpath()
    {
        return "//span[@class='icon-shape-circle icon-grey']";
    }
    public static String FlagOnTheMapXpath()
    {
        return "//div/img[@class='leaflet-marker-icon leaflet-zoom-animated leaflet-clickable']";
    }
    public static String FlagInfoOnTheMapXpath()
    {
        return "//div[@class='popover-content']/table/tbody/tr";
    }
    
    public static String CustomLayerXpath()
    {
        return "//div[@class='control-group']/input[@class='span12 ng-pristine ng-valid']";
    }
    public static String SearchToolTipFindXpath()
    {
        return "//div//li//a[@fleet-tooltip='Find']";
    }
    public static String DropdownMenuXpath()
    {
        return "//ul[@class='dropdown-menu search-menu']";
    }
    public static String DropdownMenuInfoXpath()
    {
        return "//ul[@class='dropdown-menu search-menu']/li";
    }
    public static String FindNearestAssetXpath()
    {
        return "//ul[@class='dropdown-menu search-menu']/li/a[text()='Find nearest asset']";
    }
    public static String FindNearestAssetFormXpath()
    {
        return "//form[@name='findNearestAssetForm']";
    }
    public static String SearchButtonXpath()
    {
        return "//div/../a[@class='btn btn-small btn-success pull-right ng-binding']";
    }
    public static String SelectPositionOnMapInFindPageXpath()
    {
        //return "//div/label/input[@class='ng-valid ng-dirty']/../span[text()='A position on the map']/../input";
        //div/label/input[@class='ng-valid ng-dirty']/../span[text()='A position on the map']/../input
        return "//form[@name='findNearestAssetForm']//span[text()='A position on the map']/../input";
    }
    public static String ValidateTrailOnMapXpath()
    {
     return "//*[local-name()='path'][contains(@marker-start, 'url')]";
    }
    public static String EventIconFlag(){
        
        return "//div/a/i[@class='icon-flag']";
    }
    public static String EventNameCheckboxXpath(){
        
        return "//div[@class='fleet-grid full-height selection']/table//tr[@class='light-blue']/th/input";
    }
    
    public static String ButtonSelectXpath(){
        
        return "//Button[text()='Select']";
    }
     //Images
    public static String EventInfoExtractXpath()
    {
        return "//div[@class='popover-content']/table//tr";
    }
     public static String PositionPopUpInfoImage()
     {
         return "PositionInfoImage.PNG";
     }
     
     public static String FlagPosImage()
     {
         return "FlagPosImage.PNG";
     }
     
     public static String FlagPositioImage()
     {
         return "FlagPositioImage.PNG";
     }
     
     public static String FlagPositionImagePos()
     {
         return "FlagPositionImagePos.PNG";
     }
     
     public static String FlagPosOpen()
     {
         return "FlagPosOpen.PNG";
     }
     
     public static String NonFMAssetOrangeImage()
     {
         return "Non_FMAssetOrangeImage.PNG";
     }
     public static String FlagPositionImage()
     {
         return "FlagPositionImage.PNG";
     }
     public static String CloseMapLayerImage()
     {
         return "CloseImage.PNG";
     }
     public static String ButtonSaveImage()
     {
         return "ButtonSaveImage.PNG";
     }
      public static String EventOnTrailImage()
     {
         return "EventOnTrailImage.PNG";
     }
        
      public static String MapLayerImage()
     {
         return "MapLayerImage.PNG";
     }
     public static String AssetInfoImg()
     {
         return "AssetInfoImg.PNG";
     }
     public static String PositionInfoHeadingImage()
     {
         return "PositionInfoHeadingImage.PNG";
     }
     public static String PositionInfoHeadingGreyImage()
     {
         return "PositionInfoHeadingGreyImage.PNG";
     }
     public static String PositionInfoHeadingGreenImage()
     {
         return "PositionInfoHeadingGreenImage.PNG";
     }
    public static String halfFlagPosition()
     {
         return "HalfFlagPosition.PNG";
     }
    public static String EventInfoImage()
    {
        return "EventInfoImage.PNG";
    }
    public static String EventTrailImageSign()
    {
        return "EventTrailImageSign.PNG";
    }
    public static String GreenVehicleImage()
    {
        return "GreenVehicleImage.PNG";
    }
    public static String EventOnTrailCheckedImage()
    {
        return "EventOnTrailCheckedImage.PNG";
    }
    public static String DVTLiveTrackingImage()
    {
        return "DVT_Live_TrackingImage.PNG";
    }
    public static String ZoomOutImage()
    {
        return "ZoomOutImage.PNG";
    }
    public static String DotedImage()
    {
        return "DotedImage.PNG";
    }
    public static String DockBottomChrome()
    {
        return "DockBottomChrome.png";
    }
    public static String SummaryImageIE(){
        return "SummaryImageIE.PNG";
    }
    public static String ClearButtonIEDockBottomImage(){
        return "ClearButtonIEDockBottomImage.PNG";
    }
    public static String DockSeperateWindowsImage(){
        return "DockSeperateWindowsImage.PNG";
    }
    public static String DockToBottomBrowserFireFoxImage()
    {
        return "DockToBottomBrowserFireFoxImage.PNG";
    }
    public static String ChromeNameImage()
    {
      return "ChromeNameImage.PNG";
    }
    
    public static String AssetMovementStatusXpath()
    {
        return "//*[local-name()]/canvas/../div[contains(@class,'map-marker map-marker-small')]";
    }
    public static String FlagPositionXpath()
    {
        return "//div[@class='popover-title']/span[contains(@class,'icon-shape-circle icon')]";
    }
        public static String ExtractFileNameImageFireFox()
    {
        return "ExtractFileNameImageFireFox.PNG";
    }
    public static String DockBottomIEImage()
    {
        return "DockBottomIEImage.PNG";
    }
    public static String FireFoxDecartaImage(){
        return "FireFoxDecarta.PNG";
    }    
    public static String IEClearImg()
    {
        return "IEClear.PNG";
    }
    public static String deCartaImage()
    {
        return "decartaImage.PNG";
    }
    
    public static String testObj()
    {
        return "";
    }
    public static String ConsoleImage()
    {
        return "ConsoleImage.PNG";
    }
    
    public static String CustomLayerImagePlottedOnMap()
    {
        return "CustomLayerImagePlottedOnMap.PNG";
    }
    public static String ZoomInImage()
    {
        return "ZoomIn.PNG";
    }
    
    public static String DockIENetworkImg()
    {
        return "IEPinAtTheBottomImg.PNG";
    }
    
    public static String AssetregistrationNumber()
    {
        return "//div[@class='follow-asset-header']/h5[text()='DVT-Live - DVT Live Tracking Unit']";
    }
    
    public static String AssetDescriptionNo()
    {
        return "//div[@class='follow-asset-header']/span[text()='zMichael Chamberlain - DO NOT DELETE']";
    }
    
    
    //  <editor-fold defaultstate="collapsed" desc="List View Sets Calendar View Accordingly">
    
    public static String ListViewdropdownOptiionsXpath(String name)
    {
        return "//select/option[text()='" + name + "']";
    } 
    
    public static String ListViewdropdownXpath()
    {
        return "//select[@name='listItem']";
    } 
    
    public static String ViewDateButtonIconXpath()
    {
        return "//a[@fleet-tooltip='View dates']";
    }
    
    public static String ListViewButtonIconActiveXpath()
    {
        return "//a[@fleet-tooltip='List view'][@class='btn active']";
    }
    
    public static String ListViewButtonIconXpath()
    {
        return "//a[@fleet-tooltip='List view']";
    }
    
    public static String CalendarViewButtonIconXpath()
    {
        return "//a[@fleet-tooltip='Calendar view']";
    }
    
    public static String ButtonSaveXpath()
    {
        return "//i[@class='icon-ok icon-white']/..";
    }
    
    public static String HistoricalTrackingSpinnerXpath()
    {
        return "//div[@class='left-pane']/div/div[contains(@style,'none')]";
    }
    
    public static String StartDateTextboxXpath()
    {
        return "//div[1]/div[@type='datetime']/input";
    }
    
    public static String EndDateTextBoxXpath()
    {
        return "//div[@class='pull-left']/div[@type='datetime']/input";
    }
    
    public static String ButtonCancelXpath()
    {
        return "//i[@class='icon-remove']/..";
    }
    
    //</editor-fold>
    
    //  <editor-fold defaultstate="collapsed" desc=" DMF-1309:Selected assets remembered when navigating away from page Print view">
    
    public static String LiveTrackingAssetGridXpath()
    {
        return "//div[@columns='assetGridColumns']";
    }
    
    public static String MonitorDropDownOpenXpath()
    {
        return "//li[@class='dropdown ng-scope open']";
    }
    
    public static String LiveTrackingPageHeaderXpath()
    {
        return "//h5/span[text()='Live tracking']";
    }
    
    public static String SelectCheckBoxByRowXpath(String rowNumber)
    {
        return "//tr["+rowNumber+"]/td/div//input[@type='checkbox']";
    }
    
    public static String NoOfClusteredAssetsXpath()
    {
        return "//div[contains(@class,'marker-cluster')]/div/span";
    }
    
    //</editor-fold>
    
    //  <editor-fold defaultstate="collapsed" desc="AssetList Show On Map Historical Tracking">
    public static String SearchInputFilterHistoricalTrackingXpath()
    {
        return "//form[@name='inputResetForm']/div/input";        
    }
    
    public static String ButtonSearchXpath()
    {
        return "//form[@name='inputResetForm']/div/button";
    }
    
    public static String CheckboxAssetsWithTripsXpath()
    {
        return "//input[@ng-model='showAssetsForThisPeriod']";
    }
    
    public static String CheckboxShowEventsForThisPeriod()
    {
        return "//input[@ng-model='showEventsForThisPeriod']";
    }
    
    public static String AssetDescriptionXpath(String assetDesc)
    {
        return "//table/tbody/tr/td[text()='"+assetDesc+"']";
    }
    
    public static String ExpandTripIconXpath()
    {
        return "//td/a/i[@class='icon-grey icon-plus']/..";
    }
    
    public static String ExpandSubTripIconXpath()
    {
        return "//tbody[1]/tr/td[1]/a[@ng-show='trip.subTrips.length']/i[@class='icon-grey icon-plus']/..";
    }
        
    public static String TripTableHeadersXpath()
    {
        return "//table/thead/tr[@class='light-blue']/th[@class='column-heading']/span[@class='ng-binding']";
    }
    
    public static String TripTableSubHeadersXpath()
    {
        return "//table/tbody/tr[@ui-if='asset.expanded']//table/thead/tr/th[@class='ng-binding']";
    }
    
    public static String ExpandedItemXpath()
    {
        return "//tbody[@ng-repeat='asset in assets']/tr[1]";
    }
    
    public static String TripSubTableDataXpath(String rowNo,String columnNo)
    {
        return "//table/tbody["+rowNo+"][contains(@ng-repeat,'trip in asset.trips')]/tr/td[@bind-once]["+columnNo+"]";
    }
    
    public static String AssetIconXpath()
    {
        return "//td/div/i[contains(@class,'marker-icon-blue')]";
    }
    
    public static String AssetDescColumnXpath()
    {
        return "//table/tbody/tr/td[@bind-once='asset.description']";
    }
    
    public static String ExpandedItemBackgroundColorXpath()
    {
        return "//tr[contains(@ng-class,'success') and @class='info']";
    }
    
    public static String AssetMapIconXpath()
    {
        return "//div[@class='leaflet-marker-icon marker marker-small']/i";
    }
    
    public static String FlagImgXpath()
    {
        return "//img[contains(@src,'start')][1]";
    }
    
    public static String FlagInfoXpath()
    {
        return "//div[@class='leaflet-popup-pane']/div";
    }

    public static String FlagImag()
    {
        return "";
    }

    //</editor-fold>
    
    public static String LoadingSpinnerXpath()
    {
        return "//form[@name='streamDetailsForm']/../div[contains(@style,'display: none')]";
    }
    
    public static String AssetTabLoadingSpinnerXpath()
    {
        return "//form[@name='streamAssetsForm']/../div[contains(@style,'display: none')]";
    }
    
    public static String HistoricalTableXpath()
    {
        return "//tr[@class='light-blue']/th/span";
    }
    
    public static String HistoricalAssetTabXpath()
    {
        return "//a[@class='mobitech-tracking-tab ng-binding active']";
    }
    
    
    //  <editor-fold defaultstate="collapsed" desc="DMF-1308 : Multi-delete of location">
    
    public static String ManageLocationLinkTextXpath()
    {
        return "//ul/li/a[text()='Manage locations']";
    }
    
    public static String ButtonImportLocationXpath()
    {
        return "//div/span/a[@fleet-tooltip='Import locations']/i/..";
    }
    
    public static String ButtonDeleteLocationXpath()
    {
        return "//div/span/a[@fleet-tooltip='Remove locations']/i/..";
    }
    
    public static String ButtonAddLocationXpath()
    {
        return "//div/span/a[@fleet-tooltip='Add location']/i/..";
    }
    
    public static String SearchLocationTextboxXpath()
    {
        return "//form/div/input[@ng-model='filterQuery']";
    }
    
    public static String LocationCheckboxXpath(String rowNo)
    {
        return "//tr["+rowNo+"]/td[@column-field='selectedForDelete']//input[@type='checkbox']";
    }
    
    public static String MapProviderDropDownXpath()
    {
        return "//div/select[@ng-model='mapProvider']";
    }
    
    public static String SelectedOptionXpath(String mapProvider)
    {
        return "//div/select[@ng-model='mapProvider']/option[@selected='selected'][text()='"+mapProvider+"']";
    }
    
    public static String ButtonBackToLocationListXpath()
    {
        return "//a/span[text()='Back to location list']";
    }
    
    public static String RadioButtonAddressXpath()
    {
        return "//input[@value='address']";
    }
    public static String manageLocationsFindAPlaceSpinnerXpath()
    {
        return "//div[@ng-hide='currentLocation']/..//div[@class='loading-overlay'][@style='display: none;']";
    }
    
    public static String RadioButtonLatitudeLongitudeXpath()
    {
        return "//input[@value='latLng']";
    }
    
    public static String ManageLocationLinkTextheadingXpath()
    {
        return "//h5/a[text()='Manage locations']";
    }
    
    public static String CountryDropdownListXpath()
    {
        return "//select[contains(@ng-model,'selectedCountry.value')]";
    }
    
    public static String LanguageDropdownListXpath()
    {
        return "//select[contains(@ng-model,'selectedLanguage.value')]";
    }
    
    public static String CreateLocationUsingAnyShapeXpath(String shape)
    {
        return "//div/a[@fleet-tooltip='"+shape+"']/i/..";
    }
    
    public static String mouseCrosshairXpath() 
    {
        return "//div[contains(@class, 'leaflet-container')][contains(@style, 'cursor: crosshair')]";
    } 
    
    public static String ManageLocationSpinnerXpath()
    {
        return "//div[@fleet-loader='content']/div[contains(@style,'display: none')]";
    }
    
    public static String LocationRemovedMessageXpath()
    {
        return "//span[text()='Location removed successfully']";
    }
    
    public static String LocationAddressTextFieldXpath()
    {
        return "//div/input[@id='LocationAddress']";
    }
    
    public static String ExpectLocationResultListXpath(String location)
    {
        return "//ul/li/A[text()='"+location+"']";
    }
    
    public static String BelharImg()
    {
        return "Belhar.PNG";
    }
    public static String BelharXpath()
    {
        return "//img[@src='img/map-icon-drag-pin.png']";
    }
   
    
    public static String AddressTextFieldImg()
    {
        //return "AddressTextField.PNG";
        return "AddressTextField2.PNG";
    }
    
    public static String IEAddressTextFieldImg()
    {
        return "IEAddressTextFieldImg.PNG";
    }
    
    public static String IENetworkAlreadyClicked()
    {
        return "IENetworkAlreadyClicked.PNG";
    }
    
    public static String getDecartaAboveImg()
    {
        return "getDecartaAboveImg.PNG";
    }
    
    public static String FirefoxAddressFieldImg()
    {
        return "FirefoxAddressFieldImg.PNG";
    }
    
    public static String FirefoxExtractDEcImg()
    {
        return "FirefoxExtractDEc.PNG";
    }
    
    public static String ChromeDockImg()
    {
        return "ChromeDock.PNG";
    }
    
    public static String ChromeDockBottomImg()
    {
        return "ChromeDockBottom.PNG";
    }
    
    public static String ChromeDockRightImg()
    {
        return "DockRightChromeGrey.PNG";
    }
    
    
    
    public static String ChromeDockOptionsImg()
    {
        return "ChromeDockOptions.PNG";
    }
    
    public static String ChromeOpenDockOptionImg()
    {
        return "ChromeOpenDockOption.PNG";
    }
    
    public static String ChromeNameNetworkImg()
    {
        return "ChromeNameNetwork.PNG";
    }
    public static String ChromeShortNameNetworkImg()
    {
        return "ChromeNameNetworkShort.PNG";
    }
    
    public static String FindByAddressRadioBtnImg()
    {
        return "FindByAddressRadioBtnImg.PNG";
    }
    
    public static String PersonalSettingSpinnerXpath()
    {
        return "//div[@fleet-loader='content']/div[contains(@style,'display: none')]";
    }
    
    //</editor-fold>
    
    //  <editor-fold defaultstate="collapsed" desc="DMF-1308 : Multi-delete of location">
    
        public static String buttonDownLoadImportTemplateXpath()
        {
            return "//div/span/a[@fleet-tooltip='Download import template']";
        }
        
        public static String buttonImportLocationXpath()
        {
            return "//div/span/a[@fleet-tooltip='Import locations']";
        }
        
        public static String DownloadImportTemplatePopUpXpath()
        {
            return "//div[contains(@style,'display: block')]/form/div//h5[text()='Download import template']";
        }
        
        public static String RadioButtonUpdateExistingRecordXpath()
        {
            return "//div[contains(@style,'display: block')]/form/div//label/span[text()='Update existing records for this organisation']/../input";
        }
        
        public static String RadioButtonImportLocationXpath()
        {
            return "//div[contains(@style,'display: block')]/form/div//label/span[text()='Import these locations into another organisation']/../input";
        }
        
        public static String ButtonCancelOnPopUpXpath()
        {
            return "//div[contains(@style,'display: block')]/form/div[@class='modal-footer']/a[text()='Cancel']";
        }
        
        public static String ButtonDownloadOnPopUpXpath()
        {
            return "//div[contains(@style,'display: block')]/form/div[@class='modal-footer']/a[text()='Download']";
        }
        
        public static String ButtonDownloadOnPopUpDisabledXpath()
        {
            return "//div[contains(@style,'display: block')]/form/div[@class='modal-footer']/a[text()='Download'][@disabled='disabled']";
        }
        
        
    
    //</editor-fold>
        
    //  <editor-fold defaultstate="collapsed" desc="Shake down">    
        
    public static String AssetDescXpath(String name)
    {
        return "//tr[1]/td/div/a/span[text()='"+name+"']";
    }
    
    public static String ViewDetailsXpath()
    {
        return "//ul[contains(@style,'display: block;')]/li/a/span[text()='View details']/..";
    }
    
    public static String BtnBackToAssetListXpath()
    {
        return "//div[@class='left-pane']//div/a[@ng-click='currentAsset = undefined']/span[text()='Back to asset list']/..";
    }
    
    public static String AssetDetailsListXpath()
    {
        return "//table[@ng-show=\"currentAsset.lastPosition.movementStatus != 'TabsPosition'\"][@class='table table-striped table-condensed']/tbody/tr/td[2]";
    }
    
    public static String AssetDetailsHeadingListXpath()
    {
        return "//table[@ng-show=\"currentAsset.lastPosition.movementStatus != 'TabsPosition'\"][@class='table table-striped table-condensed']/tbody/tr/td/strong/span";
    }
    
    public static String ClusteredAssetsXpath()
    {
        return "//div[contains(@class,'cluster marker-cluster-small')]/div/span";
    }
    
    public static String GPSStatusInfoListXpath()
    {
        return "//table[@ng-show='gpsStatusInfo']/tbody/tr/td[2]";
    }
    
    public static String GPSStatusInfoHeadingsListXpath()
    {
        return "//table[@ng-show='gpsStatusInfo']/tbody/tr/td/strong";
    }
    
    public static String PeripheralStatusInfoHeadingsListXpath()
    {
        return "//table[@ng-show='inputStatusInfo']/tbody/tr/td/strong";
    }
    
    public static String PeripheralStatusInfoListXpath()
    {
        return "//table[@ng-show='inputStatusInfo']/tbody/tr/td[2]";
    }
    
    public static String GeneralStatusInfoListXpath()
    {
        return "//table[@ng-show='generalStatusInfo']/tbody/tr/td[2]";
    }
    
    public static String GeneralStatusInfoHeadingListXpath()
    {
        return "//table[@ng-show='generalStatusInfo']/tbody/tr/td/strong";
    }
    
    public static String LatestPositionInfHeadingsListXpath()
    {
        return "//table[@ng-show='latestAVLInfo']/tbody/tr/td/strong";
    }
    
    public static String LatestPositionInfoListXpath()
    {
        return "//table[@ng-show='latestAVLInfo']/tbody/tr/td[2]";
    }
    
    public static String GeneralStatusInfoBlueXpath()
    {
        return "//div[@ng-hide]//div[@class='accordion-heading accordion-heading-light-blue']/a/span[text()='General status information']/..";
    }
    
    public static String PeripheralStatusInfoBlueXpath()
    {
        return "//div[@ng-hide]//div[@class='accordion-heading accordion-heading-light-blue']/a/span[text()='Peripheral status information']/..";
    }
    
    public static String GPSStatusInfoBlueXpath()
    {
        return "//div[@ng-hide]//div[@class='accordion-heading accordion-heading-light-blue']/a/span[text()='GPS status information']/..";
    }
    
    public static String LatestPositionInfoBlueXpath()
    {
        return "//div[@inner-class]//div[@class='accordion-heading accordion-heading-light-blue']/a/span[text()='Latest position information']/..";
    }
    
    public static String NoDataAvailabeXpath()
    {
        return "//div[@class='accordion-group expanded']//p[text()='No data available.'][@style='display: none;']";
    }
    
    public static String NoDataAvailableAVLXpath()
    {
        return "//div[@class='accordion-group ng-scope expanded']//p[text()='No data available.'][@style='display: none;']";
    }
    
    public static String BtnDownloadExportXpath()
    {
        return "//a[@fleet-tooltip='Export']/i[@class='icon-export']/..";
    }
    
    public static String ServicingAndLicensingStatusXpath(){
        return "//table[1]//td/span[@ng-repeat='status in currentAsset.servicingAndLicensingStatus']/span[text()='OK']";
    }
    
    //</editor-fold>
    
    //  <editor-fold defaultstate="collapsed" desc="ExportLocation">
    public static String ManageLocationFilterXpath(){
        
        return "//div[@class='input-reset-wrapper']/input";
    }
    
    public static String BtnImportDownLoadXpath(){
        
        return "//i[@class=\"icon-download-alt\"]/..";
    }
    public static String DownLoadButtonXpath(){
        
        return "//a[text()='Download']";
    }
    public static String UpdateExistingRadioButtonXpath(){
        
        return "//div[1]/label/input[@type='radio']";
    }
    public static String ColumnChooserIndexXpath(int index){
        
        return "//ul[@class='dropdown-menu pull-right column-chooser-dropdown'][contains(@style,'block')]/li["+index+"]//a";
        //return "//ul[@class='dropdown-menu pull-right column-chooser-dropdown'][contains(@style,'block')]/li["+index+"]//a[not(@class='disabled')]//span[1][contains(@class, 'spacer')]/..";
        
    }
    public static String ColumnListIndexXpath(){
        
        return "//ul[@class='dropdown-menu pull-right column-chooser-dropdown'][contains(@style,'block')]/li";
    }
    
    public static String UnorderedColumnListXPath()
    {
        return "//ul[@class='dropdown-menu pull-right column-chooser-dropdown'][contains(@style,'block')]";
    }
    public static String TickXPath()
    {
        return "//ul[@class='dropdown-menu pull-right column-chooser-dropdown'][contains(@style,'block')]/li//a/i[contains(@style,'display: none;')]";
    }
    public static String ColumnNotDisplayedXpath(String text)
    {
        return "//ul[@class='dropdown-menu pull-right column-chooser-dropdown'][contains(@style,'display: block;')]/li/a/span[text()='"+text+"']/../i['icon icon-ok pull-left'][@style='display: none;']/..";
    }
    public static String ColumnHeaderXpath()
    {
        return "//table//thead//tr[1]//th[contains(@class, 'column-heading')]//span[2]";
    }
    public static String LocationNameXpath()
    {
        return "//div[@id='trManageLocationListGrid']/div//table/tbody/tr/td[@column-field='description']/div//span";
    }
    public static String LocationTypeXpath()
    {
        return "//div[@id='trManageLocationListGrid']/div//table/tbody/tr/td[@column-field='type']/div//span";
    }
    public static String ColumnOnTheGridXpath()
    {
        return "//ul[@class='dropdown-menu pull-right column-chooser-dropdown'][contains(@style,'display: block;')]/li";
    }
    
    //</editor-fold>
}


