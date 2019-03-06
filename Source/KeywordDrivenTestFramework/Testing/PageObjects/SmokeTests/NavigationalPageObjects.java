/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects.SmokeTests;

/**
 *
 * @author apeter
 */
public class NavigationalPageObjects 
{
    public static String MenuXpath(String elementText) 
    {
        return "//a[contains(text(), '"+elementText+"')]";
    }
  
    public static String SubMenuXpath(String menu, String elementText) 
    {
        //return "//a[text()='"+elementText+"']";
        return "//a[text()='"+menu+" ']/..//a[text()='"+elementText+"']";
    }
    public static String pageSpinnerXpath() 
    {
        return "//div[@class='fleet-grid-container strong-grid']/div[@class='loading-overlay ng-scope'][@style='display: none;']";
    }
    public static String DriverDefaultSpinnerXpath() 
    {
        return "//div[@class='tab-pane active ng-scope']/div[@class='loading-overlay ng-scope'][@style='display: none;']";
    }
    public static String trackingOptionsSpinnerXpath() 
    {
        return "//div[@class='tab-pane active ng-scope']/div[@class='loading-overlay ng-scope'][@style='display: none;']";
    }
    public static String ValidateSpanTextXpath(String elementText) 
    {
        return "//span[text()='"+elementText+"']";
    }
    public static String ValidateHeaderXpath(String elementText) 
    {
        return "//h5[text()='"+elementText+"']";
    }
    public static String ValidateHeaderTextXpath(String elementText) 
    {
        return "//h5/a[text()='"+elementText+"']";
    }
    public static String ErrorModalXpath() 
    {
        return "//div[@class='alert alert-error']/button/../../../../..//div[contains(@style,'display: block')]";
    }
    public static String ErrorModalCloseXpath() 
    {
        return "//div[@class='alert alert-error']/button";
    }
}
