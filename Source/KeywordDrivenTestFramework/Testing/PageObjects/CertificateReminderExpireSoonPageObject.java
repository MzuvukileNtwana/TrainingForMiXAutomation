/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects;

/**
 *
 * @author arala
 */
public class CertificateReminderExpireSoonPageObject {
      public static String driversXpath() 
    {
        return "//a[text()='Drivers']";
    } 
    public static String AddCertificationTableXpath() 
    {
        return "//button[text()='Add certification']/../../../div/div[@class='row-fluid']/div/div/div/div/table/tbody";
    } 
      //button[text()='Add certification']/../../../div/div[@class='row-fluid']/div/div/div/div/table/tbody
    public static String addDriverXpath() 
    {
        return "//a[@fleet-tooltip='Add driver']";
    } 
    public static String ValidFromXpath() 
    {
        return "//span[text()='Valid from']/../../div[@class='datepicker ng-dirty ng-valid ng-valid-dmx-required']";
    } 
    public static String ValidaDate() 
    {
        return "//div[@ng-model='certification.validFrom.date']//i";
    } 
    public static String DoneButton() 
    {
        return "//div[@class='datepicker-widget in']//a";
    } 
    public static String Instructor() 
    {
        return "//input[@ng-model='certification.instructor']";
    } 
     public static String inputValidFromXpath() 
    {
        return "//span[text()='Valid from']/../../div[@class='datepicker ng-dirty ng-valid ng-valid-dmx-required']/input";
    } 
      public static String retrievCertificateNameXpath() 
    {
        return "//label/span[text()='Certification type']/../../select/option[@value='0']";
    } 
        public static String enterDateXpath() 
    {
        return "//span[text()='Valid from']/../../div/input";
    } 
    
    public static String DriversLandingPageXpath() 
    {
        return "//span[text()='Drivers']";
    } 
    public static String DriverIDXpath() 
    {
        return "//span[text()='Driver ID']";
    } 
    public static String driversPageXpath() 
    {
        return "//span[text()='Drivers']";
    }   
    public static String AdddriversPageXpath() 
    {
        return "//a[@fleet-tooltip='Add driver']";
    }   
    public static String driverIndexXpath() 
    {
        return "//a[@row-index='0']";
    }   
    public static String EditDriverXpath() 
    {
        return "//span[text()='Edit driver']";
    }  
     public static String AvailableAXpath() 
    {
        return "//span[text()='Available']";
    }  
    
    public static String TableBodyXpath() 
    {
        return "//button[text()='Add type']//..//../div[4]/div/div/div/div/table/tbody";
    }  
     public static String checkRecipientsXpath() 
    {
        return "//span[text()='DVT Test Automation Automation']/../../../td/input[@type='checkbox']";
    }  

    public static String CertificationsXpath() 
    {
        return  "//a[text()='Certifications']";
    }   
    public static String CertificationsTypesXpath() 
    {
        return  "//a[text()='Certification types']";
    }   
    public static String CertificationsStatusXpath() 
    {

        return  "//span[text()='Certification status: ']";
    }   
    public static String LoadMoreXpath() 
    {
        return  "//div[@ng-show=\"activeTab.key == 'certification-types'\"][@class='row-fluid']/div/div/div/div/table/tbody/tr/../../../div[@class='center-text mt-5']/a";
    }  
     
    public static String ActionButtonXpath(String actionRowNo) 
    {
         return  "//button[text()='Add type']//..//../div[4]/div/div/div/div/table/tbody/tr/../../../div[@class='center-text mt-5']/a/../../div[@ng-show='rowActions']/ul/li["+ actionRowNo +"]/div/div/a[1]";
    }  
    //ul[@class='dropdown-menu pull-right']/../ul["+editNo+"]
    public static String clickEditButtonXpath(String actionRowNo) 
    {
        return " //button[text()='Add type']//..//../div[4]/div/div/div/div/table/tbody/tr/../../../div[@class='center-text mt-5']/a/../../div[@ng-show='rowActions']/ul/li["+ actionRowNo +"]/div/div/a[1]/../../../../../../../../../../../../../../../../../../../../../../../../../../ul[@class='dropdown-menu pull-right'][contains(@style,'block')]/li/a/span[text()='Edit']";
        //return   "//ul[@class='dropdown-menu pull-right']/../ul["+editNo+"]/li/a/span[text()='Edit']";
    } 
    public static String CertificationsTabXpath() 
    {
        return  "//ul[@class='nav nav-tabs']//a[text()='Certifications']";
        //          return "//a[text()='Certification types']/../../li/a";
    }   

    public static String loadMoreXpath() 
    {
        return "//button[text()='Add type']//..//../div[4]/div/div/div/div/table/tbody/tr/../../../div[@class='center-text mt-5']/a";
    } 
    
    public static String datepickerXpath() 
    {
        return  "//span[text()='Valid from']/../../div/span/i";
    }   
    public static String todayDateXpath() 
    {
        return  "//div[@aria-hidden='false']//div[@class='day ng-scope ng-binding selected']";
    }   
    public static String TotodayDateXpath() 
    {
        return  "//span[text()='to']/../div/span/i/../../../../../../../../../../../../../../../../../../../div[@class='datepicker-widget in']//div[@class='day ng-scope ng-binding selected']";
    }   
    
    public static String clickTodayDateXpath(String day) 
    {
        return  "//div[text()='"+ day +"'][@class='day ng-scope ng-binding selected']";
    }   
     public static String dayOfMonthOnTopXpath(String day) 
    {
        return  "//div[text()='"+ day +"'][@class='day-of-month ng-binding selected']";
    }   
      public static String DoneXpath() 
    {
        return  "//div/a[text()='Done'][@class='ng-binding']";
    }   
      public static String doneButtonXpath() 
    {
        return  "(//div/a[text()='Done'][@class='ng-binding'])[1]";
    }   
      public static String done2ButtonXpath() 
    {
        return  "(//div/a[text()='Done'][@class='ng-binding'])[2]";
    }   
       public static String InstructorXpath() 
    {
        return  "//span[text()='Instructor']/../../input";
    }   
        public static String checkThisInstructorIsQualifiedXpath() 
    {
        return  " //span[text()='This instructor is qualified to award this certification']/../input";
    } 
    public static String actualExpiredDatXpath() 
    {
        return  " //div/label/span[text()='Expiry date']/../../div[@class='datepicker ng-pristine ng-valid']";
    } 
     public static String inputActualExpiredDatXpath() 
    {
        return  " //div/label/span[text()='Expiry date']/../../div[@class='datepicker ng-pristine ng-valid']/input";
    } 
    public static String ValidityXpath() 
    {
        return  "//div/label[text()='Validity']/../div/input";
    } 
    public static String AvailableXpath() 
    {
        return  "//div[@class='notification-wrapper notification-modal ng-scope']/div/span/i" ;
    } 
      public static String whenDaysInMonthXpath() 
    {
        return  "//span[text()='When']/../../div/div/div/span/i/../../../../../../../../../../../../../../../../../../../div[@class='datepicker-widget in']//div[@class='day ng-scope ng-binding selected']/../div[@ng-repeat='day in directive.daysInMonth']" ;
    } 
    public static String monthEndDayXpath(String lastDay) 
    {
        return  "//span[text()='When']/../../div/div/div/span/i/../../../../../../../../../../../../../../../../../../../div[@class='datepicker-widget in']//div[@ng-repeat='day in directive.daysInMonth']["+lastDay+"]" ;
    } 
    public static String currentMonthXpath() 
    {
        return  "//span[text()='When']/../../div/div/div/span/i/../../../../../../../../../../../../../../../../../../../div[@class='datepicker-widget in']//div[@class='month-of-year ng-binding']" ;
    }  
    public static String latsmonthOfTheYearXpath() 
    {
        return  "//span[text()='When']/../../div/div/div/span/i/../../../../../../../../../../../../../../../../../../../div[@class='datepicker-widget in']//div[@ng-repeat='month in directive.shortMonthsOfYear'][12]" ;
    } 
    public static String SelectedYearXpath() 
    {
        return  "//span[text()='When']/../../div/div/div/span/i/../../../../../../../../../../../../../../../../../../../div[@class='datepicker-widget in']//div[@class='year ng-binding']" ;
    } 
     public static String nextYearXpath() 
    {
        return  "//span[text()='When']/../../div/div/div/span/i/../../../../../../../../../../../../../../../../../../../div[@class='datepicker-widget in']//div[@class='year ng-scope p1']" ;
    } 
     public static String whenDoneXpath() 
    {
        return  "//span[text()='When']/../../div/div/div/span/i/../../../../../../../../../../../../../../../../../../../div[@class='datepicker-widget in']//a[text()='Done']" ;
    } 
     public static String whenFirstMonthXpath() 
    {
        return  "//span[text()='When']/../../div/div/div/span/i/../../../../../../../../../../../../../../../../../../../div[@class='datepicker-widget in']//div[@class='month ng-scope ng-binding'][@ng-repeat='month in directive.shortMonthsOfYear'][1]" ;
    } 
      public static String FirstUnSelectedDayXpath() 
    {
        return  "//span[text()='When']/../../div/div/div/span/i/../../../../../../../../../../../../../../../../../../../div[@class='datepicker-widget in']//div[@class='day ng-scope ng-binding'][@ng-repeat='day in directive.daysInMonth'][1]" ;
    } 
      public static String clickNextMonthXpath() 
    {
        return  "//span[text()='When']/../../div/div/div/span/i/../../../../../../../../../../../../../../../../../../../div[@class='datepicker-widget in']//div[@class='month ng-scope ng-binding'][1]" ;
    } 
       public static String clickFirstXpath() 
    {
        return  "//span[text()='When']/../../div/div/div/span/i/../../../../../../../../../../../../../../../../../../../div[@class='datepicker-widget in']//div[@class='day ng-scope ng-binding'][@ng-repeat='day in directive.daysInMonth'][1]" ;
    } 
       
        public static String ToDaysInMonthXpath() 
    {
        return  "//span[text()='to']/../div/span/i/../../../../../../../../../../../../../../../../../../../div[@class='datepicker-widget in']//div[@class='day ng-scope ng-binding selected']/../div[@ng-repeat='day in directive.daysInMonth']" ;
    } 
    public static String TomonthEndDayXpath(String TolastDay) 
    {
        return  "//span[text()='to']/../div/span/i/../../../../../../../../../../../../../../../../../../../div[@class='datepicker-widget in']//div[@ng-repeat='day in directive.daysInMonth']["+TolastDay+"]" ;
    } 
    public static String TocurrentMonthXpath() 
    {
        return  "//span[text()='to']/../../../../../../../../../../../../../../../../../div[@class='datepicker-widget in']//div[@class='month-of-year ng-binding']" ;
    }  
    public static String TolatsmonthOfTheYearXpath() 
    {
        return  "//span[text()='to']/../../../../../../../../../../../../../../../../../div[@class='datepicker-widget in']//div[@ng-repeat='month in directive.shortMonthsOfYear'][12]" ;
    } 
    public static String ToSelectedYearXpath() 
    {
        return  "//span[text()='to']/../../../../../../../../../../../../../../../../../div[@class='datepicker-widget in']//div[@class='year ng-binding']" ;
    } 
    public static String TonextYearXpath() 
    {
        return  "//span[text()='to']/../../../../../../../../../../../../../../../../../div[@class='datepicker-widget in']//div[@class='year ng-binding']" ;
    } 
    public static String ToDoneXpath() 
    {
        return  "//span[text()='to']/../../../../../../../../../../../../../../../../../div[@class='datepicker-widget in']//a[text()='Done']" ;
    } 
    public static String ToFirstMonthXpath() 
    {
        return  "//span[text()='to']/../../../../../../../../../../../../../../../../../div[@class='datepicker-widget in']//div[@class='month ng-scope ng-binding'][@ng-repeat='month in directive.shortMonthsOfYear'][1]" ;
    } 
    public static String ToFirstUnSelectedDayXpath() 
    {
        return  "//span[text()='to']/../../../../../../../../../../../../../../../../../div[@class='datepicker-widget in']//div[@class='day ng-scope ng-binding'][@ng-repeat='day in directive.daysInMonth'][1]" ;
    } 
      public static String clickToNextMonthXpath() 
    {
        return  "//span[text()='to']/../../../../../../../../../../../../../../../../../div[@class='datepicker-widget in']//div[@class='month ng-scope ng-binding'][1]" ;
    } 
    public static String clickToFirstXpath() 
    {
        return  "//span[text()='to']/../../../../../../../../../../../../../../../../../div[@class='datepicker-widget in']//div[@class='day ng-scope ng-binding'][@ng-repeat='day in directive.daysInMonth'][1]" ;
    } 
    //###########################
    public static String ToSelectedDayXpath(String strToSelectedDay) 
    {
        return  "//span[text()='to']/../../../../../../../../../../../../../../../../../div[@class='datepicker-widget in']//div[text()='"+strToSelectedDay+"']" ;
    } 
    public static String ToSelectedDaysXpath(String strToSelectedDay) 
    {
        return  "//span[text()='to']/../../../../../../../../../../../../../../../../../div[@class='datepicker-widget in']/div[@class='control']//div[text()='"+strToSelectedDay+"']" ;
    } 
    public static String ToSelectedSelectedDayTopXpath(String strToSelectedDay) 
    {
        return  "//span[text()='to']/../../../../../../../../../../../../../../../../../div[@class='datepicker-widget in']//div[text()='"+strToSelectedDay+"'][@class='day-of-month ng-binding selected']" ;
    } 
  
    public static String ToDonetoXpath() 
    {
        return  "//span[text()='to']/../../../../../../../../../../../../../../../../../div[@class='datepicker-widget in']//div/a[text()='Done'][@class='ng-binding']" ;
    } 
 
     
       
}
