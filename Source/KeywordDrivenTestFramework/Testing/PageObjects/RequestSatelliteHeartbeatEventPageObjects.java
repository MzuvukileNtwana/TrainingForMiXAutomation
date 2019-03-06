/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects;

import KeywordDrivenTestFramework.Core.BaseClass;

/**
 *
 * @author smbiko
 */
public class RequestSatelliteHeartbeatEventPageObjects extends BaseClass
{
    
    public static String MonitorMenuRelativeXpath() 
    {
        return "//a[text()='MONITOR ']/..";
    }
    public static String LiveTrackingXpath() 
    {
        return "//a[text()='Live tracking']";
    }
    
    public static String CommandsMobileDeviceXpath() 
    {
        return "//ul[@class='dropdown-menu pull-right']/li[10]/a/span[text()='Commands to mobile device']";
    }
    public static String CommandsMobileDeviceLabelXpath() 
    {
        return "//span[text()='Request satellite heartbeat event']/../../../../..//span[text()='Commands to mobile device']/..";
    }
    public static String IncreaseSatelliteMessageDailyLimitEnabledXpath() 
    {
        return "//span[text()='Increase satellite message daily limit by']/../input[@value='1']/..";
    }
    public static String SendButtonDisabledXpath() 
    {
        return "//div[@class='modal hide fade modal-mini in']/div[@class='modal-footer']/button[text()='Send']";
    }

    
    public static String RequestHeartbeatRadioButtonXpath() 
    {
        return "//span[text()='Request satellite heartbeat event']/../input[@value='5']/..";
    }
 
    public static String CancelButtonXpath() 
    {
        return "//div[@class='modal hide fade modal-mini in']/div[@class='modal-footer']/button[text()='Cancel']";
    }
    
    public static String ValidateFirstRadioButtonSelectedXpath() 
    {
        return "//span[text()='Increase daily SMS limit by']/../input[@value='0']";
    }
    
    public static String ValidateSaveButtonXpath() 
    {
        return " //button[text()='Send'  and @disabled='disabled']";
    }
     
      public static String SaveButtonXpath() 
    {
        return "//div[@class='modal hide fade modal-mini in']/div[@class='modal-footer']/button[text()='Send']";
    }
     
    
      public static String AssetRemoveButtonXpath() 
    {
        return "//button[text()='Remove']";
    }
     
    public static String StreamsSubMenuRelativeXpath() 
    {
        return "//a[text()='Streams']";
    }
    
    public static String AddStreamButtonRelativeXpath() 
    {
        return "//a[@fleet-tooltip='Add stream']";
    }
    
    public static String StreamNameInputRelativeXpath() 
    {
        return "//input[@name='streamName']";
    }
    public static String spinnerXpath()
    {
        return "//div[@fleet-loader='content']";
    }
    
    public static String activeEventsXpath()
    {
        return "//div[@ng-show='form.eventsEnabled']/label/span/..";
    }
    
    public static String activeEventsInstructionXpath()
    {
        return "//div[@ng-show='form.eventsIncluded']/p";
    }
    public static String activeEventsFilterXpath()
    {
        return "//div[@class='span12 input-reset-wrapper']/input";
    }
   public static String StreamsImgRelativeXpath() 
    {
        return "//img[@src='img/feed-draghandle.png']";
    }
    public static String StreamsActionButtonRelativeXpath() 
    {
        return "//i[@fleet-tooltip='Actions']";
    }
    public static String StreamsRemoveButtonRelativeXpath() 
    {
        return "//span[text()='Remove']/..";
    }
     public static String btnActionXpath()
    {
        return "//div[@ng-show='rowActions']/ul/li[2]/div/div/a[@fleet-tooltip='Actions']/../../..";
    }
        public static String inputFilterXpath()
    {
        return "//div[@class=\"pa-10 search-box btn-inverse\"]//div//input[@placeholder=\"Filter\"]";
    }    
    public static String DiagnosticHeartbeatCheckedXpath() 
    {
        return "//div/table/tbody/tr/td/input[@type='checkbox']";
    }    
    public static String assetsNextButtonXpath()
    {
        return "//button[text()='Next']";
    }
    
    //choosing Dynamix TestUnit2015
        public static String DynaMixTestUnitXpath() 
    {
//        return "//div//span[text()='DynaMiX Test Units 2015']/..";  
        return "//span[text()='DTU2015 (Daylight savings)']/../../../span[@ui-if='!item.expanded && hasSupportedChildren(item)']";
    }
    public static String DynaMixTestOrgXpath() 
    {
        return "//div[@class='organisation-selector']/..//div[@class='organisation-selector']//b[@class='caret']";  
    }
    
 
    public static String ButtonSelectXpath() 
    {
        return "//a[text()='Select']";
    }
    public static String DynamixTestUnitsExpandIconRelativeXpath() 
    {
//        return "//span[text()='Stream assets']/../../form/div/ul/li/span";
//            return "//span[text()='DynaMiX Test Units 2015 (Daylight savings)']/../../..//span[@ng-click='item.expanded = true']";
        return "//span[text()='DTU2015 (Daylight savings)']/../../..//span[@ng-click='item.expanded = true']";
    }
    public static String ViroExpandIconXpath() 
    {
        return "//div[@class='tree-sub-items ng-scope']/ul/li//span[text()='Testers']/../..//span/../..//span/../..//span/../../../span";  
    }
//    public static String DVTLiveTrackingCheckboxXpath() 
//    {
//        return "//span[text()='DVT Live Tracking Unit']/../input[@ng-model='item.checked']/../..";  
//    }
    public static String BenchUnitsExpandIconXpath() 
    {
        return "//div[@class='tree-sub-items ng-scope']/ul/li//span[text()='Bench units']/../..//span/../..//span/../..//span/../../../span";  
    }
    public static String WatchdogIridiumDevicesCheckboxXpath() 
    {
        return "//span[text()='Watchdog (Iridium)']/../input[@ng-model='item.checked']/../div";  
    }
    
    public static String DyNamixSaveButtonXpath() 
    {
        return "//button[text()='Save']";  
    }
    public static String DetailsButtonXpath(String streamName) 
    {
        return "//span[text()='"+streamName+"']/../../../../div[@class='row-fluid feed-section-content']/table/tbody/tr[1]/td/div/div/div/div[@class='feed-content']/div/div[@class='feed-highlite']/div[@class='row-fluid']/a[text()='Details']";
//        return "//span[text()='Stream20151211075544']/../../../../div[@class='row-fluid feed-section-content']/table/tbody/tr[1]/td/div/div/div/div[@class='feed-content']/div/div[@class='feed-highlite']/div[@class='row-fluid']/a[text()='Details']";  
    }

    public static String ActionStatusXpath() 
    {
        return "//td[text()='Not actioned']";  
    }
    public static String DriverXpath() 
    {
        return "//td[text()='Unknown']/..";  
    }
    
    
    public static String StreamDetailsXpath(String streamName) 
    {
        return "//span[text()='"+streamName+"']/../../../..//strong[text()='GPS Coordinates']/../../../../../..//div[@class=\"row-fluid\"]//table[@class=\"table table-condensed\"]//strong[text()='Action Status']/../../..//tr[not(@style='display: none;')]";  
    }
    
    public static String BackToStreamButtonXpath(String streamName) 
    {
        return "//span[text()='"+streamName+"']/../../../..//span[text()='Back to stream']/..";  
    }
    public static String ActionStreamButtonXpath(String streamName) 
    {
        return "//span[text()='"+streamName+"']/../../../..//i[@fleet-tooltip='Actions']";  
    }
    public static String SendMessageXpath(String stream)
    {
        return "//span[text()='"+stream+"']/../../../..//table//i[@fleet-tooltip='Send message']";
    }
    public static String StreamActionButtonXpath(String streamName)
    {
        return "//span[text()='"+streamName+"']/../..//div//i[@fleet-tooltip='Actions']";
    }
    public static String StreamActionRemoveButtonXpath(String streamName)
    {
        return "//span[text()='"+streamName+"']/../..//div//ul//li//span[text()='Remove']";
    }
    public static String TimeXpath() 
    {
        return "//td[text()='2015-12-02 12:00 PM (CAT/SAST)']/..";  
    }

    public static String LocationXpath() 
    {
        return "//span[text()='Invalid location id']/../..";  
    }
    public static String GPSXpath() 
    {
        return "//span[text()='-33.9790001,18.8416119']/../..";  
    }
     public static String AltitudeXpath() 
    {
        return "//tr[@ng-show='item.altitude']//span[text()='-10000']/../..";  
    }
    
    public static String WatchdogIridiumRegistrationValidateXpath(String streamName) 
    {
        return "//span[text()='"+streamName+"']/../../../../div[@class='row-fluid feed-section-content']/table/tbody/tr[1]/td/div/div/div/div[@class='feed-content']/div/div[@class='row-fluid']//span[text()='Watchdog (Iridium)']/..";
    }
     
    public static String EventValidateXpath(String streamName) 
    {
        return "//span[text()='"+streamName+"']/../../../../div[@class='row-fluid feed-section-content']/table/tbody/tr[1]/td/div/div/div/div[@class='feed-content']/div/div[@class='row-fluid']//span[text()='Event']";  
    }

    public static String TimeElapsedValidateXpath(String streamName) 
    {
        return "//span[text()='"+streamName+"']/../../../../div[@class='row-fluid feed-section-content']/table/tbody/tr[1]/td/div/div/div/div[@class='feed-content']/div/div[@class='row-fluid']//span[@class='pull-right muted']/span";
    }
 
    public static String SatelliteValidateXpath(String streamName) 
    {
        return "//span[text()='"+streamName+"']/../../../../div[@class='row-fluid feed-section-content']/table/tbody/tr[1]/td/div/div/div/div[@class='feed-content']/div/div[@class='row-fluid']//i[@ng-show=\"item.isSatellite\"]";  
    }

    public static String EventDiagnosticLabelValidateXpath(String streamName) 
    {
        return "//span[text()='"+streamName+"']/../../../../div[@class='row-fluid feed-section-content']/table/tbody/tr[1]/td/div/div/div/div[@class='feed-content']/div/div[@class='feed-highlite']/div[@class='row-fluid']/..//span/..";  
    }

    public static String DetailsValidateXpath(String streamName) 
    {
        return "//span[text()='"+streamName+"']/../../../../div[@class='row-fluid feed-section-content']/table/tbody/tr[1]/td/div/div/div/div[@class='feed-content']/div/div[@class='feed-highlite']/div[@class='row-fluid']";  
    }
        public static String ActionValidateXpath(String streamName) 
    {
        return "//span[text()='"+streamName+"']/../../../../div[@class='row-fluid feed-section-content']/table/tbody/tr[1]/td/div/div/div/div[@class='feed-content']/div/div[@class='feed-highlite']/div[@class='row-fluid']//i[@fleet-tooltip=\"Action\"]";  
    }

    public static String ViewCurrentPositionValidateXpath(String streamName) 
    {
        return "//span[text()='"+streamName+"']/../../../../div[@class='row-fluid feed-section-content']/table/tbody/tr[1]/td/div/div/div/div[@class='feed-content']/div/div[@class='feed-highlite']/div[@class='row-fluid']//i[@fleet-tooltip=\"View asset's current position\"]";  
    }
 
    public static String SendMessageValidateXpath(String streamName) 
    {
        return "//span[text()='"+streamName+"']/../../../../div[@class='row-fluid feed-section-content']/table/tbody/tr[1]/td/div/div/div/div[@class='feed-content']/div/div[@class='feed-highlite']/div[@class='row-fluid']//i[@fleet-tooltip=\"Send message\"]";  
    }
     
    public static String selectedOrganisationXpath()
    {
        return "//a[contains(@class, 'selected')]/span[contains(@ui-if, 'item.name')='DynaMiX Test Units 2015']";
    }
    public static String waitforSpinner()
    {
        return "//../div/div[@text-filter='mainFilterQuery']";
    }
      
    public static String waitforSpinner1()
    {
        return "//div[@class='loading-overlay ng-scope'][@style='display: block;']";
    }
}
