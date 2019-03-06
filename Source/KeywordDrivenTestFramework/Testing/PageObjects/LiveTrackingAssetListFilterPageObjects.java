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
public class LiveTrackingAssetListFilterPageObjects {
    
    
    public static String NavigateToMonitor()
    {
        return "//div[@id='main-nav-toolbar']/ul/li/a[text()='MONITOR ']";
    }
    
    public static String ValidateTracking()
    {
        return "//div[@ng-repeat='module in section.modules']/h4[text()='TRACKING']";
    }
    
    public static String NavigateToLiveTracking()
    {
        return "//div[@ng-repeat='module in section.modules']/h4[text()='TRACKING']/../ul/li/a[text()='Live tracking']";
       //  return "//div[@ng-repeat='module in section.modules']/h4[text()='TRACKING']/../ul/li[1]";
    }
    
    public static String ColumnHeadingsValidation(String name)
    { 
          //return "//span[text()='"+ name +"']/../span[@ng-hide='column.headingClass || !column.title']";
        return "//thead/tr/th[@column-field='"+name+"']";
    }
    
    public static String ColumnHeadingLastPositionValidation()
    {
        return "//th[@column-field='assetDescription']/../th[@column-field='lastPosition.timeStamp']/span[text()='Last position']";
    }
    
    
    public static String FilterColumnButton()
    {
       // return "//ul[@class='over']/li[@class='header btn-group']/a";
        return "//div[@class='fleet-grid-container-wrapper' and @rows='assets']/div/div/div//li[@class='header btn-group']/a";
    }
   
    
    public static String FilterHeadingSelect(String name)
    {
        return "//li[@ng-repeat=\"column in columns | orderBy:'title'\"]/a/span[text()='"+ name +"']";
        //return "//span[text()='"+name+"']";
    }
    
    public static String FilterHeadingSelectLastPositionAssets()
    {
        return "//li[@ng-repeat=\"column in columns | orderBy:'title'\"]/a/span[text()='Last position']/../../../li/a/span[text()='Asset description']/../../../li[11]/a/span[text()='Last position']";
    }
    
    public static String TableAssetRows()
    {
        return "//thead/tr/th[@column-field='assetDescription']/../../../tbody/tr";
    }
    
    public static String AssetDescription()
    {
        return "//thead/tr/th[@column-field='assetDescription']/../../../tbody/tr[1]/td[4]/div/a/span";
    }
    
    public static String ClearFilter()
    {
        return "//div[@ng-hide='assetListFiltered']/div/div/button";
    }
    
    public static String EnterInFilteringBox()
    {
        return "//div[@ng-hide='assetListFiltered']/div/div/input";
    }
    
    public static String NoItemsToDisplay()
    {
        return "//div[@rows='assets']/div/span[text()='No items to display']";
    }
}
