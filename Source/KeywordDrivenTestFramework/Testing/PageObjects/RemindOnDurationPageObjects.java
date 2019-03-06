/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects;

/**
 *
 * @author nmayekiso
 */
public class RemindOnDurationPageObjects {
    
    public static String ManageMenuRelativeXpath() 
    {
        return "//a[text()='MANAGE ']";
    }
    
    public static String MonitorMenuRelativeXpath() 
    {
        return "//a[text()='MONITOR ']";
    }
    
    public static String DatabaseAdministrationRelativeXpath() 
    {
        return "//div[@ng-repeat='module in section.modules']//a[text()='Database administration']";
    }
    
    public static String AssetSubMenuRelativeXpath() 
    {
        return "//a[text()='Assets']";
    }
    
    public static String TestRSOTreeRelativeXpath() 
    {
        return "//strong[text()='Test RSO']/../../../../span[@class='daredevel-tree-anchor ui-icon icon-plus ng-scope']";
    }
    
    public static String DVTAutomationOrgRelativeXpath() 
    {
        return "//strong[text()='DVT Automation']";
    }
    
    public static String MeasurementSettingsRelativeXpath() 
    {
        return "//a[text()='Measurement settings']";
    }
    
    public static String LanguageRelativeXpath() 
    {
        return "//select[@name='languageCode']//option[text()='English']";
    }
    
    public static String MeasurementUnitsRelativeXpath() 
    {
        return "//select[@name='measurementType']//option[@selected='selected']";
    }
    
    public static String AssetRelativeXpath() 
    {
        return "//a[@class='click-cell']";
    }
    
    public static String RemindersRelativeXpath() 
    {
        return "//a[text()='Reminders']";
    }
    public static String overDueByXpath()
    {
        return "//form[@name='assetServiceForm']/div[@class='alert ng-binding alert-error']";
    }
    public static String searchBoxXpath()
    {
        return "//a[@fleet-tooltip='Add asset']/../..//input[@type='text']";
    }
    public static String searchButtonXpath()
    {
        return "//a[@fleet-tooltip='Add asset']/../..//input[@type='text']/../a[@class='btn btn-small']";
    }
    public static String clearFilterButtonXpath()
    {
        return "//a[@fleet-tooltip='Add asset']/../..//input[@type='text']/../a[@class='clear-filter']";
    }
    public static String assetOnGridXpath(String asset)
    {
        return "//div[contains(@class,'cell')]/a[text()='"+asset+"']";
    }
    
    public static String OdometerRelativeXpath() 
    {
        return "//span[text()='Current odometer: ']//strong";
    }
    
    public static String LastServiceRelativeXpath() 
    {
        return "//span[text()='Last service recorded on ']//strong";
    }
    
    public static String RemindOnDurationRelativeXpath() 
    {
        return "//span[text()='Remind on duration']/../input";
    }
    
    public static String RemindOnDurationName() 
    {
        return "enableDurationReminders";
    }
    
    public static String NextServiceRelativeXpath() 
    {
        return "//div[contains(@class,'span12 datepicker')]//input";
    }
    
    public static String ServiceIntervalRelativeXpath() 
    {
        return "//span[text()='Service interval (months)']/../..//input";
    }
    
    public static String ReminderPeriodRelativeXpath() 
    {
        return "//span[text()='Reminder period (weeks before asset is due)']/../..//input";
    }
    
    public static String SelectRecipientsRelativeXpath() 
    {
        return "//button[text()='Select recipients']";
    }
    
    public static String RecipientsCheckboxRelativeXpath() 
    {
        return "//td[@ng-show='allowRowSelection']//input[@type='checkbox']";
    }
    
    public static String SelectButtonRelativeXpath() 
    {
        return "//button[text()='Select']";
    }
    
    public static String ClickHereRelativeXpath() 
    {
        return "//a[text()='If the recipient does not exist - ']//strong[text()='click here']";
    }
    
    public static String FirstNameTextboxRelativeXpath() 
    {
        return "//input[@name='firstName']";
    }
    
    public static String LastNameTextboxRelativeXpath() 
    {
        return "//input[@name='lastName']";
    }
    
    public static String EmployerTextboxRelativeXpath() 
    {
        return "//input[@name='employer']";
    }
    
    public static String PositionTextboxRelativeXpath() 
    {
        return "//input[@name='position']";
    }
    
    public static String HomeNumberTextboxRelativeXpath() 
    {
        return "//input[@name='homeNumber']";
    }
    
    public static String WorkNumberTextboxRelativeXpath() 
    {
        return "//input[@name='workNumber']";
    }
    
    public static String MobileNumberTextboxRelativeXpath() 
    {
        return "//input[@name='mobileNumber']";
    }
    
    public static String EmailTextboxRelativeXpath() 
    {
        return "//input[@name='email']";
    }
    
    public static String SubmitButtonRelativeXpath() 
    {
        return "//button[text()='Submit']";
    }
    
    public static String FilterTextboxRelativeXpath() 
    {
        return "//input[contains(@class,'filter-search-input')]";
    }
    
    public static String SaveButtonRelativeXpath() 
    {
        return "//button[text()='Save']";
    }
    
    
    
    public static String RemindOnDistanceRelativeXpath() 
    {
        return "//span[text()='Remind on distance']/../input";
    }
    
    public static String RemindOnDistanceName() 
    {
        return "enableDistanceReminders";
    }
    
    public static String NextServiceDistanceRelativeXpath() 
    {
        return "//span[contains(text(),'Next service due at')]/../../div/input[@name='nextDistance']";
    }
    
    public static String ServiceIntervalDistanceRelativeXpath() 
    {
        return "//span[contains(text(),'Service interval')]/../../div/input[@name='distanceInterval']";
    }
    
    public static String ReminderPeriodDistanceRelativeXpath() 
    {
        return "//span[contains(text(),'Reminder period')]/../../div/input[@name='distanceReminderPeriod']";
    }
}
