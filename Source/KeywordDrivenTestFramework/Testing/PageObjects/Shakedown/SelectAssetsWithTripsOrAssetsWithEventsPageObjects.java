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
public class SelectAssetsWithTripsOrAssetsWithEventsPageObjects {
    
    
    public static String AssetsWithTripsAndEvents(String name)
    {
        return "//span[text()='"+name+"']/../input";
        //Assets with trips
        //Assets with events
    }
    
    public static String TripsCount()
    {
        return "//tbody[@ng-repeat='asset in assets']//a[@ng-show='asset.hasTrips'][not (contains(@style,'display: none;'))]";
    }
    
    public static String TotalNumberOfRows()
    {
        return "//tbody[@ng-repeat='asset in assets']/tr";
    }
    
    public static String TotalDistanceSort()
    {
        return "//span[contains(text(),'Total distance')]";
    }
    
    public static String TotalDistanceRetrieval(int number)
    {
        return "//tbody[@ng-repeat='asset in assets']["+number+"]//td[7]";
    }
    
    public static String AssetDescriptionRetrieval(String number)
    {
        return "//tbody[1][@ng-repeat='asset in assets']//td[4]";
    }
    
    public static String EventsCount()
    {
        return "//tbody[@ng-repeat='asset in assets']//i[@class='icon-warning-sign']";
    }
    
    public static String AssetName(int number)
    {
        return "//tbody["+number+"][@ng-repeat='asset in assets']//td[4]";
    }
    
    public static String EventTotalPerAsset(int number)
    {
        return "//tbody[@ng-repeat='asset in assets']["+number+"]//td[2]";
    }
    
    
    
}
