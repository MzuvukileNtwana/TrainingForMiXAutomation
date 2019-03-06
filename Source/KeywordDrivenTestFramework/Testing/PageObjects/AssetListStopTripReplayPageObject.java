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
public class AssetListStopTripReplayPageObject {
        
    public static String selectedMapProviderXpath()
    {
        return "//select[@ng-model=\"mapProvider\"]";
    }
    
    public static String toggleXpath()
    {
        return "//tbody[1]//i[contains(@class, 'icon-plus')]/../../a[@ng-click='expandOrCollapseAsset(asset)']";
    }
    
    public static String toggleMinusXpath()
    {
        return "//tbody[1]//i[contains(@class, 'icon-minus')]/../../a[@ng-click='expandOrCollapseAsset(asset)']";
    }
    
    public static String actionsButtonXpath()
    {
        return "//tbody[1]/tr[1]//div[not(@ng-show='asset.expanded && enableVehicleLevelTrips')]/a[@class=\"btn-actions dropdown-toggle\"]";
    }
    
    public static String showOnMapOptionXpath()
    {
        return "//tbody[1]//span[text()='Show on map']/../../a[@ng-hide='trip.visible']";
    }
    
    public static String tripXpath()
    {
        return "//*[local-name()='path'][@stroke-linejoin='round'][@marker-end]";
    }
    
    //Whole trip has 'marker-end' attribute
    public static String wholeTripXpath()
    {
        //return "//*[local-name()='path'][contains(@marker-end, 'url')]";
        return "//*[local-name()='path'][@stroke-linejoin=\"round\"]";
    }
    
    public static String pauseButtonXpath()
    {
        return "//i[@class=\"icon-pause\"]";
    }
    
    public static String playButtonXpath()
    {
        return "//a[@ng-click=\"togglePlayPause()\"]";
    }
    
    public static String stopButtonXpath()
    {
        return "//a[@ng-click=\"replay.stop()\"]";
    }
    
    public static String selectedOptionXpath()
    {
        return "//a[@ng-click=\"dateClicked()\"]";
    }
     public static String SpinnerWait()
    {
        return "//div[@class='loading-overlay ng-scope'][@style='display: none;']";
    }
    public static String replayDateTimeXpath()
    {
        return "//div[@class=\"map-replay\"]/span";
        //return "css=\"div#replayProgress span\" ";
    }
    
    public static String halfTripXpath()
    {
        return "//*[local-name()='path'][not(@stroke-linejoin=\"round\")][1]";
    }
    
    public static String dropdownXpath()
    {
        return "//select[@ng-model=\"listItem\"]";
    }
    
    public static String saveButtonXpath()
    {
        return "//a[@ng-click=\"save()\"]";
    }
    
    public static String dynamixTestUnitOrgXpath(String org)
    {
        return "//strong[text()='" + org + "']/..";
    }
    
    public static String mapSetXpath()
    {
        return "//select[@name='mapProvider']";
    }
    
    public static String selectedSpeedXpath()
    {
        return "//select[@ng-model=\"replaySpeed\"]";
    }
    
    public static String MapProviderDropdownXpath()
    {
        return "//select[@name='mapProvider']/option[@selected='selected'][text()='google']";
    }
    public static String textMapProviderDropdownXpath()
    {
        return "//select[@name='mapProvider']";
    }
    
}
