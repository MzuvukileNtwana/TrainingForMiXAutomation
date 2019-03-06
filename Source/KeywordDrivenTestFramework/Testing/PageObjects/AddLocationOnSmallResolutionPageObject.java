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
public class AddLocationOnSmallResolutionPageObject {
 
    //  <editor-fold defaultstate="collapsed" desc="Navigate to Manage Locations">
    
    public static String monitorMenuXpath()
    {
        return "//a[text()='MONITOR ']";
    }
    
    public static String manageLocationsMenuXpath()
    {
        return "//a[text()='Manage locations']";
    }
    
    public static String manageLocationsPageHeaderXpath()
    {
        return "//h5/span[text()='Manage locations']";
    }
    
    //  </editor-fold>
    
    //  <editor-fold defaultstate="collapsed" desc="Add Location">
    
    public static String addLocationButtonXpath()
    {
        return "//i[contains(@class, 'icon-plus')]/..";
    }
    
    public static String findPlaceXpath()
    {
        return "//div[@class='left-pane']//span[text()='Find a place']";
    }
    
    public static String dvtAutomationXpath()
    {
        return "//strong[text()='DVT Automation']/..";
    }
    
    public static String selectedMapProviderXpath()
    {
        return "//select[@ng-model=\"mapProvider\"]/option[@selected='selected']";
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
    
    public static String addressPlottedOnMapXpath()
    {
        return "//div/img[contains(@class, 'leaflet-marker-icon')]";
    } 
    
    public static String mapDivXPath()
    {
       return  "//div[@class='leaflet-container leaflet-fade-anim']";
    }
    
    public static String MapDividerXpath()
    {
        return "//div[@class='leaflet-container leaflet-fade-anim']";
    }
    
    public static String circleButtonXpath()
    {
        return "//i[@class='icon-shape-circle']/..";
    }
    
    public static String crosshairMouseXpath()
    {
        return "//div[contains(@style, 'cursor: crosshair')]";
    }
    
    public static String tooltipClickAndDragXpath()
    {
        return "//span[text()='Click and drag to draw circle.']";
    }
    
    public static String locationXpath()
    {
        return "//*[local-name()='path']";
    }
    
    //  </editor-fold>
    
    //  <editor-fold defaultstate="collapsed" desc="Process Drawn Location">
    
    public static String locationScreenXpath()
    {
        return "//div[@class=\"tracking-search-container\"]";
    }
    
    public static String locationNameTextBoxXpath()
    {
        return "//span[text()='Location name']/../../input";
    }
    
    public static String locationTypeXpath()
    {
        return "//span[text()='Location type']/../../select";
    }
    
    public static String customerLocationTypeXpath()
    {
        return "//span[text()='Location type']/../../select/option[text()='Customer']";
    }
    
    public static String fuelStopLocationTypeXpath()
    {
        return "//span[text()='Location type']/../../select/option[text()='Fuel stop']";
    }
    
    public static String noGoZoneLocationTypeXpath()
    {
        return "//span[text()='Location type']/../../select/option[text()='No-go zone']";
    }
    
    public static String otherLocationTypeXpath()
    {
        return "//span[text()='Location type']/../../select/option[text()='Other']";
    }
    
    public static String restStopLocationTypeXpath()
    {
        return "//span[text()='Location type']/../../select/option[text()='Rest stop']";
    }
    
    public static String siteLocationTypeXpath()
    {
        return "//span[text()='Location type']/../../select/option[text()='Site']";
    }
    
    public static String speedZoneLocationTypeXpath()
    {
        return "//span[text()='Location type']/../../select/option[text()='Speed zone']";
    }
    
    public static String siteDropDownLocationTypeXpath()
    {
        return "//span[text()='Site']/../../select/option[text()='Default Site']";
    }
    
    public static String LocationColourXpath()
    {
        return "//a[contains(@style, 'background: maroon')]";
    }
    public static String locationFirefoxColourXpath()
    {
        return "//a[contains(@style, 'background: Maroon')]";
    }
    
    public static String sliderXpath()
    {
        return "//div[contains(@class, 'ui-slider')]/a";
    }
    
    public static String notifyWhenAssetEnterLocationXpath()
    {
        return "//span[text()='Notify me when an asset enters this location']/../input";
    }
    
    public static String locationDetailsLinkXpath()
    {
        return "//a[text()='Locations details']";
    }
    
    public static String locationDetailsPageXpath()
    {
        return "//span[text()='Location contact details']/..";
    }
    
    public static String physicalAddressXpath()
    {
        return "//span[text()='Location contact details']/..";
    }
    
    public static String submitButtonXpath()
    {
        return "//button[text()='Submit']";
    }
    
    public static String saveButtonXpath()
    {
        return "//button[text()='Save']";
    }
    
    public static String contactNameTextBoxXpath()
    {
        return "//label[text()='Contact name']/../input";
    }
    
    public static String physicalAddressTextBoxXpath()
    {
        return "//label[text()='Physical address']/../input";
    }
    
    public static String homeNumberTextBoxXpath()
    {
        return "//label[text()='Home number']/../input";
    }
    
    public static String mobileNumberTextBoxXpath()
    {
        return "//label[text()='Mobile number']/../input";
    }
    
    public static String workNumberTextBoxXpath()
    {
        return "//label[text()='Work number']/../input";
    }
    
    public static String emailAddressTextBoxXpath()
    {
        return "//label[text()='Email address']/../input";
    }
    
    public static String successfullyCreatedLocationXpath()
    {
        return "//span[text()='Location successfully created']";
    }
    
    public static String locationInGridXpath(String text)
    {
        return "//span[text()='" + text + "']";
    }
    
    public static String columnChooserXpath()
    {
        return "//i[@class='icon-choose-columns']/..";
    }
    
    public static String addressColumnChooserXpath()
    {
        return "//span[text()='Address']/../span[@ng-hide='column.visible']/../..//a";
    }
    
    public static String contactNameColumnChooserXpath()
    {
        return "//span[text()='Contact name']/../span[@ng-hide='column.visible']/..";
    }
    
    public static String locationTypeColumnChooserXpath()
    {
        return "//span[text()='Location type']/../span[@ng-hide='column.visible']/..";
    }
    
    public static String siteColumnChooserXpath()
    {
        return "//span[text()='Site']/../span[@ng-hide='column.visible']/..";
    }
    
    public static String locationNameColumnChooserXpath()
    {
        return "//span[text()='Location name']/../span[@ng-hide='column.visible']/..";
    }
    
    public static String gridColumnsXpath(String column)
    {
        return "//th/span[text()='" + column + "']";
    }
    
    public static String filterTextBoxXpath()
    {
        return "//input[contains(@class, 'filter-search')]";
    }
    
    public static String actionsButtonXpath()
    {
        return "//a[@class='btn-actions']";
    }
    
    public static String removeLinkXpath()
    {
        return "//span[text()='Remove']/..";
    }
    
    public static String confirmRemoveButtonXpath()
    {
        return "//div[@class='modal hide fade ng-scope modal-mini in']//button[text()='Remove']";
    }
    
    //  </editor-fold>    
}
