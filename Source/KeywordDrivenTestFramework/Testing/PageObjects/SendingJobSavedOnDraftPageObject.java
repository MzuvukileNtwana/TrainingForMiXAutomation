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
public class SendingJobSavedOnDraftPageObject {
   public static String clickFutureDateXpath(String day) 
    {
        return  "//div[text()='"+ day +"']";
    }   
   
   public static String clickFutureDateXpath1(String day) 
    {
        return  "//div[contains(@ng-click,'selectDay')][text()='"+ day +"']";
    } 
   
    public static String dayOfMonthOnTopXpath(String day) 
    {
        return  "//div[text()='"+ day +"'][@class='day-of-month ng-binding selected']";
    } 
    public static String clickTOFutureDateXpath(String day) 
    {
        return  " //span[text()='to']/../div/span/i/../../../../../../../../../../../../../../../../../../../div[@class='datepicker-widget in']/div[@class='control']/div/div/div[@class='current-days']/div[text()="+ day +"]";
    }
     public static String DoneOnTOXpath() 
    {
        return  " //span[text()='to']/../div/span/i/../../../../../../../../../../../../../../../../../../../div[@class='datepicker-widget in']/div[@class='done']/a[text()='Done']";
    } 
    public static String createNewXpath() 
    {
        return  " //span[text()='CREATE NEW']/../span";
    } 
     public static String btnCreateNewXpath() 
    {
        return  " //span[text()='CREATE NEW']";
    } 
    public static String clickJobXpath() 
    {
        return  " //a[text()='Job']";
    } 
    public static String CreateNewJobXpath() 
    {
        return  " //h5[text()='Create new job']";
    } 
    public static String btnSelectAssetXpath() 
    {
        return  " //button[text()='Select asset']";
    } 
    public static String lblSelectAssetXpath() 
    {
        return  " //span[text()='Select assets']";
    } 
    public static String radioButtonXpath() 
    {
        return  "//span[text()='SAT Unit']/../../../td/input[@type='radio']";
    }    
       
    public static String SelectButtonXpath() 
    {
        return  "//span[text()='SAT Unit']/../../../td/input[@type='radio']/../../../../../../../../../../../../../div[@class='modal-footer']/button[text()='Select']";
    }  
        
    public static String whenDatepickerXpath() 
    {
        return  "//span[text()='When']/../../div/div/div/span/i";
    }   
    public static String toDatepickerXpath()
    {
        return  "//span[text()='to']/../div/span/i";
    }    
    public static String checkboxXpath() 
    {
        return  "//div[@class='span6 eq-col']/label/input";
    }    
    public static String txtSubjectXpath() 
    {
        return  "//label[text()='Subject']/../input";
    }    
    public static String textAreaXpath() 
    {
        return  "//label[text()='Message']/../textarea";
    }  
    public static String clickSaveXpath() 
    {
        return "//h5[text()='Create new job']/../div/div/button[text()='Save']";
    }  
    public static String SendMessageXpath() 
    {
        return  "//span[text()='Send message']";
    }  
    public static String SaveToDraftsXpath() 
    {
        return  "//span[text()='Save to drafts']";
    }  
    public static String checkSaveToDraftsXpath() 
    {
        return  "//span[text()='Save to drafts']/../input";
    }  
    public static String btnSaveToDraftsSaveXpath() 
    {
        return  "//span[text()='Save to drafts']/../input/../../../../../../../div[@class='modal-footer']/button[text()='Save']";
    }  
    
    public static String jobDraftsXpath() 
    {
        return  "//a[text()='Job drafts']";
    }  
    public static String toXpath() 
    {
        return  "//tbody[@fleet-draggable-group='draggable']/tr/td[2]/div/a/span";
    } 
    public static String DraftTableTextXpath(String columnName) 
    {
        return  "//div[@class='fleet-grid-container strong-grid']//table/tbody/tr[1]//td[@column-field='"+columnName+"']/div/span";
    }
    public static String recDraftTableTextXpath() 
    {
        return  "//div[@class='fleet-grid-container strong-grid']//table/tbody/tr[1]//td[@column-field='recipient']/div//span";
    } 
    public static String subjectXpath() 
    {
        return  "//tbody[@fleet-draggable-group='draggable']/tr/td[3]/div/span";
    }  
     
    public static String StatusXpath() 
    {
        return  "//tbody[@fleet-draggable-group='draggable']/tr/td[6]/div/span";
    }  
    public static String statusTimeXpath() 
    {
        return  "//tbody[@fleet-draggable-group='draggable']/tr/td[7]/div/span";
    }  
    public static String editXpath() 
    {
        return  " //div[@ng-show='rowActions']/ul/li[2]/div/div/a[@fleet-tooltip='Actions']/../../../../../../../../../../../../../../../../../../../../../../..//ul[contains(@style,'block')]/li[1]/a/span[text()='Edit']";
    }
    public static String removeXpath() 
    {
        return  "  //div[@ng-show='rowActions']/ul/li[2]/div/div/a[@fleet-tooltip='Actions']/../../../../../../../../../../../../../../../../../../../../../../..//ul[contains(@style,'block')]/li[3]/a/span[text()='Remove']";
    }  
    public static String sendXpath() 
    {
        return  " //div[@ng-show='rowActions']/ul/li[2]/div/div/a[@fleet-tooltip='Actions']/../../../../../../../../../../../../../../../../../../../../../../..//ul[contains(@style,'block')]/li[2]/a/span[text()='Send']";
    }  
    public static String successfulPopUpXpath() 
    {
        return  "//span[text()='1 job(s) successfully sent']";
    }  
    public static String jobSavedSuccessfulXpath() 
    {
        return  " //span[text()='Job successfully saved']";
    }     
    public static String inboxCountXpath() 
    {
        return  " //span[text()='Inbox']/span";
    }
    public static String InboxCountXpath() 
    {
        return  " //span[text()='Inbox']";
    } 
    public static String inboxFormXpath() 
    {
        return  " //h5[text()='Inbox']/../../../div[@class='row-fluid container-fixed-right']/div/div/div[@class='fa-detail-right right-wide well well-small message-box-detail-right']/div/div/div/div/div/div/div/table[@class='table table-scroll table-condensed table-list no-text-clip']/thead/tr/th[4]/span[2][text()='From']";
    }  
    public static String inboxSubjectXpath() 
    {
        return  " //h5[text()='Inbox']/../../../div[@class='row-fluid container-fixed-right']/div/div/div[@class='fa-detail-right right-wide well well-small message-box-detail-right']/div/div/div/div/div/div/div/table[@class='table table-scroll table-condensed table-list no-text-clip']/thead/tr/th[5]/span[2][text()='Subject']";
    }  
    public static String inboxMessageXpath() 
    {
        return  " //h5[text()='Inbox']/../../../div[@class='row-fluid container-fixed-right']/div/div/div[@class='fa-detail-right right-wide well well-small message-box-detail-right']/div/div/div/div/div/div/div/table[@class='table table-scroll table-condensed table-list no-text-clip']/thead/tr/th[6]/span[2][text()='Message']";
    }  
    public static String defaultOptionsXpath() 
    {
        return  " //h4[text()='JOBS & MESSAGING']/../ul/li[1]/a";
    }
     
    public static String instantMessagingXpath() 
    {
        return  "//h4[text()='JOBS & MESSAGING']/../ul/li[3]/a";
    }  
    public static String messageBoxXpath() 
    {
        return  "//h4[text()='JOBS & MESSAGING']/../ul/li[2]/a";
    }  
   
    public static String inputFilterXpath() 
    {
        return  "//h5[@class='pull-left text-clip ng-binding']/../form/div/input";
    }  
     public static String popUpMessgeXpath() 
    {
        return  "//div[@class='notification-wrapper notification-modal ng-scope']/div/span[@id='pop-alert-message']";
    }  
      public static String clickInboxXpath() 
    {
        return  "//span[text()='Inbox']";
    }  
       public static String clickSentXpath() 
    {
        return  "//a[text()='Sent items']";
    }  
         public static String draftsLabelXpath() 
    {
        return  "//h5[text()='Drafts']";
    }  
   
}
