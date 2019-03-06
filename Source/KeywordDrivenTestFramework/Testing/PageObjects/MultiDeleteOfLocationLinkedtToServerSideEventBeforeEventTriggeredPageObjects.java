/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects;

/**
 *
 * @author sscholtz
 */
public class MultiDeleteOfLocationLinkedtToServerSideEventBeforeEventTriggeredPageObjects {
    
    
    public static String LocationName()
    {
        return "//input[@dmx-validate='description']";
    }
    
    public static String SaveButton()
    {
        return "//button[@text='Save']";
    }
    
    public static String Site()
    {
        return "//select[@ng-model='currentLocation.siteId']";
    }
    
    public static String SiteOption()
    {
        return "//select[@ng-model='currentLocation.siteId']/option[text()='All sites']";
    }
}
