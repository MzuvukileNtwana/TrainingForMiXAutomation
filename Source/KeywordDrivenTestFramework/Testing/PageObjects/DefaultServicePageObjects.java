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
public class DefaultServicePageObjects {
    
    
    public static String DefaultServiceTab()
    {
        return "//a[text()='Default service']";
    }
    
    public static String Distance()
    {
        return "//legend[text()='Distance']";
    }
    
    public static String ServiceIntervalDistance()
    {
        return "//input[@ng-model='service.distanceInterval.value']";
    }
    
    public static String ReminderPeriodDistance()
    {
        return "//input[@ng-model='service.distanceReminderPeriod.value']";
    }
    
    public static String Duration()
    {
        return "//legend[text()='Duration']";
    }
    
    public static String ServiceIntervalDuration()
    {
        return "//input[@ng-model='service.durationInterval']";
    }
    
    public static String ReminderPeriodDuration()
    {
        return "//input[@ng-model='service.durationReminderPeriod']";
    }
    
    public static String EngineHours()
    {
        return "//legend[text()='Engine hours']";
    }
    
      public static String ServiceIntervalEngineHours()
    {
        return "//input[@ng-model='service.engineHoursInterval']";
    }
      
       public static String ReminderPeriodEngineHours()
    {
        return "//input[@ng-model='service.engineHoursReminderPeriod']";
    }
}
