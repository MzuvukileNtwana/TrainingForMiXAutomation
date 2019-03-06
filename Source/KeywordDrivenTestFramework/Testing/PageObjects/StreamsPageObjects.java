/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package KeywordDrivenTestFramework.Testing.PageObjects;

import static KeywordDrivenTestFramework.Core.BaseClass.browserType;

/**
 *
 * @author lmkhontwana
 */
public class StreamsPageObjects {
    
    
     public static String StreamsSubMenuRelativeXpath() 
    {
        return "//a[text()='Streams']";
    }
     public static String StatusColumnRelativeXpath2() 
    {
        return "//ul[contains(@style, 'display: block;')]//span[text()='Status']/../../a";
    }
    
     public static String RefreshTimerTextXpath()
    {
        return "//span[@class='last-refresh-timer']//span";
    }
     public static String AddStreamButtonRelativeXpath() 
    {
        return "//a[@fleet-tooltip='Add stream']";
    }
     public static String StreamNameInputRelativeXpath() 
    {
        return "//input[@name='streamName']";
    }
    public static String StreamDetailsHeaderRelativeXpath() 
    {
        return "//h5[text()='Stream details']";
    }
    public static String RequiredFieldSpanRelativeXpath() 
    {
        return "//span[text()='This field is required']";
    }
    
    public static String jobsStatusesCheckboxRelativeXpath() 
    {
        return "//input[@name='jobsIncluded']";
    }
    public static String JobStatusCheckboxRelativeXpath() 
    {
        return "//input[@name='jobsIncluded']";
    }
    public static String MessagesCheckboxRelativeXpath() 
    {
        return "//input[@name='messagesIncluded']";
    }
    public static String RoviMessagesCheckboxRelativeXpath() 
    {
        return "//input[@name='roviMessagesIncluded']";
    }
    public static String TrackingMessagesCheckboxRelativeXpath() 
    {
        return "//input[@name='trackingMessagesIncluded']";
    }
    public static String CommandsToMobileDeviceCheckboxRelativeXpath() 
    {
        return "//input[@name='commandsToMobileDeviceIncluded']";
    }
     public static String ActiveEventsCheckboxRelativeXpath() 
    {
        return "//input[@name='eventsIncluded']";
    }
     public static String NextButtonRelativeXpath() 
    {
        return "//div[@class='selection-btn-right pull-right']/button[text()='Next']";
    }     
     public static String OrganisationExpandIconRelativeXpath() 
    {
        return "//ul[@items='assets']//span[contains(@ng-click,'item.expanded = true')]";
    } 
     public static String NumberOfSelectedAssetsRelativeXpath() 
    {
        return "//h5/span[contains(@class,'ml-5 badge badge-success')]";
    } 
     public static String AssetsOnTreeRelativeXpath() 
    {
        return "//div[@class='checkbox ng-scope']";
    } 
      public static String SaveButtonRelativeXpath() 
    {
        return "//div[@class='selection-btn-right pull-right']/button[text()='Save']";
    }
      //Save Button
   public static String SaveDriverButtonNotDisabledXpath() 
    {
      return "//button[not(contains(@disabled,'disabled'))][text()='Save']";
    }
      public static String StreamAddedSuccessTextRelativeXpath() 
    {
        return "//span[text()='Stream added successfully']";
    }
    public static String XButtonRemoveXpath(){
        return "//h5/span/../..//span[text()='Remove']";
    }
    public static String RemoveTheFirstStreamXpath(){
        
        return "//div[@stream][1]//div/a/i[@fleet-tooltip='Actions']/..";
    }
    
    
     public static String NewlyAddedStreamSearchRelativeXpath(String streamName) 
    {
        return "//h5/span[text()='"+streamName+"']";
    }
      public static String NewlyAddedStreamDropdownRelativeXpath(String streamName) 
    {
        return "//h5/span[text()='"+streamName+"']/../..//a[@data-toggle='dropdown']";
    }
      public static String NewlyAddedStreamRemoveButtonRelativeXpath(String streamName) 
    {
        return "//h5/span[text()='"+streamName+"']/../..//span[text()='Remove']";
    }
      public static String RemoveButtonRelativeXpath() 
    {
        return "//div[@class='modal-footer']//button[text()='Remove']";
    } 
    
       public static String StreamRemovedSuccessTextRelativeXpath() 
    {
        return "//span[text()='Stream removed successfully']";
    }
       public static String StreamUpdatedSuccessTextRelativeXpath() 
    {
        return "//span[text()='Stream updated successfully']";
    }
       
       public static String AssetsTabTextRelativeXpath() 
    {
        return "//li[contains(@ng-class,'tabClass(tab)')]/a[text()='Assets']";
    }
      public static String StreamDetailsTabTextRelativeXpath() 
    {
        return "//li[contains(@ng-class,'tabClass(tab)')]/a[text()='Stream details']";
    } 
       public static String AllStreamsRelativeXpath() 
    {
        return "//div[@class=\"span12 feed-header grabbable\"]";
    }
     public static String StreamSettingsActionsButtonRelativeXpath(String streamName) 
    {
        return "//h5/span[text()='"+streamName+"']/../..//span[text()='Settings']";
    } 
      
       public static String DiscardChangesYesButtonXpath() 
    {
        return "//div[@class='modal-footer']//button[text()='Yes']";
    }
     
      public static String CancelButtonRelativeXpath()
    {
        return "//div[@class='selection-btn-right pull-right']/button[text()='Cancel']";
    }
      public static String StreamUndockActionsButtonRelativeXpath(String streamName) 
    {
        return "//h5/span[text()='"+streamName+"']/../..//span[text()='Undock']";
    }
    
     public static String UndockStreamNameXpath() 
    {
        return "//span[@bind-once='stream.streamName']";
    }
    public static String ExcessiveOverSpeedingEvetNameXpath() 
    {
//        return "//td//span[text()='Excessive Over Speeding']/..//../../td/input[@type='checkbox']";
        return "//thead//th[@ng-click='allRowsSelected = !allRowsSelected']//input";
    }
    public static String ActiveEvetNameXpath(String _eventName) 
    {
        return "//td//span[text()='"+_eventName+"']/..//../../td/input[@type='checkbox']";
    }  
    public static String ExpandIconSiteNameToUseXpath(String siteName) 
    {
        return "//span[text()='"+siteName+"']/../../../span";
    }
    public static String ExpandedSiteAssetListXpath(String siteName) 
    {
        return "//span[text()='"+siteName+"']/../../..//ul/li";
    }
    
    public static String LoadMoreButtonRelativeXpath(String streamName) 
    {
        return "//h5/span[text()='"+streamName+"']/../../../..//a[text()='Load more']";
    }
    public static String AssetStreamDatesRelativeXpath(String streamName) //Substring days, trim; use attr "fleet-tooltip"
    {
        return "//h5/span[text()='"+streamName+"']/../../../..//table//tr//td//span[@date=\"item.streamItemDateTime\"]";
    }
    public static String StreamAssetDetailsButtonRelativeXpath(String streamName) 
    {
        return "//h5/span[text()='"+streamName+"']/../../../..//a[@ng-click='details()'][contains(@ng-bind-html-unsafe,'Details')]";
    }
    public static String BackToStreamButtonRelativeXpath(String streamName) 
    {
        return "//h5/span[text()='"+streamName+"']/../../../..//span[text()='Back to stream']";
    }
    public static String LoadingItemsRelativeXpath() 
    {
        return "//div[text()='Loading items'][contains(@style,'none')]";
    }
    
    public static String EventDescriptionRelativeXpath(String streamName) //use attribute "textContent"
    {
        return "//h5/span[text()='"+streamName+"']/../../../..//p[@class='no-margins']";
    }
    public static String AssetRegAndDescRelativeXpath(String streamName) //use attribute "textContent"
    {
        return "//h5/span[text()='"+streamName+"']/../../../..//h6[@class='no-margins pull-left']";
    }
    public static String DetailsTableRelativeXpath(String streamName) //use attribute "textContent"
    {
        return "//h5/span[text()='"+streamName+"']/../../../..//table[@class='table table-condensed']";
    }
    
    
    public static String AssetLocationIconXpath()
    {
//        return "//canvas/..//i";
        return "//div[contains(@class,'marker-icon')]/canvas";
        
    }
    
    
    
    //h5/span[text()='Strrr']/../../../..//table[@class='table table-condensed']
    //h6[@class='no-margins pull-left']
    //h5/span[text()='Strrr']/../../../..//i[@fleet-tooltip="View asset's current position"]
    //div[text()='Loading items']
    //h5/span[text()='Strrr']/../..//a[@data-toggle='dropdown']
    //a[@ng-click='details()'][@ng-bind-html-unsafe="'Details'| translate"]
    //h5/span[text()='Stream20151014161305']/../../../..//table//tr//td//span[@date="item.streamItemDateTime"]
    //h5/span[text()='Strrr']
    //span[text()='PBU - Andrews -1204']/../../../span
    //span[text()='PBU - Andrews -1204']/../../..//ul
    //li[@class='ng-scope']//span[contains(@ng-click,'item.expanded')]/..//span[text()='PBU - Andrews -1204']
    
    
    
    
    
    //Message
    public static String MessageBoxHeaderRelativeXpath() 
    {
        return "//h5/span[text()='Message box']";
    }
    public static String SelectedOrgRelativeXpath() //use textCotent Attributte
    {
        return "//div[@class='organisation-selector']";
    }
     public static String InboxTabSelectedRelativeXpath() 
    {
        return "//a/span[text()='Inbox']/../../../li[@class='active']";
    }
      public static String LastRefreshTextRelativeXpath() //use textCotent Attributte
    {
        return "//span[@class='last-refresh-timer']";
    }
     public static String RefreshButtonRelativeXpath() //wait for spinner after
    {
        return "//span[text()='Refresh']";
    }

     public static String FilterInputXpath() 
    {
        return "//div[@class='input-reset-wrapper']/input";
    } 
     public static String NoItemsDisplayedTextRelativeXpath() 
    {
        if(browserType.equals(browserType.IE)){
            return "//div[@class= 'grid-no-items']/span[text()='No items to display']";
        }else{
        return "//div[@class= 'grid-no-items'][@style='']/span[text()='No items to display']";
        }
    }
     public static String ClearFilterButtonXpath() 
    {
        return "//button[@class='input-reset']";
    } 
      public static String CreateNewButtonXpath() 
    {
        return "//span[text()='CREATE NEW']";
    }  
        public static String JobDropdownButtonXpath() 
    {
        return "//li/a[text()='Job']";
    }  
        public static String MessageDropdownButtonXpath() 
    {
        return "//li/a[text()='Message']";
    }  
        public static String SMSMessageDropdownButtonXpath() 
    {
        return "//li/a[text()='SMS Message']";
    }  
        
     public static String InboxHeaderRelativeXpath() 
    {
        return "//h5[text()='Inbox']";
    }
     
      public static String ColumnChooserButtonRelativeXpath() 
    {
        return "//a[@class='btn btn-small column-chooser']";
    }    
       public static String StatusColumnRelativeXpath() 
    {
        return "//span[text()='Status']/../../a";
    }      
      public static String FleetNumberColumnRelativeXpath() 
    {
        return "//a/span[@ng-hide='column.visible']/../span[text()='Fleet number']";
    }  
      public static String FromColumnRelativeXpath() 
    {
        return "//span[text()='From']/../../a";
    }  
      public static String MessageColumnRelativeXpath() 
    {
        return "//span[text()='Message']/../../a";
    }  
      public static String StatusTimeColumnRelativeXpath() 
    {
        return "//span[text()='Status time']/../../a";
    }  
      public static String SubjectColumnRelativeXpath() 
    {
        return "//span[text()='Subject']/../../a";
    }  
      public static String TypeColumnRelativeXpath() 
    {
        return "//span[text()='Type']/../../a";
    }
      public static String ActionButtonsRelativeXpath() 
    {
        return "//div[@column='rowActions']";
    }
       public static String MessageDetailsTableRelativeXpath() 
    {
        return "//table[contains(@class,'table-scroll')]";
    }
       public static String MessageDetailsTableHeaderRelativeXpath() 
    {
        return "//table[contains(@class,'table-scroll')]/thead//span[@class='ng-binding']";
    }
      public static String MessageDetailsViewOptionRelativeXpath() 
    {
        return "//ul[contains(@style,'block')]//a/span[text()='View']";
    } 
      public static String MessageDetailsEditOptionRelativeXpath() 
    {
        return "//ul[contains(@style,'block')]//a/span[text()='Edit']";
    } 
       public static String MessageDetailsRemoveDeviceOptionRelativeXpath() 
    {
        return "//ul[contains(@style,'block')]//a/span[text()='Remove from device']";
    } 
       
    public static String FleetNumberOnAssetsGridRelativeXpath() 
    {
        return "//span[text()='Fleet number']/../..//div[contains(@class,'cell')]";
    } 
    
    public static String UserDateFormatRelativeXpath() 
    {
        return "//div[@class='control-group mt-20']/div[contains(text(),'Date')]";
    }
     public static String UserTimeFormatRelativeXpath() 
    {
        return "//div[@class='control-group mt-20']/div[contains(text(),'Time')]";
    } 
      
     
     
     //Remove stream
     public static String labelStreamName(String streamName){
         return "//div/h5/span[text()='"+streamName+"']";
     }
     //a[text()='+name+']
     
     public static String buttonAddStreamMaxedOut(){
         return "//div/a[@fleet-tooltip='Stream limit reached'][@disabled='disabled']";
     }
     
     
     //  <editor-fold defaultstate="collapsed" desc="View Job Status Stream">
     
     public static String InfoHubHeadingTextXpath()
     {
         return "//div/h5[text()='Info Hub']";
     }
     
     public static String StreamNameTextboxXpath()
     {
         return "//div/input[@name='streamName']";
     }
     
     public static String JobStatusesCheckboxXpath()
     {
         return "//div/label/input[@name='jobsIncluded']";
     }
     
     public static String ButtonNextXpath()
     {
         return "//button[text()='Next']";
     }
     
     public static String ButtonNextDisabledXpath()
     {
         return "//button[text()='Next'][@disabled='disabled']";
     }
     
     public static String StreamDetailsTabXpath()
     {
         return "//a[text()='Stream details']";
     }
     
     public static String AssetsTabXpath()
     {
         return "//li[@ng-repeat='tab in tabs']/a[text()='Assets']";
     }
     
     public static String ZeroAssetsSelectedXpath()
     {
         return "//div/h5/span[text()='Stream assets']/../span[text()='0 assets selected']";
     }
     
     public static String ButtonSaveDisabledXpath()
     {
         return "//button[text()='Save'][@disabled='disabled']";
     }
     
     public static String ButtonSaveXpath()
     {
         return "//button[text()='Save']";
     }
     
     public static String ExpandAssetsGroupIconXpath()
     {
         return "//ul[@options='assetsTreeOptions']/li/span";
     }
     
     public static String ExpandAssetsSubGroupIconXpath(String subGroup)
     {
         return "//div[@class='tree-sub-items ng-scope']/ul/li//span[text()='"+subGroup+"']/../../../span";
     }
     
     public static String AssetToSelectXpath(String assetDesc)
     {
         return "//ul/li/div[@class='tree-item-content']/div[@item='item']/span[text()='"+assetDesc+"']";
     }
     
     public static String AssetToSelectCheckBoxXpath(String assetDesc)
     {
         return "//ul/li/div[@class='tree-item-content']/div[@item='item']/span[text()='"+assetDesc+"']/../input";
     }
     public static String fAssetToSelectCheckBoxXpath(String assetDesc)
     {
         return "//ul/li/div[@class='tree-item-content']/div[@item='item']/span[text()='"+assetDesc+"']";
     }
     public static String AddStreamHeadingTextXpath()
     {
         return "//h5/span[text()='Add stream']";
     }
     
     public static String StreamNameHeadingXpath(String streamName)
     {
         return "//h5/span[text()='"+streamName+"']";
     }
     
     public static String getAssetRegistrationNumberXpath()
     {
         return "//tr[@ng-repeat='streamItem in displayStreamItems']/td/div[@item-id='4306-1']//h6/span[@bind-once='item.registrationNumber']";
     }
     
     public static String getAssetDescriptionXpath()
     {
         return "//tr[@ng-repeat='streamItem in displayStreamItems']/td/div[@item-id='4306-1']//h6/span[@bind-once='item.assetDescription']";
     }
     
     public static String getTimeExpiredXpath(String StreamName)
     {
         return "//div/div/div/h5/span[text()='"+StreamName+"']/../../../..//tr[@ng-repeat='streamItem in displayStreamItems']/td/div[@item-id='4306-1']//span/span[@date='item.streamItemDateTime']";
     }
     public static String getTimeExpirednodividXpath(String StreamName)
     {
         return "//div/div/div/h5/span[text()='"+StreamName+"']/../../../..//tr[@ng-repeat='streamItem in displayStreamItems'][1]/td/div//span/span[@date='item.streamItemDateTime']";
     }
       
     public static String getJobStatusXpath(String StreamName)
     {
         return "//div/div/div/h5/span[text()='"+StreamName+"']/../../../..//div/p[@class='no-margins pull-left']/strong[1]";
     }
     
     public static String StreamsLinkTextXpath()
     {
         return "//li/a[text()='Streams']";
     }
     
     public static String JobDetailsLinkTextXpath(String StreamName)
     {
         return "//div/div/div/h5/span[text()='"+StreamName+"']/../../../..//tr[2]/td//a[text()='Details']";
     }
     
     public static String getJobStatusWithLocationXpath(String StreamName)
     {
         return "//div/div/div/h5/span[text()='"+StreamName+"']/../../../..//tr[2]/td[1]/div//span[@bind-once='item.location']";
     }
     
     public static String BackToStreamButtonXpath(String StreamName)
     {
         return "//div/div/div/h5/span[text()='"+StreamName+"']/../../../..//a/span[text()='Back to stream']";
     }
     
     public static String LoadingItemSpinnerXpath()
     {
         return "//div/div/div/h5/span[text()='TestStream20160126121204']/../../../..//div[text()='Loading items'][contains(@style,'display: none')]";
     }
    public static String LoadingStreamItemSpinnerXpath(String StreamName)
     {
         return "//div/div/div/h5/span[text()='"+StreamName+"']/../../../..//div[text()='Loading items'][contains(@style,'display: none')]";
     }
     public static String LoadingMoreDetailsXpath(String StreamName)
     {
         return "//div/div/div/h5/span[text()='"+StreamName+"']/../../../..//tr[2]/td[1]/div/div/div[text()='Loading more details']";
     }
     
     public static String ViewAssetCurrentPositionIconXpath(String StreamName)
     {
         return "//div/div/div/h5/span[text()='"+StreamName+"']/../../../..//tr[2]/td[1]/div//a/i[contains(@fleet-tooltip,'current position')]";
     }
     
     public static String SendMessageIconXpath(String StreamName)
     {
         return "//div/div/div/h5/span[text()='"+StreamName+"']/../../../..//tr[2]/td[1]/div//a/i[contains(@fleet-tooltip,'Send message')]";
     }
     
     public static String getItemIdXpath(String StreamName)
     {
         return "//div/div/div/h5/span[text()='"+StreamName+"']/../../../..//tr[@ng-repeat='streamItem in displayStreamItems'][@style='']/td/div";
     }
     
     public static String ButtonStartActiveTrackingXpath()
     {
         return "//a[text()='Start active tracking']";
     }
     
     public static String NewWindowHeadingXpath()
     {
         return "//div[@class='follow-asset-header']/h5";
     }
     
     public static String DriverNameXpath()
     {
         return "//div[@class='follow-asset-header']/span";
     }
     
     public static String AssetIconXpath()
     {
         return "//canvas";
     }
     
     public static String AssetInfoCurrentPositionXpath()
     {
         return "//div[@class='leaflet-popup-pane']/div";
     }
     
     public static String CreateNewMessageLandingPageHeaderXpath(String headerText)
     {
         return "//h5[text()='"+headerText+"']";
     }
     
     public static String ExtractCreateNewMessageHeaderXpath()
     {
         return "//div[@class='page-header']/h5";
     }
     
     public static String UrgentMessageCheckBoxXpath()
     {
         return "//input[@name='urgentMessage']";
     }
     
     public static String checkboxTextLabelXpath(String checkboxText)
     {
         return "//label[@class='checkbox']/span[contains(text(),'"+checkboxText+"')]";
     }
     
     public static String MessageExpireDatePickerXpath()
     {
         return "//div[@name='expiryDate']/input";
     }
     
     public static String ButtonCancelXpath()
     {
         return "//div/h5[text()='Create new message']/../div/div/button[text()='Cancel']";
     }
     
     public static String StreamActionButtonXpath()
     {
         return "//div/a/i[@class='icon-chevron-down']/..";
     }
     
     public static String ButtonActionMenuXpath()
     {
         return "//ul[@class='dropdown-menu actions pull-right']";
     }
     
     public static String ButtonActionRemoveStreamXpath()
     {
         return "//ul[@class='dropdown-menu actions pull-right']/li/a/span[text()='Remove']/..";
     }
     
     public static String RemoveStreamPopUpXpath()
     {
         return "//div[@name='removeStreamModal'][contains(@style,'display: block')]//h5/span[text()='Remove stream']";
     }
     
     public static String ButtonRemoveStreamPopUpXpath()
     {
         return "//div[@name='removeStreamModal'][contains(@style,'display: block')]//div/button[text()='Remove']";
     }
     
     public static String StreamRemovedTextXpath()
     {
         return "//div[contains(@style,'display: block')]/div/span[text()='Stream removed successfully']";
     }
     
     public static String JobTypeXpath(String StreamName)
     {
         return "//div/div/div/h5/span[text()='"+StreamName+"']/../../../..//tr[2]/td[1]/div//div/span[text()='Job']/../../div[2]";
        // return "//div/div/div/h5/span[text()='"+StreamName+"']/../../../..//div[@item-id='4310-1']//div/span[text()='Job']/../../div[2]";
     }
     
     public static String jobDetailsXpath(String StreamName)
     {
         return "//div/div/div/h5/span[text()='"+StreamName+"']/../../../..//tr[2]/td[1]/div//div[@class='feed-message-container'][1]//p/../../../..";
       //  return "//div/div/div/h5/span[text()='"+StreamName+"']/../../../..//tr[@ng-repeat='streamItem in displayStreamItems']/td/div[@item-id='4310-1']//div[@class='feed-message-container'][1]//p/../../../..";
       //  return "//div/div/div/h5/span[text()='"+StreamName+"']/../../../..//tr[@ng-repeat='streamItem in displayStreamItems']/td/div[@item-id='4310-1']//div[@class='feed-message-container'][1]//p";
     }
     //</editor-fold>
     
}


