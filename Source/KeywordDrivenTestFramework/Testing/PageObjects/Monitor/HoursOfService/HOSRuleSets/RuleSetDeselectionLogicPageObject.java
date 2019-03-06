/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects.Monitor.HoursOfService.HOSRuleSets;

/**
 *
 * @author smncwabe
 */
public class RuleSetDeselectionLogicPageObject {
    
    public static String RuleSetsLinkXpath(){
        
        return "//ul/li/a[text()='HOS rule sets']";
    }
    
    public static String SpinnerHosRuleSetsXpath(){
        return "//div[@class='tab-pane active ng-scope']/../../div[2][@class='loading-overlay ng-scope'][contains(@style, 'display: none')]";
    }
    
    public static String RuleSetXpath(String RuleSet){
        
        return "//input/../span[text()='"+RuleSet+"']/../input";
    }
    
    public static String ManageOrganisationStructureSpinnerXpath(){
        return "//div[@class='organisation-name'][contains(@style, 'display: none')]";
    }
    
    
    public static String DriversSpinnerXpath(){
        return "//div[@class='loading-overlay ng-scope'][contains(@style, 'display: none')]";
    }
    
    public static String DriversDetailsSpinnerXpath(){
        return "//form[@name='driverDetailsForm']/../div[@class='loading-overlay ng-scope'][contains(@style, 'display: none')]";
    }
    
    
    public static String ButtonsaveXpath(){
        return "//button[text()='Save']";
    }
    public static String SuccessBannerHidenXpath(){
        return "//span[text()='Driver updated successfully']/../../../div[@class='notification-wrapper notification-modal ng-scope'][@style='display: none;']";
    }
    public static String HoursOfServiceXpath(){
        return "//ul/li/a[text()='Hours of service']";
    }
    
    public static String AddDriverButtonXpath(){
        return "//div/div//a/i[@class='icon-plus icon-white']";
    }
     
    public static String FilterTextboxXpath(){
        return "//div[@class='text-filter empty']/input";
    }
    
    public static String ShifttheFocusXpath(){
        return "//span[@class='badge badge-grey ng-binding']";
    }
   
    
    public static String DriverSpinnerXpath(){
        return "//div[@class='loading-overlay ng-scope'][contains(@style, 'display: none')]";
    }
    
    public static String DriverNameXpath(){
        return "//div/a[text()='RuleSetDeselectDriver-DO NOT DELETE']";
    }
    
     public static String SearchIconXpath(){
        return "//div/input/../a[@class='btn btn-small']";
    }
    
    public static String HoursOfServiceCheckBoxXpath(){
        return "//input[@type='checkbox'][@name='isHosDriver']";
    }
    public static String DropdownRuleSetXpath(){
        return "//select[@ng-model='hoursOfService.ruleId']";
    }
    
    public static String HomeLocationTextBoxXpath(){
        return "//input[@id='hosHomeLocation']";
    }
    
    public static String HomeLocationPopulatedXpath(){
        return "//span[@id='timeclock-location']/ul/li[1]/a";
    }
    
    public static String DriverIdTextBoxXpath(){
        return "//input[@name='hosDriverId']";
    }
    
    public static String DriverUpdatedSuccessfullyXpath(){
      
        return "//span[text()='Driver updated successfully']/../../../div[@class='notification-wrapper notification-modal ng-scope'][@style='display: none;']";
    }
    
    public static String DriverLinkXpath(){
        return "//ul/li/a[text()='Drivers']";
    }
    
    public static String DriversheadingXpath(){
        return "//h5/span[text()='Drivers']";
    }
    public static String HosRuleSetsUpdatedXpath(){
        return "//span[text()='HOS rule sets updated successfully']/../../../div[@class='notification-wrapper notification-modal ng-scope'][@style='display: none;']";
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
