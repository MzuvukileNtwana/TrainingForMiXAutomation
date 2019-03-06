/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects;

/**
 *
 * @author mdevilliers
 */
public class UsabilityOfLiveTrackingMapsPageObjects {

    public static String logoMixXpath() {
        return "//img[contains(@src,'logo')]";
    }

    public static String loadingOverlayXpath() {
        return "//div[contains(@class,'tracking-search')]/div[contains(@class,'loading-overlay')][contains(@style,'none')]/../div[contains(@row-actions,'asset')]";
    }

    public static String labelAssetHeadingXpath() {
        return "//div[contains(@class,'row-fluid')]/table[@class='table table-condensed no-borders']/tbody/tr/td[contains(@class,'text-clip')]";
    }

    public static String labelLocationHeadingXpath() {
        return "//div[@class='tracking-search-container']//table[contains(@class,'table-striped')]/tbody/tr/td/strong/span[text()='Location']";
    }

    public static String labelLastPositionHeadingXpath() {
        return "//div[@class='tracking-search-container']//table[contains(@class,'table-striped')]/tbody/tr/td/strong/span[text()='Last position date and time']";
    }

    public static String labelDriverHeadingXpath() {
        return "//div[@class='tracking-search-container']//table[contains(@class,'table-striped')]/tbody/tr/td/strong/span[text()='Identified driver']";
    }

    public static String labelHeadingAssetXpath() {
        return "//div[@class='tracking-search-container']//table[contains(@class,'table-striped')]/tbody/tr/td/strong/span[text()='Heading']";
    }

//<label>
    public static String labelLiveTrackingHeadingXpath() {
        return "//span[text()='Live tracking']";
    }

    public static String labelLatitudeLongitudeXpath() {
        return "//div[not(contains(@class,'Hidden'))]/span[contains(text(),'Longitude')]";
    }

//Use count. If = 3 then the key is presented properly.
    public static String labelDistanceKeyValidationXpath() {
        return "//div[contains(@class,'scale')]";
    }

    public static String labelDistanceKeyKmTextXpath() {
        return "//div[contains(@class,'scale')][contains(text(),'m')]";
    }

    public static String labelAnAddressXpath() {
        return "//span[text()='Find nearest asset']/../../../div/label/span[text()='An address']";
    }

    public static String labelALocationXpath() {
        return "//span[text()='Find nearest asset']/../../../div/label/span[text()='A location']";
    }

    public static String labelALatLongXpath() {
        return "//span[text()='Find nearest asset']/../../../div/label/span[text()='A latitude/longitude']";
    }

    public static String labelAPosisionXpath() {
        return "//span[text()='Find nearest asset']/../../../div/label/span[text()='A position on the map']";
    }

    //Under the A position on the map radio button
    public static String labelNearestAssetAddressTextXpath() {
        return "//span[text()='Find nearest asset']/../../../div/div[contains(@class,'help-block')]";
    }

    public static String labelGoogleEarthHeadingXpath() {
        return "//h5/span[text()='Google Earth']";
    }

    public static String labelGoogleEarthLinkXpath() {
        return "//input[contains(@id,'google-earth')]";
    }

    public static String labelGoogleEarthText1Xpath() {
        return "//li[text()='Copy the link above']";
    }

    public static String labelGoogleEarthText2Xpath() {
        return "//li[text()='Open Google Earth']";
    }

    public static String labelGoogleEarthText3Xpath() {
        return "//li[text()='Right click on My places and click Add']";
    }

    public static String labelGoogleEarthText4Xpath() {
        return "//li[text()='Select Network Link']";
    }

    public static String labelGoogleEarthText5Xpath() {
        return "//li[text()='Paste the link and click OK']";
    }

    //Hover
    public static String labelHoverAssetInfoXpath() {
        return "//div[@class='leaflet-popup-pane']//td/strong[text()='Asset']/../../td[@class='pop-dev']";
    }
    
    public static String AssetInfoXpath(String Row)
    {
        //return "//div[@class='leaflet-popup-pane']//td/strong["+Row+"]/../../td[@class='pop-dev']";
        return "//div[@class='leaflet-popup-pane']//table//tr["+Row+"]/td[@class='pop-dev']";
    }

    public static String labelHoverLocationXpath() {
        return "//div[@class='leaflet-popup-pane']//td/strong[text()='Location']/../../td[@class='pop-dev']";
    }

    public static String labelHoverLastPosXpath() {
        return "//div[@class='leaflet-popup-pane']//td/strong[text()='Last position']/../../td[@class='pop-dev']";
    }

    public static String labelHoverSpeedXpath() {
        return "//div[@class='leaflet-popup-pane']//td/strong[text()='Speed']/../../td[@class='pop-dev']";
    }

    public static String labelHoverDriverXpath() {
        return "//div[@class='leaflet-popup-pane']//td/strong[text()='Driver']/../../td[@class='pop-dev']";
    }

    public static String labelHoverHeadingXpath() {
        return "//div[@class='leaflet-popup-pane']//td/strong[text()='Heading']/../../td[@class='pop-dev']";
    }

    public static String labelHoverIgnitionXpath() {
        return "//div[@class='leaflet-popup-pane']//td/strong[text()='Ignition']/../../td[@class='pop-dev']";
    }

    public static String labelHoverIgnitionTimeXpath() {
        return "//div[@class='leaflet-popup-pane']//td/strong[text()='Ignition time']/../../td[@class='pop-dev']";
    }
    
    public static String hoverOverAssetXpath(){
        return "//*[local-name()]/canvas/../i";
    }

//</label>
//<button>
    public static String buttonLocationsXpath() {
        return "//a[@fleet-tooltip='Locations']";
    }

    public static String buttonEventsXpath() {
        return "//a[@fleet-tooltip='Events']";
    }

    public static String buttonZoomInXpath() {
        return "//a[@title='Zoom in']";
    }
    public static String disabledZoomInButtonXpath()
    {
        return "//a[@class='leaflet-control-zoom-in leaflet-disabled']";
    }

    public static String buttonZoomOutXpath() {
        return "//a[@title='Zoom out']";
    }

    public static String buttonFindXpath() {
        return "//a[@fleet-tooltip='Find']";
    }

    public static String buttonCreateLocationXpath() {
        return "//a[@fleet-tooltip='Create location']";
    }

    public static String buttonViewManyAssetsInNewWindowXpath() {
        return "//a[@fleet-tooltip='View many assets in new window']";
    }

    public static String buttonMapLayersXpath() {
        return "//a[@fleet-tooltip='Map layers']";
    }

    public static String buttonMapToolsXpath() {
        return "//a[@fleet-tooltip='Map tools']";
    }

    public static String buttonGoogleEarthXpath() {
        return "//a[@fleet-tooltip='Google Earth']";
    }

    public static String buttonFulLScreenXpath() {
        return "//a[@fleet-tooltip='Full screen']";
    }

    public static String buttonMapZoomInXpath() {
        return "//a[contains(@class,'zoom-in')]";
    }

    public static String buttonMapZoomOutXpath() {
        return "//a[contains(@class,'zoom-out')]";
    }

    public static String buttonFindNearestAssetXpath() {
        return "//a[text()='Find nearest asset']";
    }

    public static String buttonFindAPlaceXpath() {
        return "//a[text()='Find a place']";
    }
    public static String buttonActionXpath(){
        return "//div[@ng-show='rowActions']/ul/li[2]/div/div/a[@fleet-tooltip='Actions']";
    }

    //Use only for validation:
    public static String buttonNearestAssetSearchXpath() {
        return "//a[text()='Search']/../../../form[@name='findNearestAssetForm']";
    }

    public static String buttonGoXpath() {
        return "//span[text()='Find nearest asset']/../../../div/div/div/div/div/div/button[text()='Go!']";
    }

    public static String buttonSearchXpath() {
        return "//span[text()='Find nearest asset']/../../../div/a";
    }

    public static String buttonFindNearestAssetCloseXpath() {
        return "//span[text()='Find nearest asset']/../../button";
    }

    public static String buttonCreateLocationCircleXpath() {
        return "//a[@fleet-tooltip='Circle']";
    }

    public static String buttonCreateLocationRectangleXpath() {
        return "//a[@fleet-tooltip='Rectangle']";
    }

    public static String buttonCreateLocationPolygonXpath() {
        return "//a[@fleet-tooltip='Polygon']";
    }

    public static String buttonCreateLocationPolylineXpath() {
        return "//a[@fleet-tooltip='Polyline']";
    }

    public static String buttonManyAssetsCancelXpath() {
        return "//span[text()='Select multiple assets to follow in a new window']/../../../../../../div/button[text()='Cancel']";
    }

    public static String buttonManyAssetsSelectXpath(boolean validateDisabled) {
        String append = "";

        if (validateDisabled) {
            append = "[@disabled='disabled']";
        }
        return "//span[text()='Select multiple assets to follow in a new window']/../../../../../../div/button[text()='Select']" + append;
    }

    public static String buttonMapLayersCloseXpath() {
        return "//h5/span[text()='Map layers']/../../../div/button[@class='close']";
    }

    public static String buttonQueryPointXpath() {
        return "//a[@fleet-tooltip='Query point on map']";
    }

    public static String buttonSelectNZoomXpath() {
        return "//a[@fleet-tooltip='Select and zoom']";
    }
    public static String selectAndZoomImage()
    {
        return "selectAndZoom.PNG";
    }

    public static String buttonMeasureDistance() {
        return "//a[@fleet-tooltip='Measure distance']";
    }
    
    public static String buttonReturnXpath(){
        return "//div[@class='splitter']//div[contains(@ng-show,'assetDetails')]//span[text()='Back to asset list']";
    }

    public static String buttonAssetReturnXpath(){
        return "//a[@ng-click='backToAssetList()']/span[text()='Back to asset list']";
    }
//</button>
//<dropDown>
    public static String dropdownAnAddressCountryXpath() {
        return "//span[text()='Find nearest asset']/../../../div/div/div/select[contains(@ng-model,'selectedCountry')]";
    }

    public static String dropdownAnAddresslanguageXpath() {
        return "//span[text()='Find nearest asset']/../../../div/div/div/select[contains(@ng-model,'selectedLanguage')]";
    }

//</dropDown>
//<input>
    public static String inputAnAddress() {
        return "//span[text()='Find nearest asset']/../../../div/div/input[contains(@id,'Address')]";
    }

    public static String inputLocationXpath() {
        return "//span[text()='Find nearest asset']/../../../div/div/input[contains(@id,'Location')]";
    }

    public static String inputLatitudeXpath() {
        return "//span[text()='Find nearest asset']/../../../div/div/div//input[contains(@class,'latitude')]";
    }

    public static String inputLongitudeXpath() {
        return "//span[text()='Find nearest asset']/../../../div/div/div//input[contains(@class,'longitude')]";
    }

    public static String inputRadiusDistanceXpath(boolean checkUnits) {
        String append = "";

        if (checkUnits) {
            append = "label";
        } else {
            append = "input";
        }

        return "//span[text()='Find nearest asset']/../../../div/div/div/label/span[text()='radius']/../../div/" + append;
    }

    public static String inputNumberOfAssetsXpath() {
        return "//span[text()='Find nearest asset']/../../../div/div/div/label/span[text()='number of assets']/../../div/input";
    }

    public static String inputManyAssetsFilterXpath() {
        return "//span[text()='Select multiple assets to follow in a new window']/../../../form/div/input";
    }

    public static String inputFilterFieldXpath(){
        return "//input[@placeholder='Filter'][contains(@ng-model,'mainFilter')]";
    }
    
//</input>
//<radioButton>
    public static String radioAnAddressXpath() {
        return "//span[text()='Find nearest asset']/../../../div/label/span[text()='An address']/../input";
    }

    public static String radioALocationXpath() {
        return "//span[text()='Find nearest asset']/../../../div/label/span[text()='A location']/../input";
    }

    public static String radioALatLongXpath() {
        return "//span[text()='Find nearest asset']/../../../div/label/span[text()='A latitude/longitude']/../input";
    }

    public static String radioAPosisionXpath() {
        return "//span[text()='Find nearest asset']/../../../div/label/span[text()='A position on the map']/../input";
    }

    public static String radioRadiusXpath() {
        return "//span[text()='Find nearest asset']/../../../div/div/div/label/span[text()='radius']/../input";
    }

    public static String radioNumberOfAssetsXpath() {
        return "//span[text()='Find nearest asset']/../../../div/div/div/label/span[text()='number of assets']/../input";
    }

//</radioButton>
//<table>
    public static String tableRowAssetsXpath() {
        return "//tbody/tr[@fleet-droppable-item='row']";
    }

    public static String tableAllSelectorXpath() {
        return "//tr[@class='light-blue']/th[@column-field='showAssetOnMap']/span/input";
    }

    public static String tableRowAssetsXSelectXpath(int x) {
        return "//tbody/tr[@fleet-droppable-item='row'][" + x + "]/td[contains(@class,'first')]/div/span";
    }
    public static String tableRowAssetDvtLiveXpath(String Asset_Descr){
        return "//tbody/tr[@fleet-droppable-item='row']/td[@column-field='assetDescription']/div/a/span[text()='"+Asset_Descr+"']/../../../../td[@column-field='showAssetOnMap']//input";
    }
    public static String tableManyAssetsRowXpath(int x, boolean useTrX, boolean select) {
        String append = "";

        if (useTrX) {
            append = "[" + Integer.toString(x) + "]";
        }

        if (select) {
            append += "/td[@ng-show='allowRowSelection']";
        }

        return "//span[text()='Select multiple assets to follow in a new window']/../../../div/div/div/div/div/table/tbody/tr" + append;
    }

    public static String tableColumnManyAssetsRegistrationXpath() {
        return "//span[text()='Select multiple assets to follow in a new window']/../../../div/div/div/div/div/table/thead/tr/th/span[text()='Registration']";
    }

    public static String tableColumnManyAssetsAssetDescriptionXpath() {
        return "//span[text()='Select multiple assets to follow in a new window']/../../../div/div/div/div/div/table/thead/tr/th/span[text()='Asset description']";
    }

    public static String tableColumnManyAssetsFleetNumberXpath() {
        return "//span[text()='Select multiple assets to follow in a new window']/../../../div/div/div/div/div/table/thead/tr/th/span[text()='Fleet number']";
    }

    public static String tableColumnManyAssetsSiteXpath() {
        return "//span[text()='Select multiple assets to follow in a new window']/../../../div/div/div/div/div/table/thead/tr/th/span[text()='Site']";
    }

//</table>
//<map>
    public static String mapContainerXpath() {
        return "//div[@id='map']";
    }

    public static String mapSvgXpath() {
        return "//*[local-name()='svg']";
    }
    public static String scaleLineXpath()
    {
        return "//div[@class='leaflet-control-scale-line'][1]";
    }

    //The one that A position on the map creates
    public static String mapLeafletMarkerXpath() {
        return "//img[contains(@class,'leaflet')][contains(@style,'inline')]";
    }

    public static String mapStrokePathXpath() {
        return "//*[local-name()='path']";
    }

    public static String mapDimensionXXpath() {
        return "//div[@id='map']/div[contains(@style,'height')]";
    }

    public static String mapAssetIconSmallXpath() {
        return "//div[contains(@class,'map-marker')][contains(@class,'small')]";
    }

//</map>
//<check>
    public static String checkClusteringXpath() {
        return "//h5/span[text()='Map layers']/../../../div/div/ul/li/div/div/span[text()='Clustering']/../input";
    }

    public static String checkEventsOnTrailXpath() {
        return "//h5/span[text()='Map layers']/../../../div/div/ul/li/div/div/span[text()='Events on trail']/../input";
    }

    public static String checkLocationLabelsXpath() {
        return "//h5/span[text()='Map layers']/../../../div/div/ul/li/div/div/span[text()='Location labels']/../input";
    }

    public static String checkAssetLabelsDropDownXpath() {
        return "//h5/span[text()='Map layers']/../../../div/div/ul/li/span";
    }

    public static String checkAssetLabelsAssetDescriptionXpath() {
        return "//h5/span[text()='Map layers']/../../../div/div/ul/li/div/ul/li/div/div/span[text()='Asset description']/../input";
    }

    public static String checkAssetLabelsRegistrationNumberXpath() {
        return "//h5/span[text()='Map layers']/../../../div/div/ul/li/div/ul/li/div/div/span[text()='Registration number']/../input";
    }

    public static String checkAssetLabelsFleetNumberXpath() {
        return "//h5/span[text()='Map layers']/../../../div/div/ul/li/div/ul/li/div/div/span[text()='Fleet number']/../input";
    }

    public static String checkAssetLabelsAssetIDXpath() {
        return "//h5/span[text()='Map layers']/../../../div/div/ul/li/div/ul/li/div/div/span[text()='Asset ID']/../input";
    }

    public static String checkAssetLabelsDriverNameXpath() {
        return "//h5/span[text()='Map layers']/../../../div/div/ul/li/div/ul/li/div/div/span[text()='Driver name']/../input";
    }

    public static String checkAssetLabelsDriverIDXpath() {
        return "//h5/span[text()='Map layers']/../../../div/div/ul/li/div/ul/li/div/div/span[text()='Driver ID']/../input";
    }

    public static String checkAssetLabelsSpeedXpath() {
        return "//h5/span[text()='Map layers']/../../../div/div/ul/li/div/ul/li/div/div/span[text()='Speed']/../input";
    }

    public static String checkAssetLabelsIgnitionStatusXpath() {
        return "//h5/span[text()='Map layers']/../../../div/div/ul/li/div/ul/li/div/div/span[text()='Ignition status']/../input";
    }
    public static String resetIconButtonXpath(){
        return "//div[@class='pa-10 search-box btn-inverse']//button[@class='input-reset']";
    }

//</check>
}
