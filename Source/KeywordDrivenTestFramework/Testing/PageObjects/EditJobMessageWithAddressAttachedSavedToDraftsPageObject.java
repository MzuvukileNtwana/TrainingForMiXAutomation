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
public class EditJobMessageWithAddressAttachedSavedToDraftsPageObject {
    public static String clickToAddAddressForJobXpath()
    {
         return "//a[text()='To add an address for this job, ']/strong";
    }
    
    public static String langageAndContryToolTipXpath()
    {
         return "//div[text()='Select language']/../a";
    }
    
    public static String clickAddressCheckBoxXpath()
    {
         return "//span[text()='Address']/../input";
    }
    public static String enterAddressXpath()
    {
         return "//div[@class='help-block pull-left mt-3'][text()='Select language']/../../../input";
    }
    public static String AddressMatchInMachesXpath()
    {
         return "//li[@ng-repeat='match in matches']/a";
    }
    public static String addressDisplayedLabelXpath(String address)
    {
         return "//th[text()='Order']/../../../tbody/tr/td[text()='"+ address  +"']";
    }
    
    public static String btnSelectXpath()
    {
         return "//span[text()='Latitude/Longitude']/../../button[text()='Select']";
    }
     public static String EditXpath()
    {
        return "//ul[4]/li/a/span[text()='Edit']";
        
    }
    public static String JobDetaisXpath()
    {
         return "//legend[text()='Job details']";
    }
    public static String inputFilterXpath()
    {
         return "//span[text()='Select assets']/.././../../form/div/input";
    }
     public static String checkRadioButtonDevTestXpath()
    {
         return "//span[text()='Dev Test']/../../../td/input[@type='radio']";
    }
     
     public static String checkRadioButtonDvtDontXpath()
    {
         return "//input[@type='radio'][@ng-show]";
    }
     
    public static String selectAssetXpath()
    {
         return "//span[text()='Dev Test']/../../../td/input[@type='radio']/../../../../../../../../../../../../../div[@class='modal-footer']/button[text()='Select']";
    }
    
    public static String selectAssetDontXpath()
    {
         return "//td/input[@type='radio']/../../../../../../../../../../../../../div[@class='modal-footer']/button[text()='Select']";
    }
    
    public static String subjecCharacterCountXpath()
    {
         return "//label[text()='Subject']/../div[@class='help-block rt ng-binding']";
    }
    public static String subjectErrorMessageDisplayedXpath()
    {
         return "//label[text()='Subject']/../div/span[@class='validity-message ng-scope ng-binding'][text()='Subject exceeds maximum character count.']";
    }
    public static String messageCharacterCountXpath()
    {
         return "//label[text()='Message']/../div[@class='help-block rt ng-binding'][2]";
    }
    public static String messageErrorMessageDisplayedXpath()
    {
         return "//label[text()='Message']/../div/span[@class='validity-message ng-scope ng-binding'][text()='Message exceeds maximum character count.']";
    }
    public static String CountryDropDownXpath()
    {
         return "//span[text()='Address']/../../span[@ng-show='currentLocation.positionTypeId == 1']/div/select";
    }
    public static String LanguageDropDownXpath()
    {
         return "//span[text()='Address']/../../span[@ng-show='currentLocation.positionTypeId == 1']/div/select[2]";
    }
    public static String redIconMarkerXpath()
    {
         return "//div[@class='leaflet-marker-pane']/img[@src='img/map-icon-drag-pin.png']";
    }
    public static String blueIconMarkerXpath()
    {
         return "//i[@aria-hidden='true'][@class='marker-icon marker-asset-car-right marker-icon-small marker-icon-blue']";
    }
    public static String checkCreateThisAddressXpath()
    {
         return "//span[text()='Create this address as a location']/../input";
    }
    public static String retriveADisplayedAddressXpath()
    {
         return "//span[text()='Create this address as a location']/../../div";
    }
     public static String subjectXpath()
    {
         return "//tbody[@fleet-draggable-group='draggable']/tr/td[3]/div/span";
    }
      public static String StatusXpath()
    {
         return "//tbody[@fleet-draggable-group='draggable']/tr/td[6]/div/span";
    }
        public static String messageXpath()
    {
         return "//tbody[@fleet-draggable-group='draggable']/tr/td[4]/div/span";
    }
       public static String statusTimeXpath()
    {
         return "//tbody[@fleet-draggable-group='draggable']/tr/td[7]/div/span";
    }
       
          public static String statusTimeXpath2()
    {
         return "//tbody[@fleet-draggable-group='draggable']/tr[@row-id='10961']/td[@column-field='status']";
    }
       
         public static String briefcaseXpath()
    {
         return "//div/img[@src='img/briefcase.png']";
    }
    public static String displayedAssetXpath()
    {
         return "//span[text()='To']/../../input";
    }
    public static String displayedAddressXpath()
    {
         return "//th[text()='Order']/../../../tbody/tr/td[2]";
    }
    
    
}
