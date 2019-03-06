/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects.Shakedown;

/**
 *
 * @author lmgulwa
 */
public class ManageLocationsPageObject {
    public static String circleButtonXpath()
    {
        return "//i[@class='icon-shape-circle']/..";
    }
    
    public static String addressPlottedOnMapXpath()
    {
        return "//div/img[contains(@class, 'leaflet-marker-icon')]";
    }
    
    public static String locationXpath()
    {
        return "//*[local-name()='path']";
    }
    
    public static String rightGridSpinnerXpath()
    {
        return "//div[@id=\"trManageLocationListGrid\"]/../../div[contains(@class,'loading-overlay') and contains(@style,'none')]";
    }
    
    public static String leftGridSpinnerXpath()
    {
        return "//div[@class=\"left-pane\"]/div[contains(@class,'loading-overlay') and contains(@style,'none')]";
    }
    
    public static String addLocationButtonXpath()
    {
        return "//i[contains(@class, 'icon-plus')]/..";
    }
    
    public static String addressRadioButtonXpath()
    {
        return "//span[text()='An address']/../input";
    }
    
    public static String addressTextBoxXpath()
    {
        return "//input[@placeholder='Enter address']";
    }
    
    public static String uiLocationAutocompleteXpath()
    {
        return "//ul[contains(@class,'ui-autocomplete') and contains(@style,'block')]";
    }
    
    //Might be more than one results returned depending on the supplied text parameter (cater for that in code)
    public static String resultBasedOnAddressSearchXpath(String text)
    {
        return "//ul[contains(@class,'ui-autocomplete') and contains(@style,'block')]//a[contains(text(), '" + text + "')]";
    }
    
    public static String locationNameTextBoxXpath()
    {
        return "//span[text()='Location name']/../../input";
    }
    
    public static String siteDropDownLocationTypeXpath()
    {
        return "//span[text()='Site']/../../select/option";
    }
    
    public static String locationTypeDropDownXpath()
    {
        return "//span[text()='Location type']/../../select/option";
    }
    
    public static String btnSaveXpath()
    {
        return "//button[text()='Save']";
    }
    
    public static String filterBoxXpath()
    {
        return "//input[@placeholder=\"Filter\"]";
    }
    
    public static String locationDescriptionXpath(String locationName)
    {
        return "//td[@column-field=\"description\"]//span[text()='" + locationName + "']";
    }
    
    public static String actionsButtonXpath()
    {
        return "//a[@class='btn-actions']";
    }
    
    public static String removeLinkXpath()
    {
        return "//span[text()='Remove']/..";
    }
    
    public static String confirmRemoveButtonXpath()
    {
        return "//div[@name=\"removeLocationConfirmation\"]//button[text()='Remove']";
    }
}
