/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects.Shakedown;

/**
 *
 * @author lmgulwa
 */
public class LiveTrackingPageObject {
    
    public static String leftPaneSpinnerXpath()
    {
        return "//div[@id=\"trWorkerLiveTrackingGrid\"]/../div[contains(@class,'loading-overlay') and contains(@style,'none')]";
    }
    
    public static String btnFindXpath()
    {
        return "//a[@fleet-tooltip=\"Find\"]";
    }
    
    public static String findAPlaceXpath()
    {
        return "//a[text()='Find a place']";
    }
    
    public static String locationRadioButtonXpath()
    {
        return "//div[@class='toolbar-criteria' and not(contains(@style,'none'))]//span[text()='A location']/../input";
    }
    
    public static String locationTextFiledXpath()
    {
        return "//input[@id=\"LocationAutoPlace\"]";
    }
    
    public static String locationSearchPopupXpath(String location)
    {
        return "//ul[contains(@style,'block')]//a[text()='" + location + "']";
    }
    
    public static String drawnShapeXpath()
    {
        return "//*[local-name()='path']";
    }
    
    public static String locationNameTextFieldXpath()
    {
        return "//span[text()='Location name']/../../input";
    }
    
    public static String assetCheckBoxXpath(String asset)
    {
        return "//span[text()='" + asset + "']/../../../../td[@column-field=\"showAssetOnMap\"]//input";
    }
    
    public static String showTrailOnMapLinkXpath()
    {
        return "//ul[contains(@style,'block')]//span[text()='Show trail on map']";
    }
    
    public static String filterXpath()
    {
        return "//div[@class=\"row-fluid\" and not(contains(@style,'none'))]//input[@placeholder=\"Filter\"]";
    }
    
    public static String btnActionsXpath()
    {
        return "//li//a[@fleet-tooltip=\"Actions\"]";
    }
    
    public static String trailOnMapXpath()
    {
        return "//*[local-name()='path' and @marker-end]";
    }
    
    public static String btnEventsXpath()
    {
        return "//a[@fleet-tooltip=\"Events\"]";
    }
    
    public static String btnMapLayersXpath()
    {
        return "//a[@fleet-tooltip=\"Map layers\"]";
    }
    
    public static String eventsOnTrailCheckBoxXpath()
    {
        return "//div[@class='toolbar-criteria' and not(contains(@style,'none'))]//span[text()='Events on trail']/../input";
    }
    
    public static String eventsOnTrailSpanXpath()
    {
        return "//div[@class='toolbar-criteria' and not(contains(@style,'none'))]//span[text()='Events on trail']/../span";
    }
    
    public static String selectEventsFilterBoxXpath()
    {
        return "//div[@name=\"trackingEventsModal\"]//input[@placeholder=\"Filter\"]";
    }    
    
    public static String btnSelectXpath()
    {
        return "//button[text()='Select']";
    }    
    
    public static String eventCheckBoxXpath(String event)
    {
        return "//td[@column-field=\"description\"]//span[contains(text(),'" + event + "')]/../../..//input[@type='checkbox']";
    }    
    
     public static String eventAllCheckBoxXpath()
    {
        return "//div[@class = 'fleet-grid-container-wrapper ng-scope no-vertical-scroll']//input[@ng-checked=\"allRowsSelected && limitedRows.length > 0\"]";
    }  
    
    public static String eventsOnAssetTrailXpath()
    {
        return "//div[contains(@class,'event-icon-blue') and contains(@style,'display: inline')]/i[@class=\"icon-warning-sign icon-white\"]";
    }    
}
