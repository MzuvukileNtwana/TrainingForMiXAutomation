/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects.Monitor.HoursOfService.LogViewer;

import KeywordDrivenTestFramework.Core.BaseClass;

/**
 *
 * @author smbiko
 */
public class InspectionsTabControlsAndBehaviourPageObjects extends BaseClass
{
    
    public static String inspectionsTabXpath()
    {
        return "//ul//li//a[text()='Inspections']/..";
    }
    public static String inspectionsTabSelectedXpath()
    {
        return "//ul[@class='nav nav-tabs']/li[@class='ng-scope active']/a[text()='Inspections']";
    }
    public static String HOSLogViewerTableSpinnerXpath()
    {
        return "//div[@ng-repeat='tabpane in tabPanes'][1]/div[@ng-show='currentpane.selected'][1]/div[@id='hosGrid']/div[1]/div[@columns='currentpane.hosGridColumns'][1]//div[@class='fleet-grid full-height has-row-actions']/div[@class='loading-overlay ng-scope'][@style='display: none;']"; 
    }
    public static String SpinnerXpath(){
       return "//div[@class='loading-overlay'][@style='display: none;']";
    }
    public static String dateTimeHeaderXpath()
    {
       return "//div[@class='tab-content']/div/div[@class='tab-pane'][not(contains(@style,'display: none;'))]/div[@fleet-loader='content']/div/div/div/div/table/thead/tr/th[3]"; 
    }
    public static String typeHeaderXpath()
    {
       return "//div[@class='tab-content']/div/div[@class='tab-pane'][not(contains(@style,'display: none;'))]/div[@fleet-loader='content']/div/div/div/div/table/thead/tr/th[4]"; 
    }
    public static String remarksHeaderXpath()
    {
       return "//div[@class='tab-content']/div/div[@class='tab-pane'][not(contains(@style,'display: none;'))]/div[@fleet-loader='content']/div/div/div/div/table/thead/tr/th[5]"; 
    }
    
    public static String greenAddLogDataButtonXpath()
    {
//        return "//div[@class='tab-pane'][not(contains(@style, 'none'))]/div/div/div/a[@fleet-tooltip='Add log data']/..";
        return "//div[@class='tab-content']//div[@class='tab-pane'][not(contains(@style, 'none'))]/div/div/div/a[@id='hosTabPaneAdd'][@fleet-tooltip='Add log data']/i";
    }
    
    public static String greenAddLogDataButtonXpathIE()
    {
        return "//div[@class='tab-content']//div[@class='tab-pane'][not(contains(@style, 'none'))]/div/div/div/a[@id='hosTabPaneAdd'][@fleet-tooltip='Add log data']/i";
    }
    
    public static String tableSizeXpath()
    {
        return "//div[@class='tab-content']/div/div[@class='tab-pane'][not(contains(@style,'display: none;'))]/div[@fleet-loader='content']/div/div/div/div/table/tbody/tr";
    }
    public static String inspectionsTabNumberXpath()
    {
        return "//div[@class='tab-content']/div/div/div/div/ul/li[2]/span/../../../ul/li[1]/strong[text()='Inspections']/../../li[2]/span";
    }
    public static String actionsButtonXpath()
    {
        return "//div[@ng-show='currentpane.selected'][not(contains(@style, 'display: none'))]//li[@ng-repeat]/div/div/a[@fleet-tooltip='Actions']/../../..";
    }
    
     public static String Day()
    {
        return "//div[@class='current-days']/div[text()='13']";
    }
    public static String Month()
    {
        return "//div[@class='datepicker-widget in']/div[1]/div/div[@class=\"month-of-year ng-binding\"]";
    }
     public static String MonthSelection()
    {
        return "//div[@class=\"month-selector zoomable\"]//div[text()='Jan']";
    }
     public static String greenAddStatusEventButtonXpath()
    {
        return "//div[@class='tab-content']//div[@class='tab-pane'][not(contains(@style, 'none'))]/div/div/div/a[@id='hosTabPaneAdd'][@fleet-tooltip='Add log data']/i";
    }
     public static String addLogDataButtonTooltipXpath()
    {
        return "//div[contains(@class,'ng-scope tooltip left in')]/div/span[text()='Add log data']";
    }
     public static String editRemoveMenuXpath()
    {
        return "//ul[@class='dropdown-menu pull-right'][not(contains(@style,'display: none'))]";
    }
    
    
}
