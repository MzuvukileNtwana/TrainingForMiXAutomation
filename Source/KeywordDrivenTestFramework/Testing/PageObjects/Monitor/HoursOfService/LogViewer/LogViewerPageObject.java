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
public class LogViewerPageObject {
    
    public static String logViewPageHeaderXpath()
    {
        return "//h5/span[text()='HOS Log Viewer']";
    }
    
    public static String logViewPageSpinnerXpath()
    {
        return "//div[@id=\"logContent\"]/div[contains(@class,'loading-overlay')][@style='display: none;']";
    }
    
    public static String tabXpath(String tab)
    {
        return "//a[text()='" + tab + "']";
    }
    
    public static String violationTabSpinnerXpath()
    {
        return "//strong[text()='Violations']/../../../../../div[@id='hosGrid']/div[contains(@class,'loading-overlay')][contains(@style,'none')]";
    }
    
    public static String columnHeadersXpath(String header)
    {
        return "//strong[text()='Violations']/../../../../..//span[text()='" + header + "']";
    }
    
    public static String violationTabHeaderNumberXpath()
    {
        return "//strong[text()='Violations']/../..//span[contains(@class,'badge-grey')]";
    }
    
    public static String columnHeaderFromColumnChooserXpath(String header)
    {
        return "//ul[contains(@class,'dropdown-menu') and contains(@style,'block')]//span[text()='" + header + "']/../i[contains(@style,'none')]";
    }
    
    public static String columnChooserXpath(String tab)
    {
        return "//strong[text()='" + tab + "']/../../../../..//div[@class=\"row-actions\" and not(contains(@style,'none'))]//i[@class=\"icon-choose-columns\"]/..";
    }
    
    public static String violationTableRowsXpath()
    {
        return "//strong[text()='Violations']/../../../../..//tbody/tr";
    }
    
    public static String assetULPopPupXpath()
    {
        return "//ul[@class=\"typeahead dropdown-menu\" and contains(@style,'block')]//a";
    }
    
    public static String btnAddStatusEventXpath()
    {
        return "//div[@class='tab-pane' and not(contains(@style,'none'))]//a[@id=\"hosTabPaneAdd\"]";
    }
    
    public static String driverStatusModalXpath()
    {
        return "//div[@id=\"driverStatusModal\" and contains(@style,'block')]";
    }
    
    public static String statusDropdownXpath()
    {
        return "//select[@name=\"workState\"]/option";
    }
    
    public static String statusSelectDropdownXpath()
    {
        return "//select[@name=\"workState\"]";
    }
    
    public static String remarksTextAreaXpath()
    {
        return "//form[@name=\"driverStatusCrudForm\"]//textarea[@name=\"remarks\"]";
    }
    
    public static String changeAssetLinkXpath()
    {
        return "//form[@name=\"driverStatusCrudForm\"]//a[text()='Change asset']";
    }
    
    public static String asseTextFieldXpath()
    {
        return "//div[@class=\"driverStatusAutoComplete\" and not(contains(@style,'none'))]//input";
    }
    
    public static String driverStatusMapModalXpath()
    {
        return "//div[@name=\"hosStatusMapModal\" and contains(@style,'block')]";
    }
    
    public static String driverStatusConfirmModalXpath()
    {
        return "//div[@name=\"hosStatusConfirmModal\" and contains(@style,'block')]";
    }
    
    public static String btnConfirmXpath()
    {
        return "//button[text()='Confirm']";
    }
    
    public static String btnNextXpath()
    {
        return "//button[text()='Next']";
    }
}
