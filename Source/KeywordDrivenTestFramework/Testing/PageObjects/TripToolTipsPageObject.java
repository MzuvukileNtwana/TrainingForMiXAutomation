/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects;

/**
 *
 * @author smnisi
 */
public class TripToolTipsPageObject {
    
    //Declaring Colors
    public static String Green()
    {
        return "GreenWorkstate.png";
    }
    
    public static String Red()
    {
        return "RedWorkstate.png";
    }
    
    public static String LightGreen()
    {
        return "LightGreenWorkstate.png";
    }
    
    public static String Amber()
    {
        return "AmberWorkstate.png";
    }
    
       public static String Blue()
    {
        return "BlueWorkstate.png";
    }
    
    //Landing Page
    public static String HOSTimeLine()
    {
        return "//h5/span[text()='HOS timeline']";
    }
    
    public static String calenderIconButton()
    {
        return "//div[@class='page-header']/div/div[3]/div/span[@class='add-on btn']/i/..";
    }
    
    public static String dateTimeTextBox()
    {
        return "//div[@class='page-header']/div/div[@class='form-inline pull-left']/div/input";
    }
    
    public static String DoneButton()
    {
        return "//div[@class='datepicker-widget in']/div[@class='done']/a[text()='Done']";
    }
    
    
    public static String selectedDayisMonday()
    {
        return "//div[@class='display']/div[text()='Monday']";
    }
    
    public static String ToolTipForRedColorTrip()
    {
        return "//div[@class='hos-tooltip ng-scope']/div";
    }
    
    
    public static String TipToolForBlueColor()
    {
       return "//div[@class='ng-scope tooltip timeline-tooltip in']/div[@class='tooltip-inner']/div/div/div/div/div[@class='ng-binding']";
    }
            
    public static String blueTimeLine()
    {
        return "blueTimeLine.png";
    }
    
    public static String startTimeDate()
    {
       // return "//div[@class='ng-scope tooltip timeline-tooltip in']/div[@class='tooltip-inner']/div/div/div/div/div[@class='ng-binding'][1][text()=': 2016-04-04 08:44 AM (ART)']";
        return "//div[@class='ng-scope tooltip timeline-tooltip in']/div[@class='tooltip-inner']/div/div/div/div/div[@class='ng-binding'][1]";
    }
    
    public static String endTimeDate()
    {
        return "//div[@class='ng-scope tooltip timeline-tooltip in']/div[@class='tooltip-inner']/div/div/div/div/div[@class='ng-binding'][2]";
    }
    
    public static String DurationTime()
    {
        return "//div[@class='ng-scope tooltip timeline-tooltip in']/div[@class='tooltip-inner']/div/div/div/div/div[@class='ng-binding'][3]";
    }
    
    public static String ManageHeader()
    {
        return "//li/a[text()='MANAGE ']";
    }
    
    public static String UserSettingsHeader()
    {       return "//h4[text()='USER SETTINGS']/..";
    }
    
    public static String personalSettings()
    {
        return "//li/a[text()='Personal settings']/..";
    }
    
    public static String personalDetails()
    {
        return "//li/a[text()='Personal details']/..";
    }
    
    public static String username()
    {
        return "//label/span[text()='Username']/..";
    }
    
    public static String RegionalSettings()
    {
        return "//li/a[text()='Regional settings']";
    }
    
    public static String DisplaySettings()
    {
        return "//div[@class='span12 well last'] /fieldset[2]/legend[text()='Display settings']";
    }
    
    public static String RegionalSettingsHeader()
    {
        return "//legend[text()='Regional Settings']";
    }
    
    public static String measurementUnitDropDown()
    {
        return "//select[@ng-model='userProfile.measurementType']/option[text()='Metric']";
    }
    
    public static String ConsumptionDropDown()
    {
        return "//label/span[text()='Consumption']/../../select/option[text()='Volume units/100 Distance units (e.g. l/100km)']";
    }
    
    public static String SettingsHeader()
    {
        return "//h5/span[text()='Settings']";
    }
    
    public static String StartOfDay()
    {
        return "//div[@class='selection-btn-right pull-right']/a/i[@class='icon-alarmclock']/..";
    }
    
    public static String driverspinner()
    {
        return "//div[@class=\"loading-overlay\"][@style=\"display: none;\"]";
    }
    
    public static String ONspan()
    {
        return "//span[@class='hos-workstate-label ng-scope']/span[text()='ON']";
    }
    
    public static String pageSpinner()
    {
        return "//div/div[5][@class='loading-overlay' and @style='display: none;']";
    }
    
    public static String firstWorkStateToolTip()
    {
        return "//div[@class='tooltip-inner']/div//div[@class='hos-tooltip ng-scope']/div";
    }
    
    public static String informationIcon()
    {
        return "//a/i[@class='icon-info-sign icon-grey']";
    }
    
    public static String HosViewButtonOnTheTopRight()
    {
        return "//div[@class='selection-btn-right pull-right']/a[3]";
    }
            
}
