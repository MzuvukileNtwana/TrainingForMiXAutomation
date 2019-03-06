/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects.Monitor.HoursOfService.OrganisationGroups;

/**
 *
 * @author rcornelius
 */
public class AddNewSiteUsingTheDefaultSiteDetailsForHOSReportsPageObjects {
    
    public static String SpinnerInOrganisationGroups()
    {
        return "//div[@class='tree-wrapper']/div[@style='display: none;'][@class='loading-overlay ng-scope']";
    }

     public static String EditButton()
    {
        return "//i[@class='icon-edit']";
    }
     
     public static String AddButton()
    {
        return "//i[@class='icon-plus icon-white']";
    }
     
     public static String DropDown()
    {
        return "//ul[@class='dropdown-menu pull-right']";
    }

     public static String SiteInDrop()
    {
        return "//a[@ng-click='addSite()']";
    }
     
     public static String GeneralTabClick()
    {
        return "//a[text()='General']";
    }
     
     public static String SiteName()
    {
        return "//input[@name='siteName']";
    }
     
     public static String WorkerIDrangesCheckbox()
    {
        return "//input[@type='checkbox'][@name='workerSiteRangeEnabled']";
    }
     
     public static String WorkerIDFromTextBox()
    {
        return "//input[@name='workerSiteRangeFrom']";
    }
     
     public static String WorkerIDToTextBox()
    {
        return "//input[@name='workerSiteRangeTo']";
    }
     
     public static String HOSMenuTab()
    {
        return "//div[@style='display: none;']//a[@class='ng-binding'][text()='HOS']";
    }
     public static String HOSMenuTabClick()
    {
        return "//a[text()='HOS']";
    }
     
     public static String ReportNameTextField()
    {
        return "//input[@name='reportOrganisationName'][1]";
    }
     
     public static String CancelButton()
    {
        return "//button[@class='btn ng-scope ng-binding btn-wide']";
    }
     
     public static String Organisation(String name)
    {
        return "//div[@style='display: none;']//span[text()='"+ name +"']";
    }
    
    public static String ReportOrganisationName()
    {
        return "//input[@name='reportOrganisationName'][@disabled='disabled']";
    }
    
    public static String ReportOrganisationAddress()
    {
        return "//textarea[@name='reportOrganisationAddress'][@disabled='disabled']";
    }
    
    public static String ReportOrganisationNameLabel()
    {
        return "//span[text()='Report Organisation Name']";
    }
    
    public static String ReportOrganisationAddressLabel()
    {
        return "//span[text()='Report Organisation Address']";
    }
    
     public static String Checkbox()
    {
        return"//div/div/label/input[@type='checkbox']";
        //return "//div[@class='well well-white']/div[7]/label/input[@type='checkbox']";
    }
      
      public static String SaveEnabledCheck()
    {
        return "//button[text()='Save'][@disabled='disabled']";
    }
      
      public static String SaveClick()
    {
        return "//button[text()='Save']";
    }
      
       public static String SavePopup()
    {
        return "//span[@id='pop-alert-message'] ";
    }
       
      public static String SaveMessage ()
    {
        return "//span[text()='Site created successfully']";
    }
    
    //****************************GENERATE REPORT****************************//
    
      public static String SpinnerInReports ()
    {
        return "//div[@class='loading-overlay ng-scope'][@ng-show='contentLoadingStack && contentLoadingStack.length > 0'][@style='display: none;']";
    }
      
      public static String SpinnerInHOSReports ()
    {
        return "//span//div[@class='loading-overlay'][@style='display: none;']";
    }
      
      public static String SelectCategoryDropDown ()
    {
        return "//select[@class='span12 mb-10 ng-pristine ng-valid']";
    }
      
      public static String OptionInDropDown ()
    {
        return "//option[@value='9'][text()='Hours Of Service Reports']";
    }
      
      public static String HOSReport ()
    {
        return "//span[text()='Hours of Service Report']";
    }
      
      public static String SelectReportDropDown ()
    {
        return "//span[@class='report-parameter']/span/div/div[2]/select";
    }
      
      public static String OptionInSelectReportDropDown ()
    {
        return "//span[@class='report-parameter']/span/div/div[2]/select/option[text()='Site by Driver']";
    }
      
    public static String CreatedSite()
    {
        return "//span[text()='Do_Not_Delete_AddedTestSite2']";
    }  
      
    public static String CheckboxInReport()
    {
        return "//div[@class='well well-white']/div[3]/label/span[text()='Do_Not_Delete_AddedTestSite2']";
    }  
 
    public static String NextButton()
    {
        return "//button[@text='Next']";
    }  
 
    public static String SelectPeriodDropDown()
    {
        return "//div[@class='row-fluid']/select";
    }  
 
    public static String TodayInSelectPeriod()
    {
        return "//div[@class='row-fluid']/select/option[text()='Today']";
    }  
 
    public static String RunButton()
    {
        return "//button[text()='Run']";
    }  
    
    
    public static String ReportLoader()
    {
        return "//span[@class='WaitText'][text()='Loading...']";
    }  
    public static String HoursOfServiceHeader()
    {
        return "//span[text()='Hours of Service Report']";
    }  
 
    public static String NameOfReport()
    {
        return "//span[text()='DVT Automation']";
    }  
    
    public static String AddressOfReport()
    {
        return "//span[text()='C/o Strand street, Cape Town']";
    }  
 
    public static String iFrame()
    {
        return "ssrsFrame";
    }  
 
    public static String InneriFrame()
    {
        return "//iframe[@id='ReportViewerControl_ctl04_ctl05_ctl01']";
    }  
 
    public static String InneriFrame2()
    {
        return "//iframe[@id='ReportViewerControl_ctl04_ctl07_ctl01']";
    }  
    
     public static String Done()
    {
        return "//button[text()='Done']";
    }  
     //[@ng-class='buttonClass()']
    
     public static String Back()
    {
        return "//button[@ng-class='buttonClass()'][text()='Back']";
    }  
    
    public static String Cancel()
    {
        return "//button[@ng-class='buttonClass()'][text()='Cancel']";
    }  
    
    public static String No()
    {
        return "//button[text()='No']";
    }  
    
     public static String DiscardChangesPopup()
    {
        return "//button[text()='Yes']";
    }  
    
     public static String YesButton()
    {
        return "//button[text()='Yes']";
    }  
    
    public static String DeleteCreatedSite()
    {
        return "//span[text()='Do_Not_Delete_AddedTestSite2 (AFT)']";
    }  
    
    public static String DeleteIcon()
    {
        return "//span[text()='Do_Not_Delete_AddedTestSite2 (AFT)']/../a[@class='delete']";
    }  
    
    public static String DeletePopUp()
    {
        return "//div[@class='background-image-container']";
    }  
    
    public static String DeleteButton()
    {
        return "//button[text()='Delete']";
    }  
    
}