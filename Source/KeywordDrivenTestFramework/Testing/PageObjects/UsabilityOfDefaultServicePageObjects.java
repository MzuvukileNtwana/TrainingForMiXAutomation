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
public class UsabilityOfDefaultServicePageObjects {
    
    
    public static String SaveButtonDisabled()
    {
        return "//button[text()='Save'][@disabled='disabled']";
    }
    
    public static String ServiceIntervalWarning()
    {
        return "//label[text()='Service interval']/..//span[text()='Value must be between 0 and 590000']";
    }
    
    public static String ServiceIntervalWarning1()
    {
        return "//label[text()='Service interval']/..//span[text()='This value must be greater than Reminder period.']";
    }
       public static String ReminderPeriodWarning()
    {
        return "//label[text()='Reminder period']/..//span[text()='Value must be between 0 and 590000']";
    }
}
