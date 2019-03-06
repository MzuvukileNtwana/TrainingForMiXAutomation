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
public class AddOrganisationPageObjects 
{
    public static String selectOrganisationDropdownXpath() 
    {
        return "//a[@ng-click='add(groupType)'][text()='Organisation']";
    }
    
    public static String regionalSalesOrganisationXpath() 
    {
        return "//strong[text()='Test RSO']/../..";
    }
    
    public static String addedOrganisationXpath(String org) 
    {
        return "//strong[text()='"+org+"']/..";
    }
    
    public static String removeOrgXpath(String org)
    {
        return "//strong[text()='"+org+"']/../..//a[@fleet-tooltip='Remove']";
    }
    
    public static String removeConfirmationXpath()
    {
        return "//span[text()='Organisation is being deleted. You will receive an email notifying you when the organisation has been deleted.']";
    }
    
    public static String refreshButtonXpath()
    {
        return "//span[text()='Manage organisation structure']/..//a";
    }
    
    public static String confirmationPopUpXpath()
    {
        return "//span[text()='The organisation is being created. You will receive an email notifying you when the organisation is active.']";
    }
    
    public static String legalEntityNameFieldXpath()
    {
        return "//input[@name='legalEntityName']";
    }
    
    public static String organisationNameFieldXpath()
    {
        return "//input[@name='organisationName']";
    }
    
    public static String customerGroupDropdownXpath()
    {
        return "//select[@name='customerGroupId']";
    }
    
    public static String makertVerticalDropdownXpath()
    {
        return "//select[@name='marketVerticals']";
    }
    
    public static String countryDropdownXpath()
    {
        return "//select[@name='countryCode']";
    }
    
    public static String otherAccountNumberXpath()
    {
        return "//input[@name='erp']";
    }
    
    public static String billingContractDropdownXpath()
    {
        return "//select[@name='billingContractId']";
    }
    
    public static String billingCodeDropdownXpath()
    {
        return "//select[@name='billingCodeId']";
    }
    
    public static String mandantoryXpath(String fieldLabel)
    {
        return "//form[@name='organisationDetailsForm']//span[text()='"+fieldLabel+"']/../span[@class='field-mandatory']";
    }
    
    public static String mandantoryFieldXpath(String fieldLabel)
    {
        return "//form[@name='organisationDetailsForm']//span[text()='"+fieldLabel+"']/../span[@class='field-mandatory']/../span[1]";
    }
    
    public static String databaseAdministrationHeaderXpath()
    {
        return "//h5/a[text()='Database administration']";
    }
    
    public static String activateOrganisationForCheckboxXpath(int num)
    {
        return "//label[@class='checkbox']["+num+"]/input";
    }
    
    public static String displayNameFieldXpath()
    {
        return "//input[@name='legalEntityName']";
    } 
    
    public static String databaseNameFieldXpath()
    {
        return "//input[@name='databaseName']";
    } 
    
    public static String copyDatabaseCheckboxXpath()
    {
        return "//input[@name='mustCopyFromExistingDatabase']";
    } 
    
    public static String copyFromDropdownXpath()
    {
        return "//span[text()='Copy from']/../../select";
    }
    
    public static String displayNameLabelXpath()
    {
        return "//label[text()='Display name']";
    }
    
    public static String databaseNameLabelXpath()
    {
        return "//label[text()='Database name']";
    }
    
    public static String checkBoxLabelXpath()
    {
        return "//span[text()='Copy database configuration from an existing database']";
    }
    
    public static String copyFromDropdownLabelXpath()
    {
        return "//span[text()='Copy from']";
    }
    
    public static String selectedOptionXpath(String option)
    {
        return "//span[text()='Copy from']/../../select/option[text()='"+option+"']";
    }
    
    //Enable for cubes
    public static String multiLevelOrgXpath(String org)
    {
        return "//strong[text()='"+org+"']";
    }
    
    public static String editMultiLevelOrgHeadingXpath()
    {
        return "//span[text()='Edit multi-level organisation: ']";
    }
    
    public static String enableForCubesCheckboxXpath()
    {
        return "//input[@name='cubeView']";
    }
    
    public static String buttonXpath(String buttonText)
    {
        return "//button[text()='"+buttonText+"']";
    }
    
    public static String validationPopUpHeaderXpath()
    {
        return "//h5[text()='Validation failed']";
    }
    
    public static String ensureXpath()
    {
        return "//h5[text()='Validation failed']/../..//div[@ng-bind-html-unsafe='$modal.message | translate:$modal.data']";
    }
    
    public static String manageOrganisationStructureXpath()
    {
        return "//span[text()='Manage organisation structure']";
    }
    
    public static String migrateButtonXpath()
    {
        return "//a[@fleet-tooltip='Migrate']";
    }
    
    public static String migrateHeadingXpath()
    {
        return "//span[text()='Select organisations you wish to migrate']";
    }
    
    public static String cancelButtonOnMigrateXpath()
    {
        return "//span[text()='Select organisations you wish to migrate']/../../../../../../div[@class='modal-footer']/button[@text='Cancel']";
    }
    
    public static String closeXpath()
    {
        return "//span[text()='Select organisations you wish to migrate']/../../button[@class='close']";
    }
    
    public static String filterXpath()
    {
        return "//input[@placeholder='Filter']";
    }
    
    public static String organisationColumnHeaderXpath()
    {
        return "//th/span[text()='Organisation']";
    }
    
    public static String databaseNameColumnHeaderXpath()
    {
        return "//th/span[text()='Database name']";
    }
    
    public static String preferedOrganisationXpath(int num)
    {
         return "//div[@class='fleet-grid full-height selection']/table/tbody/tr["+num+"]/td/input[@type='checkbox']";
    }
    
    public static String organisationsXpath()
    {
        return "//div[@class='fleet-grid full-height selection']/table/tbody/tr";
    }
    
    public static String clearFilterButtonXpath()
    {
        return "//button[@class='input-reset']";
    }
    
    public static String filteredOrgXpath()
    {
        return "//div[@class='fleet-grid full-height selection']/table/tbody/tr/td[@column-field='name']";
    }
    
     public static String locationTestingOrganisationsXpath(int org)
    {
        return "//strong[text()='Location Testing']/../../../..//ul/li["+org+"]//a/strong";
    }
    public static String locationTestingOrganisationsXpath()
    {
        return "//strong[text()='Location Testing']/../../../..//ul/li//a/strong";
    }
    public static String locationTestingOrganisationsXpath2()
    {
        return "//strong[text()='Multi-level Org (with Orgs that has all required fields filled in)']/../../../..//ul/li//a/strong";
    }
    
    public static String locationTestingExpandButtonXpath(String org)
    {
        return "//strong[text()='"+org+"']/../../../..//span";
    }
     public static String editModeXpath()
    {
        return "//h5[text()='Organisation details']";
    }
    public static String saveButtonXpath()
    {
        return "//span[text()='Display name']/../../../../../../../../../../../..//button[@text='Save']";
    }
    public static String orgUpdatedAlertXpath()
    {
        return "//span[text()='Organisation updated successfully']";
    }
    public static String multiLevelOrgAlertPopUpXpath()
    {
        return "//span[text()='Multi-level organisation updated successfully']";
    }
}
