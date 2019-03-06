/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects;

/**
 *
 * @author szeuch
 */
public class ItemNotAvailableWhenNotHavingPermissionPageObject
{

    public static String MailinatorURL()
    {
        return "https://mailinator.com/";
    }

    public static String locationButtonXpath()
    {
        return "//a[@ng-click='showLocationModal()']//i[@class='icon-map-marker']";
    }

    public static String locationsHeaderCheckboxXpath()
    {
        return "//div[@class='modal-body']//th[1]//input";
    }

    public static String SuccessVaildateXPath()
    {
        return "//span[@id='pop-alert-message']/../../../div[@class='notification-wrapper notification-modal ng-scope'][@style='display: none;']";
    }

    public static String locationsFilterXpath()
    {
        return "//div[@class='modal-body']//input[@placeholder='Filter']";
    }

    public static String locationsBodyCheckboxXpath()
    {
        return "//div[@class='modal-body']//tr[1]//td[1]//input[@type='checkbox']";
    }

    public static String locationsSelectButtonXpath()
    {
        return "//button[text()='Select']";
    }

    public static String numberOfLocationsSelectedXpath()
    {
        return "//i[@class='icon-map-marker']/..//span[text()='1']";
    }

    public static String eventsButtonXpath()
    {
        return "//i[@class='icon-flag']";
    }

    public static String eventsHeadingXpath()
    {
        return "//span[text()='Select events']";
    }

    public static String eventsHeaderCheckboXpath()
    {
        return "//span[text()='Select events']/../../..//table//thead//tr//th[1]";
    }

    public static String eventsFilterXpath()
    {
        return "//span[text()='Select events']/../../..//input[@placeholder='Filter']";
    }

    public static String eventsBodyCheckboxXpath()
    {
        return "//span[text()='Select events']/../../..//table//tbody//tr//td[1]//input[@type='checkbox']";
    }

    public static String eventsSelectButtonXpath()
    {
        return "//span[text()='Select events']/../../../../../..//button[text()='Select']";
    }

    public static String mapToolsXpath()
    {
        return "//a[@fleet-tooltip='Map tools']";
    }

    public static String diagnosticsXpath()
    {
        return "//span[text()='Diagnostics']";
    }

    public static String findXpath()
    {
        return "//a[@fleet-tooltip='Find']";
    }

    public static String findAPlaceXpath()
    {
        return "//a[text()='Find a place']";
    }

    public static String longitudeRadioButtonXpath()
    {
        return "//div[@ng-show=\"finding == 'place'\"]//span[text()='A latitude/longitude']/..//input";
    }

    public static String latitudeTextboxXpath()
    {
        return "//label[text()='Latitude']/..//input";
    }

    public static String buttonGoXpath()
    {
        return "//button[text()='Go!']";
    }

    public static String zoomInButtonXpath()
    {
        return "//a[@title='Zoom in']";
    }

    public static String mapProviderXpath()
    {
        return "//select[@ng-model='mapProvider']";
    }

    public static String pathXpath()
    {
        return "//*[local-name() = 'path']";
    }

    public static String locationNameFieldXpath()
    {
        return "//span[text()='Location name']/../..//input[@type='text']";
    }

    public static String selectGroupButtonXpath()
    {
        return "//a[text()='Select group']";
    }

    public static String SpanWithTextXpath(String text)
    {
        return "//span[text()='" + text + "']";
    }

    //Created successfully pop-up xpath
    public static String SpanWithIDMessagePopup()
    {
        return "//span[@id='pop-alert-message']";
    }

    public static String rolesHeaderXpath()
    {
        return "//h5//span[text()='Roles']";
    }

    public static String securityGroupsHeaderXpath()
    {
        return "//h5//span[text()='Security groups']";
    }

    public static String securitySubHeader()
    {
        return "//li//a[text()='Security groups']";
    }

    public static String userStatus()
    {
        return "//thead/tr/th[7]/span[2][text()='Status']";
    }

    public static String securityFliterTextBox()
    {
        return "//form/div/input";
    }

    public static String securityActionButttonToDelete()
    {
        return "//ul/li[2]/div/div/a[1]/..";
    }

    public static String userRemoveButton()
    {
        //return "//ul[@style='display: block; left: 1718.05px; top: 223px; right: auto;']/li[3]/a/span[text()='Remove']";
        return "//ul[contains(@style, 'block;')]//span[text()='Remove']";
    }

    public static String rolesReomoveFromDropDown()
    {
        //return "//ul[@style='display: block; left: 1718.05px; top: 223px; right: auto;']/li[3]/a/span[text()='Remove']";
        return "//ul[contains(@style, 'block;')]//span[text()='Remove']";
    }

    public static String removeRolePopUpMessage()
    {
        return "//span[text()='Role removed successfully']";
    }

    public static String RolesRemoveButton()
    {
        return "//div[@class='modal-footer']/button[2][text()='Remove']";
    }

    public static String removeRoleHeader()
    {
        return "//span[text()='Remove role']";
    }

    public static String removeButtonOnSecurityGroupsPage()
    {
        return "//ul[contains(@style, 'block;')]//span[text()='Remove']";
    }

    public static String removePageHeader()
    {
        return "//span[text()='Cannot remove security group']";
    }

    public static String userDeleteButton()
    {
        return "//div[@class='modal-footer']/button[text()='Delete']";
    }

    public static String popHeaderAfterDeleteTheUser()
    {
        return "//div/div/span[2][text()='User removed successfully']";
    }

    public static String DeleteUserPageHeader()
    {
        return "//span[text()='Delete user']";
    }

    public static String userDeleteDropDownReason()
    {
        return "//form[@name='deleteUserForm']/select";
    }

    public static String OKButtonToRemove()
    {
        return "//div[@class='modal-footer']/button[text()='OK']";
    }

    public static String AddButtonXpath()
    {
        return "//i[contains(@class, 'icon-plus')]";
        //return "//a//i[contains(@class, 'icon-plus')]";
    }

    public static String AddUserButtonXpath()
    {
        return "//i[contains(@class, 'icon-plus')]";
    }
    public static String AddRolesButtonXpath()
    {
        return "//a[@fleet-tooltip='Add role']//i[contains(@class, 'icon-plus')]/..";
    }

    public static String addRolesSpinnerXpath()
    {
        return "//div[@row-actions='roleListGridRowActions']/../../div[contains(@class, 'loading-overlay')][@style='display: none;']";
    }

    public static String rolesTableSpinner()
    {
        return "//div[2]/div[@class='loading-overlay ng-scope'][@style='display: none;']";
    }
    
    public static String RolesPageSpinner()
    {
        return "//div[@class='fleet-grid-container strong-grid']/div[@class='loading-overlay ng-scope'][@style='display: none;']";
    }

    public static String securityGroupTableSpinner()
    {
        return "//div[@class='loading-overlay ng-scope'][@ng-show='contentLoadingStack && contentLoadingStack.length > 0']";
    }   
   
    public static String SecurityGroupPermissionSpinner()
    {
        return "//div[@class='loading-overlay ng-scope'][@ng-show=\"pageLoadingStack && pageLoadingStack.length > 0\"][@style='display: none;']";
    }           

    public static String AddSecurityGroupButtonXpath()
    {
        return "//a[@fleet-tooltip='Add Security group']/i[@class='icon-plus icon-white']";
    }


    public static String TextBoxWithSpanTextXpath(String text)
    {
        return "//span[text()='" + text + "']/../..//input";
    }

    public static String roleNameTextBoxXpath()
    {
        return "//input[@name='roleName']";
    }

    public static String roleSubHeader()
    {
        return "//li/a[text()='Roles']";
    }

    public static String userSecurityGroupCheckboxXpath()
    {
        return "//th/span[text()='Security group']/../../../../tbody/tr/td/input[@type='checkbox']";
    }

    public static String usersSelectSecurityButtonXpath()
    {
        return "//button[text()='Select']";
    }

    public static String userSecurityButtonXpath(String SecurityGroupName)
    {
        return "//div[text()='" + SecurityGroupName + " " + "']/..";
    }

    public static String LabelWithTextXpath(String text)
    {
        return "//label[text()='" + text + "']/../..//select";
    }

    public static String ProfileTypeDropDownXpath()
    {
        return "//select";
    }

    public static String AWithTextXpath(String text)
    {
        return "//a[text()='" + text + "']";
    }
    public static String SecurityGroupDetailsTextBoxXpath()
    {
        return "//input[@name='groupName']";
    }

    public static String addPermissionsButtonXpath()
    {
        return "//a[text()='Add permissions']";
    }

    public static String AddRoleMakeAvailableExpandMiXTelematicsXpath()
    {
        return "//a[@class='tree-item']//span[text()='MiX Telematics']/../../../..//span[contains(@class, 'icon-plus')]";
    }

    public static String AddRoleMakeAvailableExpandTestRSOXpath()
    {
        return "//span[text()='Test RSO']/../../../..//span[contains(@class, 'icon-plus')]";
    }

    public static String AddRoleMakeAvailableDVTAutomationItemXpath()
    {
        return "//a[@class='tree-item']//span[text()='DVT Automation']";
    }

    public static String UpdatedGroupNotificationXpath()
    {
        return "//span[text()='Security group updated successfully']";
    }

    public static String ButtonWithTextXPath(String text)
    {
        return "//button[text()='" + text + "']";
    }
    public static String roleSavedSpinnerFirefox()
    {
        return "//div[@style=\'display: none;\']";
    }

    public static String ButtonSaveDisabledXpath()
    {
        return "//button[text()='Save'][@disabled='disabled']";
    }

    public static String ButtonSaveXPath()
    {
        return "//button[text()='Save']";
    }

    public static String newSecurityGroupCheckboxXpath()
    {
        return "//th/span[text()='Security group']/../../../../tbody/tr/td/input[@type='checkbox']";
    }

    public static String selectedSecurityGroupXpath()
    {
        return "//div[@class='text-tags']/div/div";
    }

    public static String AddRolePermissionsWithTextXpath(String text)
    {
        return "//h5[text()='" + text + "']/..//i";
    }

    public static String clickGeneralXpath()
    {
        return "//h5[text()='General']/..//i";
    }

    public static String clickLoginWebApplicationXpath()
    {
        return "//td[text()='Login - Web application']/..//input[not(@disabled='disabled')]";
    }

    public static String AddRoleSubItemPermissionWithTextXpath(String text)
    {
        return "//td[text()='" + text + "']/..//input[not(@disabled='disabled')]";
    }
    public static String ListOfSecurityGroupsXpath()
    {
        return "//a[@class='clickable-cell ng-scope']";
    }

    public static String ManageMenuXpath()
    {
        return "//a[text()='MANAGE ']";
    }

    public static String MonitorMenuXpath()
    {
        return "//a[text()='MONITOR ']";
    }

    public static String OrganisationGroupXpath(String org)
    {
        return "//a//span//span[text()='" + org + "']";
//        return "//a//span//span[text()='DVT Automation']";
    }

    public static String H5WithTextPath(String text)
    {
        return "//h5[text()='" + text + "']";
    }

    public static String OrganisationButtonXpath(String org)
    {
        return "//a[@class='ng-scope']//span[text()='" + org + "']";
    }

    public static String OrganisationSelectorSelectButtonXpath()
    {
        return "//div[@class='miller-selector-modal-container white-box-shadow ng-scope in']//a[text()='Select']";
    }
    public static String SecurityGroupProfileDropDownXpath()
    {
        return "//select[@ng-model='form.selectedProfileId']";
    }

    public static String DropDownWithSpanTextXpath(String text)
    {
        return "//span[text()='" + text + "']/../..//select";
    }

    public static String MailinatorInboxFieldId()
    {
        return "inboxfield";
    }

    public static String MailinatorEmailAddressFieldXpath()
    {
        return "//input[@id='inboxfield']";
    }
    
 //------------------------//IE XPATHS//----------------------------//
    
    public static String IEuserNameXpath()
    {
        return "//input[@id='inboxfield']";
    }
 
 //-----------------------------------------------------------------//   
    
    public static String MailinatorGoButtonXpath()
    {
        return "//button[contains(text(),'Go')]";
    }
    
    public static String UsernameInputFieldXPath()
    {
        //return "//div/label[text()='USERNAME']/../div/input";
        return "//input[@name = 'userName']";
    }
    
        public static String PasswordInputFieldXPath(){
        //return "//div/label[text()='PASSWORD']/../div/input";
        return "//input[@name = 'password']";
    }

    public static String MailinatorMixEmailSubject()
    {
        //return "//div[@class='innermail ng-binding'][contains(text(), 'Verify username')]";
        return "//div[contains(text(), 'Verify username')]";
    }

    public static String FFMailinatorMixEmailSubject()
    {
        return "//div[text()='Verify username')]";
    }

    public static String TableLoadingSpinnerRolesSaveXpath()
    {
        return "//div[@class='span12 tab-content'][@style='overflow: visible; height: 100%;']";

    }

    public static String MailinatorEmailFrameName()
    {
        return "publicshowmaildivcontent";
    }

    public static String MailinatorAccountLinkXpath()
    {
        return "//tr/td/p/a";
    }

    public static String MailinatorAccountLinkXpathIE()
    {
        return "//tr/td/p/a[@style='color: rgb(80, 184, 72);']";
    }
    
    public static String MailinatorDeleteEmailButtonXpath()
    {
        return "//button[contains(@onclick, 'del')]";
    }

    public static String MailinatorValidateEmailWasDeletedXpath()
    {
        return "//div[@id='publicm8rguy'][contains(text(), '[ This Inbox is currently Empty ]')]";
    }

    public static String InputWithNameXpath(String text)
    {
        return "//input[@name = '" + text + "']";
    }

    public static String OrganisationSelectorTextXpath(String org)
    {
        return "//a[@ng-click=\"$broadcast('openOrganisationSelectionMiller')\"]//span[text()='" + org + "']";
    }

    public static String AssetsVisibleXpath()
    {
        return "//table//tbody[@fleet-draggable-group='draggable']//tr";
    }

    public static String ShowAllAssetsCheckBoxXpath()
    {
        return "//th//span[text()='Asset description']/../../th[3]//input";
    }

    public static String AssetFilterXpath()
    {
        return "//input[@ng-model='mainFilterQuery']";
    }

    public static String AssetActionsButtonXpath()
    {
        return "//div[@ng-show='rowActions']//div[@column='rowActions']//a";
    }

    public static String AssetsActionsMenuItemsXpath()
    {
        return "//ul[contains(@style, 'display: block; left:')]//li//span";
    }

    public static String AssetsActionsMenuItemsIEXpath()
    {
        return "//ul[contains(@style, 'right: auto; display: block;')]//li//span";
    }

    public static String AssetActionsMenuItemViewDetailsXpath()
    {
        return "//ul//li//a//span[text()='View details']";
    }

    public static String AssetActionsButtonXpath2()
    {
        return "//td//a[@fleet-tooltip='Actions']";
    }

    public static String AssetActionsItemsListXpath()
    {
        return "//ul[contains(@class, 'actions pull-right')]//li[not(@style='display: none;')]//a";
    }

    public static String LogOutButtonXpath()
    {
        return "//i[@class='icon-main-logout']";
    }

    public static String UsernameTextBoxXpath()
    {
        return "//input[@name='userName']";
    }

    public static String FilterTextBoxXpath()
    {
        return "//input[@placeholder='Filter']";
    }

    public static String UserActionsButtonXpath()
    {
        return "//div[@ng-show='rowActions']//ul//li[2]//a";
    }

    public static String rolesPageSpinnerXpath()
    {
        return "//div[@id=\"MainView\"]/div/div/div/div/div[contains(@class,'loading-overlay')][contains(@style,'none')]";
    }

    public static String RolesSpinnerOuterDivXpath()
    {
        return "//div[@ng-show='contentLoadingStack && contentLoadingStack.length > 0'][@style='display: none;']";
    }
    public static String SecurityGroupsSpinner()
    {
        return "//div[2][@ng-show='contentLoadingStack && contentLoadingStack.length > 0'][@style='display: none;']";
    }

    public static String RolesSpinnerInnerDivXpath()
    {
        return "//div[2][@ng-show='loadingStack && loadingStack.length > 0'][@style='display: none;']";
    }
                

    public static String userSubHeader()
    {
        return "//li/a[text()='Users']";
    }

    public static String userPageHeader()
    {
        return "//span[text()='Users']";
    }
    public static String securityGroupName(String securityGroup)
    {
        return "//span[text()='"+securityGroup+"']";
    }

    public static String ActionsButtonRemoveItem()
    {
        return "//ul[contains(@style, 'block;')]//span[text()='Remove']";
    }

    public static String StrongContainsTextXpath(String text)
    {
        return "//strong[contains(text(), '" + text + "')]";
    }

    public static String UserDeletionReasonDropDownXpath()
    {
        return "//form[@name='deleteUserForm']//span[text()='Reason']/../..//select";
    }

    public static String UserDeletionReasonTextFieldXpath()
    {
        return "//form[@name='deleteUserForm']//textarea";
    }

    public static String StrongRoleValidationTextXpath(String text)
    {
        return "//div[@name='moveRoleUsersModal']//strong[text()='" + text + "']";
    }

    public static String StrongWithTextXpath(String text)
    {
        return "//strong[text()='" + text + "']";
    }

    public static String RememberMeCheckBox()
    {
        return "//span[text()='KEEP ME SIGNED IN']/../input";
    }

    public static String DefaultSite()
    {
        return "//h5[text()='Select what this security group has access to']/../../../div[2]/div/div[2]/div/a/span[text()='Default Site']/..";
    }

    public static String differentSiteLevel()
    {
        return "//h5[text()='Select what this security group has access to']/../../../div[2]/div/div[2]/div/a[2]";
    }

    public static String DefaultSiteUsers()
    {
        return "//h5[text()='Select what this user has access to']/../../../div[2]/div/div[2]/div/a/span[text()='Default Site']/..";
    }

    public static String DVTautomationBreadcrumbDropdown()
    {
        return "//div[3]/div/div[2]/a/span[1]/span[2][text()='DVT Automation']";
    }

    public static String DefaultSiteNewLogin()
    {
        return "//h5[text()='Select asset(s)']/../../../div[2]/div/div[2]/div/a/span[text()='Default Site']/..";
    }
    
    public static String SiteChangeNewLoginXpath(String text)
    {
        return "//h5[text()='Select asset(s)']/../../../div[2]/div/div[2]/div/a/span[text()='"+text+"']/..";
    }

    public static String OrganizationXpath(String text)
    {
        return "//span[@class='separator text-overflow']/..//span[text()='"+text+"']/..";
    }
    
    public static String selectButton()
    {
        return "//div/a[text()='Select']";
    }

    public static String signInButton()
    {
        return "//div/button[text()='Sign in']";
    }

    public static String addSecurityGroupOnTheUser()
    {
        return "//div/a[text()='Select group']";
    }

    public static String securityFliterSearchtextBox()
    {
        return "//h5/span[text()='Select security groups for user']/../../../form/div/input";
    }

    public static String checkBoxSecurityGroup()
    {
        return "//span[text()='Select security groups for user']/../../../../div/div[2]/div/div/div/div/table/tbody/tr[1]/td/input[@type='checkbox']/..";
    }

    public static String selectSecurityGroupForUsers()
    {
        return "//button[text()='Select']";
    }

    public static String site()
    {
        return "//div[@class='span12 pa-10']/table/tbody/tr/td[2][text()='Default Site']";
    }

    //live tracking page spinner xpath
    public static String LiveTrackingPageSpinner()
    {
        return "//div[@ng-show='contentLoadingStack && contentLoadingStack.length > 0']";
    }

    //------------------------------- Xpaths for Map tools --------------------//
    public static String MapToolbarOptions(String text)
    {
        return "//div[contains(@class, 'tracking-docked-toolbar')]//ul//li//i/../..//a[@fleet-tooltip='" + text + "']";
    }

    public static String MapToolItems(String text)
    {
        return "//div[contains(@class, 'map-query-toolbar')]//a[@fleet-tooltip='" + text + "']";
    }

    //------------------------------- Xpaths for Diagnostic Validation Items --------------------//
    public static String DiagnosticItems(String text)
    {
        return "//a[text()='" + text + "']";
    }

    public static String DiagnosticItemFleet(String text)
    {
        return "//a[@fleet-tooltip='" + text + "']//i[@class='icon-export']";
    }

    public static String DiagnosticItem4()
    {
        return "//div[@ng-click='showCommsLog()']";
    }

    public static String DiagnosticItem5(String text)
    {
        return "//span[text()='" + text + "']";
    }

    public static String DiagnosticItem6(String text)
    {
        return "//div[@ng-hide='(unitDetails || !hasStatusInfo || isG52)']//a//span[text()='" + text + "']";
    }

    public static String DiagnosticItenASpanWithText(String text)
    {
        return "//a//span[text()='" + text + "']";
    }

    //--------------- xpath for button cancel and button submit ---------------//
    public static String ButtonSubmit()
    {
        return "//button[text()='Submit'][@disabled='disabled']";
    }

    //--------------- xpath for wait elements ---------------//
    public static String WaitNoItemDisplay()
    {
        return "//div[@ng-hide='roleListGridRows == undefined']//span[text()='No items to display']";
    }

    public static String WaitForSpanWithText()
    {
        return "//a[@class='clickable-cell ng-scope']//span[text()='Aarole20160530030822']";
    }

    public static String WaitForTextBox()
    {
        return "//div[@class='text-tags']";
    }

    public static String WaitForTableHearder()
    {
        return "//th//span[text()='Security group']";
    }

    public static String WaitForUserTable()
    {
        return "//div[@visible-columns-fields='visibleColumnsFields']";
    }

    public static String WaitForSelectGroupButton()
    {
        return "//a[@ng-click='$controller.selectSecurityGroups()']";
    }

    //span[text()='Must be a valid email address']
    public static String UserPageSpinner()
    {
        return "//div[@ng-show='contentLoadingStack && contentLoadingStack.length > 0']";
    }

    public static String AddUserPageSpinner()
    {
        return "//div[@ng-show='$controller.isLoading']";
    }

    public static String SecurityGroupsPageSpinner()
    {
        return "//div[@ng-show='contentLoadingStack && contentLoadingStack.length > 0']";
    }
}
