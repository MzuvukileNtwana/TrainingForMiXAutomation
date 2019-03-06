/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects;

/**
 *
 * @author lmgulwa
 */
public class IMEISearchUsabilityPageObject {
    
    public static String selectDeviceDropdownXpath()
    {
        return "//select[@name='searchtype']";
    }
    
    public static String mobileDeviceOptionXpath()
    {
        return "//select/option[text()='Mobile device']";
    }
    
    public static String iridiumOptionXpath()
    {
        return "//select/option[text()='Iridium']";
    }
    
    public static String characterLengthXpath()
    {
        return "//span[text()='The IMEI number should be 15 characters in length']";
    }
    
    public static String errorBorderColorXpath()
    {
        return "//input[contains(@style, 'border-color: #e9322d')]";
    }
    
    public static String searchFieldXpath()
    {
        return "//input[@type='number']";
    }
    
    public static String columnChooserXpath()
    {
        return "//div[@class='row-actions']//a[@ng-click='toggleColumnChooser($event)']";
    }
    
    public static String gridColumnsXpath(String column)
    {
        return "//th/span[text()='" + column + "']";
    }
    
    public static String assetColumnChooserXpath()
    {
        return "//span[text()='Asset']/../span[@ng-hide='column.visible']/../..//a";
    }
    
    public static String assetIDColumnChooserXpath()
    {
        return "//span[text()='Asset ID']/../span[@ng-hide='column.visible']/../..//a";
    }
    
    public static String assetStatusColumnChooserXpath()
    {
        return "//span[text()='Asset status']/../span[@ng-hide='column.visible']/../..//a";
    }
    
    public static String assetTypeColumnChooserXpath()
    {
        return "//span[text()='Asset type']/../span[@ng-hide='column.visible']/../..//a";
    }
    
    public static String organisationColumnChooserXpath()
    {
        return "//span[text()='Organisation']/../span[@ng-hide='column.visible']/../..//a";
    }
    
    public static String regNumberColumnChooserXpath()
    {
        return "//span[text()='Registration number']/../span[@ng-hide='column.visible']/../..//a";
    }
    
    public static String columnChooserULXpath()
    {
        return "//ul[contains(@class, 'column-chooser-dropdown')][contains(@style, 'block')]";
    }
    
    public static String assetDescriptionLinkXpath()
    {
        return "//td[@column-field='description']//a";
    }
    
    public static String assetDescriptionSpinnerXpath()
    {
        return "//h5[text()='Asset details']/../../div[contains(@class, 'loading-overlay')][@style='display: none;']";
    }
    
    public static String editAssetHeaderXpath()
    {
        return "//h5/span[text()='Edit asset']";
    }
    
    public static String assetDetailsHeaderXpath()
    {
        return "//h5[text()='Asset details']";
    }
}
