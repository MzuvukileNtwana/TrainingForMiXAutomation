/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects;

/**
 *
 * @author apeter
 */
public class FilteringOnHOSStatusPageObjects 
{
    public static String filterTabsXpath()
    {
        return "//ul[@name='driverListItemTypeFilter']/li";
    }
    public static String filterTabXpath(String tab)
    {
        return "//ul[@name='driverListItemTypeFilter']/li//span[text()='"+tab+"']";
    }
    public static String gridHeaderXpath()
    {
        return "//div[@class='page-header']//strong";
    }
    public static String currentStatusColumnXpath()
    {
        return "//div[@name='driverListGrid']//span[text()='Current status']/../../div[contains(@class,'cell')]";
    }
    public static String currentStatusXpath()
    {
        return "//div[@name='driverListGrid']//span[text()='Current status']/../../div/../div[contains(@class,'cell')]";
    }
     public static String currentStatusRowXpath(int row)
    {
        return "//div[@name='driverListGrid']//span[text()='Current status']/../../div[contains(@class,'cell')]["+row+"]";
    }
     public static String noItemsToDisplayXpath()
     {
         return "//span[text()='No items to display']";
     }
     public static String nameColumnXpath(int row)
     {
         return "//div[@name='driverListGrid']//span[text()='Name']/../../div[contains(@class,'cell')]["+row+"]/a";
     }
     public static String driversXpath()
     {
         return "//div[@name='driverListGrid']//span[text()='Name']/../../div[contains(@class,'cell')]";
     }
     public static String hoursOfServiceTabXpath()
     {
         return "//li/a[text()='Hours of service']";
     }
     public static String hoursOfServiceCheckboxXpath()
     {
         return "//input[@name='isHosDriver']";
     }
     public static String cancelButtonXpath()
     {
         return "//button[@text='Cancel']";
     }
     public static String columnChooserButtonXpath()
     {
         return "//a[@class='btn btn-small column-chooser']";
     }
     public static String currentStatusTickXpath()
     {
         return "//ul[@class='dropdown-menu grid-column-chooser'][contains(@style,'block')]//span[text()='Current status']/../i";
     }
     public static String currentStatusSpanXpath()
     {
         return "//ul[@class='dropdown-menu grid-column-chooser'][contains(@style,'block')]//span[text()='Current status']";
     }
     public static String columnTickXpath(int columnNumber,String column)
     {
         return "//ul[@class='dropdown-menu grid-column-chooser'][contains(@style,'block')]//span[text()='"+column+"']/../i";
     }
     public static String columnSpanXpath(int columnNumber, String column)
     {
         return "//ul[@class='dropdown-menu grid-column-chooser'][contains(@style,'block')]//span[contains(text(),'"+column+"')]";
     }
     public static String columnXpath(String column)
     {
         return "//span[@class='title'][text()='"+column+"']";
     }
     public static String columnDataXpath(String column)
     {
         return "//div[@name='driverListGrid']//span[text()='"+column+"']/../../div/../div[contains(@class,'cell')]";
     }
}
