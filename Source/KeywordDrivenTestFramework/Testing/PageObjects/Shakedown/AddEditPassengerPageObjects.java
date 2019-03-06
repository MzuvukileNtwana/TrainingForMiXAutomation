/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects.Shakedown;

/**
 *
 * @author sscholtz
 */
public class AddEditPassengerPageObjects {
    
    public static String PassengerSpinner()
    {
        return "//div[@class='span12 full-height']/div[@class='loading-overlay ng-scope'][@style='display: none;']";
    }
    
    public static String AddButton()
    {
        return "//a[@fleet-tooltip='Add passenger']";
    }
    
    public static String PassengerAddSpinner()
    {
        return "//div[@class='white-box-shadow span12 full-height container-right']/div[@class='loading-overlay ng-scope'][@style='display: none;']";
    }
    
    public static String PassengerDetailsHeading()
    {
        return "//legend[text()='Passenger details']";
    }
    
    public static String EditPassengerHeading()
    {
        return "//span[text()='Edit passenger']";
    }
    
    public static String PassengerDetails(String details)
    {
        return "//input[@name='"+details+"']";
        
        //passengerName
        //fmPassengerId
        //mobileNumber
        //email
    }
    
    public static String Notes()
    {
        return "//textarea[@ng-model='passenger.notes']";
    }
    
    public static String SaveButton()
    {
        return "//button[text()='Save']";
    }
    
    public static String SaveButtonMessage()
    {
        return "//span[text()='Passenger created successfully']";
    }
    
    public static String MessageClearence()
    {
        return "//div[@class='notification-wrapper notification-modal ng-scope'][@style='display: none;']";
    }
    
    public static String Filter()
    {
        return "//input[@placeholder='Filter']";
    }
    
    public static String PassengerName(String name)
    {
        return "//span[text()='"+name+"']";
    }
    
     public static String CancelButton()
    {
        return "//button[text()='Cancel']";
    }
    
     public static String ActionButton()
    {
        return "//a[@fleet-tooltip='Actions']";
    }
    
     public static String RemoveButton()
    {
        return "//span[text()='Remove']";
    }
    
     public static String RemoveButtonConfirmation()
    {
        return "//button[text()='Remove']";
    }
    
     public static String RemoveMessage()
    {
        return "//span[text()='Passenger removed successfully']";
    }
    
     public static String NameHeading()
    {
        return "//span[text()='Name']";
    }
     public static String noItemsToDisplayXpath()
    {
        return "//div[@class='grid-no-items']//span[text()='No items to display']";
    }
     public static String passengerXpath(String name)
    {
        return "//div/a/span[contains(text(),'"+name+"')]";
    }
     
     

}
