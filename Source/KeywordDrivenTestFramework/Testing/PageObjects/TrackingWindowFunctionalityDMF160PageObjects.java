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
public class TrackingWindowFunctionalityDMF160PageObjects {
    public static String pageNameXpath(){
        return "//h5[@ui-if='!url']/span";
    }
    
    public static String mapXpath(){
        return "//*[local-name()='svg']";
    }
    
    public static String zoomInXpath(){
        return "//a[@class='leaflet-control-zoom-in']";
    }
    
    public static String zoomOutXpath(){
        return "//a[@class='leaflet-control-zoom-out']";
    }
}
