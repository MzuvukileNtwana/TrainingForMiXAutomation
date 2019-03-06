/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package KeywordDrivenTestFramework.Testing.PageObjects;

import static KeywordDrivenTestFramework.Core.BaseClass.currentEnvironment;

/**
 *
 * @author kbuso
 */
public class TelematricsExportTachoPageObj
{
    public static String MixTelematicsURL() {
        return currentEnvironment.PageUrl;
    }
    
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
        return "//*[@id=\"main-nav-toolbar\"]/ul/li[1]/a";
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
     public static String SiteRelativeXpath() 
    {
        //Absolute Xpath
        //html/body/div[21]/div[2]/div[1]/div[4]/div[1]/a[7]/span[2]
        return "//a/span[text()='PBU - Andrews -1204']/..";
    }
    public static String AssetRelativeXpath() 
    {
        //Absolute Xpath
        ///html/body/div[39]/div[2]/div[1]/div[5]/div[1]/a[1]/span[2]
        return "//span[text()='11948 - Pickup - 2004 Ford F250']";
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
       return "\\mixtelematics_keyworddriventestautomation_dvt\\MixTeleImagesFolder\\";
        //return "//a[text()='Select']";
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
       return "//i[@class='icon-export']";
        
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
 
}


