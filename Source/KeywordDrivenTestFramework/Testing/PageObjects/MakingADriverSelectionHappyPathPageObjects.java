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
public class MakingADriverSelectionHappyPathPageObjects 
{
    public static String pageHeaderXpath()
    {
        return "//h5/span[text()='HOS timeline']";     
    }
    public static String breadcrumXpath() 
    {
        return "//a[@ng-click=\"$broadcast('openOrganisationSelectionMiller')\"]";
    }
    public static String selectDriverXpath()
    {
        return "//h5[text()='Select driver']";
    }
    //name to select on breadcrumb
    public static String driverPathXpath(String nameOnBreadCrumb)
    {
        return "//a/span[text()='"+nameOnBreadCrumb+"']"; 
    }
    public static String secondColumnXpath()
    {
        return "//div[@class='column ps-container ps-active-y']";
    }
    public static String thirdColumnXpath()
    {
        return "//div[@class='column-container']/div[3]/div[1]";
    }
    public static String fourthColumnXpath()
    {
        return "//div[@class='column-container']/div[4]/div[1]";
    }
    public static String fifthColumnXpath()
    {
        return "//div[@class='column-container']/div[5]/div[1]";
    }
    public static String lastElementOnTheSecondColumnXpath()
    {
        return "//a/span[text()='XXXX - DO NOT USE']";
    }
    public static String eachOrgXpath(int org)
    {
        return "//a["+org+"]/span[@data-original-title='Organisation']/../span[2]";
    }
     public static String organisationsXpath()
    {
        return "//span[@data-original-title='Organisation']/../span[2]";
    }
    public static String groupsXpath()
    {
        return "//div[@class='column-container']/div[3]/div[1]/a";
    }
    public static String selectedOrganisationXpath()
    {
        return "//a[@class='ng-scope active selected']";
    }
    public static String sitesColumnXpath()
    {
        return "//h5[text()='Select driver']/../../../div[@class='column-viewport ps-container']/div/div[4]";
    }
    public static String sitesXpath()
    {
        return "//span[contains(@data-original-title,'ite')]/../span[2]/../..";
    }
    public static String eachSiteXpath(int site)
    {
        return "//a["+site+"]/span[contains(@data-original-title,'ite')]/../span[2]";
    }
    
    public static String eachSiteXpath1(int site)
    {
        return "//a["+site+"]/span[contains(@data-original-title,'ite')]/../span[2]/..//span[@class='icon icon-site']";
    }//div[@class='column ps-container ps-active-y']//span[@class='icon icon-site']
    
    public static String driversColumnXpath()
    {
        return "//div[@class='column-container']/div[5]/div[1]";
    }//div[@class='column-container']/div[5]/div[1]//span[@class='icon icon-drivers']
    public static String driversXpath()
    {
        return "//div[@class='column-container']/div[5]/div[1]/a";
    }
    public static String driversXpath(int driver)
    {
        return "//div[@class='column-container']/div[5]/div[1]/a["+driver+"]";
    }
    public static String groupsXpath(int group)
    {
        return "//div[@class='column-container']/div[3]/div[1]/a["+group+"]";
    }
    public static String selectButtonXpath()
    {
        return "//a[text()='Select']";
    }
    public static String pleaseSelectADriverSpanXpath()
    {
        return "//span[text()='Please select a driver']";
    }
    public static String tripsXpath()
    {
        return "//div[@class='hos-series canvas-container draggable']//*[local-name()='canvas'][@class='timeline-canvas']";
    }
    public static String tripsSecondXpath()
    {
        return "//div[@class='trip-series canvas-container draggable']//*[local-name()='canvas'][@class='timeline-canvas']";
    }
    public static String eventsXpath(int event)
    {
        return "//div[@class='items']/div["+event+"]";
    }
    public static String eventsXpath()
    {
        return "//div[@class='items']/div";
    }
    public static String workstateXpath(int workState)
    {
        return "//div[@class='us-hos-workstate-label-axis']/span[@class='hos-workstate-label ng-scope']["+workState+"]";
    }
    public static String workstateXpath()
    {
        return "//div[@class='us-hos-workstate-label-axis']/span[@class='hos-workstate-label ng-scope']";
    }
    public static String euWorkstateXpath()
    {
        return "//div[@class='eu-hos-workstate-label-axis']/span[@class='hos-workstate-label ng-scope']";
    }
     public static String euWorkstateXpath(int workState)
    {
        return "//div[@class='eu-hos-workstate-label-axis']/span[@class='hos-workstate-label ng-scope']["+workState+"]";
    }
    public static String iconCalendarXpath()
    {
        return "//div[@class='form-inline pull-left']//span/i[@class='icon-calendar']";
    }
    public static String selectedDayXpath()
    {
        return "//div[@class='day ng-scope ng-binding selected']";
    }
    public static String daysXpath()
    {
        return "//div[@ng-repeat='day in directive.daysInMonth']";
    }
    public static String previousDayXpath(int day)
    {
        return "//div[@ng-repeat='day in directive.daysInMonth']["+day+"]";
    }
    public static String doneButtonXpath()
    {
        return "//div[@class='datepicker-widget in']//a[text()='Done']";
    }
    public static String monthXpath()
    {
        return "//div[@class='datepicker-widget in']//div[@class='month-of-year ng-binding']";
    }
    public static String dayXpath()
    {
        return "//div[@class='datepicker-widget in']//div[contains(@class,'day-of-month ng-binding')]";
    }
    public static String yearXpath()
    {
        return "//div[@class='datepicker-widget in']//div[@class='year ng-binding']";
    }
    public static String yesrToSelectXpath(String year)
    {
        return "//div[@class='datepicker-widget in']//div[@class='year-selector zoomable']//span[text()='"+year+"']";
    }
    public static String selectedPreviousYearXpath()
    {
        return "//div[@class='year ng-scope selected p0']/span[text()='2015']";
    }
    public static String currentYearXpath(String year)
    {
        return "//div[@class='year ng-scope p1']/span[text()='"+year+"']";
    }
    public static String currentMonthXpath(String month)
    {
        return "//div[@class='datepicker-widget in']//div[@class='month-selector zoomable']//div[text()='"+month+"']";
    }
    public static String monthXpath(int month)
    {
        return "//div[@class='datepicker-widget in']//div[@class='month-selector zoomable']//div[contains(@class,'month')]["+month+"]";
    }
    public static String currentDayXpath(String day)
    {
        return "//div[@class='datepicker-widget in']//div[@class='day-selector zoomable']//div[text()='"+day+"']";
    }
    public static String disabledYearXpath()
    {
        return "//div[@class='year ng-scope disabled p1']";
    }
    public static String disabledMonthXpath()
    {
        return "//div[@class='month ng-scope ng-binding disabled']";
    }
    public static String disabledDayXpath()
    {
        return "//div[@class='day ng-scope ng-binding disabled']";
    }
    public static String totalMonthsXapth()
    {
        return "//div[@class='datepicker-widget in']//div[@class='month-selector zoomable']//div[contains(@class,'month')]";
    }
    public static String leftArrowXpath()
    {
        return "//i[contains(@class,'icon-chevron-left icon-grey')]/..";
    }
    public static String logViewButtonXpath()
    {
        return "//a[@fleet-tooltip='Driver log view']";
    }
    public static String timeLineButtonXpath()
    {
        return "//i[@class='icon-tasks']/..";
    }
    public static String leftBigArrowXpath()
    {
        return "//a[@class='navigation-button back']";
    }
    public static String leftBigArrowNotVisibleXpath()
    {
        return "//a[@class='navigation-button back' and @style='display: none;']";
    }
    public static String scrubberXpath()
    {
        return "//div[@class='selection canvas-container draggable']/canvas";
    }
    public static String scrubberImage()
    {
        return "Scrubber.PNG";
    }
    public static String actionsToggleButtonXpath()
    {
        return "//a[@class='btn-actions dropdown-toggle']";
    }
    public static String HOSSettingsXpath()
    {
        return "//div[@class='page-header']//a/span[text()='HOS settings']";
    }
    public static String dropdownMenuXpath()
    {
        return "//div[@class='page-header']//a/span[text()='HOS settings']/../../..";
    }
    public static String HOSSettingsModalXpath()
    {
        return "//div[@class='modal hide fade modal-mini in']";
    }
    public static String useAbbreviationsCheckboxXpath()
    {
        return "//input[@id='useAbbreviations']";
    }
    public static String saveBttonXpath()
    {
        return "//button[@text='Save']";
    }
    public static String closeButtonXpath()
    {
        return "//button[@text='Close']";
    }
    public static String actionsButtonXpath()
    {
        return "//div[@id='hosGrid']//a[@fleet-tooltip='Actions']";
    }
    public static String actionsButtonXpath(int button)
    {
        return "//div[@id='hosGrid']//li["+button+"]//a[@fleet-tooltip='Actions']";
    }
    public static String editXpath()
    {
        return "//ul[@class='dropdown-menu pull-right'][contains(@style,'block')]//span[text()='Edit']/..";
    }
    public static String removeXpath()
    {
        return "//ul[@class='dropdown-menu pull-right'][contains(@style,'block')]//span[text()='Remove']/..";
    }
    public static String closeXButtonXpath()
    {
        return "//div[@name='hosStatusMapModal'][contains(@style,'block')]//button[@class='close']";
    }
    public static String removeTextAreaXpath()
    {
        return "//h5/span[text()='Remove status']/../../../..//textArea";
    }
    public static String removeButtonXpath()
    {
        return "//button[@text='Remove']";
    }
    public static String nextButtonXpath()
    {
        return "//button[@text='Next']";
    }
    public static String changeLocationXpath()
    {
        return "//a[text()='Change location']";
    }
    public static String locationRadioButtonXpath()
    {
        return "//span[text()='A location']/../input";
    }
     public static String addressRadioButtonXpath()
    {
        return "//span[text()='An address']/../input";
    }
    public static String locationTextboxXpath()
    {
        return "//span[@id='map-location']/input";
    }
    public static String addressTextboxXpath()
    {
        return "//span[@id='map-address']/input";
    }
    public static String locationXpath(String loc)
    {
        return "//strong[text()='"+loc+"']/..";
    }
    //selected location xpath
    public static String selectedLocationXpath()
    {
        return "//tr//td[@style=\"width: 100%\"]//div//span[@class]";
    }
    public static String locationOnModalXpath()
    {
        return "//a[text()='Change location']/../span";
    }
    public static String saveButtonXpath()
    {
        return "//button[@text='Save']";
    }
    public static String confirmChangesModalXpath()
    {
        return "//div[@name='hosStatusConfirmModal'][contains(@style,'block')]";
    }
    public static String locationOnConfirmChangesModalXpath()
    {
        return "//td[@ng-show='driverStatus.location']";
    }
    public static String remarksTextAreaXpath()
     {
         return "//div[@name='hosDriverStatusModal'][contains(@style,'block')]//textArea[@name='remarks']";
     }
    public static String confirmButtonXpath()
    {
        return "//button[@text='Confirm']";
    }
    public static String addressOnTheGridXpath(String location)
    {
        return "//td//span[text()='"+location+"']";
    }
    public static String remarkOnTheGridXpath(String remark)
    {
        return "//td//span[text()='"+remark+"']";
    }
    public static String dataOnRemarkColumnXpath()
    {
        return "//td[@column-field='remarks']//span";
    }
    public static String dataOnLocationColumnXpath()
    {
        return "//td[@column-field='location.description']//span";
    }
    public static String startOfDayButtonXpath()
    {
        return "//a[@fleet-tooltip='Start of day']";
    }
    public static String addStatusButtonXpath()
    {
        return "//a[@fleet-tooltip='Add status event']";
    }
    public static String coDriversXpath()
    {
        return "//strong[text()='Co-Drivers:']/../a";
    }
    public static String coDriversNamesXpath()
    {
        return "//strong[text()='Co-Drivers:']/..";
    }
    public static String amountOfMoreCoDriversXpath()
    {
        return "//span[@class='dropdown']/a";
    }
    public static String additionalNumberOfCodriversXpath()
    {
        return "//span[@class='dropdown']/a//span[@style='display: none;']";
    }
    public static String contextMenuXpath()
    {
        return "//span[@class='dropdown open']//li";
    }
    public static String additionalCoDriversXpath(int driver)
    {
        return "//span[@class='dropdown open']//li["+driver+"]/a";
    }
    
    //map coordinates xpath
    public static String mapCoordinatesXpath()
    {
        return "//div[@class='leaflet-bottom leaflet-right']//div//div//span[@class='labelFirst']";
    }
}
