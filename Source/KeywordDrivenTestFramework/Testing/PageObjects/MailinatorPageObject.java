/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects;

import KeywordDrivenTestFramework.Core.BaseClass;
import static KeywordDrivenTestFramework.Core.BaseClass.currentEnvironment;

/**
 *
 * @author smnisi
 */
public class MailinatorPageObject extends BaseClass{
    
    public static String MailantorUrL() {
        return currentEnvironment.PageMailinatorlUrl;
    }
    
    public static String Searchbar()
    {
        return"//*[@id='inboxfield']";
    }
    
    
    public static String go()
    {
        return "//span/button";
    }
    
    
}
