/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects.Monitor.HoursOfService.AddLogData;

/**
 *
 * @author smncwabe
 */
public class LogDataEntryConfirmationPageObject
{

    public static String SpinnerXpath()
    {
        return "//div[@class='loading-overlay'][@style='display: none;']";
    }

    public static String ValidateDateXpath()
    {
        return "//div[@aria-hidden='false']//div[@class='display']/div[@class='day-of-week ng-binding']/../../div[@class='display']";
    }

    public static String TimeRangeXpath()
    {
        return "//div[@class='btn-group ml-5 pull-left']";
    }

    public static String StartOfDay()
    {
        return "//a[@class='btn btn-small']/i[@class='icon-alarmclock']";
    }

    public static String SleeperXpath()
    {
        return "//span[@class='hos-workstate-label ng-scope']/span[text()='SB']";
    }

    public static String ButtonAddLogDataXpath()
    {
        return "//li/strong[text()='Input data']//..//..//..//..//../div[@id='hosGridHeader']/div//a/i[@class='icon-plus icon-white']";
    }

    public static String AddLogDataHeadingXpath()
    {
        return "//h5/span[text()='Add log data']";
    }

    public static String CategorytextBoxXpath()
    {
        return "//div//select[@name='eventDataCategory']";
    }

    public static String EventTypeTextBoxXpath()
    {
        return "//div//select[@name='eventType']";
    }

    public static String DateTimeFieldOnAddLogDataModalXpath()
    {
        return "//div[@id='logDataStart']//input";
    }

    public static String inputBadgeXpath()
    {
        return "//li/strong[text()='Input data']/../..//span[@class='badge badge-grey ng-binding']";
    }

    public static String DriverNameFieldOnAddLoDataModelXpath()
    {
        return "//form[@name='logDataCrudForm']/div//input[@name='driverName']";
    }

    public static String ButtonSaveXpath()
    {
        return "//div[@class='modal hide fade in']//button[text()='Save']";
    }

    public static String ConfirmeventDetailsHeadingXapth()
    {
        return "//h5/span[text()='Confirm event details']";
    }

    public static String ButtonConfirmXpath()
    {
        return "//div[@class='modal hide fade modal-mini in']//button[text()='Confirm']";
    }

    public static String ButtonCancelAddLogDataXpath()
    {
        return "//div[@class='modal hide fade in']//button[text()='Cancel']";
    }

    public static String ButtonCancelConfirmEventXpath()
    {
        return "//div[@class='modal hide fade modal-mini in']//button[text()='Cancel']";
    }

    public static String ConfirmEventDetailsInformXpath()
    {
        return "//div[@class='modal hide fade modal-mini in']//div[@class='well no-margin']/table/tbody/tr/td[@class='ng-binding']";
    }

    public static String RetrieveConfirmInformXpath()
    {
        return "//div[@class='modal hide fade modal-mini in']//div/table/tbody/tr";
    }

    public static String RemarksTextAreaXpath()
    {
        return "//form[@name='logDataCrudForm']//div/textarea[@name='remarks']";
    }

    public static String WorkstateCanvasXpath()
    {
        return "//div[@class='hos-series canvas-container draggable']/canvas[@class='timeline-canvas']";
    }

    public static String DataSavedSuccessfullyXpath()
    {
        return "//span[text()='Log data saved successfully']";
    }

    public static String MonitorXpath()
    {
        return "//*[@id=\"main-nav-toolbar\"]/ul/li[1]/a";
    }

    public static String LogViewerLinkXpath()
    {
        return "//ul/li/a[text()='Log viewer']";
    }

    public static String HOSLogViewerPageHeaderXpath()
    {
        return "//h5/span[text()='HOS Log Viewer']";
    }

    public static String InputdataLinkXapth()
    {
        return "//li/a[text()='Input data']";
    }

    //xpath for Input Data link for firefox
    public static String InputDataLinkFirefoxXpath()
    {
        return "//li[@ng-repeat='tabpane in tabPanes']//a[contains(text(),'Input data')]";
    }

    public static String CountInputDataXpath()
    {
        return "//li/strong[text()='Input data']/../../li/span";
    }

    public static String ColumnDateAndTimeXpath()
    {
        return "//li/strong[text()='Input data']//..//..//..//..//../div[@id='hosGrid']/div//tr[@class='light-blue']/th[@column-field='date']";
    }

    public static String ClickDateAndTimeInputDataXpath()
    {
        return "//li/strong[text()='Input data']//..//..//..//..//../div[@id='hosGrid']/div//tr[@class='light-blue']/th[@column-field='date']/span[text()='Date & time']";
    }

    public static String CaretUpAscXpath()
    {
        return "//li/strong[text()='Input data']//..//..//..//..//../div[@id='hosGrid']/div//tr[@class='light-blue']/th[@column-field='date']/span[@class='caret-up']";
    }

    public static String GridRemarksColumnXpath()
    {
        return "//li/strong[text()='Input data']//..//..//..//..//../div[@id='hosGrid']/div//tr[@class='light-blue']/../../tbody/tr/td[@column-field='remarks']";
    }

    public static String GridRowsXpath()
    {
        return "//li/strong[text()='Input data']//..//..//..//..//../div[@id='hosGrid']/div//tr[@class='light-blue']/../../tbody/tr";
    }

    public static String LogActionButtonXpath(int rowIndex)
    {
        return "//div[@ng-show='currentpane.selected'][@style='']//li[@ng-repeat][" + rowIndex + "]/div/div/a[@fleet-tooltip='Actions']";
    }

    public static String LogDataActionButtonXpath(int rowIndex)
    {
        return "//div[@ng-show='currentpane.selected'][@class='tab-pane']//div/ul/li/strong[text()='Input data']/../../../../..//li[@ng-repeat][" + rowIndex + "]/div/div/a[@fleet-tooltip='Actions']";
    }

    public static String CountElementXpath()
    {
        return "//tbody/tr/td[@column-field='date']/div/span";
    }

    public static String RemoveLinkXpath()
    {
        return "//ul[contains(@style,'display: block;')]/li//a/span[text()='Remove']";
    }

    public static String LogDataSuccessfullyRemovedXpath()
    {
        return "//span[text()='Log Data successfully removed']";
    }

    public static String SortDateAndTimeFirstElementOntheistXpath()
    {
        return "//li/strong[text()='Input data']//..//..//..//..//../div[@id='hosGrid']/div//tr[@class='light-blue']/../../tbody/tr/td[@column-field='date']/div/span";
    }

    public static String DateOnTheColumnXpath()
    {
        return "//li/strong[text()='Input data']//..//..//..//..//../div[@id='hosGrid']/div//tr[@class='light-blue']/../../tbody/tr/td[@column-field='remarks']/div/span[text()='Please be a good Driver']/../../../td[@column-field='date']/div/span";
    }
    //tr//th[@column-field='date']//span[text()='Date & time']
    //table[@class='table table-scroll table-condensed table-list no-text-clip']//tr[@class='light-blue']/th[@column-field='date']/span[2]

    //xpath to extract message pop-up text    
    public static String PopAlertMessage()
    {
        return "//span[@id='pop-alert-message']";
    }
}
