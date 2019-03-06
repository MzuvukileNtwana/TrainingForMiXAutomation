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
public class DutchTaxPageObjects 
{
    public static String DutchTaxTabXpath()
    {
        return "//a[text()='Dutch tax']";
    }
    
    public static String DriverDefaultsTabXpath()
    {
        return "//a[text()='Driver defaults']";
    }
    
    public static String ChangeEventXpath()
    {
        return "//a[text()='Change event']";
    }
    public static String EventTextboxXpath()
    {
        return "//label[text()='Event']/../input";
    }
    
    public static String LoaderOnLandingPageXpath()
    {
        return "//div[@class='loading-overlay ng-scope'][@style='display: none;']";
    }
    
    public static String RadioButtonAssistanceXpath()
    {
        return "//span[text()='* Assistance Request']/../../../td[@class='selection ng-scope']/input[@type='radio']";
    }
    
    public static String RadioButtonConfigXpath()
    {
        return "//span[text()='* a  CONFIG-453']/../../../td[@class='selection ng-scope']/input[@type='radio']";
    }
    
    public static String SelectButtonXpath()
    {
        return "//button[text()='Select']";
    }
    
    public static String SaveButtonXpath()
    {
        return "//button[text()='Save']";
    }
    
    public static String SuccessBannerXpath()
    {
        return "//div[@class='notification-wrapper notification-modal ng-scope'][@style='display: none;']";
    }
}
