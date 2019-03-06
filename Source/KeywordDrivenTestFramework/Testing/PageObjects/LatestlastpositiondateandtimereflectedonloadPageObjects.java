/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects;

import static KeywordDrivenTestFramework.Core.BaseClass.currentEnvironment;

/**
 *
 * @author tskhosana
 */
public class LatestlastpositiondateandtimereflectedonloadPageObjects 
{
    
    public static String MixTelematicsURL() {
        return currentEnvironment.PageUrl;
    }
    
    public static String MonitorXpath() 
    {
        return "//a[text()='MONITOR ']";
    }   
                
        public static String LiveTrackingXpath() 
    {
        return "//a[text()='Live tracking']";
    } 
     
        public static String Xpath1Lastposition()
        {
            return "\"//ul[contains(@style, 'top:')]//li//span[text()='Last position']/..//span[contains(@class, 'spacer')]/..//span[text()='Last position']\"";
        }
        
     public static String Xpath2Lastposition()
     {
         return "//ul[contains(@class, 'column-chooser-dropdown')]//li//span[text()='Last position']/..//span[contains(@style, 'display')]/..//span[text()='Last position']";
     }
        
     public static String ColumnChooserLastPosition()
     {
         return "//ul[contains(@class, 'column-chooser-dropdown')]//li//span[text()='Last position']/..";
     }
                
        public static String AssetsXpath() 
    {
        return "//a[text()='Assets']";
    } 
     
        public static String ValidateLiveTrackingPageXpath() 
    {
        return "//span[text()='Live tracking']";
    } 
             
    public static String DropDownListLastPosition()
    {
        return "//ul[contains(@class, 'column-chooser-dropdown')]//li//span[text()='Last position']/..";
    }
        
        public static String FilterXpath() 
    {
        return "//div[@ng-hide='assetListFiltered']//input[@placeholder='Filter'] |//input[@class='filter-search-input input-medium span12 ng-valid ng-dirty'] | //input[@class='filter-search-input input-medium span12 ng-pristine ng-valid']";
    } 
        
        //input[@class='filter-search-input input-medium span12 ng-valid ng-dirty'] | //input[@class='filter-search-input input-medium span12 ng-pristine ng-valid']
        public static String ValidateAssetDescriptionXpath() 
    {
        return "//span[text()='Emulator']";
    } 
        //span[text()='Emulator']
        
        public static String ActionButtonXpath() 
    {
        return "//a[@class='btn-actions']";
    } 

                      
        public static String ClickDiagnosticsXpath() 
    {
        return "//a/i[@class=\"icon\"]/../span[text()='Diagnostics']";
    }        
        public static String ValidateDiagnosticsPageXpath() 
    {
        return "//a[text()='Request current status']";
    } 
            
        public static String LatestPositionInformationXpath() 
    {
        return "//span[text()='Latest position information']";
    }     
         
        public static String PositionInformationXpath() 
    {
        return "//strong[text()='Date and time of last position']//..//..//td[2]";
    }     
       
                
        public static String ValidateLandingPageXpath() 
    {
        return "//div[@class='brand']/..//img";
    }   
        
                
        public static String ManageXpath() 
    {
        return "//a[text()='MANAGE ']";
    }
                
        public static String AssetsMenuXpath() 
    {
        return "//a[text()='Assets']";
    }
        public static String DriversMenuXpath() 
    {
        return "//a[text()='Drivers']";
    }
                
        public static String CustomgroupsXpath() 
    {
        return "//a[text()='Custom groups']";
    }

               
        public static String OrggroupsXpath() 
    {
        return "//a[text()='Organisation groups']";
    }
        
                
        public static String ValidateAssetsPageXpath() 
    {
        return "//span[text()='Assets']";
    }
        
                        
        public static String ValidateCustomgroupsPageXpath() 
    {
        return "//span[text()='Custom groups']";
    }
        
          public static String FiltertextboxXpath() 
    {
        return "//form//input[@placeholder='Filter']";
    }   
       
        
    public static String FiltertextfieldXpath() 
    {
        return "//div[contains(@class,'text-filter')]/input";
    }
                
        public static String FilterButtonXpath() 
    {
        return "//div[@class='text-filter']//a[1]";
    }
        
                
        public static String AssetDescriptionXpath() 
    {
        return "//div[@class='cell alt']//..//../a";
    }
                
        public static String ActionbarXpath() 
    {
        return "//div[@row='0']//a[@class='row-action']";
    }
        public static String ActionDropDownButtonXpath() 
    {
        return "//a[@class='row-action']";
    }
  
        public static String LicencesXpath() 
    {
        return "//a[text()='Licences']";
    }
        public static String LicencestabXpath() 
    {
        return "//a[text()='Licence categories']//..//../li[1]/a[text()='Licences']";
    }
              public static String AddlicenceXpath() 
    {
        return "//button[text()='Add licence']";
    }
              
    public static String AddLicenseEnabledCheck()
    {
        return "//button[text()='Add licence'][@disabled='disabled']";
    }
                            
              public static String ValidDateXpath() 
    {
        return "//span[text()='Valid from']//..//../div/input";
    }
                          
              public static String ExpiryDateXpath() 
    {
        return "//span[text()='Expiry date']//..//../div/input";
    }                
              public static String RecipientsXpath() 
    {
        return "//h5[text()='Recipients']";
    }  
    
    public static String RemoveLicense()
    {
        return "//body/ul[@class='dropdown-menu pull-right'][1]/li/a/span[text()='Remove']";
    }
       
    public static String RemoveButton()
    {
        return "//button[text()='Remove']";
    }
              
              public static String ClickcategoryXpath() 
    {
        return "//span[text()='Licence category']//..//../select";
    }    
        
                            
              public static String ClickcategoryOptionXpath() 
    {
        return "//span[text()='Licence category']//..//../select/option[2]";
    }    
              
              
              
        public static String LicencecategoriesXpath() 
    {
        return "//a[text()='Licence categories']";
    }
        
          public static String ActionButtonXpath(String actionRowNo) 
    {
//        return  "//*[@id=\"faDriverCategoriesGrid\"]/div[1]/div[1]/div[3]/ul/li["+actionRowNo+"]/div/div/a";
        return "//*[@id='faDriverCategoriesGrid']/div[1]/div[1]/div[3]/ul/li["+actionRowNo+"]/div/div/a";
    }  
    //ul[@class='dropdown-menu pull-right']/../ul["+editNo+"]
    public static String clickEditButtonXpath(String editNo) 
    {
        return   "//ul[@class='dropdown-menu pull-right']/../ul["+editNo+"]/li/a/span[text()='Edit']";
    }
    public static String clickEditLicenseButtonXpath() 
    {
        return   "//ul[@class='dropdown-menu pull-right'][contains(@style,'block')]/li/a/span[text()='Edit']";
    }
    
            public static String LicenceDurationXpath() 
    {
        return "//span[text()='(months)']//..//../input";
    }
                
            public static String ReminderPeriodXpath() 
    {
        return "//span[text()='(weeks)']//..//../input";
    }
                        public static String CancelButtonXpath() 
    {
        return "//span[text()='Edit licence category']//..//..//..//..//..//../div/button[text()='Cancel']";
    }
            
    
        //span[text()='(weeks)']//..//../input
        
              
        public static String DiagnosticsXpath() 
    {
        return "//a[@row-index= 0][@event='Diagnostics']";
    }          
        public static String EditXpath() 
    {
        return "//a[@row-index= 0][@event='Edit']";
    }  
                
        public static String CustomGroupEditXpath() 
    {
        return "//span[text()='Edit']";
    }  
                
        public static String CustomGroupRemoveXpath() 
    {
        return "//span[text()='Remove']";
    }  
                
        public static String TableBodyXpath() 
    {
        return "//button[text()='Add category']//..//../div[4]/div/div/div/div/table/tbody";
    } 
               
        public static String LicenceTableBodyXpath() 
    {
        return "//button[text()='Add licence']//..//../div[3]/div/div/div/div/table/tbody";
    } 
         
        
          public static String ColumnHeadingXpath(String ColumnHeading) 
    {
        return "//div/span[text()= '"+ColumnHeading+"']";
    }  
                 
          public static String WaitForSpinnerXpath() 
    {
        return "//div[@class='loading-overlay'][@style='display: none;']";
        //return "//span[text()='Live tracking']";
    } 
    
    public static String WaitForAssetsGridMainXpath() 
    {
        return "//div[@id=\"MainView\"]/div[@class='loading-overlay ng-scope' and @style='display: none;']";
    }
    public static String WaitForAssetsListSpinnerXpath() 
    {
        return "//div[@class=\"columns ui-sortable\"]/../div[@class='loading-overlay'][@style='display: none;']";
        
    } 
    public static String WaitForAssetsGridXpath() 
    {
        return "//div[@rows='assets']/div/div/table//tr[@class=\"light-blue\"]";
    }
          public static String ColumnChooseXpath() 
    {
        return "//a[@class='btn btn-small column-chooser']";
    } 
                  
          public static String ValidateAssetsListXpath() 
    {
        return "//span[text()='Emulator']";
    } 
           
        public static String FilteredcolumnsXpath(String Filteredcolumn) 
    {
        return "//ul[@class='dropdown-menu grid-column-chooser'][contains(@style,'block')]/li/a[@column-field='"+Filteredcolumn+"']";
    }  
        
     public static String LastPositionXpathTwo()
     {
         return "//ul[contains(@class, 'column-chooser-dropdown')]//li//span[text()='Last position']/..//span[contains(@style, 'display')]/..//span[text()='Last position']";
     }
     
   public static String filterLastPositionLiveTrackingXpath()
    {
        return "//input[@ng-model='mainFilterQuery']";
    }  
   public static String lastPositionLiveTrackingXpath()
    {
        return "//td[@class='ng-scope last']//div//span[@class='ng-scope']";
    }
    public static String AssetPageHeaderXpath()
    {
        return "//h5/span[text()='Assets']";
    }
    public static String ColumnSelectorAssetsXpath() 
    {
        return "//i[@class='icon-choose-columns']/..";
    }
    public static String waitforAssetSpinner()
    {
        return "//ul[@class='nav nav-pills nav-stacked']";
    }
    
    public static String LastPosXpath2()
    {
        return "//ul[contains(@style, 'top:')]//li//span[text()='Last position']/..//span[contains(@class, 'spacer')]/..//span[text()='Last position']";
    }
    
    public static String filterLastPositionAssetsXpath()
    {
        return "//div[@class='text-filter empty']//input[@ng-model='$directive.filterText']";
    }
     public static String filterLastPositionAssetsSearchBtnXpath()
    {
        return "//a[@class='btn btn-small']//i[@class='icon-search']";
    }   
    public static String LastPositionAssetsXpath()
    {
        return "//div[@class='column-heading sortable']/span[text()='Last position']//..//..//div[@class='cell alt']";
//        return "//ul[contains(@style, 'top:')]//li//span[text()='Last position']/..//span[contains(@class, 'spacer')]/..//span[text()='Last position']";
    }
    public static String LastPositionXpath()
    {
        return "//ul[contains(@style, 'top:')]//li//span[text()='Last position']/..//span[contains(@class, 'spacer')]/..//span[text()='Last position']";
    }
    
    public static String LicenseActionButton()
    {
        return "//div[@rows='licencesGridRows']/div/div/div[@ng-show='rowActions']/ul/li[2]/div/div/a";
    }
   
    
    public static String iconButton()
    {
        return "//tr[@class='light-blue']/../../../div/ul/li/a/i";
    }
    
    public static String DropDownListLastPositionSelect()
    {
        return "//*[local-name()]/ul[@class=\"dropdown-menu pull-right column-chooser-dropdown\"][1]/li/a/span[text()='Last position']/..";
    }
     //div[@class='cell alt']/../..//div[@class='column-heading sortable']/span[text()='Last position']//..//..//div[@class='cell alt']
    
    public static String customGroupPageRightSpinnerXpath()
    {
        return "//div[@fleet-loader=\"content\"]/div[contains(@class,'loading-overlay')][contains(@style,'none')]";
    }
    public static String customGroupPageLeftSpinnerXpath()
    {
        return "//ul[@fleet-loader=\"content\"]/div[contains(@class,'loading-overlay')][contains(@style,'none')]";
    }
}

