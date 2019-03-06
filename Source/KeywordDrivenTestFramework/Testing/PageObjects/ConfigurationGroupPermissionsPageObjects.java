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
public class ConfigurationGroupPermissionsPageObjects {
  
    public static String Spinner()
    {
        return "//div[@class='paged-grid']//div[@class='loading-overlay'][@style='display: none;']";
    }
  
  
    public static String FirstRowAssetSelect()
    {
        return "//div[@class='paged-grid']/div/div/div[2]/div[2]/a[@row-index='0']";
    }
  
    public static String Monitor()
    {
        return "//a[text()='MONITOR ']";
    }
  
    public static String FleetAdmin()
    {
        return "//h4[text()='FLEET ADMIN']";
    }
  
    public static String FleetAdminSubHeadings(String name)
    {
        return "//a[text()='"+name+"']";
    }
  
    public static String AssetHeading()
    {
        return "//span[text()='Assets']";
    }
  
    public static String All()
    {
        return "//strong[text()='All']";
    }
  
    public static String Filter()
    {
        return "//div[@class='text-filter empty']/input";
    }
  
    public static String FilterButton()
    {
        return "//a[@class='btn btn-small']/i[@class='icon-search']";
    }
  
    public static String AssetSelection(String name)
    {
        return "//a[text()='"+name+"']";
    }
  
    public static String AssetDetailsHeading()
    {
        return "//h5[text()='Asset details']";
    }
  
    public static String EditAsset()
    {
        return "//span[text()='Edit asset']";
    }
    
    public static String AssetDetailsTextboxValidation(String name)
    {
        return "//span[text()='"+name+"']/../../input";
    }
    
    public static String AssetDetailsDropDownListValidation(String name)
    {
        return "//span[text()='"+name+"']/../../select";
    }
    
    public static String NotesTextArea()
    {
        return "//label[text()='Notes']/../textarea";
    }
    
    public static String ConfigurationGroupDisabledValidation()
    {
        return "//span[text()='Configuration group']/../../select[@disabled='disabled']";
    }
}
