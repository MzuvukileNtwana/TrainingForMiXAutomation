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
public class LocationListActionsDropdownEditAndRemovePageObjects 
{
    public static String ManageLocationSpinner()
    {
        return "//div[@class='fleet-grid full-height has-row-actions']//div[@style=\"display: none;\"][@class=\"loading-overlay ng-scope\"]";
    }
    
    public static String FirstLocationActionButton()
    {
        return "//li[@ng-repeat=\"row in limitedRows\"][1]";
    }
    
    public static String EditTab()
    {
        return "//ul[@class=\"dropdown-menu pull-right\"][contains(@style,'display: block')]//i[@class='icon icon-edit icon-green']/../span[1]";
    }
    
    public static String RemoveTab()
    {
        return "//ul[@class=\"dropdown-menu pull-right\"][contains(@style,'display: block')]//i[@class='icon icon-remove-sign icon-red']/../span[1]";
    }
    
    public static String BackLocationListButton()
    {
        return "//span[text()='Back to location list']";
    }
    
    public static String EditLocationSpinner()
    {
        return "//div[@class=\"left-pane\"]/div[@style=\"display: none;\"][@class=\"loading-overlay\"]";
    }
    
    public static String LocationName()
    {
        return "//input[@name=\"description\"]";
    }
    
    public static String LocationType()
    {
        return "//select[@name='type']/option[@selected='selected']";
    }
    
    public static String LocationSite()
    {
        return "//select[@name='siteId']/option[@selected='selected']";
    }
    
    public static String RemoveHeading()
    {
        return "//div[@header-title=\"Remove location\"]//div[@class=\"alert alert-danger\"]//h5/span";
    }
    
    public static String RemoveMessage()
    {
        return "//div[@header-title=\"Remove location\"]//p";
    }
    
    public static String CancelButton()
    {
        return "//div[@header-title=\"Remove location\"]//button[text()='Cancel']";
    }
    
    public static String RemoveButton()
    {
        return "//div[@header-title=\"Remove location\"]//button[text()='Remove']";
    }
}
