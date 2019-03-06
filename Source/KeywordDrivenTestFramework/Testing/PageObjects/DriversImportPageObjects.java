/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects;

/**
 *
 * @author elebese
 */
public class DriversImportPageObjects 
{
    public static String ImportButtonXpath()
    {
         return "//a/i[@class='icon-import']";
    }
    
    public static String CancelButtonXpath()
    {
         return "//button[text()='Cancel']";
    }
    
    public static String YesButtonXpath()
    {
         return "//button[text()='Yes']";
    }
    
     public static String ExtendedDriveIDHeaderXpath()
    {
         return "//form//legend";
    }  
    
    public static String ChooseFileButtonXpath()
    {
         return "//div[@class='input-append pull-left span12 no-margin']/span";
    }
    
    public static String ImportDriversHeaderXpath()
    {
         return "//div/h5[text()='Import drivers']";
    }
    
    
    public static String ImportedSuccessfullyNotificationXpath()
    {
         return "//div/div/span[text()='Drivers imported successfully']";
    }
    
    public static String SavedSuccessfullyNotificationXpath()
    {
         return "//div/div/span[text()='Driver created successfully']";
    }
    
    public static String DriverDetailsXpath()
    {
         return "//legend[text()='Driver details']";
    }
    
    public static String TextboxXpath(String labelText)
    {
         return "//label/span[text()='"+labelText+"']/../../input";
    }
    
    
    public static String NoneRadioButtonXpath()
    {
         return "//form//div/label/input[@class='ng-pristine ng-valid']";
    }
    
    public static String NoneRadioButtonTextXpath()
    {
         return "//form//div/label/span[text()='None']";
    }
    
    public static String DropDownXpath(String labelText)
    {
         return "//label/span[text()='"+labelText+"']/../../select";
    }
    
    public static String RemoveDriverXpath()
    {
         return "//a[@row-index='0']/span[text()='Remove']/..";
    }
    
    public static String RemovedSuccessffullyXpath()
    {
         return "//div/div/span[text()='Driver removed successfully']";
    }
    public static String ConfirmRemoveDriverButtonXpath()
    {
         return "//button[text()='Remove']";
    }
    
    public static String RemoveAssetXpath()
    {
        return "//div[@class='alert alert-warning']/h5[text()='Remove asset']";
    }
    
    public static String RemoveAssetConfirmationXpath()
    {
        return "//span[text()='Asset removed successfully']";
    }
    
    public static String ExtendedDriverIDXpath()
    {
         return "//li/a[text()= 'Extended driver ID']";
    }   
    public static String extendDriverSpinnerXpath()
    {
        return "//div[@class='row-fluid']/div[@class='loading-overlay ng-scope'][@style='display: none;']";
    }
    public static String RemoveXpath()
    {
         return "//ul[contains(@style,'display: block')]/li/a/i/../span[text()='Remove']";
    }   
    
    public static String ConfirmRemoveModalXpath()
    {
        return "//div[@aria-hidden='false']";
    }
}
