/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects;

/**
 *
 * @author smnisi
 */
public class FindANewPlace {
    
    
    public static String HistoricalTracking()
    {
        return "//li/a[text()='Historical tracking']";
    }
    
    public static String findAplaceIcon()
    {
        return "//a[text()='Find a place']/../../../a";
    }
    
    public static String FindAPlaceButton()
    {
        return "//a[text()='Find a place']";
    }
    
    public static String addressRadioButton()
    {
        return "//span[text()='An address']/../input";
    }
    
    public static String textBox()
    {
        return "//div[@ng-show=\"findBy == 'address' && mapProvider.addressLookup\"]/input";
    }
    
}
