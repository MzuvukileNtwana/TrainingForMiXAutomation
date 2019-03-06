/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects;

/**
 *
 * @author arala
 */
public class RequestCurrentPositionNoIridiumDeviceConnectedPageObject {
    
    public static String inputFilterXpath()
    {
        return "//strong[text()='All']/../../../div[@class='pull-right']/div/input";
    }
    public static String clickSearchXpath()
    {
        return "//strong[text()='All']/../../../div[@class='pull-right']/div/a/i[@class='icon-search']";
    }
     public static String inputIMEInumberXpath()
    {
        return  "//span[text()='IMEI number']/../../input";
    }
     public static String satUnitXpath()
    {
        return  "//a[text()='SAT Unit']";
    }
       
    public static String clickAssetXpath()
    {
        return "//a[text()='SAT Unit']";
    }
     public static String assetPageXpath()
    {
        return "//h5[text()='Asset details']";
    }
    public static String MobileDeviceSettingsXpath()
    {
        return "//a[text()='Mobile device settings']";
    }
    public static String btnAvailavbleXpath()
    {
        return "//span[text()='Available']";
    }
    public static String MobileDeviceDetailsXpath()
    {
        return "//h5[text()='Mobile device details']";
    }
    public static String SatelliteCommunicationModemDetailsXpath()
    {
        return "//h5[text()='Satellite communication modem details']";
    }       
    public static String IMEInumberXpath()
    {
        return "//span[text()='IMEI number']/../../input[not(@disabled)]";
    }
    
     public static String mixTelematicLogoXpath()
    {
        return "//a[@href='#/home']/img";
    }
    public static String orgMixTelematicXpath()
    {
        return "//span[text()='Assets']/../../../div[3]/div/div[2]/a/span/span[2][text()='MiX Telematics']";
    }
        
    public static String orgInputFilterXpath()
    {
        return "//h5[text()='Select organisation group']/../../div[2]/input";
    }
     public static String clickOrgsearchXpath()
    {
        return "//h5[text()='Select organisation group']/../../../div/div[2]/a[2]/i";
    }
    public static String clickSelectedOrgaXpath()
    {
        return "//a[@ng-click='$directive.selectFilterResult(item)']/span[text()='DynaMiX Test Units 2015']";
    }
    public static String selectXpath()
    {
        return "//a[@ng-click='$directive.selectFilterResult(item)']/span[text()='DynaMiX Test Units 2015']/../../../../../../../div[3]/div/a[text()='Select']";
    }
    public static String MonitorXpath()
    {
        return "//a[text()='MONITOR ']";
    }
    public static String curentPositionXpath()
    {
        return "//ul[@class='dropdown-menu pull-right']/li[6]/a/span[text()='Request current position']";
    }       
    public static String currentPositionPageXpath()
    {
        return "//div[@class='modal hide fade modal-mini in'][@name='requestPositionModal']/div/div/div/div/h5/span ";
    }
    public static String selectSatCommsXpath()
    {
        return "//div[@class='modal hide fade modal-mini in'][@name='requestPositionModal']/div/div/div/div/h5/span/../../../../../../div/div/div/div[2]/form/div/select";
    }
    public static String SubmitXpath()
    {
        return "//div[@class='modal hide fade modal-mini in'][@name='requestPositionModal']/div/div/div/div/h5/span/../../../../../../div/../div[2]/button[text()='Submit']";
    }
    public static String currentPositionPopUpXpath()
    {
        return "//span[@id='pop-alert-message']";
    }
     public static String cancelXpath()
    {
        return  "//button[text()='Cancel']";
    } 
     //Select organisation group
     public static String SelectOrganisationGroupXPath(){
         return "//h5[text()='Select organisation group']";
     }    
}
