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
public class AddLocationCircleRectangleOrPolygonHistoricalTracking extends BaseClass
{
    public static String MonitorXpath() 
    {
        return "//a[text()='MONITOR ']";
    }
    public static String HistoricalTrackingXpath() 
    {
        return "//a[text()='Historical tracking']";
    }
    public static String ManageLocationsXpath() 
    {
        return "//a[text()='Manage locations']";
    }
    public static String AssetGridXpath() 
    {
        return "//div[@ng-class ='mobitechTrackingClass()']/../..";
    }
    public static String PreferredMapXpath() 
    {
        return "//div[@class='leaflet-container leaflet-fade-anim']/../../..";
    }
    public static String PreferredMapGoogleXpath() 
    {
        return "//select[@ng-model='mapProvider']/option[text()='Google (street)']";
    }
    
    public static String AddLocationIconXpath()
    {
        return "//a[@fleet-tooltip='Add location']";
    }
    public static String CreateLocationIconXpath()
    {
        return "//i[contains (@class, 'icon-shapes')]";
    }
    public static String CircleIconXpath()
    {
        return "//i[@class='icon-shape-circle']/..";
    }
    public static String RectangleIconXpath()
    {
        return "//i[@class='icon-shape-rectangle']/..";
    }
    public static String PolygonIconXpath()
    {
        return "//i[@class='icon-shape-custom']/..";
    }
    public static String PolylineIconXpath()
    {
        return "//i[@class='icon-shape-line']/..";
    }
   
    public static String MousePlusModeXpath() 
    {
        return "//div[contains(@class, 'leaflet-container')][contains(@style, 'cursor: crosshair')]";
    }  
    public static String PointOneXpath() 
    {
        return "//div[@class='leaflet-control-scale leaflet-control']";
    }    
                
    public static String PointTwoXpath() 
    {
        return "//div[@class='leaflet-control-scale leaflet-control']/div[2]";
    }  
    
    public static String ValidateDrawnShapeXpath()
    {
        return "//*[local-name()='path']";
    }
    
    public static String validateLocationDetailsScreen()
    {
        return "//div[@class='tracking-search-container']/../../..";
    }
    
    public static String LocationNameXpath()
    {
        return "//input[@ng-model='currentLocation.description']";
    }
    
    public static String StreamNameInputRelativeXpath() 
    {
        return "//input[@name='locationName']";
    }
    public static String LocationTypeXpath()
    {
        return "//select[@ng-model='currentLocation.type']";
    }
    public static String LocationTypeOptionXpath()
    {
        return "//select[@ng-model='currentLocation.type']/option[text()='Fuel stop']";
    }
    
    public static String LocationTypeOption1Xpath(String Type)
    {
        return "//select[@ng-model='currentLocation.type']/option[text()='"+Type+"']";
    }

    public static String LocationColourXpath()
    {
        return "//label[text()='Location colour']/..//a[@style='background: black;']";
    }
    public static String LocationColourFireFoxXpath()
    {
        return "//label[text()='Location colour']/..//a[@style='background: Black none repeat scroll 0% 0%;']";
    }
    
    public static String OpacityXpath()
    {
        return "//label[text()='Opacity']/..//a[@class='ui-slider-handle ui-state-default ui-corner-all']";
    }
    
    public static String HOSLocationIdXpath()
    {
        return "//label[text()='Oshay ocationlay Idway']/..";
    }
    public static String NotifyAssetsLocationXpath()
    {
        return "//input[@ng-model='currentLocation.isActiveLocation']";
    }
    public static String LocationDetailsLinkXpath()
    {
        return "//a[text()='Locations details']";
    }
    public static String LocationContactDetailsScreenXpath()
    {
        return "//div[@class='white-box-padding']";
    }
    public static String SubmitButtonDisabledXpath()
    {
        return "//div[@class='modal-footer']//button[text()='Submit']";
    }
    public static String SaveLocationDetailsXpath()
    {
        return "//div[@class='tracking-search-container']//button[text()='Save']";
    }
  
    
    public static String LocationContactNameXpath()
    {
        return "//input[@name='contactName']";
    }
    public static String LocationContactHomeNumXpath()
    {
        return "//input[@name='homeNumber']";
    }
     public static String LocationContactMobileNumXpath()
    {
        return "//input[@name='mobileNumber']";
    }
      public static String LocationContactWorkNumXpath()
    {
        return "//input[@name='workNumber']";
    }
    public static String LocationContactEmailXpath()
    {
        return "//input[@name='email']";
    } 
    public static String PhysicalAddressXpath()
    {
        return "//input[@ng-model='contactCopy.address']";
    }
   
    
    public static String ClickDragAndDrawLabelXpath() 
    {
        return "//span[text()='Click and drag to draw circle.']";
    }
    public static String LocationDetailsScreenXpath() 
    {
        return "//*[@class='pa-10']";
    }
    
      public static String customerFieldXpath() 
    {
        return "//select/option[text()='Customer']";
    } 
    
    public static String noGoZoneFieldXpath() 
    {
        return "//select/option[text()='No-go zone']";
    }
    
    public static String siteFieldXpath() 
    {
        return "//select/option[text()='Site']";
    }
    
    public static String otherFieldXpath() 
    {
        return "//select/option[text()='Other']";
    }
    
    public static String streetPolylineFieldXpath() 
    {
        return "//select/option[text()='Street Polyline']";
    }
    
    public static String fuelStopFieldXpath() 
    {
        return "//select/option[text()='Fuel stop']";
    }
    
    public static String restStopFieldXpath() 
    {
        return "//select/option[text()='Rest stop']";
    }
    
    public static String speedZoneFieldXpath() 
    {
        return "//select/option[text()='Speed zone']";
    }
    
    public static String SiteTypeXpath()
    {
        return "//select[@ng-model='currentLocation.siteId']";
    }
    public static String SiteTypeOptionXpath()
    {
        return "//select[@ng-model='currentLocation.siteId']/option[text()='Default Site']";
    }
    
    public static String SiteTypeOption1Xpath(String Site)
    {
        return "//select[@ng-model='currentLocation.siteId']/option[text()='"+Site+"']";
    }
    
    public static String siteFieldOptionXpath() 
    {
        return "//select/option[text()='Default Site']";
    }
    public static String validateLocationSuccessfullyCreatedXpath() 
    {
        return "//div[@class='notification notification-placement notification-success']/span[text()='Location successfully created']";
    }
    public static String FilterNewLocationXpath() 
    {
        return "//input[@placeholder='Filter']";
    }
    
//    
   public static String ManageMenuRelativeXpath() 
    {
        return "//a[text()='MANAGE ']";
    }
    public static String checkfilteredRecipientsXpath() 
    {
        return "//span[text()='Name'][@class='ng-binding']/../../../../tbody/tr/td/input[@type ='checkbox']";
    }
    public static String MonitorMenuRelativeXpath() 
    {
        return "//a[text()='MONITOR ']";
    }
    public static String DatabaseAdministrationRelativeXpath() 
    {
        return "//div[@ng-repeat='module in section.modules']//a[text()='Database administration']";
    }
    public static String AssetSubMenuRelativeXpath() 
    {
        return "//a[text()='Assets']";
    }
    public static String TestRSOTreeRelativeXpath() 
    {
        return "//strong[text()='Test RSO']/../../../../span[@class='daredevel-tree-anchor ui-icon icon-plus ng-scope']";
    }
    public static String DVTAutomationOrgRelativeXpath() 
    {
        return "//strong[text()='DVT Automation']";
    }
    public static String MeasurementSettingsRelativeXpath() 
    {
        return "//a[text()='Measurement settings']";
    }    
    public static String MapsettingsRelativeXpath() 
    {
        return "//a[text()='Map settings']";
    }
    public static String MapProviderXpath() 
    {
        return "//span[text()='Map Provider']//..//../select";
    } 
    public static String ValidateSaveButtonXpath() 
    {
        return "//button[text()='Save' and @disabled='disabled']";
    }
               
    public static String SaveButtonXpath() 
    {
        return "//button[text()='Save']";
    } 
    public static String RelevantLocationXpath() 
    {
        return "//table[@class='table table-scroll table-condensed table-list no-text-clip']";
    }
    
    public static String RelevantLocationNameXpath() 
    {
        return "//table[@class='table table-scroll table-condensed table-list no-text-clip']/thead/tr/th[@column-field='description']";
    }
    public static String RelevantNameXpath() 
    {
        return "//a[@class='clickable-cell// ng-scope']";
    }
    
    
    public static String validateLocationNameXpath()
    {
        return "//table//span[text()='Location name']/../../../../tbody/tr/td[3]/div/a/span";
    }
     public static String validateLocationTypeXpath()
    {
        return "//table//span[text()='Location type']/../../../../tbody/tr/td[4]/div/span";
    }
      public static String validateAddressXpath()
    {
        return "//table//span[text()='Address']/../../../../tbody/tr/td[5]/div/span";
    }
      
    public static String Column2Xpath()
    {
        return "//table//span[text()='Address']/../../../..//tbody//tr//td";
    }
      
    public static String Column1Xpath()
    {
        return "//table//span[text()='Address']/../../../..//thead//th";
    }
      
      
      
       public static String validateSiteXpath()
    {
        return "//table//span[text()='Site']/../../../../tbody/tr/td[6]/div/span";
    }
        public static String validateContactNameXpath()
    {
        return "//table//span[text()='Contact name']/../../../../tbody/tr/td[7]/div/span";
    }
    public static String validateColumnChooser()
    {
        return "//i[@class='icon-choose-columns']";
    }
    public static String validateColumnAddress()
    {
        return "//a//span[text()='Address']/..//i";
    }
    public static String validateColumnContactName()
    {
        return "//a//span[text()='Contact name']/..";
    }
    public static String validateColumnLocationName()
    {
        return "//a//span[text()='Location name']/..";
    }
    public static String validateColumnLocationType()
    {
        return "//a//span[text()='Location type']/..";
    }
    public static String validateColumnSite()
    {
        return "//a[@ng-click['toggleColumnVisibility(column)']]//span[text()='Site']/..";
    }
    public static String spinnerLoaderXPath()
    {
        return "//div[@class='leaflet-overlay-pane']";
    }
    public static String waitForElementsXpath()
    {
        return "//div[@class='tracking-search-container historical-tracking strong-grid mt-44 mobitech-tracking']";
    }
    
    
}
