/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects;

import KeywordDrivenTestFramework.Core.BaseClass;

/**
 *
 * @author fnell
 */
public class MixTelematics_PageObjects extends BaseClass {

    public static String MixTelematicsURL() 
    {
        if(customInputParameters != null && customInputParameters.containsKey("URL"))
            return customInputParameters.get("URL");
        
        return currentEnvironment.PageUrl;
    }
    
    //Driver portal URL
    public static String MixDriverPortalURL() 
    {
        if(customInputParameters != null && customInputParameters.containsKey("URL"))
            return customInputParameters.get("URL") + "/driverportal.web/#/login";
        
        return currentEnvironment.PageUrl+"/driverportal.web/#/login";
    }
    
    //Log in Page Objects 
    
    public static String MixTelematicsLogoXpath() 
    {
        return "//div[@class=\"container-log-in ct login-logo mb-30\"]/img";
    }
        
    public static String LoginHeaderXpath() {
        return "//span[text()='LOGIN']";
    }
    public static String ContactUs() {
        return "//h1[contains(text(),'Contact Us')]";
    }
    
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
    public static String PigLatinSignInButtonXpath(String buttonText) 
    {
        return "//div/button[text()='"+buttonText+"']";
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
    
    //Heading Xpath
    /*public static String HeadingXpath1() 
    {
        return "//*[@id=\"main-nav-toolbar\"]/div/ul/li/ul/li";
    }*/
    
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
        return "//strong[text()='CONTACT US']/..";
    }
    
    
    public static String LanguageDropdownXpath() 
    {
        return "//div/label[text()='SELEZIONA LINGUA']/../div/select";
    }
    public static String IgpayLanguageDropdownXpath() 
    {
        return "//div/label[text()='Electsay Anguagelay']/../div/select";
    }
    
    //Language Dropdown
    public static String EnglishLanguageDropdownXpath() 
    {
        //return "//div/label[text()='SELECT LANGUAGE']/../div/select";
        //return "//*[local-name()]/div[@class='controls']/select";
        return "//*[local-name()]/div[@class='control-group mb-5']//select";
    }
    
    public static String EnglishOptionDropdownXpath() 
    {
        return "//option[text()='English']";
    }
    
    public static String SignInModalOKXpath() 
    {
        return "//button[text()='OK']";
    }
    
    public static String ClickHereModalCancelXpath() 
    {
        return "//button[text()='Cancel']";
    }
    
    //Pig Latin Username XPath
    public static String PigLatinUsernameXpath() 
    {
        return "//div/label[text()='Usernameway']/../div/input";
    }
    public static String UsernameInputFieldXPath()
    {
       // return "//div/label[text()='USERNAME']/../div/input";
        //"//div/label/strong[text()='USERNAME']/../../div/input";
        return "//input[@name='userName']";
    }
    
       //Pig Latin Username XPath
    public static String UsernameXpath(String usernameTextLabel) 
    {
        return "//div/label/strong[text()='"+usernameTextLabel+"']/../../div/input";
    }
    public static String PasswordInputFieldXPath(String passwordTextLabel)
    {
        return "//div/label/strong[text()='"+passwordTextLabel+"']/../../div/input";
    }
    
    public static String PasswordInputFieldXPath(){
        //return "//div/label[text()='PASSWORD']/../div/input";
        // "//div/label/strong[text()='PASSWORD']/../../div/input";
        return "//input[@name='password']";
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
        return "//div/label/strong[text()='PASSWORD']/../../div/span[text()='This field is required']";
    }
     
     public static String LogInUsernameRequiredFieldXpath()
    {
        return "//div/label/strong[text()='USERNAME']/../../div/span[text()='This field is required']";
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
  public static String TermsOfUseOfTheMapPicture()
  {
      return "//div[@class = 'leaflet-control-container']//a[text() = 'Terms of Use']";
  }

    public static String UsernameEmptyFieldMessageXPath()
    {
        return "//div/label/strong[text()='USERNAME']/../../div/span[text()='This field is required']";
    }
    
    public static String PasswordEmptyFieldMessageXPath()
    {
        return "//div/label/strong[text()='PASSWORD']/../../div/span[text()='This field is required']";
    }
    
    public static String UsernameIncorrectFormatMessageXPath(){
        return "//div/label/strong[text()='USERNAME']/../../div/span[text()='The value must be a valid email address']";
    }
    
    
    
    public static String FailedToLoginMessageXPath(){
        return "//h5[text()='Failed to login']";
    }
    
    public static String AssetLabelXpath(){
        return "//span[text()='Assets']";
    }
    
    public static String AssetIconXpath()
    {
        return "//div/a/i[@class='icon-car icon-green']/..";
    }
    
    public static String DatabaseAdministrationXpath(){
        return "//span[text()='Database administration']";
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
   
    public static String ClickLibrarySubMenuXpath()
    {
        return "//div/h4[text()='CONFIG ADMIN']/../ul/li/a[text()='Libraries']";
    }
    public static String ClickTemplateSubMenuXpath()
    {
        return "//div/h4[text()='CONFIG ADMIN']/../ul/li/a[text()='Templates']";
    } 
       //click event name to sort asc or desc
    public static String ClickEventDescriptionXpath()
    {
        return "//span[text()='Event description']";
    }
    //click manage tab
     public static String ClickManagerTabXpath()
    {
        return "//*[@id=\"main-nav-toolbar\"]/ul/li[2]/a";
    }
     
     //for entering event name on filter
      public static String EnterEventNameManagerTabXpath()
    {
        return "//div/h5[text()='Event library']/../form/div/input";
    } 

    public static String ParameterLibrariesHeaderXpath() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static String LibrariesXpath() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static String ManageXpath() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static String LogOutUsernameValidationTextBoxXpath()
    {
        return "//div[@class='controls']//input[@type='text']";
    }
    

     
}
