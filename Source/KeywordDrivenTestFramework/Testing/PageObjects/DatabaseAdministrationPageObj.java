package KeywordDrivenTestFramework.Testing.PageObjects;

import static KeywordDrivenTestFramework.Core.BaseClass.currentEnvironment;

/**
 *
 * @author kbuso
 */
public class DatabaseAdministrationPageObj
{
    public static String MixTelematicsURL() {
        return currentEnvironment.PageUrl;
    }
    
    //UserName
   public static String DatabaseAdministrationLinkTextXpath()
   {
       return "//li/a[text()='Database administration']";
   }
   
   public static String ExpandTopLevelOrganisationXpath()
   {
       return "//li/div/div/a/strong[text()='Test RSO']/../../../../span";
   }
   
   public static String ExpandTopLevelOrganisationXpath(String DVTRSO)
   {
       return "//li/div/div/a/strong[contains(text(),'"+DVTRSO+"')]/../../../../span";
   }
   
   public static String ManageOrganisationStructureSpinneerXpath()
   {
       return "//div[@class='organisation-name'][contains(@style, 'display: none')]";
   }
   
   public static String MillerSelectorSpinnerXpath()
   {
       return "//div[@class='miller-selector'][contains(@style, 'display: none')]";
   }
   
   public static String DropDownListMapProviderXpath()
   {
       return "//select[@ng-model='mapProvider']";
   }
   
   public static String GoogleStreetOptionXpath()
   {
       return "Google (street)";
   }
   
   public static String LiveTrackingSpinnerXpath()
   {
       return "//div/div[@columns='workerGridColumns']/../div[@ng-show='contentLoadingStack && contentLoadingStack.length > 0'][contains(@style,'display: none;')]";
   }
   public static String LiveTrackingAssetSpinnerXpath()
   {
       return "//div[@rows='assets']/div[@class='fleet-grid-container strong-grid']/div[@style='display: none;'][@class='loading-overlay ng-scope']";
   }
   public static String LiveTrackingHeadingXpath()
   {
       return "//span[text()='Live tracking']";
   }
   
   public static String AssetDescriptionLabelHeadingXpath()
   {
       return "//th[@ng-repeat='column in filteredColumns']/span[text()='Asset description']";
   }
   
   public static String ShowSelectedAssetsLabelXpath()
   {
       return "//span[text()='Show selected assets']";
   }
   
   public static String OrganisationGroupNameXpath(String OrganisationName)
   {
       return "//div/div/a/strong[text()='"+OrganisationName+"']";
   }
   
   public static String OrgUpdatedSuccessfullyXpath()
   {
       return "//div/span[text()='Organisation updated successfully']";
   }
   
   public static String MapSettingsXpath()
   {
       return "//ul/li/a[text()='Map settings']";
   }
   
   public static String DropDownListSelectSatelliteMapProviderXpath()
   {
       return "//select[@name='satelliteProvider']";
   }
   
   public static String ButtonSaveXpath()
   {
       return "//button[text()='Save']";
   }
   
   public static String AddRoleLandingPageXpath()
   {
       return "//div[@fleet-loader='content'][@class='tab-pane active ng-scope']";
   }
   
   public static String AddRSOSpinnerXpath()
   {
       return "//div[@fleet-loader='content']//form[@name='rsoDetailsForm']/../div[@style='display: none;']";
   }
   
   public static String AddRoleSpinnerXpath()
   {
       return "//div[@fleet-loader='content']//form[@name='roleCrudForm']/../div[@style='display: none;']";
   }
   
   public static String ButtonNoXpath()
   {
       return "//button[text()='No']";
   }
   
   public static String ButtonSaveDisabledXpath()
   {
       return "//button[text()='Save'][@disabled='disabled']";
   }
   
   public static String ModalFormNotHiddenXpath()
   {
       return "//div[@aria-hidden='false']/form[@name='modalForm']";
   }
   
   public static String ButtonCancelXpath()
   {
       return "//button[text()='Cancel']";
   }
   
   public static String DiscardChangesPromptMessageXpath()
   {
       return "//div[text()='Are you sure you would like to discard your changes?']";
   }
   
   public static String fireFoxGoogleStreetMapImg()
   {
       return "firefoxGoogleStreet.PNG";
   }
   
   public static String LiveTrackingLinkTextXpath()
   {
       return "//li/a[text()='Live tracking']";
   }
   
   public static String MapDropDownListXpath()
   {
       return "//select[@ng-model='mapProvider']";
   }
   
   public static String MapProviderDropDownXpath()
   {
       return "//select[@name='mapProvider']";
   }
   
   public static String SatelliteMapProviderDropDownXpath()
   {
       return "//select[@name='satelliteProvider']";
   }
   
   public static String JobMessageDecartaMap()
   {
       return "JobMessageDecartaMap.PNG";
   }
   
   public static String HereMapSettings()
   {
       return "HereMapSettings.PNG";
   }
   
   public static String ZoomAddressImg()
   {
       return "ZoomedAddress.PNG";
   }
   
   public static String ResultImg()
   {
       return "DeCarta.PNG";
   }
   
   public static String DeCartaSearchResultImag()
   {
       return "ExpectSearchResultDeCarta.PNG";
   }
   
   public static String OrganisationStructurePageHeadingXpath()
   {
       return "//div/h5/span[text()='Manage organisation structure']";
   }
   
   public static String SearchAddressResultDropdownXpath(String address)
   {
       return "//ul[@class='typeahead dropdown-menu']/li/a[text()='"+address+"']";
   }
   
   public static String SpinnerXpath()
   {
       return "//div[@class='loading-overlay ng-scope'][@style='display: none;']";
   }
   
   public static String DBAdminPageSpinnerXpath()
   {
       return "//div[@fleet-loader='content']/div[@style='display: none;']";
   }
   
   public static String SecurityGroupSubmenuTextXpath()
   {
       return "//div[@id='sub-menu']//div/h5/span[text()='Security groups']";
   }
   
   public static String RolesSubmenuTextXpath()
   {
       return "//div[@id='sub-menu']//div/h5/span[text()='Roles']";
   }
   
   public static String UserSubmenuTextXpath()
   {
       return "//div[@id='sub-menu']//div/h5/span[text()='Users']";
   }
   
   public static String SpinnerLiveTrackingXpath()
   {
       return "//div[@class='tracking-search-container strong-grid mobitech-tracking']/div[@class='loading-overlay ng-scope'][contains(@style,'display: none')]";
   }
   
   public static String AddressSearchResultXpath()
   {
       return "//input[@placeholder='Enter address']/../div[@class='form-inline']/div";
   }
   
   public static String DropDownSelectedLanguageXpath()
   {
       return "//select[@ng-model='selectedLanguage.value']/option[@selected]";
   }
   
   public static String DropDownLanguageXpath()
   {
       return "//select[@ng-model='selectedLanguage.value']";
   }
   
   public static String GoogleMapImg()
   {
       return "GoogleMapStreet.PNG";
   }
   
   public static String ClickHereXpath()
   {
       return "//strong[text()='click here']/..";
   }
   
   public static String PersonalSettingsXpath()
   {
       return "//li/a[text()='Personal settings']";
   }
   
   public static String MenuDropdownListOpenXpath()
   {
       return "//li[@class='dropdown ng-scope open']";
   }
   
   public static String PersonalSettingsInputFieldFirstNameXpath()
   {
       return "//input[@name='firstName']";
   }
   
   public static String PersonalSettingsInputFieldUserNameXpath()
   {
       return "//div/label/span[text()='Username']/../span[@class='field-mandatory']/../../input[@ng-model='userAccount.userName']";
   }
   
   public static String PersonalSettingsInputFieldFirstNameRequiredXpath()
   {
       return "//div/label/span[text()='First Name']/../span[@class='field-mandatory']/../../input";
   }
   
   public static String RegionalSettingsTabXpath()
   {
       return "//li/a[text()='Regional settings']";
   }
   
   public static String RegionalSettingsCountryDropDownXpath()
   {
       return "//div[@class='control-group']/label/span[text()='Country']/../../select";
   }
   
   public static String SelectedRegionalSettingsCountryXpath()
   {
       return "//div[@class='control-group']/label/span[text()='Country']/../../select/option[@selected]";               
   }
   
   public static String PersonalSettingsInputFieldLastNameXpath()
   {
       return "//div/label/span[text()='Last Name']/../span[@class='field-mandatory']/../../input";
   }
   
   public static String PersonalSettingsInputFieldEmployerNameXpath()
   {
       return "//div/label/span[text()='Employer']/../span[@class='field-mandatory']/../../input";
   }
   
   public static String PersonalSettingsInputFieldHomeNumberXpath()
   {
       return "//div/label/span[text()='Home number']/../span/../../input";
   }
   
   public static String PersonalSettingsInputFieldMobileNumberXpath()
   {
       return "//div/label/span[text()='Mobile number']/../span/../../input";
   }
   
   public static String PersonalSettingsInputFieldWorkNumberXpath()
   {
       return "//div/label/span[text()='Work number']/../span/../../input";
   }
   
   public static String ButtonChangeUsernameXpath()
   {
       return "//a[text()='Change username']";
   }
   
   public static String ButtonChangePasswordXpath()
   {
       return "//a[text()='Change password']";
   }
   
   public static String googleStreet()
   {
       return "GoogleStreet.PNG";
   }
   
   public static String googleMapStreet()
   {
       return "GoogleMapStreet.PNG";
   }
   
   public static String GoogleMapMessageIMG()
   {
       return "JobMessageDeCartaMap2.PNG";
   }
   
   public static String plottedPoint()
   {
       return "plottedPoint.PNG";
   }
   
   public static String DefaultMapProviderXpath()
   {
       return "//div[contains(@ng-show,'defaultMapProvider')]";
   }
   
   public static String DefaultMapViewXpath()
   {
       return "//select[@name='defaultMapView']";
   }
   
   public static String CustomLayerTextBoxXpath()
   {
       return "//div/label/span[text()='Custom layers']/../../input";
   }
   
   public static String SelectedOptionXpath()
   {
       return "//select[@ng-model='selectedCountry.value']/option[@selected]";
   }
   
   public static String SelectCountryXpath()
   {
       return "//select[@ng-model='selectedCountry.value']";
   }
   
   public static String RegionalSettingsLanguageDropDownXpath()
   {
       return "//div[@class='control-group']/label[text()='Select language']/../select[@name='languageList']";
   }
   
   public static String OneAssetOnTheMapXpath()
   {
       return "//*[local-name()]/div[@class='leaflet-marker-pane']/div[1]/div/div/canvas";
   }
   
   public static String GreyvehicleImage1()
   {
       return "Vehicle.PNG";
   }
   public static String vehicleImage()
   {
       return "VehicleSmall.PNG";
   }
   public static String OrangevehicleImage1()
   {
       return "vehicle2.PNG";
   }
   
   public static String MapData_HereImg()
   {
       return "MapDataHere.PNG";
   }
   
   public static String ButtonRecordImg()
   {
       return "ButtonRecord.PNG";
   }
   
   public static String ButtonStartRecordingImg()
   {
       return "ButtonStartRecording.PNG";
   }
   
   public static String IEExtractValueDeCartaImg()
   {
       return "IEExtractValueDeCarta.PNG";
   }
   
   public static String IEStopRecordingImg()
   {
       return "IEStopRecordingNetWork.PNG";
   }
   
   public static String chooseNEtworkImg()
   {
       return "ChooseNetWork.PNG";
   }
   
   public static String NetworkOptionImg()
   {
       return "NEworkoption.PNG";
   }
   
   public static String getTextIEImg()
   {
       return "getTextIE.PNG";
   }
   
   public static String NetworkBarImg()
   {
       return "Networkbar.PNG";
   }
   
   public static String MaximizeNetworkbarImg()
   {
       return "MaximiziNetwork.PNG";
   }
   
   public static String NetworkClickedImg()
   {
       return "IENetworkAlreadyClicked.PNG";
   }
   
   public static String FirefoxNetworkBarImg()
   {
       return "firefoxnetworkBarOption.PNG";
   }
   
   public static String FirefoxseparateBarWindowImg()
   {
       return "firefoxseparateWindow.PNG";
   }
   
   public static String FireFoxExtractDeCartaImg()
   {
       return "FirefoxExtractDecarta.PNG";
   }
   
   public static String FFoxExtractDecartaImg()
   {
       return "FirefoxExtractDEcart.PNG";
   }
   
   public static String FirefoxButtonClearImg()
   {
       return "FirefoxButtonClearImg.PNG";
   }
   
   public static String firefoxMenuBarImg()
   {
       return "firefoxMenuBarImg.PNG";
   }
   
   public static String SelectOptionXpath(String option)
   {
       return "//select[@name='mapProvider']/option[text()='"+option+"']";
   }
   
   public static String ExtractGoogleNameImg()
   {
       return "GoogleExtractName.PNG";
   }
   
   public static String clickgoogleDetailImg()
   {
       return "clickgoogleDetails.PNG";
   }
   
   public static String GoogleNetworkDetailsImg()
   {
       return "GoogleNetworkDetails.PNG";
   }
   
   public static String clickHeaderImg()
   {
       return "clickHeader.PNG";
   }
   
   public static String ActionButtonAssetDetailsXpath()
   {
       return "//div[contains(@ng-show,'assetDetails')]//td[@class='actions']/div/a[@fleet-tooltip='Actions']";
   }
   
   public static String GoToAssetXpath()
   {
       return "SikuliDriverInstance.PressKey";
   }
   
   public static String LockOnAssetXpath()
   {
       return "SikuliDriverInstance.PressKey";
   }
   
   public static String PinNetworkAtTheBottomImg()
   {
       return "IEPinAtTheBottom.PNG";
   }
   
   public static String IENetworkAlreadyClicked()
   {
       return "IENetworkAlreadyClicked.PNG";
   }
   
   public static String IE11NetworkImg()
   {
       return "IE11NetworkImg.PNG";
   }
   
   public static String IE11NetworkIconImg()
   {
       return "IE11NetworkIconImg.PNG";
   }
   
   public static String IE11PlayImg()
   {
       return "IEPlayImg.PNG";
   } 
   
   public static String IE11MaximizeNetwork()
   {
       return "IE11MaximizeNetwork.PNG";
   }
   
   public static String DecartaPathChrome()
   {
       return "decartaPathChrome.png";
   }
   
   public static String chromeDecartaPath()
   {
       return "chromeDecartaPath.png";
   }
   
   public static String chromeFilterImage()
   {
       return "chromeFilterImage.PNG";
   }
   public static String FilterNameInChromeImage()
   {
       return "FilterNameInChrome.PNG";
   }
   
   public static String chromeDockRightGrey()
   {
       return "DockRightChromeGrey.png";
   }
   public static String chromeDockRightBlue()
   {
       return "DockRightChromeBlue.png";
   }
    public static String firefoxgoogle()
   {
       return "firefoxGoogleSearchText.png";
   }
   public static String googlePathChrome()
   {
       return "googleProviderText.png";
   }
   
   public static String MeasurementSettingsLinkTabXpath()
   {
       return "//ul/li/a[text()='Measurement settings']";
   }
   
   public static String LanguageDropDownXpath()
   {
       return "//select[@name='languageCode']";
   }
   
   public static String TimeZoneDropDownXpath()
   {
       return "//label/span[text()='Timezone']/../../select[@name='timeZone']";
   }
   
   public static String BaseCurrencyDropDownXpath()
   {
       return "//label/span[text()='Base Currency']/../../select";
   }
   
   public static String FormatDropDownXpath()
   {
       return "//select[@name='locale']";
   }
   
   public static String MeasurementUnitDropDownXpath()
   {
       return "//select[@name='measurementType']";
   }
   
   public static String ConsumptionTypeDropDownXpath()
   {
       return "//select[@name='consumptionType']";
   }
   
   public static String DateTimeNumberFormatXpath()
   {
       return "//div[@ng-show='getSelectedLocale()']";
   }
   
   public static String FormatOptionXpath(String CountryName)
   {
       return "//select[@name='locale']/option[text()='"+CountryName+"']";
   }
   
   
   public static String HighlightRSOXpath()
   {
       return "//li/div/div/a/strong[text()='Test RSO']/../../.";
   }
   
   public static String HighlightRSOXpath(String DVTRSO)
   {
       return "//li/div/div/a/strong[contains(text(),'"+DVTRSO+"')]/../../.";
   }
   
   //li/div/div/a/strong[contains(text(),'DVT  Only')]/../../.
   
   public static String ButtonAddRSO_OrganizationXpath()
   {
       return "//a[@fleet-tooltip='Add']";
   }
   
   public static String AddDealerOptionXpath()
   {
       return "//ul[contains(@ng-show,'canAdd')]/li/a[text()='Dealer']";
   }
   
   public static String DealerNameTextBoxXpath()
   {
       return "//input[@name='dealerName']";
   }
   
   public static String ContactNameTextBoxXpath()
   {
       return "//input[@name='contactName']";
   }
   
   public static String ContactNumberTextBoxXpath()
   {
       return "//input[@name='contactNumber']";
   }
   
   public static String DealerIDTextBoxXpath()
   {
       return "//input[@name='fmDealerId']";
   }
   
   public static String ContactEmailAddressTextBoxXpath()
   {
       return "//input[@name='contactEmail']";
   }
   
   public static String ButtonSaveDealerXpath()
   {
       return "//button[text()='Save']";
   }
   
   public static String MultiLevelCreatedSuccessfulllyMsgXpath()
   {
       return "//span[text()='Multi-level organisation created successfully']";
   }
   
   public static String NewlyAddedDealerXpath(String dealerName)
   {
       return "//div/a/strong[text()='"+dealerName+"']";
   }
   
   public static String IconRemoveDealerXpath(String dealerName)
   {
       return "//div/a/strong[text()='"+dealerName+"']/../..//a[@fleet-tooltip='Remove']/i";
   }
   
   public static String RemoveDealerPopUpMsgXpath(String dealerName)
   {
       return "//p[text()='Are you sure you want to remove ']/strong[text()='"+dealerName+"']";
   }
   
   public static String ButtonRemoveXpath()
   {
       return "//button[text()='Remove']";
   }
   
   public static String DealerRemovedMsgXpath()
   {
       return "//span[text()='Dealer removed successfully']";
   }
   
   public static String rolesPageHeaderXpath()
   {
        return"//h5//a[text()='Roles']";
   }
   
   
   public static String PageHeaderXpath()
   {
       return "//div[@class='page-header']/h5";
   }
   //<div Add Organisation //DMF-1100:Usability
   
   //Mix-Stellenbosch Page
   public static String DatabaseAdminNameXpath(){
       return "//h5/a[text()='Database administration']";
   }
   
   public static String EditMultiLevelOrgNameXpath(){
       return "//h5/span[text()='Edit multi-level organisation: ']";
   }
   
   public static String DetailTabXpath(){
       return "//li/a[@ng-click='changeTab(tab)'][text()='Details']";
   }
   
   public static String DetailGridHeaderNameXpath(){
       return "//div/h5[text()='Details']";
   }
   
   public static String EnableForCubesNameXpath(){
       return "//div/span[text()='Enable for cubes']";
   }
   
   public static String NameXpath(){
       return "//div//span[text()='Name']";
   }
   public static String InputMultiOrgNameMixXpath(){
       return "//div[@class='input']/input[@name='multiOrgName']";
   }
   
   public static String ErrorMessageXpath(){
       return "//div/span[text()='This field is required']";
   }
   
   public static String ButtonInNewOrganisationXpath(){
       return "//button[@class='btn ng-scope ng-binding btn-wide btn-success'][text()='Save']";
   }
   
   //Pop Up Message Box
   
   public static String ChangesNotSavedHeadingXpath(){
       return "//div/h5[text()='Changes not saved']";
   }
   
   public static String AreYouSureMessageXpath(){
       return "//div[text()='Are you sure you would like to discard your changes?']";
   }
   
   public static String NoInPoUpXpath(){
       return "//button[text()='No']";
   }
   
   public static String YesInPopUpXpath(){
       return "//button[text()='Yes']";
   }
   
   public static String HighLightMixStellenBoschXpath(){
       return "//strong[text()='Mix-Stellenbosch']/../../.";
   }
   
   public static String AddOrgButtonXpath(){
       //return "//div/a/i[@class='icon-plus icon-white']";
       return "//i[@class='icon-plus icon-white']";
   }
   
   public static String OrganisationLinkXpath(){
       return "//a[@ng-click='add(groupType)'][text()='Organisation']";
   }
   
   public static String ButtonSaveInNewOrganisationXpath(){
       return "//button[@class='btn ng-scope ng-binding btn-wide btn-success'][text()='Save']";
   }
   //DMF-1156
   

   
   public static String SelectMultiLevelLinkXpath(){
       
       return "//a[@ng-click='add(groupType)'][text()='Multi-level organisation']";
   }
   
    public static String InputMultiXpath(){
       return "//div/input[@name='multiOrgName']";
   }
   
   public static String MultiLevelOrganisationLintXpath(){
       return "//a[@ng-click='add(groupType)'][text()='Multi-level organisation']";
   }
   
   public static String GridHeaderForAddMultiLevelOrganisation(){
       return "//h5/span[text()='Add multi-level organisation']";
   }
   
   
    public static String DelearSuccessfullyCreatedXpath(){
       return "//span[@id='pop-alert-message'][text()='Dealer created successfully']";
   }
   public static String MultiLevelSuccessfullyCreatedXpath(){
       return "//span[@id='pop-alert-message'][text()='Multi-level organisation created successfully']";
   }
   
   public static String ManageUserRolesLinkXpath(){
       return "//li/a[text()='Roles']";
   }
   
   public static String AddRoleButtonXpath(){
       return "//a//i[contains(@class, 'icon-plus')]";
   }
   
   public static String InputRoleNameXpath(){
       return "//input[@type='text'][@name='roleName']/../input";
   }
   
   public static String SelectProfileDropdownXpath(){
       return "//select";
   }
   
  public static String SelectRolesDropdownXpath(String text){
       return "//label[text()='"+text+"']/../..//select";
   }
   public static String DropdownRolesXpath(){
       return "//div/select[@ng-model='selectedRoleId']";
   }
   
   public static String DropdownProfileXpath(){
       return "//span[text()='Profile']/../..//select";
   }
   public static String HighLightMultilevelOrgXpath(){
       return "//a[@class='tree-item']/span[text()='DVT CapeTown Multi-LevelOrganisation']/..";
   }
 
    public static String MultiLevelOrgIsHighlightedXpath(){
       return "//div[@class='tree-item-content']/div/a/strong[text()='DVT CapeTown Multi-LevelOrganisation']/../..";
   }
   
   public static String MoveTomultiLevelXpath(){
       return "//a[@class='tree-item']/span[text()='DVT CapeTown Multi-LevelOrganisation']/..";
   }
   public static String MakeAvailableButtonXpath(String text){
       return "//a[text()='"+text+"']";
   }
   
   public static String ButtonOKXpath(){
       return "//button[@class='btn ng-scope ng-binding btn-wide btn-success'][text()='OK']";
   }
   public static String ExpandMixTelematicsXpath(){
       return "//a[@class='tree-item']//span[text()='MiX Telematics']/../../../..//span[contains(@class, 'icon-plus')]";
   }
   
   public static String ExpandTestRSOGroupXpath(){
       return "//a[@class='tree-item']//span[text()='Test RSO']/../../../..//span[contains(@class, 'icon-plus')]";
   }
   public static String ButtonNextXpath(){
       return "//button[text()='Next']";
   }
   
   public static String RoleSuccessFullyCreatedPopUpXpath(){
       return "//span[@id='pop-alert-message'][text()='Role created successfully']";
   }
   
   public static String UpdatedRoleSuccessFullyPopUpXpath(){
       return "//span[@id='pop-alert-message'][text()='Role updated successfully']";
   }
   public static String AddPermissiongeneralXpath(){
       return "//h5[text()='General']/..//i";
   }
   

   public static String SelectMixTelematicsXpath(){
       return "//span[text()='MiX Telematics']/../../a[@class='ng-scope']";
   }
   public static String SelectAccessXpath(){
       //return "//td[text()='"+text+"']/..//input[not(@disabled='disabled')]";
       return "//div//input[@class='pull-left mr-1']/../span[text()='Access']/../input";
       
   }
   public static String AdddButtonXpath(){
       return "//a//i[contains(@class, 'icon-plus')]";
   }
   

   public static String SecurityGroupNameXpath(){
       return "//span[text()='Group name']/../..//input";
   }
   
    public static String SecurityGroupNameTextBoxXpath(){
       return "//span[text()='Group name']/../..//input";
   }
   
    public static String SelectOrganisationGroupXpath(){
        return "//a/span[@ng-show='selectedOrganisations.any()']/..";
    }
    
    public static String SelectOrganisationGroupMultiLeveOrgaXpath(){
       return "//div/a/span[text()='DVT CapeTown Multi-LevelOrganisation']";
   }
    
    //Select what this Security group has acces to
    public static String SelectSecurityGroupMultiLevelXpath(){
       return "//div/a[@class='ng-scope']/span[text()='DVT CapeTown Multi-LevelOrganisation']";
   
    }
    
    public static String ButtonSelectXapth(String text){
        return "//a[text()='"+text+"']";
   }
   
    public static String SecurityGroupSuccessfullyCreatedPopUpXpath(){
        return "//span[@id='pop-alert-message'][text()='Security group created successfully']";
    }
    
    public static String SecurityGroupSuccessfullyUpdatedPopUpXpath(){
        return "//span[@id='pop-alert-message'][text()='Security group updated successfully']";
    }
    
    public static String UserSuccessfullyCreatedPopUpXpath(){
        return "//span[@id='pop-alert-message'][text()='User created successfully']";
    }
    public static String UserSuccessfullyUpdatedPopUpXpath(){
        return "//span[@id='pop-alert-message'][text()='User updated successfully']";
    }
    
    //span[@id='pop-alert-message'][text()='Security group updated successfully']
    public static String AddPermissionXpath(String text){
        return "//div/a[text()='"+text+"']";
    }
    
    public static String AddPermissionTextXpath(String text){
       return "//h5[text()='"+text+"']/..//i";
   }
    
    public static String FirstNameTextBoxXpath(){
       return "//input[@type='text'][@name='firstName']/../input";
   }
    
    public static String LastNameTextBoxXpath(){
       return "//input[@type='text'][@name='lastName']/../input";
   }
    
    public static String UserNameTextBoxXpath(){
       return "//input[@type='text'][@name='userName']/../input";
   }
    
    public static String EmployerTextBoxXpath(){
       return "//input[@type='text'][@name='employer']/../input";
   }
    
    public static String SelectGroupButtonXpath(){
       return "//a[text()='Select group']";
   }
    
    public static String FilterTextBoxXpath(){
        return "//input[@placeholder='Filter']";
    }
    public static String UserNameCheckBoxXpath(){
        return "//div[@class='fleet-grid full-height selection']/table//tr[@class='light-blue']/th/input";
    }
    public static String UserSecurityGroupCheckedXpath(){
      return "//th/span[text()='Security group']/../../../../tbody/tr/td/input[@type='checkbox']";  
    }
    
    public static String UserSelectSecurityGroupXpath(){
        return "//button[text()='Select']";
    }
    
    public static String DealerNameOrganisationGroupXpath(){
        return "//td/div/a/span[text()='DVT CapeTown Dealer']";
    }
    public static String RoleDetailsLabelXpath(){
        return "//div//..//legend[text()='Role details']";
    }
   public static String AddOrganizationOptionXpath()
   {
       return "//ul[contains(@ng-show,'canAdd')]/li/a[text()='Organization']";
   }
   
   public static String AddOrganizationPopUpBoxXpath()
   {
       return "//h5/span[text()='Create new organization']";
   }
   
   public static String OrganizationDisplayNameTextBoxXpath()
   {
       return "//input[@name='legalEntityName']";
   }
   
   public static String OrganizationDatabaseNameTextBoxXpath()
   {
       return "//input[@name='databaseName']";
   }
   
   public static String OrganizationBeingCreatedAlertMsgXpath()
   {
       return "//span[text()='The organisation is being created. You will receive an email notifying you when the organisation is active.']";
   }
   
   public static String RoleUpdatedSuccessfullyAlertMsgXpath()
   {
       return "//span[text()='Role updated successfully']";
   }
   
   public static String RoleNameTextBoxXpath()
   {
       return "//input[@name='roleName']";
   }
   
   public static String ButtonMakeAvailableXpath()
   {
       return "//a[text()='Make available']";
   }
   
   public static String SelectButtonXpath(){
      return "//h5[text()='Select what this security group has access to']//..//..//..//div/a[text()='Select'] ";
   }
   
   public static String SelectButtonUserXpath(){
      return "//h5[text()='Select what this user has access to']//..//..//..//div/a[text()='Select']";
   }
   
   
   public static String ExpandIconTopLevelGroupXpath()
   {
       return "//ul/li/span";
   }
   
   public static String ExpandTestRSOXpath()
   {
       return "//ul/li[10]/span";
   }
   
    public static String ExpandOrganisationGroupTestRSOXpath()
   {
       return "//ul/li/span/../div[@class='tree-item-content']//div//a/span[text()='Test RSO']/../../../../span";
   }
   
   
   public static String HighlightNewlyCreatedSalesGroupXpath(String OrganizationGroup)
   {
       return "//div[@options='options']/div/a/span[text()='"+OrganizationGroup+"']/../../..";
   }
  
   
   public static String ButtonSaveRoleXpath()
   {
       return "//div/button[text()='Save']";
   }
   public static String SecurityGroupLinkXpath(){
       return "//ul/li/a[text()='Security groups']";

   }
   public static String LoadingSpinnerXpath()
   {
       return "//div[@fleet-loader='content'][@class='row-fluid']/div[contains(@style,'display: none;')]";
   }
   
   public static String HighlightedOrganizationXpath(String OrganizationGroup)
   {
       return "//div/a[@class='tree-item selected']/span[text()='"+OrganizationGroup+"']";
   }
   
   public static String NoOfSelectedOrganizationXpath()
   {
       return "//div/a/span[text()='MiX Telematics']/../span/i/..";
   }
   
   public static String SelectedRSONameXpath()
   {
       return "//div/a[@class='tree-item selected']/span/i/..";
   }
   
   public static String RSOIsSelectedXpath(String OrganizationGroup)
   {
       return "//div/a[@class='tree-item selected']/span[text()='"+OrganizationGroup+"']";
   }
   
   public static String PermissionsTabLinkXpath()
   {
       return "//ul/li/a[text()='Permissions']";
   }
   
   public static String OrganizationGroupPermissionGridXpath(String OrganizationGroup)
   {
       return "//div/a/span[text()='"+OrganizationGroup+"']";
   }
   
   public static String UserUpdatedSuccessfullyAlertMsgXpath()
   {
       //return "//span[text()='User updated successfully']";
       return "//div[@style='display: none;']/div/span[@id='pop-alert-message']";
   }
   public static String UserSaveMessage()
   {
     
       return "//span[text()='User updated successfully']";
   }
   public static String UsernameColumn()
   {
       
       return "//th[@column-field='userName']/span[text()='Username']";
   }
   public static String NameColumn()
   {
       
       return "//th/span[text()='Name']";
   }
   public static String SecurityGroupColumn()
   {
       
       return "//th/span[text()='Security group']";
   }
   
   public static String RoleLinkTextXpath()
   {
       return "//ul/li/a[text()='Roles']";
   }
   
   public static String RolesColumnChooserXpath()
   {
       return "//div/ul/li/a/i[@class='icon-choose-columns']";
   }
   
   public static String SearchFilterTextBoxXpath()
   {
       return "//input[@placeholder='Filter']";
   }
   
   public static String RoleNameXpath(String RoleName)
   {
       return "//td/div/a/span[text()='"+RoleName+"']/..";
   }
   
   public static String ButtonAddRoleXpath()
   {
       return "//div/span/a[@fleet-tooltip='Add role']";
   }
   
   public static String ButtonReportXpath()
   {
       return "//div/a[@fleet-tooltip='Reports'][@disabled='disabled']";
   }
   
   public static String RoleProfileDropDownXpath()
   {
       return "//div[@class='control-group']/select";
   }
   
   public static String UsersSelectedPermissionsXpath(String organization)
   {
       return "//td/div/a/span[text()='"+organization+"']/..";
   }
   
   public static String SelectOrganizationGroupsPopUpXpath()
   {
       return "//div[@aria-hidden='false'][@name='selectGroupsModal']//span[text()='Select organisation groups']";
   }
   
   public static String SelectOrganizationGroupsPopUpClosedXpath()
   {
       return "//div[@aria-hidden='true'][@name='selectGroupsModal']//span[text()='Select organisation groups']";
   }
   
   public static String ButtonOkSelectOrganizationGroupXpath()
   {
       return "//div[@name='selectGroupsModal']//button[text()='OK']";
   }
   
   public static String ButtonAddRSOXpath()
   {
       return "//div[@class='btn-group']/a[@fleet-tooltip='Add']/i/..";
   }
   
   public static String ButtonActivateDisabledXpath()
   {
       return "//a[@fleet-tooltip='Activate'][@disabled='disabled']/i/..";
   }
   
   public static String HightlightOrganaisationXpath(String organisation)
   {
       return "//div[@options='options']/div[@mapping='mapping']/a/strong[text()='"+organisation+"']/../..";
   }
   //
   public static String HighlightDeactivateByRequestOrgXpath()
   {
       return "//li/div/div/a/strong[text()='Copy of DynaMiX Test Units 2015']/../../div/div[text()='Deactivated (by request)']/../..";
   }
   //
   public static String HighlightDeactivateOrgByRequestOrgXpath()
   {
       return "//li/div/div/a/strong[text()='Compass (Locate)']/../../div/div[text()='Deactivated (unknown reason)']/../..";
   }
   
   public static String ButtonDeActivateDisabledXpath()
   {
       return "//a[@fleet-tooltip='Deactivate'][@disabled='disabled']/i/..";
   }
   
   public static String ButtonMigrateDisabledXpath()
   {
       return "//a[@fleet-tooltip='Migrate'][@class='btn btn-small disabled']/i/..";
   }
   
   public static String HighlightMiXTelematicsDataCenterXpath()
   {
       return "//li/div/div/a/strong[text()='MiX Telematics']/../../.";
   }
   
   public static String HighlightTestRSOXpath()
   {
       return "//li/div/div/a/strong[text()='Test RSO']/../..";
   }
   
   public static String AddRegionalSalesOrganizationXpath()
   {
       return "//ul/li/a[@ng-click='add(groupType)']";
   }
   
   public static String RSONameTextBoxNameXpath()
   {
       return "//input[@name='rsoName']";
   }
   
   public static String RSOCreatedSuccessfullyAlertMsgXpath()
   {
       return "//span[text()='Regional Sales Organisation created successfully']";
   }
   
   public static String removeSecurityGroupXXpath(){
       return "//div[text()='DVTCapeTownAutomationSecurityGroups DO Not Delete ']/a";
   }

   
   public static String removeXSecurityGroupXpath(){
       return "//div[text()='RemoveMLOSecurityGroups DO NOT DELETE ']/a";
   }
    //div[text()='RemoveMLOSecurityGroups DO NOT DELETE ']/a
   public static String ManageOrganizationStructureXpath()
   {
       return "//span[text()='Manage organisation structure']";
   }
   
   public static String NewlyAddedRSOXpath(String RSOName)
   {
       return "//div/a/strong[text()='"+RSOName+"']";
   }
   
   public static String SecurityGroupBreadCrumbSearchBox()
   {
       return "//div[@aria-hidden='false']//div[@class='pull-right']/input";
   }
   
   public static String SearchIconGroupBreadCrumbXpath()
   {
       return "//div[@class='miller-selector-modal-container white-box-shadow ng-scope in']//a[@class='btn btn-small btn-filter']";
   }
   
   
    public static String SmallbreadFilterXpath() 
    {
        return "//div[@class='miller-selector-modal-container white-box-shadow ng-scope in']//../input ";
    } 
   public static String ClickOrganizationNameBreadCrumbXpath(String RSOName)
   {
       return "//div[@aria-hidden='false']//div/a/span[@ui-if][text()='"+RSOName+"']";
   }
   
   public static String ButtonSelectSecurityGroupAccessXpath()
   {
       return "//div[@aria-hidden='false']/div[@class='menu-footer']//a[text()='Select']";
   }
    public static String MeasurementUnitsDropdownListXpath()
   {
       return "//div[@class='control-group']/label/span[text()='Measurement units']/../../select";
   }
    public static String FormatDropdownListXpath()
   {
       return "//div[@class='control-group']/label/span[text()='Format']/../../select";
   }
    
    public static String RegionalSettinsSpinnerXpath()
    {
        return "//div[@fleet-loader='content']//form[@name='regionalSettingsForm']/../../../../../../../div[@ng-show='contentLoadingStack && contentLoadingStack.length > 0'][contains(@style,'display: none;')]";
    }
     public static String PersonalDetailsTabSelectedXpath()
   {
       return "//li[@selected]/a[text()='Personal details']";
   }
    public static String ConsumptionDropdownListXpath()
   {
       return "//div[@class='control-group']/label/span[text()='Consumption']/../../select";
   }
   
   public static String SelectLangugageDropdownListXpath()
   {
       return "//div[@class='control-group']/label[text()='Select language']/../select";
   }
     public static String UserSettingsUpdatedNotificationXpath()
   {
       return "//div/span[text()='User settings updated successfully']";
   }
   public static String DateTimeNumberFormatLabelXpath()
   {
       return "//div[contains(@class,'control-group')]/div/..";
   }
   
   public static String DateTimeFormatLabelXpath()
   {
       return "//div[contains(@class,'control-group')]/div";
   }
   
   public static String TimeZoneDropdownListXpath()
   {
       return "//div[@class='control-group']/label/span[text()='Timezone']/../../select";
   }
   public static String ButtonCancelSecurityGroupAccessXpath()
   {
       return "//div[@aria-hidden='false']/div[@class='menu-footer']//a[text()='Cancel']";
   }
   
//    public static String ButtonSelectUserAccessXpath()
//   {
//       return "//div[@aria-hidden='false']/div[@class='menu-footer']//a[text()='Select']";
//   }
   public static String RolesDropDownListXpath()
   {
       return "//div/select[@name='selectedRoleId']";
   }
   
   public static String DropDownListRoleByXpath()
    {
        return "//select[@ng-model='selectedRoleId']";
    }
   
   public static String RoleDropDownOptionXpath(String RoleName)
   {
       return "//select[@name='selectedRoleId']/option[text()='"+RoleName+"']";
   }
   public static String profileOptionXpath()
   {
       return "//select/option";
   }
   
   public static String SecurtiyGroupUpdatedAlertMsgXpath()
   {
       return "//span[text()='Security group updated successfully']";
   }
   
   public static String UsersLinkTextXpath()
   {
       return "//ul/li/a[text()='Users']";
   }
   
   public static String ButtonAddUserXpath()
   {
       return "//a[@fleet-tooltip='Add user']/i/..";
   }
   
   public static String UsersNameLinkTextXpath(String UsersName)
   {
       return "//td/div/a/span[text()='"+UsersName+"']/..";
   }
   
   public static String UserFirstNameTextBoxXpath()
   {
       return "//input[@name='firstName']";
   }
   
   public static String RemoveSecurityGroupFromUserIconXpath(String securityGroup)
   {
       return "//div[text()='"+securityGroup+" ']/a";
   }
   
   public static String UserLastNameTextBoxXpath()
   {
       return "//input[@name='lastName']";
   }
   
   public static String ButtonSelectGroupXpath()
   {
       return "//a[text()='Select group']";
   }
   
   public static String SelectSecurityGroupsForUserPopUpWindowXpath()
   {
       return "//div[@aria-hidden='false']//h5/span[text()='Select security groups for user']";
   }
   
   public static String SelectSecurityGroupForUserSearchBox()
   {
       return "//form/div/input";
   }
   
   public static String checkBoxSelectSecurityGroupXpath()
   {
       return "//tr/td/input[@type='checkbox']";
   }
   
   public static String SecuirtyGroupNameForUserSearchResultXpath(String securityGroupName)
   {
       return "//tr/td[@column-field='name']/div/span[text()='"+securityGroupName+"']";
   }
   
   public static String ButtonSelectXpath()
   {
       return "//div[@class='modal-footer']/button[text()='Select']";
   }
   
   public static String SecurityGroupAttachedToUserXpath()
   {
       return "//div[@class='text-tags']/div/div";
   }
   
   public static String ButtonAddPermissionXpath()
   {
       return "//button[text()='Add permissions']";
   }
   
   public static String SelectWhatThisUserHasAccessToXpath()
   {
       return "//div[@aria-hidden='false']//h5[text()='Select what this user has access to']";
   }
   
   public static String ButtonSelectUserAccessXpath()
   {
       return "//div[@aria-hidden='false']//a[text()='Select']";
   }
   
   public static String UserRolesDropDownXpath()
   {
       return "//form/div//select[@ng-model='selectedRoleId']";
   }
   
   public static String UserRoleDropDownOptionXpath(String RoleName)
   {
       return "//select[@ng-model='selectedRoleId']/option[text()='"+RoleName+"']";
   }
   
   public static String ActionButtonXpath()
   {
       return "//a[@fleet-tooltip='Actions']";
   }
   
   public static String BreadCrumbXpath()
   {
       return "//div[@class='miller-selector']/a/span/..";
   }
   public static String breadcrumbOrgXpath()
   {
       return "//a[@class='ng-scope active selected']//span[text()]";
   }
   
   public static String ButtonLogOutXpath()
   {
       return "//i[@class='icon-main-logout']";
       //return "//li/a[@fleet-tooltip='Log out']/i/..";
   }
   
   public static String ValidatePageLoggedOutXpath()
   {
       return "//li[@class='open']/a/i[@class='icon-main-logout']";
   }
   
   public String ButtonLogoutByXpath()
   {
       return "//i[@class='icon-main-logout']";
   }
   
   public static String ButtonCancelTestUserXpath()
   {
       return "//div[@class='menu-footer']//a[text()='Cancel']";
   }
   
   public static String HighlightNewlyCreatedRSOXpath(String RSOName)
   {
       return "//li/div/div/a/strong[text()='"+RSOName+"']/../../.";
   }
   
   public static String RemoveRSOIconXpath(String RSOName)
   {
       return "//li/div/div/a/strong[text()='"+RSOName+"']/../.././a/i[@class='icon-red icon-remove-sign']/..";
   }
   
   public static String RemoveRSOPopUpXpath()
   {
       return "//div[@header-title='Remove Regional Sales Organisation'][@aria-hidden='false']";
   }
   
   public static String ButtonRemoveRSOXpath()
   {
       return "//div[@header-title='Remove Regional Sales Organisation'][@aria-hidden='false']//button[text()='Remove']";
   }
   
   
    public static String RemoveMultiLevelPopUpXpath()
   {
       return "//div[@header-title='Remove Multi-level organisation'][@aria-hidden='false']";
   }
   
   public static String ButtonRemoveMultiLevelXpath()
   {
       return "//div[@aria-hidden='false']//button[text()='Remove']";
   }

   public static String RSORemovedSuccessfullyAlertMsgXpath()
   {
       return "//span[text()='Regional Sales Organisation removed successfully']";

   }

   //multi Level
    public static String MultiLevelRemovedSuccessfullyAlertMsgXpath()
   {
       return "//span[text()='Multi-level organisation removed successfully']";

   }
   
    //select org groups modal
    public static String orgGroupModalXpath()
    {
        return"//h5//span[text()='Select organisation groups']";
    }
    //select organisation 
    public static String organisationXpath()
    {
        return"//div[@item='item']//a//span[text()='MiX Telematics']";
    }
   
    //select org groups modal
    public static String OkNextCancelButtonXpath(String text)
    {
        return"//button[text()='"+text+"']";
    }
   
   public static String SecurityGroupPermissionsTableData(String RSOName)
   {
       return "//td[@column-field='name']/div/a/span[text()='"+RSOName+"']/..";
   }
   public static String securityGroupPermissionsheadingDataXpath()
   {
       return "(//div[@class='span12']//h5[text()])[2]";
   }
   
   public static String IconRemoveRoleXpath()
   {
       return "//a[@class='ng-scope grid-clickable-icon-cell']/span[@class='icon-remove-sign icon-red']/..";
   }
   
   public static String IconRemoveMultiLevelXpath()
   {
       return "//div[@class='tree-item-content']//a/strong[text()='DVT CapeTown Multi-LevelOrganisation']//..//../a/i[@class='icon-red icon-remove-sign']";
   }
   public static String IconEnableFleetAdminXpath()
   {
       return "//a[@fleet-tooltip='Enable Fleet Admin']/i[@class='icon-ok-circle']/..";
   }
   
   public static String CheckBoxAccessXpath()
   {
       return "//form[@name='rolePermissionsForm']/div/label/input[contains(@fleet-tristate-checkbox,'Access')]";
   }
   
   public static String HighlightMiXTelematicsXpath()
   {
       return "//li/div/div/a/span[text()='MiX Telematics']/../../.";
   }
   
   public static String ListOpenXpath()
   {
       return "//li[@class='dropdown ng-scope open']";
   }
   
   public static String ListNotOpenXpath()
   {
       return "//li[@class='dropdown ng-scope']";
   }

   public static String SpinnerPermissionPageXpath()
   {
       return "//div[@fleet-loader='content' and @class='row-fluid']/div/div/div[@ng-show='contentLoadingStack && contentLoadingStack.length > 0' and @style='display: none;']";
       //return "//div[@fleet-loader=\'content\' and @class=\'row-fluid\']//div[@ng-show=\'contentLoadingStack && contentLoadingStack.length > 0\' and @style='display: none;']";
   }
   public static String SpinnerManageOrganisationPageXpath()
   {
       return "//div[@class='white-box-shadow full-height container-right span12']/div[@class='loading-overlay ng-scope'][@style='display: none;']";
   } 
   public static String PageSpinnerXpath()
   {
       return "//div[@fleet-loader='page']//div[@ng-show='pageLoadingStack && pageLoadingStack.length > 0' and @style='display: none;']";
   }
   
   public static String EditUserHeadingTextXpath()
   {
       return "//span[text()='Edit user:']";
   }
   
   public static String UserPermissionHeadingTextXpath()
   {
       return "//h5[text()='User permissions']";
   }
   
   public static String UserPermissionMiXTelematicsHeadingTextXpath()
   {
       return "//h5[text()='User permissions for MiX Telematics']";
   }
   public static String UserPermissionHeadingTextXpath(String text)
   {
       return "//h5[text()='User permissions for "+text+"']";
   }
   
   
   public static String ActiveLinkTextXpath()
   {
       return "//a/span[text()='Active']";
   }
   public static String activeButtonTextXpath()
   {
       return "//div//span[@ng-hide='statusOptions']";
   }
   
   public static String PersonalDetailsTabXpath()
   {
       return "//li[@selected='selected']/a[text()='Personal details']";
   }
   
    
   //Pop Up Message Box
   
   public static String ChangesNotSavedHeadingXpath(String text){
       return "//div/h5[text()='"+text+"']";
   }
   
   public static String AreYouSureMessageXpath(String text){
       return "//div[text()='"+text+"']";
   }
   
   public static String NoInPoUpXpath(String text){
       return "//button[text()='"+text+"']";
   }
   
   public static String YesInPopUpXpath(String text){
       return "//button[text()='"+text+"']";
   }
   //organisation settings
   
    public static String selectTabXpath(String tabName)
     {
       return "//a[text()='"+tabName+"']";
     }
    public static String PageSectionheadersXpath(String tabName)
     {
       return "//h6[text()='"+tabName+"']";
     }  
    public static String secondsForTextBoxXpath()
     {
       return "//input[@name='activeTrackingFrequency']";
     }
    public static String MinutesTextBoxXpath()
     {
       return "//input[@name='activeTrackingDuration']";
     }
    public static String MinuteForTextBoxXpath()
     {
       return "//input[@name='activeTrackingSatFrequency']";
     }
     public static String MinuteDurationTextBoxXpath()
     {
       return "//input[@name='activeTrackingSatDuration']";
     }
     public static String OrganisationSettingsEditXpath(String settText)
     {
       return "//h5/span[text()='"+settText+"']";
     }
    public static String errorDiv1SpanXpath(String errorText)
     {
       return "//div[1]/span[text()='"+errorText+"']";
     }
     public static String errorDiv2SpanXpath(String errorText)
     {
       return "//div[2]/span[text()='"+errorText+"']";
     }
    public static String saveButtonXpath()
     {
       return "//button[@text='Save']";
     }
    public static String cancelButtonXpath()
     {
       return "//button[@text='Cancel']";
     }
    public static String ButtonXpath(String Text)
     {
       return "//button[text()='"+Text+"']";
     }
    public static String tabHeaderXpath(String Text)
     {
       return "//form/h5[text()='"+Text+"']";
     }
    public static String homePageAssetsHeaderXpath()
     {
       return "//span[text()='Assets']";
     }  
    public static String spanTextXpath(String Text)
     {
       return "//span[text()='"+Text+"']";
     } 
    public static String successfulXpath()
     {
       return "//span[@id ='pop-alert-message']";
     }
    public static String ParagraphXpath()
     {
       return "//form/p[text()='Esethay optionsway illway applyway enwhay ackingtray assetsway onway ethay apmay inway Ivelay ackingtray']";
     }
    public static String InitiateAciveParagraphXpath()
     {
       return "//span[text()='Enwhay initiatingway activeway ackingtray, increaseway ethay ositionpay equencyfray otay everyway']";
     } 
     public static String InitiateAciveViaSatelliteParagraphXpath()
     {
       return "//span[text()='Enwhay initiatingway activeway ackingtray (iavay Atellitesay), increaseway ethay ositionpay equencyfray otay everyway']";
     }
    public static String homePageSpinnerXpath()
     {
       return "//div[@class='loading-overlay ng-scope'][contains(@style, 'display: none')]";
     }
     public static String ActiveViaSatelliteSpinnerXpath()
     {
       return "//div[@class='loading-overlay ng-scope'][@style='display: none;']";
     }
     
     public static String RSONameToBeRemoved(String RsoName)
     {
         return "//li/div[1]/div/a/strong[contains(text(),'"+RsoName+"')]";
     }
     
     public static String RSONameToRemove(String RsoName)
     {
         return "//li/div[1]/div/a/strong[contains(text(),'"+RsoName+"')]/../../a/i[@class='icon-red icon-remove-sign']";
     }
     
    //<editor-fold defaultstate="collapsed" desc="Regional settings Required field"> 
     
        public static String RegionalSettingsCountryRequiredFieldXpath()
        {
            return "//div/label/span[text()='Country']/../span[@class='field-mandatory']/../../select";
        }
        
        public static String RegionalSettingsTimezoneRequiredFieldXpath()
        {
            return "//div/label/span[text()='Timezone']/../span[@class='field-mandatory']/../../select";
        }
        
        public static String RegionalSettingsFormatRequiredFieldXpath()
        {
            return "//div/label/span[text()='Format']/../span[@class='field-mandatory']/../../select";
        }
        
        public static String RegionalSettingsMeasurementUnitsFieldXpath()
        {
            return "//div/label/span[text()='Measurement units']/../span[@class='field-mandatory']/../../select";
        }
        
        public static String RegionalSettingsConsumptionRequiredFieldXpath()
        {
            return "//div/label/span[text()='Consumption']/../span[@class='field-mandatory']/../../select";
        }
        
             
     //</editor-fold>
        
    //<editor-fold defaultstate="collapsed" desc="(Personal Details)Validate Change UserName">    
        public static String ChangeUserNamePopUpXpath()
        {
            return "//div[@name='changeUsernameModal'][@aria-hidden='false']//h5/span[text()='Change username']";
        }
        
        public static String CurrentUserNameInputFieldXpath()
        {
            return "//form[@name='changeUsernameForm']/div/input[@ng-model='userAccount.userName']";
        }
        
        public static String NewUserNameInputFieldXpath()
        {
            return "//form[@name='changeUsernameForm']/div/input[@ng-model='changeUsernameTemplate.userName']";
        }
        
        public static String ChangeUserNameCurrentPasswordInputFieldXpath()
        {
            return "//form[@name='changeUsernameForm']/div/input[@ng-model='changeUsernameTemplate.password']";
        }
        
        public static String ChangeUserNameButtonCancelXpath()
        {
            return "//div[@name='changeUsernameModal'][@aria-hidden='false']//button[text()='Cancel']";
        }
        
        public static String ChangeUserNameButtonChangeXpath()
        {
            return "//div[@name='changeUsernameModal'][@aria-hidden='false']//button[text()='Change']";
        }
        
     //</editor-fold>  
        
    //<editor-fold defaultstate="collapsed" desc="(Personal Details) Validate Change Password">
        
        public static String ChangePasswordPopUpXpath()
        {
            return "//div[@name='changePasswordModal'][@aria-hidden='false']//h5/span[text()='Change password']";
        }
        
        public static String ChangePasswordCurrentPasswordXpath()
        {
            return "//div[@name='changePasswordModal'][@aria-hidden='false']//input[@name='oldPassword']";
        }
        
        public static String ChangePasswordNewPasswordXpath()
        {
            return "//div[@name='changePasswordModal'][@aria-hidden='false']//input[@name='newPassword']";
        }
        
        public static String ChangePasswordConfirmPasswordXpath()
        {
            return "//div[@name='changePasswordModal'][@aria-hidden='false']//input[@name='confirmNewPassword']";
        }
        
        public static String ChangePasswordButtonCancelXpath()
        {
            return "//div[@name='changePasswordModal'][@aria-hidden='false']//button[text()='Cancel']";
        }
        
        public static String ChangePasswordButtonChangeXpath()
        {
            return "//div[@name='changePasswordModal'][@aria-hidden='false']//button[text()='Change']";
        }
        
    //</editor-fold>
        
    //<editor-fold defaultstate="collapsed" desc="(Personal Details)Validate Change UserName">
   
        public static String PersonalSettingsButtonSaveXpath()
        {
            return "//form[@name='userSettingsForm']//button[text()='Save']";
        }
        
        public static String PersonalSettingsButtonCancelXpath()
        {
            return "//form[@name='userSettingsForm']//button[text()='Cancel']";
        }
        
        public static String ChangesNotSavedPopUpModalXpath()
        {
            return "//div[@aria-hidden]/form[@name='modalForm']";
        }
        public static String PersonalSettingsChangesButtonYesXpath()
        {
            return "//button[text()='Yes']";
        }
        
        
        public static String PersonalSettingsButtonYesXpath()
        {
            return "//div[@aria-hidden]/form[@name='modalForm']/div/div/button[text()='Yes']";
        }
        
        public static String ValidateFirstNameFieldCharactersRequirementXpath()
        {
            return "//form[@name='userSettingsForm']//div/input[@name='firstName']/../span[text()='The entered field must be greater than 2 characters and may not exceed 30 characters'][contains(@style,'display: none')!=true()]";
        }
        
        public static String ValidateLastNameFieldCharactersRequirementXpath()
        {
            return "//form[@name='userSettingsForm']//div/input[@name='lastName']/../span[text()='The entered field must be greater than 2 characters and may not exceed 30 characters'][contains(@style,'display: none')!=true()]";
        }       
        
        
        public static String ValidateEmployerNameFieldCharactersRequirementXpath()
        {
            return "//form[@name='userSettingsForm']//div/input[@name='employer']/../span[text()='The entered field must be greater than 2 characters and may not exceed 100 characters'][contains(@style,'display: none')!=true()]";
        }
        
        public static String ValidateEmployerNameFieldIsRequiredXpath()
        {
            return "//form[@name='userSettingsForm']//div/input[@name='employer']/../span[text()='This field is required'][contains(@style,'display: none')!=true()]";
        }
        
        public static String ValidateFirstNameFieldIsRequiredXpath()
        {
            return "//form[@name='userSettingsForm']//div/input[@name='firstName']/../span[text()='This field is required'][contains(@style,'display: none')!=true()]";
        }
        
        public static String ValidateLastNameFieldIsRequiredXpath()
        {
            return "//form[@name='userSettingsForm']//div/input[@name='lastName']/../span[text()='This field is required'][contains(@style,'display: none')!=true()]";
        }
        
        public static String ValidateHomeNumberFieldMustbeNumericXpath()
        {
            return "//form[@name='userSettingsForm']//div/input[@name='homePhone']/../span[text()='The value must be a valid phone number, e.g. +27 12 345 6789'][contains(@style,'display: none')!=true()]";
        }
        
        public static String ValidateHomeNumberFieldInvalidCountryCodeXpath()
        {
            return "//form[@name='userSettingsForm']//div/input[@name='homePhone']/../span[text()='Invalid country code'][contains(@style,'display: none')!=true()]";
        }
        
        public static String ValidateWorkNumberFieldInvalidCountryCodeXpath()
        {
            return "//form[@name='userSettingsForm']//div/input[@name='workPhone']/../span[text()='Invalid country code'][contains(@style,'display: none')!=true()]";
        }
        
        public static String ValidateWorkNumberFieldMustBeNumericXpath()
        {
            return "//form[@name='userSettingsForm']//div/input[@name='workPhone']/../span[text()='The value must be a valid phone number, e.g. +27 12 345 6789'][contains(@style,'display: none')!=true()]";
        }
        
        public static String ValidateMobileNumberFieldMustBeNumericXpath()
        {
            return "//form[@name='userSettingsForm']//div/input[@name='mobilePhone']/../span[text()='The value must be a valid phone number, e.g. +27 12 345 6789'][contains(@style,'display: none')!=true()]";
        }
        
        public static String ValidateMobileNumberFieldInvalidCountryCodeXpath()
        {
            return "//form[@name='userSettingsForm']//div/input[@name='mobilePhone']/../span[text()='Invalid country code'][contains(@style,'display: none')!=true()]";
        }
        
        
        public static String ValidateChangeUserNameNewUserNameFieldIsRequiredXpath()
        {
            return "//form[@name='changeUsernameForm']//div/input[@name='userName']/../span[text()='This field is required'][contains(@style,'display: none')!=true()]";
           // return "//form[@name='changeUsernameForm']//div/input[@name='userName']/../span[text()='This field is required'][@style='']";
        }
        
        public static String ValidateChangeUserNameNewUserNameFieldIsValidEmailXpath()
        {
            return "//form[@name='changeUsernameForm']//div/input[@name='userName']/../span[text()='This field must be a valid e-mail address'][contains(@style,'display: none')!=true()]";
        }
        
        public static String ValidateChangeUserNameCurrentPasswordFieldIsRequiredXpath()
        {
            return "//form[@name='changeUsernameForm']//div/input[@name='password']/../span[text()='This field is required'][contains(@style,'display: none')!=true()]";
        }
        
        
        public static String ValidateChangePasswordCurrentPasswordFieldIsRequiredXpath()
        {
            return "//form[@name='changePasswordForm']/div/input[@name='oldPassword']/../span[text()='This field is required'][contains(@style,'display: none')!=true()]";
        }
        
        public static String ValidateChangePasswordNewPasswordFieldIsRequiredXpath()
        {
            return "//form[@name='changePasswordForm']/div/input[@name='newPassword']/../span[text()='This field is required'][contains(@style,'display: none')!=true()]";
        }
        
        public static String ValidateChangePasswordConfirmPasswordFieldIsRequiredXpath()
        {
            return "//form[@name='changePasswordForm']/div/input[@name='confirmNewPassword']/../span[text()='This field is required'][contains(@style,'display: none')!=true()]";
        }       
        
        public static String ValidateChangePasswordNewPasswordIsWeakXpath()
        {
            return "//form[@name='changePasswordForm']/div/input[@name='newPassword']/../span[text()='Password too weak'][contains(@style,'display: none')!=true()]";
        }
        
        public static String ValidateChangePasswordConfirmPasswordMustMatchXpath()
        {
            return "//form[@name='changePasswordForm']/div/input[@name='confirmNewPassword']/../span[text()='Field values must match'][contains(@style,'display: none')!=true()]";
        }
        
   //</editor-fold>
        
    public static String ClearIENetworkImg()
    {
        return "ClearIEnetworkImg.PNG";
    }
    
    public static String findDeCartaFirefoxImg()
    {
        return "decartaFirefox.PNG";
    }
}