/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects.Monitor.HoursOfService.Timeline;

/**
 *
 * @author smnisi
 */
public class MoveEventRowDownAndUpPageObject {
    
    public static String secondEventOnList()
    {
        return "//div[@class='items']/div[2]/div/div/canvas/../../span";
    }
    
    public static String eventSelected()
    {
        return "//div[@class='series-container ng-scope selectable selected']";
    }
    
    public static String getTheSelectedEvent()
    {
        return "//div[@class='items']/div[2]/div/div/canvas/../../span";
    }
    
    
    public static String getEventNumber3 ()
    {
         return "//div[@class='items']/div[3]/div/div/canvas/../../span";
    }
    
    public static String getEventNumber8()
    {
        return "//div[@class='items']/div[8]/div/div/canvas/../../span";
    }
    public static String threeEventOnList()
    {
        return"//div[@class='items']/div[3]/div";
    }
    
    public static String eventDownArrowButton()
    {
        return "//a/i[@class='icon-arrow-down']";
    }
    
    public static String eventUpArrowButton()
    {
        return "//a/i[@class='icon-arrow-up']";
    }
    
    public static String deleteEventButton()
    {
        return "//a/i[@class='icon-remove-sign icon-red']";
    }
    
    public static String eventIdleExcessive()
    {
        return "//div[@class='items']/div[5]/div";
    }
    
    public static String collectOfEventList()
    {
        return "//div[@class='event-series ng-scope']";
    }
    public static String collectOfEventList(int RowIndex)
    {
        return "//div[@class='items']/div["+RowIndex+"]/div";
    }
    
    public static String FirstEventOnList() 
    {
        return "//div[@class='items']/div[1]/div";
    }
    
    public static String eventFlagButton()
    {
       return "//a[@fleet-tooltip='Events']/i/..";
    }
    
    public static String selectEvents()
    {
        return "//div[@class='alert alert-success']/h5/span[text()='Select events']";
    }
    
    public static String clickIndexTwoCheckBox()
    {
        return "//table/tbody/tr[3]/td[1]/input[1]";
    }
    
    public static String clickIndexThreeCheckBox()
    {
        return "//table/tbody/tr[4]/td[1]/input[1]";
    }
    
    public static String clickIndexFourCheckBox()
    {
        return "//table/tbody/tr[5]/td[1]/input[1]";
    }
    
    public static String SelectButton()
    {
        return "//button[text()='Select']";
    }
    
    public static String totalEventsList()
    {
        return "//a[@fleet-tooltip='Events']/span";
    }
    
}
