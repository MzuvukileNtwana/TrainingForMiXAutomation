/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects;

/**
 *
 * @author elebese
 */
public class DriversCountPageObjects 
{
    public static String RowCountXpath() 
    {
        return "//div[@class ='column']/div/span[text()='Name']/../..//div[contains(@class,'cell')]";
    }
    
    

    public static String ClearFilterTextBoxXpath() 
    {
        return "//a[@class='clear-filter']";
    }
    
    public static String pageSpinnerXpath() 
    {
        return "//div[@name=\"driverListGrid\"]/div[contains(@class,'loading-overlay') and contains(@style,'none')]";
    }
}
