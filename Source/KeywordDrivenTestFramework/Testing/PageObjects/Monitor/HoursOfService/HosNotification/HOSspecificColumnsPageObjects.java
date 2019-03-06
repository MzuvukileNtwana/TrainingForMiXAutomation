/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects.Monitor.HoursOfService.HosNotification;

/**
 *
 * @author elebese
 */
public class HOSspecificColumnsPageObjects 
{
    public static String SpanCountXpath(String column) 
    {
        return "//ul[@class='dropdown-menu grid-column-chooser'][contains(@style,'block')]/li//span[text()='"+column+"']/../span";
    }
    
    public static String ColumnsToClickXpath(String column) 
    {
        return "//ul[@class='dropdown-menu grid-column-chooser'][contains(@style,'block')]/li//span[text()='"+column+"']";
    }
    
    public static String HeaderXpath() 
    {
        return "//span[text()='Drivers']";
    }
    
    public static String EditButtonXpath() 
    {
        return "//i[@class='icon-edit']/..";
    }
    
    public static String TimezoneXpath() 
    {
        return "//span[text()='Selected timezone']/../../select[@name='siteTimeZones']";
    }
    
    public static String SiteXpath(String site) 
    {
        return "//span[text()='"+site+"']";
    }
    
    public static String OrgGroupLoaderXpath() 
    {
        return "//div[@class='tree-sub-items ng-scope']/../../..//div[@class='loading-overlay ng-scope'][@style='display: none;']";
    }
    
    public static String ColumnDataXpath(String column) 
    {
        //return "//span[text()='"+column+"']/../../div[@class='cell alt']";
        return "//div[@name='driverListGrid']//span[text()='"+column+"']/../../div/../div[contains(@class,'cell')]";
    }
}
