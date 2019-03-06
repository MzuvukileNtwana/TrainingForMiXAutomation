/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects;

/**
 *
 * @author kmanakaza
 */
public class RemindOnDurationExpireSoonObjects
{
    public static String ManageMenuRelativeXpath() 
    {
        return "//a[text()='MANAGE ']";
    }
    public static String checkfilteredRecipientsXpath() 
    {
        return "//span[text()='Name'][@class='ng-binding']/../../../../tbody/tr/td/input[@type ='checkbox']";
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
    public static String MapsettingsRelativeXpath() 
    {
        return "//a[text()='Map settings']";
    }
    public static String MapProviderXpath() 
    {
        return "//span[text()='Map Provider']//..//../select";
    } 
    public static String ValidateSaveButtonXpath() 
    {
        return "//button[text()='Save' and @disabled='disabled']";
    }
               
    public static String SaveButtonXpath() 
    {
        return "//button[text()='Save']";
    }
              
    public static String CancelButtonXpath() 
    {
        return "//button[text()='Cancel']";
    }         
    public static String MapProviderOptionXpath() 
    {
        return "//span[text()='Map Provider']//..//../select/option[text()='decarta']";
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
        return "//input[@name='enableDurationReminders']";
    }
    
     public static String ValidateServiceFormXpath() 
    {
        return "//form[@name='assetServiceForm']//div[@disabled='disabled']";
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
    
    public static String RecipientsCheckboxCheckedXpath() 
    {
        return "//td[@ng-show='allowRowSelection']//input[@type='checkbox'][@checked='checked']";
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
     public static String popAlertMessageRelativeXpath() 
    {
        return "//div[@class='notification notification-placement notification-success']/span[@id='pop-alert-message']";
    }
    
    public static String FilterTextboxRelativeXpath() 
    {
        return "//input[contains(@class,'filter-search-input')]";
    }
    public static String AddAssetButtonRelativeXpath() 
    {
        return "//a[@fleet-tooltip='Add asset']";
    }
    public static String SaveButtonRelativeXpath() 
    {
        return "//button[text()='Save']";
    }
    
    public static String SaveBannerdisappearXpath() 
    {
        return "//span[text()='Asset updated successfully']/../../../div[@class='notification-wrapper notification-modal ng-scope'][@style='display: none;']";
    }
    
}
