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
public class TrackingShowOnTripTimelinePageObjects {
    
    public static String ExpandAsset()
    {
        return "//i[@class='icon-grey icon-plus']";
    }
    
    public static String TripStart()
    {
        return "//tbody[@ng-repeat='trip in asset.trips'][1]//td[3]";
    }
    
    public static String TripEnd()
    {
        return "//tbody[@ng-repeat='trip in asset.trips'][1]//td[4]";
    }
    
    public static String ShowOnTripTimeline()
    {
        return "//table[@class='table table-condensed no-margin']/tbody[1]//a[@class='btn-actions dropdown-toggle']/../..//span[text()='Show on trip timeline']";
    }
    
    public static String TripTimelineSpinner2()
    {
        return "//div[@class='row-fluid container-fixed-right container-timeline']/div[@class='loading-overlay'][@style='display: none;']";
    }
    
    public static String TripTimelineSpinner()
    {
        return "//div[@class='timeline-content']/div[@class='loading-overlay'][@style='display: none;']";
    }
    
    public static String DateHoveringOff()
    {
        return "//div[@class='current-date']/span[@class='text ng-binding']";
    }
    
    public static String StartDate()
    {
        return "//div[text()='Asset 3']/..//strong[text()='Start date']/..";
    }
    
    public static String EndDate()
    {
        return "//div[text()='Asset 3']/..//strong[text()='End date']/..";
    }
    
    public static String TachoGraphButton()
    {
        return "//i[@class='icon-tacho']";
    }
}
