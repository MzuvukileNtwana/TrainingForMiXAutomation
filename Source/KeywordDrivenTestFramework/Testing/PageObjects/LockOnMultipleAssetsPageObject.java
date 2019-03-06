/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects;

import KeywordDrivenTestFramework.Core.BaseClass;

/**
 *
 * @author lmgulwa
 */
public class LockOnMultipleAssetsPageObject extends BaseClass{
    
    public static String selectAssetXPath()
    {
        return "//div/span/input[@type='checkbox']";
        //return "//div[@columns=\"assetGridColumns\"]//table//tbody//tr//td//input[@type=\"checkbox\"][@ng-click=\"click($event)\"]";
    }    
    
    public static String actionButtonXpath()
    {
        //return //div[@class='row-action btn-group ng-scope']/a[@fleet-tooltip='Actions']
        return "//div[@rows='assets']//li/div/div/a[@fleet-tooltip='Actions']";
    }
    
    public static String selectAllAssetXPath()
    {
        return "//div/table/thead/tr/th[contains(@class, 'column-heading  first')]/span/input[@type='checkbox']";
    }
    
    public static String clickLockOnAssetXPath()
    {
        return "//span[text()='Lock on asset']/..";
    }
    
    public static String leftPaneSpinnerXPath()
    {
        return "//div[@class='row-fluid' and not(contains(@style,'none'))]/div[@ng-class=\"mobitechTrackingClass()\"]/div[contains(@class,'loading-overlay') and contains(@style,'none')]";
    }
    
    public static String assetOnMap()
    {
//        return "//div[contains(@class,'leaflet-marker-icon')]/canvas";
        return "//i[contains(@class, 'marker-icon')]/../canvas";
        //return "//*[local-name()]/div[@class=\"leaflet-marker-pane\"]/div/div/div/canvas/../../../../div[1]";
    }
    
    public static String assetOnMap(int index)
    {
//        return "//div[contains(@class,'leaflet-marker-icon')]/canvas";
        ////*[local-name()]/div[@class="leaflet-marker-pane"]/div/div/div/canvas/../../../../div[2]
        // //*[local-name()]/div[@class="leaflet-marker-pane"]/div/div/div/canvas/../../../../div[2]/div/div/canvas
        return "//*[local-name()]/div[@class=\"leaflet-marker-pane\"]/div/div/div/canvas/../../../../div[" + index + "]/div/div/canvas";
    }
    
    public static String mapDivXPath()
    {
       return  "//div[@class='leaflet-container leaflet-fade-anim']";
    }
}
