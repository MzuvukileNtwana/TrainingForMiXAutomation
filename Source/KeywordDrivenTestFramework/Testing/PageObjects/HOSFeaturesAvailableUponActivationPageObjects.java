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
public class HOSFeaturesAvailableUponActivationPageObjects {
   
    public static String TripTimelineSpinner()
    {
        return "//div[@ng-show='$controller.isLoading'][@style='display: none;']";
    }
    
    public static String DatabaseAdminSpinner()
    {
        return "//div[@class='tab-pane active ng-scope']/div[@style='display: none;'][@class='loading-overlay ng-scope']";
    }  
    
    
    public static String HeadingWait()
    {
        return "//h5[text()='Organisation details']";
    }  
    
    public static String TripInformationButton()
    {
        return "//a[@fleet-tooltip='Trip information'][@style='display: none;']";
    }
    
    public static String TripInformationClick()
    {
        return "//a[@fleet-tooltip='Trip information']";
    }
    
    public static String ExpandDVTOnly()
    {
        return "//strong[text()='-= DVT  Only =-']/../../../../span";
    }
    
    public static String OrganisationSelection()
    {
        return "//strong[text()='GHOS Canada (DVT)']";
    }
   
    public static String HoursOfServiceCheckbox()
    {
        return "//span[text()='Hours of Service']/../input";
    }
    
    public static String SaveButton()
    {
        return "//button[text()='Save']";
    }
    
    public static String DriverSpinner()
    {
        return "//div[@class='loading-overlay ng-scope'][@style='display: none;']";
    }
    
    public static String AllHeading()
    {
        return "//strong[text()='All']";
    }
    
    public static String Filter()
    {
        return "//div[@class='pull-right']/div/input[@ng-model='$directive.filterText']";
    }
    
    public static String FilterSearchButton()
    {
        return "//div[@class='pull-right']/div/a/i[@class='icon-search']";
    }
    
    public static String DriverSelect(String name)
    {
        return "//a[text()='"+name+"']";
    }
    
    public static String SavePopUp()
    {
        return "//div[@class='notification-wrapper notification-modal ng-scope'][@style='display: none;']";
    }
    
    public static String TripData()
    {
        return "//span[text()='Tacho availability']";
    }
    
    public static String startDateCheck()
    {
        return "//div/strong[text()='Start date']";
    }
    
    public static String EnabledCheck()
    {
        return "//a[@fleet-tooltip='Trip information'][@disabled='disabled']";
    }
    
    public static String DateInput()
    {
        return "//div[@class='pull-left datepicker ng-pristine ng-valid']/input";
    }
    
    public static String ClickOffToDisplayDate()
    {
        return "//button[text()='24h']";
    }
    
}
