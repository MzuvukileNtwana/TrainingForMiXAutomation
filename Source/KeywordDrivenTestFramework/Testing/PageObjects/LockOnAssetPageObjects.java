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
public class LockOnAssetPageObjects 
{
    
    
    public static String ActionButtonXpath()
    {
        return "//div[@rows='assets']//li/div/div/a[@fleet-tooltip='Actions']";
    }
    
    public static String checkboxLiveTrackingXpath()
    {
        return "//span[text()='DVT Live Tracking Unit New']/../../../..//span[@ng-class=\"column.cssClass\"]/input";
    }
   
    public static String ShowCheckBoxXpath(String asset)
    {
        return "//span[text()='"+asset+"']/../../../../td[@ng-show='column.visible']/div/span/input";
    }
    
    public static String ShowSelectedAssetsCheckBoxXpath()
    {
        //return "//th[@class='column-heading  first']/span/input";
        return "//th[@class='column-heading  first']//input";
    }
    
    public static String GPSCoodinatChooserXpath()
    {
        return "//div[@rows='assets']//li/div/div/a[@fleet-tooltip='Actions']";
    }
    public static String ColumnChooserButtonXpath()
    {
        return "//ul[@class='over']/li/a[@class='btn btn-small column-chooser']";
    }
    
    public static String LockOnAssetXpath()
    {
        return "//span[text()='Lock on asset']/..";
    }
    public static String LockIconXpath()
    {
        return "//i[contains(@class,'ng-scope icon-lock')]";
    }
    
    public static String AssetOnMapXpath()
    {
        return "//div[contains(@class,'leaflet-marker-icon')]/canvas";
    }
    
    public static String MapDividerXpath()
    {
        return "//div[@class='leaflet-container leaflet-fade-anim']";
    }
    
    public static String SearchXpath()
    {
        return "//div[@class='input-reset-wrapper']/input[1]";
    }
    
    public static String UnlockButtonXpath()
    {
        return "//i[@class=\"icon-lock\"]/..";
    }
        
    public static String GPScoordinatesXpath()
    {
        return "//span[text()='GPS Coordinates']/../../../td[@class='ng-binding']";
    }
    
    public static String backToAssetListButtonXpath()
    {
        return "(//div//a[@class='btn btn-small pull-right mr-5']//span[text()='Back to asset list'])[1]";
    }
    
    
}
