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
public class IridiumAirtimeContractsAccessOnlyPermissionsPageObject 
{
    public static String PageTabsXpath(String tabName) 
    {//div[@class="modal-footer"]/../../div[@class='loading-overlay ng-scope'][@style='display: none;']
        return "//a[text()='"+tabName+"']";
    }
    
    public static String PageLoaderXpath() 
    {
        return "//div[@class='modal-footer']/../../div[@class='loading-overlay ng-scope'][@style='display: none;']";
    }
    
    public static String PageHeaderXpath() 
    {
        return "//span[text()='Airtime contract in use']";
    }
    
    public static String Contract1Xpath() 
    {
        return "//strong[text()='1']/../../a[@class='ng-binding']";
    }
    
    public static String DetailsXpath() 
    {
        return "//p[text()='The airtime contract ']/../../div[@class='well no-margin']";
    }
    
    public static String ParagraphXpath() 
    {
        return "//p[text()='The airtime contract '][text()=' is currently in use by:']/strong";
    }
    
    public static String CancelButtonXpath() 
    {
        return "//button[text()='Close']";
    }
    
    public static String CloseXpath() 
    {
        return "//span[text()='Airtime contract in use']/../../button[text()='×']";
    }
}
