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
public class TrackingMapToolsQueryPointPageObjects {
    
    
    public static String Toolbar()
    {
        return "//div[@class=\"tracking-docked-toolbar btn-inverse\"]";
    }
    
    public static String MapTools()
    {
        return "//div[@class=\"tracking-docked-toolbar btn-inverse\"]//a[@fleet-tooltip='Map tools']";
    }
    
    public static String QueryPointButton()
    {
        return "//a[@fleet-tooltip=\"Query point on map\"]";
    }
    
    public static String PopUp()
    {
        return "//div[@class='leaflet-popup-content-wrapper']";
    }
}
