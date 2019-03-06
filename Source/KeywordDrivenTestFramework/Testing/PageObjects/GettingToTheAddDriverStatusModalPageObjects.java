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
public class GettingToTheAddDriverStatusModalPageObjects 
{
    public static String violationsTabXpath()
    {
        return "//a[text()='Violations']";
    }
    public static String canvasContainerXpath()
    {
        return "//div[@class='hos-series canvas-container draggable']";
    }
    public static String menuPopUpXpath()
    {
        return "//ul[@id='menuPopup']";
    }
    public static String addStatusOptionXpath()
    {
        return "//ul[@id='menuPopup']/li//span[text()='Add status']";
    }
    public static String addLogDataOptionXpath()
    {
        return "//ul[@id='menuPopup']/li//span[text()='Add log data']";
    }
    public static String driverStatusModalXpath()
    {
        return "//div[@id='driverStatusModal' and contains(@style,'display: block;')]";
    }
    public static String closeButtonXpath()
    {
        return "//div[@id='driverStatusModal']//button[@class='close']";
    }
    public static String logViewerButtonXpath()
    {
        return "//a[@fleet-tooltip='Driver log view']";
    }
    public static String activeStatusTabXpath()
    {
       return "//li[@class='ng-scope active']/a[text()='Status']"; 
    }
    public static String statusTabXpath()
    {
        return "//a[text()='Status']";
    }
    public static String addStatusButtonXpath()
    {
       // return "//a[@fleet-tooltip='Add status event']";
        return "//div[@class='tab-pane'][not(@style='display: none;')]//a[@id='hosTabPaneAdd']/i";
    }
    public static String addLogDataModalXpath()
    {
        return "//div[@id='logData' and contains(@style,'display: block;')]";
    }
    public static String driverNameFieldXpath()
    {
        return "//form[@name='logDataCrudForm']//input[@name='driverName']";
    }
    public static String disabledNameFieldXpath()
    {
        return "//form[@name='logDataCrudForm']//input[@name='driverName'][@disabled='disabled']";
    }
    public static String changeDriverLinkXpath()
    {
        return "//form[@name='logDataCrudForm']//input[@name='driverName']/../a[text()='Change driver']";
    }
    public static String enabledNameFieldXpath()
    {
        return "//form[@name='logDataCrudForm']//input[@name='driverName'][@style='display: none;']";
    }
    public static String diferentDriverXpath(String driver)
    {
        return "//a/strong[text()='"+driver+"']";
    }
    public static String nameFieldXpath()
    {
        return "//div[@class='logDataDriverAutoComplete']/input";
    }
    public static String categoryDropdownXpath()
    {
        return "//select[@name='eventDataCategory']";
    }
     public static String categoryDropdownOptionsXpath(int option)
    {
        return "//select[@name='eventDataCategory']/option["+option+"]";
    }
    public static String categoryDropdownOptionsXpath()
    {
        return "//select[@name='eventDataCategory']/option";
    }
      public static String eventTypeDropdownXpath()
    {
        return "//select[@name='eventType']";
    }
    public static String eventTypeDropdownOptionsXpath()
    {
        return "//select[@name='eventType']/option";
    }
     public static String eventTypeDropdownOptionsXpath(int option)
    {
        return "//select[@name='eventType']/option["+option+"]";
    }
    public static String dateTimeFieldOnAddLogDataModalXpath()
    {
        return "//div[@id='logDataStart']//input";
    }
    public static String dateTimeFieldOnTimelineLandingPageXpath()
    {
        return "//strong[text()='Co-Drivers:']/../../../../../../../../..//input";
    }
    public static String startDateAndTimeLabelXpath()
    {
        return "//div[@id='logDataStart']/label";
    }
    public static String iconCalendarButtonXpath()
    {
        return "//div[@id='logDataStart']//span[@class='add-on btn']";
    }
    public static String monthOnTopOnDatePickerXpath()
    {
        return "//div[@class='datepicker-widget in']//div[@class='month-of-year ng-binding']";
    }
    public static String selectedDayXpath()
    {
        return "//div[@class='datepicker-widget in']//div[@class='day ng-scope ng-binding selected']";
    }
    public static String monthListXpath()
    {
        return "//div[@class='datepicker-widget in']//div[@class='month-selector zoomable']//div[@class='month ng-scope ng-binding']";
    }
    public static String monthToSelectXpath(int idx)
    {
        return "//div[@class='datepicker-widget in']//div[@class='month-selector zoomable']//div[@class='month ng-scope ng-binding']["+idx+"]";
    }
    public static String dateTimePickerXpath()
    {
        return "//div[@class='datepicker-widget in']";
    }
    public static String disabledDatesXpath()
    {
        return "//div[@class='datepicker-widget in']//div[@class='day ng-scope ng-binding disabled']";
    }
     public static String previousDayXpath(int day)
    {
        return "//div[@ng-repeat='day in directive.daysInMonth']["+day+"]";
    }
     public static String doneButtonXpath()
    {
        return "//div[@class='datepicker-widget in']//a[text()='Done']";
    }
     public static String cancelButtonXpath()
     {
         return "//button[@text='Cancel']";
     }
     public static String pageHeaderXpath()
     {
         return "//h5/span[text()='HOS timeline']";
     }
     public static String remarksTextAreaXpath()
     {
         return "//form[@name='logDataCrudForm']//textArea[@name='remarks']";
     }
     public static String inspectionsTabXpath()
     {
         return "//li/a[text()='Inspections']";
     }
     public static String remarkXpath(String remark)
     {
         return "//td//span[text()='"+remark+"']";
     }
      public static String HOSLogViewerTableSpinnerXpath()
    {
        return "//div[@ng-repeat='tabpane in tabPanes'][1]/div[@ng-show='currentpane.selected'][1]/div[@id='hosGrid']/div[1]/div[@columns='currentpane.hosGridColumns'][1]//div[@class='fleet-grid full-height has-row-actions'][1]/div[@class='loading-overlay ng-scope'][@style='display: none;'][1]";
    }
     public static String driverLogViewButtonTooltipXpath()
     {
         return "//span[text()='Driver log view']";
     }
     public static String logViewerPageHeaderXpath()
     {
         return "//h5/span[text()='HOS Log Viewer']";
     }
     public static String timelineButtonXpath()
     {
         return "//a[@fleet-tooltip='HOS timeline']";
     }
}
