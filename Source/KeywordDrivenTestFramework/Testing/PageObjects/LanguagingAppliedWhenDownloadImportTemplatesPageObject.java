/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects;

/**
 *
 * @author smnisi
 */
public class LanguagingAppliedWhenDownloadImportTemplatesPageObject {
    
    public static String ManageHeading()
    {
        return "//li/a[text()='Anagemay ']";
    }
    
    public static String ManageContact()
    {
        return "//li/a[text()='Anagemay ontactscay']";
    }
    
    public static String Contact()
    {
        return "//h5/span[text()='Ontactscay']";
    }
    
    public static String downloadButtonIcon()
    {
        return "//a/i[@class='icon-download-alt']";
    }
    
    public static String columnChooserButton()
    {
        return "//a/i[@class='icon-choose-columns']";
    }
    
    public static String columns()
    {
        return "//ul[@class='dropdown-menu pull-right column-chooser-dropdown'] [contains(@style,'block')]/li/a";
    }
    
    public static String importNewRecordsRadioButton()
    {
        return "//span[text()='Importway ewnay ecordsray']/../input";
    }
    
    public static String DownloadHeading()
    {
        return "//div[27]/div/div/form/div[1]/div[1]/h5[text()='Ownloadday importway emplatetay']";
    }
    
    public static String downloadButton()
    {
        return "//a[text()='Ownloadday']";
    }
    
    public static String downloadButton2()
    {
        return "//div/a[@class='btn btn-success ng-scope']";
    }
        
    
    public static String UpdateExistingRecords()
    {
      return "//label/input[@value='updateExistingRecords']";   
    }
    
    public static String downloadPopUpHeader()
    {
        return "//div[28]/div/div/form/div[1]/div[1]/h5[text()='Ownloadday importway emplatetay']";
    }
   
    
}
