/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects.Monitor.HoursOfService.Timeclock;

/**
 *
 * @author apeter
 */
public class LaunchTimeclockPageObjects 
{
    public static String hoursOfServiceModuleXpath()
    {
        return "//li[@class='dropdown ng-scope open']//h4[text()='HOURS OF SERVICE']";
    }
    public static String timeclockOptionXpath()
    {
        return "//li[@class='dropdown ng-scope open']//h4[text()='HOURS OF SERVICE']/..//a";
    }
    public static String breadcrumXpath() 
    {
        return "//a[@ng-click=\"$broadcast('openOrganisationSelectionMiller')\"]";
    }
    public static String toolbarIconsXpath(String name)
    {
        return "//a[@fleet-tooltip='"+name+"']";
    }
    public static String timeclockModalHeaderXpath()
    {
        return "//h5[text()='HOS Timeclock configuration']";
    }
    public static String organisationFieldXpath()
    {
        return "//div[@class='driverStatusAutoComplete']/input";
    }
    public static String locationToSelectXpath(String name)
    {
        return "//a/strong[text()='"+name+"']";
    }
    public static String locationFieldXpath()
    {
        return "//span[@id='timeclock-location']/input";
    }
    public static String launchButtonXpath()
    {
        return "//button[@text='Launch']";
    }
    public static String timeclockLoginPageXpath()
    {
        return "//div[@class='timeclock-select-org']";
    }
    public static String assetPageSpinnerXpath()
    {
        return "//div[@name='assetListGrid']/div[@class='loading-overlay'][@style='display: none;']";
    }
    public static String helpPageHeaderXpath()
    {
        return "//h1/span[text()='DynaMiX help']";
    }
    public static String noItemToDisplayXpath()
    {
        return "//div[@class='grid-no-items'][@style='display: none;']";
    }
    public static String changeAssetXpath()
    {
        return "//div[@id='driverStatusModal' and contains(@style,'display: block;')]//a[text()='Change asset']";
    }
    public static String assetFieldXpath()
    {
        return "//div[@id='driverStatusModal' and contains(@style,'display: block;')]//input[@name='assetName']/..//span/input";
    }
    public static String assetXpath()
    {
        return "//div[@class='driverStatusAutoComplete']//ul[contains(@style,'display: block;')]";
    }
    public static String workstateDropdownXpath()
    {
        return "//select[@name='workState']";
    }
    public static String addressOnMapXpath()
    {
        return "//img[@src='img/map-icon-drag-pin.png']";
    }
    public static String plottedAddressXpath()
    {
        return "//*[local-name()='path']";
    }
    public static String popUpAlertXpath()
    {
        return "//span[text()='Status data saved successfully']";
    }
    public static String inputDataTabXpath()
    {
        return "//li[@class='ng-scope active']/a[text()='Input data']";
    }
    public static String addedEventXpath()
    {
        return "//div[@class='canvas-container']/../span[text()='Input Data']";
    }
    public static String selectInnerCircleXpath()
    {
        return "//div[@class='datepicker-widget in']//div[@class='inner-circle']//div[text()='12']";
    }
    public static String minuteXpath()
    {
        return "//div[@class='datepicker-widget in']/div/div[@class='time']/div[2]";
    }
    public static String minuteToSelectXpath()
    {
        return "//div[@class='datepicker-widget in']//div[@class='minute-selector zoomable']//div[text()='00']";
    }
    public static String logDataSaveButtonXpath()
    {
        return "//div[@name='logDataModal'][contains(@style,'block')]//button[@text='Save']";
    }
    public static String logDataConfirmButtonXpath()
    {
        return "//div[@name='logDataConfirmModal'][contains(@style,'block')]//button[@text='Confirm']";
    }
    public static String dateFieldOnTimelineXpath()
    {
        return "//div[@class='form-inline pull-left']//input";
    }
}
