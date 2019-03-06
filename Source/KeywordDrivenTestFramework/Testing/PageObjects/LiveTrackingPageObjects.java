/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package KeywordDrivenTestFramework.Testing.PageObjects;

/**
 *
 * @author lmkhontwana
 */
public class LiveTrackingPageObjects {
      
    
    public static String ShowSelectedAssetsCheckboxXpath() 
    {
        return "//span[text()='Show selected assets']";
    }
    
     public static String ShowAssetsOnMapCheckboxXpath() 
    {
        return "//th[@column-field='showAssetOnMap']";
    }
     public static String ShowAssetOnMapCheckboxXpath() 
    {
        return "//td[@column-field='showAssetOnMap']";
    }
     public static String AssetOnMapXpath() 
    {
        return "//div[contains(@class,'leaflet-marker-icon')]/i";
    }
     
     public static String BackToAssetListButtonXpath() 
    {
        return "//span[text()='Back to asset list']";
    } 
     public static String ActionsButtonXpath() 
    {
        return "//a[@fleet-tooltip='Actions']";
    }
    public static String GoToAssetDropdownXpath()
    {
        return "//ul[contains(@class,'dropdown-menu pull-right')] [contains(@style,'block')]//span[text()='Go to asset']/..";
    }
    public static String lockOnAssetDropdownXpath()
    {
        return "//ul[contains(@class,'dropdown-menu pull-right')] [contains(@style,'block')]//span[text()='Lock on asset']/..";
    }
      public static String AssetLocationTableXpath()
    {
        return "//div[@class='leaflet-popup-pane']//table//tbody";
    }
     public static String AssetDetailsTablesXpath()
    {
        return "//div[contains(@ng-show,'assetDetails')]//table";
    } 
      
    public static String LiveTrackingSpanTextXpath()
    {
        return "//span[text()='Live tracking']";
    }
    
    public static String LiveTrackingMultiLanguageSpanTextXpath(String linkText)
    {
        return "//span[text()='"+linkText+"']";
    }
    
    public static String FindButtonXpath()
    {
        return "//div[contains(@class, 'tracking-docked-toolbar')]//i[contains(@class,'icon-search')]";
    }
    
    public static String FindMenuItemsXpath()
    {
        return "//div[contains(@class, 'tracking-docked-toolbar')]//ul[contains(@class, 'search-menu')]//li";
    }
    
    public static String FindAPlaceButtonId()
    {
        return "btn-search-place";
    }
    
    public static String FindAPlaceRadioOptionsValidationsXpath()
    {
        return "//div[contains(@class, 'criteria-content-container')]//label//span";
    }
    
    public static String FindAPlaceRadioOptionsXpath()
    {
        return "//label[@class='radio']//input[@value='address']";
    }
    
    public static String FindAPlaceCountryDropDownXpath()
    {
        return "//div[contains(@ng-show, 'place')]//div[contains(@class, 'criteria-content-container')]//div[@class='row-fluid']//select[contains(@ng-model, 'selectedCountry')]";
    }
    
    public static String FindAPlaceLanguageDropDownXpath()
    {
        return "//div[contains(@ng-show, 'place')]//div[contains(@class, 'criteria-content-container')]//div[@class='row-fluid']//select[contains(@ng-model, 'selectedLanguage')]";
    }  
    
    public static String FindAPlaceToolTipXpath()
    {
        return "//div[contains(@ng-show, 'place')]//div[contains(@class, 'criteria-content-container')]//div[@class='row-fluid']//div[contains(@class, 'row-fluid')]//a";
    }
    
    public static String FindAPlaceAddressId()
    {
        return "AddressAutoPlace";
    }
    
    public static String AddressXpath()
    {
        //input[@class='span12 ui-autocomplete-input']
        return "//ul[@class='ui-autocomplete ui-menu ui-widget ui-widget-content ui-corner-all' and contains(@style,'display: block')]/li/a[1]";
    }
    
    public static String autoAddressNotVisibleXpath()
    {
        return "//ul[@class='ui-autocomplete ui-menu ui-widget ui-widget-content ui-corner-all' and contains(@style,'display: none')]/li/a[1]";
    }
    
    public static String AddressAutoIEXpath()
    {
        return "//ul[@class='ui-autocomplete ui-menu ui-widget ui-widget-content ui-corner-all' and contains(@style,'display: inline-block')]/li/a[1]";
    }
    
    public static String FindAPlaceSearchRestultXpath(String testData)
    {
        return "//a[text()='"+testData+"']";
    }
    
    public static String FindAPlaceValidateLocationXpath()
    {
        return "//input[@id='AddressAutoPlace']/..//div[@class='help-block ng-binding']";
    }
    
    public static String LiveTrackingNavigationMonitorTextXpath()
    {
        return "//a[text()='MONITOR ']";
    }
    
    public static String LiveTrackingNavigationLiveTrackingTextXpath()
    {
        return "//a[text()='Live tracking']";
    }
    
    public static String LiveTrackingNavigationMultiLanguagesLiveTrackingTextXpath()
    {
        return " //a[@ng-href='#/tracking/live-tracking']";
    }
    
    public static String LiveTrackingAssetsCountXpath()
    {
        return "//table[contains(@class, 'table-scroll')]";
    }
    
    public static String LiveTrackingRightPaneClassName()
    {
        return "right-pane";
    }
    
    public static String LiveTrackingSelectTagName()
    {
        return "select";
    }
    
    public static String LiveTrackingOptionTagName()
    {
        return "option";
    }
    
    public static String LiveTrackingDeCartaLinkText()
    {
        return "DeCarta";
    }
    
    
}
