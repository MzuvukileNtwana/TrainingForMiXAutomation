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
public class AddHOSNotificationGroupLevelPageObject {
    
    public static String dynamicFilterSearchXpath()
    {
        return "//div[contains(@class,'text-filter')]/input";
    }
    
    public static String columnChooserXpath()
    {
        return "//i[@class=\"icon-choose-columns\"]/..";
    }
    
    public static String btnAddXpath()
    {
        return "//i[contains(@class,'icon-plus')]/..";
    }
    
    public static String btnActionsXpath()
    {
        return "//div/a[@class=\"row-action\"]";
    }
    
    public static String btnNextXpath()
    {
        return "//button[text()='Next']";
    }
    
    public static String driversTabXpath()
    {
        return "//a[@ng-click=\"$controller.changeTab(tab)\"][text()='Drivers']";
    }
    
    public static String addNotificationPageHeaderXpath(String name)
    {
        return "//div[@class=\"page-header\"]//span[text()='" + name + "']";
    }
    
    public static String redAsterikXpath(String labelName)
    {
        return "//span[text()='" + labelName + "']/../span[text()='*']";
    }
    
    public static String activeTabXpath(String tab)
    {
        //A selected tab's class attribute contains 'active'
        return "//a[text()='" + tab + "']/../../li[contains(@class,'active')]";
    }
    
    public static String tabsXpath(String tab)
    {
        return "//a[text()='" + tab + "'][@ng-click=\"$controller.changeTab(tab)\"]";
    }
    
    public static String tabsPageHeaderXpath(String header)
    {
        return "//h5[text()='" + header + "']";
    }
    
    public static String txtNotificatioNameXpath()
    {
        return "//label/span[text()='Name']/../../input";
    }
    
    public static String groIndRadioButtonXpath(String text)//groups //individual
    {
        return "//input[@value='"+text+"']";
    }
    public static String groupRadioButtonXpath()//groups //individual
    {
        return "//input[@value='groups']";
    }
    
    public static String DriversCount()
    {
        return "//span[text()='Default Site']/../../../div[@class=\"tree-sub-items ng-scope\"]//div[@class=\"tree-item-content\"]";
    }
    
    public static String btnExpandXpath()
    {
        return "//div[@class=\"tab-content\"]/div[contains(@ng-show, \"'groups'\")]//li/span";
    }
    
    public static String btnExpandIndividualXpath()
    {
        return "//div[@class='tab-content']/div[contains(@ng-show, 'individual')]//li//span[@class='daredevel-tree-anchor ui-icon icon-plus ng-scope']";
    }
    public static String btnSiteExpandXpath(String text)//Default Site
    {
        return "//div[@class='tab-content']/div[contains(@ng-show, 'individual')]//li//div//span[contains(text(),'"+text+"')]//..//..//..//span[@class='daredevel-tree-anchor ui-icon icon-plus ng-scope']";
    }
    public static String siteCheckboxXpath(String text)//Default Site
    {
        return "//div[@class='checkbox ng-scope']//span[contains(text(),'"+text+"')]//..//input/..";
    }
    
    
    public static String orgLevelTreeNodeXpath()
    {
        return "//div[@class=\"tab-content\"]/div[contains(@ng-show, \"'groups'\")]//li/div[@class=\"tree-item-content\"]//a/span[@class='ng-binding']";
    }
    
    public static String siteUnderOrgXpath()
    {
        return "//ul[@selected-items=\"selectedItems\"]/li";
    }
    
    public static String siteUnderOrgXpath(int i)
    {
        return "//ul[@selected-items=\"selectedItems\"]/li[" + i + "]";
    }
    
    public static String selectedSiteUnderOrgXpath(int i)
    {
        return "//ul[@selected-items=\"selectedItems\"]/li[" + i + "]//a[contains(@class,'selected')]/../../../..";
    }
    
    public static String highlightedSiteXpath()
    {
        return "//ul[@selected-items=\"selectedItems\"]/li//a[contains(@class,'selected')]";
    }
    
    public static String topNodeOrgXpath()
    {
        return "//li[contains(@class,'first-item')]/div[@class=\"tree-item-content\"]/div/a[@class='tree-item']";
    }
    
    public static String highlightedTopNodeOrgXpath()
    {
        return "//li[contains(@class,'first-item')]/div[@class=\"tree-item-content\"]/div/a[contains(@class,'selected')]";
    }
    
    public static String counterIconXpath()
    {
        return "//a[@class='tree-item']/span[text()='DVT Automation']/../span[@ng-show=\"item[mapping.itemsProperty].any()\"]";
    }
    
    public static String violationsTableXpath()
    {
        return "//div/table";
    }
    
    public static String escalationsXpath()
    {
        return "//tr/td/div/span/input";
    }
    
    public static String escalationsXpath(int i)
    {
        return "//tr[" + i + "]/td/div/span/input";
    }
    
    public static String violationTypeXpath(int i)
    {
        return "//tr[" + i + "]/td/div/span[contains(@class,'text-overflow')]";
    }
    
    public static String violationTypeCheckBoxXpath()
    {
        return "//tr/td[@class='selection']/input";
    }
    
    public static String tabPageSpinnerXpath(String tab)
    {
        return "//h5[text()='" + tab + "']/../../../../div[contains(@class,'loading-overlay')][@style='display: none;']";
    }
    
    public static String recipientTabSpinnerXpath(String tab)
    {
        return "//legend[text()='" + tab + "']/../../../../div[contains(@class,'loading-overlay')][@style='display: none;']";
    }
    
    public static String violationTabSpinnerXpath(String tab)
    {
        return "//h5/span[text()='" + tab + "']/../../../../../div[contains(@class,'loading-overlay')][@style='display: none;']";
    }
    
    public static String recipientSectionsXpath(String section)
    {
        return "//h5[text()='" + section + "']";
    }
    
    public static String btnSaveXpath()
    {
        return "//button[text()='Save']";
    }
    
    public static String emailClickHereToAddXpath()
    {
        return "//a[@ng-click=\"addEmailContact(escalation.escalationLevel)\"]";
    }
    
    public static String smsClickHereToAddXpath()
    {
        return "//a[@ng-click=\"addSMSContact(escalation.escalationLevel)\"]";
    }
    
    public static String btnEmailRecipientXpath()
    {
        return "//button[@ng-click=\"$controller.selectEmailRecipients(escalation.escalationLevel)\"]";
    }
    
    public static String filterBoxXpath()
    {
        return "//input[@placeholder=\"Filter\"]";
    }
    
    public static String existingEmailContactsCheckboxXpath()
    {
        return "//div[@name=\"emailRecipientsModal\"][contains(@style,'display: block')]//tr/td[@ng-show=\"allowRowSelection\"]/input[@type='checkbox']";
    }
    
    public static String existingContactsCheckboxXpath(int i)
    {
        return "//tr[" + i + "]/td[@ng-show=\"allowRowSelection\"]";
    }
    
    public static String btnModalCancelXpath()
    {
        return "//div[contains(@style,'block')]/div[@class=\"modal-footer\"]/button[text()='Cancel']";
    }
    
    public static String modalScreenHeaderXpath(String header)
    {
        return "//div[contains(@style,'display: block;')]//h5/span[text()='" + header + "']";
    }
    
    public static String populateFieldsXpath(String labelName)
    {
        return "//span[text()='" + labelName + "']/../../input";
    }
    
    public static String btnSubmitXpath()
    {
        return "//button[text()='Submit']";
    }
    
    public static String newEmailRecipientXpath(String name)
    {
        return "//div[@items=\"emailRecipients\"]//div[contains(text(),'" + name + "')]";
    }
    
    public static String btnSMSSelectRecipientsXpath()
    {
        return "//button[@ng-click=\"$controller.selectSmsRecipients(escalation.escalationLevel)\"]";
    }
    
    public static String existingSMSContactsCheckboxXpath()
    {
        return "//div[@name=\"smsRecipientsModal\"][contains(@style,'display: block')]//tr/td[@ng-show=\"allowRowSelection\"]/input[@type='checkbox']";
    }
    public static String headerCheckboxXpath()
    {
        return "//div[@name=\"smsRecipientsModal\"][contains(@style,'display: block')]//tr/th/input";
    }
    
    public static String emailHeaderCheckboxXpath()
    {
        return "//div[@name=\"emailRecipientsModal\"][contains(@style,'display: block')]//tr/th/input";
    }
    
    public static String existingSMSContactsCheckboxXpath(int i)
    {
        return "//div[@name=\"smsRecipientsModal\"][contains(@style,'display: block')]//tr[" + i + "]/td[@ng-show=\"allowRowSelection\"]/input[@type='checkbox']";
    }
    
    public static String smsContactMobileNumberXpath(int i)
    {
        return "//tr[" + i + "]/td[@column-field=\"mobileNumber\"]//span";
    }
    
    public static String btnSMSModalSelectXpath()
    {
        return "//div[@name=\"smsRecipientsModal\"][contains(@style,'display: block')]//button[text()='Select']";
    }
    
    public static String btnEmailModalSelectXpath()
    {
        return "//div[@name=\"emailRecipientsModal\"][contains(@style,'display: block')]//button[text()='Select']";
    }
    
    public static String smsFirstNameXpath(int i)
    {
        return "//div[@name=\"smsRecipientsModal\"][contains(@style,'display: block')]//tr[" + i + "]/td[@column-field=\"firstName\"]//span";
    }
    
    public static String smsLastNameXpath(int i)
    {
        return "//div[@name=\"smsRecipientsModal\"][contains(@style,'display: block')]//tr[" + i + "]/td[@column-field=\"lastName\"]//span";
    }
    
    public static String newSMSRecipientXpath(String name)
    {
        return "//div[@items=\"smsRecipients\"]//div[contains(text(),'" + name + "')]";
    }
    
    public static String removeSMSRecipientXpath(String name)
    {
        return "//div[@items=\"smsRecipients\"]//div[contains(text(),'" + name + "')]//a";
    }
    
    public static String notificationSuccessXpath()
    {
        return "//div[contains(@class,'notification-wrapper')][contains(@style,'block')]//span[text()='Notification created successfully']";
    }
    public static String SuccessMessageXpath()
    {
        return "//span[text()='Notification created successfully']";
    }
    public static String SuccessMessageDisappearXpath()
    {
        return "//div[@class=\"notification-wrapper notification-modal ng-scope\"][@style=\"display: none;\"]";
    }
    
    public static String pageHeaderXpath(String header)
    {
        return "//h5/span[text()='" + header + "']";
    }
    
    public static String pageHeaderLinkXpath(String header)
    {
        return "//h5/a[text()='" + header + "']";
    }
    
    public static String notificationsPageSpinnerXpath()
    {
        return "//div[@id=\"MainView\"]/div[contains(@class,'loading-overlay')][contains(@style,'none')]";
    }
    
    public static String newlyAddedNotificationXpath(String notification)
    {
        return "//div[@class='columns ui-sortable']//div[@class='column']/div/a[text()='" + notification + "']";
    }
    
    public static String allNotificationsXpath()
    {
        return "//div[@class='columns ui-sortable']//div[@class='column']/div/a";
    }
    
    public static String notificationUpdatedSuccessfullyXpath()
    {
        return "//div[contains(@class,'notification-wrapper')][contains(@style,'block')]//span[text()='Notification updated successfully']";
    }
    
    public static String allNotificationsXpath(int i)
    {
        return "//div[@class='columns ui-sortable']//div[@class='column']/div[@row='" + i + "']/a";
    }
    
    public static String gridNotificationXpath(String notification)
    {
        return "//div[@class='columns ui-sortable']//div[@class='column']//a[text()='" + notification + "']";
    }
    
    public static String driverXpath(int i)
    {
        return "//div[@class='columns ui-sortable']//div[contains(@class,'column')]//span[text()='Drivers']/../../div[@row='" + i + "']";
    }
    
    public static String recipientsXpath(int i)
    {
        return "//div[@class='columns ui-sortable']//div[contains(@class,'column')]//span[text()='Recipients']/../../div[@row='" + i + "']";
    }
    
    public static String filterTextBoxXpath()
    {
        return "//div[contains(@class,\"text-filter\")]/input";
    }
    
    public static String actionsButtonRemoveItemXpath()
    {
        return "//div/a[@class=\"row-action\"]";
    }
    
    public static String removeButtonRemoveItemXpath()
    {
        return "//ul[contains(@style, 'display: block;')]//span[text()='Remove']/..";
    }
    
    public static String confirmRemoveButtonXpath()
    {
        return "//div[@name=\"removeHOSNotificationModal\"]//button[text()='Yes']";
    }
    
    public static String removeNotificationSpinnerXpath()
    {
        return "//div[@class='loading-overlay ng-scope'][@style='display: none;']";
    }
    
    public static String notificationGridSpinnerXpath()
    {
        return "//div[@class='paged-grid']/div[@class='loading-overlay'][@style='display: none;']";
    }
}
