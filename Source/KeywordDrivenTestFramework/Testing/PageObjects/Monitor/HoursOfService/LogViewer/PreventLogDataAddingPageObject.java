/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects.Monitor.HoursOfService.LogViewer;

/**
 *
 * @author lmgulwa
 */
public class PreventLogDataAddingPageObject {
    
    public static String logContentSpinnerXpath()
    {
        return "//div[@id=\"logContent\"]/div[contains(@class, 'loading-overlay')][contains(@style, 'none')]";
    }
    
    public static String logTabsXpath(String tab)
    {
        return "//a[text()='" + tab + "']";
    }
    
    public static String btnAddLogDataXpath(String tabHeader)
    {
        return "//strong[text()='" + tabHeader + "']/../../..//a[@fleet-tooltip=\"Add log data\"]";
    }
    
    public static String addLogDataPopupHeaderXpath(String header)
    {
        return "//h5/span[text()='" + header + "']";
    }
    
    public static String editStatusPopupXpath()
    {
        return "//ul[@id=\"menuPopup\"]/li";
    }
}
