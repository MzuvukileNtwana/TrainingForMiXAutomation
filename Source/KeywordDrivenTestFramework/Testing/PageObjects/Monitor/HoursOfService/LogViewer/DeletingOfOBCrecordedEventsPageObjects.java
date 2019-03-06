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
public class DeletingOfOBCrecordedEventsPageObjects 
{
    public static String DateXpath()
    {
        return "//div[@class='pull-left datepicker ng-pristine ng-valid ng-valid-dmx-greater-than-or-equal-to']/input";
    }
    
    public static String LoaderXpath()
    {
        return "//div[@class='timeline-content full-height ng-scope']/div[@class='loading-overlay'][@style='display: none;']";
    }
    
    public static String EditStatusXpath()
    {
        return "//span[text()='Edit status']/..";
    }
    
    public static String AssetXpath()
    {
        return "//form[@name='driverStatusCrudForm']//input[@name='assetName']";
    }
    
    public static String DateTimeXpath()
    {
        return "//span[text()='Date and time']/../../div/input";
    }
    
    public static String DriverNameXpath()
    {
        return "//a[text()='Change asset'][@style='display: none;']/../../../div/div/div/input";
    }
    
    public static String RemarksXpath()
    {
        return "//span[text()='Remarks']/../../textarea";
    }
    
    public static String ChangeOdoXpath()
    {
        return "//a[text()='Change odo'][@style='display: none;']";
    }
    
    public static String OdoXpath()
    {
        return "//a[text()='Change odo'][@style='display: none;']/../span[1]";
    }
    
    public static String ChangelocationLinkXpath()
    {
        return "//a[text()='Change location']";
    }
    
    public static String EditDriverModalHiddenXpath()
    {
        return "//div[@class='modal hide fade modal-medium'][contains(@style,'none') and @aria-hidden='true' ]";
    }
    
    public static String CloseButtonXpath()
    {
        return "//div[contains(@style,'block')]//div/div[@class='row-fluid']/div[@ng-class='cssClass']/button[text()='×']";
    }
    
    public static String ActionsButtonXpath()
    {
        return "//a[@class='btn-actions']";
    }
    
    public static String RemoveStatusXpath()
    {
        return "//ul[contains(@style,'block')]/li/a/span[text()='Remove']";
    }
    
    public static String StatusXpath()
    {
        return "//select[@name='workState']";
    }
    
    public static String ChangeDriverXpath()
    {
        return "//div[@class='control-group']/a[text()='Change driver']";
    }
    
}
