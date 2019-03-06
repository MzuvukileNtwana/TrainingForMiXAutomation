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
public class DiagnosticsFunctionalityForAssetsWithFMunitsPageObject {
    
     public static String assetDescriptionTextXpath()
   {
       return "//span[text()='DVT Live Tracking Unit (DVT-Live)']";
   }
   public static String requestCurrentStatusXpath()
   {
       return "//a[text()='Request current status']";
   }
   public static String quickDownloadXpath()
   {
       return "//a[text()='Quick download']";
   }
   public static String fullDownloadbuttonsXpath()
   {
       return "//a[text()='Full download']";
   }
   public static String statusInfoXpath()
   {
       return "//div[@ng-show='hasStatusInfo && !isG52']";
   }
     public static String commsLogXpath()
   {
       return "//div[text()='Comms log: ']/a";
   }
   public static String automaticRefreshXpath()
   {
       return "//div[@class='row-fluid mb-10']/div[4]/span";
   }
   public static String manualRefreshXpath()
   {
       return "//div[@class='row-fluid mb-10']/div[4]/a/span";
   }
   public static String generalstatusInfoXpath()
   {
       return "//span[text()='DVT Live Tracking Unit (DVT-Live)']/../../.././div/div[4]/div/div/div[3]/div/div/a/span[1]";
   }
   public static String peripheralStatusinfoXpath()
   {
       return "//span[text()='Peripheral status information']";
   }
    public static String GPSstatusInfoXpath()
   {
       return "//span[text()='GPS status information']";
   }
   public static String latestPositionInfoXpath()
   {
       return "//span[text()='Latest position information']";
   }
   public static String exportButtonXpath()
   {
       return "//a[@class='btn btn-small pull-right']";
   }
    public static String clickGeneralStatusInformationXpath()
   {
       return "//span[text()='DVT Live Tracking Unit (DVT-Live)']/../../div[@class='row-fluid']/div/div/div[3]/div/div/a/span[text()='General status information']";
   }
   public static String NodataAvailableGeneralXpath()
   {
       return "//span[text()='DVT Live Tracking Unit (DVT-Live)']/../../div[@class='row-fluid']/div/div/div[3]/div/div[2]/div/div//p[@class='ml-5 mt-10 muted'][text()='No data available.']";
   }
   public static String RawUnitDateAndTimeXpath()
   {
       return "//div[@class='accordion']/div[3]/div/div[2]/div/div/table/tbody/tr/td/strong[text()='Raw Unit Date & Time (unadjusted)']/../../td[2]";
   }
   public static String OrganisationDateAndTimeXpath()
   {
       return "//div[@class='accordion']/div[3]/div/div[2]/div/div/table/tbody/tr/td/strong[text()='Organisation Date & Time (adjusted)']/../../td[2]";
   }
   public static String VehicleModeXpath()
   {
       return "//div[@class='accordion']/div[3]/div/div[2]/div/div/table/tbody/tr/td/strong[text()='Vehicle Mode']/../../td[2]";
   }
   public static String DriverXpath()
   {
       return "//div[@class='accordion']/div[3]/div/div[2]/div/div/table/tbody/tr/td/strong[text()='Driver']/../../td[2]";
   }
   public static String SpeedXpath()
   {
       return "//div[@class='accordion']/div[3]/div/div[2]/div/div/table/tbody/tr/td/strong[text()='Speed']/../../td[2]";
   }
   public static String RPMXpath()
   {
       return "//div[@class='accordion']/div[3]/div/div[2]/div/div/table/tbody/tr/td/strong[text()='RPM']/../../td[2]";
   }
   public static String RPMCalibrationXpath()
   {
       return "//div[@class='accordion']/div[3]/div/div[2]/div/div/table/tbody/tr/td/strong[text()='RPM Calibration']/../../td[2]";
   }
   public static String RPMCalibrationDateXpath()
   {
       return "//div[@class='accordion']/div[3]/div/div[2]/div/div/table/tbody/tr/td/strong[text()='RPM Calibration date']/../../td[2]";
   } 
    public static String OdometerXpath()
   {
       return "//div[@class='accordion']/div[3]/div/div[2]/div/div/table/tbody/tr/td/strong[text()='Odometer']/../../td[2]";
   }
   public static String CurrentSubtripDistanceXpath()
   {
       return "//div[@class='accordion']/div[3]/div/div[2]/div/div/table/tbody/tr/td/strong[text()='Current Subtrip Distance']/../../td[2]";
   }
   public static String GSMQualityStatusXpath()
   {
       return "//div[@class='accordion']/div[3]/div/div[2]/div/div/table/tbody/tr/td/strong[text()='GSM Quality Status']/../../td[2]";
   }
   public static String GPRScontextXpath()
   {
       return "//div[@class='accordion']/div[3]/div/div[2]/div/div/table/tbody/tr/td/strong[text()='GPRS context (restricted)']/../../td[2]";
   }
   public static String MSISDNXpath()
   {
       return "//div[@class='accordion']/div[3]/div/div[2]/div/div/table/tbody/tr/td/strong[text()='MSISDN']/../../td[2]";
   }
     public static String IMSIXpath()
   {
       return "//div[@class='accordion']/div[3]/div/div[2]/div/div/table/tbody/tr/td/strong[text()='IMSI']/../../td[2]";
   }
   public static String IMEIpath()
   {
       return "//div[@class='accordion']/div[3]/div/div[2]/div/div/table/tbody/tr/td/strong[text()='IMEI']/../../td[2]";
   }
   public static String CANscriptDeviceNameXpath()
   {
       return "//div[@class='accordion']/div[3]/div/div[2]/div/div/table/tbody/tr/td/strong[text()='CAN script device name']/../../td[2]";
   }
   public static String MobileDeviceDriverVersionXpath()
   {
       return "//div[@class='accordion']/div[3]/div/div[2]/div/div/table/tbody/tr/td/strong[text()='Mobile device driver version']/../../td[2]";
   }
   
    public static String MobileDeviceDriverUpdateDateXpath()
   {
       return "//div[@class='accordion']/div[3]/div/div[2]/div/div/table/tbody/tr/td/strong[text()='Mobile device driver update date']/../../td[2]";
   }
   
   public static String CanPICdriverVersionXpath()
   {
       return "//div[@class='accordion']/div[3]/div/div[2]/div/div/table/tbody/tr/td/strong[text()='CAN PIC driver version']/../../td[2]";
   } 
   public static String CanPICDriverUpdateDateXpath()
   {
       return "//div[@class='accordion']/div[3]/div/div[2]/div/div/table/tbody/tr/td/strong[text()='CAN PIC driver update date']/../../td[2]";
   }
   
   public static String clickPeripheralStatusInformationXpath()
   {
       return "//span[text()='DVT Live Tracking Unit (DVT-Live)']/../../div[@class='row-fluid']/div/div/div[5]/div/div/a/span[text()='Peripheral status information']";
   }
     public static String PeripheralNoDataAvailableXpath()
   {
       return "//span[text()='DVT Live Tracking Unit (DVT-Live)']/../../div[@class='row-fluid']/div/div/div[5]/div/div[@class='accordion-body in collapse']/div/div//p[@class='ml-5 mt-10 muted'][text()='No data available.']";
   }
   public static String strI1path()
   {
       return "//div[@class='accordion-body in collapse']/div/div/table/tbody/tr[1]/td[2]/../../../../../../../../../div[@ng-hide='showMix2310iDiagnosticInfo || isG52']/div/div[2]/div/div/table/tbody/tr/td/strong[text()='I1 (']/../../td[2]";
   }
   public static String strI2Xpath()
   {
       return "//div[@class='accordion-body in collapse']/div/div/table/tbody/tr[1]/td[2]/../../../../../../../../../div[@ng-hide='showMix2310iDiagnosticInfo || isG52']/div/div[2]/div/div/table/tbody/tr/td/strong[text()='I2 (']/../../td[2]";
   }
   public static String strI3Xpath()
   {
       return "//div[@class='accordion-body in collapse']/div/div/table/tbody/tr[1]/td[2]/../../../../../../../../../div[@ng-hide='showMix2310iDiagnosticInfo || isG52']/div/div[2]/div/div/table/tbody/tr/td/strong[text()='I3 (']/../../td[2]";
   }
    public static String strI4Xpath()
   {
       return "//div[@class='accordion-body in collapse']/div/div/table/tbody/tr[1]/td[2]/../../../../../../../../../div[@ng-hide='showMix2310iDiagnosticInfo || isG52']/div/div[2]/div/div/table/tbody/tr/td/strong[text()='I4 (']/../../td[2]";
   } 
   public static String strI5Xpath()
   {
       return "//div[@class='accordion-body in collapse']/div/div/table/tbody/tr[1]/td[2]/../../../../../../../../../div[@ng-hide='showMix2310iDiagnosticInfo || isG52']/div/div[2]/div/div/table/tbody/tr/td/strong[text()='I5 (']/../../td[2]";
   } 
   public static String strI6Xpath()
   {
       return "//div[@class='accordion-body in collapse']/div/div/table/tbody/tr[1]/td[2]/../../../../../../../../../div[@ng-hide='showMix2310iDiagnosticInfo || isG52']/div/div[2]/div/div/table/tbody/tr/td/strong[text()='I6 (']/../../td[2]";
   }
   public static String strI7Xpath()
   {
       return "//div[@class='accordion-body in collapse']/div/div/table/tbody/tr[1]/td[2]/../../../../../../../../../div[@ng-hide='showMix2310iDiagnosticInfo || isG52']/div/div[2]/div/div/table/tbody/tr/td/strong[text()='I7 (']/../../td[2]";
   }
   public static String strI8Xpath()
   {
       return "//div[@class='accordion-body in collapse']/div/div/table/tbody/tr[1]/td[2]/../../../../../../../../../div[@ng-hide='showMix2310iDiagnosticInfo || isG52']/div/div[2]/div/div/table/tbody/tr/td/strong[text()='I8 (']/../../td[2]";
   }
    public static String strUnitRelayDriveStatusXpath()
   {
       return "//div[@class='accordion-body in collapse']/div/div/table/tbody/tr[1]/td[2]/../../../../../../../../../div[@ng-hide='showMix2310iDiagnosticInfo || isG52']/div/div[2]/div/div/table/tbody/tr[9]/td/strong[text()='Unit Relay Drive Status']/../../td[2]";
   }
     public static String peripheralDataXpath()
   {
       return "//span[text()='DVT Live Tracking Unit (DVT-Live)']/../../div[@class='row-fluid']/div/div/div[5]/div/div/a/span[text()='Peripheral status information']/../../../div[2]/div/div/p[not(@style)]";
   }
       public static String generalDataXpath()
   {
       return "//span[text()='DVT Live Tracking Unit (DVT-Live)']/../../div[@class='row-fluid']/div/div/div[3]/div/div/a/span[text()='General status information']/../../../../../div[5]/div/div[2]/div/div/p[not(@style)]";
   }
        public static String gpsDataXpath()
   {
       return "//span[text()='DVT Live Tracking Unit (DVT-Live)']/../../div[@class='row-fluid']/div/div/div[6]/div/div/a/span[text()='GPS status information']/../../../div[2]/div/div/p[not(@style)]";
   }
    public static String latestDataXpath()
   {
       return "//div//span[text()='Latest position information']/../../../div[2]/div/div/p[not(@style)]";
   }
    
     public static String checkAutomaticallScrollToNewXpath()
   {
       return "//span[text()='Automatically scroll to new items']/../input";
   }
      public static String retrievTextAutomaticallScrollXpath()
   {
       return "//span[text()='Automatically scroll to new items']";
   }
       public static String gpsStatusInformationXpath()
   {
       return "//span[text()='DVT Live Tracking Unit (DVT-Live)']/../../div[@class='row-fluid']/div/div/div[6]/div/div/a/span[text()='GPS status information']";
   }
       public static String fullDownLoadXpath()
   {
       return "//a[text()='Full download']";
   }
         public static String fullDownLoadPopUpXpath()
   {
       return "//span[@id='pop-alert-message']";
   }
    public static String quickdownLoadXpath()
   {
       return "//span[@id='pop-alert-message']";
   }
    public static String quickdownLoadPopUpXpath()
    {
       return "//span[@id='pop-alert-message']";
   }
    
           
}
