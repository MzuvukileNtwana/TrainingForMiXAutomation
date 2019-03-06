/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects;

/**
 *
 * @author smnisi
 */
public class CommandMobileDevicePageObject {
    
    public static String mapIcon()
    {
        return "//div[contains(@class,'leaflet-marker-icon')]/canvas";
    }
    
    public static String mapTranfer()
    {
        //select[@class='input-medium ng-pristine ng-valid']
        return "//select[@class='input-medium ng-pristine ng-valid']";
    }
    
    public static String liveTrackingHeading()
    {
        return "//span[text()='Live tracking']";
    }
    
    public static String customlayers()
    {
        return "//input";
    }
    
    public static String popUpMessage()
    {
        return "//span[text()='Organisation updated successfully']";
    }
    
    public static String SaveButton()
    {
        return "//button[text()='Save']";
    }
    
    public static String Maptype()
    {
        return "//span[text()='Default map view']/../../select";
    }
    
    public static String mapSettings()
    {
        return "//li/a[text()='Map settings']";
    }
    
    public static String dvtAutomationGroup()
    {
        return "//div/a/strong[text()='DVT Automation']";
    }
    
    public static String expandTestRSO()
    {
        return "//div/a/strong[text()='Test RSO']/../../../../span";
    }
    
    public static String scrollTestRSO()
    {
        return "//div/a/strong[text()='Test RSO']";
    }
    
    public static String managerDrop()
    {
        return "//li/a[text()='MANAGE ']";
    }
    
    public static String databaseAdmin()
    {
        return "//li/a[text()='Database administration']";
    }
    
    public static String liveTracking()
    {
        return "//li/a[text()='Live tracking']";
    }
    
    public static String filterTextBox()
    {
        return"//div[@class='left-pane']/div[4]/div[1]/div/input";
    }
    
    public static String non_FMasset()
    {
        return "//a/span [text()='non-FM asset']";
    }
    
    public static String commandMobileDevice()
    {
        return "//ul[@class='dropdown-menu pull-right']/li[10]/a/span[text()='Commands to mobile device']";
    }
    
    

    public static String viewDetails()
    {
        return "//ul[@class='dropdown-menu pull-right']/li[2]/a/span[text()='View details']";
    }
    
    public static String Diagnostics()
    {
        return "//ul[@class='dropdown-menu pull-right']/li[6]/a/span[text()='Diagnostics']";
    }
    
    public static String goToasset()
    {
        return "//ul[@class='dropdown-menu pull-right']/li[1]/a/span[text()='Go to asset']";
    }
    
    public static String viewInNewWindow()
    {
        return "//ul[@class='dropdown-menu pull-right']/li[3]/a/span[text()='View in new window']";
    }
    
    public static String LockonAsset()
    {
        return "//ul[@class='dropdown-menu pull-right']/li[4]/a/span[text()='Lock on asset']";
    }
    
    public static String showTrailonMap()
    {
        return "//ul[@class='dropdown-menu pull-right']/li[5]/a/span[text()='Show trail on map']";
    }
   
    public static String checkBox()
    {
        return "//td[2]/div/span/input";        
    }
    
    public static String viewNewWindowCheckBox()
    {
        return "/tbody/tr[1]/td[2]/div/span/input";
    }
    
}
