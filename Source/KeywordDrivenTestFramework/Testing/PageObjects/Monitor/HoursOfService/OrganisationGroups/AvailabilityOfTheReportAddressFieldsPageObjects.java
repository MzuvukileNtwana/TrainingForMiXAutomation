/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects.Monitor.HoursOfService.OrganisationGroups;

/**
 *
 * @author rcornelius
 */
public class AvailabilityOfTheReportAddressFieldsPageObjects {
    
     public static String Spinner()
    {
        return "//div[@class=\"tree-wrapper\"]/div[@style='display: none;'][@class=\"loading-overlay ng-scope\"]";
    }

     public static String EditButton()
    {
        return "//i[@class='icon-edit']";
    }
     
     public static String AddButton()
    {
        return "//i[@class=\"icon-plus icon-white\"]";
    }
     
     public static String DropDown()
    {
        return "//ul[@class='dropdown-menu pull-right']";
    }

     public static String SiteInDrop()
    {
        return "//a[@ng-click=\"addSite()\"]";
    }
     
     public static String HOSMenuTab()
    {
        return "//div[@style='display: none;']//a[@class='ng-binding'][text()='HOS']";
    }
     public static String HOSMenuTabClick()
    {
        return "//a[@class='ng-binding'][text()='HOS']";
    }
     
     public static String CancelButton()
    {
        return "//button[@class='btn ng-scope ng-binding btn-wide']";
    }
     
     public static String Organisation(String name)
    {
        return "//div[@style='display: none;']//span[text()='"+ name +"']";
    }
    
    public static String ReportOrganisationName()
    {
        return "//input[@name='reportOrganisationName'][@disabled='disabled']";
    }
    
    public static String ReportOrganisationAddress()
    {
        return "//textarea[@name='reportOrganisationAddress'][@disabled='disabled']";
    }
    
    public static String ReportOrganisationNameLabel()
    {
        return "//span[text()='Report Organisation Name']";
    }
    
    public static String ReportOrganisationAddressLabel()
    {
        return "//span[text()='Report Organisation Address']";
    }
}
