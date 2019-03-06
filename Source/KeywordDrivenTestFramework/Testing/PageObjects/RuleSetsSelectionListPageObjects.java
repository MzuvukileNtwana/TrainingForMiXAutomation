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
public class RuleSetsSelectionListPageObjects 
{
     public static String ruleSetsXpath(int ruleset)
    {
        return "//div[@class='tab-pane active']/div["+ruleset+"]//span";
    }
    public static String ruleSetsXpath()
    {
        return "//div[@class='tab-pane active']//span";
    }
    public static String checkboxXpath(int ruleset)
    {
        return "//div[@class='tab-pane active']/div["+ruleset+"]//input";
    }
    public static String checkboxToCheckXpath()
    {
        return "//span[text()='Alaska Intrastate Passenger 7 Day']/../input";
    }
    public static String saveButtonXpath()
    {
        return "//button[@text='Save']";
    }
    public static String organisationDetailsTabXpath()
    {
        return "//li/a[text()='Organisation details']";
    }
    public static String HOSRulesetsTabXpath()
    {
        return "//li/a[text()='HOS rule sets']";
    }
    public static String countryDropdownXpath()
    {
        return "//select[@name='countryCode']";
    }
    public static String yesButtonXpath()
    {
        return "//button[text()='Yes']";
    }
}
