/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects;

/**
 *
 * @author apeter
 */
public class UsabilityOfAssetsAndDriversForBothPageObjects {
    
    public static String recordEventForDropDownXpath(){
        return "//div/select[@ng-model='$controller.pageData.serverSideEventDetails.assetsDrivers']";
    }
     public static String recordEventForDropDownValueXpath(String valueToSelect){
        return "//option[@value='"+valueToSelect+"']";
    }
    public static String assetsGroupsRadioButtonXpath(){
        return "//h5[text()='Assets']/../div/div/label/span[text()='Groups']/../input";
    }
    
     public static String assetsIndividualsRadioButtonXpath(){
        return "//h5[text()='Assets']/../div/div/label/span[text()='Individual']/../input";
    }
     
    public static String stringDisplayedXpath(){
        return "//div[@class='well well-white no-margins']/div/p";
    }
    
    public static String organizationGroupXpath(){
        return "//ul[@items=\"$controller.assetGroupTree\"]//div//div//span[@class=\"ng-binding\"]";
    }
    
     public static String nextButtonDisabledXpath(){
        return "//div/a[@ng-click='$controller.saveClick()'][@disabled='disabled']";
    }
     
     public static String expandButtonXpath(){
        return "//div/ul/li/span[@ui-if='!item.expanded && hasSupportedChildren(item)']";
    }
     
    public static String driversGroupsRadioButtonXpath(){
        return "//h5[text()='Drivers']/../div/div/label/span[text()='Groups']/../input";
    }
    
    public static String driversIndividualRadioButtonXpath(){
        return "//h5[text()='Drivers']/../div/div/label/span[text()='Individual']/../input";
    }
    
    public static String driversExpandButtonXpath(){
      
        return "//h5[text()='Drivers']/../div/div/div/div/div/ul/li/span";
    }
    
    public static String preferedDriversOrganisationGroupXpath(){
       
        return "//h5[text()='Drivers']/../div/div/div/div/div/ul/li/div/ul";
    }
    
    public static String driversIndividualStringXpath(){
        
        return "//h5[text()='Drivers']/../div/div//div[@ng-show][contains(@ng-show, 'individual')]/p";
    }
    
    public static String driversCheckboxXpath(){
      
        return "//h5[text()='Drivers']/../div/div/div/div/div/ul/li/div/div/input";
    }
    
    public static String driversOrganisationGroupXpath(){
        return "//h5[text()='Drivers']/../div/div/div/div/div/ul/li/div/div/a/span[text()='DVT Automation']";
    }
    
    public static String individualdriversOrganisationGroupXpath(){
        return "//ul[@items=\"$controller.driverTree\"]//div[@class=\"checkbox ng-scope\"]//span";
    }
    
    public static String driversExpandNextToSiteXpath(){
      
        return "//h5[text()='Drivers']/../div/div/div/div/div/ul/li/div/ul/li/span";
    }
    
    public static String individualDriversSubGroupXpath() 
    {
        return "//ul[@items='$controller.driverTree']//li//ul//li//ul//li";
    }
    
    public static String driversPreferedOrganisationGroupXpath(){
        return "//h5[text()='Drivers']/../div/div//span[text()='Default Site']/../../../../div";
    }
     
    public static String driversListOfSitesForGroupXpath(){
        return "//h5[text()='Drivers']/../div/div/div/div/div/ul[@items='$controller.driverGroupTree']";
    }
    
    public static String relevantDriversListXpath(){
        return "//h5[text()='Drivers']/../div/div/div/div/div/ul/li/div/ul";
    }
    
    public static String driversGroupStringXpath(){
        return "//h5[text()='Drivers']/../div/div/div/p";
    }
    
    public static String driverIndividualExpandButtonXpath(){
        return "//ul[@items='$controller.driverTree']//span[@class='daredevel-tree-anchor ui-icon icon-plus ng-scope']";
    }
    
    public static String driversListXpath(){
        return "//ul[@items='$controller.driverTree']//ul";
    }
    
    public static String driversXpath(){
        return "//ul[@items='$controller.driverTree']//ul//ul";
    }
}
