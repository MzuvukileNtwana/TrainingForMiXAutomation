/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package KeywordDrivenTestFramework.Testing.PageObjects;

/**
 *
 * @author lmkhontwana
 */
public class OrganisationGroupsPageObjects {
    
    
     public static String AssetsTabXpath() 
    {
        return "//ul[@class='nav nav-tabs tabs-three']/li/a/span[text()='Assets']";
    }
      public static String AssetsTotalTabXpath() 
    {
        return "//ul[@class='nav nav-tabs tabs-three']/li/a/span[text()='Assets']/../span[2]";
    }
     public static String AssetsTabDefaultSelectedXpath() 
    {
        return "//ul[@class='nav nav-tabs tabs-three']/li[@class='active']/a/span[text()='Assets']";
    }    
       public static String DriversTabXpath() 
    {
        return "//ul[@class='nav nav-tabs tabs-three']/li/a/span[text()='Drivers']";
    }
        public static String DriversTotalTabXpath() 
    {
        return "//ul[@class='nav nav-tabs tabs-three']/li/a/span[text()='Drivers']/../span[2]";
    }
      public static String FilterInputXpath() //use get Attri to retrieve placeholder 
    {
        return "//input[@ng-model='filterText']";
    }    
    public static String ClearFilterButtonXpath() //use get Attri to retrieve 
    {
        return "//div[@class='input-reset-wrapper']/button";
    }
    
      
      public static String AssetsGridTableXpath() 
    {
        return "//div[@id='faAssetGridOrganisationGroupsGrid']//table";
    }
      public static String AssetsGridTableHeaderXpath() 
    {
        return "//div[@id='faAssetGridOrganisationGroupsGrid']//table/thead//span[@class='ng-binding']";
    }
      
     public static String DriversGridTableXpath() 
    {
        return "//div[@id='faDriverGridOrganisationGroupsGrid']//table";
    } 
    public static String DriversGridTableHeaderXpath() 
    {
        return "//div[@id='faDriverGridOrganisationGroupsGrid']//table/thead//span[@class='ng-binding']";
    } 
     public static String EditSiteButtonXpath() //must be  //use get Attri
    {
        return "//a[@fleet-tooltip='Edit site']";
    }
      public static String AddSiteButtonXpath() 
    {
        return "//a[@fleet-tooltip='Add site']";
    }
      public static String DriversActionButtonXpath() 
    {
        return "//div[@id='faDriverGridOrganisationGroupsGrid']//a[@class='btn btn-small column-chooser']";
    } 
      
      
     public static String DisabledNameColumnXpath() 
    {
        return "//a[@class='disabled']//span[text()='Name']";
    }  
    public static String NameColumnHeaderXpath() 
    {
        return "//th//span[text()='Name']";
    }  
    public static String OrganisationSitesXpath() //click second from list
    {
        return "//div[@class=\"tree-item-content\"]//span[@class='tree-item-label']";
    }    
    public static String HideLeftPanelXpath() 
    {
        return "//a[@fleet-tooltip='Hide left panel']";
    } 
    public static String ShowLeftPanelXpath() 
    {
        return "//a[@fleet-tooltip='Show left panel']";
    }
    public static String LeftPanelContainerVisibleXpath()
    {
        return "//div[@class='white-box-shadow span4 full-height container-left'][contains(@style,'block')]";
    }   
     public static String LeftPanelContainerHiddenXpath()
    {
        return "//div[@class='white-box-shadow span4 full-height container-left'][contains(@style,'none')]";
    }   
     public static String getSitesOnListXpath() 
    {
        return "//td[@class=\"group ng-scope ng-binding\"]";
    }
    
}
