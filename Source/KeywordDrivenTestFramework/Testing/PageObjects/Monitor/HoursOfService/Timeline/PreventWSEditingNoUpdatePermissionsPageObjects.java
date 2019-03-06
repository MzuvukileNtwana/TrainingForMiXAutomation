/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects.Monitor.HoursOfService.Timeline;

/**
 *
 * @author sscholtz
 */
public class PreventWSEditingNoUpdatePermissionsPageObjects {
    
    
    public static String Date()
    {
        return "//div[@class='form-inline pull-left']//input[@type='text']";
    }
    
    public static String EditOffClick()
    {
        return "//span[text()='Edited']";
    }
    
    public static String AddLogData()
    {
        return "//span[text()='Add log data']";
    }
    public static String EditStatus()
    {
        return "//span[text()='Edit status']";
    }
}
