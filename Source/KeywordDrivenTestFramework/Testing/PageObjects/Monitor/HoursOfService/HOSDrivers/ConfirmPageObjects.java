/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects.Monitor.HoursOfService.HOSDrivers;

/**
 *
 * @author apeter
 */
public class ConfirmPageObjects 
{
    public static String addDriverButtonXpath()
    {
        return "//a[@fleet-tooltip='Add driver']";
    }
    public static String driverNameFieldXpath()
    {
        return "//input[@name='driverName']";
    }
    public static String siteDropdownXpath()
    {
        return "//select[@name='siteId']";
    }
    public static String saveButtonXpath()
    {
        return "//span[text()='Create new driver']/../..//button[@text='Save']";
    }
    public static String hoursOfServiceTabXpath()
    {
        return "//a[text()='Hours of service']";
    }
    public static String hosCheckboxXpath()
    {
        return "//input[@name='isHosDriver']";
    }
    public static String rulesetDropdownXpath()
    {
        return "//input[@name='isHosDriver']/../../..//select[@name='ruleId']";
    }
    public static String homeLocationFieldXpath()
    {
        return "//input[@name='locationFilter']";
    }
    public static String locationXpath(String loc)
    {
        return "//strong[text()='"+loc+"']/..";
    }
    public static String driverIDFieldXpath()
    {
        return "//input[@name='hosDriverId']";
    }
    public static String saveButtonOnEditDriverPageXpath()
    {
        return "//span[text()='Edit driver']/../..//button[@text='Save']";
    }
    public static String clickableDriverHeaderXpath()
    {
        return "//h5/a[text()='Drivers']";
    }
    public static String driverFilterXpath()
    {
        return "//div[@class='text-filter empty']/input";
    }
    public static String driverSearchButtonXpath()
    {
       // return "//a[@fleet-tooltip='Add driver']/../..//i[@class='icon-search']/..";
        //return "//div[@class='text-filter']/a[@class='btn btn-small']";
        return "//div[@class='text-filter']/a/i[@class='icon-search']/..";
    }
    public static String actionsButtonXpath()
    {
        return "//a[@class='row-action']";
    }
    public static String removeDriverXpath()
    {
        return "//ul[contains(@style,'block')]//span[text()='Remove']/..";
    }
    public static String confirmRemoveDriverButtonXpath()
    {
        return "//div[contains(@style,'block')]//button[text()='Remove']";
    }
    public static String driverRightHandSpinnerXpath()
    {
        return "//div[@class='loading-overlay ng-scope'][@style='display: none;']";
    }
    public static String DriverLefHandSpinnerXpath()
    {
        return "//div[@class='white-box-shadow span3 full-height container-left']/div[@class='loading-overlay'][@style='display: none;']";
    } 
    public static String columnDataXpath(String column)
    {
        return "//div[@name='driverListGrid']//span[text()='"+column+"']/../../div/../div[contains(@class,'cell')]";
    }
    public static String dateTimeFieldOnAddDriverStatusModalXpath()
    {
        return "//div[@id='driverStatusDateTime']//input";
    }
    public static String addDriverStatusSaveButtonXpath()
    {
        return "//div[@name='hosStatusMapModal'][contains(@style,'block')]//button[@text='Save']";
    }
    public static String workstateOnLogViewerGridXpath()
    {
        return "//div[@id='logWhiteBox']//td[2]//span";
    }
    public static String durationOnLogViewerGridXpath()
    {
        return "//div[@id='logWhiteBox']//td[4]//span";
    }
    public static String actionsButtonOnLogViewerXpath()
    {
        return "//div[@class='row-action btn-group ng-scope']/a";
    }
    public static String removeXpath()
    {
        return "//ul[contains(@style,'block')]//span[text()='Remove']/..";
    }
    public static String removeTextAreaXpath()
    {
        return "//textArea[@class='span12 no-resize mt-10 ng-scope ng-pristine ng-invalid ng-invalid-dmx-required show-validity']";
    }
    public static String removeWorkstateButtonXpath()
    {
        return "//div[@name='hosRemoveConfirmModal'][contains(@style,'block')]//button[text()='Remove']";
    }
}
