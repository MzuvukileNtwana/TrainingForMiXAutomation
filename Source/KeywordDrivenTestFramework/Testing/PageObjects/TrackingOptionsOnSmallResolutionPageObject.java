/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects;

/**
 *
 * @author lmgulwa
 */
public class TrackingOptionsOnSmallResolutionPageObject {
    
    public static String selectedOrgXpath(String org)
    {
        return "//div[@class='organisation-selector']/div[@class='miller-selector']//span[text()='" + org + "']";
    }
    
    public static String spinnerXpath()
    {
        return "//div[@id='MainView']//div[contains(@class, 'loading-overlay')][@style='display: none;']";
    }
    
    public static String screenHeaderXpath(String org)
    {
        return "//div[@class='page-header']/h5/span[not(text()='" + org + "')]";
    }
    
    public static String orgNameSettingsEditedXpath(String org)
    {
        return "//div[@class='page-header']/h5/span[text()='" + org + "']";
    }
    
    public static String trackingOptionsTabLinkXpath()
    {
        return "//a[text()='Tracking options']";
    }
    
    public static String tabsXpath()
    {
        return "//div[contains(@class, 'tabbable')]//ul/li";
    }
    
    public static String tabsXpath(int i)
    {
        return "//div[contains(@class, 'tabbable')]//ul/li[" + i + "]/a";
    } 
    
    public static String trackingOptionsHeaderXpath()
    {
        return "//form[@name='trackingOptionsForm']/h5[text()='Tracking options']";
    }
    
    public static String cancelButtonXpath()
    {
        return "//button[text()='Cancel']";
    }
    
    public static String saveButtonXpath()
    {
        return "//button[text()='Save']";
    }
    
    public static String filterPositionHeaderXpath()
    {
        return "//h6[text()='Filter Positions']";
    }
    
    public static String activeTrackingFrequencyDurationXpath()
    {
        return "//h6[text()='Active tracking frequency and duration']";
    }
    
    public static String initiatingActiveTrackingTextXpath()
    {
        return "//span[text()='When initiating active tracking, increase the position frequency to every']";
    }
    
    public static String secondsForFieldXpath()
    {
        return "//span[text()='seconds for']/../input";
    }
    
    public static String minutesFiledXpath()
    {
        return "//h6[text()='Active tracking frequency and duration']/../span[text()='minutes.']/../input";
    }
    
    public static String activeTrackingFrequencyDurationViaSatelliteXpath()
    {
        return "//h6[text()='Active tracking frequency and duration (via Satellite)']";
    }
    
    public static String initiatingActiveTrackingViaSatelliteTextXpath()
    {
        return "//span[text()='When initiating active tracking (via Satellite), increase the position frequency to every']";
    }
    
    public static String minutesForFieldXpath()
    {
        return "//span[text()='minutes for']/../input";
    }
    
    public static String minutesViaSatelliteFiledXpath()
    {
        return "//h6[text()='Active tracking frequency and duration (via Satellite)']/../span[text()='minutes.']/../input";
    }
}
