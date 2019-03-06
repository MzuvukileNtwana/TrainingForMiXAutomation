/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects.Monitor.HoursOfService.Timeline;

import KeywordDrivenTestFramework.Core.BaseClass;

/**
 *
 * @author smbiko
 */
public class LoadCoDriverInformationPageObjects extends BaseClass
{
    public static String dateTimeTextBox()
    {
        return "//div[@class='page-header']/div/div[@class='form-inline pull-left']/div/input";
    }
    public static String calenderIconButton()
    {
        return "//div[@class='page-header']/div/div[3]/div/span[@class='add-on btn']/i/..";
    }
    public static String Day()
    {
        return "//div[@class='current-days']/div[text()='14']";
    }
    public static String Month()
    {
        return "//div[@class='datepicker-widget in']/div[1]/div/div[@class=\"month-of-year ng-binding\"]";
    }
    public static String Hours()
    {
        return "//div[@class='datepicker-widget in']/div[1]/div/div[@class=\"hours ng-binding\"]";
    }
    public static String HourToPick()
    {
        return "//div[@ng-class=\"directive.hourClass($index, hour)\" and text() = \"06\"]";
    }
    public static String Minutes()
    {
        return "//div[@class='datepicker-widget in']/div[1]/div/div[@class=\"minutes ng-binding\"]";
    }
    public static String MinutesToPick()
    {
        return "//div[@ng-class=\"directive.minutesClass($index, minute)\" and text() = \"00\"]";
    }
    public static String MonthSelection()
    {
        return "//div[@class=\"month-selector zoomable\"]//div[text()='Jun']";
    }
    public static String Year()
    {
        return "//div[@class='datepicker-widget in']/div[1]/div/div[@class=\"year ng-binding\"]";
    }
    public static String YearSelection()
    {
        return "//div[@ng-repeat='year in directive.years']/span[text()='2016']";
    }
    public static String validateDate()
    {
        return "//div[@aria-hidden='false']//div[@class='display']/div[@class='day-of-week ng-binding']/../../div[@class='display']";
    }
    public static String DoneButton()
    {
        return "//div[@class=\"datepicker-widget in\"]/div/a[text()='Done']";
    }
    public static String HOSTimeLine()
    {
        return "//h5/span[text()='HOS timeline']";
    }
    public static String StartOfDay()
    {
        return "//a[@fleet-tooltip='Start of day']";
    }
    public static String extraDriversLink()
    {
        return "//span[@class='dropdown']/a";
    }
    public static String coDriversDropdownMenuXpath()
    {
        return "//span[@class='dropdown open']//li";
        
    }
    
    public static String coDriverNikodemusXpath()
    {
        return "//span[@class='dropdown open']/ul/li/a[text()='Nikodemus Blom']";
        
    }
    
    public static String coDrivers_1Xpath()
    {
        return "//span[@class='dropdown open']/ul/li[1]/a[text()]";
    }
    public static String coDrivers_2Xpath()
    {
        return "//span[@class='dropdown open']/ul/li[2]/a[text()]";
    }
    public static String driverOnBreadcrumbXpath()
    {
        return "//div[@class='miller-selector' and @ng-show=\"type == 'miller'\"]/a/span[3]/span[2][text()]";
    }
    public static String LoadingWorkstateSpinnerXpath()
    {
        return "//div[@class='loading-overlay'][@style='display: none;']";
    }
    
     public static String logViewerPageHeaderXpath()
     {
         return "//h5/span[text()='HOS Log Viewer']";
     }
     public static String coDriversXpath()
    {
        return "//strong[text()='Co-Drivers:']/../a";
    }
    public static String coDriversNamesXpath()
    {
        return "//strong[text()='Co-Drivers:']/..";
    }
    
    public static String twentyFourHrWindowActiveXpath()
    {
        return "//button[@class='btn btn-small ng-scope ng-binding active'][text()='24h']";
    }
    public static String twentyFourHrWindowNotActiveXpath()
    {
        return "//button[@class='btn btn-small ng-scope ng-binding'][text()='24h']";
    }
    public static String sixHrWindowViewPeriodNotActiveXpath()
    {
        return "//button[@class='btn btn-small ng-scope ng-binding'][text()='6h']";
    }
    public static String sixHrWindowViewPeriodActiveXpath()
    {
        return "//button[@class='btn btn-small ng-scope ng-binding active'][text()='6h']";
    }
    
    public static String originalEventTimelineSelectionXpath()
    {
        return "//span[@class='text ng-binding']";
    }
    public static String listedCoDriver_1Xpath()
    {
        return "//strong[text()='Co-Drivers:']/../a[1]";
    }
    public static String listedCoDriver_2Xpath()
    {
        return "//strong[text()='Co-Drivers:']/../a[2]";
    }
 
    public static String additionalCoDriversXpath(int driver)
    {
        return "//span[@class='dropdown open']//li["+driver+"]";
    }
    
    public static String coDriversSixHrPeriodXpath()
    {
        return "//div[@listed='coDriversListed']/span[@class='timeline-hos-drivers']";
    }
    public static String refreshButtonXpath()
    {
        return "//span[text()='Refresh']/..";
    }
    
     public static String logViewerButtonXpath()
    {
        return "//a[@fleet-tooltip='Driver log view']";
    }
     public static String timelineButtonXpath()
     {
         return "//a[@fleet-tooltip='HOS timeline']";
     }
     public static String arrowControlBackButtonXpath()
     {
         return "//a[text()='Back']";
     }
     public static String coDriversNoneXpath()
     {
         return "//div/span[@class='timeline-hos-drivers']/span[text()='None']";
     }
     public static String coDriversNoneSixHourXpath()
     {
         return "//strong[text()='Co-Drivers:']/..";
     }
    public static String GetDateTimeButtonXpath()
    {
        return "//span[@class='text ng-binding']";
    }
    
    
}
