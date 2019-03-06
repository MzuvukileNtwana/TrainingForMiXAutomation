/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects.UDP.Login;

import KeywordDrivenTestFramework.Core.BaseClass;

/**
 *
 * @author smbiko
 */
public class InvalidUsernameAndValidPasswordPageObjects extends BaseClass
{
    public static String invalidLoginModal()
    {
        return "//div[@class='modal-inner-body white-box-padding']";
    }
    public static String invalidLoginModalLabel()
    {
        return "//div[@class='modal-inner-body white-box-padding']/div[@class='alert alert-error']";
    }
    public static String invalidLoginModalMessage()
    {
        return "//span[text()='You have provided invalid credentials. Please try again.']";
    }
    public static String invalidLoginModalOKButton()
    {
        return "//button[text()='OK']";
    }
    
    
}
