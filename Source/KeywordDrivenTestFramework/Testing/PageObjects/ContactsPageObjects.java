/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects;

/**
 *
 * @author apeter
 */
public class ContactsPageObjects 
{
    public static String removeButtonXpath()
    {
        return "//button[text()='Remove']";
    }
    
    public static String removeAlertXpath()
    {
        return "//span[text()='Contact successfully removed']";
    }
    
    public static String contactsTableXpath(){
        return "//li/strong/../../../..//table/thead/tr";
    }
     public static String contactsTableXpath2(){
        return "//li/strong/../../../..//table/tbody/tr";
    }
    
    public static String addContactButtonXpath(){
        return "//a[@ng-click='$controller.addContact()']";
    }
    
    public static String firstNameFieldXpath(){
        return "//input[@name='firstName']";
    }
    
     public static String firstNameLabelXpath(){
          return "//input[@name='firstName']/../label/span[text()='First name']";
    }
    
    public static String lastNameFieldXpath(){
        return "//input[@name='lastName']";
    }
    
     public static String lastNameLabelXpath(){
          return "//input[@name='lastName']/../label/span[text()='Last name']";
      }
    
    public static String employerFieldXpath(){
        return "//input[@name='employer']";
    }
    
    public static String employerLabelXpath(){
        return "//input[@name='employer']/../label/span[text()='Employer']";
    }
    
    public static String positionFieldXpath(){
        return "//input[@name='position']";
    }
    
    public static String positionLabelXpath(){
        return "//input[@name='position']/../label/span[text()='Position']";
    }
    
    public static String homeNumberFieldXpath(){
        return "//input[@name='homeNumber']";
    }
    
    public static String homeNumberLabelXpath(){
        return "//input[@name='homeNumber']/../label/span[text()='Home number']";
    }
    
    public static String workNumberFieldXpath(){
        return "//input[@name='workNumber']";
    }
    
     public static String workNumberLabelXpath(){
        return "//input[@name='workNumber']/../label/span[text()='Work number']";
    }
    
     public static String mobileNumberFieldXpath(){
        return "//input[@name='mobileNumber']";
    }
     
     public static String mobileNumberLabelXpath(){
        return "//input[@name='mobileNumber']/../label/span[text()='Mobile number']";
    }
     
     public static String otherNumberFieldXpath(){
        return "//input[@name='otherNumber']";
    }
     
      public static String otherNumberLabelXpath(){
        return "//input[@name='otherNumber']/../label/span[text()='Other number']";
    }
     
     public static String emailFieldXpath(){
         return "//input[@name='email']";
     }
     
      public static String emailAddressLabelXpath(){
        return "//input[@name='email']/../label/span[text()='Email address']";
    }
     
     public static String submitButtonXpath(){
         return "//input[@name='firstName']/../../../../../../../../div[@class='modal-footer']/button[@text='Submit']";
     }
     
     public static String filterXpath(){
         return "//li/strong[text()='Contacts']/../../../div/form//input[@placeholder='Filter']";
     }
     public static String FilterContactTextboxXpath()
     {
         return "//div[@class='pull-right']//input[@type='text']";
     }
     public static String noItemsloadedSpanXpath()
     {
         return "//*[@id='MainView']/div/div[1]/div/div/div[2]/div[1]/div/div[2]/span";
     }
     
     public static String actionsButtonXpath(){
         return "//ul/li[@class='ng-scope odd']/div/div/a";
     }
     public static String firstElementDropdownXpath()
     {
         return ".//*[@id='MainView']/div/div[1]/div/div/div[2]/div[1]/div/div[1]/div[1]/div[3]/ul/li[3]/div/div/a";
     }
      public static String editXpath(){
         return "//ul[contains(@style, 'block')]//a/span[text()='Edit']";
     }
      public static String enabledSubmitButtonXpath(){
         return "//button[@ng-disabled='!isEnabled()'][text()='Submit']";
     }
      public static String removeXpath()
      {
         return "//ul[contains(@style, 'block')]//a/span[text()='Remove']";
     }
     public static String removePopupLableXpath()
     {
         return "//div[@class='alert alert-danger']";
     }
     public static String removePopupButtonXpath()
     {
         return "//button[@text='Remove']";
     }

     public static String popUpMessageXpath(){ 
        return "//div//span//..//span[@id='pop-alert-message']";
     }
     
     public static String contactsPageHeaderXapth()
     {
         return "//div[@class='page-header']//ul//li//strong[text()='Contacts']";
     }
     
     ///update Contact downloaded template
      public static String FirstTableRowNameSpanXpath()
      {
         return "//table[@class='table table-scroll table-condensed table-list no-text-clip']/tbody/tr[2]/td[2]/div/a/span";
     }
       
     public static String downloadTemplateButtonXpath(){
         return "//div[@class='pull-right selection-btn-right']/a[2]/i[@class='icon-download-alt']";
     }
     public static String ImportTemplateButtonXpath()
     {
         return "//div[@class='pull-right selection-btn-right']/a[1]/i[@class=' icon-import']";
     }
     public static String downloadAlertHeaderXpath()
     {
         return "//div[@class='alert alert-success']/h5[text()='Download import template']";
     } 
     public static String downloadAlertBodyXpath()
     {
         return "//div[@class='well no-margins ng-scope']/div/p/strong[text()='Would you like to:']";
     }
     public static String downloadAlertImportRadioXpath()
     {
         return "//div[@class='well no-margins ng-scope']/div/label/input[@value='importNewRecords']";
     }
     public static String downloadAlertImportSpanXpath()
     {
         return "//div[@class='well no-margins ng-scope']/div/label/span[text()='Import new records']";
     }
     public static String downloadAlertUpdateRadioXpath()
     {
         return "//div[@class='well no-margins ng-scope']/div/label/input[@value='updateExistingRecords']";
     }
     public static String downloadAlertUpdateSpanXpath()
     {
         return "//div[@class='well no-margins ng-scope']/div/label/span[text()='Update existing records']";
     }

     public static String EditCountryCode(){
         return "//div/p[text()='Irstfay amenay andway atway eastlay oneway ontactcay ieldfay ustmay ebay ompletedcay inway orderway otay eatecray away alidvay ontactcay']";
     }
     public static String downloadAlertCancelButtonXpath()
     {
         return "//div[@class='modal-footer']/a[text()='Cancel']";

     }
     public static String downloadAlertDownloadlButtonXpath()
     {
         return "//div[@class='modal-footer']/a[text()='Download']";
     }

     public static String RemoveLanguageXpath(){
         return "//ul[contains(@style, 'display: block;')]//span[text()='Emoveray']/..";
     }
     public static String LastNameLabelXpath(){
         return "//div/label/span[text()='Astlay amenay']";
     }
     public static String EmployerLabelXpath(){
        return "//div/label/span[text()='Employerway']";
     }
     
     public static String PositionLabelXpath(){
         return "//div/label/span[text()='Ositionpay']";
     }
     public static String HomeNumberLabelXpath(){
         return "//div/label/span[text()='Omehay umbernay']";
     }
     
     public static String WorkNumberLabelXpath(){
         return "//div/label/span[text()='Orkway umbernay']";
     }
     
     public static String MobileNumberLabelXpath(){
         return "//div/label/span[text()='Obilemay umbernay']";
     }
     public static String OtherNumberLabelXpath(){
         return "//div/label/span[text()='Otherway umbernay']";
     }
     public static String EmailAddressLabelXpath(){
         return "//div/label/span[text()='Emailway addressway']";
     }
     
     public static String SubmitButtonEditPageXpath(){
         return "//div[@class='modal-footer']/button[@class='btn ng-scope ng-binding btn-wide btn-success'][text()='Ubmitsay']";
     }
     public static String CancelButttonEditPageXpath(){
         return "//input[@name='firstName']/../../../../../../../../div[@class='modal-footer']/button[@text='Ancelcay']";
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
     
    //Reminder Message
     public static String ReminderMessageXpath(){
         return "//div/span[text()='Includeway ountrycay odecay, eway.gay. +27 12 345 6789']";
     }
     
     //Message PopUp
     public static String UpdatedSuccessfullyXpath(){
         //return "//div/span[text()='Contact updated successfully']";
         return "//span[@id='pop-alert-message'][text()='Contact updated successfully']";
     }


     //Pop Up
     public static String RemovePopUpXpath(){
         return "//h5/span[@class='ng-binding'][text()='Emoveray ontactcay']";
     }
     
     public static String RemoveInContactWindowXpath(){
         return "//h5[@class='ng-binding'][text()='Emoveray assetway']";
     }
     public static String RemoveInContactPopUpXpath(){
         return "//button[@class='btn ng-scope ng-binding btn-success'][text()='Emoveray']";
     }
     
     public static String CancelInContactPopUpXpath(){
         return "//div/button[@class='btn ng-scope ng-binding'][text()='Ancelcay']";
     }
     public static String AreYouSureMessageXpath(){
         return "//div/p[@class='ng-scope ng-binding'][text()='Areway youway uresay antway otay emoveray isthay ontactcay?']";
     }
     public static String NewWindowRemoveButtonXpath(){
         return "//div/button[@text='Emoveray']";
     }
     public static String NewWindowCancelButtonXpath(){
        return "//div/button[@text='Ancelcay']";
     }
     public static String AlertRemovePopXpath(){
         //return "//div/span[text()='Ontatcay uccessfullysay emovedray']";
         return "//span[@id='pop-alert-message'][text()='Ontactcay uccessfullysay emovedray']";
         //return "//div[@class='notification notification-placement notification-success']//span[text()='Ontactcay uccessfullysay emovedray']";
     }
     
     public static String ContactCreatedSucessfullyXpath(){
         return "//span[@id='pop-alert-message'][text()='Ontactcay eatedcray uccessfullysay']";
     }
     
     
     //
     public static String NameContactXpath(){
         return "//div/ul/li/strong[@class='ng-binding'][text()='Ontactscay']";
     }
     public static String PageHeadingsXpath(){
         return "//div/table[@class='table table-scroll table-condensed table-list no-text-clip']/thead/tr";
     }
     public static String GridHeadingXpath(){
         return "//div/table[@class='table table-scroll table-condensed table-list no-text-clip']/thead/tr/th";
     }
     public static String gridColumnHeaderTitleXpath(String title){
         return "//table//tr/th[contains(@class,'column-heading')]//span[text()='" + title + "']";
     }
     public static String FilterTextBoxXpath(){
         return "//div[@class='input-reset-wrapper']/input[@type='text']";
     }
     
          /*Bread Crumb*/
     public static String DataCentreXpath(){
         return "//a/span[@class='icon icon-data-center']";
     }
     //selected 
     public static String DataCenterIconXpath(){
         return "//div/a[@class='ng-scope active selected']/span[@class='icon icon-data-center']";
     }
     //selected
     public static String RegionalSalesXpath(){
         return "//div/a[@class='ng-scope active selected']/span[@class='icon icon-rso']";
     }
     
     public static String RegionalSaleTextRsoXpath(){
         return "//div/a/span[text()='Test RSO']";
     }
     //selected
     public static String OrganisationXpath(){
         return "//div/a[@class='ng-scope active selected']/span[@class='icon icon-org']";
     }
     
     public static String OrganisationDvtAutomationXpath(){
         return "//div/a/span[text()='DVT Automation']";
     }
     
     public static String DealerXpath(){
         return "//div[@class=\"column ps-container ps-active-y\"]/a/span[@class=\"icon icon-dealer\"]";
     }
     //selected
     public static String DealerIconXpath(){
         return "//div/a[@class='ng-scope active selected']/span[@class='icon icon-dealer']";
     }
     public static String SelectButtonXpath(){
         return "//div[@class='miller-selector-modal-container white-box-shadow ng-scope in']/div[3]/div/a[@ng-click='$directive.submit()']";
     }
     
     //Button
      public static String ExportButtonXpath(){
         return "//button[@fleet-tooltip='Export contacts']";
     }
      
     public static String ImportIconXpath(){
         return "//a[@fleet-tooltip='Import contacts']";
     }
     
      public static String DownLoadIconXpath(){
         return "//a[@fleet-tooltip='Download import template']";
     }
     
      public static String ActionButtonXpath(){
          //return "//ul/li[@class='ng-scope odd']/div//a[@fleet-tooltip='Actions']";
          return "//div[@column='rowActions'][not(@style='display: none;')]//a[@class='btn-actions']";
      }
      //Organisation Tooltip
      
      public static String MixTelTooltipXpath(){
          return "//div[@class='tooltip-inner'][text()='Ataday Entrecay']";
      }
      
      public static String TestTooltipXpath(){
          return "//div[@class='tooltip-inner'][text()='Egionalray Alessay Organisationway']";
      }
      
      public static String DvtTooltipXpath(){
          return "//div[@class='tooltip-inner'][text()='Organisationway']";
      }
      
      public static String DealerTooltipXpath(){
          return "//div[@class='tooltip-inner'][text()='Ealerday']";
      }
     //tool tips
     
      
     public static String AddContactTooltipXpath(){
         return "//div/span[@class='simple-tooltip-content ng-scope ng-binding'][text()='Addway ontactcay']";
     }
     public static String DownLoadTooltipXpath(){
         return "//div/span[@class='simple-tooltip-content ng-scope ng-binding'][text()='Ownloadday importway emplatetay']";
     }
     public static String ImportTooltipXpath(){
         return "//div/span[@class='simple-tooltip-content ng-scope ng-binding'][text()='Importway ontactscay']";
     }
     public static String ExportTooltipXpath(){
         return "//div/span[@class='simple-tooltip-content ng-scope ng-binding'][text()='Exportway ontactscay']";
     }
     
     public static String ActionButtonTooltipXpath(){
         //return "//div/span[@class='simple-tooltip-content ng-scope ng-binding'][text()='Actionsway']";
         return "//div[@class='ng-scope tooltip left in']//span[text()='Actionsway']";
     }
     
          //label
     public static String FirstNameLabelXpath(){
         return "//div/label/span[text()='Irstfay amenay']";
     }
     
      //Edit Contact
     public static String EditContactNameDisplayOnThePageXpath(){
         return "//h5/span[text()='Editway ontactcay']";
     }
     public static String EditParagraphXpath(){
         return "//div/p[text()='Irstfay amenay andway atway eastlay oneway ontactcay ieldfay ustmay ebay ompletedcay inway orderway otay eatecray away alidvay ontactcay']";
     }
     
     //Add Contact
     public static String AddContactHeadingXpath(){
         return "//div/h5/span[text()='Addway ewnay ontactcay']";
     }
     
     public static String SubmitButtonAddContactPageXpath(){
         return "//div[@class='modal-footer']/button[@class='btn ng-scope ng-binding btn-wide btn-success'][text()='Ubmitsay']";
     }
     
    public static String CancelButttonAddContactPageXpath(){
         return "//div[@class='modal-footer']/button[@class='btn ng-scope ng-binding btn-wide'][text()='Ancelcay']";
     }
     //Error Message
     
     public static String ErrorMessageDisplayXpath(){
         return "//div/span[text()='Isthay ieldfay isway equiredray']";
     }
     public static String InvaliCountryCodeErrorMessageXpath(){
         return "//div/span[text()='Invalidway ountrycay odecay']";
     }
     public static String AddPlusInvalidCountryCodeXpath(){
         return "//div/span[@class='validity-message ng-scope ng-binding'][text()='Ethay aluevay ustmay ebay away alidvay onephay umbernay, eway.gay. +27 12 345 6789']";
     }
     public static String InvalidEmailAddressXpath(){
         return "//div/span[text()='Ethay aluevay ustmay ebay away alidvay emailway addressway']";
     }

      public static String defaultSiteXpath()
    {
        return "//div[@class='miller-selector']//span[text()='Default Site']";
    }
    public static String defaultSiteOnSelectGroupPageXpath()
    {
        return "//div[@class='column ps-container']/a[contains(@class,'selected')]/span[text()='Default Site']";
    }
     public static String cancelButtonOnSelectOrgXpath()
    {
        return "//div[@class='column ps-container']/a[contains(@class,'selected')]/../../../../..//a[text()='Cancel']";
    }

    public static String ServerSideDisabledSaveButtonXpath() 
    {
       return "//span[text()='Save']/../../a[@disabled='disabled']";

    }

}
