/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects.Monitor.HoursOfService.Timeline;

/**
 *
 * @author lmgulwa
 */
public class ExportDetailedTripInfoPageObject {
    public static String lblWorkstateXpath(String state)
    {
        return "//span[text()='" + state + "']";
    }
    
    public static String detailTripXpath()
    {
        return "//div/pre[not(contains(@style,'none'))]";
    }
    
    public static String btnExportXpath()
    {
        return "//i[@class=\"icon-export\"]/..";
    }
    
    public static String datepickerXpath()
    {
        return "//div[@class='page-header']//div[@type=\"datetime\"]/input";
    }
}
