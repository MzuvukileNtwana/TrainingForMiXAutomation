/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects;

/**
 *
 * @author kmanakaza
 */
public class Diagnostics_RequestCurrentPositionObjects 
{
    public static String ManageMenuRelativeXpath() 
    {
         return "//a[text()='MANAGE ']";
    }
    public static String PacketCommunicationsXpath() 
    {
         return "//strong[text()='Packet communications']";
    }
    public static String MonitorMenuRelativeXpath() 
    {
        return "//a[text()='MONITOR ']";
    }
    public static String AssetSubMenuRelativeXpath() 
    {
        return "//a[text()='Assets']";
    }
    public static String AssetConfigurationGroupsRelatieXpath() 
    {
         return "//a[text()='Configuration groups']";
    }
    public static String ItemConfigGroupsXpath()
    {
         return "//a[text()='Configuration groups']";
    }
    public static String AssetManageconfigurationRelatieXpath() 
    {
        return "//a[text ()='Configuration groups:']";
    }
    public static String AssetDescriptionToValidateRelatieXpath()     
    {        
        return "//div/span[text()='Asset description']";
    }
    public static String FiltertextfieldXpath() 
    {
        return "//div[@class='text-filter empty']//input";
    }
    public static String AssetsSearchButtonXpath()
    {
        return "//div[@class='text-filter']//a[1]";
    }
    public static String AssetActionBtnRelatieXpath()     
    {        
        return "//div[@row='0']//a[@class='row-action']";
    }
    public static String ActionButtonByRowXpath(String row) 
    {
        return "//div[@row='"+ row +"']//a[@class='row-action']";
    } 
    public static String ActionEditButtonsByRowXpath(String row) 
    {
        return "//ul[contains(@style,'block')]//a[@row-index= "+ row +" ][@event='Edit']";
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
    public static String AddAssetButtonRelativeXpath() 
    {
        return "//a[@fleet-tooltip='Add asset']";
    }
    public static String ColumnChooserButtonRelativeXpath() 
    {
        return "//a[@class='btn btn-small column-chooser']";
    }
   
    public static String DownloadImportButtonRelativeXpath() 
    {
        return "//a[@fleet-tooltip='Download import template']";
    }
    public static String RegistrationNumberRelativeXpath() 
    {
        return "//ul[@class='dropdown-menu grid-column-chooser'] [contains(@style,'block')]/li/a[@column-field='registrationNumber']";
    }
    public static String ActionDiagnosticButtonsByRowXpath(String row) 
    {
        return "//a[@row-index='"+ row +"'][@event='Diagnostics']";
    }
    public static String AssetDiagnosticsRequestCurrentStatusRelatieXpath() 
    {
        return "//a[text()='Request current status']";
    }
    public static String AssetDiagnosticsQuickDownloadRelatieXpath() 
    {
        return "//a[text()='Quick download']";
    }
    public static String AssetDiagnosticsLatestPositionInformationRelatieXpath() 
    {
        return "//div//span[text()='Latest position information']";
    }
    
    //last position information IE xpath
    public static String AssetDiagnosticsLatestPositionInformationIEXpath() 
    {
        return "//div[@class='accordion-heading accordion-heading-light-blue']//a//span[text()='Latest position information']";
    }
    public static String UnitDetailHeadingXpath()
    {
        return "//a/span[text()='Unit details']";
    }
    public static String FirmwareHistoryHeadingXpath()
    {
        return "//a/span[text()='Firmware history']";
    }
    public static String PeripheralStatusInformationHeadingXpath()
    {
        return "//a/span[text()='Peripheral status information']";
    }
    public static String GPS_StatusInformationHeadingXpath()
    {
        return "//a/span[text()='GPS status information']";
    }
    public static String LatestPositionInformationHeadingXpath()
    {
        return "//a/span[text()='Latest position information']";
    }
    public static String ESN_td_Xpath()
    {
        return "//td/strong[text()='ESN']";
    }
    public static String MobileID_td_Xpath()
    {
        return "//td/strong[text()='Mobile ID']";
    }
    public static String FirstIDReportTime_td_Xpath()
    {
        return "//td/strong[text()='First ID report time']";
    }
    public static String LastID_ReportTime_td_Xpath()
    {
        return "//td/strong[text()='Last ID report time']";
    }
    public static String LastConfigSyncTime_td_Xpath()
    {
        return "//td/strong[text()='Last config sync time']";
    }
    public static String LastConfigUpdateTime_td_Xpath()
    {
        return "//td/strong[text()='Last config update time']";
    }
    public static String IP_Address_td_Xpath()
    {
        return "//td/strong[text()='IP address']";
    }
    public static String IMSI_td_Xpath()
    {
        return "//td/strong[text()='IMSI']";
    }
    public static String IMEI_td_Xpath()
    {
        return "//td/strong[text()='IMEI']";
    }
    public static String ICCID_td_Xpath()
    {
        return "//td/strong[text()='ICCID']";
    }
    public static String ScriptVersion_td_Xpath()
    {
        return "//td/strong[text()='Script version']";
    }
    public static String ConfigVersion_td_Xpath()
    {
        return "//td/strong[text()='Config version']";
    }
    public static String ConfigStatus_td_Xpath()
    {
        return "//td/strong[text()='Config status']";
    }
    public static String ConfigurationGroup_td_Xpath()
    {
        return "//td/strong[text()='Configuration group']";
    }
    public static String ModemSelections_td_Xpath()
    {
        return "//td/strong[text()='Modem selections']";
    }
    public static String CustomerName_td_Xpath()
    {
        return "//td/strong[text()='Customer name']";
    }
    public static String Group_td_Xpath()
    {
        return "//td/strong[text()='Group']";
    }
    public static String FirmwareVersion_td_Xpath()
    {
        return "//td/strong[text()='Firmware version']";
    }
    public static String FirmwareStatus_td_Xpath()
    {
        return "//td/strong[text()='Firmware status']";
    }
    public static String Request_th_FirmwareHistoryXpath()
    {
        return "//th/span[text()='Requested']";
    }
    public static String Updated_th_FirmwareHistoryXpath()
    {
        return "//th/span[text()='Updated']";
    }
    public static String OldVersion_th_FirmwareHistoryXpath()
    {
        return "//th[text()='Old Version']";
    }
    public static String NewVersion_th_FirmwareHistoryXpath()
    {
        return "//th[text()='New Version']";
    }
    public static String Status_th_FirmwareHistoryXpath()
    {
        return "//th[text()='Status']";
    }
    public static String NoDataAvailablePeripheralStatusXpath()
    {
        return "//div[@class='accordion-inner no-padding']/div/p[@ng-hide='inputStatusInfo'][text()='No data available.']";
    }
    public static String NoDataAvailableGPS_StatusXpath()
    {
        return "//div[@class='accordion-inner no-padding']/div/p[@ng-hide='gpsStatusInfo'][text()='No data available.']";
    }
    public static String DateAndTimeOfLastPositionXpath()
    {
        return "//td/strong[text()='Date and time of last position']/../../td[@class='ng-binding']";
    }
    public static String LongitudeOfLastPosiotnXpath()
    {
        return "//table[@ng-show='latestAVLInfo']//td/strong[text()='Longitude']/../../td[@class='ng-binding']";
    }
    public static String LatitudeOfLastPosiotnXpath()
    {
        return "//table[@ng-show='latestAVLInfo']//td/strong[text()='Latitude']/../../td[@class='ng-binding']";
    }
    public static String GpsVelocityOfLastPositionXpath()
    {
        return "//table[@ng-show='latestAVLInfo']//td/strong[text()='GPS Velocity']/../../td[@class='ng-binding']";
    }
    
    //updated xpath for gps velocity last position
    public static String gpsVelocityLastPositionXpath()
    {
        return "//table[@ng-show='latestAVLInfo']//tbody//tr//td//strong[contains(text(),'GPS velocity')]//..//..//td[@class='ng-binding']";
    }
    public static String AltitudeOfLastPosiotnXpath()
    {
        return "//table[@ng-show='latestAVLInfo']//td/strong[text()='Altitude']/../../td[@class='ng-binding']";
    }
    public static String HeadingOfLastPosiotnXpath()
    {
        return "//table[@ng-show='latestAVLInfo']//td/strong[text()='Heading']/../../td[@class='ng-binding']";
    }
    public static String NumberOfSatelliteOfLastPositionXpath()
    {
        return "//table[@ng-show='latestAVLInfo']//td/strong[text()='Number of Satellites']/../../td[@class='ng-binding']";
    }
    
    //updated xpath for number of satelite last position
    public static String numberOfSateliteLastPositionXpath()
    {
        return "//table[@ng-show='latestAVLInfo']//tbody//tr[@ng-hide='isG52']//td//strong[contains(text(),'Number of satellites')]//..//..//td[@class='ng-binding']";
    }
    public static String HDOPOfLastPosiotnXpath()
    {
        return "//table[@ng-show='latestAVLInfo']//td/strong[text()='HDOP']/../../td[@class='ng-binding']";
    }
    public static String AgeOfDataOfLastPosiotnXpath()
    {
        return "//table[@ng-show='latestAVLInfo']//td/strong[text()='Age of data']/../../td[@class='ng-binding']";
    }
    public static String DistanceSinceLastRecordOfLastPositionXpath()
    {
        return "//table[@ng-show='latestAVLInfo']//td/strong[text()='Distance Since last record']/../../td[@class='ng-binding']";
    }
    
    //updated  distance since last record last position xpath
    public static String distanceSinceLastRecordLastPositionXpath()
    {
        return "//table[@ng-show='latestAVLInfo']//tbody//tr[@ng-hide='isG52']//td//strong[contains(text(),'Distance since last record')]//..//..//td[@class='ng-binding']";
    }
     public static String statusInfoXpath()
    {
        return "//div[text()='Status information received from last successfully completed schedule on ']/strong";
    }
      public static String DiagnosticsXpath()
    {
        return "//span[text()='Diagnostics']";
    }
        public static String btnActionXpath()
    {
        return "//div[@ng-show='rowActions']/ul/li[2]/div/div/a[@fleet-tooltip='Actions']";
    }
       public static String inputFilterXpath()
    {
        return "//span[text()='Show selected assets']/../../../../../../../div[@class='pa-10 search-box btn-inverse']/div/input";
    }
    public static String ShowSelectedAssetsXpath()
    {
        return "//span[text()='Show selected assets']";
    }
    public static String LiveTrackingPageXpath()
    {
        return "//span[text()='Live tracking']";
    } 
    public static String LiveTrackingTabXpath()
    {
        return "//a[text()='Live tracking']";
    } 
    public static String SendAVLinTripFrequencyXpath()
    {
        return "//div//span[text()='- Send AVL In trip frequency']/../span";
    } 
    public static String popAlertMessageXpath()
    {
        return "//span[@id='pop-alert-message']";
    } 
     public static String strRetrievedHoursXpath()
    {
        return "//div//span[text()='- Send AVL In trip frequency']/../../td[2]/div/span/span/input[1]";
    } 
      public static String strRetrievedMinutesXpath()
    {
        return "//div//span[text()='- Send AVL In trip frequency']/../../td[2]/div/span/span/input[2]";
    } 
       public static String strRetrievedSecondsXpath()
    {
        return "//div//span[text()='- Send AVL In trip frequency']/../../td[2]/div/span/span/input[3]";
    }
       
    //updated xpath for request current status button
    public static String requestCurrentStatusButtonXpath()
    {
        return "//div[@class='pull-left']//a[@ng-show='showRequestCurrentStatus']";
    }
    
    //pop-up message
    public static String popUpAlertMessageXpath()
    {
        return "//div[@style='display: block;']//span[@id='pop-alert-message']";
    }
    
    //refresh button
    public static String refreshButtonXpath()
    {
        return "//div//span[@class='muted ng-binding']//..//..//a//span[contains(text(),'Refresh now')]";
    }
    
    //refresh spinner
    public static String refreshSpinnerXpath()
    {
        return "//div[@class='loading-overlay ng-scope']";
    }
    
    //all filter radio button xpath
    public static String allFilterRadiobuttonXpath()
    {
        return "//div//a//span[contains(text(),'All')]//..//..//..//..//input[@type='radio'][@ng-show='singleSelect']";
    }
    
}
