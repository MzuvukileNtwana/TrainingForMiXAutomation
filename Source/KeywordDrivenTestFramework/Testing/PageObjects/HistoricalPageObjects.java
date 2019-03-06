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
public class HistoricalPageObjects
{

    public static String historicalTrackingXpath()
    {
        return "//div[@ng-repeat='module in section.modules']/h4[text()='TRACKING']/../ul/li/a[text()='Historical tracking']";
    }

    public static String historicalPageHeadingXpath()
    {
        return "//h5/span[text()='Historical tracking']";
    }

    public static String organisationXpath()
    {
        return "//div[@class='miller-selector']/a/span[3]/span[2]";
    }

    public static String dateRangeXpath()
    {
        return "//a[@class='dates pull-left mt-10']/div/span";
    }

    public static String locationsButtonXpath()
    {
        return "//a[@ng-click='showLocationModal()'][@fleet-tooltip='Locations']";
    }

    public static String eventsButtonXpath()
    {
        return "//a[@ng-click='eventModalData.clickHandler()']";
    }

    public static String assetsGridXpath()
    {
        // return "//div/div/div/table[@class='table table-striped table-condensed no-margin']";
        return "//div[@ng-class ='mobitechTrackingClass()']/../..";
    }

    public static String mapXpath()
    {
        return "//*[local-name()='svg']";
        //return "//div[@style='position: absolute; width: 100%; height: 100%']/div/div[@id='map']/..";
    }

    public static String mapXpath2()
    {
        // return "//*[local-name()='svg']";
        // return "//div[@style='position: relative; width: 100%; height: 100%']/div/div[@id='map']/..";
        return "//div[contains(@style,'position')]/div/div[contains(@id,'map')]";
    }

    public static String mapIEXpath()
    {
        return "map.png";
    }

    public static String selectedLocationsXpath()
    {
        return "//*[local-name()='path']";//[@stroke='Blue']";
    }

    public static String selectedLocationsImage()
    {
        return "loc.png";
    }

    public static String selectedLocationsIEXpath()
    {
        return "//*[local-name()='path']";//[@stroke='blue']";
    }

    public static String assetsHeadingXpath()
    {
        return "//a[@class='mobitech-tracking-tab ng-binding active']";
    }

    public static String workersHeadingXpath()
    {
        return "//a[@class='mobitech-tracking-tab ng-binding']";
    }

    public static String selectLocationsHeadingXpath()
    {
        return "//span[text()='Select locations']";
    }

    public static String selectEventsHeadingXpath()
    {
        return "//span[text()='Select events']";
    }

    public static String filterXpath()
    {
        return "//input[@placeholder='Filter']";
    }

    public static String locationNameXpath()
    {
        return "//th/span[text()='Location name']";
    }

    public static String siteXpath()
    {
        return "//th/span[text()='Site']";
    }

    public static String locationTypeXpath()
    {
        return "//th/span[text()='Location type']";
    }

    public static String cancelButtonXpath()
    {
        return "//div[@class='modal hide fade in']/div[@class='modal-footer']/button[@text='Cancel']";
    }

    public static String selectButtonXpath()
    {
        return "//div[@class='modal hide fade in']/div[@class='modal-footer']/button[@text='Select']";
    }

    public static String clearFilterButtonXpath()
    {
        return "//input[@placeholder='Filter']/../button";
    }

    public static String headerCheckBoxXpath()
    {
        return "//th/input[@type='checkbox']";
    }

    public static String preferedLocationXpath(int num)
    {
        return "//tr[" + num + "]/td/input[@type='checkbox']";
    }

    public static String checkBoxesXpath()
    {
        return "//td/input[@type='checkbox']";
    }

    public static String numberOfLocationsXpath()
    {
        return "//a[@ng-click='showLocationModal()']/span";
    }

    public static String eventsFilterXpath()
    {
        return "//span[text()='Select events']/../../../form/div/input";
    }

    public static String eventNameXpath()
    {
        return "//th/span[text()='Event name']";
    }

    public static String eventTypeXpath()
    {
        return "//th/span[text()='Event type']";
    }

    public static String eventsTableXpath()
    {
        return "//span[text()='Select events']/../../../div/div/div/div/div/table/tbody/tr";
    }

    public static String eventsHeaderCheckboxXpath()
    {
        return "//span[text()='Select events']/../../../div/div/div/div/div/table/thead/tr/th/input";
    }

    public static String eventsCheckBoxesXpath()
    {
        return "//span[text()='Select events']/../../../div/div/div/div/div/table/tbody/tr/td/input";
    }

    public static String numberOfEventsXpath()
    {
        return "//a[@ng-click='eventModalData.clickHandler()']/span";
    }

    public static String clearEventsFilterXpath()
    {
        return "//span[text()='Select events']/../../../form/div/input/../button";
    }

    public static String historicalPageSpinnerXpath()
    {
        return "//div[@class='loading-overlay'][@ng-show='isMapLoading']";
    }

    //  <editor-fold defaultstate="collapsed" desc="AssetListTripReplay">
    public static String SelectToggleToExpandXpath()
    {
        return "//table/tbody[1]/tr/td/a/i[@class='icon-grey icon-plus']";
    }
    
    public static String ExpandSignXpath()
    {
        return "//table/tbody[1]/tr/td/a/i[@class='icon-grey icon-plus']";
    }

    public static String SelectActionDropdownXpath()
    {
        return "//div[@class='well well-small well-white no-margin']/table/tbody[1]/tr/td/div/a";
    }

    public static String SelectShowOnMapXpath()
    {
        return "//div[@class='well well-small well-white no-margin']/table/tbody[1]/tr/td/div/a/../ul/li/a/span[text()='Show on map']";
    }

    public static String SelectDropdownSpeedXpath()
    {
        return "//div/select[@ng-model='replaySpeed']/option[5]";
    }

    public static String AvailableSpeedXpath()
    {
        return "//div/select[@ng-model='replaySpeed']/option";
    }

    public static String SelectPlayButtonXpath()
    {
        return "//div/a/i[@class='icon-play']";
    }

    public static String PauseButtonXpath()
    {
        return "//a/i[@class='icon-pause']";
    }

    public static String GetTimeAssettravelXpath()
    {
        //return "//div/span[@id='replayDateTime']";
        return "//div[@id='map-container']/div/span";
    }

    public static String assetFilterXpath()
    {
        return "//div[@class='pa-10 search-box btn-inverse']/form/div/input[@class='span12 no-margins ng-pristine ng-valid']";
    }

    public static String unCheckedAssetEvent(String assetWithEvents)
    {
        return "//table/tbody/tr//..//input/../span[text()='" + assetWithEvents + "']/../..//input[@type='checkbox']";
    }

    public static String AssetsWithTripsCheckBoxXpath()
    {
        return "//table/tbody/tr//..//input/../span[text()='Assets with trips']/../..//input[@type='checkbox']";
    }

    public static String buttonSearchByXpath()
    {
        return "//div/input[@class='span12 no-margins ng-valid ng-dirty']/../button";
    }

    public static String WaitTableSpinnerhistoricalXpath()
    {
        return "//div[@class='loading-overlay ng-scope'][@style='display: none;']";
    }

    public static String validateTheTrailOnTheMapXpath()
    {
        return "//*[local-name()='path'][contains(@marker-end, 'url')]";
    }

    public static String ListViewXpath()
    {
        return "//div/a[@ng-click=\"setView('list')\"]";
    }

    public static String DropDownListItemXpath()
    {
        return "//select[@ng-model=\"listItem\"]";
    }

    public static String SaveButtonXpath()
    {
        return "//a[@ng-click='save()']/i[@class='icon-ok icon-white']";
    }

    public static String IconCalendarXpath()
    {
        return "//div[@class='pull-left']/i[@class='icon-calendar']";
    }

    //</editor-fold>  
    public static String iconCalendarXpath()
    {
        return "//i[@class='icon-calendar']";
    }

    public static String DivWithiconCalendarXpath()
    {
        return "//div[@class='pull-left']/i[@class='icon-calendar']";
    }

    public static String AWithiconCalendarXpath()
    {
        return "//a[@class='btn']/i[@class='icon-calendar']";
    }

    public static String startDateTimeSelectorXpath()
    {
        return "//span[@ng-show=\"view == 'calendar'\"]/div[1]/div/span/i";
    }

    public static String divPreDateXpath()
    {
        return "//div[@class='day ng-scope ng-binding'][@ng-click]";
    }

    public static String endDateTimeSelectorXpath()
    {
        return "//span[@ng-show=\"view == 'calendar'\"]/div[3]/div/span/i";
    }

    public static String hourXpath()
    {
        return "//div[@class='datepicker-widget in']/div/div[@class='time']/div[1]";
    }

    public static String CurrentDayXpath(String day)
    {
        return "//div[@class='day ng-scope ng-binding'][text()='" + day + "']";
    }

    public static String colonXpath()
    {
        return "//div[@class='datepicker-widget in']/div/div[@class='time']/span[1]";
    }

    public static String minutesXpath()
    {
        return "//div[@class='datepicker-widget in']/div/div[@class='time']/div[2]";
    }

    public static String innerCircleXpath()
    {
        return "//div[@class='datepicker-widget in']/div/div[@class='time']/../../div[@class='control']/div[4]/div/div[3]/div[contains(@class, 'selected')]";
    }

    public static String outerCircleXpath()
    {
        return "//div[@class='datepicker-widget in']/div/div[@class='time']/../../div[@class='control']/div[4]/div/div[4]/div[contains(@class, 'selected')]";
    }

    public static String selectInnerCircleXpath(int num)
    {
        return "//div[@class='datepicker-widget in']/div/div[@class='time']/../../div[@class='control']/div[4]/div/div[3]/div[" + num + "]";
    }

    public static String selectOuterCircleXpath(int num)
    {
        // return "//div[@class='datepicker-widget in']/div/div[@class='time']/../../div[@class='control']/div[4]/div/div[4]/div["+num+"]";
        return "//div[@class='datepicker-widget in']/div/div[@class='time']/../../div[@class='control']/div[4]/div/div[4]/div[text()=" + num + "]";
    }

    public static String HourToSelectXpath(String hours)
    {
        return "//div[@class='control']/div[4]//div[text()='" + hours + "']";
    }

    public static String currentDayXpath()
    {
        return "//div[@class='datepicker-widget in']/div/div[@class='date']/div[2]";
    }

    public static String currentMonthXpath()
    {
        return "//div[@class='datepicker-widget in']/div/div[@class='date']/div[1]";
    }

    public static String currentYearXpath()
    {
        return "//div[@class='datepicker-widget in']/div/div[@class='date']/div[3]";
    }

    public static String selectDateXpath(int num)
    {
        return "//div[@class='datepicker-widget in']/div/div[@class='time']/../../div[@class='control']/div/div/div[@class='current-days']/div[text()=" + num + "]";
    }

    public static String monthToSelectXpath(String month)
    {
        return "//div[@class='datepicker-widget in']/div/div[@class='time']/../../div[@class='control']/div[2]/div/div[text()='" + month + "']";
    }

    public static String monthXpath(int num)
    {
        return "//div[@class='datepicker-widget in']/div/div[@class='time']/../../div[@class='control']/div[2]/div/div[" + num + "]";
    }

    public static String DatePickerWindowXpath()
    {
        return "//div[@class='datepicker-widget in'][@aria-hidden='false']";
    }

    public static String endDateFieldXpath()
    {
        return "//span[@ng-show=\"view == 'calendar'\"]/div[3]/div/span/i/../../input";
    }

    public static String doneButtonXpath()
    {
        return "//div[@class='datepicker-widget in']/div[3]/a";
    }

    public static String EndDateTextBoxXpath()
    {
        return "//div[@class='pull-left']/div/input";
    }

    public static String mapPointImage()
    {
        return "dragMapPoint.png";
    }

    public static String pointImage()
    {
        return "alternativeMap.png";
    }

    public static String mapPartImage()
    {
        return "blueMap.png";
    }

    public static String locationNameLabelXpath()
    {
        return "//span[@class='field-mandatory']/../span[text()='Location name']";
    }

    public static String zoomInXpath()
    {
        return "//a[@class='leaflet-control-zoom-in']";
    }

    public static String splitterXpath()
    {
        return "//div[@class='vsplitbar full-height ui-draggable']";
    }

    public static String splitterImage()
    {
        return "splitter.png";
    }

//     public static String locXpath(){
//        // return "//*[local-name()='text'][@id='label-644']/..//*[local-name()='path']";
//        // return "//*[local-name()='text'][@id='label-644']";
//         return "//*[local-name()='path']";//[@class='leaflet-clickable']";
//     }
    //New locXpath
    public static String locXpath()
    {
        return "//a[@data-toggle= 'modal']//i[@class='icon-map-marker']";
    }

    public static String toolbarXpath()
    {
        return "//div[@class='tracking-docked-toolbar btn-inverse']";
    }

    public static String locationNameFieldXpath()
    {
        return "//span[@class='field-mandatory']/../../input";
    }

    public static String locationTypeLabelXpath()
    {
        return "//span[@class='field-mandatory']/../span[text()='Location type']";
    }

    public static String selectTypeXpath()
    {
        return "//span[@class='field-mandatory']/../span[text()='Location type']/../../select";
    }

    public static String selectTypeWithTextXpath(String text)
    {
        return "//span[@class='field-mandatory']/../span[text()='" + text + "']/../../select";
    }

    public static String typeOptionXpath(int num)
    {
        return "//span[@class='field-mandatory']/../span[text()='Location type']/../../select/option[@value=" + num + "]";
    }

    public static String siteOptionXpath(int num)
    {
        return "//span[@class='field-mandatory']/../span[text()='Site']/../../select/option[@value=" + num + "]";
    }

    public static String selectSiteXpath()
    {
        return "//span[@class='field-mandatory']/../span[text()='Site']/../../select";
    }

    public static String selectSiteWithTextXpath(String text)
    {
        return "//span[@class='field-mandatory']/../span[text()='" + text + "']/../../select";
    }

    public static String siteLabelXpath()
    {
        return "//span[@class='field-mandatory']/../span[text()='Site']";
    }

    public static String locationColorLabelXpath()
    {
        return "//label[text()='Location colour']";
    }

    public static String colorXpath()
    {
        return "//label[text()='Location colour']/../a[contains(@class, 'active')]";
    }

    public static String enabledSaveButtonXpath()
    {
        return "//button[text()='Save']";
    }

    public static String popupXpath()
    {
        return "//span[@id='pop-alert-message']";
    }

    public static String colorpickerXpath(int color)
    {
        return "//a[@class='pull-left colour-picker ng-scope'][" + color + "]";
    }

    public static String rightPaneSpinnerXpath()
    {
        return "//div[@class='right-pane']//div[contains(@class, 'loading-overlay')][@style='display: none;']";
    }

    public static String ViewDateXpath()
    {
        return "//a[@fleet-tooltip='View dates']/div/i/../..";
    }
    
    //Additional xpaths
    public static String locationSearchButtonXpath()
    {
        return "//a[@class ='dropdown-toggle btn btn-small']";
    }

    public static String findLocationButtonXpath()
    {
        return "//a[@id ='btn-search-place']";
    }

    public static String alocationRadioButtonXpath()
    {
        return "//span[text() = 'A location']";
    }

    public static String locationNameFilterXpath()
    {
        return "//input[@id = 'LocationAutoAsset']";
    }

    public static String actualLocationToSelectXpath()
    {
        return "//a[@id = 'ui-id-4']";
    }

    
}
