/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects;

/**
 *
 * @author apeter
 */
public class SelectedAddressPlottedOnMapPageObjects {
    public static String findXpath(){
        return "//a[@fleet-tooltip='Find']";
    }
    
    public static String findNearestXpath(){
        return "//a[@ng-click=\"finding = 'asset'\"]";
    }
    
    public static String anAddressXpath(){
        return "//span[@ng-bind-html-unsafe=\"'Find nearest asset' | translate\"]/../../../div/label/input[@value=\"address\"]";
    }
    
    public static String countryDropDownXpath(){
        return "//span[@ng-bind-html-unsafe=\"'Find nearest asset' | translate\"]/../../../div/div/div/select[1]";
    }
    
    public static String countryDropDown1Xpath(String value){
        return "//span[@ng-bind-html-unsafe=\"'Find nearest asset' | translate\"]/../../../div/div/div/select[1]/option["+value+"]";
    }
    
    public static String languageDropDownXpath(){
        return "//span[@ng-bind-html-unsafe=\"'Find nearest asset' | translate\"]/../../../div/div/div/select[2]";
    }
    
    public static String languageDropDown1Xpath(String value){
        return "//span[@ng-bind-html-unsafe=\"'Find nearest asset' | translate\"]/../../../div/div/div/select[2]/option["+value+"]";
    }
    
    public static String addressFieldXpath(){
        return "//input[@id='AddressAutoAsset']";
    }
    
    public static String addressXpath(){
        return "//ul[@class=\"ui-autocomplete ui-menu ui-widget ui-widget-content ui-corner-all\"]/li/a";
    }
    
    public static String selectedAddressXpath(){
        return "//img[@src='img/map-icon-drag-pin.png']";
    }
    
    public static String addressesXpath(){
        return "//ul[@class=\"ui-autocomplete ui-menu ui-widget ui-widget-content ui-corner-all\"]/li/a";
    }
    
    public static String addressesXpath(int num){
        return "//ul[@class=\"ui-autocomplete ui-menu ui-widget ui-widget-content ui-corner-all\"]/li["+num+"]/a";
    }
}
