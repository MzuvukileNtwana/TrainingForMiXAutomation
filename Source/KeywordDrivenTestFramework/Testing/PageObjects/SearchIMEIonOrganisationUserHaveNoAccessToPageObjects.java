/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects;

/**
 *
 * @author elebese
 */
public class SearchIMEIonOrganisationUserHaveNoAccessToPageObjects 
{
    public static String EditSecurityGroupXpath()
    {
        return "//span[text()='IMEI is linked DoNotDelete']/..";
    }
    
    public static String SelectedSecurityGroupXpath()
    {
        return "//div[text()='IMEI Search Checked DoNotDelete ']";
    }
    
    public static String CancelXpath()
    {
        return "//button[text()='Cancel']";
    }
    
    public static String SelectUsersButton()
    {
        return "//a[text()='Select users']";
    }
    
    public static String LogoutXpath()
    {
        return "//i[@class='icon-main-logout']/..";
    }
    public static String LogInXpath()
    {
        return "//button[text()='Sign in']";
    }
    public static String UserNameXpath()
    {
        return "//label[text()='USERNAME']/../div/input";
    }
    
    public static String DeviceTypeDropdownXpath()
    {
        return "//select[@name='searchtype']";
    }
    
    public static String PageHeaderXpath()
    {
        return "//div[@class='pull-left page-section-header ng-scope']/h5/span[text()='Data centre administration']";
    }
    public static String PasswordXpath()
    {
        return "//label[text()='PASSWORD']/../div/input";
    }
    public static String DatacenterAdminSpinnerXpath()
    {
        return "//div[@class='tab-pane active ng-scope']/div[@class='loading-overlay ng-scope'][@style='display: none;']";
    }
    public static String SpinnerXpath()
    {
        return "//div[@class='loading-overlay ng-scope'][@style='display: none;']";
    }
    public static String ImeiTextboxXpath()
    {
        return "//button[text()='Search']/../input";
    }
    
    public static String SearchButtonXpath()
    {
        return "//button[text()='Search']";
    }
    
    public static String ErrorMessageXpath()
    {
        return "//p[@ng-show='message']";
    }
}
