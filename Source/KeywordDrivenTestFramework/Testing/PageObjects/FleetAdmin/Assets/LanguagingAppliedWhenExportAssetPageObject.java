/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects.FleetAdmin.Assets;

import static KeywordDrivenTestFramework.Core.BaseClass.currentEnvironment;

/**
 *
 * @author lmgulwa
 */
public class LanguagingAppliedWhenExportAssetPageObject {
    
    //  <editor-fold defaultstate="collapsed" desc="Login Page">
    
    public static String MixTelematicsURL() {
        return currentEnvironment.PageUrl;
    }
    
    public static String selectLanguageXPath()
    {
        return "//select[@ng-model='selectedLanguage']//option";
    }
    
    public static String selectLanguageFirefoxXPath()
    {
        return "//option[text()='Igpay Atinlay']";
    }
    
    public static String chosenLanguageOptionXPath(String language)
    {
        return "//select[@ng-model='selectedLanguage']/option[text()='" + language + "']";        
    } 
    
    public static String usernameXPath(String usernameLabelText)
    {
        //return "//label[text()='" + usernameLabelText + "']//../././div/input";
        return "//label/strong[text()='" + usernameLabelText + "']//.././../div/input"; 
    }
    
    public static String passwordXPath(String passwordLabelText)
    {
        //return "//label[text()='" + passwordLabelText + "']/../div/input";
        return "//label/strong[text()='" + passwordLabelText + "']/../../div/input";
    }
    
    public static String loginButtonXPath(String loginButtonText)
    {
        return "//button[text()='" + loginButtonText + "']";
    }
    
    public static String loginHeadingXpath()
    {
        return "//h4//i[@class='icon-lock icon-green mt-5']/../span";
    }
    
    public static String dropdownXpath(){
        return "//select[@name='languageList']";
    }
    
    public static String selectLanguageLabelXpath(){
        return "//select[@name='languageList']/../../label";
    }
    
    public static String userNameLabelXpath(){
        return "//label[@for='userName']";
    }
    
    public static String passwordLabelXpath(){
        return "//label[@for='password']";
    }
    
    public static String keepMeSignedInXpath(){
        return "//input[@name='rememberMe']/../span";
    }
    
    //  </editor-fold>
    
    //  <editor-fold defaultstate="collapsed" desc="Navigate to Assets">
    
    public static String monitorXPath()
    {
        return "//a[text()='Onitormay ']";
    }
    
    public static String assetXPath()
    {
        return "//a[text()='Assetsway']";
    }
    
    public static String assetPageHeaderXPath()
    {
        return "//span[text()='Assetsway']";
    }
    
    public static String columnChooserButtonXPath()
    {
        return "//i[@class=\"icon-choose-columns\"]/..";
    }
    
    public static String columnLinkXPath(int index)
    {
        return "//ul[@class='dropdown-menu grid-column-chooser']/li['" + index + "']/a";
    }
    
    //  </editor-fold>
    
    //  <editor-fold defaultstate="collapsed" desc="Process Languaging apllied when export asset">
    
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
        return "SaveDiagnosticsExportIE.PNG";
    }
    public static String saveImageDownloadIE()
    {
        return "SaveDiagnosticsDownloadIE.PNG";
    } 
    public static String saveBlueImageIE()
    {
        return "saveBlueImageIE.PNG";
    }
    
    public static String closeDownloadWindow()
    {
        return "CloseImage.PNG";
    }
     public static String closeButton()
    {
        return "CloseButton.PNG";
    }
    
    public static String unorderedAssetListXPath()
    {
        return "//ul[@class='dropdown-menu grid-column-chooser'][contains(@style,'block')]";
    }
    
    public static String assetListXPath()
    {
        return "//ul[@class='dropdown-menu grid-column-chooser'][contains(@style,'block')]//li";
    }
    
    public static String assetListAtIndexXPath(int index)
    {
        return "//ul[@class='dropdown-menu grid-column-chooser'][contains(@style,'block')]/li[" + index + "]//a";
    }    
    public static String ColumnListIndexXPath()
    {
        return "//ul[@class='dropdown-menu grid-column-chooser'][contains(@style,'block')]/li//a[@column-field='msisdn']/i";
    }    
    
    public static String assetColumXPath(int index)
    {
        //return "//div[@class='column-heading sortable']/span[contains(text(),'Egistrationray')]";
       return "//div[@class='columns ui-sortable']//div[@class='column'][" + index + "]//div[@class='column-heading sortable']/span";
    }
    
    public static String assetSourceColumStringXPath(String column)
    {
        return "//div[@class='column-heading sortable']/span[text()='" + column + "']";
       // return "//div[@class='columns ui-sortable']//div[@class='column'][" + index + "]//div[@class='column-heading sortable']";
    }
    
    public static String assetTargetColumStringXPath(String column)
    {
        return "//div[@class='column-heading sortable']/span[text()='" + column + "']/..";
       // return "//div[@class='columns ui-sortable']//div[@class='column'][" + index + "]//div[@class='column-heading sortable']";
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
        return "//div[@class='columns ui-sortable']//div[contains(@class, 'column')]//div//span[text()='" + columnHeader + "']";
    }
    
    public static String assetDivContainerXPath()
    {
        return "//div[@class='columns ui-sortable']";
    }
    //  </editor-fold>   
}
