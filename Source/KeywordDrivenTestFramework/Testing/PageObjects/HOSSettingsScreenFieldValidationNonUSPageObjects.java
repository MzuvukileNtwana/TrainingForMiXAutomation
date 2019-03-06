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
public class HOSSettingsScreenFieldValidationNonUSPageObjects {
    
    public static String SaveButtonClick()
    {
        return "//button[text()='Save']";
    }
     
    public static String HOSspecificFields(String label)
    {
        return "//span[text()='"+label+"']/../span[text()='*']";
    }
     //span[text()='HOS password']/../..//input  
    public static String mandatoryFieldNonUS()
    {
        return "//span[text()='Hours of service rule set']/../span[text()='*']";
    }
    
    public static String SavedPopUp()
    {
        return "//span[text()='Driver updated successfully']/../../../div[@class='notification-wrapper notification-modal ng-scope'][@style='display: none;']";
    }
    
    public static String SavedBanner()
    {
        return "//span[text()='Driver updated successfully']";
    }
    
    public static String PopUpDisplay()
    {
        return "//div[@class=\"notification notification-placement notification-success\"]/span[@class=\"ng-binding\"]";
    }
    
    public static String DriverHeading()
    {
        return "//h5/a[text()='Drivers']";
    }
    
    public static String HOSDriverTab()
    {
        return "//span[text()='HOS drivers']";
    }
    
    public static String breadcrumbClick()
    {
        return "//div[@ng-show=\"type == 'miller'\"]";
    }
    
    public static String OrganisationSelect(String name)
    {
        return "//a[@ng-repeat=\"item in column.items | orderBy:'name'\"]/span[text()='"+name+"']";
    }
    
    public static String BreadcrumbSelection(String name)
    {
        return "//a[@ng-repeat='item in items']/span[text()='"+name+"']";
    }
    
    public static String SelectButton()
    {
        return "//div[@class=\"miller-selector-modal-container white-box-shadow ng-scope in\"]//a[text()='Select']";
    }
    
    public static String Filter()
    {
        return "//input[@ng-model='$directive.filterText']";
    }
    
    public static String FilterButton()
    {
        return "//i[@class='icon-search']";
    }
    
    public static String HOSDriver()
    {
        return "//span[text()='HOS Driver -  55004E6ED8']";
    }
   
}
