/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects.Monitor.HoursOfService.Timeline;

/**
 *
 * @author smnisi
 */
public class GeneratingAnHOSTimelinePageObject {
    
    public static String hosHeader()
    {
        return "";
    }
    
    public static String myWorkLabel()
    {
        return"//span[text()='MW']";
    }
    
    public static String myRestLabel()     
    {
       return "//span[text()='MR']";
    }
    
    public static String dateAndTimeTextBox()
    {
        return "//span[@class='add-on btn']/../../../div[@class='form-inline pull-left']/div/input";
    }
    
    public static String coDriverName()
    {
        return "//a[text()='Michael Hooper']";
    }
    
    public static String Thursday()
    {
        return "//div[@class='display']/div[text()='Thursday']";
    }
    
    public static String myResetToolTipCollection()
    {
        return "//div[@class='hos-tooltip ng-scope']/div";
    }
    
    public static String myWorkToolTipCollection()
    {
        return "//div[@class='hos-tooltip ng-scope']/div";
    }
    
    public static String bottomDragButton()
    {
        return "//img[@src='img/drag-btn-stripes.png']/..";
    }
    
    public static String DriverDetailsSpan()
    {
        return "//span[@class='text ng-binding']";
    }
    
    public static String summaryDetailedTrip()
    {
        return "//div[@class='span12 bottom-content']/pre[3]";
    }
    
    public static String detailedTripPageHeader()
    {
        return "//div/h5[text()='Detailed trip']";
    }
    
    public static String exportButton()
    {
        return "//div[@class='selection-btn-right pull-right']/a/i[@class='icon-export']";
    }
    
}
