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
public class RemoveEventButtonPageObjects extends BaseClass
{
    public static String hosTimelinePageSpinner()
    {
        return "//div[@class='timeline-content ng-scope']//div[@class='loading-overlay'][@style='display: none;']";
    }
    
    public static String removeButton()
    {
        return "//a[@fleet-tooltip='Remove event']/i[@class='icon-remove-sign icon-red']";
    }
    
    public static String removeButtonNotAvailable()
    {
        return "//a[@fleet-tooltip='Remove event']/i[@class='icon-remove-sign icon-red']/../../a[@fleet-tooltip=\"Remove event\"]";
    }
    
    public static String eventNotHighlightedXpath()
    {
        return "//div[1][@class='series-container ng-scope selectable']//span/../..";
    }
    public static String eventHighlightedXpath()
    {
        return "//div[1][@class='series-container ng-scope selectable selected']//span/../..";
    }
    public static String selectedEventXpath()
    {
        return "//div[1][@class='series-container ng-scope selectable selected']/div/span";
    }
    public static String addRemovedEventXpath()
    {
        return "//div[@class='pull-right dropdown selection-criteria']/a[@fleet-tooltip='Events']";
    }
    public static String selectedEventsModalHeaderXpath()
    {
        return "//h5/span[text()='Select events']";
    }
    public static String filterEventsXpath()
    {
        return "//div[@class='input-reset-wrapper mb-5']/input[@placeholder='Filter']";
    }
    public static String checkboxForEventXpath(String eventText)
    {
//        return "//table[@class='table table-scroll table-condensed table-list no-text-clip']/tbody/tr[1]/td/input[@type='checkbox']";
        return "//td//div//span[text()='" +eventText+ "']/../../../td/input[@type='checkbox']";
    }
    public static String selectEventButtonXpath()
    {
        return "//button[text()='Select']";
    }
    public static String verifyEventRemovedXpath(String eventText)
    {
        return "//div[@class='series-container ng-scope selectable']//span[text()='" +eventText+ "']";
        
    }
    public static String waitForSpinner()
    {
       return "//div[@class='well well-white no-margin timeline-well no-padding']/div[@class='row-fluid'][@style='display: none;']"; 
    }
    
    public static String numberOfEventsBefore()
    {
        return "//a[@fleet-tooltip='Events']//span[@class='badge badge-success font-normal ng-binding']";
    }
}
