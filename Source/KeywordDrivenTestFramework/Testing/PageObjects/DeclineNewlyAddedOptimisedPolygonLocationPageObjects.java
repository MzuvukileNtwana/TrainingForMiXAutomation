/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects;

/**
 *
 * @author sscholtz
 */
public class DeclineNewlyAddedOptimisedPolygonLocationPageObjects {
    
    public static String ManageLocations()
    {
        return "//li/a[text()='Manage locations']";
    }
    
     public static String AllHeadingValidation()
    {
        return "//li[@ng-repeat='item in filter.items']/a/span[text()='All']";
    }
     
     public static String FindAPlace()
    {
        return "//span[text()='Find a place']";
    }
    
     public static String ByAnAddressRadioButton()
     {
        return "//input[@type='radio'][@value='address']"; 
     }
     
     public static String Address()
     {
         return "//input[@placeholder='Enter address']";
     }
     
     public static String LocationSelection()
     {
         return "//a[text()='Cape Town, South Africa']";
     }
     
     public static String LocationOnMap()
     {
         return "//img[@class='leaflet-marker-icon leaflet-zoom-animated leaflet-clickable']";
     }
    
     public static String ZoomIn()
     {
         return "//a[@title='Zoom in']";
     }
     
     public static String Polygon()
     {
         return "//a[@fleet-tooltip='Polygon']";
     }
     
     public static String ClickToStart()
     {
         return "//span[text()='Click to start drawing shape.']";
     }

    public static String  LocationCreated()
    {
         return "//span[text()='Location successfully created']";
    }
    
    public static String LocationFilter()
    {
        return "//input[@placeholder='Filter']";
    }
    
    public static String ActionButton()
    {
        return "//a[@fleet-tooltip='Actions']";
    }
    
    public static String RemoveButton()
    {
        return "//span[text()='Remove']";
    }
    
    public static String ConfirmRemove()
    {
        return "//DIV[@name='removeLocationConfirmation']/div[@class='modal-footer']/button[text()='Remove']";
    }
}
