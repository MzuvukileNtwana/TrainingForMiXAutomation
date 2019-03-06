/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects;

/**
 *
 * @author sscholtz
 */
public class DynamicHOSWorkstateTotalsPageObjects {
    
    
    public static String StartOfDay()
    {
        return "//a[@fleet-tooltip='Start of day']";
    }
    
    public static String StartDate()
    {
        return "//div[@class='ng-scope tooltip timeline-tooltip in']";
    }
    
    public static String TimelineStartingDate()
    {
        return "//div[@class='tooltip-inner']/div//div[@class='hos-tooltip ng-scope']/div[1][contains(text(), '(ART)')]";
    }
    
    public static String TimelineEndDate()
    {
        return "//div[@class='tooltip-inner']/div//div[@class='hos-tooltip ng-scope']/div[2][contains(text(), '(ART)')]";
    }
    
    public static String TwelveHourButton()
    {
        return "//button[text()='12h']";
    }
    
    public static String TotalDurationOFF()
    {
        return "//div[@class='us-hos-workstate-value-axis']/span[1]";
    }
    
       public static String TotalDurationSB()
    {
        return "//div[@class='us-hos-workstate-value-axis']/span[4]";
    }
       
    public static String TotalDurationD()
    {
        return "//div[@class='us-hos-workstate-value-axis']/span[2]";
    }
    
       public static String TotalDurationON()
    {
        return "//div[@class='us-hos-workstate-value-axis']/span[3]";
    }
       
       public static String TwentyFourHourActiveWait()
       {
           return "//button[@class='btn btn-small ng-scope ng-binding active'][text()='24h']";
       }
       
       public static String TwentyFourHourClick()
       {
           return "//button[text()='24h']";
       }
       
       public static String TwelveFourHourActiveWait()
       {
           return "//button[@class='btn btn-small ng-scope ng-binding active'][text()='12h']";
       }
       
       
}
