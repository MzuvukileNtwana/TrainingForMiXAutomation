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
public class ExportContactPageObject {
    
    //  <editor-fold defaultstate="collapsed" desc="Export Contacts">
    
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
        return "//th/span[text()='Name']";
    }
    
    public static String columnFieldTextXPath(String text)
    {
        return "//td[@column-field='" + text + "']//span";
    }
    
    public static String columnFieldEmailXPath(String text)
    {
        return "//td[@column-field='" + text + "']//a";
    }
    
    //  </editor-fold>  
    
    
    //  <editor-fold defaultstate="collapsed" desc="HOS ContentCheck">
    
    public static String ContentColumnListXpath()
    {
        return "//ul[contains(@style,'display: block;')]/li/a/span";
    }
    
    public static String RightSpinnerXpath()
    {
        return "//div[contains(@class,'container-right')]//div[@class='loading-overlay'][@style='display: none;']";
    }
    
    public static String CheckElements(String column)
    {
        return "//ul[@class='dropdown-menu grid-column-chooser'][contains(@style,'block')]/li//span[text()='"+column+"']";
    }
    
    public static String columns(){
        return "//ul[@class='dropdown-menu grid-column-chooser'] [contains(@style,'block')]/li/a";
    }
    
    public static String GridHeader(String gridHeader){
        return "//div[contains(@class, 'column-heading sortable')]/span[text()='" + gridHeader + "']";
    }
    
    public static String LastColumnByXpath(){
        return "//div[contains(@class,\"column last\")]";
    }
    
    
    public static String ColumnCountByXpath(){
        return "//div[@class='column']";
    }
    
    public static String DriversColumnXpath(int index){
        return "//div[contains(@class, 'column-heading sortable')]/../../div["+ index +"]//span[@class='title']";
    }
    
    public static String DriverSourceColumStringXPath(String column)
    {
        return "//div[contains(@class, 'column-heading sortable')]/span[text()='" + column + "']";
    }
    
    public static String DriverTargetColumStringXPath(String column)
    {
        return "//div[contains(@class, 'column-heading sortable')]/span[text()='" + column + "']";
    }
    
    public static String DriverTableColumnHeaderXPath(String columnHeader)
    {
        return "//div[contains(@class, 'column-heading sortable')]/span[text()='" + columnHeader + "']";
    }
    
    public static String DriverDivContainerXPath()
    {
        return "//div[contains(@class,'row-fluid container-fixed-right paged-grid-container')]";
    }
    
    public static String ScrollToNameXPath()
    {
        return "//div[contains(@class,\"column-heading sortable\")]/span[text()='Name']";
    }
    public static String ColumnHeaderXpath(String column)
    {
        return "//div[contains(@class,'column-heading sortable')]//span[text()='"+column+"']";
    }
    
    
    
    
    
    
    
    //  </editor-fold>  
    
    
}
