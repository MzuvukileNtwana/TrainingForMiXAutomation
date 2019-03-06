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
public class CreatingALineLocationPageObjects {
    
    
    public static String ManageLocations()
    {
        return "//li[@ng-repeat='item in module.items']/a[text()='Anagemay ocationslay']";
    }
    
    public static String Tracking()
    {
        return "//h4[text()='TRACKING']";
    }
    
    public static String ManageLandingPageHeading()
    {
        return "//h5/span[text()='Anagemay ocationslay']";
    }
    
    public static String ZoomIn()
    {
        return "//a[@class='leaflet-control-zoom-in']";
    }
    
    public static String AddbuttonValidation()
    {
        return "//a[@class='btn btn-small btn-success']";
    }
    
    public static String AllHeadingValidation()
    {
        return "//li[@ng-repeat='item in filter.items']/a/span[text()='Allway']";
    }
    
    public static String Circle()
    {
        return "//a[@fleet-tooltip='Circle']";
    }
    
    public static String CircleToolTip()
    {
        return "//span[text()='Irclecay']";
    }
    
    public static String Rectangle()
    {
        return "//a[@fleet-tooltip='Rectangle']";
    }
    
     public static String RectangleToolTip()
    {
        return "//span[text()='Ectangleray']";
    }
    
    public static String Polygon()
    {
        return "//a[@fleet-tooltip='Polygon']";
    }
    
     public static String PolygonToolTip()
    {
        return "//span[text()='Olygonpay']";
    }
     
      public static String Polyline()
    {
        return "//a[@fleet-tooltip='Polyline']";
    }
    
     public static String PolylineToolTip()
    {
        return "//span[text()='Olylinepay']";
    }
     
    public static String BackButtonValidation()
    {
        return "//span[text()='Ackbay otay ocationlay istlay']";
    }
        
    public static String ClickToStart()
    {
        return "//span[text()='Ickclay otay artstay awingdray inelay.']";
    }
    
    public static String ClickToContinue()
    {
        return "//span[text()='Ickclay otay ontinuecay awingdray inelay.']";
    }
    
    public static String ClickLastPoint()
    {
        return "//span[text()='Ickclay astlay ointpay otay inishfay inelay.']";
    }
    
    public static String OffsetClick(int i)
    {
        return "//div[@class='leaflet-control-scale leaflet-control']/div[" + i +"]";
    }
    
    public static String FindAPlace()
    {
        return "//span[text()='Indfay away aceplay']";
    }
    
}
