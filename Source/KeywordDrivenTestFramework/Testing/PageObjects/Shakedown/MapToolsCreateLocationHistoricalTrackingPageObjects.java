/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects.Shakedown;

/**
 *
 * @author sscholtz
 */
public class MapToolsCreateLocationHistoricalTrackingPageObjects {
    
    
    public static String HistoricalTrackingSpinner()
    {
        return "//div[@class='loading-overlay ng-scope'][@style='display: none;']";
    }
    
    public static String MapSpinner()
    {
        return "//div[@class='right-pane']//div[@style=\"display: none;\"][@ng-show='isMapLoading']";
    }
    
    public static String CreateLocationIcon()
    {
        return "//a[@fleet-tooltip='Create location']";
    }
    
    public static String CreatelocationCircle()
    {
        return "//a[@ng-click=\"createLocation('circle')\"]";
    }
    
    public static String LocationName()
    {
        return "//span[text()='Location name']/../../input";
    }
    
    public static String LocationType()
    {
        return "//select[@name='type']/option[text()='Site']";
    }
    
    public static String LocationSite()
    {
        return "//select[@name='siteId']/option[text()='Default Site']";
    }
    
    public static String SaveButton()
    {
        return "//div[@class='pull-right']//button[text()='Save']";
    }
    
    public static String SaveMessageAppearance()
    {
        return "//span[text()='Location successfully created']";
    }
    
    public static String MessageDisappearance()
    {
        return "//div[@style='display: none;'][@class='notification-wrapper notification-modal ng-scope']";
    }
    
    public static String ManageLocationSpinner()
    {
        return "//div[@class='row-fluid container-fixed-right']/div[@style='display: none;'][@class='loading-overlay ng-scope']";
    }
    
    public static String Filter()
    {
        return "//input[@placeholder='Filter']";
    }
    
    public static String ActionButton()
    {
        return "//a[@fleet-tooltip='Actions']";
    }
    
    public static String LocationNameCheck(String name)
    {
        return "//span[text()='"+name+"']";
    }
    
    public static String Remove()
    {
        return "//span[text()='Remove']";
    }
    
    public static String RemoveLocation(String name)
    {
        return "//strong[text()='"+name+"']";
    }
    
    public static String RemoveLocationHeading()
    {
        return "//span[text()='Remove location']";
    }
    
    public static String RemoveButton()
    {
        return "//div[@class='modal hide fade ng-scope modal-mini in']//button[text()='Remove']";
    }
    
    public static String RemoveMessageAppearance()
    {
        return "//span[text()='Location removed successfully']";
    }
    
    //Locations icon historicatl tracking page
    public static String locationsIconXpath()
    {
        return "//div[@class='selection-criteria']//a[@fleet-tooltip='Locations']";
    }
    
    //select locations window heading
    public static String windowHeading()
    {
        return "//h5//span[text()='Select locations']";
    }
    
    //all locations checkbox
    public static String allLocationsCheckboxXpath()
    {
        return "//tr//th//input[@ng-checked='allRowsSelected && limitedRows.length > 0']";
    }
    
    //Select button
    public static String selectButton()
    {
        return "//button[text()='Select']";
    }
    
    //close button
    public static String closeButtonXpath()
    {
        return "//div[@header-title='Select locations']//button[text()='×']";
    }
}
