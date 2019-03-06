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
public class EventSelectionPersistPerOrgPageObjects 
{
    public static String EventsXpath(int i) 
    {
        return "//div["+ i +"]/div[@class='event-series ng-scope']/span";
    }
    
    public static String EventsCountXpath() 
    {
        return "//div/div[@class='event-series ng-scope']/span";
    }
    
    public static String EventsButtonXpath() 
    {
        return "//i[@class='icon-flag']";
    }
    
    public static String CancelButtonFilterEventsXpath() 
    {
        return "//button[text()='Cancel']";
    }
    
     public static String EventsFilterTextboxXpath() 
    {
        return "//div[@class='row-fluid']/form/div/input";
    }
}
