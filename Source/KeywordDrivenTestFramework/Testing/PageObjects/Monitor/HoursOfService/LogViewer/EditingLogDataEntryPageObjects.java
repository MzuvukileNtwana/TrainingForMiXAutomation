/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects.Monitor.HoursOfService.LogViewer;

import KeywordDrivenTestFramework.Core.BaseClass;
import static KeywordDrivenTestFramework.Core.BaseClass.browserType;
import KeywordDrivenTestFramework.Entities.Enums;

/**
 *
 * @author smbiko
 */
public class EditingLogDataEntryPageObjects extends BaseClass
{
    public static String inspectionsDataLinkXpath()
    {
        return "//li//a[text()='Inspections']";
    }
    public static String greenAddLogButtonXpath()
    {
        return "//div[@class='tab-pane'][not(contains(@style, 'none'))]/div/div/div/a[@fleet-tooltip='Add log data']";
    }
    public static String greenAddLogButtonIEXpath()
    {
        return "//div[@class='tab-content']//div[@class='tab-pane'][not(contains(@style, 'none'))]/div/div/div/a[@id='hosTabPaneAdd'][@fleet-tooltip='Add log data']/i";
    }
    public static String eventTypeInspectionsXpath()
    {
        return "//select[@name='eventType']";
    }
    public static String typeInspectionsOptionsXpath()
    {
        return "//select/option[@value='1']";
    }
    public static String dataRemarksXpath()
    {
        return "//textarea[@ng-model='logData.remarks']";
    }
    public static String saveButtonInspectionsRemarksXpath()
    {
        return "//button[text()='Save']";
    }
    public static String confirmInspectionEventDetailsModalXpath()
    {
        return "//div[@class='modal hide fade modal-mini in'][@id='logDataConfirm']";
    }
    public static String confirmInspectionEventDetailsButtonXpath()
    {
        return "//button[text()='Confirm']";
    }
    public static String editRemoveMenuXpath()
    {
        return "//ul[@class='dropdown-menu pull-right']";
    } 
     
    public static String logDataButtonActionEditXpath()
    {
        return "//ul[@class='dropdown-menu pull-right'][contains(@style,'display: block;')]/li/a/span[text()='Edit']";
    }
    public static String logDataButtonActionRemoveXpath()
    {
        return "//ul[@class='dropdown-menu pull-right'][contains(@style,'display: block;')]/li/a/span[text()='Remove']";
    }
    public static String editLogDataModalXpath()
    {
        return "//div[@header-title='Edit log data']";
    }
    public static String editLogDataModalHeaderXpath()
    {
        return "//span[text()='Edit log data']";
    }
    public static String editEventCategoryXpath()
    {
        return "//select[@name='eventDataCategory']";
    }
    
    public static String categoryInspections()
    {
        return "//select/option[@value='1']";
    }
    public static String typeInspections()
    {
        return "//select[@name='eventDataCategory']/option[@value='2']";
    }
    
    public static String editEventTypeXpath()
    {
        return "//select[@name='eventType']";
    }
    public static String eventRemarksXpath()
    {
        return "//textarea[@ng-model='logData.remarks']";
    }
    public static String dataSavedSuccessfullyMessageXpath()
    {
        return "//span[text()='Log data saved successfully']";
    }
    public static String inputDataLinkXpath()
    {
        return "//li//a[text()='Input data']";
    }
    public static String addedInputDataRemarksXpath()
    {
        return "//div[@ng-show='currentpane.selected'][@style='']//td[@column-field='remarks']/div/span";
    }
    public static String logDataButtonActionXpath()
    {
       return "//div[@ng-show='currentpane.selected'][@style='']//li[@ng-repeat]/div/div/a[@fleet-tooltip='Actions']";
    }
    
    public static String logDataButtonActionIEXpath()
    {
        return "//div[@ng-show='currentpane.selected'][@class='tab-pane']//div/ul/li/strong[text()='Inspections']/../../../../..//li[@ng-repeat]/div/div/a[@fleet-tooltip='Actions']";
    } 
 
    public static String LogDataButtonActionXpath()
    {
        String xpath;
            
        if(browserType==Enums.BrowserType.IE)
        {
            xpath = "//div[@ng-show='currentpane.selected'][@class='tab-pane']//div/ul/li/strong[text()='Input data']/../../../../..//li[@ng-repeat]/div/div/a[@fleet-tooltip='Actions']";
        }
        else
        {
            xpath = "//div[@ng-show='currentpane.selected'][@style='']//li[@ng-repeat]/div/div/a[@fleet-tooltip='Actions']";   
        }
            
        return xpath;
    }

    
    public static String RemarksLogDataColumnXpath(String remarksText)
    {
        String xpath;
            
        if(browserType==Enums.BrowserType.IE)
        {
            xpath = "//div[@ng-show='currentpane.selected']//td[@column-field='remarks']/div/span[text()='"+remarksText+"']";
        }
        else
        {
            return "//div[@ng-show='currentpane.selected'][@style='']//td[@column-field='remarks']/div/span[text()='"+remarksText+"']";
        }
            
        return xpath;
    }

    public static String eventTypeColumnXpath(String eventType)
    {
        String xpath;
            
        if(browserType==Enums.BrowserType.IE)
        {
            xpath = "//div[@ng-show='currentpane.selected']//td[@column-field='eventTypeDescription']/div/span[text()='"+eventType+"']";
        }
        else
        {
            return "//div[@ng-show='currentpane.selected'][@style='']//td[@column-field='eventTypeDescription']/div/span[text()='"+eventType+"']";
        }
            
        return xpath;
    }
    public static String remarksColumnCheckedXpath()
    {
        return "//ul[contains(@class,'dropdown-menu pull-right column-chooser-dropdown')][contains(@style,'display: block;')]/li/a/span[text()='Remarks']/..";
    }
    public static String columnChooserXpath()
    {
        return "//div[@ng-show='currentpane.selected'][@style='']//li[@ng-repeat]/div/div/a/../../../../li/a[@class='btn btn-small column-chooser']";
    }
    public static String columnChooserIEXpath()
    {
        return "//div[@class='tab-content']//div[@class='tab-pane'][not(contains(@style,'none'))]//li/a[@class='btn btn-small column-chooser']/i";
    }
    public static String columnChooserPopupXpath()
    {
        return "//ul[contains(@class,'dropdown-menu pull-right column-chooser-dropdown')][contains(@style,'display: block;')]";
    }
    public static String removeLogEntryButtonXpath()
    {
        return "//button[text()='Remove']";
    }
    public static String removeLogDataSuccessfullyMessageXpath()
    {
        return "//span[text()='Log Data successfully removed']";
    }
    public static String hosTabsXpath()
    {
        return "//div[@id='hosTabs']";
    }
    
}
