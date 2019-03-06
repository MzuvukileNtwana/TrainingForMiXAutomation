/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects;

/**
 *
 * @author arala
 */
public class AddDriverPageObjects {
    
      public static String ButtonAddDriverXpath()
      {
          return "//a[@fleet-tooltip='Add driver']";
      }
      
      public static String NameGridColumnXpath()
      {
          return "//div/div[@class='column']/div/span[@class='title'][text()='Name']";
      }
      
      public static String DriverHeading()
      {
          return "//span[text()='Drivers']";
      }
      
      //Table Loading Spinner
    public static String TableLoadingSpinnerXpath() {
        return "//div[@class='loading-overlay'][@style='display: none;']";
    }
    
    public static String AssetGridTableLoadingSpinnerXpath() {
        return "//div[@name=\"assetListGrid\"]/div[@class='loading-overlay'][@style='display: none;']";
    }
    
    public static String spinnerXpath()
    {
        return "//div[@class='tree-wrapper']/div[@class='loading-overlay ng-scope'][@style='display: none;']";
    }
    
    public static String PSG_grid_Spinner()
    {
        return "//ul/div[@class='loading-overlay ng-scope'][@style='display: none;']";
    }
    public static String PSGLAndingPageSpinner()
    {
        return "//div[@class='loading-overlay ng-scope'][@style='display: none;']";
    }
    
    
    public static String ImportFuelSpinnerXpath()
    {
        return "//div[@ng-show='form'][@style='display: none;']";
    }
      
     public static String DriverSubMenuRelativeXpath(String linkText) 
     {
        return "//a[text()='"+linkText+"']";
     }
      
      public static String DriverPageNameXpath()
      {
          return "//div/h5/span[text()='Drivers']";
      }
      
      public static String DriverLinkPageNameXpath()
      {
          //return "//div/h5/a[text()='Driver details']";
          //return "//div//a[text()='Driver details']";
          return "//div/h5/a[text()='Drivers']";
      }
      
      public static String CreateNewDriverLabelXpath()
      {
          return "//div/h5/span[text()='Create new driver']";
      }
      
      public static String ddlOptionSelectSiteXpath()
      {
          return "//div/div/label/span[text()='Site']/../../select/option[text()='Select site']";
      }
      
      public static String ddlSelectSiteXpath()
      {
          return "//div/div/label/span[text()='Site']/../../select";
      }
      
      public static String HourServiceRuleXpath()
      {
          return "//select[@name='ruleId']";
      }
      
      public static String NameInputFieldXpath()
      {
          return "//div/div/label/span[text()='Name']/../../input";
      }
      
      public static String MobileNumberInputFieldXpath()
      {
          return "//div/div/label/span[text()='Mobile number']/../../input";
      }
      
      public static String DriverIDInputFieldXpath()
      {
          return "//div/div/label/span[text()='Driver ID - Blue tag']/../../input";
      }
      
      public static String EmployeeNoInputFieldXpath()
      {
          return "//div/div/label/span[text()='Employee number']/../../input";
      }
      
      public static String EmailAddressInputFieldXpath()
      {
          return "//div/div/label/span[text()='Email address']/../../input";
      }
      
      public static String ddlSelectCountryXpath()
      {
          return "//div/div/label/span[text()='Country']/../../select";
      }
      
      public static String buttonSaveXpath()
      {
          return "//div[@class='page-header']/div/div/button[text()='Save']";
      }
      
      public static String buttonCancelXpath()
      {
          return "//div[@class='page-header']/div/div/button[text()='Cancel']";
      }
      
      public static String notificationSuccessfullSaveXpath()
      {
          return "//div[@class='notification notification-placement notification-success']/span[text()='Driver updated successfully']";
      }
      
      public static String GetDriverColumnNameValueByXpath(String DriverName)
      {
          return "//div[@class='column']/div/a[contains(@class,'cell')][text()='"+DriverName+"'][@row-index='1']";
      }
      
      public static String GetDriverColumnName2ValueByXpath()
      {
          return "//div[@class='column']/div/a[contains(@class,'cell')][@row-index='0']";
      }
      
      public static String ColumnChooser()
    {
        return "//div[@class='column-heading sortable']/span[@class='title']/a[@class='btn btn-small column-chooser']/i[@class='icon-choose-columns']";
    }
      
      public static String TabExtendedDriverIdXpath()
      {
          return "//div[@class='tab-menu-left pull-left full-height']/div/ul/li/a[text()='Extended driver ID']";
      }
      
      public static String TabDriverDetailsXpath()
      {
          return "//div[@class='tab-menu-left pull-left full-height']/div/ul/li/a[text()='Driver details']";
      }
      
      public static String TabAccessControlXpath()
      {
          return "//div[@class='tab-menu-left pull-left full-height']/div/ul/li/a[text()='Access control']";
      }
      
      public static String TabMyMiXXpath()
      {
          return "//div[@class='tab-menu-left pull-left full-height']/div/ul/li/a[text()='MyMiX']";
      }
      
      public static String TabLicencesXpath()
      {
          return "//div[@class='tab-menu-left pull-left full-height']/div/ul/li/a[text()='Licences']";
      }
      
      public static String TabHoursOfServicesXpath()
      {
          return "//div[@class='tab-menu-left pull-left full-height']/div/ul/li/a[text()='Hours of service']";
      }
      
      public static String TabMyMiX_Xpath()
      {
          return "//div[@class='tab-menu-left pull-left full-height']/div/ul/li/a[text()='MyMiX']";
      }
      
      public static String TabCertificationXpath()
      {
          return "//div[@class='tab-menu-left pull-left full-height']/div/ul/li/a[text()='Certifications']";
      }
      
      public static String getDriverIdByXpath()
      {
          return "//div[@class='well well-small']/h5/../p";
      }
      
      public static String SearchFilterInputFieldXpath()
      {
          return "//div[@class='page-header']/div[@class='pull-right']/div[@provider='$controller.dataProvider']/input";
      }
      
      
      public static String DriverListGridXpath()
      {
          return "//div[contains(@name,'driverListGrid')]";
      }
      
      public static String ButtonExportDriversXpath()
      {
          return "//button[contains(@fleet-tooltip,'Export drivers')]";
      }
      
      public static String EmployeeNumberColumnXpath()
      {
          return "//div/span[contains(text(),'Employee number')]";
      }
      
      public static String ExtendedDriverIDColumnXpath()
      {
          return "//div/span[contains(text(),'Extended Driver ID')]";
      }
      
      public static String ColumnChooserEmployeeNumberXpath()
      {
          return "//ul[contains(@style,'display: block')]/li/a[contains(@column-field,'employeeNumber')]/span[contains(text(),'Employee number')]";
      }
      
      public static String movetColumnEmployee()
      {
          return "//div/span[contains(text(),'Employee number')]/../..";
      }
      
      public static String moveColumnExtendedId()
      {
          return "//div/span[contains(text(),'Extended Driver ID')]/../..";
      }
      
      public static String DriverIDColumnXpath()
      {
          return "//div/span[text()='Driver ID']/..";        
      }
      public static String NumberOfAssetByXpath()
      {
          return "//div[@class='page-header']//li/span";        
      }
      
      //**********************  Sikuli   ***************************************************
      
      public static String OpenExportedFileImg()
      {
          return "OpenExportedFile.PNG";
      }
      
      public static String MinimizeExportedFileImg()
      {
          return "MinimizeAndCloseFile.PNG";
      }
}     


