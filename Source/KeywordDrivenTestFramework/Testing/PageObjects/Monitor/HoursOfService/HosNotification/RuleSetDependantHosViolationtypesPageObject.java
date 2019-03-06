/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects.Monitor.HoursOfService.HosNotification;

/**
 *
 * @author smncwabe
 */
public class RuleSetDependantHosViolationtypesPageObject {
    
    public static String MonitorMenuRelativeXpath() 
    {
        return "//a[text()='MONITOR ']";
    }
    
    public static String AddButtonByXpath(){
        return "//button/i[@class='icon-plus icon-white']";
    }
    
    public static String NotificationDetailsByXpath(){
        return "//h5[text()='Notification details']";
    }
    
    public static String AddNotificationTextBoxXpath(){
        return "//div[@class='span6']/input";
    }
    
    public static String ButtonNextByXpath(){
        return "//button[text()='Next']";
    }
   
   public static String SpinnerXpath(){
       return "//div[@class='loading-overlay'][@style='display: none;']";
   }
   
   public static String DvtAutomationLinkXpath(){
       return "//div[@class='tree-item-content']//a/span[text()='DVT Automation']";
   }
   
   public static String ViolationTextByXpath(){
       return "//span[text()='Violations']";
   }
   
   public static String WeeklyRestCheckBoxXpath(){
       return "//tr//div/span[text()='Weekly Rest']/../../../td/input";
   }
   
    public static String WeeklyDrivingXpath()
    {
        return "//tbody/tr//input/../../td/div/span[text()='Weekly Driving']";
    }
    
    public static String DailyDrivingXpath()
    {
        return "//tbody/tr//input/../../td/div/span[text()='Daily Driving']";
        
    }
    
    public static String DailyRestCheckBoxByXpath()
    {
        return "//tbody/tr//input/../../td/div/span[text()='Daily Rest']";
    }
    
    public static String ContinuousDrivingCheckBoxByXpath()
    {
        return "//tbody/tr//input/../../td/div/span[text()='Continuous Driving']";
    }
   
    public static String WeeklyRestCheckBoxByXpath()
    {
        return "//tbody/tr//input/../../td/div/span[text()='Weekly Rest']";
    }

    public static String DailyDrivingWithoutBreakXpath() {
      return "//tbody/tr//input/../../td/div/span[text()='Daily Driving Without Break']";
    }
    
    
    public static String ReducedRestCompensationXpath(){
        return "//tbody/tr//input/../../td/div/span[text()='Reduced Rest Compensation']";
    }
    
    public static String TwoWeeklyDrivingXpath(){
        return "//tbody/tr//input/../../td/div/span[text()='Two Weekly Driving']";
    }
    
    public static String TwoWeeklyRestXpath(){
        return "//tbody/tr//input/../../td/div/span[text()='Two Weekly Rest']";
    }
    
    public static String CycleOffDutyPeriodsXpath(){
        return "//tbody/tr//input/../../td/div/span[text()='Cycle Off Duty Periods']";
    }
    
    public static String CycleOnDutyXpath(){
        return "//tbody/tr//input/../../td/div/span[text()='Cycle On Duty']";
    }
    
    public static String DailyOffDutyXpath(){
        return "//tbody/tr//input/../../td/div/span[text()='Daily Off Duty']";
    }
    
    public static String DailyOffDutyNotForShiftResetXpath(){
        return "//tbody/tr//input/../../td/div/span[text()='Daily Off Duty Not For Shift Reset']";
    }
    
    public static String DailyOnDutyMaximumXpath(){
        return "//tbody/tr//input/../../td/div/span[text()='Daily On Duty Maximum']";
    }
    
    public static String ShiftDrivingXpath(){
        return "//tbody/tr//input/../../td/div/span[text()='Shift Driving']";
    }
    
    public static String ShiftOnDutyXpath(){
        return "//tbody/tr//input/../../td/div/span[text()='Shift On Duty']";
    }
    
    public static String ShiftTotalXpath(){
        return "//tbody/tr//input/../../td/div/span[text()='Shift Total']";
    }
    
    public static String CycleOnDutyWithoutRequiredOffDutyXpath(){
        return "//tbody/tr//input/../../td/div/span[text()='Cycle On Duty Without Required Off Duty']";
    }
    
    public static String RestBlockShortXpath(){
        //return "//tbody/tr//input/../../td/div/span[text()='Rest Block Short']";
        return "//tbody/tr//input/../../td/div/span[contains (text(),'Rest block short')]";
 
    }
    
    public static String RestBlockMediumXpath(){
        return "//tbody/tr//input/../../td/div/span[contains(text(),'Rest block medium')]";
        //return "//tbody/tr//input/../../td/div/span[text()='Rest Block Medium']";
    }
    
    public static String RequiredRestIn14daysXpath(){
        return "//tbody/tr//input/../../td/div/span[text()='Required Rest In 14 days']";
    }
    
    public static String RequiredRestIn7daysXpath(){
        return "//tbody/tr//input/../../td/div/span[text()='Required Rest In 7 days']";
    }
    
    public static String RequiredRestIn24HoursXpath(){
        return "//tbody/tr//input/../../td/div/span[text()='Required Rest In 24 Hours']";
    }
    
    public static String Drivingin14dayperiodXpath(){
        return "//tbody/tr//input/../../td/div/span[text()='Driving in 14 day period']";
    }
    
    public static String RestBlockLongXpath(){
        return "//tbody/tr//input/../../td/div/span[contains(text(),'Rest block long')]";
       // return "//tbody/tr//input/../../td/div/span[text()='Rest Block Long']";
    }
    
    public static String Drivingin24HperiodXpath(){
        return "//tbody/tr//input/../../td/div/span[text()='Driving in 24H period']";
    }
    
    public static String Drivingin7dayperiodXpath(){
        return "//tbody/tr//input/../../td/div/span[text()='Driving in 7 day period']";
    }
    
    public static String ViolationType(){
        return "//thead/tr/th/span[text()='Violation type']/../../../../tbody/tr/td/div/span[@class='text-overflow ng-binding']";
    }
    
    public static String ButtonCancelXpath(){
        return "//button[text()='Cancel']";
    }
    
    public static String GhosEuTestingLinkXpath(){
        
        return "//div//a/span[text()='GHOS EU Testing']";
    }
    
    public static String DvtOnlyXpath(){
        return "//div//a/span[text()='-= DVT  Only =-']";
    }
    
    public static String GHOSAUSTestingXpath(){
        return "//div//a/span[text()='GHOS AUS Testing']";
    }
    
    public static String TestRSOXpath(){
        return "//div//a/span[text()='Test RSO']";
    }
    
    public static String GHOSEUTestingBreadCrumXpath(){
        return "//div//a/span[text()='GHOS EU Testing']";
    }
    
    public static String DVTAutomationGroupXpath()
    {
        return "//div//a/span[text()='DVT Automation']/..";
    }
    
    public static String GhosCanadaBreadCrumXpath(){
        return "//div//a/span[text()='GHOS Canada (DVT)']";
    }
    
    public static String GhosCanadaDvtLinkXpath(){
        return "//div[@class='tree-item-content']//a/span[text()='GHOS Canada (DVT)']";
    }
    
    public static String GHOSAUSTestingLinkXpath(){
        return "//div[@class='tree-item-content']//a/span[text()='GHOS AUS Testing']";
    }
    
    public static String EscalationFieldXpath()
    {
        return "//tr/td/div/span[text()='Weekly Driving']/../../../td/div/span/input";
    }
   

     
    public static String RefreshLinkByXpath(){
        return "//div//a/span[text()='Refresh']";
    }
    
}
