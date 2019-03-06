/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects;

import KeywordDrivenTestFramework.Core.BaseClass;

/**
 *
 * @author mdevilliers
 */
public class UserAdminPageObjects extends BaseClass{
 
    
    public static String MixTelematicsURL() {
        return currentEnvironment.PageUrl;
    }
    
    public static String ManageXpath()
    {
        return "//a[text()='MANAGE ']";
    }
    
    public static String SecurityGroupXpath()
    {
        return "//a[text()='Security groups'][@ng-href]";
    }
    
    public static String AddNewSecurityGroupIconXpath()
    {
        return "//div[@class='page-header']/div//a[@fleet-tooltip='Add Security group']";
    }
    
    public static String ColumnChooserIconXpath()
    {
        return "//a[@class='btn btn-small column-chooser']";
    }
    
    public static String SecurityGroupLabalXpath()
    {
        return "//span[text()='Security groups']";
    }
    
    public static String SecurityGroupLandingPageUrl()
    {
        return "user-admin/security-groups";
    }
    
    //IE Security Group Landing pageUrl when Adding/Creating a new Security Group
    public static String IESecurityGroupLandingPageUrl()
    {
        return "https://integration.mixtelematics.com/#/user-admin/security-groups";
    }
    
    //PageName label xpath when Adding/Creating a new Security Group
    public static String AddSecurityGroupLabelXpath()
    {
        return "//span[text()='Add security group']";
    }
    
    //Textbox xpath when Adding/Creating a new Security Group
    public static String GroupNameInputFieldXpath()
    {
        return "//div[@fleet-loader='content']//div[@class='input']//input[@name='groupName']";
    }
    
    public static String GroupNameFieldRequiredXpath()
    {
        return "//span[text()='This field is required'][@style='display: none;']";
    }
    
    //Organisation Group span text xpath when Adding/Creating a new Security Group
    public static String OrganisationGroupSpanTextXpath()
    {
        return "//span[text()='Organisation group']";
    }
    
    //Details tab xpath when Adding/Creating a new Security Group
    public static String DetailsTabXpath()
    {
        return "//div[@class='tabbable tabs-left full-height']//li[@class='ng-scope active']/a[text()='Details']";
    }
    
    //Drop downListIcon xpath with a list Of Organisation groups when Adding/Creating a new Security Group
    public static String DropdownSpanXpath()
    {
        return "//a[@class='font-bold']/span[@class='caret caret-link']";
    }
    
    //Drop downListIcon xpath with a list Of Organisation groups when Adding/Creating a new Security Group
    public static String DropdownListOrginastionGroupXpath()
    {
        return "//a[@class='font-bold'][@ng-hide='!!groupId']/span[@ng-show='selectedOrganisations.any()']/..";
    }
    
    public static String ddl_span()
    {
        return "//span[@ng-show='!!groupId'][@class='font-bold help-block ng-binding']";
    }
       
    public static String disabledDropDown()
    {
        return "//div[@ng-show='form']/form[@name='securityGroupPermissionsForm']//select[@disabled='disabled']";
    }
    //Selecting a Organisation Group xpath when Adding/Creating a new Security Group
    public static String SelectOrganisationGroupXpath(String organisationGroup)
    {
        //return "//span[text()='"+organisationGroup+"']";
        return "//a/span[text()='"+organisationGroup+"'] |//a[@class=\"ng-scope active\"]/../span |//a[@class=\"ng-scope active selected\"]/span[text()='"+organisationGroup+"']";
    }
    
    public static String SelectOrganisationGroupXpath()
    {
        return "//a/span[text()='Engineering'] |//a[@class=\"ng-scope active\"]/../span |//a[@class=\"ng-scope active selected\"]/span[text()='Ettienie Test']";
    }
    
    
    
    //Select Organisation Button xpath when Adding/Creating a new Security Group 
    public static String OrganisationGroupSelectButtonXpth()
    {
        return "//a[text()='Select']";
    }
    
    //Button SelectUser xpath when Adding/Creating a new Security Group
    public static String ButtonSelectUsersXpath()
    {
        return "//form[@name='securityGroupForm']/div[@class='row-fluid']//a[@ng-click='selectUsers()'][text()='Select users']";
    }
    
    public static String DropdownListByName()
    {
        return "selectedRoleId";
    }
    
    public static String pageLoadXpath()
    {
        return "//div[@ng-show='$grid.isLoading']";
    }
    
     public static String SelectOrganisationGroupPopWindowXpath()
    {
        return "//div[@class='page-header']/div[@class='pull-left']/h5[text()='Select organisation group']";
    }
     
     public static String SelectUserGroupMembershipPopWindowXpath()
     {
         return "//div[@class='alert alert-success']/h5/span[text()='Select users for group membership']";
     }
     
     public static String SelectAssetsPopWindowXpath()
     {
         return "//div[@class='alert alert-success']/h5/span[text()='Select assets']";
     }
     
     public static String ButtonSelectXpath()
     {
         return "//div[@class='modal-footer']/button[text()='Select']";
     }
     
     public static String SecurityGroupPageNameXpath()
     {
         return "//div[@ui-if='title']/h5/a[@ng-click='click()'][text()='Security groups']";
     }
     
    public static String ButtonSelectSecurityGroupAccessLevelXpath()
    {
        return "//a[@class='btn btn-small btn-success btn-wide ng-binding'][text()='Select']";
    }
    
    //TextArea xpath with list of Membership  when Adding/Creating a new Security Group
    public static String TextAreaXpath()
    {
        return "//div[@class='text-tags']";
    }
    
    //Button Next xpath when Adding/Creating a new Security Group
    public static String buttonNextXpath()
    {
        return "//button[text()='Next']";
    }
    
    public static String buttonNextDisabledXpath()
    {
        return "//button[text()='Next'][contains(@disabled,'disabled')]";
    }
    
    //TopRight Button Cancel xpath when Adding/Creating a new Security Group
    public static String ButtonNextXpath()
    {
        return "//div/button[text()='Cancel']";
    }
    
    //Checkbox xpath for Selecting a user and add to group Membership When Adding a new Security Group
    public static String CheckBoxUserXpath(String username)
    {
        return "//tr/td/div/span[text()='"+username+"']/../../../td/input[@type='checkbox']";
    }
    
    public static String CheckBoxUserByRegistrationNoXpath(String registrationNo)
    {
        //return "//tr[1]/td/div/span/../../../td/input[@type='checkbox']";
        return "//tr/td/div/span[text()='"+registrationNo+"']/../../../td/input[@type='checkbox']";
    }
    
    public static String getRegistrationNoXpath()
    {
        return "//tr[1]/td/div/../../../../thead/tr[1]/th/span[text()='Registration number']/../../../../tbody/tr[1]/td[3]/div[1]/span[1]";
    }
    
    //SearchInputField xpath for Selecting a user When Adding a new Security Group
    public static String SearchInputFieldXpath()
    {
        return "//form/div/input";
    }
    
    public static String SearchInputFieldUserXpath()
    {
        return "//div[@eval-when='open']/form/div/input";
    }
    
    public static String NoItemToDisplaySpanXpath()
    {
        return "//div[@class='well well-small well-white']//div/span[text()='No items to display']";
    }
    
    public static String PermissionTabHeaderXpath()
    {
        return "//h5[text()='Security group permissions']";
    }
    
    public static String AddPermissionPopWindowXpath()
    {
        return "//h5[text()='Select what this security group has access to']";
    }
    
    public static String SecurityGroupHasAccessToXpath(String OrganisationGroup)
    {
        return "//div[@class='column ps-container']/a/span[text()='"+OrganisationGroup+"']";
    }
    
    public static String SelectButtonAddPermissionSecurityAccessXpath()
    {
        return "//div[@style='']//div[@class='menu-footer']//a[text()='Select']";
    }
    
    public static String DropDownListProfileXpath(String Profile)
    {
        return "//div[@class='row-fluid']//select/option[text()='"+Profile+"']";
    }
    //Drop downList Profile
    public static String ddlProfileXpath()
    {
        return "//div[@ng-show='form']/form[@name='securityGroupPermissionsForm']//select[@ng-disabled='!form.save || !canEdit']";
    }
            
    public static String DropDownListRoleXpath()
    {
        return "//div[@ng-show='form']/form[@name='securityGroupPermissionsForm']//select[@ng-disabled='!filteredAvailableRoles().any() || !form.save || !canEdit'][@name='selectedRoleId']";
    }
    
    public static String DropDownOption2Xpath()
    {
        return "//select[@name='selectedRoleId']/option[@value='2']";
    }
    
    public static String DropDownListRoleByXpath()
    {
        return "//select[@ng-model='selectedRoleId']";
    }
    
    public static String GroupNameXpath(String GroupName)
    {
        return "//div[@class='page-header']/h5/span[text()=' "+GroupName+"']";
    }
    
    public static String SecurityGroupPermissionListHearderXpath()
    {
        return "//div[@class='row-fluid']//h5[text()='Resolved permissions for this security group']";
    }
    
    public static String SecurityGroupPermissionContactColumnXpath()
    {
        return "//div[@class='well well-small permissions-selection-container']/table/tbody/tr/td[text()='Contacts']";
    }
    
    public static String ButtonSaveAddNewSecurityGroup()
    {
        return "//div[@class='page-header']//div[@class='selection-btn-right pull-right']/button[@enabled='!saveDisabled'][text()='Save']";
    }
    
    public static String ButtonSaveDisabledXpath()
    {
        return "//button[text()='Save'][contains(@disabled,'disabled')]";
    }
    
    public static String ButtonCancelXpath()
    {
        return "//div[@class='page-header']//div[@class='selection-btn-right pull-right']/button[text()='Cancel']";
    }
    
    public static String buttonSaveXpath()
    {
        return "//button[text()='Save']";
    }
    
   
    public static String ButtonAddCustomGroupXpath()
    {
        return "//a[@fleet-tooltip='Add custom group']";
    }
    
    public static String InputFieldGroupNameXpath()
    {
        return "//input[@name='groupName']";
    }
    
    public static String Spinner()
    {
        return "//div[@class='fa-detail-right well fa-detail-right-toggle']/div[@ng-show='loadingStack && loadingStack.length > 0'][@style='display: none;']";
    }
    
    public static String SecurityGroupGridSpinnerXpath()
    {
        return "//div[@class='loading-overlay ng-scope'][@ng-show='contentLoadingStack && contentLoadingStack.length > 0'][@style='display: none;']";
    }
    
    public static String ButtonAddPermissionXpath()
    {
        return "//a[text()='Add permissions']";
    }
    
    public static String ButtonAddPermissionUsersXpath()
    {
        return "//button[text()='Add permissions']";
    }
    
    public static String SecurityGroupPermissionLabelXpath()
    {
        return "//h5[text()='Security group permissions']";
    }
    
    public static String SecurityGroupAccessLevelXpath(String SecurityAccessLevel)
    {
        return "//div[@class='miller-selector']//span[text()='"+SecurityAccessLevel+"']";
    }
    
    public static String ButtonSelectSecurityGroupAccessXpath(String Select)
    {
        return "//div[@class='menu-footer']//a[text()='"+Select+"']";
    }
    
    public static String SecurityGroupAccessSubLevelXpath(String subSecurityAccessLevel)
    {
        return "//a/span[text()='"+subSecurityAccessLevel+"']";
    }
    
    //  <editor-fold defaultstate="collapsed" desc="Add New Security Group">
    
    public static String SecurityGroupNameXpath(String groupName)
    {
        return "//td/div/a/span[text()='"+groupName+"']/..";
    }
    
    public static String DeleteSecurityGroupNameXpath(String groupName)
    {
        return "//tr[1]/td/div/a/span[contains(text(),'"+groupName+"')]/..";
    }
    
    public static String ButtonClearXpath()
    {
        return "//button/i[@class='icon-remove-sign']";
    }
    
    public static String ConfirmGroupToDelete(String groupName)
    {
        return "//div[@name='removeGroupConfirmation']//strong[text()='"+groupName+"']";
    }
    
    public static String IconRemoveGroupMembershipXpath()
    {
        return "//a[contains(@ng-click,'removeItem')]";
    }
    
    public static String ActionButtonXpath()
    {
        return "//li[2]/div/div/a[@fleet-tooltip='Actions']";
    }
    
    public static String ActionRemoveXpath()
    {
        return "//ul[contains(@style,'display: block')]/li/a/span[text()='Remove']/..";
    }
    
    public static String NoItemsToDisplayXpath()
    {
        return "//div[@class='grid-no-items'][contains(@style,'display: none;')=false]/span[text()='No items to display']";
    }
    
    public static String ButtonRemoveXpath()
    {
        return "//button[text()='Remove']";
    }
    
    public static String SecurityGroupConfirmationMessageXpath(String groupName)
    {
        return "//p/strong[text()='"+groupName+"']";
    }
    
    public static String RemoveSecurityGroupPopUpWindow()
    {
        return "//div[@name='removeGroupConfirmation']";
    }
    
    public static String AllSecurityGroupSize()
    {
        return "//ul[@class='breadcrumb pull-left']/li/span";
    }
    
    public static String ResolvedPermissionForTheGroupXpath()
    {
        return "//div[@fleet-loader='summary']";
    }
    
    public static String firstUserCheckboxXpath()
    {
        return "//div[@eval-when='open']//tbody/tr[1]/td/input[@type='checkbox']";
    }
    
    //</editor-fold>
}
