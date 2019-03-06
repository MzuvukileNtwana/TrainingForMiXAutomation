/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects;

/**
 *
 * @author lmgulwa
 */
public class LanguageAppliedOnDropdownPageObject {
    
    
    //  <editor-fold defaultstate="collapsed" desc="Navigate to Historical Tracking">
    public static String monitorLinkXpath(String name)
    {
        return "//a[text()='" + name + " ']";
    }
    
    public static String historicalTrackingLinkXpath(String name)
    {
        return "//a[text()='" + name + "']";
    }
    
    //  </editor-fold>
    
    //  <editor-fold defaultstate="collapsed" desc="Validate Dropdown Options">
    
    public static String dateViewXpath()
    {
        return "//a[@ng-click='dateClicked()']";
    }
    
    public static String listViewXpath()
    {
        return "//a[@ng-click='setView('list')']";
    }
    
    public static String dropdownXpath()
    {
        return "//select[@ng-model='listItem']";
    }
    
    public static String dropdownFirefoxXpath()
    {
        return "//select[@ng-model='listItem']//option";
    }
    
    public static String dropdownOptiionsXpath(String name)
    {
        return "//select/option[text()='" + name + "']";
    }   
      
    public static String saveButtonXpath()
    {
        // return "//a[@ng-click=\"save()\"]";
        return "//i[@class='icon-ok icon-white']/..";
    }
    
    public static String toggleXpath()
    {
        //return "//a[@ng-click=\"expandOrCollapseAsset(asset)\"]";
        return "//table/tbody[1]//a[@ng-click='expandOrCollapseAsset(asset)']";
    }
    
    public static String relevantAssetXpath()
    {
        return "//td[contains(@bind-once, 'trip.startTime.date')]";
    }
    
    public static String selectedOption()
    {
        return "//a[@ng-click='dateClicked()']";
    }
    
    public static String leftPaneSpinnerXpath()
    {
        return "//div[@class='left-pane']//div[contains(@class,'loading-overlay') and contains(@style,'none')]";
    }
    
    public static String rightPaneSpinnerXpath()
    {
        return "//div[@class='right-pane']//div[contains(@class,'loading-overlay') and contains(@style,'none')]";
    }
    //  </editor-fold>
    
    //Recently added Xpaths
    public static String dateLinkXpath()
    {
        return "//a[@id = 'fleet-date-range-link']//div[@class = 'pull-left']//i[@class = 'icon-calendar']";
    }

    public static String listIconXpath()
    {
        return "//i[@class='icon-th-list']";
    }

    public static String daysOptions(String text)
    {
        return "//select[@ng-model='listItem']//option[text() = '" + text + "']";
    }
}
