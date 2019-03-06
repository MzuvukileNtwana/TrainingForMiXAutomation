/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects.UDP.Login;

/**
 *
 * @author sscholtz
 */
public class ValidLoginPageObjects {
    
    
    public static String MixLogo()
    {
        return "//div[@class='container-log-in ct login-logo mb-30']/img";
    }
    
    public static String MyMixLoginHeading()
    {
        return "//span[text()='MyMiX LOGIN']";
    }
    
    public static String SelectLanguage()
    {
        return "//select[@ng-model='selectedLanguage']";
    }
    
    public static String LoginDetails(String details)
    {
        return "//input[@name='"+details+"']";
    }
    
    public static String SignInButton()
    {
        return "//button[text()='Sign in']";
    }
    
    public static String LoginHeadings(String Headings)
    {
        return "//a[text()='"+Headings+"']";
    }
    
    public static String Spinners(String SpinnerHeadings)
    {
        return "//h2[text()='"+SpinnerHeadings+"']/../../..//div[@class='loading-overlay'][@style='display: none;']";
    }
    public static String HeaderFailedLoginXpath()
    {
        return "//h5[text()='Failed to login']";
    }
    public static String popMessageByXpath()
    {
        return "//span[text()='You have provided invalid credentials. Please try again.']";
    }
    
    
    
}
