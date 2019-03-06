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
public class HOSSettingsScreenFieldValidationPageObjects {
   
    
    public static String DriverNamesSpinnerPage()
    {
        return "//div[@class='paged-grid']/div[@class='loading-overlay'][@style='display: none;']";
    }
    public static String DriverPageSpinnerXpath()
    {
        return "//div[@class='white-box-shadow span3 full-height container-left']/div[@style='display: none;']";
    }
    public static String filterButton()
    {
        return "//div[@class='white-box-shadow span9 full-height container-right']//input[@ng-model='$directive.filterText']/../a[@class='btn btn-small']";
    }
    
    public static String DriverSelection(String name)
    {
        return "//a[text()='"+name+"']";
    }
    
    public static String Spinner()
    {
        return "//div[@class='white-box-shadow span12 full-height container-right']/div[@style='display: none;'][@class='loading-overlay ng-scope']";
    }
    
    public static String Tabs(String name)
    {
        return "//a[text()='"+name+"']";
    }
    
    public static String Filters(String name)
    {
        return "//span[text()='"+name+"']";
    }
    
    public static String FilterDriver()
    {
        return "//DIV[@class='text-filter empty']/input[@ng-model='$directive.filterText']";
    }
    
    public static String ClearFilter()
    {
        return "//div[@class='text-filter']/a[@class='clear-filter']/i[@class='icon-remove-sign']";
    }
    
    public static String HoursOFServiceSettings()
    {
        return "//legend[text()='Hours of service settings']";
    }
    
    public static String HoursOfServiceCheckbox()
    {
        return "//span[text()='Hours of Service enabled for driver']/../input";
    }
    
    public static String LoaderOnHOSTabXpath()
    {
        return "//div[@class='row-fluid']/div[@class='loading-overlay ng-scope'][@style='display: none;']";
    }
    
    public static String SearchButton()
    {
        return "//a[@class='btn btn-small']/i[@class='icon-search']";
    }
    
    public static String HoursOfServiceRuleSetHeading()
    {
        return "//span[text()='Hours of service rule set']";
    }
    
    public static String SelectRuleSet()
    {
        return "//select[@name='ruleId']";
    }
    
    public static String retrieveRuleSet()
    {
        return "//select[@name='ruleId']/option[text()='Select rule set']";
    }
    
    public static String CurrentRuleSet()
    {
        return "//select[@ng-model='hoursOfService.ruleId']/option[@selected='selected']";
    }
    
    public static String SelectRuleSetErrorValidation()
    {
        return "//div[@id='ruleIdError']/span[text()='This field is required']";
    }
    
    public static String HomeLocation()
    {
        return "//input[@name='locationFilter']";
    }
    
    public static String LocationSelection()
    {
        return "//a[@ng-bind-html-unsafe='match.label | typeaheadHighlight:query']";
    }
    
    public static String HomeLocationErrorValidation()
    {
        return "//input[@name='locationFilter']/../span[text()='This field is required']";
    }
    
    public static String StartOfDay()
    {
        return "//span[text()='Start of day']/../../select/option[text()='03:00']";
    }
    
    public static String StartOfDayValue()
    {
        return "//select[@name='timeOfDay']/option[@selected='selected']";
    }
    
    
    public static String StartOfDayClick()
    {
        return "//span[text()='Start of day']/../../select";
    }
    
    public static String DriverID()
    {
        return "//input[@name='hosDriverId']";
    }
    
    public static String DriverIDErrorValidation()
    {
        return "//input[@name='hosDriverId']/../span[text()='This field is required']";
    }
    
    public static String HOSPassword()
    {
        return "//input[@name='password']"; 
    }
    
    public static String DriverIDCharaterLengthErrorValidation()
    {
        return "//span[text()='The entered field must be 10 characters or less']";
    }
 
    public static String DriverIDCharaterLengthErrorValidationNone()
    {
        return "//span[text()='The entered field must be 10 characters or less'][@style='display: none;']";
    }
    
    
    public static String SaveButton()
    {
        return "//button[@disabled='disabled'][text()='Save']";
    }
   
    public static String CheckBoxEnabled()
    {
        return "//form[@name='driverHoursOfServiceForm']/div[@style='display: none;']";
    }
  
    
}
