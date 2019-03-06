/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects.Monitor.HoursOfService.AddLogData;

/**
 *
 * @author smncwabe
 */
public class EditDriverStatusScreenFieldValidationPageObject {
    
    public static String TimeRangeXpath(){
        return "//div[@class='btn-group ml-5 pull-left']";
    }
    
    public static String SelectPreviousDateXpath(){
        return "//span/a/i[@class=' icon-chevron-left icon-grey']";
    }
    
    public static String SpinnerXpath(){
       return "//div[@class='loading-overlay'][contains(@style,'display: none;')]";
       
    }
    
    public static String ValidateDateXpath(){
        return "//div[@aria-hidden='false']//div[@class='display']/div[@class='day-of-week ng-binding']/../../div[@class='display']";
    } 

    public static String HoverOverWorkStateOffXpath(){
        return "//span[@class='hos-workstate-label ng-scope']/span[text()='OFF']";
    }
    
    public static String EditStatusXpath(){
        return "//li/a/span[text()='Edit status']/..";
    }
    
    public static String EditDriverStatusHeaderXpath(){
        return "//h5/span[text()='Edit driver status']";
    }
    
    public static String ChangeDriverLinkXpath(){
        return "//form[@name='driverStatusCrudForm']//div/label/span/../../a[text()='Change driver']";
    }
    public static String ChangeDriverLinkIEXpath(){
       return "//a[@class='pull-right'][text()='Change driver']";
    }
 
    public static String ChangeAssetLinkIEXpath(){
       return "//a[@class='pull-right'][text()='Change asset']";
    }
     
    public static String ButtonNextXpath(){
        return "//div[@class='modal hide fade in']//button[text()='Next']";
    }
    
    public static String NextButtonByXpath(){
        return "//button[@class='btn ng-scope ng-binding btn-wide btn-success'][text()='Next']";
    }
    
    public static String NextButtonActiveXpath(){
        return "//button[@class='btn ng-scope ng-binding btn-wide btn-success'][text()='Next'][@ng-show='isVisible()']";
    }
    
    public static String ChangeAssetLinkXpath(){
        return "//form[@name='driverStatusCrudForm']//div/label/span/../../a[text()='Change asset']";
    }
    
    
    public static String DriverTextBoxXpath(){
        return "//input[@ng-model='data.driver']";
    }
    
    public static String DriverTextBoxDisabledXpath(){
        return "//form[@name='driverStatusCrudForm']//input[@name='driverName'][@type='text'][@class='span12']";
    }
    
    
    
    public static String AssetTextBoxXpath(){
        return "//div[@class='driverStatusAutoComplete']/span/input[@ng-model='data.asset']";
    }
    
    public static String AssetTextBoxDisabledXpath(){
        return " //form[@name='driverStatusCrudForm']//input[@name='assetName']";
    }
   
    
    public static String ClickTheFirstElementXpath(){
        return "//ul[@matches='matches']/li[1]/a";
    }
    
    public static String RemarksTextAreaXpath(){
        return "//div/textarea[@ng-model='data.remarks']";
    }
    
    public static String DriverFieldXpath(String label){
        return "//form[@name='driverStatusCrudForm']//label/span[text()='"+ label +"']/../span[2]";
    }
    
     public static String DateFieldXpath(String label){
        return "//form[@name='driverStatusCrudForm']//label/span[text()='"+ label +"']/../span[2]";
    }
    
      public static String StatusFieldXpath(String label){
        return "//form[@name='driverStatusCrudForm']//label/span[text()='"+ label +"']/../span[2]";
    }
    
    public static String RemarksFieldXpath(String label){
        return "//form[@name='driverStatusCrudForm']//label/span[text()='"+ label +"']/../span[2]";
    }
    
    public static String AssetFieldXpath(String label){
        return "//form[@name='driverStatusCrudForm']//label/span[text()='"+label+"']/../span[2]";
    }
    
    public static String AlertMessageXpath()
    {
        return "//textarea/../span[text()='This field is required']";
    }
    
    
    
      
    

}
