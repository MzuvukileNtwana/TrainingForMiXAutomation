/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects;

/**
 *
 * @author lmgulwa
 */
public class AddPolylineMapGoogleSearchPageObject {
    
    public static String manageMenuLinkXpath() 
    {
        return "//a[text()='MANAGE ']";
    }
    public static String dbAdminSubMenuXpath() 
    {
        return "//div[@ng-repeat='module in section.modules']//a[text()='Database administration']";
    }
    public static String testRSOTreeXpath() 
    {
        return "//strong[text()='Test RSO']/../../../../span[@class='daredevel-tree-anchor ui-icon icon-plus ng-scope']";
    }
    
    public static String ghosUSTestingXpath() 
    {
        return "//strong[text()='GHOS US Testing']";
    }
    
    public static String mapSettingsXpath() 
    {
        return "//a[text()='Map settings']";
    }
    
    public static String mapProviderSelectGoogleXpath() 
    {
        return "//span[text()='Map Provider']//..//../select";
    }
    
    public static String saveMapSettingsButtonXpath() 
    {
        return "//div/button[@enabled='!saveDisabled']";
    }
    
    public static String cancelMapSettingsButtonXpath() 
    {
        return "//button[text()='Cancel']";
    }
    
    public static String createLocationIconXpath()
    {
        return "//i[contains (@class, 'icon-shapes')]/..";
    }
    
    public static String selectAssetBarXpath()
    {
        return "//span[text()='HOS 3607i Rovi II 803']/../../../../td[@ng-show='column.visible']/div/span/input";
    }
    
    public static String successfullySavedButtonXpath()
    {
        return "//span[text()='Organisation updated successfully']";
    }
    
    public static String mapDropdownXpath()
    {
        return "//select[@ng-model='mapProvider']";
    }
    
    public static String NetworkImage() 
    {
        return "Network.png";
    }
    
    public static String IEnetworkImage() 
    {
        return "IEnetworkImage.png";
    }
    
    public static String IEalreadyClickedNetworkImage() 
    {
        return "IENetworkAlreadyClicked.png";
    }
    
    public static String polylineXpath() 
    {
        return "//i[@class='icon-shape-line']/..";
    } 
    
    public static String createLocationImage() 
    {
        return "CreateLocation.png";
    }
    
    public static String clickPolylineImage() 
    {
        return "ClickPolyline.png";
    }
    
    public static String PolylinePoint1Image() {
        return "PolylinePoint1.png";
    }
 
    public static String PolylinePoint2Image() 
    {
        return "PolylinePoint2.png";
    }
    
    public static String extractNameImage()
    {
        return "ExtractNameImageCircle.png";
    }
    
    public static String stopNetworkRecordImage()
    {
        return "ButtonRecord.png";
    }
    
    public static String IEstartNetworkRecordImage()
    {
        return "IEPlayNetwork.png";
    }
    
    public static String googleProviderTextImage()
    {
        return "googleProviderText.png";
    }
    
    public static String IEActualProviderTextImage()
    {
        return "IEproviderActualText.png";
    }
    
    public static String firefoxProviderTextImage()
    {
        return "firefoxGoogleSearchText.png";
    }
    
    public static String IEProviderTextImage()
    {
        return "IEproviderTextImage.png";
    }
    
    public static String PolylineEndPointImage() 
    {
        return "PolylineEndPoint.png";
    }
    
    public static String PolylineEndPointFFImage()
    {
        return "PolylineEndPointFF.png";
    }
    
    public static String PointOneXpath() 
    {
        return "//div[@class='leaflet-control-scale leaflet-control']/div[2]";
    }    
                
    public static String PointTwoXpath() 
    {
        return "//div[@class='leaflet-control-scale leaflet-control']/div[1]";
    } 
    
    
}
