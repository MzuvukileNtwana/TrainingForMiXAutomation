/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects;

import static KeywordDrivenTestFramework.Core.BaseClass.currentEnvironment;

/**
 *
 * @author apeter
 */
public class LanguagingAppliedOnAddStreamPageObjects {
     public static String MixTelematicsURL() {
        return currentEnvironment.PageUrl;
    }

     public static String loginPageHeadingXpath(){
         return "//h4/span";
     }
     
     public static String languageDropDownXpath(){
         return "//div/select";
     }
     
     public static String GoButtonXpath(){
         return "//label[text()='Ongitudelay']/../div/button";
     }
     
     public static String ByAddressXpath()
     {
         return "//input[@value='address']";
     }
     
     public static String ByLatitudeXpath()
     {
         return "//input[@value='latLng']";
     }
     
     public static String AddressOnScreenXpath()
     {
         return "//ul[@class='ui-autocomplete ui-menu ui-widget ui-widget-content ui-corner-all' and contains(@style,'display: block')]/li[1]";
     }
     
     public static String AddressOnScreenIEXpath()
     {
         return "//ul[@class='ui-autocomplete ui-menu ui-widget ui-widget-content ui-corner-all' and contains(@style,'display: inline-block')]/li[1]";
     }
     
     public static String languageValueDropDownXpath(String value){
         return "//option[@value='"+value+"']";
     }
     
     public static String usernameTextBoxXpath(){
         return "//div/input[@name='userName']";
     }
     
     public static String passwordTextBoxXpath(){
         return "//div/input[@name='password']";
     }
     
     public static String AddressTextBoxXpath(){
         return "//span[text()='Anway addressway']/../input/../../div/input";
     }
    
     public static String InputLanguageXpath(){
         return "//select[@ng-model='selectedLanguage.value']";
     }
     
     public static String latitudeXpath(){
         return "//label[text()='Atitudelay']/../input";
     }
     
     public static String longitudeXpath(){
         return "//label[text()='Ongitudelay']/../div/input";
     }
     public static String signInButtonXpath(){
         return "//div/button[@event='loginClicked']";
     }
     
     public static String IconOnMapXpath(){
         return "//div[@class='leaflet-marker-pane']/img";
     }
     
     public static String addStreamHeadingXpath(){
         return "//div/h5[@class='pull-left span6 text-overflow']/span[@class='ng-binding']";
     }
     
     public static String cancelButtonXpath(){
         return "//div/button[@event='cancelClicked']";
     }
    
     public static String LanguagingnextButtonXpath(){
         return "//button[@text='Next']";
     }
     
     public static String tabStreamDetailsXpath(){
         return "//div/ul/li[@class='ng-scope active']/a";
     }
     
     public static String headingStreamDetailsXpath(){
         return "//div[@class='tab-pane active ng-scope']/h5";
     }
     
     public static String nameLabelXpath(){
         return "//div[@class='input span6']/label/span[@class='ng-binding']";
     }
     
     public static String selectItemsHeadingXpath(){
         return "//h6/span[@class='ng-binding']";
     }
     
     public static String jobStatusesXpath(){
         return "//div[@ng-show='form.jobsEnabled']/label/span";
     }
     
     public static String messagesXpath(){
         return "//div[@ng-show='form.messagesEnabled']/label/span";
     }
     
     public static String roviMessagesXpath(){
         return "//div[@ng-show='form.roviMessagesEnabled']/label/span";
     }
     
     public static String trackingMessagesXpath(){
         return "//div[@ng-show='form.trackingMessagesEnabled']/label/span";
     }
     
     public static String commandsXpath(){
         return "//div[@ng-show='form.commandsToMobileDeviceEnabled']/label/span";
     }
     
     public static String activeEventsXpath(){
         return "//div[@ng-show='form.eventsEnabled']/label/span";
     }
     
     public static String inputFieldXpath(){
         return "//div[@class='input span6']/input";
     }
     
     public static String validityMessageXpath(){
         return "//div[@class='input span6']/span[@class='validity-message ng-scope ng-binding']";
     }
     
     public static String selectToHearSoundXpath(){
         return "//div[@ng-show='form.jobsIncluded']/p";
     }
     
     public static String playSoundsXpath(){
         return "//div[@ng-show='form.jobsIncluded']/label/span";
     }
     
     public static String messagesIntructionXpath(){
         return "//div[@ng-show='form.messagesIncluded']/p";
     }
     
     public static String messagesPlaySoundXpath(){
         return "//div[@ng-show='form.messagesIncluded']/label/span";
     }
     
     public static String messageRoviInstructionXpath(){
         return "//div[@ng-show='form.roviMessagesIncluded']/p";
     }
     
     public static String messagesRoviPlaySoundsXpth(){
         return "//div[@ng-show='form.roviMessagesIncluded']/label/span";
     }
     
     public static String trackingMessagesInstructionXpath(){
         return "//div[@ng-show='form.trackingMessagesIncluded']/p";
     }
     
     public static String trackingPlaySoundXpath(){
         return "//div[@ng-show='form.trackingMessagesIncluded']/label/span";
     }
     
     public static String activeEventsInstructionXpath(){
         return "//div[@ng-show='form.eventsIncluded']/p";
     }
     
     public static String activeEventsFilterXpath(){
         return "//div[@class='span12 input-reset-wrapper']/input";
     }
     
     public static String columnHeaderNameXpath(){
         return "//th[@column-field='name']/span[@ng-hide='column.headingClass || !column.title']";
     }
     
     public static String columnHeaderTypeXpath(){
         return "//th[@column-field='type']/span[@ng-hide='column.headingClass || !column.title']";
     }
     
      public static String columnHeaderSoundsXpath(){
         return "//th[@column-field='eventPlaySounds']/span[@ng-hide='column.headingClass || !column.title']";
     }
      
      public static String eventTypesXpath(){
          return "//div[@selected-rows-ids='selectedEventsIds']//table//tbody//tr";
      }
      
      public static String eventCheckBoxXpath(){
          return "//th/input";
      }
      
      public static String playSoundsCheckboxXpath(){
          return "//div/span/input";
      }
      
      public static String assetsTabXpath(){
          return "//li[@class='ng-scope active']/a";
      }
      
      public static String streamAssetsHeadingXpath(){
          return "//div[@class='span12 tab-content']/div/h5/span";
      }
      
      public static String assetsSelectedXpath(){
          return "//h5/span[@class='ml-5 badge badge-success access-control-green ng-binding']";
      }
      
      public static String assetsCancelButtonXpath(){
          return "//button[@text='Cancel']";
      }
      
       public static String assetsSaveButtonXpath(){
          return "//button[@text='Save']";
      }
       
      public static String assetsExpandButtonXpath(){
          return "//span[@ui-if='!item.expanded && hasSupportedChildren(item)']";
      }
      
      public static String preferedAssetsXpath(){
          return "//ul//ul//div//ul/li";
      }
      
      public static String infoHubPageHeaderXpath(){
          return "//div[@class='page-header']/h5";
      }
      
      public static String streamXpath(){
          return "//h5[@class='pull-left']/span";
      }
      
      public static String dropdownButtonXpath(){
          return "//a[@ng-hide=\"listMode.current == 'details'\"]";
      }
      
      public static String removeStreamXpath(){
          return "//a[@ng-click=\"remove()\"]";
      }
      
      public static String confirmRemoveXpath(){
          return "//button[@class='btn ng-scope ng-binding btn-wide btn-success']";
      }
}
