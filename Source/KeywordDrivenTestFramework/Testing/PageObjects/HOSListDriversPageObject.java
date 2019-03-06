package KeywordDrivenTestFramework.Testing.PageObjects;

import static KeywordDrivenTestFramework.Core.BaseClass.currentEnvironment;

/**
 *
 * @author Sakhi
 */
public class HOSListDriversPageObject
{

    public static String MixTelematicsURL() {
        return currentEnvironment.PageUrl;
    }
    
    public static String TimeDate()
    {
        return "//div[@class='form-inline pull-left']//input";
    }
    
    public static String addedTimeLineXpath(String text)
    {
        return "//div[@class='form-inline pull-left']/div[@class='btn-group ml-5 pull-left']/button[text()='"+text+"']";
    }
    public static String backForwardButtonXpath(String number)
    {
        return "//span[@class='text ng-binding']/a["+number+"]/i";
    }
    public static String GetDateTimeButtonXpath()
    {
        return "//span[@class='text ng-binding']";
    }
    public static String GetActiveZoomTimeButtonXpath()
    {
        return "//div[@class='btn-group ml-5 pull-left']/button[@class='btn btn-small ng-scope ng-binding active']";
    }
    public static String eventsSpinnerXpath()
    {
        return "//div[@class='well well-white no-margin timeline-well no-padding']/div[@class='row-fluid'][@style='display: none;']";
    }
    public static String ClickIconsXpath(String IconName)
    {
        return "//a[@class='btn btn-small']/i[@class ='"+IconName+"']";
    }
    public static String CliclActiveIconsXpath(String IconName)
    {
        return "//a[@class='btn btn-small active']/i[@class ='"+IconName+"']";
    }
    public static String ColumnNameByXpath(String ColumnName)
    {
        return "//div[@class='column']//span[text()='"+ColumnName+"']";
    }
    public static String ColumnRowOneTextByXpath(String ColumnName)
    {
        return "//div[@class='column']//span[text()='"+ColumnName+"']/../../div[@row=0]";
    }
     public static String waitforLogViewerSpinnerXpath()
    {
        return "//div[@id='logContent']/div[@class='loading-overlay'][@style='display: none;']";
    }
    public static String waitforLogTimelineSpinnerXpath()
    {
        return "//div[@class='timeline-content ng-scope']/div[@class='loading-overlay'][@style='display: none;']";
    }
    public static String spanTagNameTextXpath(String text)
    {
        return "//span[text()='"+text+"']";
    } 
    public static String toolTipTextXpath()
    {
        return "//div[@class='ng-scope tooltip timeline-tooltip in'][contains(@style,'left')]";
    }
    public static String workstateValueXpath(int spanNumber)
    {
        return "//div[@class='us-hos-workstate-value-axis']/span["+spanNumber+"]";
    }
    public static String timeZoomButtonXpath(String text)
    {
        return "//button[text()='"+text+"']";
    }
    //trip tool tip
    public static String tripsTooltipXpath()
    {
        return "//div[@class='trip-tooltip ng-scope']";
    }
    public static String TooltipDatesXpath(int rowNumber)
    {
        return "//div[@class='trip-tooltip ng-scope']//div["+rowNumber+"]";
    }
     public static String TooltipDatesNameXpath(String dateName)
    {
        return "//div[@class='trip-tooltip ng-scope']//div/strong[text()='"+dateName+"']";
    } 
    //detailed trip
    public static String detailedTripTextXpath()
    {
        return "//pre[@class ='ng-binding']";
    }
    public static String bottomDragButton()
    {
        return "//img[@src='img/drag-btn-stripes.png']/..";
    }
    public  static String detailsPageHeader()
    {
        return "//h5[text()='Detailed trip']/..";
    }
    public  static String lastRefreshXpath()
    {
        return "//strong[text()='Last refresh:']/../span[@class='muted ng-binding']";
    } 
    public  static String RefreshLinkXpath()
    {
        return "//span[text()='Refresh']";
    } 
    //infor icon
    public static String inforIconButtonXpath()
    {
        return "//a[@id='toolbarInfoIcon']/i";
    }
    public static String inforIconPopupXpath()
    {
        return "//div[@class='popover-content']";
    }
    public static String DistanceDrivenDateNameXpath(String dateName)
    {
        return "//div[@class='popover-content']/div//label/strong[text()='"+dateName+"']";
    }
    public static String DistanceDrivenDateXpath(int rowNumber)
    {
        return "//div[@class='popover-content']/div["+rowNumber+"]//label[@class='pull-right ng-binding']";
    }
    
    //tool tip
    public static String SBspan()
    {
        return "//span[@class='hos-workstate-label ng-scope']/span[text()='SB']";
    }
    public static String DateNameXpath(String dateName)
    {
      return "//div[@class='ng-scope tooltip timeline-tooltip in']/div[@class='tooltip-inner']/div/div/div/div/div[@class='ng-binding']/strong[text()='"+dateName+"']";
    }
    public static String startTimeDate()
    {
      return "//div[@class='ng-scope tooltip timeline-tooltip in']/div[@class='tooltip-inner']/div/div/div/div/div[@class='ng-binding'][1]";
    }
    public static String endTimeDate()
    {
        return "//div[@class='ng-scope tooltip timeline-tooltip in']/div[@class='tooltip-inner']/div/div/div/div/div[@class='ng-binding'][2]";
    }
    public static String datePickerValueXpath()
    {
        return "//input[@type='text']";
    }
    //div[@class='us-hos-workstate-value-axis']/span[1]
    public static String colorLegendIconLabelXpath()
    {
        return "//div[@class='popover fade bottom in'][contains(@style,'display: block')]/div/div[@class='popover-content']/table/tbody/tr/td/span";
    }
    public static String workStateSBValueXpath()
    {
        return "//div[@class='us-hos-workstate-label-axis']//span[text()='SB']";
    }
    
    //add a new event
    public static String addEventButtonXpath()
    {
        return "//div[@class='pull-right dropdown selection-criteria']/a";
    }
    public static String eventsModalHeaderXpath()
    {
        return "//h5/span[text()='Select events']";
    }
    public static String eventSearchFilterXpath()
    {
        return "//div[@class='input-reset-wrapper mb-5']/input[@placeholder='Filter']";
    }
    public static String CategorytextBoxXpath()
    {
        return "//div//select[@name='eventDataCategory']";
    }
    public static String statusDropdownXpath()
    {
        return "//div//select[@id='workState']";
    }
    public static String changeAssetXpath()
    {
        return "//h5/span[text()='Add driver status']/../../../..//a[text()='Change asset']";
    }
    public static String changeAssetTextXpath()
    {
        return "//h5/span[text()='Add driver status']/../../../..//div[@class='driverStatusAutoComplete']//input[not(@disabled='disabled')]";
    }
     public static String changeAssetResultListXpath()
    {
        return "//h5/span[text()='Add driver status']/../../../..//div[@class='driverStatusAutoComplete']//input[not(@disabled='disabled')]/../ul/li/a";
    }
    public static String statusDateTimeXpath()
    {
        return "//h5/span[text()='Add driver status']/../../../..//div[@type='datetime']/input";
    }
    public static String statusRemarksXpath()
    {
        return "//h5/span[text()='Add driver status']/../../../..//textarea[@name='remarks']";
    }
    public static String rowOneCheckBoxXpath()
    {
        return "//tbody[@fleet-droppable-group='droppable']//..//td[1]//input[@checked='checked' and @type='checkbox']";
    }
    public static String eventCheckBoxXpath()
    {
        return "//input[@placeholder='Filter']//..//..//../div[2]//tbody[@fleet-droppable-group='droppable']/tr[1]/td/input[1]";
    }
    public static String eventSelectButtonXpath()
    {
        return "//button[text()='Select']";
    }
    //all trips and events images
    
    public static String Forward24HarshAccValueXpath()
    {
        return "24hForwardHarshAcc.PNG";
    }
    public static String Forward24HarshBreakValueXpath()
    {
        return "24hForwardHarshBreak.PNG";
    }
    public static String Forward24OverSpeedingValueXpath()
    {
        return "24ForwardOverSpeeding.PNG";
    }
    public static String Backward24HarshBreakValueXpath()
    {
        return "24hBackwardsHarshBreak.PNG";
    }
    public static String Backward24InspectionValueXpath()
    {
        return "24hBackwardInspection.PNG";
    }
    public static String Backward24HarshAccValueXpath()
    {
        return "24BackwardHarshAcc.PNG";
    }
    public static String Foward5mHarshAccValueXpath()
    {
        return "5mFowardHarshAcc.PNG";
    }
    public static String Foward5mHarshBreakValueXpath()
    {
        return "5mForwardHarshBreak.PNG";
    }
    
    //enable disable query line
    public static String backgroundQueryLineValueXpath()
    {
        return "//div[@class='query-line draggable']/div[@class='background']";
    }
    public static String clickButtonRefreshValueXpath()
    {
        return "//span[text()='Refresh']";
    }
    
     public static String backgroundQueryLineNotActiveValueXpath()
    {
        return "//div[@class='query-line draggable'][contains(@style,'display: none')]";
    }
    public static String iebackgroundQueryLineNotActiveValueXpath()
    {
        return "//div[@class='query-line draggable']/div[@class='time ng-binding']";
    }
    public static String timeLineValueXpath()
    {
        return "//div[@class='timeline hos-timeline tooltip-bounding-box']";
    }
    public static String queryLineValueXpath()
    {
        return "//div[@class='timeline hos-timeline tooltip-bounding-box']/div[@class='query-line draggable']";
    }
    public static String timelineCanvasValueXpath()
    {
        return "//div[@class='top-time-axis time-axis zoomable orientation-top']/canvas";
    } 
     public static String workstateCanvasValueXpath()
    {
        return "//div[@class='hos-series canvas-container draggable']/canvas";
    } 
     
      //add notification
    public static String HOSNotificationsTabsXpath(String text)
    {
        return "//li[@class='ng-scope active']/a[text()='"+text+"']";
    } 
    public static String HOSNotificationsDisTabsXpath(String text)
    {
        return "//li[@class='ng-scope active disabled']/a[text()='"+text+"']";
    }
    
    public static String HOSAddNotificationsSpinner2Xpath()
    {
        return "//div[@class='loading-overlay'][@style='display: none;']";
    } 
    
    public static String HOSAddNotificationsSpinnerXpath()
    {
        return "//div[@class='fa-detail-right right-wide well fa-detail-right-toggle']/div[@class='loading-overlay ng-scope'][@style='display: none;']";
    }  
    public static String HOSAddNotificationsRadioXpath(String text)
    {
        return "//input[@value='"+text+"']";
    } 
    public static String HOSAddNotificationsOrganisationXpath(String text)
    {
        return "//a[@class='tree-item']/span[text()='"+text+"']";
    } 
    public static String HOSNotificationsOrganisationSitesXpath(String OrganisationName)
    {
        return "//span[text()='"+OrganisationName+"']/../../../span";
    } 
     public static String HOSNotificationsClickSitesXpath(String siteName)
    {
        return "//span[text()='"+siteName+"']";
    }
    public static String HOSNotificationsSitesCheckBoxXpath(String text)
    {
        return "//span[text()='"+text+"']/../input[@type='checkbox']";
    }
    public static String HOSNotificationsOrganisationSitesXpath(int number)
    {
        return "//div[@class='tree-sub-items ng-scope']/ul/li["+number+"]//div[@class='checkbox ng-scope']/span";
    }  
    public static String HOSNotificationsSitesDriversXpath(String text)
    {
        return "//span[text()='"+text+"']/../../../div[@class='tree-sub-items ng-scope']/ul";
    } 
    public static String HOSNotificationsSitesDriverCheckXpath(String siteName,int number)
    {
        return "//span[text()='"+siteName+"']/../../../div[@class='tree-sub-items ng-scope']/ul/li["+number+"]//div[@class='checkbox ng-scope']/input";
    }  
    public static String HOSNotificationsSitesDriverTextXpath(String siteName,int number)
    {
        return "//span[text()='"+siteName+"']/../../../div[@class='tree-sub-items ng-scope']/ul/li["+number+"]//div[@class='checkbox ng-scope']/span";
    }
    public static String HOSNotificationsDriversXpath(String driver)
    {
        return "//input[@value='"+driver+"']/../span[2]";
    } 
    public static String HOSNotificationsViolationTypeCheckboxXpath(String violation)
    {
        return "//span[text()='"+violation+"']/../../../td[@class='selection']/input";
    }
    public static String HOSNotificationsViolationTextInputXpath(String violation)
    {
        return "//span[text()='"+violation+"']/../../../td[3]//input";
    }
    public static String HOSNotificationsViolationTextInputXpath(String violation,int columnNo)
    {
        return "//span[text()='"+violation+"']/../../../td["+columnNo+"]//input";
    }
    public static String disHOSNotificationsViolationTextInputXpath(String violation,int columnNo)
    {
        return "//span[text()='"+violation+"']/../../../td["+columnNo+"]//div[@style='display: none;']//input";
    }
    public static String HOSNotificationsEmailRecipientXpath()
    {
        return "//h5[text()='Email notifications']/../button[text()='Select recipients']";
    }
     public static String HOSNotificationsSmsRecipientXpath()
    {
        return "//legend[text()='Escalation 2']/..//h5[text()='SMS notifications']/../button[text()='Select recipients']";
    }
    public static String notificationFilterXpath()
    {
        return "//div[@class='text-filter empty']/input";
    }
    public static String addNotificationButtonXpath()
    {
        return "//button[@fleet-tooltip='Add HOS notification']";
    }
    public static String nameFieldXpath()
    {
        return "//input[@name='notificationName']";
    }
    public static String filterXpath()
    {
        return "//input[@placeholder='Filter']";
    }
    public static String nextButtonXpath()
    {
        return "//button[@text='Next']";
    }
    public static String CancelButtonXpath()
    {
        return "//button[@text='Cancel']";
    }
    public static String RecientSpinnerSpinnerXpath()
    {
        return "//div[@class='paged-grid']/div[@class='loading-overlay'][@style='display: none;']";
    }
    public static String searchButtonXpath()
    {
        return "//a[@class='btn btn-small']/i";
    }
    public static String NotificationNameXpath()
    {
        return "//div[@class='columns ui-sortable']/div/div[1]/div[@row='0']/a";
    }
    public static String NotificationDriversXpath()
    {
        return "//div[@class='columns ui-sortable']/div/div[2]/div[@row='0']";
    }
    public static String NotificationEmailRecXpath()
    {
        return "//div[@class='columns ui-sortable']/div/div[3]/div[@row='0']";
    }
    public static String NoItemsDisplayedXpath()
    {
        return "//div[@style='display: none;']/span[text()='No items to display']";
    }
    public static String NotificationSitesXpath()
    {
        return "//div[@class='tree-sub-items ng-scope']/ul";
    }
    public static String NotificationActtionDropdownXpath()
    {
        return "//div[@class='cell alt']//span[text()='EditLinkXpatht']";
    }
    //Timeline graph handler
    
   public static String workStateValuesXpath(int number)
    {
        return "//div[@class='eu-hos-workstate-label-axis']/span["+number+"]";
    }
   public static String usworkStateValuesXpath(int number)
    {
        return "//div[@class='us-hos-workstate-label-axis']/span["+number+"]";
    }
   //[contains(@style,'top:')]
    public static String TimelineWorkStatesXpath()
    {
        return "//div[@class='eu-hos-workstate-label-axis']";
    }
    
    //violation escalation
    public static String newEscalationButtonXpath()
    {
        return "//a[text()='Add new escalation']";
    }
    public static String removeEscalationButtonXpath()
    {
        return "//a[text()='Remove escalation']";
    }
    public static String EscalationErroXpath(String violation,int columnNo)
    {
        return "//span[text()='"+violation+"']/../../../td["+columnNo+"]//span[text()='Threshold must be greater than the previous threshold']";
    }
    public static String disabEscalationErroXpath(String violation,int columnNo)
    {
        return "//span[text()='"+violation+"']/../../../td["+columnNo+"]//span[text()='Threshold must be greater than the previous threshold'][contains(@style,' display: none;')]";
    }
    public static String elementAXpath(String elementText)
    {
        return "//a[text()='"+elementText+"']";
    } 
   public static String violationSpinnerXpath()
    {
        return "//div[@class='row-fluid']/div[@class='loading-overlay ng-scope'][@style='display: none;']";
    } 
    public static String smsSelectButtonXpath()
    {
        return "//h5/span[text()='Select SMS recipients']/../../../../../../div[@class='modal-footer']/button[text()='Select']";
    }  
    public static String smsCheckboxXpath()
    {
        return "//span[text()='contact for Deleting John Do Not Delete']/../../../td[1]/input";
    } 
    public static String smsFilterTextboxXpath()
    {
        return "//h5/span[text()='Select SMS recipients']/../../../form//input[@placeholder='Filter']";
    } 
    public static String escalationColumnXpath(int number)
    {
        return "//fieldset/legend[text()='Escalation "+number+"']";
    }
    public static String tableHeaderXpath()
    {
        return "//div[@class='fleet-grid full-height selection']/table/thead";
    }
   public static String escalationColumnsXpath(int number)
    {
        return "//div[@class='fleet-grid full-height selection']/table/thead/tr/th["+number+"]/span[contains(text(),'Escalation')]";
    }
    public static String driverSpanXpath()
    {
        return "//div[@class='tab-pane active ng-scope']/h5/span";
    }
    
    //hos log viewer
    public static String addStatusXpath()
    {
        return "//div[@class='tab-pane'][not(@style='display: none;')]//a[@id='hosTabPaneAdd']/i";
    } 
    public static String DataTooltipXpath()
    {
        return "//div[@class='ng-scope tooltip left in']//span[@class='simple-tooltip-content ng-scope ng-binding'][text()='Add log data']";
    } 
    public static String AddLogDataHeadingXpath()
    {
        return "//h5/span[text()='Add log data']";
    }
    public static String AddDriverDataHeadingXpath()
    {
        return "//h5/span[text()='Add driver status']";
    }
    public static String ButtonCancelAddLogDataXpath()
    {
        return "//div[@class='modal hide fade in']//button[text()='Cancel']";
    }
    public static String ADDEDITmodalHeadingXpath(String madalName)
    {
        return "//h5/span[text()='"+madalName+"']";
    }
     public static String StartDateModalXpath(String StartDateName)
    {
        return "//h5/span[text()='"+StartDateName+"']/../../..//label[@class='ng-binding']";
    }
    public static String remarksTextAreaXpath()
    {
        return "//h5/span[text()='Add driver status']/../../../div[2]//textarea[@name='remarks']";
    }
    public static String buttonXpath(String ButtonName)
    {
        return "//button[text()='"+ButtonName+"']";
    } 
    public static String changeLocationXpath()
    {
        return "//a[text()='Change location']";
    } 
    public static String ButtonSaveXpath()
    {
        return "//div[@class='modal hide fade in']//button[text()='Save']";
    }
    public static String ConfirmeventDetailsHeadingXapth()
    {
        return "//h5/span[text()='Confirm event details']";
    }
    public static String changeLocationRadioXpath(String Type)
    {
        return "//span[text()='"+Type+"']/../input";
    }
    public static String addressTextBoxXpath()
    {
        return "//span[@id='map-address']//input";
    } 
    public static String locationTextBoxXpath()
    {
        return "//span[@id='map-location']//input";
    }
    public static String addressResultOneXpath()
    {
        return "//span[@id='map-address']//ul/li[1]/a";
    }
    public static String locationResultOneXpath()
    {
        return "//span[@id='map-location']//ul/li[1]/a";
    }
    public static String saveAsLocationCheckboxXpath()
    {
        return "//span[text()='Save as a location']/../input";
    }
    public static String ButtonConfirmXpath()
    {
        return "//div[@class='modal hide fade modal-mini in']//button[text()='Confirm']";
    }
    public static String confirmChangeHeaderXpath()
    {
        return "//h5/span[text()='Confirm changes']";
    }
    public static String locationColumnXpath()
    {
        return "//li/strong[text()='Status']//..//..//..//..//../div[@id='hosGrid']/div//tr[@class='light-blue']/../../tbody/tr/td[@column-field='location.description']";
    }
    public static String dateColumnXpath()
    {
        return "//li/strong[text()='Status']//..//..//..//..//../div[@id='hosGrid']/div//tr[@class='light-blue']/../../tbody/tr/td[@column-field='date']";
    }
    public static String actionButtonXpath(int number)
     {
        return "//div[@ng-show='currentpane.selected'][@class='tab-pane']//div/ul/li/strong[text()='Status']/../../../../..//li[@ng-repeat]["+number+"]/div/div/a[@fleet-tooltip='Actions']";
     }
    public static String actionInputButtonXpath(int number)
     {
        return "//div[@ng-show='currentpane.selected'][@class='tab-pane']//div/ul/li/strong[text()='Input data']/../../../../..//li[@ng-repeat][3]/div/div/a[@fleet-tooltip='Actions']";
     }
    public static String manageLocationsSpinnerXpath()
     {
        return "//div[@class='fleet-grid-container strong-grid']/div[@class='loading-overlay ng-scope'][@style='display: none;']";
     } 
    public static String removeXpath()
     {
         return "//ul[contains(@style, 'block')]//a/span[text()='Remove']";
     }
    public static String FirstTableRowNameSpanXpath()
     {
         return "//table[@class='table table-scroll table-condensed table-list no-text-clip']/tbody//td[3]/div/a/span";
     }
    public static String locationIDSpanXpath(int ColumnNumber)
     {
         return "//table[@class='table table-scroll table-condensed table-list no-text-clip']/tbody/tr/td["+ColumnNumber+"]/div//span";
     }
    public static String LongitudeAndLatitudeXpath()
     {
         return "//a[text()='Report a map error']";
     }
    public static String backtolistButtonXpath()
     {
         return "//span[text()='Back to location list']";
     }
    public static String zoomOutButtonXpath()
    {
        return "//a[@title='Zoom out']";
    }
    public static String driverLongitudeAndLatitudeXpath()
    {
        return "//span[@class='labelFirst']";
    } 
    public static String tableColumnsXpath(int tableHeaderColumn)
    {
        return "//table[@class='table table-scroll table-condensed table-list no-text-clip']/thead/tr/th["+tableHeaderColumn+"]/span[@class='ng-binding']";
    }
    public static String LocationTableHeaderXpath()
    {
        return "//table[@class='table table-scroll table-condensed table-list no-text-clip']/thead/tr";
    }
    public static String LocationTableBodyXpath()
    {
        return "//table[@class='table table-scroll table-condensed table-list no-text-clip']/tbody";
    }
    public static String leftPaneSpinnerXpath()
    {
        return "//div[@class='left-pane']/div[@class='loading-overlay'][@style='display: none;']";
    } 
    public static String rightpaneSpinnerXpath()
    {
        return "//div[@class='row-fluid container-fixed-right']/div[@class='loading-overlay ng-scope'][@style='display: none;']";
    }          
    public static String redMapPointerXpath()
    {
        return "//img[@src='img/map-icon-drag-pin.png']";
    }
     public static String addDriverCloseButtonXpath()
    {
        return "//h5/span[text()='Add driver status']/../../button[@class='close']";
    }
     public static String removeReasonTextXpath()
    {
        return "//textarea[@ng-model='data.removeReason']";
    } 
    public static String RemoveLinkXpath()
     {
        return "//ul[contains(@style,'display: block;')]/li//a/span[text()='Remove']";
     }
    public static String RemoveActionXpath(int columnNumber)
     {
        return "//li[@ng-repeat]["+columnNumber+"]/div/div/a[@fleet-tooltip='Actions']";
     }
    public static String ConfirmLocationRemoveXpath()
     {
        return "//span[text()='Remove location']/../../../../../../div[@class='modal-footer']/button[text()='Remove']";
     }
    public static String columnChooserXpath()
    {
        return "//div[@class='row-actions']//a[@ng-click='toggleColumnChooser($event)']";
    }
    public static String GridColumnChooserXpath()
    {//div[20]/div[1]/span[1]/a/i
        //return "//div[@class='column last']/../div[@class='column actions']//a[@class='btn btn-small column-chooser']";
        return "//a[@class='btn btn-small column-chooser']/i";
    }
    public static String columnChooserULXpath()
    {
        return "//ul[contains(@class, 'column-chooser-dropdown')][contains(@style, 'block')]";
    }
    
    public static String SpinnerDriversPageXpath()
    {
        return "//div[@name='driverListGrid']//div[@class='loading-overlay'][@style='display: none;']";
    }
    
    public static String GridColumnChooserULXpath()
    {
        return "//ul[contains(@class, 'dropdown-menu grid-column-chooser')][contains(@style, 'block')]";
    }
    public static String HOSLocationIDXpath()
    {
        return "//span[text()='HOS location ID']/../span[@ng-hide='column.visible']/../..//a";
    }
    public static String columnNameXpath(String ColumnName)
    {
        return "//ul[contains(@style,'display: block;')]//span[text()='"+ColumnName+"']/../span[@ng-hide='column.visible']/../..//a";
    }
    public static String columnChooserXpath(String ColumnName)
    {
        return "//span[text()='"+ColumnName+"']/../span[@ng-hide='column.visible']/../..//a";
    }
//span[text()='Remarks']/../span[@ng-hide='column.visible']/../..//a
    //fleet driver xpath
    public static String driverMenuColumXpath(String ColumnName)
    {
        return "//ul[contains(@class,'dropdown-menu grid-column-chooser')][contains(@style,'display: block')]//span[text()='"+ColumnName+"']/../..//a";
    }
    public static String workstatesXpath(String driverWorkstates)
    {
        return "//a/span[text()='"+driverWorkstates+"']";
    }
    public static String divColumnsXpath()
    {
        return "//div[@class='column'][1]/div";
    }
    public static String badgeXpath()
    {
        return "//span[@class='badge badge-grey ng-binding']";
    }
    public static String gridHeaderXpath()
    {
        return "//div[@class='page-header']//strong";
    }
    public static String gridColumnsXpath()
    {
        return "//div[@class='columns ui-sortable']/div/div";
    } 
    public static String driverRightHandSpinnerXpath()
    {
        return "//div[@class='loading-overlay ng-scope'][@style='display: none;']";
    }
    public static String DriverLefHandSpinnerXpath()
    {
        return "//div[@class='white-box-shadow span3 full-height container-left']/div[@class='loading-overlay'][@style='display: none;']";
    } 
    
    //
    public static String dataEntriesColumnChooserXpath(String Tabname)
    {
        return "//ul/li/strong[text()='"+Tabname+"']/../../../../../div[@id='hosGrid']//div[@class='row-actions']//a[@ng-click='toggleColumnChooser($event)']";
    }
    public static String OrgDetailsHeadingXpath()
    {
        return "//h5[text()='Organisation details']";
    }
    public static String MapSettingsHeadingXpath()
    {
        return "//legend[text()='Map settings']";
    }
    public static String mapSettingsTabXpath()
    {
        return "//a[text()='Map settings']";
    }
    public static String mapProviderSelectXpath()
    {
        return "//select[@name='mapProvider']";
    } 
    public static String defaultMapViewSelectXpath()
    {
        return "//select[@name='defaultMapView']";
    }  
    public static String MapSettngsSpinnerXpath()
    {
        return "//div[@class='row-fluid']/div[@class='loading-overlay ng-scope'][@style='display: none;']";
    } 
    public static String validationPopUpHeaderXpath()
    {
        return "//span[text()='Organisation updated successfully']";
    }
    public static String statusCountXpath()
    {
        return "//strong[text()='Status']/../..//../span[@class='badge badge-grey ng-binding']";
    }
    public static String SpinnerXpath()
    {
       return "//div[@class='loading-overlay'][@style='display: none;']";
    }
    public static String ExemptionLinkXapth()
    {
        return "//li/a[text()='Exemptions']";
    }
    public static String tabLinkXapth(String TabName)
    {
        return "//li/a[text()='"+TabName+"']";
    }
    public static String tabSpinnerXapth(String TabName)
    {
        return "//div/ul/li/strong[text()='"+TabName+"']/../../../../..//div[@class='fleet-grid-container strong-grid']/div[@class='loading-overlay ng-scope'][@style='display: none;']";
    }
    public static String tabDateXapth(String TabName)
    {
        return "//div/ul/li/strong[text()='"+TabName+"']/../../../../..//th/span[text() = 'Date & time']";
    } 
    public static String ExemptionSpinnerXapth()
    {
        return "//div[@id='logContent']/div[@class='loading-overlay'][@style='display: none;']";
    }
    public static String TableBadgeXpath(String TabName)
    {
        return "//li/strong[text()='"+ TabName+"']/../..//span[@class='badge badge-grey ng-binding']";
    }
    public static String GridRowsXpath(String TabName)
    {
        return "//li/strong[text()='"+TabName+"']//..//..//..//..//../div[@id='hosGrid']/div//tr[@class='light-blue']/../../tbody/tr";
    }
    public static String GridRemarksColumnXpath(String TabName)
    {
        return "//li/strong[text()='"+TabName+"']//..//..//..//..//../div[@id='hosGrid']/div//tr[@class='light-blue']/../../tbody/tr/td[@column-field='remarks']";
    }
    public static String LogDataActionButtonXpath(String TabName,int rowIndex)
    {
        return "//div[@ng-show='currentpane.selected'][@class='tab-pane']//div/ul/li/strong[text()='"+TabName+"']/../../../../..//li[@ng-repeat]["+rowIndex+"]/div/div/a[@fleet-tooltip='Actions']";  
    }
    public static String actionsToolTipXpath()
    {
        return "//div[@class='ng-scope tooltip left in']//span[@class='simple-tooltip-content ng-scope ng-binding'][text()='Actions']";
    }
    public static String EditLinkXpath()
     {
        return "//ul[contains(@style,'display: block;')]/li//a/span[text()='Edit']";
     }
    public static String locationAddXpath()
     {
        return "//a[text()='Change location']/../span";
     }
    public static String locationTextXpath(int rownumber)
     {
        return "//tr["+rownumber+"]/td[5]/div/span";
     }
    public static String dateTextXpath(int rownumber)
     {
        return "//tr["+rownumber+"]/td[3]/div/span";
     }
    public static String columnRowDataXpath(String tabname)
     {
        return "//div/ul/li/strong[text()='"+tabname+"']/../../../../..//tr[1]/td[@column-field='date']/div/span";
     }
    public static String dateTimeXpath()
     {
        return "//strong[text()='Date and time']/../../td[@class='ng-binding'][not(@ng-show='driverStatus.statusDateTime')]";
     }
    public static String satelliteProviderXpath()
     {
        return "//select[@name='satelliteProvider']";
     } 
    public static String ElementWithATagXpath(String elementName)
     {
        return "//a[text()='"+elementName+"']";
     }
    public static String statusDataSavedXpath()
     {
        return "//span[text()='Status data saved successfully']";
     }
    public static String workstateDropdownXpath()
     {
        return "//select[@id='workState']";
     } 
    public static String driverDetailsRightSpinnerXpath()
     {
        return "//div[@class='tab-pane active ng-scope']/div[@class ='loading-overlay ng-scope'][@style='display: none;']";
     }
    public static String searchButton()
    {
        return "//div[@class='text-filter']/a/i[@class='icon-search']/..";
    }
    public static String driverFilterTextBox()
    {
        return "//div[@class='pull-right']/div/input";
    }
    
    public static String selectdrivertoCascadeXpath()
     {
        return "//a/strong[text()='Select']";
     }
    public static String hoursOfServiceRightHandSpinnerXpath()
     {
        return "//div[@class='row-fluid']/div[@class ='loading-overlay ng-scope'][@style='display: none;']";
     }
    public static String ExpandOrganisationXpath(String organisationName)
     {
        return "//span[@class='ng-binding strong'][text()='"+organisationName+"']/../../../span";
     }
    public static String OrganisationCheckBoxXpath(String organisationName)
     {
        return "//span[@class='ng-binding strong'][text()='"+organisationName+"']/../../div//input";
     }
    public static String clickOrganisationCheckBoxXpath(String organisationName)
     {
        return "//span[@class='ng-binding strong'][text()='"+organisationName+"']";
     }
    public static String OrganisationSitesNumberXpath(String organisationName)
     {
        return "//span[@class='ng-binding strong'][text()='"+organisationName+"']/../../../div[2]/ul";
     }
    public static String OrganisationSitesXpath(String organisationName,int listNumber)
     {
        return "//span[@class='ng-binding strong'][text()='"+organisationName+"']/../../../div[2]/ul/li["+listNumber+"]/div//span";
     }
    public static String ExpandSiteXpath(String siteName)
     {
        return "//span[@class='ng-binding strong'][text()=\""+siteName+"\"]/../../../span";
     }
    public static String driverNumberXpath(String siteName)
     {
        return "//span[@class='ng-binding strong'][text()=\""+siteName+"\"]/../../../div[2]/ul";
     }
    public static String validateDriverNameXpath(int listNumber,String driverName)
     {
        return "//ul/li["+listNumber+"]/div//span[text()='"+driverName+"']";
     }
    public static String clickDriverCheckboxXpath(String driverName)
     {
        return "//ul/li/div//span[text()='"+driverName+"']";
     }
    public static String DriverCheckboxXpath(String driverName)
     {
        return "//ul/li/div//span[text()='"+driverName+"']/../input";
     }
    public static String DriverCheckboxXpath(int listNumber,String siteName)
     {
        return "//span[@class='ng-binding strong'][text()=\""+siteName+"\"]/../../../div[2]/ul/li["+listNumber+"]/div//input";
     }
    public static String siteCheckboxXpath(String siteName)
     {
        return "//span[@class='ng-binding strong'][text()=\""+siteName+"\"]/../../div//input";
     }
    public static String siteCheckboxXpath(String siteName,int listNumber)
     {
        return "//span[@class='ng-binding strong'][text()=\""+siteName+"\"]/../../../../li["+listNumber+"]/div//input";
     }
    public static String clickSiteCheckboxXpath(String siteName)
     {
        return "//span[@class='ng-binding strong'][text()=\""+siteName+"\"]";
     }
    public static String buttonSaveXpath()
     {
        return "//span[text()='Cascade hours of service settings']/../../../../../../div[@class='modal-footer']/button[@text='Save']";
     }
    public static String DriverSettingsSaveXpath()
     {
        return "//button[@text ='Save']";
     }
    public static String toplevelList(String organisationName)
    {
        return "//span[@class='ng-binding strong'][text()='"+organisationName+"']/../../../div[2]/ul/li[@ng-class=\"{ 'first-item': isTopLevel() }\"]";
    }
    public static String SaveConfirmationXpath()
     {
        return "//span[text()='Hours of Service settings cascaded successfully']";
     }
    public static String driverConfirmationXpath()
     {
        return "//span[text()='Driver updated successfully']";
     }
    public static String clickDriverHeaderXpath()
     {
        return "//h5/a[text()='Drivers']";
     }
    public static String hosLocationTxtXpath()
     {
        return "//input[@id='hosHomeLocation']";
     }
    public static String StartOfDaySelectXpath()
     {
        return "//select[@name='timeOfDay']";
     }
    public static String serviceRuleSetSelectXpath()
     {
        return "//select[@name='ruleId']";
     } 
    public static String HOSLocationXpath()
     {
        return "//input[@id='hosHomeLocation']/../ul/li[1]/a";
     } 
    
    //insight report
    
    public static String reportSuitTabXpath()
     {
        return "//li/a[text()='Report suite']";
     }  
    public static String reportRightHandSpinnerXpath()
     {
        return "//div[@class='well well-small well-white report-list']/div[@class='loading-overlay'][@style='display: none;']";
     }
     public static String reportCategorySelectXpath()
     {
        return "//div[@class='row-fluid ng-scope']/select";
        //div[@class='row-fluid ng-scope']/select/option
     }
      public static String reportCategorySelectOPXpath()
     {
        return "//div[@class='row-fluid ng-scope']/select/option";
        
     }
}

