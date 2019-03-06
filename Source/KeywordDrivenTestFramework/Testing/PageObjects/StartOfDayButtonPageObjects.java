/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects;

/**
 *
 * @author elebese
 */
public class StartOfDayButtonPageObjects 
{
    public static String StartOfDayButtonXpath()
    {
        return "//i[@class='icon-alarmclock']/..";
    }
    
    public static String dateXpath()
    {
        return "//div[@class='form-inline pull-left']/div/input";
    }
    
    public static String TableLoaderXpath()
    {
        return "//div[@class='timeline-content ng-scope']/div[@class='loading-overlay'][@style='display: none;']";
    }
    
    public static String TableLoaderOnDriversXpath()
    {
        return "//div[@class='paged-grid']/div[@class='loading-overlay'][@style='display: none;']";
    }
    
    public static String VerifyEventXpath(String event)
    {
        return "//td/div/span[text()='"+event+"']";
    }
    
    public static String LinkXpath(String driver)
    {
        return "//a[text()='"+driver+"']";
    }
    
    public static String VerifyEventCheckboxXpath(String event)
    {
        return "//td/div/span[text()='"+event+"']/../../../td/input[@type='checkbox']";
    }
    
    public static String EventsHeaderXpath()
    {
        return "//span[text()='Select events']";
    }
    
    public static String StartOfDayDropdownXpath()
    {
        return "//span[text()='Start of day']/../../select";
    }
    
    public static String TripTimelineXpath()
    {
        return "//span[@class='text ng-binding']";
    }  
    
    public static String MidnightXpath()
    {
        return "//div[@class='top-time-axis time-axis zoomable orientation-top']/span[text()='Midnight']";
    }
    
    public static String DivForTimelineXpath()
    {
        return "//div[@class='top-time-axis time-axis zoomable orientation-top']";
    }
}
