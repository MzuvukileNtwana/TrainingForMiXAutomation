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
public class PassengersDeletePageObjects 
{
     public static String RemovePassengerXpath()
    {
         return "//ul[contains(@style,'display: block')]/li/a/span[text()='Remove']";
    }
     
     public static String RemovedSuccessffullyXpath()
    {
         return "//div/div/span[text()='Passenger removed successfully']";
    }
     
      public static String TableSpinnerXpath()
    {
         return "//form[@name=\"passengerDetailsForm\"]/../div[@class='loading-overlay ng-scope'][@style='display: none;']";
    }
      
    public static String passengerPageRightSpinnerXpath()
    {
        return "//div[@fleet-loader=\"content\"]/div[contains(@class,'loading-overlay')][contains(@style,'none')]";
    }
    public static String passengerPageLeftSpinnerXpath()
    {
        return "//ul[@fleet-loader=\"content\"]/div[contains(@class,'loading-overlay')][contains(@style,'none')]";
    }
    public static String passengerDetailsSpinnerXpath()
    {
        return "//form[@name=\"passengerDetailsForm\"]/../div[contains(@class,'loading-overlay') and contains(@style,'none')]";
    }
}
