/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects;

/**
 *
 * @author szeuch
 */
public class AssetsListShowOnTripTimelinePageObject 
{
    public static String DatePickerXpath()
    {
       return "//div[@class='pull-left']/i[@class='icon-calendar']/..";
    }
    
    public static String DatePickerListViewXpath()
    {
       return"//a[@class='btn']/i[@class='icon-th-list']/..";    
    }
    
    public static String DatePickerDropDown()
    {
       return "//form[@name='dateRangeForm']/select";
    }
    
    public static String DatePickerDropDownValue()
    {
       return "//form[@name='dateRangeForm']/select/option[@value='3']";
    }
    
    public static String DatePickerSave()
    {
      return"//a[@ng-click='save()']/i";
    }
    
    public static String HistoricalTrackingSpanTextXpath()
    {
        return "//span[text()='Historical tracking']";
    }
    
    public static String DatePickerViewingXpath()
    {
        //return "//a//div//span";
        return "//a[@ng-click=\"dateClicked()\"]";
    }
    
    public static String calendarXpath()
    {
        return "//a[@ng-click=\"setView('calendar')\"]";
    }
    
    public static String DatePickerButtonsXpath()
    {
        return "//div[contains(@class, 'datepicker')]//span[contains(@class, 'add-on')]//i";
    }
    
    public static String DateYearHeaderXpath()
    {
        return "//div[@class='year ng-binding']";
    }
    
    public static String DateYearSpanTextXpath( int year)
    {
        return "//div[contains(@class, 'year')]//span[text()='"+year+"']";
    }
    
    public static String DateMonthHeaderXpath()
    {
        return "//div[@class='month-of-year ng-binding']";
    }
    
    public static String DateFromMonthSpanTextXpath(String monthToSelect)
    {
        return "//div[contains(@class, 'month-selector')]//div[text()='"+monthToSelect+"']";
    }
    
    public static String DateFromDayHeaderXpath()
    {
        return "//div[contains(@class, 'day-of-month')]";
    }
    
    public static String DateDaySpanTextXpath(int day)
    {
        return "//div[@class='current-days']//div[text()='"+day+"']";
    }
    
    public static String DoneButtonLinkXpath()
    {
        return "//a[text()='Done']";
    }
    
    public static String DateToMonthTextXpath(String monthToSelect)
    {
        return "//div[contains(@class, 'month')]//div[text()='"+monthToSelect+"']";
    }
    public static String DateToMonthTextAugustXpath(String monthToSelect)
    {
        return "//div[contains(@class, 'month')]//div[text()='Aug']";
    }
    
    public static String DateToDayHeaderXpath()
    {
        return "//div[@class='date']//div[contains(@class, 'day-of-month')]";
    }
    
    public static String DatePickerConfirmButton()
    {
        return "//form//span//a//i[contains(@class, 'icon-white')]";
    }
    
    public static String AssetsCountXpath()
    {
        //return "//table[contains(@class, 'table')]//tbody[@clas`s='ng-scope']";
        return "//table[contains(@class, 'table')]//tbody";
    }
    
    public static String ExpandFirstAssetButtonXpath()
    {
        return "//table[contains(@class, 'table')]//tbody[1]//tr//td[1]//a//i";
    }
    
    public static String SubTripsAddOnXpath()
    {
        return "/../../../..//tr[2]//table//tbody";
    }
    
    public static String TableHeadingsXpath()
    {
        return "//table[contains(@class, 'table')]//tbody[1]//tr//td[1]//a//i/../../../..//tr[2]//table//thead//tr//th";
    }
    
    public static String TripMenuXpath()
    {
        return "//table[contains(@class, 'table')]//tbody[1]//tr//td[1]//a//i/../../../..//tr[2]//table//tbody[1]//tr//td[8]//a[contains(@class, 'btn-actions')]";
    }
    
    public static String TripMenuItemsShowOnTripTimelineAddOnXpath()
    {
        return "/..//ul//li//a//span[text()='Show on trip timeline']";
    }
    
    public static String TimelineValidationXpath()
    {
        return "//div[@class='timeline-content']//div//div[contains(@class, 'trip')]//canvas[@class='timeline-canvas']";
    }
    
    public static String EventsButtonXpath()
    {
        return "//a[@fleet-tooltip='Events']";
    }
    
    public static String EventsValidationTextBoxXpath()
    {
        return "//input[@placeholder='Filter']";
    }
    
    public static String EventsSelectAllValidationCheckboxXpath()
    {
        return "//tr[@class='light-blue']//input[@checked='checked']";
    }
    
    public static String EventsSelectAllCheckboxXpath()
    {
        return "//thead//th[1]//input[@type='checkbox']";
    }
    
    public static String SelectButtonXpath()
    {
        return "//button[text()='Select']";
    }
    
    public static String SpecificTripRowDataXpath(int counter)
    {
        return "//table[contains(@class, 'table')]//tbody[1]//tr//td[1]//a//i/../../../..//tr[2]//table//tbody[1]//tr[1]//td["+counter+"]";
    }
    
    public static String EventsComboBoxXpath(int index)
    {
        return "//tbody//tr["+index+"]//td[1][@ng-show='allowRowSelection']//input[1]";
    }
    
    public static String EventCheckBoxesXpath()
    {
        return "//tbody//tr//td//input[1]";
    }
    
    public static String selectEventsCheckboxXpath()
    {
        return "//div//tr[@class='light-blue']/th[@class='selection']/input";
    }
    
    public static String leftPaneSpinner()
    {
        return "//div[@class='left-pane']//div[contains(@class, 'loading-overlay')][@style='display: none;']";
    }
    
    public static String timelineSpinnerXpath()
    {
        return "//div[contains(@class,'container-timeline')]/div[contains(@class, 'loading-overlay')][@style='display: none;']";
    }
}