/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects;

/**
 *
 * @author szeuch
 */
public class TrailOnMapusingMapProviderPageObjects
{    
    public static String IENetworkImageNew() 
    {
        return "IEnetworkImage.png";
    }  
    
    public static String DockRightFirefox() 
    {
        return "dockFirefox.PNG";
    }  
    
    public static String DockBottomFirefox() 
    {
        return "DockToBottomBrowserFireFoxImage.PNG";
    }  
    
    public static String NetworkIEImage() 
    {
        return "NetworkIEImage.png";
    }
    
    public static String zoomInImage() 
    {
        return "ZoomIn.PNG";
    } 
    
    public static String zoomOutImage() 
    {
        return "ZoomOutImage.PNG";
    } 
    
    public static String pathImage()
    {
        return "paths.PNG";
    }
    
    public static String Maximize()
    {
        return "MaximizeFirefoxTools.png";
    }
    
    public static String MaximizeWindow()
    {
        return "MaximizeWindow.png";
    }
    
    public static String ButtonRecordImg()
    {
        return "ButtonRecord.PNG";
    }
    
    public static String ButtonStartRecordingImg()
    {
        return "ButtonStartRecording.PNG";
    }
          
    public static String IENetworkImageClear() 
    {
        return "IEClear.PNG";
    }  
    
    public static String FirefoxHeader() 
    {
        return "FirefoxHeader.PNG";
    }  
    
    public static String FireFoxGoogleValidation()
    {
        return "FFGoogleValidation.png";
    }
    
    public static String TrailPointImage()
    {
        return "TrailOnMapPoint.png";
    }
    
    public static String FlagPostionBlueImage()
    {
        return "FlagPositionBlue.PNG";
    }
    
    public static String MapDataGoogleImage()
    {
        return "MapDataGoogle.PNG";
    }
    
   
    public static String FlagPostionSmallImage()
    {
        return "FlagPositionImageSmall.PNG";
    }
    
    public static String FireFoxClearNetworkInspector()
    {
        return "FFClearNetworkInspector.png";
    }
    
    public static String IEExpandNetworkTabImage()
    {
        return "IEExpandNetworkTab.png";
    }
    
    public static String GreyvehicleSmallImage()
    {
        return "VehicleSmall.PNG";
    }
    
    public static String OrangevehicleSmallImage()
    {
        //return "vehicle2Small.PNG";
        return "carImage.PNG";
    }
    
    
    public static String SmallVehicleImage()
    {
        return "SmallVehicleImage.PNG";
    }
    
    public static String IEPlayNetworkImage() 
    {
        return "IEPlayNetwork.png";
    }
    
    public static String IEPlayNetworkImage2() 
    {
        return "IEPlayNetwork2.PNG";
    }
    public static String PlayNetworkButtonIE() 
    {
        return "PlayNetworkButtonIE.PNG";
    }
    public static String PlayButtonIE3() 
    {
        return "PlayButtonIE3.PNG";
    }
    
    public static String NetworkImage()
    {
        return "Network.png";
    }
    
    public static String MapData_HereImg()
    {
        return "MapDataHere.PNG";
    }
    
    public static String IEGoogleValidationImage()
    {
        return "IEGoogleValidation.png";
    }
    
    public static String IEGoogleNewImage()
    {
        return "IEGoogleNewImage.png";
    }
    
    public static String IEGoogleNewBlueImage()
    {
        return "IEGoogleNewBlueImage.PNG";
    }
    
    public static String AssetsWindowXpath()
    {
        return "//tbody[@fleet-draggable-group='draggable']//tr//td[4]";
    }
    
    public static String AssetsWindowCheckBoxXpath(int placeHolder)
    {
        return "//tbody[@fleet-draggable-group='draggable']//tr["+placeHolder+"]//td[2]//input";
    }
    
    public static String AssetTextXpath(String assetName)
    {
        return "//span[text()='"+assetName+"']";
    }
    
    public static String AssetActionsDropDownXpath(int counter)
    {
        return "//ul[@class='over']//li["+counter+"]//a";
    }
    
    public static String ShowTrailOnMapLinkTextXpath()
    {
        return "//span[text()='Show trail on map']";
    }
    
    public static String MapZoomOutButtonXpath()
    {
        return "//a[@title='Zoom out']";
    }
    
    public static String MapZoomInButtonXpath()
    {
        return "//a[@title='Zoom in']";
    }
    
    public static String PerformanceHover()
    {
        return "performanceCheck.png";
    }
    
    public static String DecartaPath()
    {
        return "decartaPath.png";
    }
    
    public static String TrainOnMapXpath()
    {
        return "//*[local-name() = 'path'][@stroke='blue']";
    }
}