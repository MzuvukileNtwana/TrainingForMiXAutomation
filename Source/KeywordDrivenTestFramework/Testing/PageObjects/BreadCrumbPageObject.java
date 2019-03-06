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
public class BreadCrumbPageObject {
    
    public static String breadCrumbSelectorXpath()
    {
        return "//div[@class=\"miller-selector\"]/a[@ng-click=\"$broadcast('openOrganisationSelectionMiller')\"]";
    }
    
    public static String breadCrumbColumnsXpath(String name)
    {
        return "//a[@ng-click=\"$directive.select(item)\"]/span[contains(text(),\"" + name + "\")]/..";
    }
    
    public static String btnSelectXpath()
    {
        //return "//a[text()='Select']";
        return "//a[@ng-click=\"$directive.submit()\"]";
    }
    
    public static String selectedDriverXpath(String driver)
    {
        return "//div[@class=\"miller-selector\"]/a[@ng-click=\"$broadcast('openOrganisationSelectionMiller')\"]//span[text()=\"" + driver + "\"]";
    }
    
    public static String selectDriverHeaderXpath(String header)
    {
        return "//h5[text()='" + header + "']";
    }
    
    public static String highlightedItemXpath(String name)
    {
        return "//a[@ng-click=\"$directive.select(item)\"][contains(@class,'active selected')]/span[text()=\"" + name + "\"]/..";
    }
    
    public static String columnSpinnerXpath(String name)
    {
        return "//a[@ng-click=\"$directive.select(item)\"]/span[contains(text(),\"" + name + "\")]/../img[@style='display: none;']";
    }
        
    //page spinner xpath path
    public static String pageSpinnerXpath()
    {
        return "//div[@class='loading-overlay ng-scope'][@style='display: none;']";
    }
    
    //language Assets xpath
    public static String assetTextXpath(String text)
    {
        return "//span[text()='"+text+"']";
    }
    
    public static String addAssetIconXpath()
    {
        return "//i[@class='icon-plus icon-white']";
    }
}
