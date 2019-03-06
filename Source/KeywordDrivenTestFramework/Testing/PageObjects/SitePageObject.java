/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects;

/**
 *
 * @author mdevilliers
 */
public class SitePageObject {

    
    
    //<buttons>
    public static String buttonAddXpath(){
        return "//a[@fleet-tooltip=\"Add site\"]";
    }
    
    public static String buttonSiteXpath(){
        return "//a[text()='Site']";
    }
    
    public static String buttonMonitorXpath() 
    {
        return "//a[text()='MONITOR ']";
    }
    
    public static String buttonOrganisationGroupsXpath() 
    {
        return "//a[text()='Organisation groups']";
    }
    
    public static String buttonServerSideEventsXpath() 
    {
        return "//a[text()='Server-side events']";
    }
    
    public static String buttonCancelXpath(){
        return "//button[text()='Cancel']";
    }
    
    public static String buttonSaveXpath(boolean checkEnabled){
        String suffix = "";
        
        if(checkEnabled){
            suffix = "[@disabled=\"disabled\"]";
        }
        
        return "//button[text()='Save']" + suffix;
    }
    
    public static String buttonRemoveSite(String newSite){
        return "//span[contains(text(),'"+ newSite +"')]/../a";
    }
    
    public static String buttonEditSite(){
        return "//a[@fleet-tooltip='Edit site']";
    }
    
    //</buttons>
    
    //<labels>
     public static String labelAddSiteXpath(){
        return "//span[text()='Add site']";
    }
    
     public static String labelNewSiteXpath(String newSite){
         return "//span[contains(text(),'"+ newSite +"')]";
     }
     
     public static String labelNoItemsXpath(){
         return "//div[@class='tab-pane active']/div/div/div/span[text()='No items to display']";
     }
     
     public static String labelAmountAssetsXpath(String newSite){
         return "//span[contains(text(),'"+newSite+"')]/../span[@fleet-tooltip='Assets'][text()='0']";
     }
      
     public static String labelAmountDriversXpath(String newSite){
         return "//span[contains(text(),'"+newSite+"')]/../span[@fleet-tooltip='Drivers'][text()='0']";
     }
     
      public static String labelAmountLocationsXpath(String newSite){
         return "//span[contains(text(),'"+newSite+"')]/../span[@fleet-tooltip='Locations'][text()='0']";
     }  
           
     public static String labelManageOrganisationGroupsXpath(){
         return "//h5[text()='Manage organisation groups']";
     } 
     
     public static String labelServerSideEventsXpath(){
         return "//h5/span[text()='Server-side events']";
     } 
     
     public static String labelAssetsXpath(){
         return "//a[@class='tab-left']/span[text()='Assets']";
     }
     public static String assetsLabelXpath(){
         return "//ul[@class='nav nav-tabs tabs-three']//li//a[@class='tab-left']//span[@class='tab-heading']//i[@class='icon-car']";
     }
     
     public static String labelDriversXpath(){
         return "//a[@class='tab-middle']/span[text()='Drivers']";
     }
     public static String driversLabelXpath(){
         return "//ul[@class='nav nav-tabs tabs-three']//li//a[@class='tab-middle']//span[@class]//i[@class='icon-drivers']";
     }
     
     public static String labelActiveXpath(){
         return "//a/span[text()='Active']";
     }
     
     public static String labelEditSite(){
         return "//div[@class='row-fluid']/div[contains(@class,'alert-success')]/h5/span[text()='Edit site']";
     }
     
    //</labels>
    
    
    //<inputs>
    public static String inputSiteNameXpath(){
        return "//input[@name='siteName']";
    }
    
    public static String inputNotesXpath(){
        return "//textarea[@name='notes']";
    }
    
    public static String inputFromAssetIDXpath(){
        return "//label/span[text()='From']/../../input[@name='assetSiteRangeFrom']";
    }
    
    public static String inputToAssetIDXpath(){
        return "//label/span[text()='To']/../../input[@name='assetSiteRangeTo']";
    }
    
     public static String inputFromDriverIDXpath(){
        return "//label/span[text()='From']/../../input[@name='driverSiteRangeFrom']";
    }
    
    public static String inputToDriverIDXpath(){
        return "//label/span[text()='To']/../../input[@name='driverSiteRangeTo']";
    }
    
    //</inputs>
    
    //<checkboxes>
    
    public static String checkboxAssetIDRangesXpath(){
        return "//label[@class='checkbox']/span[text()='Asset ID ranges']/../input";
    }
    
    public static String checkboxDriverIDRangesXpath(){
        return "//label[@class='checkbox']/span[text()='Driver ID ranges']/../input";
    }
    
    //</checkboxes>
    
    //<popUps>
    
    public static String popUpConfirm(){
        return "//div[contains(@class,'notification-wrapper notification-modal')][@style='display: block;']/div/span/i[@class='icon-green icon-ok']";
    }
    
    public static String popUpUpdateSuccess(){
        return "//div[@class='notification-wrapper notification-modal ng-scope'][@style='display: block;']/div/span[text()='Site updated successfully']";
    }
    //</popUps>
    
    public static String doneLoading(){
        return "//div[@class='modal hide fade hidden-phone modal-mini'][contains(@style,'display: none;')]";
    }
    
    //spinner
    public static String orgGroupsLeftpanlSpinner()
    {
        return "(//div[@class='tab-pane active']//div[@class='loading-overlay ng-scope'][@style='display: none;'])[3]";
    }
}
