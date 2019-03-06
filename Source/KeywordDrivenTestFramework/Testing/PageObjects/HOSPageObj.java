package KeywordDrivenTestFramework.Testing.PageObjects;

import static KeywordDrivenTestFramework.Core.BaseClass.browserType;
import static KeywordDrivenTestFramework.Core.BaseClass.currentEnvironment;
import KeywordDrivenTestFramework.Entities.Enums;

/**
 *
 * @author Y Duma
 */
public class HOSPageObj
{
    
    public static String IconArrowUpDisabled()
    {
        return "//a[@disabled='disabled']/i[@class='icon-arrow-up']";
    }
    
    public static String IconArrowUpXpath()
    {
        return "//i[@class='icon-arrow-up']";
    }
    
    public static String InputDataEventXpath()
    {
        return "//div[@class='event-series ng-scope']/span[text()='Input Data']";
    }
    
    public static String InputDataIsNotSelectedXpath()
    {
        return "//tr[@class='ng-scope odd']/td[@ng-show='allowRowSelection']/input[@type='checkbox']";
    }
    
    public static String InputDataIsSelectedXpath()
    {
        return "//tr[@class='ng-scope odd selected']/td[@ng-show='allowRowSelection']/input[@type='checkbox'][@checked='checked']";
    }
    
    public static String EventSearchXpath()
    {
        return "//div[@class='input-reset-wrapper mb-5']/input[@type='text'][@placeholder='Filter']";
    }
    
    public static String MixTelematicsURL() {
        return currentEnvironment.PageUrl;
    }
    
    public static String colorLegendIconXpath(int i)
    {
        return "//div[@class='popover fade bottom in'][contains(@style,'display: block')]/div/div[@class='popover-content']/table/tbody/tr["+i+"]/td/div";
    }
    
    public static String colorLegendIconLabelXpath(int i)
    {
        return "//div[@class='popover fade bottom in'][contains(@style,'display: block')]/div/div[@class='popover-content']/table/tbody/tr["+i+"]/td/span";
    }
    
    public static String colorLegendIconLabelPopUpXpath()
    {
        return "//div[@class='popover fade bottom in'][contains(@style,'display: block')]/div/div[@class='popover-content']/table/tbody/tr/td/span";
    }
    
    public static String MonitorXpath()
    {
        return "//ul/li/a[text()='MONITOR ']";
    }
    
    public static String MonitorDropDownOpenXpath()
    {
        return "//ul/li[@class='dropdown ng-scope open']";
    }
    
    
    public static String MonitorDropDownNotOpenXpath()
    {
        return "//ul/li[@class='dropdown ng-scope']";
    }
    
    public static String SelectDriverXpath()
    {
        return "//div/span[text()='Please select a driver']";
    }
    
    public static String LoadingSpinnerXpath()
    {
        return "//div[@class='loading-overlay'][@style='display: none;']";
    }
    
    public static String TimeLineLoadingSpinner2Xpath()
    {
        return "//div[@name='hosTimeline']/div[@class='timeline-content ng-scope']/div[@class='loading-overlay'][@style='display: none;']";
    }
    
    public static String LogViewerSpinnerXpath()
    {
        return "//div[@id=\"logContent\"]/div[@class='loading-overlay'][@style='display: none;']";
    }
    
    public static String TimeLineLinkTextXpath()
    {
        return "//ul/li/a[text()='Timeline']";
    }
    
    public static String TimeClockLinkTextXpath()
    {
        return "//ul/li/a[text()='Timeclock']";
    }
    
    public static String LogViewerLinkTextXpath()
    {
        return "//ul/li/a[text()='Log viewer']";
    }  
    
    public static String LogViewerPageHeaderXpath()
    {
        return "//span[text()='HOS Log Viewer']";
    }
    
    public static String ButtonColorLegendXpath()
    {
        return "//a/i[@class='icon-color-legend']/..";
    }
    
    public static String ButtonStartOfADayIconXpath()
    {
        return "//a/i[@class='icon-alarmclock']/..";
    }
    
    public static String ButtonQueryLineIconXpath()
    {
        return "//a/i[@class='icon-query-line']/..";
    }
    
    public static String ButtonDriverLogViewXpath()
    {
        return "//a/i[@class='icon-tasks']/..";
    }
    
    public static String ButtonHOSTimeLineXpath()
    {
        return "//a[@fleet-tooltip='HOS timeline']/i/..";
    }
    
    public static String ButtonTimeLineActionButtonXpath()
    {
        return "//a[@fleet-tooltip='Actions']";
    }
    
    public static String HOSTimeLinePageHeadingXpath()
    {
        return "//h5/span[text()='HOS timeline']";
    }
    
    public static String HOSTLogViewerPageHeadingXpath()
    {
        return "//h5/span[text()='HOS Log Viewer']";
    }
    
    public static String OrganisationSelectorXpath()
    {
        return "//div[@class='organisation-selector']/div[@class='miller-selector']";
    }
    
    public static String RefreshLinkTextXpath()
    {
        return "//div/a/i[@class='icon-refresh icon-green']";
    }
    
    //<editor-fold defaultstate="collapsed" desc="GHOS-13 : Select de-select all Events">
    
        public static String ButtonEventXpath()
        {
            return "//a[@fleet-tooltip='Events']/i/..";
        }
        
        public static String EventCountXpath()
        {
            return "//a[@fleet-tooltip='Events']/span";
        }
    
        public static String SelectEventsModalXpath()
        {
            return "//div[@name='timeLineEventsModal'][contains(@style,'block')]";
        }
        
        public static String CheckboxSelectAllXpath()
        {
            return "//table/thead/tr/th/input";
        }
        
        public static String SelectButtonXpath()
        {
            return"//button[text()='Select']";
        }
        
        public static String ButtonSelectXpath()
        {
            return "//div[@name='timeLineEventsModal'][contains(@style,'block')]//button[text()='Select']";
        }
        
        public static String ListEventsXpath()
        {
            return "//div/div[@class='event-series ng-scope']/span";
        }
        
        public static String ListEventCheckBoxesXpath()
        {
            return "//tbody/tr/td[@column-field='description']/div/span";
        }
        
        public static String EventCheckBoxXpath(int x)
        {
            return "//tbody/tr["+x+"]/td[@ng-show='allowRowSelection']/input[@type='checkbox']";
        }
        
        public static String LoadMoreHasDisappearedXpath()
        {
            return "//div[@name='timeLineEventsModal'][contains(@style,'block')]//div[contains(@style,'display: none')]/a[text()='Load more']";
        }
        
        public static String LoadMoreXpath()
        {
            return "//div[@name='timeLineEventsModal'][contains(@style,'block')]//a[text()='Load more']";
        }
        
        public static String SearchDriverIconNotActiveXpath()
        {
            return "//button[@fleet-tooltip='Search driver'][@class='btn btn-small ng-scope']";
        }
        
        public static String WorkStatemenuPopupXpath()
        {
            return "//ul[@id='menuPopup'][contains(@style,'display: block;')][contains(@style,'left: -1000')=false]";
        }
        
        public static String SearchDriverIconXpath()
        {
            return "//button[@fleet-tooltip='Search driver']";
        }
        
    //</editor-fold>
    
        
    //<editor-fold defaultstate="collapsed" desc="GHOS-13 : Select de-select all Events">
        
        public static String DateFormatXpath()
        {
            return "//div[contains(@class,'control-group')]/div[1]";
        }
        
        public static String TimeFormatXpath()
        {
            return "//div[contains(@class,'control-group')]/div[2]";
        }
        
        public static String NumberFormatXpath()
        {
            return "//div[contains(@class,'control-group')]/div[3]";
        }
        
        public static String FormatDropdownListXpath()
        {
            return "//select[@ng-model='userProfile.localeId']";
        }
        
        public static String FormatDropdownListOptionXpath(String chooseCountryFormat)
        {
            return "//select[@ng-model='userProfile.localeId']/option[text()='"+chooseCountryFormat+"']";
        }
        
        public static String getFormatDropdownOptionValueXpath(String optionText)
        {
            return "//select[@ng-model='userProfile.localeId']/option[text()='"+optionText+"']";
        }
        
        public static String SpinnerRegionalSettingsXpath()
        {
            return "//div//div[@class='loading-overlay ng-scope'][@style='display: none;']";
        }
        
        public static String MeasurementUnitsTypeDropdownXpath()
        {
            return "//select[@ng-model='userProfile.measurementType']";
        }
        
        public static String BtnActionDropdownXpath()
        {
            return "//a[@class='btn-actions dropdown-toggle']";
        }
        
        public static String DriverLogReportButtonXpath()
        {
            return "//ul[@class='dropdown-menu actions pull-right']/li/a/span[text()='Driver log report']/..";
        }
        
        public static String MeasurementUnitsTypeOptionDropdownXpath(String TypeOption)
        {
            return "//select[@ng-model='userProfile.measurementType']/option[text()='"+TypeOption+"']";
        }
        
        public static String DatePickerTextboxMainUIXpath()
        {
            return "//div[@class='form-inline pull-left']/div[@type='datetime']/input";
        }
        
        public static String LogViewerHeaderDateTimeXpath()
        {
            return "//div[@id='logContent']/div[@id='logDate']/span[@class='text ng-binding']";
        }
        
        public static String TimelineHEaderDateXpath()
        {
            return "//div[@class='timeline-content ng-scope']/div[@class='current-date']/span[@class='text ng-binding']";
        }
        
        public static String InfoIconXpath()
        {
            return "//a/i[@class='icon-info-sign icon-grey']/..";
        }
        
        public static String InfoPopUpSummaryXpath()
        {
            return "//div[@id='popoverdivHos']/div[@class='popover-inner']/div";
        }
        
        public static String InfoPopUpStartDateXpath()
        {
            return "//div[@id='popoverdivHos']/div[@class='popover-inner']/div[1]/div/label/strong[text()='Start of distance driven:']/../../label[@class='pull-right ng-binding']";
        }
        
        public static String InfoPopUpEndDateXpath()
        {
            return "//div[@id='popoverdivHos']/div[@class='popover-inner']/div[1]/div/label/strong[text()='End of distance driven:']/../../label[@class='pull-right ng-binding']";
        }
        
        public static String EditStatusXpath()
        {
            return "//li/a/i[@class='icon icon-edit icon-green']/..";
        }
        
        public static String DropdownMenuXpath()
        {
            return "//ul['dropdown-menu'][contains(@style,'display: block;')]";
        }
        
        public static String AddLogDataXpath()
        {
            return "//li/a/i[@class='icon icon-plus']/../span[text()='Add log data']/..";
        }
        public static String AddLogDataXpathIE()
        {
            return "//li/a/i[@class='icon icon-plus']/../span[text()='Add log data']/..";
        }
        
        public static String AddStatusXpath()
        {
            if(browserType.equals(browserType.IE)){
                return "//li/a/span[text()='Add status']/../i[@class='icon icon-plus']/..";
            }
            else{
                return "//li[contains(@style,'display: none;') =true]/a/span[text()='Add status']/../i[@class='icon icon-plus']/..";
            }
            
        }
        
        public static String AddStatusXpathIE()
        {
            return "//li/a/span[text()='Add status']/../i[@class='icon icon-plus']/..";
        }
        
        public static String WorkStateXpath()
        {
            return "//div[@class='hos zoomable']/div[@class='us-hos-series-container']/div[1]/div/div/canvas[@class='timeline-canvas']";
        }
        
        public static String Button12Xpath()
        {
            return "//div[@class='form-inline pull-left']/div/button[text()='12h']";
        }
        
        public static String Button24Xpath()
        {
            return "//div[@class='form-inline pull-left']/div/button[text()='24h']";
        }
        
        public static String WorkstateDivXpath()
        {
            return "//div[@class='hos-series canvas-container draggable']/canvas[@class='timeline-canvas']";
        }
        
        public static String WorkStatePopUpTooltipXpath()
        {
            return "//div[@class='ng-scope tooltip timeline-tooltip in']";
        }
        
        public static String WorkStatePopUpStartdateXpath()
        {
            return "//div[@class='ng-scope tooltip timeline-tooltip in']/div[@class='tooltip-inner']//div[@class='hos-tooltip ng-scope']/div/strong[text()='Start date']/..";
        }
        
        public static String TripStateToolTipPopUpStartDateXpath()
        {
            return "//div[@class='ng-scope tooltip timeline-tooltip in']//div/strong[text()='Start date']/..";
        }
        
        public static String TripStateToolTipPopUpEndDateXpath()
        {
            return "//div[@class='ng-scope tooltip timeline-tooltip in']//div/strong[text()='End date']/..";
        }
        
        public static String WorkStatePopUpEndDateXpath()
        {
            return "//div[@class='ng-scope tooltip timeline-tooltip in']/div[@class='tooltip-inner']//div[@class='hos-tooltip ng-scope']/div[contains(@style,'display: none')=true]/strong[text()='End date']/..";
        }
        
        public static String WorkStatePopUpEndDateIEXpath()
        {
            return "//div[@class='ng-scope tooltip timeline-tooltip in']/div[@class='tooltip-inner']//div[@class='hos-tooltip ng-scope']/div/strong[text()='End date']/..";
        }
        
        public static String EditDriverStatusDateTimeXpath()
        {
            return "//div[@name='hosDriverStatusModal'][@aria-hidden='false']//div[@type='datetime']/input";
        }
        
        public static String AddLogDataDateTimeXpath()
        {
            return "//div[@name='logDataModal'][@aria-hidden='false']//div[@type='datetime']/input";
        }
        
        public static String ButtonCancelEditDriverStatusXpath()
        {
            return "//div[@name='hosDriverStatusModal'][@aria-hidden='false']//button[text()='Cancel']";
        }
        
        public static String CancelButtonXpath()
        {
             return"//div[@class='modal hide fade in']/div[@class='modal-footer']/button[@ng-class='buttonClass()'][@text='Cancel']";
        }
        
        public static String ButtonCancelAddLogDataXpath()
        {
            return "//div[@name='logDataModal'][@aria-hidden='false']//button[text()='Cancel']";
        }
        
        public static String LogViewerStatusDateTimeColumnXpath()
        {
            return "//tr/td[@column-field='date']/div/span";
        }
        
        public static String LogViewerInputDataTabXpath()
        {
            return "//div[@id='hosTabs']/ul/li/a[text()='Input data']";
        }
        
        public static String LogViewerInspectionsTabXpath()
        {
            return "//div[@id='hosTabs']/ul/li/a[text()='Inspections']";
        }
        
        public static String LogViewerExemptionsTabXpath()
        {
            return "//div[@id='hosTabs']/ul/li/a[text()='Exemptions']";
        }
        
        public static String LogViewerViolationsTabXpath()
        {
            return "//div[@id='hosTabs']/ul/li/a[text()='Violations']";
        }
        
        public static String TripStateTimeLineXpath()
        {
            return "//div[@class='trip-series-container']//canvas[@class='timeline-canvas']";
        }
        
        public static String HOSLogViewHeaderDateTimeXpath()
        {
            return "//div[@name='hosTimeline']/div/div/span/a/i[@class='icon-chevron-left icon-grey']/../..";
        }
 
   //</editor-fold>
    
        
    //<editor-fold defaultstate="collapsed" desc="GHOS-287 : HOS Notifications">
        public static String HOSNotificationsLinkTextXpath()
        {
            return "//ul/li/a[text()='HOS notifications']";
        }
        
        public static String HOSNotificationPageHeaderXpath()
        {
            return "//div/ul/li/strong[text()='HOS notifications']";
        }
        
        public static String HOSNotificationTableColumnNameXpath()
        {
            return "//div[@name='hosNotificationsGrid']//div[@class='column']/div/span[@class='title'][text()='Notification name']";
        }
        
        public static String ColumnChooserXpath()
        {
            return "//a/i[@class='icon-choose-columns']/..";
        }
        
        public static String SearchFilterXpath()
        {
            return "//div[@class='page-header']//div[@class='pull-right']/div/input";
        }
        
        public static String GridSpinnerXpath()
        {
            return "//div[@class='paged-grid']/div[@style='display: none;'][@class='loading-overlay']";
        }
        
        public static String ButtonAddNotificationsXpath()
        {
            return "//button[@fleet-tooltip='Add HOS notification']";
        }
        
        public static String NotificationDetailsPageXpath()
        {
            return "//div/h5[text()='Notification details']";
        }
        
        public static String AddNotificationPageXpath()
        {
            return "//div/h5/span[text()='Add notification']";
        }
        
        public static String NotificationNameInputFieldXpath()
        {
            return "//input[@name='notificationName']";
        }
        
        public static String DetailsTabAsDefaultXpath()
        {
            return "//li[@class='ng-scope active']/a[text()='Details']";
        }
        
        public static String ButtonCancelAddHOSNotificationXpath()
        {
            return "//button[text()='Cancel']";
        }
        
        public static String ButtonNextAddHOSNotificationXpath()
        {
            return "//button[text()='Next']";
        }
        
        public static String ButtonNextDisabledAddNotificationXpath()
        {
            return "//button[text()='Next'][@disabled='disabled']";
        }
        
        public static String SpinnerForAddNotificationPageXpath()
        {
            return "//div/form/../div[@ng-show='contentLoadingStack && contentLoadingStack.length > 0'][@style='display: none;']";
        }
        
        public static String FieldIsRequiredXpath()
        {
            return "//span[text()='This field is required']";
        }
        
        public static String NotificationNameFieldMaxCharatersXpath()
        {
            return "//span[text()='The entered field must be 100 characters or less']";
        }
        
        public static String NotificationNameAlreadyInUseXpath()
        {
            return "//span[text()='Notification name is already in use']";
        }
        
        public static String NotificationNameAlreadyInUseErrorMsgDisappearXpath()
        {
            return "//span[contains(@style,'display: none;')]/span[text()='Notification name is already in use']";
        }
        
        public static String NotificationNameOneXpath()
        {
            return "//div[@name='hosNotificationsGrid']//div[@class='column']/div/a[@row-index='0']";
        }
        
        public static String EventsCanvasXpath()
        {
            return "//div[1]/div/div[@class='canvas-container']/canvas";
        }
        
        public static String EventDateRageTooltipPopupXpath()
        {
            return "//div[@class='ng-scope tooltip timeline-tooltip in']//div[@class='event-tooltip ng-scope']/div//div/strong[text()='Date range']/..";
        }
        
        public static String TripTooltipCanvasXpath()
        {
            return "//div[@class='trip-series-container']//canvas";
        }
        
        public static String StatusTabDateTimeXpath()
        {
            return "//div[@id='hosGrid']/div/div[@columns='currentpane.hosGridColumns']//table//th/span[text()='Status']/../../../../tbody/tr[1]/td[3]/div/span";
        }
        
        public static String ButtonHOSTimelineXpth()
        {
            return "//a[@fleet-tooltip='HOS timeline']/i/..";
        }
        
        public static String HOSTimeLineSpinnerXpath()
        {
            return "//div[@name='hosTimeline']/div/div[@class='loading-overlay'][contains(@style,'display: none')]";
        }
        
        public static String InspectionsTabXpath()
        {
            return "//ul[@class='nav nav-tabs']/li/a[text()='Inspections']";
        }
        
        public static String ExemptionsTabXpath()
        {
            return "//ul[@class='nav nav-tabs']/li/a[text()='Exemptions']";
        }
        
        public static String ViolationsTabXpath()
        {
            return "//ul[@class='nav nav-tabs']/li/a[text()='Violations']";
        }
        
        public static String InspectionsDateTimeXpath()
        {
            return "//div[@class='tab-content']//div[@ng-repeat='tabpane in tabPanes'][3]//table/tbody/tr/td[2]/div/span";
        }
        
        public static String ExemptionsDateTimeXpath()
        {
            return "//div[@class='tab-content']//div[@ng-repeat='tabpane in tabPanes'][4]//table/tbody/tr/td[2]/div/span";
        }
        
        public static String ViolationsDateTimeXpath()
        {
            return "//div[@class='tab-content']//div[@ng-repeat='tabpane in tabPanes'][5]//table/tbody/tr/td[2]/div/span";
        }
        
        public static String ExemptionsTabActionButtonXpath()
        {
            return "//div[@class='tab-content']//div[@ng-repeat='tabpane in tabPanes'][4]//a[@fleet-tooltip='Actions']";
        }
        //
        public static String EditLogActionButtonXpath()
        {
            return "//ul[@class='dropdown-menu pull-right'][contains(@style,'display: block')]/li/a/i[@class='icon icon-edit icon-green']/..";
        }
        
        public static String EditlogdataDateTimeTextFieldXpath()
        {
            return "//div[@header-title='Edit log data'][@aria-hidden='false']//div[@type='datetime']/input";
        }
        
        public static String EditLogDataButtonCancelXpath()
        {
            return "//div[@header-title='Edit log data'][@aria-hidden='false']//div/button[text()='Cancel']";
        }
        
        //</editor-fold>
        
    //<editor-fold defaultstate="collapsed" desc=" GHOS-126:Cancelling a driver status ADD">   
        public static String AddDriverStatus2ndModalXpath()
        {
            return "//div[@name='hosStatusMapModal'][@aria-hidden='false']";
        }
        
        public static String AddDriverStatusButtonNextXpath()
        {
            return "//div[@name='hosDriverStatusModal'][@aria-hidden='false']//button[text()='Next']";
        }
        
        public static String AddDriverStatusButtonSaveXpath()
        {
            return "//div[@name='hosStatusMapModal'][@aria-hidden='false']//button[text()='Save']";
        }
        
        public static String AddDriverStatusButtonSaveDisabledXpath()
        {
            return "//div[@name='hosStatusMapModal'][@aria-hidden='false']//button[text()='Save'][@disabled='disabled']";
        }
        
        public static String AddDriverStatusDropdownStatusXpath()
        {
            return "//div[@name='hosDriverStatusModal'][@aria-hidden='false']//select[@name='workState']";
        }
        
        public static String AddDriverStatusRemarksTextAreaXpath()
        {
            return "//div[@name='hosDriverStatusModal'][@aria-hidden='false']//textarea[@name='remarks']";
        }
        
        public static String AddDriverStatusButtonCancelXpath()
        {
            return "//div[@name='hosDriverStatusModal'][@aria-hidden='false']//button[text()='Cancel']";
        }
        
        public static String AddDriverStatusButtonCancelDisabledXpath()
        {
            return "//div[@name='hosDriverStatusModal'][@aria-hidden='false']//button[text()='Cancel'][@disabled='disabled']";
        }
        
        public static String AddDriverStatusButtonNextDisabled()
        {
            return "//div[@name='hosDriverStatusModal'][@aria-hidden='false']//button[text()='Next'][@disabled='disabled']";
        }
        
        public static String ButtonClosePopupWindowXpath()
        {
            return "//div[@name='hosDriverStatusModal'][@aria-hidden='false']//button[@class='close']";
        }
        
        public static String AddDriverStatusButtonConfirmXpath()
        {
            return "//div[@name='hosStatusConfirmModal'][@aria-hidden='false']//button[text()='Confirm']";
        }
        
        public static String AddDriverStatusButtonConfirmDisabledXpath()
        {
            return "//div[@name='hosStatusConfirmModal'][@aria-hidden='false']//button[text()='Confirm'][@disabled='disabled']";
        }
        
        public static String ConfirmAddDriverStatusButtonCancelXpath()
        {
            return "//div[@name='hosStatusConfirmModal'][@aria-hidden='false']//button[text()='Cancel']";
        }
        
        public static String ConfirmAddDriverStatusButtonCancelDisabledXpath()
        {
            return "//div[@name='hosStatusConfirmModal'][@aria-hidden='false']//button[text()='Cancel'][@disabled='disabled']";
        }
        
        
        
        public static String AddDriverStatusButtonBackDisabledXpath()
        {
            return "//div[@name='hosStatusMapModal'][@aria-hidden='false']//button[text()='Back'][@disabled='disabled']";
        }
        
        public static String AddDriverStatusButtonBackXpath()
        {
            return "//div[@name='hosStatusMapModal'][@aria-hidden='false']//button[text()='Back']";
        }
        
        public static String AddDriverStatusModalXpath()
        {
            return "//div[@name='hosDriverStatusModal'][@aria-hidden='false']//div/h5/span[text()='Add driver status']";
        }
        
        public static String AddDriverStatusDropdownOptionXpath(String status)
        {
            return "//div[@name='hosDriverStatusModal'][@aria-hidden='false']//div/select/option[text()='"+status+"']";
        }
        
        public static String RemarksTableColumnXpath(String remarksText)
        {
            return "//table/tbody/tr/td/div/span[text()='"+remarksText+"']";
        }
        
   //</editor-fold>
    
        
    //<editor-fold defaultstate="collapsed" desc=" GHOS-206:Removing a log data entry">
        
        public static String HOSLogViewerTableSpinnerXpath()
        {
            return "//div[@ng-repeat='tabpane in tabPanes'][1]/div[@ng-show='currentpane.selected'][1]/div[@id='hosGrid']/div[1]/div[@columns='currentpane.hosGridColumns'][1]//div[@class='fleet-grid full-height has-row-actions'][1]/div[@class='loading-overlay ng-scope'][@style='display: none;'][1]";
        }
        
        public static String InputDataTabXpath()
        {
            return "//ul[@class='nav nav-tabs']/li/a[text()='Input data']";
        }
        
        public static String InputDataTabActiveXpath()
        {
            return "//ul[@class='nav nav-tabs']/li[@class='ng-scope active']/a[text()='Input data']";
        }
        
        public static String AddLogDataModalXpath()
        {
            return "//div[@name='logDataModal'][@aria-hidden='false']";
        }
        
        public static String AddLogDataCategoryDropdownListXpath()
        {
            return "//select[@name='eventDataCategory']";
        }
        
        public static String AddLogDataCategoryDropdownOptionXpath(String OptionText)
        {
            return "//select[@name='eventDataCategory']/option[text()='"+OptionText+"']";
        }
        
        public static String AddLogDataTypeDropdownListXpath()
        {
            return "//select[@name='eventType']";
        }
        
        public static String AddLogDataTypeDropdownOptionXpath(String OptionText)
        {
            return "//select[@name='eventType']/option[text()='"+OptionText+"']";
        }
        
        public static String AddLogDataRemarksTextAreaXpath()
        {
            return "//textarea[@ng-model='logData.remarks']";
        }
        
        public static String EditStatusButtonNextXpth()
        {
            return "//div[@name='hosDriverStatusModal'][@aria-hidden='false']//button[text()='Next']";
        }
        
        public static String EditStatusButtonNextDisabledXpth()
        {
            return "//div[@name='hosDriverStatusModal']//button[text()='Next'][@disabled='disabled']";
        }     
        
        public static String SelectStatusDropdownOptionXpath(String status)
        {
            return "//select[@id='workState']/option[text()='"+status+"']";
        }
        
        public static String StatusDropDownOptionsXpath()
        {
            return "//select[@id='workState']/option[contains(@class,'ng-binding')=false]";
        }
        
        public static String EditStatus2ndModalXpath()
        {
            return "//div[@name='hosStatusMapModal'][@aria-hidden='false']";
        }
        
        public static String EditStatusRemarksTextAreaXpath()
        {
            return "//div[@name='hosDriverStatusModal']//textarea[@name='remarks']";
        }
                
        public static String AddLogDataButtonSaveDisabledXpath()
        {
            return "//div[@name='logDataModal'][@aria-hidden='false']//button[text()='Save'][@disabled='disabled']";
        }
        
        public static String AddLogDataButtonSaveXpath()
        {
            return "//div[@name='logDataModal'][@aria-hidden='false']//button[text()='Save']";
        }
        
        public static String AddLogDataButtonCancelXpath()
        {
            return "//div[@name='logDataModal'][@aria-hidden='false']//button[text()='Cancel']";
        }
        
        public static String AddLogDataButtonConfirmXpath()
        {
            return "//div[@name='logDataConfirmModal'][@aria-hidden='false']//button[text()='Confirm']";
        }
        
        public static String LogDataSavedSuccessfullyNotificationXpath()
        {
            return "//span[text()='Log data saved successfully']";
        }
        
        public static String RemarksLogDataColumnXpath()
        {
            String xpath;
            
            if(browserType==Enums.BrowserType.IE)
             {
                 xpath = "//div[@ng-show='currentpane.selected']//td[@column-field='remarks']/div/span";
             }
            else
            {
                xpath = "//div[@ng-show='currentpane.selected'][@style='']//td[@column-field='remarks']/div/span";
            }
            
            return xpath;
        }
        
        public static String DateLogDataColumnHeaderXpath()
        {
            String xpath;
            
            if(browserType==Enums.BrowserType.IE)
             {
                 xpath = "//div[@ng-show='currentpane.selected']//thead/tr/th[@column-field='date']";
             }
            else
            {
                xpath = "//div[@ng-show='currentpane.selected'][@style='']//thead/tr/th[@column-field='date']";
            }
            
            return xpath;
        }
        
        public static String TypeLogDataColumnHeaderXpath()
        {
            String xpath;
            
            if(browserType==Enums.BrowserType.IE)
             {
                 xpath = "//div[@ng-show='currentpane.selected']//thead/tr/th[@column-field='eventTypeDescription']";
             }
            else
            {
                xpath = "//div[@ng-show='currentpane.selected'][@style='']//thead/tr/th[@column-field='eventTypeDescription']";
            }
            
            return xpath;
        }
        
        public static String RemarksLogDataColumnHeaderXpath()
        {
            String xpath;
            
            if(browserType==Enums.BrowserType.IE)
             {
                 xpath = "//div[@ng-show='currentpane.selected']//thead/tr/th[@column-field='remarks']";
             }
            else
            {
                xpath = "//div[@ng-show='currentpane.selected'][@style='']//thead/tr/th[@column-field='remarks']";
            }
            
            return xpath;
        }
        
        public static String LogDataButtonActionXpath(int x)
        {
            String xpath;
            
            if(browserType==Enums.BrowserType.IE)
             {
                 xpath = "//div[@ng-show='currentpane.selected'][@class='tab-pane']//div/ul/li/strong[text()='Input data']/../../../../..//li[@ng-repeat]["+x+"]/div/div/a[@fleet-tooltip='Actions']";
             }
            else
            {
                xpath = "//div[@ng-show='currentpane.selected'][@style='']//li[@ng-repeat]["+x+"]/div/div/a[@fleet-tooltip='Actions']";
            }
            
            return xpath;
        }
        
        public static String LogDataButtonActionRemoveXpath()
        {
            return "//ul[@class='dropdown-menu pull-right'][contains(@style,'display: block;')]/li/a/span[text()='Remove']";
        }
        
        public static String RemoveReasonTextAreaXapth()
        {
            return "//div[@name='hosRemoveConfirmModal'][@aria-hidden]//textarea";
        }
        
        public static String ConfirmRemoveInputDataModalXpath()
        {
            return "//div[@name='hosRemoveConfirmModal'][@aria-hidden]//h5/span[text()='Remove input data']";
        }
        
        public static String RemoveInputDataButtonCancelXpath()
        {
            return "//div[@name='hosRemoveConfirmModal'][@aria-hidden]//button[text()='Cancel']";
        }
        
        public static String RemoveInputDataButtonCancelDisabledXpath()
        {
            return "//div[@name='hosRemoveConfirmModal'][@aria-hidden]//button[text()='Cancel'][@disabled='disabled']";
        }  
        
        public static String RemoveInputDataButtonRemoveDisabledXpath()
        {
            return "//div[@name='hosRemoveConfirmModal'][@aria-hidden]//button[text()='Remove'][@disabled='disabled']";
        }
        
        public static String RemoveInputDataButtonRemoveXpath()
        {
            return "//div[@name='hosRemoveConfirmModal'][@aria-hidden]//button[text()='Remove']";
        }
        
        public static String LogDataSuccessfullyRemovedXpath()
        {
            return "//span[text()='Log Data successfully removed']";
        }
        
        public static String StatusSuccessfullyRemovedXpath()
        {
            return "//span[text()='Status successfully removed']";
        }
        
        public static String StatusSuccessfullyRemovedDisapearXpath()
        {
            return "//div[@style='display: none;']/div/span[text()='Status successfully removed']/../..";
        }
        
        public static String InputDataTableIsSelectedXpath()
        {
            return "//ul[@class='nav nav-tabs']/li[@class='ng-scope active']";
        }
        
        public static String RemoveThisRemarkLogDataEntryXpth(String textAreaText)
        {
            String xpath;
            
            if(browserType==Enums.BrowserType.IE)
             {
                 xpath = "//div[@ng-show='currentpane.selected']//td[@column-field='remarks']/div/span[text()='"+textAreaText+"']";
             }
            else
            {
                xpath = "//div[@ng-show='currentpane.selected'][@style='']//td[@column-field='remarks']/div/span[text()='"+textAreaText+"']";
            }
            
            return xpath;
        }
        
    //</editor-fold>
        
   //<editor-fold defaultstate="collapsed" desc="  GHOS-224:Regional Units of Measure check">        
    public static String DriverLogReportDistanceDrivenTodayXpath()
    {
        return "//tr[@valign='top']//div[text()='Distance Driven Today']/../../../../../../td[8]/table//tr/td/div";
    }
    
    public static String DriverLogReportIframeById()
    {
        return "ssrsFrame";
    }
    
    public static String DriverLogReportFormbyName()
    {
        return "//form[@name='ReportViewerForm']";
    }
    
    public static String DriverLogReportSpinnerXpath()
    {
        return "//div[@id='ReportViewerControl_AsyncWait_Wait'][contains(@style,'display: none;')]";
    }
    
    public static String DetailedTripPaneXpath()
    {
        return "//pre[@class='ng-binding']";
    }
    
    public static String DetailedTripPaneLoadingXpath()
    {
        return "//pre[text()='Loading...'][@style='display: none;']";
    }
    
    public static String OdometerFieldXpath()
    {
        return "//form[@name='statusMapCrudForm']/table/tbody/tr/td/strong[text()='Odometer']/../../td[2]/span";
    }
    
    public static String DistanceOdometerOnEventTooltipXpath()
    {
        return "//div[@class='ng-scope tooltip timeline-tooltip in']//div/strong[text()='Distance']/..";
    }
    
    public static String DistanceOdometerOnWorkStateTooltipXpath()
    {
        return "//div[@class='ng-scope tooltip timeline-tooltip in']//div/strong[text()='Distance']/../../div[6]";
    }
    
    public static String StartOdometerOnWorkstateTooltipXpath()
    {
        return "//div[@class='hos-tooltip ng-scope']/div/strong[text()='Start ODO']/..";
    }
    
    public static String DrivingDistanceInfoBubbleXpath()
    {
        return "//div[@class='popover toolbarInfo fade bottom in']//div[4]/label[@class='pull-right ng-binding']/..";
    }
    
    public static String EditStatusButtonBackXpath()
    {
        return "//div[@name='hosStatusMapModal'][@aria-hidden='false']//button[text()='Back']";
    }
    
    
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" GHOS-125:Adding a driver status (Happy Path)">
        public static String breadcrumbText()
        {
            return "//div[@class='miller-selector']/a";
        }
        
        public static String DriverNameInputBoxXpth()
        {
            return "//div[@name='hosDriverStatusModal'][@aria-hidden='false']//input[@name='driverName']";
        }
        
        public static String DateTimeLabelXpath()
        {
            return "//div[@name='hosDriverStatusModal'][@aria-hidden='false']//div[@id='driverStatusDateTime']/label";
        }
        
        public static String SiteNameFromBreadCrumForDriverXpath()
        {
            return "//div[@class='miller-selector-modal-container white-box-shadow ng-scope in']//div[@class='column-container']/div[4]/div/a[@class='ng-scope active selected']";
        }
        
        public static String workStateStatusDropdownOptionXpath(String value)
        {
            return "//div[@name='hosDriverStatusModal'][@aria-hidden='false']//select[@name='workState']/option[@value='"+value+"']";
        }
        
        public static String ChangeAssetLinkTextXpath()
        {
            return "//div[@name='hosDriverStatusModal'][@aria-hidden='false']//a[text()='Change asset']";
        }
        
        public static String AssetInputFieldXpath()
        {
            return "//div[@name='hosDriverStatusModal'][@aria-hidden='false']//div[@class='driverStatusAutoComplete']/span/input";
        }
        
        public static String AssetInputFieldDisabledXpath()
        {
            return "//div[@name='hosDriverStatusModal'][@aria-hidden='false']//input[@name='assetName']";
        }
        
        public static String AssetAutoCompleteDropdown(String assetName)
        {
            return "//li/a/strong[text()='"+assetName+"']/..";
        }
        
        public static String AddDriverStatusSummaryXpath(int tr)
        {
            return "//form[@name='statusMapCrudForm']/table/tbody/tr["+tr+"]/td[2]";
        }
        
        public static String ConfirmChangesAddDriverStatusModal(int tr)
        {
            return "//div[@name='hosStatusConfirmModal']//table/tbody/tr["+tr+"]/td[1]";
        }
        
        public static String ButtonAddStatusEventXpath()
        {
            return "//div[@ng-show='currentpane.selected']//a[@fleet-tooltip='Add status event']";
        }
        
        public static String StatusColumnXpath()
        {
            return "//tbody/tr/td[@column-field='status']";
        }
        
        public static String RemarksColumnXpath(int x)
        {
            return "//tr["+x+"]/td[@column-field='remarks']";
        }
        
        public static String DateColumnXpath(int x)
        {
            return "//tr["+x+"]/td[@column-field='date']";
        }
        
        public static String StatusColumnXpath(int x)
        {
            return "//tr["+x+"]/td[@column-field='status']";
        }
        
        public static String ButtonActionStatusXpath(int index)
        {
            return "//li[@ng-repeat='row in limitedRows']["+index+"]/div[@column='rowActions']/div/a[@class='btn-actions']";
        }
        
        public static String ButtonActionRemoveStatusXpath()
        {
            if(browserType.equals(browserType.IE)){
                return "//ul[@class='dropdown-menu pull-right'][contains(@style,'display: block;')]/li/a/i[@class='icon icon-remove-sign icon-red']/..";
            }
            else{
                return "//ul[@class='dropdown-menu pull-right'][contains(@style,'display: block;')]/li/a/i[@class='icon icon-remove-sign icon-red']/..";
            }            
        }
        
        public static String ChangeAssetInputFieldXpath()
        {
            return "//div[@name='hosDriverStatusModal']//input[@name='assetName'][@disabled='disabled'][@style='display: none;']";
        }
        
    //</editor-fold>
        
    //<editor-fold defaultstate="collapsed" desc=" GHOS-140 :  Navigating To TimeClock">
        public static String HOSTimeClockConfigurationFormXpath()
        {
            return "//form[@name='userSettingsForm']";
        }
        
        public static String HOSTimeClockOrganisationFilterXpath()
        {
            return "//form[@name='userSettingsForm']/div//div[@class='driverStatusAutoComplete']/input[@ng-model='orgFilter']";
        }
        
        public static String HOSTimeClockLocationFilterXpath()
        {
            return "//form[@name='userSettingsForm']/div//span[@id='timeclock-location']/input[@ng-model='locationFilter']";
        }
        
        public static String HOSTimeClockDriverTimeOutTextFieldXpath()
        {
            return "//form[@name='userSettingsForm']/div/div/div/input";
        }
        
        public static String HOSTimeClockButtonLaunchDisabledXpath()
        {
            return "//form[@name='userSettingsForm']//button[text()='Launch'][@disabled='disabled']";
        }
        
        public static String HOSTimeClockButtonLaunchXpath()
        {
            return "//form[@name='userSettingsForm']//button[text()='Launch']";
        }
        
        public static String HOSTimeClockButtonCancelXpath()
        {
            return "//form[@name='userSettingsForm']//button[text()='Cancel']";
        }
        
        public static String HOSTimeClockBreadCrumBarTextXpath()
        {
            return "//div[@id='sub-menu']//h5/span[text()='HOS Timeclock']";
        }
        
        public static String HOSTimeClockLocationDropdownXpath(String text1,String text2)
        {
            return "//form[@name='userSettingsForm']/div//span[@id='timeclock-location']/ul/li/a/strong[contains(text(),'"+text2+"')]";
        }
        
        public static String HOSTimeClockDriverLogInFormXpath()
        {
            return "//form/h3[text()='Login']/..";
        }
        
        public static String HOSTimeClockDriverLogInSelectedOrganizationXpath(String organisation)
        {
            return "//div[@ng-controller='DriverLoginController']/div/h3[text()='"+organisation+"']";
        }
        
        public static String HOSTimeClockInputDataTableActionButtonXpath()
        {
            return "//div[@class='tab-content']//div[@ng-repeat='tabpane in tabPanes'][2]//a[@fleet-tooltip='Actions']";
        }
        
        public static String HOSTimeClockActionButtonHallOptionsXpath()
        {
            return "//ul[@class='dropdown-menu pull-right'][contains(@style,'display: block')]/li/a/i[@class='icon icon-edit icon-green']/../../..";
        }
        
        public static String NoOfInputDataLogsXpath()
        {
            return "//div[@ng-show='currentpane.selected'][@style='']//ul/li/span";
        }
        
        public static String ButtonAddLogDataToolTipTextXpath()
        {
            return "//div[@class='ng-scope tooltip left in']/div/span[text()='Add log data']";
        }
        
        public static String ButtonAddlogDataXpath()
        {
            return "//div[@class='tab-content']//div[@ng-repeat='tabpane in tabPanes'][2]//a[@fleet-tooltip='Add log data']";
        }
        
        public static String ButtonActionsTooltipXpath()
        {
            return "//div[@class='ng-scope tooltip left in']/div/span[text()='Actions']";
        }       
        
   //</editor-fold>
        
    
        public static String DriversLoadingSpinnerXpath()
        {
            return "//div[@class='paged-grid']/div[@class='loading-overlay'][@style='display: none;']";
        }
        
        public static String DriverCurrentStatusColumnHeaderXpath()
        {
            return "//div[@class='paged-grid']/div//div/span[@class='title'][text()='Current status']";
        }
        
        public static String DriverCurrentStatusDurationColumnHeaderXpath()
        {
            return "//div[@class='paged-grid']/div//div/span[@class='title'][text()='Current status duration']";
        }
        
        public static String DriverStartDateAndTimeColumnHeaderXpath()
        {
            return "//div[@class='paged-grid']/div//div/span[@class='title'][text()='Start date & time']";
        }
        
        public static String DriverDailyAvailableDrivingColumnHeaderXpath()
        {
            return "//div[@class='paged-grid']/div//div/span[@class='title'][text()='Daily available driving']";
        }
        
        public static String DriverAvailableDrivingBeforeBreakColumnHeaderXpath()
        {
            return "//div[@class='paged-grid']/div//div/span[@class='title'][text()='Available driving before break']";
        }
        
        public static String DriverWeeklyAvailableDrivingColumnHeaderXpath()
        {
            return "//div[@class='paged-grid']/div//div/span[@class='title'][text()='Weekly available driving']";
        }
        
        public static String DriverColumnChooserXpath()
        {
            return "//div[@name='driverListGrid']//div/div//a/i[@class='icon-choose-columns']";
        }
        
        public static String ColumnchooserAvailableDrivingBeforeBreakXpath()
        {
            return "//ul[contains(@style,'display: block;')]/li/a[@column-field='hosAvailableHours.Availabledrivingbeforebreak']";
        }
        
        public static String ColumnChooserCurrentStatusXpath()
        {
            return "//ul[contains(@style,'display: block')]/li/a[@column-field='hosAvailableHours.currentStatus']";
        }
        
        public static String ColumnChooserCurrentStatusDurationXpath()
        {
            return "//ul[contains(@style,'display: block')]/li/a[@column-field='hosAvailableHours.currentStatusDurationMinutes']";
        }
        
        public static String ColumnChooserDailyAvailableDrivingXpath()
        {
            return "//ul[contains(@style,'display: block;')]/li/a[@column-field='hosAvailableHours.Dailyavailabledriving']";
        }
        
        public static String ColumnChooserWeeklyAvailableDrivingXpath()
        {
            return "//ul/li/a[@column-field='hosAvailableHours.Weeklyavailabledriving']";
        }
        
        public static String ColumnChooserStartDateTimeXpath()
        {
            return "//ul/li/a[@column-field='hosAvailableHours.currentStatusDateTime']";
        }
        
        public static String DriverTDCurrentStatusDurationXpath()
        {
            return "//div[@class='paged-grid']/div//div/span[@class='title'][text()='Current status duration']/../../div[contains(@class,'cell')]";
        }
        
        public static String DriverTDDailyAvailableDrivingXpath()
        {
            return "//div[@class='paged-grid']/div//div/span[@class='title'][text()='Daily available driving']/../../div[contains(@class,'cell')]";
        }
        
        public static String DriverTDWeeklyAvailableDrivingXpath()
        {
            return "//div[@class='paged-grid']/div//div/span[@class='title'][text()='Weekly available driving']/../../div[contains(@class,'cell')]";
        }
        
        public static String DriverTDAvailableDrivingBeforeBreakXpath()
        {
            return " //div[@class='paged-grid']/div//div/span[@class='title'][text()='Available driving before break']/../../div[contains(@class,'cell')]";
        }
        
        public static String DriverTDNameColumnXpath()
        {
            return "//div[@class='paged-grid']/div//div/span[@class='title'][text()='Name']/../../div[contains(@class,'cell')]";
        }
        
        public static String DriverTDCurrentStatusXpath()
        {
            return "//div[@class='paged-grid']/div//div/span[@class='title'][text()='Current status']/../../div[contains(@class,'cell')]";
        }
        
        public static String NoItemsToDisplayHiddenDriverGridXpath()
        {
            return "//div[@class='paged-grid']/div[@style='display: none;']/span[text()='No items to display']";
        }
        
        public static String NoItemsToDisplayDriversGridXpath()
        {
            if(browserType.equals(browserType.IE)){
                return "//div[@class='paged-grid']/div/span[text()='No items to display']";
            }else{
            return "//div[@class='paged-grid']/div[contains(@style,'display: none;')=false]/span[text()='No items to display']";
            }
        }
        
        public static String DriverSearchTextFieldXpath()
        {
            return "//div[@class='page-header']/div[@class='pull-right']/div/input";
        }
        
        public static String DriverButtonSearchXpath()
        {
            return "//div[@class='page-header']/div[@class='pull-right']/div/a/i[@class='icon-search']/..";
        }
        
        public static String DriverButtonClearTextXpath()
        {
            return "//div[@class='page-header']/div[@class='pull-right']/div/a/i[@class='icon-remove-sign']/..";
        }
        
        public static String DriverButtonClearTextHiddenXpath()
        {
            return "//div[@class='page-header']/div[@class='pull-right']/div/a[@style='display: none;']/i[@class='icon-remove-sign']/..";
        }
        
        public static String DriverLinkRefreshXpath()
        {
            return "//a/i[@class='icon-refresh icon-green']/..";
        }
        
        public static String DriverColumnXpath(String columnNo){
            return "//div[@class='paged-grid']/div//div//div[@class='column']["+columnNo+"]//span";
        }
        
        public static String NotDrivingFilterXpath()
        {
            return "//div/ul[@name='driverListItemTypeFilter']/li/a/span[text()='Not driving']/..";
        }
        
        public static String NotDrivingFilterCounterXpth()
        {
            return "//div/ul[@name='driverListItemTypeFilter']/li/a/span[text()='Not driving']/../span[@class='pull-right badge badge-grey ng-binding']";
        }
        
        public static String DrivingFilterXpath()
        {
            return "//div/ul[@name='driverListItemTypeFilter']/li/a/span[text()='Driving']/..";
        }
        
        public static String DrivingFilterCounterXpath()
        {
            return "//div/ul[@name='driverListItemTypeFilter']/li/a/span[text()='Driving']/../span[@class='pull-right badge badge-grey ng-binding']";
        }
        
        public static String DriverNameColumnHeaderXpath()
        {
            return "//div[@class='paged-grid']/div//div/span[@class='title'][text()='Name']/..";
        }
        
        public static String DatePickerIconXpath()
        {
            return "//div[@name='hosDriverStatusModal'][@aria-hidden='false']//div[@type='datetime']/span/i";
        }
        
        public static String DatePickerIcon2Xpath()
        {
            return "//span[@class='add-on btn']/i[@class='icon-calendar']";
        }
        
        public static String DatePickerMonthXpath()
        {
            return "//div[@class='datepicker-widget in']/div[@class='display']/div[@class='date']/div[@class='month-of-year ng-binding'][@ng-class='{ selected: directive.isMonthSelector }'][@ng-click='directive.changeToMonthSelector()']";
        }
        
        public static String DatePickerMonthSelectXpath(String mon)
        {
            return "//div[@ng-class='directive.monthClass(month)'][text()='"+mon+"']";
        }
        
        public static String DatePickerDayXpath(String day)
        {
            return "//div[@class='current-days']/div[text()='"+day+"']";
        }
        
        public static String DatePickerDoneXpath()
        {
            return "//div[@class='datepicker-widget in']/div[@class='done']/a[@ng-click='directive.done()'][@class='ng-binding'][text()='Done']";
        }
        
        public static String DatePickerHourXpath()
        {
            return "//div[@class='datepicker-widget in']/div[@class='display']/div[@class='time']/div[@class='hours ng-binding']";
        }
        
        public static String DatePickerHourSelectXpath()
        {
            return "//div[@class='datepicker-widget in']/div[@class='control']/div[@class='hour-selector zoomable']/div[@class='clock ng-scope']/div[@class='inner-circle']/div[text()='07']";
        }
        
        public static String DatePickerMinutesXpath()
        {
            return "//div[@class='datepicker-widget in']/div[@class='display']/div[@class='time']/div[@class='minutes ng-binding']";
        }
        
        public static String DatePickerMinutesSelectXpath()
        {
            return "//div[@class='datepicker-widget in']/div[@class='control']/div[@class='minute-selector zoomable']/div[@class='clock ng-scope']/div[@class='outer-circle']/div[text()='00']";
        }
        
        public static String DatePickerWindowXpath()
        {
            return "//div[@class='datepicker-widget in'][@aria-hidden='false']";
        }
        
        public static String FirstDayOfTheMonthXpath()
        {
            return "//div[@class='datepicker-widget in'][@aria-hidden='false']/div[@class='control']/div//div[@class='current-days']/div[text()='1']";
        }
        
        public static String HoursTimePickerXpath()
        {
            return "//div[@class='datepicker-widget in'][@aria-hidden='false']/div//div[@class='time']/div[@class='hours ng-binding']";
        }
        
        public static String PickHourTimepickerXpath()
        {
            return "//div[@class='datepicker-widget in'][@aria-hidden='false']/div//div[@class='time']/../..//div[@class='clock ng-scope']/div[@class='inner-circle']/div[contains(@class,'selected')=false][1]";
        }
        
        public static String PickHourTimepickerIE1Xpath()
        {
            return "//div[@class='datepicker-widget in'][@aria-hidden='false']/div//div[@class='time']/../..//div[@class='clock ng-scope']/div[@class='inner-circle']/div[@class='ng-scope ng-binding p1'][1]";
        }
        
        public static String PickHourTimepickerIE2Xpath()
        {
            return "//div[@class='datepicker-widget in'][@aria-hidden='false']/div//div[@class='time']/../..//div[@class='clock ng-scope']/div[@class='inner-circle']/div[@class='ng-scope ng-binding p2'][1]";
        }
        
        public static String EventsPopUpXpath()
        {
            return "//div[@class='ng-scope tooltip timeline-tooltip in']";
        }
        
        public static String getMinutesTimePickerXpath()
        {
            return "//div[@class='datepicker-widget in'][@aria-hidden='false']/div//div[@class='time']/div[@class='minutes ng-binding']";
        }
        
        public static String ButtonDoneDatePickerXpath()
        {
            return "//div[@class='datepicker-widget in'][@aria-hidden='false']/div[@class='done']/a";
        }
        
        public static String getDayOfTheMonthXpath()
        {
            return "//div[@class='datepicker-widget in'][@aria-hidden='false']/div[@class='display']/div/div[@class='day-of-month ng-binding']";
        }
        
        public static String getHoursDatePickerXpath()
        {
            return "//div[@class='datepicker-widget in'][@aria-hidden='false']/div[@class='display']/div/div[@class='hours ng-binding selected']";
        }
        
        public static String DateTimePickerHOSTimelineXpath()
        {
            return "//div[@class='form-inline pull-left']/div[@type='datetime']/input/../span/i[@class='icon-calendar']";
        }
        
        public static String DateTimePickerMonthXpath()
        {
            return "//div[@class='datepicker-widget in']/div/div[@class='date']/div[@class='month-of-year ng-binding']";
        }
        
        public static String DatePickerChooseMonthXpath(String month)
        {
            return "//div[@class='datepicker-widget in']/div/div[@class='month-selector zoomable']/div/div[text()='"+month+"']";
        }
        
        public static String rightPaneSpinnerXpath()
        {
            return "//div[@class='right-pane']//div[contains(@class, 'loading-overlay')][@style='display: none;']";
        }

        public static String leftPaneSpinnerXpath()
        {
            return "//div[@class='left-pane']//div[contains(@class, 'loading-overlay')][@style='display: none;']";
        }
        
        public static String DatePickerDayXpath()
        {
            return "//div[@class='datepicker-widget in']/div/div[@class='date']/div[@class='day-of-month ng-binding']";
        }
        
        public static String DatePickerChooseDayXpath(String day)
        {
            return "//div[@class='datepicker-widget in']/div[@class='control']//div/div/div[text()='"+day+"']";
        }
         public static String DatePickerTimeHoursXpath()
        {
            return "//div[@class='datepicker-widget in']/div/div[@class='time']/div[@class='hours ng-binding']";
        }
          public static String DatePickerTimeChooseHoursSelectedXpath(String hours)
        {
            return "//div[@class='datepicker-widget in']/div/div[@class='hour-selector zoomable']/div/div/div[@class='ng-scope ng-binding p"+hours+" selected']";
        }
          
        public static String DatePickerTimeChooseHoursXpath(String hours)
        {
            return "//div[@class='datepicker-widget in']/div/div[@class='hour-selector zoomable']/div/div/div[@class='ng-scope ng-binding p"+hours+"']";
        }

        public static String DatePickerTimeMinutesXpath()
        {
            return "//div[@class='datepicker-widget in']/div/div[@class='time']/div[@class='minutes ng-binding']";
        }
        
        
        public static String DatePickerTimeChooseMinutesSelectedXpath(String minutes)
        {
            return "//div[@class='datepicker-widget in']/div/div[@class='minute-selector zoomable']/div/div/div[@class='ng-scope ng-binding p"+minutes+" selected']";
        }
        
        
        public static String DatePickerTimeChooseMinutesXpath(String minutes)
        {
            return "//div[@class='datepicker-widget in']/div/div[@class='minute-selector zoomable']/div/div/div[@class='ng-scope ng-binding p"+minutes+"']";
        }
        
        public static String DatePickerDoneBtnXpath()
        {
            return "//div[@class='datepicker-widget in']/div[@class='done']/a[text()='Done']";
        }
        
        public static String ChangeDriverLinkTextXpath()
        {
            return "//div[@class=\"control-group\"]/a[text()='Change driver']";
        }
        
        public static String DriverNameTextBoxDisabledXpath()
        {
            return "//div[@name='hosDriverStatusModal']//div[@class=\"control-group\"]/input[@name='driverName'][@disabled='disabled'][@style='display: none;']";
        }
        
        public static String DriverNameTextBoxEditableXpath()
        {
            return "//div[@name='hosDriverStatusModal']//div[@class=\"control-group\"]/div[@class='driverStatusAutoComplete']/input";
        }
        
        public static String AssetNameTextBoxDisabledXpath()
        {
            return "//div[@name='hosDriverStatusModal']//div[@class='control-group']/input[@name='assetName'][@disabled='disabled'][@style='display: none;']";
        }
        
        public static String AssetNameTextBoxEditableXpath()
        {
            return "//div[@name='hosDriverStatusModal']//div[@class='control-group']/label[@for='assetName']/../div[@class='driverStatusAutoComplete']/span/input";
        }
                
        public static String DriverNameMatchDropdownOptionXpath()
        {
            return "//div[@name='hosDriverStatusModal']//div[@class='control-group']/label[@for='driverName']/../div[@class='driverStatusAutoComplete']/ul/li[@class='ng-scope'][1]/a";
        }
        
        public static String DriverUlDropdownlistXpath()
        {
            return "//div[@name='hosDriverStatusModal']//div[@class='control-group']/label[@for='driverName']/../div[@class='driverStatusAutoComplete']/ul";
        }
        
        public static String AssetUlDropdownListXpath()
        {
            return "//div[@name='hosDriverStatusModal']//div[@class='control-group']/div[@class='driverStatusAutoComplete']/span/ul[contains(@style,'display: block;')]";
        }
        
        public static String AssetNameMatchDropdownOptionXpath()
        {
            return "//div[@name='hosDriverStatusModal']//div[@class='control-group']/div[@class='driverStatusAutoComplete']/span/ul/li[@class='ng-scope'][1]/a";
        }
        
        public static String RemarksTextAreaXpath()
        {
            return "//div[@name='hosDriverStatusModal']//div/textarea[@name='remarks']";
        }
        
        public static String RemarksTableColumnXpath()
        {
            return "//div[@name='hosStatusMapModal'][@aria-hidden='false']//div/form/table/tbody/tr[5]/td[2]";
        }
        
        public static String AssetNameIsNotRequiredFieldXpath()
        {
            return "//div[@name='hosDriverStatusModal']//div[@class='control-group']/label[@for='assetName']/span[@class='field-mandatory'][@style='display: none;']";
        }
}