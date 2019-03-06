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
public class LanguageAppliedOnAssetListPageObjects {
    
    
    public static String MonitorClick()
    {
        return "//a[text()='Onitormay ']";
    }
    
    public static String LiveTracking()
    {
        return "//a[text()='Ivelay ackingtray']";
    }
    
    public static String HistoricalTrackingClick()
    {
        return "//a[text()='Istoricalhay ackingtray']";
    }
    
    public static String HistoricalTrackingCheck()
    {
        return "//span[text()='Istoricalhay ackingtray']";
    }
    
    public static String AssetsWithTripsCheck()
    {
        return "//span[text()='Assetsway ithway ipstray']";
    }
    
     public static String AssetsWithEvents()
    {
        return "//span[text()='Assetsway ithway eventsway']";
    }
    
    
    public static String EventsCheck()
    {
        return "//th[@class='cell-w1']/span[text()='Eventsway']";
    }
    
    public static String RegistrationCheck()
    {
        return "//th[@class='column-heading']/span[text()='Egistrationray']";
    }
    
    public static String AssetDescription()
    {
        return "//th[@class='column-heading']/span[text()='Assetway escriptionday']";
    }
    
    public static String FleetNumber()
    {
        return "//th[@class='column-heading']/span[text()='Eetflay umbernay']";
    }
    
    public static String AssetIcon()
    {
        return "//th[@class='column-heading']/span[text()='Assetway iconway']";
    }
    
    public static String TotalDistance()
    {
        return "//th[@class='column-heading']/span[contains(text(),'Otaltay istanceday')]";
    }
    
    public static String ExpandAsset()
    {
        return "//a[@ng-show='asset.hasTrips']/i";
    }
    
    public static String SpinnerWait()
    {
        return "//div[@class='loading-overlay ng-scope'][@style='display: none;']";
    }
    public static String SpinnerWaitxpath()
    {
        return "//div[@class='loading-overlay ng-scope'][@style='display: none;']";
    }
    
    public static String Maximize()
    {
        //return "//a[@ng-show='asset.hasTrips']/i";
        return "//table[@class='table table-striped table-condensed no-margin']/tbody[1]/tr/td/a[@ng-show='asset.hasTrips']/i";
    }
    
    public static String TripStart()
    {
        return "//th[contains(text(),'Iptray artstay')]";
    }
    public static String assetColumn(String ColumnName)
    {
        return "//th[text()='"+ColumnName+"']";
    }
    public static String TripEnd()
    {
        return "//th[contains(text(),'Iptray endway')]";
    }
    
      public static String Duration()
    {
        return "//th[text()='Urationday']";
    }
      
      public static String Distance()
      {
          return "//th[contains(text(),'Istanceday')]";
      }
      
        public static String MaxSpeed()
      {
          return "//th[contains(text(),'Axmay eedspay')]";
          //return "//th[text()='Axmay eedspay (mphay)']";
      }
        
    public static String ActionButton()
    {
        return "//tr[@ui-if='asset.expanded']/td/div/table/thead/tr[@class='light-blue']/../../tbody[1]/tr/td[8]/div/a";
    }
    
    public static String ShowOnMap()
    {
        return "//tr[@ui-if='asset.expanded']/td/div/table/thead/tr[@class='light-blue']/../../tbody[1]/tr/td[8]/div/a/../ul/li[2]/a/span[text()='Owshay onway apmay']";
    }
    
    public static String ShowOnTripTimeLine()
    {
        return "//tr[@ui-if='asset.expanded']/td/div/table/thead/tr[@class='light-blue']/../../tbody[1]/tr/td[8]/div/a/../ul/li[3]/a/span[text()='Owshay onway iptray imelinetay']";
    }
    
     public static String GoogleEarth()
    {
        return "//tr[@ui-if='asset.expanded']/td/div/table/thead/tr[@class='light-blue']/../../tbody[1]/tr/td[8]/div/a/../ul/li[4]/a/span[text()='Ooglegay Earthway']";
    }
     
    public static String CalendarIcon()
    {
        return "//div[@class='pull-left']/i[@class='icon-calendar']";
    }
    
    public static String ListView()
    {
        return "//a[@ng-click=\"setView('list')\"]/i[@class='icon-th-list']";
    }
    
    public static String List(String name)
    {
        return "//select[@ng-model=\"listItem\"]/option[text()='"+name+"']";
       // return "//select[@class='no-margin ml-10 ng-pristine ng-valid']";
    }
    
    public static String ListSelectLastWeek()
    {
        //return "//select[@class='no-margin ml-10 ng-pristine ng-valid']/option[text()='Eekway otay ateday']";
        return "//option[text()='Eekway otay ateday']";
    }
    
    public static String Save()
    {
        return "//a[@ng-click='save()']/i";
    }
    
    public static String ExpandSubTrip()
    {
        return "//tr[@ui-if='asset.expanded']/td/div/table/thead/tr[@class='light-blue']/../../tbody[1]/tr/td/a/i";
    }
    
    public static String Depart()
    {
        return "//th[contains(text(),'Epartday')]";
    }
    
    public static String Arrival()
    {
        return "//th[contains(text(),'Arrivalway')]";
    }
    
    public static String SubTripDuration()
    {
        return "//tr[@ui-if='trip.expanded']/td/div/table[@class='table table-condensed no-margin']/thead/tr/th[text()='Urationday']";
    }
    
     public static String SubTripDistance()
    {
        return "//tr[@ui-if='trip.expanded']/td/div/table[@class='table table-condensed no-margin']/thead/tr/th[contains(text(),'Istanceday')]";
        //return "//tr[@ui-if='trip.expanded']/td/div/table[@class='table table-condensed no-margin']/thead/tr/th[text()='Istanceday (imay)']";
    }
     
     public static String SubTripMaxSpeed()
     {
         return "//tr[@ui-if='trip.expanded']/td/div/table[@class='table table-condensed no-margin']/thead/tr/th[contains(text(),'Axmay eedspay')]";
         //return "//tr[@ui-if='trip.expanded']/td/div/table[@class='table table-condensed no-margin']/thead/tr/th[text()='Axmay eedspay (mphay)']";
     }
     
     public static String SubTripActionButton()
     {
         return "//tbody[@ng-repeat=\"subTrip in trip.subTrips\"][1]/tr/td/div/a[@class='btn-actions dropdown-toggle']";
     }
     
     public static String SubTripShowOnMap()
     {
         return "//tbody[@ng-repeat=\"subTrip in trip.subTrips\"][1]/tr/td/div/a[@class='btn-actions dropdown-toggle']/../ul/li/a/span[text()='Owshay onway apmay']";
     }
     
       public static String SubTripShowOnTripTimeline()
     {
         return "//tbody[@ng-repeat=\"subTrip in trip.subTrips\"][1]/tr/td/div/a[@class='btn-actions dropdown-toggle']/../ul/li/a/span[text()='Owshay onway iptray imelinetay']";
     }
       
     public static String InspectEventsExpand()
     {
         return "//tbody[@ng-repeat='subTrip in trip.subTrips'][1]/tr/td/a/i";
     }
     public static String InspectEventsExpandCheck()
     {
         return "//tbody[@ng-repeat='subTrip in trip.subTrips'][1]/tr/td/a[@style='display: none;']/i";
     }
     
     
     public static String StartTime()
     {
         return "//tr[@ui-if='subTrip.expanded']/td/div/table/thead/tr/th[contains(text(),'Artstay imetay')]";
     }
     public static String TimesXpath(String columnName)
     {
         return "//tr[@ui-if='subTrip.expanded']/td/div/table/thead/tr/th[contains(text(),'"+columnName+"')]";
     }
     public static String EndTime()
     {
         return "//tr[@ui-if='subTrip.expanded']/td/div/table/thead/tr/th[contains(text(),'Endway imetay')]";
     }
       
         public static String Event2()
     {
         return "//tr[@ui-if='subTrip.expanded']/td/div/table/thead/tr/th[text()='Eventway']";
     }
     
     
    
}
