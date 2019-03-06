/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects.Monitor.HoursOfService.LogViewer;

import KeywordDrivenTestFramework.Core.BaseClass;

/**
 *
 * @author smbiko
 */
public class ValidationOfOdoValuePageObjects extends BaseClass
{
    public static String changeOdoLinkStatusXpath()
    {
        return "//span/a[text()='Change odo'][@style='display: none;']";
    }
    public static String noReadingTextXpath()
    {
        return "//input[@placeholder='No reading']";
    }
    public static String saveButtonStatusXpath()
    {
        return "//button[text()='Save']";
    }
    public static String fieldMustBeNumericXpath()
    {
        return "//span[text()='Field must be numeric']/..";
    }
    public static String abcTextXpath()
    {
        return "//input[@placeholder='No reading']/../span[1]";
    }
    public static String fieldValueRangeValidationMessageXpath()
    {
        return "//span[text()='Field value must be between 80553.02 and 4294967295.00']";
    }
    public static String clickOutsideTheTextboxXpath()
    {
        return "//form/table/tbody/tr[5]/td[2]";
    }
    
     public static String saveButtonEnabledStatusXpath()
    {
        return "//button[text()='Save']";
    }
      public static String checkMessagesNotThereXpath()
    {
        return "//div[@class='modal hide fade modal-medium in']//div[@class='modal-body']/div/div/div/form/table/tbody/tr[6]/td[2]/span/input[@class='ng-dirty ng-valid ng-valid-dmx-range']";
    }
    
 
    
}
