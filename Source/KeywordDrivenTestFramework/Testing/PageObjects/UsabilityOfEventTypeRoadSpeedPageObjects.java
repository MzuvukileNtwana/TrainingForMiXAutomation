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
public class UsabilityOfEventTypeRoadSpeedPageObjects 
{
    public static String roadSpeedEventsTabXpath()
    {
        return "//a[text()='Roadspeed events']";
    }
    public static String roadSpeedEventsHeaderXpath()
    {
        return "//h5[text()='Roadspeed events']";
    }
    public static String enableRoadSpeedEventsCheckboxXpath()
    {
        return "//span[text()='Enable roadspeed events']/../input";
    }
    public static String recordEventLabelXpath()
    {
        return "//div[@class='control-group']/label[1]";
    }
    public static String allowBufferLabelXpath()
    {
        return "//div[@class='control-group']/label[@class='muted']";
    }
    public static String selectingAGroupLabelXpath()
    {
        return "//p[@class='muted']";
    }
    public static String organisationTreeXpath()
    {
        return "//p[@class='muted']/../ul/..";
    }
    public static String disabledOrganisationTreeXpath()
    {
        return "//a[@class='tree-item selected disabled']";
    }
    public static String saveButtonXpath()
    {
        return "//button[text()='Save']";
    }
    public static String bufferPercentageTextboxXpath()
    {
        return "//div[@class='control-group']/label[@class='muted']/input";
    }
    public static String errorMessageXpath()
    {
        return "//span[text()='Field value must be between 0 and 100']";
    }
    public static String roadSpeedPopUpMessageXpath()
    {
        return "//span[text()='Roadspeed events settings updated successfully']";
    }
    public static String selectedOrgTreeXpath()
    {
        return "//a[@class='tree-item selected']";
    }
    public static String spinnerXpath()
    {
        return "//div/div[@class='loading-overlay ng-scope'][@style='display: none;']";
    }
}
