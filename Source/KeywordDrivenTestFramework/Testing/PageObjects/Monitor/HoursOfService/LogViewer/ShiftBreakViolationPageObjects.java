/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects.Monitor.HoursOfService.LogViewer;

/**
 *
 * @author elebese
 */
public class ShiftBreakViolationPageObjects 
{
    public static String StatusColumnXpath()
    {
        return "//span[text()='Status']/../../../../tbody/tr/td[@class='ng-scope first']/div/span";
    }
    
    public static String ViolationtypeXpath()
    {
        return "//tr[1]/td[@column-field=\"violationName\"]//span";
    }
    public static String DurationColumnXpath()
    {
        return "//span[text()='Duration']/../../../../tbody/tr[@class='ng-scope last odd']/td[4]/div/span";
    }
    
    public static String TabsXpath(String label)
    {
        return "//a[text()='"+label+"']";
    }
    
    public static String ColumnsXpath(String column)
    {
        return "//ul[@class='dropdown-menu pull-right column-chooser-dropdown'][1]/li/a/span[text()='"+column+"']/../span[@style='display: none;']";
    }
    public static String DateXpath()
    {
        return "//div[@class='pull-left datepicker ng-pristine ng-valid ng-valid-dmx-greater-than-or-equal-to']/input";
    }
}
