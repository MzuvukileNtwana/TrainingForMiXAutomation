/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects;

/**
 *
 * @author sscholtz
 */
public class DiagnosticsExportPageObject {
 
   public static String MixTeleImagesFolder() 
    {
       return "\\SikuliImages\\MixTelematics\\";
    }
    
    public static String AssetDescriptionWait()
    {
        return "//th[@column-field='assetDescription']";
    }
    
    public static String Diagnostics()
    {
        return "//ul[@class='dropdown-menu pull-right'][contains(@style, 'display: block;')]/li/a/span[text()='Diagnostics']";
    }
    
    public static String SentenceValidation()
    {
        return "//div[text()='Status information received from last successfully completed schedule on ']";
    }
    
    public static String ExportClick()
    {
        return "//a[@ng-show=' (hasStatusInfo || unitDetails)']";
    }
    
    public static String IESaveButton()
    {
        return "SaveDiagnosticsInternetExplorer.png";
    }
    
      public static String FireFoxSaveSelect()
    {
        return "SaveDiagnosticsExportFirefox.png";
    }
      
        public static String FireFoxSaveButton()
    {
        return "OKButtonDiagnosticsExport.png";
    }
        
        public static String GeneralStatusInformationCollapse()
        {
            return "//div[@style='display: none;']/div[@header-title='Firmware history']/../../div[@ng-hide='(unitDetails || !hasStatusInfo || isG52)']/div/div/a";
        }

        public static String PeripheralStatusInfoCollapse()
        {
            return "//span[text()='Peripheral status information']";
        }
        
        public static String PeripheralStatusButton()
        {
            return "//span[text()='Peripheral status information']/..";
        }
        
        public static String LatestPositionCollapse()
        {
            return "//span[text()='Latest position information']";
        }
        
        public static String LatestPositionButton()
        {
            return "//span[text()='Latest position information']/..";
        }
         
        public static String GeneralInformationTable()
        {
            return "//table[@ng-show='generalStatusInfo']/tbody/tr";
        }
        
        public static String PeripheralStatusInformationTable()
        {
             return "//table[@ng-show='inputStatusInfo']/tbody/tr";
        }
        
        public static String LatestPositionInformationTable()
        {
             return "//table[@ng-show='latestAVLInfo']/tbody/tr";
        }
        
        public static String GeneralText()
        {
            return "//div[@ng-hide=\"(unitDetails || !hasStatusInfo || isG52)\"]/div/div/a/span[text()='General status information']";
        }
        
        public static String DNSHeading()
        {
            return "//span[text()='DNS Test unit (DNS)']";
        }
        
        public static String StatusInfoTime()
        {
            return "//div[@ng-show='hasStatusInfo && !isG52']/strong";
        }
        
        public static String Scroll()
        {
            return "//table[@ng-show='generalStatusInfo']/tbody/tr/td/strong[text()='Mobile device driver version']";
        }
        
        public static String ExitPopUp()
        {
            return "ClearButtonIE.png";
        }
        
        public static String Spinner()
        {
            return "//div[@class='well well-white well-small full-height']/div[@style='display: none;']";
        }
        
        public static String LastRecordScroller()
        {
            return "//table[@ng-show='latestAVLInfo']/tbody/tr/td/strong[text()='Distance Since last record']";
        }
        
        
        public static String DriveStatusScroller()
        {
            return "//table[@ng-show='inputStatusInfo']/tbody/tr/td/strong[text()='Unit Relay Drive Status']";
        }
        
        
        public static String RefreshWait()
        {
            return "//div/span[@ng-hide='contentLoadingStack.length']";
        }
        
        
}
