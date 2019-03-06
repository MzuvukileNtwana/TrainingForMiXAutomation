package KeywordDrivenTestFramework.Testing.PageObjects.AssetsPageObject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import KeywordDrivenTestFramework.Core.BaseClass;
import java.util.List;

/**
 *
 * @author yduma
 */
public class LanguagingAppliedToAssetsPageObjects extends BaseClass{
 
    
    public static String MixTelematicsURL() {
        return currentEnvironment.PageUrl;
    }
    
    public static String ManageXpath()
    {
        return "//a[text()='MONITOR ']";
    }
    
    public static String bugErrorMsgXpath()
    {
        return "//form[@name='modalForm']/div[@class='modal-inner-body white-box-padding']/div[@class='alert alert-error']/h5";
    }
    
    public static String bugErrorMsgButtonOkXpath()
    {
        return "//form[@name='modalForm']/div[@class='modal-inner-body white-box-padding']/div[@class='alert alert-error']/../../div[@class='modal-footer']/div/button[text()='OK']";
    }
    
    public static String AssetSubMenuRelativeXpath(String linkText) 
    {
        return "//a[text()='"+linkText+"']";
    }
    
    public static String SearchFilterXpath()
    {
        return "//div[@class='pull-right']/div/input";
    }
    
    public static String CurrentlySelectedGroupNameXpath(String groupName)
    {
        return "//div[@class='miller-selector']/./a/span/../span/../span/span[text()='"+groupName+"']";
    }
       
    public static String HeadingCreateNewAssetXpath()
    {
        return "//div[@class='page-header']/h5/span[text()='Crea nuova risorsa']";
    }
     
    
    public static String AssetLinkTextXpath(String AssetInPreferedLanguage)
    {
        return "//div/ul/li/a[text()='"+AssetInPreferedLanguage+"']";
    }
    
     public static String BreadcrumUrlXpath()
     {
         return "//div[@class='miller-selector']/./a/span/../span/../span/span[@ng-show='$index > 0']/../../b/..";
     }
     
     public static String BreadcrumSpanXpath()
     {
         return "//a[contains(@ng-click,'selectOrganisation')][@class='font-bold']/span[@ng-show]";
     }
    
    public static String AssetPageNameLabalXpath(String AssetInPreferedLanguage)
    {
        return "//div[@ui-if='title']/h5/span[text()='"+AssetInPreferedLanguage+"']";
    }
    
    public static String AssetPageNameLabelEnglishXpath()
    {
        return "//div[@class='pull-left page-section-header ng-scope']/h5/a[@ng-click='click()'][text()='Assets']";

        //"//div[@class='pull-left page-section-header ng-scope']/h5/a[@ng-click='click()'][text()='Assets details']"

    }
    
    public static String RightGridHeadingXpath(String RightGridHeaderText)
    {
        return "//div[@class='page-header']/ul/li/strong[text()='"+RightGridHeaderText+"']";
    }
    
    //
    public static String AssetFilterColumnNameXpath(String AssetDescription)
    {
        return "//div/div/span[text()='"+AssetDescription+"']";
    }
    
    public static String EngineHoursColumnXpath()
    {
        return "//div/div/span[text()='Engine hours']";
    }
    
    public static String TrackingIconTextXpath()
    {
        return "//div[text()='This icon will be displayed on the map']";
    }
    
    public static String TrackingIconAndColourTextLabelXpath()
    {
        return "//label[text()='Tracking Icon & colour']";
    }
    
    public static String AssetMSISDNxpath()
    {
        return "//div/div/span[text()='MSISDN ']";
    }
    
    //PageName label xpath when Adding/Creating a new Security Group
    public static String LastRefreshedLabelXpath(String LastRefresh)
    {
        return "//div[@class='pull-left']/p/span[@class='last-refresh-timer']/strong[text()='"+LastRefresh+"']";
    }
    
    //Textbox xpath when Adding/Creating a new Security Group
    public static String LastRefreshTimeXpath()
    {
        return "//div[@class='pull-left']/p/span[@class='last-refresh-timer']/span";
    }
    
    //Organisation Group span text xpath when Adding/Creating a new Security Group
    public static String LeftGridFilterNameXpath(String FilterText)
    {
        return "//li[@class='ng-scope']/a/span[text()='"+FilterText+"']/..";
    }
    
     public static String PageLoadingIcon()
     {
         return "//div[@class='loading-overlay'][contains(@style,'display: none;')]";
     }
     
     public static String WithUserLinkTextXpath()
     {
         return "//li/a/span[text()='With Users']";
     }
     
     public static String WithoutUserLinkTextXpath()
     {
         return "//li/a/span[text()='Without Users']";
     }
    
    //Details tab xpath when Adding/Creating a new Security Group
    public static String DownloadImportTemplateButtonXpath()
    {
        return "//div//a[@fleet-tooltip='Download import template']/i[@class='icon-download-alt']";
    }
    
    //Drop downListIcon xpath with a list Of Organisation groups when Adding/Creating a new Security Group
    public static String ImportAssetButtonXpath()
    {
        return "//div//a[@fleet-tooltip='Import assets']/i[@class='icon-import']";
    }
    
    //Drop downListIcon xpath with a list Of Organisation groups when Adding/Creating a new Security Group
    public static String ExportAssetButtonXpath()
    {
        return "//div/form/button[@fleet-tooltip='Export assets']/i[@class='icon-export']";
    }
    
     //---------------------------------------------Add Asset Page Object Elements----------------------------------------------------------
    
    public static String AddAssetButtonXpath()
    {
        return "//div[@class='page-header']/div//a[@fleet-tooltip='Add asset']";
    }
    
    public static String CreateNewAssetPageLabelXpath()
    {
        return "//h5/span[text()='Create new asset']";
    }
    
    public static String AssetDescriptionInputFieldXpath()
    {
        return "//div[@class='input']/input[@name='description']";
    }
    
    public static String ValidationMessageXpath()
    {
        return "//div[@class='input']/input[@name='description']/../span[@class='validity-message ng-scope ng-binding']";
    }
    
    public static String ValidateRegistionWarningMessageXpath()
    {
        return "//div[@class='control-group']/input[@name='registrationNumber']/../span[@class='validity-message ng-scope ng-binding']";
    }
    
    public static String RegistrationNumberInputFieldXpath()
    {
        return "//div[@class='control-group']/input[@name='registrationNumber']";
    }
    
    public static String ConfigurationGroupIdDropDownListXpath()
    {
        return "//div[@class='control-group']/select[@name='configurationGroupId']/option[text()='Seleziona un gruppo di configurazione']";
    }
    
    public static String EnglisgConfigurationGroupIdDropDownListXpath()
    {
        return "//div[@class='control-group']/select[@name='configurationGroupId']";
    }
    
    public static String FuelTypeDropDownListXpath()
    {
        return "//div[@class='control-group']/select[@name='fuelType']/option[text()='Seleziona un tipo carburante']";
    }
    
    public static String EnglishFuelTypeDropDownListXpath()
    {
        return "//div[@class='control-group']/select[@name='fuelType']";
    }
    
    public static String ModelInputFieldXpath()
    {
        return "//div[@class='control-group']/./div[@class='input']/input[@name='model']";
    }
    
    public static String ChassisNumberInputFieldXpath()
    {
        return "//div[@class='control-group']/./div[@class='input']/input[@name='chassisNumber']";
    }
    
    public static String AssetTypeDropDownListXpath()
    {
        return "//div[@class='control-group']//select[@name='assetTypeId']/option[text()='Seleziona un tipo di risorsa']";
    }
    
    public static String SelectAssetTypeDropDownListXpath()
    {
        return "//div[@class='control-group']//select[@name='assetTypeId']";
    }
    
    public static String ValidationMsgForAssetType()
    {
        return "//div[@class='control-group']//select[@name='assetTypeId']/../span";
    }
    
    public static String SiteId_dropDownListXpath()
    {
        return "//div[@class='control-group']//select[@name='siteId']/option[text()='Seleziona un sito']";
    }
    
    public static String SelectSiteId_dropDownListXpath()
    {
        return "//div[@class='control-group']//select[@name='siteId']";
    }
    
    public static String selectOptions(String option)
    {
        return "//div[@class='control-group']//select[@name='siteId']/option[text()='"+option+"']";
    }
    
    public static String SiteId_ValidationMessageXpath()
    {
        return "//div[@class='control-group']//select[@name='siteId']/../span";
    }
    
    public static String CountryDropDownListXpath()
    {
        return "//div[@class='control-group']//select[@name='country']/option[text()='Choose country']";
    }
    
    public static String TargetFuelConsumptionInputFieldXpath()
    {
        return "//div[@class='control-group']/./div[@class='input']/input[@name='targetFuelConsumption']";
    }
    
    public static String MakeInputFieldXpath()
    {
        return "//div[@class='control-group']/./div[@class='input']/input[@name='make']";
    }
    
    public static String yearInputFieldXpath()
    {
        return "//div[@class='control-group']/./div[@class='input']/input[@name='year']";
    }
    
    public static String EngineNumberInputFieldXpath()
    {
        return "//div[@class='control-group']/./div[@class='input']/input[@name='engineNumber']";
    }
    
    public static String AdditionalMobileDeviceInputFieldXpath()
    {
        return "//div[@class='control-group']/./div[@class='input']/input[@name='additionalMobileDevice']";
    }
    
    public static String NoteTextAreaInputFieldXpath()
    {
        return "//div[@class='row-fluid']/label/../textarea[@name='notes']";
    }
    
    public static String ColourInputFieldXpath()
    {
        return "//div[@class='control-group']/div[@class='input']/input[@name='colour']";
    }
    
    public static String AssetIconXpath()
    {
        return "//div[@class='row-fluid']/div[@class='pull-left well well-small well-icon last']/span";
    }
    
    public static String SelectIconXpath()
    {
        return "//div[@class='row-fluid']/div[@class='pull-left well well-small well-icon last']/../div/a[@ng-click='openIconChooser()']";
    }
    
    public static String ChooseIconHeadingWindowXpath()
    {
        return "//div[@class='alert alert-info']/button/../h5/span[text()='Scegli icona']";
    }
    
    public static String SelectColourHeadingXpath()
    {
        return "//div[@class='well no-margin']//h5[text()='Seleziona un colore']";
    }
    
    public static String SelectButtonColourXpath()
    {
        return "//div[@class='modal-footer']/button[text()='Seleziona']";
    }
    
    public static String CancelButtonColourXpath()
    {
        return "//div[@class='modal-footer']/button[text()='Annulla']";
    }
    
    public static String HoverTooltipTextXpath()
    {
        return "//div[@class='tooltip-inner']/span[contains(text(),'nascondi foto')]";
    }
    
    public static String Hide_ShowIconXpath()
    {
        return "//div[@class='fa-detail-right well']/a/i/..";
    }
    
    public static String FleetNumberInputXpath()
    {
        return "//div[@class='control-group']/./div[@class='input']/input[@name='fleetNumber']";
    }
    
    public static String AssetSiteDropDownXpath(String SelectAssetType)
    {
        return "//div[@class='control-group']/select[@name='siteId']/option[text()='"+SelectAssetType+"']";
    }
    
    
    public static String ChangesNotSavedPopUpXpath()
    {
        return "//form/div/div[@class='alert alert-warning']/h5[text()='Modifiche non salvate']";
    }
    
    public static String ConfirmDiscardChangesQuestionXpath()
    {
        return "//div[@class='modal hide fade hidden-phone modal-mini in']//div[text()='Ignorare le modifiche?']";
    }
    
    public static String ButtonNoXpath()
    {
        return "//div[@class='modal hide fade hidden-phone modal-mini in']//button[text()='No']";
    }
    
    public static String ButtonYesXpath()
    {
        return "//div[@class='modal hide fade hidden-phone modal-mini in']//button[text()='Sì']";
    }
    
    public static String ButtonCancelXpath()
    {
        return "//div[@class='selection-btn-right pull-right']//button[text()='Annulla']";
    }
    
    public static String ButtonCancelEnglishXpath()
    {
        return "//div[@class='selection-btn-right pull-right']//button[text()='Cancel']";
    }
     
    public static String AssetDetailsTabXpath()
    {
        return "//a[@ng-click='changeTab(tab)'][text()='Dettagli risorsa']";
    }
    
    public static String ButtonSaveXpath()
    {
        return "//button[contains(@text,'Save')]";
        //return "//div[@class='selection-btn-right pull-right']//button[text()='Salva']";
    }
    
    public static String ButtonSaveEnglishXpath()
    {
        return "//div[@class='selection-btn-right pull-right']//button[text()='Save']";
    }
    
    public static String ButtonSaveEnglishDisabledXpath()
    {
        return "//div[@class='selection-btn-right pull-right']//button[text()='Save'][@disabled='disabled']";
    }
    
    public static String ActionButtonXpath(String rowIndex)
    {
        //div/div/span/../../div[@row='3']/../../div/div/span/a/../../../div[@row='3']/div/a
        return "//div/div/span/../../div[@row='"+rowIndex+"']/../../div/div/span/a/../../../div[@row='"+rowIndex+"']/div/a";
    }
    
    public static String buttonSearchIconXpath()
    {
        return "//div/div[@class='text-filter']/a/i[@class='icon-search']/..";
    }
    
    public static String SearchInputFieldXpath()
    {
        return "//div[@class='pull-right']/div[@class='text-filter']/input[@class='ng-valid ng-dirty']";
    }
    
    public static String ColumnChooser()
    {
        return "//div[@class='column-heading sortable']/span[@class='title']/a[@class='btn btn-small column-chooser']/i[@class='icon-choose-columns']";
    }
    
    public static String SecurityGroupColumnChooserXpath()
    {
        return "//div[@class='row-actions']//li[@class='header btn-group']/a[@class='btn btn-small column-chooser']/i[@class='icon-choose-columns']";
    }
    
    public static String hideLeftPanelXpath()
    {
        return "//div[@class='container-fluid full-height']/./div/a/i[@class='icon-white icon-chevron-left']";
    }
    
    public static String AssetColumnIdXpath(String AssetId)
    {
        return "//*[contains(@class,'cell')][text()="+AssetId+"]";
    }
    
    public static String mobileDeviceColumnXpath()
    {
        return "//div/div/span[@class='title'][text()='Mobile device']/../../*[contains(@class,'cell')]";
    }
    
     public static String ColumnDescriptionXpath(String AssetName)
    {
        return "//div/a[text()='"+AssetName+"']";
    }
    
    public static String ColumnAndRowIndexXpath(String columnName, String rowIndex)
    {
        return "//div/div/span[text()='"+columnName+"']/../../div[@row='"+rowIndex+"']";
    }
    
    public static String BreadcrumbsXpath()
    {
        return "//a[@ng-click=\"$broadcast('openOrganisationSelectionMiller')\"]";
    }
    
    public static String SubOrganisationGroup(String organisationGroup)
    {
        return "//a/span[text()='"+organisationGroup+"']";
    }
    
    public static String AssetDescriptionCheckMarkXpath()
    {
        return "//ul[@class='dropdown-menu grid-column-chooser']/li/a[@column-field='description'][@class='disabled']";
    }
    
    public static String AssetIDXpath(String assetId)
    {
        return "//ul[@class='dropdown-menu grid-column-chooser'][contains(@style,'block')]/li/a[@column-field='fmVehicleId']/span[text()='"+assetId+"']/..";
    }
    
    public static String AssetTypeXpath(String assetType)
    {
        return "//ul[@class='dropdown-menu grid-column-chooser'][contains(@style,'block')]/li/a[@column-field='assetType']/span[text()='"+assetType+"']/..";
    }
    
    public static String AssetConfigUploadDateXpath(String assetConfigUploadDate)
    {
        return "//ul[@class='dropdown-menu grid-column-chooser'][contains(@style,'block')]/li/a[@column-field='configUploadDate']/span[text()='"+assetConfigUploadDate+"']/..";
    }
    
    public static String AssetConfigurationGroupXpath(String assetConfigurationGroup)
    {
        return "//ul[@class='dropdown-menu grid-column-chooser'][contains(@style,'block')]/li/a[@column-field='configurationGroup']/span[text()='"+assetConfigurationGroup+"']/..";
    }
    
    public static String AssetCountryXpath(String country)
    {
        return "//ul[@class='dropdown-menu grid-column-chooser'][contains(@style,'block')]/li/a[@column-field='country']/span[text()='"+country+"']/..";
    }
    
    public static String AssetEngineHoursXpath(String EngineHours)
    {//ul[@class='dropdown-menu grid-column-chooser'][contains(@style,'block')]/li/a[@column-field='engineHours']/span[text()='Ore motore']/..
        return "//ul[@class='dropdown-menu grid-column-chooser'][contains(@style,'block')]/li/a[@column-field='engineHours']/span[text()='"+EngineHours+"']/..";
    }
    
    public static String AssetfleetNumberXpath(String fleetNumber)
    {
        return "//ul[@class='dropdown-menu grid-column-chooser'][contains(@style,'block')]/li/a[@column-field='fleetNumber']/span[text()='"+fleetNumber+"']/..";
    }
    
    public static String AssetIMEIXpath(String IMEI)
    {
        return "//ul[@class='dropdown-menu grid-column-chooser'][contains(@style,'block')]/li/a[@column-field='imei']/span[text()='"+IMEI+"']/..";
    }
    
    public static String AssetIMSIXpath(String IMSI)
    {
        return "//ul[@class='dropdown-menu grid-column-chooser'][contains(@style,'block')]/li/a[@column-field='imsi']/span[text()='"+IMSI+"']/..";
    }
    
    public static String AssetLastPositionXpath(String LastPosition)
    {
        return "//ul[@class='dropdown-menu grid-column-chooser'][contains(@style,'block')]/li/a[@column-field='lastAvl']/span[text()='"+LastPosition+"']/..";
    }
    
    public static String AssetLastTripXpath(String LastTrip)
    {
        return "//ul[@class='dropdown-menu grid-column-chooser'][contains(@style,'block')]/li/a[@column-field='lastTrip']/span[text()='"+LastTrip+"']/..";
    }
    
     public static String AssetMobileDeviceTypeXpath(String MobileDeviceType)
    {
        return "//ul[@class='dropdown-menu grid-column-chooser'][contains(@style,'block')]/li/a[@column-field='mobileDeviceType']/span[text()='"+MobileDeviceType+"']/..";
    }
    
    public static String AssetMSISDNXpath(String MSISDN )
    {
        return "//ul[@class='dropdown-menu grid-column-chooser'][contains(@style,'block')]/li/a[@column-field='msisdn']/span[text()='"+MSISDN+" ']/..";
    }
    
    public static String AssetOdoMeterXpath(String OdoMeter)
    {
        return "//ul[@class='dropdown-menu grid-column-chooser'][contains(@style,'block')]/li/a[@column-field='odometer']/span[text()='"+OdoMeter+"']/..";
    }
    
    public static String AssetregistrationNumberXpath(String registrationNumber)
    {
        return "//ul[@class='dropdown-menu grid-column-chooser'][contains(@style,'block')]/li/a[@column-field='registrationNumber']/span[text()='"+registrationNumber+"']/..";
    }
    
    public static String AssetSiteXpath(String Site )
    {
        return "//ul[@class='dropdown-menu grid-column-chooser'][contains(@style,'block')]/li/a[@column-field='site']/span[text()='"+Site+"']/..";
    }
    
    public static String AssetStatusXpath(String Status)
    {
        return "//ul[@class='dropdown-menu grid-column-chooser'][contains(@style,'block')]/li/a[@column-field='currentState']/span[text()='"+Status+"']/..";
    }
    
     //Used to click on the tree items 
     public static String BreadcrumTreeItemXpath(String itemName){
         //return "//div/div/a/span[text()='"+ itemName +"']";
         return "//a/span[text()='"+ itemName +"']/..";
     }

     
     
     //Used to find the correct item from the filter search 
     public static String BreadcrumItemAfterFilterXpath(List<String> columns){
         
         int size = columns.size();
         String output = "//span[text()='";
         for (int i = 0; i < size; i++) {
             
             if(i == size-1)
             {
                 output = output + "']/../../a/span[text()='"+ columns.get(i) +"']";
             }else
             {
                 output = output + columns.get(i) + " / ";
             }
             
         }
         
         return output;
     }
    
    
     public static String InputFieldSelectOrginisationGroupXpath(){
         return "//div[contains(@class, 'miller')]//div/h5[text()='Select organisation group']/../../div/input";
     }
     
     
     //Breadcrum Link Opens Select Organisation Group
     public static String ButtonBreadcrumXpath(){
         
         //return "//a[@ng-click=\"$broadcast('openOrganisationSelectionMiller')\"]";
         return "//a[contains(@ng-click,'openOrganisationSelectionMiller')]";
     }
     
     public static String SecurityGroupBreadcrumXpath()
     {
         return "//a[contains(@ng-click,'selectOrganisation')][@class='font-bold']";
     }
     
      //Select Button
     public static String ButtonSelectXpath()
     {
         return "//a[@ng-click='$directive.submit()'][text()='Seleziona']";
     }
     
     public static String ButtonSelectEnglishXpath()
     {
         return "//a[@ng-click='$directive.submit()'][text()='Select']";
     }
     
     //Select Organisation Group Heading
     public static String HeadingSelectOrganisationGroupXpath(){
         return "//h5[text()=\'Seleziona gruppo dell'organizzazione\']";
     }
     
     //Breadcrum Label Displayed on page
     public static String BreadcrumLabelItemXpath(String itemXpath)
     {
         return "//div[@class='miller-selector']/a/span/span[text()='" + itemXpath + "']";
     }
     
     //Search results heading
     public static String BreadcrumSearchResultHeadingXpath(){
         return "//div[contains(@class,'filter')]/div//h5";
     }
     
     public static String filterTextboxXpath()
     {
         return "//div[@class='pull-right']/input[@class='filter ng-pristine ng-valid']";
     }
     
     //--------------------------------AssetType dropdown option------------------------------
     
     public static String BoatXpath()
     {
         return "//div[@class='control-group']/select[@name='assetTypeId']/option[text()='Imbarcazione']";
     }
    
     public static String DangerousGoodsXpath()
     {
         return "//div[@class='control-group']/select[@name='assetTypeId']/option[text()='Veicolo adibito a trasporto merci pericolose']";
     }
     
     public static String EmergencyServiceVehicleXpath()
     {
         return "//div[@class='control-group']/select[@name='assetTypeId']/option[text()='Veicolo adibito a servizio di emergenza']";
     }
     
     public static String FluidTransportServiceXpath()
     {
         return "//div[@class='control-group']/select[@name='assetTypeId']/option[text()='Veicolo adibito al trasporto liquidi']";
     }
     
     public static String HeavyPassengerVehicle_Bus_ArticulatedXpath()
     {
         return "//div[@class='control-group']/select[@name='assetTypeId']/option[text()='Veicolo pesante per il trasporto di persone - Bus - Articolato']";
     }
     
     public static String Bus_DoubleDeckerXpath()
     {
         return "//div[@class='control-group']/select[@name='assetTypeId']/option[text()='Veicolo pesante per il trasporto di persone - Bus - Autobus a due piani']";
     }
     
     public static String Bus_SingleDeckerXpath()
     {
         return "//div[@class='control-group']/select[@name='assetTypeId']/option[text()='Veicolo pesante per il trasporto di persone - Bus - Autobus a un piano']";
     }
     
     public static String HeavyVehicleArticulatedXpath()
     {
         return "//div[@class='control-group']/select[@name='assetTypeId']/option[text()='Veicolo pesante - Articolato']";
     }
     
     public static String HeavyVehicleNonArticulatedXpath()
     {
         return "//div[@class='control-group']/select[@name='assetTypeId']/option[text()='Veicolo pesante - Non-articolato']";
     }
     
     public static String RefridgiratedTransportXpath()
     {
         return "//div[@class='control-group']/select[@name='assetTypeId']/option[text()='Veicolo pesante - Trasporto refrigerato']";
     }
     
     public static String LightDeliveryVehicleXpath()
     {
         return "//div[@class='control-group']/select[@name='assetTypeId']/option[text()='Light Delivery Vehicle']";
     }
     
     public static String MiniBusXpath()
     {
         return "//div[@class='control-group']/select[@name='assetTypeId']/option[text()='Veicolo leggero per il trasporto di persone - Minibus']";
     }
     
     public static String LightVehicleXpath()
     {
         return "//div[@class='control-group']/select[@name='assetTypeId']/option[text()='Veicolo leggero']";
     }
     
     public static String MobilePlantEquipmentXpath()
     {
         return "//div[@class='control-group']/select[@name='assetTypeId']/option[text()='Macchinari per impianti mobili']";
     }
     
     public static String MotorCycleXpath()
     {
         return "//div[@class='control-group']/select[@name='assetTypeId']/option[text()='Motociclo']";
     }
     
     public static String OtherXpath()
     {
         return "//div[@class='control-group']/select[@name='assetTypeId']/option[text()='Altro']";
     }
     
     public static String PassengerVehicleXpath()
     {
         return "//div[@class='control-group']/select[@name='assetTypeId']/option[text()='Veicolo passeggero']";
     }
     
     public static String StationaryPlanEquipmentXpath()
     {
         return "//div[@class='control-group']/select[@name='assetTypeId']/option[text()='Macchinari per impianti fissi']";
     }
     
     public static String TrailerXpath()
     {
         return "//div[@class='control-group']/select[@name='assetTypeId']/option[text()='Rimorchio']";
     }
     public static String Train()
     {
         return "//div[@class='control-group']/select[@name='assetTypeId']/option[text()='Train']";
     }
     
     public static String AssetStatus()
     {
         return "//div[@class='page-header']/span[text()='Disponibile']";
     }
     
     public static String NoConfigGroupTextXpath()
     {
         return "//div/h5[text()='Nessun gruppo di configurazione']";
         //return "//div[@class='well well-small']/h5[@dmx-translate][text()='Nessun gruppo di configurazione']";
     }
     
     public static String NoMobileDeviceTextXpath()
     {
         return "//div/p[text()='No mobile device']";
         //return "//div[@class='well well-small']/p[@dmx-translate][text()='No mobile device']";
     }
     
     public static String Hide()
     {
         return "//div/a[@fleet-tooltip='Show/Hide photo']/i/..";
     }
     
     public static String MobileDeviceXpath()
     {
         //return "//div[@class='well well-small']/p[@ng-show]";
         return "//div[@class='well well-small']/p[@ng-hide]";
     }
     
     public static String ConfigGroupNameXpath()
     {
         //return "//div[@class='well well-small']/h5[@ng-show]";
         return "//div[@class='well well-small']/h5[@ng-hide]";
     }
     
     public static String ChangeStringXpath()
     {
         return "//span[text()='Cambia']";
         //return "//div[@id='btn-change-photo']/a/span[@dmx-translate][text()='Cambia']/..";
     }
     
     public static String Thumbnail()
     {
         return "//div[@class='thumbnail']";
     }
     
     public static String ImageDisplayXpath()
     {
         return "//div[@id='fa-photo']/div[@id='btn-change-photo']/..";
     }
     
     public static String IEChangeImageButtonXpath()
     {
       //  return "//div[@id='btn-change-photo']/a/span[@dmx-translate][text()='Cambia']";
         return "//a[@class='btn btn-mini btn-success' and @ng-click=\"$emit('changePhotoClicked')\"]";
        // return "//div[@id='btn-change-photo']/a/span[@dmx-translate][text()='Cambia']/..";
     }
     
      public static String ChangeImageButtonXpath()
     {
         return "//div[@id='btn-change-photo']/a/span[@dmx-translate][text()='Cambia']/..";
     }
     
     public static String UploadAssetImageHeadingXpath()
     {
         return "//span[text()='Carica immagine risorsa']";
     }
     
     public static String assetImageUploadXpath()
     {
         return "//div[@name='assetImageUpload'][@aria-hidden='false']";
     }
     
     public static String buttonCloseXpath()
     {
         return "//div[@class='alert alert-success']/button[@ng-hide='hideClose'][@class='close']";
     }
     
     public static String ChooseImageTextXpath()
     {
         return "//p[text()='Scegli l’immagine da caricare']";
     }
     
     
     public static String ImportFileChooseFileTextXpath()
     {
         return "//div[@class='modal hide fade hidden-phone in']//p[text()='Please choose the file you would like to import']";
     }
     
     public static String ImportFile_InstructionTextXpath()
     {
         return "//div[@class='modal hide fade hidden-phone in']//p/strong[text()='Instructions:']";
     }
     
     public static String ImportFile_CloseXpath()
     {
         return "//div[@class='modal hide fade hidden-phone in']//div/a[text()='Close']";
     }
     
     
     
     public static String MaxFileSizeXpath()
     {
         return "//p[text()=' < 10MB']";
     }
     
     public static String ImportFile_MaxFileSizeXpath()
     {
         return "//div[@class='modal hide fade hidden-phone in']//p[text()=' < 10MB']";
     }
     
     public static String ChooseFileButtonXpath()
     {
         return "//span[@class='btn fileinput-button btn-success']/span/..";
     }
     
     public static String ButtonOkXpath()
     {
         return "//button[contains(@text,'OK')]";
     }
     
     public static String ButtonNo_languagingXpath()
     {
         return "//div[@class='modal-footer']/button[text()='Annulla']";
     }
     
     public static String EngineHoursEnabledHiddenXpath()
     {
         return "//div[@class='input']/input[@name='targetHourlyFuelConsumption'][@disabled='disabled']";
     }
     
     public static String AssetSuccessfulCreatedTextXpath()
     {
         return "//div[@class='notification notification-placement notification-success']/span[@id='pop-alert-message'][text()='Asset created successfully']";
     }
     
     public static String targetedHourlyFuelConsumptionInputFieldXpath()
     {
         return "//div[@class='input']/input[@name='targetHourlyFuelConsumption']";
     }
     
     public static String targetedHourlyFuelConsumptionInputFieldDisabledXpath()
     {
         return "//div[@class='input']/input[@name='targetHourlyFuelConsumption'][@disabled='disabled']";
     }
     
     public static String DropDownlistConfGroupXpath()
     {
         return "//form[@name='assetDetailsForm']//select[@name='configurationGroupId']";
     }
}
