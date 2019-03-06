/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects.Manage.Operation.OrganisationSettings.CostCategories;

import KeywordDrivenTestFramework.Core.BaseClass;

/**
 *
 * @author smncwabe
 */
public class AddCostCategoryPageObject extends  BaseClass{
    
    public static String OrganisationSettingsLinkXpath(){
     return "//li/a[text()='Organisation settings']";
    }
    
    public static String SpinnerXpath(){
        return "//div[@class='loading-overlay ng-scope'][@style='display: none;']";
    }
    
    
    public static String CostCategoriesSpinnerXpath(){
        return "//div[@class='fleet-grid-container strong-grid']/div[@class='loading-overlay ng-scope'][@style='display: none;']";
    }
    
    //tab Driver defaults
    public static String DriverDefaultsTabXpath(){
        return "//ul/li/a[text()='Driver defaults']";
    }
    
    public static String AssetIntervalReminderDefaultsTabXpath(){
        return "//ul/li/a[text()='Asset interval and reminder defaults']";
    }
    
    public static String SaveButtonXpath(){
        return "//Button[@class='btn-wide btn-small btn-success btn ng-scope ng-binding'][text()='Save']";
    }
    
    public static String CostCategoriesLinkXpath(){
        return "//a[text()='Cost categories']";
    }
    
    public static String CostCategoriesHeading(){
        return "//span[text()='Cost categories']";
    }
    
    public static String CategoryName(){
        return "//th/span[text()='Category name']";
    }
    
    public static String CostCategoriesGridXpath(){
        //return "//table/thead/tr/th";
        return "//table[@class='table table-scroll table-condensed table-list no-text-clip']/thead/tr//th[contains(@class,'column-heading')]";
    }
    
    public static String AddCategoryButtonXpath(){
        return "//div/span//a[text()='Add category']";
    }
    
    public static String CategoryNameInputXpath(){
        return "//div[@class='control-group']//label/span[text()='Category name']/../../input";
    }
    
    public static String CategoryTypeDropDownXpath(){
        return "//div[@class='span6']//select";
    }
    
    
    public static String DefaultMemoTextAreaXpath(){
        return "//div[@class='span12']//textarea";
    }
    
    public static String PopUpXpath(){
        return "//div/span[text()='Organisation updated successfully']";
    }
    
    public static String GridcategoryNameXpath(){
        return "//tbody/tr/td[@column-field='description']";
        //return "//tbody/tr/td[@column-field='description']/div/span";
        //return "//tbody/tr/td[2]";
    }
    public static String GridcategoryByNameXpath(String text){
     
        return "//tbody/tr/td[@column-field='description']/div/span[text()='"+text+"']";
    }
    
    public static String ActionButtonRowXpath(){
        return "//div[@ng-show=\"rowActions\"]/ul//li";
    }
    
    public static String ActionButtonByIndexXpath(String rowIndex)
    {
        return "//div[@ng-show=\"rowActions\"]/ul//li[@ng-show]["+rowIndex+"]/div/div/a";
    }
    
    public static String ActionButtonByIndexXpath()
    {
        return "//div[@ng-show=\"rowActions\"]/ul//li[@ng-show][1]/div/div/a";
    }
    
    public static String RemoveLinkXpath(){
        return "//ul/li/a//span[text()='Remove']";
    }
    
    public static String RemoveButtonPopUpXpath(){
        return "//button[text()='Remove']";
    }
    
    //Iridium Airtime language Applied 
    
    public static String ValidateSpanTextXpath(String Text)
    {
        return "//h5/span[text()='"+Text+"']";
    }
   
    public static String TabListXpath(String Text)
    {
        return "//a[text()='"+Text+"']";
    }
    
    public static String waitFortheSpinnerXpath()
    {
        return "//div[@class='tab-pane active ng-scope']/div[@class='loading-overlay ng-scope'][@style='display: none;']";
    }
    public static String addContractSpinnerXpath()
    {
        return "//div[@class='well no-margin']/div[@class='loading-overlay ng-scope'][@style='display: none;']";
    }
    public static String contractTypeXpath()
    {
        return "//select[@ng-options='contractType.id as contractType.title for contractType in contractModalTemplate.contractTypes']";
    }
    public static String contractXpath()
    {
        return "//select[@ng-options='contract.id as contract.title for contract in contractModalTemplate.filteredContracts']";
    }
    public static String selectButtonXpath()
    {
        return "//button[@text='Electsay']";
    }
    public static String removeContractXpath(String Text)
    {
        return "//a[text()='"+Text+"']/../a/i";
    }
    public static String removeButtonXpath()
    {
        return "//button[@text='Emoveray']";
    }
     public static String CancelButtonXpath()
    {
        return "//button[@text='Ancelcay']";
    }
     public static String removePopupBodyXpath()
    {
        return "//p[text()='Isthay actionway illway emoveray isthay ontractcay omfray ethay availableway ontractcay istlay. Areway youway uresay youway ouldway ikelay otay ontinuecay?']";
    }
      public static String iridiumAirtimePageHeaderXpath()
    {
        return "//h5[text()='Iridiumway airtimeway ontractscay']";
    }
    
    
    //popup
    public static String ValidatePopupSpanTextXpath()
    {
        return "//span[text()='Airtimeway ontractcay inway useway']";
    }
    
    public static String ValidatePopupbodyTextXpath(String Text)
    {
        return "//p[contains(text(),'"+Text+"')]";
    }
    public static String ValidatePopupbodyAssTextXpath(String Text)
    {
        return "//h5/a[@class='ng-binding'][contains(text(),'"+Text+"')]";
    }
     public static String PopupCloseButtonXpath()
    {
        return "//button[@text='Oseclay']";
    }
  
    //========
    
     
    
   
    
    
}
