/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package KeywordDrivenTestFramework.Testing.PageObjects;

/**
 *
 * @author lmkhontwana
 */
public class UsabilityAssetPageObjects 
{
    
     //--------Usability of the Assets Screen--------
     //Heading: All - Above the table
    public static String HeadingAllXpath() {
        return "//li/strong[text()='All']";
    }

    
    public static String TableLoadingSpinnerRolesXpath() {
        return "//div[@class='grid-no-items'][@style='display: none;']";
    }
    
    public static String AssetCancelButtonXpath() 
    {
        return "//button[text()='Cancel']";
    }
    
    public static String AssetStatusTabXpath() 
    {
        return "//a[text()='Asset status']";
    }
    
    public static String AssetDetailsTabXpath() 
    {
        return "//a[text()='Asset details']";
    }    
    
    public static String AddAssetButtonRelativeXpath() 
    {
        return "//a[@fleet-tooltip='Add asset']";
    }
    
    //Heading: Assets
    public static String HeadingAssetsXpath() {
        return "//h5/span[text()='Assets']";
    }

    //Display All Assets

    public static String ClickableAllXpath() {
        return "//a[contains(@ng-click,'selectFilter')]/span[text()='All']/..";
    }

     //Not Downloading---------
    //Not Downloading Asset Filter
    public static String ClickableFilterNotDownloadingXpath() {
        return "//a[contains(@ng-click,'selectFilter')]/span[text()='Not downloading']";
    }

    //Not Downloading Asset Counter
    public static String CounterNotDownloadingXpath() {
        return "//a[contains(@ng-click,'selectFilter')]/span[text()='Not downloading']/../span[contains(@class,'right')]";
    }

    //Points to the Asset Description column and shows all the cells in that column. Used to count the total rows in the table.
    public static String TableRowsAssetDesciptionXpath() {
        return "//span[text()='Asset description']/../../div[contains(@class,'cell')]";
    }

    //Not Downloading Label
    public static String LabelNotDownloadingXpath() {
        return "//ul/li/strong[text()='No mobile device']";
    }

     //No Mobile Device--------
    //No Mobile Device Asset Filter
    public static String ClickableFilterNoMobileDeviceXpath() {
        return "//a[contains(@ng-click,'selectFilter')]/span[text()='No Mobile device']";
    }

    //No Mobile Device Asset Counter
    public static String CounterNoMobileDeviceXpath() {
        return "//a[contains(@ng-click,'selectFilter')]/span[text()='No Mobile device']/../span[contains(@class,'right')]";
    }

    //No Mobile Device Label
    public static String LabelNoMobileDeviceXpath() {
        return "//ul/li/strong[text()='No Mobile device']";
    }
    
        public static String AssetNameXpath(){
        return "//h5/a[text()='Assets']";
    }

     //Available--------
    //Available Asset Filter
    public static String ClickableFilterAvailableXpath() {
        return "//a[contains(@ng-click,'selectFilter')]/span[text()='Available']";
    }

    //Available Asset Counter
    public static String CounterAvailableXpath() {
        return "//a[contains(@ng-click,'selectFilter')]/span[text()='Available']/../span[contains(@class,'right')]";
    }

    //Available Label
    public static String LabelAvailableXpath() {
        return "//ul/li/strong[text()='Available']";
    }

     //Not available--------
    //Not available Asset Filter
    public static String ClickableFilterNotAvailableXpath() {
        return "//a[contains(@ng-click,'selectFilter')]/span[text()='Not available']";
    }

    //Not available Asset Counter
    public static String CounterNotAvailableXpath() {
        return "//a[contains(@ng-click,'selectFilter')]/span[text()='Not available']/../span[contains(@class,'right')]";
    }

    //Not available Label
    public static String LabelNotAvailableXpath() {
        return "//ul/li/strong[text()='Not available']";
    }

     //Decommissioned--------
    //Decommissioned Asset Filter
    public static String ClickableFilterDecommissionedXpath() {
        return "//a[contains(@ng-click,'selectFilter')]/span[text()='Decommissioned']";
    }

    //Decommissioned Asset Counter
    public static String CounterDecommissionedXpath() {
        return "//a[contains(@ng-click,'selectFilter')]/span[text()='Decommissioned']/../span[contains(@class,'right')]";
    }

    //Decommissioned Label
    public static String LabelDecommissionedXpath() {
        return "//ul/li/strong[text()='Decommissioned']";
    }

     //Reminders due soon--------
    //Reminders due soon Asset Filter
    public static String ClickableFilterRemindersDueSoonXpath() {
        return "//a[contains(@ng-click,'selectFilter')]/span[text()='Reminders due soon']";
    }

    //Reminders due soon Asset Counter
    public static String CounterRemindersDueSoonXpath() {
        return "//a[contains(@ng-click,'selectFilter')]/span[text()='Reminders due soon']/../span[contains(@class,'right')]";
    }

    //Reminders due soon Label
    public static String LabelRemindersDueSoonXpath() {
        return "//ul/li/strong[text()='Reminders due soon']";
    }

     //Reminders overdue--------
    //Reminders overdue Asset Filter
    public static String ClickableFilterRemindersOverdueXpath() {
        return "//a[contains(@ng-click,'selectFilter')]/span[text()='Reminders overdue']";
    }

    //Reminders overdue Asset Counter
    public static String CounterRemindersOverdueXpath() {
        return "//a[contains(@ng-click,'selectFilter')]/span[text()='Reminders overdue']/../span[contains(@class,'right')]";
    }

    //Reminders overdue Label
    public static String LabelRemindersOverdueXpath() {
        return "//ul/li/strong[text()='Reminders overdue']";
    }
    
        //Table Loading Spinner
    public static String leftPaneSpinnerXpath() {
        return "//div[@class='left-pane']//div[@class='loading-overlay ng-scope'][@style='display: none;']";
    }
    //Table Loading Spinner
    public static String rightPaneSpinnerXpath() {
        return "//div[@class='right-pane']//div[@class='loading-overlay'][@style='display: none;']";
    }

    

    //No items to display message when table is empty
    public static String MessageNoItemsToDisplayXpath() {
        return "//span[text()='No items to display']";
    }

    //Row one
    public static String RowOneXpath() {
        return "//div/div[contains(@class,'cell')][@row='0']";
    }

    //Used to get random Asset Description from what is displayed in the table to filter on
    public static String RowDescriptionXpath(int rowID) {
        return "//span[text()='Asset description']/../../div[contains(@class,'cell')]/a[@row-index='" + rowID + "']";
    }

    //All Row Counter
    public static String CounterAllXpath() {
        return "//a[contains(@ng-click,'selectFilter')]/span[text()='All']/../span[contains(@class,'right')]";
    }

    //Filter search Button
    public static String BtnFilterSearchXpath() {
        return "//input/../../div/a[@class='btn btn-small']/i[@class='icon-search']/..";
    }

    //Used to extract the text of one table row. After a filter has been done
    public static String RowDescriptionFilterXpath() {
        return "//span[text()='Asset description']/../../div[contains(@class,'cell')]/a";
    }

    //Table Asset Count
    public static String CountAssetTableXpath() {
        return "//li/span";
    }

    //Clear Filter button
    public static String BtnClearFilterFieldXpath() {
        return "//input/../../div/a[@class='clear-filter'][contains(@ng-click,'clear()')]";
    }

    //Heading: Asset Detials
    public static String HeadingAssetDetialsXpath() {
        return "//h5[text()='Asset details']";
    }

    //Heading: Registration Number
    public static String HeadingRegistrationNumberXpath() {
        return "//div/label/span[text()='Registration number']";
    }

    //Input: Asset Description
    public static String InputAssetDescriptionXpath() {
        return "//div/label/span[text()='Asset description']/../../input";
    }

    //Input: Registration Number
    public static String InputRegistrationNumberXpath() {
        return "//div/label/span[text()='Registration number']/../../input";
    }

    //Table Loading Spinner
    public static String TableLoadingSpinnerXpath() {
        return "//div[@class='loading-overlay'][@style='display: none;']";
    }
    
    public static String TableLoadingSpinnerNewUserXpath() {
        return "//div[@class='loading-overlay ng-scope'][@style='display: none;']";
    }
    public static String TableLoadingSpinnerAssetGridXpath() {
        return "//div[@name=\"configGroupAssetListGrid\"]/div[@class='loading-overlay'][@style='display: none;']";
    }
    
    
    //Filter Input
    public static String InputFilterFieldXpath() {
        return "//div[contains(@class,'text-filter')]/input";
    }

    //Button: Export Assets
    public static String BtnExportAssetsXpath() {
        return "//button[@fleet-tooltip='Export assets']";
    }

    //Button: Import Assets
    public static String BtnImportAssetsXpath() {
        return "//a[@fleet-tooltip='Import assets']";
    }

    //Button: Download import template
    public static String BtnDownloadImportTemplateXpath() {
        return "//a[@fleet-tooltip='Download import template']";
    }

    //Button: Add Asset
    public static String BtnAddAssetXpath() {
        return "//a[@fleet-tooltip='Add asset']";
    }

    //Row 0 Actions dropdown
    public static String Row1ActionDropDownXpath() {
        return "//div[contains(@style,'left')]/div[@row='0']/div/a";
    }

    //Mobile Device column heading
    public static String ColumnHeadingMobileDeviceXpath() {
        return "//div/span[text()='Mobile device']";
    }

    //Mobile device first row
    public static String RowMobileDeviceColumnXpath(int rowID) {
        return "//div/span[text()='Mobile device']/../../div[contains(@class,'cell')][@row='" + rowID + "']";
    }

    //Action edit
    public static String ActionEditXpath() {
        return "//body/ul[contains(@class,'grid-row-action-dropdown-menu')][contains(@style,'display: block')]/li/a[@event='Edit']";
    }

    //Action Duplicate
    public static String ActionDuplicateXpath() {
        return "//body/ul[contains(@class,'grid-row-action-dropdown-menu')][contains(@style,'display: block')]/li/a[@event='Duplicate']";
    }

    //Action edit
    public static String ActionRemoveXpath() {
        return "//body/ul[contains(@class,'grid-row-action-dropdown-menu')][contains(@style,'display: block')]/li/a[@event='Remove']";
    }

    //Action Show on historical tracking
    public static String ActionShowHistoricalTrackingXpath() {
        return "//body/ul[contains(@class,'grid-row-action-dropdown-menu')][contains(@style,'display: block')]/li/a[@event='ShowLastHistoricalTrip']";
    }

    //Action Show in tip timeline
    public static String ActionShowTripTimeLineXpath() {
        return "//body/ul[contains(@class,'grid-row-action-dropdown-menu')][contains(@style,'display: block')]/li/a[@event='ShowLastTimelineTrip']";
    }

    //Action diagnostics
    public static String ActionDiagnosticsXpath() {
        return "//body/ul[contains(@class,'grid-row-action-dropdown-menu')][contains(@style,'display: block')]/li/a[@event='Diagnostics']";
    }

    //Column Chooser
    public static String ButtonColumnChooserXpath() {
        return "//a[contains(@class,'column-chooser')]";
    }

    //ColumnSelectorAssetDescription
    public static String ColumnSelectorAssetDescriptionXpath(boolean checkTick) {
        String append = "";
        if (checkTick == true) {

            append = "/i";

        }

        return "//ul[contains(@class,'grid-column-chooser')][contains(@style,'top')]/li/a[@column-field='description']" + append;
    }

    //ColumnSelector Asset ID
    public static String ColumnSelectorAssetIDXpath(boolean checkTick) {
        String append = "";
        if (checkTick == true) {

            append = "/i";

        }

        return "//ul[contains(@class,'grid-column-chooser')][contains(@style,'top')]/li/a[@column-field='fmVehicleId']" + append;
    }

    public static String ColumnSelectorBeaconSerialNumberXpath(boolean checkTick) {
        String append = "";
        if (checkTick == true) {

            append = "/i";

        }

        return "//ul[contains(@class,'grid-column-chooser')][contains(@style,'top')]/li/a[@column-field='beaconSerialNumber']" + append;
    }
    //ColumnSelector assetType
    public static String ColumnSelectorAssetTypeXpath(boolean checkTick) {
        String append = "";
        if (checkTick == true) {

            append = "/i";

        }

        return "//ul[contains(@class,'grid-column-chooser')][contains(@style,'top')]/li/a[@column-field='assetType']" + append;
    }

    //ColumnSelector Config Upload Date
    public static String ColumnSelectorConfigUploadDateXpath(boolean checkTick) {

        String append = "";
        if (checkTick == true) {

            append = "/i";

        }
        return "//ul[contains(@class,'grid-column-chooser')][contains(@style,'top')]/li/a[@column-field='configUploadDate']" + append;
    }

    //ColumnSelector configuration Group
    public static String ColumnSelectorConfigurationGroupXpath(boolean checkTick) {
        String append = "";
        if (checkTick == true) {

            append = "/i";

        }

        return "//ul[contains(@class,'grid-column-chooser')][contains(@style,'top')]/li/a[@column-field='configurationGroup']" + append;
    }

    //ColumnSelector country
    public static String ColumnSelectorCountryXpath(boolean checkTick) {
        String append = "";
        if (checkTick == true) {

            append = "/i";

        }

        return "//ul[contains(@class,'grid-column-chooser')][contains(@style,'top')]/li/a[@column-field='country']" + append;
    }

    //ColumnSelector engineHours
    public static String ColumnSelectorEngineHoursXpath(boolean checkTick) {
        String append = "";
        if (checkTick == true) {

            append = "/i";

        }

        return "//ul[contains(@class,'grid-column-chooser')][contains(@style,'top')]/li/a[@column-field='engineHours']" + append;
    }

    //ColumnSelector fleetNumber
    public static String ColumnSelectorFleetNumberXpath(boolean checkTick) {
        String append = "";
        if (checkTick == true) {

            append = "/i";

        }

        return "//ul[contains(@class,'grid-column-chooser')][contains(@style,'top')]/li/a[@column-field='fleetNumber']" + append;
    }

    //ColumnSelector imei
    public static String ColumnSelectorIMEIXpath(boolean checkTick) {
        String append = "";
        if (checkTick == true) {

            append = "/i";

        }

        return "//ul[contains(@class,'grid-column-chooser')][contains(@style,'top')]/li/a[@column-field='imei']" + append;
    }

    //ColumnSelector imsi
    public static String ColumnSelectorIMSIXpath(boolean checkTick) {
        String append = "";
        if (checkTick == true) {

            append = "/i";

        }

        return "//ul[contains(@class,'grid-column-chooser')][contains(@style,'top')]/li/a[@column-field='imsi']" + append;
    }

    //ColumnSelector lastAvl
    public static String ColumnSelectorLastAvailableXpath(boolean checkTick) {
        String append = "";
        if (checkTick == true) {

            append = "/i";

        }

        return "//ul[contains(@class,'grid-column-chooser')][contains(@style,'top')]/li/a[@column-field='lastAvl']" + append;
    }

    //ColumnSelector lastTrip
    public static String ColumnSelectorLastTripXpath(boolean checkTick) {
        String append = "";
        if (checkTick == true) {

            append = "/i";

        }

        return "//ul[contains(@class,'grid-column-chooser')][contains(@style,'top')]/li/a[@column-field='lastTrip']" + append;
    }

    //ColumnSelector mobileDeviceType
    public static String ColumnSelectorMobileDeviceTypeXpath(boolean checkTick) {
        String append = "";
        if (checkTick == true) {

            append = "/i";

        }

        return "//ul[contains(@class,'grid-column-chooser')][contains(@style,'top')]/li/a[@column-field='mobileDeviceType']" + append;
    }

    //ColumnSelector msisdn
    public static String ColumnSelectorMSISDNXpath(boolean checkTick) {
        String append = "";
        if (checkTick == true) {

            append = "/i";

        }

        return "//ul[contains(@class,'grid-column-chooser')][contains(@style,'top')]/li/a[@column-field='msisdn']" + append;
    }

    //ColumnSelector odometer
    public static String ColumnSelectorOdometerXpath(boolean checkTick) {
        String append = "";
        if (checkTick == true) {

            append = "/i";

        }

        return "//ul[contains(@class,'grid-column-chooser')][contains(@style,'top')]/li/a[@column-field='odometer']" + append;
    }

    //ColumnSelector RegistrationNumber
    public static String ColumnSelectorRegistrationNumberXpath(boolean checkTick) {
        String append = "";
        if (checkTick == true) {

            append = "/i";

        }

        return "//ul[contains(@class,'grid-column-chooser')][contains(@style,'top')]/li/a[@column-field='registrationNumber']" + append;
    }

    //ColumnSelector site
    public static String ColumnSelectorSiteXpath(boolean checkTick) {
        String append = "";
        if (checkTick == true) {

            append = "/i";

        }

        return "//ul[contains(@class,'grid-column-chooser')][contains(@style,'top')]/li/a[@column-field='site']" + append;
    }

    //ColumnSelector currentState
    public static String ColumnSelectorCurrentStateXpath(boolean checkTick) {
        String append = "";
        if (checkTick == true) {

            append = "/i";

        }

        return "//ul[contains(@class,'grid-column-chooser')][contains(@style,'top')]/li/a[@column-field='currentState']" + append;
    }

    //Column Header
    public static String TableColumnHeaderXpath(String headerName) {
        return "//div[contains(@class,'column')]/div[contains(@class,'column-heading')]/span[text()='" + headerName + "']";
    }

    //Column Selector Dynamic
    public static String ColumnSelectorDynamicXpath(String headerName) {
        return "//ul[contains(@class,'grid-column-chooser')][contains(@style,'top')][not(contains(@style,'display: none;'))]/li/a/span[text()='" + headerName + "']";
    }

    //Get dynamic item from table
    public static String TableItemDynamicXpath(String columnName, int rowNo) {
        String append = "";

        if (columnName.equals("Asset description")) {
            append = "/a";
        }
        return "//div[contains(@class,'column')]/div[contains(@class,'column-heading')]/span[text()='" + columnName + "']/../../div[contains(@class,'cell')][@row='" + rowNo + "']" + append;
    }

    
    
    
}
