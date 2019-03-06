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
public class StatusTabControlsAndBehaviourPageObjects extends BaseClass
{
    
    public static String statusTabXpath()
    {
        return "//ul[@class='nav nav-tabs']/li[@class='ng-scope active']/a[text()='Status']";
    }
    public static String allHeadersXpath()
    {
        return "//div[@class='tab-content']/div/div[@class='tab-pane'][not(contains(@style,'display: none;'))]/div[@fleet-loader='content']/div/div/div/div/table/thead/tr";
    }
    public static String statusHeaderXpath()
    {
       return "//div[@class='tab-content']/div/div[@class='tab-pane'][not(contains(@style,'display: none;'))]/div[@fleet-loader='content']/div/div/div/div/table/thead/tr/th[3]"; 
    }
    public static String dateTimeHeaderXpath()
    {
       return "//div[@class='tab-content']/div/div[@class='tab-pane'][not(contains(@style,'display: none;'))]/div[@fleet-loader='content']/div/div/div/div/table/thead/tr/th[4]"; 
    }
    public static String durationHeaderXpath()
    {
       return "//div[@class='tab-content']/div/div[@class='tab-pane'][not(contains(@style,'display: none;'))]/div[@fleet-loader='content']/div/div/div/div/table/thead/tr/th[5]"; 
    }
    public static String locationHeaderXpath()
    {
       return "//div[@class='tab-content']/div/div[@class='tab-pane'][not(contains(@style,'display: none;'))]/div[@fleet-loader='content']/div/div/div/div/table/thead/tr/th[6]"; 
    }
    
    public static String greenAddStatusEventButtonXpath()
    {
        return "//div[@class='tab-content']//div[@class='tab-pane'][not(contains(@style, 'none'))]/div/div/div/a[@id='hosTabPaneAdd'][@fleet-tooltip='Add status event']/i";
    }
    
    public static String navigateDateBackArrowXpath()
    {
        return "//i[@class='icon-chevron-left icon-grey']";
    }
    
    public static String timeZoomButtonXpath(String text)
    {
        return "//button[text()='"+text+"']";
    }
    
    public static String greenAddStatusEventButtonXpathIE()
    {
        return "//div[@class='tab-content']//div[@class='tab-pane'][not(contains(@style, 'none'))]/div/div/div/a[@id='hosTabPaneAdd'][@fleet-tooltip='Add status event']/i";
    }
    public static String addStatusEventButtonTooltipXpath()
    {
        return "//div[contains(@class,\"ng-scope tooltip left in\")]/div/span[text()='Add status event']";
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
        return "//div[@class=\"month-selector zoomable\"]//div[text()='Mar']";
    }
    public static String offDutyAtWellSiteStatusEntryXpath()
    {
        return "//div[@class='tab-content']/div/div[@class='tab-pane'][not(contains(@style,'display: none;'))]/div[@fleet-loader='content']/div/div/div/div/table/tbody/tr/td[2]/div/span";
    }
    public static String datePickerValueXpath()
    {
        return "//input[@type='text']";
    }
    public static String tableSizeXpath()
    {
        return "//div[@class='tab-content']/div/div[@class='tab-pane'][not(contains(@style,'display: none;'))]/div[@fleet-loader='content']/div/div/div/div/table/tbody/tr";
    }
    public static String statusTabNumberXpath()
    {
        return "//div[@class='tab-content']/div/div/div/div/ul/li[2]/span/../../../ul/li[1]/strong[text()='Status']/../../li[2]/span";
    }
    public static String waitforLogViewerSpinnerXpath()
    {
        return "//div[@id='logContent']/div[@class='loading-overlay'][@style='display: none;']";
    }
    public static String actionsButtonXpath()
    {
        return "//div[@ng-show='currentpane.selected'][not(contains(@style, 'display: none'))]//li[@ng-repeat]/div/div/a[@fleet-tooltip='Actions']";
    }
     public static String actionsButtonTooltipXpath()
    {
        return "//div[contains(@class,'ng-scope tooltip left in')]/div/span[text()='Actions']";
    }
    
    public static String columnChooserULXpath()
    {
//        return "//ul[contains(@class, 'column-chooser-dropdown')][contains(@style, 'block')]";
        return "//ul[contains(@class, 'column-chooser-dropdown')][contains(@style, 'block')]";
    }
    public static String dataEntriesColumnChooserXpath(String Tabname)
    {
        return "//ul/li/strong[text()='"+Tabname+"']/../../../../../div[@id='hosGrid']//div[@class='row-actions']//a[@ng-click='toggleColumnChooser($event)']";
    }
    public static String columnNameXpath(String ColumnName)
    {
        return "//ul[contains(@style,'display: block;')]//span[text()='"+ColumnName+"']/../span[@ng-hide='column.visible']/../..//a";
    }
    public static String columnChooserXpath()
    {
        return "//div[@ng-show='currentpane.selected'][not(contains(@style, 'display: none'))]//li/div/../../li/a";
    }
    
    public static String editRemoveMenuXpath()
    {
        return "//ul[@class='dropdown-menu pull-right'][not(contains(@style,'display: none'))]";
    }
    
    
    //add inspection
    public static String SpinnerXpath()
    {
       return "//div[@class='loading-overlay'][@style='display: none;']";
    }
    public static String tabLinkXapth(String TabName)
    {
        return "//li/a[text()='"+TabName+"']";
    }
    public static String inspectionSpinnerXapth()
    {
        return "//div[@id='logContent']/div[@class='loading-overlay'][@style='display: none;']";
    }
    public static String addStatusXpath()
    {
        return "//div[@class='tab-pane'][not(@style='display: none;')]//a[@id='hosTabPaneAdd']/i";
    }
    public static String AddLogDataHeadingXpath()
    {
        return "//h5/span[text()='Add log data']";
    }
    public static String CategorytextBoxXpath()
    {
        return "//div//select[@name='eventDataCategory']";
    }
    public static String EventTypeTextBoxXpath()
    {
        return "//div//select[@name='eventType']";
    }
    public static String DateTimeFieldOnAddLogDataModalXpath()
    {
        return "//div[@id='logDataStart']//input";
    }
    public static String RemarksTextAreaXpath()
    {
        return "//form[@name='logDataCrudForm']//div/textarea[@name='remarks']";
    }
    public static String ButtonSaveXpath()
    {
        return "//div[@class='modal hide fade in']//button[text()='Save']";
    }
    public static String ConfirmeventDetailsHeadingXapth()
    {
        return "//h5/span[text()='Confirm event details']";
    }
    public static String ButtonConfirmXpath()
    {
        return "//div[@class='modal hide fade modal-mini in']//button[text()='Confirm']";
    }
    
}
