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
public class AccessControlDefaultDriverForNonFMUnitsPAgeObjects 
{
        public static String DefaultDriverXpath() 
    {
        return "//span[text()='Asset has a default driver']/../input";
    }
    
    public static String DisabledDriverDropDownXpath() 
    {
        return "//select[contains(@disabled,'disabled')]";
    }
    
    public static String AssetsHeaderXpath() 
    {
        return "//h5/a[text()='Asset access control']";
    }

    public static String ActionsXpath() 
    {
        return "//div[@row='0']/div/a";
    }
    public static String ActionsPassengerXpath() 
    {
        return "//div/ul/li/div[@column='rowActions']/div/a";
    }
    
    public static String DriverActionButtonXpath()
    {
        return "//div//div/a[@class='row-action']";
    }
    
    public static String ActionButtonXpath()
    {
        return "//div[@row='0']/div/a[@class='row-action']";
    }
    
    public static String EditXpath() 
    {
        return "//ul/li/a[@event= 'Edit']";
    }
    
    //div[@row='0']//a[@class='row-action']//..
    public static String EditsXpath() 
    {
        return "//ul[contains(@style,'display: block')]/li/a/i/../span[text()='Edit']";
    }
    
    public static String AccessTabXpath() 
    {
        return "//li/a[text()= 'Access control']";
    }
           
    public static String AssetStatusTabXpath() 
    {
        return "//li/a[text()= 'Asset status']";
    }
    
    public static String ServiceHistoryTabXpath() 
    {
        return "//li/a[text()= 'Service history']";
    }
    
    public static String RemindersTabXpath() 
    {
        return "//li/a[text()= 'Reminders']";
    }
    
    public static String FuelDataTabXpath() 
    {
        return "//li/a[text()= 'Fuel data']";
    }
    
    public static String OtherCostDataTabXpath() 
    {
        return "//li/a[text()= 'Other cost data']";
    }
    
    public static String MobileDeviceSettingsTabXpath() 
    {
        return "//li/a[text()= 'Mobile device settings']";
    }
    
    
    public static String DriversDropDownXpath() 
    {
        return "//div/div/select";
    }
    
    public static String AccessControlHeaderXpath() 
    {
        return "//fieldset/legend";
    }
    
    public static String ConfigGroupsHeaderXpath() 
    {
        return "//div//h5[text()='DVT Config Group']";
    }
    
    public static String DefaultNameLabelXpath() 
    {
        return "//span[text()='Default driver name']";
    }
    
    public static String EditAssetHeaderXpath() 
    {
        return "//h5/span[text()='Edit asset']";
    }
   
    public static String CheckBoxHasDefaultDriverXpath() 
    {
        return "//label[@class='checkbox inline-block']//input[@name='hasDefaultDriver']";
    }
    public static String SuccesbannerXpath() 
    {
        return "//div[@class='notification-wrapper notification-modal ng-scope'][@style='display: none;']";
    }
    
    public static String SaveButtonXpath() 
    {
        return "//div/div/button[text()='Save']";
    }
    public static String SaveButtonEnabledXpath() 
    {
        return "//div/div/button[text()='Save' and @enabled='!saveDisabled']";
    }
    
    public static String CancelButtonXpath() 
    {
        return "//div/div/button[text()='Cancel']";
    }
    
    public static String assetRightPageSpinnerXpath() 
    {
        return "//div[@class=\"paged-grid\"]//div[@class='loading-overlay'][@style='display: none;']";
    } 
    public static String assetLeftPageSpinnerXpath() 
    {
        return "//ul[@name=\"assetListItemTypeFilter\"]/../div[@class='loading-overlay'][@style='display: none;']";
    }
    public static String accessControlPageSpinnerXpath() 
    {
        return "//form[@name=\"assetAccessControlForm\"]/../div[contains(@class,'loading-overlay')][contains(@style,'none')]";
    }
}
