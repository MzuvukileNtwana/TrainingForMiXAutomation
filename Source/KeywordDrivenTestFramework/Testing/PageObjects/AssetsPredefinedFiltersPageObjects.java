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
public class AssetsPredefinedFiltersPageObjects 
{
    
    public static String FilterGridButtonsXpath(String labelText) 
    {
        return "//li/a/span[text()='"+ labelText +"']";
    }
    
    
    public static String SearchButtonXpath() 
    {
        return "//div/div/a[@class = 'btn btn-small']/i[@class='icon-search']";
    }
    
     public static String TableSpinnerXpath() 
    {
        return "//div[@class='loading-overlay ng-scope'][@style='display: none;']";
    }
    
    public static String AssetFilterRowXpath() 
    {
        return "//div[@class ='column']/div/span[text()='Asset description']/../..//div[contains(@class,'cell')]";
    }
    
    public static String GridHeadingXpath(String headingText) 
    {
        return "//ul/li/strong[text()= '"+ headingText +"']";
    }
    
    public static String RefreshLinkXpath() 
    {
        return "//p/a/span[text()='Refresh']";
    }
    
    public static String DriverTableSpinnerXpath() 
    {
        return "//div[@class='paged-grid']//div[@class='loading-overlay'][@style='display: none;']";
    }
    
    public static String PagerButtonXpath()
    {
        return "//div[@class='pull-right pager']";
    }
    
    public static String RefreshLinkTextByXpath()
    {
        return "//a/i/../span[text()='Refresh']";
    }
    
    public static String SpinnerXpath()
    {
        return "//div[2][@class='loading-overlay'][@style='display: none;']";
    }
    
    public static String ColumnChooserXpath()
    {
        return "//div/span/a[@class='btn btn-small column-chooser']/i/..";
    }
    
    public static String SelectColumnNameXpath(String ColumnName)
    {
        return "//ul[@class='dropdown-menu grid-column-chooser'][contains(@style,'display: block;')]/li/a/span[@class='spacer pull-left']/../span[text()='"+ColumnName+"']";
    }
    
    public static String DisplayedColumnNameXpath(String ColumnName)
    {
        return "//div[contains(@class,'column-heading sortable')]/span[text()='"+ColumnName+"']";
    }
    
    public static String SearchFilterXpath()
    {
        return "//div[@class='pull-right']/div//input";
    }
    
    public static String SearchResultXpath(String ColumnName,String text)
    {
        if(ColumnName.equalsIgnoreCase("Mobile number")){
            return "//div[contains(@class,'column-heading sortable')]/span[text()='"+ColumnName+"']/../../div[text()='+"+text+"']";
        }else{
            return "//div[contains(@class,'column-heading sortable')]/span[text()='"+ColumnName+"']/../../div[text()='"+text+"']";
        }        
    }
    
    public static String SearchResultNameColumnXpath(String text)
    {
        return "//div[contains(@class,'column-heading sortable')]/span[text()='Name']/../../div[2]/a[text()='"+text+"']";
    }
    
    public static String ButtonClearXpath()
    {
        return "//div[@class='pull-right']/div//a[@class='clear-filter'][@style='']/i[@class='icon-remove-sign']/..";
    }
    
    public static String ButtonSearchXpath()
    {
        return "//div[@class='pull-right']/div//a[@class='btn btn-small']/i[@class='icon-search']/..";
    }
    
    public static String EmailListXpath()
    {
        return "//div[contains(@class,'column-heading sortable')]/span[text()='Email address']/../../div[contains(@class,'cell')]/..";
    }
}
