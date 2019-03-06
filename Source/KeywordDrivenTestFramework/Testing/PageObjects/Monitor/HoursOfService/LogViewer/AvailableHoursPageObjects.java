/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects.Monitor.HoursOfService.LogViewer;

/**
 *
 * @author elebese
 */
public class AvailableHoursPageObjects 
{
    public static String AddStatusXpath()
    {
        return "//div[@class='timeline-table page-header']/div/a[@fleet-tooltip='Add status event']";
    }
    
    public static String AddStatusModalXpath()
    {
        return "//span[text()='Add driver status']";
    }
    public static String NoItemsSpinnerXpath()
    {
        return "//div[@class=\"fleet-grid-container-wrapper\"]/div[@class=\"grid-no-items\"][@style=\"display: none;\"]/span[text()='No items to display']";
    }
    
    public static String StatusDropXpath()
    {
        return "//select[@name='workState']";
    }
    
    public static String RemarksXpath()
    {
        return "//span[text()='Remarks']/../../textarea[@name='remarks']";
    }
    
    public static String RemoveReasonXpath()
    {
        return "//textarea[@ng-model=\"data.removeReason\"]";
    }
    
    public static String RefreshXpath()
    {
        return "//a/i[@class='icon-refresh icon-green']/..";
    }
    
    public static String SuccessBannerXpath(String message)
    {
        return "//span[text()='"+message+"']/../../../div[@style=\"display: none;\"][@class=\"notification-wrapper notification-modal ng-scope\"]";
    }
    
    public static String GridListElementXpath()
    {
        return "//li/strong[text()='Status']//..//..//..//..//../div[@id='hosGrid']/div//tr[@class='light-blue']/../../tbody/tr/td[@column-field='remarks']";
    }
    public static String ActionButtonIndexXpath(int rowIndex)
    {
        return "//li[@ng-repeat]["+rowIndex+"]/div/div/a[@fleet-tooltip='Actions']";
    }
    
    public static String ButtonXpath(String text)
    {
        return "//button[text()='"+text+"']";
    }
    
    
}
