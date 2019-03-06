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
public class LocationReflectingOnAssetPageObjects extends BaseClass
{
     public static String MonitorXpath() 
    {
        return "//a[text()='MONITOR ']";
    }
    public static String LiveTrackingXpath() 
    {
        return "//a[text()='Live tracking']";
    }
    public static String ColumnSelectorXpath() 
    {
        return "//div[@columns='assetGridColumns']//i[@class='icon-choose-columns']/..";
    }
    public static String SelectLocationXpath() 
    {
        return "//span[text()='Location'][@class='title ng-binding']/..";
    }
    public static String SelectedLocationXpath() 
    {
        return "//span[text()='DVT Live Tracking Unit']/../../../..//td[@column-field='lastPosition.location']";
    }
    public static String AssetOnMapXpath()
    {
        return "//div[contains(@class,'leaflet-marker-icon')]/canvas";
    }
    public static String assetActionsButtonXpath()
    {
        return "//i[@ng-class='assetIconClass()']/../../td[2]/div/a";
    }
    public static String viewInNewWindowXpath()
    {
        return "//i[@ng-class='assetIconClass()']/../../td[2]/div/ul/li/a[text()='View in new window']";
    }
    public static String assetInNewWindowXpath()
    {
        return "//div[@class='leaflet-popup-pane']";
    }
    public static String backToAssetListXpath()
    {
        return "//div/a[@ng-click='currentAsset = undefined']/span[text()='Back to asset list']";
    }
    public static String assetGridLocationXpath()
    {
        return "//div/table/tbody/tr[3]/td[@class='ng-binding']";
    }
        public static String GetInformationTrowsByXpath()
    {
        //return "//div[@class='leaflet-popup-content-wrapper']//table//tr";
        return "//div[@class='leaflet-popup-content-wrapper']//table//tr[2]/td[@class='pop-dev']";
    }
    

    public static String filterAssetLocationXpath()
    {
        return "//input[@ng-model='mainFilterQuery']";
    }
     public static String checkboxAssetLocation()
    {
        return "//table[@class='table table-scroll table-condensed table-list no-text-clip']/tbody/tr/td[@column-field='showAssetOnMap']";
    }
    //div[contains(@class,'leaflet-marker-icon')]/canvas
    
    
    
}
