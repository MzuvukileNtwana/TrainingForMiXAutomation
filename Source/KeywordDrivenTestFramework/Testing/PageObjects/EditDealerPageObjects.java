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
public class EditDealerPageObjects extends BaseClass
{
    public static String ManageXpath() 
    {
        return "//a[text()='MANAGE ']";
    }
    public static String DatabaseAdministrationXpath() 
    {
        return "//li/a[text()='Database administration']";
    }
    public static String DatabaseAdminPageHeadingXpath(){
        return "//h5/span[text()='Database administration']";
    }
    public static String expandDataCenterXpath() 
    {
        return "//span[contains(@ui-if,'!item.expanded && hasSupportedChildren(item)')]";
    }
    public static String testRSOTreeXpath() 
    {
        return "//strong[text()='Test RSO']/../../../../span[@class='daredevel-tree-anchor ui-icon icon-plus ng-scope']";
    }
    public static String editTestDealerXpath() 
    {
        return "//strong[text()='Test Dealer - DO NOT DELETE']";
    }
    public static String expandTestDealerXpath() 
    {
        return "//strong[text()='Test Dealer - DO NOT DELETE']/../../../../span[@class='daredevel-tree-anchor ui-icon icon-plus ng-scope']";
    }
    public static String dealerContactNameXpath() 
    {
        return "//input[@name='contactName']";
    }
    public static String dealerNameXpath() 
    {
        return "//input[@name='dealerName']";
    }
    
    public static String editDealerPageHeaderXpath() 
    {
        return "//span[text()='Edit dealer: ']";
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
        return "//span[text()='Dealer updated successfully']";
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
    
    
    
    
    
    
    
    
    
    
            
}
