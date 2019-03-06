package KeywordDrivenTestFramework.Testing.PageObjects;

import static KeywordDrivenTestFramework.Core.BaseClass.currentEnvironment;

/**
 *
 * @author YP Duma
 */
public class ServerSideEventPageObj
{
    public static String MixTelematicsURL() {
        return currentEnvironment.PageUrl;
    }
    

    public static String ServerSideEventLinkTextXpath()
    {
        return "//ul/li/a[text()='Server-side events']";
    }
    
    public static String ActiveFilterXpath()
    {
        return "//li[@class='ng-scope tab-top active']/a/span[text()='Active']";
    }
    
    public static String activeFilterTabXpath()
    {
        return "//li[@class='ng-scope tab-top']/a/span[text()='Active']";
    }
    
    public static String ActiveFilterNoOfEventsXpath()
    {
        return "//li[contains(@class,'active')]/a/span[@class='pull-right badge badge-grey ng-binding']";
    }
    public static String activeTabNoOfEventsXpath()
    {
        return "//li[contains(@class,'ng-scope tab-top')]/a/span[@class='pull-right badge badge-grey ng-binding']";
    }
    
    public static String filterNoOfEventsXpath(String text)
    {
        return "//li[contains(@class,'ng-scope')]/a/span[text()='"+text+"']/../span[@class='pull-right badge badge-grey ng-binding']";
    }
    
    public static String CurrentActiveFilterNoOfEventsXpath()
    {
        return "//li[contains(@class,'active')]/a/span[@class='pull-right badge badge-grey ng-binding']";
    }
    
    public static String GridActiveFilterNameXpath()
    {
        return "//div[@class='page-header']/ul/li/strong";
    }
    
    public static String GridActiveFilterEventTotalNumberXpath()
    {
        return "//div[@class='page-header']/ul/li/span";
    }
    
    public static String welcomeUserProfileXpath()
    {
        return "//div[@class='login-name']/strong";
    } 
    
    public static String EventNameColumnXpath()
    {
        return "//div[@class='column']/div/span[text()='Event name']";
    }
    
    public static String FirstEventXpath()
    {
        return "//div[@class='column']/div/span[text()='Event name']/../../div/a[@row-index='0']";
    }
    
    public static String EditEventLabelXpath()
    {
        return "//div[@class='page-header-jm']/h5/span[text()='Edit event:']";
    }
    
    public static String EventNameLabelXpath()
    {
        return "//div[@class='page-header-jm']/h5/span[contains(@class, 'font-normal')]";
    }
    
    public static String CurrentActiveFilterXpath()
    {
        return "//li[contains(@class,'active')]";
    }
    public static String currentActiveTabFilterXpath()
    {
        return "//li[contains(@class,'tab-top')]";
    }
    
    public static String EmptyGridXpath()
    {
        return "//div/span[text()='No items to display']";
    }
    
    public static String SelectedOrgNameXpath()
    {
        return "//div/a[@class='ng-scope active selected']/span[@bind-once]";
    }
    
    public static String ButtonCancel_breadcrumXpath()
    {
        return "//a[text()='Cancel']";
    }
    
    public static String DurationAtLocationFilterXpath()
    {
        return "//ul[@name='serverSideEventTypeFilter']/li/a/span[text()='Duration at location']/..";
    }
    
    public static String MixTelematicsLogoXpath()
    {
        return "//div[@class='brand']/a/img/..";
    }
    
    public static String ButtonAddServerSideEventXpath()
    {
        return "//a[@fleet-tooltip='Add server-side event']/i/..";
    }
    
    public static String ButtonExportServerSideEventXpath()
    {
        return "//button[@fleet-tooltip='Export server-side events']";
    }
    
    public static String RefreshXpath()
    {
        return "//a/span[text()='Refresh']";
    }
    
    public static String LocationEntryExitFilterXpath()
    {
        return "//ul[@name='serverSideEventTypeFilter']/li/a/span[contains(text(),'Location entry')]/..";
    }
    
    public static String LocationStartedStopXpath()
    {
        return "//ul[@name='serverSideEventTypeFilter']/li/a/span[contains(text(),'Location started')]/..";
    }
    
    public static String MovementAlertXpath()
    {
        return "//ul[@name='serverSideEventTypeFilter']/li/a/span[contains(text(),'Movement alert')]/..";
    }
    
    public static String OverSpeedInLocationXpath()
    {
        return "//ul[@name='serverSideEventTypeFilter']/li/a/span[contains(text(),'Over-speed')]/..";
    }
    
    public static String RoadspeedOverSpeedingXpath()
    {
        return "//ul[@name='serverSideEventTypeFilter']/li/a/span[contains(text(),'Roadspeed')]/..";
    }
    
    public static String InactiveFilterXpath()
    {
        return "//ul[@name='serverSideEventTypeFilter']/li/a/span[contains(text(),'Inactive')]/..";
    }
    
    public static String Active_FilterXpath()
    {
        return "//ul[@name='serverSideEventTypeFilter']/li/a/span[contains(text(),'Active')]/..";
    }
    
    public static String SearchFilterXpath()
    {
        return "//div[contains(@class,'text-filter')]/input";
    }
    
    public static String getFirstEventType()
    {
        return "//div/div/span[text()='Event type']/../../div/../../div/div/../../div[2]/div[@row='0'][1]";
    }
    
    public static String ButtonSearchXpath()
    {
        return "//div[contains(@class,'text-filter')]/a[@class='btn btn-small']";
    }
    
    public static String EventTypeDurationXpath(String EventType)
    {
        return "//div/div/span[text()='Event type']/../../div/../../div/div/../../div[2]/div[@row='0'][1][text()='"+EventType+"']";
    }
    
    public static String ColumnEventNameXpath()
    {
        return "//div/div/span[text()='Event name']";
    }
    
    public static String ColumnSortAscedingXpath()
    {
        return "//div/div[@class='column-heading sortable sorted-asc']/span[text()='Event name']/..";
    }
    
    public static String ColumnSortDescendingXpath()
    {
        return "//div/div[@class='column-heading sortable sorted-desc']/span[text()='Event name']/..";
    }
    
    public static String ColumnEventTypeSortAscXpath()
    {
        return "//div/div[@class='column-heading sortable sorted-asc']/span[text()='Event type']/..";
    }
    
    public static String ColumnEventTypeSortDescXpath()
    {
        return "//div/div[@class='column-heading sortable sorted-desc']/span[text()='Event type']/..";
    }
    
    public static String EventTypeColumnNameXpath()
    {
        return "//div/div/span[text()='Event type']";
    }
    
    public static String RecordColumnNameXpath()
    {
        return "//div/div/span[text()='Record']";
    }
    
    public static String RecordDescendingOrderXpath()
    {
        return "//div/div[@class='column-heading sortable sorted-desc']/span[text()='Record']/..";
    }
    
    public static String RecordAscendingOrderXpath()
    {
        return "//div/div[@class='column-heading sortable sorted-asc']/span[text()='Record']/..";
    }
    
    public static String AssetsColumnNameXpath()
    {
        return "//div/div/span[text()='Assets']";
    }
    
    public static String AssetsAscendingOrderXpath()
    {
        return "//div/div[@class='column-heading sortable sorted-asc']/span[text()='Assets']/..";
    }
    
    public static String AssetsDescendingOrderXpath()
    {
        return "//div/div[@class='column-heading sortable sorted-desc']/span[text()='Assets']/..";
    }
    
    public static String DriversColumnNameXpath()
    {
        return "//div/div/span[text()='Drivers']";
    }
    
    public static String DriversAscendingOrderXpath()
    {
        return "//div/div[@class='column-heading sortable sorted-asc']/span[text()='Drivers']/..";
    }

    
    public static String DriversDescendingOrderXpath()
    {
        return "//div/div[@class='column-heading sortable sorted-desc']/span[text()='Drivers']/..";
    }
    
    public static String FrequencyColumnNameXpath()
    {
        return "//div/div/span[text()='Frequency']";
    }
    
    public static String FrequencyAscendingOrderXpath()
    {
        return "//div/div[@class='column-heading sortable sorted-asc']/span[text()='Frequency']/..";
    }
    
    public static String FrequencyDescendingOrderXpath()
    {
        return "//div/div[@class='column-heading sortable sorted-desc']/span[text()='Frequency']/..";
    }
    
    public static String LastEditByColumnNameXpath()
    {
        return "//div/div/span[text()='Last edit by']";
    }
    
    public static String LastEditByAscendingOrderXpath()
    {
        return "//div/div[@class='column-heading sortable sorted-asc']/span[text()='Last edit by']/..";
    }
    
    public static String LastEditByDescendingOrderXpath()
    {
        return "//div/div[@class='column-heading sortable sorted-desc']/span[text()='Last edit by']/..";
    }
    
    public static String LastEditTimeColumnNameXpath()
    {
        return "//div/div/span[text()='Last edit time']";
    }
    
    public static String LastEditTimeAscendingOrderXpath()
    {
        return "//div/div[@class='column-heading sortable sorted-asc']/span[text()='Last edit time']/..";
    }
    
    public static String LastEditTimeDescendingOrderXpath()
    {
        return "//div/div[@class='column-heading sortable sorted-desc']/span[text()='Last edit time']/..";
    }
    
    public static String GridLoadingSpinnerXpath()
    {
        return "//div[@name='serverSideEventListGrid']/div[2][@style='display: none;']";
    }
    
    public static String ClearFilterXpath()
    {
        return "//div[@class='text-filter']/a/i[@class='icon-remove-sign']/..";
    }
    
    public static String TooltipAddServerSideEventXpath()
    {
        //return "//div[@class='ng-scope tooltip left in']/div/span";
        return "//*[local-name()]/span[text()='Add server-side event']";
    }
    
    public static String ToolTipAddServersideEventXpath()
    {
        return "//div/div/span[contains(text(),'Add server-side event')]";
    }
    
    public static String testXpath()
    {
        return "//div/div/span";
        //return "//div/div/span";
    }
    
    public static String test2Xpath()
    {
        return "//div/div/span[@class=\"simple-tooltip-content ng-scope ng-binding\" and text()='Add server-side event']";
    }
    
    public static String ToolTipExportServersideEventsXpath()
    {
        return "//*[local-name()]/span[text()='Export server-side events']";
    }
    
    public static String CreateNewEventXpath()
    {
        return "//div[@class='page-header-jm']/h5/span[text()='Create new event']";
    }
    
    public static String EventNameInputFieldXpath()
    {
        return "//input[@name='eventName']";
    }
    
    public static String RecordEventLabelXpath()
    {
        return "//label[text()='Record event for']";
    }
    
    public static String ButtonCancelXpath()
    {
        return "//div/a/span[text()='Cancel']";
    }
    
    public static String RemoveEventPopUpwindowXpath()
    {
        return "//div[contains(text(),'Are you sure you want to remove the server-side event ')]/strong";
    }
    
    public static String RemoveCancelButtonXpath()
    {
        return "//div[contains(text(),'Are you sure you want to remove the server-side event ')]/../../../../../div//button[text()='Cancel']";
    }
    
    public static String RemoveButtonRemoveXpath()
    {
        return "//div[contains(text(),'Are you sure you want to remove the server-side event ')]/../../../../../div//button[text()='Remove']";
    }

    public static String ActionButtonXpath()
    {
        return "//div[@row=0]//div/a[@class='row-action']";
    }
    
    public static String EditActionButtonXpath()
    {
        return "//ul[contains(@style,'display: block')]/li/a[@event='Edit']";
    }
    
    public static String EditAndRemoveTextXpath()
    {
        return "//ul[contains(@style,'display: block')]/li";
    }
    
    public static String RemoveActionButtonXpath()
    {
        return "//ul[contains(@style,'display: block')]/li/a[@event='Remove']";
    }
    
    public static String ColumnChooserXpath()
    {
        return "//a[@class='btn btn-small column-chooser']";
    }
    
    public static String ColumnChooser_EventNameXpath()
    {
        return "//ul[@class='dropdown-menu grid-column-chooser'][contains(@style,'display: block')]/li/a[@class='disabled']/span";
    }
    
    public static String ColumnChooser_AssetCheckedXpath()
    {
        return "//ul[@class='dropdown-menu grid-column-chooser'][contains(@style,'display: block')]/li/a/i/../span[text()='Assets']";
    }
    
    public static String ColumnChooser_AssetXpath()
    {
        return "//ul[@class='dropdown-menu grid-column-chooser'][contains(@style,'display: block')]/li/a/span[text()='Assets']";
    }
    
    public static String ColumnChooser_DriversCheckedXpath()
    {
        return "//ul[@class='dropdown-menu grid-column-chooser'][contains(@style,'display: block')]/li/a/i/../span[text()='Drivers']";
    }
    
    public static String ColumnChooser_DriversXpath()
    {
        return "//ul[@class='dropdown-menu grid-column-chooser'][contains(@style,'display: block')]/li/a/span[text()='Drivers']";
    }
    
    public static String ColumnChooser_EventTypeXpath()
    {
        return "//ul[@class='dropdown-menu grid-column-chooser'][contains(@style,'display: block')]/li/a/span[text()='Event type']";
    }
    
    public static String ColumnChooser_EventTypeCheckedXpath()
    {
        return "//ul[@class='dropdown-menu grid-column-chooser'][contains(@style,'display: block')]/li/a/i/../span[text()='Event type']";
    }
    
    public static String ColumnChooser_FrequencyCheckedXpath()
    {
        return "//ul[@class='dropdown-menu grid-column-chooser'][contains(@style,'display: block')]/li/a/i/../span[text()='Frequency']";
    }
    
    public static String ColumnChooser_FrequencyXpath()
    {
        return "//ul[@class='dropdown-menu grid-column-chooser'][contains(@style,'display: block')]/li/a/span[text()='Frequency']";
    }
    
    public static String ColumnChooser_LastEditByXpath()
    {
        return "//ul[@class='dropdown-menu grid-column-chooser'][contains(@style,'display: block')]/li/a/span[text()='Last edit by']";
    }
    
    public static String ColumnChooser_LastEditByCheckedXpath()
    {
        return "//ul[@class='dropdown-menu grid-column-chooser'][contains(@style,'display: block')]/li/a/i/../span[text()='Last edit by']";
    }
    
    public static String ColumnChooser_LastEditTimeXpath()
    {
        return "//ul[@class='dropdown-menu grid-column-chooser'][contains(@style,'display: block')]/li/a/span[text()='Last edit time']";
    }
    
    public static String ColumnChooser_LastEditTimeCheckedXpath()
    {
        return "//ul[@class='dropdown-menu grid-column-chooser'][contains(@style,'display: block')]/li/a/i/../span[text()='Last edit time']";
    }
    
    public static String ColumnChooser_RecordXpath()
    {
        return "//ul[@class='dropdown-menu grid-column-chooser'][contains(@style,'display: block')]/li/a/i/../span[text()='Record']";
    }
    
    public static String columnChooserRecordXpath()
    {
        return "//ul[@class='dropdown-menu grid-column-chooser'][contains(@style,'display: block')]/li/a/span[text()='Record']";
    }
    
    public static String RecordColumnUnchecked()
    {
        return "//ul[@class='dropdown-menu grid-column-chooser'][contains(@style,'display: block')]/li/a/span[text()='Record']";
    }
    
    public static String RecordColumnXpath()
    {
        return "//div[@class='column']/div/span[@class='title'][text()='Record']";
    }
    
    public static String ColumnChooserHiddenXpath()
    {
        return "//ul[@class='dropdown-menu grid-column-chooser'][contains(@style,'display: none')]";
    }
    public static String columnCounterXpath()
    {
        return "//div[@class='column']//div//span[@class='title']";
    }
    
    public static String EventGridListXpath()
    {
        return "//div[@name='serverSideEventListGrid']/div/div/..";
        //return "//div[@name='serverSideEventListGrid']";
    }
    
    public static String ColumnNameDataXpath()
    {
        return "//div[contains(@name,'serverSideEventListGrid')]/div/div/div/div[contains(@class,'cell')]/a";
    }
    
    public static String ColumnEventTypeDataXpath()
    {
        return "//div[contains(@name,'serverSideEventListGrid')]/div/div/div/div[contains(@class,'cell')]/../../div[2]/div[contains(@class,'cell')]";
    }
    
    public static String ColumnRecordDataXpath()
    {
        return "//div[contains(@name,'serverSideEventListGrid')]/div/div/div/div[contains(@class,'cell')]/../../div[3]/div[contains(@class,'cell')]";
    }
    
    public static String ColumnLastEditByDataXpath()
    {
        return "//div[contains(@name,'serverSideEventListGrid')]/div/div/div/div[contains(@class,'cell')]/../../div[7]/div[contains(@class,'cell')]";
    }
    
    public static String ColumnChooserListItemXpath()
    {
        return "//ul[@class='dropdown-menu grid-column-chooser'][contains(@style,'display: block')]/li/a";
    }
    
    public static String NoItemToDisplay()
    {
        return "//div[@class='grid-no-items']/span[text()='No items to display']";
    }
    
    public static String EventDescriptionTextboxXpath()
    {
        return "//input[@name='eventName']";
    }
    
    public static String ButtonNextXpath()
    {
        return "//a/span[text()='Next']";
    }
    
    public static String AssetGroupXpath(String organisationGroup)
    {
        return "//form/div/div/div[1]//ul[@order-by-field='name']/li/div[@options='options']//a/span[text()='"+organisationGroup+"']";
    }
    
    public static String EventTypeDropDownListXpath()
    {
        return "//form[@name='wizardForm']//select";
    }
    
    public static String firstdropdownOptionXpath()
    {
        return "//form[@name='wizardForm']//select/option[@value='0']";
    }
    
    public static String ButtonSelectLocationsXpath()
    {
        return "//button[text()='Select locations']";
    }
    
    public static String SelectLocationPopUpModalXpath()
    {
        return "//div[@name='serverSidelocationsModal'][contains(@style,'display: block')]";
    }
    
    public static String firstCheckBox()
    {
        return "//table/tbody/tr[1]/td/input[@type='checkbox']";
    }
    
    public static String PopUpModalButtonSelectXpath()
    {
        return "//div[@name='serverSidelocationsModal'][contains(@style,'display: block')]//button[text()='Select']";
    }
    
    public static String EventDurationTextBox()
    {
        return "//label/input[@type='number']";
    }
    
    public static String ButtonSaveEventXpath()
    {
        return "//div/a/span[text()='Save']";
    }
    
    public static String EventNameLinkTextxpath(String eventName)
    {
        return "//div[@class='paged-grid']//a[text()='"+eventName+"']";
    }
    
    public static String ButtonRemoveEventXpath()
    {
        return "//button[text()='Remove']";
    }
    
    public static String AssetsAndDriversLinkButtonXpath()
    {
        return "//li[2]/a[contains(@style,'cursor: default;')]";
    }
    
    public static String AssetTabHelpBlockTextXpath()
    {
        return "//div[contains(@ng-show,'assetTab')]/p[contains(text(),'Selecting a group will automatically')]";
    }
    
    public static String OrganisationGroupCountXpath()
    {
        return "//div[@options]//a/span[contains(text(),'1')]";
    }
    
    public static String EventLinkButtonXpath()
    {
        return "//li/a[contains(@style,'cursor: default')]/span[contains(text(),'Events')]/..";
    }
    
    public static String OnlocationTagsChangeTextAreaXpath()
    {
        return "//div[@enabled='true']/div/textarea";
    }
    
    public static String TextAreaValueXpath()
    {
        return "//div[@enabled='true']/div/textarea/../div/div/div";
    }
    
    public static String ServerSideEventSearchFilterXpath()
    {
        return "//div[@class='pull-right']/div/input";
    }
    
    public static String ServerSideSpinnerXpath()
    {
        return "//div[@id='MainView']/div[contains(@style,'display: none')][1]";
    }
}