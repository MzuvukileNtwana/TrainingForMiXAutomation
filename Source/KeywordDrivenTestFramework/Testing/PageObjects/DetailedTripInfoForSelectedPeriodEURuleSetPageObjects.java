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
public class DetailedTripInfoForSelectedPeriodEURuleSetPageObjects {
    
    public static String DateEntry()
    {
        return "//div[@class='form-inline pull-left']//input[@type='text']";
    }
    
    public static String ClickOff24h()
    {
        return "//button[text()='24h']";
    }
    
    public static String EUWorkstates(String Workstates)
    {
        return "//span[@class='hos-workstate-label ng-scope']/span[text()='"+Workstates+"']";
    }
    
    public static String DetailedTripDateCheck()
    {
        return "//pre[contains(text(),'from 2016-01-27')][contains(text(),'until 2016-01-28')]";
    }
    
    public static String DetailedTripWorkstateCheck()
    {
        return "//pre[contains(text(),'Passive work')][contains(text(),'Resting')][contains(text(),'Active work')]";
    }
    
      public static String DetailedTripRestingCheck()
    {
        return "//pre[contains(text(),'Resting')]";
    }
    
      
      public static String ScrollBar()
      {
          return "//div[@class='span12 bottom-content']";
      }
    
    
 
    
}
