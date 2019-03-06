/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects.Monitor.HoursOfService.HosNotification;

/**
 *
 * @author smncwabe
 */
public class DeletingAnHosNotificationPageObject {
    
    public static String MonitorMenuRelativeXpath() 
    {
        return "//a[text()='MONITOR ']";
    }
    
    public static String AddButtonByXpath(){
        return "//button[@fleet-tooltip=\"Add HOS notification\"]";
    }
    
    
    public static String NotificationDetailsByXpath(){
        return "//h5[text()='Notification details']";
    }
    
    public static String AddNotificationTextBoxXpath(){
        return "//div[@class='span6']/input";
    }
    
    public static String IconCalendarXpath()
    {
        return "//div[@class='form-inline pull-left']//span/i[@class='icon-calendar']";
    }
    
    public static String NotificationNameLink(String name){
        
        return "//div[@class='column-heading sortable sorted-asc']/../div[@class='cell alt']/a[text()='"+ name +"']";
        
    }
    public static String NotificationNameLink(){
        
        return "//div[@class='column-heading sortable sorted-asc']/../div[@class='cell alt']/a";
        
    }
    
    public static String ButtonNextByXpath(){
        return "//button[text()='Next']";
    }
    
    public static String ButtonNextDisabledByXpath(){
        return "//button[text()='Next'][@disabled='disabled']";
    }
   
   public static String SpinnerXpath(){
       return "//div[@class='loading-overlay'][@style='display: none;']";
   }
   
   public static String DvtAutomationLinkXpath(){
       return "//div[@class='tree-item-content']//a/span[text()='DVT Automation']";
   }
   
   
   
   public static String GhosEUTestingLinkXpath(){
       return "//a/span[@class='ng-binding'][text()='GHOS EU Testing']";
   }
   
    public static String treeItemXpath(){
       return "//a[@class='tree-item']";
   }
   
   
   public static String ViolationTextByXpath(){
       return "//span[text()='Violations']";
   }
   
   public static String WeeklyRestCheckBoxXpath(){
       return "//tr//div/span[text()='Weekly Rest']/../../../td/input";
   }
   
    public static String WeeklyDrivingChechBoxByXpath()
    {
        return "//tr//div/span[text()='Weekly Driving']/../../../td/input";
    }
    
    public static String FirstCheckBoxByXpath()
    {
        return "//tr[1]/td/input";
        
    }
    
    public static String EscalationFirstFieldByXpath()
    {
        return "//tr[1]/td[3]//input";
        
    }
    
    public static String EscalationFieldByXpath()
    {
        return "//tr[1]/td//../../../td/div/span/input";
    }
    
    
    public static String EscalationFieldXpath()
    {
        return "//tr/td/div/span[text()='Weekly Driving']/../../../td/div/span/input";
    }
    
    public static String EscalationFieldTextBoxXpath()
    {
        return "//tr[1]/td[3]//input";
    }
    
    public static String SelectRecipientsButtonXpath()
    {
        return "//h5[text()='Email notifications']/../button";
    }
    public static String FilterInEmailRecipientXpath()
    {
        return "//input[@placeholder='Filter']";
    }
    
    public static String SearchIconXpath()
    {
        return "//div/a[@class='btn btn-small']/i[@class='icon-search']/..";
    }
    

    public static String ContactsCheckboxXpath()
    {
        return "//td/input[@type='checkbox']";
    }
    
    public static String FirstContactsCheckboxXpath()
    {
        return "//tr[1]/td/input[@type='checkbox']";
    }
    public static String SelectContactButtonXpath()
    {
        return "//button[@text='Select']";
    }
    
   public static String EscalationTextByXpath(){
       return "//legend[text()='Escalation 1']";
   }
    
   public static String Checkbox1Selection(){
       return "//table[@class='table table-scroll table-condensed table-list no-text-clip']/tbody/tr[1]/td[1]/input[1]";
   }
   
   public static String AddRecipientLinkByXpath(){
       return "//h5[text()='Email notifications']/../p[@ng-hide='!canEdit']/a";
   }
   
   //Textbox
     public static String NameTextBoxXpath(){
         return "//div/input[@name='firstName']";
     }
     public static String LastNameTextBoxXpath(){
         return "//div/input[@name='lastName']";
     }
     public static String EmployerTextBoxXpath(){
         return "//div/input[@name='employer']";
     }
     public static String PositionTextBoxXpath(){
         return "//div/input[@name='position']";
     }
     public static String HomeNumberTextBoxXpath(){
         return "//div/input[@name='homeNumber']";
     }
     public static String WorkNumberTextBoxXpath(){
         return "//div/input[@name='workNumber']";
     }
     public static String MobileTextBoxXpath(){
         return "//div/input[@name='mobileNumber']";
     }
     public static String OtherNumberTextBoxXpath(){
         return "//div/input[@name='otherNumber']";
     }
     public static String EmailAddressTextBoxXpath(){
         return "//div/input[@name='email']";
     }
     
     //Add Contact
     public static String AddContactHeadingXpath(){
         return "//div/h5/span[text()='Addway ewnay ontactcay']";
     }
     
     public static String SubmitButtonAddContactPageXpath(){
         return "//div[@class='modal-footer']/button[@class='btn ng-scope ng-binding btn-wide btn-success'][text()='Submit']";
     }
     
    public static String CancelButttonAddContactPageXpath(){
         return "//div[@class='modal-footer']/button[@class='btn ng-scope ng-binding btn-wide'][text()='Cancel']";
     }
    
    public static String PopUpMessageXpath(){
        return "//span[@id='pop-alert-message']";
    }
    
    public static String SaveButtonXpath(){
        return "//*[local-name()]/div[@class='page-header']/div/div[@class='selection-btn-right pull-right']/button[text()='Save']";
    }
    
    public static String PopUpMessageNotificationCreatedXpath(){
        return "//span[@id='pop-alert-message'][text()='Contact created successfully']";
    }
    public static String HosNotificationsPageHeader(){
        return "//ul/li/strong[text()='HOS notifications']";
    }
    
    public static String RecipientsNameColumnXpath(){
        return "//div/span[@class='title'][text()='Recipients']";
    }
    
    public static String HosNotificationXpath(){
        return "//h5/a[text()='HOS notifications']";
    }
    public static String AssetNameXpath(){
        return "//h5/a[text()='Assets']";
    }
    
    public static String FilterHosNotificationXpath(){
        return "//div[@class='text-filter empty']/input";
    }
    
    public static String ListOfNotificationXpath(){
        //return "//div[@class='columns ui-sortable']";
        return "//div[@class='columns ui-sortable']//div[@class='column']/div/a";
    }
    
    public static String ActionButtonIndexByXpath(String rowIndex){
       //return "//div[@class='columns ui-sortable']//div[@class='column actions shadow']/div/div/a/../../../div[@class='cell alt']["+rowIndex+"]/div/a[@class='row-action']";
        //return "//div[@class='columns ui-sortable']//div[@class='column actions shadow']/div//a[@class='row-action']/../../../div["+rowIndex+"]";
       //return "//div[@class='column actions shadow']/div/div/a/../../../div["+rowIndex+"]/div/a";
       return "//div[@class='cell alt']/div["+rowIndex+"]/a";
    }
    
    public static String RemoveLinkByXpath(){
        return "//ul[contains(@style, 'display: block;')]//span[text()='Remove']";
    }
    public static String EditLinkByXpath(){
        return "//ul[contains(@style,'display: block;')]//a[@event='Edit']/..";
    }
    public static String ActionButtonByXpath(){
        return "//a[@class=\"row-action\"]";
    }
    
    public static String RemoveHosNotifiicationXpath(){
        return "//h5/span[text()='Remove HOS notification']";
    }
   
    public static String AlertMessageXpath(){
        return "//div/p[@class='ng-scope ng-binding']";
    }
    
    public static String ButtonYesByXpath(){
        return "//div[@class='modal-footer']/button[text()='Yes']";
    }
    public static String ButtonRemoveByXpath(){
        return "//button[text()='Remove']";
    }
    
    public static String ButtonNoByXpath(){
        return "//div[@class='modal-footer']/button[text()='No']";
    }
    
    
    public static String PopUpHosNotificationRemoveXpath(){
       // return "//span[@id='pop-alert-message'][text()='HOS notification removed']/../../../div[@class='notification-wrapper notification-modal ng-scope'][contains(@style,'display: none;')]";
        return "//span[@id='pop-alert-message'][text()='HOS notification removed']";
    } 
    
   public static String PopUpHosNotificationUpdatedXpath(){
        return "//span[text()='Notification updated successfully']/../../../div[@class='notification-wrapper notification-modal ng-scope'][contains(@style,'display: none;')]";
    }
      public static String PopUpHosNotificationCreatedSuccesssXpath(){
        return "//span[@id='pop-alert-message'][text()='Notification created successfully']/../../../div[@class='notification-wrapper notification-modal ng-scope'][contains(@style,'display: none;')]";
    }
    
    public static String RefreshLinkByXpath(){
        return "//div//a/span[text()='Refresh']";
    }
    
    //<MiXFleet user with read-only HOS permissions>
    public static String HourOfServiceXpath(){
        return "//div/h4[text()='HOURS OF SERVICE']";
    }
    
    public static String SettingsXpath(){
        return "//div/h4[text()='USER SETTINGS']";
    }
    
    
    public static String HomeLinkXpath(){
        return "//li/a[@fleet-tooltip=\"Home\"]/i";
    }
    
    public static String HelpLinkXpath(){
        return "//li/a[@fleet-tooltip=\"Help\"]/i";
    }
    
    public static String WorkstateCanvasXpath(){
        return "//div[@class='hos-series canvas-container draggable']";
    }
    
    public static String LogOutLinkXpath(){
        return "//li/a/i[@class=\"icon-main-logout\"]";
    }
    
    public static String AddStatusButtonXpath(){
        return "//li/strong[text()='Status']//..//..//..//..//../div[@id='hosGridHeader']/div//a";
    }
    
    public static String StatusLinkXpath(){
        return "//li/a[text()='Status']";
    }
    
    //li/a[text()='Status']
    
    //<GHOS_230 Preventing>

    public static String DateInputXpath(){
        return "//div[@class='form-inline pull-left']/div[@type='datetime']/input";
    }
    
    
    public static String YearXpath()
    {
        return "//div[@class='datepicker-widget in']//div[@class='year ng-binding']";
    }
    
    public static String YesrToSelectXpath(String year)
    {
        return "//div[@class='datepicker-widget in']//div[@class='year-selector zoomable']//span[text()='"+year+"']";
    }
    
    public static String MonthXpath()
    {
        return "//div[@class='datepicker-widget in']//div[@class='month-of-year ng-binding']";
    }
    
    public static String MonthByXpath(int month)
    {
        return "//div[@class='datepicker-widget in']//div[@class='month-selector zoomable']//div[contains(@class,'month')]["+month+"]";
    }
    
    public static String DayXpath(int day)
    {
        return "//div[@ng-repeat='day in directive.daysInMonth']["+day+"]";
    }
    
    public static String DoneButtonXpath()
    {
        return "//div[@class='datepicker-widget in']//a[text()='Done']";
    }
    
    public static String StartDayXpath()
    {
        return "//div/a/i[@class='icon-alarmclock']";
    }
    
    public static String TwelveHourPeriodXpath()
    {
        return "//div/button[text()='12h']";
    }
    
    public static String AddStatusXpath()
    {
        return "//li/a//span[text()='Add status']";
    }
    public static String AddLogDataXpath()
    {
        return "//li/a//span[text()='Add log data']";
    }
    
    public static String ButtonConfirmXpath()
    {
        return "//div[@class='modal hide fade modal-mini in']//button[text()='Confirm']";
    }
    
    public static String ConfirmChangesHeadingXpath()
    {
        return "//h5/span[text()='Confirm changes']";
    }
    
    public static String ButtonSaveXpath()
    {
        return "//div[@class='modal hide fade modal-medium in']//button[text()='Save']";
    }
    
    public static String ConfirmChangesHeaderXpath()
    {
        return "//div[@class='modal hide fade modal-mini in']//h5/span[text()='Confirm changes']";
    }
    
    
    public static String EditSatusHeaderXpath()
    {
        return "//div[@class='modal hide fade']//h5/span[text()='Edit driver status']";
    }
    
    public static String StatusSuccessfullyXpath()
    {
        return "//span[text()='Status data saved successfully']/../../../div[@class='notification-wrapper notification-modal ng-scope'][contains(@style,'display: none;')]";
    }
    
    //------------------------------Edit Notification--------------------//
    
    public static String TabName(String tabname){
        
        return "//ul[@class='nav nav-tabs span12 full-height']/li/a[text()='"+ tabname +"']";
    }
    
    public static String RecipientsTabSpinnerXpath()
    {
        return "//div[@fleet-loader='content']/div/div[@name='smsRecipientsModal']/../div[@ng-show='$controller.isLoading'][@style='display: none;']";
    }
    
    //tr/th[@class='column-heading  first ng-scope']/span//..//..//..//..//tr[1]/td[4]//input//..//..//..//..//..//..//th[@class='column-heading  first ng-scope']/span
    
    public static String FirstEscalationLevel(){
        return "//tr/th[3]/span";
    }
    
    public static String SecondEscalationLevelXpath(){
        return "//tr[1]/td[4]//input";
    }
    
    public static String thirdEscalationLevel(){
        return "//tr/th[4]/span";
    }
    public static String FirstViolatioTypeCheckedXpath(){
        
        return "//tr/th/span[text()='Violation type']/../../../../tbody/tr[1]/td[2]/div/span";
    }
    
    public static String AddNewEscalationButtonXpath(){
        
        return "//a[text()='Add new escalation']";
    }
    
    public static String SelectRecipientsButtonXpath(String name)
    {
        return "//legend[text()='"+ name +"']//..//h5[text()='Email notifications']/../button";
    }
    public static String AddDriverStatusModelXpath()
    {
        return "//h5/span[text()='Add driver status']";
    }
    
    public static String ClickOntheWhiteSpaceXpath()
    {
       return "//div[@class='white-box-padding']/div[@class='row-fluid']";
    } 
    public static String RemoveEscalationButtonDisabledXpath()
     {
       return "//a[text()='Remove escalation' and @disabled]";
   } 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
