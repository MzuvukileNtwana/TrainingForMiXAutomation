/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects;

/**
 *
 * @author arala
 */
public class AssetInfoBubbleUsingMapProviderDeCartasearchPageObject {
    public static String mapTranfer()
    {
        //select[@class='input-medium ng-pristine ng-valid']
        return "//select[@class='input-medium ng-pristine ng-valid']";
    }
    public static String liveTrackingHeadingXpath()
    {
        return "//span[text()='Live tracking']";
    }
    public static String customlayersXpath()
    {
        return "//input";
    }
     public static String orgDetailsXpath()
    {
        return "//h5[text()='Organisation details']";
    }
      public static String databaseNameXpath()
    {
        return "//span[text()='Database name']";
    }
       public static String mapSettingsXpath()
    {
        return "//a[text()='Map settings']";
    }
    public static String mapProviderXpath()
    {
        return "//span[text()='Map Provider']";
    }
    public static String goToAssetXpath()
    {
        return "//span[text()='Go to asset']";
    }
    public static String assetOnmapXpath()
    {
        return "//div[@class='leaflet-marker-pane']/div[1]/div/div/i";
    }
    public static String popUpMessageXpath()
    {
        return "//span[text()='Organisation updated successfully']";
    }
    public static String popUptextXpath()
    {
        return "//span[@id='pop-alert-message']";
    }
    public static String SaveButtonXpath()
    {
        return "//button[text()='Save']";
    }
    public static String MaptypeXpath()
    {
        return "//span[text()='Map Provider']/../../select";
    }   
    public static String dvtAutomationGroupXpath()
    {
        return "//div/a/strong[text()='DVT Automation']";
    }
    public static String expandTestRSOXpath()
    {
        return "//div[@class='database-item tree-item ng-scope ui-droppable']/a/strong[text()='Test RSO']/../../../../span";
    }
    public static String scrollTestRSOXpath()
    {
        return "//div/a/strong[text()='Test RSO']";
    }
    public static String managerXpath()
    {
        return "//li/a[text()='MANAGE ']";
    }
    public static String databaseAdminXpath()
    {
        return "//li/a[text()='Database administration']";
    }
    public static String liveTrackingXpath()
    {
        return "//li/a[text()='Live tracking']";
    }
    public static String filterTextBoxXpath()
    {
        return"//div[@class='left-pane']/div[4]/div[1]/div/input";
    }
    public static String non_FMassetXpath()
    {
        return "//a/span [text()='non-FM asset']";
    }
    public static String commandMobileDeviceXpath()
    {
        return "//ul[@class='dropdown-menu pull-right']/li[10]/a/span[text()='Commands to mobile device']";
    }
    public static String viewDetailsXpath()
    {
        return "//ul[@class='dropdown-menu pull-right']/li[1]/a/span[text()='View details']";
    }
    public static String DiagnosticsXpath()
    {
        return "//ul[@class='dropdown-menu pull-right']/li[2]/a/span[text()='Diagnostics']";
    } 
    //Organisation details
     public static String OrganisationDetailsXPath(){
         return "//h5[text()='Organisation details']";
    }
    //Database name
     public static String DatabaseNameXPath()
     {
         return "//span[text()='Database name']";
     }    	
    //Map settings
    public static String MapSettingsXPath()
    {
         return "//legend[text()='Map settings']";
    }
    //Map Provider
    public static String MapProviderXPath()
    {
         return "//span[text()='Map Provider']";
    }
    //Go to asset
    public static String GoToAssetXPath()
    {
         return "//ul[contains(@style,'display: block')]/li/a/span[text()='Go to asset']";
    }  
    //marker
    public static String  assetPlottedOnTheMapXPath()
    {
         return "//div[@class='leaflet-marker-pane']/div[1]/div/div/i";
    } 
    public static String  AssetXPath()
    {
         return "//strong[text()='Asset info']/../../div[2]/table/tbody/tr/td[2]";
    } 
    public static String  LocationXPath()
    {
         return "//strong[text()='Asset info']/../../div[2]/table/tbody/tr[2]/td[2]";
    } 
    public static String  LastPositionXPath()
    {
         return "//strong[text()='Asset info']/../../div[2]/table/tbody/tr[3]/td[2]";
    } 
    public static String  speedXPath()
    {
         return "//strong[text()='Asset info']/../../div[2]/table/tbody/tr[4]/td[2]";
    } 
    public static String  driverXPath()
    {
         return "//strong[text()='Asset info']/../../div[2]/table/tbody/tr[5]/td[2]";
    } 
    public static String  HeadingXPath()
    {
         return "//strong[text()='Asset info']/../../div[2]/table/tbody/tr[6]/td[2]";
    } 
    public static String  ignitonXPath()
    {
         return "//strong[text()='Asset info']/../../div[2]/table/tbody/tr[7]/td[2]";
    } 
    public static String  ignitionTimeXPath()
    {
         return "//strong[text()='Asset info']/../../div[2]/table/tbody/tr[8]/td[2]";
    } 
    
    public static String DefaultMapViewXpath() 
    {
        return "//span[text()='Default map view']/../../select";
    }
    public static String SatelliteMapProviderXpath() 
    {
        return "//span[text()='Satellite map provider']/../../select";
    }
     public static String assetDescriptionXpath() 
    {
        return "//span[text()='DVT Live Tracking Unit']";
    }
    
}
