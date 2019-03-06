/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects.FleetAdmin;

/**
 *
 * @author rcornelius
 */
public class DriverLicenseReminderExpiredPageObjects {
    
    public static String DriverHomePageFilter()
    {
        return "//input[@type='text'][@style='width: 160px']";
    }
    public static String SearchIcon()
    {
        return "//a[@class='btn btn-small']//i[@class='icon-search']";
    }
    public static String LicenseTab()
    {
        return "//div[@class='well well-white no-margin']//..//div[2]//ul//a[text()='Licences']";
    }
       public static String LicencestabXpath() 
    {
        return "//a[text()='Licence categories']//..//../li[1]/a[text()='Licences']";
    }
       public static String DriverFilterIE() 
    {
        return "//div[@class='text-filter empty']//..//input";
    }
}
