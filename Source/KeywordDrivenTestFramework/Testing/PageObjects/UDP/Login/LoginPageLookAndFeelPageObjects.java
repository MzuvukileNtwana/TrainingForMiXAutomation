/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects.UDP.Login;

/**
 *
 * @author apeter
 */
public class LoginPageLookAndFeelPageObjects 
{
    public static String MyMixLoginHeading()
    {
        return "//span[contains(text(),'MyMiX LOGIN')]";
    }
    public static String languagesXpath()
    {
        return "//select[@ng-model='selectedLanguage']/option";
    }
    public static String languagesOptionsXpath(int option)
    {
        return "//select[@ng-model='selectedLanguage']/option["+option+"]";
    }
    public static String InputUsernamePassword(String usernamePassword)
    {
        return "//input[@name='"+usernamePassword+"']";
    }
    public static String DivWithMessage(String text)
    {
        return "//input[@name='"+text+"']//..//span";
    }    
    public static String mymixPageTitleXpath()
    {
        return "//head/title";
    }
    public static String languageDropdownXpath()
    {
        return "//select[@name='languageList']";
    }
}
