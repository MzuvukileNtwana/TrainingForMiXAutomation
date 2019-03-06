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
public class AssetCountPageObjects 
{
    
    public static String RowCountXpath() 
    {
        return "//div[@class ='column']/div/span[text()='Asset description']/../..//div[contains(@class,'cell')]";
    }
    
    public static String NextPageXpath() 
    {
        return "//div/button[@fleet-tooltip='Next page']";
    }
    
    public static String NextPageButtonDisabledXpath() 
    {
        return "//div/button[@disabled='disabled' and @fleet-tooltip= 'Next page']";
    }
    
    public static String LastPageXpath() 
    {
        return "//div/button[@fleet-tooltip='Last page']";
    }
    
    public static String pageSpinnerXpath() 
    {
        return "//div[@name=\"assetListGrid\"]/div[contains(@class,'loading-overlay') and contains(@style,'none')]";
    }
    
    
            
    public static String CurrentPageXpath() 
    {
        return "//div/button[@fleet-tooltip='Current page']";
    }
    public static String AllAssetCountXpath() 
    {
        return "//li/span";
    }
        
    public static String NoItemsLabelXpath() 
    {
        return "//div/span[@class= 'badge']";
    }
}
