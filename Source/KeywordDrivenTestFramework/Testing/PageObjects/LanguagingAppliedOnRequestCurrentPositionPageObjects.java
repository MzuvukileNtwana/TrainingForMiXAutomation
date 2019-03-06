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
public class LanguagingAppliedOnRequestCurrentPositionPageObjects {
    public static String NavigateToLiveTracking()
    {
        return "//div[@ng-repeat='module in section.modules']/h4[text()='RASTREAMENTO']/../ul/li/a[text()='Rastreio em directo']";
    }
    
    public static String requestCurrentPositionHeadingXpath(){
        return "//h5/span[text()='Solicitar posição actual']";
    }
    
    public static String errorXpath(){
        return "//span[text()='Este campo é obrigatório']";
    }
    
    public static String submitButtonXpath(){
        return "//span[text()='Este campo é obrigatório']/../../../../../../../div[@class='modal-footer']/button";
    }
    
    public static String positionRequestedXpath(){
        return "//span[@id='pop-alert-message']";
    }
    
    public static String optionsXpath(int num){
        return "//select[@name='transportMethodId']/option["+num+"]";
    }
    
    public static String dropdownOptionsXpath(String value){
        return "//select[@name='transportMethodId']/option[@value="+value+"]";
    }
    
}
