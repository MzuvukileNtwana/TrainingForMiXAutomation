/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package KeywordDrivenTestFramework.Testing.PageObjects;

/**
 *
 * @author lmkhontwana
 */
public class ExportAssetsNonEnglishPageObjects {
    
    
      public static String ColumnChooserButtonRelativeXpath() 
    {
        return "//a[@class='btn btn-small column-chooser']";
    }
    public static String ColumnChooserListRelativeXpath() 
    {
        return "//ul[@class='dropdown-menu grid-column-chooser']";
    }
    public static String ConfigUploadDateRelativeXpath() 
    {
        return "//ul[@class='dropdown-menu grid-column-chooser'] [contains(@style,'block')]/li/a[@column-field='configUploadDate']";
    }
    public static String AssetIDRelativeXpath() 
    {
        return "//ul[@class='dropdown-menu grid-column-chooser'] [contains(@style,'block')]/li/a[@column-field='fmVehicleId']";
    }
    public static String AssetTypeRelativeXpath() 
    {
        return "//ul[@class='dropdown-menu grid-column-chooser'] [contains(@style,'block')]/li/a[@column-field='assetType']";
    }
    
    public static String ConfigurationGroupRelativeXpath() 
    {
        return "//ul[@class='dropdown-menu grid-column-chooser'] [contains(@style,'block')]/li/a[@column-field='configurationGroup']";
    }
    
    public static String CountryRelativeXpath() 
    {
        return "//ul[@class='dropdown-menu grid-column-chooser'] [contains(@style,'block')]/li/a[@column-field='country']";
    }
    
    public static String EngineHoursRelativeXpath() 
    {
        return "//ul[@class='dropdown-menu grid-column-chooser'] [contains(@style,'block')]/li/a[@column-field='engineHours']";
    }
    public static String FleetNumberRelativeXpath() 
    {
        return "//ul[@class='dropdown-menu grid-column-chooser'] [contains(@style,'block')]/li/a[@column-field='fleetNumber']";
    }
    public static String ImeiRelativeXpath() 
    {
        return "//ul[@class='dropdown-menu grid-column-chooser'] [contains(@style,'block')]/li/a[@column-field='imei']";
    }
    public static String ImsiRelativeXpath() 
    {
        return "//ul[@class='dropdown-menu grid-column-chooser'] [contains(@style,'block')]/li/a[@column-field='imsi']";
    }
    public static String LastAvlRelativeXpath() 
    {
        return "//ul[@class='dropdown-menu grid-column-chooser'] [contains(@style,'block')]/li/a[@column-field='lastAvl']";
    }
    public static String LastTripRelativeXpath() 
    {
        return "//ul[@class='dropdown-menu grid-column-chooser'] [contains(@style,'block')]/li/a[@column-field='lastTrip']";
    }
      public static String MobileDeviceTypeRelativeXpath() 
    {
        return "//ul[@class='dropdown-menu grid-column-chooser'] [contains(@style,'block')]/li/a[@column-field='mobileDeviceType']";
    }
    public static String MsisdnRelativeXpath() 
    {
        return "//ul[@class='dropdown-menu grid-column-chooser'] [contains(@style,'block')]/li/a[@column-field='msisdn']";
    }
    public static String OdometerRelativeXpath() 
    {
        return "//ul[@class='dropdown-menu grid-column-chooser'] [contains(@style,'block')]/li/a[@column-field='odometer']";
    }
    public static String RegistrationNumberRelativeXpath() 
    {
        return "//ul[@class='dropdown-menu grid-column-chooser'] [contains(@style,'block')]/li/a[@column-field='registrationNumber']";
    }
    public static String SiterRelativeXpath() 
    {
        return "//ul[@class='dropdown-menu grid-column-chooser'] [contains(@style,'block')]/li/a[@column-field='site']";
    }
    public static String CurrentStateRelativeXpath() 
    {
        return "//ul[@class='dropdown-menu grid-column-chooser'] [contains(@style,'block')]/li/a[@column-field='currentState']";
    }
   
    public static String ItalianButtonSelectXpath()
    {
         return "//a[@ng-click='$directive.submit()'][text()='Seleziona']";
     }

    public static String AssetGridAllButtonRelativeXpath() 
    {
        return "//span[text()='Tutti']";
    }
     public static String AssetsHeaderLabelRelativeXpathText() 
    {
        return "//h5/span[text()='Risorse']";
    }
    
}
