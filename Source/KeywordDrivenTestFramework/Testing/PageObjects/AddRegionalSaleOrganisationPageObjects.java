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
public class AddRegionalSaleOrganisationPageObjects {
    
    public static String ManageHeader()
    {
        return "//li/a[text()='MANAGE ']";
    }
    
    public static String databaseAdministration()
    {
        return "//li/a[text()='Database administration']";
    }
    
    public static String ManageOrganisationStructureHeader()
    {
        return "//h5/span[text()='Manage organisation structure']";
    }
    
    public static String MixTelematicsHeader()
   {
     return "//a/strong[text()='MiX Telematics']";            
   }
    
    public static String AddButton()
    {
        return "//div/a/i[@class='icon-plus icon-white']";
    }
    
    public static String RegionalSalesOrganisation()
    {
        return "//li/a[text()='Regional Sales Organisation']";
    }
    
    public static String AddRegionalSalesOrgnisationHeader()
    {
        return "//h5/span[text()='Add Regional Sales Organisation']";
    }
    
    public static String NametextField()
    {
        return "//div/label/span[text()='Name']/../../input";
    }
    
    public static String DealerIDField()
    {
        return  "//div/label/span[text()='Dealer ID']/../../input";
    }
    
    public static String errorMessage()
    {
        return "//span[text()='Value must be a whole number between -32768 and 32767']";
    }
    
    public static String SaveButton()
    {
        return "//button[text()='Save']";
    }
    
    public static String DetailsHeader()
    {
        return "//h5[text()='Details']";
    }
}
