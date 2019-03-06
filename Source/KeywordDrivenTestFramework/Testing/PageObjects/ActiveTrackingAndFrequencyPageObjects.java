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
public class ActiveTrackingAndFrequencyPageObjects {
    
    
    public static String TabValidations(String name)
    {
        return "//a[text()='"+name+"']";
    }
    
    public static String CancelButton()
    {
        return "//button[text()='Cancel']";
    }
    
    public static String SaveDisabled()
    {
        return "//button[text()='Save'][@disabled='disabled']";
    }
    
    public static String TrackingOptions()
    {
        return "//h5[text()='Tracking options']";
    }
    
    public static String ActiveTrackingSeconds()
    {
        return "//span[text()='When initiating active tracking, increase the position frequency to every']/../input";
    }
    
     public static String ActiveTrackingMinutes()
    {
        return "//input[@ng-model='dataForm.activeTrackingDuration']";
    }
     
    public static String ActiveTrackingSecondsViaSatellite()
    {
        return "//span[text()='When initiating active tracking (via Satellite), increase the position frequency to every']/../input";
    }
     
    public static String ActiveTrackingMinutesViaSatellite()
    {
        return "//input[@ng-model='dataForm.activeTrackingSatDuration']";
    }
    
    
    
    
     
     
     
}
