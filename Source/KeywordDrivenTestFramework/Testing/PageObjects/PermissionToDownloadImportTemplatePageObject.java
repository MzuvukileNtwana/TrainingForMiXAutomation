/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects;

/**
 *
 * @author lmgulwa
 */
public class PermissionToDownloadImportTemplatePageObject {
    
    public static String filterTextBoxXpath()
    {
        return "//input[@placeholder='Filter']";
    }
    
    public static String actionsButtonXpath()
    {
        return "//a[@class='btn-actions']";
    }
        
    public static String editButtonXpath()
    {
        return "//span[text()='Edit']/..";
    }
    
    public static String viewButtonXpath()
    {
        return "//span[text()='View']/..";
    }
    
    public static String goToItemEditModeXpath()
    {
        return "//td[@ng-repeat=\"column in filteredColumns\"]//a";
    }
    
    public static String detailsFocusedXpath()
    {
        return "//a[text()='Details']/../../li[contains(@class, 'active')]";
    } 
    
    public static String tabsXpath(String tab)
    {
        return "//li[@ng-class='tabClass(tab)']//a[text()='" + tab + "']";
    }
    
    public static String contactImportCheckBoxXpath()
    {
        return "//td[text()='Contacts - Import']/..//input[not(@disabled='disabled')]";
    }
    
    public static String quickSelectDeselect()
    {
        return "//strong[text()='Quick select/deselect:']";
    }
    
    public static String enabledGeneralButton()
    {
        return "//a[@fleet-tooltip='Disable General']";
    }
    
    public static String disabledGeneralButton()
    {
        return "//a[@fleet-tooltip='Enable General']";
    }
    
    public static String organisationGroup()
    {
        return "//tr//span[text()='DVT Automation']";
    }
    
    public static String organisationGroupLinkXpath()
    {
        return "//tr//span[text()='DVT Automation']/..";
    }
    
    public static String dvtAutomationAccess()
    {
        return "//span[contains(@class, 'icon-org')]/../span[text()='DVT Automation']";
    }
    
    public static String selectButton()
    {
        return "//a[text()='Select']";
    }
    
    public static String addPermissionSecurity()
    {
        return "//a[text()='Add permissions']";
    }
    
    public static String roleActionButton()
    {
        return "//a[@fleet-tooltip='Actions']";
    }
    
    public static String roleEditButton()
    {
        return "//a/span[text()='Edit']";
    }
    
    public static String spinner()
    {
        return "//div[@class='tab-pane active ng-scope']/div[@ng-show='contentLoadingStack && contentLoadingStack.length > 0'][@style='display: none;']";
    }
    
    public static String roleNameCheck()
    {
        return "//span[text()='Test Email  Role - DO NOT DELETE']";
    }
    
    public static String delete()
    {
        return "//span[@class='icon-remove-sign icon-red']";
    }
    
    public static String contactsCheck()
    {
        return "//td[text()='Contacts']/..//i[contains(@ng-class, 'Access')]";
    }
    
    public static String contactsImportCheck()
    {
        return "//td[text()='Contacts - Import']/..//i[contains(@ng-class, 'Access')]";
    }
    
    public static String loginMixCheck()
    {
        return "//td[text()='Login - MiX Fleet Manager Mobile']/..//i[contains(@ng-class, 'Access')]";
    }
    
    public static String loginWebCheck()
    {
        return "//td[text()='Login - Web application']/..//i[contains(@ng-class, 'Access')]";
    }
    public static String BannerToDissappearXpath()
    {
        return "//div[@class='notification-wrapper notification-modal ng-scope'][contains(@style,'display: none;')]";
    }
    public static String logoutButtonXpath()
    {
        return "//a[@ng-click='logout()']";
    }
    
    public static String downloadImportTemplateButtonXpath()
    {
        return "//i[contains(@class, 'icon-download')]/..";
    }
    
    public static String importNewRecordRaidoButtonXpath()
    {
        return "//div//div/label/span[text()='Import new records']/../input[@value='importNewRecords']";
    }
    
    public static String UpdateExistingRecordRaidoButtonXpath()
    {
        return "//div//div/label/span[text()='Update existing records']/../input[@value='updateExistingRecords']";
    }
    
    public static String downloadButtonXpath()
    {
        return "//a[text()='Download']";
        //return "//div//div/a[text()='Download']";
    }
    
    public static String downloadImportTemplatePageHeaderXpath()
    {
        return "//div[contains(@style, 'display: block;')]//h5[text()='Download import template']";
    }
    
    public static String nameGridColumnTextXPath()
    {
        return "//th/span[text()='Name']";
    }
}
