/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects;

import KeywordDrivenTestFramework.Core.BaseClass;

/**
 *
 * @author mdevilliers
 */
public class ConfigAdminPageObjects extends BaseClass{
 
    
     public static String MixTelematicsURL() {
        return currentEnvironment.PageUrl;
    }
    
     //Manage Drop Down List
     public static String ItemManageXpath(){
         return "//a[text()='MANAGE ']";
     }
     
     //Groups Item
     public static String ItemConfigGroupsXpath(){
         return "//a[text()='Configuration groups']";
     }
     
    //  <editor-fold defaultstate="collapsed" desc="Libraries">   
    
    public static String ManageXpath()
    {
        return "//a[text()='MANAGE ']";
    }
    
    public static String LibrariesXpath()
    {
        return "//a[text()='Libraries'][@href='#/config-admin/libraries']";
    }
    
    public static String ParameterLibrariesXpath()
    {
        return "//a[text()='Parameter library']";
    }
    
    public static String ParameterLibrariesHeaderXpath()
    {
        return "//h5[text()='Parameter library']";
    }
    
    public static String ParameterLibrariesFilterXpath()
    {
        return "//input[@placeholder='Filter']";
    }
    
    public static String ParameterColumnXpath()
    {
        return "//span[text()='Parameter']";
    }
    
    public static String ParameterTypeColumnXpath()
    {
        return "//span[text()='Parameter type']";
    }
    
    public static String ParameterUnitsColumnXpath()
    {
        return "//span[text()='Units']";
    }
    
    public static String ChooseColumnXpath()
    {
        return "//i[@class='icon-choose-columns']";
    }
    
    public static String DisabledClickableCellXpath()
    {
        return "//a[@class='clickable-cell ng-scope disabled']";
    }
    
    public static String EnabledClickableCellXpath()
    {
        return "//a[@class='clickable-cell ng-scope']";
    }
    
    public static String ParameterlibraryTableRowXpath()
    {
        return "//tr";
    }
    
    
    //  </editor-fold>   
     //-------Config Groups-------
     //Heading/Link
     public static String HeadingConfigGroupsXpath(){
         return "//a[text()='Configuration groups:']";
     }
     
     //Asset Heading/Link
     public static String HeadingAssetXpath(){
         return "//span[text()='Assets']";
     }
     
     // Table Filters table heading
     public static String TableHeadingFiltersXpath(){
         return "//td[text()='Filters']";
     }
    
     //Table Compile Fail Reason Heading
     public static String TableHeadingCompileFailReasonXpath(){
         return "//span[text()='Compile fail reason'][@class='title']";
     }
     
     //Config Groups Table [Left One]
     public static String TableConfigGroupsXpath(){
         return "//table[@class='table table-scroll table-condensed table-list no-text-clip']";
     }
     
     //Assets Table [Right One]
     public static String TableAssetsXpath(){
         return "//div[@class='paged-grid']";
     }
     
     //Add Config Group Button
     public static String ButtonAddConfigGroupButtonXpath(){
         return "//a[@class='btn btn-small btn-success']";
     }
     
     //Name Column
     public static String TableHeadingNameXPath(){
         return "//span[text()='Name'][@class='ng-binding']";
     }
     
     //Refers to the table rows and used to count the amount of rows
     public static String TableRowConfigGroupsXpath(){
         return "//table/tbody//tr";
     }
     
     //Filter Input Pane
     public static String InputFilterXpath(){
         return "//input[@placeholder='Filter'][@type='text']";
     }
     
     public static String FilteredRowsXpath(){
         return "//td[@column-field='description']/div/a//span";
     }
     
     
    //Breadcrum Link Opens Select Organisation Group
     public static String ButtonBreadcrumXpath(){
         return "//a[@ng-click=\"$broadcast('openOrganisationSelectionMiller')\"]";
     }
     
     
     //Used to click on the tree items 
     public static String BreadcrumTreeItemXpath(String itemName){
         return "//div/div/a/span[text()='"+ itemName +"']";
     }
     
     //Select Organisation Group Heading
     public static String HeadingSelectOrganisationGroupXpath(){
         return "//h5[text()='Select organisation group']";
     }
     
     
     //Select Button
     public static String ButtonSelectXpath()
     {
         return "//a[text()='Select']";
     }

     
     //event discription
     public static String EventDescriptionTextboxXpath(){
         return "//div/label/span[text()='Event description']/../../input";
     }
     
     public static String AddConditionButtonXpath(){
         return "//div[@class='pull-left mb-5']/a/i";
     }
     
     
     
     public static String ConditionDropdownItemXpath(){
         return "//span[@class='field parameter pull-left input-event']/select";
     }    
     
     
     
    public static String RecordCheckboxXpath(){
         return "//label[@class='checkbox']/input";
     }
    
    
    
    public static String RecordDelayDropdownXpath(){
         return "//div[@class='control-group pull-left']/select";
    }
    
    
    
    public static String ActionsSoundBuzzerXpath(){
         return "//div[@class='row-fluid']/label/input";
     }
    
    
    public static String AddEventButtonXpath(){
         return "//a/i[@class= 'icon-plus icon-white']";
    }
    
    
    public static String EventLibraryHeaderXpath(){
         return "//h5[text()='Event library']";
    }
    
    public static String PeripheralLibraryHeaderXpath(){
         return "//h5[text()='Peripheral library']";
    }
    
    public static String SoundBuzzerDelayDropdownXpath(){
         return "//div[@class='form-inline']/span/div/select";
    }
    
    
    
    public static String PeripheralLibraryXpath(){
         return "//a[text()='Peripheral library']";
    }
    
    
    public static String AvailabilityColumnHeaderXpath()
    {
        return "//tr/th[@class = 'column-heading  last sortable ui-draggable']";
    }
    
    
    public static String PeripheralAndAvailbilityOptionButtonXpath()
    {
        return "//a[@class= 'btn btn-small column-chooser']/i";
    }
    
    public static String ValidateColumnHeaderXpath()
    {
        return "//td[@column-field='description']/div/a/span";
    }
    public static String EventTypeColumnHeaderXpath()
    {
        return "//tr/th[@class = 'column-heading  sortable ui-draggable']";
    }
    
    public static String EventDescriptionColumnHeaderXpath()
    {
        return "//tr/th[@class = 'column-heading  first sortable active ui-draggable']";
    }
    
    public static String AddEventLibraryXpath()
    {
        return "//a[@class='btn btn-small btn-success']/i";
    }
    
    public static String FilterTextboxXpath()
    {
        return "//div[@class='input-reset-wrapper']/input";
    }
     public static String AddEventToolTipXpath()
    {
        return "//div/span/a";
    }
    
    public static String EventTypeOptionXpath()
    {
        return "//li/a/span[text()='Event type']";
    }
    public static String AvailabiltyOptionXpath()
    {
        return "//li/a/span[text()='Availability']";
    }
    public static String EventTypeAndAvailbilityOptionButtonXpath()
    {
        return "//li/a/i[@class='icon-choose-columns']";
    }
    
    public static String PeripheralNameXpath(){
        return "//th/span[text()='Peripheral']";
    }
    
    public static String TypeNameXpath(){
        return "//th/span[text()='Type']";
    }
    
    public static String AscendingArrowXpath(){
        return "//th/span[text()='Type']/../span[@class='caret-down']";
    }
    public static String ClickAvailabilityLibray(){
        return "//th/span[text()='Availability']";
    }
    public static String DescendingArrowXpath(){
        return "//th/span[text()='Type']/../span[@class='caret-up']";
    }
    
    public static String TypeColumnFieldDataXpath(){
        return "//th/span[text()='Type']/.././../../../tbody/tr/td[@column-field='type']/div/span";
        //return "//th/span[text()='Type']/.././../../../tbody/tr/td[@class='ng-scope last']/div/span/../../..";
    }
    
   
    public static String RowCountXpath(){
        return "//tbody/tr";
    }
    
    public static String LastElementOnTheListXpath(){
        return "//tr[contains(@class,\"ng-scope last\")]";
    }
    public  static String RetrieveTheFirsTypeElementXpath(){
        return "//th/span[text()='Type']/.././../../../tbody/tr[1]/td[@column-field='type']/div/span";
    }
    
    public static String LoadingSpinnerXpath(){
        return "//div[@class='fleet-grid-container strong-grid']/div[@class='loading-overlay ng-scope'][@style='display: none;']";
    }
    public static String AscDescCheckXpath(){
        return "//th/span[text()='Type']/../span[@class='caret-down'][@style='display: none;']";
    }
    
    public static String PeripheralFilteredXpath(){
        return "//th/span[text()='Peripheral']/.././../../../tbody/tr[1]/td[@column-field='description']/div/a/span";
    }
    
    public static String TimeLineLinkXpath(){
        return "//li/a[text()='Timeline']";
    }
    
    public static String EventLibrarySpinner()
    {
        return "//div[@class='loading-overlay'][@style='display: none;']";
    }
    
}
