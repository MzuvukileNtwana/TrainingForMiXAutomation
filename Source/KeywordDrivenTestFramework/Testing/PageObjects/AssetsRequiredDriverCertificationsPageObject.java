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
public class AssetsRequiredDriverCertificationsPageObject {
    
     
      
    public static String requiredDriverCertificatesXpath()
    {
        return "//a[text()='Required driver certificates']";
    }
    public static String addCertificationXpath()
    {
        return "//button[text()='Add certification']";
    }
    public static String certificationTypeXpath()
    {
        return "//label/span[text()='Certification type']/../../select";
    }
    public static String btnSaveXpath()
    {
        return "//button[text()='Save']";
    }
    public static String certificationTypesTabXpath()
    {
        return "//a[text()='Certification types']";
    }
     public static String DriverDetailsXpath()
    {
        return "//a[text()='Driver details']";
    }
    
    public static String certificationType()
    {
        return "//span[text()='Certification type']";
    }
    public static String necessityXpath()
    {
        return "//th[@class='column-heading  sortable ui-draggable']/span[text()='Necessity']";
    }
    public static String validityXpath()
    {
        return "//th[@class='column-heading  last sortable ui-draggable']/span[text()='Validity']";
    }
    public static String btnAddTypeXpath()
    {
        return "//button[text()='Add type']";
    }
    public static String inputFieldCertificationName()
    {
        return "//span[text()='Certification name']/../../input";
    }
    public static String inputFieldValidityPeriodXpath()
    {
        return "//span[text()='Validity period']/../../div/input";
    }
    public static String inputFieldReminderPeriodXpath()
    {
        return "//span[text()='week(s)']/../../div/input";
    }
    public static String checkBoxXpath()
    {
        return "//span[text()='This is a mandatory certification. If it has expired, a driver may not drive. This will ']/../input";
    }
    public static String btnCertificationSaveXpath()
    {
        return "//span[text()='This is a mandatory certification. If it has expired, a driver may not drive. This will ']/../../../../../../../../div[@class='modal-footer']/button[@class='btn ng-scope ng-binding btn-success btn-wide']";
    }
    public static String certificationUpdatedSuccessfullyXpath()
    {
        return "//span[text()='Certification updated successfully']";
    }
    
    public static String AddCertificationDisabledXpath()
    {
        return "//button[@class='btn ng-binding btn-small btn-success pull-right'][@disabled='disabled']";
    }
       public static String clickCertificationTypeXpath()
    {
        return "//li/a[@ng-click='tabClicked(tab)'][text()='Certification types']";
    }  
    
  public static String CertificationTypesXpath()
    {
        return "//li/a[text()= 'Certification types']";
    } 
  public static String RequiredDriverCertificatesXpath()
    {
        return "//li/a[text()= 'Required driver certificates']";
    } 
  public static String AddCertificationTypeXpath()
    {
        return "//span[text()='Add certification type']";
    } 
   public static String selectCertificationXpath()
    {
        return "//a[text()='Certification types']/../../li/a";
    } 
   public static String CertificationTypeTabXpath()
    {
        return "//th[@class='column-heading  first sortable active ui-draggable']/span[text()='Certification type']";
    } 
   public static String AddTypeXpath()
    {
        return "//button[@class='btn ng-binding btn-small btn-success pull-right'][text()='Add type']";
    } 
    public static String CertificationNameXpath()
    {
        return " //label/span[text()='Certification type']/../../select/option[@value='0']";
    } 
    public static String CertificationTypeCreatedSuccessfullyXpath()
    {
        return "//span[text()='Certification type created successfully']";
    } 
      public static String CertificationNameIsInUseXpath()
    {
        return "//span[text()='Certification name is already in use']";
    } 
        public static String inUsedValidatorXpath()
    {
        return "//form[@class='ng-scope ng-invalid ng-invalid-dmx-required ng-dirty ng-valid-dmx-maxlength ng-invalid-fleet-driver-certification-type-name-unique-async']";
    } 
  public static String CancelXpath(){
      return"//button[text()='Cancel']";
  }
   public static String AssetDetailsXpath(){
      return"//h5[text()= 'Asset details']" ;
  }
   public static String AvailableXpath(){
      return"//span[text()='Available']" ;
  }
    public static String clickCancelXpath(){
      return"//button[text()='Cancel'][@class='btn ng-scope ng-binding']" ;
  }
     public static String EditDriverXpath(){
      return"//span[text()='Edit driver']" ;
  }
     public static String ActionButtontoRemoveCertificateXpath()
    {
        return "//button[text()='Add certification']//..//../div[@class='row-fluid']/div/div/div/div/div[@ng-show='rowActions']/ul/li[2]/div/div/a";
    }
      public static String removeCertificateXpath()
    {
        return "//button[text()='Add certification']//..//../div[4]/div/div/div/div/table/tbody/tr/../../../div[@class='center-text mt-5']/a/../../div[@ng-show='rowActions']/../../../../../../../../../../../../../../../../../../../../../ul[@class='dropdown-menu pull-right'][contains(@style,'block')][contains(@style,'block')]/li[2]/a/span[text()='Remove']";
    }
    public static String removeButtonXpath()
    {
        return "//p[text()='Are you sure you want to remove this certification?']/../../../../../div[@class='modal-footer']/button[text()='Remove']";
    }
    public static String removePopUpXpath()
    {
        return "//div[@class='notification-wrapper notification-modal ng-scope']/div/span[text()='Certification removed successfully']";
    }
    public static String waitAddCertificationXpath()
    {
        return "//button[@class='btn ng-binding btn-small btn-success pull-right'][text()='Add certification']";
    } 
     public static String redIconXpath()
    {
        return "//button[text()='Add certification']/../../../div/i[@class='icon-exclamation-sign icon-red']";
    } 
      public static String ExpiryDateXpath(String StrCertificationName)
    {
        return "//span[text()='"+StrCertificationName+"']/../../../td[5]/div/span";
    } 
       public static String statusXpath(String StrCertificationName)
    {
        return "//span[text()='"+StrCertificationName+"']/../../../td[6]/div/span";
    } 
     public static String CertificationStatusXpath()
    {
        return "//span[text()='Certification status: ']/Strong";
    } 


}