/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package KeywordDrivenTestFramework.Testing.PageObjects;

import static KeywordDrivenTestFramework.Core.BaseClass.browserType;
import static KeywordDrivenTestFramework.Core.BaseClass.currentEnvironment;
import KeywordDrivenTestFramework.Entities.Enums;

/**
 *
 * @author kbuso
 */
public class TelematicsPageObj
{
    public static String DropDownValidationXpath()
    {
       return "//ul[@id='ui-id-5']/li[@class]";
    }
    
    public static String ServerSideDisabledSaveButtonXpath() 
    {
       return "//span[text()='Save']/../../a[@disabled='disabled']";

    }
    public static String filterImage()
    {
        //return "filter.PNG";
        return "filter2.PNG";
    }
    public static String resourcesImage(){
        return "resources.png";
    }
    public static String MixTelematicsURL() {
        return currentEnvironment.PageUrl;
    }
    
//    public static String MixTeleImagesFolder() 
//    {
//        return "\\MixTeleImagesFolder\\";
//    }
    //Log in Page Objects 
    
    //UserName
    public static String UsernameClassname() 
    {
        return "userName";
    }
    
    //Password
    public static String PasswordClassname() 
    {
        return "password";
    }
    public static String decartaImageChrome() 
    {
        return "decartaChrome.png";
    }
    public static String decartaImagefirefox() 
    {
        return "decartaFirefox.png";
    }
    public static String decartaImageIE() 
    {
        return "decartaImageIE.png";
    }
    
    //Sign in Button
    public static String SignInButtonXpath() 
    {
        return "//button[@text=\"Sign in\"]";
    }
    
    //Pig Latin Sign in Button
    public static String PigLatinSignInButtonXpath() 
    {
        return "//div/button[text()='Ignsay inway']";
    }
    
    //Ok Button
    public static String okButtonXpath() 
    {
        return "//button[text()='OK']";
    }
    
    public static String AssetIConImg()
    {
        return "AssetIconImg.PNG";
    }
    
    public static String scrollbarImage(){
        return "scrollbar.png";
    }
    
    public static String scrollImage(){
        return "scroll.png";
    }
    
    public static String GroupTypeXpath()
    {
        return "//select[@name='groupTypeId']";
    }
    
    public static String DescriptionTextAreaXpath()
    {
        return "//div[@class='control-group']/label/../textarea";
    }
    
    public static String ConfirmDeleteGroupXpath()
    {
        return "//div/div/span[text()='Group removed successfully']";
    }
    
    public static String ConfirmDeleteDriverXpath()
    {
        return "//div/div/span[text()='Driver removed successfully']";
    }
    
    public static String ExpandGroupMembershipTreeXpath()
    {
        return "//span[@class='daredevel-tree-anchor ui-icon icon-plus ng-scope']";
    }
    
    //Submenu Xpath
    public static String SubmenuXpath() 
    {
        return "//*[@id=\"sub-menu\"]/div/div";
    }
    
    //Heading Xpath
    public static String HeadingXpath() 
    {
        return "//div[@class=\"nav-main-container\"] | //a[@role=\"button\"] | //li[@role=\"presentation\"]";
    }
    
    public static String DefaultMapProviderDropdownOptionsName()
    {
        return "mapProvider";
    }
    
    public static String SatelliteProviderDropdownOptionsName()
    {
        return "satelliteProvider";
    }
    
    public static String DefaultMapViewDropdownOptionsName()
    {
        return "defaultMapView";
    }
    public static String defaultMapViewDropdownXpath()
    {
        return "//select[@name='defaultMapView']";
    }
    public static String sateliteDropdownXpath()
    {
        return "//select[@name='satelliteProvider']";
    }
    
    
    
    //Export Button Class name
    public static String ExportClassName() 
    {
        return "icon-export";
    }
    
    //Select Button Xpath
    public static String SelectButton() 
    {
        return "//a[@ng-disabled=\"!$directive.isSelectionValid\"]";
    }
    
    //Save Button Xpath
    public static String SaveButtonXpath() 
    {
        return "//button[@class=\"btn btn-success pull-right ng-binding\"]";
    }
    
    public static String SaveButtonXpath2() 
    {
        return "//button[@text=\"Save\"]";
    }
    
    //Toolbar Xpath
    public static String ToolbarXpath() 
    {
        return "//div[@class=\"tracking-docked-toolbar btn-inverse\"]";
    }
    
    //Assets ClassName
    public static String OpenAssetsClassName() 
    {
        return "leaflet-marker-pane";
    }
    
    //Expand Toolbar Tree Xpath
    public static String ToolbarTreeXpath() 
    {
        return "//span[@class=\"daredevel-tree-anchor ui-icon icon-plus ng-scope\"]";
    }
    
    //Expanded Toolbar Tree Xpath
    public static String ExpandedToolbarTreeXpath() 
    {
        return "//ul[@options=\"layersTreeOptions\"]";
    }
    
    //Filter textbox Xpath
    public static String FilterBoxXpath() 
    {
        return "//input[@placeholder=\"Filter\"]";
    }
    
    //Option selector xpath
    public static String SelecttemplateXpath() 
    {
        return "//a[@class=\"clickable-cell ng-scope\"]";
    }
    
    //Click Device Xpath 
    public static String ClickDeviceXpath() 
    {
        return "//a[@ng-click=\"$emit('deviceClicked')\"]";
    }
    
    public static String DriverFilterXpath()
    {
        return "//div[@class='text-filter empty']//input";
    }
    
    //Yes Button(Submit) Xpath 
    public static String YesButtonXpath() 
    {
        return "//button[@type=\"submit\"]";
    }
    
    //Cancel Button Xpath 
    public static String CancelButtonXpath() 
    {
        return "//button[@text=\"Cancel\"]";
    }
    
    //MainMenu icon Xpath 
    public static String MainmenuIconXpath() 
    {
        return "//i[@class=\"icon-main-cog\"]";
    }
    
    //Logout Button Xpath 
    public static String LogoutXpath() 
    {
        return "//a[@ng-click=\"logout()\"]";
    }
    
    //Loading Xpath for main assets screen
    public static String LoadingXpath()
    {
        return "//div[@class=\"columns ui-sortable\"] | /div[@style=\"display: none;\"]";
    }
    
    //Loading symbol
    public static String LoadingSymbolXpath() 
    {
        return "//*[@id=\"MainView\"]/div[1]/div/div[2]/div[2]/div/div[contains(@style, 'display: none')]";
    }
    
    public static String AssetSearchFilterXpath()
    {
        return "//div[@class='pull-right']/div/input";
    }
    
    public static String ButtonSearchAssetXpath()
    {
        return "//div[@class='pull-right']/div/input/../a/i[@class='icon-search']/..";
    }
    
    //Home Button Xpath 
    public static String HomeButtonXpath() 
    {
        return "//i[@class=\"icon-main-home\"]";
    }
    
    //Mobile Device Parent Xpath
    public static String MobiledeviceparentXpath() 
    {
        return "//div[@class=\"span12\"]";
    }
    
    public static String SiteDeletedSuccessfulNotificationXpath()
    {
        return "//span[text()='Site deleted successfully']";
    }
    
    public static String SpinnerXpath()
    {
        return "//div[@name='globalWarningModal']/div/div[@class='modal hide fade hidden-phone modal-mini'][contains(@style, 'display: none')]";
    }
    
    //div[@filters='strongGridCustomFilers']
     public static String waitForAssetsXpath()
    {
        return "//div[@filters='strongGridCustomFilers']";
    }
    
     public static String SpinnerByXpath()
     {
         return "//div[@name='hosNotificationsGrid']/div[@class='loading-overlay'][@style='display: none;']";
     }
     
    public static String PassengerTableSpinnerXpath()
    {
        return "//td[@style='display: none;']";
    }
    
    //Configuration Status Heading (Waiting for element to appear as validation)
    public static String ConfigstatusXpath()
    {
        return "//span[@fleet-tooltip=\"Configuration status\"]";
    }
    
    //Config status xpath
    public static String ConfigStatusXpath() 
    {
        return "//td[@column-field=\"configurationStatus\"] | /span[@class=\"max-width-300 text-overflow ng-scope\"]";
    }
    
    //Template Table rows
    public static String TemplateTableRowsXpath()
    {
        return "//tr[@fleet-droppable-item=\"row\"]";
    }
    
    //Home Page filter xpath
    public static String HomepageFilterXpath() 
    {
        return "//form[@class=\"filter-search nomargin pull-right form-inline ng-pristine ng-valid\"]";
    }
    
    //Login link forgot password xpath
      public static String LoginForgotPasswordXpath() 
    {
        return "//strong[text()='CLICK HERE']";
    }
    
    //Login link contact us xpath
    public static String LoginContactUsXpath() 
    {
        return "//strong[text()='CONTACT US']";
    }
    
    //Language Dropdown
    public static String LanguageDropdownXpath() 
    {
        return "//div/label[text()='SELECT LANGUAGE']/../div/select";
    }
    
    //Pig Latin Username XPath
    public static String PigLatinUsernameXpath() 
    {
        return "//div/label[text()='Usernameway']/../div/input";
    }
    public static String UsernameInputFieldXPath()
    {
        return "//div/label[text()='USERNAME']/../div/input";
    }
    
    public static String PasswordInputFieldXPath(){
        return "//div/label[text()='PASSWORD']/../div/input";
    }
    

    public static String LogInUsernameXpath()
    {
        return "//div/label[text()='USERNAME']/../div/input";
    }
    
    //Login Password by Xpath
    public static String LogInPasswordXpath()
    {
        return "//div/label[text()='PASSWORD']/../div/input";
    }
    
    public static String LogInFailedWindowXpath()
    {
        return "//h5[text()='Forgot password']";
    }
    
    public static String LogInUsernameFormatXpath()
    {
        return "//div/label[text()='USERNAME']/../div/span[text()='The value must be a valid email address']";
    }
    
    //
     public static String LogInPasswordRequiredFieldXpath()
    {
        return "//div/label[text()='PASSWORD']/../div/span[text()='This field is required']";
    }
     
     public static String LogInUsernameRequiredFieldXpath()
    {
        return "//div/label[text()='USERNAME']/../div/span[text()='This field is required']";
    }
        
     public static String PasswordResetUnsuccessful()
     {
         return "//span[text()='Password reset unsuccessful']";
     }
     
     //span[text()='KEEP ME SIGNED IN']
     
  public static String LoginKeepMeSignIn()
     {
         return "//span[text()='KEEP ME SIGNED IN']";
     }
  //span[text()='Assets']
  
  public static String MixTelemicsAssets()
     {
         return "//span[text()='Assets']";
     }
  //span[text()='All']"
  public static String LinkAll()
     {
         return "//span[text()='All']";
     }
  
  public static String FeelAdminAsset()
     {
         return "fleet-admin/assets";
     }
  

    public static String UsernameEmptyFieldMessageXPath()
    {
        return "//div/label[text()='USERNAME']/../div/span[text()='This field is required']";
    }
    
    public static String PasswordEmptyFieldMessageXPath()
    {
        return "//div/label[text()='PASSWORD']/../div/span[text()='This field is required']";
    }
    
    public static String UsernameIncorrectFormatMessageXPath(){
        return "//div/label[text()='USERNAME']/../div/span[text()='The value must be a valid email address']";
    }
    
    
    
    public static String FailedToLoginMessageXPath(){
        return "//h5[text()='Failed to login']";
    }
    
    public static String AssetLabelXpath(){
        return "//span[text()='Assets']";
    }
    
    public static String AllLabelXpath(){
        return "//span[text()='All']";
    }
            

    //Pig Latin Password XPath
    public static String PigLatinPasswordXpath() 
    {
        return "//div/label[text()='Asswordpay']/../div/input";
    }
    
    //KEEP ME SIGNED IN Xpath
    public static String KeepMeSignedInXpath() 
    {
        return "//span[text()='KEEP ME SIGNED IN']/../input";
    }
    
    
     //-----------Forgot Password--------------
    public static String ForgotPasswordH5HeadingXpath()
    {
        return "//h5[text()='Forgot password']";
    }
    
    public static String ForgotPasswordUsernameInputXpath()
    {
        return "//span[text()='Username']/../../input";
    }
    
    public static String ForgotPasswordSubmitButtonXpath()
    {
        return "//button[text()='Submit']";
    }
    
    //Used to validate that the forgot process is completed
    public static String ForgotPasswordThankYouMessageXpath()
    {
        return "//h4[text()='Thank you!']";
    }
    
    public static String ForgotPasswordUsernameXpath()
    {
        return "//input[@name='userName']";
    }
    
    //  <editor-fold defaultstate="collapsed" desc="Libraries">   
    
    public static String ManageXpath()
    {
        return "//a[text()='MANAGE ']";
    }
    
    public static String LibrariesXpath()
    {
        return "//a[text()='Libraries']";
    }
    
    public static String ParameterLibrariesHeaderXpath()
    {
        return "//h5[text()='Parameter library']";
    }
    
    //  </editor-fold> 
    public static String LandingPageUrl()
    {
        return "/fleet-admin/assets";
    }
     public static String IELandingPageUrl()
    {
        return "https://integration.mixtelematics.com/";
    }
     
     //kwanda
      public static String ContactUsButtonXpath() 
    {
        return "//input[@class='uk-button-primary']";
    }
      
       public static String MonitorMenuAbsoluteXpath() 
    {
        //Link text
        //return "MONITOR ";
        return "//*[@id='main-nav-toolbar']/ul/li[1]/a";
    }
    public static String TripTimelineRelativeXpath() 
    {
        return "//a[text()='Trip timeline']";
    }
    
    public static String TripDateAbsoluteXpath() 
    {
        //Absolute Xpath
        //*[@id="sub-menu"]/div/div[3]/div/div[2]/a/span[1]/span[2]
        return "//*[@id=\"MainView\"]/div[1]/div[2]/div/div[1]/div[2]/div/div[3]/div[1]/input";
    }
    
    public static String MiXTelematicsBreadcrumbRelativeXpath() 
    {
        //Absolute Xpath
        //*[@id="sub-menu"]/div/div[3]/div/div[2]/a/span[1]/span[2]
       return "//*[@id=\"sub-menu\"]/div/div[3]/div/div[2]/a/span[1]/span[2]";
        //return "//span[text()='MiX Telematics']";
    }
    
     public static String DataCentreRelativeXpath() 
    {
        //Absolute Xpath
       //return "/html/body/div[44]/div[2]/div[1]/div[1]/div[1]/a/span[2]";
        return "//span[text()='MiX Telematics']";
    }
    public static String RegionalSalesOrganistaionRelativeXpath() 
    {
        //Absolute Xpath
        return "//span[text()='Dev Dealer']";
    }
    
     public static String CancelAssetButtonRelativeXpath() 
    {
        //Absolute Xpath
        return "//a[text()='Cancel']";
    }
    
    public static String OrganistaionRelativeXpath() 
    {
        //Absolute Xpath
        return "//span[text()='Central Oil & Gas']";
    }
    
    public static String OrganizationGroupLinkXpath()
    {
        return "//a[text()='Organisation groups']";
    }
    
    
     public static String SiteRelativeXpath() 
    {
        //Absolute Xpath
        //html/body/div[21]/div[2]/div[1]/div[4]/div[1]/a[7]/span[2]
        return "//a/span[text()='PBU - Big Spring - 1205']/..";
    }
    public static String AssetRelativeXpath() 
    {
        //Absolute Xpath
        ///html/body/div[39]/div[2]/div[1]/div[5]/div[1]/a[1]/span[2]
        return "//a/span[text()='10069 - Truck - 2003 Mack WINCH']";
    }
     public static String SelectAssetButtonRelativeXpath() 
    {
        //Absolute Xpath
        return "//a[text()='Select']";
    }
     
//      public static String TripCanvasAbsoluteXpath() 
//    {
//        //Absolute Xpath
//       return "//*[@id=\"MainView\"]/div[1]/div[2]/div/div[1]/div[3]/div[1]/div/div[1]/div[3]/div/div[1]/div/div/canvas";
//        //return "//a[text()='Select']";
//    }
     public static String MixTeleImagesFolder() 
    {
        //Absolute Xpath
       return "\\SikuliImages\\MixTelematics\\";
        //return "//a[text()='Select']";
    }
     
     public static String MixTeleImagesPassengers() 
    {
        //Absolute Xpath
       return "\\SikuliImages\\MixTelematics\\PassengerImages\\";
        //return "//a[text()='Select']";
    }
     
     public static String MixTelePassengersListShakedownImportFiles() 
    {
        //Path to the Shakedown import files
       return "\\SikuliImages\\ShakedownFiles\\";
    }
     
     public static String Hummer_2015()
     {
         return "2015-Hummer.jpg";
     }
       
       public static String MixTelematics() 
    {
        //Absolute Xpath
       return "\\mixtelematics_keyworddriventestautomation_dvt\\MixTeleImagesFolder\\";
        //return "//a[text()='Select']";
    }
    
    public static String PassengerPageLinkTextXpath()
    {
        return "//h5/a[text() = 'Passengers']";
    }
      
    public static String CloseTacho() 
    {
        //Absolute Xpath
       return "CloseTacho.PNG";
        //return "//a[text()='Select']";
    }
    
     public static String CloseTachoFocus() 
    {
        //Absolute Xpath
       return "CloseTachoFocus.PNG";
        //return "//a[text()='Select']";
    }
     public static String CloseTacho2() 
    {
        //Absolute Xpath
       return "CloseTacho2.PNG";
        //return "//a[text()='Select']";
    }
    
     
    public static String TripHistory() 
    {
        //Absolute Xpath
       return "//i[@class='icon-trip-history']";
        //return "//a[text()='Select']";
    }
        
        public static String TripCanvasAbsoluteXpath() 
    {
        //Absolute Xpath
       return "//*[@id=\"MainView\"]/div[1]/div[2]/div/div[1]/div[3]/div[1]/div/div[1]/div[3]/div/div[1]/div/div/canvas";
        //return "//a[text()='Select']";
    }
        
    public static String DownloadTachoabsoluteXpath() 
    {
        //Absolute Xpath
       return "//i[@class='icon-tacho']";
        
    }
    public static String exportTachoabsoluteXpath() 
    {
        //Absolute Xpath
       return "//a/i[@class='icon-export']";
        
    }
       
   public static String exportTachoFromDateXpath() 
        {
            //Absolute Xpath
           return "/html/body/div[39]/div[1]/div/div/div[2]/div[2]/div/div/input";

        }
     public static String exportTachoToDateXpath() 
    {
        //Absolute Xpath
       return "/html/body/div[39]/div[1]/div/div/div[2]/div[3]/div/div/input";
        
    }
    public static String exportTachoOKButtonXpath() 
    {
        //Absolute Xpath
       return "//button[text()='OK']";
        
    }   
      
      
      //usability
      
    public static String QueryLineHoverOverTextXpath() 
    {
        //Absolute Xpath
       return "//span[text()='Query line']";
        
    }   
    public static String ClearMarkersHoverOverTextXpath() 
    {
        //Absolute Xpath
       return "//span[text()='Clear markers']";
        
    }  
    public static String ExportHoverOverTextXpath() 
    {
        //Absolute Xpath
       return "//span[text()='Export']";
        
    } 
    public static String queryLineTextXpath() 
    {
        //Absolute Xpath
       return "//i[@class='icon-query-line']";
        
    }  
       
    public static String ClearMarkersButtonTextXpath() 
    {
        //Absolute Xpath
       return "//i[@class='icon-remove']";
        
    }
    
    public static String chevronDownButtonTextXpath() 
    {
       return "//i[@class='icon-chevron-down']";
    }
    
    public static String F1DropdownXpath() 
    {
       return "//*[@id=\"MainView\"]/div[1]/div/div/div[1]/div[2]/div/div/div/div[1]/div[1]/div[2]/div/div[1]/div/select";
    }
    public static String F2DropdownXpath() 
    {
       return "//*[@id=\"MainView\"]/div[1]/div/div/div[1]/div[2]/div/div/div/div[1]/div[1]/div[2]/div/div[2]/div/select";
    }
    
    public static String AvailableTachoItemDropdownXpath() 
    {
       return "//*[@id=\"MainView\"]/div[1]/div/div/div[1]/div[2]/div/div/div/div[1]/div[1]/div[2]/div/div[3]/div/select";
    }
    public static String AvailableTachoItem2DropdownXpath() 
    {
       return "//*[@id=\"MainView\"]/div[1]/div/div/div[1]/div[2]/div/div/div/div[1]/div[1]/div[2]/div/div[4]/div/select";
    }
    public static String AvailableTachoYAxisLineXpath() 
    {
       return "//*[@id=\"MainView\"]/div[1]/div/div/div[1]/div[2]/div/div/div/div[1]/div[2]/div[1]/div/div/div/span[1]/div/canvas";
    }
    public static String AvailableTachoYAxisLine2Xpath() 
    {
       return "//*[@id=\"MainView\"]/div[1]/div/div/div[1]/div[2]/div/div/div/div[1]/div[2]/div[1]/div/div/div/span[2]/div/canvas";
    }
    public static String AvailableTachoYAxisLine3Xpath() 
    {
       return "//*[@id=\"MainView\"]/div[1]/div/div/div[1]/div[2]/div/div/div/div[1]/div[2]/div[1]/div/div/div/span[3]/div/canvas";
    }
    public static String AvailableTachoYAxisLine4Xpath() 
    {
       return "//*[@id=\"MainView\"]/div[1]/div/div/div[1]/div[2]/div/div/div/div[1]/div[2]/div[1]/div/div/div/span[4]/div/canvas";
    }
    
    public static String EventsButtonTextXpath() 
    {
       return "//i[@class='icon-flag']";
    }
    
    public static String EventsIgnitionOffCheckboxXpath() 
    {
       return "/html/body/div[41]/div[1]/div/div/div[2]/div/div/div[1]/div[1]/table/tbody/tr[1]/td[1]/input[1]";
                
                
    }
    
    public static String EventsIgnitionOnCheckboxXpath() 
    {
       return "/html/body/div[41]/div[1]/div/div/div[2]/div/div/div[1]/div[1]/table/tbody/tr[2]/td[1]/input[1]";
    }
    
    public static String EventsSelectButtonTextXpath() 
    {
       return "//button[text()='Select']";
    }
    
     public static String EventToMoveUpTextXpath() 
    {
       return "//span[text()='Over revving']";
    }
    
      public static String EventMoveUpButtonXpath() 
    {
       return "//i[@class='icon-arrow-up']";
    }
      
      public static String EventMoveDownButtonXpath() 
    {
       return "//i[@class='icon-arrow-down']";
    }
   
      public static String chevronUpButtonXpath() 
    {
       return "//i[@class='icon-chevron-up']";
    }
      
    public static String TimeLineForwardButtonXpath() 
    {
       return "//a[text()='Foward']";
    }
     public static String TimeLineBackButtonXpath() 
    {
       return "//i[@class='Back']";
    }
      
       public static String eventsTableXpath() 
    {
       return "//table[@class='table table-scroll table-condensed table-list no-text-clip']";
    }
       
    public static String TachoExportTableXpath() 
    {
       return "//div[@class='row-fluid ng-scope']";
    }
    
    //a[text()='MANAGE ']
        public static String ManageMenuRelativeXpath() 
    {
        return "//a[text()='MANAGE ']";
    }
     
    public static String AssetSubMenuRelativeXpath() 
    {
        return "//a[text()='Assets']";
    }
      
    public static String AddAssetButtonRelativeXpath() 
    {
        return "//a[@fleet-tooltip='Add asset']";
    }
    
    public static String DownloadImportButtonRelativeXpath() 
    {
        return "//a/i[@class='icon-download-alt']";
    }
    
    public static String ImportNewRecordsRadioButtonRelativeXpath() 
    {
        return "//span[text()='Import new records']";
    }
     public static String ImportNewRecordsRadioButton1RelativeXpath() 
    {
        return "//input[@value='importNewRecords']";
    }
    
     public static String ModalWindowDownloadButtonRelativeXpath() 
    {
        return "//a[text()='Download']";
    }
     
    
    
    public static String DownloadButtonRelativeXpath() 
    {
        return "//a[text()='Download']";
    }
    
    
    public static String PassengerTableXpath()
    {
        return "//div[@rows='passengerGridRows']//table//tbody";
    }
    
    public static String PassengerTableheaderXpath()
    {
        return "//div[@rows='passengerGridRows']//table//thead//th";
    }
    
    public static String PassengerTableActionButtonXpath()
    {
        return "//a[@class='btn-actions']";
    }
    
    public static String PassengerTableRemoveButtonXpath()
    {
        return "//span[text()='Remove']/..";
    }
    
    public static String numberOfPassengerXpath()
    {
        return "//ul[@class='breadcrumb pull-left']//li//span";
    }
    public static String PassengersSpinnerXpath()
    {
        return "//div[@class='fleet-grid full-height has-row-actions']/div[@class='center-text mt-5'][@style='display: none;']";
    }
    
    public static String ImportAssetsButtonRelativeXpath() 
    {
        return "//a/i[@class='icon-import']";
    }
    
    public static String PassengersFilterTextboxRelativeXpath() 
    {
        return "//div[@class='input-reset-wrapper']//input[@type='text']";
    }
    
    public static String successfulTextRelativeXpath() 
    {
        return "//strong[text()='successful']";
    }
    public static String importAssetsModalXpath()
    {
        return "//div[@name='importAssetsModal']//div[contains(@style,'block')]";
    }
    public static String assetsImportedSuccessfullyXpath()
    {
        return "//span[text()='Assets imported successfully']";
    }
   
    
    public static String ImportAssetsTextBoxRelativeXpath() 
    {
        return "//span/input[@name='file']";
    }
    
    public static String updateExistingRecordRadioRelativeXpath() 
    {
        return "//span[text()='Update existing records']";
    }
    
    public static String updateRecordsRadioRelativeXpath() 
    {
        return "//input[@value='updateExistingRecords']";
    }
    
    
    public static String searchTextBoxRelativeXpath() 
    {
        return "//div[@class='pull-right']/div/input[@type='text']";
    }
    
    public static String RefreshButtonXpath() 
    {
        return "//span[text()='Refresh']/..";
    }
    
    public static String SearchInputFilterXpath()
    {
        return "//form/div/input[@placeholder='Filter']";
    }
    
    public static String getPassengerNameLinkTextByXpath()
    {
        return "//tr/td/div/a";
    }
    
    public static String getAllPassengers()
    {
        return "//tr/td/div/a/span";
    }
    
    public static String GetAssetsRegistrationNoXpath()
    {
        return "//div[@class='column']/div/span[text()='Registration number']/../..";
        //return "//div[@class='column']/div/span[text()='Registration number']/../../div[contains(@class,'cell')]";
    }
    
    public static String clearSearchTextFieldIconXpath()
    {
        return "//form/div/button/i[@class='icon-remove-sign']";
    }
    
    public static String ClearSearchIconHiddenXpath()
    {
        return "//form/div/button[@style='display: none;']/i[@class='icon-remove-sign']";
    }
    
    public static String clearSearchTextFieldIconNotXpath()
    {
        return "//form/div/button[@style='display: none;']/i[@class='icon-remove-sign']";
    }
    
    
    public static String SearchedTextXpath(String text){
        return "//div[@class='column'][1]/div[@row='0']/a[contains(text(),'"+text+"')]";
    }
    
    public static String searchIconRelativeXpath() 
    {
//      return "//a/i[@class='icon-search']";
        return "//a[@class='btn btn-small']/i[@class='icon-search']";
                
    }
    
    public static String ChooseFileRelativeXpath() 
    {
        return "//span/span[text()='Choose file']/../span[text()='Choose file']";
//          return "//span/span[text()='Choose file']/../input[@name='file']";
//        return "/html/body/div[23]/div/div/form/div[1]/div[2]/div[1]/div/div[1]/div/div[2]/div/span/input";
    }
    
    public static String ChooseFileRelativeXpath1() 
    {
//        return "//span/span[text()='Choose file']/../span[text()='Choose file']";
          return "//span/span[text()='Choose file']/../input[@name='file']/..";
//        return "/html/body/div[23]/div/div/form/div[1]/div[2]/div[1]/div/div[1]/div/div[2]/div/span/input";
    }
    
    //diagostics
    
    
    public static String AsstesRequestCurrentStatusbuttonRelativeXpath() 
    {
//        return "//span[@class='btn fileinput-button btn-success']";
          return "//div/a[text()='Request current status']";
    }
    public static String AssetsQuickDownloadbuttonRelativeXpath() 
    {
//        return "//span[@class='btn fileinput-button btn-success']";
          return "//div/a[text()='Quick download']";
    }
    
    public static String AssetsFullDownloadbuttonRelativeXpath() 
    {
//        return "//span[@class='btn fileinput-button btn-success']";
          return "//div/a[text()='Full download']";
    }
     public static String GeneralStatusInformationDivRelativeXpath() 
    {
//        return "//span[@class='btn fileinput-button btn-success']";
          return "//div[@header-title='General status information']";
    }
     
    public static String PeripheralStatusInformationDivRelativeXpath() 
    {
          return "//div[@header-title='Peripheral status information']";
    }
    
    public static String GPSStatusInformationInformationDivRelativeXpath() 
    {
          return "//div[@header-title='GPS status information']";
    }
    
    public static String LatestPositionInformationDivRelativeXpath() 
    {
          return "//div[@header-title='Latest position information']";
    }
     
    
    public static String NoMobileDeviceXpath() 
    {
        return "//span[text()='No Mobile device']";
    }
    public static String AssetIdXpath(String assetID) 
    {
        return "//div/a[text()='"+assetID+"']";
    }
    
    public static String AssetDescriptionXpath(String assetDescription) 
    {
        return "//a[@class='row-action']/../../../..//a[text()='"+assetDescription+"']";
    }
    
    public static String ActionButtonByRowXpath(String row) 
    {
        return "//div[@row='"+row+"']//a[@class='row-action']";
    }
    
    public static String AssetRemoveXpath(String row) 
    {
        return "//a[@row-index='"+row+"']/span[text()='Remove']";
    }
    
    public static String AssetRemoveButtonXpath() 
    {
        return "//button[text()='Remove']";
    }
    
    public static String AssetCancelButtonXpath() 
    {
        return "//button[text()='Cancel']";
    }
    
    public static String AssetRowsCountXpath() 
    {
        return "//div/span[text()='Asset description']/../../div[contains(@class,'cell')]";
    }
    
    public static String AssetsDiagnosticsButtonXpath() 
    {
        return "//a[@row-index='0']/span[text()='Diagnostics']";
    }           
    
    public static String AssetsActionButtonXpath() 
    {
        return "//div[@row=0]//div/a[@class='row-action']";
    }   
    
    public static String AssetsloadingDivXpath() 
    {
        return "//div[@class='well well-white well-small full-height']/div[@style='display: none;']";
    } 
    
    public static String GeneralInfoTableXpath() 
    {
        return "//div[@row=0]//div/a[@class='row-action']";
    }  
    
    public static String GeneralStatusInformationTableXpath() 
    {
        return "//div[@header-title='General status information']";
    } 
    public static String PeripheralStatusInformationTableXpath() 
    {
        return "//div[@header-title='Peripheral status information']";
    } 
    
    public static String LatestPositionInformationTableXpath() 
    {
        return "//div[@header-title='Latest position information']";
    } 
    
    public static String GPSStatusInformationTableXpath() 
    {
        return "//div[@header-title='GPS status information']";
    } 
     public static String SaveImage()
    {
        return "SaveImage.PNG";
    }
     
     public static String SaveButtonImage()
    {
        return "SaveButton.png";
    }
            
    public static String SaveBImage()
    {
        return "Save.png";
    }
     
     public static String SavEIEImage()
    {
        return "SaveIEButton.PNG";
    }
     public static String SaveImageFirefox()
    {
        return "SaveImageFirefox.PNG";
    }
     
    public static String ButtonSaveImg()
    {
        return "SaveButtonFirefoxImg.PNG";
    }
    public static String CloseImage()
    {
        return "CloseImage.PNG";
    }
    
    public static String ButtonCloseImage()
    {
        return "CloseButton.PNG";
    }
    
     public static String ClearListImage()
    {
        return "ClearListImage.PNG";
    }
     
     public static String DownloadWindowPaneIMG()
     {
        return "HoverIE.PNG";
     }
     
     public static String AssetListGridRelativeXpath() 
    {
        return "//div[@name='assetListGrid']";
    }
     
     public static String SpinnerAssetGridXpath()
     {
         return "//div[@name='assetListGrid']/div[@class='loading-overlay'][contains(@style,'display: none')]";
     }
     
     public static String EditAssetLinkRelativeXpath() 
    {
        return "//a[@row-index=\"0\"]/span[text()='Edit']";
    }
     
     public static String ActionfirstRowDropdownXpath() 
    {
        return "//div[@row=0]//div/a[@class='row-action']";
    } 
     
     public static String AssetStatusLabelRelativeXpathText() 
    {
        return "//span[@ng-show='asset.status']";
    }
     
      public static String assetTypeIdRelativeXpathText() 
    {
        return "//select[@name='configurationGroupId']";
    }
     
     public static String AssetDecsriptionRelativeXpathText(String desc) 
    {
        return "//a[text()='"+desc+"']";
    }
     
     
     public static String SiteDropdownRelativeXpathText(String site) 
    {
        return "//select/option[text()='"+site+"']";
    }
     
      public static String CountryDropdownRelativeXpathText(String country) 
    {
        return "//select/option[text()='"+country+"']";
    }
      
    public static String ActionfirstRowDropdownXpath(int rowNumber) 
    {
        return "//div[@row="+rowNumber+"]//div/a[@class='row-action']";
    } 
    
     public static String cancelXpath()
    {
        return"//div/div/button[text()='Cancel']";
    }
     
      public static String YesXpath()
    {
        return"//button[text()='Yes']";
    }
     
     public static String editXpath(){
         return "//ul[contains(@style, 'block')]//a/span[text()='Edit']";
     }
     
    public static String ActionButtonFirstOnListRelativeXpathText(int rowNumber) 
    {
//        return "//a[@row-index='"+rowNumber+"']//span[text()='Edit']";
        return "//a[@row-index='"+rowNumber+"']/span[text()='Edit']/../../../../ul[contains(@style,'block')]/li/a[@event='Edit']";
    }
      
    public static String AssetIconXpath() 
    {
        return "//div[@class='pull-left well well-small well-icon last']";
    } 
    public static String CancelButtonRelativeXpath() 
    {
        return "//button[text()='Cancel']";
    }
    
    public static String ButtonDownloadImportTemplateXpath()
    {
        return "//a/i[@class='icon-download-alt']/..";
    }
    
     public static String saveFileFirefox()
    {
        return "saveImageFirefox.PNG";
    }
     public static String okButtonFirefox()
    {
        return "okButtonFirefox.png";
    }
    
     
    public static String ChooseFileXpath()
    {
        return "//div[@aria-hidden='false']//span/span[text()='Choose file']/../input[@name='file']/..";
    }
      
     public static String fileUploadXpath()
     {
         return "//div[@class='upload']/div/div/input[@ng-model='fileName']";
     }
     
     public static String PassengerFileUploeadFieldXpath()
     {
         return "//div/div/div/input[@ng-model='fileName']";
     }
     
     public static String ImportSuccessfulXpath()
    {
        return "//div/div/span[text()='Fuel imported successfully']";
    }
     
     public static String FuelData_VolumeGridColumnXpath(String volume)
    {
        return "//td/div/span[contains(text(),'"+volume+"')]";
    }
     
     public static String FuelDataActionButtonXpath()
     {
        // return "//td/div/span[contains(text(),'"+volumeAmount+"')]/../../../../../..//div/ul/li/div/div/a[@fleet-tooltip='Actions']";
           return "//div[contains(@columns,'fuelDataGridColumns')]//table/tbody/tr[1]/td[9]/../../../../div[contains(@class,'row-actions')]/ul/li[2]/div/div/a";
     }
     
    
     
     public static String RemoveSiteGroupIconXpath(String SiteName)
     {
         return "//div[@draggable-accept-class='site']/span[text()='"+SiteName+"']/../a[@class='delete']/i/..";
     }
     
        
    public static String IncorrectFileTypeXpath() 
    {
        return "//div[text()='Incorrect file type']";
    }
    
    public static String fileSizeExceededXpath() 
    {
        return "//div[text()='Max file size exceeded']";
    }
    
    
    public static String ImportModalWindowXbuttonTypeXpath() 
    {
        return "//div[@buttons='importModalButtons']//button[@class='close']";
    }
   
    public static String ImportModalWindowClosebuttonTypeXpath() 
    {
        return "//div[@buttons='importModalButtons']//button[text()='Close']";
    }
    
    public static String MessageboxXpath() 
    {
        return "//a[text()='Message box']";
    }
    
    public static String MessageTableXpath() 
    {
        return "//div[@columns='gridColumns']//table//tr";
    }
    
    public static String ActionItemsListXpath() 
    {
        return "//div[@selection='enableMultiSelect']//ul//li";
    }
    
    public static String ViewSpanXpath() 
    {
        return "//ul[contains(@style,'block')]//span[text()='View']";
    }
    
    public static String JobSubjectXpath() 
    {
        return "//div[@class='job-subject-container']//table//tr//td";
    }
    
    
    public static String ReplyButtonXpath() 
    {
        return "//i[@class='icon-reply']";
    }
    
    public static String CreateNewMessageXpath() 
    {
        return "//h5[text()='Create new message']";
    }
    
    
     public static String ActionButtonXpath() 
    {
        return "//div[@class='btn-group pull-right']//button";
    }
    
    
    public static String ActionListItemsXpath() 
    {
        return "//div[@class='btn-group pull-right open']//ul//li//a";
    }
    
    public static String StatusChangedToTextXpath() 
    {
        return "//div[@class='job-info-container']//p[@class='no-margin']//span";
    }
    
    public static String JobCancelButtonXpath() 
    {
        return "//button[text()='Cancel']";
    }
    
     public static String jobInfoXpath() 
    {
        return "//div[@class='job-info-container']//table//tr";
    }
     
     public static String SelectAllCheckAllXpath() 
    {
        return "//div[@item='item']//span[text()='Omega']/../..//input";
    }
     
     public static String AssetREgAndDescHeadingsXpath(String streamName) 
    {
        return "//h5//span[text()='"+streamName+"']/../../../..//table[@class='table table-striped']//tr//div[@class='span12 mb-10']//h6";
    }
   
   public static String AssetExpiredHeadingsXpath(String streamName) 
    {
        return "//h5//span[text()='"+streamName+"']/../../../..//table[@class='table table-striped']//tr//div[@class='span12 mb-10']//span//span";
    }
   
   public static String EventStatusXpath(String streamName) 
    {
        return "//h5//span[text()='"+streamName+"']/../../../..//table[@class='table table-striped']//tr//div[@class='span12 mb-10']//div//div[@class='feed-highlite']//p";
    }
   
   public static String LoadingMoreDetailsTextXpath(String streamName)
    {
        return "//h5//span[text()='"+streamName+"']/../../../..//table[@class='table table-striped']//tr//div[@class='span12 mb-10']//div//div[@class='feed-highlite']//a[text()='Details']";
    }
   
    public static String DetailsLinkXpath(String streamName)
    {
        
        return "//h5//span[text()='"+streamName+"']/../../../..//table[@class='table table-striped']//tr//div[@class='span12 mb-10']//a[text()='Details']";
    }
    
    public static String BackToStreamButtonXpath(String streamName)
    {
        return "//h5//span[text()='"+streamName+"']/../../../..//span[text()='Back to stream']";
    }
   
    public static String StreamDetailsTableXpath(String streamName)
    {
        return "//span[text()='"+streamName+"']/../../../..//table[@class='table table-condensed']";
    }
    
    public static String ViewCurrentLocationIconXpath(String streamName)
    {
        return "//span[text()='"+streamName+"']/../../../..//table//i[@fleet-tooltip=\"View asset's current position\"]";
    }
    
     public static String AssetDescHeaderXpath()
    {
        return "//div[@class='follow-asset-header']//h5";
    }
     
      public static String DriverNameXpath(String driverNumber) 
    {
        return "//a[text()='"+driverNumber+"']";
    }
    
      public static String DriverNameXpath()
    {
        return "//div[@class='follow-asset-header']//span[@class='no-margin driver-label ng-scope ng-binding']";
    }
      
      public static String AssetLocationIconXpath()
    {
        return "//canvas/..//i";
    }
      
      //a[text()='MANAGE ']
    
    public static String AssetLocationTableXpath()
    {
        return "//table//tbody";
    }
    
    public static String AllStreamsDivXpath()
    {
        return "//div[@class='row-fluid container-fixed-right feed-container-viewport']//div[@streams='streams']";
    }
    
     public static String SendMessageXpath(String stream)
    {
        return "//span[text()='"+stream+"']/../../../..//table//i[@fleet-tooltip='Send message']";
    }
    
     public static String StreamActionButtonXpath(String stream)
    {
        return "//span[text()='"+stream+"']/../..//div//i[@fleet-tooltip='Actions']";
    }
     
     public static String StreamActionRemoveButtonXpath(String stream)
    {
        return "//span[text()='"+stream+"']/../..//div//ul//li//span[text()='Remove']";
    }
    
     public static String removeImportXpath()
    {
        return "//a//span[text()='Remove']";
    }
    public static String SiteCheckAllXpath() 
    {
        return "//ul[@options='assetsTreeOptions']//ul//li[1]//div[@options='options']//span";
    }
    
    public static String SelectAllCheckAllXpath(String site) 
    {//span[text()='"+site+"']/../input
        return "//span[@class='ng-binding'][text()='"+site+"']";
    }//span[@class='ng-binding'][text()='Default Site']
    public static String jobsStatusesCheckboxRelativeXpath() 
    {
        return "//input[@name='jobsIncluded']";
    }
    
    public static String ExpandSiteAssetsRelativeXpath() 
    {
        return "//ul[@options='assetsTreeOptions']//li//span[@ng-click='item.expanded = true']";
    } 
    
    public static String StreamsImgRelativeXpath() 
    {
        return "//img[@src='img/feed-draghandle.png']";
    }
    
    public static String AssetRemovedSuccessfulXpath()
    {
        return "//span[text()='Asset removed successfully']";
    }
    
    
    public static String PopUpBoxXpath()
    {
        return "//div[@aria-hidden='false']/form";
    }
    
    public static String ButtonRemoveAssetXpath()
    {
        return "//div[@aria-hidden='false']/form//button[text()='Remove']";
    }
    
    public static String ValidateAssetToDelete(String assetName)
    {
        return "//div[@aria-hidden='false']//strong[contains(text(),'"+assetName+"')]";
    }
    
    public static String ActionButtonBYxpath()
    {
        return "//a[@class='row-action']";
    }
    
    public static String RemoveActionButtonByXpath()
    {
        return "//ul[contains(@style,'display: block')]/li/a[@event='Remove']";
    }
    
    public static String StreamsActionButtonRelativeXpath() 
    {
        return "//i[@fleet-tooltip='Actions']";
    }
    
    public static String StreamsRemoveButtonRelativeXpath() 
    {
        return "//span[text()='Remove']/..";
    }
    
    //  <editor-fold defaultstate="collapsed" desc="Edit cost data Odo"> 
    
    public static String OtherCostDataRelatieXpath() 
    {
        return "//a[text()='Other cost data']";
    }
    
    public static String TargetCostPerDistanceLabelRelatieXpath() 
    {
        return "//strong[text()='Target cost per distance: ']";
    }
    
    
    public static String AddEntryRelatieXpath() 
    {
        return "//button[text()='Add entry']";
    }
    
    public static String ButtonCancelXpath()
    {
        return "//div/form//button[text()='Cancel']";
    }
        
    public static String ButtonDeleteXpath()
    {
        return "//div/form//button[text()='Delete']";
    }
    
    public static String ButtonCloseIconXpath()
    {
        return "//div/form/div/div[@class='alert alert-warning']/button[@class='close']";
    }
    
    public static String buttonCancelXpath()
    {
        return "//button[text()='Cancel']";
    }
    
    public static String UploadImageButtonCancelXpath()
    {
        return "//div[@class='modal-footer']/button[text()='Cancel']";
    }
    
    public static String ImportFuel_ButtonCloseXpath()
    {
        return "//h5[text()='Import fuel']/../../../div/a[text()='Close']";
    }
    
    public static String popUpXpath()
    {
        return "//h5[text()='Import fuel']/../../../div/a[text()='Close']/../../../../div[contains(@style,'display: block')]";
    }
    
    public static String AssetDiscriptionTextboxXpath()
    {
        return "//input[@name='description']";
    }
    
    public static String ImportFuel_ButtonCloseIconXpath()
    {
        return "//h5[text()='Import fuel']/../button";
    }
    
    public static String ButtonSaveDisabledXpath()
    {
        return "//button[text()='Save'][contains(@disabled,'disabled')]";
    }
    
    public static String UploadPassengerImagePopUpWindowXpath()
    {
        return "//div[@name='passengerImageUpload']";
    }
    
    
    public static String hoverOverImageXpath()
    {
        return "//div[@id='fa-photo']/div[@class='thumbnail']/img";
    }
     public static String clickChangePhotoXpath()
    {
        return "//div[@id='btn-change-photo']/a/span";
    }
    
     public static String AddPassengerSpinnerXpath()
     {
         return "//div[@class='row-fluid container-fixed-right']//div[@class='loading-overlay ng-scope'][@ng-show='contentLoadingStack && contentLoadingStack.length > 0'][@style='display: none;']";
     }
    
    
    public static String ButtonOkDisabledXpath()
    {
       // return "//button[@text=\'OK\'][@disabled]";
        return "//button[text()='OK'][contains(@disabled,'disabled')]";
    }
    
    public static String ButtonOkXpath()
    {
        return "//button[text()='OK']";
    }
    
    public static String ChooseFileMaxSizeExceededErrMsgXpath()
    {
        return "//div[text()='Max file size exceeded']";
    }
    
    public static String ChooseFileIncorrectFileTypeErrMsgXpath()
    {
        return "//div[text()='Incorrect file type']";
    }
    
    public static String DeleteConfirmationWindowXpath()
    {
        return "//div/form/div/div/h5[text()='Delete site']";
    }
 
    
    public static String ActiveTabXpath()
    {
        return "//ul[@class='nav nav-tabs tabs-three']/li[@class='active']/a/span[text()='Assets']";
    }
    public static String activeTabIconXpath()
    {
        return "//ul[@class='nav nav-tabs tabs-three']//li[@class='active']//a//i[@class='icon-car']";
    }
    
    public static String AssetTabXpath()
    {
        return "//ul[@class='nav nav-tabs tabs-three']/li/a/span[text()='Assets']";
    }
    public static String assetTabIconXpath()
    {
        return "//div[@class='span12 tab_container']//ul[@class='nav nav-tabs tabs-three']//li//a//i[@class='icon-car']";
    }
    
    public static String DriversTabXpath()
    {
        return "//ul[@class='nav nav-tabs tabs-three']/li/a/span[text()='Drivers']";
    }
    public static String driversTabIconXpath()
    {
        return "//div[@class='span12 tab_container']//ul[@class='nav nav-tabs tabs-three']//li//a//i[@class='icon-drivers']";
    }
    
    public static String DriversTabCountXpath()
    {
        return "//ul[@class='nav nav-tabs tabs-three']/li/a/span[text()='Drivers']/../span[2]";
    }
    
    public static String AssetsTabCountXpath()
    {
        return "//ul[@class='nav nav-tabs tabs-three']/li/a/span[text()='Assets']/../span[2]";
    }
    
    public static String driverTabCountXpath()
    {
        return "//ul[@class='nav nav-tabs tabs-three']//li//a//i[@class='icon-drivers']//..//..//span[text()]";
    }
    
    public static String assetTabCountXpath()
    {
        return "//ul[@class='nav nav-tabs tabs-three']//li//a//i[@class='icon-car']//..//..//span[text()]";
    }
    
    public static String FocusedOnTopLevelOrgGroupXpath()
    {
        return "//div[@class='tree-item organisation-groups selected font-bold ng-scope ui-draggable fleet-draggable-item ui-droppable fleet-droppable-item']";
                             
    }
    
    public static String TopLevelOrgGroupXpath(String Org)
    {
        return "//div[@item='item']/div/span[text()='"+Org+"']";
    }
    
    public static String FocusedOnTopLevelOrgGroupXpathFirefox()
    {
        return "//div[@class='tree-item organisation-groups selected font-bold ng-scope ui-droppable fleet-droppable-item ui-draggable fleet-draggable-item']";
    }
    
    public static String CaptureCostDataLegendRelatieXpath() 
    {
        return "//legend[text()='Capture cost data']";
    }
    
    public static String AllAssetsCountXpath()
    {
        return "//div[@class='page-header']/ul/li/span";
    }
    //available assets count xpath
    public static String availableAssetsXpath()
    {
        return "//li//a//span[text()='Available']//..//span[@class='pull-right badge badge-grey ng-binding']";
    }
    //decommissioned assets count xpath
    public static String decommissionedAssetsXpath()
    {
        return "//li//a//span[text()='Decommissioned']//..//span[@class='pull-right badge badge-grey ng-binding']";
    }
    
    public static String OrgGroupExpandedXpath()
    {
        return "//div/../../span[@ng-click='item.expanded = false']";
    }
    
    public static String buttonAddGroupXpath()
    {
        return "//div[@class='btn-group']/a[@ng-disabled='!selectedGroup || selectedGroup.type == siteType || selectedGroup.type == defaultType']";
    }
    
    public static String SiteLinkXpath()
    {
        return "//a[text()='Site']";
    }
    
    public static String ButtonAddPassegerXpath()
    {
        return "//span/a[@fleet-tooltip='Add passenger']/i/..";
    }
    
    public static String PassengerPageRightSpinnerXpath()
    {
        return "//div[@fleet-loader=\"content\"]/div[contains(@class,'loading-overlay')][contains(@style,'none')]";
    }
    
    public static String PassengerPageLeftSpinnerXpath()
    {
        return "//ul[@fleet-loader=\"content\"]/div[contains(@class,'loading-overlay')][contains(@style,'none')]";
    }
    
    public static String PassengerNameInputFieldXpath()
    {
        return "//input[@name='passengerName']";        
    }
        public static String PassengerMobileInputFieldXpath()
    {
        return "//input[@name='mobileNumber']";        
    }
                
        public static String PassengerEmailInputFieldXpath()
    {
        return "//input[@name='email']";        
    }
                
        public static String PassengertextareaInputFieldXpath()
    {
        return "//label[text()='Notes']//../textarea";        
    }
    
    
    public static String AddPassengerButtonTooltipTextXpath()
    {
        return "//div/div[@class='tooltip-inner']/span[text()='Add passenger']";
    }
    
    public static String RequiredNameTextBoxErrMsgXpath()
    {
        return "//input[@name='passengerName']/../span[text()='This field is required']";
    }
    public static String PassengerNameInputFieldAlreadInUsedErrXpath()
    {
        return "//input[@name='passengerName']/../span/span[text()='Passenger name is in use']";
    }
    
    public static String ImageXpath()
    {
        return "//div[@class='thumbnail']/img";
    }
    
    public static String PhotoIconXpath()
    {
        return "//div[@id='fa-photo']";
    }
    
    public static String DefaultPhotoIconRemvedXpath()
    {
        return "//div[@id='fa-photo']/div/img[contains(@style,'display: none')]";
    }
    
    public static String PhotoImageXpath()
    {
        return "//img[@ng-show='imageUrl']";
    }
    
    public static String ChangePhotoXpath()
    {
        return "//div[@id='fa-photo']/div/a/span/..";
    }
    
    public static String Change_PhotoXpath()
    {
        return "//ChangePhoto.PNG";
    }
    
    public static String defaultImageXpath()
    {
        return "//div[@id='fa-photo']/div/img";
    }
    
    public static String ChangesNotSavedXpath()
    {
        return "//div[@aria-hidden='false']//div/div/button/..//h5[text()='Changes not saved']";
    }
    
    public static String DiscardPassengerChangesQuestionXpath()
    {
        return "//div/div[text()='Are you sure you would like to discard your changes?']";
    }
    
    public static String RemoveImageIconXpath()
    {
        return "//div[@id='btn-remove-photo']/a/i[@class='icon-remove icon-red']/..";
    }
    
    public static String AlreadyInUsePassengerIDTextBoxErrMsgXapth()
    {
        return "//input[@name='fmPassengerId']/../span/span[text()='Passenger ID is already in use']";
    }
    
    public static String ValidateMinMaxIdValueByXpathErrMsg()
    {
        return "//span[text()='Value must be a whole number between -32768 and 32767']";
    }
    
    public static String NotesTextAreaXpath()
    {
        return "//label[text()='Notes']/../textArea";
    }
    
    public static String PassengerIDInputFieldXpath()
    {
        return "//input[@name='fmPassengerId']";
    }
    
    public static String SiteNameInputFieldXpath()
    {
        return "//input[@name='siteName']";
    }
    
    public static String buttonSaveXpath()
    {
        return "//button[text()='Save']";
    }
    
    public static String buttonSaveDisabledXpath()
    {
        return "//button[ @disabled='disabled']";
    }
    
    public static String ButtonYesXpath()
    {
        return "//button[text()='Yes']";
    }
    
    public static String ButtonNoXpath()
    {
        return "//button[text()='No']";
    }
    
    public static String GroupNameXpath(String GroupName)
    {
        return "//td/div/a/span[text()='"+GroupName+"']";
    }
    
    public static String CustomGroupAddedNotificationXpath()
    {
        return "//span[text()='Group updated successfully']";
    }
    
    public static String ButtonSelect_membershipXpath()
    {
        return "//form[@name='customGroupMembershipForm']/div/h5[text()='Asset selection']/../button";
    }
    
    public static String checkAllAssetsXpath()
    {
        return "//tr/th[@ng-show='allowRowSelection && allowSelectAll']/input[@ng-show='!singleSelect']";
    }
    
    public static String buttonEditGroupXpath()
    {
        return "//div[@class='selection-btn-right pull-right']/a[@disabled='disabled']";
    }
    
    public static String DateTimePickerRelatieXpath(String Date) 
    {
        return "//input[@placeholder='Example: "+Date+"']";
    }
    
    public static String odometerTextBoxRelatieXpath() 
    {
        return "//input[@name='odometer']";
    }
    
    public static String categoryDropdownRelatieXpath() 
    {
        return "//select[@name='categoryId']";
    }
    
    public static String transactionAmountRelatieXpath() 
    {
        return "//input[@name='transactionAmount']";
    }
    
    public static String MemoTextboxRelatieXpath() 
    {
        return "//textarea[@name='memo']";
    }
    
    public static String SaveButtonRelatieXpath() 
    {
        return "//button[text()='Save']";
    }
    
    
    public static String transactionTableRelatieXpath() 
    {
        return "//div[@columns='transactionGridColumns']//div//div//table";
    }
    
    public static String transactionTable1RelatieXpath() 
    {
        return "//div[@columns='transactionGridColumns']//div//div//table//tbody";
    }
   
    
    public static String OdometreReadingDropdownRelatieXpath(String OdometerReadingValue) 
    {
        return "//a[text()='"+OdometerReadingValue+"']//i[@class='icon-chevron-down ml-3']";
    }
    
    public static String OdometreReadingTextRelatieXpath(String OdometerReadingValue) 
    {
        return "//span[text()='"+OdometerReadingValue+"']";
    }
    
    public static String EditButtonRelatieXpath() 
    {
        return "//div//div//a[@class='btn-actions']";
    }
    
     public static String EditButton1RelatieXpath() 
    {
        return "//ul//li[@class='ng-scope']//span[text()='Edit']";
    }
    
     public static String DeleteButton1RelatieXpath() 
    {
        return "//ul//li[@class='ng-scope']//span[text()='Remove']";
    }
     
     public static String YesButton1RelatieXpath() 
    {
        return "//button[text()='Yes']";
    }
     
     
     public static String ExportServerSideEventButtonXpath() 
    {
        return "//button[@fleet-tooltip='Export server-side events']";
    }
   
   public static String ColumnChooserButtonXpath() 
    {
        return "//a[@class='btn btn-small column-chooser']";
    }
   
   public static String GridHeaderTitleListXpath() 
    {
        return "//div[@name='serverSideEventListGrid']//span[@class='title']";
    }
   
   public static String RecordColumnXpath()
    {
        return "//ul[contains(@style, 'display: block')]//li//span[text()='Record']/..";
        
        
    }
    
    public static String AssetsColumnXpath()
    {
//        return "//li//span[text()='Assets']/..//i";
        return "//ul[contains(@style, 'display: block')]//li//span[text()='Assets']/..";
    }
    
    public static String DriversColumnXpath()
    {
        return "//ul[contains(@style, 'display: block')]//li//span[text()='Drivers']/..";
    }
    
    public static String EventNameColumnXpath()
    {
        return "//ul[contains(@style, 'display: block')]//li//span[text()='Event name']/..";
    }
    
    public static String EventTypeColumnXpath()
    {
        return "//ul[contains(@style, 'display: block')]//li//span[text()='Event type']/..";
    }
    
    public static String FrequencyColumnXpath()
    {
        return "//ul[contains(@style, 'display: block')]//li//span[text()='Frequency']/..";
    }
    
    public static String LastEditByColumnXpath()
    {
        return "//ul[contains(@style, 'display: block')]//li//span[text()='Last edit by']/..";
    }
    
    public static String LastEditTimeColumnXpath()
    {
        return "//ul[contains(@style, 'display: block')]//li//span[text()='Last edit time']/..";
    }
   
   
   public static String EventDescriptionSpanXpath() 
    {
        return "//span[text()='Event description']";
    }
     
     
     public static String EditSpanButtonRelatieXpath() 
    {
        return "//ul[@style='display: block; left: 1648px; top: 460px; right: auto;']//li//a//i[@class='icon icon-edit icon-green']";
    }
    
     public static String EditSpanButton1RelatieXpath() 
    {
        return "//ul[@style='display: block; left: 1648px; top: 518px; right: auto;']//li//a//i[@class='icon icon-edit icon-green']";
    }
     
     public static String RemoveAssetRelatieXpath() 
    {
        return "//ul[contains(@style,'block')]//a[@row-index='0']//span[text()='Remove']";
        
    }
     
     public static String RemoveAssetButtonRelatieXpath() 
    {
        return "//button[text()='Remove']";
    }
     
   
    
    public static String MixTelematicsLogXpath() 
    {
        return "//img[@alt='MiX Telematics']";
    }
    
    public static String FirstRegistrationNumber()
    {
        return "//div[@name='assetListGrid']/div/div/div[@class='column']/div/span[text()='Asset type']/../../div[text()!='Trailer']/../..//span[text()='Registration number']/../../div[2]";
    }
    
    
    
    public static String MixTelematicsTopRightPageMenuItemsXpath() 
    {
        return "//ul[@class='nav nav-top-right']//li";
    }
    
    public static String LoginNameXpath() 
    {
        return "//div[@class='login-name']";
    }
    
    public static String PageNameXpath() 
    {
        return "//span[text()='Server-side events']";
    }
    
    
    public static String ActiveMenuTabXpath() 
    {
        return "//ul[@name='serverSideEventTypeFilter']//li[contains(@class, 'active')]";
    }
    
    public static String EventNameXpath() 
    {
        return "//div[@name='serverSideEventListGrid']//div[@class='column']//a";
    }
   
    public static String lastRefreshTimerXpath() 
    {
        return "//span[@class='last-refresh-timer']";
    }
    
   
    
    
    public static String NextPageXpath() 
    {
        return "//button[@fleet-tooltip='Next page']";
    }
    
    public static String PreviousPageXpath() 
    {
        return "//button[@fleet-tooltip='Previous page']";
    }
    
    public static String serverSideEventTypeListXpath() 
    {
        return "//ul[@name='serverSideEventTypeFilter']//li";
    }
    
    
    public static String serverSideEventnameXpath() 
    {
        return "//a[@fleet-tooltip='Add server-side event']/../..//ul";
    }
    
    public static String serverSideEventFilterTextboxXpath() 
    {
        return "//a[@fleet-tooltip='Add server-side event']/../..//div[@class='text-filter empty']//input";
    }
    
    
    public static String serverSideEventnameAndEventsXpath() 
    {
        return "//div[@class='page-header']//ul";
    }
    
    
    
    //  </editor-fold>   
     
     //  <editor-fold defaultstate="collapsed" desc="DMF-43:Download Import Template - Import new records"> 
     
   public static String DriversSubMenuRelativeXpath() 
    {
        return "//a[text()='Drivers']";
    }
   
   public static String AllLabelXpathRelativeXpath() 
    {
        return "//strong[text()='All']";
    }
   
   public static String DownloadcancelButtonXpathRelativeXpath() 
    {
        return "//div[@class='modal-footer']//a[text()='Cancel']";
    }
   
   public static String WouldYouLikeToXpathRelativeXpath() 
    {
        return "//strong[text()='Would you like to:']";
    }
   
   
   public static String DriverDetailsXpath() 
    {
        return "//legend[text()='Driver details']";
    }
   
    public static String driverNameTextboxXpath() 
    {
        return "//input[@name='driverName']";
    }
   
    public static String fmDriverIdTextboxXpath() 
    {
        return "//input[@name='fmDriverId']";
    }
   
    public static String mobileNumberTextboxXpath() 
    {
        return "//input[@name='mobileNumber']";
    }
   
    public static String employeeNumberTextboxXpath() 
    {
        return "//input[@name='employeeNumber']";
    }
   
    public static String emailAddressTextboxXpath() 
    {
        return "//input[@name='email']";
    }
   
    public static String siteIdDropdownXpath() 
    {
        return "//select[@name='siteId']";
    }
    
    
    public static String countryDropdownXpath() 
    {
        return "//select[@name='country']";
    }
   
   
   
     
     //  </editor-fold> 
    
    //  <editor-fold defaultstate="collapsed" desc="Server Side Events"> 
     
   public static String AddServerSideEventButtonXpath() 
    {
        return "//a[@fleet-tooltip=\"Add server-side event\"]";
    }
   
   
   public static String ServerSideCancelButtonXpath() 
    {
        return "//a//span[text()='Cancel']";
    }
   
   //a//span[text()='Back']
   
   public static String ServerSideBackButtonXpath() 
    {
        return "//a//span[text()='Back']";
    }
   
   public static String ServerSideSaveButtonXpath() 
    {
        return "//span[text()='Save']/..";
    }
   
   
   public static String EventDescriptionTextboxXpath() 
    {
        return "//input[@name=\"eventName\"]";
    }
   
    public static String RecordEventForComboboxXpath() 
    {
        return "//select";
    }
    
    public static String NextButtonXpath() 
    {
        return "//span[text()='Next']";
    }
    
    //span[text()='Cancel']
    
    public static String assetGroupTreeIconXpath() 
    {
        return "//ul[@items=\"$controller.assetGroupTree\"]//div//span//i";
    }
    
    public static String driverGroupTreeIconXpath() 
    {
        return "//ul[@items=\"$controller.driverGroupTree\"]//div//span//i";
    }
    
    public static String driverGroupTreeSpanXpath() 
    {
        return "//ul[@items=\"$controller.driverGroupTree\"]//div//span[@class=\"ml-10 label ng-binding\"]";
    }
    
    public static String assetGroupTreeSpanXpath() 
    {
        return "//ul[@items='$controller.assetGroupTree']//div//span[@class='ml-10 label ng-binding']";
    }
    
    public static String EventTypeLabelXpath() 
    {
        return "//label[text()='Event type']";
    }
    
    public static String requiredFieldXpath() 
    {
        return "//span[text()='This field is required']";
    }
    
    public static String DropdownOptionXpath() 
    {
        return "//option";
    }
    
    public static String groupsRadioButtonXpath() 
    {
        return "//input[@value='groups']";
    }
    
    public static String individualRadioButtonXpath() 
    {
        return "//div[@ng-show=\"$controller.pageData.serverSideEventDetails.assetsDrivers == 'Drivers' || $controller.pageData.serverSideEventDetails.assetsDrivers == 'Both'\"]//input[@value='individual']";
    }
    
    
    public static String driversParagraphTextXpath() 
    {
        return "//div[@ng-show=\"$controller.driverTab == 'groups'\"]//p";
    }
    
    public static String driversAvailableGroupTextXpath() 
    {
        return "//ul[@items=\"$controller.driverGroupTree\"]//a[@class='tree-item']//span[@class='ng-binding']";
    }
    
    
    public static String driversExpandAvailableGroupiconXpath() 
    {
        return "//ul[@items=\"$controller.driverGroupTree\"]//li//span[@ng-click=\"item.expanded = true\"]";
    }
    
    public static String driversAvailableGroupsXpath() 
    {
        //
        return "//div[@class=\"tree-sub-items ng-scope\"]//ul";
    }
    
    public static String IndividualDriversAvailableGroupsXpath() 
    {
        //
        return "//ul[@items='$controller.driverTree']//div[@class='tree-sub-items ng-scope']//ul";
    }
    
    
    public static String IndividualDriversSubGroupsXpath(String group) 
    {
        //
        return "//ul[@items='$controller.driverTree']//ul//span[text()='"+group+"']";
    }
    
    public static String IndividualDriversSubGroupExpandIconXpath() 
    {
        //
        return "//ul[@items='$controller.driverTree']//ul//li//span[@ng-click=\"item.expanded = true\"]";
    }
    
    public static String IndividualDriversSubGroupXpath() 
    {
        //
        return "//ul[@items='$controller.driverTree']//ul//li//div//ul//li";
    }
    
    
    
    
    public static String driversAvailableGroupsXpath(String site) 
    {
        return "//ul//span[text()='"+site+"']";
    }
    
    public static String individualParagraphTextXpath() 
    {
        return "//div[@ng-show=\"$controller.driverTab == 'individual'\"]//p";
    }
    
    
    public static String assetTreeListXpath() 
    {
        return "//ul[@items='item[options.modelItemsProperty]']";
    }
    
    
    public static String SelectAllCheckBoxXpath() 
    {
        return "//ul[@items='$controller.driverTree']//div//div//input";
    }
    
    public static String selectAllCheckboxFirefoxXpath()
    {
        return "//ul[@items='$controller.driverTree']/li/div/div/span";
    }
    
    public static String SelectAlldriverTreeCheckBoxXpath() 
    {
        return "//ul[@items='$controller.driverTree']//span[@class='ng-binding strong']";
    }
    
    
    
    public static String CheckBoxListXpath() 
    {
        return "//ul[@items=\"item[options.modelItemsProperty]\"]";
    }
    
    public static String driverTreeListXpath() 
    {
        return "//ul[@items='$controller.driverTree']//li//span[@ng-click='item.expanded = true']";
    }
    
    public static String yesButtonXpath() 
    {
        return "//button[text()='Yes']";
    }
    
    public static String OnceOffRadioButtonXpath() 
    {
        return "//label[@class='radio mr-10']//input[@value='false']";
    }
    public static String RecurringRadioButtonXpath() 
    {
        return "//label[@class='radio mr-10']//input[@value='true']";
    }
    
    public static String CharactersExceedSpanXpath() 
    {
        return "//div[@class='span6']//span";
    }
    
    public static String DescriptionAlreadyExistSpanXpath() 
    {
        return "//div[@class='span6']//span//span[@class='validity-message ng-binding']";
    }
    
    public static String AssetsTableXpath() 
    {
        return "//div[@class=\"columns ui-sortable\"]//div//div[@class='column']";
    }
    
    
    public static String recurringRadioButtonXpath() 
    {
        return "//label[@class='radio mr-10']//input[@value='true']";
    }
    
    
    public static String DateTimePickerXpath() 
    {
        return "//div[@type='date']//input";
    }
    
    public static String DateTimePickerIconXpath() 
    {
        return "//div[@type='date']//i";
    }
    
    public static String DateTimePickerRequiredFieldSpanXpath() 
    {
        return "//div[@ng-show='$controller.pageData.serverSideEventDetails.recurring == true']//span[text()='This field is required']";
    }
    
    public static String DateTimePickerTomorrowWeekdayXpath() 
    {
        return "//div[@class='day-of-week ng-binding']";
    }
    
    public static String DateTimePickerCurrentMonthXpath() 
    {
        return "//span[@class='month ng-binding']";
    }
    
    public static String DateTimeCurrentMonthXpath() 
    {
        return "//span[@class='month ng-binding']";
    }
    
    public static String DateTimePickerCurrentYearXpath() 
    {
        return "//span[@class='year ng-binding']";
    }
    
    public static String DateTimePickerCurrentSelectedDayXpath() 
    {
        return "//div[@class='day ng-scope ng-binding selected']";
    }
    
    public static String DoneButtonXpath() 
    {
        return "//a[text()='Done']";
    }
    
    
   
    
   
     //  </editor-fold>
    
    //  <editor-fold defaultstate="collapsed" desc="live tracking"> 
    
    public static String SelectedOrgRelativeXpath() //use textCotent Attributte
    {
        return "//div[@class='organisation-selector']";
    }
    public static String LiveTrackingPageNameXpath() 
    {
        return "//span[text()='Live tracking']";
    }
     
    public static String LocationsButtonXpath() 
    {
//        return "//a[@fleet-tooltip='Locations']//i";
        return "//div[@class='pull-right dropdown']//a[@fleet-tooltip='Locations']/i/..";
    }
    
    public static String LocationsButtonXpath2() 
    {
//        return "//a[@fleet-tooltip='Locations']//i";
        return "//div[@class='pull-right dropdown']//a[@fleet-tooltip='Locations']/i/..";
    }
    
    public static String EventsButtonXpath() 
    {
        return "//a[@fleet-tooltip='Events']";
    }
    
    public static String AssetsTabXpath() 
    {
        return "//a[@class='mobitech-tracking-tab active']//span[text()='Assets']";
    }
     
    public static String WorkersTabXpath() 
    {
        return "//a[@class='mobitech-tracking-tab']//span[text()='Workers']";
    }
    
    
    public static String LocationsButtonTooltipXpath() 
    {
//        return "//span[text()='Locations']";
         return "//div[@class='ng-scope tooltip left in']//span[text()='Locations']";
        
    }
     
    public static String EventsButtonTooltipXpath() 
    {
        return "//span[text()='Events']";
    }
    
    public static String mapcontainerDivXpath() 
    {
        return "//div[@id='map-container']";
    }
    
    
    public static String VisibleAssetsTableXpath() 
    {
        return "//div[@visible-columns='assetGridVisibleColumns']//table";
    }
    
    public static String LiveTrackingLinkTextXpath()
   {
       return "//li/a[text()='Live tracking']";
   }
    
   public static String DropDownListMapProviderXpath()
   {
       return "//select[@ng-model='mapProvider']";
   }
   
   //-.--.-..--.----------------------------Decarta .------------------///
   public static String DecartaStreetXpath()
   {
       return "//div/img[contains(@class,'leaflet-tile')][contains(@src,'decarta')and('street')][1]";
   }
   public static String HereStreetXpath()
   {
       return "//div/img[contains(@class,'leaflet-tile')][contains(@src,'here')][1]";
   }
   public static String HereHybridXpath()
   {
       return "//div/img[contains(@class,'leaflet-tile')][contains(@src,'here')and('hybrid')][1]";
   }
   public static String HereTerrainXpath()
   {
       return "//div/img[contains(@class,'leaflet-tile')][contains(@src,'here')and('terrain')][1]";
   }
   public static String HereSatelliteXpath()
   {
       return "//div/img[contains(@class,'leaflet-tile')][contains(@src,'here')and('satellite')][1]";
   }
   public static String HereTrafficXpath()
   {
       return "//div/img[contains(@class,'leaflet-tile')][contains(@src,'here')and('traffic')][1]";
   }
   
   //-.--.-.-.-.-.-..-.-.-.-..Google-...---..-.-.-...-.-.-.
   
  
   public static String GoogleStreetXpath()
   {
       return "//div[@class='gmnoprint']/div/div/span";
       //return "//div[@class='leaflet-top leaflet-left']//..//div[@class='leaflet-map-pane']//..//..//div[@class='leaflet-control-container']//div[@class='gmnoprint']//div//span";
   }     
   public static String GoogleHybridXpath()
   {
       return "//div[@class='gmnoprint']/div/div/span";
       //div[@class='leaflet-top leaflet-left']//..//div[@class='leaflet-map-pane']//..//..//div[@class='leaflet-control-container']//div[@class='gmnoprint']//div//span[text()='Map data ©2016 AfriGIS (Pty) Ltd, Google  Imagery ©2016 , CNES / Astrium, Cnes/Spot Image, DigitalGlobe, Landsat']
   }
   public static String GoogleTerrainXpath()
   {
          return "//div[@class='gmnoprint']/div/div/span";
   }    
   public static String GoogleSatelliteXpath()
   {
          return "//div[@class='gmnoprint']/div/div/span";
   }
    
    
    public static String DropDownListOptionMapProviderXpath()
   {
       return "//select[@ng-model='mapProvider']/option";
   }
    
   public static String SelectionLocationsXpath()
   {
       return "//span[text()='Select locations']";
   }
   
   public static String FilterTextBoxXpath()
   {
       return "//div[@name='locationListModal']//form//input[@placeholder='Filter']";
   }
   
   public static String eventsFilterTextBoxXpath()
   {
       return "//div[@name='eventsModal']//form//input[@placeholder='Filter']";
   }
   
   
   
    public static String SelectLocationTableHeadersXpath()
   {
       return "//div[@text-filter='filterObj.filterQuery']//table//thead//th";
   }
   
    public static String SelectLocationCancelButtonXpath()
   {
       return "//div[@name='locationListModal']//button[text()='Cancel']";
   }
   
    
   public static String SelectLocationSelectButtonXpath()
   {
       return "//div[@name='locationListModal']//button[text()='Select']";
   }
    
    public static String SelectLocationTableRowsXpath()
   {
       return "//div[@text-filter='filterObj.filterQuery']//table//tbody//tr";
   }
    
    
   public static String FilterCancelButtonXpath()
   {
       return "//div[@name='locationListModal']//button[text()='Cancel']";
   }
   
   public static String RemoveFilterButtonXpath()
   {
       return "//div[@name='locationListModal']//i[@class='icon-remove-sign']";
   }
   
    public static String CancelEventsFilterButtonXpath()
   {
       return "//div[@name='eventsModal']//i[@class='icon-remove-sign']";
   }
    
   
   public static String FilterCancelEventButtonXpath()
   {
       return "//div[@name='eventsModal']//button[text()='Cancel']";
   }
   
   
   
   public static String SelectAllLocationsCheckBoxXpath()
   {
       return "//div[@text-filter='filterObj.filterQuery']//table//thead//th[@class='selection']//input[@type='checkbox']";
   }
   
   public static String SelectAllEventsCheckBoxXpath()
   {
       return " //span[text()='Select events']/../../../../../..//thead//th[@class='selection']//input[@type='checkbox']";
   }
   
   public static String SelectEventsCheckBoxXpath()
   {
       return "//span[text()='Select events']/../../../../../..//tbody//td//input[@type='checkbox']";
   }
  
    
   public static String SelectLocationsCheckBoxXpath()
   {
       return "//div[@text-filter='filterObj.filterQuery']//table//tbody//input[@type='checkbox']";
   }
   
   
   
   
   public static String SelectedLocationsOnMapXpath()
   {
       return "//*[local-name()='path']";
   }
   
   public static String SelectedButtonXpath()
   {
       return "//button[text()='Select']";
   }
   
   public static String zoomOutButtonXpath()
   {
       return "//a[@class='leaflet-control-zoom-out']";
   }
    
    public static String SelectionEventsSpanXpath()
   {
       return "//span[text()='Select events']";
   }
    
    
   public static String SelectEventsCancelButtonXpath()
   {
        return "//div[@class='modal hide fade in']//button[text()='Cancel']";
       //return "//div[@name='eventsModal']//button[text()='Cancel']";
   }
   
    
   public static String SelectEventsSelectButtonXpath()
   {
       return "//div[@class='modal hide fade in']//button[text()='Select']";
       //return "//div[@name='eventsModal']//button[text()='Select']";
   }
   
   
   public static String SelectedEventsSpanXpath()
   {
       return "//a[@fleet-tooltip='Events']//span";
   }
    
   public static String SelectedLocationSpanXpath()
   {
       return "//a[@fleet-tooltip='Locations']//span";
   }
   
    
    
     
    
    //  </editor-fold>
   
   public static String tableRowXpath()
   {
       return "//div[contains(@columns,'fuelDataGridColumns')]//table/tbody/tr";
   }
   
   public static String EngineHoursFirstCellXpath()
   {
       return "//div[contains(@columns,'fuelDataGridColumns')]//table/tbody/tr[1]/td[9]/div/span";
   }
   
   public static String FuelData_1stDateCellXpath()
   {
       return "//div[contains(@columns,'fuelDataGridColumns')]//table/tbody/tr[1]/td[2]/div/span";
   }
   
      
   public static String IENetworkImage()
   {
       return "IENetWork.png";
   }
      public static String NetworkImage()
   {
       return "Network.png";
   }
          
      public static String FFNetworkImage()
   {
       return "FFNetwork.png";
   }
          
      public static String FFFileImage()
   {
       return "FFFile.png";
   }
      
    
   public static String ExtractNameImage()
   {
       return "ExtractNameImageCircle.png";
   }
   
   public static String HeadersImage()
   {
       return "HeadersIMG.png";
   }
   
   public static String RequestURLImage()
   {
       return "RequestURL.png";
   }
   
   public static String googleCutomImage()
   {
       return "googleCutomIMG.png";
   }
   public static String ButtonRecordImage()
   {
       return "ButtonRecord.png";
   }
   
   public static String ZoomInImage()
   {
       return "ZoomIn.png";
   }
   
   public static String AuditsImage()
   {
       return "Audits.png";
   }
   
    
   public static String nameImage()
   {
       return "name.png";
   }
      
   public static String filterTextBoxImage()
   {
       return "filterTextBox.png";
   }
                    
        public static String CreateLokasiImage()
   {
       //return "CreateLokasi.png";
       return "CreateLokasi2.png";
   }
                   
          public static String RectangleImage()
   {
       return "Rectangle.png";
   }
            
          public static String point1Image()
   {
       return "point1.png";
   }
                    
          public static String DestinationImage()
   {
       return "Destination.png";
   }
   
   public static String NoItemsOnTheGridXpath()
   {
       return "//div[contains(@style,'display: none')=true]/span[text()='No items to display']";
   }
          
   public static String FuelDataNoItemToDisplayXpath()
   {
       return "//div[contains(@columns,'fuelDataGridColumns')]/div[contains(@style,'display: none')]/span[contains(text(),'No items to display')]";
   }
   
   //  <editor-fold defaultstate="collapsed" desc="show trail on map"> 
    public static String AssetsTableRowsXpath()
   {
       return "//div[@visible-columns='assetGridVisibleColumns']//table//tbody//tr";
   }
    public static String AssetsCheckBoxRowsXpath(String Asset)
   {
       return "//span[text()='"+Asset+"']/../../../..//span//input[@type='checkbox']";
   }
    
    public static String BackToAssetListButtonsXpath()
    {
        return "//div[@ng-show=\"leftPanel == 'assetDetails'\"]//span[text()='Back to asset list']";
    }
    
    public static String ShowSelectedAssetsXpath()
    {
        return "//span[text()='Show selected assets']";
    }
    
    public static String ShowAssetsCheckBoxes()
    {
        return "//div[@columns='assetGridColumns']//table//td[@column-field='showAssetOnMap']//input";
    }
    
    
    
    //filter xpath //div[@class='row-fluid']//input[@ng-model='mainFilterQuery']
    public static String AssetFilter()
    {
        return "//div[@class='row-fluid']//input[@ng-model='mainFilterQuery']";
    }
    public static String AssetSearch()
    {
        return "//div[@class='input-append no-margins']//input[@ng-model='filterQuery.text']";
    }
    public static String AssetButtonSearch()
    {
        return "//button[@class = 'btn historical-tracking-filter']";
    }
    public static String ExpandAssetIcon()
    {
        return "//i[@class = 'icon-grey icon-plus']";
    }
    public static String assetDropdown()
    {
        return "//div[@class=\"well well-small well-white no-margin\"]//a[@class = 'btn-actions dropdown-toggle']";
    }
    public static String ViewDateXpath()
    {
        return "//a[@fleet-tooltip=\"View dates\"]";
    }
    public static String showOnMapXpath()
    {
        return "//div[@class = 'btn-group pull-right open']//span[text() = 'Show on map']";
    }
    public static String SelectDateFirst()
    {
        return "//div[@dmx-less-than-message=\"'\\'From\\' must be earlier than \\'To\\''\"]//span[@class = 'add-on btn']";
    }
    public static String SelectDateSecond()
    {
        return "//div[@dmx-greater-than-message=\"'\\'To\\' must be later than \\'From\\''\"]//span[@class = 'add-on btn'] ";
    }
    public static String OkDateButton()
    {
        return "//i[@class = 'icon-ok icon-white']";
    }
    public static String ActionButtonsXpath()
    {
        //return "//div[@visible-columns='assetGridVisibleColumns']//ul//li";
        return "//div[@class='row-action btn-group ng-scope']/a";
    }
    
    public static String ShowTrailOnMapXpath()
    {
        return "//span[text()='Show trail on map']/..";
    }
    public static String TrailOnMapXpath()
    {
        return "//*[local-name()='path'][@fill='none']";
    }
    
    public static String CirclesonTrailXpath()
    {
        //return "//*[local-name()='circle']";
        return "//img[@src=\"img/map-icon-start.png\"]";
    }
    public static String AssetonTrailXpath()
    {
        return "//*[local-name()='circle']/../../../../../../..//div[@class='leaflet-zoom-animated leaflet-marker-icon']//i";
    }
    
    public static String AssetwithNoTrailXpath()
    {
        return "//div[@class='leaflet-marker-icon marker marker-small']//i";
    }
  
    
    public static String PositionInfoFlagXpath()
    {
        return "//img[@src='img/map-icon-start.png']";
    }
    public static String AssetlabelText(String label)
    {
        return "//div[@class='popover-content']/table/tbody/tr/td/strong[text()='"+ label +"']//..//..//td[2]";
    }
    
    public static String PositionInfoFlagTableXpath()
    {
        return "//div[@class='popover-content']//table//tr";
    }
    public static String PositionInfoFlagTableXpath(String label)
    {
        return "//div[@class='popover-content']/table/tbody/tr/td/strong[text()='"+ label +"']//..//..//td[2]";
    }
    
    public static String MapLayersButtonXpath()
    {
        return "//ul[@class='unstyled no-margins']//a[@fleet-tooltip='Map layers']";
    }
    
    public static String EventsOnTrailCheckBoxXpath()
    {
        return "//span[text()='Events on trail']/..//div";
       // return "//h5/span[text()='Map layers']/../../..//span[text()='Events on trail']/..//input";
    }
    
    public static String EventsOnTrailSaveButtonXpath()
    {
        return "//div[@ng-show='showLayerTool']//button[text()='Save']";
    }
    
    //added xpath for the close button
    public static String EventsOnTrailCloseButtonXpath()
    {
        return "//div[@ng-show='showLayerTool']//button[@class='close']";
    }
    
    public static String EventsOnTrailEventsXpath()
    {
        return "//img[@src='img/map-icon-start.png']/..//div[@tabindex='0']//i[@class='icon-warning-sign icon-white']";
    }
    public static String EventsOnTrailXpath()
    {
        return "//img[@src='img/map-icon-start.png']/..//div//i[@class='icon-warning-sign icon-white']";
    }
    
    
    public static String EventsOnTrailEventsInfoTableXpath()
    {
        return "//div[@class='popover-content']//table//tr";
        //return "//div[@class='leaflet-popup-content-wrapper']//table//tr";
    }
    public static String EventOnTrailEventInfolabelText(String label)
    {
        return "//div[@class='popover-content']/table/tbody/tr/td/strong[text()='"+label+"']//..//..//td[2]";
    }
    
    public static String HideTrailOnMapButtonXpath()
    {
        return "//span[text()='Hide trail on map']";
    }
    
    public static String ViewInNewWindowButtonXpath()
    {
        return "//ul[contains(@style, 'display: block')]//span[text()='View in new window']/..";
    }
    
    public static String newWindowHeadingXpath(){
        return "//div[@class='follow-asset-header']/h5";
    }
    
    
    
    
    //  </editor-fold>
    
    //  <editor-fold defaultstate="collapsed" desc="Map provider de carta"> 
    
    public static String ManageButtonXpath()
    {
        return "//a[text()='MANAGE ']";
    }
    
    public static String CountryDropDownXpath()
    {
        return "//select[@ng-model='userProfile.countryCode']";
    }
    
    public static String LanguageDropDownXpath()
    {
        return "//select[@ng-model='selectedLanguage']";
    }
    
    public static String PersonalSettingsSubMenuXpath()
    {
        return "//a[text()='Personal settings']";
    }
    
    public static String RegionalSettingsTabXpath()
    {
        return "//a[text()='Regional settings']";
    }
    
    public static String DBAdminMenuItemXpath()
    {
        return "//a[text()='Database administration']";
    }
     
    public static String ManageOrganisationStructureSpanTextXpath()
    {
        return "//span[text()='Manage organisation structure']";
    }
      
    public static String TestRSOExpanderTextXpath()
    {
        return "//strong[text()='Test RSO']/../../../..//span";
    }
    public static String RegionalSalesOrgExpanderTextXpath(String RSOName)
    {
        return "//strong[text()='"+RSOName+"']/../../../..//span";
    }//strong[text()='-= DVT  Only =-']/../../../..//span
    
    public static String DVTAutomationOrgXpath()
    {
        return "//strong[text()='DVT Automation']/..";
    }
    
    public static String OrgXpath(String org)
    {
        return "//strong[text()='" + org + "']/..";
    }
    
    public static String MapSettingsXpath()
    {
        return "//a[text()='Map settings']";
    }
    
    public static String MapProviderDropdownOptionXpath(int option)
    {
        return "//select[@name='mapProvider']/option[@value="+option+"]";
    }
    
    public static String MapProviderDropdownXpath()
    {
        return "//select[@name='mapProvider']";
    }
    
    public static String MapProviderDropdownOptionXpath()
    {
        return "//select[@name='mapProvider']/option";
    }
    
     public static String googleMapProviderDropdownXpath()
    {
        return "//select[@name='mapProvider']/option[@value='3']";
    }
    
    public static String MapProviderDropdownListXpath()
    {
        return "//select[@ng-model='mapProvider']";
    }
    
    public static String MapProviderDropdownlistXpath()
    {
        return "//select[@name='mapProvider']";
    }
    
    public static String FindMenuButtonXpath()
    {
        return "//a[@fleet-tooltip='Find']";
    }
    
    public static String FindAPlaceButtonXpath()
    {
        return "//a[text()='Find a place']";
    }
    
    public static String FindAPlaceHeadingXpath()
    {
        return "//span[text()='Find a place']";
    }
    
    public static String AnAddressRadioButtonXpath()
    {
        return "//span[text()='Find a place']/../../..//span[text()='An address']/..//input";
    }
    
    public static String CountryDropdownXpath()
    {
        return "//span[text()='Find a place']/../../..//span[text()='An address']/../..//select[@ng-model='selectedCountry.value']";
    }
    
    public static String LanguageDropdownListoptionsXpath()
    {
        return "//span[text()='An address']/../..//select[@ng-model='selectedLanguage.value']//option";
    }
    
    public static String LanguageDropdownListXpath()
    {
        return "//span[text()='Find a place']/../../..//span[text()='An address']/../..//select[@ng-model='selectedLanguage.value']";
    }
    
    public static String EnterAddressTextBoxXpath()
    {
        return "//span[text()='Find a place']/../../..//span[text()='An address']/../..//input[@placeholder='Enter address']";
    }
    
    public static String FilteredLocationListXpath()
    {
        return "//ul//li[@role='presentation']";
    }
    
    public static String MapproviderXpath()
    {
        return "//span[text()='Find a place']/../../..//span[text()='An address']/../..//input[@placeholder='Enter address']/..//div[@class='help-block ng-binding']/..//div[@class=\"row-fluid\"]";
    }
    
    public static String selectedLocationXpath()
    {
        return "//span[text()='Find a place']/../../..//span[text()='An address']/../..//input[@placeholder='Enter address']/..//div[@class='help-block ng-binding']";
    }
    
    
    
    public static String selectedLocationOnMapXpath()
    {
        return "//img[@src='img/map-icon-drag-pin.png']";
    }
    
     
    //  </editor-fold>
 
    public static String clearTextXpath()
    {
        return "//button[@ng-show='filterQuery']";
    }
    public static String HoverOverAsset() 
    {
        return "//i[@aria-hidden='true']";
    }
    
    public static String expireDatesExpath(String streamName) 
    {
        return "//span[text()='"+streamName+"']/../../../..//div[@class='feed-highlite']//div[@ng-show='item.from && item.to']";
    }
    
    
    public static String JobStatusExpath(String streamName) 
    {
        return "//span[text()='"+streamName+"']/../../../..//table//span[@class=\"label label-info-lighter pull-left ng-binding\"]/..";
    }
    
    public static String JobDetailsxpath(String streamName) 
    {
        return "//span[text()='"+streamName+"']/../../../..//div[@class='feed-content']//div[@class='feed-highlite']";
    }
    
    public static String JobStatusesxpath(String streamName) 
    {
        return "//span[text()='"+streamName+"']/../../../..//h6[text()='Status has changed to']/..//div[not(@style='display: none;') and not(@class=\"clearfix\")]";
    }
    
    public static String CurrentPositionxpath(String streamName) 
    {
        return "//span[text()='"+streamName+"']/../../../..//table//tr[not(@style='display: none;')]//i[@class='icon-globe']";
    }
    
    public static String NewMessageXpath(String streamName) 
    {
        return "//span[text()='"+streamName+"']/../../../..//table//tr[not(@style='display: none;')]//i[@class='icon-envelope']";
    }
    public static String DetailsLinkXpath1(String streamName)
    {
        
        return "//h5//span[text()='"+streamName+"']/../../../..//table[@class='table table-striped']//tr//div//a[text()='Details']";
    }
    public static String LoadingMoreDetailsXpath(String streamName)
    {
        return "//h5//span[text()='"+streamName+"']/../../../..//div[text()='Loading more details']";
    }
    
    public static String ExtractTextOnNameColumnImg()
    {
        return "ExtrractName_Image.PNG";
    }
    public static String GoogleMapProviderImg()
    {
        return "customLayer.PNG";
    }
    
     public static String ChromeIconImg()
    {
        return "MaximiziwindowChrome.PNG";
    }
     
   public static String RecordIEImage()
   {
       return "RecordIE.png";
   }
   
   public static String playImage(){
       return "play.png";
   }
   
   public static String newWindowImage(){
       return "newWindow.png";
   }
   
   public static String stopImage(){
       return "stop.png";
   }
   
   public static String pendingImage(){
       return "pending.png";
   }
   
   public static String locateImage(){
       return "image.png";
   }
   
   public static String googlepathImage(){
       return "googlepath.png";
   }
   
   public static String requestImage(){
       return "request.png";
   }
   
   public static String postImage(){
       return "post.png";
   }
   
   public static String valueImage(){
       return "valueImage.png";
   }
   
   public static String PostImageIE()
   {
       return "PostImageIE.png";
   }
   
   public static String RequestURLIE()
   {
       return "RequestURLIE.png";
   }
    
    public static String MovingVehicleImage() 
    {
        return "assetOInNewWindow.png";
    } 
    
    public static String IESearchboxImage(){
        return "iesearch.png";
    }
    
    public static String ieXpath(){
        return "IE.png";
    }
    
    public static String dockFirefoxImage(){
        return "dockFirefox.png";
    }
    
    public static String IESearchButtonImage(){
        return "IESearchButton.png";
    }
    
     public static String methodImage() 
    {
        return "method.png";
    } 
    
    public static String MovingViehicleImage() 
    {
        return "assetOInNewWindow.png";
    } 
    public static String NetworkFirefoxImage() 
    {
        return "NetworkFirefox.png";
    } 
    
    public static String PostImageImage() 
    {
        return "PostImage.png";
    } 
    
    public static String googlePathImage(){
        return "googlePathImage.png";
    }
    
    public static String requestFirefoxImage(){
        return "requestFirefox.png";
    }
    
    public static String toolbarImage(){
        return "toolbarf.png";
    } 
    
    public static String actionsButtonXpath(){
        return "//div[@visible-columns='assetGridVisibleColumns']//ul//li[2]//a";
    }
    
    public static String fileImageff(){
        return "fileff.png";
    }
    
    public static String clicksImage(){
        return "dockedpath.png";
    }
    
    public static String GetImage() 
    {
        return "getImage.png";
    } 
    
    public static String fileImage(){
        return "fileImage.png";
    }
    
    
    public static String assetIcon() 
    {
        return "//div[contains(@class,'leaflet-marker-icon')]/canvas/..//i";
    }  
    
    public static String developerToolsHeaderImage() 
    {
        return "developerTools.png";
    } 
    
    public static String consoleTabImage() 
    {
        return "consoleTab.png";
    } 
    
    public static String minimizeWindowImage() 
    {
        return "minimizeWindow.png";
    } 
    
    //------------- xpaths for wait elements ----------------//
    
    public static String WaitForLiveTrackingPageSpinner()
    {
        return "//div[@ng-show='contentLoadingStack && contentLoadingStack.length > 0']";
    }
    
    //xpath for Go to Asset
    public static String GoToAssetXpath()
    {
        return "//a//span[text()='Go to asset']";
    }
    
     public static String ChromeDockOptionImg()
    {
        return "ChromeOpenDockOption.PNG";
    }
    
    public static String ChromeDockBottomImg()
    {
        return "DockBottomChrome.PNG";
    }
    
    public static String ChromeAutomationExtImg()
    {
        return "ChromeAutomationExtImg.PNG";
    }
    
    public static String ChromeExButtonCancelImg()
    {
        return "ChromeExButtonCancelImg.PNG";
    }
    
    public static String IEDockNetworkImg()
    {
        return "DockBottomIEImage.PNG";
    }
    
    public static String CustomGroupDropdownTextXpath()
    {
        return "//a[text()='Custom groups']";
    }
    
    public static String CustomGroupSpinnerXpath()
    {
        return "//div/div[@id='faCustomGroupListGrid']/../div[@style='display: none;']";
    }
    
    public static String CustomGroupHeaderLebelXpath()
    {
        return "//div/h5/span[text()='Custom groups']";
    }
    
    public static String CustomGroupRefreshlinkTextXpath()
    {
        return "//a[@style='']/i[@class='icon-refresh icon-green']/..";
    }
    
    public static String CustomGroupSearchBoxXpath()
    {
        return "//input[@ng-model='filterQuery']";
    }
    
    public static String CustomGroupNameXpath()
    {
        return "//tr[1]/td[@column-field='name']/div/a/span";
    }
    
    public static String CustomGroupActionButtonXpath()
    {
        return "//li[2]/div/div/a[@fleet-tooltip='Actions']";
    }
    
    public static String CustomGroupRemoveActionButtonXpath()
    {
        return "//ul[contains(@style,'display: block;')]/li/a/i[@class='icon icon-remove-sign icon-red']/..";
    }
    
    public static String CustomGroupRemoveModalXpath()
    {
        return "//div[@name='removeGroupConfirmation'][@aria-hidden='false']";
    }
    
    public static String CustomGroupButtonRemoveOnModalXpath()
    {
        return "//div[@name='removeGroupConfirmation'][@aria-hidden='false']//button[text()='Remove']";
    }
    
    public static String CustomGroupButtonClearXpath()
    {
        return "//div/button[@style='']/i[@class='icon-remove-sign']";
    }
    
    public static String RefreshLinkTextXpath()
    {
        if(browserType.equals(browserType.IE)){
            return "//p/a/span[text()='Refresh']";
        }
        else
        {
            return "//p/a[@style='']/span[text()='Refresh']";
        }
    }
    
    public static String RefreshLinkTextByXpath()
    {
        if(browserType.equals(Enums.BrowserType.IE))
        {
             return "//a/span[text()='Refresh']/..";
        }
        else
        {
            return "//a[@style='']/span[text()='Refresh']/..";
        }
    }

    
    
    public static String DriverIDDIsabledInputBoxXpath()
    {
        return "//input[@name='fmDriverId'][@disabled='disabled']";
    }
    
    public static String RadioButtonExtendedDriverIDNoneXpath()
    {
        return "//label[@class='radio']/span[text()='None']/../input";
    }
    
    public static String RadioButtonExtendedDriverIDSmartCardXpath()
    {
        return "//label[@class='radio']/span[contains(text(),'Smart card')]/../input";
    }
    
    public static String RadioButtonExtendedDriverIDDTCOXpath()
    {
        return "//label[@class='radio']/span[text()='DTCO']/../input";
    }
    
    public static String ExtendedDriverFormXpath()
    {
        return "//form[@name='driverExtendedIdForm']/legend[text()='Extended driver ID']";
    }
    
    public static String ExtendedDriverIDSmartCardTextBoxXpath()
    {
        return "//input[@name='smartCardValue']";
    }
    
    public static String ExtendedDriverIDDTCOTextBoxXpath()
    {
        return "//input[@name='dtcoValue']";
    }
    
    public static String AccessControlFormXpath()
    {
        return "//form/fieldset/legend[text()='Access control']";
    }
    
    public static String MyMiXFormXpath()
    {
        return "//form/div/legend[text()='MyMiX Settings']";
    }
    
    public static String AssetOperableXpath()
    {
        return "//form/fieldset/legend[text()='Access control']/../div/span[1]";
    }
    
    public static String AccessControlExpandAssetListXpath()
    {
        return "//span[@class='daredevel-tree-anchor ui-icon icon-plus ng-scope']";
    }
    
    public static String SiteCheckBoxXpath()
    {
        return "//div[@class='tree-item-content']/div/span[text()='Site 1']";
    }
    
    public static String AutoShakedownCheckBoxXpath()
    {
        return "//div/ul/li[1]/div[@class='tree-item-content']/div/span[text()='AutoShakedown']";
    }
    
    public static String AccessControlCheckBoxLabelXpath()
    {
        return "//span[text()='This driver may operate selected assets and all new assets in this organisation']";
    }
    
    public static String DriverPageNameXpath()
    {
        return "//div/h5/a[text()='Drivers']";
    }
    
    public static String DriverButtonSearchXpath()
    {
        return "//div[@class='pull-right']/div/a/i[@class='icon-search']/..";
    }
    
    public static String EditDriverModeSpinnerOneXpath()
    {
        return "//div/form[@name='driverDetailsForm']/../div[@ng-show='contentLoadingStack && contentLoadingStack.length > 0'][@style='display: none;'][1]";
    }
    
    public static String EditDriverModeSpinnerTwoXpath()
    {
        return "//div[@class='row-fluid full-height']//div[@fleet-loader='content']/div[2][@style='display: none;']";
    }
    
    public static String EnableMyMiXxpath()
    {
        return "//div/label/span[text()='Enable for MyMiX']/../input";
    }
    
    public static String MyMiXEnabledXpath()
    {
        //if browser is IE the first div does not contain @style attribute
        if(browserType.equals(Enums.BrowserType.IE)){
            return "//div/div/div/label[text()='Temporary password']";
        }
        else{
        return "//div[@style='']/div/div/label[text()='Temporary password']";
        }
    }
    
    public static String PlotAddressLeafletXpath()
    {
       return "//div[@class='leaflet-marker-pane']/img[@src='img/map-icon-drag-pin.png']";
    }
    public static String MapContainerByXpath()
    {
       return "//div[@id=\"map-container\"]/div[@id='map']";
    }
    
    public static String MyMiXUserNameInputXpath()
    {
        return "//input[@name='driverPortalUsername']";
    }
    
    public static String ExpandSiteOneXpath()
    {
        //return "//li[2]/span[@ng-click='item.expanded = true']";
        return "//li/span[@ng-click='item.expanded = true']";
    }
    
    //  <editor-fold defaultstate="collapsed" desc="PassengerList-Shakedown"> 
    
    public static String BtnDownloadImportTemplateXpath()
    {
        return "//span/a[@fleet-tooltip='Download import template']/i/..";
    }
    
    public static String RadImportNewRecordXpath()
    {
        return "//div[@name='downloadImportTemplateModal']/div/div[@aria-hidden='false']//input[@value='importNewRecords']";
    }
    
    public static String BtnDownloadXpath()
    {
        return "//div[@name='downloadImportTemplateModal']/div/div[@aria-hidden='false']//a[text()='Download']";
    }
    
    public static String BtnImportPassengersXpath()
    {
        return "//span/a[@fleet-tooltip='Import passengers']/i/..";
    }
    
    public static String BtnChooseFileXpath()
    {
        return "//div[@name='import'][@aria-hidden='false']//span[text()='Choose file']/../input";
    }
    
    public static String ChooseFileTextBoxXpath()
    {
        if(browserType.equals(browserType.FireFox)){
            return "//div[@name='import'][@aria-hidden='false']//span[text()='Choose file']/../input[@type='file']";
        }
        else{
            return "//div[@name='import'][@aria-hidden='false']//span[text()='Choose file']/../../input";
        }
        
    }
    
    public static String PassengersImportSuccessullyNotificationXpath(){
        if(browserType.equals(browserType.IE))
        {
            return "//p[@ng-show='importResult.Successful == true'][text()='The import was ']/./strong[text()='successful']";
        }
        else
        {
            return "//p[@ng-show='importResult.Successful == true'][@style=''][text()='The import was ']/./strong[text()='successful']";
        }
    }
    
    public static String BtnCloseXpath()
    {
        return "//div[@name='import'][@aria-hidden='false']//button[text()='Close']";
    }
    
    public static String PassengerSpinnerXpath()
    {
        return "//div[@class='row-fluid container-fixed-right']/div/div[@class='loading-overlay ng-scope'][contains(@style, 'display: none')]";
    }
    
    public static String BtnExportPassengersXpath()
    {
        return "//span/a[@fleet-tooltip='Export passengers']/i/..";
    }
    
    public static String PassengerGridListXpath(){
        return "//div[contains(@id,'faPassengerListGrid')]";
    }
    
    public static String PassengerNameXpath(String name)
    {
        return "//tr[1]/td/div/a/span[contains(text(),'"+name+"')]";
    }
    
    public static String BtnActionButtonXpath()
    {
        return "//li[@ng-repeat][1]/div/div/a[@class='btn-actions']";
    }
    
    public static String BtnRemoveXpath()
    {
        return "//div[@name='removePassengerConfirmation'][@aria-hidden='false']//button[text()='Remove']";
    }
    
    public static String PassengerDeleteNotificationXpath()
    {
        return "//div[@style='display: none;']/div/span[text()='Passenger removed successfully']";
    }
    
    public static String CountColumnNotDisplayedXpath()
    {
        return "//ul[contains(@style,'display: block;')]/li/a/i['icon icon-ok pull-left'][@style='display: none;']/..";
    }
    
    public static String ColumnNotDisplayedXpath(String text)
    {
        return "//ul[contains(@style,'display: block;')]/li/a/span[text()='"+text+"']/../i['icon icon-ok pull-left'][@style='display: none;']/..";
    }
    
    //</editor-fold>
    
     //  <editor-fold defaultstate="collapsed" desc="DateTimeShakeDown"> 
        
    public static String CalenderIconXpath()
    {
        return "//div[@class='pull-left']/i[@class='icon-calendar']";
    }
    public static String FirstDateCalenderIconXpath()
    {
        return "//div[@class='ml-10 pull-left']//span/i";
    }
    public static String SecondDateCalenderIconXpath()
    {
        return "//div[@class='ml-10 pull-left']/../div[@class='pull-left']//i";
    }
    
    public static String YearXpath()
    {
        return "//div[@class='datepicker-widget in']//div[@class='year ng-binding']";
    }
    
    public static String YearToSelectXpath(String year)
    {
        return "//div[text()='"+year+"']";
    }
    
    public static String YearToSelectByXpath(String year)
    {
        return "//span[text()='"+year+"']";
    }
    public static String YearToSelectForDate2(String year)
    {
        return "//div[@class='year ng-scope p1']//span[text()='2016']";
    }
    
    public static String MonthXpath()
    {
        return "//div[@class='datepicker-widget in']//div[@class='month-of-year ng-binding']";
    }
    
    public static String MonthByXpath(String month)
    {
        return "//div[@class='datepicker-widget in']//div[text()='"+month+"']";
    }
    
    public static String DayXpath(String day)
    {
        return "//div[@class='datepicker-widget in']//div[text()='"+day+"']";
    }
    
    public static String DoneButtonByXpath()
    {
        return "//div[@class='datepicker-widget in']//a[text()='Done']";
    }
    
    public static String SaveDateButtonXpath()
    {
        return "//a[@class='btn btn-success']";
    }
    
    
    //</editor-fold>
    
    //  <editor-fold defaultstate="collapsed" desc="DateTimeShakeDown"> 
    
    public static String LocationNameListXpath()
    {
        return "//div[@id='trManageLocationListGrid']/div//table/tbody/tr/td[3]/div/a/span";
    }
    
    public static String LocationSpinnerXpath()
    {
        return "//div[@class='row-fluid container-fixed-right']/div//div[2][@class='loading-overlay ng-scope']";
    }
    
    public static String BtnImportLocationXpath()
    {
        return "//div/div//a[@fleet-tooltip='Import locations']/i/..";
    }
    
    public static String ImportLocationBtnCloseXpath()
    {
        return "//div[@class='modal hide fade hidden-phone in']//a[text()='Close']";
    }
    
    public static String ImportLocationChooseFileXpath()
    {
        return "//div[@class='modal hide fade hidden-phone in'][@aria-hidden='false']//span[text()='Choose file']/../input";
    }
    
    public static String LocationImportqueuedSuccessfullyXpath()
    {
        return "//div[@style='display: none;']/div/span[text()='Location import queued successfully']";
    }
    
    public static String DeleteMultXpath()
    {
        return "//a[@fleet-tooltip='Remove locations']/i/..";
    }
    
    public static String DeleteMultDisabledXpath()
    {
        return "//a[@fleet-tooltip='Remove locations'][@class='btn btn-small disabled']/i/..";
    }
    
    public static String DeleteAllXpath()
    {
        return "//th[@column-field='selectedForDelete']/span/input";
    }
    
    public static String BtnRemoveLocationXpath()
    {
        return "//div[@name='removeLocationsConfirmation'][@aria-hidden='false']//button[text()='Remove']";
    }
    
    public static String LocationRemovedSuccessfullyXpath()
    {
        return "//div[@style='display: none;']/div/span[text()='Locations removed successfully']";
    }
    
    public static String LocationsAreBeingDeletedModalHiddenXpath()
    {
        return "//*[local-name()='ng:include' and @style='display: none;']//div/div/h5/span[text()='Locations are being deleted.']";
    }
    
    public static String spinnerLocationXpath()
    {
        return "//div[@ng-show='contentLoadingStack.length == 0'][@style='']";
    }
    
    //</editor-fold>
    
}

