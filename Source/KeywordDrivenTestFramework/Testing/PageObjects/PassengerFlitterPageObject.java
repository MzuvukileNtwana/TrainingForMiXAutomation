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
public class PassengerFlitterPageObject {
    
    //Text box used to flitter
    public static String passengerTextBoxXpath()
    {
        return "//div/input[@type='text']";
    }
    
    public static String deleteBtnXpath()
    {
        return "//button/i[@class='icon-remove-sign']";
    }
    
    public static String buttonFiltterSelectionXpath()
    {
        return "//a[@class='btn btn-small column-chooser']";
    }
    
    public static String emailAddressXpath()
    {
        return "//ul/li/a/span[text()='Email address']";
    }
    
    public static String mobileNumberXpath()
    {
        return "//ul/li/a/span[text()='Mobile number']";
    }

    public static String passengerIDRowXpath()
    {
        return "//tr/td[3]";
    }
    
    public static String passengerNameXpath()
    {
        return "//tr/td[2]";
    }
}
