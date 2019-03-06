/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects.UDP.Login;

/**
 *
 * @author sakhi
 */
public class UPDPortalPageObjects 
{
   public static String generateTemporaryPasswordButton()
    {
        return "//button[text()='Generate temporary password']";
    }
    public static String TemporaryPasswordExpiryDateLabel()
    {
        return "//label[text()='Temporary password expiry date']";
    }
    public static String driverUserName()
    {
        return "//input[@name='driverPortalUsername']";
    }
   public static String TemporaryPasswordLabel()
    {
        return "//label[text()='Temporary password']";
    } 
    public static String TemporaryDiv()
    {
        return "//label[text()='Temporary password']/../../../../div[2][not(@style='display: none;')]";
    }
    public static String TemporaryPasswordTextbox()
    {
        return "//label[text()='Temporary password']/../input";
    }
    public static String loginPageSpan()
    {
        return "//span[text()='MyMiX LOGIN']";
    }
    public static String usernameTextbox()
    {
        return "//input[@dmx-validate='userName']";
    }
    public static String PasswordTextbox()
    {
        return "//input[@dmx-validate='password']";
    }
    public static String signInButton()
    {
        return "//button[text()='Sign in']";
    }
    public static String createPasswordHeader()
    {
        return "//h5[text()='Create Password']";
    }
    public static String newPasswordTextbox()
    {
        return "//input[@name='newPassword']";
    }
    public static String confirmPasswordTextbox()
    {
        return "//input[@name='confirmNewPassword']";
    }
    public static String newSignInButton()
    {
        return "//h5[text()='Create Password']/..//div[not(@style='display: none;')]/div/button[text()='Sign in']";
    }
    public static String dashboardHearder()
    {
        return "//div[@id='breadcrumb_custom_html']";
    }
    public static String passwordConfirmation()
    {
        return "//span[text()='New temporary password generated successfully']";
    }
}
