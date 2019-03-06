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
public class DatabaseAdministrationRemovePageObjects extends BaseClass
{
    public static String ManageXpath() 
    {
        return "//a[text()='MANAGE ']";
    }
    
    public static String testnewRSOTreeXpath(String rsoName) 
    {
        return "//strong[text()='"+rsoName+"']";
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
    
     public static String editTestDealerXpath() 
    {
        return "//div[@ng-click='select()']//strong[text()='Test Dealer - DO NOT DELETE']/../..";
    }
    public static String dealerContactNameXpath() 
    {
        return "//input[@name='contactName']";
    }
    public static String dealerNameXpath() 
    {
        return "//input[@name='dealerName']";
    }
     public static String addDealerPageHeaderXpath() 
    {
        return "//span[text()='Add dealer']";
    }
   
    
    public static String selectDealerDropdownXpath() 
    {
        return "//a[@ng-click='add(groupType)'][text()='Dealer']";
    }
    public static String testRSOTreeXpath() 
    {
        return "//strong[text()='Test RSO']/../../../../span[@class='daredevel-tree-anchor ui-icon icon-plus ng-scope']";
    }
    public static String expandTestdealerTreeXpath() 
    {
        return "//strong[text()='Test Dealer - DO NOT DELETE']/../../../../span[@class='daredevel-tree-anchor ui-icon icon-plus ng-scope']";
    }
    
    public static String testnewRSODealerXpath(String dealerName) 
    {
        return "//strong[text()='"+dealerName+"']";
    }
    public static String removeAddedRSOXpath(String rsoName) 
    {
        return "//strong[text()='"+rsoName+"']/../..//a[@ng-click='remove()']";
    }
    public static String removeRSOXpath(String rsoName) 
    {
        return "//strong[text()='"+rsoName+"']/..";
    }
    public static String checkElementNotExpand(String rsoName) 
    {
        return "//strong[text()='"+rsoName+"']/../../../..//span";
    }
    public static String checkElementExpand() 
    {
        return "//strong[text()='AutoTest']/../../../..//span";
    }
    public static String removeRSOButtonXpath() 
    {
        return "//button[text()='Remove']";
    }
    public static String DVTOnlyXpath() 
    {
        return "//strong[text()='-= DVT  Only =-']/../../../../span";
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
    
    public static String editTestRSOXpath() 
    {
        return "//strong[text()='Test RSO']/../..";
    }
    
    public static String ExpandTestRSOXpath() 
    {
        return "//strong[text()='Test RSO']/../../../../span";
    }
    public static String addRSOButtonXpath() 
    {
        return "//i[@class='icon-plus icon-white']";
    }
    public static String selectRSOrgDropdownXpath() 
    {
        return "//a[@ng-click='add(groupType)'][text()='Regional Sales Organisation']";
    }
    
    public static String MultiLevelOrgDropdownXpath() 
    {
        return "//a[@ng-click='add(groupType)'][text()='Multi-level organisation']";
    }
  
    public static String expandTestDealerXpath() 
    {
        return "//strong[text()='Test Dealer - DO NOT DELETE']/../../../../span[@class='daredevel-tree-anchor ui-icon icon-plus ng-scope']";
    }
    public static String RSONameXpath() 
    {
        return "//input[@name='rsoName']";
    }
    
    public static String MultiLevelOrgNameTextBoxXpath() 
    {
        return "//span[text()='Name']/../../input";
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
    
     public static String buttonConfirmXpath() 
    {
        return "//button[text()='Confirm']";
    }
     
     public static String buttonMoveXpath() 
    {
        return "//button[text()='Move']";
    }
    
    public static String buttonConfirmRemoveXpath() 
    {
        return "//button[text()='Remove']";
    }
    
    public static String MultiLevelOrgXpath() 
    {
        return "//a/strong[text()='Tester']";
    }
    
    public static String buttonRemoveXpath(String OrgName) 
    {
        return "//strong[text()='"+OrgName+"']/../../a[@fleet-tooltip='Remove']";
    }
    
    
    
    public static String SuccesfullyAddedMultiOrgXpath() 
    {
        return "//span[text()='Multi-level organisation created successfully']";
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
     
        public static String cancelButtonXpath() 
    {
        return "//button[text()='Cancel']";
    }
 
        public static String SelectLocationTestingXpath() 
    {
        return "//strong[text()='Location Testing']/../..";
    }
    
    public static String EnabledCubesCheckBoxXpath() 
    {
        return "//span[text()='Enable for cubes']/../input";
    }
    
    public static String TableLoadingSpinnerXpath() 
    {
        return "//div[@class='row-fluid']/div[@class='loading-overlay ng-scope'][@style='display: none;']";
    }
    
    public static String TableLoadingSpinnerForDatabaseAdminXpath() 
    {
        return "//div/div[@class='loading-overlay ng-scope'][@style='display: none;']";
    }
    public static String EditLocationTestingXpath() 
    {
        return "//strong[text()='Location Testing']/..";
    }
    
    public static String WithoutCubesOrgXpath() 
    {
        return "//strong[text()='WithoutCubesDoNotDelete']/../..";
    }
    
    public static String EditWithoutCubesOrgXpath() 
    {
        return "//strong[text()='WithoutCubesDoNotDelete']/..";
    }
    
    public static String EditWithCubesXpath() 
    {
        return "//strong[text()='Location Testing_Multi-WithCubes']/..";
    }
    
    public static String OrgMovedSuccessfullyXpath() 
    {
        return "//span[text()='Organisation moved successfully']";
    }

    public static String ExpandLocationTestingXpath() 
    {
        return "//strong[text()='Location Testing']/../../../../span";
    }
    
    public static String ExpandMultiLevelOrgWithCubesXpath() 
    {
        return "//strong[text()='Location Testing_Multi-WithCubes']/../../../../span";
    }

    public static String OrganisationDropdownXpath() 
    {
        return "//a[@ng-click='add(groupType)'][text()='Organisation']";
    }

    public static String OrganisationNameTextBoxXpath() 
    {
        return "//label[text()='Display name']/../input";
    }
        public static String RefreshLinkXpath() 
    {
        return "//span[text()='Refresh']";
    }
    
     public static String OrgStatusXpath(String OrgName) 
    {
        return "//div[@class='database-item tree-item ng-scope ui-draggable']/a/strong[text()='"+OrgName+"']/../../div/div[2]";
    }

    //timezone xpath
     public static String timezoneXpath()
     {
         return "//div//select[@class='span12 ng-pristine ng-valid']";
     }

}
