/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects.Monitor.HoursOfService.LogViewer;

import KeywordDrivenTestFramework.Core.BaseClass;

/**
 *
 * @author smbiko
 */
public class AddUpdateSaveAsLocationPageObjects extends BaseClass
{
    public static String editDriverStatusModalNEXTButtonXpath()
    {
        return "//button[text()='Next']";
    }
    public static String editDriverStatusModalStep2Xpath()
    {
        return "//div[@class='modal hide fade modal-medium in']//div[@class='modal-body']";
    }
    public static String changeLocationXpath()
    {
        return "//a[text()='Change location']";
    }
    public static String retrieveCurrentLocationAddressXpath()
    {
        return "//a[text()='Change location']/../span[text()]";
    }
    public static String locationRadioButtonXpath()
    {
        return "//span[text()='A location']/../input";
    }
    public static String saveAsLocationTextAreaXpath()
    {
        return "//input[@placeholder='Enter address']";
    }
    public static String saveAsLocationCheckboxXpath()
    {
        return "//span[text()='Save as a location']/../input";
    }
    public static String clickSearchedLocationXpath()
    {
        return "//a[@tabindex='-1']";
    }
    public static String addressRadioButtonXpath()
    {
        return "//span[text()='An address']/../input";
    }
    public static String saveButtonEditDriverStatusModalXpath()
    {
        return "//button[text()='Save']";
    }
    public static String confirmChangesModalXpath()
    {
        return "//div[@class='modal hide fade modal-mini in'][@aria-hidden='false']";
    }
    public static String dataSavedSuccessfullyMsgModalXpath()
    {
        return "//div[@class='notification notification-placement notification-success']/span[@id='pop-alert-message'][text()]";
    }
    public static String locationNameConfirmModalXpath()
    {
        return "//div[@class='modal hide fade modal-mini in']/div[@class='modal-body']/div/div/div/table/tbody/tr[7]/td[@ng-show='driverStatus.location']";
    }
    public static String logoutIconXpath()
    {
        return "//i[@class='icon-main-logout']";
    }
    
    public static String GridStatusCellXpath(int row)
    {
        return "//li/strong[text()='Status']//..//..//..//..//../div[@id='hosGrid']/div//tr[@class='light-blue']/../../tbody/tr[\"+row+\"]/td[@column-field='location.description']";
    }
    
    public static String Day()
    {
        return "//div[@class='current-days']/div[text()='12']";
    }
    public static String HOSLogViewer()
    {
        return "//h5/span[text()='HOS Log Viewer']";
    }
    public static String filterLocationXpath()
    {
        return "//input[@placeholder='Filter']";
    }
    public static String newUserLocationXpath()
    {
        return "//div[@class='fleet-grid-container strong-grid']//table/tbody/tr/td/div/a/span";
    }
    public static String newUserHOSIDXpath()
    {
        return "//div[@class='fleet-grid-container strong-grid']//table/tbody/tr/td[@column-field='hOSLocationId']/div/span";
    }
    public static String ColumnRowOneTextByXpath(String ColumnName)
    {
        return "//div[@class='column']//span[text()='"+ColumnName+"']/../../div[@row=0]";
    }
    public static String ColumnChooserXpath()
    {
        return "//a[@class='btn btn-small column-chooser']/i";
    }
    public static String chooseHOSIDColumnXpath()
    {
        return "//ul//span[text()='HOS location ID']";
    }
    public static String HOSlocationIDXpath()
    {
        return "//input[@name='hosLocationId']";
    }
      public static String HOSlocationIDDetailsXpath()
    {
        return "//input[@name='hosLocationId']/..";
    }
      public static String columnNameXpath(String ColumnName)
    {
        return "//ul[contains(@style,'display: block;')]//span[text()='"+ColumnName+"']/../span[@ng-hide='column.visible']/../..//a";
    }
    public static String noItemsDisplayXpath()
    {
        return "//div[@ng-show='currentpane.selected'][not (contains(@style,'display: none;'))]/div[@id='hosGrid']/div/div/div[@ng-hide]/span[text()='No items to display']/..";
    }
    public static String addStatusEventButtonXpath()
    {
        return "//div[@ng-show='currentpane.selected'][not (contains(@style,'display: none;'))]/div[@id='hosGrid']/div/../../div/div/div/a/i[@class='icon-plus icon-white']";
    }
    public static String addDriverStatusModalXpath()
    {
        return "//div[@header-title='Add driver status']";
    }
    public static String editDriverStatusRemarksXpath()
    {
        return "//textarea[@ng-model='data.remarks']";
    }
    public static String editStatusEventXpath()
    {
        return "//select[@name='workState']";
    }
    public static String editStatusEventOptionXpath()
    {
        return "//select[@name='workState']/option[@value='1']";
    }
    public static String backToLocationListXpath()
    {
        return "//span[text()='Back to location list']";
    }
    public static String locationListActionsButtonXpath()
    {
        return "//a[@fleet-tooltip='Actions']";
    }
    
    public static String removeLocationButtonXpath()
    {
        return "//div[@class='modal hide fade ng-scope modal-mini in']//button[text()='Remove']";
    }
    
    public static String removeLocationModalXpath()
    {
        return "//div[@class='modal hide fade ng-scope modal-mini in']";
    }
    public static String removeStatusModalRemoveButtonXpath()
    {
        return "//div[@class='modal hide fade modal-mini in']//button[text()='Remove']";
    }
    public static String removeStatusModalXpath()
    {
        return "//div[@class='modal hide fade modal-mini in']";
    }
    public static String removeReasonStatusModalTextAreaXpath()
    {
        return "//textarea[@ng-model='data.removeReason']";
    }
    
      
      
}
