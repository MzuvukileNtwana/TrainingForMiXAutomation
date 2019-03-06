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
public class RemindOnDistancePageObject {
      public static String manageXpath()
        {
            return "//a[text()='MANAGE ']";
        } 
            // Database administration Xpath
        public static String databaseAdministrationXpath()
        {
            return "//li/a[text()='Database administration']";
        } 
            //Manage organisation structure Xpath
        public static String manageOrganisationStructureXpath()
        {
            return "//span[text()='Manage organisation structure']";
        } 
         public static String mixTelematics()
        {
            return "//strong[text()='MiX Telematics']";
        } 
         
            //(+) button for 001 Testing Xpath
        public static String btn001TestingXpathXpath()
        {
            return "//strong[text()='001 SG Testing']/../../../../span";
        } 
            //click (+) button for 001 Dealer
        public static String btn001DealerXpathXpath()
        {
            return "//strong[text()='001 Dealer']/../../../../span";
        } 
            //click (+) button for 001 MLO
        public static String btn001MLOXpathXpath()
        {
            return " //strong[text()='001 MLO']/../../../../span";
        }  
            //Org2React Organisation 
        public static String org2ReactXpath()
        {
            return "//div[@ng-class='{ selected: item[mapping.checkedProperty], disabled: item.isActive == false }']/a/strong[text()='Org2React']";
        } 
            //Measurement settings Xpath
        public static String measurementSettingsXpath()
        {
            return "//a[text()='Measurement settings']";
        } 
            //Regional Settings Xpath
        public static String regionalSettingsXpath()
        {
            return "//h6[text()='Regional Settings']";
        } 
             // language Selected Xpath 
        public static String languageSelectedXpath()
        {
            return "//span[text()='Language']/../../select";
        }       
        //Inspect the Measurement units selected

        public static String measurementUnitsSelectedXpath()
        {
            return "//span[text()='Measurement units']/../../select";
        } 
            //Monitor Xpath
         public static String monitorXpath()
        {
            return "//a[text()='MONITOR ']";
        } 
            //Assets Tab Xpath
         public static String assetsXpath()
        {
            return "//a[text()='Assets']";
        }
         //reminders Xpath
        public static String remindersXpath()
        {
            return "//a[text()='Reminders']";
        } 
        public static String organisationDetailsXpath()
        {
            return "//h5[text()='Organisation details']";
        } 
        public static String assetRowIndexZeroXpath()
        {
            return "//a[@row-index='0']";
        } 
        public static String allXpath()
        {
            return "//strong[text()='All']";
        } 
        public static String assetDetailsPageXpath()
        {
            return "//h5[text()='Asset details']";
        } 

        public static String remindersforAssetDescriptionPageXpath()
        {
            return "//h5[text()='Reminders for ']";
        } 
         public static String currentOdometerXpath()
        {
            return "//span[text()='Current odometer: ']";
        } 
         public static String rimindSoonXpath()
        {
            return "//form[@name='assetServiceForm']/div[contains(.,'Overdue by')]";
        } 
         
         public static String dueSoonXpath()
        {
            return "//form[@name='assetServiceForm']/div[contains(.,'Due in')]";
        } 
         public static String overdueSoonXpath()
        {
            return "//form[@name='assetServiceForm']/div[contains(.,'Overdue')]";
        } 
         public static String lastServiceRecordedXpath()
         {
             return "//span[contains(text(),'Last service recorded on')]";
         }
         public static String calendarButtonXpath()
         {
             return "//div[@name='nextDate']/span";
         }
         public static String monthXpath()
         {
             return "//div[@class='datepicker-widget in']//div[@class='month-of-year ng-binding']";
         }
         public static String monthToSelectXpath(int month)
         {
             return "//div[@class='datepicker-widget in']//div[contains(@class,'month ng-scope ng-binding')]["+month+"]";
         }
         public static String dateOnPageXpath()
         {
             return "//span[contains(text(),'Last service recorded on')]/strong";
         }
         public static String dayToSelectXpath(String day)
         {
             return "//div[@class='datepicker-widget in']//div[@ng-repeat='day in directive.daysInMonth'][text()='"+day+"']";
         }
         public static String doneButtonXpath()
         {
             return "//div[@class='datepicker-widget in']//a[text()='Done']";
         }
         
         
         public static String RemindOnDurationCheckbox()
        {
            return "//input[@name='enableDurationReminders']";
        } 
         
         public static String RemindOnEngine()
        {
            return "//span[text()='Remind on engine hours']";
        } 
         
        public static String lastServiceRecordedOnXpath()
        {
            return "//span[text()='Last service recorded on ']";
        } 
        public static String date()
        {
            return "//div[@class=\"span12 datepicker ng-pristine ng-valid ng-valid-dmx-required\"]/input";
        } 
        public static String txtServiceIntervalKilometresXpath()
        {
            return "//input[@name='distanceInterval']";
                    //"//div[@ng-class=\"{'disabled': !service.distance.enableReminders}\"]//span[contains(text(),'Service interval')]/../../div/input";
           // return "//div/label/span[text()='Service interval (Kilometres)']/../../div/input";
        }
        public static String txtNextServiceDueAtXpath()
        {
            return "//div[@ng-hide='service.distance == null']//span[contains(text(),'Next service due at')]/../../div/input";
           // return "//div/label/span[text()='Next service due at (Kilometres)']/../../div/input";
        } 
         public static String txtReminderPeriodXpath()
        {
            return "//input[@name='distanceReminderPeriod']";
                    //div[@ng-class=\"{'disabled': !service.distance.enableReminders}\"]/label/span[contains(text(),'Reminder period')]/../../div/input";
            //return "//div/label/span[text()='Reminder period (Kilometres)']/../../div/input";
        } 
        public static String remindOnDistanceCheckBoxXpath()
        {
            return "//span[text()='Remind on distance']/../input";
        } 
        public static String barDisplayedXpath()
        {
            return "//div[@class='alert ng-binding alert-info']";
        } 
 
        public static String btnRecipientsXpath()
        {
            return "//h5[text()='Recipients']/../button[@class='btn ng-binding btn-small btn-success pull-right']";
        } 
        public static String checkRecipientXpath()
        {
            return "//span[text()='DVT Test Automation Automation']/../../../td/input[@type='checkbox']";
        } 
        public static String btnSelectXpath()
        {
            return "//button[@class='btn ng-scope ng-binding btn-wide btn-success']";
        } 
        public static String isNewlyCreatedRecipientdisplayedOnRecipientsXpath()
        {
            return "//div[text()='DVT Test Automation Automation ']";
        } 
        public static String recipientDoesNotExistXpath()
        {
            return "//a[text()='If the recipient does not exist - ']/strong";
        } 
        public static String addNewContactFormXpath()
        {
            return "//span[text()='Add new contact']";
        } 
        public static String firstNameAndAtLeastOneContactNoticeXpath()
        {
            return "//p[text()='First name and at least one contact field must be completed in order to create a valid contact']";
        } 
        public static String firstNameXpath()
        {
            return "//span[text()='First name']/../../input";
        } 
        public static String lastNameXpath()
        {
            return "//span[text()='Last name']/../../input";
        } 
        public static String employerXpath()
        {
            return "//span[text()='Employer']/../../input";
        } 
        public static String positionXpath()
        {
            return "//span[text()='Position']/../../input";
        } 
        public static String homeNumberXpath()
        {
            return "//span[text()='Home number']/../../input";
        } 
        public static String workNumberXpath()
        {
            return "//span[text()='Work number']/../../input";
        } 
        public static String mobileNumberXpath()
        {
            return "//span[text()='Mobile number']/../../input";
        } 
        public static String otherNumberXpath()
        {
            return "//span[text()='Other number']/../../input";
        } 
        public static String emailAddressXpath()
        {
            return "//span[text()='Email address']/../../input";
        } 
         public static String submitXpath()
        {
            return "//button[text()='Submit']";
        } 
          public static String filterNewRecipientXpath()
        {
            return "//span[text()='Select recipients']/../../../form/div[@class='input-reset-wrapper mb-5']/input ";
        } 
          
        public static String checkNewRecipientXpath()
        {
            return " //input[@ng-checked='row.$selected'] ";
        } 
        public static String ValidateAssetServiceFormXpath() 
        {
            return "//form[@name='assetServiceForm']//span[text()='Next service due at (Kilometres)']/..//..//input[@disabled='disabled']";
        }
          public static String SelectrecipientsXpath() 
        {
            return "//span[text()='Select recipients']";
        }
          public static String checkboxvalidation() 
        {
            return "//input[@name='enableDistanceReminders']";
        }
          public static String checkNameXpath() 
        {
            return "//span[text()='Name']/../../th/input";
        } 
           public static String btnSaveXpath() 
        {
            return "//button[text()='Save']";
        } 
           public static String btnCancelXpath() 
        {
            return "//button[text()='Cancel']";
        } 
        //button[text()='Cancel']
        
 }
