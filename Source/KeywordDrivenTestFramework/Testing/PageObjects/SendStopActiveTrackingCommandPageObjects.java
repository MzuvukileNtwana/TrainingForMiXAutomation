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
public class SendStopActiveTrackingCommandPageObjects {
    
    
    public static String ManageTab()
    {
        return "//a[text()='MANAGE ']";
    }
    
    public static String OrgSettings()
    {
        return "//a[text()='Organisation settings']";
    }
    
    public static String ConfigGroups()
    {
        return "//a[text()='Configuration groups']";
    }
    
    public static String DriverDefaultsHeadingOrgGroupsWait()
    {
        return "//div[@class='row-fluid']/legend[text()='Driver defaults']";
    }  
    
    public static String BottomPageTextOrgGroupsWait()
    {
        return "//div[@class='span6 no-margins']/label[3]/span";
    }
    
    public static String TableHeadingConfigGroupsWait()
    {
        return "//th[@column-field='description']";
    }
    
    public static String PreviousPageButtonWait()
    {
        return "//div[@class='btn-group']/button[@fleet-tooltip='Previous page']";
    }
    
    public static String OrgHeading()
    {
        return "//span[text()='Organisation settings driver access defaults']";
    }
    
    public static String BreadCrumb()
    {
        return "//h5/span[text()='DVT Automation']";
    }
    
    public static String TrackingOptionsClick()
    {
        return "//div[@class='tabbable tabs-left full-height']/ul/li/a[text()='Tracking options']";
    }
    
    public static String TrackingOptionHeading()
    {
        return "//h5[text()='Tracking options']";
    }
    
    public static String RetreiveSecondsFor()
    {
        return "//form[@name='trackingOptionsForm']/div/p/span[text()='seconds for']/../input";
    }
    
    public static String RetreiveMinutes()
    {
        return "//form[@name='trackingOptionsForm']/div/span[text()='minutes.']/../input[@ng-model='dataForm.activeTrackingDuration']";
    }
    
    public static String ActiveTrackingFrequencyAndDurationHeading()
    {
        return "//div[@class='well well-white']/h6[text()='Active tracking frequency and duration']";
    }
    
    public static String AssetDescriptionWait()
    {
        return "//div[@class='column-heading sortable sorted-asc']/span[text()='Asset description']";
    }
    
    public static String ActionButton()
    {
        return "//a[@class='row-action']";
    }
    
    public static String EditButton()
    {
        return "//ul[@class='dropdown-menu grid-row-action-dropdown-menu']/li/a[@event='Edit']";
        //return "//ul[@class='dropdown-menu pull-right grid-row-action-dropdown-menu']/li/a[@row-index='0' and @event='Edit']";
    }
    
    public static String EditAssetHeadingWait()
    {
        return "//h5/span[text()='Edit asset configuration:']";
    }
    
    public static String configGroupRightSpinnerXpath()
    {
        return "//div[@class=\"paged-grid\"]/div[contains(@class,'loading-overlay') and contains(@style,'none')]";
    }
    
    public static String MobileDeviceTemplates()
    {
        return "//a[text()='Mobile device templates']";
    }
    
    public static String ConnectionWait()
    {
        return "//th[text()='Connection']";
    }
    
    public static String SpanNoItemsDisplayedXpath()
    {
        return "//div[contains(@class, 'mt')]//span[text()='No items to display']";
    }
    
    public static String S2LineModem()
    {
        return "//td[text()='S2']/../td/a[text()='GSM modem']";
    }
    
    public static String GSMModemHeadingWait()
    {
        return "//span[text()=' - GSM modem (Extended Device)']";
    }
    
    public static String PacketCommunicationHeadingWait()
    {
        return "//strong[text()='Packet communications']";
    }
    
    public static String SendAVL()
    {
        return "//span[text()='- Send AVL In trip frequency']";
    }
    
    public static String AVLFrequency(String model)
    {
        return "//span[text()='- Send AVL In trip frequency']/../../td/div/span/span/input[@ng-model='"+ model+"']";
    }
    
    public static String ShowSelectedAssetsWait()
    {
        return "//span[text()='Show selected assets']";
    }

    
    public static String LiveTrackingActionButton()
    {
        return "//div[@class='row-action btn-group ng-scope']/a";
    }
    
    public static String ViewNewWindow()
    {
        return "//ul[@class='dropdown-menu pull-right'][contains(@style, 'display: block;')]/li/a/span[text()='View in new window']";
        //return "//ul[@class='dropdown-menu pull-right'][2]/li[3]/a";
    }
       
    public static String VehicleHover()
    {
        return "//div[@class='leaflet-marker-icon marker marker-small']/i";
    }
             
    public static String AssetInformationBubble()
    {
        return "//div[@class='leaflet-map-pane']/div[@class='leaflet-objects-pane']/div[@class='leaflet-popup-pane']/div/div[1]/div/div/table/tbody/tr";
//        return "//div[@class='leaflet-map-pane']/div[@class='leaflet-objects-pane']/div[@class='leaflet-popup-pane']/div/div[1]/div/div/table/tbody/tr['"+number+"']/td[2]";
    }
    
      public static String AssetInformationBubbleUpdate(String name)
    {
        return "//div[@class='leaflet-map-pane']/div[@class='leaflet-objects-pane']/div[@class='leaflet-popup-pane']/div/div[1]/div/div/table/tbody/tr/td/strong[text()='"+name+"']/../../td[2]";
        //return "//div[@class='leaflet-map-pane']/div[@class='leaflet-objects-pane']/div[@class='leaflet-popup-pane']/div/div[1]/div/div/table/tbody/tr";
       // return "//div[@class='leaflet-map-pane']/div[@class='leaflet-objects-pane']/div[@class='leaflet-popup-pane']/div/div[1]/div/div/table/tbody/tr['"+number+"']/td[2]";
    }
        
    public static String  AssetRegistrationAndDescription()
    {
        //return "//h5[text()='DVT-Live - DVT Live Tracking Unit']";
        return "//div[@class='follow-asset-header']/h5[text()='DVT-Live - DVT Live Tracking Unit New']";

    }
    
    public static String  StopActiveTracking()
    {
        return "//div[@class='active-tracking-link']/span[@class='no-margins']/a[@ng-click='stopActiveTracking(0)']";
       // return "//span/a[@ng-click='stopActiveTracking(0)']";
        //return "//a[text()='Stop active tracking']";
      //return "//div[@class='active-tracking-link']/span/a[@ng-click='stopActiveTracking(0)']";
        //return "//div[@class='active-tracking-link']/span/a[text()='"+name+"']";
    }
    
    public static String NavigateToMonitor()
    {
        return "//div[@class='toolbar']/ul/li/a[text()='MONITOR ']";
    }
 
    public static String  StartActiveTracking()
    {
        return "//div[@class='active-tracking-link']/span[@class='no-margins']/a[@ng-click='startActiveTracking(0)']";
       // return "//div[@class='active-tracking-link']/span/a[@ng-click='startActiveTracking(0)']";
    // return "//a[text()='Start active tracking']";
        //return "//div[@class='active-tracking-link']/span/a[text()='"+name+"']";
    }
    public static String RefreshWait()
    {
        return "//span[text()='Refresh']";
    }
    
    
    public static String GreenValidation()
    {
        return "//span[text()='DVT Live Tracking Unit New']/../../../../td[@column-field='lastPosition.movementStatus']/div/i[@class='ng-scope icon-shape-circle icon-green']";
    }
    
    public static String SpinnerWait()
    {
        return "//div[@class='columns ui-sortable']/../div[@class='loading-overlay'][@style='display: none;']";
    }
    
    public static String ShowAssetValidation()
    {
        return "//div[@class=\"leaflet-marker-icon marker marker-small\"]/i";
    }
    
    public static String ClickCheckBox()
    {
        return "//span[text()='DVT Live Tracking Unit New']/../../../../td[@ng-show='column.visible']/div/span/input";
    }
    public static String headerCheckboxXpath()
    {
        return "//th[@class='column-heading  first']//input";
    }
    public static String CorrectSorting()
    {
        return "//th[@column-field='lastPosition.movementStatus']/span[5][@style='display: none;']";
    }
    
    public static String AssetXpath()
    {
        return "//i[@tooltip-placement='right']/../../..//td[@column-field='assetDescription']//span";
    }
    
    public static String FilterTextBox()
    {
        return "//div[@ng-hide='assetListFiltered']/div/input";
       // return "//div[@class='input-reset-wrapper']/input[@class='filter-search-input input-medium span12 ng-valid ng-dirty']";  
    }
    
    public static String FilterConfigGroups()
    {
        return "//div[@class='pull-right']/div[@class='text-filter empty']/input";
    }
    
    public static String FilterButtonClickConfigGroups()
    {
        return "//div[@class='page-header']/h5/../div[@class='pull-right']/div/a[@class='btn btn-small']";
     //   return "//div[@class='pull-right']/div[@class='text-filter empty']/a[@class='btn btn-small']";
       // return "//div[@class='pull-right']/div[@class='text-filter empty']/a/i[@class='icon-search']";
    }
    
   /*
    *@author NMei
    */
    public static String Templates()
    {
        return "//*[@id=\"main-nav-toolbar\"]/ul/li[2]/div[2]/div/div/div[1]/div[1]/ul/li[2]/a";
    }
    public static String EventTemplates()
    {
        return "//*[@id=\"MainView\"]/div/div/div/div/div[2]/div//div/div/ul/li[1]/a";
    }
    public static String LocationTemplates()
    {
        return "//*[@id=\"MainView\"]/div/div/div/div/div[2]/div//div/div/ul/li[2]/a";
    }
    public static String TableHeadingTemplatesWait()
    {
        return "//th[@column-field='description']";
    }
    public static String _MobileDeviceTemplates()
    {
        return "//*[@id=\"MainView\"]/div/div/div/div/div[2]/div//div/div/ul/li[3]/a";
    }
    public static String NewEventNameElement()
    {
        return "//*[@id=\"MainView\"]/div/div/div/div[3]/div/div/div/div/div/div[1]/div[2]/div/form/div/input";
    }
    public static String AddNewEventButton()
    {
        return "//*[@id=\"MainView\"]/div/div/div/div[2]/div/div/div/legend";
    }
    public static String AddNewLocationButton()
    {
        return "//*[@id=\"MainView\"]/div/div/div/div/div[1]/div/div[1]/span/a";
    }
    public static String SelectEvents()
    {
        return "//*[@id=\"MainView\"]/div/div/div/div[3]/div/div/div/div/div/div[1]/div[2]/div/button";
    }
    public static String SelectEventFilter()
    {
        return "/html/body/div[27]/div[1]/div/div/form/div/input";
    }
    public static String EventCheckBox()
    {
        return "/html/body/div[27]/div[1]/div/div/div[2]/div/div/div[1]/div[1]/table/tbody/tr/td[1]/input[1]";
    }
    public static String EventSelectButton()
    {
        return "/html/body/div[27]/div[2]/button[2]";
    }
    public static String Cancel()
    {
        return "//*[@id=\"MainView\"]/div/div/div/div[2]/div/div/div[1]/button[1]";
    }
    public static String SelectLocation()
    {
        return "//*[@id=\"MainView\"]/div/div/div/div[3]/div/div/div/div/div/div[1]/div[2]/div/button";
    }
    public static String SelectLocationFilterXpath()
    {
        return "/html/body/div[27]/div[1]/div/div/form/div/input";
    }
    public static String SelectFilter()
    {
        return "/html/body/div[27]/div[2]/button[2]";
    }
    public static String SaveLocationTemplate()
    {
        return "//*[@id=\"MainView\"]/div/div/div/div[2]/div/div/div[1]/button[2]";
    }
    public static String CancelLocationTemplate()
    {
        return "//*[@id=\"MainView\"]/div/div/div/div[2]/div/div/div[1]/button[1]";
    }
    

}
