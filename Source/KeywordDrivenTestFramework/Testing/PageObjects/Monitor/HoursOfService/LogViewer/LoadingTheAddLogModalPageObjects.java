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
public class LoadingTheAddLogModalPageObjects extends BaseClass
{
    public static String hosTimelineGraphSectionXpath()
    {
        return "//div[@class='us-hos-series-container']";
    }
    public static String menuPopupXpath()
    {
        return "//ul[@id='menuPopup']";
    }
    public static String addStatusLinkPopupXpath()
    {
        return "//a//span[text()='Add status']";
    }
    public static String addLogDataLinkPopupXpath()
    {
        return "//a//span[text()='Add log data']";
    }
    public static String addLogDataModalXpath()
    {
        return "//div[@header-title='Add log data']";
    }
    public static String addLogDataModalCancelButtonXpath()
    {
        return "//button[text()='Cancel']";
    }
    public static String inputDataLinkXpath()
    {
        return "//li//a[text()='Input data']";
    }
    public static String greenAddLogButtonXpath()
    {
        return "//div[@class='tab-pane'][not(contains(@style, 'none'))]/div/div/div/a[@fleet-tooltip='Add log data']";
    }
    public static String spinnerHOSTimelineXpath()
    {
        return "//div[@class='timeline-content ng-scope']/div[@class='loading-overlay'][@style='display: none;']";
    }
    public static String HOSLogViewerTableSpinnerXpath()
    {
        return "//div[@ng-repeat='tabpane in tabPanes'][1]/div[@ng-show='currentpane.selected'][1]/div[@id='hosGrid']/div[1]/div[@columns='currentpane.hosGridColumns'][1]//div[@class='fleet-grid full-height has-row-actions']/div[@class='loading-overlay ng-scope'][@style='display: none;']";
    }
    
    public static String spinnerLogViewerXpath()
    {
        return "//div[@class='loading-overlay'][@style='display: none;']";
    }
    public static String eventCategoryXpath()
    {
        return "//select[@name='eventDataCategory']";
    }
    public static String eventTypeXpath()
    {
        return "//select[@name='eventType']";
    }
    public static String eventStartDateTimeXpath()
    {
        return "//div[@dmx-validate='logData.startDateTime.date']";
    }
    public static String remarksXpath()
    {
        return "//textarea[@ng-model='logData.remarks']";
    }
    public static String  driverNameInputBoxXpath()
    {
        return "//div[@header-title='Add log data']//input[@name='driverName']";
    }
    
    public static String timelinePageHeaderXpath()
    {
        return "//span[text()='HOS timeline']";
    }
    public static String driverLogViewButtonXpath()
    {
        return "//a[@fleet-tooltip='Driver log view']//i[@class='icon-tasks']";
    }
   
    
    
}
