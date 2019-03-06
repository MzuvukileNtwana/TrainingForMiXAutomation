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
public class EditingAnOdometerValuePageObjects extends BaseClass
{
    public static String logDataSpinnerXpath()
    {
        return "//div[@class='loading-overlay'][contains(@style,'display: none;')]";
    }
    public static String HOSLogViewerXpath()
    {
        return "//h5/span[text()='HOS Log Viewer']";
    }
    public static String columnNameXpath(String ColumnName)
    {
        return "//ul[contains(@style,'display: block;')]//span[text()='"+ColumnName+"']/../span[@ng-hide='column.visible']/../..//a";
    }
    public static String Day()
    {
        return "//div[@class='current-days']/div[text()='6']";
    }
    
    //day dynamic xpath
    public static String day(String day)
    {
        return "//div[@class='current-days']/div[text()='"+day+"']";
    }
    public static String greenONWorkstateXpath()
    {
        return "//span[text()='ON']/..";
    }
    public static String redOFFWorkstateXpath()
    {
        return "//span[text()='OFF']/..";
    }
    public static String editDriverStatusPopupXpath()
    {
        return "//ul[@id='menuPopup']";
    }
    public static String editStatusLinkXpath()
    {
        return "//a//span[text()='Edit status']";
    }
    public static String GridStatusColumnXpath()
    {
        return "//li/strong[text()='Status']//..//..//..//..//../div[@id='hosGrid']/div//tr[@class='light-blue']/../../tbody/tr/td[@column-field='remarks']";
    }
    public static String GridStatusCellXpath(int row)
    {
        return "//li/strong[text()='Status']//..//..//..//..//../div[@id='hosGrid']/div//tr[@class='light-blue']/../../tbody/tr["+row+"]/td[@column-field='remarks']";
    }
    public static String LogDataActionButtonXpath(int rowIndex)
    {
        return "//div[@ng-show='currentpane.selected'][@class='tab-pane']//div/ul/li/strong[text()='Status']/../../../../..//li[@ng-repeat]["+rowIndex+"]/div/div/a[@fleet-tooltip='Actions']";  
    }    
    
    public static String GridRowsXpath()
    {
        return "//li/strong[text()='Status']//..//..//..//..//../div[@id='hosGrid']/div//tr[@class='light-blue']/../../tbody/tr";
    }
    public static String actionsButtonXpath()
    {
        return "//strong[text()='Status']/../../../../..//a[@fleet-tooltip=\"Actions\"]";
    }
    public static String EditLinkXpath()
    {
       return "//ul[contains(@style,'display: block;')]/li//a/span[text()='Edit']";
    }
    public static String RemoveLinkXpath()
    {
       return "//ul[contains(@style,'display: block;')]/li//a/span[text()='Remove']";
    }
    public static String editDriverStatusModalXpath()
    {
        return "//div[@header-title='Edit driver status']";
    }
    public static String editDriverStatusModalNEXTButtonXpath()
    {
        return "//button[text()='Next']";
    }
    public static String addLogDataModalCancelButtonXpath()
    {
        return "//button[text()='Cancel']";
    }
    public static String editDriverStatusRemarksXpath()
    {
        return "//textarea[@ng-model='data.remarks']";
    }
    public static String editDriverStatusModalStep2Xpath()
    {
        return "//div[@class='modal hide fade modal-medium in']//div[@class='modal-body']";
    }
    public static String changeOdoLinkXpath()
    {
        return "//span/a[text()='Change odo']";
    }
    public static String backButtonEditDriverStatusModalXpath()
    {
        return "//button[text()='Back']";
    }
    public static String closeXEditDriverStatusModalXpath()
    {
        return "//div[@class='modal hide fade modal-medium in']//div[@class='modal-body']//button[@class='close']";
    }
    public static String odometerTextAreaXpath()
    {
        return "//div[@class='modal hide fade modal-medium in']//div[@class='modal-body']/div/div/div/form/table/tbody/tr[6]/td[2]/span/input";
    }
    public static String saveButtonEditDriverStatusModalXpath()
    {
        return "//button[text()='Save']";
    }
    public static String confirmChangesModalXpath()
    {
        return "//div[@class='modal hide fade modal-mini in']";
    }
    public static String confirmChangesModalHeaderXpath()
    {
        return "//span[text()='Confirm changes']";
    }
    public static String confirmButtonXpath()
    {
        return "//button[text()='Confirm']";
    }
    //ExtractDriverStatus information1
    public static String driverNameModal1Xpath()
    {
        return "//div[@class='modal hide fade modal-medium in']//div[@class='modal-body']/div/div/div/form/table/tbody/tr[1]/td[2]";
    }
    public static String statusModal1Xpath()
    {
        return "//div[@class='modal hide fade modal-medium in']//div[@class='modal-body']/div/div/div/form/table/tbody/tr[2]/td[2]";
    }
    public static String dateTimeModal1Xpath()
    {
        return "//div[@class='modal hide fade modal-medium in']//div[@class='modal-body']/div/div/div/form/table/tbody/tr[3]/td[2]";
    }
    public static String assetModal1Xpath()
    {
        return "//div[@class='modal hide fade modal-medium in']//div[@class='modal-body']/div/div/div/form/table/tbody/tr[4]/td[2]";
    }
    public static String remarksModal1Xpath()
    {
        return "//div[@class='modal hide fade modal-medium in']//div[@class='modal-body']/div/div/div/form/table/tbody/tr[5]/td[2]";
    }
    public static String originalOdoValueModal1Xpath()
    {
        return "//div[@class='modal hide fade modal-medium in']//div[@class='modal-body']/div/div/div/form/table/tbody/tr[6]/td[2]/span/span[1]";
    }
    
     //ExtractDriverStatus information2
    public static String driverNameModal2Xpath()
    {
        return "//div[@class='modal hide fade modal-mini in']/div[@class='modal-body']/div/div/div/table/tbody/tr[1]/td[@ng-show='driverStatus.driver && driverStatus.driver.name']";
    }
    public static String statusModal2Xpath()
    {
        return "//div[@class='modal hide fade modal-mini in']/div[@class='modal-body']/div/div/div/table/tbody/tr[3]/td/span";
    }
    public static String dateTimeModal2Xpath()
    {
        return "//div[@class='modal hide fade modal-mini in']/div[@class='modal-body']/div/div/div/table/tbody/tr[5]/td[2]";
    }
    public static String assetModal2Xpath()
    {
        return "//div[@class='modal hide fade modal-mini in']/div[@class='modal-body']/div/div/div/table/tbody/tr[4]/td[2]";
    }
    public static String remarksModal2Xpath()
    {
        return "//div[@class='modal hide fade modal-mini in']/div[@class='modal-body']/div/div/div/table/tbody/tr[9]/td[1]";
    }
    public static String editedOdoValueModal2Xpath()
    {
        return "//div[@class='modal hide fade modal-mini in']/div[@class='modal-body']/div/div/div/table/tbody/tr[6]/td[2]";
    }  
    public static String confirmChangesMessageSuccessfulXpath()
    {
        return "//div[@class='notification notification-placement notification-success']/span[@id='pop-alert-message']";
    }  
    public static String validateNumericFieldXpath()
    {
        return "//span[text()='Field must be numeric']";
    }
    public static String saveButtonDisabledXpath()
    {
        return "//button[text()='Save'][@disabled='disabled']";
    }
    public static String SBstartODOXpath()
    {
        return "//div[@class='tooltip-inner']/div/div[@class='ng-scope']/div/div[@class='hos-tooltip ng-scope']/div[8]/strong[text()='Start ODO']/..";
    }
    
    public static String odoValueValidationXpath()
    {
        return "//div[@class='help-block no-margins ng-binding']";
    }
    
    public static String DateRetrieval()
    {
        return "//div[@class='pull-left datepicker ng-valid ng-valid-dmx-greater-than-or-equal-to ng-dirty']/input";
    }
    public static String CoDriverClick()
    {
        return "//strong[text()='Co-Drivers:']";
    }
    
    
    
    
    //div[@class='tab-content']/div/div[@class='tab-pane'][not(contains(@style,'display: none;'))]/div[@fleet-loader='content']/div/div/div/div/table/tbody/tr/td[2]/div/span[text()='Off duty']

}
