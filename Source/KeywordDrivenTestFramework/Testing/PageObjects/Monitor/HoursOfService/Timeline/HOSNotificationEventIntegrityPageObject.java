/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects.Monitor.HoursOfService.Timeline;

/**
 *
 * @author smnisi
 */
public class HOSNotificationEventIntegrityPageObject {
    
   public static String OffWorkStateXpath()
   {
       return "//span[text()='OFF']";
   }
   
   public static String AddLogDataButton()
   {
       return "//span[text()='Add log data']/..";
   }
   
   public static String AddLogDataPageHeader()
   {
       return "//h5/span[text()='Add log data']/..";
   }
   
   public static String driveNameLabel()
   {
       return "//div[@class='span12']/label/span[text()='Driver name']";
   }
   
   public static String catergorgLabel()
   {
       return "//label/span[text()='Category']";
   }
   
   public static String selectedEventCategory()
   {
       return "//label/span[text()='Category']/../../select";
   }
   
   public static String typeDropdownList()
   {
       return "//span[text()='Type']/../../select";
   }
   
   public static String saveButton()
   {
      return "//button[text()='Save']";
   }
   
   public static String confirmationPageHeader()
   {
       return "//span[text()='Confirm event details']";
   }
   
   public static String confirmationButton()
   {
       return "//button[text()='Confirm']";
   }
   
   //*************LOG VIEWER
   public static String hosLogViewerPageHeader()
   {
       return "//h5/span[text()='HOS Log Viewer']";
   }
   
   public static String hosTimeLineButton()
   {
       return "//a[@fleet-tooltip='HOS timeline']";
   }
   
   public static String hosTimeLineXpathIE()
   {
       return "//a[@fleet-tooltip='HOS timeline']//i";
   }
   
   public static String inputDataEventLabel()
   {
       return "//div/span[text()='Input Data']";
   }
   
   //xpath
   
   public static String HoverOverInputDataEvent()
   {
       return "//div/span[text()='Input Data']//..//canvas[@tooltip-before-show='tooltipShow($source)']";
   }
   
   public static String getCurrentDateFromTextBox()
   {
       return "//div[@class='form-inline pull-left']/div/input";
   }
   
   
   public static String remarkTextArea()
   {
       return "//label[text()='Remarks']/../textarea";
   }
   
   public static String confirmButtonXpath()
   {
       return "//button[text()='Confirm']";
   }
   
   public static String addedDataLogToolTipDivXpath()
   {
       return "//div[@class='ng-scope tooltip timeline-tooltip in']/div/div/div/div/div/div[2]/div";
       //return "//div[@class='ng-scope tooltip timeline-tooltip in']/div/div/div/div/div/div";
   }
   

   public static String eventsFlagButton()
   {
       return "//a[@fleet-tooltip='Events']";
   }
   
   //xpath for events button for firefox
   public static String EventsFlagButtonFirefox()
   {
       return "//span[@class='badge badge-success font-normal ng-binding']";
   }
   
   public static String selectEventPageheader()
   {
       return "//div/h5/span[text()='Select events']";
   }
   
   public static String SelectEventPage()
   {
       return "//div[@class='tooltip ng-scope right hide']//..//div[@class='modal-backdrop fade in']";
   }
   
   public static String eventsFliter()
   {
       return "//span[text()='Select events']/../../../form/div/input";
   }
   
   public static String selectInputDataLabelXpath()
   {
       return "//td/div/span[text()='Input Data']";
   }
   public static String DisabledUpArrowCheck()
   {
       return "//a[@disabled='disabled'][@fleet-tooltip='Move event up']";
   }
   public static String clickEventArrowUpXpath()
   {
       return "//a[@fleet-tooltip='Move event up']";
   }
   
   public static String inputDatacheckBoxXpath()
   {
       return "//td/div/span[text()='Input Data']/../../../td[1]/input[1]";
   }
   
   public static String inspectionSpanText()
   {
       return "//td/div/span[text()='Inspections']";
   }
   
   public static String inspectionCheckBox()
   {
       return "//td/div/span[text()='Inspections']/../../../td[1]/input[1]";
   }
  
   public static String selectButton()
   {
       return "//div[@class='modal-footer']/button[text()='Select']";
   }
   
   public static String dateTextBox()
   {
       return "//div[@class='form-inline pull-left']/div/input";
   }
   
   public static String trimTimeZoneFormate()
   {
       return "//div[51]/div[2]/div/div/div/div/div[1]/div[1]";
   }
   
   public static String managerHeader()
   {
       return "//li/a[text()='MANAGE ']";
   }
   
   public static String operationsXpath()
   {
       return "//div/h4[text()='OPERATIONS']";
   }
   
   public static String databaseAdministration()
   {
       return "//li/a[text()='Database administration']";
   }
   
   public static String datebaseAdministrationPageHeader()
   {
       return "//div/h5/span[text()='Database administration']";
   }
   
   public static String manageOrganisationStructure()
   {
       return "//div/h5/span[text()='Manage organisation structure']";
   }
   
   public static String testRSOgroup()
   {
       return "//div/div/a/strong[text()='Test RSO']/../..";
   }
   
   public static String testRSOdropdownButton()
   {
       return "//div/div/a/strong[text()='Test RSO']/../../../../span";
   }
   
   public static String groupOrganisationGHOSUS()
   {
       return "//div/div/a/strong[text()='GHOS US Testing']/../..";
   }
   
   public static String groupOrganisationPageHeader()
   {
       return "//div/h5/span[text()='(GHOSTesting_2014)']";
   }
   
   public static String measureSettinsButton()
   {
       return "//li/a[text()='Measurement settings']";
   }
   
   public static String regionalSettings()
   {
       return "//h6[text()='Regional Settings']";
   }
   
   public static String driverLogViewer()
   {
       return "//i[@class='icon-tasks']/..";
   }
   
   public static String dateAndtimeToolTipXpath()
   {
       return "//div[@class='tooltip-inner']/div/div/div/div/div[2]/div[2]/strong";
   }
   
   public static String eventValueTooltipXpath()
   {
       return "//div[@class='tooltip-inner']/div/div/div/div/div[2]/div[1]/strong/span";
   }
   
   public static String dateAndTimeDivText()
   {
       return"//div[@class='tooltip-inner']/div/div/div/div/div[2]/div[2]";
   }
   
   public static String eventCodeDivXpath()
   {
       return "//div[@class='tooltip-inner']/div/div/div/div/div[2]/div[1]";
   }
   
   //xpath for timezone on organisation groups page
   public static String GroupUTCTimezone()
   {
       return "//td[contains(text(),'ART')]";
   }
}
