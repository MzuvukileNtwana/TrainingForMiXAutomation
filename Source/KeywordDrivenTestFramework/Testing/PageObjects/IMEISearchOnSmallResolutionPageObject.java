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
public class IMEISearchOnSmallResolutionPageObject {
    
    public static String IMEISearchTabXpath()
    {
        return "//a[text()='IMEI Search']";
    }
    
    public static String IMEISearchScreenHeadingXpath()
    {
        return "//h5[text()='IMEI search']";
    }
    
    public static String EnterAnExistingIMEINumberAndClickSearchXpath()
    {
        return "//span[text()='Enter an existing IMEI number and click search']";
    }
    
    public static String selectDeviceTypeDropdownXpath()
    {
        return "//select[@name='searchtype']/option";
    }
    public static String selectDeviceTypeDropdownXpath1()
    {
        return "//select[@name='searchtype']";
    }
    public static String searchFieldXpath()
    {
        return "//input[@name='ImeiNumber']";
    }
    
    public static String searchButtonXpath()
    {
        return "//button[@ng-click='search()']";
    }
    
    public static String spinnerXpath()
    {
        return "//h5[text()='IMEI search']/../../div[contains(@class, 'loading-overlay')][@style='display: none;']";
    }
    
    public static String noAssetFoundXpath()
    {
        return "//div/p[text()='No asset found']";
    }
    
    public static String noAssetFoundClearedXpath()
    {
        return "//div[@style='display: none;']//p[text()='No asset found']";
    }
    
    public static String tableHeadersXpath(String name)
    {
        return "//th/span[text()='" + name + "']";
    }
    
    public static String actionsButtonXpath()
    {
        return "//a[@class='btn-actions']";
    }
    
    public static String indexedActionsButtonXpath(int i)
    {
        return "//li[" + i + "]//a[@class='btn-actions']";
    }
    
    public static String editAssetXpath()
    {
        return "//span[text()='Edit asset']/..";
    }
    
    public static String DiagnosticsXpath()
    {
        return "//span[text()='Diagnostics']/..";
    }
    
    public static String editConfigurationXpath()
    {
        return "//span[text()='Edit configuration']/..";
    }
    
    public static String assetHyperLinkedXpath()
    {
        return "//span[text()='Asset']/../../..//tbody//span[text()='SAT Unit']/../../a";
    }
    
    public static String orgNotHyperLinkedXpath()
    {
        return "//span[text()='Organisation']/../../..//tbody//span[text()='DVT Automation']";
    }
    
    public static String IMEIsearchPageXpath()
    {
        return "//h5[text()='IMEI search']";
    }
}
