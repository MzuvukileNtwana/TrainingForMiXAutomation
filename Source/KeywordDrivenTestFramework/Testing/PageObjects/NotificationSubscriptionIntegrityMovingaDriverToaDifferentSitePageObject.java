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
public class NotificationSubscriptionIntegrityMovingaDriverToaDifferentSitePageObject 
{
    public static String EditNotificationXpath(String notification)
    {
        return "//a[text()='"+notification+"']";
    }
    
    public static String DriversTabXpath()
    {
        return "//div[@class='tabbable tabs-left full-height']/ul/li/a[text()='Drivers']";
    }
   public static String SitesXpath()
    {
        return "//span[text()='Site']/../../select/option";
    } 
    public static String SiteXpath()
    {
        return "//span[text()='Site']/../../select";
    }
    
    public static String buttonHOSnotificationXpath() 
    {
        return "//a[text()='HOS notifications']";
    }
    
    public static String HOSnotificationXpath() 
    {
        return "//strong[text()='HOS notifications']";
    }
    
    public static String SiteToChoseXpath()
    {
        return "//span[text()='Site']/../../select/option[@value='1']";
    }
    public static String sitesListXpath()
    {
        return "(//ul[@class='fleet-strong-tree daredevel-tree tree full-block ng-scope'][contains(@items, 'driverTree')]//div[@class='tree-sub-items ng-scope'])[2]//span";
    }
    public static String siteNameListXpath(int number)
    {
        return "((//ul[@class='fleet-strong-tree daredevel-tree tree full-block ng-scope'][contains(@items, 'driverTree')]//div[@class='tree-sub-items ng-scope'])[2]//span)["+number+"]";
    }
    public static String hosNotificationPageSpinnerXpath()
    {
        return "//div[@class='loading-overlay'][@style='display: none;']";
    }
    
    public static String SuccessBannerXpath(String message)
    {
        return "//span[text()='"+message+"']/../../../div[@class='notification-wrapper notification-modal ng-scope'][@style='display: none;']";
    }
    
    public static String DriversXpath(int drivers)
    {
        return "//ul[@class='fleet-strong-tree daredevel-tree tree full-block ng-scope']/li[@class='ng-scope first-item']/div[@class='tree-sub-items ng-scope']/ul/li/div/ul/li["+drivers+"]/div/div/input";
    }
    
    public static String EditDriverXpath(String driver)
    {
        return "//a[text()='"+driver+"']";
    }
    
    public static String DriversXpath()
    {
        return "//ul[@class='fleet-strong-tree daredevel-tree tree full-block ng-scope']/li[@class='ng-scope first-item']/div[@class='tree-sub-items ng-scope']/ul/li/div/ul/li/div/div/input";
    }
    
}
