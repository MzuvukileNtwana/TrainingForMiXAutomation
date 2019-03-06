/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects;

/**
 *
 * @author apeter
 */
public class GoogleHybridMapViewPageObjects {
    public static String selectXpath(){
        return "//select[@ng-model='mapProvider']";
    }
    
    public static String selectOptionXpath(int opt){
        return "//select[@ng-model='mapProvider']/option["+opt+"]";
    }
    
    
    public static String WaitforDivXpath(){
        return "//div[@id='trAssetLiveTrackingGrid']//div[@class='fleet-grid-container strong-grid']";
    }
    
    public static String TrackingXpath(){
        return "//div[@class='tracking-docked-toolbar btn-inverse']";
    }
    
    public static String BlueTruckXpath(){
        return "//i[contains(@class,'marker-icon-blue')]";
    }
    
    public static String LatitudeXpath(){
        return "//span[@class='labelFirst'][contains(text(),'Latitude')]";
    }
    
     public static String mapXpath(){
        return "//*[local-name()='svg']";
    }
     
     public static String discardXpath(){
         return "//div[@class=\"modal-footer\"]/div/button[@type='submit']";
     }
     
     public static String streetViewValidationXpath(){
        return "//span[text()='Map data ©2016 AfriGIS (Pty) Ltd, Google']";
    }
     public static String googleHybridValidationXpath()
     {
         return "//span[text()='Map data ©2017 AfriGIS (Pty) Ltd, Google  Imagery ©2017 CNES / Astrium, DigitalGlobe']";
         //return "//span[contains(text(), '©2017')]";
     }
     
     public static String fleetGridLoadingSpinner(){
        return "//div[@class=\"tracking-search-container strong-grid mt-44\"]/div[@class='loading-overlay ng-scope'][@style='display: none;']";
    }
     
     public static String spinner()
     {
         return "//div[@ng-show=\"leftPanel == 'assetList'\" and @class=\"row-fluid\"]//div[@class=\"fleet-grid-container strong-grid\"]/div[@class=\"loading-overlay ng-scope\"][@style=\"display: none;\"]";
     }
}
