/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects.Monitor.HoursOfService.LogViewer;

/**
 *
 * @author rcornelius
 */
public class RemoteDriverLogOffAccessPageObject {
    
    
    //----------------------HOS LOG VIEWER----------------------//
    
     public static String SpinnerInLogViewer()
    {
        return "//div[@class='loading-overlay'][@style='display: none;']";
    }
     
     public static String RefreshButton()
    {
        return "//i[@class='icon-refresh icon-green']";
    }
     
     public static String ActionsButton()
    {
        return "//a[@class='btn-actions dropdown-toggle'][@fleet-tooltip='Actions'][@tooltip-placement='left']";
    }

     public static String RemoteDriverLogOptionInDropDown()
    {
        return "//span[text()='Remote driver log off from asset']";
    }
    
    //-------------------------USER ADMIN------------------------// 
     
     public static String SpinnerInUserAdmin()
    {
        return "//div[@class='loading-overlay ng-scope'][@style='display: none;'][@ng-show='contentLoadingStack && contentLoadingStack.length > 0']";
    }
    
     public static String Filter()
    {
        return "//input[@ng-class='cssClass']";
    }
    
     public static String FilteredResult()
    {
        return "//span[text()='HOSUserWithAdminRoles Do-Not_Delete'][1]";
    }
    
     public static String SpinnerInEditRole()
    {
        return "//div[@class='modal hide fade ng-scope']/..//div[@class='loading-overlay ng-scope'][@style='display: block;'][@ng-show='contentLoadingStack && contentLoadingStack.length > 0']";
    }
    
     public static String QuickSelectText()
    {
        return "//strong[text()='Quick select/deselect:']";
    }
    
     public static String PermissionsTab()
    {
        return "//a[text()='Permissions']";
    }
    
     public static String CheckBoxClick()
    {
        return "//td[text()='Drivers - Hours of Service - Remote driver log off']/../td[2]/input[1]";
    }
     public static String CheckBox(int value)
    {
        return "//td[text()='Drivers - Hours of Service - Remote driver log off']/../td['"+value+"']/input[1][@style='display: none;']";
    }
    
     public static String SaveButton()
    {
        return "//button[text()='Save']";
    }
    
     public static String SaveMessage()
    {
        return "//span[text()='Role updated successfully']";
    }

    //-------------------LOG IN AND LOG OUT//-------------------// 
     
     public static String LogOutButton()
    {
        return "//i[@class='icon-main-logout']";
    }
     
     public static String UsernameTextBox()
    {
        return "//input[@dmx-validate='userName']";
    }
     
     public static String PasswordTextBox()
    {
        return "//input[@dmx-validate='password']";
    }
     
     public static String SignInButton()
    {
        return "//button[@ng-class='buttonClass()']";
    }
     
     public static String SpinnerInLogIn()
    {
        return "//div[@class='loading-overlay ng-scope'][@style='display: none;']";
    }
     
}
