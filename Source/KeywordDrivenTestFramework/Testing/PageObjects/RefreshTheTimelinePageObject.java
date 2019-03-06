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
public class RefreshTheTimelinePageObject {
    
    public static String refreshButton()
    {
        return "//div/a/span[text()='Refresh']";
    }
    
    public static String HOStimeLine()
    {
        return "//h5/span[text()='HOS timeline']";
    }
    
    public static String activeZoomLevelButton()
    {
        return "//div/button[@class='btn btn-small ng-scope ng-binding active']";
    }
    
    public static String eventDownArrow()
    {
        return "//a/i[@class='icon-arrow-down']";
    }
    
     public static String eventUpArrow()
    {
        return "//a/i[@class='icon-arrow-up']";
    }
     public static String removeEventButtonXpath()
    {
        return "//a[@fleet-tooltip='Remove event']";
    }
     
     public static String calenderIconButton()
     {
         return "//div[@class='page-header']/div/div[3]/div/span[@class='add-on btn']/i/..";
     }
     
     public static String HOSLogViewButton ()
     {
         return "//div[@class='page-header']/div/div[2]/a[3]/i";
     }
     
     public static String HOSLogViewer()
     {
         return "//span[text()='HOS Log Viewer']";
     }
     
     public static String DateStampAndDriver()
     {
         return "//span[@class='text ng-binding']";
     }
     
     public static String monitorHeader()
     {
         return "//a[text()='MONITOR ']";
     }
     
     public static String HosLogViewer()
     {
         return "//li/a[text()='Log viewer']";
     }
     
  
  
}
