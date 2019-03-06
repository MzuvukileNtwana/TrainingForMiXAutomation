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
public class ChangingDriverSelectionPageObjects 
{
    
    public static String SelectedDriver(String driver)
    {
        return "//a[@class='ng-scope active selected']/span[text()='"+driver+"']";
    }
    
    public static String Breadcrumb()
    {
        return "//span[@class='text-overflow ng-binding']/../../../a";
    }
    
    public static String NewDriverXpath(String newDriver)
    {
        return "//span[text()='"+newDriver+"']/..";
    }
    
    public static String SelectButtonXpath()
    {
        return "//a[text()='Select']";
    }
    
    public static String EventsXpath()
    {
        return "//div[@class='items']";
    }
    
    public static String WorkStateXpath()
    {
        return "//div[@class='us-hos-workstate-value-axis']";
    }
    
    public static String TripsXpath()
    {
        return "//div[@class='us-hos-workstate-value-axis']";
    }
    
    public static String SelectDriverHeaderXpath()
    {
        return "//h5[text()='Select driver']";
    }
    
}
