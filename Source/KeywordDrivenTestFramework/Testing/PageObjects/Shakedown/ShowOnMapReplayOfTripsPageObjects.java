/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects.Shakedown;

/**
 *
 * @author sscholtz
 */
public class ShowOnMapReplayOfTripsPageObjects {
    
    
        
    public static String AssetSpinner()
    {
        return "//div[@class='loading-overlay ng-scope'][@style='display: none;']";
    }
    
        
    public static String AssetHeading()
    {
        return "//a[@ng-click='showAssetList()']";
    }
    
    public static String CalendarIcon()
    {
        return "//div[@class='pull-left']/i[@class='icon-calendar']";
    }
    
    public static String CalendarView()
    {
        return "//div[@class='btn-group pull-left']//a[2]/i";
       
    }
    public static String historicalSearchButtonXpath()
    {
        return "//button[@class='btn historical-tracking-filter']";
    }
    public static String historicalSearchBoxXpath()
    {
        return "//button[@class='btn historical-tracking-filter']/../input";
    }

    public static String ListView()
    {
        return "//select[@ng-show=\"view == 'list'\"][@style=\"display: none;\"]";
    }
    
    public static String FirstDateSelection()
    {
        return "//div[@class='ml-10 pull-left']//i";
    }
    
    public static String SecondDateSelection()
    {
        return "//div[@class='ml-10 pull-left']/../div[@class='pull-left']//i";
    }
    
    public static String MonthCheck(String month)
    {
        
        return "//div[@aria-hidden=\"false\"]//div[@ng-class=\"{ selected: directive.isMonthSelector }\"][text()='"+month+"']";
       // return "//div[@ng-class=\"{ selected: directive.isMonthSelector }\"][text()=]";
    }
    public static String MonthSelect(String month)
    {
        return "//div[@class='datepicker-widget in']//div[text()='"+month+"']";
    }
    
    public static String MonthClick()
    {
        return "//div[@aria-hidden='false']/div//div[@class='month-of-year ng-binding']";
    }
    
    public static String DayCheck(String day)
    {
        return "//div[@aria-hidden='false']//div[text()='"+day+"'][@class='day ng-scope ng-binding selected']";
    }
    
      public static String DaySelect(String day)
    {
        return "//div[@class='datepicker-widget in']//div[text()='"+day+"']";
    }
    
    public static String YearCheck(String year)
    {
        return "//div[text()='"+year+"']";
    }
    
    public static String YearClick()
    {
        return "//div[@aria-hidden='false']/div//div[@class='year ng-binding']";
    }
    
    public static String YearSelect(String year)
    {
        return "//span[text()='"+year+"']";
    }
    
    public static String DoneButton()
    {
        return "//div[@class='datepicker-widget in']//div[@class='done']";
    }
    
    public static String SaveDateButton()
    {
        return "//a[@class='btn btn-success']";
    }
    
    public static String ExpandFirstEvent()
    {
        return "//table[@class='table table-striped table-condensed no-margin']/tbody[1]/tr/td/a";
    }
    
    public static String ActionButtonOnFirstAssetTrip()
    {
        return "//table[@class='table table-condensed no-margin']/tbody[1]//a[@class='btn-actions dropdown-toggle']";
    }
    public static String ActionButtonOnAssetTrip()
    {
        return "//tbody[@ng-repeat='trip in asset.trips'][4]//a[@class='btn-actions dropdown-toggle']";
    }
    public static String eventNameOnEventInfoBubbleXpath(String event)
    {
        return "//div[contains(@style,'opacity')]//td[@class='pop-dev'][text()='"+event+"']";
    }
    
    public static String saveDateXpath()
    {
        return "//a[@ng-click='save()']";
    }
    
    public static String ShowOnMap()
    {
        return "//table[@class='table table-condensed no-margin']/tbody[1]//a[@class='btn-actions dropdown-toggle']/../..//span[text()='Show on map']";
    }
    public static String ShowOnMap2()
    {
        return "//div[@class='btn-group pull-right open']//ul//span[text()='Show on map']/..";
    }
    public static String HideOnMap()
    {
        return "//table[@class='table table-condensed no-margin']/tbody[1]//a[@class='btn-actions dropdown-toggle']/../..//span[text()='Hide on map']";
    }
    
    public static String MapSpinner()
    {
        return "//div[@ng-show='isMapLoading'][@style='display: none;']";
    }
    
    public static String SelectReplaySpeed()
    {
        return "//select[@ng-model='replaySpeed']/option[text()='1x']";
    }
    
    public static String MapReplayBar()
    {
        return "//div[@class='map-replay']";
    }

    
    
    
}
