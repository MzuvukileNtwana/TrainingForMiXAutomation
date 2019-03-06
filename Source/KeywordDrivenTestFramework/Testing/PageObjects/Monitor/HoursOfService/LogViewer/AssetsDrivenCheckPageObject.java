/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects.Monitor.HoursOfService.LogViewer;

/**
 *
 * @author smncwabe
 */
public class AssetsDrivenCheckPageObject
{

    public static String InforIconXpath()
    {
        return "//i[@class='icon-info-sign icon-grey']";
    }

    public static String HOSRulesSetXpath()
    {
        return "//select[@name='ruleId']";
    }

    public static String ViewPeriodAndAssetDrivenXpath(String LabelText)
    {
        return "//strong[text()='" + LabelText + "']/../../label[2]";
        //strong[text()="View period:"]/../../label[2]
    }

    public static String StartOfDistanceXpath(String LabelText)
    {
        return "//strong[text()='" + LabelText + "']/../../label[2]";
        //strong[text()="Start of distance driven:"]/../../label[2]
    }

    public static String EndOfDistanceXpath(String LabelText)
    {
        return "//strong[text()='" + LabelText + "']/../../label[2]";
        //strong[text()="End of distance driven:"]/../../label[2]
    }

    public static String DrivingDistanceXpath(String LabelText)
    {
        return "//strong[text()='" + LabelText + "']/../../label[3]";
        //strong[text()="Driving distance:"]/../../label[3]
    }

    public static String RulesSetXpath(String LabelText)
    {
        return "//strong[text()='" + LabelText + "']/../../div";
    }

    public static String AssetsDrivenXpath(String LabelText)
    {
        return "//strong[text()='" + LabelText + "']/../../div";
    }
    //strong[text()="Asset(s) driven:"]/../../div

    public static String DateTimeTextBoxXpath()
    {
        return "//div[@class='page-header']/div/div[@class='form-inline pull-left']/div/input";
    }

    public static String CalenderIconXpath()
    {
        return "//div[@class='page-header']/div/div[3]/div/span[@class='add-on btn']/i/..";
    }

    public static String ChooseDayXpath(String day)
    {
        return "//div[@class='current-days']/div[text()='" + day + "']";
    }

    public static String MonthlySelectorXpath()
    {
        return "//div[@class='datepicker-widget in']//div[@ng-click=\"directive.changeToMonthSelector()\"]";
    }

    public static String MonthXpath(String month)
    {
        return "//div[@class=\"month-selector zoomable\"]//div[text()='" + month + "']";
    }

    public static String ChooseYearXpath()
    {
        return "//div[@class='datepicker-widget in']//div[@ng-click=\"directive.changeToYearSelector()\"]";
    }
    //div[@class='datepicker-widget in']//div[@ng-click="directive.changeToYearSelector()"]

    public static String YearXpath(String year)
    {
        return "//div[@ng-repeat='year in directive.years']/span[text()='" + year + "']";
    }

    public static String ValidateDateXpath()
    {
        return "//div[@aria-hidden='false']//div[@class='display']/div[@class='day-of-week ng-binding']/../../div[@class='display']";
    }

    public static String DoneButtonXpath()
    {
        return "//div[@class=\"datepicker-widget in\"]/div/a[text()='Done']";
    }

    public static String DrivingXpath()
    {
        return "//span[@class='hos-workstate-label ng-scope']/span[text()='D']";
    }

    public static String HOSLogViewHeaderXpath()
    {
        return "//h5/span[text()='HOS Log Viewer']";
    }

    public static String SpinnerXpath()
    {
        return "//div[@class='loading-overlay'][@style='display: none;']";
    }

    public static String TooltipPopUpXpath()
    {
        return "//div[@class='tooltip-inner']/div//div//div//div";
    }

    public static String SleeperXpath()
    {
        return "//span[@class='hos-workstate-label ng-scope']/span[text()='SB']";
    }

    public static String StartOfDay()
    {
        return "//a[@class='btn btn-small']/i[@class='icon-alarmclock']";
    }

    public static String StartDateTooltipXpath()
    {
        return "//strong[text()=\"Start date\"]/../../div[1]";
    }

    public static String EndDateTooltipXpath()
    {
        return "//strong[text()=\"End date\"]/../../div[2]";
    }

    public static String DrivingTooltipXpath()
    {
        return "//strong[text()=\"Driving\"]/../../div[5]";
    }

    public static String DistanceTooltipXpath()
    {
        return "//strong[text()=\"Driving\"]/../../div[6]";
    }

    public static String StartODOTooltipXpath()
    {
        return "//strong[text()=\"Start ODO\"]/../../div[8]";
    }

    public static String AssetTooltipXpath()
    {
        return "//strong[text()=\"Asset\"]/../../div[9]";
    }

    public static String ClickEditStatusXpath()
    {
        return "//li/a/span[text()='Edit status']/..";
    }

    public static String EditDriverStatusPageHeaderXpath()
    {
        return "//div[@class='white-box-padding']//h5/span[text()='Edit driver status']";
    }

    public static String AssetTextBoxByXpath()
    {
        return "//div[@class='span6']//input[@name='assetName']";
    }

    public static String AssetTextBoxXpath()
    {
        return "//div[@class='driverStatusAutoComplete']/span/input";
    }

    public static String ClickChangeAssetLinkByXpath()
    {
        return "//form[@name='driverStatusCrudForm']//div/label/span/../../a[text()='Change asset']";
    }
    //form[@name='driverStatusCrudForm']//div/label/span/../../a[text()='Change asset']

    public static String ButtonNextInDriverStatusPageXpath()
    {
        return "//button[text()='Next']";
    }

    public static String RefreshLinkByXpath()
    {
        return "//div//a/span[text()='Refresh']";
    }

    public static String ButtonSaveInEditDriverStatusPageXpath()
    {
        return "//div[@class='modal hide fade modal-medium in']//button[text()='Save']";
    }

    public static String EditStatusInforXpath()
    {
        return "//table[@class='table table-bordered table-striped table-condensed no-margin']/tbody/tr";
    }

    public static String ConfirmChangesHeadingXpath()
    {
        return "//h5/span[text()='Confirm changes']";
    }

    public static String ButtonConfirmXpath()
    {
        return "//div[@class='modal hide fade modal-mini in']//button[text()='Confirm']";
    }

    public static String StatusDataSavedSuccessfullyPopUpMessageXpath()
    {
        return "//div[@class='notification-wrapper notification-modal ng-scope'][@style='display: none;']//span[@id='pop-alert-message']";
    }

    public static String statusDataSavedSuccessfullyIEPopupMessageXpath()
    {
        return "//div//span[@id='pop-alert-message'][text()='Status data saved successfully']";
    }

}
