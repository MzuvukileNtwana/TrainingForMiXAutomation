/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects;
import KeywordDrivenTestFramework.Core.BaseClass;
/**
 *
 * @author kmanakaza
 */
public class TripTimelinePageObjects extends BaseClass
{
   //DMF-600 Page Elements
     public static String MixTelematicsHomeButtonRelativeXpath() 
    {
        return "//div[@class='brand']";
    }
      public static String ManageMenuRelativeXpath() 
    {
        return "//a[text()='MANAGE ']";
    }
     public static String PersonalSettingsRelativeXpath() 
    {
        return "//a[text()='Personal settings']";
    }
     public static String UserSettingsRelativeXpath() 
    {
        return "//h4[text()='USER SETTINGS']";
    }
      public static String RegionalSettingsRelativeXpath() 
    {
        return "//a[text()='Regional settings']";
    }
     public static String MeasurementUnitsAbsoluteXpath() 
    {
        return "//*[@id=\"MainView\"]/div/div[1]/div/div/div/div[2]/div/form/div/fieldset[3]/div/div[1]/div/select";
    }
      public static String SaveButtonRelativeXpath() 
    {
        return "//button[text()='Save']";
    }
     
     public static String MonitorMenuAbsoluteXpath() 
    {
        return "//a[text()='MONITOR ']";
    }
    public static String TripTimelineRelativeXpath() 
    {
        return "//a[text()='Trip timeline']";
    }
    
    public static String TripDateAbsoluteXpath() 
    {
        //Absolute Xpath
        //*[@id="sub-menu"]/div/div[3]/div/div[2]/a/span[1]/span[2]
        return "//*[@id=\"MainView\"]/div[1]/div[2]/div/div[1]/div[2]/div/div[3]/div[1]/input";
    }
    
   public static String MiXTelematicsBreadcrumbRelativeXpath() 
    {
       return "//a/..//span[text()='MiX Telematics']";
    }
    
    public static String DataCentreRelativeXpath(String _dataCentre) 
    {
        return "//a/span[text()='"+_dataCentre+"']/..";
    }
    public static String RegionalSalesOrganistaionRelativeXpath(String _regionalSales) 
    {
        return "//a/span[text()='"+_regionalSales+"']/..";
    }
    
     public static String CancelAssetButtonRelativeXpath() 
    {
        return "//a[text()='Cancel']";
    }
    
    public static String OrganistaionRelativeXpath(String _organistaion) 
    {
        return "//a/span[text()='"+_organistaion+"']/..";
    }
     public static String SiteRelativeXpath(String _site) 
    {
        return "//a/span[text()='"+_site+"']/..";
    }
    public static String AssetRelativeXpath(String _asset) 
    {
        return "//span[text()='"+_asset+"']";
    }
     public static String SelectAssetButtonRelativeXpath() 
    {
        return "//a[text()='Select']";
    }
     
      public static String TripCanvasAbsoluteXpath() 
    {
        //Absolute Xpath
       return "//*[@id=\"MainView\"]/div[1]/div[2]/div/div[1]/div[3]/div[1]/div/div[1]/div[3]/div/div[1]/div/div/canvas";
        //return "//a[text()='Select']";
    }
     
      public static String BottomPanelGrabberRelativeXpath() 
    {
       return "//a[@id='bottom-panel-grabber']";
    }
      
     public static String CurrentDateDivRelativeXpath() 
    {
       return "//div[@class='current-date']";
    }
       public static String FiveMinButtonRelativeXpath() 
    {
       return "//button[text()='5m']";
    }
      
        public static String TripDetailsRelativeXpath() 
    {
       return "//div/pre[3]";
    }
      public static String ExportTripDetailsRelativeXpath() 
    {
       return "//a[contains(@fleet-tooltip,'Export')]/.";
    }
       
     public static String LastTripButtonRelativeXpath() 
    {
       return "//div/a[contains(@fleet-tooltip,'Last trip')]";
    }
         
      public static String TachoGraphButtonRelativeXpath() 
    {
       return "//a[@fleet-tooltip='Tacho graph']";
    }
         
      public static String TachoGraphAxisRelativeXpath(String _axis) 
    {
        return  "//span[text()='"+_axis+"']/..";
    }   
     public static String TachoGraphCanvasRelativeXpath() 
    {
       return "//*[@id=\"MainView\"]/div[1]/div/div/div[1]/div[2]/div/div/div/div[1]/div[2]/div[1]/div/div/div/div/canvas";
    }   
      
     public static String DriversBreadcrumbRelativeXpath() 
    {
       return "//button[@fleet-tooltip='Drivers']/i";
    } 
    
    
     public static String DriverRelativeXpath(String _driver) 
    {
        return "//span[text()='"+_driver+"']";
    }
      
     public static String TimelineDateRelativeXpath() 
    {
       return "//div/span[contains(@class, 'text ng-binding')]";
    } 
     
    public static String ActionsButtonRelativeXpath() 
    {
       return "//a[@fleet-tooltip ='Actions']";
    } 
    public static String TimelineReportRelativeXpath() 
    {
       return "//span[text() ='Timeline report']/.";
    } 
    public static String TimelineReportTableRelativeXpath() 
    {
       return "//table[@class = 'summary-table ng-scope']";
    }
     public static String DownloadTachoButtonRelativeXpath() 
    {
       return "//span[text() ='Download tacho']/.";
    } 
    
    public static String TripSummaryButtonRelativeXpath() 
    {
       return "//a[@id='toolbarInfoIcon']";
    } 
    
    public static String TripSummaryDivRelativeXpath() 
    {
       return "//div[@class='row-fluid']//div[@class='popover-content']";
    } 
    
     public static String TripSummaryCloseButtonID() 
    {
        return "close";
       //return "//button[@id='close']";
    } 
    
     public static String AssetGridAllButtonRelativeXpath() 
    {
        return "//span[text()='All']";
    }
    
    public static String UtilisationRelativeXpath() 
    {
        return "//a[text()='Utilisation timeline']";
    }
    public static String TwentyFourHoursButtonRelativeXpath() 
    {
        //Absolute Xpath
       return "//button[text()='24h']";
    }
    public static String TwelveHoursButtonRelativeXpath() 
    {
        //Absolute Xpath
       return "//button[text()='12h']";
    }
    public static String SixHoursButtonRelativeXpath() 
    {
        //Absolute Xpath
       return "//button[text()='6h']";
    }
    public static String FourHourButtonRelativeXpath() 
    {
        //Absolute Xpath
       return "//button[text()='4h']";
    }
    public static String ThreeHoursButtonRelativeXpath() 
    {
        //Absolute Xpath
       return "//button[text()='3h']";
    }
    public static String OneHoursButtonRelativeXpath() 
    {
        //Absolute Xpath
       return "//button[text()='1h']";
    }
    public static String ThirtyMinutesButtonRelativeXpath() 
    {
        //Absolute Xpath
       return "//button[text()='30m']";
    }
    public static String FifteenMinutesButtonRelativeXpath() 
    {
        //Absolute Xpath
       return "//button[text()='15m']";
    }  
    public static String TenMinutesButtonRelativeXpath() 
    {
        //Absolute Xpath
       return "//button[text()='10m']";
    }
}
