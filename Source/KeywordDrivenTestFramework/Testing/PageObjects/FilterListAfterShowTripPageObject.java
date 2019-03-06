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
public class FilterListAfterShowTripPageObject {
    
    public static String actionsButtonXpath()
    {
        return "//tbody[1]/tr//div[not(@ng-show='asset.expanded && enableVehicleLevelTrips')]/a[@class=\"btn-actions dropdown-toggle\"]";
    }
    
    public static String showOnMapOptionXpath()
    {
        return "//tbody[1]//span[text()='Show on map']/../../a[@ng-hide='trip.visible']";
    }
    
    public static String textBoxFilterXpath()
    {
        return "//input[@ng-model=\"filterQuery.text\"]";
    }
    
    public static String buttonFilterXpath()
    {
        return "//button[@ng-click=\"queryParametersChanged()\"]";    
    } 
    
    public static String filteredAssetXpath()
    {
        return "//td[@bind-once=\"asset.description\"]";
    }
    
    public static String tripsDateXpath()
    {
        return "//td[contains(@bind-once, 'trip.startTime.date')]";
    }
    
    public static String rightPaneSpinnerXpath()
    {
        return "//div[@class='right-pane']//div[contains(@class, 'loading-overlay')][@style='display: none;']";
    }
    
    public static String leftPaneSpinnerXpath()
    {
        return "//div[@class='left-pane']//div[contains(@class, 'loading-overlay')][@style='display: none;']";
    }
}
