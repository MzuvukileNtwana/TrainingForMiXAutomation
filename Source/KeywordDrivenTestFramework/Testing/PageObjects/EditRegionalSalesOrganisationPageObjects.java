/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects;

import KeywordDrivenTestFramework.Core.BaseClass;

/**
 *
 * @author smbiko
 */
public class EditRegionalSalesOrganisationPageObjects extends BaseClass
{
     public static String ManageXpath() 
    {
        return "//a[text()='MANAGE ']";
    }
    public static String DatabaseAdministrationXpath() 
    {
        return "//li/a[text()='Database administration']";
    }
    public static String DatabaseAdminPageHeadingXpath()
    {
        return "//h5/span[text()='Database administration']";
    }
    public static String ManageOrganizationStructureLabelXpath()
    {
        return "//h5/span[text()='Manage organization structure']";
    }
    public static String expandDataCenterXpath() 
    {
        return "//span[contains(@ui-if,'!item.expanded && hasSupportedChildren(item)')]";
    }
    public static String testRSOTreeXpath() 
    {
        return "//strong[text()='Test RSO']/../../../../span[@class='daredevel-tree-anchor ui-icon icon-plus ng-scope']";
    }
    public static String testnewRSOTreeXpath(String rsoName) 
    {
        return "//strong[text()='"+rsoName+"']";
    }
    public static String removeAddedRSOXpath(String newRsoName) 
    {
        return "//strong[text()='"+newRsoName+"']/../..//a[@ng-click='remove()']";
    }
    public static String removeRSOButtonXpath() 
    {
        return "//button[text()='Remove']";
    }
    
    
    public static String editRSOXpath() 
    {
        return "//strong[text()='Test RSO']";
    }
    public static String editMalOrgXpath() 
    {
        return "//strong[text()='MAL-ORG']";
    }
    public static String editMixDataCentreXpath() 
    {
        return "//strong[text()='MiX Telematics']/..";
    }
    public static String editDVTOnlyXpath() 
    {
        return "//strong[text()='-= DVT  Only =-']/..";
    }
    
    
    public static String addRSOButtonXpath() 
    {
        return "//i[@class='icon-plus icon-white']";
    }
    public static String selectRSOrgDropdownXpath() 
    {
        return "//a[@ng-click='add(groupType)'][text()='Regional Sales Organisation']";
    }
  
    public static String expandTestDealerXpath() 
    {
        return "//strong[text()='Test Dealer - DO NOT DELETE']/../../../../span[@class='daredevel-tree-anchor ui-icon icon-plus ng-scope']";
    }
    public static String RSONameXpath() 
    {
        return "//input[@name='rsoName']";
    }
    public static String dealerNameXpath() 
    {
        return "//input[@name='dealerName']";
    }
    
    public static String editRegionalSalesOrganisationPageHeaderXpath() 
    {
        return "//span[text()='Edit Regional Sales Organisation: ']";
    }
    public static String dealerContactNumberXpath() 
    {
        return "//input[@name='contactNumber']";
    }
    public static String dealerContactEmailXpath() 
    {
        return "//input[@name='contactEmail']";
    }
    public static String buttonSaveXpath() 
    {
        return "//button[text()='Save']";
    }
    public static String editedDetailsSavedMessageXpath() 
    {
        return "//span[@ng-show='popAlert.iconClass']/i[@class='icon-green icon-ok']/../..";  
    }
    public static String WaitTableSpinnerhistoricalXpath()
    {
        return "//div[@class='loading-overlay ng-scope'][@ng-show]/../div[@fleet-loader]";
    }
    public static String invalidCountryCodeXpath()
    {
        return "//span[text()='Invalid country code']";
    }
     public static String buttonCancelXpath()
    {
        return "//button[text()='Cancel']";
    }
     public static String removedRSOMessageXpath()
    {
        return "//span[@id='pop-alert-message'][text()='Regional Sales Organisation removed successfully']";
    }
    public static String detailsPageSpinnerXpath()
    {
        return "//h5[text()='Details']/../../../div[contains(@class,'loading-overlay')][contains(@style,'none')]";
    }
    public static String dbAdminPageSpinnerXpath()
    {
        return "//div[contains(@class,'loading-overlay')][contains(@style,'none')]";
    }
    
}
