/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects;

import KeywordDrivenTestFramework.Core.BaseClass;
import java.util.List;

/**
 *
 * @author smbiko
 */
public class UsabilityOfUnassignedIMEIsPageObjects extends BaseClass
{
    public static String MenuXpath(String elementText) 
    {
        return "//ul/li[2]/a[contains(text(), '"+elementText+"')]";
    }
    public static String SubMenuXpath(String elementText) 
    {
        return "//a[text()='"+elementText+"']";
    }
    public static String DBadminXpath() 
    {
        return "//a[text()='Database administration']";
    }
    public static String DataCentreAdminXpath() 
    {
        return "//a[text()='Data centre administration']";
    }
    public static String OrganisationSettingXpath() 
    {
        return "//a[text()='Organisation settings']";
    }
    public static String SystemLogsXpath() 
    {
        return "//a[text()='System logs']";
    }
    public static String AggregatorXpath() 
    {
        return "//a[text()='Aggregator']";
    }
    public static String airtimeManagementXpath() 
    {
        return "//a[text()='Airtime management']";
    }
    public static String ValidateSpanTextXpath(String elementText) 
    {
        return "//span[text()='"+elementText+"']";
    }
    public static String ValidateFilterGridXpath() 
    {
        return "//div[@class='text-filter empty']";
    }
    public static String ValidateIMEIgridXpath() 
    {
        return "//div[@class='row-fluid container-fixed-right paged-grid-container']";
    }
    public static String actionsButtonAboveGridXpath() 
    {
        return "//a[@fleet-tooltip='Actions']";
    }
    public static String unassignedIMEIsButtonXpath() 
    {
        return "//a[@ng-click='$controller.showUnusedImeiListClicked()']//span[text()='Unassigned IMEIs']";
    }
    public static String waitForSpinnerXpath() 
    {
//        return "//div[@class='loading-overlay ng-scope'][@ng-show='$controller.isLoading']";
        return "//div[@class='loading-overlay'][@ng-show='$grid.isLoading']";
    }
    
    public static String unassignedIMEIsModalXpath() 
    {
        return "//div[@class='modal-body']//div[@class='white-box-padding fixed-full-height']/..";
    }
    public static String unassignedIMEIsFilterXpath() 
    {
        return "//input[@placeholder='Filter']";
    }
    public static String unassignedIMEIsModalColumnsXpath() 
    {
        return "//table/thead//tr[@class='light-blue']";
    }
    public static String modalSpinnerXpath() 
    {
        return "//div[@class='paged-grid'][@provider='$controller.dataProvider']";
    }

    public static String unassignedIMEIsIMEIColumnXpath() 
    {
        return "//table/thead//tr[@class='light-blue']/th[@column-field='imei']";
    }
    public static String unassignedIMEIsAirtimeStatusXpath() 
    {
        return "//table/thead//tr[@class='light-blue']/th[@column-field='currentAirtimeStatus']";
    }
    public static String unassignedIMEIsContractXpath() 
    {
        return "//table/thead//tr[@class='light-blue']/th[@column-field='contractName']";
    }
    public static String unassignedIMEIsLastAirtimeTimeXpath() 
    {
        return "//table/thead//tr[@class='light-blue']/th[@column-field='lastAirtimeStatusChangeTime']";
    }
    public static String unassignedIMEIsLastAirtimeUserXpath() 
    {
        return "//table/thead//tr[@class='light-blue']/th[@column-field='user']";
    }
    public static String unassignedIMEISortXpath() 
    {
        return "//table/thead//tr[@class='light-blue']/th[@column-field='imei']//span[contains(@ng-show,'column.sort == sortField && !sortDescending')]";
    }
    public static String getUserFromGridXpath() 
    {
        return "//table/tbody/tr[1]/td/div/span[text()='Test08 Test08']";
    }
    public static String xButtonXpath() 
    {
        //return "//div[@class='white-box-padding fixed-full-height']//button[text()='×']";
        return "//button[text() = 'Close']";
    }
    public static String ButtonXXpath() 
    {
        return "//div[@name='unassignedImeisListModal']//button[text()='×']";
    }
    public static String closeButtonXpath() 
    {
        return "//button[text()='Close']";
    }
    public static String IMEImodalColumn1Xpath() 
    {
        return "//table/tbody/tr[1]";
    }
    public static String IMEIColumn1DataXpath() 
    {
        return "//table/tbody/tr[1]/td[@column-field='imei']";
    }
    public static String airtimeStatusColumn1DataXpath() 
    {
        return "//table/tbody/tr[1]/td[@column-field='currentAirtimeStatus']";
    }
    public static String contractColumn1DataXpath() 
    {
        return "//table/tbody/tr[1]/td[@column-field='contractName']";
    }
    public static String lastAirtimeTimeColumn1DataXpath() 
    {
        return "//table/tbody/tr[1]/td[@column-field='lastAirtimeStatusChangeTime']";
    }
    public static String lastAirtimeUserColumn1DataXpath() 
    {
        return "//table/tbody/tr[1]/td[@column-field='user']";
    }

    public static String unassignedIMEIsModalColumnsXpath(List<String> modalColumns) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static String row1Xpath() 
    {
        return "//div[@class='fleet-grid full-height']/table/tbody/tr";
    }
   

    
}
