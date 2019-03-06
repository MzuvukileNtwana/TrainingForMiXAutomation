/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects;

/**
 *
 * @author lmgulwa
 */
public class EditNotificationPageObject {
    
    public static String editButtonXpath()
    {
        return "//span[text()='Edit']/..";
    }
    
    public static String SecurityGroupSaveWait()
    {
        return "//div[@class=\"notification-wrapper notification-modal ng-scope\"][@style=\"display: block;\"]";
    }
    
    public static String actionsButtonXpath()
    {
        return "//a[@class='btn-actions']";
    }
    
    public static String notificationNameTextBoxXpath()
    {
        return "//span[text()='Name']/../..//input";
    }
    
    public static String detailsFocusedXpath()
    {
        return "//a[text()='Details']/../../li[contains(@class, 'active')]";
    }    
    
    public static String saveButtonBoxXpath()
    {
        return "//button[text()='Save']";
    }
    
    public static String tabsXpath(String tab)
    {
        return "//li[@ng-class='tabClass(tab)']//a[text()='" + tab + "']";
    }
    
    public static String successfulXpath()
    {
        return "//div[contains(@class,'notification')]/span[text()='Notification updated successfully']";
    }
    
    public static String notificationCreatedSuccessfullyXpath()
    {
        return "//span[text()='Notification created successfully']";
    }
    
    //  <editor-fold defaultstate="collapsed" desc="Assets">
    
    public static String expandGropusXpath()
    {
        return "//ul[@items='assetGroups']//span[@ng-click='item.expanded = true']";
    }
    
    // </editor-fold>
    
    //  <editor-fold defaultstate="collapsed" desc="Drivers">
    
    public static String relevantDriverXpath()
    {
        return "//span[text()='DVT-Test20151110090436']/../../a[@class='tree-item']";
    }
    
    public static String relevantSelectedDriverXpath()
    {
        return "//span[text()='DVT-Test20151110090436']/../../a[@class='tree-item selected']";
    }
    
    // </editor-fold>
    
    //  <editor-fold defaultstate="collapsed" desc="Events">
       
    public static String filterTextBoxXpath()
    {
        return "//input[@placeholder='Filter']";
    }
    public static String hosNotificationFilterTextBoxXpath()
    {
        return "//div[contains(@class,'text-filter')]/input";
    }
    public static String rolesSpinnerXpath()
    {
        return "//div[@class='row-fluid container-fixed-right']/div[@class='loading-overlay ng-scope'][@style='display: none;']";
    }
    public static String filteredEventCheckBoxBoxXpath()
    {
        return "//tr[1]//input[@type='checkbox'][@ng-checked='row.$selected']";
    }
    
    // </editor-fold>
    
    //  <editor-fold defaultstate="collapsed" desc="Reipients">
       
    public static String selectRecipientFromContactListEmailXpath()
    {
        return "//a[@ng-click=\"addEmailContact()\"]";
    }
    
    public static String selectRecipientEmailButtonXpath()
    {
        return "//a[@ng-click=\"selectEmailRecipients()\"]";
    }
    
    public static String selectRecipientFromContactLisSMSXpath()
    {
        return "//a[@ng-click=\"addSMSContact()\"]";
    }
    
    public static String selectRecipientSMSButtonXpath()
    {
        return "//a[@ng-click=\"selectSmsRecipients()\"]";
    }
    
    public static String contactFieldsTextBoxXpath(String text)
    {
        return "//span[text()='" + text + "']/../../input";
    }
        
    public static String submitButtonXpath()
    {
        return "//button[text()='Submit']";
    }
    
    public static String cancelButtonXpath()
    {
        return "//button[text()='Select']/../button[text()='Cancel']";
    }
    
    public static String selectButtonXpath()
    {
        return "//button[text()='Select']";
    }
    
    // </editor-fold>
    
    //  <editor-fold defaultstate="collapsed" desc="Message">
       
    public static String notificationMessageXpath()
    {
        return "//label[text()='Notification message']/../textarea";
    }
    
    public static String insertTokenButtonXpath()
    {
        return "//a[text()='Insert token']";
    }
    
    public static String eventDescriptionXpath()
    {
        return "//a[text()='Event description']";
    }
    
    // </editor-fold>
    
    //  <editor-fold defaultstate="collapsed" desc="Add Notification">
       
     public static String addNotificationSpinnerXpath()
    {
        return "//div[@class='fa-detail-right right-wide well fa-detail-right-toggle']/div[@class='loading-overlay ng-scope'][@style='display: none;']";
    }
    public static String addNotificationButtonXpath()
    {
        return "//a[@fleet-tooltip='Add notification']";
    }
    
    public static String nextButtonXpath()
    {
        return "//button[text()='Next']";
    }
    
    public static String individualXpath()
    {
        return "//span[text()='Individual']/..";
    }
    
    //Deceptive page header
    public static String pageHeaderXpath()
    {
        return "//span[text()='Event Notification']";
    }
    
    public static String spinnerXpath(String name)
    {
        switch (name)
        {
            case "Events":
                return "//h5/span[text()='Events']/../../..//div[contains(@class, 'fleet-grid full-height selection')]/div[contains(@class, 'loading-overlay')][@style='display: none;']";
                
            case "Notification message":
                return "//h5[text()='Notification message']/../../..//div[contains(@class, 'loading-overlay')][@style='display: none;']";
        }
        
        return "//h5[text()='" + name + "']/..//div[contains(@class, 'loading-overlay')][@style='display: none;']";        
    }
    
    public static String dvtAutomationAssetXpath()
    {
        return "//input[@type='checkbox']/../span";
    }
    
    public static String selectEventsCheckboxXpath()
    {
        return "//th[@class='selection']/input";
    }
    
    // </editor-fold>
    
    //  <editor-fold defaultstate="collapsed" desc="RemoveItem">
    
    public static String removeLinkXpath()
    {
        return "//span[text()='Remove']/..";
    }
    
    public static String removeButtonXpath()
    {
        return "//button[text()='Remove']";
    }
    public static String RoleremoveButtonXpath()
    {
        return "//div[@class='modal hide fade ng-scope modal-mini in']//button[text()='Remove']";
    }
    public static String RoleCancelButtonXpath()
    {
        return "//div[@class='modal hide fade ng-scope modal-mini in']//button[text()='Cancel']";
    }
    public static String RoleInUseXpath()
    {
        return "//div[@class='modal hide fade ng-scope modal-mini in']//span[text()='Role in use']";
    }
    public static String removeItemSpinnerXpath()
    {
        return "//div[@fleet-loader='content']/div[contains(@class, 'loading-overlay')][@style='display: none;']";
    }
     public static String removeNotificationSpinnerXpath()
    {
        return "//div[@class='fleet-grid full-height has-row-actions']/div[@class='loading-overlay ng-scope'][@style='display: none;']";
    }
    public static String actionsButtonRemoveItemXpath()
    {
        return "//div[@column='rowActions'][not(@style='display: none;')]//a[@class='btn-actions']";
    }
    public static String actionsButtonRemoveItemXpath(int number)
    {
        return "//li["+number+"]//div[@column='rowActions'][not(@style='display: none;')]//a[@class='btn-actions']";
    }
    public static String removeButtonRemoveItemXpath()
    {
        return "//ul[contains(@style, 'display: block;')]//span[text()='Remove']/..";
    }
    
    // </editor-fold>
    
}
