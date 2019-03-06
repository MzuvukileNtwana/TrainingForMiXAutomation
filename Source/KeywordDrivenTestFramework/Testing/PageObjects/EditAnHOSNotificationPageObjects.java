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
public class EditAnHOSNotificationPageObjects 
{
    public static String addNotificationButtonXpath()
    {
        return "//button[@fleet-tooltip='Add HOS notification']";
    }
    public static String nameFieldXpath()
    {
        return "//input[@name='notificationName']";
    }
    public static String notificationFilterXpath()
    {
        return "//div[@class='text-filter empty']/input";
    }
    public static String nextButtonXpath()
    {
        return "//button[@text='Next']";
    }
    public static String treeItemXpath()
    {
        return "//a[@class='tree-item']";
    }
    public static String validationTypeXpath()
    {
        return "//tr[1]/td[@class='selection']/input";
    }
    public static String escalationFieldXpath()
    {
        return "//tr[1]/td[3]//input";
    }
    public static String selectRecipientsButtonXpath()
    {
        return "//h5[text()='Email notifications']/../button";
    }
    public static String FirstContactXpath()
    {
        return "//table[@class='table table-scroll table-condensed table-list no-text-clip']/tbody/tr[1]/td[1]/input[1]";
    }
    public static String filterXpath()
    {
        return "//input[@placeholder='Filter']";
    }
    public static String contactsCheckboxXpath()
    {
        return "//td/input[@type='checkbox']";
    }
    public static String selectContactButtonXpath()
    {
        return "//button[@text='Select']";
    }
    public static String saveNotificationButtonXpath()
    {
        return "//button[@text='Save']";
    }
    public static String spinnerXpath()
    {
        return "//div[@class='paged-grid']/div[@class='loading-overlay'][@style='display: none;']";
    }
    public static String notificationSearchFieldXpath()
    {
        return "//div[@class='text-filter empty']/input";
    }
    public static String searchButtonXpath()
    {
        return "//div[@class='text-filter']//i[@class='icon-search']/..";
    }
    public static String actionsButtonXpath()
    {
        return "//a[@class='row-action']";
    }
    public static String editXpath()
    {
        return "//ul[contains(@style,'display: block;')]//a[@event='Edit']";
    }
     public static String removeXpath()
    {
        return "//ul[contains(@style,'display: block;')]//a[@event='Remove']";
    }
    public static String editNotificationHeaderXpath()
    {
        return "//span[text()='Edit notification: ']";
    }
    public static String activeDetailsXpath()
    {
        return "//a[text()='Details']/../../li[@class='ng-scope active']";
    }
    public static String notificationNameXpath()
    {
        return "//h5/span[2]";
    }
    public static String tabXpath(int tab)
    {
        return "//ul[@class='nav nav-tabs span12 full-height']/li["+tab+"]";
    }
    public static String tabsXpath()
    {
        return "//ul[@class='nav nav-tabs span12 full-height']/li";
    }
    public static String disabledSaveButtonXpath()
    {
        return "//button[@text='Save'][@disabled='disabled']";
    }
    public static String popUpAlertXpath()
    {
        return "//span[text()='Notification updated successfully']";
    }
    public static String mixLogoXpath()
    {
        return "//a[@href=\"#/home\"]/img/..";
    }
    public static String editedNotificationXpath(String notification)
    {
        return "//a[text()='"+notification+"']";
    }
    public static String removeNotificationModalHeaderXpath()
    {
        return "//span[text()='Remove HOS notification']";
    }
    public static String yesButtonXpath()
    {
        return "//button[@text='Yes']";
    }
    public static String HOSNotificationsPageHeaderXpath()
    {
        return "//strong[text()='HOS notifications']";
    }
    
    public static String SpinnerEditNotificationOneXpath()
    {
        return "//div[@class='fa-detail-right right-wide well fa-detail-right-toggle']/div/div[@class='loading-overlay ng-scope'][@style='display: none;']";
    }
    
    public static String SpinnerEditNotificationTwonXpath()
    {
        return "//div[@class='fa-detail-right right-wide well fa-detail-right-toggle']/div/div/../../div[@class='loading-overlay ng-scope'][@style='display: none;']";
    }
}
