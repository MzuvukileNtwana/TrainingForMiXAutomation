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
public class LanguagingAppliedOnAddLocationPageObject 
{
    public static String MonitorMenuRelativeXpath() 
    {
        return "//a[text()='MONITOR ']";
    }
     public static String signInRelativeXpath() 
    {
        return "//button[text()='Anmelden']";
    }
    
    public static String userNameXpath() 
    {
        return "//label/strong[text()='BENUTZERNAME']/../../div/input";
    }
    public static String passwordXpath() 
    {
        return "//label/strong[text()='PASSWORT']/../../div/input";
    }
    public static String clickSignInButtonXpath() 
    {
        return "//button[text()='Anmelden']";
    }
    public static String rightAllXpath() 
    {
        return "//span[text()='Alle']";
    }
     public static String leftAllXpath() 
    {
        return "//strong[text()='Alle']";
    }
     public static String LiveTrackingXpath() 
    {
        return "//a[text()='Live-Verfolgung']";
    }
      public static String LiveTrackingLandinPageXpath() 
    {
        return "//span[text()='Aktuelle Positionsdaten']";
    }
     public static String clickCreateLocationIconXpath() 
    {
        return "//div[@class='tracking-docked-toolbar btn-inverse']/ul/li[2]/a/i[@class='icon-shapes icon-white']";
    }
    public static String CircleXpath() 
    {
        return "//div[@class='right-pane']/div[@class='tracking-toolbar-item shape-toolbar pull-right mr-10']/div/div/a[1]";
    }
    public static String RectangleXpath() 
    {
        return "//div[@class='right-pane']/div[@class='tracking-toolbar-item shape-toolbar pull-right mr-10']/div/div/a[2]";
    }
    public static String PolygonXpath() 
    {
        return "//div[@class='right-pane']/div[@class='tracking-toolbar-item shape-toolbar pull-right mr-10']/div/div/a[3]";
    }
    public static String PolylineXpath() 
    {
        return "//div[@class='right-pane']/div[@class='tracking-toolbar-item shape-toolbar pull-right mr-10']/div/div/a[4]";
    }
    public static String clickCreateLocationToDrawXpath() 
    {
        return "//div[@class='right-pane']/div[@class='tracking-toolbar-item shape-toolbar pull-right mr-10']/div/div/a[1]";
    }
    public static String retrieveLocationNamelabelXpath() 
    {
        return "//label/span[text()='Ortsname']/../span[1]";
    } 
    public static String retrieveLocationTypelabelXpath() 
    {
        return "//label/span[text()='Gebietstyp']/../span[1]";
    }
    public static String retrieveSitelabelXpath() 
    {
        return "//label/span[text()='Niederlassung']/../span[1]";
    }
     public static String retrieveColourlabelXpath() 
    {
        return "//label[text()='Ortsfarbe']/../label";
    } 
    public static String retrieveOpacitylabelXpath() 
    {
        return "//label[text()='Opazität']/../label";
    }  
     public static String retrieveNotifylabelXpath() 
    {
        return "//label/span[text()='Benachrichtige mich, wenn eine mobile Einheit in diesen Ort fährt']/../span";
    }
    public static String retrieveLocationDetailsTextLinkXpath() 
    {
        return "//div/a[text()='Ortsangaben']";
    }
    public static String retrieveCancelXpath() 
    {
        return "//div/a[text()='Ortsangaben']/../../../div[@class='pull-right']/button[1]";
    }
    public static String retrieveSaveXpath() 
    {
        return " //div/a[text()='Ortsangaben']/../../../div[@class='pull-right']/button[2]";
    }
    public static String LocationNameXpath() 
    {
        return "//label/span[text()='Ortsname']/../../input";
    }
    public static String LocationNameThisFieldIsRequiredWarningXpath() 
    {
        return "//label/span[text()='Ortsname']/../../span[text()='Dieses Feld ist erforderlich']";
    }
    public static String siteDropDownXpath() 
    {
        return "//div[@class='span12']/label/span[text()='Niederlassung']/../../select";
    }
    public static String siteThisFieldIsRequiredWarningXpath() 
    {
        return "//div[@class='span12']/label/span[text()='Niederlassung']/./../../span[text()='Dieses Feld ist erforderlich']";
    }
    public static String completeLocationNameXpath() 
    {
        return "//label/span[text()='Ortsname']/../../input";
    }
    public static String clickLocationTypeDropDownXpath() 
    {
        return "//span[text()='Gebietstyp']/../../select";
    }
    public static String KundeDropDownOptionXpath() 
    {
        return "//span[text()='Gebietstyp']/../../select/option[@value='0']";
    }
    public static String VerboteneZoneDropDownOptionXpath() 
    {
        return "//span[text()='Gebietstyp']/../../select/option[@value='1']";
    }
    public static String NiederlassungDropDownOptionXpath() 
    {
        return "//span[text()='Gebietstyp']/../../select/option[@value='2']";
    }
    public static String AndereDropDownOptionXpath() 
    {
        return "//span[text()='Gebietstyp']/../../select/option[@value='3']";
    }
    
    public static String selectLocationDropDownXpath() 
    {
        return "//span[text()='Dieses Feld ist erforderlich']/../../div/select";
    }
   
     public static String RestStopDropDownOptionXpath() 
    {
        return "//span[text()='Gebietstyp']/../../select/option[@value='5']";
    }
      public static String GeschwindigkeitszoneDropDownOptionXpath()
    {
        return "//span[text()='Gebietstyp']/../../select/option[@value='6']";
    }
    public static String FuelstopDropDownOptionXpath() 
    {
        return "//span[text()='Gebietstyp']/../../select/option[@value='4']";
    }
    public static String selectLocationTypeFromDropDownXpath() 
    {
        return "//span[text()='Gebietstyp']/../../select";
    }
    public static String clickSiteXpath() 
    {
        return "//span[text()='Niederlassung']//..//../select";
    }
    public static String AllSitesOptionXpath() 
    {
        return "//span[text()='Niederlassung']/../../select/option[@value='0']";
    }
    public static String selectSiteFromDropDownXpath() 
    {
        return "//span[text()='Niederlassung']/../../select";
    }
    
    public static String selectLocationColourXpath() 
    {
        return "//label[text()='Ortsfarbe']/../a[7]";
    }
    
    public static String opacityLocationXpath() 
    {
        return "//label[text()='Opazität']/../div/a";
    }
    
    public static String firstOpacityLocationXpath() 
    {
        return "//label[text()='Opazität']/../div/a[contains(@style,'50%')";
    }
    public static String checkNotifyMeWhenAnAssetEntersThisLocationXpath() 
    {
        return "//span[text()='Benachrichtige mich, wenn eine mobile Einheit in diesen Ort fährt']/../input  ";
    }
    public static String locationsDetailsXpath() 
    {
        return "//a[text()='Ortsangaben']";
    }
    public static String locationDetailsHeadingXpath() 
    {
        return "//span[text()='Ortskontaktangaben']";
    }
    public static String locationDetailsContactNameXpath() 
    {
        return "//label[text()='Kontaktname']/../input";
    }
    public static String locationDetailsHomeNumberXpath() 
    {
        return "//label[text()='Hausnummer']/../input";
    }
    public static String locationDetailsWorkNumberXpath() 
    {
        return "//label[text()='Arbeitsnummer']/../input";
    }
    public static String locationDetailsMobileNumberXpath() 
    {
        return "//label[text()='Mobilnummer']/../input";
    }
    public static String locationDetailsEmailAddressXpath() 
    {
        return "//label[text()='E-Mail-Adresse']/../input";
    }
    public static String locationDetailsPhisicalAddressXpath() 
    {
        return "//label[text()='Physische Anschrift']/../input";
    }
    public static String locationDetailsCancelXpath() 
    {
        return "//span[text()='Ortskontaktangaben']/../../../../../../div[2]/button[1]";
    }
    public static String locationDetailsSubmitXpath() 
    {
        return "//span[text()='Ortskontaktangaben']/../../../../../../div[2]/button[2]";
    }
    public static String KreisXpath() 
    {
        return "//span[text()='Kreis']";
//        return " //div[@class='ng-scope tooltip bottom hide'][1]/div[2]/span";
    }
    public static String RechteckXpath() 
    {
        return "//span[text()='Rechteck']";
//        return "//div[@class='ng-scope tooltip bottom hide'][2]/div[2]/span";
    }
    public static String VieleckXpath() 
    {
        return "//span[text()='Vieleck']";
    }
    public static String LinienzugXpath() 
    {
        return "//span[text()='Linienzug']";
    }
     public static String KontaktnameXpath() 
    {
        return "//label[text()='Kontaktname']";
    }
      public static String HausnummerXpath() 
    {
        return "//label[text()='Hausnummer']";
    }
       public static String ArbeitsnummerXpath() 
    {
        return "//label[text()='Arbeitsnummer']";
    }
        public static String MobilnummerXpath() 
    {
        return "//label[text()='Mobilnummer']";
    }
         public static String EMailAdresseXpath() 
    {
        return " //label[text()='E-Mail-Adresse']";
    }
          public static String PhysischeAnschriftXpath() 
    {
        return "//label[text()='Physische Anschrift']";
    }
   

     

     
    


}

