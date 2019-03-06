package KeywordDrivenTestFramework.Testing.PageObjects;

import static KeywordDrivenTestFramework.Core.BaseClass.currentEnvironment;

/**
 *
 * @author YP Duma
 */
public class ManageContactsPageObj
{
    public static String MixTelematicsURL() {
        return currentEnvironment.PageUrl;
    }
     
    //  <editor-fold defaultstate="collapsed" desc="DMF-1279:Download Import Template - Import new records">
    
    public static String ManageXpath()
    {
        return "//a[text()='MANAGE ']";
    }
    
    public static String ManageContactsXpath()
    {
        return "//a[text()='Manage contacts']";
    }
    
    public static String ContactsPageHeaderXpath()
    {
        return "//h5/span[text()='Contacts']";
    }
    
    public static String ContactGridLoadingSpinnerXpath()
    {
        return "//div[@class='row-fluid container-fixed-right']/div[contains(@style,'display: none')]";
    }
    
    public static String ColumnChooserXpath()
    {
        return "//div[@class='row-actions']/ul/li/a/i";
    }
    
    public static String ImportContactsButtonXpath()
    {
        return "//div/a[@fleet-tooltip='Import contacts']";
    }
    
    public static String DownloadTemplateButtonXpath()
    {
        return "//div/a[@fleet-tooltip='Download import template']";
    }
    
    public static String SearchInputFilterXpath()
    {
        return "//form/div/input[@ng-model='filterQuery']";
    }
    
    public static String ButtonClearSearchFilterXpath()
    {
        return "//form/div/button[@class='input-reset']";
    }
    
    public static String PopUpDownloadImportTemplateHeadingXpath()
    {
        return "//div/form/div/div/h5[text()='Download import template']";
    }
    
    public static String PopUpDownloadImportTemplateBodyTextXpath()
    {
        return "//div//div/p/strong[text()='Would you like to:']";
    }
    
    public static String RadioButtonImportNewRecordsXpath()
    {
        return "//div//div/label/span[text()='Import new records']/../input[@value='importNewRecords']";
    }
    
    public static String RadioButtonUpdateExistingRecordsXpath()
    {
        return "//div//div/label/span[text()='Update existing records']/../input[@value='updateExistingRecords']";
    }
    
    public String PopUpDownloadImportTemplateButtonCancelXpath()
    {
        return "//div//div/a[text()='Cancel']";
    }
    
    public static String PopUpDownloadImportTemplateButtonDownloadXpath()
    {
        return "//div//div/a[text()='Download']";
    }
    
    public static String PopUpImportContactsHeadingXpath()
    {
        return "//div//div/h5[text()='Import contacts']";
    }
    
    public static String PopUpTextInstructionsXpath()
    {
        return "//div//div/p/strong[text()='Instructions:']";
    }
    
    public static String PopUpImportContactsInstructionListXpath()
    {
        return "//div//div/ol/li";
    }
    
    public static String ChooseFileTextXpath()
    {
        return "//div//div/p[text()='Please choose the file you would like to import']";
    }
    
    public static String ChooseFileInputBoxXpath()
    {
        return "//div//div/.././div/input[@ng-model='fileName']";
    }
    
    public static String ButtonChooseFileXpath()
    {
        return "//div//div/.././div/span/input[@type='file']";
    }
    public static String ButtonChooseFileSpanXpath()
    {
        return "//div//div/.././div/span[@class='btn fileinput-button btn-success']/span";
    }
    public static String ArletMessageContactsImportedSuccessfulXpath()
    {
        return "//span[text()='Contacts imported successfully']";
    }
    
    public static String InvalidEmailAddressErrorMsgXpath()
    {
        return "//td[text()=': The e-mail address is not valid.']";
    }
    
    public static String InvalidHomeNumberErrorMsgXpath()
    {
        return "//td[contains(text(),'Invalid home number')]";
    }
    
    public static String ImportWasUnsuccessfulErrorMsgXpath()
    {
        return "//div//div[@ng-show='$modal.errorMessages']";
    }
    
    public static String FirstNameIsRequiredErrMsgXpath()
    {
        return "//div//td[contains(text(),': First name is required')]";
    }
    
    public static String PopUpImportContactsButtonCloseXpath()
    {
        return "//div//div[@class='modal-footer']/a[text()='Close']";
    }
    
    public static String ColumnNameXpath(String ContactName)
    {
        return "//td[@column-field='name']/div/a/span[text()='"+ContactName+"']/..";
    }
    
    public static String NoItemToDisplayXpath()
    {
        return "//div[@class='grid-no-items'][contains(@style,'display: none')]/span[text()='No items to display']";
    }
    
    public static String ButtonActionXpath()
    {
        return "//div[@class='row-actions']/ul/li/div/div/a[@class='btn-actions']";
    }
    
    public static String FirstButtonActionXpath()
    {
        return "//div[@class='row-actions']/ul/li[@class='ng-scope odd']/div/div/a[@class='btn-actions']";
    }
    
    public static String ActionButtonRemoveXpath()
    {
        return "//ul/li/a/span[text()='Remove']/..";
    }
    
    public static String ButtonRemoveContactXpath()
    {
        return "//div[@name='removeContactConfirmationModal']//button[text()='Remove']";
    }
    
    public static String PopUpRemoveContactHidden()
    {
        return "//div[@name='removeContactConfirmationModal'][@aria-hidden='true']";
    }
    
    public static String ContactRemovedAlertMsgXpath()
    {
        return "//span[text()='Contact successfully removed']";
    }
    
    public static String FirstNameTextboxXpath()
    {
        return "//input[@name='firstName']";
    }
    
    public static String LastNameTextboxXpath()
    {
        return "//input[@name='lastName']";
    }
    
    public static String EmployerTextBoxXpath()
    {
        return "//input[@name='employer']";
    }
    
    public static String PositionTextboxXpath()
    {
        return "//input[@name='position']";
    }
    
    public static String HomeNumberTextboxXpath()
    {
        return "//input[@name='homeNumber']";
    }
    
    public static String WorkNumberTextboxXpath()
    {
        return "//input[@name='workNumber']";
    }
    
    public static String MobileNumberTextboxXpath()
    {
        return "//input[@name='mobileNumber']";
    }
    
    public static String OtherNumberTextboxXpath()
    {
        return "//input[@name='otherNumber']";
    }
    
    public static String EmailTextboxXpath()
    {
        return "//input[@name='email']";
    }
    
    public static String ButtonCancelEditContactFormXpath()
    {
        return "//div[@name='contactFormModal']//button[text()='Cancel']";
    }
    
    public static String ContactFormModalXpath()
    {
        return "//div[@name='contactFormModal'][contains(@style,'block')]";
    }
    
    //</editor-fold>
    
}