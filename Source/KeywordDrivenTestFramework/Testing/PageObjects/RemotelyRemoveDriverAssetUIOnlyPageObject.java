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
public class RemotelyRemoveDriverAssetUIOnlyPageObject {
    
    public static String pageSpinnerXpath()
    {
        return "//div[contains(@class,'loading-overlay')][@style='display: none;']";
    } 
    
    public static String btnActionsXpath()
    {
        return "//div[contains(@class,'container-timeline')]/div/div/div/a[@fleet-tooltip=\"Actions\"]";
    } 
    
    public static String remoteDriverLogOffAssetLinkXpath()
    {
        return "//span[text()='Remote driver log off from asset']/../../a";
    } 
    
    public static String remoteDriverLogOffAssetPageHeaderXpath()
    {
        return "//h5/span[text()='Remote driver log off from asset']";
    } 
    
    public static String btnCancelXpath()
    {
        return "//button[text()='Cancel']";
    } 
    
    public static String assetNameXpath()
    {
        return "//strong[text()='Driver is currently logged in to the following asset']/../../div[@class='ng-binding']";
    } 
    
    public static String assetNameSelectionFilterXpath()
    {
        return "//form[@name=\"removeDriverForm\"]//input[@name=\"assetName\"]";
    } 
    
    public static String btnLogOffXpath()
    {
        return "//button[text()='Log off']";
    }
        
    public static String changeAssetLinkXpath()
    {
        return "//form[@name='removeDriverForm']//a[text()='Change asset']";
    }
        
    public static String cautionMessageXpath()
    {
        //Include the whole message to ensure no part is cut off
        return "//strong[text()='CAUTION']/../../div[\"Remotely logging the driver off the asset could result in data integrity issues with the driver's HOS logs. This may result in the driver's logs having to be rebuilt and the driver being in violation.\"]";
    }
    
    public static String enabledSelectionFileterXpath()
    {
        return "//div[@class=\"driverStatusAutoComplete\"]/input[not(@disabled='disabled')]";
    }
    
    public static String requiredFieldXpath()
    {
        return "//div[@class=\"driverStatusAutoComplete\"]/span[text()='This field is required'][not(contains(@style,'none'))]";
    }
    
    public static String numberOfMacthesXpath()
    {
        return "//ul[@class=\"typeahead dropdown-menu\"][contains(@style,'display: block')]/li";
    }
    
    public static String dropdownMenuSearchResultsXpath()
    {
        return "//ul[@class=\"typeahead dropdown-menu\"][contains(@style,'display: block')]";
    }
    
    public static String indexedAssetFromSearchResultsXpath(int i)
    {
        return "//ul[@class=\"typeahead dropdown-menu\"][contains(@style,'display: block')]/li[" + i + "]";
    }
    
    public static String HOSLogViewHeaderXpath()
    {
        return "//h5/span[text()='HOS Log Viewer']";
    }
}
