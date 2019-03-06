/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects;

import KeywordDrivenTestFramework.Core.BaseClass;

/**
 *
 * @author smbiko
 */
public class AddPolylineLocationUsingMapProviderDeCartaSearch extends BaseClass
{
    
    public static String ManageMenuRelativeXpath() 
    {
        return "//a[text()='MANAGE ']";
    }
    public static String DatabaseAdministrationRelativeXpath() 
    {
        return "//div[@ng-repeat='module in section.modules']//a[text()='Database administration']";
    }
    public static String TestRSOTreeRelativeXpath() 
    {
        return "//strong[text()='Test RSO']/../../../../span[@class='daredevel-tree-anchor ui-icon icon-plus ng-scope']";
    }
    public static String DVTAutomationOrgRelativeXpath() 
    {
        return "//strong[text()='DVT Automation']";
    }
    public static String MapSettingsXpath() 
    {
        return "//a[text()='Map settings']";
    }
    public static String MapProviderSelectDeCartaXpath() 
    {
        return "//span[text()='Map Provider']//..//../select";
    }
    public static String MapProviderSelectedDeCartaXpath() 
    {
        return "//span[text()='Map Provider']//..//../select/option[@selected='selected']";
    }
    public static String SaveMapSettingsButtonXpath() 
    {
        //return "//button[text()='Save']";
        return "//div/button[@enabled='!saveDisabled']";
    }
    public static String CancelMapSettingsButtonXpath() 
    {
        return "//button[text()='Cancel']";
    }

  
    public static String MonitorMenuRelativeXpath() 
    {
        return "//a[text()='MONITOR ']";
    }
    public static String LiveTrackingXpath() 
    {
        return "//a[text()='Live tracking']";
    }
    
    public static String MapDropdownXpath() 
    {
        return "//a[@fleet-tooltip='Create location']//..//..//..//../div/select";
    }
    public static String MapDropdownStreetXpath() 
    {
        //return "//a[@fleet-tooltip='Create location']//..//..//..//../div/select/option[2]";
//        return "//a[@fleet-tooltip='Create location']//..//..//..//../div/select/option[text()='Google (street)']";
        return "//a[@fleet-tooltip='Create location']//..//..//..//../div/select/option[@value='1']";
    }
    


    public static String ClickCreateLocationXpath() 
    {
        return "//a[@fleet-tooltip='Create location']";
    }    
    public static String ClickCircle() 
    {
        return "//a[@fleet-tooltip='Circle']";
    }  
    public static String ValidateTooltipXPath() 
    {
        return "//span[text()='Click and drag to draw circle.']";
    }        
    public static String PointOneXpath() 
    {
        return "//div[@class='leaflet-control-scale leaflet-control']";
    }            
    public static String PointTwoXpath() 
    {
        return "//div[@class='leaflet-control-scale leaflet-control']/div[2]";
    }  
   
         public static String NetworkImage() 
    {
        return "Network.png";
    } 
    
    public static String IENetworkSearchImg()
    {
        return "IENetworkSearch.PNG";
    }
    
    public static String IEButtonSearchImg()
    {
        return "IEButtonSearch.PNG";
    }
              public static String RectangleImage() 
    {
        return "Rectangle.png";
    } 
         
         
          public static String IENetworkImage() 
    {
        return "IENetwork.png";
    }  
          public static String SecondNetworkImage() 
    {
        return "SecondNetwork.png";
    }  
           public static String CreateLocationImage() 
    {
        return "CreateLocation.png";
    }                   
    public static String CircleLocImage() 
    {
        return "CircleLoc.png";
    }
        public static String point1Image() 
    {
        return "point1Circle.png";
    }
     
        public static String ExtractNameImage() 
    {
        return "ExtractNameImageCircle.png";
    }
        
            public static String point2Image() 
    {
        return "point2Circle.png";
    }
            public static String drawCirclePointImage() 
    {
        return "drawCirclePoint.png";
    }
    
     public static String FireFoxExtractNameImage() 
    {
        return "FireFoxExtractName.png";
    }
     
     public static String FirefoxExtractDecartImg()
     {
         return "FirefoxExtract2.PNG";
     }
     
     public static String IEExtractNameImage() 
    {
        return "IEExtractName1.png";
    }
   
      public static String IEPlayNetworkImage() 
    {
        return "IEPlayNetwork.png";
    }
       public static String IEDeCartaGeocodeImage() 
    {
        return "IEDeCartaGeocodeImage.png";
    }
        public static String IEDeCartaDetailsImage() 
    {
        return "IEDeCartaDetails.png";
    }
           public static String IEDeCartaExtractStringImage() 
    {
        return "IEDeCartaExtractString.png";
    }
                public static String IEDeCartaExtractValueImage() 
    {
        return "IEDeCartaExtractValue.png";
    }
                
                
    public static String ClickPolylineImage() 
    {
        return "ClickPolyline.png";
    }
    
    public static String buttonCreateLocationPolylineXpath() {
        return "//a[@fleet-tooltip='Polyline']";
    }
     
      public static String PolylinePoint1Image() {
        return "PolylinePoint1.png";
    }
      
      public static String PolylineEndPointImg()
      {
          return "ClikEndPointPolyline.PNG";
      }
 
       public static String PolylinePoint2Image() {
        return "PolylinePoint2.png";
    }
        public static String PolylineEndPointImage() {
        return "PolylineEndPoint.png";
    }
          public static String PolylineEndPointFFImage() {
        return "PolylineEndPointFF.png";
    }
 
 
 
}
