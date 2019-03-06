/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects.Monitor.HoursOfService;

/**
 *
 * @author lmgulwa
 */
public class DriverGeneralPageObject {
    
    public static String btnAddDriverXpath()
    {
        return "//a[@fleet-tooltip=\"Add driver\"]";
    }
    
    public static String driverNameFieldXpath()
    {
        return "//input[@name='driverName']";
    }
    
    public static String siteDropdownXpath()
    {
        return "//select[@name='siteId']/option";
    }
    
    public static String btnAddDriverStatusXpath()
    {
        return "//a[@fleet-tooltip=\"Add status event\"]";
    }
    
    public static String addDriverStatusModalHeaderXpath()
    {
        return "//h5/span[text()='Add driver status']";
    }
    
    public static String driverWorkStateDropdownXpath()
    {
        return "//select[@name=\"workState\"]/option";
    }
    
    public static String columnChooserXpath()
    {
        return "//i[@class='icon-choose-columns']/..";
    }
    
    public static String gridColumnNameXpath(String column)
    {
        return "//div[contains(@class,'column-heading')]//span[text()='" + column + "']";
    }
    
    public static String columnListInColumnChooserXpath()
    {
        return "//ul[contains(@class, 'grid-column-choose')]/li";
    }
    
    public static String columnNameTitleContentXpath(int row)
    {
        return "//div[@class='column']//div[@row=" + row + "]/a";
    }
    
    public static String columnTitleContentXpath(String column, int row)
    {
        return "//div[contains(@class,'column')]//span[text()='" + column + "']/../../div[@row=" + row + "]";
    }
    
    public static String unorderedListColumnChooserXpath()
    {
        return "//ul[contains(@class, 'grid-column-choose')][contains(@style,'block')]";
    }
    
    public static String rowBasedOnColumnXpath(String column, String row)
    {
        return "//div[contains(@class,'column-heading')]/span[text()='" + column + "']/../../div[@row='" + row + "']";
    }
    
    public static String columnNameOnColumnChooserXpath(String column)
    {
        return "//ul[contains(@class, 'grid-column-choose')][contains(@style,'block')]//span[text()='" + column + "']/..";
    }
    
    public static String btnExportDriversXpath()
    {
        return "//i[@class=\"icon-export\"]/..";
    }
    
    public static String btnImportDriversXpath()
    {
        return "//i[@class=\"icon-import\"]/..";
    }
    
    public static String leftGridSpinnerXpath()
    {
        return "//div[contains(@class,'container-left')]//div[@class='loading-overlay'][@style='display: none;']";
    }
    
    public static String rightGridSpinnerXpath()
    {
        return "//div[contains(@class,'container-right')]//div[@class='loading-overlay'][@style='display: none;']";
    }
    
    public static String filterBoxXpath()
    {
        return "//div[contains(@class,'text-filter')]/input";
    }
    
    public static String btnActionsXpath()
    {
        return "//a[@class=\"row-action\"]";
    }
    
    public static String btnClearFilterXpath()
    {
        return "//a[@class=\"clear-filter\"][not(contains(@style,'none'))]";
    }
    
    public static String btnNextPageXpath()
    {
        return "//button[@fleet-tooltip=\"Next page\"]";
    }
    
    public static String btnLastPageXpath()
    {
        return "//button[@fleet-tooltip=\"Last page\"]";
    }
    
    public static String driverGridColumnIndexedXpath(int i)
    {
        return "//div[@name=\"driverListGrid\"]//div[" + i + "][contains(@class,'column')]/div[contains(@class,'column-heading')]/span[@class='title']";
    }
    
    public static String assetDivContainerXPath()
    {
        return "//div[@name=\"driverListGrid\"]/div[@class=\"columns ui-sortable\"]";
    }
    
    public static String getDriverGridColumnNameXPath()
    {
        return "//div[@name=\"driverListGrid\"]//div[contains(@class,'column')]/div[contains(@class,'column-heading')]/span[@class='title']";
    }
    
    public static String hosTabXPath()
    {
        return "//a[text()='Hours of service']";
    }
    
    public static String createDriverHeaderXPath()
    {
        return "//h5/span[text()='Create new driver']";
    }
    
    public static String btnSaveXpath()
    {
        return "//button[text()='Save']";
    }
    
    public static String driverDetailsSpinnerXpath()
    {
        return "//form[@name='driverDetailsForm']/../div[contains(@class,'loading-overlay') and contains(@style,'none')]";
    }
    
    public static String enableHOSForDriverCheckboxXpath()
    {
        return "//input[@name=\"isHosDriver\"]";
    }
    
    public static String hosRuleSetDropdownXpath()
    {
        return "//select[@name=\"ruleId\"]/option";
    }
    
    public static String hosDriverIdTextboxXpath()
    {
        return "//input[@name=\"hosDriverId\"]";
    }
    
    public static String hosPasswordTextboxXpath()
    {
        return "//input[@name=\"password\"]";
    }
    
    public static String gridDriverNameXpath(String name)
    {
        return "//div/a[text()='" + name + "']";
    }
    
    public static String gridDriverNameGeneralXpath()
    {
        return "//div[@class=\"column\"]//a";
    }
    
    public static String removeLinkXpath()
    {
        return "//ul[contains(@style,'block')]//span[text()='Remove']/..";
    }
    
    public static String removeDriverModalXpath()
    {
        return "//div[contains(@class,'modal') and contains(@style,'block')]";
    }
    
    public static String currentStatusRowXpath(int i)
    {
        return "//div[contains(@class,'column')]//span[text()='Current status']/../../div[@row='" + i + "']";
    }
    
    public static String btnRemoveXpath()
    {
        return "//button[text()='Remove']";
    }
    
    public static String homeLocationTextFieldXpath()
    {
        return "//input[@name=\"locationFilter\"]";
    }
    
    public static String homeLocationULPopupXpath()
    {
        return "//ul[@class=\"typeahead dropdown-menu\" and contains(@style,'block')]//a";
    }
    
    public static String hosDriverIDXpath()
    {
        return "//input[@name=\"hosDriverId\"]";
    }
    
    public static String importAssetModalXpath()
    {
        return "//form[@name=\"modalForm\"]/../../div[contains(@style,'block')]";
    }
    
    public static String btnChooseFileXpath()
    {
        return "//span[text()='Choose file']/../input";
    }
}
