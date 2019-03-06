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
public class ShakedownTrackingGotoAssetPageObjects
{
    //live tracking header xpath
    public static String pageHeaderXpath(String header)
    {
        return "//h5//span[text()='"+header+"']";
    }
    
    //all checkbox xpath
    public static String allCheckbox()
    {
        return "//th[@class='column-heading  first']//span//input[@type='checkbox']";
    }
    
    //search asset filter textfield
    public static String searchAssetFilterXpath()
    {
        return "//div[@class='input-reset-wrapper']//input[@ng-model='mainFilterQuery']";
    }
    
    //single asset checkbox
    public static String singleAssetCheckboxXpath(String assetReg)
    {
        return "//td[@column-field='assetRegistration']//div//a//span[text()='"+assetReg+"']//..//..//..//..//td//div//span//input[@type='checkbox']";
    }
    
    //asset actions button xpath
    public static String actionsButtonXpath()
    {
        return "//li//div[@class='row-action btn-group ng-scope']//a[@class='btn-actions']";
    }
    
    //go to asset link xpath
    public static String gotoAssetLinkXpath(String text)
    {
        return "//li//a//span[text()='"+text+"']";
    }
    
    //asset on map location xapth
    public static String assetOnMapXpath()
    {
        return "//div[contains(@class,'leaflet-marker-icon')]/canvas";
    }
    
    //map xpath
    public static String mapXpath()
    {
        return "//div[@class='leaflet-container leaflet-fade-anim']";
    }
}
