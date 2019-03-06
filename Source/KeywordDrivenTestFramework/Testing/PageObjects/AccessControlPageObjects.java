/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects;

/**
 *
 * @author nmayekiso
 */
public class AccessControlPageObjects {
    
    public static String MonitorMenuRelativeXpath() 
    {
        return "//a[text()='MONITOR ']";
    }
    
    public static String DriversSubMenuRelativeXpath() 
    {
        return "//a[text()='Drivers']/../a[@ng-href]";
    }
    
    public static String AccessControlXpath() 
    {
        return "//a[text()='Access control']";
    }
    
    public static String SelectedDriverXpath() 
    {
        return "//a[text()='Installer']";
    }
    
    public static String ExistingDriverLinkSelectionXpath() 
    {
        return "//a[@ng-click='selectDriver()']//strong[text()='Select']";
    }
    
    public static String RadioButtonXpath() 
    {
        return "//tbody//tr//span[text()='Default Site']/../../..//input[@type='radio']";
    }
    
    public static String ExistingDriverXpath() 
    {
        return "//tbody//tr//td//span[contains(@class, 'max')]";
    }
    
    public static String SelectXpath() 
    {
        return "//div[@class='modal-footer']//button[text()='Select']";
    }
    
    public static String DVTAutomationTreeXpath() 
    {
        return "//li[@class='ng-scope first-item']//span[contains(@class, 'icon-plus')]";
    }
    
    public static String InDefaultSiteTreeXpath() 
    {
        return "//li[@class='ng-scope']//div[@class='tree-item-content']";
    }
    
    public static String CoupeDefaultSiteTreeXpath(int number) 
    {
        return "//ul[@items='item[options.modelItemsProperty]']//ul[@class='fleet-strong-tree daredevel-tree tree full-block ng-scope'][@items='item[options.modelItemsProperty]']//li["+number+"]";
    }
    
    public static String DefaultSiteTreeXpath() 
    {
        return "//li[@class='ng-scope']//span[contains(@class, 'icon-plus')]";
    }
    
    public static String DVTAutomationCheckboxXpath() 
    {
        return "//span[text()='DVT Automation']/../../div[@class='checkbox ng-scope']";
    }
    
    public static String DefaultSiteCheckboxXpath() 
    {
        return "//span[text()='Default Site']/../../div[@class='checkbox ng-scope']";
    }
    
    public static String SaveButtonXpath() 
    {
        return "//button[text()='Save']";
    }
    
    public static String UpdateNotificationXpath() 
    {
        return "//span[text()='Driver updated successfully']";
    }
    
    public static String OnScreenConfirmationXpath()
    {
        return "//button[contains(text(),'OK')]";
    }
    
    public static String OnScreenConfirmationCancelXpath()
    {
        return "//button[text()='Yes']";
    }
    
    public static String OrgCheckboxXpath()
    {
        return "//div[@class='checkbox ng-scope']/span";
    }
    
    public static String AssetsOperableXpath()
    {
        return "//div[@class='row-fluid mb-15']/span[@class='badge badge-success access-control-green mr-5 ng-binding']";
    }
    
    public static String TotalAssetsXpath()
    {
        return "//div[@class='row-fluid mb-15']/span[@class='badge badge-info access-control-blue ng-binding']";
    }
    
    
}
