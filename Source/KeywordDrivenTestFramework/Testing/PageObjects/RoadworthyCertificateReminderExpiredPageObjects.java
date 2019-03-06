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
public class RoadworthyCertificateReminderExpiredPageObjects 
{
    public static String MixTelematicsURL() {
        return currentEnvironment.PageUrl;
    }
    public static String ImportButtonXpath()
    {
         return "//a/i[@class='icon-import']";
    }
    
    public static String RecipientName()
    {
        return "//tbody/tr[1]/td[@column-field='fullName']";
    }
    
    public static String ChooseFileButtonXpath()
    {
         return "//span/span[text()='Choose file']/../span[text()='Choose file']";
    }
     public static String ManageMenuRelativeXpath() 
    {
        return "//a[text()='MANAGE ']";
    }
    
    public static String MonitorMenuRelativeXpath() 
    {
        return "//a[text()='MONITOR ']";
    }
    
    public static String DatabaseAdministrationRelativeXpath() 
    {
        return "//div[@ng-repeat='module in section.modules']//a[text()='Database administration']";
    }
    
    public static String AssetSubMenuRelativeXpath() 
    {
        return "//a[text()='Assets']";
    }
    
    public static String TestRSOTreeRelativeXpath() 
    {
        return "//strong[text()='Test RSO']/../../../../span[@class='daredevel-tree-anchor ui-icon icon-plus ng-scope']";
    }
    
    public static String DVTAutomationOrgRelativeXpath() 
    {
        return "//strong[text()='DVT Automation']";
    }
    
    public static String MeasurementSettingsRelativeXpath() 
    {
        return "//a[text()='Measurement settings']";
    }
    
    public static String LanguageRelativeXpath() 
    {
        return "//select[@name='languageCode']//option[text()='English']";
    }
    
    public static String MeasurementUnitsRelativeXpath() 
    {
        return "//select[@name='measurementType']//option[@selected='selected']";
    }
        
    public static String OrganisationSettingsXpath() 
    {
        return "//a[text()='Organisation settings']";
    }
        public static String ClickIntervalandReminderXpath() 
    {
        return "//a[text()='Asset interval and reminder defaults']";
    }
        
        public static String ClickLicenceCertificateXpath() 
    {
        return "//a[text()='Default licence']";
    }
                       
        public static String LicenceDurationXpath() 
    {
        return "//label[text()='Licence duration']/..//input";
    }
                            
        public static String ReminderPeriodXpath() 
    {
        return "//form[@name='assetLicenceForm']//input[@name='reminderPeriod']";
    }
        public static String ClickRoadworthyCertificateXpath() 
    {
        return "//a[text()='Default roadworthy certificate']";
    }
            
        public static String EditOrganisationSpinnerXpth()
        {
            return "//div/div//div[@ng-show='loadingStack && loadingStack.length > 0']";
        }
        
        public static String DurationXpath() 
    {
        return "//label[text()='Certificate duration']/..//input";
    }
                    
        public static String PeriodXpath() 
    {
        return "//form[@name='assetRoadworthyForm']//input[@name='reminderPeriod']";
    }
            public static String RemindersXpath() 
    {
        return "//a[text()='Reminders']";
    }
            public static String RoadCertificeXpath() 
    {
        return "//a[text()='Roadworthy certificate']";
    }

            public static String LicenceXpath() 
    {
        return "//a[text()='Licence']";
    }
            public static String FormInvalidXpath() 
    {
        return "//form[@name='assetRoadworthyForm']/div/div[@disabled='disabled' and @name='validFrom']";
    }
            
            public static String EnableroadworthycertificateXpath() 
    {
        return "//span[text()='Enable roadworthy certificate reminders']/../input";
    }
            
            public static String EnablelicenceremindersXpath() 
    {
        return "//span[text()='Enable licence reminders']/../input";
    }
                    
          
            public static String ValidfromXpath() 
    {
        return "//form[@name='assetRoadworthyForm']//span[text()='Valid from']/..//..//input";
    }
                        
            public static String ValidateLicenceFormXpath() 
    {
        return "//form[@name='assetLicenceForm']//span[text()='Valid from']/..//..//input[@disabled='disabled']";
    }
                        
            public static String LicenceValidfromXpath() 
    {
        return "//form[@name='assetLicenceForm']//span[text()='Valid from']/..//..//input";
    }
            
            public static String ExpirydateXpath() 
    {
        return "//form[@name='assetRoadworthyForm']//span[text()='Expiry date']/..//..//input";
    }  
                        
            public static String LicenceExpirydateXpath() 
    {
        return "//form[@name='assetLicenceForm']//span[text()='Expiry date']/..//..//input";
    }  
           
            public static String ReminderperiodXpath() 
    {
        return "//form[@name='assetRoadworthyForm']//label[text()='Reminder period']//..//input";
    }  
            
            public static String LicenceReminderperiodXpath() 
    {
        return "//form[@name='assetLicenceForm']//label[text()='Reminder period']//..//input";
    }  
            public static String ValidateLicenceExpiredDateXpath() 
    {
        return "//form[@name='assetLicenceForm']/div[@class='alert ng-binding alert-error']";
    } 
    public static String ValidateLicencesExpiredDateXpathError() 
    {
        return "//div[@class='alert alert-error'][@ng-show='daysOverdue > 1']/span[1]";
            //form[@class='ng-valid ng-valid-dmx-required ='']/ng-dirty']
    }        
                            
    public static String ValidateLicencesExpiredDateXpath() 
    {
        return "//div[@class='alert alert-info'][@ng-show='daysDue > 1']/span[1]";
            //form[@class='ng-valid ng-valid-dmx-required ='']/ng-dirty']
    }   
                //ng-valid-dmx-required ng-dirty ng-invalid ng-invalid-dmx-greater-than ng-invalid-dmx-less-than
            
    public static String ValidateLicenceExpireSoonDateXpath() 
    {
        return "//form[@name='assetLicenceForm']/div[@class='alert ng-binding alert-info']";
    }   
                 
            public static String ClickSelectRecipientXpath() 
    {
        return "//form[@name='assetRoadworthyForm']//button[text()='Select recipients']";
    }  
            
            public static String ClickLicenceSelectRecipientXpath() 
    {
        return "//form[@name='assetLicenceForm']//button[text()='Select recipients']";
    }  
                       
            public static String ClickLicencesSelectRecipientXpath() 
    {
        return "//form[@name='driverLicenceForm']//button[text()='Select recipients']";
    }  

            
            public static String FilterXpath() 
    {
        return "//input[@placeholder='Filter']";
    }
                       
            public static String DriverFilterXpath() 
    {
        return "//strong[text()='All']//..//..//../div/div/input";
    }
                                   
            public static String DriverSearchButtonXpath() 
    {
        return "//strong[text()='All']//..//..//../div/div/a";
    }
            
            public static String ExistingRecipient()
        {
            return "//div[@selection='roadworthy.selectedContacts']//div[@ng-repeat='id in selection | orderBy:getName'][1]/div/a";
        }
            
            public static String CheckBoxXpath() 
    {
        return "//tbody[@fleet-draggable-group='draggable']//..//td[1]//input[@type='checkbox']";
    }    
                        
    public static String LicencesCheckBoxXpath() 
    {
        return "//input[@placeholder='Filter']//..//..//../div[2]//tbody[@fleet-draggable-group='draggable']/tr[1]/td/input[1]";
    } 
            
            public static String ValidateCheckBoxXpath() 
    {
        return "//tbody[@fleet-draggable-group='draggable']//..//td[1]//input[@checked='checked' and @type='checkbox']";
    } 
    public static String FirstCheckBoxXpath() 
    {
        return "//div/h5/span[text()='Select recipients']//..//..//..//table[@class='table table-scroll table-condensed table-list no-text-clip']/tbody/tr[1]/td[1]/input[1]";
    } 
            
            public static String ClickSelectXpath() 
    {
        return "//button[text()='Select']";
    }   
                      
            public static String RemoveRecipientXpath() 
    {
        return "//form/div[9]/div/div/div/div[1]/div/a";
    }   
                       
            public static String ClickIfRecipientDoesnotExistXpath() 
    {
        return "//form[@name='assetRoadworthyForm']//strong[text()='click here']/..";
    }         
                        
            public static String ClickIfRecipientDoesnotExistLicenceXpath() 
    {
        return "//form[@name='assetLicenceForm']//strong[text()='click here']/..";
    }  
                        
            public static String ClickIfRecipientDoesnotExistLicencesXpath() 
    {
        return "//form[@name='driverLicenceForm']//strong[text()='click here']/..";
    }  
            
                    
            public static String FirstNameXpath() 
    {
        return "//input[@name='firstName']";
    }   
            
            public static String LastNameXpath() 
    {
        return "//input[@name='lastName']";
    }  
                      
            public static String EmployerXpath() 
    {
        return "//input[@name='employer'] ";
    }    
            public static String PositionXpath() 
    {
        return "//input[@name='position']";
    }    
            public static String HomeNumberXpath() 
    {
        return "//input[@name='homeNumber']";
    }    
                        
            public static String WorkNumberXpath() 
    {
        return "//input[@name='workNumber']";
    }    
            
            public static String MobileNUmberXpath() 
    {
        return "//input[@name='mobileNumber']";
    }   
            public static String EmailAddressXpath() 
    {
        return "//input[@name='email']";
    }   
            
        public static String SubmitXpath() 
    {
        return "//button[text()='Submit']";
    }   
        
            public static String SaveXpath() 
    {
        return "//button[text()='Save']";
    }   
            
            
            
        /////////////////////////////////////////////////////////////////////////////////////////
                        
            public static String DateAttachtedXpath() 
    {
        return "//span[text()='Date attached']//..//..//input";
    }   
                      
            public static String ValidateExpiredDateXpath() 
    {
        return "//form[@name='assetRoadworthyForm']/div[@class='alert ng-binding alert-error']";
    }   
           
                        
            public static String ValidateExpireSoonDateXpath() 
    {
        return "//form[@name='assetRoadworthyForm']/div[@class='alert ng-binding alert-info']";
    }   
        
                            
                
            
            
            
            
    
}
