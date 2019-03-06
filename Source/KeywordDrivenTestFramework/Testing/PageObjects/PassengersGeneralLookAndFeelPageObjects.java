/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects;

/**
 *
 * @author apeter
 */
public class PassengersGeneralLookAndFeelPageObjects {
    public static String mainToolBarXpath(){
        return "//div[@class='toolbar']";
    }
    
    public static String pageNameXpath(){
        return "//div/h5/span";
    }
    
    public static String breadCrumbXpath(){
        return "//div[@class='miller-selector']";
    }
    
    public static String firstLeadingGroupXpath(){
        return "//div[@class='miller-selector']/a/span[contains(@ng-repeat,'Breadcrumbs')][1]/span[@class='text-overflow ng-binding']";
    }
    
    public static String secondLeadingGroupXpath(){
        return "//div[@class='miller-selector']/a/span[contains(@ng-repeat,'Breadcrumbs')][2]/span[@class='text-overflow ng-binding']";
    }
    
    public static String organisationGroupXpath(){
        return "//div[@class='miller-selector']/a/span[contains(@ng-repeat,'Breadcrumbs')][3]/span[@class='text-overflow ng-binding']";
    }
    
    public static String numberOfPassengersXpath(){
        return "//div/ul/li/span[@class='badge badge-grey ng-binding']";
    }
    
     public static String filterFieldXpath(){
        return "//div/form/div/input[@placeholder='Filter']";
    }
     
    public static String addNewTabXpath(){
        return "//div/span/a/i[@class='icon-plus icon-white']";
    }
    
    public static String columnSelectorButtonXpath(){
        return "//div/ul/li/a/i[@class='icon-choose-columns']";
    }
    
    public static String actionsButtonXpath(){
        return "//div[@column='rowActions' ]/div/a";
    }
    
    public static String numberOfPassengersOnTheLeftXpath(){
        return "//div/ul/li/a/span[@dmx-compile='item.count']";
    }
    
    public static String rowCountXpath(){
        return "//td/div/a/span";
    }
    
    public static String refreshButtonXpath(){
        return "//div/p/a/i";
    }
    
    public static String lastRefreshTimeXpath(){
        return "//div/p/span/span";
    }
    
    public static String removeSignXpath(){
        return "//div/button/i";
    }
    
    public static String filterSectionXpath(){
        return "//div[@class='page-header']";
    }
    
    public static String exportTabXpath(){
        return "//div/span/a/i[@class='icon-export']";
    }
    
    public static String importTabXpath(){
        return "//div/span/a/i[@class='icon-import']";
    }
    
    public static String downloadImportTabXpath(){
        return "//div/span/a/i[@class='icon-download-alt']";
    }
    
    public static String passengerNameColumnXpath(){
        return "//div/table/thead/tr/th[@column-field='name']";
    }
    
    public static String passengerIDColumnXpath(){
        return "//div/table/thead/tr/th[@column-field='fmPassengerId']";
    }
    
    public static String selectedPassengerNameXpath(){
        return "//div/table/tbody/tr/td/div/a";
    }
    
    public static String cancelButtonXpath(){
        return "//div/button[@text='Cancel']";
    }
    
    public static String hidePanelButtonXpath(){
        return "//div/a/i[@class='icon-white icon-chevron-left']";
    }
    
    public static String showPanelButtonXpath(){
        return "//div/a/i[@class='icon-white icon-chevron-right']";
    }
    
    public static String passengerIDFromColumnSelector(){
        return "//ul[@class='dropdown-menu pull-right column-chooser-dropdown'] [contains(@style,'block')]/li//a//span[text()='Passenger ID']";
    }
    
    public static String mobileNumberFromColumnSelector(){
        return "//ul[@class='dropdown-menu pull-right column-chooser-dropdown'] [contains(@style,'block')]/li//a//span[text()='Mobile number']/..";
    }
    
    public static String emailAddressFromColumnSelector(){
        return "//ul[@class='dropdown-menu pull-right column-chooser-dropdown'] [contains(@style,'block')]/li//a//span[text()='Email address']/..";
    }
      public static String PassengersHeaderLabelRelativeXpathText(){
        return "//h5/span[text()='Passengers']";
    }
      
    public static String lastPassengerXpath(){
        return "//div[@ng-show='rowActions']/ul/li[contains(@class,'ng-scope last')]";
    }
    
    public static String firstPassengerXpath(){
        return "//tr[1]";
    }
    
    public static String passengerLoadingSpinnerXpath(){
        return "//table/../div[@class=\"loading-overlay ng-scope\" and @style='display: none;']";
    }
    
    
}