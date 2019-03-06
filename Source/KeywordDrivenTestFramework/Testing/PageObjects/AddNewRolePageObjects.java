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
public class AddNewRolePageObjects 
{

    public static String waitForTableLoadingSpinner()
    {
        return "//div[@ng-hide=\"roleListGridRows == undefined\"]/../div[@class='loading-overlay ng-scope' and @style='display: none;']";
    
    }
    public static String waitForTableContent()
    {
        return "//*[local-name()]/tbody[@fleet-draggable-group=\"draggable\"]";
    
    }
    public static String SecurityGroups()
    {
        return "//li/a[text()='Security groups']";
    
    }    
    public static String customGroupsPageSpinnerXpath()
    {
        return "//table/../../../../div[contains(@class,'loading-overlay')][contains(@style,'none')]";    
    }
    public static String filteredGroupNameXpath(String groupName)
    {
        return "//td[@column-field=\"name\"]//span[text()='" + groupName + "']";    
    }
    
    public static String groupDetailsPageSpinnerXpath()
    {
        return "//legend[text()='Group details']/../../../../../div[contains(@class,'loading-overlay')][contains(@style,'none')]";    
    }
        public static String LogOutXpath() 
    {
        return "//i[@class='icon-main-logout']/..";
    }
        
         public static String ManageLocationsSubMenuXpath() 
    {
        return "//a[text()='Manage locations']";
    } 
     
     public static String ActionsToEditXpath() 
    {
        return "//li[2]/div/div/a";
    }

            public static String ConfirmRemoveLocationXpath() 
    {
        return "//div[@class='modal hide fade ng-scope modal-mini in']/div/button[text()='Remove']";
    }
       
         public static String ErrorMessageXpath() 
    {
        return "//div[@class='well no-margin ng-scope']/div[1]";
    }

    public static String MONITORXpath() 
    {
        return "//a[text()='MONITOR ']";
    }

    public static String LogInXpath() 
    {
        return "//button[text()='Sign in']";
    }
    
    public static String SecurityGroupXpath() 
    {
        return "//div[text()='DoNotDelete ']";
    }

        public static String EditUserXpath() 
    {
        return "//span[text() ='DoNotDelete Please']/..";
    }

    public static String ClickOnFilterOnBreadCrumbSecurityGroupXpath() 
        {
            return "//div[@style='']/div/div/h5[text()='Select organisation group']/../../div/input";
        }
    public static String MixTelematicsURL() {
        return currentEnvironment.PageUrl;
    }
        public static String UserNameTextboxXpath() 
    {
        return "//label[text()='USERNAME']/../div/input";
    }
    
    public static String PasswordTextboxXpath() 
    {
        return "//label[text()='PASSWORD']/../div/input";
    }
    
    public static String checkBottom()
    {
        return "//table/tbody/tr[1]/td[1]/input[2]";
    }
    
    //UserName
    public static String UsernameClassname() 
    {
        return "userName";
    }
    public static String FilterTextboxXpath() 
    {
        return " //input[@placeholder='Filter']";
    }
   
    public static String EditRoleXpath() 
    {
        return "//span[text() ='DoNotDelete']/..";
    }
    
    public static String PermissionsXpath() 
    {
        return "//a[text() ='Permissions']";
    }
    public static String UserSubMenuXpath() 
    {
        return "//a[text()='Users']";
    } 
    
    public static String AccessToDeleteSecurityGroupXpath() 
    {
        return "//td[text()='Manage locations - Multi-delete locations']/../td[2]/i[@class='icon-ok']";
    }
    
    public static String EditSecurityGroupXpath() 
    {
        return "//span[text()='DVT Automation']/../../a";
    }
    public static String SaveButtonXpath() 
     {
         return "//button[text()='Save']";
     }
    public static String CancelButtonOnPermissionXpath() 
     {
         return "//button[text()='Cancel']";
     }
    public static String accessToDeleteCheckboxXpath() 
    {
        return "//td[text() ='Manage locations - Multi-delete locations']/../td/../td[2]/input";
    }
    public static String SelectOnMapXpath() 
    {
        return "//a[@fleet-tooltip='Create location']//..//..//..//../div/select";
    } 
        public static String SelectOptionMapXpath() 
    {
        return "//a[@fleet-tooltip='Create location']//..//..//..//../div/select/option[2]";
    } 
    
    //Password
    public static String PasswordClassname() 
    {
        return "password";
    }
    
        public static String MonitorLinkText() 
    {
        return "MONITOR";
    }
            
        public static String TripTimeLineXpath() 
    {
        return "//a[text()='Trip timeline']";
    }
        
        public static String ManageXpath() 
    {
        return "//a[text()='MANAGE ']";
    }
             
      public static String RolesXpath() 
    {
        return "//a[text()='Roles']";
    }
    
     public static String SecurityGroupsXpath() 
    {
        return "//a[text()='Security groups']";
    }
      
      public static String ValidateRolesPageXpath() 
    {
        return "//span[text()='Roles']";
    }      
      
      public static String ClickOnBreadCrumbXpath() 
    {
        return "//a/span/span[text()='MiX Telematics']";
    }
      
            
      public static String ValidateOrganisation() 
    {
        return "//a/span/span[text()='MiX Telematics']//..//../span/span[text()='DVT Automation']";
    }
     
      public static String LocationsButtonXpath() 
    {
        return "//a[@fleet-tooltip='Locations']";
    } 
      
      public static String ClickLocationCheckBoxXpath() 
    {
        return "//span[text()='Select locations']//..//..//../div/div/div/div/div/table/tbody/tr[1]/td/input[@type='checkbox']";
    } 
      
      public static String ClickEventCheckBoxXpath() 
    {
        return "//span[text()='Select events']//..//..//../div/div/div/div/div/table/tbody/tr[1]/td/input[@type='checkbox']";
    } 
      
      
      public static String ClickLocationSelectButtonXpath() 
    {
        return "//span[text()='Select locations']//..//..//..//..//..//../div/button[text()='Select']";
    } 
      
      public static String ClickEventsXpath() 
    {
        return "//a[@fleet-tooltip='Events']";
    } 
            public static String ClickEventSelectButtonXpath() 
    {
        return "//span[text()='Select events']//..//..//..//..//..//../div/button[text()='Select']";
    } 
            
            public static String ValidateAssetGridXpath() 
    {
        return "//span[text()='Show selected assets']//..//..//..//..//..//..//../div/div/div/table/thead/tr/th/span[text()='Asset description']";
    } 
                  
            public static String ValidateMapXpath() 
    {
        return "//div[@class='leaflet-objects-pane']";
    } 
            
            
      
      public static String ClickOnFilterOnBreadCrumbXpath() 
    {
        return "//input[@class='filter ng-valid ng-dirty'] | //input[@class='filter ng-pristine ng-valid'] ";
    }
      public static String ClickOnSearchButtonOnBreadCrumbXpath() 
    {
        return "//a[@class='btn btn-small btn-filter']";
    }
      
      public static String searchFilterSecurityGroupXpath()
      {
          return "//input[@class='filter ng-valid ng-dirty']";
      }
       
      //input[@class='filter ng-pristine ng-valid']
       public static String ClickOnSearchButtonOnBreadCrumbSecurityGroupXpath() 
    {
        return "//div/div/h5[text()='Select organisation group']/../../div/input/..//a/i[@class='icon-search']/..";
    }
      //div/div/h5[text()='Select organisation group']/../../div/input/..//a/i[@class='icon-search']/..
      public static String ClickOnBreadCrumbFilterXpath() 
    {
       // return "//div/div/h5[text()='Select organisation group']/../../div/input";
       return "//div[@class='pull-right']/input";
    }
      
        public static String ValidateOrganisationGroupListXpath() 
    {
        return "//h5[text()='Select organisation group']";
    }
                
        public static String ClickOnOrganisationXpathRefresh() 
    {
        return "//span[text()='Dev Dealer']";
    }
        
        public static String ClickOnOrganisationXpath() 
        {
            return "//a/span[text()='Engineering'] |//a[@class=\"ng-scope active\"]/../span |//a[@class=\"ng-scope active selected\"]/span[text()='Engineering']";
        }
        public static String ClickOnOrganisationRefreshXpath() 
        {
            return "//span[text()='Dev Dealer']";
        }
              
        public static String SelectedOrganisationXpath() 
        {
            return "//div[@class='group ng-scope']/a";
        }
                
        public static String DynaSelectedOrganisationXpath(String organization) 
        {
            return "//div[@class='group ng-scope']/a/span[text()='"+organization+"']";
        }
        
        public static String DynaSelectedOrganisationFirefoxXpath(String organization) 
        {
            return "//*[local-name()]/a[@ng-click=\"$directive.selectFilterResult(item)\"]/span[2]";
//return "//div[@class='group ng-scope']/a";
            //return "//div[@class='group ng-scope']/a/span[contains(@bind-once,'')]/..";
            //return "//div[@class='group ng-scope']/a/span[text()='"+organization+"']/..";
        }
        
        
         //div[@class='group ng-scope']/a[text()='"+organisation+"']     
        
        
        public static String ValidateLiveTrackingPageXpath() 
    {
        return "//span[text()='Live tracking']";
    }
        public static String ValidateManageLocationsPage()
    {
        return "//span[text()='Manage locations']";
    }
           public static String ValidateLocationNameRemoved(String text)
    {
        return "//span[text() = '"+ text +"']";
    }
        public static String InputResetButton()
    {
        return "//button[@class = 'input-reset']";
    } 
         public static String NoItemsToDisplayXpath()
    {
        return "//span[text()= 'No items to display']";
    }     
    
        public static String ValidateAssetsGridXpath() 
    {
        return "//span[text()='Show selected assets']";
    }       
        public static String CheckBoxClusteringXpath() 
    {
        return "//span[text()='DVT non-FM asset']//..//..//..//../td[2]/div/span/input";
    }
       public static String ValidateLocationRemovedPopUP() 
    {
        return "//span[text() = 'Location removed successfully']";
    }    
       public static String ValidateLocationCreatedPopUP() 
    {
        return "//span[text() = 'Location successfully created']";
    }  
        
        
        
        public static String ValidateGPSCoordinatesXpath() 
    {
        return "//span[text()='GPS Coordinates']";
    }
        
        public static String GPSCoordinatesXpath() 
    {
        return "//span[text()='GPS Coordinates']//..//..//../td[2]";
    }
                
        public static String ValidateLatestTimeXpath() 
    {
        return "//span[text()='Last position date and time']";
    }

        public static String LatestTimeXpath() 
    {
        return "//span[text()='Last position date and time']//..//..//../td[2]";
    }
               
        public static String LocationXpath() 
    {
        return "//span[text()='Identified driver']//..//..//..//../tr/td/strong/span[text()='Location']//..//..//../td[2]";
    }
           
        public static String ValidateLocationXpath() 
    {
        return "//span[text()='Identified driver']//..//..//..//../tr/td/strong/span[text()='Location']";
    }
             
        public static String ValidateAssetstatusXpath() 
    {
        return "//span[text()='Asset status']";
    }
        
                public static String AssetstatusXpath() 
    {
        return "//span[text()='Asset status']//..//..//../td[2]";
    }
  
    public static String ClickSelectXpath() 
    {
        //return "//a[@class='btn btn-small btn-success btn-wide ng-binding'][text()='Select']";
        //return "html/body/div[25]/div[3]/div/a[2]";
        return "//a[text()='Select']";
    }
    public static String ClickSelectButtonByXpath() 
    {
        //return "//a[@class='btn btn-small btn-success btn-wide ng-binding'][text()='Select']";
        //return "html/body/div[25]/div[3]/div/a[2]";
        return "//div[@class='miller-selector-modal-container white-box-shadow ng-scope in']/div[@class='menu-footer']//a[text()='Select']";
    }
                 
        public static String ClickSelectedXpath() 
    {
       // return "//span[text()='Select assets']//..//..//..//..//..//..//button[text()='Select']";
        return "//*[local-name()]/button[@class=\"btn ng-scope ng-binding btn-wide btn-success\"]";
    }
                
        public static String ClickFirstSelectXpath() 
    {
        return "//div[@class='tree-item-content']//..//..//li/span";
    }
                public static String ClickorglevelcheckboxXpath() 
    {
        return "//div[@class='tree-item-content']//..//..//li/div/div/span[text()='DVT Automation']";
    }
                
        public static String ClickSecondSelectXpath() 
    {
        return "//span[text()='Default Site']//..//..//..//..//li/span";
    }
              
        public static String ClickSelectedAssetXpath() 
    {
        return "//span[text()='Default Site']//..//..//..//..//li/div[2]/ul/li[1]/div";
    }
        
                public static String ClickselectedAssetXpath() 
    {
        return "//span[text()='Default Site']//..//..//..//..//li/div[2]/ul/li[2]/div";
    }
        
        public static String ClickGroupSelectButtonXpath() 
    {
        return "//h5[text()='Asset selection']//..//button[text()='Select']";
    }
        public static String CheckBoxXpath() 
    {
        return "//tbody[@fleet-draggable-group='draggable']//..//td[1]//input[@type='checkbox']";
    } 
        
        public static String ClickAddAssets() 
    {
        return "//a[@fleet-tooltip='Add asset']";
    }
                
        public static String ClickAddAssetsForFireFoxXpath() 
    {
        return "//div[@class='pull-right selection-btn-right']//a[3]";
    }
       
                
        public static String SelectOrganisationXpath() 
    {
        return "//a/span[text()='Ettienie Test']";
    }
                
        public static String FilterTextfieldXpath() 
    {
        return "//div[@class='text-filter empty']/input";
    }
                
        public static String GroupFilterTextfieldXpath() 
    {
        //return "//div[@class='input-reset-wrapper']/input";
        //return "//div[@ng-hide='workerListFiltered']//div[@class='input-reset-wrapper']/input";
        return "//input[@placeholder='Filter']";
    }
    public static String spinnerXpath()
    {
        return "//th/span[text()='Group name']/../../../../../div[@class='loading-overlay ng-scope'][@style='display: none;']";
    }
            
        public static String GroupCheckBoxXpath() 
    {
        return "//div[@visible-columns='assetGridVisibleColumns']/div/div/table/tbody/tr/td[2]/div/span/input";
    }
        
   public static String uniqueTrailerErrorXpath() 
    {
        return "//a[@fleet-tooltip='Actions']";
    }
                
        public static String GroupActionbarXpath() 
    {
        return "//a[@fleet-tooltip='Actions']";
    }
                
        public static String GroupRemoveButtonXpath() 
    {
        return "//button[text()='Remove']";
    }
                  
    public static String GetActionBarXpath()
    {
        return "//li[@class='ng-scope odd info']/div/div[@class='row-action btn-group ng-scope']/a[@fleet-tooltip='Actions']";
    }
    public static String SelectShowTrailXpath()
    {
        //return "//ul[@style='display: block; left: 1051px; top: 284px; right: auto;']/li/a/i[@class='icon']/../span[text()='Show trail on map']";
        return "//span[text()='Show trail on map']/../i/../span";
    }

    public static String DropDownActionByXpath()
    {
        return "//ul[@class='dropdown-menu pull-right'][@style='display: block; left: 591px; top: 255px; right: auto;']";
    }
        public static String FilterXpath() 
    {
        return "//input[@placeholder='Filter']";
    }
                
        public static String FilterSearchButtonXpath() 
    {
        return "//div[@class='pull-right']//a[@class='btn btn-small']";
    }
              
        public static String ClickNewRoleXpath() 
    {
        return "//span[@icon='icon-plus icon-white' and @event='add']";
    }  
        public static String ClickAddUserXpath() 
    {
        return "//a[@fleet-tooltip='Add user']";
    }
               
        public static String ClickAddCutomGroupXpath() 
    {
        return "//a[@fleet-tooltip='Add custom group']";
    }
        
        public static String VAlidatePageloadXpath() 
    {
        return "//tr[@class=\"light-blue\"]/th/span[text()=\"Permissions\"]";
    }
        
        public static String ClickOnSearchXpath() 
    {
        return "//input[@placeholder='Filter']";
    }
              
        public static String ClickOnActionXpath() 
    {
        return "//div[@class='row-actions']/ul/li/div/div/a";
    }
            
        public static String ClickOnRemoveXpath() 
    {
        return "//ul[@class='dropdown-menu pull-right']/li[3]/a";
    }
        
               
        public static String ClickOnRemoveRoleXpath() 
    {
        return "//button[text()='Remove']";
    }
        

                
        public static String ValidateFormXpath() 
    {
        return "//form[@class=\"ng-pristine ng-invalid ng-invalid-dmx-required ng-valid-dmx-rolename-unique-async\"]";
    }
        
                public static String ValidateUserFormXpath() 
    {
        return "//div[@fleet-loader=\"content\"]/../../div[@class=\"loading-overlay ng-scope\" and @style=\"display: none;\"]";
    }                
                
        public static String ValidatePersonalDetailsXpath() 
    {
        return "//h5[text()='Personal details']";
    }
        
        public static String AddnewRoleName() 
    {
        return "roleName";
    }
              public static String AddnewRoletextBoxXpath() 
    {
        return "//input[@name='roleName']";
    }  
        
                
        public static String ClickOnprofileXpath() 
    {
        return "//option[text()='Select profile']";
    }
    
                
        public static String SelectProfileXpath() 
    {
        return "//option[text()='General administrator']";
    }
                
        public static String ClickMakeAvailable() 
    {
        return "//a[text()='Make available']";
    }
              
        public static String ValidateSelectorganisationgroupsPageXpath() 
    {
        return "//span[text()='Select organisation groups']";
    }
        public static String ClickFirstPlussignXpath() 
    {
        return "//span[text()='MiX Telematics']/../../../../span";
    }  
        
        public static String ClickSecondPlussign() 
    {
        return "//span[text()='Test RSO']/../../../../span";
    }
        public static String SelectGroup() 
    {
        return "//a[@class=\"tree-item\"]/span[text()=\"DVT Automation\"] | //a[@class=\"tree-item selected\"]/span[text()=\"DVT Automation\"]";
    } 
        
        public static String ClickOKButton() 
    {
        return "//button[text()='OK']";
    }
              
        public static String ClickNextButtonXpath() 
    {
        return "//button[text()='Next']";
    }
          
        public static String ClickOnIconXpath() 
    {
        return "//th[text()='Access']/../../../../..//i";
    }
                    
        public static String ClickOnAccessCheckBoxXpath() 
    {
        return "//tr/td[text()='Contacts']/../td[2]/input";
    }
                
        public static String ClickOnCreateCheckBoxXpath() 
    {
        return "//tr/td[text()='Contacts']/../td[3]/input";
    }
        public static String ClickOnLoginMobileCheckBoxXpath() 
    {
        return "//tr/td[text()='Login - MiX Fleet Manager Mobile']/../td[2]/input";
    }   
        
        public static String ClickOnLoginWebCheckBoxXpath() 
    {
        return "//tr/td[text()='Login - Web application']/../td[2]/input";
    }   
                
        public static String ClickSaveButtonXpath() 
    {
        return "//button[text()='Save']";
    } 
              
        public static String ClickCancelButtonXpath() 
    {
        return "//button[text()='Cancel']";
    }        
        public static String SuccessCreateAlertMessage() 
    {
        return "//span[@id='pop-alert-message'][text()='Asset created successfully']";
    }        
        
        
        public static String ValidatePopUpXpath() 
    {
        return "//span[text()='Role updated successfully']";
    }    
                
        public static String ValidateAddedRoleXpath() 
    {
        return "//span[text()='Tester_Dvt']";
    }    
                
        public static String ClickOnRolesXpath() 
    {
        return "//h5/a[text()='Role permissions']";
    }  
          public static String ClickOnRolesHeaderXpath() 
    {
        return "//h5//a[text()='Roles']";
    } 
        
                       
        public static String ClickAddedRoleXpath() 
    {
        return "//tr/td/..//a[@class='clickable-cell ng-scope']";
    }  
              
        public static String ClickOnPermissions() 
    {
        return "//a[text()='Permissions']";
    }   
                public static String ClickOnDropDownXpath() 
    {
        return "//a[@class=\"btn-actions\"]";
    }  
        
        
            
      //-------------       
                
                
        //Add user page objects
                
            public static String ValidateRolenameXpath() 
    {
        return "//input[contains(@class,'show-validity')]";
    }
        
          public static String UserXpath() 
    {
        return "//a[text()='Users']";
    }
                  
          public static String AddNewUserXpath() 
    {
        return "//input[@name='firstName']";
    }
          public static String AddNewUserLastNameXpath() 
    {
        return "//input[@name='lastName']";
    }
          public static String AddNewUserNameXpath() 
    {
        return "//input[@name='userName']";
    }          
          public static String AddEmployerNameXpath() 
    {
        return "//input[@name='employer']";
    }
          
          public static String ClickOrganizationXpath() 
    {
        return "//a[@class='font-bold']//span[2]";
    }    
                   
          public static String ClickChosenOrganizationXpath() 
    {
        return "//div[@class='miller-selector-modal-container white-box-shadow ng-scope in']/div[@class='column-viewport ps-container']/div/div[2]/div/a/span[text()='Engineering']/..";
    }           
    public static String ChosenOrganizationXpath() 
    {
        return "//div[@class='miller-selector-modal-container white-box-shadow ng-scope in']/div[@class='column-viewport ps-container']/div/div[3]/div/a/span[text()='DVT Automation']/..";
    }           
          public static String SelectOrganisationForUserXpath() 
    {
        return "//div[@class='miller-selector-modal-container white-box-shadow ng-scope in']/div[@class='column-viewport ps-container']/div/div[2]/div//a[@class='ng-scope active selected']";
    }    
    public static String OrganisationForUserXpath() 
    {
        return "//div[@class='miller-selector-modal-container white-box-shadow ng-scope in']/div[@class='column-viewport ps-container']/div/div[3]/div//a[@class='ng-scope active selected']";
    }    
          public static String ClickSelectGroupXpath() 
    {
        return "//a[text()='Select group']";
    }    
                  
          public static String ValidateSecurityGroupXpath() 
    {
        return "//span[text()='Select security groups for user']";
    }   
          
    public static String EnterSearchSecurityGroupXpath() 
    {
        return "//input[@placeholder='Filter']";
    }  
      
                              
    public static String ClickCheckBoxXpath() 
    {
        return "//td/input[@type='checkbox']";
    } 
 
        public static String ClickSelectButtonXpath() 
    {
        return "//button[text()='Select']";
    } 
            
        public static String ClickCountryXpath() 
    {
        return "//option[text()='Choose country']";
    } 
        public static String SelectCountryXpath() 
    {
        return "//option[text()='South Africa']";
    } 
    
    
            public static String HomePhoneXpath() 
    {
        return "//input[@name='homePhone']";
    }         
            public static String WorkPhoneXpath() 
    {
        return "//input[@name='workPhone']";
    } 
            public static String MobilePhoneXpath() 
    {
        return "//input[@name='mobilePhone']";
    } 
            public static String TimeOutXpath() 
    {
        return "//option[text()='Choose timeout']";
    } 
           public static String SelectTimeOutXpath() 
    {
        return "//option[text()='30 minutes']";
    } 
               
           public static String ClicklanguageXpath() 
    {
        return "//select[@name='languageCode']";
    } 
                     
           public static String SelectedlanguagetXpath() 
    {
        return "//option[text()='English']";
    } 
        
           public static String ClickSaveXpath() 
    {
        return "//button[text()='Save']";
    }
                    
           public static String ValidateSaveXpath() 
    {
        return "//button[text()='Save' and @disabled='disabled'] ";
    }
           
//    public static String spinnerXpath()
//    {
//        return "//div[@ng-show='rowActions']/../div[@class='loading-overlay ng-scope'][@style='display: none;']";
//    }
           
           
          
           
           
               public static String validateSaveXpath() 
    {
        return "//span[text()='User updated successfully']";
    } 
               
                              
        public static String ClickAddPermissionsXpath() 
    {
        return "//button[text()='Add permissions']";
    } 
                           
        public static String ClickOrganisationXpath() 
    {
        return "//div[@class='miller-selector-modal-container white-box-shadow ng-scope in']/div[@class='column-viewport ps-container']/div/div/div/a/span[text()='DVT Automation']/..";
    } 
        
        public static String ClickSelectedOrganisationXpath() 
    {
        return "//a/span[text()='Ettienie Test']";
    } 
    public static String ClickSelectedOrganisationSandboxMidrandXpath() 
    {
        return "//a/span[text()='Sandbox Midrand']";
    } 
                
        public static String ClickSelectedOrganizationXpath() 
    {
        return "//a/span[text()='Default Site']";
    } 
           
        public static String ClickSelectedButtonXpath() 
    {
        return "//a[text()='Select']";
    } 
    
        public static String ClickToSelectProfileXpath() 
    {
        return "//option[text()='All']";
    }   
    public static String allLabelXpath()
    {
        return "//strong[text()='All']";
    }
                
        public static String ClickOnSelectedProfileXpath() 
    {
        return "//option[text()='General administrator']";
    }  
        public static String ClickOnSelectedProfileSystemXpath() 
    {
        return "//option[text()='System administrator']";
    }  
               
        public static String RoleDropDownListXpath() 
    {
        return "//select[@ng-model='selectedRoleId']";
    }    
        
        public static String ClickToSelectedRoleXpath() 
    {
        return "//option[text()='Admin role']";
    }    
                
        public static String ClickSaveOnPermissionsXpath() 
    {
        return "//button[text()='Save']";
    }            
        public static String ValidateAddedPermissionXpath() 
    {
        return "//span[text()='User updated successfully']";
    }    
        public static String OrganisationGroupXpath() 
    {
        return "//a[@class='clickable-cell ng-scope']/span[text()='DVT Automation']";
    }
               
        public static String DescriptionXpath() 
    {
        return "//input[@name='description']";
    } 
        public static String GetListOfSessiontimeXpath() 
    {
        return "//span[text()='Session timeout']/../../select/option";
    } 
        
        
        //////
        
        //AssetsPageObjects
       
             
        public static String AssetsXpath() 
    {
        return "//li/a[text()='Assets']";
    }   
                
        public static String AddAssetsXpath() 
    {
        return "//a[@fleet-tooltip='Add asset']";
    } 
                
        public static String AssetsdescriptionXpath() 
    {
        return "//input[@name='description']";
    } 
        
        public static String AssetTypeXpath() 
    {
        return "//select[@name='assetTypeId']";
    } 
                
        public static String AssetTypeOptionXpath() 
    {
        return "//option[text()='Trailer']";
    } 
               
        public static String RegNumberXpath() 
    {
        return "//input[@name='registrationNumber']";
    } 
     
            public static String SiteXpath() 
    {
        return "//select[@name='siteId']";
    }    
   
            public static String SiteOptionXpath() 
    {
        return "//option[text()='Default Site']";
    } 
                        
        public static String ConfigurationGroupXpath() 
    {
        return "//select[@name='configurationGroupId']";
    } 
        
        public static String ConfigurationOptionXpath() 
    {
        return "//option[text()='default 37 group']";
    } 
                
        public static String CountryXpath() 
    {
        return "//select[@name='country']";
    } 
                
        public static String CountryOptionXpath() 
    {
        return "//option[text()='South Africa']";
    } 
                
        public static String FuelTypeXpath() 
    {
        return "//select[@name='fuelType']";
    } 
        
        public static String FuelTypeOptionXpath() 
    {
        return "//option[text()='Petrol']";
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
            
        public static String MobileDeviceXpath() 
    {
        return "//input[@name='additionalMobileDevice']";
    }   
                
        public static String NotesXpath() 
    {
        return "//textarea[@name='notes']";
    }
               
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
        return "//a[@class='marker-2x marker-asset-trailer2-right active'] || //a[@class='marker-2x marker-asset-trailer2-right']";
    } 
            
        public static String SelectButtonXpath() 
    {
        return "//button[text()='Select']";
    }     
              
        public static String SaveAssetButtonXpath() 
    {
        return "//button[text()='Save']";
    }     
        
        public static String ValidateAddedassetXpath() 
    {
        return "//span[text()='Available']";
    } 
        

     //Trailor Id 
        public static String ValidateAssetsXpath() 
    {
        return "//span[text()='Assets']";
    } 
                
        public static String AssetDescriptionXpath() 
    {
        return "//input[@name='description']";
    } 
        public static String AssetDescriptionColumnHeader() 
    {
        return "//span[@class='title'][text()='Asset description']";
    } 
                
        public static String ClickAssetTypeXpath() 
    {
        return "//option[text()='Select an asset type']";
    } 
                        
        public static String SelectedAssetTypeXpath() 
    {
        return "//option[text()='Trailer']";
    } 
        
        public static String ClickTrailerCheckBox() 
    {
        return "//input[@name='isConnectedTrailer']";
    } 
   
        public static String FilterOnAssetsXpath() 
    {
        return "//div[@class='text-filter empty']/input";
    }
        
        public static String AddTrailerXpath() 
    {
        return "//a/i[@class='icon-plus icon-white']";
    }
                
        public static String ValidateCreatedAsset() 
    {
        return "//a[text()='Asset details']";
    }
        
        public static String ClickOnAssetsXpath() 
    {
        return "//h5[@class='ng-scope']";
    }
                
//        public static String ClickAddedTrailerXpath() 
//    {
//        return "//div[@class='cell alt']/a";
//        
//    }
                        
        public static String ClickAddedTrailerXpath() 
    {
        return "//span[text()='Asset description']//..//../div[@row='0']";
        
    }
                
        public static String ValidateRegistrationXpath() 
    {
        return "//span[text()='Registration number']//..//../div[@row='0']";
        
    }
         
        public static String ClickIconSearchTrailerXpath() 
    {
        return "//a[@class='btn btn-small'][@ng-click='$directive.filter()']";
        //return "//a[@class='btn btn-small']/i[@class='icon-search']";
    }
                
        public static String ClickOnTrailerIdXpath() 
    {
        return "//a[text()='Trailer ID']";
    }
        
        public static String ClickOnChangeIDXpath() 
    {
        return "//a[text()='Change Trailer ID']";
    }
        public static String uniqueTrailerIDErrorXpath() 
    {
        return "//span[text()='Trailer ID must be unique']";
    }
               
        public static String NewTrailerXpath() 
    {
        return "//input[@name='newTrailerId']";
    }
                
        public static String ClickCalenderXpath() 
    {
        return "//div[contains(@class,'datepicker')]/span";
    }
                
        public static String ClickMonthOnCalenderXpath() 
    {
        return "//div[@class='date']/div[1]";
    }
        public static String SelectMonthOnCalenderXpath() 
    {
        return "//div[@class='month-selector zoomable']/div/div[text()='Nov']";
    }
        public static String ClickDoneXpath() 
    {
        return "//a[text()='Done']";
    }
                
        public static String ClickChangeXpath() 
    {
        return "//a[text()='Change']";
    }
        public static String ClickOdometerXpath() 
    {
        return "//a[text()='Change odometer']";
    }
                
        public static String NewOdometerXpath() 
    {
        return "//input[@name='newOdometer']";
    }
                
        public static String ClickChangeOnOdometerXpath() 
    {
        return "//h5[text()='Change odometer']/../../../div[2]/a[text()='Change']";
    }
        public static String MonitorXpath() 
    {
        return "//a[text()='MONITOR ']";
    }     
        
        public static String BackTolactionlistXpath() 
    {
        return "//span[text()='Back to location list']";
    }   
    public static String editLocationLeftPaneSpinnerXpath()
    {
        return "//div[@class='left-pane']//div[@class='loading-overlay'][@style='display: none;']";
    }
        
        public static String MessageboxXpath() 
    {
        return "//a[text()='Message box']";
    }
                
        public static String DefaultoptionsXpath() 
    {
        return "//a[text()='Default options']";
    }

        public static String InstantmessagingXpath() 
    {
        return "//a[text()='Instant messaging']";
    }
              
        public static String LiveTrackingXpath() 
    {
        return "//a[text()='Live tracking']";
    }
        
     
        public static String HistoricalTrackingXpath() 
    {
        return "//a[text()='Historical tracking']";
    }
               
        public static String ManagelocationsXpath() 
    {
        return "//a[text()='Manage locations']";
    }
        
        
        
              
        public static String ManageLocationsXpath() 
    {
        return "//a[text()='Manage locations']";
    }
        
               
        public static String FilterLocationsXpath() 
    {
        return "//input[@placeholder='Filter']";
    }
     
        public static String ValidateManageLocationPageXpath() 
    {
        return "//span[text()='Manage locations']";
    }
       
        
           public static String TableSpinnerXpath() 
    {
        return "//div[@ng-show='contentLoadingStack.length == 0'] ";
    }
       
       
        
        
        
        public static String ClickConfigurationGroupDropDownXpath() 
    {
        return "//select[@name='configurationGroupId']";
    }
                
        public static String SelectConfigurationGroupDisabledXpath() 
    {
        return "//option[text()='Engine Hours Disabled']";
    }
        public static String SelectConfigurationGroupEnableabledXpath() 
    {
        return "//option[text()='Engine Hours Enabled']";
    }
                
        public static String validateConfigurationGroupEnableabledXpath() 
    {
        return "//option[text()='Engine Hours Enabled' and @selected='selected']";
    }
        
        
                
        public static String TargetHourlyFuelConsumptionXpath() 
    {
        return "//span[text()='Target hourly fuel consumption']";
    }
                        
        public static String ClickCancelXpath() 
    {
        return "//button[text()='Cancel']";
    }

        public static String ClickYesButtonXpath() 
    {
        return "//button[text()='Yes']";
    }
                
        public static String ValidateCcancellationXpath() 
    {
        return "//h5[text()='Changes not saved']";
    }
        
     public static String ActionbarXpath() 
    {
        return "//div[@row='1']//a[@class='row-action'] ";
    }
              
        public static String DiagnosticsXpath() 
    {
        return "//a[@row-index= 0][@event='Diagnostics']";
    }          
        public static String EditXpath() 
    {
        return "//a[@row-index= 1][@event='Edit']";
    }  
          
      //AddFuelEntry
        public static String FueldataXpath() 
    {
        return "//a[text()='Fuel data']";
    }  
               
        public static String AddEntryXpath() 
    {
        return "//button[text()='Add entry']";
    }  
                  
        public static String DateAndTimeXpath() 
    {
        return "//span[text()='Date and time']//..//..//..//input";
    }  
        
        public static String OdometerXpath() 
    {
        return "//span[text()='Odometer']//..//..//..//input";
    }  
         
        public static String GroupnameXpath() 
    {
        return "//span[text()='Group name']//..//..//..//input";
    }  
        
        public static String EngineHoursXpath() 
    {
        return "//input[@name='engineHours']";
    }  
        public static String VolumeXpath() 
    {
        return "//span[text()='Volume']//..//..//..//input";
    }  
        
        public static String GroupDescriptionXpath() 
    {
        return "//label[text()='Description']//..//..//..//textarea";
    }  
                        
        public static String ClickGroupTypeXpath() 
    {
        return "//span[text()='Group type']//..//..//select";
    }  
                
        public static String ClickAssetsOptionXpath() 
    {
        return "//option[text()='Assets']";
    }  
        
        
        
                
        public static String TransactionAmountXpath() 
    {
        return "//input[@name='transactionAmount']";
    } 
        public static String SelectDatedXpath() 
    {
        return "//div[@class='day ng-scope ng-binding selected']";
    } 
        public static String ValidateCaptureFuelEntrypageXpath() 
    {
        return "//h5[text()='Capture fuel entry']";
    } 
                
        public static String ClickOkButtonXpath() 
    {
        return "//div[@aria-hidden=\"false\"]//button[text()='OK']";
    } 
                
        public static String validaterecordXpath() 
    {
        return "//div[contains(@class,'show-validity')]//..//span[text()='Fuel record already exists for specified date']";
    } 
              
        public static String DisabledSaveButtonXpath() 
    {
        return "//button[@disabled='disabled']";
    }   
                
        public static String DisabledNextButtonXpath() 
    {
        return "//button[@disabled='disabled']";
    }  
                
        public static String ClickGroupMembershipXpath() 
    {
        return "//a[text()='Group membership']";
    }          
        
        public static String ClickCreateNewButtonXpath() 
    {
        return "//span[text()='CREATE NEW']";
    }  
        public static String ClickJobXpath() 
    {
        return "//a[text()='Job']";
    }     
        public static String ClickMessageXpath() 
    {
        return "//a[text()='Message']";
    }   
        
        public static String ClickSMSMessageXpath() 
    {
        return "//a[text()='SMS Message']";
    }   
        public static String ClickMyMiXMessageXpath() 
    {
        return "//a[text()='MyMiX Message']";
    }   
        
        public static String ValidateLiveTrackingMapXpath() 
    {
        return "//a[@fleet-tooltip='Create location']//..//..//..//../div/select/../..";
    } 
        
        
        public static String ClickAddLocationXpath() 
    {
        return "//i[@class = 'icon-plus icon-white']";
    }    
        
        
        public static String ClickCreateLocationXpath() 
    {
        return "//a[@fleet-tooltip='Create location']";
    }     
        public static String ClickFind()
        {
            return "//a[@fleet-tooltip='Find']";
        }
        public static String clickSave()
        {
            return "//button[text() = 'Select']";
        }
        public static String ClickLocations()
        {
            return "//div[@class = 'selection-criteria']//a[@fleet-tooltip='Locations']";
        }
        public static String selectAll()
        {
            return "//span[@fleet-tooltip = 'Location name']/../..//th[1]";
        }
        public static String ClickMapLayers()
        {
            return "//a[@fleet-tooltip='Map layers']";
        }
        public static String ClickFindAPlace()
        {
            return "//a[contains(text(), 'Find a place')]";
        }
        public static String ClickLocationLabels()
        {
            return "//span[text() = 'Location labels']/../div/../input";
        }
        public static String expandAssetLabelXpath()
        {
            return "//span[@class = 'daredevel-tree-anchor ui-icon icon-plus ng-scope']";
        }
         public static String CheckBoxAssetDescriptionUsingXpath()
        {
            return "//ul[contains(@options,'options')]/li/div/div/span[text()='Asset description']/../input";
        }
        public static String checkboxAssetDescription()
        {
            return "//ul[contains(@options,'options')]/li/div/div/span[text()='Asset description']";
        }
        public static String LocationlabelXpath()
        {
            return "//span[text() = 'Location labels']/../div/.";
        }
        public static String assetDescription()
        {
            return "//div[text() = 'Asset 4']";
        }
        public static String clickClose()
        {
            return "//div[@class = 'page-header']//button[@class ='close']";
        }
         public static String ClickSaveButton()
        {
            return "//button[@class = 'btn btn-success pull-right ng-binding']";
        }
        public static String ClickALocation()
        {
            return "//div[@class='toolbar-criteria' and @style[not(contains(.,'display: none;'))]]//span[text()= 'A location']";
        }
        public static String EnterLocationTextbox()
        {
            return "//input[@id = 'LocationAutoAsset']";
        }
        public static String AutoCompleteText()
        {
            return "//ul[@class=\"ui-autocomplete ui-menu ui-widget ui-widget-content ui-corner-all\" and @style[contains(.,'display: block')]]";
        }
        public static String AutoCompleteFindAPlace()
        {
            return "//ul[@class=\"ui-autocomplete ui-menu ui-widget ui-widget-content ui-corner-all\"]//li/a[text() = 'Green Grocer']";
        }
        public static String LocationLabel()
        {
            return "//div[@class = 'leaflet-overlay-pane']//*[local-name()='text'][contains(@style,'visible')][1]";
        }
        public static String ClickCircle() 
    {
        return "//a[@fleet-tooltip='Circle']";
    }  
               
        public static String ClickRectangle() 
    {
        return "//a[@fleet-tooltip='Rectangle']";
    } 
            public static String ClickPolygon() 
    {
        return "//a[@fleet-tooltip='Polygon']";
    }
            public static String ClickPolyline() 
    {
        return "//a[@fleet-tooltip='Polyline']";
    }
                   
            public static String ClickRectangleImage() 
    {
        return "Rectangle.png";
    } 
            
            
         public static String ValidateTooltipXPath() 
    {
        return "//span[text()='Click and drag to draw circle.']";
    }
            

        
                

         
        public static String LocationNameXpath() 
    {
        return "//span[text()='Location name']//..//../input";
    }  
             
        public static String ColorXpath() 
    {
        return "//label[text()='Location colour']//../a[5]";
    }  
          
        public static String ClickOnOpaCityXpath() 
    {
        return "//label[text()='Opacity']//../div/a";
    }  
     
        public static String ClickOnNotifyXpath() 
    {
        return "//span[text()='Notify me when an asset enters this location']//../input";
    }  
                
        public static String ClickOnLocationDetailsXpath() 
    {
        return "//a[text()='Locations details']";
    }  
        
        public static String ContactnameXpath() 
    {
        return "//label[text()='Contact name']//../input";
    }  
                    
        public static String HomenumberXpath() 
    {
        return "//label[text()='Home number']//../input";
    }             
             
        public static String WorknumberXpath() 
    {
        return "//label[text()='Work number']//../input";
    }  
                    
        public static String MobilenumberXpath() 
    {
        return "//label[text()='Mobile number']//../input";
    }  
        
        public static String EmailaddressXpath() 
    {
        return "//label[text()='Email address']//../input";
    }  
                
        public static String ClickSubmitButtonXpath() 
    {
        return "//button[text()='Submit']";
    }  
        
        public static String ClickSaveLocationXpath() 
    {
        return "//a[text()='Locations details']//..//..//../div/button[text()='Save']";
    }  
                        
        public static String ClickOnAssetXpath() 
    {
        return "//canvas[@id='-7167083220742265087']";
    }  
            public static String ValidateSuccessMessageXpath() 
    {
        return "//span[text()='Location successfully created']";
    }
           public static String ClickOnTrackingAssetXpath() 
    {
        return "//canvas[@class='radar radar-green']";
    }  
     
      
        
               
        public static String ValidateSavedLocationXpath() 
    {
        return "//span[text()='Location successfully updated']";
    } 
        
        public static String FilterFieldXpath() 
    {
        return "//input[@placeholder='Filter']";
    }  
        
                
        public static String ClickRadioButtonXpath() 
    {
        return "//td/input[@type='radio']";
    }  
        
  public static String selectRadioButton() 
    {
        return "//span[text()='SAT Unit']/../../../td/input[@type='radio']";
    }  
        
        public static String ClickCheckBoxButtonXpath() 
    {
        return "//td/input[@type='checkbox']";
    }  
        
        
        
        public static String ClickJobCalenderXpath() 
    {
        return "//div[@name='startDate']/span";
    }
                
        public static String WhenDateXpath() 
    {
        return "//div[@name='startDate']/input";
    }
                
        public static String ToDateXpath() 
    {
        return "//div[@name='endDate']/input";
    }
        
        
                
        public static String MessageDetailsCheckBoxXpath() 
    {
        return "//label[text()='Select pre-defined message']//../label/input";
    }
        
        public static String SubjectFieldXpath() 
    {
        return "//input[@name='subject']";
    } 
          
        public static String MessageFieldXpath() 
    {
        return "//textarea[@name='message']";
    } 
    public static String subjecCharacterCountXpath()
    {
         return "//label[text()='Subject']/../div[@class='help-block rt ng-binding']";
    }  
    public static String messageCharacterCountXpath()
    {
         return "//label[text()='Message']/../div[@class='help-block rt ng-binding'][2]";
    }
    public static String AddAddressOptionXpath() 
    {
        return "//strong[text()='click here']//..";
    } 
              
        public static String PreDefinedXpath() 
    {
        return "//span[text()='Make use of pre-defined replies']//../input";
    } 
        
        public static String ClickYesXpath() 
    {
        return "//span[text()='Yes']//../input";
    } 
     
        public static String AddressOptionXpath() 
    {
        return "//span[text()='Address']";
    } 
        
        public static String ChooseCountryXpath() 
    {
        return "//span[text()='Address']//..//../span[2]/div/select[1]";
    } 
        public static String ChoosenCountryXpath() 
    {
        return "//option[text()='South Africa']";
    } 
                   
        public static String InputAddressXpath() 
    {
        return "//input[@placeholder='Enter address']";
    }   
                
        public static String CreateAddressCheckBoxXpath() 
    {
        return "//span[text()='Create this address as a location']//../input";
    }  
              
        public static String MessageSelectButtonXpath() 
    {
        return "//span[text()='Address']//..//../button[text()='Select']";
    }     
               
        public static String SelectAssetXpath() 
    {
        return "//button[text()='Select asset']";
    }    
        
                
        public static String PointOneXpath() 
    {
        return "//div[@class='leaflet-control-scale leaflet-control']";
    }    
    public static String point1xpath()
    {
      return  "//div[@class = 'leaflet-overlay-pane']//*[local-name()='text'][contains(@style,'visible')][1]";
    }
    public static String point2xpath()
    {
        return "//div[@class = 'leaflet-overlay-pane']//*[local-name()='text'][contains(@style,'visible')][1]";
    }
        
              
        public static String PointTwoXpath() 
    {
        return "//div[@class='leaflet-control-scale leaflet-control']/div[2]";
    }  
        
     
        public static String LocationTypeXpath() 
    {
        return "//span[text()='Location type']//..//../select";
    }  
                public static String LocationTypeOptionXpath() 
    {
        return "//span[text()='Location type']//..//../select/option[text()='Customer']";
    }
            public static String LocationTypeOptionNoGoZoneXpath() 
    {
        return "//span[text()='Location type']//..//../select/option[text()='No-go zone']";
    }
             public static String LocationTypeOptionSiteXpath() 
    {
        return "//span[text()='Location type']//..//../select/option[text()='Site']";
    }       
         public static String LocationTypeOptionOtherXpath() 
    {
        return "//span[text()='Location type']//..//../select/option[text()='Other']";
    }        
       
         public static String LocationTypeOptionStreetPolylineXpath() 
    {
        return "//span[text()='Location type']//..//../select/option[text()='Street Polyline']";
    }    
           
         public static String LocationTypeOptionFuelStopXpath() 
    {
        return "//span[text()='Location type']//..//../select/option[text()='Fuel stop']";
    }   
         
           public static String LocationTypeOptionRestStopXpath() 
    {
        return " //span[text()='Location type']//..//../select/option[text()='Rest stop']";
    }  
           
             public static String LocationTypeOptionSpeedZoneXpath() 
    {
        return " //span[text()='Location type']//..//../select/option[text()='Speed zone']";
    }  
           
           

                
        public static String SelectSiteXpath() 
    {
        return "//span[text()='Site']//..//../select";
     
    }  
        
                
        public static String LocationSiteOptionXpath() 
    {
        return "//span[text()='Site']//..//../select/option[3]";
    }  
        
                public static String LocationSiteOptionIEXpath() 
    {
        return "//span[text()='Site']//..//../select/option[text()='Default Site']";
    }  
        
        

        public static String MessageSelectAssetXpath() 
    {
        return "//button[text()='Select assets']";
    }    
             
        
        public static String JobSaveButtonXpath() 
    {
        return "//h5[text()='Create new job']//../div/div/button[text()='Save']";
    }   
                
        public static String ClickSendNowXpath() 
    {
        return "//span[text()='Send now']";
    }
        
        
        
                        
        public static String ClickSavetodraftsXpath() 
    {
        return "//span[text()='Save to drafts']/../input";
    }
                
        public static String ClickSendXpath() 
    {
        return "//button[text()='Send']";
    }
                
        public static String ClickSaveToSendMessageXpath() 
    {
        return "//span[text()='Send message']//..//..//..//..//..//../div[@class='modal-footer']/button[text()='Save']";
    }
        
            
        public static String ClickCancelMessageXpath() 
    {
        return "//span[text()='Send message']//..//..//..//..//..//../div[@class='modal-footer']/button[text()='Cancel']";
    }
        
        
                
        public static String ClickSaveDraftXpath() 
    {
        return "//div[@name=\"saveModal\"]/div[@class='modal-footer']/button[text()='Save']";
    }
        
        
               
        public static String ClickEnteredAddressXpath() 
    {
        return "//strong[text()='Cape Town']/..//..//..//../ul/li[1]/a";
    }  
               
        public static String ClickEnteredLocationXpath() 
    {
        return "//strong[text()='Cape']/..//..//..//../ul/li[1]/a";
    }   
                
        public static String NewJobToXpath() 
    {
        return "//span[text()='To']//..//../input[1]";
    }  
        
    public static String SubjectFieldCharsXpath() 
    {
        return "//div[@id='subjectError']//../div[text()='0/20']";
        
    }          
    public  static String SubjectFieldChars2Xpath() 
    {
        return "//div[@id='subjectError']//../div[text()='0/30']";
        
    }   
    public static String ValidateSubjectFieldXpath() 
    {
        return "//input[@class='span12 ng-dirty ng-valid-dmx-required ng-invalid ng-invalid-dmx-max-utf8length show-validity']";
    }  
        public static String ValidateMessageFieldXpath() 
    {
        return "//textarea[@class='span12 no-resize ng-dirty ng-valid-dmx-required ng-invalid ng-invalid-dmx-max-utf8length show-validity']";
    }  
    public static String ValidateSubjectFieldCharsXpath() 
    {
        return "//div[@id='subjectError']//../div[text()='0/30']";
    }  
          
    public static String MessageFieldCharsXpath() 
    {
        return "//div[@id='messageError']//../div[text()='0/120'] ";
       
    }   
    public static String MessageFieldChars2Xpath() 
    {
        return "//div[@id='messageError']//../div[text()='0/900']";
       
    }            
        public static String ValidateMessageFieldCharsXpath() 
    {
        return "//div[@id='messageError']//../div[text()='0/900'] ";
    } 
                
        public static String ClickLatitudeLongitudeXpath() 
    {
        return "//span[text()='Latitude/Longitude']";
    }
                
        public static String InputlatitudeXpath() 
    {
        return "//input[@name='latitude']";
    }
            
        public static String InputLongitudeXpath() 
    {
        return "//input[@name='longitude']";
    }
                
        public static String CreateLongitudeLatitudeCheckBoxXpath() 
    {
        return "//span[text()='Create this Longitude/Latitude as a location']";
    }  
            
        public static String ClickSearchButtonXpath() 
    {
        return "//label[text()='Longitude']//../div/button";
    }
                
        public static String InputlocationXpath() 
    {
        return "//span[text()='Location']//..//../span[1]/input";
    }
                
        public static String ClickLocationXpath() 
    {
        return "//span[text()='Location']//../input";
    }
               
        public static String ClickMessageExpiresCheckBoxXpath() 
    {
        return "//span[text()='Message expires on (CAT/SAST)']//../input";
    }
                
        public static String ExpiresDateXpath() 
    {
        return "//div[@name='expiryDate']/input";
    }
           
        public static String todayDateXpath() 
    {
        return  "//div[@class='day ng-scope ng-binding selected']";
    }

           public static String clickTodayDateXpath(String day) 
    {
        return  "//div[text()='"+ day +"'][@class='day ng-scope ng-binding selected']";
    }   
          
           public static String clickFutureDateXpath(String day) 
    {
        return  "//div[@class='datepicker-widget in']/div/div/div/div/div[text()='"+ day +"']";
    }
           
           
                
            public static String datepickerXpath() 
    {
        return  "//span[text()='Message expires on (CAT/SAST)']//..//../div/div/div/span";
    }  
        
            public static String WhendatepickerXpath() 
    {
        return  "//span[text()='When']//..//../div/div[1]/div/span";
    }  
                    
           
            public static String TodatepickerXpath() 
    {
        return  "//span[text()='to']//../div/span";
    }  
            
                  
    public static String ViewDetailsXpath() 
    {
        return  "//span[text()='View details']";
    }  
                
    public static String LiveTrackingDiagnosticsXpath() 
    {
        return  "//span[text()='Diagnostics']";
    }             
    public static String RecordListXpath() 
    {
        return  "//ul[@class='dropdown-menu pull-right']";
    }  
    
  public static String DoneOnTOXpath() 
    {
        return  "//span[text()='to']/../div/span/i/../../../../../../../../../../../../../../../../../../../div[@class='datepicker-widget in']/div[@class='done']/a[text()='Done']";
    }
        
    public static String ActionButtonRelativeXpath() 
    {
        return "//div[@ng-show='rowActions']/ul/li[2]/div/div/a[@fleet-tooltip='Actions']";
    }
    public static String addedLocationXpath(String location)
    {
        return "//span[text()='"+location+"']/..";
    }
    
    public static String JobdraftList(){
        return "//tbody/tr/td[@column-field='recipient']";
    }
    
    public static String BackToLocation(){
        return "//span[text()='Back to location list']";
    }
    
    public static String ViewRelativeXpath() 
    {
        return "//div[@ng-show='rowActions']/ul/li[2]/div/div/a[@fleet-tooltip='Actions']/../../../../../../../../../../../../../../../../../../../../../../..//ul[3]/li//a/span[text()='View']";
    }
  
    public static String EditRelativeXpath() 
    {
        //return "//div[@ng-show='rowActions']/ul/li[2]/div/div/a[@fleet-tooltip='Actions']/../../../../../../../../../../../../../../../../../../../../../../..//ul[contains(@style,'block')]/li[1]/a/span[text()='Edit']";
        return "//div[@ng-show='rowActions']/ul/li[2]/div/div/a[@fleet-tooltip='Actions']/../../../../../../../../../../../../../../../../../../../../../../..//ul[contains(@style,'block')]/li/a/span[text()='Edit']";
    }
    
    public static String EditLocationXpath() 
    {
        return  "//ul[@class = 'dropdown-menu pull-right']//span[text() = 'Edit']";
    }  
    
    public static String BackButtonXpath() 
    {
        return  "//span[text()='Back to location list']";
    }  
    
    public static String RemoveJobDraftXpath() 
    {
        return "//div[@ng-show='rowActions']/ul/li[2]/div/div/a[@fleet-tooltip='Actions']/../../../../../../../../../../../../../../../../../../../../../../..//ul[contains(@style,'block')]/li[3]/a/span[text()='Remove']";
    }
    
    public static String RemoveLocationXpath() 
    {
        return  "//ul[@class = 'dropdown-menu pull-right']//span[text() = 'Remove']";
    } 
    
    
    public static String LocationRemoveButtonXpath() 
    {
        return  "//div[@class = 'modal hide fade ng-scope modal-mini in']//button[text() = 'Remove']";
    }  
          
    public static String RemoveSentItemsXpath() 
    {
        return  "//ul[@class='dropdown-menu pull-right'][1]/li/a/span[text()='Remove']";
    }  

    public static String ViewJobDraftXpath() 
    {
        return  "//ul[4]/li/a/span[text()='View']";
    }  
    
        public static String RemoveButtonXpath() 
    {
        return  "//div[@name='removeConfirmationModal']/div/button[text()='Remove']";
    }  
      
    public static String LocationDetailsXpath() 
    {
        return  "//table[@class='table table-striped']/tbody/tr/td[2]";
    }  
        public static String JobDraftsXpath() 
    {
        return  "//a[text()='Job drafts']";
    }  
      
            public static String SentItemsXpath() 
    {
        return  "//a[text()='Sent items']";
    }  
                        
            public static String JobdraftsXpath() 
    {
        return  "//a[text()='Job drafts']";
    }  
            
                        
            public static String InboxXpath() 
    {
        return  "//span[text()='Inbox']";
    }  
            
            
            
                        
            public static String CancelButtonXpath() 
    {
        return  "//h5[text()='Edit job']//../div/div/button[text()='Cancel']";
    }  
            
            public static String YesButtonXpath() 
    {
        return  "//button[text()='Yes']";
    }  
    
            public static String ContinueButtonXpath() 
    {
        return  "//button[text()='Continue']";
    }  
            
            
    public static String SelectButtonSecurityGroupXpath()
    {
        return "//div[@class=\"miller-selector-modal-container white-box-shadow ng-scope in\"]//a[text()='Select']";
        //return "html/body/div[25]/div[3]/div/a[2]";
    }
            
    public static String SelectUsersByXpath()
    {
        return "//h5/a[text()='Users']";
    }
    public static String FilterByXpath()
    {
        return "//input[@placeholder='Filter']";
    }
    public static String StatusInfoByXpath()
    {
        return "//div[@class='dropdown pull-right']/a/span";
    }
    public static String ActionButtonXpath()
    {
        return "//div/a[@fleet-tooltip='Actions']";
    }
    public static String ReasonForDeletingDropDownListXpath()
    {
        return "//div[@class='alert alert-danger']//..//select";
    }
    public static String ButtonDeleteXpath()
    {
        return "//button[text()='Delete']";
    }
            
    public static String UserRemovedSuccessfullyXpath()
    {
        return "//span[text()='User removed successfully']/../../../div[@class='notification-wrapper notification-modal ng-scope'][contains(@style,'display: none;')]";
    }
    public static String SelectUserByXpath()
    {
        return "//a/span[text()='Tester_Dvt1 tester']";
    }
    public static String RemoveLinkByXpath()
    {
        return "//li/a/span[text()='Remove']";
    }
            
        
}
