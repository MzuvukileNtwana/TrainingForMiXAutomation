/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author sscholtz
 */
public class EditOrganisationsPageObjects {
    
    public static String ExpandTestRSO()
    {
        //return "//div[@class='tree-sub-items ng-scope']/ul[@class='fleet-strong-tree daredevel-tree tree full-block ng-scope']/li[9]/span";
        return "//strong[text()='Test RSO'][@class='ng-binding']/../../../../span";
    }
    public static String ExpandedTestRSO()
    {
        //return "//div[@class='tree-sub-items ng-scope']/ul[@class='fleet-strong-tree daredevel-tree tree full-block ng-scope']/li[9]/span";
        return " //strong[text()='Test RSO'][@class='ng-binding']/../../../../span[@class='daredevel-tree-anchor ui-icon icon-minus ng-scope']";
    }
    
   
  
    //MLO with Orgs 
    public static String ExpandTestMultilevelOrgWithOrgsmissingfields()
    {
        return "//strong[text()='Multi-level Org (With Orgs missing required fields)'][@class='ng-binding']/../../../../span";
    }
    public static String ExpandTestMLOwithOrgsthathasallrequiredfieldsfilledin()
    {
        return "//strong[text()='Multi-level Org (with Orgs that has all required fields filled in)'][@class='ng-binding']/../../../../span";
    }  
    public static String ExpandedTestMLOwithOrgsthathasallrequiredfieldsfilledin()
    {
        return " //strong[text()='Multi-level Org (with Orgs that has all required fields filled in)'][@class='ng-binding']/../../../../span[@class='daredevel-tree-anchor ui-icon icon-minus ng-scope']";
    }
    
   
    public static String MultiOrgTest4Select()
    {
        return "//strong[text()='Multi-Org Test 04-DO NOT DELETE']";
    }
    public static String MultiLEVOrgWithMissingFieldsSelect()
    {
        return "//strong[text()='Multi-level Org (With Orgs missing required fields)']";
    }
    public static String MultiLEVOrgWithFilledInFieldsSelect()
    {
        return "//strong[text()='Multi-level Org (with Orgs that has all required fields filled in)']";
    }
    public static String MultiOrgTest4EditHeader()
    {
        return "//h5/span[text()='Edit multi-level organisation: ']";
    }
    public static String enableForCubesCheckBox()
    {
        return "//input[@name='enableCubeView']";
    }
    public static String MLOenableForCubesCheckBox()
    {
        return "//input[@name='cubeView']";
    }
    public static String MLODetailsHeading()
    {
        return "//h5[text()='Details']";
    }
    public static String dataAdminisatration()
    {
        return "//h5/a[text()='Database administration']";
    }
    public static String config846()
    {
        return "//strong[text()='CONFIG-846']";
    }
    public static String polyTest()
    {
        return "//strong[text()='PolyTest']";
    }
    public static String organisation(int i)
    {
        return "//strong[text()='Multi-level Org (with Orgs that has all required fields filled in)']/../../../..//ul/li//a/strong['"+i+"']";
    } 
    public static String buttonOk()
    {
        return "//button[text()='OK']";
    }
    public static String popUpValidationFailed()
    {
        return "//h5[text()='Validation failed']";
    }
    public static String ensureXpath()
    {
        return "//h5[text()='Validation failed']/../..//div[@ng-bind-html-unsafe='$modal.message | translate:$modal.data']";
    }
    //-----------------------------------------------------------------------------
    public static String Groups(String OrgGroups)
    {
        return "//strong[text()='"+OrgGroups+"']/../../../../span";
    }
    
    public static String DVTAutomationSelect()
    {
        return "//strong[text()='DVT Automation']";
    }
    public static String DatabaseAdministration(String Text)
    {
        return "//h5/a[text()='Atabaseday administrationway']";
    }
    public static String CancelButton(String Text)
    {
        return "//button[text()='"+Text+"']";
    }
     public static String ConfirmButton()
    {
        return "//button[@text='Confirm']";
    }
    public static String SaveButton(String Text)
    {
        return "//button[text()='"+Text+"']";
    }
    public static String SaveButton2(String Text)
    {
        return "//button[@text='"+Text+"'][@disabled='disabled']";
    }
    public static String organisationDetails(String Text)
    {
        return "//li[1]/a[text() = '"+Text+"']";
    }
    public static String measurementsSettings(String Text)
    {
        return "//div[@class='tabbable tabs-left full-height']/ul/li[2]/a[text()='Easurementmay ettingssay']";
    }
    public static String mapSettings(String Text)
    {
        return "//div[@class='tabbable tabs-left full-height']/ul/li[3]/a[text()='Apmay ettingssay']";
               //li[3]/a[text()='"+Text+"']";
    }
    public static String HOSRulesSets(String Text)
    {
        return "//div[@class='tabbable tabs-left full-height']/ul/li[4]/a[text()='Oshay uleray etssay']";
             //li[4]/a[text()='"+Text+"']";
    }
    public static String databaseCreated(String Text)
    {
        return "//div[@class='row-fluid']/span/span[text()='"+Text+"']";
    }
    public static String OrganisationDetailsHeading(String Text)
    {
        return "//h5[text()='"+Text+"']";
    }
    public static String databaseNameTextBox()
    {
        return "//input[@name='databaseName']";
    }
    public static String DatabaseNameHeader(String text)
    {
           //label/span[text()='"+text+"']
           return "//label/span[text()='Atabaseday amenay']";
    }
    public static String salesChannelHeader(String text)
    {
           return "//div[@class='span6']/label[text()='"+text+"']";
    }
     public static String SalesChannel()
    {
        return "//div[@ng-show='organisation.direct']/input[@disabled='disabled']";
    }
    public static String customerGroupHeader(String text)
    {
        //label[text()='"+text+"']
        return "//label[text()='Ustomercay oupgray']";
    } 
    public static String customerGroupSelect()
    {
        return "//div[1]/div/select[@name='customerGroupId']";
    } 
    public static String verticalAlongheader(String text)
    {
        //label/span[text()='"+text+"']
        return "//label/span[text()='Arketmay Erticalvay']";
    } 
    public static String verticalAlongSelect()
    {
        return "//div[2]/div/select[@name='marketVerticals']";
    }
    public static String organisationIDHeader(String text)
    {
        //label/span[text()='"+text+"']
        return "//label/span[text()='Organisationway Idway']";
    }
    public static String organisationID()
    {
        return "//input[@name='fmOrganisationId']";
    }
    public static String companyIDHeader(String text)
    {
        //label/span[text()='"+text+"']
        return "//label/span[text()='Ompanycay Idway']";
    }
    public static String companyID()
    {
        return "//input[@name='companyId']";
    }
    public static String countryHeader(String text)
    {
        //label/span[text()='"+text+"']
        return "//label/span[text()='Ountrycay']";
    } 
    public static String countrySelect()
    {
        return "//select[@name='countryCode']";
    } 
    public static String OtherAccountHeader(String text)
    {
         //label/span[text()='"+text+"']
        return "//label/span[text()='Otherway accountway umbernay']";
    } 
    public static String OtherAccountText()
    {
        return "//input[@name='erp']";
    } 
     public static String billingContactHeader(String text)
    {
        //label[text()='"+text+"']
        return "//label[text()='Illingbay ontractcay']";
    } 
    public static String billingContactSelect()
    {
        return "//select[@name='billingContractId']";
    } 
    public static String billingCodeHeader(String text)
    {
       //label[text()='"+text+"']
        return "//label[text()='Illingbay odecay']";
    } 
    public static String billingcodeSelect()
    {
        return "//select[@name='billingCodeId']";
    } 
    public static String OrgDetailsTab()
    {
        return "//a[text()='Organisation details']";
    }
 
    public static String OrganisationDetailsHeading()
    {
        return "//h5[text()='Organisation details']";
    }
    public static String OrgDetailsDisabledTextBoxes(String name1)
    {
        return "//input[@name='"+name1+"'][@disabled='disabled']";
    }
    
    public static String OrgDetailsEnabledTextBoxes(String name1)
    {
        return "//input[@name='"+name1+"'][@ng-disabled='!canEdit']";
    }
    public static String OrgDetailsAccountNumberLabel(String name1)
    {
        return "//input[@name='"+name1+"'][contains(@ng-disabled,'canEdit')]";
    }

    public static String OrgDetailsDropDownList(String name1)
    {
        return "//select[@name='"+name1+"'][contains(@ng-disabled, '!canEdit')]";
    }
    
    public static String OtherAccountNumberEnter()
    {
        return "//input[@name='erp']";
    }
    public static String accountNumberXpath()
    {
        return "//div[@class='span6']/div/label/span[contains(text(),'Account Number')]";
    }
    
    public static String CancelButton()
    {
        return "//button[text()='Cancel']";
    }
    
    public static String Prompt()
    {
        return "//div[text()='Are you sure you would like to discard your changes?']";
    }
    
    public static String NoButton()
    {
        return "//button[text()='No']";
    }
    
    public static String SaveButton()
    {
        return "//button[text()='Save']";
    }
    
    public static String SuccessfullySaved()
    {
        return "//span[text()='Organisation updated successfully']";
    }
    public static String activeOrganisationName()
    {
        return "//label/strong[text()='Activateway organisationway orfay:']";
    }

    public static String ActivateOrganisationsFor()
    {
        return "//div[@class='span5']/div/label/span";
    }
    
    public static String ActiveOrg(String name)
    {
        return "//span[text()='"+name+"']/../input[@ng-disabled='!canEdit']";
    }
    public static String HoursofServiceText()
    {
        return "//span[text()='Ourshay ofway Ervicesay']";
    }
    public static String MiXGoText()
    {
        return "//span[text()='Ixmay Ogay']";
    }
    public static String IFTAText()
    {
        return "//span[text()='Iftaway']";
    }
    public static String CNILCheckBox()
    {
        return "//input[@name='cnl']";
    }
    public static String RecoveryText()
    {
        return "//span[text()='Ecoveryray']";
    }
    public static String Savedownloadrequests()
    {
        return "//span[text()='Avesay ownloadday equestsray']";
    }
    public static String SMSnotifications()
    {
        return "//span[text()='Smsay otificationsnay']";
    }
    public static String Dutchtax()
    {
        return "//span[text()='Utchday axtay']";
    }
    public static String EnableTachodataonTracers()
    {
        return "//span[text()='Enableway Achotay ataday onway Acerstray']";
    }
    public static String EnableRoadspeedlimit()
    {
        return "//span[text()='Enableway Oadray eedspay imitlay']";
    }
    public static String EnableDTCODownloadManager()
    {
        return "//span[text()='Enableway Odtcay Ownloadday Anagermay']";
    }
    public static String EnableJourneyManagement()
    {
        return "//span[text()='Enableway Ourneyjay Anagementmay']";
    }
    public static String Enableforcubes()
    {
        return "//span[text()='Enableway orfay ubescay']";
    }
    public static String MyMiX()
    {
        return "//span[text()='Ymixmay']";
    }
    public static String MixGO()
    {
        return "//span[text()='MiX Go']/../input[@ng-disabled='!organisation.userHasMiXGo']";
    }
    
    public static String EnableForCubes()
    {
        return "//span[text()='Enable for cubes']/../input[@ng-disabled='organisation.editCubeView || !canEdit']";
    }
     
    public static String spinner()
     {
         return "//div[@class='white-box-shadow full-height container-right span12']/div[@style='display: none;']";
     }
    
    public static String OrganisationContentspinner()
     {
         return "//div[@class='tab-pane active ng-scope']/div[@class='loading-overlay ng-scope'][@style='display: none;']";
     }
     public static String Contentspinner()
     {
         return "//div[2]//div[1][@class='loading-overlay ng-scope'][@style='display: none;']/../..";
     }
     public static String Contentspinner2()
     {
         return "//div[1]//div[1][@class='loading-overlay ng-scope'][@style='display: none;']/../..";
     }
      public static String confirmBodyText()
     {
         return "//div[text()='Areway youway uresay youway ouldway ikelay otay iscardday yourway angeschay?']";
     }
     public static String confirmNoButton()
     {
         return "//div[@class='pull-right ng-scope']/button[text()='Onay']";
     }
     public static String confirmYesButton()
     {
         return "//div[@class='pull-right ng-scope']/button[text()='Yesway']";
     }
     
     public static List<String> MarketVerticalDropdownlistitems()
     {
         List<String> items = new ArrayList<>(Arrays.asList("Onstructioncay",
                                                            "Emergencyway Ervicessay",
                                                            "Ieldfay Ervicesay",
                                                            "Overnmentgay / Unicipalmay",
                                                            "Easinglay",
                                                            "Ineralsmay & Explorationway",
                                                            "Oilway & Asgay",
                                                            "Ublicpay Ansporttray",
                                                            "Ecuritysay",
                                                            "Ansporttray / Istributionday"));
         
         return items;
     }
     
     
    public static List<String> CountriesDropdownlistitems()
     {
         List<String> items = new ArrayList<>(Arrays.asList("Afghanistanway","Andålay Islandsway","Albaniaway",
                                                            "Algeriaway","Americanway Amoasay","Andorraway",
                                                            "Angolaway","Anguillaway","Antarcticaway",
                                                            "Antiguaway andway Arbudabay","Argentinaway","Armeniaway",
                                                            "Arubaway","Australiaway","Austriaway",
                                                            "Azerbaijanway","Ahamasbay (ethay)","Ahrainbay",
                                                            "Angladeshbay","Arbadosbay","Elarusbay",
                                                            "Elgiumbay","Elizebay","Eninbay",
                                                            "Ermudabay","Utanbhay","Oliviabay, Urinationalplay Atestay ofway",
                                                            "Onairebay, Intsay Eustatiusway andway Abasay","Osniabay andway Erzegovinahay","Otswanabay",
                                                            "Ouvetbay Islandway","Azilbray","Itishbray Indianway Oceanway Erritorytay (ethay)",
                                                            "Uneibray Arussalamday","Ulgariabay","Urkinabay Asofay","Urundibay",
                                                            "Abocay Erdevay","Ambodiacay","Amerooncay",
                                                            "Anadacay","Aymancay Islandsway (ethay)","Entralcay Africanway Epublicray (ethay)",
                                                            "Adchay","Ilechay","Inachay",
                                                            "Istmaschray Islandway","Ocoscay (Eelingkay) Islandsway (ethay)","Olombiacay",
                                                            "Omoroscay","Ongocay","Ongocay (ethay Emocraticday Epublicray ofway ethay)",
                                                            "Ookcay Islandsway (ethay)","Ostacay Icaray","Ecôtay day'Ivoireway",
                                                            "Oatiacray","Ubacay","Uraçaocay",
                                                            "Ypruscay","Echczay Epublicray (ethay)","Enmarkday",
                                                            "Iboutidjay","Ominicaday","Ominicanday Epublicray (ethay)",
                                                            "Ecuadorway","Egyptway","Elway Alvadorsay",
                                                            "Equatorialway Uineagay","Eritreaway","Estoniaway",
                                                            "Ethiopiaway","Alklandfay Islandsway (ethay) [Alvinasmay]","Aroefay Islandsway (ethay)",
                                                            "Ijifay","Inlandfay","Ancefray",
                                                            "Enchfray Uianagay","Enchfray Olynesiapay","Enchfray Outhernsay Erritoriestay (ethay)",
                                                            "Abongay","Ambiagay (Ethay)","Eorgiagay", 
                                                            "Ermanygay","Anaghay","Ibraltargay",
                                                            "Eecegray","Eenlandgray","Enadagray",
                                                            "Uadeloupegay","Uamgay","Uatemalagay",
                                                            "Uernseygay","Uineagay","Uineagay-Issaubay",
                                                            "Uyanagay","Aitihay","Eardhay Islandway andway Onaldmcday Islandsway",
                                                            "Olyhay Eesay (ethay) [Aticanvay Itycay Atestay]","Ondurashay","Onghay Ongkay",
                                                            "Ungaryhay","Icelandway","Indiaway",
                                                            "Indonesiaway","Iranway (ethay Islamicway Epublicray ofway)","Iraqway",
                                                            "Irelandway","Isleway ofway Anmay","Israelway",
                                                            "Italyway","Amaicajay","Apanjay",
                                                            "Erseyjay","Ordanjay","Azakhstankay",
                                                            "Enyakay","Iribatikay","Oreakay (ethay Emocraticday Eoplepay'say Epublicray ofway)",
                                                            "Oreakay (ethay Epublicray ofway)","Uwaitkay","Yrgyzstankay",  
                                                            "Aolay Eoplepay'say Emocraticday Epublicray (ethay)","Atvialay","Ebanonlay",
                                                            "Esotholay","Iberialay","Ibyalay",
                                                            "Iechtensteinlay","Ithuanialay","Uxembourglay",
                                                            "Acaomay","Acedoniamay (ethay ormerfay Yugoslavway Epublicray ofway)","Adagascarmay",
                                                            "Alawimay","Alaysiamay","Aldivesmay",
                                                            "Alimay","Altamay","Arshallmay Islandsway (ethay)",
                                                            "Artiniquemay","Auritaniamay","Auritiusmay",
                                                            "Ayottemay","Exicomay","Icronesiamay (ethay Ederatedfay Atesstay ofway)",
                                                            "Oldovamay (ethay Epublicray ofway)","Onacomay","Ongoliamay",
                                                            "Ontenegromay","Ontserratmay","Oroccomay",
                                                            "Ozambiquemay","Yanmarmay","Amibianay",
                                                            "Aurunay","Epalnay","Etherlandsnay (ethay)",
                                                            "Ewnay Aledoniacay","Ewnay Ealandzay",
                                                            "Icaraguanay","Igernay (ethay)","Igerianay",
                                                            "Iuenay","Orfolknay Islandway","Orthernnay Arianamay Islandsway (ethay)",
                                                            "Orwaynay","Omanway","Akistanpay",
                                                            "Alaupay","Alestinepay, Atestay ofway","Anamapay",
                                                            "Apuapay Ewnay Uineagay","Araguaypay","Erupay",
                                                            "Ilippinesphay (ethay)","Itcairnpay","Olandpay",
                                                            "Ortugalpay","Uertopay Icoray","Atarqay",
                                                            "Unionréay","Omaniaray","Ussianray Ederationfay (ethay)",
                                                            "Andarway","Aintsay Arthélemybay","Aintsay Elenahay, Ascensionway andway Istantray aday Unhacay",
                                                            "Aintsay Ittskay andway Evisnay","Aintsay Ucialay","Aintsay Artinmay (Enchfray artpay)",
                                                            "Aintsay Ierrepay andway Iquelonmay","Aintsay Incentvay andway ethay Enadinesgray","Amoasay",
                                                            "Ansay Arinomay","Aosay Ometay andway Incipepray","Audisay Arabiaway",
                                                            "Enegalsay","Erbiasay","Eychellessay",
                                                            "Ierrasay Eonelay","Ingaporesay","Intsay Aartenmay (Utchday artpay)",
                                                            "Ovakiaslay","Oveniaslay","Olomonsay Islandsway (ethay)",
                                                            "Omaliasay","Outhsay Africaway","Outhsay Eorgiagay andway ethay Outhsay Andwichsay Islandsway",
                                                            "Outhsay Udansay","Ainspay","Isray Ankalay",
                                                            "Udansay (ethay)","Urinamesay","Albardsvay andway Anjay Ayenmay",
                                                            "Azilandsway","Edensway","Itzerlandsway",
                                                            "Yriansay Arabway Epublicray (ethay)","Aiwantay (Ovincepray ofway Inachay)","Ajikistantay",
                                                            "Anzaniatay, Unitedway Epublicray ofway","Ailandthay","Imortay-Estelay",
                                                            "Ogotay","Okelautay","Ongatay",
                                                            "Inidadtray andway Obagotay","Unisiatay","Urkeytay",
                                                            "Urkmenistantay","Urkstay andway Aicoscay Islandsway (ethay)","Uvalutay",
                                                            "Ugandaway","Ukraineway","Unitedway Arabway Emiratesway (ethay)",
                                                            "Unitedway Ingdomkay (ethay)","Unitedway Atesstay (ethay)","Unitedway Atesstay Inormay Outlyingway Islandsway (ethay)",
                                                            "Uruguayway","Uzbekistanway","Anuatuvay",
                                                            "Enezuelavay, Olivarianbay Epublicray ofway","Ietvay Amnay","Irginvay Islandsway (Itishbray)",
                                                            "Irginvay Islandsway (Uway.Say.)","Allisway andway Utunafay","Esternway Aharasay",
                                                            "Yemenway","Ambiazay","Imbabwezay"));
         
         return items;
     }
}