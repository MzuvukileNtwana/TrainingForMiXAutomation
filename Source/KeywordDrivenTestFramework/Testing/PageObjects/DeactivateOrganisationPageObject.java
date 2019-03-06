/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects;

/**
 *
 * @author lmgulwa
 */
public class DeactivateOrganisationPageObject {
    
    //  <editor-fold defaultstate="collapsed" desc="Add Role">
    public static String addRoleButtonXpath()
    {
        return "//i[contains(@class, 'icon-plus')]/..";
    }
    
    public static String roleNameTextBoxXpath()
    {
        return "//span[text()='Role name']/../../input";
    }
    
    public static String profileDropdownXpath()
    {
        return "//span[text()='Profile']/../../select/option";
    }
    
    public static String makeAvailableButtonXpath()
    {
        return "//a[text()='Make available']";
    }
    
    public static String mixTelematicsSelectGroupExpandXpath()
    {
        return "//span[text()='MiX Telematics']/../../../../span";
    }
    
    public static String testRSOGroupExpandXpath()
    {
        return "//span[text()='Test RSO']/../../../../span";
    }
    
    public static String newlyAddedGroupXpath()
    {
        return "//span[text()='test07-DO NOT DELETE']/../../a[@ng-click='select()']";
    }
    
    public static String selectOrganisationGroupOKButtonXpath()
    {
        return "//button[@ng-disabled='!isEnabled()'][text()='OK']";
    }
    
    public static String nextButtonXpath()
    {
        return "//button[text()='Next']";
    }
    
    public static String enableGeneralXpath()
    {
        return "//h5[text()='General']/../a";
    }
    
    public static String roleSpinnerXpath()
    {
        return "//legend[text()='Role details']/../../../div[contains(@class, 'loading-overlay')][@style='display: none;']";
    }
    
    public static String roleSpinnerLandingPageXpath()
    {
        return "//div[@row-actions='roleListGridRowActions']/../../div[contains(@class, 'loading-overlay')][@style='display: none;']";
    }
    
    public static String selectOrganisationGroupPageHeaderXpath()
    {
        return "//span[text()='Select organisation groups']";
    }
    
    public static String enableOperationsXpath()
    {
        return "//h5[text()='Operations']/../a";
    }
    
    public static String giveRoleAccessXpath()
    {
        return "//span[text()='Access']/../input";
    }
    
    // </editor-fold>
    
    //  <editor-fold defaultstate="collapsed" desc="Add Security group">
    
    public static String securityGroupNameXpath()
    {
        return "//span[text()='Group name']/../../input";
    }
    
    public static String selectOrganisationGroupXpath()
    {
        return "//span[text()='Organisation group']/../../a";
    }
    
    public static String securityGroupSpinnerXpath()
    {
        return "//h5[text()='Security group details']/../../../div[contains(@class, 'loading-overlay')][@style='display: none;']";
    }
    
    public static String selectUsersButtonXpath()
    {
        return "//a[@ng-click='selectUsers()']";
    }
    
    public static String filterTextBoxXpath()
    {
        return "//input[@placeholder='Filter']";
    }
    
    public static String userCheckBoxXpath()
    {
        return "//tr[@class='ng-scope odd']//input[@type='checkbox']";
    }
    
    public static String selectButtonXpath()
    {
        return "//button[text()='Select']";
    }
    
    public static String selectSecurityOrganisationGroupXpath()
    {
        return "//span[@class='caret caret-link']/..";
    }
    
    public static String InputFieldSelectOrginisationGroupXpath()
    {
        return "//h5[text()='Select organisation group']/../../../..//div[@aria-hidden='false']/div[@class='page-header']/div[@class='pull-right']/input";
    }
    
    public static String ButtonSelectXpath()
    {
        return "//div[@aria-hidden='false']//a[text()='Select']";
    }
    
    public static String addPermissionButtonXpath()
    {
        return "//a[text()='Add permissions']";
    }
    
    public static String selectAccessToGroupXpath()
    {
        return "//div[@aria-hidden='false']//span[text()='test07-DO NOT DELETE']/..";
    }
    
    public static String selectButtonLinkXpath()
    {
        return "//div[@aria-hidden='false']//a[text()='Select']";
    }
    
    // </editor-fold>
    
    //  <editor-fold defaultstate="collapsed" desc="Edit user">
    
    public static String SecurityName()
    {
        return "//div[text()='DeactivateOrgSecurityGroup ']";
    }
    
    public static String organisationGroup()
    {
        return "//tr//span[text()='test07-DO NOT DELETE']";
    }
    
    public static String addPermissionSecurity()
    {
        return "//button[text()='Add permissions']";
    }
    
    public static String newlyAddedOrganisationAccess()
    {
        return "//div[@aria-hidden='false']//span[contains(@class, 'icon-org')]/../span[text()='test07-DO NOT DELETE']";
    }
    
    public static String selectButton()
    {
        return "//div[@aria-hidden='false']//a[text()='Select']";
    }
    
    public static String organisationGroupLinkXpath()
    {
        return "//tr//span[text()='test07-DO NOT DELETE']/..";
    }
    
    public static String rolesDropdownXpath()
    {
        return "//label[text()='Roles']/..//select/option";
    }
    
    public static String selectBreadcrumbXpath()
    {
        return "//div[@class='organisation-selector']//a";
    }
    
    public static String cancelButtonXpath()
    {
        return "//a[text()='Cancel']";
    }
    
    // </editor-fold>
    
    //  <editor-fold defaultstate="collapsed" desc="Deactivate Organisation">
    
    public static String testRSOExpandOnDBAdminPageXpath()
    {
        return "//strong[text()='Test RSO']/../../../../span";
    }
    
    public static String newlyAddedOrgOnDBAdminPageXpath()
    {
        return "//strong[text()='test07-DO NOT DELETE']/../..";
    }
    
    public static String deactivateButtonXpath()
    {
        return "//a[@ng-click='deactivateOrgClick(selectedGroup)']";
    }
    
    public static String deactivatePopupScreenHeaderXpath()
    {
        return "//span[text()='Deactivate Organisation']";
    }
    
    public static String confirmDeactivateXpath()
    {
        return "//button[text()='Deactivate']";
    }
    
    public static String successfullyDeactivatedXpath()
    {
        return "//strong[text()='test07-DO NOT DELETE']/../..//div[text()='Deactivated (by request)']";
    }
    
    public static String availableInNumberOfGroupsXpath()
    {
        return "//span[text()='Organisation group']/../../p[contains(@class, 'ng-binding')]";
    }
    
    public static String numberInSelectOrganisationGroupXpath()
    {
        return "//span[@ng-show=\"item[mapping.itemsProperty].any()\"]";
    }
    
    public static String dvtOrganisationGroupXpath()
    {
        return "//span[text()='DVT Automation']/../../a[@ng-click='select()']";
    }
    
    // </editor-fold>
}
