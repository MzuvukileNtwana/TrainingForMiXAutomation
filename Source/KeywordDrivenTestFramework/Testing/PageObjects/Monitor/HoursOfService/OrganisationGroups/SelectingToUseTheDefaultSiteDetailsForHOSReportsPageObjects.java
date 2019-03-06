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
public class SelectingToUseTheDefaultSiteDetailsForHOSReportsPageObjects {
    
    public static String Spinner()
    {
        return "//div[@class='tree-wrapper']/div[@style='display: none;'][@class='loading-overlay ng-scope']";
    }
    
    public static String DriverANDAssetHeading(String name)
    {
        return "//div[@class='span12 tab_container']//span[text()='"+name+"']";
    }
     public static String EditButton()
    {
        return "//a[@fleet-tooltip='Edit site' and not(contains(@disabled,'disabled'))]";
    }
     
     public static String EditButton2()
    {
        return "//a[@fleet-tooltip='Edit site']";
    }
     
     public static String AddButton()
    {
        return "//i[@class='icon-plus icon-white']";
    }
     
      public static String DefaultSite()
    {
        return "//span[contains(text(),'Default Site')]";
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
        return "//li[@class='ng-scope active']/a[text()='HOS']"; 
    }
     
     public static String HOSMenuTabClick2()
    {
        return "//a[text()='HOS']"; 
    }
     
     public static String CancelButton()
    {
        return "//button[text()='Cancel']";
    }
     
     public static String Organisation(String name)
    {
        return "//div[@style='display: none;']//span[text()='"+ name +"']";
    }
    //=======================[SITE VALIDATION]=======================//
//    public static String ReportOrganisationName()
//    {
//        return "//input[@name='reportOrganisationName']";
//    }
    public static String ReportOrganisationName()
    {
        return "//input[@name='reportOrganisationName'][1]";
    }
    
    public static String ReportOrganisationAddress()
    {
        //return "//textarea[@name='reportOrganisationAddress']";
        return "//textarea[2][@name='reportOrganisationAddress']";
    }
    
    //===========================================================================//
    
//      public static String DVTSite2()
//    {
//        return "//div[@class='tree-sub-items ng-scope']/ul/li[2]/div/div/span[2]";
//    }
      
      public static String DVTSite2()
    {
        return "//div[@class='tree-sub-items ng-scope']/ul/li[5]/div/div";
    }
      
    //div[@class='tree-sub-items ng-scope']/ul/li[2]/div/div/span[1]
      
      public static String ManageOrganisationGroupsHeading()
    {
        return "//h5[text()='Manage organisation groups']";
    }

      public static String Checkbox()
    {
        return "//input[@name='useDefaultSite'][@type='checkbox']";
    }
      
      public static String SaveEnabledCheck()
    {
        return "//button[text()='Save'][@disabled='disabled']";
    }
      
      public static String SaveClick()
    {
        return "//button[text()='Save']";
    }
      
       public static String SavePopup()
    {
        return "//span[@id='pop-alert-message'] ";
    }
       
      public static String SaveMessage ()
    {
        return "//span[text()='Site updated successfully']";
    }
      
      public static String SearchBox ()
    {
        return "//input[@class='filter-search-input input-medium filter-clear ng-pristine ng-valid']";
    }
      
      public static String SpinnerInCustomGroups ()
    {
        return "//div[@class='fleet-grid-container-wrapper']/../div[@class='loading-overlay ng-scope'][@style='display: none;']";
    }
      
}
