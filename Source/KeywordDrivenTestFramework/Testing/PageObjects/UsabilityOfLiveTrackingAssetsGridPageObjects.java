/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects;

/**
 *
 * @author apeter
 */
public class UsabilityOfLiveTrackingAssetsGridPageObjects {
    public static String headingXpath(){
        return "//h5[@ui-if='!url']/span";
    }
    
    public static String organisationGroupXpath(){
        return "//div[@ng-show=\"type == 'miller'\"]/a/span[3]/span[2]";
    }
    
    public static String locationButtonXpath(){
        return "//a[@ng-click='showLocationModal()']";
    }
    
    public static String eventsButtonXpath(){
        return "//a[@ng-click='eventModalData.clickHandler()']";
    }
    
    public static String assetsGridXpath(){
        return "//div[@class='fleet-grid full-height has-row-actions']/table";
    }
    
    public static String filterXpath(){
        return "//div[@class='pa-10 search-box btn-inverse']/div/input";
    }
    
    public static String showSelectedAssetsOptionXpath(){
        return "//span[text()='Show selected assets']/../input";
    }
    
    public static String firstColumnXpath(){
        return "//th[@column-field='showAssetOnMap']/span/input";
    }
    
    public static String secondColumnXpath(){
        return "//span[@fleet-tooltip='Movement status']";
    }
    
    public static String assetsDescriptionXpath(){
        return "//th[@column-field='assetDescription']";
    }
    
    public static String mobileDeviceColumnXpath(){
        return "//th[@column-field='mobileDevice']";
    }
    
    public static String actionsButtonXpath(){
        return "//div[@column='rowActions']/div/a";
    }
    
    public static String actionsButton2Xpath(){
        return "//li[@ng-repeat=\"row in limitedRows\"][2]/div/div/a";
    }
    
    public static String assetsXpath(){
        return "//div[@class='leaflet-popup-tip']";
    }
    
    public static String selectAssetsXpath(){
        return "//td[@column-field='showAssetOnMap']/div/span/input";
    }
    
    public static String selectedAssetXpath(){
        return "class='leaflet-popup-pane'";
    }
    
    public static String displayedSelectedAssetsOnGridXpath(){
        return "//div[@class='fleet-grid full-height has-row-actions']/table/tbody/tr";
    }
    
    public static String columnSelectorButtonXpath(){
        return "//a[@class='btn btn-small column-chooser']";
    }
    
    public static String columnXpath(int num){
        return "//ul[@class='dropdown-menu pull-right column-chooser-dropdown']/li["+num+"]/a/span[2]";
    }
    
     public static String selectColumnXpath(int num){
        return "//ul[@class='dropdown-menu pull-right column-chooser-dropdown']/li["+num+"]/a";
     }
     
     public static String checkedColumnXpath(int num){
        return "//ul[@class='dropdown-menu pull-right column-chooser-dropdown']/li["+num+"]/a/i";
     }
     
     public static String lastColumnXpath(){
         return "//th[@column-field='lastPosition.timeStamp']";
     }
     
     public static String columnHeadersXpath(int num){
         return "//div[@ng-show=\"leftPanel == 'assetList'\"]/div/div/div/div/table/thead/tr/th["+num+"]";
     }
     
     public static String stationaryTooltipXpath(){
         return "//i[@fleet-tooltip='Stationary']";
     }
     
     public static String oldInfoTooltipXpath(){
         return "//i[@fleet-tooltip='Old information']";
     }
     
     public static String checkNonFmUnitXpath(){
         return "//i[@fleet-tooltip='Old information']/../../../td[2]";
     }
     
     public static String nonFMActionButtonXpath(){
         return "//li[3]/div[@column='rowActions']/div/a";
     }
     
     public static String goToAssetXpath(){
         return "//span[text()='Go to asset']";
     }
     
     public static String viewDetailsXpath(){
         return "//span[text()='Go to asset']/../../../li[2]/a/span";
     }
     
     public static String viewInNewWindowXpath(){
         return "//span[text()='Go to asset']/../../../li[3]/a/span";
     }
     
     public static String lockOnAssetXpath(){
         return "//span[text()='Go to asset']/../../../li[4]/a/span";
     }
     
     public static String showTrailOnMapXpath(){
         return "//span[text()='Go to asset']/../../../li[5]/a/span";
     }
     
     public static String diagnosticsXpath(){
         return "//span[text()='Go to asset']/../../../li[6]/a/span";
     }
     
     public static String assetDescriptionXpath(){
         return "//h4[@class='no-margins row-fluid mt-3 text-overflow']/span";
     }
     
     public static String refreshTimeXpath(){
         return "//span[@class='muted ng-binding']";
     }
     
     public static String refreshNowXpath(){
         return "//a[@ng-click='initialise()']/span";
     }
     
     public static String exportXpath(){
         return "//a[@fleet-tooltip='Export']";
     }
     
     public static String unitDetails(){
         return "//span[text()='Unit details']";
     }
     
     public static String firmwareHistoryXpath(){
         return "//span[text()='Firmware history']";
     }
     
     public static String peripheralXpath(){
         return "//span[text()='Peripheral status information']";
     }
     
     public static String gpsStatusXpath(){
         return "//span[text()='GPS status information']";
     }
     
     public static String latestPositionXpath(){
         return "//span[text()='Latest position information']";
     }
     
     public static String checkFmUnitXpath(){
         return "//i[@fleet-tooltip='Stationary']/../../../td[2]";
     }
     
     public static String actionsFMUnitsXpath(int num){
         return "//ul[contains(@style,'block')]/li["+num+"]/a/span";
     }
     
     public static String backToAssetListXpath(){
         return "//a[@ng-click='currentAsset = undefined']";
     }
     
     public static String actionsButtonOnViewXpath(){
         return "//ul[@class=\"dropdown-menu actions pull-right\"]/../a";
     }
     
     public static String assetRegistrationXpath(){
         return "//a[text()='View in new window']/../../../../..//td[@class=\"text-clip ng-binding\"]";
     }
     
     public static String fleetNumberXpath(){
         return "//a[text()='View in new window']/../../../../..//td[@class=\"text-clip ng-binding\"]/p[1]";
     }
     
     public static String driverIDXpath(){
         return "//a[text()='View in new window']/../../../../..//td[@class=\"text-clip ng-binding\"]/p[3]";
     }
     
     public static String detailsXpath(int row){
         return "//a[text()='View in new window']/../../../../..//td[@class=\"text-clip ng-binding\"]/../../../../../../../div[@class=\"row-fluid\"]/div//tr["+row+"]/td[2]";
     }
     
     public static String optionsOnActionsOnDetailsXpath(int num){
         return "//a[text()='View in new window']/../../../../..//td[@class=\"actions\"]//ul/li["+num+"]/a";
     }
     
     public static String serviceXpath(){
         return "//a[text()='View in new window']/../../../../..//td[@class=\"text-clip ng-binding\"]/../../../../../../../div[@class=\"row-fluid\"]/div//tr[12]/td[2]/span/span[1]";
     }
     
     public static String lockedAssetXpath(){
         return "//i[@class='ng-scope icon-lock icon-grey']";
     }
     
     public static String requestCurrentPositionHeadingXpath(){
         return "//h5/span[text()='Request current position']";
     } 
     
     public static String defaultTransportMethodXpath(){
         return "//select[@name='transportMethodId']";
     }
     
     public static String submitButtonXpath(){
         return "//select[@name='transportMethodId']/../../../../../../../div[@class='modal-footer']/button";
     }
     
     public static String positionRequestedXpath(){
         return "//div[@class=\"notification notification-placement notification-success\"]/span[text()='Position requested']";
     }
     
     public static String sendJobPageXpath(){
         return "//div[@class='page-header']/h5";
     }
     
     public static String toFieldXpath(){
         return "//div[@class='row-fluid mb-10']/input[1]";
     }
     
     public static String cancelButtonXpath(){
         return "//div[@class='selection-btn-right pull-right']/button[@text='Cancel']";
     }
     
     public static String yesButtonXpath(){
         return "//div[@class='pull-right ng-scope']/button[@type='submit']";
     }
     
     public static String sendMessageHeadingXpath(){
         return "//h5[text()='Create new message']";
     }
     
     public static String messageToFieldXpath(){
         return "//div[@class='text-tags']/div/div";
     }
     
     public static String diagnosticAssetDescriptionXpath(){
         return "//h4[@class='no-margins row-fluid mt-3 text-overflow']/span";
     }
     
     public static String diagnosticsButtonsXpath(int num){
         return "//div[@class=\"pull-left\"]/a["+num+"]";
     }
     
     public static String diagnosticExportButtonXpath(){
         return "//a[@fleet-tooltip='Export']";
     }
     
     public static String statusInformationXpath(){
         return "//div[@ng-show='hasStatusInfo && !isG52']";
     }
     
     public static String commsLogXpath(){
         return "//div[@ng-click='showCommsLog()']/a";
     }
     
     public static String refreshingXpath(){
         return "//span[@class='muted ng-binding']";
     }
     
     public static String generalXpath(){
         return "//div[@ng-hide=\"(unitDetails || !hasStatusInfo || isG52)\"]/div/div/a/span[1]";
     }
     
     public static String peripheralOnDiagnosticsXpath(){
         return "//div[@ng-hide=\"showMix2310iDiagnosticInfo || isG52\"]/div/div/a/span[text()='Peripheral status information']";
     }
     
     public static String gpsXpath(){
         return "//div[@header-title='GPS status information']/div/a/span[1]";
     }
     
     public static String latestXpath(){
         return "//div[@header-title='Latest position information']/div/a/span[1]";
     }
     
     public static String option2Xpath(){
         return "//span[@ng-bind-html-unsafe=\"'Increase daily SMS limit by' | translate\"]";
     }
     
     public static String option1Xpath(){
         return "//span[@ng-bind-html-unsafe=\"'Set immobiliser/relay drive' | translate\"]";
     }
     
     public static String immobilizerOptionXpath(){
         return "//span[@ng-bind-html-unsafe=\"'Set immobiliser/relay drive' | translate\"]/../input";
     }
     
     public static String chooseLabelXpath(){
         return "//label[@ng-bind-html-unsafe=\"'Choose an output line and a new state' | translate\"]";
     }
     
     public static String immobilizerDropdownXpath(){
         return "//label[@ng-bind-html-unsafe=\"'Choose an output line and a new state' | translate\"]/../select[1]";
     }
     
     public static String sendDropdownXpath(){
         return "//label[@ng-bind-html-unsafe=\"'Choose an output line and a new state' | translate\"]/../select[2]";
     }
     
     public static String noteXpath(){
         return "//label[@ng-bind-html-unsafe=\"'Choose an output line and a new state' | translate\"]/../div[@ng-show='commandsToMobileDeviceTemplate.form.outputLineId == 0']";
     }
     
     public static String viewInNewWindowAssetDescriptionXpath(){
//         return "//div[@class='follow-asset-header']/h5";
          return "//h5[text()='DVT-Live - DVT Live Tracking Unit']";
     }
     
     public static String viewInNewWindowDriverXpath(){
         return "//div[@class='follow-asset-header']/span";
     }
     
     public static String startActiveTrackingXpath(){
         return "//span[@ng-show='canDoActiveTracking && !(activeTrackingOn && trackingMethod == 0)']/a";
     }
     
     public static String latitudeXpath(){
         return "//span[@class='labelFirst']";
     }
     
     public static String activeStartedXpath(){
         return "//span[@id='pop-alert-message']";
     }
     
     public static String infoDisplayedXpath(){
         return "//div[@class='live-tracking-status-block notification-info ng-binding']";
     }
     
     public static String stopActiveTrackingXpath(){
         return "//a[@ng-click='stopActiveTracking(0)']";
     }
}
