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
public class LiveAndHistoricalTrackingAssetListWhileImpersonatingPageObjects {
   
    public static String ClickUser()
    {
        return "//li[@ng-repeat='item in module.items']/a[@href='#/user-admin/users']";
    }
    
    public static String usersPageLoadXpath()
    {
        return "//h5[@ui-if='!url']//span[@class='ng-binding']";
    }
    
    public static String SelectUser()
    {
        return "//a[@class='clickable-cell ng-scope']/span[text()='ImpersonateUser-DoNotDelete ImpUser']";
    }
    
    public static String ImpersonateUser()
    {
        return "//a[text()='Impersonate this user']";
    }
    
    public static String Filter()
    {
        return "//input[@ng-model=\"filterQuery\"]";
    }
    
    public static String LiveTrackValidation()
    {
        return "//span[text()='Live tracking']";
    }
    
    public static String NoItems()
    {
        return "//div[@class='tracking-search-container strong-grid mt-44']/div[@ng-class=\"{ 'no-vertical-scroll': noVerticalScroll }\"]/div[2]/span[text()='No items to display']";
    }
    
    public static String StopImpersonatingWait()
    {
        return "//span[text()='Stop impersonating']";
    }
    
    public static String HistoricalTrackingClick()
    {
        return "//li[@ng-repeat='item in module.items']/a[text()='Historical tracking']";
    }
    
    public static String AssetTripsRowCount()
    {
        return "//tr[@ng-class=\"{'success': asset.expanded, 'info': asset.track }\"]";
    }
  
    
    public static String LiveTrackingAssetRowCount()
    {
        return "//tbody[@fleet-draggable-group='draggable']/tr/td[@column-field='assetDescription']/..";
    }
    
    public static String DateClick()
    {
        return "//a[@fleet-tooltip='View dates']/div/span";
    }
    
    public static String DateAddOnButton()
    {
        return "//div[@class='ml-10 pull-left']/div/span/i";
    }
    
    public static String ClickYear()
    {
        return "//div[@class='datepicker-widget in']/div[@class='display']/div[@class='date']/div[@class='year ng-binding']";
    }
    
    public static String SelectYearOption2()
    {
        return "//div[@class='year ng-scope selected p0']/span[text()='2015']";
    }
    
    public static String SelectYearOption1()
    {
        return "//span[text()='2015']";
        //return "//div[@class="year ng-scope p1"]/span[text()='2015']";
    }
    
    public static String DoneButton()
    {
        return "//div[@class=\"datepicker-widget in\"]/div[3]/a";
    }
    
     public static String Save()
    {
        return "//a[@ng-click='save()']";
    }
     
     public static String AssetDescriptionHeadingWait()
     {
         return "//th/span[text()='Asset description']";
     }
     
     public static String AllheadingWait()
     {
         return "//div/ul/li/strong[text()='All']";
     }
     
     public static String LiveTracking()
     {
         return "//a[text()='Live tracking']";
     }
     
     public static String Spinner()
     {
         return "//div[@ui-if=\"leftPanel=='assetList'\"]/div[@style=\"display: none;\"]";
     }
     public static String HistoricalSpinner()
     {
         return "//div[@class='loading-overlay ng-scope'][@style='display: none;']";
     }
    
    public static String EventHeading()
    {
        return "//tr[@class='light-blue']/th/span[text()='Events']";
    }
    
    public static String OrgGroupWait()
    {
        return "//span[text()='Organisation group']";
    }
    
    public static String CalendarView()
    {
        return "//a[@fleet-tooltip='Calendar view']";
    }
    
    public static String userImpersonationModeXpath()
    {
        return "//div[@class='user-status btn-danger draggable ct drag-status ui-draggable']//span";
    }
}
