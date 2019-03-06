/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects.Monitor.HoursOfService.LogViewer;

/**
 *
 * @author lmgulwa
 */
public class CalculateViewPeriodPageObject {
    
    public static String btnZoomPeriodXpath(String btn)
    {
        return "//div/button[text()='" + btn + "']";
    }
    
    public static String iconInfoXpath()
    {
        return "//i[contains(@class,'icon-info-sign')]/..";
    }
    
    public static String viewPeriodTimeXpath()
    {
        return "//strong[text()='View period:']/../../label[contains(@class,'ng-binding')]";
    }
    
    public static String timescaleTimesXpath()
    {
        //return "//div[contains(@class,'top-time-axis')]/span";
        return "//div[@orientation='top']/span";
    }
    
    public static String specificTimescaleTimeXpath(int i)
    {
        //return "//div[contains(@class,'top-time-axis')]/span[" + i + "]";
        return "//div[@orientation='top']/span[" + i + "]";
    }
}
