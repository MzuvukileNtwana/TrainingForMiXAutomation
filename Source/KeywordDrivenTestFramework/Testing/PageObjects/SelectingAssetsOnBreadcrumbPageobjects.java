/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects;

/**
 *
 * @author elebese
 */
public class SelectingAssetsOnBreadcrumbPageobjects 
{
    
    
    public static String AssetsWithTripCheckBox()
    {
        //return "//span[text()= 'Assets with trips']/../input";
        return "//input[@ng-model='showAssetsForThisPeriod']";
    }
    
    public static String DefaultSite()
    {
        return "//span[text()= 'Default Site']";
    }
    public static String defaultSiteXpath()
    {
        return "//a//span[text()= 'Default Site']";
    }
    
    //xpath for select asset screen
    public static String SelectAssetDefaultSiteXpath()
    {
        return "//span[@class='ng-scope']//..//..//a[@class='ng-scope active selected']";
    }
    
    public static String dvtAutomationXpath()
    {
        //return "//div[@class='column ps-container ps-active-y']/a/span[text()= 'DVT Automation']";
        return "//span[@data-original-title='Organisation']/../span[text()= 'DVT Automation']";
    }
    public static String testRsoXpath()
    {
        return "//div[@class='column ps-container ps-active-y']/a/span[text()= 'Test RSO']";
    }
    public static String mixTelematicsXpath()
    {
        return "//div[@class='column ps-container']/a/span[text()='MiX Telematics']";
    }
    
    public static String AssetToClick(String asset)
    {
        //return "//span[text()= '" + asset + "']";
        return "//a[@ng-click=\"$directive.select(item)\"]/span[contains(text(),\"" + asset + "\")]/..";
    }
    
    public static String AssetList(String asset)
    {
        return "//tr/td[text()='" + asset + "']";
    }
    
    public static String assetList(String text)
    {
        return "//table//tbody//tr[contains(@class,'ng-scope')]//..//td//div//a//span[contains(text(),'"+text+"')]";
        //table//tbody//tr[contains(@class,'ng-scope')]//..//td//div//a//span[contains(text(),'DVT Live Tracking Unit')]
    }
    
    public static String AssetList2()
    {
        return "//tr/td[text()='BlueBoat0']";
    }
      public static String AssetList1()
    {
        return "//tr/td[text()='A Travelling 3707']";
    }
     
    //xpath for live tracking page after relevant breadcrumb is selected
    public static String liveTrackingSelectedBreadcrumb()
    {
        ////div[@class='miller-selector']//span[@class='text-overflow ng-binding']//span
        return "//div[@class='miller-selector']//span[@class='text-overflow ng-binding']//span";
    }
    
    //xpath for filter
    public static String FilterXpath()
    {
        return "//input[@ng-model='mainFilterQuery']";
    }
    
    //xpath to all-checkbox
    public static String selectAllCheckboxXpath()
    {
        return "//th[@class='column-heading  first']//span//input[@type='checkbox']";
    }
    
    //xpath for asset checkbox
    public static String assetCheckboxXpath(String asset)
    {
        return "//span[text()='"+asset+"']/../../../..//span//input[@type='checkbox']";
    }
    
    //xpath for asset 1 actions button
    public static String assetActionButton()
    {
        return "//a[@class='btn-actions']//..//..//../..//li[@class='ng-scope odd']";
    }

    
    //xpath for Lock on Asset
    public static String GoToAssetXpath()
    {
        return "//ul[contains(@style,'play: block')]//li//span[contains(text(),'Go to asset')]";
    }
    
    //xpath for locked asset pop-up
    public static String AssetPopup()
    {
        return "//div[@class='leaflet-marker-icon marker marker-small']//i";
    }
            
    //xpath for IE asset on map
    public static String IEAssetPopupXpath()
    {
        //return "//div[@class='leaflet-popup-tip-container']//div[@class='leaflet-popup-pane']";
        //map-marker map-marker-small orange
        //div[@class='leaflet-popup-tip-container']
        //i[@class='marker-icon marker-asset-tanker-right marker-icon-small marker-icon-blue']
        return "//div[@class='marker-icon marker-asset-tanker-right marker-icon-small marker-icon-blue']";
    }
    
    //xpath for asset info inside pop-up
    public static String popUpInfo()
    {
        return "//div[@class='leaflet-popup-pane']";
    }
    
    public static String selectAssetScreenXpath()
    {
        return "//h5[text()='Select asset(s)']";
    }
    
    //xpath for historical tracking page after selecting breadcrumb
    public static String historicalTrackingPageXpath()
    {
        return "//div[@class='miller-selector']//span[@class='text-overflow ng-binding']//span";
    }
    
    public static String historicalAssetXpath(String asset)
    {
        return "//tbody[@ng-repeat='asset in assets']//tr//td[contains(text(),'"+asset+"')]";
        //DVT Live Tracking Unit
        //DVT non-FM asset

    }
    
    //historical page - left pane spinner xpath
    public static String leftpaneSpinnerXpath()
    {
        return "//div[@class='left-pane']//div[@class='loading-overlay ng-scope'][@style='display: none;']";
    }
    //historical page - right pane spinner xpath
    public static String rightpaneSpinnerXpath()
    {
        return "//div[@class='right-pane']//div[@class='loading-overlay'][@style='display: none;']";
    }
    
}
