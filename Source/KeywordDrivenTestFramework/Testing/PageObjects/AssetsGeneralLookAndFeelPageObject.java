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
public class AssetsGeneralLookAndFeelPageObject {
      
        public static String MixTLogoXpath()
        {
            return "//div/a[@href='#/home']/img";
        }
        public static String HomeXpath()
        {
            return "//a[@href='#/home'][@tooltip-placement='left']";
        }
        public static String HelpXpath()
        {
            return "//i[@class='icon-main-help']/..";
        }    
        public static String WelcomeXpath()
        {
            return "//div[@class='login-name']/strong[text()='Welcome']";
        }
         public static String loginNameXpath()
        {
            return "//div/span[@class='ng-binding']";
        }  
        public static String AssetDescriptionXpath()
        {
            return "//a[@class='click-cell']";
        }
         public static String AvailableXpath()
        {
            return "//span[text()='Available']";
        }
          public static String CancelXpath()
        {
            return "//button[text()='Cancel']";
        }
         public static String clickIconXpath()
        {
            return "//i[@class='icon-choose-columns']";
        }  
         public static String DirecttiveSelectedFilter()
        {
            return "//div/ul/li[@ng-repeat='filter in $directive.filters']/a";
        }  
         
         public static String GridDisplayedName()
        {
            return "//strong[text()='All']";
        }  
        public static String SetHomeXpath()
        {
            return "//a[@ng-click='setHomePage()'][@tooltip-placement='left']";
        }  
         public static String loggedInProfileXpath()
        {
            return "//div[@class='login-name']/span[@ng-show='loggedInProfile']";
        }  
            
        public static String TopLeftPageNameXpath()
        {
            return "//div[@class='row-fluid sub-menu-fixed']";
        }  
            //span[text()='Assets']
         public static String breadcrumbXpath()
        {
            return "//div[@class='pull-left no-wrap']/div[@class='organisation-selector']/div[@class='organisation-name']";
        } 
         
         public static String  automaticallySelectedFilterXpath()
        {
            return "//a[@ng-click='$directive.selectFilter(filter)']";
        } 
         public static String SelectionCritaria(){
             return"//div[@class='container-fluid selection-criteria']/div[@class='pull-left no-wrap']/div[@class='organisation-selector']";
         }
        public static String SelectedfilterName(){
             return"//div/ul[@class='breadcrumb pull-left']/li/strong";
         }
        public static String NumberOfSelectedfilterNameXpath(){
             return"//div/ul[@class='breadcrumb pull-left']/li/span";
       }
       
         public static String inputFilterFieldXpath()
        {
            return"//div[@class='text-filter']/input";
        }
         public static String AddNewAssetButtonXpath(){
            return "//a[@class='btn btn-small btn-success'][@ng-click='$controller.addAsset()']";
        } 
       
      
        public static String exportXpath(){
             return"//button[@tooltip-placement='left']";
       }
       public static String importAndDownloadButtonXpath(){
             return"//a[@ng-show='$controller.canImportAssets'][@ng-click='$controller.downloadImportTemplate()']";
       }
        public static String importAssetXpath(){
             return"//a[@ng-show='$controller.canImportAssets'][@ng-click='$controller.importAssets()']";
       }
       
        public static String ColumnSelectorButtonXpath(){
             return"//i[@class='icon-choose-columns']";
       }
        public static String ActionsButtonXpath(){
             return"";
       }
        public static String NextPageXpath(){
             return"//button[@class='btn btn-small'][@ng-click='$directive.dataProvider.moveNext()']";
       }
          public static String clickNextPageXpath(){
             return"//i[@class='icon-chevron-right']";
       }
        //i[@class='icon-chevron-left']
          public static String PreviousPageXpath(){
             return"//button[@class='btn btn-small'][@ng-click='$directive.dataProvider.movePrevious()']";
       }
           public static String clickPreviousPageXpath(){
             return"//i[@class='icon-chevron-left']";
       }
            public static String columnSelectorButtonXpath(){
             return"//i[@class='icon-choose-columns'] ";
       }
         //i[@class='icon-choose-columns'] 
          
    //On the left hand side pane the following Asset categories are displayed in the grid:
          
        public static String NotDownloadingXpath(){
             return"//span[text()='Not downloading']";
       }
        public static String NoMobileDeviceXpath(){
             return"//span[text()='No Mobile device']";
       }
        public static String RefreshXpath(){
             return" //span[text()='Refresh']";
       }
        public static String NotAvailableXpath(){
             return"//span[text()='Not available']";
       }
        public static String DecommissionedXpath(){
             return"//span[text()='Decommissioned']";
       }
          public static String RemindersDueSoonXpath(){
             return"//span[text()='Reminders due soon']";
       }
       
        public static String RemindersOverdueXpath(){
             return"//span[text()='Reminders overdue']";
       }
        public static String CountryXpath(){
             return"//span[@class='title'][text()='Country']";
       }
    
    //Inspect the grid displayed on the right-hand side
        public static String AssetDescriptionTabXpath(){
             return"//span[@class='title'][text()='Asset description']";
        }
        public static String AssetIDXpath(){
             return"//span[@class='title'][text()='Asset ID']";
       }
        public static String RegistrationNumberXpath(){
             return"//span[@class='title'][text()='Registration number']";
       }
        public static String AssetTypeXpath(){
             return"//span[@class='title'][text()='Asset type']";
       }
        public static String MobileDeviceXpath(){
             return"//span[@class='title'][text()='Mobile device']";
       }
        public static String LastTripXpath(){
             return"//span[@class='title'][text()='Last trip']";
       }
        public static String EngineHoursXpath(){
             return"//span[@class='title'][text()='Engine hours']";
       }
        public static String SiteXpath(){
             return"//span[@class='title'][text()='Site']";
       }
        public static String StatusXpath(){
             return"//span[@class='title'][text()='Status']";
       }
        public static String ConfigUploadDateXpath(){
             return"//span[@class='title'][text()='Config upload date']";
       }
        
        public static String ConfigurationGroupXpath(){
             return"//span[@class='title'][text()='Configuration group']";
       }
        public static String FleetNumberXpath(){
             return"//span[@class='title'][text()='Fleet number']";
       }
         public static String OdometerXpath(){
             return"//span[@class='title'][text()='Odometer']";
       }  
         public static String MixTelematicLogoXpath(){
             return"//a[@href='#/ome']/img";
       }    
            
}

