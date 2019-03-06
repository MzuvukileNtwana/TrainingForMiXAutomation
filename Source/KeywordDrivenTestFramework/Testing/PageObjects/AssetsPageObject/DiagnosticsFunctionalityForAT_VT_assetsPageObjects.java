/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects.AssetsPageObject;
import KeywordDrivenTestFramework.Core.BaseClass;

/**
 *
 * @author mdevilliers
 */
public class DiagnosticsFunctionalityForAT_VT_assetsPageObjects extends BaseClass{
 
    
    public static String MixTelematicsURL() {
        return currentEnvironment.PageUrl;
    }
    
    public static String DiagnosticActionLinkXpath(String diagnostic, String row)
    {//ul[@class='dropdown-menu pull-right grid-row-action-dropdown-menu'][contains(@style,'block')]/li/a[@event='Diagnostics'][@row-index='1']/span[text()='Diagnostics']
        return "//ul[@class='dropdown-menu grid-row-action-dropdown-menu'][contains(@style,'block')]/li/a[@event='Diagnostics'][@row-index='"+row+"']/span[text()='"+diagnostic+"']";
    }
    
    public static String spinnerXpath()
    {
        return "//div[@ng-show='$grid.isLoading'][@style='display: none;']";
    }
    
    public static String frameSpinnerXpath()
    {
        return "//div[@id=\"MainView\"]//div[contains(@class,'loading-overlay') and contains(@style,'none')]";
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
        return "//th[text()='Old version']";
    }
    
    public static String NewVersion_th_FirmwareHistoryXpath()
    {
        return "//th[text()='New version']";
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
        return "//table[@ng-show='latestAVLInfo']//td/strong[text()='GPS velocity']/../../td[@class='ng-binding']";
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
        return "//table[@ng-show='latestAVLInfo']//td/strong[text()='Number of satellites']/../../td[@class='ng-binding']";
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
        return "//table[@ng-show='latestAVLInfo']//td/strong[text()='Distance since last record']/../../td[@class='ng-binding']";
    }
   
}
