/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects.Manage.Operation.AirtimeManagement;

/**
 *
 * @author lmgulwa
 */
public class UsablityOfAirtimeManagementTestObject {
    
    public static String defaultAllXpath(String name)
    {
        return "//li[contains(@class, 'active')]//span[text()='" + name + "']";
    }
    public static String DefaultAll(String name)
    {
        return "//span[text()='"+name+"']";
    }
    
    public static String totalNumberOfAssetXpath(String name)
    {
        return "//li[contains(@class, 'active')]//span[not(text()='" + name + "')]";
    }
    
    public static String assetCheckboxesXpath()
    {
        return "//input[@type='checkbox'][@class='check-cell']";
    }
    
    public static String filtersLinkXpath(String filterName)
    {
        return "//span[text()='" + filterName + "']/..";
    }
    
    public static String leftGridSpinnerXpath()
    {
        return "//div[contains(@class,'container-left')]//div[@class='loading-overlay'][@style='display: none;']";
    }
    
    public static String rightGridSpinnerXpath()
    {
        return "//div[contains(@class,'container-right')]//div[@class='loading-overlay'][@style='display: none;']";
    }
    
    public static String aboveGridHeadingXpath()
    {
        return "//div[@class='page-header']//strong";
    }
    
    public static String filterTextBoxXpath()
    {
        return "//div[contains(@class,'text-filter')]/input";
    }
    
    public static String assetDescriptionXpath(String asset)
    {
        return "//a[contains(text(),'" + asset + "')]";
    }
    
    public static String btnFindXpath()
    {
        return "//div[contains(@class,'text-filter')]/a[@ng-click='$directive.filter()']";
    }
    
    public static String btnClearXpath()
    {
        return "//div[contains(@class,'text-filter')]/a[@ng-click='$directive.clear()']";
    }
    
    public static String btnPlayXpath()
    {
        return "//div//a[@fleet-tooltip='Activate']";
    }
    
    public static String btnPauseXpath()
    {
        return "//div//a[@fleet-tooltip='Suspend']";
    }
    
    public static String btnTerminateXpath()
    {
        return "//a[@fleet-tooltip='Terminate']";
    }
            
    public static String btnEditXpath()
    {
        return "//a[@fleet-tooltip='Change contract']";
    }
    
    public static String btnActionsXpath()
    {
        return "//a[@fleet-tooltip='Actions']";
    }
    
    public static String columnChooserXpath()
    {
        return "//a[contains(@class,'column-chooser')]";
    }
    
    public static String columnNameXpath(String column)
    {
        return "//ul[contains(@style,'block')]//a/span[text()='" + column + "']";
    }
    
    public static String selectedColumnNameXpath(String column)
    {
        return "//ul[contains(@style,'block')]//a/span[text()='" + column + "']/..";
    }
    
    public static String nextToIMEICheckboxXpath()
    {
        return "//div[contains(@class,'column-heading')]//input";
    }
    
    public static String welcomeMessageXpath()
    {
        return "//div[@class='login-name']/strong";
    }
    
    public static String columnHeadingXpath(String column)
    {
        return "//div[contains(@class,'column-heading')]/span[text()='" + column + "']";
    }
    
    public static String assetCheckboxeIndexXpath(int row)
    {
        return "//div[@row='" + row + "']//input[@type='checkbox'][@class='check-cell']";
    }
    
    public static String activateActionXpath()
    {
        return "//a[@event='Activate']";
    }
    
    public static String terminateActionXpath()
    {
        return "//ul[contains(@style,'block')]//a[@event='Terminate']";
    }
    
    public static String changeContractActionXpath()
    {
        return "//ul[contains(@style,'block')]//a[@event='ChangeTariff']";
    }
    
    public static String suspendActionXpath()
    {
        return "//ul[contains(@style,'block')]//a[@event='Suspend']";
    }
        public static String suspendActionXpath2()
    {
        return "//ul[contains(@style,'block')]//a[@event='Terminate']";
    }
    
    public static String clickActionsButtonXpath()
    {
        return "//a[@class=\"row-action\"]";
    }
    
    public static String btnPlayEnabledXpath()
    {
        return "//a[@fleet-tooltip='Activate'][@disabled='disabled']";
    }
    
    public static String btnPauseEnabledXpath()
    {
        return "//div//a[@fleet-tooltip='Suspend'][@disabled='disabled']";
    }
    
    public static String btnTerminateEnabledXpath()
    {
        return "//a[@fleet-tooltip='Terminate'][@disabled='disabled']";
    }
    
      public static String btnTerminateEnabledXpath2()
    {
        return  "//a[@fleet-tooltip='Terminate']";
    }
    
    
   
    
    public static String btnEditEnabledXpath()
    {
        return "//a[@fleet-tooltip='Change contract'][@disabled='disabled']";
    }
    
    public static String filterResultsXpath(int i ,String asset)
    {
        return "//div[@row='" + i + "']/a[contains(text(),'" + asset + "')]";
    }
    public static String filterAssetXpath(int i ,String asset)
    {
        return "//div[@row='"+i+"'][contains(text(),'"+asset+"')]";
    }
    
    public static String tooltipXpath()
    {
        return "//div[contains(@class,'tooltip left in')]//span";
    }
}
