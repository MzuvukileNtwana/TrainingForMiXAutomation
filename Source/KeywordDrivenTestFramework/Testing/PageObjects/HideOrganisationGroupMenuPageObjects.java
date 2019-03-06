/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects;

import static KeywordDrivenTestFramework.Core.BaseClass.currentEnvironment;

/**
 *
 * @author sscholtz
 */
public class HideOrganisationGroupMenuPageObjects {
    
     public static String MixTelematicsURL() 
     {
        return currentEnvironment.PageUrl;
     }
     
     public static String MonitorClick()
     {
         return "//a[text()='MONITOR ']";
     }
     
     public static String OrganisationGroupsClick()
     {
         return "//a[text()='Organisation groups']";
     }

     public static String AssetsValidation()
     {
         return "//ul[@class='nav nav-tabs tabs-three']/li[@class='active']/a/span[text()='Assets']";
     }
     
     public static String DriverValidation()
     {
         return "//ul[@class='nav nav-tabs tabs-three']/li/a/span[text()='Drivers']";
     }
     
     public static String HideMenuArrow()
     {
         return "//div[@class='white-box-shadow span4 full-height container-left']/a";
     }
     
   /*  public static String HideLeftPanel()
     {
         return "//a[@class='btn btn-inverse btn-small hide-div-small']";
     }*/
     
     
     public static String HideLeftPanelTooltip()
     {
         return "//a[@fleet-tooltip='Hide left panel']";
     }
     
     public static String PageHeaderValidation()
     {
         return "//div[@class='page-header']/h5";
     }
     
     public static String ShowMenuArrowClick()
     {
         return "//a[@class='btn btn-inverse btn-small show-div-small']/i";
     }
     
     public static String ShowLeftPanelTooltip()
     {
         return "//a[@fleet-tooltip='Show left panel']";
     }
    

      public static String WaitForEditButton()
     {
         return   "//div[@class='selection-btn-right pull-right']/a";// "//div[@class='btn-group']/a";
     }
      
          public static String WaitForAddButton()
     {
         return   "//div[@class='btn-group']/a";
     }
}
