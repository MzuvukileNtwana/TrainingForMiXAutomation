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
public class DataCentreAdministrationShouldBeAvailablePageObjects {
    
    public static String SelectBreadcrumb()
    {
        return "//a[@ng-click=\"$broadcast('openOrganisationSelectionMiller')\"]";
    }
    
    
    public static String SelectTestRSO()
    {
        return "//div[@class=\"column ps-container\"]//span[text()='Test RSO']";
    }
    
    public static String SelectButton()
    {
        return "//div[@class=\"miller-selector-modal-container white-box-shadow ng-scope in\"]/div/div/a[text()='Select']";
    }
    
    public static String IMEITab()
    {
        return "//a[text()='IMEI Search']";
    }

    public static String IMEIHeading()
    {
        return "//h5[text()='IMEI search']";
    }
    
    public static String SearchBox()
    {
        return "//input[@ng-model='imeiNumber']";
    }
    
    public static String SearchButton()
    {
        return "//button[text()='Search'][@disabled='disabled']";
    }
   
}
