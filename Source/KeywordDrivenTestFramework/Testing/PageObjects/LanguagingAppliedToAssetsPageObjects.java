/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects.AssetsPageObject.LanguagingToAssets;
import KeywordDrivenTestFramework.Core.BaseClass;
import java.util.List;

/**
 *
 * @author mdevilliers
 */
public class LanguagingAppliedToAssetsPageObjects extends BaseClass{
 
    
    public static String MixTelematicsURL() {
        return currentEnvironment.PageUrl;
    }
    
    public static String ManageXpath()
    {
        return "//a[text()='MONITOR ']";
    }
    
    public static String AssetSubMenuRelativeXpath(String linkText) 
    {
        return "//a[text()='"+linkText+"']";
    }
    
    public static String AssetLinkTextXpath(String AssetInPreferedLanguage)
    {
        return "//div/ul/li/a[text()='"+AssetInPreferedLanguage+"']";
    }
    
    public static String AssetPageNameLabalXpath(String AssetInPreferedLanguage)
    {
        return "//div[@ui-if='title']/h5/span[text()='"+AssetInPreferedLanguage+"']";
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
    
    public static String AddAssetButtonXpath()
    {
        return "//div[@class='page-header']/div//a[@fleet-tooltip='Add asset']";
    }
    
    public static String AssetDescriptionInputFieldXpath()
    {
        return "//div[@class='input']/input[@name='description']";
    }
    
    public static String AssetSiteDropDownXpath()
    {
        return "//div[@class='control-group']/select[@name='siteId']";
    }
    
    public static String ChangesNotSavedPopUpXpath()
    {
        return "//form/div/div[@class='alert alert-warning']/h5[text()='Modifiche non salvate']";
    }
    
    public static String ConfirmDiscardChangesQuestionXpath(String question)
    {
        return "//div[@class='modal hide fade hidden-phone modal-mini in']//div[text()='"+question+"?']";
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
    
    public static String ActionButtonXpath(String rowIndex)
    {
        //div/div/span/../../div[@row='3']/../../div/div/span/a/../../../div[@row='3']/div/a
        return "//div/div/span/../../div[@row='"+rowIndex+"']/../../div/div/span/a/../../../div[@row='"+rowIndex+"']/div/a";
    }
    
    public static String SearchInputFieldXpath()
    {
        return "//div[@class='pull-right']/div[@class='text-filter']/input[@class='ng-valid ng-dirty']";
    }
    
    public static String ColumnChooser()
    {
        return "//div[@class='column-heading sortable']/span[@class='title']/a[@class='btn btn-small column-chooser']/i[@class='icon-choose-columns']";
    }
    
    public static String AssetColumnIdXpath(String AssetId)
    {
        return "//*[contains(@class,'cell')][text()="+AssetId+"]";
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

     public static String CurrentlySelectedGroupNameXpath(String groupName)
     {
         return "//div[@class='miller-selector']/./a/span/../span/../span/span[text()='"+groupName+"']";
     }
     
     public static String BreadcrumUrlXpath()
     {
         return "//div[@class='miller-selector']/./a/span/../span/../span/span[@ng-show='$index > 0']/../../b/..";
     }
     
     public static String PageLoadingIcon()
     {
         return "//div[@class='loading-overlay'][contains(@style,'display: none;')]";
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
         return "//h5/../../../div[@class='page-header']/div[@class='pull-right']/input";
     }
     
     
     //Breadcrum Link Opens Select Organisation Group
     public static String ButtonBreadcrumXpath(){
         
         //return "//a[@ng-click=\"$broadcast('openOrganisationSelectionMiller')\"]";
         return "//a[contains(@ng-click,'openOrganisationSelectionMiller')]";
     }
     
      //Select Button
     public static String ButtonSelectXpath(String buttonSelect)
     {
         return "//a[@ng-click='$directive.submit()'][text()='"+buttonSelect+"']";
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
   
}
