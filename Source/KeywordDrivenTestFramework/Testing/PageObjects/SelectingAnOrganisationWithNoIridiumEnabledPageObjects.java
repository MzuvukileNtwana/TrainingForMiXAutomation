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
public class SelectingAnOrganisationWithNoIridiumEnabledPageObjects extends BaseClass
{
    public static String airtimeMessage()
    {
//        return "//h3[text()='This organisation does not make use of Airtime management.']";
        return "//div//h4[text()='To enable this feature, please contact your administrator.']/..";
    }
    
    public static String administratorMessage()
    {
        return "//h4[text()='To enable this feature, please contact your administrator.']";
    }
    public static String headerXpath(String name)
    {
        return "//h5//span[text()='"+name+"']";
    }
    


}
