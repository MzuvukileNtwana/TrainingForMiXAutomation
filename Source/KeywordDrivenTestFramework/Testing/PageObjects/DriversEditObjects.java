/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects;

/**
 *
 * @author kmanakaza
 */
public class DriversEditObjects 
{
    //Table Loading Spinner
    public static String TableLoadingSpinnerXpath()
    {
       return "//div[@class='loading-overlay'][@style='display: none;']";
    }
    
    //Monitor
    public static String MonitorMenuRelativeXpath() 
    {
        return "//a[text()='MONITOR ']";
    }
    
    //Drivers
    public static String DriversSubMenuRelativeXpath() 
    {
        return "//a[text()='Drivers']";
    }
    
   //Row action button
   public static String ActionButtonByRowXpath(String row) 
   {
        return "//div[@row='"+ row +"']//a[@class='row-action']";
   }
  
   //Row Edit button
   public static String ActionEditButtonsByRowXpath(String row) 
   {
      return "//ul[contains(@style,'block')]//a[@row-index= "+ row +" ][@event='Edit']";
   }
   
   //Driver Details
   public static String DriverDetailsTabXpath() 
    {
        return "//li/a[text()= 'Driver details']";
    }
   
    //Driver name Already in use
   public static String DriverNameAlreadyInUseXpath() 
    {
        return "//input[@fleet-driver-name-unique-async-message=\"'Driver name already in use'\"]";
    }
    
    //Driver Details name text field
    public static String DriverDetailsNameXpath() 
   {
      return "//input[@name='driverName']";
   } 
   
    //Site Text
    public static String SiteTextXpath() 
     {
       return "//div//span[text()='Site']";
     }

   //Driver Details Site drop down list
   public static String SiteXpath() 
   {
       return "//div[@class='span6']/div/label/span[text()='Site']/../../select";
   }
   
   //Save Button
   public static String SaveDriverButtonXpath() 
    {
      return "//button[text()='Save']";
    }
   //Confirmation Message
   public static String ConfirmationMessageForSaveButtonXpath() 
    {
      return "//div/span[text()='Driver updated successfully']";
    } 
   
   //Search input text field
    public static String FilterTextboxXpath() 
    {
        return "//div/div/input";
    }
    
    //Search button
    public static String FilterButtonXpath() 
    {
        return "//div/div[@class='text-filter']/a[@class='btn btn-small']";
    } 
    
    //Refresh link
    public static String RefreshLinkXpath() 
    {
        return "//p/a/span[text()='Refresh']";
    }
    
    //Row count
    public static String RowCountXpath() 
    {
        return "//div[@class ='column']/div/span[text()='Asset description']/../..//div[contains(@class,'cell')]";
    }
}
