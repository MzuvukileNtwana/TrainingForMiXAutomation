/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects.Manage.Operation;

/**
 *
 * @author lmgulwa
 */
public class EnableOrgForIFTAPageObject {
    
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
    
    public static String orgDetailsHeaderXpath(String orgDetailsHeader)
    {
        return "//h5[text()='" + orgDetailsHeader + "']";
    }
    
    public static String IFTAFieldXpath(String field)
    {
        return "//span[text()='" + field + "']/../input";
    }
    
    public static String btnSaveXpath()
    {
        return "//button[text()='Save']";
    }
    
    public static String confirmationMessageXpath(String message)
    {
        return "//div[contains(@class,'notification-wrapper')][contains(@style,'block')]//span[text()='" + message + "']";
    }
    
    public static String homeXpath()
    {
        return "//div[@class=\"brand\"]/a";
    }
    
    public static String reportsTableSpinnerXpath()
    {
        return "//h5[text()='Reports available in this category']/../div/div[contains(@class,'loading-overlay')][contains(@style,'none')]";
    }
    
    public static String reportTitleXpath(String report)
    {
        return "//table//span[text()='" + report + "']";
    }
    
    public static String reportCategoryDropdownXpath()
    {
        return "//div/select/option";
    }
    
    public static String homePageSpinnerXpath()
    {
        return "//div[@class='loading-overlay'][@style='display: none;']";
    }
}
