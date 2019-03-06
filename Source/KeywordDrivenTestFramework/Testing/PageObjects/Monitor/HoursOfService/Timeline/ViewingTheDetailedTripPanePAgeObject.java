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
public class ViewingTheDetailedTripPanePAgeObject {
    
    
    public static String refreshButton()
    {
        return "//span[text()='Refresh']/..";
    }
    
    public  static String detailsPageHeader()
    {
        return "//h5[text()='Detailed trip']/..";
    }
    
    public static String detailsSentence()
    {
        return "//pre[1]";
    }
    
    public static String summaryPane()
    {
        return "//pre[3]";
    }
    
    
    public static String timeHeading()
    {
        return "//span[@class='text ng-binding']";
    }
    
    
    public static String OFFWorkState()
    {
        return "//span[text()='OFF']";
    }
    
    public static String SBWorkState()
    {
        return "//span[text()='SB']";
    }
    
    public static String DWorkstate()
    {
        return "//span[text()='D']";
    }
    
    public static String ONWorkState()
    {
        return "//span[text()='D']";
    }
            
}
