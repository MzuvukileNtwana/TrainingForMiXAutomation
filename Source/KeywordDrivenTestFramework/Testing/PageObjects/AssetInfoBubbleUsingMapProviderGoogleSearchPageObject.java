/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects;

/**
 *
 * @author sscholtz
 */
public class AssetInfoBubbleUsingMapProviderGoogleSearchPageObject {
    
    public static String goToViewNewWindow()
    {
        return "//li/a/span[text()='View in new window']";
    }
    
    public static String MixTeleImagesFolder() 
    {
       return "\\SikuliImages\\MixTelematics\\";
    }
    
    
    public static String SuccessExtraction()
    {
        return "//span[text()='Organisation updated successfully']";
    }
    
    public static String SuccessWait()
    {
        return "//div[@class='notification-wrapper notification-modal ng-scope'][@style='display: none;']";
    }
    
    public static String DropDown()
    {
        return "//div[@class='map-types pull-right tracking-toolbar-item mr-10']/select";
    }
    
    public static String SelectedView(String number)
    {
        return "//div[@class='map-types pull-right tracking-toolbar-item mr-10']/select/option[@value='"+ number +"'][@selected='selected']";
    }
    
    public static String Select(String name)
    {
        return "//div[@class='map-types pull-right tracking-toolbar-item mr-10']/select/option[text()='"+ name +"']";
    }
    
    public static String ActionButton()
    {
        return "DVTLiveActionButton2.png";
    }

    public static String DockOpenChrome()
    {
        return "OpenDockChrome.png";
    }
    
    public static String DockBottomChrome()
    {
        return "DockBottomChrome.png";
    }
    
    public static String DockBottomFirefox()
    {
        return "dockFirefox.PNG";
    }
    
    public static String GoToAsset()
    {
        //return "GoToAsset.png";
        return "GoToAsset2.PNG";
    }
    
    public static String GoToHeader()
    {
        return "FirefoxHeader.png";
    }
    
    public static String MapView()
    {
        return "//select[@name='defaultMapView']";
    }
    
    public static String LiveTrackingGridSpinner()
    {
        return "//div[@class='tracking-search-container strong-grid']/div[@class='loading-overlay ng-scope'][@style='display: none;']";
    }
    
    public static String CheckAll()
    {
        return "//th[@class='column-heading  first']/span[@ng-show=\"column.cellType == 'fleet-strong-grid-checkbox-cell' && !column.title\"]/input[@ng-model=\"column.synchonisedState\"]";
    }
    
     public static String ClickCheckBox()
    {
        return "//span[text()='DVT non-FM asset']/../../../../td[@ng-show='column.visible']/div/span/input";
    }
     
      public static String ClearIE()
    {
        return "ClearIE.png";
    }
      public static String LockAsset()
      {
        return "LockAsset.png";        
      }
    
}
