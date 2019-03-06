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
public class OptimisePolygonPageObject {
   
    //  <editor-fold defaultstate="collapsed" desc="Add Location">
    
    public static String addLocationButtonXpath()
    {
        return "//i[contains(@class, 'icon-plus')]/..";
    }
    
    public static String findPlaceXpath()
    {
        return "//div[@class='left-pane']//span[text()='Find a place']";
    }
    
    public static String addressRadioButtonXpath()
    {
        return "//span[text()='An address']/../input";
    }
     
    public static String addressTextBoxXpath()
    {
        return "//input[@placeholder='Enter address']";
    }
     
    //Might be more than one results returned depending on the supplied text parameter (cater for that in code)
    public static String resultBasedOnAddressSearchXpath(String text)
    {
        return "//a[contains(text(), '" + text + "')]";
    }
    
    public static String crosshairMouseXpath()
    {
        return "//div[contains(@style, 'cursor: crosshair')]";
    }
    
    public static String addressPlottedOnMapXpath()
    {
        return "//div/img[contains(@class, 'leaflet-marker-icon')]";
    } 
    
    public static String polygonButtonXpath()
    {
        return "//i[@class='icon-shape-custom']/..";
    } 
    
    public static String zoomInButtonXpath()
    {
        return "//a[text()='+']";
    } 
    
    public static String tooltipClickAndDragXpath()
    {
        return "//span[text()='Click to start drawing shape.']";
    }
    
    public static String targetLocationXpath(int index)
    {
        return "//div[@class='leaflet-control-scale-line'][" + index + "]";
    }
    
    //  </editor-fold>
}
