/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects;

/**
 *
 * @author smnisi
 */
public class RemoveDealerPageObject {
    
    /*******************************ROLES************************************************/
    
    public static String ManageHeader()
    {
        return "//a[text()='MANAGE ']";
    }
    
    public static String RoleSubHeader()
    {
        return "//a[text()='Roles']";
    }
    
    public static String RolePageHeader()
    {
        return "//span[text()='Roles']";
    }
    
    public static String roleAddButton()
    {
        return "//a/i[@class='icon-plus icon-white']";
    }
    
    public static String AddRoleHeader()
    {
        return "//span[text()='Add role']";
    }
    
    public static String RoleDetails()
    {
        return "//legend[text()='Role details']";
    }
    
    public static String RoleName()
    {
        return "//span[text()='Role name']/../../input";
    }
    
    public static String makeAvailableButton()
    {
        return "//a[text()='Make available']";
    }
    
    public static String SelectOrganisationGroupsHeader()
    {
        return "//span[text()='Select organisation groups']";
    }
    
    public static String mixDropDownButton()
    {
        return "//span[text()='MiX Telematics']/../../../../../li/span";
    }
    
    public static String scrolRSO_Organisation()
    {
        return "//span[text()='Select organisation groups']/../../../div[2]/ul/li/div[2]/ul/li[13]/span";
    }
    
    public static String TestRSODripDownn()
    {
        return "//a/span[text()='Test RSO']/../../../../span";
    }
    
    public static String ClickingOnAddedDealer()
    {
        return "//a[@class='tree-item']/span[text()='AMoveDealer']/..";
    }
    
    public static String OkButton()
    {
        return "//button[text()='OK']";
    }
    
    public static String selectProfile()
    {
        return "//span[text()='Profile']/../../select";
    }
    
    public static String accessCheckBox()
    {
        return "//span[text()='Access']/../input";
    }
    
    public static String roleSuccessfullyAddedPoP()
    {
        return "//span[text()='Role created successfully']";
    }
    
    /**********************************SECURITY GROUP****************************************************/
    public static String securityGroupHeader()
    {
        return "//h5/span[text()='Security groups']";
    }
    
    public static String AddSecurityGroupHeader()
    {
        return "//h5/span[text()='Add security group']";
    }
    
    public static String securityGroupAccessGroup()
    {
        return "//div/a/span[text()='AMoveDealer']";
    }
    
    public static String securityGroupDropDown()
    {
        return "//div[30]/div[2]/div[1]/div[1]/div[1]/a/span[text()='DVT Automation']";         
    }
    
    public static String TestRSOgroupSecurity()
    {
        return "//a/span[text()='Test RSO']";
    }
    
    public static String newDealerInSecurity()
    {
        return "//div/a/span[text()='AMoveDealer']";
    }
    
    public static String selectButton()
    {
        return "//a[text()='Select']";
    }
    
    public static String FilterTextBox()
    {
        return "//div/input";
    }
    
    public static String actionButtonUser()
    {
        return "//li/div/div/a[@fleet-tooltip='Actions']";
    }
    
    public static String editButton()
    {
        return "//li/a/span[text()='Edit']";
    }
    
    public static String PersonalDetailsHeader()
    {
        return "//h5[text()='Personal details']";
    }
    
    public static String selectGroups()
    {
        return "//div/a[text()='Select group']";
    }
    
    public static String FliterSearch()
    {
        return "//button/../input";
    }
    
    public static String checkBoxForSecurityGroup()
    {
        return "//span[text()='Security group']/../../th[1]/input";
    }
    
    public static String selectButtonSecurityGroupInUser()
    {
        return "//button[text()='Select']";
    }
    
    public static String popMessage()
    {
        return "//span[text()='User updated successfully']";
    }
    
    
    public static String organisationGroup()
    {
        return " //h5/span[text()='Organisation group']/../../a/span[2]";
    }
    
    public static String SelectAMoveDealer()
    {
        return "//span[@class='icon icon-dealer']/../span[text()='AMoveDealer']";
    }

    
    public static String OrgselectButton()
    {
        return "/html/body/div[30]/div[3]/div/a[2]";
    }
    
    public static String selectButtonAccess()
    {
        return "//div[23]/div[3]/div/a[text()='Select']";
    }
    
    public static String profileDropDown()
    {
        return "//label/span[text()='Profile']/../../select";
    }
    
    public static String RolesDropDown()
    {
        return "//label/span[text()='Roles']/../../div/select";
    }
    
    public static String OrganisationSearchBar()
    {
        return "//h5[text()='Select organisation group']/../../div[2]/input";
    }
    
    public static String searchButton()
    {
        return "//h5[text()='Select organisation group']/../../div[2]/a[2]";
    }
    
    public static String expectedDealer()
    {
        return "//div[4]/div[1]/div[1]/a/span[@class='icon icon-dealer']/../span[text()='AMoveDealer']";
    }
   
    public static String caretDropDown()
    {
        return "//div[2]/a/b[@class='caret']";
    }
    
    public static String testTSO()
    {
        return "//a/span[text()='Test RSO']/..";
    }
    
    public static String select()
    {
        return "//div/a[text()='Select']";
    }
    
    public static String newAMoverDealerSelectButton()
    {
        return  "//h5[text()='Select what this security group has access to']/../../../div[3]/div/a[text()='Select']";
    }
    
    public static String securityGroupNewDealerAdded()
    {
        return "//h5[text()='Select what this security group has access to']/../../../div[2]/div/div/div/a/span[text()='AMoveDealer']";
    }
    
    
    public static String UserCaretDropDown()
    {
        return "//span[@class='caret caret-link']";
    }
    
    public static String UserOrganisationHeader()
    {
        return "//h5/span[text()='Organisation group']";
    }
    
    
    public static String UsingDealer()
    {
        return "//div[27]/div[2]/div[1]/div[3]/div[1]/a[1]/span[text()='AMoveDealer']/..";
    }
    
    public static String addUserSelectButton()
    {
        return "//div[29]/div[1]/div[1]/h5[text()='Select organisation group']/../../../div[3]/div/a[text()='Select']";
    }
                                            
    public static String addPermissionsButton()
    {
        return "//button[text()='Add permissions']";
    }
    
    
    public static String userPermissionsAccess()
    {
        return "//h5[text()='Select what this user has access to']/../../../div[2]/div/div/div/a/span[text()='AMoveDealer']";
    }
      
    public static String userPermissionSelectButton()
    {
        return  "//a[text()='Select']/../a[2]";
    }
    
    public static String removeAMoverButton()
    {
         return "//strong[text()='AMoveDealer']/../../a[2]/i";
    }
    
    public static String checkForTheAddedDealer()
    {
        return "//span[text()='AMoveDealer']";
    }
    
    public static String cancelButton()
    {
        return "//a[text()='Cancel']";
    }
    
    public static String actionButton()
    {
        return "//li[2]/div/div/a[@fleet-tooltip='Actions']";
    }
    
    public static String DVTAutomation()
    {
        return "//li/div/div/a/span[text()='DVT Automation']";
    }
    
}