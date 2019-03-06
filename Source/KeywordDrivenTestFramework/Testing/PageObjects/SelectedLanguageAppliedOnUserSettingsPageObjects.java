/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects;

import KeywordDrivenTestFramework.Core.BaseClass;

/**
 *
 * @author smbiko
 */
public class SelectedLanguageAppliedOnUserSettingsPageObjects extends BaseClass
{
    public static String MenuXpath(String elementText) 
    {
        //return "//a[contains(text(), '"+elementText+"')]";
        return "//a[text()='Anagemay ']";
    }
    
    public static String SubMenuXpath(String elementText) 
    {
        return "//a[text()='Ersonalpay ettingssay']";
    }
    
    
    
    
    public static String ValidateSpanTextXpath(String elementText) 
    {
        return "//span[text()='"+elementText+"']";
    }
    
    public static String ValidatePersonalDetailsTabXpath() 
    {
        return "//div[@class='span12 white-box-padding']/..";
    }
    
    public static String usernameXpath() 
    {
        return "//span[text()='Usernameway']";
    }
    
    public static String firstNameXpath() 
    {
        return "//span[text()='Irstfay Amenay']";
    }
    public static String lastNameXpath() 
    {
        return "//span[text()='Astlay Amenay']";
    }
     
    public static String employerNameXpath() 
    {
        return "//span[text()='Employerway']";
    }
    
    public static String homeNumberXpath() 
    {
        return "//span[text()='Omehay umbernay']";
    }
    
    public static String workNumberXpath() 
    {
        return "//span[text()='Orkway umbernay']";
    }
    public static String mobileNumberXpath() 
    {
        return "//span[text()='Obilemay umbernay']";
    }
    public static String regionalSettingsTabXpath() 
    {
        return "//a[text()='Egionalray ettingssay']";
    }
    
    public static String validateRegionalSettingsTabXpath() 
    {
        return "//legend[text()='Egionalray Ettingssay']";
    }
    
    public static String validateCountryXpath() 
    {
        return "//span[text()='Ountrycay']";
    }
    
    public static String selectLanguageXpath() 
    {
        return "//label[text()='Electsay anguagelay']";
    }
     
    public static String timeZoneXpath() 
    {
        return "//span[text()='Imezonetay']";
    }
    public static String measurementUnitsXpath() 
    {
        return "//span[text()='Easurementmay unitsway']";
    }
    public static String consumptionXpath() 
    {
        return "//span[text()='Onsumptioncay']";
    }
    public static String measurementUnitsDropdownXpath() 
    {
        return "//select[@ng-model='userProfile.measurementType']";
    }
    public static String measurementUnitsListXpath(String name) 
    {
        return "//select[@ng-model='userProfile.measurementType']/option[text()='"+name+"']";
    }
    public static String spinnerXpath() 
    {
        return "//div[@class='loading-overlay ng-scope']";
    }
    public static String consumptionDropdown()
    {
        return "//select[@ng-model='userProfile.consumptionType']";
    }
    
    public static String consumptionOptionListXpath(String name) 
    {
        return "//select[@ng-model='userProfile.consumptionType']/option[text()='"+name+"']";
    }
    
    
    
    
}
