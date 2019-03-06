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
public class PermissionToImportUsersPageObjects {
    
    
    public static String NameHeadingValidation()
    {
       return "//th/span[text()='Name']"; 
    }
    
    public static String SaveMessageWait()
    {
       return "//div[@class='notification-wrapper notification-modal ng-scope'][@style='display: none;']"; 
    }
    
    public static String SaveTextMessage()
    {
       return "//span[text()='Security group updated successfully']"; 
    }
    
    public static String Filter()
    {
        return "//input[@placeholder='Filter']";
    }
    
    public static String RoleName()
    {
        return "//span[text()='Test Email  Role - DO NOT DELETE']";
    }
    
    public static String RoleName2Check()
    {
        return "//span[text()='Test Email - DO NOT DELETE Test Email - DO NOT DELETE']";
    }
    
    public static String RoleActionButton()
    {
        return "//a[@fleet-tooltip='Actions']";
    }
    
    public static String RoleEditButton()
    {
        return "//a/span[text()='Edit']";
    }
    
    public static String ViewButton()
    {
        return "//a/span[text()='View']";
    }
    
    public static String RoleDeatilsHeading()
    {
        return "//legend[text()='Role details']";
    }
    
    public static String PermissionsTab()
    {
        return "//a[text()='Permissions']";
    }
    
    public static String QuickSelectDeselect()
    {
        return "//strong[text()='Quick select/deselect:']";
    }
    
    public static String DisabledGeneralButton()
    {
        return "//a[@fleet-tooltip='Enable General']";
    }
    
    public static String EnabledGeneralButton()
    {
        return "//a[@fleet-tooltip='Disable General']";
    }
    
    public static String ContactCheckbox()
    {
        return "//tr/td[text()='Contacts']/../td[2]/input";
    }
    
    public static String ContactsImportCheckbox()
    {
        return "//tr/td[text()='Contacts - Import']/../td[2]/input";
    }
    
    public static String LoginMixFleet()
    {
        return "//tr/td[text()='Login - MiX Fleet Manager Mobile']/../td[2]/input";
    }
    
    public static String LoginWebApplication()
    {
        return "//tr/td[text()='Login - Web application']/../td[2]/input";
    }
    
    public static String RoleSaveButton()
    {
        return "//button[text()='Save'][@disabled='disabled']";
    }
    
      public static String SaveButton()
    {
        return "//button[text()='Save']";
    }
    
      public static String savemessage()
    {
        return "//div[@class='notification-wrapper notification-modal ng-scope'][@style='display: none;']";
    }
    
    //security 
    public static String AllTabWait()
    {
        return "//span[text()='All']";
    }
    
    public static String WithUsersWait()
    {
        return "//span[text()='With Users']";
    }
    
    public static String SecurityGroupName()
    {
        return  "//span[text()='Test Email Security- DO NOT DELETE']";
    }
    
    public static String OrganisationGroup()
    {
        return "//a/span[text()='DVT Automation']";
    }
    
    public static String AddPermission()
    {
        return "//button[text()='Add permissions']";
    }
    
     public static String AddPermissionSecurity()
    {
        return "//a[text()='Add permissions']";
    }
    
    public static String DVTAutomationAccess()
    {
              //  return "//span[text()='DVT Automation'][@ui-if=\"item.name != 'All'\"]";

        return "//div[@class=\"miller-selector-modal-container white-box-shadow ng-scope in\"]//span[text()='DVT Automation']";
    }
    
    public static String SelectButton()
    {
              //  return "//a[text()='Select']";

        return "//div[@class=\"miller-selector-modal-container white-box-shadow ng-scope in\"]//a[text()='Select']";
    }
    
    public static String spinner()
    {
        return "//div[@class='tab-pane active ng-scope']/div[@ng-show='contentLoadingStack && contentLoadingStack.length > 0'][@style='display: none;']";
    }
    
    public static String RoleSpinner()
    {
        return "//div[@ng-show='contentLoadingStack && contentLoadingStack.length > 0'][@style='display: none;']";
    }
    
    public static String roleNameCheck()
    {
        return "//span[text()='Test Email  Role - DO NOT DELETE']";
    }
    
    public static String delete()
    {
        return "//span[@class='icon-remove-sign icon-red']";
    }
    
    public static String DropDownlist()
    {
        return "//select[@class='span12 no-margins ng-pristine ng-valid']";
    }
    
    public static String DropDownOption()
    {
        return "//option[text()='Test Email  Role - DO NOT DELETE']";
    }
    
    public static String Role()
    {
        return "//span[text()='Test Email  Role - DO NOT DELETE']";
    }
    
    public static String ContactsCheck()
    {
        return"//td[text()='Contacts']/../td[2]/i[@class='icon-ok']";
    }
    
    public static String ContactsImportCheck()
    {
        return "//td[text()='Contacts - Import']/../td[2]/i[@class='icon-ok']";
       // return "//td[text()='Contacts - Import']/../td[2]/i";
    }
    
    public static String loginMixCheck()
    {
        return "//td[text()='Login - MiX Fleet Manager Mobile']/../td[2]/i[@class='icon-ok']";
    }
    
    public static String loginWebCheck()
    {
        return "//td[text()='Login - Web application']/../td[2]/i[@class='icon-ok']";
    }
    ////
       public static String ContactsCheck2()
    {
        return"//td[text()='Contacts']/../td[2]/i[@class='icon-grey disabled icon-ok']";
    }
    
    public static String ContactsImportCheck2()
    {
        return "//td[text()='Contacts - Import']/../td[2]/i[@class='icon-grey disabled icon-ok']";
       // return "//td[text()='Contacts - Import']/../td[2]/i";
    }
    
    public static String loginMixCheck2()
    {
        return "//td[text()='Login - MiX Fleet Manager Mobile']/../td[2]/i[@class='icon-grey disabled icon-ok']";
    }
    
    public static String loginWebCheck2()
    {
        return "//td[text()='Login - Web application']/../td[2]/i[@class='icon-grey disabled icon-ok']";
    }
    
    public static String SelectSecurityGroup()
    {
        return "//a[text()='Select group']";
    }
    
    public static String SecurityName()
    {
        return "//div[text()='Test Email Security- DO NOT DELETE ']";
    }

    public static String clickCheckbox()
    {
        return "//td/input[@type='checkbox']";
    }
    
    public static String SelectClick()
    {
        return "//button[@class='btn ng-scope ng-binding btn-wide btn-success']";
    }
    
    public static String UserPermissionHeadingWait()
    {
        return "//h5[text()='User permissions']";
    }
    
    public static String Logout()
    {
        return "//i[@class='icon-main-logout']";
    }
    
    public static String loginHeading()
    {
        return "//span[text()='LOGIN']";
    }
    
    public static String Username()
    {
        return "//input[@ng-model='loginResource.userName']";
        //return "//input[@name='userName']";
    }
    
     public static String Password()
    {
        return "//input[@name='password']";
    }
     
    public static String SignInButton()
    {
        return "//button[text()='Sign in']";
    }
    
    public static String ContactCheck()
    {
        return "//strong[text()='Contacts']";
    }
    
    public static String importContacts()
    {
        return "//i[@class=' icon-import']";
    }
    
    public static String ImportHeading()
    {
        return "//h5[text()='Import contacts']";
    }
    
    public static String ContactsSpinner()
    {
        return "//div[@class='fleet-grid-container strong-grid']/div[@style='display: none;']";
    }
}
