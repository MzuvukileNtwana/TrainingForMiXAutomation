/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects;

/**
 *
 * @author sscholtz
 */
public class RemoveOrganisationStructurePermissionsPageObjects {
    
    
    public static String Add()
    {
        return "//i[@class='icon-plus icon-white']";
    }
    
    public static String DeatailsTab()
    {
        return "//a[text()='Details']";
    }
    
    public static String RoleName()
    {
        return "//input[@ng-model='form.roleName']";
    }
    
    public static String CancelButton()
    {
        return "//button[text()='Cancel']";
    }
    
    public static String SpinnerSecurity()
    {
        return "//div[@class='container-fluid full-height']/div[@class=\"loading-overlay ng-scope\"][@style='display: none;']";
    }
    
    public static String SpinnerRole()
    {
        return "//div[@class=\"tab-pane active ng-scope\"]/div[@class=\"loading-overlay ng-scope\"][@style=\"display: none;\"]";
    }
    
    public static String OrgGroupWait()
    {
        return "//tbody//span[text()='DVT Automation']";
    }
    
    public static String AddRole()
    {
        return "//span[text()='Add role']";
    }
    
    public static String RoleProfileDropDown()
    {
        return "//div[@class='span6']/div/select";
    }
    
     public static String RoleProfileOption()
    {
        return "//option[text()='General administrator']";
    }
     
    public static String MakeAvailableButton()
    {
        return "//a[text()='Make available']";
    }
    
    public static String Expand()
    {
        return "//span[@class='daredevel-tree-anchor ui-icon icon-plus ng-scope']";
    }
    
    public static String TestRSO()
    {
        return "//span[text()='Test RSO']/../../../../span";
    }
    
    
    public static String DVTAutomation()
    {
        return "//a[@ng-click=\"select()\"]/span[text()='DVT Automation']";
    }
    
    public static String OkButton()
    {
        return "//button[text()='OK']";
    }
    
    public static String NextButton()
    {
        return "//button[text()='Next']";
    }
    
    public static String OperationHeading()
    {
        return "//h5[text()='Operations']";
    }
    
    public static String DisabledOpertationButton()
    {
        return "//a[@fleet-tooltip='Enable Operations']";
    }
    
    public static String GeneralHeading()
    {
        return "//h5[text()='General']";
    }

    public static String QuickCheckButton(String Check)
    {
        return "//span[text()='"+Check+"']/../input";
    }
    
    public static String DatabaseAdminOrganizationStructure()
    {
        return "//td[text()='Database administration - Organisation structure']";
    }
    
    public static String OrganisationStructureDeleteUncheck()
    {
        return "//td[text()='Database administration - Organisation structure']/../td[5]/input";
    }
    
    public static String SaveButton()
    {
        return "//button[text()='Save']";
    }
    public static String SaveMessage()
    {
        return "//span[text()='Role updated successfully']";
    }
    public static String SaveMessagePopUp()
    {
        return "//div[@style=\"display: none;\"]//span[text()='Role updated successfully']";
    }
   
    public static String GroupName()
    {
        return "//input[@ng-model='form.groupName']";
    }
    
    public static String DropDownOption()
    {
        return "//option[text()='RemoveOrganisationRole']";
    }
    
        public static String RoleCheck(String role)
        {
            return "//span[text()='"+role+"']";
        }
        
        public static String LoadMore()
        {
            return "//div[@class='fleet-grid full-height']//a[text()='Load more']";
        }
        public static String savemessage()
        {
            return "//div[@class='notification-wrapper notification-modal ng-scope'][@style=\"display: none;\"]";
        }
        public static String OrganisationStructureDeleteCheck()
        {
            return "//td[text()='Database administration - Organization structure']";
        }
        
        public static String DVTOrgNoRemoveUser()
        {
            return "//span[text()='DVTOrgNoRemove DVT']";
        }
    
        public static String PersonalDetailsTab()
        {
            return "//li[@class='ng-scope active']/a[text()='Personal details']";
        }
        
        public static String FirstName()
        {
            return "//input[@name='firstName']";
        }
        
        public static String PermissionsTabCheck()
        {
            return "//li[@class='ng-scope active']/a[text()='Permissions']";
        }
        
        public static String OrgStructureDeleteCheck()
        {
            return "//td[text()='Database administration - Organisation structure']/../td[5]/i[@class='icon-grey disabled icon-remove']";
        }
        
        public static String OrgStructure()
        {
            return "//td[text()='Database administration - Organisation structure']";
        }
        
        public static String ManageOrgHeading()
        {
            return "//span[text()='Manage organisation structure']";
        }
        
        public static String ManageOrgStructure()
        {
            return "//strong[text()='MiX Telematics']";
        }
        
        public static String DynamicDeleteNotAvailableCheck()
        {
            return "//strong[text()='DVT Automation']/../../a/i[@class='icon-red icon-remove-sign']";
        }
        
        public static String DynamicDeleteNotAvailable()
        {
            return "//strong[text()='DVT Automation']/../../a/i[@class='icon-red icon-remove-sign']/../../a[@fleet-tooltip=\"Remove\"][@style=\"display: none;\"]";
        }
        
        public static String RoleNameCheck(String role)
        {
            return "//span[text()='"+role+"']";
        }
        
        public static String RemoveButton()
        {
            return "//span[text()='Remove']";
        }
        
        public static String SecurityGroupNameCheck(String security)
        {
            return "//span[text()='"+security+"']";
        }
        
        public  static String RemoveButtonConfirm()
        {
            return "//button[text()='Remove']";
        }
}
