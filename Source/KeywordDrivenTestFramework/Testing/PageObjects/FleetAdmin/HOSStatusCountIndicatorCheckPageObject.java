/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects.FleetAdmin;

/**
 *
 * @author lmgulwa
 */
public class HOSStatusCountIndicatorCheckPageObject {
    public static String leftGridSpinnerXpath()
    {
        return "//div[contains(@class,'container-left')]//div[@class='loading-overlay'][@style='display: none;']";
    }
    
    public static String rightGridSpinnerXpath()
    {
        return "//div[contains(@class,'container-right')]//div[@class='loading-overlay'][@style='display: none;']";
    }
    
    public static String btnActionsXpath()
    {
        return "//div/a[@class=\"row-action\"]";
    }
    
    public static String counterIconXpath(String filter)
    {
        return "//span[text()='" + filter + "']/../span[contains(@class,'badge-grey')]";
    }
    
    public static String btnNextXpath()
    {
        return "//button[@fleet-tooltip=\"Next page\"]";
    }
    
    public static String driverStatusXpath(String column, int row)
    {
        return "//div[contains(@class,'column-heading')]/span[text()='" + column + "']/../../div[@row='" + row + "']";
    }
    
    public static String columnXpath(String column)
    {
        return "//div[contains(@class,'column-heading')]/span[text()='" + column + "']";
    }
    
    public static String columnChooserXpath()
    {
        return "//a[contains(@class,'column-chooser')]";
    }
    
    public static String columnChooserULXpath()
    {
        return "//ul[contains(@class, 'column-chooser')][contains(@style, 'block')]";
    }    
    
    public static String currentStatusOnColumnChooserXpath()
    {
        return "//ul[contains(@style,'block')]//a[@column-field=\"hosAvailableHours.currentStatus\"]";
    }  
}
