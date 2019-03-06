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
public class MillerColumnSelectingMultipleAssetsPageObjects extends BaseClass
{
    public static String MonitorXpath() 
    {
        return "//a[text()='MONITOR ']";
    }
    public static String LiveTrackingXpath() 
    {
        return "//a[text()='Live tracking']";
    }
    public static String LiveTrackingAssetGridXpath()
    {
        return "//div[@columns='assetGridColumns']";
    }
    
    public static String PreferredMapXpath() 
    {
        return "//div[@class='leaflet-container leaflet-fade-anim']/../../..";
    }
    public static String ShowSelectedAssetsCheckboxXpath()
    {
        return "//input[contains(@ng-model,'showSelectAssets')]";
    }
    public static String GetInformationOnAsset1ByXpath()
    {
        return "//div[@class='popover-content']";
    }
      public static String GetInformationRowsLocationByXpath()
    {
        //return "//div[@class='leaflet-popup-content-wrapper']//table//tr";
        return "//div[@class='leaflet-popup-content-wrapper']//table//tr[2]/td[@class='pop-dev']";
    }
    public static String GetInformationRowsAssetDVTNonByXpath()
    {

        return "//div[@class='leaflet-popup-content-wrapper']//table//tr[1]/td[@class='pop-dev']";
    }
    public static String GetInformationRowsAssetDVTLiveByXpath()
    {

        return "//div[@class='popover-content']/..//table//tr[1]/td[@class='pop-dev']";
    }
     
     public static String AssetDVTNonOnMapXpath()
    {
        return "//div[contains(@class,'leaflet-marker-icon')]/canvas[@id='-7167083220742265087']";
    }
     public static String AssetOnMapXpath()
    {
        return "//div[@class='leaflet-clickable']//canvas";
    }
    public static String AssetDVTLiveOnMapXpath()
    {
        //return "//div[contains(@class,'leaflet-marker-icon')]/canvas[@id='-5915045696512814446']";
        return "//div[contains(@class,'leaflet-marker-icon')]/canvas[@id]";
    }
    public static String DVTLiveTrackingUnitCheckboxXpath()
    {
        return "//span[text()='DVT Live Tracking Unit New']/../../../../td[@column-field='showAssetOnMap']//input";
    }
     public static String DVTNonFMAssetCheckboxXpath()
    {
        return "//span[text()='DVT non-FM asset']/../../../../td[@column-field='showAssetOnMap']//input";
    }
    
    public static String selectAllAssetXPath()
    {
        return "//div/table/thead/tr/th[contains(@class, 'column-heading  first')]/span/input[@type='checkbox']";
         //th[@class='column-heading  first']/span[contains(@ng-show,'column.cellType')]/input[@type='checkbox']
    }
    public static String validateAssetScreenXPath()
    {
        return "//span[text()='Show selected assets']";
    }
    public static String LiveTrackingPageHeaderXpath()
    {
        return "//h5/span[text()='Live tracking']";
    }
     
    public static String ClickOnBreadCrumbXpath() 
    {
        return "//a/span/span[text()='MiX Telematics']";
    }
     public static String previouslySelectedOrganisationXpath() 
    {
        return "//a/span/span[text()='DVT Automation']";
    }
    public static String highlightPreviouslySelectedOrganisationXpath()
    {
//        return "//a[contains(@class, 'selected')]/span[2]";
//        return "//a[contains(@class, 'selected')]/span[contains(@ui-if, 'item.name')='DVT Automation']";
        return "//a[@class='ng-scope active selected']/span[text()='DVT Automation']/..";
    }
    public static String DefaultSiteOrganisationXpath()
    {
        return "//a[@ng-repeat]//span[text()='Default Site']";
    }
    public static String DVTLiveTrackingAssetBreadcrumbXpath()
    {
        return "//a[@ng-repeat]//span[text()='DVT Live Tracking Unit New']/..";
    }
    public static String DVTNonFMAssetBreadcrumbXpath()
    {
        return "//a[@ng-repeat]//span[text()='DVT non-FM asset']/..";
    }
    public static String Travelling3707AssetBreadcrumbXpath()
    {
        return "//a[@ng-repeat]//span[text()='Travelling 3707']";
    }
    public static String DVTStaticDataAssetBreadcrumbXpath()
    {
        return "//a[@ng-repeat]//span[text()='DVT Static Data - DO NOT DELETE']/..";
    }
    public static String AssetCountBreadcrumbXpath()
    {
        return "//span[text()='assets']/..";
    }
     public static String AssetSpinnerXpath()
    {
        return "//div[@rows='assets']//div[@class='fleet-grid full-height has-row-actions']";
    }
   public static String assetFilterXpath()
   {
       return "//div[@ng-hide='assetListFiltered']//input";
   }
   public static String clearFilterButtonXpath()
   {
       return "//div[@ng-hide='assetListFiltered']//button";
   }
    
    public static String ActionsButtonXpath()
    {
//        return "//div[@rows='assets']//li/div/div/a[@fleet-tooltip='Actions']";
        return "//li[2]//div[@class='row-action btn-group ng-scope']//a[@fleet-tooltip='Actions']";
    }
    public static String LockOnAssetXpath()
    {
//        return "//span[text()='Lock on asset']/../i[@class='icon']/..";
        return "//ul[contains(@style,'display: block')]//span[text()='Lock on asset']/..";
    }
    
    
    public static String ShowCheckBoxXpath()
    {
        return "//span[text()='DVT non-FM asset']/../../../../td[@ng-show='column.visible']/div/span/input";
    }
    
  
    public static String selectedAssetOnList1Xpath()
    {
        return "//a[@class='clickable-cell ng-scope']/span[text()='DVT non-FM asset']";
    }
    public static String selectedAssetOnListXpath()
    {
        return "//a[@class='clickable-cell ng-scope']/span[text()='DVT Live Tracking Unit New']";
    }

    
    public static String ClickOnBreadCrumbFilterXpath() 
    {
        return "//a[@class='btn btn-small btn-filter']/../input";
    }
      
    public static String ClickOnSearchButtonOnBreadCrumbXpath() 
    {
        return "//a[@class='btn btn-small btn-filter']";
    }
     
    public static String DynaSelectedOrganisationXpath(String organization) 
    {
        return "//div[@class='group ng-scope']/a/span[text()='"+organization+"']";
    }
     
    public static String ClickSelectXpath() 
    {
        return "//a[text()='Select']";
    }
      
    public static String CheckboxXpath()
    {
        return "//tr/td/div//input[@type='checkbox']";
    }
    
    
    public static String column1Xpath()
    {
        return "//div[@columns='assetGridColumns']/div/div/table/thead";
    }
    public static String column2Xpath()
    {
        return "//div[@columns='assetGridColumns']/div/div/table/tbody/tr[1]";
    }
    public static String column3Xpath()
    {
        return "//div[@columns='assetGridColumns']/div/div/table/tbody/tr[2]";
    }
   
    
  
}
