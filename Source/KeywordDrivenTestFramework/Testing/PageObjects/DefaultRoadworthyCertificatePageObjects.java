/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects;

/**
 *
 * @author elebese
 */
public class DefaultRoadworthyCertificatePageObjects 
{
    public static String AssetIntervalAndReminderDefaultsXpath() 
    {
        return "//a[text()='Asset interval and reminder defaults']";
    }
    
    public static String DefaultsRoadworthyCertificateXpath() 
    {
        return "//a[text()='Default roadworthy certificate']";
    }
    
    public static String CertificateDurationXpath() 
    {
        return "//label[text()='Certificate duration']";
    }
    
    public static String CertificateDurationTextBoxXpath() 
    {
        return "//label[text()='Certificate duration']/../div/input";
    }
    
    public static String CertificateDurationTextBoxErrorXpath() 
    {
        return "//div[@id='roadworthyDurationError']/span";
    }
    
    public static String CertificateDurationTextBoxErrorDisappearedXpath() 
    {
        return "//div[@id='roadworthyDurationError']/span[@style='display: none;']";
    }
    
    public static String ReminderPeriodTextBoxXpath() 
    {
        return "//div[@id='roadworthyReminderPeriodError']/../input";
    }
    public static String ReminderPeriodlabelXpath() 
    {
        return "//div[@id='roadworthyReminderPeriodError']/../input//..//..//label[text()='Reminder period']";
    }
    
    public static String ReminderPeriodTextBoxErrorXpath() 
    {
        return "//div[@id='roadworthyReminderPeriodError']/span";
    }
    
    public static String ReminderPeriodTextBoxErrorDisappearedXpath() 
    {
        return "//div[@id='roadworthyDurationError']/span[@style='display: none;']";
    }
    
    public static String SaveButtonXpath() 
    {
        return "//button[text()='Save']";
    }
    
    public static String SuccessBannerDisappearedXpath() 
    {
        return "//div[@style='display: none;']/div/span[@id='pop-alert-message']";
    }
    
    public static String SuccessBannerXpath() 
    {
        return "//span[text()='Organisation updated successfully']";
    }
    
    public static String TableSpinnerXpath() 
    {
        return "//div[@class='loading-overlay ng-scope'][@style='display: none;']";
    }
}
