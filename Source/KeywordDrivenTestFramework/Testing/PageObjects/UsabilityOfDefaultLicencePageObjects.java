/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects;

/**
 *
 * @author apeter
 */
public class UsabilityOfDefaultLicencePageObjects 
{
    public static String pageHeaderXpath()
    {
        return "//h5/span[text()='Edit Organisation settings:']";
    }
    
    public static String activeAssetIntervalTabXpath()
    {
        return "//div[@class='tab-pane active ng-scope']//li[contains(@class,'active')]/a";
    }
    public static String driverDefaultsHeaderXpath()
    {
        return "//form[@name='orgSettingsDriverAccessForm']/div/legend";
    }
    
    public static String assetsIntervalAndReminderDefaultsTabXpath()
    {
        return "//a[text()='Asset interval and reminder defaults']";
    }
    
    public static String defaultServicePageXpath()
    {
        return "//form[@name='assetServiceForm']/../p";
    }
    
    public static String defaultLicenceTabXpath()
    {
        return "//a[text()='Default licence']";
    }
    
    public static String defaultLicenceScreenXpath()
    {
        return "//form[@name='assetLicenceForm']/../p";
    }
    
    public static String licenceDurationFieldXpath()
    {
        return "//label[text()='Licence duration']/..//input";
    }
    
    public static String licenceDurationErrorXpath()
    {
        return "//div[@id='licenceDurationError']/span";
    }
    
    public static String noErrorMessageXpath()
    {
        return "//div[@id='licenceDurationError']/span[contains(@style,'none')]";
    }
    public static String buttonSaveXpath() 
    {
        return "//button[text()='Save']";
    }
    
    public static String reminderPeriodFieldXpath()
    {
        return "//form[@name='assetLicenceForm']//label[text()='Reminder period']/..//input";
    }
    
    //driver defaults
    public static String driveDefaultsTabXpath()
    {
        return "//a[text()='Driver defaults']";
    }
    
    public static String byDefaultFirstRadioButtonXpath()
    {
        return "//span[text()='All new drivers can access all assets']/../input";
    }
    
    public static String byDefaultSecondRadioButtonXpath()
    {
        return "//span[text()='Do not allow new drivers access to all assets']/../input";
    }
    
    public static String byDefaultFirstRadioButtonLabelXpath()
    {
        return "//span[text()='All new drivers can access all assets']";
    }
    
    public static String byDefaultSecondRadioButtonLabelXpath()
    {
        return "//span[text()='Do not allow new drivers access to all assets']";
    }
    
    public static String automaticallyCreatedFieldLabelXpath()
    {
        return "//span[text()='Automatically created driver name']";
    }
    
    public static String mandatoryFieldXpath()
    {
        return "//span[@class='field-mandatory']";
    }
    
    public static String automaticallyCreatedFieldXpath()
    {
        return "//input[@name='autoName']";
    }
    
    public static String assignCheckBoxXpath()
    {
        return "//input[@ng-model='form.useAssetSiteId']";
    }
    
    public static String autoCreateCheckBoxXpath()
    {
        return "//input[@ng-model='form.autoCreate']";
    }
    
    public static String autoCreateLabelXpath()
    {
        return "//input[@ng-model='form.autoCreate']/../span";
    }
    
    public static String assignLabelXpath()
    {
        return "//input[@ng-model='form.useAssetSiteId']/../span";
    }
    
    public static String popUpAlertXpath()
    {
        return "//span[text()='Organisation updated successfully']";
    }
    
    //decommissioned sites
    public static String decommisionedSitesPageHeadingXpath()
    {
        return "//form[@name='decommissionedSitesForm']/h5";
    }
    
    public static String decommissionedSitesTabXpath()
    {
        return "//a[text()='Decommissioned sites']";
    }
    public static String standardScoringTabXpath()
    {
        return "//a[text()='Standard scoring']";
    }
    public static String workingHoursTabXpath()
    {
        return "//a[text()='Working hours']";
    }
    public static String dutchTaxTabXpath()
    {
        return "//a[text()='Dutch tax']";
    }
    public static String trackingOptionsXpath()
    {
        return "//a[text()='Tracking options']";
    }
    public static String costCategoriesTabXpath()
    {
        return "//a[text()='Cost categories']";
    }
    public static String iridiumAirtimeTabXpath()
    {
        return "//a[text()='Iridium airtime contracts']";
    }
    public static String companyDetailsTabXpath()
    {
        return "//a[text()='Company details']";
    }
    public static String iridiumSpinnerXpath()
    {
        return "//form[@name='selectContractForm']/../div[@class='loading-overlay ng-scope'][@style='display: none;']";
    }
    public static String iridiumGridXpath()
    {
        return "//form[@name='iridiumAirtimeContractsForm']";
    }
    public static String pleaseSelectStringXpath()
    {
        return "//form[@name='iridiumAirtimeContractsForm']/p";
    }
    public static String selectContractXpath()
    {
        return "//a[text()='Click to select contract']/..";
    }
    public static String selectContractModalHeaderXpath()
    {
        return "//h5/span[text()='Select contract']";
    }
    public static String contractTypeDropdownXpath()
    {
        return "//span[text()='Contract type']/../../select";
    }
    public static String contractTypeDropdownOptionXpath()
    {
        return "//span[text()='Contract type']/../../select/option";
    }
    public static String contractDropdownXpath()
    {
        return "//span[text()='Contract']/../../select";
    }
    public static String contractMandatorySymbolXpath()
    {
        return "//span[text()='Contract']/../span[@class='field-mandatory']";
    }
    public static String contractTypeMandatorySymbolXpath()
    {
        return "//span[text()='Contract type']/../span[@class='field-mandatory']";
    }
    public static String selectedContractXpath(String contract)
    {
        return "//a[text()='"+contract+"']";
    }
    public static String redXXpath(String contract)
    {
        return "//a[text()='"+contract+"']/..//i[@class='icon-remove-sign icon-red']";
    }
    public static String closeButtonXpath()
    {
        return "//form[@name='selectContractForm']/../..//button";
    }
    public static String selectContractCancelButtonXpath()
    {
        return "//form[@name='selectContractForm']/../../../../..//button[text()='Cancel']";
    }
     public static String selectContractSelectButtonXpath()
    {
        return "//form[@name='selectContractForm']/../../../../..//button[text()='Select']";
    }
    public static String selectContractLinkXpath()
    {
        return "//a[text()='Click to select contract']";
    }
    
    public static String selectSiteLinkXpath()
    {
        return "//a[text()='Select site']";
    }
    
    public static String selectSiteHeaderXpath()
    {
        return "//h5[text()='Select site']";
    }
    
    public static String listOfSitesXpath()
    {
        return "//h5[text()='Select site']/../../../div[@class='column-viewport ps-container']//a";
    }
    
    public static String SiteListXpath()
    {
        return "//h5[text()='Select site']/../../..//div[@class='column-resizable ng-scope ui-resizable']/div[@class='column ps-container']";
    }
    
    public static String selectedSiteXpath()
    {
        return "//h5[text()='Select site']/../../../div[@class='column-viewport ps-container']//a[contains(@class,'active')]";
    }
    
    public static String selectSiteButtonXpath()
    {
        return "//h5[text()='Select site']/../../../div[@class='menu-footer']//a[text()='Select']";
    }
    
    public static String selectedSiteLinkXpath(String siteName)
    {
        return "//a[text()='"+siteName+"']";
    }
    
    public static String cancelSiteButtonXpath()
    {
        return "//h5[text()='Select site']/../../../div[@class='menu-footer']//a[text()='Cancel']";
    }
    
    public static String removeSelectedSiteButtonXpath(String selectedSite)
    {
        return "//a[text()='"+selectedSite+"']/..//i";
    }
    
    public static String removePopUpHeaderXpath()
    {
        return "//span[text()='Remove decommissioned site']";
    }
    
    public static String removeButtonXpath()
    {
        return "//span[text()='Remove decommissioned site']/../../../../../..//button[text()='Remove']";
    }
    
    public static String spinnerXpath()
    {
        return "//div/div[@class='loading-overlay ng-scope'][@style='display: none;']";
    }
    
    public static String yesButtonXpath()
    {
        return "//button[text()='Yes']";
    }
    public static String cancelButtonXpath()
    {
        return "//div[@class='page-header']//button[text()='Cancel']";
    }
    public static String saveButtonXpath()
    {
        return "//div[@class='page-header']//button[text()='Save']";
    }
}
