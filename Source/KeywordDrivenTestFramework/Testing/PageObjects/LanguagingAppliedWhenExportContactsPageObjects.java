/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects;

import KeywordDrivenTestFramework.Core.BaseClass;

/**
 *
 * @author smbiko
 */
public class LanguagingAppliedWhenExportContactsPageObjects extends BaseClass
{
    public static String MixTeleImagesFolder() 
    {
       return "\\SikuliImages\\MixTelematics\\";
    }
    
    public static String saveImageFirefox()
    {
        return "SaveImageFirefox.PNG";
    }
    
    public static String saveImageIE()
    {
        return "SaveImage.PNG";
    }
    
    public static String saveBlueImageIE()
    {
        return "saveBlueImageIE.PNG";
    }
    
    public static String closeDownloadWindow()
    {
        return "CloseImage.PNG";
    }
    
    public static String unorderedAssetListXPath()
    {
        return "//ul[contains(@class, 'column-chooser-dropdown')]";
    }
    
    public static String assetListXPath()
    {
        return "//ul[contains(@class, 'column-chooser-dropdown')]//li[not(@style='display: none;')]";
    }
    
    public static String assetListAtIndexXPath(int index)
    {
        return "//ul[contains(@class, 'column-chooser-dropdown')]/li[not(@style='display: none;')][" + index + "]//a";
    }    
    
    public static String assetColumXPath(int index)
    {
       return "//tr[@class='light-blue']/th[contains(@class, 'column-heading')][" + index + "]/span[@class='ng-binding']";
    }
    
    public static String assetSourceColumStringXPath(String column)
    {
        return "//th[contains(@class, 'column-heading')]/span[text()='" + column + "']";
    }
    
    public static String gridColumsXPath()
    {
        return "//th[contains(@class, 'column-heading')]/span[@class='ng-binding']";
    }
    
    public static String assetTargetColumStringXPath(String column)
    {
        return "//th[contains(@class, 'column-heading')]/span[text()='" + column + "']";
    }
    
    public static String exportAssetXPath()
    {
        return "//i[@class='icon-export']//..";
    }
    
    public static String pageHeaderXPath()
    {
        return "//div[@class='row-fluid']//div[@class='page-header']";
    }
    
    public static String tableColumnHeaderXPath(String columnHeader)
    {
        return "//th[contains(@class, 'column-heading')]/span[text()='" + columnHeader + "']";
    }
    
    public static String assetDivContainerXPath()
    {
        return "//div[contains(@class, 'has-row-actions')]";
    }
    
    public static String columnChooserButtonXPath()
    {
        return "//i[@class='icon-choose-columns']/..";
    }
    
    public static String getGridColumnTextXPath()
    {
        return "//th/span[@class='ng-binding']";
    }
    
    public static String getGridColumnIndexTextXPath(int i)
    {
        return "//th[" + i + "]/span[@class='ng-binding']";
    }
    
    public static String nameGridColumnTextXPath()
    {
        return "//th/span[text()='Amenay']";
    }
    
    public static String columnFieldTextXPath(String text)
    {
        return "//td[@column-field='" + text + "']//span";
    }
    
    public static String columnFieldEmailXPath(String text)
    {
        return "//td[@column-field='" + text + "']//a";
    }
    
    
     public static String MenuXpath(String elementText) 
    {
        //return "//a[contains(text(), '"+elementText+"')]";
        return "//a[text()='Anagemay ']";
    }
    
    public static String SubMenuXpath(String elementText) 
    {
        return "//a[text()='Anagemay ontactscay']";
    }
    
    public static String ValidateSpanTextXpath(String elementText) 
    {
        return "//span[text()='Ontactscay']";
    }
    
}
