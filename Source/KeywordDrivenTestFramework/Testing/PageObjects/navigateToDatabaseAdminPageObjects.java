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
public class navigateToDatabaseAdminPageObjects
{
    public static String ManageLanguaged()
    {
        return "//a[text()='Anagemay ']";
    }
    
    public static String DataBaseAdminLanguaged()
    {
        return "//a[text()='Atabaseday administrationway']";
    }
    
    public static String DataBaseAdminHeaderLanguaged()
    {
        return "//span[text()='Atabaseday administrationway']";
    }
    
    public static String OrganisationGroup()
    {
        return "//strong[text()='DVT Automation']";
    }
    
    public static String mapSettingsLanguaged()
    {
        return "//a[text()='Apmay ettingssay']";
    }
    
    public static String mapSettingsHeaderLanguaged()
    {
        return "//legend[text()='Apmay ettingssay']";
    }
    
    public static String mapProviderLanguaged()
    {
        return "//span[text()='Apmay Oviderpray']/../../select";
    }
    
    public static String SaveButtonLanguaged()
    {
        return "//button[text()='Avesay']";
    }
    
    public static String SetelliteMapProviderLanguaged()
    {
        return "//span[text()='Atellitesay apmay oviderpray']/../../select";
    }
    
    public static String defaultMapViewLanguaged()
    {
        return "//span[text()='Efaultday apmay iewvay']/../../select";
    }
    
    public static String GroupNameLink()
    {
        return "//strong[text()='Test RSO']/../../../../span";
    }
}
