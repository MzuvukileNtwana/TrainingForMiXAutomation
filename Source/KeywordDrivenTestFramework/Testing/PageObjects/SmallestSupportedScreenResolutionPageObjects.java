/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects;

/**
 *
 * @author apeter
 */
public class SmallestSupportedScreenResolutionPageObjects {
    
    public static String filterXpath(){
        return "//div[contains(@class,'filter')]/input";
    }
    public static String spinnerXpath()
    {
        return "//div[@id='MainView']//div[@class='loading-overlay ng-scope'][contains(@style,'none')]";
    }

    public static String searchButtonXpath(){
        return "//div[contains(@class,'filter')]/a[@ng-click='$directive.filter()']";
    }
    
    public static String hideLeftPanelXpath(){
        return "//a[@class='btn btn-inverse btn-small hide-div-small']";
    }

    
    public static String noItemsStringXpath(){
        return "//span[text()='No items to display']";
    }
    
    public static String logoXpath(){
        return "//img[@ng-src='img/logo_mix.svg']";
    }
    
    public static String homeIconXpath(){
        return "//a[@href='#/home']/i";
    }
    
    public static String helpIconXpath(){
        return "//i[@class='icon-main-help']";
    }
    
    public static String logoutIconXpath(){
        return "//i[@class='icon-main-logout']";
    }
    
    public static String welcomeXpath(){
        return "//div[@class='login-name']/strong";
    }
    
    public static String usernameXpath(){
        return "//div[@class='login-name']/span";
    }
    
    public static String pageNameXpath(){
        return "//h5[@ui-if='!url']/span";
    }
    
    public static String organisationXpath(){
        return "//a[@ng-click=\"$broadcast('openOrganisationSelectionMiller')\"]/span[3]/span[2]";
    }
    
    public static String leadingGroup1Xpath(){
        return "//a[@ng-click=\"$broadcast('openOrganisationSelectionMiller')\"]/span[1]/span[2]";
    }
    
    public static String leadingGroup2Xpath(){
        return "//a[@ng-click=\"$broadcast('openOrganisationSelectionMiller')\"]/span[2]/span[2]";
    }
    
    public static String activeFilterXpath(){
        return "//ul[@class='breadcrumb pull-left']/li/strong";
    }
    
    public static String eventNameXpath(){
        return "//a[@class='click-cell']";
    }
    
    public static String refreshTimerXpath(){
        return "//span[@class='last-refresh-timer']/span";
    }
    
    public static String refreshButtonXpath(){
        return "//i[@class='icon-refresh icon-green']";
    }
    
    public static String previousXpath(){
        return "//i[@class='icon-chevron-left']";
    }
    
    public static String nextXpath(){
        return "//i[@class='icon-chevron-right']";
    }
    
    public static String activeXpath(){
        return "//ul[@class='nav nav-pills nav-stacked']/li[1]/a/span[1]";
    }
    
     public static String durationXpath(){
        return "//ul[@class='nav nav-pills nav-stacked']/li[2]/a/span[1]";
    }
     
      public static String locationEntryXpath(){
        return "//ul[@class='nav nav-pills nav-stacked']/li[3]/a/span[1]";
    }
      
      public static String locationStartedXpath(){
        return "//ul[@class='nav nav-pills nav-stacked']/li[4]/a/span[1]";
    }
      
     public static String movementXpath(){
        return "//ul[@class='nav nav-pills nav-stacked']/li[5]/a/span[1]";
    }
     
    public static String speedingXpath(){
        return "//ul[@class='nav nav-pills nav-stacked']/li[6]/a/span[1]";
    }
    
    public static String inactiveXpath(){
        return "//ul[@class='nav nav-pills nav-stacked']/li[7]/a/span[1]";
    }
    
    public static String numberOfEventsXpath(){
        return "//ul[@class='breadcrumb pull-left']/li/span";
    }
    
    public static String fieldFilterXpath(){
        return "//div[@class='text-filter empty']/input";
    }
    
    public static String exportButtonXpath(){
        return "//i[@class='icon-export']";
    }
    
    public static String addButtonXpath(){
        return "//a[@class='btn btn-small btn-success']";
    }
    
    public static String columnSelectorButtonXpath(){
        return "//a[@class='btn btn-small column-chooser']";
    }
    
    public static String eventNameColumnXpath(){
        return "//div[contains(@class,'column-heading sortable')]/span[text()='Event name']";
    }
    
    public static String eventTypeColumnXpath(){
        return "//div[contains(@class,'column-heading sortable')]/span[text()='Event type']";
    }
    
     public static String recordColumnXpath(){
        return "//div[contains(@class,'column-heading sortable')]/span[text()='Record']";
    }
     
      public static String assetsColumnXpath(){
        return "//div[contains(@class,'column-heading sortable')]/span[text()='Assets']";
    }
      
       public static String driversColumnXpath(){
        return "//div[contains(@class,'column-heading sortable')]/span[text()='Drivers']";
    }
       
     public static String frequencyColumnXpath(){
        return "//div[contains(@class,'column-heading sortable')]/span[text()='Frequency']";
    }
     
      public static String lastEditColumnXpath(){
        return "//div[contains(@class,'column-heading sortable')]/span[text()='Last edit by']";
    }
      
       public static String lastEditTimeColumnXpath(){
        return "//div[contains(@class,'column-heading sortable')]/span[text()='Last edit time']";
    }
       
    public static String nameScreenXpath(){
        return "//ul[@class='nav nav-pills nav-wizard']/li[1]";
    }
    
    public static String cancelButtonXpath(){
        return "//a/span[text()='Cancel']";
    }
    
    public static String backButtonXpath(){
        return "//a/span[text()='Back']";
    }
    
     public static String nextButtonXpath(){
        return "//a/span[text()='Next']";
    }
     
     public static String eventDescriptionXpath(){
         return "//span[text()='Event description']";
     }
     
     public static String dropdownXpath(){
         return "//div[@class='control-group']/select";
     }
     
     public static String onceOffXpath(){
         return "//span[text()='Once off']";
     }
     
     public static String recurringXpath(){
         return "//span[text()='Recurring']";
     }
     
     public static String inputDescriptionXpath(){
         return "//div[@class='span6']/input";
     }
     
     public static String recurringRadioButtonXpath(){
         return "//span[text()='Recurring']/../input";
     }
     
     public static String expiryDateFieldXpath(){
         return "//div[@type='date']/input";
     }
     
     public static String calendarButtonXpath(){
         return "//i[@class='icon-calendar']";
     }
     
     public static String preferedDateXpath(){
         return "//div[text()='29']";
     }
     
     public static String preferedDayXpath(int day){
         return "//div[text()='"+day+"']";
     }
     
     public static String doneButtonXpath(){
         return "//div[@class='done']/a";
     }
     
     public static String assetsHeadingXpath(){
         return "//h5[text()='Assets']";
     }
     
     public static String assetsGroupsOptionXpath(){
         return "//input[@ng-model='$controller.assetTab']/../span[text()='Groups']";
     }
     
     public static String assetsIndividualOptionXpath(){
         return "//input[@ng-model='$controller.assetTab']/../span[text()='Individual']";
     }
     
     public static String organisationTreeXpath(){
         return "//ul[@items='$controller.assetGroupTree']/li/div/div/a/span[1]";
     }
     
     public static String driversHeadingXpath(){
         return "//h5[text()='Drivers']";
     }
     
     public static String driversGroupOptionXpath(){
         return "//input[@ng-model='$controller.driverTab']/../span[text()='Groups']";
     }
     
     public static String driversIndividualOptionXpath(){
         return "//input[@ng-model='$controller.driverTab']/../span[text()='Individual']";
     }
     
     public static String driversOrganisationXpath(){
         return "//ul[@items='$controller.driverGroupTree']/li/div/div/a/span[1]";
     }
     
     public static String assetsIndividualXpath(){
         return "//span[text()='Individual']/../input[@ng-model='$controller.assetTab']";
     }
     
     public static String driversIndividualXpath(){
         return "//span[text()='Individual']/../input[@ng-model='$controller.driverTab']";
     }
     
     public static String assetsExpandButtonXpath(){
         return "//ul[@items='$controller.assetTree']/li/span";
     }
     
     public static String assetsSubExpandButtonXpath(){
         return "//ul[@items='$controller.assetTree']/li/div/ul/li/span";
     }
     
     public static String assetsAndDriversScreenXpath(){
         return "//ul[@class='nav nav-pills nav-wizard']/li[2]";
     }
     
      public static String eventsScreenXpath(){
         return "//ul[@class='nav nav-pills nav-wizard']/li[3]";
     }
      
      public static String btnCancelXpath(){
          return "//a/span[text()='Cancel']";
      }
      
     public static String btnBackXpath(){
          return "//a/span[text()='Back']";
      }
     
     public static String btnSaveXpath(){
          return "//a/span[text()='Save']";
      }
     
     public static String eventType1Xpath(){
         return "//select/option[2]";
     }
     
      public static String eventType2Xpath(){
         return "//select/option[3]";
     }
      
     public static String eventType3Xpath(){
         return "//select/option[4]";
     }
       
    public static String eventType4Xpath(){
         return "//select/option[5]";
     }
        
    public static String eventType5Xpath(){
         return "//select/option[6]";
     }
         
    public static String eventType6Xpath(){
         return "//select/option[7]";
     }
          
    public static String eventType7Xpath(){
         return "//select/option[8]";
     }
           
      public static String eventTypeDropDownXpath(){
          return "//div[@class='control-group span6']/select";
      }
      
    public static String visibleStringXpath(){
        return "//div[@class='block well well-white no-margin']/div[4]/label[1]";
    }
    
    public static String locationOption1Xpath(){
        return "//label[@class='radio']/span[text()='in the selected locations']";
    }
    
    public static String locationOption2Xpath(){
        return "//label[@class='radio']/span[text()='not in the selected locations']";
    }
    
    public static String selectLocationsButtonXpath(){
        return "//button[@text='Select locations']";
    }
    
    public static String anytimeRecordEventOptionXpath(){
        return "//span[text()='Anytime']";
    }
    
    public static String betweenOptionXpath(){
        return "//span[text()='Between selected times']";
    }
    
    public static String selectLocationsHeaderXpath(){
        return "//span[text()='Select locations']";
    }
    
    public static String selectLocationFilterXpath(){
        return "//div[@class='input-reset-wrapper mb-5']/input";
    }
    
    public static String locationsXpath(){
        return "//div[@class='fleet-grid full-height selection']/table/tbody/tr";
    }
    
    public static String lastLocationXpath(){
        return "//div[@class='fleet-grid full-height selection']/table/tbody/tr[19]";
    }
    
    public static String locationsCancelButtonXpath(){
        return "//div[@class='modal-footer']/button[@text='Cancel']";
    }
    
     public static String locationsSelectButtonXpath(){
        return "//div[@class='modal-footer']/button[@text='Select']";
    }
     
     public static String preferedLocationXpath(){
         return "//div[@class='fleet-grid full-height selection']/table/tbody/tr/td/input[@type='checkbox']";
     }
     
     public static String firstLocationXpath(){
         return "//div[@class='fleet-grid full-height selection']/table/tbody/tr/td[2]//span";
     }
     
     public static String betweenRadioButtonXpath(){
         return "//span[text()='Between selected times']/../input";
     }
     
     public static String fromTimeXpath(){
         return "//div[@ng-model='$controller.pageData.serverSideEventDetails.startTime.date']/input";
     }
     
     public static String toTimeXpath(){
         return "//div[@ng-model='$controller.pageData.serverSideEventDetails.endTime.date']/input";
     }
     
     public static String fromTimeSelectorButtonXpath(){
         return "//div[@ng-model='$controller.pageData.serverSideEventDetails.startTime.date']/span/i";
     }
     
     public static String fromPreferedTimeXpath(){
         return "//div[@ng-class='directive.hourClass($index, hour)'][text()='08']";
     }
     
     public static String fromDoneButtonXpath(){
         return "//div[@class='done']/a";
     }
     
     public static String toTimeSelectorButtonXpath(){
         return "//div[@ng-model='$controller.pageData.serverSideEventDetails.endTime.date']/span/i";
     }
     
      public static String toPreferedTimeXpath(){
         return "//div[@class='datepicker-widget in']//div[@class=\"clock ng-scope\"]/div/div[text()='01']";
     }
      
      public static String toTimeDoneButtonXpath(){
          return "//div[@class='datepicker-widget in']/div[@class='done']/a";
      }
      
      public static String weekDaysXpath(int day){
          return "//label[@class='checkbox mr-20 ng-scope ng-binding']["+day+"]";
      }
      
      public static String addedEventXpath(String eventName){
          return "//a[text()='"+eventName+"']";
      }
      
      public static String actionsButtonXpath(){
          //return "//div[@row='0']/div/a[@class='row-action']";
          return "//a[@class='row-action']";
      }
      
      public static String removeEventXpath(){
          return "//ul[contains(@style,'display: block')]//li//a//span[text()='Remove']";
      }
      
      public static String confirmRemoveButtonXpath(){
          return "//div[@name='globalWarningModal']/div/div/form/div[2]/div/button[text()='Remove']";
      }
}
