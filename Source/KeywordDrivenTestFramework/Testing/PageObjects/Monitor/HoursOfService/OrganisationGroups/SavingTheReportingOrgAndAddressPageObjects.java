/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects.Monitor.HoursOfService.OrganisationGroups;

import KeywordDrivenTestFramework.Core.BaseClass;

/**
 *
 * @author smbiko
 */
public class SavingTheReportingOrgAndAddressPageObjects extends BaseClass
{
    public static String waitForSpinnerOrgGroupXpath()
    {
        return "//div[@class='tree-wrapper']/div[@style='display: none;'][@class='loading-overlay ng-scope'][@style='display: none;']";
    }
    public static String manageOrgGroupHeaderXpath()
    {
        return "//div[@class='page-header']/h5[text()]";
    }
    public static String orgNodeContentXpath()
    {
        return "//div[@class='tree-wrapper'][@fleet-loader='content']";
    }
    public static String editSiteButtonXpath()
    {
        return "//i[@class='icon-edit']/..";
    }
    public static String addSiteButtonXpath()
    {
        return "//i[@class='icon-plus icon-white']/..";
    }
    public static String editSiteButtonTooltipXpath()
    {
        return "//div[@class='tooltip-inner']/span[text()='Edit site']/..";
    }
    public static String addSiteButtonTooltipXpath()
    {
        return "//div[@class='tooltip-inner']/span[text()='Add site']";
    }
    public static String addSiteButtonDropdownXpath()
    {
        return "//ul[@class='dropdown-menu pull-right'][not(contains(@style,'display: none'))][@ng-hide]";
    }
    public static String siteLinkDropdownXpath()
    {
        return "//ul[@class='dropdown-menu pull-right'][not(contains(@style,'display: none'))][@ng-hide]/li/a[text()='Site']";
    }
    public static String addSiteModalXpath()
    {
        return "//div[@class='modal hide fade ng-scope in']";
    }
    public static String addSiteModalGeneralTabXpath()
    {
        return "//li//a[text()='General']/..";
    }
    public static String addSiteModalHOSTabXpath()
    {
        return "//li//a[text()='HOS']/..";
    }
    public static String siteNameLabelXpath()
    {
        return "//span[text()='Site name']";
    }
    public static String siteNameTextboxXpath()
    {
        return "//input[@name='siteName']";
    }
    public static String siteNameTextboxEmptyXpath()
    {
        return "//span[text()='This field is required'][not(contains(@style,'display:none'))]";
    }
    public static String reportNameTextboxXpath()
    {
        return "//input[@name='reportOrganisationName'][@ng-model='organisation.siteTemplate.site.reportOrganisationName']";
    }
    public static String reportAddressTextboxXpath()
    {
        return "//textarea[@name='reportOrganisationAddress'][@ng-model='organisation.siteTemplate.site.reportOrganisationAddress']";
    }
    public static String addSiteModalSaveButtonXpath()
    {
        return "//button[text()='Save']";
    }
    public static String checkboxHOSTabXpath()
    {
        return "//input[@name='useDefaultSite']";
    }
    public static String addSiteModalSaveButtonEnabledXpath()
    {
        return "//button[text()='Save'][not(contains(@disabled,'disabled'))]";
    }
    public static String addSiteModalSaveButtonDisabledXpath()
    {
        return "//button[text()='Save'][contains(@disabled,'disabled')]";
    }
    public static String reportOrgRequiredMsgXpath()
    {
        return "//input[@name='reportOrganisationName'][@ng-model='defaultSite.reportOrganisationName']/../span";
    }
    public static String clickAwayFromTextboxXpath()
    {
        return "//label/span[text()='Report Organisation Name']";
    }
    public static String siteCreatedMsgXpath()
    {
        return "//span[@id='pop-alert-message' and text()='Site created successfully']";
    }
    public static String siteUpdatedMsgXpath()
    {
        return "//span[@id='pop-alert-message' and text()='Site updated successfully']";
    }
    public static String siteDeletedMsgXpath()
    {
        return "//span[@id='pop-alert-message' and text()='Site deleted successfully']";
    }
    
    public static String retrieveSiteListXpath()
    {
        return "//div[@class='tree-wrapper']/ul/li/div[@class='tree-sub-items ng-scope']/ul/li";
    }
    
    public static String retrieveSiteListItemXpath(int item)
    {
        return "//div[@class='tree-wrapper']/ul/li/div[@class='tree-sub-items ng-scope']/ul/li/div/div/span[text()='"+item+"']";
    }
    public static String waitForNewSiteXpath(String item)
    {
        return "//div[@class='tree-wrapper']/ul/li/div[@class='tree-sub-items ng-scope']/ul/li/div/div/span[contains(text(),'"+item+"')]";
    }
    public static String removeButtonOnNewSiteXpath(String item)
    {
        return "//span[contains(text(),'"+item+"')]/../a";
    }
    public static String deleteNewSiteXpath()
    {
        return "//button[text()='Delete']";
    }
    
    

    
    
}
