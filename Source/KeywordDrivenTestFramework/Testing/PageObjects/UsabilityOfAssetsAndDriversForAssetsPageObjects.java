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
public class UsabilityOfAssetsAndDriversForAssetsPageObjects {
    
  public static String addServerSideEventButtonXpath(){
        return "//div/a/i[@class='icon-plus icon-white']";
    }
    
    public static String eventDescriptionFieldXpath(){
        return "//div/input[@name='eventName']";
    }
    
    public static String recordEventForDropDownXpath(){
        return "//div/select[@ng-model='$controller.pageData.serverSideEventDetails.assetsDrivers']";
    }
    
    public static String nextButtonXpath(){
        return "//div/a[@ng-click='$controller.saveClick()']";
    }
    
    public static String groupRadioButtonXpath(){
        return "//input[@ng-model='$controller.assetTab'][@value='groups']";
    }
    
    public static String individualRadioButtonXpath(){
        return "//input[@ng-model='$controller.assetTab'][@value='individual']";
    }
    
    public static String stringDisplayedXpath(){
        return "//div[@class='well well-white no-margins']/div/p";
    }
    
    public static String organizationGroupXpath(){
        return "//div/a/span[text()='DVT Automation']";
    }
    
    public static String nextButtonDisabledXpath(){
        return "//div/a[@ng-click='$controller.saveClick()'][@disabled='disabled']";
    }
    
    public static String sitesListXpath(){
        return "//div[@ui-if='!!item.expanded && hasSupportedChildren(item)']/ul";
    }
    
    public static String expandButtonXpath(){
        return "//div/ul/li/span[@ui-if='!item.expanded && hasSupportedChildren(item)']";
    }
    
    public static String prefferedOrganisationXpath(){
        return "//div[@class='tree-sub-items ng-scope']/ul";
    }
    
    public static String enabledNextButtonXpath(){
        return "//div[@class='page-header-jm']/div/a[@ng-disabled='!$controller.saveEnabled']";
    }
    
    public static String stringXpath(){
        return "//div[@ng-show][contains(@ng-show, 'individual')]/p";
    }
    
    public static String organisationXpath(){
        return "//div[@class='checkbox ng-scope']/span[text()='DVT Automation']";
    }
    
    public static String checkBoxXpath(){
        return "//div[@class='checkbox ng-scope']//input[@type='checkbox']";
    }
    
     public static String individualExpandButtonXpath(){
        return "//div/ul/li/span[@ui-if='!item.expanded && hasSupportedChildren(item)']";
    }
     
      public static String expandButtonNextToSiteXpath(){
        return "//div/ul/li/span[@ui-if='!item.expanded && hasSupportedChildren(item)']";
    }

      
    public static String individualDriversSubGroupXpath() 
    {
        return "//ul[@items='$controller.assetTree']//li//ul//li//ul//li";
    }
    
    public static String listOfSitesForTheIndividualXpath(){
        return "//ul[@items='$controller.assetTree']/li/div/ul";
    }
    
    public static String assetsAsLinkedToRelevantXpath(){
        return "//ul[@items='$controller.assetTree']/li/div/ul/li";
    }




}
