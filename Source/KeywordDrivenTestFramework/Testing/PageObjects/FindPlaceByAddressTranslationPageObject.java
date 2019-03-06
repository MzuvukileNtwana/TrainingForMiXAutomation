/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects;

/**
 *
 * @author lmgulwa
 */
public class FindPlaceByAddressTranslationPageObject {
    
    public static String mapXpath()
    {
        //return "//*[local-name()='svg']";
        return "//div[contains(@class,\"leaflet-container\")]";
    }
    
    public static String mapToolbarXpath()
    {
        return "//div[contains(@class, 'tracking-docked-toolbar')]";
    }
    
    public static String magnifyingGlassXpath()
    {
        return "//i[@class= 'icon-search icon-white']/..";
    }
    
    public static String findPlaceXpath()
    {
        return "//a[text()='Indfay away aceplay']";
    }
    
    public static String addressXpath()
    {
        return "//span[text()='Anway addressway']/../input";
    }
    
    public static String locationXpath()
    {
        return "//span[text()='Away ocationlay']/../input";
    }
    
    public static String latitudeOrLongitudeXpath()
    {
        return "//span[text()='Away atitudelay/ongitudelay']/../input";
    }
    
    public static String countryDropdownXpath()
    {
        return "//select[@ng-model=\"selectedCountry.value\"]";
    }
    
    public static String languageDropdownXpath()
    {
        return "//select[@ng-model=\"selectedLanguage.value\"]";
    }
    
    public static String enterAddressTextBoxXpath()
    {
        return "//input[@placeholder=\"Enterway addressway\"]";
    }
    
    public static String languageDropdownOptionsXpath(int i)
    {
        return "//select[@ng-model=\"selectedLanguage.value\"]//option[" + i + "]";
    }
    
    public static String countryDropdownOptionsXpath(int i)
    {
        return "//select[@ng-model=\"selectedCountry.value\"]//option[" + i + "]";
    }
    
    public static String languageDropdownOptionsCountXpath()
    {
        return "//select[@ng-model=\"selectedLanguage.value\"]//option";
    }
    
    public static String countryDropdownOptionsCountXpath()
    {
        return "//select[@ng-model=\"selectedCountry.value\"]//option";
    }
}
