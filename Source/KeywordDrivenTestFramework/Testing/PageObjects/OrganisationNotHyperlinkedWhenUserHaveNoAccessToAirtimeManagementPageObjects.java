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
public class OrganisationNotHyperlinkedWhenUserHaveNoAccessToAirtimeManagementPageObjects {
    
   public static String IMEIHeading()
   {
       return "//h5[text()='IMEI search']";
   }
   
   public static String DropDownlistOption()
   {
       return "//select[@name='searchtype']";
   }
  
   public static String IMIESearchBox()
   {
       return "//input[@ng-model='imeiNumber']";
   }
   
   public static String SearchButton()
   {
       return "//button[text()='Search']";  
   }
   
   public static String OranizationNotHyperlinked()
   {
       return "//td[@ng-repeat='column in filteredColumns']/div/a[@class='clickable-cell ng-scope']/span[text()='DVT Automation']";
   }
   
   public static String OrganisationValidation()
   {
       return "//td[@ng-repeat='column in filteredColumns']/div/span[text()='DVT Automation']";
   }
   
   public static String NoPermissionAccess()
   {
       return "//p[text()='The IMEI requested is in use by a site that you do not have permission to access']";
   }
}
