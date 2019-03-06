/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects;

import KeywordDrivenTestFramework.Core.BaseClass;

/**
 *
 * @author smbiko
 */
public class WorkstateTooltipsPageObjects extends BaseClass
{
    public static String LoadingWorkstateSpinnerXpath()
    {
        return "//div[@class='loading-overlay'][@style='display: none;']";
    }
    public static String workstatesXpath(String workstate)
    {
        return "//span[text()='"+ workstate +"']/..";
    }
    public static String moveFocusXpath()
    {
        return "//div[@class='container-fluid selection-criteria']";
    }
    public static String validateDate()
    {
        return "//div[@aria-hidden='false']//div[@class='display']/div[@class='day-of-week ng-binding']/../../div[@class='display']";
    }
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
    public static String SBworkstateInfoXpath()
    {
        return "//div[@class='tooltip-inner']/div/div[@class='ng-scope']/div/div[@class='hos-tooltip ng-scope']";
    }
    public static String SBstartDateXpath()
    {
        return "//div[@class='tooltip-inner']/div/div[@class='ng-scope']/div/div[@class='hos-tooltip ng-scope']/div/strong[text()='Start date']/..";
    }
    public static String SBendDateXpath()
    {
        return "//div[@class='tooltip-inner']/div/div[@class='ng-scope']/div/div[@class='hos-tooltip ng-scope']/div[2]/strong[text()='End date']/..";
    }
    public static String SBsingleSleeperXpath()
    {
        return "//div[@class='tooltip-inner']/div/div[@class='ng-scope']/div/div[@class='hos-tooltip ng-scope']/div[5]/strong[text()='Single sleeper']/..";
    }
    public static String SBdistanceXpath()
    {
        return "//div[@class='tooltip-inner']/div/div[@class='ng-scope']/div/div[@class='hos-tooltip ng-scope']/div[7]/strong[text()='Distance']/..";
    }
    public static String SBstartODOXpath()
    {
        return "//div[@class='tooltip-inner']/div/div[@class='ng-scope']/div/div[@class='hos-tooltip ng-scope']/div[8]/strong[text()='Start ODO']/..";
    }
    public static String SBassetXpath()
    {
        return "//div[@class='tooltip-inner']/div/div[@class='ng-scope']/div/div[@class='hos-tooltip ng-scope']/div[9]/strong[text()='Asset']/..";
    }
    
    //OFF worksate xpaths
    public static String OFFstartDateXpath()
    {
        return "//div[@class='tooltip-inner']/div/div[@class='ng-scope']/div/div[@class='hos-tooltip ng-scope']/../../div/div/div/strong[text()='Start date']/..";
    }
    public static String OFFendDateXpath()
    {
        return "//div[@class='tooltip-inner']/div/div[@class='ng-scope']/div/div[@class='hos-tooltip ng-scope']/../../div/div/div[2]/strong[text()='End date']/..";
    }
    public static String OFFoffDutyXpath()
    {
        return "//div[@class='tooltip-inner']/div/div[@class='ng-scope']/div/div[@class='hos-tooltip ng-scope']/../../div/div/div[5]/strong[text()='Off duty']/..";
    }
    
    public static String OFFoffDutyXpathred()
    {
        return "//div[@class='tooltip-inner']/div/div[@class='ng-scope']/div/div[@class='hos-tooltip ng-scope']/../../div/div/div[5]/strong[text()='On duty not driving']/..";
    }
    
    public static String OFFDistanceXpath()
    {
        return "//div[@class='tooltip-inner']/div/div[@class='ng-scope']/div/div[@class='hos-tooltip ng-scope']/../../div/div/div[7]/span";
    }
    
    public static String OFFDistanceXpathred()
    {
        return "//div[@class='tooltip-inner']/div/div[@class='ng-scope']/div/div[@class='hos-tooltip ng-scope']/../../div/div/div[6]/strong[text()='Distance']/..";
    }
    
    public static String RefreshXpath()
    {
        return "//i[@class='icon-refresh icon-green']";
    }
    
    public static String OFFStartOdoXpath()
    {
        return "//div[@class='tooltip-inner']/div/div[@class='ng-scope']/div/div[@class='hos-tooltip ng-scope']/../../div/div/div[8]/strong[text()='Start ODO']/..";
    }
    
    public static String OFFAssetXpath()
    {
        return "//div[@class='tooltip-inner']/div/div[@class='ng-scope']/div/div[@class='hos-tooltip ng-scope']/../../div/div/div[9]/strong[text()='Asset']/..";
    }
    
    public static String StartOfDayTooltip()
    {
        return "//div[@class='tooltip-inner']//span[text()='Start of day']/..";
    }
    public static String StartOfDay()
    {
        return "//a[@fleet-tooltip='Start of day']";
    }
     
    public static String MenuXpath(String elementText) 
    {
        //return "//a[contains(text(), '"+elementText+"')]";
        return "//a[text()='MANAGE ']";
    }
    public static String SubMenuXpath(String elementText) 
    {
        return "//a[text()='Personal settings']";
    }
    public static String validateRegionalSettingsTabXpath() 
    {
        return "//form//fieldset//legend[text()='Regional Settings']";
    }
    public static String regionalSettingsTabXpath() 
    {
        return "//a[text()='Regional settings']";
    }
    public static String measurementUnitsXpath() 
    {
        return "//span[text()='Measurement units']";
    }
    public static String measurementUnitsDropdownXpath() 
    {
        return "//select[@ng-model='userProfile.measurementType']";
    }
     public static String metricUnitsOptionXpath() 
    {
        return "//select[@ng-model='userProfile.measurementType']/option[text()='Metric']";
    }  
}
