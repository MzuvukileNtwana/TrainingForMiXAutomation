/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects;
/**
 *
 * @author kmanakaza
 */
public class GSMAddNewObjects 
{
    //Table Loading Spinner
    public static String TableLoadingSpinnerXpath()
    {
    return "//div[@class='loading-overlay'][@style='display: none;'][@ng-show='$grid.isLoading']";
    }
    
    //Validate Asset Description page
    public static String AssetDescriptionToValidateRelatieXpath()     
    {        
        return "//div/span[text()='Asset description']";
    }
    
    //Add asset button
    public static String AddAssetsButtonXpath() 
    {
        return "//div[@class='page-header']/div/a[@fleet-tooltip='Add asset']";
    } 
    //Message for registration number already in use
    public static String RegistrationNumberAlreadyInUse()
    {
      return "//span[text()='Registration number already in use']";
    }
    //Input text field for registration Number
    public static String RegistrationNumberXpath() 
    {
       return "//span[text()='Registration number']/../../input";
    }
    //Input text field for descrition
    public static String AssetsdescriptionXpath() 
     {
        return "//input[@name='description']";
     } 
     //Configuration group dropdown list
     public static String ConfigurationGroupXpath() 
     {
        return "//span[text()='Configuration group']/../../select";
     }
     //Asset type dropdown list
     public static String assetTypepXath() 
     {
        return "//span[text()='Asset type']/../../select";
     } 
     //Site dropdown list
     public static String SiteXpath() 
     {
       return "//div[@class='span6']/div/label/span[text()='Site']/../../select";
     } 
     //Fuel type text
     public static String FuelTypeTextXpath() 
     {
        return "//div//span[text()='Fuel type']";
     }
     //Save button
     public static String SaveAssetButtonXpath() 
     {
        return "//button[text()='Save']";
     }  
     
     //Confirmation Message
     public static String SaveConfirmationMessageXpath() 
     {
        return "//span[text()='Asset created successfully']";
     } 
     
    //Edit Asset Tab List
    public static String EditAssetTabsListRelativeXpathText() 
    {
        return "//ul[@class='nav nav-tabs span12 full-height']";
    }
     
    //Asset details Tab
    public static String assetDetails()
    {
      return"//h5[text()='Asset details']";  
    }  
     
    //Asset status Tab
    public static String AssetStatusTabXpath() 
    {
        return "//li/a[text()= 'Asset status']";
    }
    //Service history Tab
    public static String ServiceHistoryTabXpath() 
    {
        return "//li/a[text()= 'Service history']";
    }
    //Reminders Tab
    public static String RemindersTabXpath() 
    {
        return "//li/a[text()= 'Reminders']";
    }
    //Fuel data Tab
    public static String FuelDataTabXpath() 
    {
        return "//li/a[text()= 'Fuel data']";
    }
    //Other cost data Tab
    public static String OtherCostDataTabXpath() 
    {
        return "//li/a[text()= 'Other cost data']";
    }

    //Mobile device settings Tab
    public static String MobileDeviceSettingsTabXpath() 
    {
        return "//li/a[text()= 'Mobile device settings']";
    }
    
    //Required driver certificates Tab
    public static String RequireddrivercertificatesTabXpath() 
    {
        return "//li/a[text()= 'Required driver certificates']";
    }
    
    //Required driver licences Tab
    public static String RequireddriverlicencesTabXpath() 
    {
        return "//li/a[text()= 'Required driver licences']";
    }
    
   //Header Mobile device details
    public static String ValidateMobileDeviceDetailsXpath() 
    {
        return "//h5[text()='Mobile device details']";
    }
    
    //Header Communication details
    public static String ValidateCommunicationDetailsXpath() 
    {
        return "//h5[text()='Communication details']";
    }
    
    //Input text field for sim card number
    public static String MSISDNNumberXpath() 
    {
        return "//input[@name='simCardPinCode']";
    } 
    
    public static String MSISDNumberXpath()
    {
        return "//input[@name='deviceTypeIdentifierValue']";
    }
    
    //Max limit for sim card number text field
    public static String MaxMeassageMSISDNXpath() 
    {
        return "//input[@dmx-maxlength-message=\"'The entered field must be 8 characters or less'\"]";
    } 
    
    //Numeric characters only for sim card number text field
    public static String NumericOnlyMesssaegeMSISDNXpath() 
    {
        return "//input[@dmx-integer-message=\"'This field must contain numeric characters only'\"]";
    } 
    
    //Confirmation Message
    public static String SaveConfirmationUpdateMessageXpath() 
     {
        return "//span[text()='Asset updated successfully']";
     } 
     
    //Click here Asset Configuration groups to compile
    public static String ClickHereAssetConfigurationXpath() 
    {
        return "//a[@class='font-bold ng-scope']";
    } 

    //Filter input field
    public static String FilterTextboxXpath() 
    {
        return "//input[@ng-change='$directive.change()']";
    }

    //Fitler button
    public static String FilterButtonXpath() 
    {
        return "//div/a[@class='btn btn-small']";
    } 
    //Row Action button
    public static String ActionButtonByRowXpath(String row) 
    {
        return "//div[@row='"+ row +"']//a[@class='row-action']";
    }

    //Row Compile button
    public static String ActionCompileButtonByRowXpath(String row) 
    {
      return "//ul[contains(@style,'block')]//a[@row-index='" + row +"'][@event='CompileAndUpload']";
    }
    
    //Waiting for Upload Configuration to appear
    public static String ValidateUploadConfigurationXpath() 
    {
      return "//h5/span[text()='Upload Configuration']";
    }
    
    //Radio button upload configuration not now
    public static String UploadConfigurationNotNowXpath() 
    {
      return "//input[@value='2']";
    }
    
    //Upload configuration not now
    public static String UploadConfigurationSubmitButonXpath() 
    {
      return "//div[@name='compileAndUploadModal']//button[text()='Submit']";
    }

    //Refresh link
    public static String RefreshLinkXpath() 
    {
        return "//p/a/span[text()='Refresh']";
    }
    
    //Compile Requested
    public static String CompileRequestedTextXpath() 
    {
       return "//div[text()='Compile requested']";
    }
    
    //Ready for Upload 
    public static String ReadyForUploadTextXpath() 
    {
       return "//div[text()='Ready for upload']";
    }
}
