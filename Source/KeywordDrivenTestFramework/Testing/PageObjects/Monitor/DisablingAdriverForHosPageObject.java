/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects.Monitor;

/**
 *
 * @author smnisi
 */
public class DisablingAdriverForHosPageObject {
    
    
    public static String allFliterButton()
    {
        return "//li/a/span[text()='All']";
    }
    
    public static String offDutyFliterButton()
    {
        return "//li/a/span[text()='Off duty']";
    }
    
    public static String sleepFilterButton()
    {
         return "//li/a/span[text()='Sleeper berth']";
    }
    
    public static String drivingFilterButton()
    {
          return "//li/a/span[text()='Driving']";
    }
    
    public static String driversPageHeader()
    {
        return "//h5/span[text()='Drivers']";
    }
    
    public static String HOSdriversFilterButton()
    {
        return "//li/a/span[text()='HOS drivers']";
    }
    public static String noItemsSpan()
    {
        return "//span[text()  ='No items to display']";
    }
    public static String HOSdriverPageHeader()
    {
        return "//ul/li/strong[text()='HOS drivers']";
    }
     public static String driverRightHandSpinnerXpath()
    {
        return "//div[@class='loading-overlay ng-scope'][@style='display: none;']";
    }
    public static String driverFilterTextBox()
    {
        return "//div[@class='pull-right']/div/input";
    }
    
    public static String actionButton()
    {
        return "//div[@class='cell alt']/div/a[@class='row-action']";
    }
    
    public static String editButton()
    {
        return "//ul[11]/li/a/span[text()='Edit']/../..";
    }
    
    public static String driverDetailsHeader()
    {
        return "//fieldset/legend[text()='Driver details']";
    }
    
    public static String hoursOfservice()
    {
        return "//li/a[text()='Hours of service']";
    }
    public static String hoursOfserviceRightSpinnerXpath()
    {
        return "//div[@class='row-fluid']/div[@class='loading-overlay ng-scope'][@style='display: none;']";
    }
    public static String hoursOfserviceHeaderPage()
    {
        return "//legend[text()='Hours of service settings']";
    }
    
    public static String editDriverPageHeader()
    {
        return "//span[text()='Edit driver']";
    }
    
    public static String hourOfServiceEnabledForDriverCheckboxXpath()
    {
        return "//span[text()='Hours of Service enabled for driver']";
    }
    
    public static String driverDisableCheckBox()
    {
        return "//span[text()='Hours of Service enabled for driver']/../input";
    }
    
    public static String driverID()
    {
        return "//div/p[text()='Driver ID: 1800']";
    }
    public static String driverHosID()
    {
        return "//input[@name='hosDriverId']";
    }
    public static String driverDisableHosID()
    {
        return "//input[@name='hosDriverId'][@disabled='disabled']";
    }
    public static String saveButton()
    {
        return "//button[text()='Save']";
    }
    public static String yesButton()
    {
        return "//button[text()='Yes']";
    }
    public static String cancelButton()
    {
        return "//button[text()='Cancel']";
    }
    
    public static String popMessageForDisablDriver()
    {
        return "//div/span[text()='Driver updated successfully']";
    }
    
    public static String searchButton()
    {
        return "//div[@class='text-filter']/a/i[@class='icon-search']/..";
    }
    
    public static String nonHosDriversButton()
    {
        return "//li/a/span[text()='Non HOS drivers']/../..";
    }
    
    public static String nonHosDriversPageHeader()
    {
        return "//strong[text()='Non HOS drivers']";
    }
            
    public static String driverNameNonHOSdrivers(String DriverName)
    {
        return "//div/a[text()='"+DriverName+"']";
    }
    
    public static String addButtonXpath()
    {
        return "//a[@fleet-tooltip='Add driver']";
    }
    
    //Navigating to HOS logViewer Xpaths
    
    public static String MonitorHeaderXpath()
    {
        return "//li/a[text()='MONITOR ']";
    }
    
    public static String HOSXpath()
    {
        return "//div/h4[text()='HOURS OF SERVICE']";
    }
    
    public static String hosLogViwer()
    {
        return "//li/a[text()='Log viewer']";
    }
    
    public static String HOSLogViewerPageHeader()
    {
        return "//h5/span[text()='HOS Log Viewer']";
    }
    
    public static String millerResults()
    {
        return "//div[@class='column ps-container']/h5";
    }
    public static String breadCrumbColumnsXpath(String name)
    {
        return "//a[@ng-click=\"$directive.select(item)\"]/span[contains(text(),\"" + name + "\")]/..";
    }
    
    public static String millerCancelButton()
    {
        return "//div/a[text()='Cancel']";
    }
    
    public static String fleetAdminHeader()
    {
        return "//h4[text()='FLEET ADMIN']";
    }
    public static String driversXpath()
    {
        return "//li/a[text()='Drivers']";
    } 
    public static String driversPasswordXpath()
    {
        return "//input[@name='password']";
    }
    public static String timeClockHeaderXpath()
    {
        return "//div/h5[text()='HOS Timeclock configuration']";
    }
    public static String timeClockLocationXpath()
    {
        return "//span[@id='timeclock-location']/input";
    }
    public static String timeClockLocationResultXpath()
    {
        return "//span[@id='timeclock-location']/input/../ul/li[1]";
    }
    public static String timeClockLaunchButtonXpath()
    {
        return "//button[@text='Launch']";
    }
    public static String timeClockSignButtonXpath()
    {
        return "//a[@id='login']";
    }
    public static String timeClockDriverIDtxtXpath()
    {
        return "//input[@ng-model='driverId']";
    }
    public static String timeClockPasswordtxtXpath()
    {
        return "//div[@id='password']/input";
    }
    public static String timeClockfailLabelXpath()
    {
        return "//label[@id='failedLogin']";
    }
    public static String TimeclockXpath()
    {
        return "//li/a[text()='Timeclock']";
    }
    public static String hourOfServiceEnabledLabelXpath()
    {
        return "//label/span[text()='Hours of service rule set']";
    }
    
    public static String hourOfServiceDropDownList()
    {
        return "//label/span[text()='Hours of service rule set']/../../select";
    }
    public static String clickDriverHeaderXpath()
     {
        return "//h5/a[text()='Drivers']";
     }
    public static String HOSDriverIDLabelXpath()
    {
        return "//div/label/span[text()='HOS Driver ID']";
    }
    public static String DriverLefHandSpinnerXpath()
    {
        return "//div[@class='white-box-shadow span3 full-height container-left']/div[@class='loading-overlay'][@style='display: none;']";
    }
    
    public static String HOSDriverIDTextBoxXpath()
    {
        return "//div/label/span[text()='HOS Driver ID']/../../span/input";
    }
    
    public static String HosHomeLocationTextBoxXpath()
    {
        return "//div/label/span[text()='HOS home location']/../../span/input";
    }
    public static String serviceRuleSetSelectXpath()
     {
        return "//select[@name='ruleId']";
     } 
    public static String pageSpinner()
    {
        return "//div[1]/div/div[1]/div[@class='loading-overlay' and @style='display: none;']";
    }
    public static String btnSelectXpath()
    {
        return "//a[@ng-click=\"$directive.submit()\"]";
    }
    public static String enableDriverPopMessage()
    {
        return "//div[@class='notification-wrapper notification-modal ng-scope']/div/span[2]";
    }
}
