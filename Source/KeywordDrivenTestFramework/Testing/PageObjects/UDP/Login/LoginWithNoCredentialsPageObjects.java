/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects.UDP.Login;

/**
 *
 * @author lpooe
 */
public class LoginWithNoCredentialsPageObjects 
{
        //---------- xpath ----------//
      
    //xpath for username and password textfield
    // username:  //input[@name='userName']
    //password: //input[@name='password']
    public static String InputUsernamePassword(String usernamePassword)
    {
        return "//input[@name='"+usernamePassword+"']";
    }
    
    //xpath that displays 'This field is required' message under username and password
    //input[@name='userName']//..//span
    public static String DivWithMessage(String text)
    {
        return "//input[@name='"+text+"']//..//span";
    }   
    
    //xpath for the save button
    //button[@class='btn ng-binding btn-success']
    public static String SaveButton()
    {
        return "//button[@class='btn ng-binding btn-success']";
    }
    
}
