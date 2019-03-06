/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects;

/**
 *
 * @author smnisi
 */
public class WorkingHoursPageObject {
    
    public static String paragraph()
    {
    return "//p[text()='Set the working hours for this organisation. This will calculate the private mileage to be displayed on the movement report.']";
    }
    
    public static String WorkingHours()
    {
        return "//li/a[text()='Working hours']";
    }
    
    public static String WorkingHoursHeader()
    {
        return "//h5[text()='Working hours']";
    }
    public static String driverDefaultPageSpinnerXpath()
    {
        return "//legend[text()='Driver defaults']/../../../div[contains(@class,'loading-overlay')][contains(@style,'none')]";
    }
    public static String workingHoursPageSpinnerXpath()
    {
        return "//h5[text()='Working hours']/../../div[contains(@class,'loading-overlay')][contains(@style,'none')]";
    }
    
    //Monday
    public static String mondayFromClockButton()
    {
        return "//tr[2]/td[2]/div/span";
    }
    
    public static String mondayToClockButton()
    {
        return "//tr[2]/td[3]/div/span";
    }
    
    public static String mondayFromDoneButton()
    {
        return "//div[24]/div[3]/a[text()='Done']";
    }
    
    public static String innerCircle()
    {
     //   return "//div[@class='inner-circle']/div[contains(@class,'selected')]";
        return "//div[@class='datepicker-widget in']//div[@class='inner-circle']/div[contains(@class,'selected')]";
    }
    
        //div[@class='datepicker-widget in']//div[@class='inner-circle']/div[contains(@class,'selected')]
    public static String outerCircle()
    {
        return "//div[@class='datepicker-widget in']//div[@class='outer-circle']/div[contains(@class,'selected')]";
    }
    
    //Tuesday
  
    public static String tuesdayFromClockButton()
    {
        return "//tr[3]/td[2]/div/span";
    }
    
    public static String tuesdayToClockButton()
    {
        return "//tr[3]/td[3]/div/span";
    }
    
    public static String wednesdayFromClockButton()
    {
        return "//tr[4]/td[2]/div/span/i";
    }
    
    public static String wednesdayToClockButton()
    {
        return "//tr[4]/td[3]/div/span/i";
    }
    
    public static String thursdayFromClockButton()
    {
        return "//tr[5]/td[2]/div/span";
    }
    
    public static String thursdayToClockButton()
    {
        return "//tr[5]/td[3]/div/span";
    }
    
    
     public static String fridayFromClockButton()
    {
        return "//tr[6]/td[2]/div/span";
    }
    
    public static String fridayToClockButton()
    {
        return "//tr[6]/td[3]/div/span";
    }
    
    
    public static String MondayFromDoneButton()
    {
        return "";
    }
    
    public static String MondayToDoneButton()
    {
        return "//div[27]/div[3]/a[text()='Done'][@class='ng-binding']";
    }
    
    public static String timeSelector()
    {
        return "//div[@class='datepicker-widget in']//div[@class='hours ng-binding selected']";
    }
    
    public static String Done()
    {
        return "//div[@class='datepicker-widget in']//div[@class='done']/a";
    }
    
    public static String SaturdaycheckBox()
    {
        return "//tr[7]/td[4]/input";
    }
    
    public static String SundayCheckBox()
    {
         return "//tr[8]/td[4]/input";
    }
    
    //___________________________Extracting time slot Xpaths
    
    public static String mondayFrom()
    {
        return "//tr[2]/td[2]/div/input";
    }
    
    public static String mondayTo()
    {
        return "//tr[2]/td[3]/div/input";
    }
    
     public static String tuesdayFrom()
    {
        return "//tr[3]/td[2]/div/input";
    }
    
    public static String tuesdayTo()
    {
        return "//tr[3]/td[3]/div/input";
    }
    
    public static String wednesdayFrom()
    {
        return "//tr[4]/td[2]/div/input";
    }
    
    public static String wednesdayTo()
    {
        return "//tr[4]/td[3]/div/input";
    }
    
    public static String thursdayFrom()
    {
        return "//tr[5]/td[2]/div/input";
    }
    
    public static String thursdayTo()
    {
        return "//tr[5]/td[3]/div/input";
    }
    
    public static String fridayFrom()
    {
        return "//tr[6]/td[2]/div/input";
    }
    
    public static String fridayTo()
    {
        return "//tr[6]/td[3]/div/input";
    }
    
    
    
}
