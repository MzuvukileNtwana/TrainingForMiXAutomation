/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects.Shakedown;

/**
 *
 * @author lpooe
 */
public class TrackingSelectEventsToBeDisplayedOnMapsPageObjects
{
    //events icon xpath
    public static String eventsIconXpath()
    {
        return "//div//a//i[@class='icon-flag']";
    }
    
    //Ingnition Off/On checkbox xpath
    public static String ignitionOnOffXpath(String text)
    {
        return "//tr//td//div//span[text()='"+text+"']//..//..//..//td//input[@type='checkbox']";
    }
    
    //Select button xpath
    public static String selectButtonXpath()
    {
        return "//div//button[contains(text(),'Select')]";
    }
    
    //Events on trail checkbox xpath
    public static String eventsOnTrailXpath()
    {
        return "//div[@class='checkbox ng-scope']//span[text()='Events on trail']//..//input[@type='checkbox']//..//div[@style]";
    }
    
    //Map layers Close button xpath
    public static String closeButton()
    {
        return "//div[@class='page-header']//h5//span[text()='Map layers']//..//..//button[text()='×']";
    }
    
    //Select events window
    public static String selectEventsWindowXpath()
    {
        return "//h5//span[text()='Select events']";
    }
    
    //select events window close button
    public static String selectEventsCloseButtonXpath()
    {
        return "//h5//span[text()='Select events']//..//..//button[@class='close']";
    }
    
    //select events filter textbox
    public static String eventsFilterXpath()
    {
        return "//div[@name='trackingEventsModal']//form//div//input";
    }
}
