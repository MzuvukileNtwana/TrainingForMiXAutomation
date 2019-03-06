/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects.Monitor.HoursOfService.HosNotification;

/**
 *
 * @author lmgulwa
 */
public class HOSNotificationGeneralPageObject {
    
    public static String btnActionsXpath()
    {
        return "//a[@class=\"row-action\"]";
    }
    
    public static String editLinkXpath()
    {
        return "//ul[contains(@style,'block')]//span[text()='Edit']/..";
    }
    
    public static String editNotificationPageHeaderXpath()
    {
        return "//h5/span[contains(text(),'Edit notification')]";
    }
    
    public static String notificationNameXpath()
    {
        return "//div[@class=\"page-header\"]/h5/span[not(contains(text(),'Edit notification'))]";
    }
    
    public static String notificationLandingPageSpinnerXpath()
    {
        return "//div[@name=\"hosNotificationsGrid\"]/div[contains(@class, 'loading-overlay')][contains(@style, 'none')]";
    }
    
    public static String tabPageSpinnerXpath(String tabHeader)
    {
        switch (tabHeader) 
        {
            case "Violations":
                return "//h5/span[text()='" + tabHeader + "']/../../../../div[contains(@class,'loading-overlay')][contains(@style,'none')]";
            case "Escalation 1":
                return "//legend[text()='" + tabHeader + "']/../../../../../div[contains(@class,'loading-overlay')][contains(@style,'none')]";
        }
        
        return "//h5[text()='" + tabHeader + "']/../../../div[contains(@class,'loading-overlay')][contains(@style,'none')]";
    }
    
    public static String tabOptionXpath(String tab)
    {
        return "//div[contains(@class,'tabbable')]//a[text()='" + tab + "']";
    }
    
    public static String btnSaveXpath()
    {
        return "//button[text()='Save']";
    }
    
    public static String btnAddHOSNotificationXpath()
    {
        return "//button[@fleet-tooltip=\"Add HOS notification\"]";
    }
    
    public static String HOSNotificationNameFieldXpath()
    {
        return "//input[@name=\"notificationName\"]";
    }
    
    public static String btnNextXpath()
    {
        return "//button[text()='Next']";
    }
    
    public static String groupLevelTreeXpath(String org)
    {
        return "//ul[@items=\"$controller.driverGroupTree\"]//span[text()='" + org + "']";
    }
    
    public static String violationsCheckboxXpath()
    {
        return "//form[@name=\"notificationViolationsForm\"]//tbody//td[@class='selection']";
    }
    
    public static String escalationsXpath(int i)
    {
        return "//tr[" + i + "]/td/div/span/input";
    }
    
    public static String btnEmailRecipientXpath()
    {
        return "//button[@ng-click=\"$controller.selectEmailRecipients(escalation.escalationLevel)\"]";
    }
    
    public static String modalScreenHeaderXpath(String header)
    {
        return "//div[contains(@style,'display: block;')]//h5/span[text()='" + header + "']";
    }
    
    public static String filterBoxXpath()
    {
        return "//input[@placeholder=\"Filter\"]";
    }
    
    public static String hosFilterBoxXpath()
    {
        return "//div[contains(@class,'text-filter')]/input[@ng-model=\"$directive.filterText\"]";
    }
    
    public static String emailHeaderCheckboxXpath()
    {
        return "//div[@name=\"emailRecipientsModal\"][contains(@style,'display: block')]//tr/th/input";
    }
    
    public static String existingContactsCheckboxXpath(int i)
    {
        return "//tr[" + i + "]/td[@ng-show=\"allowRowSelection\"]";
    }
    
    public static String btnEmailModalSelectXpath()
    {
        return "//div[@name=\"emailRecipientsModal\"][contains(@style,'display: block')]//button[text()='Select']";
    }
}
