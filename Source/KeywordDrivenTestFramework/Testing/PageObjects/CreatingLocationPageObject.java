/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects;

import static KeywordDrivenTestFramework.Core.BaseClass.currentEnvironment;

/**
 *
 * @author lmgulwa
 */
public class CreatingLocationPageObject {

    //  <editor-fold defaultstate="collapsed" desc="Login Page">
    
    public static String MixTelematicsURL() {
        return currentEnvironment.PageUrl;
    }
    
    public static String selectLanguageXPath()
    {
        return "//select[@ng-model='selectedLanguage']//option";
    }
    
    public static String selectLanguageFirefoxXPath()
    {
        return "//option[text()='Igpay Atinlay']";
    }
    
    public static String chosenLanguageOptionXPath(String language)
    {
        return "//select[@ng-model='selectedLanguage']/option[text()='" + language + "']";        
    } 
    
    public static String usernameXPath(String usernameLabelText)
    {
        return "//label/strong[text()='" + usernameLabelText + "']//../././../div/input";
    }
    
    public static String passwordXPath(String passwordLabelText)
    {
        return "//label/strong[text()='" + passwordLabelText + "']/../../div/input";
    }
    
    public static String loginButtonXPath(String loginButtonText)
    {
        return "//button[text()='" + loginButtonText + "']";
    }
    
    public static String welcomeXPath()
    {
        return "//div/strong";
    }
    
    //  </editor-fold>
    
    public static String monitorXpath()
    {
        return "//a[text()='Onitormay ']";
    }
    
    public static String liveTrackingLinkXpath()
    {
        return "//a[text()='Ivelay ackingtray']";
    }
    
    public static String historicalTrackingLinkXpath()
    {
        return "//a[text()='Istoricalhay ackingtray']";
    }
    
    public static String manageLocationLinkXpath()
    {
        return "//a[text()='Anagemay ocationslay']";
    }
    
    public static String assetGridXpath()
    {
        return "//table[contains(@class, 'table-list')]/../../div[contains(@class, 'has-row-actions')]";
    }
    
    public static String mapXpath()
    {
        return "//div[@class='leaflet-container leaflet-fade-anim']";
    }
    
    public static String mapToolBarXpath()
    {
        return "//div[contains (@class, 'tracking-docked-toolbar')]";
    }
    
    public static String selectAssetBarXpath()
    {
        return "//span[contains(.,'MiX2000')]/../../../../td[@ng-show='column.visible']/div/span/input";
    }
    
    public static String createLocationIconXpath()
    {
        return "//i[contains (@class, 'icon-shapes')]/..";
    }
    
    public static String circleIconXpath()
    {
        return "//i[@class='icon-shape-circle']/..";
    }
    
    public static String rectangleIconXpath()
    {
        return "//i[@class='icon-shape-rectangle']/..";
    }
    
    public static String polygonIconXpath()
    {
        return "//i[@class='icon-shape-custom']/..";
    }
    
    public static String lineSegmentIconXpath()
    {
        return "//i[@class='icon-shape-line']/..";
    }
    
    public static String locationNameXpath()
    {
        return "//span[text()='Ocationlay amenay']/../../input";
    }
    
    public static String drawnShapeXpath()
    {
        return "//*[local-name()='path']";
    }
    
    public static String specificLocationOnMapXpath(String location)
    {
        return "//*[text()='"+location+"']/..//*[local-name()='path']";
    }
    public static String specificLocationLabelOnMapXpath(String location)
    {
        return "//*[text()='"+location+"']";
    }
    public static String locationsFilterXpath()
    {
        return "//div[@class='modal hide fade in']//input[@type='text']";
    }
    
    public static String locationLabelsCheckboxXpath()
    {
        return "//span[text()='Location labels']/../div";
    }
    
    public static String locationTypeXpath()
    {
        return "//span[text()='Ocationlay ypetay']/../../select";
    }
    
    public static String siteTypeXpath()
    {
        return "//span[text()='Itesay']/../../select";
    }
    
    public static String locationColourXpath()
    {
        return "//label[text()='Ocationlay olourcay']/..";
    }
    
    public static String opacityXpath()
    {
        return "//label[text()='Opacityway']/..";
    }
    
    public static String HOSLocationIdXpath()
    {
        return "//label[text()='Oshay ocationlay Idway']/..";
    }
    
    public static String PointOneXpath() 
    {
        return "//div[@class='leaflet-control-scale leaflet-control']";
    }    
                
    public static String PointTwoXpath() 
    {
        return "//div[@class='leaflet-control-scale leaflet-control']/div[2]";
    }  
    
    public static String mouseCrosshairXpath() 
    {
        return "//div[contains(@class, 'leaflet-container')][contains(@style, 'cursor: crosshair')]";
    }  
    
    //  <editor-fold defaultstate="collapsed" desc="Location type fields">
    
    public static String customerFieldXpath() 
    {
        return "//select/option[text()='Ustomercay']";
    } 
    
    public static String noGoZoneFieldXpath() 
    {
        return "//select/option[text()='Onay-ogay onezay']";
    }
    
    public static String siteFieldXpath() 
    {
        return "//select/option[text()='Itesay']";
    }
    
    public static String otherFieldXpath() 
    {
        return "//select/option[text()='Otherway']";
    }
    
    public static String streetPolylineFieldXpath() 
    {
        return "//select/option[text()='Eetstray Olylinepay']";
    }
    
    public static String fuelStopFieldXpath() 
    {
        return "//select/option[text()='Uelfay opstay']";
    }
    
    public static String restStopFieldXpath() 
    {
        return "//select/option[text()='Estray opstay']";
    }
    
    public static String speedZoneFieldXpath() 
    {
        return "//select/option[text()='Eedspay onezay']";
    }
    // </editor-fold>
}
