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
public class UpdatingRegionaSettingsPageObjects 
{
    public static String personalDetailsTabXpath()
    {
        return "//a[text()='Personal details']";
    }
    public static String regionalSettingsTabXpath()
    {
        return "//a[text()='Regional settings']";
    }
    public static String regionalSettingsHeadingXpath()
    {
        return "//h5/span[text()='Settings']";
    }
    public static String countryDropdownXpath()
    {
        return "//select[@ng-model='userProfile.countryCode']";
    }
    public static String languageDropdownXpath()
    {
        return "//select[@name='languageList']";
    }
    public static String timeZoneDropdownXpath()
    {
        return "//select[@name='timeZone']";
    }
    public static String formatDropdownXpath()
    {
        return "//select[@ng-model='userProfile.localeId']";
    }
    public static String measurementDropdownXpath()
    {
        return "//select[@ng-model='userProfile.measurementType']";
    }
    public static String consumptionDropdownXpath()
    {
        return "//select[@ng-model='userProfile.consumptionType']";
    }
    public static String saveButtonXpath()
    {
        return "//button[text()='Save']";
    }
    public static String popUpMessageXpath()
    {
        return "//span[text()='User settings updated successfully']";
    }
}
