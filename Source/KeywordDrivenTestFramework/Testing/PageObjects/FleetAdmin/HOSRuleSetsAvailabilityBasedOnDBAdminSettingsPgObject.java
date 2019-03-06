/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects.FleetAdmin;

/**
 *
 * @author lmgulwa
 */
public class HOSRuleSetsAvailabilityBasedOnDBAdminSettingsPgObject {
    
    public static String orgPageSpinnerXpath()
    {
        return "//div[contains(@class,'white-box-shadow')]/div[contains(@class,'loading-overlay')][contains(@style,'none')]";
    }
    
    public static String rootOrgExpandXpath(String rootOrg)
    {
        return "//strong[text()='" + rootOrg + "']/../../../../span";
    }
    
    public static String actualOrgXpath(String org)
    {
        return "//strong[text()='" + org + "']/..";
    }
    
    public static String orgDetailsPageSpinnerXpath(String orgDetailsHeader)
    {
        return "//h5[text()='" + orgDetailsHeader + "']/../../../div[contains(@class,'loading-overlay')][contains(@style,'none')]";
    }
    
    public static String TabUsingAtagnameXpath(String tab)
    {
        return "//a[text()='" + tab + "']";
    }
    
    public static String hosRuleSetPageSpinnerXpath()
    {
        return "//form[@name=\"hosRuleSetsForm\"]/../div[contains(@class,'loading-overlay')][contains(@style,'none')]";
    }
    
    public static String orgDetailsHeaderXpath(String orgDetailsHeader)
    {
        return "//h5[text()='" + orgDetailsHeader + "']";
    }
    
    public static String hosRuleSetPageSpinnerXpath(String tab)
    {
        return "//legend[text()='" + tab + "']/../../../../../../div[contains(@class,'loading-overlay')][contains(@style,'none')]";
    }
    
    public static String ruleSetAllCheckboxXpath()
    {
        return "//div/label[@class=\"checkbox\"]/span";
    }
    
    public static String ruleSetSpecificCheckboxXpath(int i)
    {
        return "//div[" + i + "]/label[@class=\"checkbox\"]/input";
    }
    
    public static String ruleSetCheckboxByNameXpath(String ruleSet)
    {
        return "//div/label[@class=\"checkbox\"]/span[text()='" + ruleSet + "']/../input";
    }
    
    public static String ruleSetCheckboxByTextXpath(String ruleSet)
    {
        return "//div/label[@class=\"checkbox\"]/span[text()='" + ruleSet + "']/../span";
    }
    
    public static String ruleSetAllNameXpath()
    {
        return "//div/label[@class=\"checkbox\"]/span";
    }
    
    public static String ruleSetSpecificNameXpath(int i)
    {
        return "//div[" + i + "]/label[@class=\"checkbox\"]/span";
    }
    
    public static String gridDriverXpath()
    {
        return "//div[@class=\"column\"]//a";
    }
    
    public static String driverDetailsPageSpinnerXpath()
    {
        return "//form[@name=\"driverDetailsForm\"]/../div[contains(@class,'loading-overlay')][contains(@style,'none')]";
    }
    
    public static String driverHOSSettingPageSpinnerXpath()
    {
        return "//form[@name=\"driverHoursOfServiceForm\"]/../../../../div[contains(@class,'loading-overlay')][contains(@style,'none')]";
    }
    
    public static String hosSettingsCheckboxXpath()
    {
        return "//input[@name=\"isHosDriver\"]";
    }
    
    public static String hosRuleSetDropDownXpath()
    {
        return "//span[text()='Hours of service rule set']/../../select";
    }
    
    public static String hosRuleSetDropDownOptionsXpath()
    {
        return "//span[text()='Hours of service rule set']/../../select/option";
    }
    
    public static String hosRuleSetDropDownSpecificOptionsXpath(int i)
    {
        return "//span[text()='Hours of service rule set']/../../select/option[@value='" + i + "']";
    }
    
    public static String hosRuleSetCheckboxByTextXpath(String ruleSet)
    {
        return "//span[text()='" + ruleSet + "']/../input";
    }
    
    public static String btnSaveXpath()
    {
        return "//button[text()='Save']";
    }
    
    public static String hosRuleSetDropDownByTextOptionXpath(String ruleSet)
    {
        return "//span[text()='Hours of service rule set']/../../select/option[text()='" + ruleSet + "']";
    }
}
