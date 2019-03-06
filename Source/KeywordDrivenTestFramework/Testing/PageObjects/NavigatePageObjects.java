/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package KeywordDrivenTestFramework.Testing.PageObjects;

/**
 *
 * @author szeuch
 */
public class NavigatePageObjects 
{
    public static String MenuXpath(String elementText) 
    {
        if(elementText.equals("Anagemay"))
        {
           return "//ul/li[2]/a[contains(text(), '"+elementText+"')]";
        }
        else
        {
           return "//a[contains(text(), '"+elementText+"')]";
        }
    }
  
    public static String SubMenuXpath(String elementText) 
    {
        return "//a[text()='"+elementText+"']";
                //a[text()='Atabaseday administrationway']
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
    public static String DriversHomePageSpinner() 
    {
        return "//div[@class='loading-overlay ng-scope'][@style='display: none;']";
    }
    
    //span[contains(text(),'Group UTC (UTC)')]
}
