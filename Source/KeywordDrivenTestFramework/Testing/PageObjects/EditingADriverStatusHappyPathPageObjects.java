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
public class EditingADriverStatusHappyPathPageObjects {
    
    
   public static String LogViewerSpinner()
   {
       return "//div[@class='loading-overlay'][@style='display: none;']";
   }
   
   public static String DatePicker()
   {
       return "//div[@class='pull-left datepicker ng-pristine ng-valid ng-valid-dmx-greater-than-or-equal-to']/span[@class='add-on btn']";
   }
   
   public static String LeftArrow()
   {
       return "//i[@class='icon-chevron-left icon-grey']";
   }
   
   public static String ActionButton()
   {
       return "//div[@class='fleet-grid full-height has-row-actions']//ul[1]/li//a[@fleet-tooltip='Actions']";
   }
   
   public static String EditButton()
   {
       return "//span[text()='Edit']";
   }
   
   public static String EditDriverStatusHeadingModal1()
   {
       return "//div[@class='modal hide fade in']//span[text()='Edit driver status']";
   }
   
   public static String DriverName()
   {
       return "//form[@name='driverStatusCrudForm']//input[@name='driverName']";
   }
   
   public static String RetrieveDriverInformation(String number)
   {
       return "//tbody//tr[1]/td[@style='display: none;']/../td['"+number+"']/div/span";
   }
   //status 2
   //date and time 3
   //remark 6
   
   public static String StatusMainHeading()
   {
       return "//div[@class='timeline-table page-header']//strong[text()='Status']";
   }
   
   
   public static String Status(String name)
   {
       return "//span[@class='hos-workstate-label ng-scope']/span[text()='"+name+"']";
   }
   
    public static String DriverStatus()
   {
       return "//td[@column-field='status']//span[text()='Driving']";
   }
   
   public static String StartDate()
   {
       return "//strong[text()='Start date']/../../div[contains(text(),'(')][contains(text(),')')]";
   }
   
   public static String Date()
   {
       return "//div[@class='hos-tooltip ng-scope']/div/strong[text()='Start date']/..";
   }

   public static String BreadcrumbDriver()
   {
       return "//div[@ng-show=\"type == 'miller'\"]//span[text()='HOS Driver -  55004E6ED8']";
   }
   
   public static String EditStatus()
   {
       return "//span[text()='Edit status']";
   }
   public static String MainPageHeading(String name)
   {
       return "//h5/span[text()='"+name+"']";
       //HOS Log Viewer
   }
   
   public static String DateAndTime()
   {
       return "//div[@id='driverStatusDateTime']//input";
   }
   
   public static String CurrentStatusValue()
   {
      // return "//select[@name='workState']";
       return "//label[@for='workState']/../select";
   }
//   public static String CurrentStatusValue2(String name)
//   {
//      // return "//select[@name='workState']";
//       return "//label[@for='workState']/../select/option[text()='"+name+"']";
//   }
   
   public static String CurrentStatus(String value)
   {
       return "//Select[@name='workState']/option[@value='"+value+"']";
   }
   
   public static String Remarks()
   {
       return "//span/../../textarea[@name='remarks']";
   }
   
   public static String StatusSelection(String name)
   {
       return "//option[text()='"+name+"']";
   }
//        Standby
//        Driving
   
   public static String NextButton()
   {
       return "//button[text()='Next']";
   }
   
   public static String EditDriverStatusHeadingModal2()
   {
       return "//div[@class='modal hide fade modal-medium in']//span[text()='Edit driver status']";
   }
   
   public static String DriverNameModal2()
   {
       return "//table[@class='table table-bordered table-striped table-condensed no-margin']//tr[1]/td[2]";
   }
   
   public static String StatusMoadl2()
   {
       return "//table[@class='table table-bordered table-striped table-condensed no-margin']//tr[2]/td[2]";
   }
   
   public static String DateAndTimeModal2()
   {
       return "//table[@class='table table-bordered table-striped table-condensed no-margin']//tr[3]/td[2]";
   }
   
   public static String RemarksModal2()
   {
       return "//table[@class='table table-bordered table-striped table-condensed no-margin']//tr[5]/td[2]";
   }
  
   public static String OdometerAndLocation(String name)
   {
       return "//table[@class='table table-bordered table-striped table-condensed no-margin']//strong[text()='"+name+"']/../../td[2]";
   }
   
   public static String DisabledButtonCheck(String name)
   {
       return "//button[text()='"+name+"']";
   }
   
   public static String ConfirmChangesHeading()
   {
       return "//span[text()='Confirm changes']";
   }
 
   public static String DriverInformationConfirmation(String name)
   {
       return "//span[text()='Confirm changes']/../../..//strong[text()='"+name+"']";
              // + "/../../td[2]";
       //Driver name
       //Asset
       //Date and time
       //odometer
       //Location
       //Remarks
   }
   
   public static String StatusChange(String driver1, String driver2)
   {
      // return "//span[text()='Confirm changes']/../../..//strong[text()='Status change']/../../td[2]/span/strong[text()='"+driver1+"']/../strong[text()='"+driver2+"']";
       return "//strong[text()='"+driver1+"']/../strong[text()='"+driver2+"']";
   }
   
   public static String CancelButtonConfirminationModal()
   {
       return "//div[@class='modal-footer']/button[text()='Confirm']/../button[text()='Cancel']";
   }
   
   public static String StatusChangeOuput()
   {
       return "//strong[text()='Status change']/../../td[2]/span";
   }
//   
//   public static String PopUpWait()
//   {
//       return "//div[@class='notification-wrapper notification-modal ng-scope'][@style='display: none;']";
//   }
   public static String PopUpWait(String state)
   {
       return "//div[@class='notification-wrapper notification-modal ng-scope'][@style='display: "+state+";']";
   }
   
   public static String Edited()
   {
       return "//span[text()='Edited']";
   }
   
   public static String CancelButtonModal1()
   {
       return "//button[text()='Next']/../button[text()='Cancel']";
   }
   
   public static String HOSTimelineButton()
   {
       return "//a[@fleet-tooltip='HOS timeline']";
   }
      
}
