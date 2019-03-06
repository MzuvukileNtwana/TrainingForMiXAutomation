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
public class APIRolesPageObjects {
    
    public static String APIRoleTab()
    {
        return "//a[text()='API roles']";
    }
    
    public static String CancelButton()
    {
        return "//button[text()='Cancel']";
    }
    
    public static String SaveButton()
    {
        return "//button[text()='Save']";
    }
    
    public static String FirstRoleNameOnList()
    {
        return "//th[@class='column-heading  first last sortable active ui-draggable']/../../../tbody/tr[1]/td/div/a/span";
    }
    
    public static String RoleNameFilter()
    {
        return "//input[@ng-model='roleFilterQuery']";
    }
    
     public static String FirstRoleNameOnListCheck(String Name)
    {
        return "//th[@class='column-heading  first last sortable active ui-draggable']/../../../tbody/tr[1]/td/div/a/span[text()='"+Name+"']";
    }
     
     public static String CreatRole()
     {
         return "//a[text()='To create a new role, click here.']";
     }
     
     public static String NoItemsToDisplay()
     {
         return "//div[@text-filter='roleFilterQuery']/div[@class='grid-no-items']/span[text()='No items to display']";
     }
     
     public static String RoleDetailsHeading()
     {
         return "//h5[text()='API role details']";
     }
     
     public static String RoleNameAdd()
     {
         return "//input[@name='roleName']";
     }
     
     public static String SelectButton()
     {
         return "//h5/a[text()='Select']";
     }
  
     public static String AllTab()
     {
         return "//span[text()='All']";
     }
  
     public static String Breadcrum()
     {
         return "//div[@class='miller-selector-modal-container white-box-shadow ng-scope in']/div/div/div/div[@class='column ps-container ps-active-y']/a/span[2]";
     }
     
     public static String BreadcrumFilter()
     {
         return "//div[@class='miller-selector-modal-container white-box-shadow ng-scope in']/div[@class='page-header']/div[@class='pull-right']/input";
     }
     
     public static String BreadcrumOption1()
     {
         return "//div[@class=\"miller-selector-modal-container white-box-shadow ng-scope in\"]/div/div/div/div/div/a/span[text()='DVT Automation']";
     }
     
     public static String BreadcrumSelectButton()
     {
         return "//div[@class=\"miller-selector-modal-container white-box-shadow ng-scope in\"]/div[@class=\"menu-footer\"]/div[@class=\"pull-right mr-10\"]/a[2]";
     }
     
     public static String GroupNameCheck1()
     {
         return "//div/span[text()='DVT Automation']";
     }
     
     public static String BreadcrumOption2()
     {
         return "//div[@class='group ng-scope']/a/span[text()='DTU2015 (Daylight savings)']";
     }
     
     public static String SpinnerWait()
     {
         return "//h5[text()='API roles']/../../div[@class=\"loading-overlay ng-scope\"][@style='display: none;']";
     }
     
     public static String GroupNameCheck2()
     {
         return "//div/span[text()='DTU2015 (Daylight savings)']";
     }
     
     public static String search()
     {
         return "//div[@class='miller-selector-modal-container white-box-shadow ng-scope in']/div[@class='page-header']/div[@class='pull-right']/a/i[@class='icon-search']";
     }
     
     public static String Sites()
     {
         return "//*[@class=\"miller-selector-modal-container white-box-shadow ng-scope in\"]/div[2]/div/div[3]/div/a/span[2]";
         //return "//div[@class=\"column-viewport ps-container\"]/div[@class='column-container']/div[@class='column-resizable ng-scope ui-resizable']/div[@class='column ps-container']/a/span[2][@ui-if=\"item.name != 'All'\"]";
     }
     
          public static String CreateRole()
     {
         return "//a[text()='To create a new role, click here.']";
     }


}

