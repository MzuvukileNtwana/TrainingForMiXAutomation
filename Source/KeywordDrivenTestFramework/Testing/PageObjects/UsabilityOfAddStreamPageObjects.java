/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package KeywordDrivenTestFramework.Testing.PageObjects;



/**
 *
 * @author mdevilliers
 */
public class UsabilityOfAddStreamPageObjects 
{
    
    //<buttons>
    
    public static String buttonAddStreamXpath(){
        return "//a[contains(@fleet-tooltip,'Add stream')]";
    }
    
    public static String buttonNextXpath(boolean checkIfDisabled){
        String append = "";
        if(checkIfDisabled){
            append = "[@disabled='disabled']";
        }
        return "//button[text()='Next']" + append;
    }
    
    public static String buttonCancelXpath(){
        return "//button[text()='Cancel'][@ng-disabled='!isEnabled()']";
    }    
    
    public static String buttonAddStreamFilterResetXpath(){
        return "//button[@class='input-reset']";
    }
    
    public static String buttonSaveXpath(boolean checkIfDisabled){
        String append = "";
        if(checkIfDisabled){
            append = "[@disabled='disabled']";
        }
        
        return "//button[text()='Save']"+append;
    }
    
    //These two are for the expand buttons next to the site name on the Assets tab on Add Stream.
    public static String buttonAddStreamFirstExpandXpath(int pos){
        if (pos == 0){
            pos = 1;
        }
        return "//ul/li["+pos+"]/span[@class='daredevel-tree-anchor ui-icon icon-plus ng-scope']";
    }
    
    public static String buttonAddStream2ndExpandXpath(int pos){
        if (pos == 0){
            pos = 1;
        }
        return "//ul/li["+pos+"]/span[@class='daredevel-tree-anchor ui-icon icon-plus ng-scope']";
    }
    
    public static String buttonClearFilterFieldXpath(){
        return "//button[@class='input-reset']";
    }
    //</buttons>
    
    
    //<labels>
    
    public static String labelAddStreamXpath(){
        return "//h5/span[text()='Add stream']";
    }
    
    public static String labelStreamDetailsXpath(){
        return "//h5[text()='Stream details']";
    }
    
    public static String labelNameMandatoryXpath(){
        return "//label/span[text()='Name']/../span[@class='field-mandatory'][text()='*']";
    }
    
    public static String labelItemsToIncludeMandatoryXpath(){
        return "//h6/span[text()='Select items to be included in this stream']/../span[contains(@class,'mandatory')][text()='*']";
    }
    
    public static String labelStreamAssetsXpath(){
        return "//span[text()='Stream assets']";
    }
    
    public static String labelXAssetsSelectedXpath(){
        return "//h5/span[contains(text(),'selected')]";
    }
    
    public static String labelNewStreamXpath(String newStream){
        return "//h5/span[text()='"+newStream+"']";
    }
    
    public static String labelSelectToHearSoundOfItemXpath(String itemName){
        return "//label/span[text()='"+itemName+"']/../../div/p[text()='Select to hear sounds for these stream items']";
    }
    
    
    public static String labelActiveEventsSubHeadingXpath(){
        return "//p[text()='Select events and their preferred alerts']";
    }
    
    public static String labelEventNameXpath(){
        return "//th/span[text()='Event name']";
    }
    
    public static String labelEventType(){
        return "//th/span[text()='Event type']";
    }
    
    public static String labelPlaySounds(){
        return "//th/span[text()='Play sounds']";
    }
    
    public static String labelContainingStrinbXpath(String text){
        return "//span[contains(text(),'"+text+"')]";
    }
    
    public static String labelLoadingItemsXpath(String name){
        return "//div/h5/span[text()='"+name+"']/../../../../div[contains(@class,'feed')]/div[@class='center-text']/div[text()='Loading items'][@style='display: none;']";
    }
    
    public static String labelNoItemsToDisplayXpath(String name){
        return "//div/h5/span[text()='"+name+"']/../../../../div[contains(@class,'feed')]/div[@class='center-text'][contains(@style,'display')]/div[text()='No items to display']";
    }
    //</labels>
    
    
    //<checkboxes>
    //Use to tick the X'th Event from the top
    public static String checkbEventNoXpath(int x){
        return "//tbody/tr["+x+"]/td[1]/input[@type='checkbox']";
    }
    
    //Used to tick the play sounds checkbox
    public static String checkbEventPlaySoundsNoXpath(int x){
        return "//tbody/tr["+x+"]/td[4]/div/span/input[@type='checkbox']";
    }
    
    //used to get the amount of availble Events to tick
    public static String checkbAvailableEventsXpath(){
        return "//tbody/tr";
    }
    
    //On the Stream details page
    public static String checkbOfItemXpath(String itemName){
        return "//label/span[text()='"+itemName+"']/../input";
    }
    
    public static String checkbOfItemEnableSoundXpath(String itemName){
        return "//label/span[text()='"+itemName+"']/../../div/label/span[text()='Play sounds']/../input";
    }
    
    public static String checkbJobStatusesXpath(){
        return "//label/span[text()='Job statuses']/../input";
    }
    
    public static String checkbJobStatusesPlaySoundsXpath(){
        return "//label/span[text()='Job statuses']/../../div/label/span[text()='Play sounds']/../input";
    }
    
    public static String checkbMessagesXpath(){
        return "//label/span[text()='Messages']/../input";
    }
    
    public static String checkbMessagesPlaySoundsXpath(){
        return "//label/span[text()='Messages']/../../div/label/span[text()='Play sounds']/../input";
    }
    
    public static String checkbRoviMessagesXpath(){
        return "//label/span[text()='Rovi messages']/../input";
    }
    
    public static String checkbRoviMessagesPlaySoundsXpath(){
        return "//label/span[text()='Rovi messages']/../../div/label/span[text()='Play sounds']/../input";
    }
    
    public static String checkbTrackingMessagesXpath(){
        return "//label/span[text()='Tracking messages']/../input";
    }
    
    public static String checkbTrackingMessagesPlaySoundsXpath(){
        return "//label/span[text()='Tracking messages']/../../div/label/span[text()='Play sounds']/../input";
    }
    
    public static String checkbCommandsToMobileDeviceXpath(){
        return "//label/span[text()='Commands to mobile device']/../input";
    }
    
    public static String checkbCommandsToMobileDevicePlaySoundsXpath(){
        return "//label/span[text()='Commands to mobile device']/../../div/label/span[text()='Play sounds']/../input";
    }
    
    public static String checkbActiveEventsXpath(){
        return "//label/span[text()='Active events']/../input";
    }
    
    public static String checkbActiveEventsPlaySoundsXpath(){
        return "//label/span[text()='Active events']/../../div/label/span[text()='Play sounds']/../input";
    }
    
    //starts at 1
    public static String checkbXinActiveEventsXpath(int pos){
        if(pos == 0){
            pos = 1;
        }
        return "//tbody/tr["+pos+"]/td[1]";
    }
    
    
    public static String checkbXStreamAssetsXpath(int pos, boolean CheckIfchecked){
        String append = "";
        if(CheckIfchecked){
            append = "[@ng-model='item.checked']";
        }
        return "//div[@options='options']/div["+ pos +"]/input" + append;
    }
    //</checkboxes>
   
    
    //<warnings>
    
    public static String warnNameFieldRequiredXpath(){
        return "//span[text()='Name']/../../span[text()='This field is required']";
    }
    
    //</warnings>
    
    
    //<inputs>
    
    public static String inputAddStreamFilterXpath(){
        return "//div[contains(@class,'input')][contains(@class,'reset')]/input";
    }
    
    public static String inputNameFieldXpath(){
        return "//input[@name='streamName']";
    }
    
    //</inputs>
    
    public static String countAddStreamAssetsXpath(){
        return "//div[@class='tree-sub-items ng-scope']/ul/li/div/ul/li";
    }
    
    
    //  <editor-fold defaultstate="collapsed" desc="DMF-944:View Job statuses Stream">
    
        
    
    //</editor-fold>    
    
}
