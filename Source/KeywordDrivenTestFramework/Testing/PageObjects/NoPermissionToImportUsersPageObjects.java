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
public class NoPermissionToImportUsersPageObjects {
    
    
    public static String ContactsImportAccessCheck()
    {
        return "//td[text()='Contacts - Import']/../td[2]/i[@class='icon-remove']";
    }
    
    public static String UserContactImportAccessCheck()
    {
        return "//td[text()='Contacts - Import']/../td[2]/i[@class='icon-grey disabled icon-remove']";
    }
    
    public static String ImportButtonNotVisibleCheck()
    {
        return "//a[@fleet-tooltip='Import contacts'][@style='display: none;']";
    }
}
