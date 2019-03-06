/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects;

/**
 *
 * @author lmgulwa
 */
public class EmailConfigurationPageObject {
    
    public static String emailConfigDropDownXpath()
    {
        return "//label[text()='Email configurations']/../select/option";
    }
    
    public static String retrieveEmailConfigDropDownXpath()
    {
        return "//label[text()='Email configurations']/../select";
    }
    
    public static String fromAddressTextBoxXpath()
    {
        return "//span[text()='From address']/../../input";
    }
    
    public static String toAddressTextBoxXpath()
    {
        return "//span[text()='To address(es)']/../../input";
    }
    
    public static String bccAddressTextBoxXpath()
    {
        return "//span[text()='Bcc address(es)']/../../input";
    }
    
    public static String ccAddressTextBoxXpath()
    {
        return "//span[text()='Cc address(es)']/../../input";
    }
    
    public static String replyAddressTextBoxXpath()
    {
        return "//span[text()='Reply address(es)']/../../input";
    }
    
    public static String smtpServerNameTextBoxXpath()
    {
        return "//span[text()='SMTP server name']/../../input";
    }
    
    public static String smtpUsernameTextBoxXpath()
    {
        return "//span[text()='SMTP username']/../../input";
    }
    
    public static String smtpServerPortTextBoxXpath()
    {
        return "//span[text()='SMTP server port']/../../input";
    }
    
    public static String smtpPasswordTextBoxXpath()
    {
        return "//span[text()='SMTP password']/../../input";
    }
    
    public static String emailFormatDropDownXpath()
    {
        return "//label[text()='Email format']/../select/option";
    }
    
    public static String retrieveEmailFormatDropDownXpath()
    {
        return "//label[text()='Email format']/../select";
    }
    
    public static String emailPriorityDropDownXpath()
    {
        return "//label[text()='Email priority']/../select/option";
    }
    
    public static String retrieveEmailPriorityDropDownXpath()
    {
        return "//label[text()='Email priority']/../select";
    }
    
    public static String emailEncodingDropDownXpath()
    {
        return "//label[text()='Email encoding']/../select/option";
    }
    
    public static String retrieveEmailEncodingDropDownXpath()
    {
        return "//label[text()='Email encoding']/../select";
    }
    
    public static String sendFailedRetriesTextBoxXpath()
    {
        return "//span[text()='Send failed retries']/../../input";
    }
    
    public static String successfulEmailsInHistoryDropDownXpath()
    {
        return "//label[text()='Save successful emails in history']/../select/option";
    }
    
     public static String retrieveSuccessfulEmailsInHistoryDropDownXpath()
    {
        return "//label[text()='Save successful emails in history']/../select";
    }
    
    public static String failedEmailsInHistoryDropDownXpath()
    {
        return "//label[text()='Save failed emails in history']/../select/option";
    }
    
    public static String retrieveFailedEmailsInHistoryDropDownXpath()
    {
        return "//label[text()='Save failed emails in history']/../select";
    }
    
    public static String retryIntervalTextBoxXpath()
    {
        return "//label[text()='Retry interval']/..//input";
    }
    
    public static String saveSuccessfulEmailForTextBoxXpath()
    {
        return "//span[text()='Save successful emails for']/../..//input";
    }
    
    public static String saveFailedEmailForTextBoxXpath()
    {
        return "//span[text()='Save failed emails for']/../..//input";
    }
    
    public static String spinnerXpath()
    {
        return "//span[text()='Save failed emails for']/../..//input";
    }
    
    public static String emailConfigTabXpath()
    {
        return "//li[@ng-class='tabClass(tab)']//a[text()='Email configurations']";
    }
    
    public static String saveButtonBoxXpath()
    {
        return "//button[text()='Save']";
    }
}
