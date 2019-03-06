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
public class DefaultLicensePageObjects {
    
    
    public static String DriverDefaultHeading()
    {
        return "//legend[text()='Driver defaults']";
    }
    
    public static String AssetIntervalAndReminderDefaultsTab()
    {
        return "//a[text()='Asset interval and reminder defaults']";
    }
    
    public static String AssetIntervalSpinner()
    {
        return "//div[@class='loading-overlay ng-scope'][@style='display: none;']";
    }
    
    public static String AssetIntervalAndReminderDefaultHeading()
    {
        return "//legend[text()='Asset Interval and reminder defaults']";
    }
    
    public static String DefaultLicenseTab()
    {
        return "//a[text()='Default licence']";
    }
    
    public static String LicenseDurationlabel()
    {
        return "//label[text()='Licence duration']";
    }
    
    public static String LicenseDurationInput()
    {
        return "//input[@ng-model='licence.duration']";
    }
    
    public static String ReminderPeriodInput()
    {
        return "//input[@ng-model='licence.reminderPeriod']";
    }
    
    public static String SaveButton()
    {
        return "//button[text()='Save']";
    }
    
    public static String SuccessfullySaved()
    {
        return "//span[text()='Organisation updated successfully']";
    }
}


