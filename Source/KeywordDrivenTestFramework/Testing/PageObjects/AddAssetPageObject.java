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
public class AddAssetPageObject {
    
        public static String AssetsXpath() 
        {
            return "//li/a[text()='Assets']";
        }   

        public static String selectedFilterResult() 
        {
            return "//a[@ng-click='$directive.selectFilterResult(item)']";
        }  
         public static String btnFilterOrganisationGroup() 
        {
            return " //a[@class='btn btn-small btn-filter']";
        }  
       
        public static String assetDetails()
        {
            return"//h5[text()='Asset details']";  
        }  

        public static String TrackingIconAndColour()
        {
            return"//label[text()='Tracking Icon & colour']";  
        }  
        public static String ManageXpath() 
        {
            return "//a[text()='MANAGE ']";
        }   
        public static String AddAssetsButtonXpath() 
        {
            return "//div[@class='page-header']/div/a[@fleet-tooltip='Add asset']";
        } 
        public static String ActionsButtonXpath() 
        {
            return "//a[@class=\"row-action\"]";            
        } 
        public static String ActionsButtonIndexXpath(int i) 
        {
            return "//div[@row="+ i +"]//a[@class=\"row-action\"]";            
        } 
        public static String AseetPageRootSpinnerXpath() 
        {
            return "//div[@id=\"MainView\"]/div[contains(@class,'loading') and contains(@style,'none')]";
        } 
        public static String btnRemoveXpath() 
        {
            return "//button[text()='Remove']";
        } 

           public static String AssetsdescriptionXpath() 
        {
            return "//input[@name='description']";
        } 
           
        public static String removeButtonRemoveItemXpath()
        {
            return "//ul[contains(@style, 'display: block;')]//span[text()='Remove']/..";
        }
        
        public static String FuelTypeTextXpath() 
        {
            return "//div//span[text()='Fuel type']";
        }
        public static String removedPopUpAlertXpath()
        {
            return "//span[@id='pop-alert-message'][text()='Asset removed successfully']";
        }
        public static String columnsUnderColumnChooserXpath()
        {
            return "//ul[@class='dropdown-menu grid-column-chooser'][contains(@style,'block')]/li";
        }
        public static String columnTickXpath(String column)
        {
            return "//ul[@class='dropdown-menu grid-column-chooser'][contains(@style,'block')]//span[contains(text(),'"+column+"')]/../i";
        }
        public static String columnSpanXpath(String column)
        {
            return "//ul[@class='dropdown-menu grid-column-chooser'][contains(@style,'block')]//span[contains(text(),'"+column+"')]";
        }

        public static String FuelTypeXpath() 
        {
            return "//span[text()='Fuel type']/../../select";
        } 
        public static String RegistrationNumberXpath() 
        {
            return "//span[text()='Registration number']/../../input";
        } 
        
        public static String assetDetailsPageSpinnerXpath() 
        {
            return "//h5[text()='Asset details']/../../../../div[contains(@class,'loading-overlay')][contains(@style,'none')]";
        } 
        public static String assetRightPageSpinnerXpath() 
        {
            return "//div[@class=\"paged-grid\"]//div[@class='loading-overlay'][@style='display: none;']";
        } 
        public static String assetLeftPageSpinnerXpath() 
        {
            return "//ul[@name=\"assetListItemTypeFilter\"]/../div[@class='loading-overlay'][@style='display: none;']";
        } 
        
        public static String assetTypepXath() 
        {
            return "//span[text()='Asset type']/../../select";
        } 
         public static String SiteXpath() 
        {
            return "//div[@class='span6']/div/label/span[text()='Site']/../../select";
        }    

        public static String ConfigurationGroupXpath() 
        {
            return "//span[text()='Configuration group']/../../select";
        }      
        public static String assetsHeaderXpath()
        {
            return "//div[@class='pull-left page-section-header ng-scope']/h5/a";
        }
        public static String addedAssetXpath(String asset)
        {
            return "//div[contains(@class,'cell')]/a[text()='"+asset+"']";
        }
        public static String CountryXpath() 
        {
            return "//select[@name='country']";
        } 

        public static String CountryOptionXpath() 
        {
            return "//option[text()='South Africa']";
        }          
        public static String FuelConsumptionXpath() 
        {
            return "//input[@name='targetFuelConsumption']";
        }

        public static String FleetNumberXpath() 
        {
            return "//input[@name='fleetNumber']";
        }

        public static String VehicleMakeXpath() 
        {
            return "//input[@name='make']";
        }

        public static String VehicleModelXpath() 
        {
            return "//input[@name='model']";
        }

        public static String VehicleModelyearXpath() 
        {
            return "//input[@name='year']";
        }   
      //                
        public static String ChassisnumberXpath() 
        {
            return "//input[@name='chassisNumber']";
        }   

        public static String EnginenumberXpath() 
        {
            return "//input[@name='engineNumber']";
        }     

        public static String AssetIDXpath() 
        {
            return "//input[@name='fmVehicleId']";
        } 
        public static String mixAccountNumberTextFieldXpath()
        {
            return "//input[@name='miXAccountNumber']";
        }
        public static String removeMobileDeviceButtonXpath()
        {
            return "//button[text()='Remove mobile device']";
        }
        public static String removeMobileDeviceNotesTextAreaXpath()
        {
            return "//textArea[@ng-model='removeMobileDeviceTemplate.notes']";
        }
        public static String removeMobileDeviceRemoveButtonXpath()
        {
            return "//div[@name='removeMobileDeviceModal']//button[text()='Remove']";
        }
        public static String decommissionedTabXpath()
        {
            return "//span[text()='Decommissioned']/..";
        }

        public static String MobileDeviceXpath() 
        {
            return "//input[@name='additionalMobileDevice']";
        }
        public static String mobileDeviceSettingsTabXpath()
        {
            return "//a[text()='Mobile device settings']";
        }
        public static String changeMobileDeviceButtonXpath()
        {
            return "//button[text()='Change mobile device']";
        }
        public static String newMobileDeviceDropdownXpath()
        {
            return "//span[text()='New mobile device type']/../../select";
        }
        public static String mobileDeviceXpath()
        {
            return "//p[@ng-show=\"asset.unitType!='No mobile device'\"]";
        }
        public static String simCardPinCodeXpath()
        {
            return "//input[@name='simCardPinCode']";
        }
        public static String APNUsernameTextboxXpath()
        {
            return "//input[@name='gprsApnUsername']";
        }
        public static String APNPasswordTextboxXpath()
        {
            return "//input[@name='gprsApnPassword']";
        }
        public static String allFilterXpath()
        {
            return "//span[text()='All']/..";
        }
        public static String downloadAssetConfigButtonXpath()
        {
            return "//button[text()='Download asset config']";
        }
        public static String downloadAssetConfigModalXpath()
        {
            return "//div[@name='downloadAssetConfigModal']//h5/span";
        }
        public static String saveDownloadButtonImage()
        {
            return "SaveIEButton.PNG";
        }
        public static String downloadButtonXpath()
        {
            return "//div[@name='downloadAssetConfigModal']//button[@text='Download']";
        }
        public static String newConfigurationGroupDropdownXpath()
        {
            return "//span[text()='New configuration group']/../../select";
        }

        public static String NotesXpath() 
        {
            return "//textarea[@name='notes']";
        }
      //               
        public static String AssetColourXpath() 
        {
            return "//input[@name='colour']";
        } 

        public static String SelectIconButtonXpath() 
        {
            return "//a[text()='Select Icon']";
        } 

        public static String SelectedIconButtonXpath() 
        {
            return "//label[text()='Tracking Icon & colour']/../div[@class='btn-group ml-10']/a";
        }       
        public static String SaveAssetButtonXpath() 
        {
            return "//button[text()='Save']";
        }     

                public static String ChooseIconXpath() 
        {
            return "//span[text()='Choose icon']/../../../div[@class='well no-margin']/ul/li/a";
        }     
            public static String clickSelectIcon()
        {
            return "//div/button[@class='btn ng-scope ng-binding btn-wide btn-success']";
        }

            public static String ChooseIconSelectbutton()
        {
            return"//button[text()='Select']";
        }
            public static String AssetXpath()
        {
            return"//span[text()='Assets']";
        }
        public static String MiXTelematicsTabXpath()
        {
            return"//h5/span[text()='Assets']/../../../div[@class='pull-left no-wrap']/div/div[@class='miller-selector']/a/span/span[text()='MiX Telematics']";
        }
        public static String ZeroZeroOneSGTestingXpath()
      {
          return"//a/span[text()='001 SG Testing']";
      }
      public static String MiXTelematicsInSelectOrganisationGroupXpath()
      {
          return"//h5[text()='Select organisation group']/../../../div[@class='column-viewport ps-container']/div/div[@class='column-resizable ng-scope ui-resizable']/div/a/span[text()='MiX Telematics']";
      }
        public static String cancelXpath()
        {
            return"//div/div/button[text()='Cancel']";
        }
        public static String searchButtonFilter()
        {
            return"//strong[text()='All']/../../../div[@class='pull-right']/div/a/i";
        }
        public static String labelAssetDescriptionXpath()
        {
            return"//span[text()='Asset description']";
        }
        public static String inputFieldFilterXpath()
        {
            return"//div[@class='text-filter empty']/input";
        }
        public static String ZeroZeroOneDealer()
         {
             return"//a/span[text()='001 Dealer'] ";
         }
    
          public static String Org2React()
      {
          return"  //a/span[text()='Org2React']";
      }

          //Select
        public static String configSelectXpath()
      {
          return"//div[@class='pull-right mr-10']/a[text()='Select']";
      }
           //001 MLO
      public static String ZeroZeroOneMLOXpath()
      {
          return"//a/span[text()='001 MLO']";
      }
        public static String DefaultSiteXpath()
        {
            return"//a/span[text()='Default Site']";
        }


        public static String TargetHourlyFuelConsumptionXpath()
        {
            return"//span[text()='Target hourly fuel consumption']/../../input";
        }
         public static String availableTabXpath()
        {
            return"//span[text()='Available']";
        }
        public static String AssetDescriptionByIndexRowXpath()
        {
            return"//div[@class='paged-grid']/div/div/div[@class='column']/div/span[text()='Asset description']/../../div[@class='cell alt']/a[@row-index='0']";
        }
        public static String AssetCreatedSuccessfully()
        {
            return"//div/div/span[text()='Asset created successfully']//..//..//..//div[@class='notification-wrapper notification-modal ng-scope']";
        }  
        public static String AssetUpdatedSuccessfully()
        {
            return"//div/div/span[text()='Asset updated successfully']//..//..//..//div[@class='notification-wrapper notification-modal ng-scope']";
        }  
        public static String AssetRemovedSuccessfully()
        {
            return"//div/div/span[text()='Asset removed successfully']//..//..//..//div[@class='notification-wrapper notification-modal ng-scope']";
        }  

        public static String inspectAssetformDetails()
        {
            return"//form/h5[text()='Asset details']";

        }
        public static String FMVehicleIDisInUse()
        {
            
            return "//span[text()='FM Vehicle ID is in use']";
        }
          public static String FMVehicleIDValid()
        {
            return "//input[@class='span12 ng-valid-dmx-int16 ng-dirty ng-valid ng-valid-fleet-fm-vehicle-id-unique-async']";
        }
             

        public static String saveDisabled()
        {
            return "//button[text()='Save'][contains(@disabled,'disabled')]";
        }
        public static String changeButtonXpath()
        {
            return "//button[@text='Change']";
        }
        public static String yesButtonXpath()
        {
            return "//div[@class='modal hide fade hidden-phone modal-mini in']//button[text()='Yes']";
        }
      
        
        public static String RegistrationNumberAlreadyInuseMsg()
        {
            return "//span[text()='Registration number already in use']";
        }
          public static String invalidRegNumberMsg()
        {
            return "//form[@class='ng-invalid ng-invalid-dmx-required ng-valid-fleet-fm-vehicle-id-unique-async ng-dirty ng-invalid-fleet-registration-number-unique-async']";
        }
        //form[@class='ng-invalid ng-invalid-dmx-required ng-valid-fleet-fm-vehicle-id-unique-async ng-dirty ng-valid-fleet-registration-number-unique-async']
          
          
        public static String DropDownlistConfGroupXpath()
        {
            return "//form[@name='assetDetailsForm']//select[@name='configurationGroupId']";
        }
         public static String  homeLogoXpath()
        {
            return "//a[@href='#/home']/img";
        }
         
         public static String AssetUpdatedXpath()
         {
             return "//span[text()='Asset updated successfully']";
         }
        
       
}     


