/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects.Shakedown;

/**
 *
 * @author lpooe
 */
public class ShakedownTrackingMapToolsMapLayersAssetLabelsPageObjects
{
    //map layers xpath
    public static String mapLayersXpath()
    {
        return "//div[@class='tracking-docked-toolbar btn-inverse']//li//a//i[@class='icon-layers icon-white']";
    }
    
    //expand button on map layers tool
    public static String layersExpandButtonXpath()
    {
        return "//ul//li//span[@class='daredevel-tree-anchor ui-icon icon-plus ng-scope']";
    }
    
    //asset description checkbox xpath
    public static String assetLabelsCheckboxXpath(String text)
    {
        return "//div[@class='checkbox ng-scope']//span[text()='"+text+"']//..//input[@class='ng-pristine ng-valid']";
    }
    
    //asset description checkbox firefox xpath
    public static String assetLabelsCheckboxFirefoxXpath()
    {
        return "//div[@class='checkbox ng-scope']//span[text()='Asset description']//..//input[@type='checkbox']//..//div[@style]";
    }
    
    //save button xpath
    public static String saveButtonXpath()
    {
        return "//div[@class='toolbar-criteria']//div[@class]//button[contains(text(),'Save')]";
    }
    
    //icon - asset description xpath
    public static String iconAssetDescriptionXapth()
    {
        return "//div[@class='leaflet-zoom-animated leaflet-marker-icon']//div[text()]";
    }
}
