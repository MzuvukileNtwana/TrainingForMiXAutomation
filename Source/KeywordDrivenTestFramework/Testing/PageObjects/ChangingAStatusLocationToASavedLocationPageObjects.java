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
public class ChangingAStatusLocationToASavedLocationPageObjects {
    
    
    public static String Day()
    {
        return "//div[@class='current-days']/div[text()='20']";
    }
     
    public static String AprilMonth()
    {
        return "//div[@class='datepicker-widget in']/div[1]/div/div[text()='Apr']";
    }
    
    public static String MonthSelection()
    {
        return "//div[@class='month-selector zoomable']//div[text()='Apr']";
    }
    
    public static String StatusRow()
    {
        return "//tr[@class='ng-scope last odd'][1]";
    }
    
    
    public static String AddButtonEvent()
    {
        return "//a[@fleet-tooltip='Add status event']/i";
    }
    
    public static String Status()
    {
        return "//select[@name=\"workState\"]";
    }
    
    public static String ActionButton()
    {
        return "//li[@ng-repeat='row in limitedRows']//a[@fleet-tooltip='Actions'][1]";
    }
    
    public static String EditButton()
    {
       // return "//span[text()='Edit']";
        return "//ul[contains(@style, 'display: block')]//span[text()='Edit'][1]";
    }
    
    public static String EditDriverStatusHeading()
    {
        return "//div[@class='modal hide fade in']//span[text()='Edit driver status']";
    }
    
    public static String TextArea()
    {
        return "//div[@class='modal hide fade in']//textarea";
    }
    
    public static String NextButton()
    {
        return "//button[text()='Next']";
    }
  
    public static String EditDriverStatusHeadingCheck2()
    {
        return "//div[@class='modal hide fade modal-medium in']//span[text()='Edit driver status']";
    }
    
    public static String ChangeLocationButton()
    {
        return "//a[text()='Change location']";
    }
    
    public static String LocationRadioButton()
    {
        return "//input[@value='location']";
       // return "//span[text()='A location']/../input";
    }
    
    public static String LocationTextBox()
    {
        return "//input[@ng-model='$parent.locationFilter']";
    }
    
    public static String Location2Check(String name)
    {
        return  "//span[contains(text(), '"+name+"')]";
    }
    
    public static String location2Select(String name)
    {
        return"//a[contains(text(),'"+name+"')]";
       // return "//a[contains(text(),'Wellington, Western ')]";
    }
    
    
    public static String Location1Check(String name)
    {
        return "//Strong[text()='Location']/../..//span[contains(text(), '"+name+"')]";
    }
    
    public static String Location1Select(String name)
    {
        return "//a[contains(text(),'"+name+"')]";
    }
    
    public static String SaveButton()
    {
        return "//button[text()='Save']";
    }
    
    
    public static String LocationSelection()
    {
        return "//li[@ng-repeat=\"match in matches\"]/a";
    }
    
    
    public static String EnterLocation()
    {
        return "//input[@ng-model=\"$parent.locationFilter\"]";
    }
    
    public static String ConfirmButton()
    {
        return "//button[text()='Confirm']";
    }
    
    public static String ConfirmChangesHeading()
    {
        return "//span[text()='Confirm changes']";
    }
    
    public static String DisplayMessage()
    {
        return "//div[@class=\"notification-wrapper notification-modal ng-scope\"][@style=\"display: none;\"]";
    }

    public static String LocationRetrieval()
    {
        return "//a[text()='Change location']/../span[1]";
    }
    
    public static String LocationComparison()
    {
        return "//td[@column-field='location.description']/div/span";
    }

     public static String CloseModal()
     {
         return "//div[@class='modal hide fade modal-medium in']//button[text()='×']";
     }
     
     public static String LocationPath()
     {
         return "//*[local-name()='path']";
     }
     
     public static String LogoutButton()
     {
         return "//i[@class='icon-main-logout']";
     }
     
     
     
     
     
}
