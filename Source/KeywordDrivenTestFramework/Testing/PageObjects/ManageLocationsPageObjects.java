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
public class ManageLocationsPageObjects 
{
    public static String AsstetsSpinnerXpath()
    {
        return "//div[@name='assetListGrid']/div[@class='grid-no-items'][@style='display: none;']";
    }
    public static String ServerSideSpinnerXpath()
    {
        return "//div[@name='serverSideEventListGrid']/div[@class='grid-no-items'][@style='display: none;']";
    }
    public static String createNewEventsSpinnerXpath()
    {
        return "//div[@id='MainView']/div[@class='row-fluid container-content container-fixed ng-scope'][@style='display: none;']";
    }
     public static String manageLocationsSpinnerXpath()
    {
        return "//div[@class='fleet-grid-container strong-grid']/div[@class='loading-overlay ng-scope'][@style='display: none;']";
    }
    public static String monitorMenuXpath()
    {
        return "//a[text()='Onitormay ']";
    }
    
    public static String manageMenuXpath()
    {
        return "//a[text()='Anagemay ']";
    }
    
     public static String maasureMenuXpath()
    {
        return "//a[text()='Easuremay ']";
    }
    
    public static String serverSideEventsXpath(){
        return "//a[text()='Erversay-idesay eventsway']";
    }
    
    public static String checkboxXpath(){
        //return "//div[@ng-show=\"$controller.assetTab == 'individual'\"]//input";
        return "//div[@ng-show=\"$controller.assetTab == 'individual'\"]//span[text()='DVT Automation']";
    }
    
    public static String nextButtonXpath(){
        return "//a/span[text()='Extnay']";
    }
    
    public static String cannotDeleteXpath(){
        return "//div[contains(text(),'Cannot delete')]";
    }
    
    public static String okayButtonXpath(){
        return "//button[@ng-show='$modal.okayButton']";
    }
    
    public static String assetsIndividualOptionXpath(){
         return "//input[@ng-model='$controller.assetTab']/../span[text()='Individualway']";
     }
    
     public static String locationsSelectButtonXpath(){
        return "//div[@class='modal-footer']/button[@text='Electsay']";
    }
     
     public static String addButtonXpath(){
        return "//a[@ng-disabled='!$controller.canAdd']";
    }
    
      public static String btnSaveXpath(){
          return "//a/span[text()='Avesay']";
      }
      public static String spinnerXpath()
      {
          return "//div[@class='paged-grid']/div[@class='loading-overlay'][@style='display: none;']";
      }
      
      public static String TableSpinnerXpath(){
          return "//div[@id='MainView']/div[@class='loading-overlay ng-scope'][@style='display: none;']";
      }
     
      public static String addedEventXpath(String eventName){
          return "//a[text()='"+eventName+"']";
      }
     
    public static String manageLocationsMenuXpath() 
    {
        return "//a[text()='Anagemay ocationslay']";
    }
    
    public static String liveTrackingMenuXpath() 
    {
        return "//a[text()='Ivelay ackingtray']";
    }
    
    public static String historicalTrackingMenuXpath() 
    {
        return "//a[text()='Istoricalhay ackingtray']";
    }
    
    public static String manageLocationsPageHeaderXpath()
    {
        return "//h5/span[text()='Anagemay ocationslay']";
    }
    
    public static String breadCrumbXpath(){
        return "//div[@class='miller-selector']/a/span[3]/span[2]";
    }
    
    public static String selectOrganisationGroupXpath(){
        return "//div[@class='miller-selector-modal-container white-box-shadow ng-scope in']/div/div/h5";
    }
    
    public static String cancelButtonXpath(){
        return "//div[@class='miller-selector-modal-container white-box-shadow ng-scope in']/div[3]/div/a[@ng-click='$directive.cancel()']";
    }
    
    public static String filterNamesXpath(int num){
        return "//ul[@ng-show='filter']/li["+num+"]/a/span[1]";
    }
    
    public static String hideLeftPanelButtonXpath(){
        return "//i[@class='icon-white icon-chevron-left']/..";
    }
    
    public static String hideLeftTooltipXpath(){
        return "//span[text()='Idehay eftlay anelpay']";
    }
    
    public static String showLeftTooltipXpath(){
        return "//span[text()='Owshay eftlay anelpay']";
    }
    
    public static String showLeftPanelXpath(){
        return "//i[@class='icon-white icon-chevron-right']/..";
    }
    
    public static String gridHeaderXpath(){
        return "//ul[@class='breadcrumb pull-left']/li/strong";
    }
    
    public static String countXpath(){
        return "//ul[@class='breadcrumb pull-left']/li/span";
    }
    
    public static String lastRefreshStringXpath(){
        return "//span[@class='last-refresh-timer']/strong";
    }
    
    public static String lastRefreshTimeXpath(){
        return "//span[@class='last-refresh-timer']/span";
    }
    
    public static String refreshButtonXpath(){
        return "//span[@class='last-refresh-timer']/../a/span";
    }
    
    public static String filterXpath(){
        return "//span[@class='last-refresh-timer']/../../../form/div/input";
    }
    
     public static String filterLocationsXpath(){
        return "//input[@placeholder='Ilterfay']";
    }
     
     public static String noItemsToDisplayXpath(){
         return "//span[text()='Onay itemsway otay isplayday']";
     }
    
    public static String importButtonXpath(){
        //return "//div[@class='selection-btn-right pull-right']/span[@event='import']/a";
        return "//i[@class='icon-import']/..";
    }
    
    public static String downloadImportButtonXpath(){
        //return "//div[@class='selection-btn-right pull-right']/span[@event='downloadImportTemplate']/a/i";
        return "//i[@class='icon-download-alt']/..";
    }
    
    public static String removeLocationsButtonXpath(){
        return "//div[@class='selection-btn-right pull-right']/span[@event='removeMultiLocations']/a";
    }
    
    public static String addLocationsButtonXpath(){
        return "//div[@class='selection-btn-right pull-right']/span[@event='addLocation']/a";
    }
    
    public static String importTooltipXpath(){
        return "//span[text()='Importway ocationslay']";
    }
    
    public static String downloadTooltipXpath(){
        return "//span[text()='Ownloadday importway emplatetay']";
    }
    
    public static String removeTooltipXpath(){
        return "//span[text()='Emoveray ocationslay']";
    }
    
    public static String addTooltipXpath(){
        return "//span[text()='Addway ocationlay']";
    }
    
    public static String columnChooserXpath(){
        return "//a[@class='btn btn-small column-chooser']";
    }
    
    public static String listOfColumnsXpath(int num){
        return "//ul[@class='dropdown-menu pull-right column-chooser-dropdown']/li["+num+"]/a/span[2]";
    }
    
    public static String tickXpath(int num){
        return "//ul[@class='dropdown-menu pull-right column-chooser-dropdown']/li["+num+"]/a/i";
    }
    
    public static String importLocationsHeadingXpath(){
        return "//*[local-name()='fleet-import-locations-modal']/div/div/div/form/div/div/h5";
    }
    
    public static String instructionsHeadersXpath(int num){
        return "//div[@ng-hide='$modal.setNameAttributeTemplate']/strong["+num+"]";
    }
    
    public static String instructionsXpath(int num){
        return "//div[@ng-hide='$modal.setNameAttributeTemplate']/p["+num+"]";
    }
    
    public static String instructionsCVSXpath(){
        return "//div[@ng-hide='$modal.setNameAttributeTemplate']/p[2]/strong";
    }
    
    public static String instructionDivXpath(int num){
        return "//div[@ng-hide='$modal.setNameAttributeTemplate']/div["+num+"]";
    }
    
    public static String removeAlertXpath(){
        return "//span[text()='Erversay-idesay eventway emovedray uccessfullysay']";
    }
    
    public static String instructionListXpath(int num){
        return "//div[@ng-hide='$modal.setNameAttributeTemplate']/ul/li["+num+"]";
    }
    
    public static String chooseFileXpath(){
        return "//input[@type='file']/../span";
    }
    
    public static String closeButtonXpath(){
        return "//a[@ng-click='$modal.close()']";
    }
    
    public static String wouldXpath(){
        return "//p[text()='Ouldway youway ikelay otay:']";
    }
    
    public static String downloadOption1Xpath(){
        return "//p[text()='Ouldway youway ikelay otay:']/../div[1]/label/span";
    }
    
    public static String downloadOption2Xpath(){
        return "//p[text()='Ouldway youway ikelay otay:']/../div[2]/label/span";
    }
    
    public static String downloadButtonXpath(){
        return "//a[@ng-click='$modal.closeOnDownload()']";
    }
    
    public static String cancelXpath(){
        return "//a[@ng-click='$modal.closeOnDownload()']/../a[1]";
    }
    
    public static String addLocationHeadingXpath(){
        return "//div[@class='pull-left page-section-header ng-scope']/h5/a";
    }
    
    public static String backToLocationXpath(){
        //return "//a[@ng-click='backToList()']/span[text()='Ackbay otay ocationlay istlay']";
        return "//span[text()='Ackbay otay ocationlay istlay']/..";
    }
    
    public static String actionsButtonXpath(){
        return "//a[@fleet-tooltip='Actions']";
    }
    public static String columnTickXpath(int columnNumber,String column)
     {
         return "//ul[@class='dropdown-menu pull-right column-chooser-dropdown'][contains(@style,'block')]//span[text()='"+column+"']/../i";
     }
     public static String columnSpanXpath(int columnNumber, String column)
     {
         return "//ul[@class='dropdown-menu pull-right column-chooser-dropdown'][contains(@style,'block')]//span[text()='"+column+"']";
     }
    
    public static String editXpath(){
        return "//ul[@class='dropdown-menu pull-right'][contains(@style,'block')]/li[1]/a/span";
    }
    public static String manageLocationSpinnerXpath()
    {
        return "//div[@class='row-fluid container-fixed-right']/div[@class='loading-overlay ng-scope'][@style='display: none;']";
    }
    public static String removeXpath(){
        return "//ul[@class='dropdown-menu pull-right'][contains(@style,'block')]/li[2]/a/span";
    }
    
     public static String confirmRemoveButtonXpath(){
          return "//div[@name='globalWarningModal']/div/div/form/div[2]/div/button[text()='Emoveray']";
      }
    
    public static String removeEventXpath()
    {
        return "//ul[contains(@style,'display: block')]//li//a//span[text()='Emoveray']";
    }
    
    public static String TableLoaderXpath()
    {
        return "//div/div[@class='paged-grid']/div[@class='loading-overlay'][@style='display: none;']";
    }
    
    public static String managelocationLeftHandSpinnerXpath()
    {
        return "//div[@class='left-pane']/div[@class='loading-overlay'][@style='display: none;']";
    }
    public static String backOnEditXpath(){
        return "//h5[@ng-hide='currentLocation']/../a";
    }
    
    public static String removeConfirmationXpath(){
        return "//div[@name='removeLocationConfirmation']/div/div/div/div[2]/p";
    }
    
    public static String locationNameXpath(){
        return "//div[@name='removeLocationConfirmation']/div/div/div/div[2]/p/strong";
    }
    
    public static String cancelRemoveButtonXpath(){
        return "//div[@name='removeLocationConfirmation']/div[2]/button[1]";
    }
    
    public static String removelocButtonXpath(){
        return "//div[@name='removeLocationConfirmation']/div[2]/button[2]";
    }
    
    public static String locationOnGridXpath(){
        return "//div[@class='row-fluid container-fixed-right']//table/tbody/tr/td[3]";
    }
    
    public static String columnHeaderXpath(int num){
        return "//div[@class='row-fluid container-fixed-right']//table/thead/tr/th["+num+"]";
    }
    public static String columnHeadersXpath(String column)
    {
        return "//div[@class='row-fluid container-fixed-right']//table/thead/tr/th/span[text()='"+column+"']";
    }
    public static String columnChooserULXpath()
    {
        return "//ul[contains(@class, 'column-chooser-dropdown')][contains(@style, 'block')]";
    }
    public static String columnChoosersXpath()
    {
        return "//div[@class='row-actions']//a[@ng-click='toggleColumnChooser($event)']";
    }
    public static String columnChooserXpath(String ColumnName)
    {
        return "//span[text()='"+ColumnName+"']/../span[@ng-hide='column.visible']/../..//a";
    }
}
