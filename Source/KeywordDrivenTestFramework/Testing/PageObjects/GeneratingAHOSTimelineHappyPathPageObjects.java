/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects;

/**
 *
 * @author sscholtz
 */
public class GeneratingAHOSTimelineHappyPathPageObjects {
    
    public static String DateSelectedXpath(String day)
    {
        return "//div[@class='datepicker-widget in'][@aria-hidden]//div[@class='day-of-month ng-binding selected'][text()='" + day + "']";
    }

    public static String SelectDay(String day)
    {
        //  return "//div[@class='day ng-scope ng-binding'][text()='4']";
        return "//div[@class='datepicker-widget in']//div[@class='current-days']/div[text()='" + day + "']";
    }

    public static String CurrentlySelectedMonthXpath()
    {
        return "//div[@class='datepicker-widget in'][@aria-hidden]//div[@class='month-of-year ng-binding']";
    }

    public static String CurrentlySelectedYearXpath()
    {
        return "//div[@class='datepicker-widget in'][@aria-hidden]//div[@class='year ng-binding']";
    }

    public static String SelectYear(String year)
    {
        return "//div[@class='datepicker-widget in']//div[@ng-repeat='year in directive.years']/span[text()='" + year + "']";
    }

    public static String SelectMonth(String month)
    {
        return "//div[@class='datepicker-widget in']//div[@class=\"month-selector zoomable\"]//div[text()='"+month+"']";
    }
    
    public static String ImageDirectory() {
        return "SikuliImages\\MixTelematics\\";
    }    
    
    public static String Spinner()
    {
        return "//div[@class='loading-overlay'][@style='display: none;']";
    }
    
    public static String DateInputBox()
    {
        return "//div[@class=\"form-inline pull-left\"]/div/input";
    }
    
    public static String HorizontalLevels(String level)
    {
        return "//span[text()='"+ level +"']/..";
    }
    
    public static String OneHourZoom()
    {
        return "//button[text()='1h']";
    }
    
    
    public static String CanvasGridWait()
    {
        return "//div[@class='hos-series canvas-container draggable']/canvas[@class='timeline-canvas']";
    }
    
    public static String AprilMonth()
    {
        return "//div[@class='datepicker-widget in']/div[1]/div/div[text()='Apr']";
    }
    
    public static String MonthXpath()
    {
        return "//div[@class='datepicker-widget in']/div[1]/div/div[text()='Sep']";
    }
    
    public static String Month()
    {
        return "//div[@class='datepicker-widget in']/div[1]/div/div[@class=\"month-of-year ng-binding\"]";
    }
    
    public static String Year()
    {
        return "//div[@class='datepicker-widget in']/div[1]/div/div[@class=\"year ng-binding\"]";
    }
    
    public static String HourTimeXpath()
    {
        return "//div[@class='hours ng-binding']";
    }
    
    public static String HourXpath()
    {
        return "//div[@ng-click='directive.selectHour(hour)'][text()='05']";
    }
    
    public static String MinuteTimeXpath()
    {
        return "//div[@aria-hidden='false']//div[@class='minutes ng-binding']";
    }
    
    public static String MinuteXpath()
    {
        return "//div[contains(@ng-click,'minute')][text()='30']";
    }
    
    public static String Year2016()
    {
        return "//div[@class=\"datepicker-widget in\"]/div[1]/div/div[text()='2016']";
    }
    
    public static String YearSelection()
    {
        return "//div[@ng-repeat='year in directive.years']/span[text()='2016']";
    }
    
    public static String MonthSelection()
    {
        return "//div[@class=\"month-selector zoomable\"]//div[text()='Apr']";
    }
    
    public static String MonthSelectionXpath()
    {
        return "//div[@class=\"month-selector zoomable\"]//div[text()='Sep']";
    }
    
    //month selection dynamic xpath
    public static String monthSelection(String month)
    {
        return "//div[@class='month-selector zoomable']//div[text()='"+month+"']";
    }
    
    public static String DateButton()
    {
        return "//div[@ng-model='$controller.timelineSelectionCriteria.viewDate']//span";
    }
    
    public static String Day()
    {
      //  return "//div[@class='day ng-scope ng-binding'][text()='4']";
        return "//div[@class='current-days']/div[text()='27']";
    }
    
    public static String DoneButton()
    {
        return "//div[@class=\"datepicker-widget in\"]/div/a[text()='Done']";
    }
    
    public static String Breadcrumb()
    {
        return "//div[@class='organisation-selector']";
    }
    
    public static String ABCMainSelection()
    {
        return "//span[text()=\"ABC's main site\"]";
    }
    
       public static String DriverSelection()
    {
        return "//div[@class=\"column-resizable ng-scope ui-resizable\"]/div[@class=\"column ps-container\"]//span[text()='Nikodemus Blom']";
    }

    public static String Green()
    {
        return "GreenWorkstate.png";
    }
    
    public static String Red()
    {
        return "RedWorkstate.png";
    }
    
    public static String Redbar()
    {
        return "Redbar.png";
    }
    
    public static String LightGreen()
    {
        return "LightGreenWorkstate.png";
    }
    
    public static String Amber()
    {
        return "AmberWorkstate.png";
    }
    
    public static String TimelineBar()
    {
        return "TimelineBar.png";
    }
    
     public static String TimelineWhite()
    {
        return "TimelineWhite.png";
    }
    
    public static String DummyImage()
    {
        return "Desktop.png";
    }
 
       public static String Blue()
    {
        return "BlueWorkstate.png";
    }
       public static String Trip()
    {
        return "Trip.png";
    }
       
    public static String SelectButton()
    {
        return "//a[text()='Select']";
    }
    
    //Select Events HappyPathTestClass
    
    public static String TimeRangeXpath(){
        return "//div[@class='btn-group ml-5 pull-left']";
    }
    
    public static String NumberOfEventSelectedXpath(){
        return "//div/a/i[@class='icon-flag']/../span";
    }
    
    public static String SelectedEventsXpath(){
        return "//div[@class='items']/div";
    }
    
    public static String SelectEventIconXpath(){
        return "//div/a/i[@class='icon-flag']";
    }
    
    public static String SelectButtonXpath(){
        return "//button[text()='Select']";
    }
    
    public static String FilterEventInputsXpath(){
        return "//div[@aria-hidden='false']//form//input";
    }
    
    public static String CheckedBoxCheckedXpath(){
        //return "//div[@class='fleet-grid full-height selection']/table/tbody/tr/td/input[@type='checkbox']";
        return "//div[@class='fleet-grid full-height selection']/table/tbody/tr/td/input[@type='checkbox'][@checked='checked']";
    }
    
    public static String CheckBoxCheckedXpath(int x){
        //return "//div[@class='fleet-grid full-height selection']/table/tbody/tr/td/input";
        return "//tbody/tr["+x+"]/td[@ng-show='allowRowSelection']/input[@type='checkbox'][@checked='checked']";
    }
    
    public static String CheckBoxXpath(int x){
        //return "//div[@class='fleet-grid full-height selection']/table/tbody/tr/td/input";
        return "//tbody/tr["+x+"]/td[@ng-show='allowRowSelection']/input[@type='checkbox']";
    }
    
    public static String ClickLoadMoreInEventXpath(){
        return "//div/a[text()='Load more']";
    }
    
    public static String LoadingListOfInformationXpath(){
        return "//div[@class='fleet-grid-container-wrapper']/div[@ng-show='loading ']";
    }
    
    public static String ListOfEventsXpath(){
        return "//table[@class='table table-scroll table-condensed table-list no-text-clip']/tbody/tr";
    }
    
    public static String ClickIconRemoveSignByXpath(){
        return "//form[@class='filter-search nomargin form-inline ng-valid ng-dirty']/div/input/../button/i[@class='icon-remove-sign']";
    }
    
    public static String SelectEventCancelButtonXpath(){
        return "//div[@class='modal hide fade in']//button[text()='Cancel']";
    }
    public static String AvailableEventDescriptionListXpath(){
        return "//table/tbody/tr/td/div/span[text()='Available']/../../../..//tr/td/div/a[@class='clickable-cell ng-scope']";
    } 
    
    public static String SelectEventsListXpath(){
        return "//table/tbody/tr/td[@column-field='description']/div/span";
    }
    
    
}
