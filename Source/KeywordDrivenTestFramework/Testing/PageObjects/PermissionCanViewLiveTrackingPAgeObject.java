/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects;

/**
 *
 * @author smnisi
 */
public class PermissionCanViewLiveTrackingPAgeObject {
    
    public static String tableLoaderSpinner()
    {   
       return "//div[1]/div/div[2]/div[2]/div[2]";
    }
    
    public static String SecurityGroupPermission()
    {
        return "//h5[text()='Security group permissions']";
    }
    
    public static String goToViewNewWindow()
    {
        return "//ul/li/a/span[text()='View in new window']";
    }
    
    public static String DiagnosticsButton()
    {
        return "//a/span[text()='Diagnostics']";
    }
    
    public static String ShowTrailOnMapButton()
    {
        return "//ul/li/a/span[text()='Show trail on map']";
    }
    
    public static String lockOnAsset()
    {
        return "//ul/li/a/span[text()='Lock on asset']";
    }
    
    public static String actionButton()
    {
        return "//li/div/div/a[@fleet-tooltip='Actions']";
    }
    
    public static String profileDropDown()
    {
        return "//label/span[text()='Profile']/../../select";
    }
    
    public static String RolesDropDown()
    {
        return "//span[text()='Roles']/../../../div/div/select";
    }
    
    public static String RolesType()
    {
        return "//select[@class=\"span12 no-margins ng-valid ng-dirty\"]";
    }
    
    public static String Manager()
    {
        return "//a[text()='MANAGE ']";
    }
       
    public static String Roles()
    {
        return "//li/a[text()='Roles']";
    }
    
    public static String SecurityGroups()
    {
        return "//li/a[text()='Security groups']";
    
    }
      
    public static String userAdmin()
    {
        return "//div/h4[text()='USER ADMIN']";
    }
    
    public static String Users()
    {
        return "//li/a[text()='Users']";
    }
    
    public static String addButton()
    {
        return "//span[@icon='icon-plus icon-white']/a";
    }
    
    public static String LiveTrackingPageHead()
    {
        return "//span[text()='Live tracking']";
    }
    
    public static String RoleNameTextBox()
    {
        return "//input[@ng-model='form.roleName']";
    }
    
    public static String clickDropDown()
    {
        return "//select[@ng-options='profile.id as (profile.name|translate) for profile in profiles']";
    }
    
    public static String SelectingOption1()
    {
        return "//select/option[@value='0']";
    }
    
    public static String makeAvailableButton()
    {
        return "//a[text()='Make available']";
    }
    
    public static String expandableDropDown()
    {
        return "//span[@class='daredevel-tree-anchor ui-icon icon-plus ng-scope']";
    }
    
    public static String selectingTestRSO()
    {
        return "//span[text()='Test RSO']/../../../../span";
    }
    
    public static String selectingDVTAutomation()
    {
        return "//li/div/div/a/span[text()='DVT Automation']";
    }
    
    public static String OKButton()
    {
        return "//button[@text='OK']";
    }
    
     public static String nextButton()
    {
        return "//button[@text='Next']";
    }
     
     public static String generalEnable()
     {
         return "//h5[text()='General']/../a/i";
     }
     
     
     public static String ElementScroll()
     {
         return "//strong[text()='Quick select/deselect:']";
     }
     public static String TrackingEnableButton()
     {
         return "//h5[text()='Tracking']/../a/i";
     }
     
     public static String TrackingHeader()
     {
         return"//h5[text()='Tracking']";
     }
     
     public static String TrackingCheckBox1()
     {
         return "//td[text()='Historical tracking']/../td[2]/input";
     }
     
      public static String TrackingCheckBox2()
     {
         return "//td[text()='Live tracking']/../td[2]/input";
     }
      
      public static String TrackingCheckBox3()
     {
         return "//td[text()='Live tracking - Commands to mobile device']/../td[2]/input";
     }
      
       public static String TrackingCheckBox4()
     {
         return "//td[text()='Live tracking - Request current position']/../td[2]/input";
     }
       
      public static String TrackingCheckBox5()
     {
         return "//td[text()='Live tracking - Start active tracking']/../td[2]/input";
     }
      
       public static String TrackingCheckBox6()
     {
         return "//td[text()='Live tracking - Start satellite tracking']/../td[2]/input";
     }
      
        public static String TrackingCheckBox7()
     {
         return "//td[text()='Manage locations']/../td[2]/input";
     }
       
       public static String TrackingCheckBox8()
     {
         return "//td[text()='Manage locations - Import & Export']/../td[2]/input";
     }
      
      public static String TrackingCheckBox9()
     {
         return "//td[text()='Manage locations - Multi-delete locations']/../td[2]/input";
     }
      
     public static String TrackingCheckBox10()
     {
         return "//td[text()='Manage road hazards']/../td[2]/input";
     }
      
      
      public static String WebApplicationCheckBox()
      {
          return "//td[text()='Login - Web application']/../td[2]/input";
      }
      
      public static String ButtonSave()
      {
          return "//button[@text='Save']";
      }
      
     public static String ClickAccess()
     {
         return "//span[text()='Access']/../input";
     }
     
     public static String scrollToAccessHeader()
     {
         return "//strong[text()='Quick select/deselect:']";
     }
     
     public static String SecurityGroupName()
     {
         return "//span[text()='Group name']/../../input";
     }
     
     public static String OrganisationSecurityGroupDropDown()
     {
         return "//h5/span[text()='Organisation group']/../../a/span[2]";
     }
     
     public static String selectedGroupName()
     {
         return "//span[@class='caret caret-link']";
     }
     
     public static String selectButton()
     {
         return "//a[text()='Select']";
     }
     
     public static String addPermissions()
     {
         return "//a[text()='Add permissions']";
     }
     
     public static String GroupNameTESTRSO()
     {
         return "//span[@class='caret-right pull-right']/../span[2][text()='Test RSO']";
     }
             
     
     public static String selectingTheAutomationGroup()
     {
         return "//a/span[text()='DVT Automation']";
     }
     
     public static String SelectingDefaultSite()
     {
         return "//span[text()='Default Site']";
     }
     
     public static String ProfileNameDropDown()
     {
         return "//select[@class='span12 ng-valid ng-dirty']";
     }
     
     public static String PRofileName()
     {
         return "//select/option[text()='General administrator']";
     }
     
     public static String roleDropListItem()
     {
         return "Tester_Dvt015024";
     }
     
     public static String GroupTestRSO()
     {
         return "//span[text()='Test RSO']";
     }
     
     public static String SubTitleDVT()
     {
         return "//span[@class='icon icon-org']/../span[text()='DVT Automation']";
     }
     
     public static String selectButtonGroup()
     {
         return "//div[22]/div[3]/div/a[2]";
     }
     
     
     public static String securityGroupAccess()
     {
         //return "/html/body/div[24]/div[2]/div[1]/div[1]//div[1]/a/span[3]]";
         return "//h5[text()='Select what this security group has access to']/../../../div[2]/div/div/div/a/span[2][text()='DVT Automation']";
     }
     
     
    public static  String deafultGroup()
    {
        return "//div/div/a/span[2][text()='Default Site']";         
    }
     ///*************************************Add New User*********************************//
     public static String name()
     {
         return "//span[text()='First name']/../../input";
     }
     
    public static String nameField()
     {
         return "";
     }
         
     public static String LastNameField()
     {
         return "//span[text()='Last name']/../../input";
     }
             
    public static String UsernameField()
     {
         return "//span[text()='Username']/../../input";
     }
                 
     public static String EmployerField()
     {
         return "//span[text()='Employer']/../../input";
     }
                     
    public static String workNumberField()
     {
         return "//span[text()='Work number']/../../input";
     }
    
   public static String HomeNumberField()
     {
         return "//span[text()='Home number']/../../input";
     }
    
       
   public static String MobileNumberField()
     {
         return "//span[text()='Mobile number']/../../input";
     }
   
   public static String selectgroup()
   {
       return "//div/a[text()='Select group']";
   }
   
   public static String groupSelectionForUser()
   {
       return "//span[text()='DVT Test:270116100934']/../../../td[1]";
   }
    
       
   public static String userSelectButton()
     {
         return "//button[text()='Select']";
     }
    
 /*****************************************LIVE TRACKING CODE*****************************************/   
   
   public static String Monitor()
   {
       return "//a[text()='MONITOR ']";
   }
   
    public static String LiveTracking()
   {
       return "//li/a[text()='Live tracking']";
   }
    
    public static String breadcreamCaret()
    {
        return "//a[text()='MONITOR ']/b[@class=\"caret\"]";
    }
    
    public static String SelectButtonLiveTracking()
    {
        return "//div/a[2][text()='Select']";
    }
    
    public static String goToAsset()
    {
        return "//a/span[text()='Go to asset']";
    }
    
    public static String ViewDetailsOption()
    {
        return "//a/span[text()='View details']";
    }
      
    public static String ViewDetailBackButton()
    {
        return "//div/a[@ng-click='currentAsset = undefined']/i/../span[text()='Back to asset list']";
    }
    
    //Extracting variables for Da
    
    public static String RequestcurrentStatus()
    {
        return "//div/a[text()='Request current status']";
    }

    public static String QuickDownalod()
    {
        return "//div/a[text()='Quick download']";
    }
    
    public static String FullDownload()
    {
        return "//div/a[text()='Full download']";
    }
    
    public static String GeneralStatusInformation()
    {
        return "//div[3]/div/div[1]/a/span[text()='General status information']";
    }
    
    public static String PeripheralStatusInformation()
    {
        return "//div[5]/div/div[1]/a/span[text()='Peripheral status information']";
    }

    public static String GPSStatusInformation()
    {
        return "//div[6]/div/div[1]/a/span[text()='GPS status information']";
    }
    
    public static String LastestPostionInformation()
    {
        return "//div[7]/div[1]/a/span[1][text()='Latest position information']";
    }
    
    public static String logOutButton()
    {
        return "//a[@ng-click='logout()']";
    }
    
    public static String flagIcon()
    {
        return "//div/img[@src='img/map-icon-start.png']";
    }
    
}