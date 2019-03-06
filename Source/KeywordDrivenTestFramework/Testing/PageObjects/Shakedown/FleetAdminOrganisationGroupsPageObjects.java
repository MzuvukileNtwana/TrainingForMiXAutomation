/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects.Shakedown;

/**
 *
 * @author sscholtz
 */
public class FleetAdminOrganisationGroupsPageObjects {
    
    
    public static String OrganisaionGroupSpinner()
    {
        return "//div[@class='white-box-shadow full-height container-right span8']//div[@class='loading-overlay ng-scope'][@style='display: none;']";
    }
    
    public static String AddButton()
    {
        return "//a[@fleet-tooltip='Add site']";
    }
    
    public static String Site()
    {
        return "//a[text()='Site']";
    }
    
    public static String AddSite()
    {
        return "//h5/span[text()='Add site']";
    }
    
    public static String SiteName()
    {
        return "//span[text()='Site name']";
    }
    
    public static String Name()
    {
        return "//input[@name='siteName']";
    }
    
    public static String Notes()
    {
        return "//textarea[@name='notes']";
    }
    
    public static String SaveButton()
    {
        return "//button[text()='Save']";
    }
    
    public static String SaveMessage()
    {
        return "//div[@class=\"notification-wrapper notification-modal ng-scope\"][@style=\"display: none;\"]";
    }
    
    public static String SiteCheck(String name)
    {
        return "//span[contains(text(),'"+name+"')]";
    }
    public static String SiteEdited()
    {
        return "//span[contains(text(),'EditedOrganisationGroupTest (CAT/SAST)')]";
    }
    public static String SiteAdded()
    {
        return "//span[contains(text(),'OrganisationGroupTest (CAT/SAST)')]";
    }

    public static String EditSiteButton()
    {
        return "//a[@fleet-tooltip=\"Edit site\"]";
    }

    public static String RemoveMessage()
    {
        return "//span[text()='Site deleted successfully']";
    }
    
    public static String EditSiteHeading()
    {
        return "//div[@class='modal-body']//span[text()='Edit site']";
    }

    public static String DeleteIcon(String name)
    {
        return "//span[contains(text(),'"+name+"')]/..//a[@class='delete']";
    }

    public static String NameConfirmationBeforeDeleting(String name)
    {
        return "//strong[text()='"+name+"']";
    }

    public static String DeleteButton()
    {
        return "//div[@class='modal hide fade hidden-phone modal-mini in']/form//div[@class='modal-footer']//button[text()='Delete']";
    }
    
    public static String DeleteMessage()
    {
        return "//div[@class='modal hide fade hidden-phone modal-mini in']/form/div/div[@class='modal-loading-pane']/div/div/div[@ng-bind-html-unsafe=\"$modal.message | translate:$modal.data\"]";
    }
    
    public static String CancelButton()
    {
        return "//button[text()='Cancel']";
    }
    public static String DeleteSiteHeading()
    {
        return "//h5[text()='Delete site']";
    }
    public static String ManageOrgGroupsHeading()
    {
        return "//h5[text()='Manage organisation groups']";
    }
}
