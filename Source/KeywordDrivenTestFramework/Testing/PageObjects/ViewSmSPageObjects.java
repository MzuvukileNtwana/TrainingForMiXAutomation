/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects;

/**
 *
 * @author smnisi
 */
public class ViewSmSPageObjects {
    
    public static String columnChooserXpath()
    {
        return "//div[@class='row-actions']//a[@ng-click='toggleColumnChooser($event)']";
    }
    public static String columnChooserULXpath()
    {
        return "//ul[contains(@class, 'column-chooser-dropdown')][contains(@style, 'block')]";
    }
    public static String removeButton()
    {
        return "//div[@buttons=\"removeConfirmationModalButtons\" and @style[contains(.,'display: block;')]]/div[@class='modal-footer']/button[text()='Remove']";
    }
    
    public static String cart()
    {
        return "//button/span[@class='caret']/..";
    }
    
    public static String deleteButton()
    {
        return "//li/a[text()='Remove']";
    }
    
        public static String buttonSave()
    {
        return "//Button[text()='Save']";
    }
    
    public static String textArea()
    {
        return "//label[text()='Message']/../textArea";
    }
    
    public static String selectButton()
    {
        return "//Button[text()='Select']";
    }
    
    public static String recieptsFlitter()
    {
        return "//div/input[@class='filter-search-input input-medium filter-clear span12 ng-valid ng-dirty']";
    }
    
    public static String checkBoxbuttonSelectRecipients()
    {
        return "//tbody/tr[1]/td[1]";
    }
    
    public static String buttonSelectRecipients()
    {
        return "//button[text()='Select recipients']";
    }
    
    public static String createSMSMessage()
    {
        return "//li/a[text()='SMS Message']";
    }

   
    public static String clickOnTheSearchedLocation()
    {
        return "//*[local-name()]/button[@class=\"btn ng-binding btn-wide btn-success\"]";
    }
    
    public static String saveButtonXpath()
    {
        return "//button[@text='Save']";
    }
    
    public static String selectAddressXpath()
    {
        return "//button[@text='Select']";
    }
    
    public static String capeTownAddress()
    {
        return "//li/a[text()='Cape Town International Airport, Cape Town, City of Cape Town, Western Cape']";
    }
    
    
    public static String messageboxSubHeaderXpath()
    {
        return "//a[text()='Message box']";
    }
    public static String enterAddressXpath()
    {
        return "//input[@placeholder='Enter address']";
    }
     public static String smsSpinnerXpath()
    {
        return "//div[@class='fa-detail-right right-wide well well-small message-box-detail-right']/div[@class='loading-overlay ng-scope'][@style='display: none;']";
    }
    public static String capeTownInternation()
    {
        return "//span[2]/ul/li[6]/a";
    }
    
    public static String AddressRadioButton()
    {
        return"//span[text()='Address']/../input";
    }
    
    public static String locationRadioButton()
    {
        return "//span[text()='Location']/../input";
    }
    
    public static String locationTextBox()
    {
        return "//span[text()='Location']/../input/../../span[1]/input";
    }
    
    public static String LocationListToDropDown()
    {
        return "//div[@class='span6 clearfix no-margin']/div[2]/span[2]/ul";
    }
    
    public static String clickHereDropDown()
    {
        return "//a/strong[text()='click here']";
    }
    public static String SubjectTextBoXpath()
    {
        return "//label[text()='Subject']/../input";
    }
    
    public static String MessageTextBoXpath()
    {
        return "//textarea[@rows='8']";
    }
    
    public static String clickCreateJobButton()
    {
        return "//li/a[text()='Job']";
    }
    
    public static String actionButtonXpath()
    {
        return "//li/a/i[@class='icon-choose-columns']";
    }
    
    public static String MessageColumnXpath()
    {
        return "//span[text()='Message']/../i";
    }
    public static String MessageColumnXpath2()
    {
        return "//span[text()='Message']/../span[@ng-hide='column.visible']/../..//a";
    }
     
    public static String StatusColumnXpath()
    {
        return "//span[text()='Status']/../i";
    }
    public static String StatusColumnXpath2()
    {
        return "//span[text()='Status']/../i[@ng-show='column.visible']";
    }
    public static String StatusColumnXpath3()
    {
        return "//span[text()='Status']/../span[@ng-hide='column.visible']/../..//a";
    }
      
    public static String SubjectColumnXpath()
    {
        return "//span[text()='Subject']/../i";
    }
    public static String SubjectColumnXpath2()
    {
        return "//span[text()='Subject']/../span[@ng-hide='column.visible']/../..//a";
    }
    
    public static String createNewJobSaveButton()
    {
        return "//h5[text()='Create new job']/../div/div/button[text()='Save']";
    }
    
    public static String saveButtonSendMessage()
    {
        return "//span[text()='Send message']/../../../../../../div[2]/button[text()='Save']";
    }
    
    public static String statusChangeDatesXpath()
    {
        return "//a/strong";
    }
    
    public static String tableMessagerCheckerXpath()
    {
        return "//div[@selection=\"enableMultiSelect\"]//table//tbody//tr";
    }
    
    public static String tableTypeChecker()
    {
        return "//div[@selection=\"enableMultiSelect\"]//table//tbody//tr";
    }
    
    public  static String tableSelectorByClick()
            
    {
        return "//div[@ng-show='rowActions']//ul//li[@ng-repeat='row in limitedRows'][1]";
    }
    
    public static String replyXpath()
    {
        return "//ul/li/a[text()='Reply']";
    }
    
    public static String forward()
    {
        return "//ul/li/a[text()='Forward']";
    }
    
    
    public static String dropDownMap()
    {
        return "//div[@class='map-types pull-right']/select";
    }
      
    public static String briefCase()
    {
        return "//div/img[@src='img/briefcase.png']";
    }
    public static String sendXpath()
    {
        return "//a[text()='Sent items']";
    }
    public static String JobXpath()
    {
        return "//a[text()='Job drafts']";
    }
    
    public static String InboXpath()
    {
        return "//span[text()='Inbox']";
    }
   
    public static String ButtonCreateSmS()
    {
        //return "//a/span[text()='CREATE NEW']";
        return "//a/strong/span[text()='CREATE NEW']";
    }
    
    public static String inboxLabel()
    {
        return "//div/h5[@class='pull-left text-clip ng-binding']";
    }
    
    public static String sentInboxXpath()
    {
        return "//li/a[@ng-click='changeTab(2)']";
    }
    
    public static String actionButton()
    {
        return "//*[@id=\"MainView\"]/div/div[1]/div/div[2]/div/div/div[2]/div[1]/div/div/div/div/div[1]/div[1]/div[3]/ul/li[4]/div/div/a";
    }
    
    public static String viewXpath()
    {
        return "//ul[contains(@style,'block')]//span[text()='View']";
    }
    
    public static String sentInboxHeading()
    {
        return "//h5[text()='Sent items']";
    }
    
    public static String newActionsButtonXpath()
    {
        return "//button[@class='btn btn-small dropdown-toggle']";
    }
    
    public static String hoverReplyAndWait()
    {
        return "//i[@class='icon-reply']";
    }
    
    public static String statusDropDown()
    {
        return "//*[@id=\"MainView\"]/div/div[1]/div/div[2]/div/div/div[2]/div[2]/div/div/div[1]/div[2]/div/a/strong";
    }
    
    
      public static String ActionButtonRelativeXpath() 
    {
        return "//div[@ng-show='rowActions']/ul/li[5]/div/div/a[@fleet-tooltip='Actions']";
    }
      
      
    public static String FromRelativeXpath() 
    {
        return "//h5[text()='From:']/../../td[2]";
    }
    
    
    public static String SubjectRelativeXpath() 
    {
        return "//td/h5[text()='Subject:']/../../td[2]";
    }
    
    
    public static String ToRelativeXpath() 
    {
        return "//td/strong[text()='To:']/../../td[2]";
    }
    
    public static String StatusChangedToRelativeXpath() 
    {
        return "//td/strong[text()='When:']/../../td[2]";
    }
    
    public static String statusRelativeXpath() 
    {
        return "//div[@class='btn-group pull-right']/span[@class='badge badge-success access-control-green mr-5 ng-binding']";
    }
    
    public static String ReplyIconRelativeXpath() 
    {
        return "//button[@class='btn btn-small dropdown-toggle']";
    }
    public static String ReplyRelativeXpath() 
    {
        return "//button[@class='btn btn-small dropdown-toggle']/../ul/li/a[text()='Reply']";
    }
        
    public static String CancelRelativeXpath() 
    {
        return "//div[@class='selection-btn-right pull-right']/button[text()='Cancel']";
    }
        
    public static String CREATENEWRelativeXpath() 
    {
        return "//span[text()='CREATE NEW']";
    }
       
    public static String MessageDetailsRelativeXpath() 
    {
        return "//td/strong[text()='Message:']/../../td[2]";
    }
    public static String ForwardRelativeXpath() 
    {
        return "//button[@class='btn btn-small dropdown-toggle']/../ul/li/a[text()='Forward']";
    }
    public static String ChangesNotSavedRelativeXpath() 
    {
        return "//div/h5[text()='Create new message']";
    }
    public static String creatNewMessageRelativeXpath() 
    {
        return "//h5[text()='Changes not saved']";
    }
    
    public static String subjectXpathNew() 
    {
        return "//h5[text()='Subject:']/../../td[2]";
    }
    
    public static String enterAddressTextBox()
    {
        return "//input[@placeholder='Enter address']";
    }
    
      
      //***Wating and extracting 
      

      
      public static String StatusdateInspectionXpath()
      {
          return"//strong[text()='14/10/2015 14:26:01 (CAT/SAST)']";
      }
    
      public static String whenRelativeXpath()
      {
          return "//*[@id=\"MainView\"]/div/div[1]/div/div[2]/div/div/div[2]/div[2]/div/div/div[1]/div[2]/div/table/tbody/tr[2]/td[1]";
      }
      
      public static String createByXpath()
      {
          return "//td/strong[text()='Created by:']/../../td[2]";
      }
      
      public static String selectAddressButton()
      {
          return "//span[text()='Latitude/Longitude']/../../button[text()='Select']";
      }

}
