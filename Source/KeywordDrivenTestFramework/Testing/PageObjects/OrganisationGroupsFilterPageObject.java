/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects;

/**
 *
 * @author sscholtz
 */
public class OrganisationGroupsFilterPageObject{
    
  
    public static String AssetsValidation()
     {
         return "//li[@class='active']/a/span[1]";
     }

    
    public static String FilteredColumnButton()
    {
        return "//div[@id='assets-grid']//a[@class='btn btn-small column-chooser']";
    }
    
    public static String DescriptionColumn()
    {
        return "//table[@class='table table-scroll table-condensed table-list no-text-clip']//span[text()='Description']";
    }
    
    public static String DescriptionCheck()
    {
       // return "//ul[@class='dropdown-menu pull-right column-chooser-dropdown']/li/a/span[text()='Description']/../..";
        return "//ul[@class='dropdown-menu pull-right column-chooser-dropdown']/li/a/span[text()='Description']/..";
    }
    
    public static String RegistrationColumn()
    {
        return "//table[@class='table table-scroll table-condensed table-list no-text-clip']//span[text()='Registration']";
    }
    
    public static String RegistrationCheck()
    {
       // return "//ul[@class='dropdown-menu pull-right column-chooser-dropdown']/li/a/span[text()='Registration']/../..";
        return "//ul[@class='dropdown-menu pull-right column-chooser-dropdown']/li/a/span[text()='Registration']/..";
    }
    
    public static String AssetIDColumn()
    {
        return "//table[@class='table table-scroll table-condensed table-list no-text-clip']//span[text()='Asset ID']";
    }
    
    public static String AssetIDCheck()
    {
       // return "//ul[@class='dropdown-menu pull-right column-chooser-dropdown']/li/a/span[text()='Asset ID']/../..";
        return "//ul[@class='dropdown-menu pull-right column-chooser-dropdown']/li/a/span[text()='Asset ID']/..";
    }
    
    public static String AssetTypeColumn()
    {
        return "//table[@class='table table-scroll table-condensed table-list no-text-clip']//span[text()='Asset type']";
    }
    
    public static String AssetTypeCheck()
    {
       // return "//ul[@class='dropdown-menu pull-right column-chooser-dropdown']/li/a/span[text()='Asset type']/../..";
        return "//ul[@class='dropdown-menu pull-right column-chooser-dropdown']/li/a/span[text()='Asset type']/..";
    }
    
    public static String FilterTextBox()
    {
        return "//div[@class='search-box btn-inverse']/div/input";
    }
    
    public static String DescriptionRowText()
    {
        return "//tbody/tr/td[2]/../../tr[2]/td[2]/div/span";
    }
    
    public static String RegistrationRowText()
    {
        return "//tbody/tr/td[2]/../../tr[2]/td[3]/div/span";
    }
    
    public static String AssetIdRowText()
    {
        return "//tbody/tr/td[2]/../../tr[2]/td[4]/div/span";
    }
    
     public static String AssetTypeRowText()
    {
        return "//tbody/tr/td[2]/../../tr[2]/td[5]/div/span";
    }
     
    public static String Rows()
    {
       return "//tbody/tr";
    }
    
    public static String NoItems()
    {
        return "//div[@id-property=\"'assetId'\"]/div[2]/span";
    }
    
}  
    
