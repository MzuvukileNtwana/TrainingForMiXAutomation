/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects;

/**
 *
 * @author elebese
 */
public class IndividuallySubscribingAListOfDriversToANotificationPageObjects 
{
    public static String AddNotificationXpath()
    {
        return "//i[@class='icon-plus icon-white']/..";
    }
    
    public static String DetailsTabXpath()
    {
        return "//a[text()='Details']";
    }
    
    public static String DetailsHeaderXpath()
    {
        return "//h5[text()='Notification details']";
    }
    
    public static String NotificationNameXpath()
    {
        return "//input[@name='notificationName']";
    }
    
   public static String FilterTextboxXpath()
    {
        return "//div[@class='text-filter empty']/input";
    }
   
    public static String ViolationCheckboxXpath()
    {
        return "//span[text()='Weekly Driving']/../../../td/input"; 
    }
    public static String ViolationTypeCheckboxXpath()
    {
        return "//span[text()='Shift Break']/../../../td/input"; 
    }
    
    public static String IndividualRadioButtonXpath()
    {
        return "//span[text()='Individual']/../input";
    }
    
    public static String ExpandButtonXpath(String text)
    {
        return "//span[text()='"+text+"']/../../../span";
    }
    
    public static String DriversCheckboxXpath(int driver)
    {
        return "//span[text()='Default Site']/../../../div[2]/ul/li["+driver+"]/div/div/input";
    }
    
    public static String DriversNameXpath(int driver)
    {
        return "//span[text()='Default Site']/../../../div[2]/ul/li["+driver+"]/div/div/span";
    }
    
    public static String DriversNameXpath(int driver,String site)
    {
        return "//span[text()='"+site+"']/../../../div[2]/ul/li["+driver+"]/div/div/span";
    }
    
    public static String EscalationTextboxXpath()
    {
        return "//span[text()='Weekly Driving']/../../../td[3]/div/span/input";
    }
    public static String EscalationTextFieldXpath()
    {
        return "//span[text()='Shift Break']/../../../td[3]/div/span/input";
    }
    
    public static String SelectRecipientsButtonXpath()
    {
        return "//h5[text()='Email notifications']/../button[text()='Select recipients']";
    }
    
    public static String ContactXpath()
    {
        return "//tr[1]/td/input[@type='checkbox']";
    }
    public static String EmailContactByXpath()
    {
        return "//div/h5/span[text()='Select email recipients']//..//..//..//table[@class='table table-scroll table-condensed table-list no-text-clip']/tbody/tr[1]/td[1]/input[1]";
    }
    public static String ContactByXpath()
    {
        return "//div/h5/span[text()='Select SMS recipients']//..//..//..//table[@class='table table-scroll table-condensed table-list no-text-clip']/tbody/tr[1]/td[1]/input[1]";
    }
    
    public static String ButtonXpath(String text)
    {
        return "//button[text()='"+text+"']";
    }
    
    public static String DriversCountXpath()
    {
        return "//span[text()='Drivers']/../../div[@class='cell alt']";
    }
    
    public static String SearchButtonXpath()
    {
        return "//i[@class='icon-search']/../../a[@class='btn btn-small']";
    }
    
    public static String TableLoaderXpath()
    {
        return "//div[@class='loading-overlay' and @style='display: none;']";
    }
    
    public static String DriverTableLoaderXpath()
    {
        return "//div[@class='paged-grid']/div[@class='loading-overlay' and @style='display: none;']";
    }
    
    public static String ActionsButtonXpath()
    {
        return "//div[@class='column actions shadow']/div[@class='cell alt']";
    }
    
    public static String RemoveButtonXpath()
    {
        return "//a[@row-index='0']/span[text()='Remove']";
    }
    public static String RemoveButtonByXpath()
    {
        return "//ul[contains(@style,'display: block;')]//a[@event='Remove']";
    }
    
    public static String ColumnChooserXpath()
    {
        return "//i[@class='icon-choose-columns']/..";
    }
    
    public static String ColumnChooserRecipientsXpath()
    {
        //return "//a[@column-field='recipientsSummary']/span[text()='Recipients']";
        return "//ul[@class='dropdown-menu grid-column-chooser'][contains(@style,'block')]//span[text()='Recipients']/..";
    }
    
    public static String DriverCheckedXpath()
    {
        return "//span[text()='Drivers']/../i[@class='icon icon-ok pull-left']";
    }
    
    public static String DriverColumnXpath()
    {
        return "//span[text()='Drivers']/../../a";
    }
    
    
    
}
