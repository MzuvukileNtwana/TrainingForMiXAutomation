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
public class GeneralLookAndFeelOfManageLocationsPageObjects 
{
    public static String ValidatePageXpath() 
    {
        return "//span[text()='Manage locations']";
    }
    
    public static String LocationsTypeAllSpanXpath()
    {
        return "//span[text()='All']";
    }
    
    public static String LocationTypesWebElementsXpath()
    {
        return "//ul[@ng-show]//li//span[@class='ng-binding']";
    }
    
    public static String LocationTypesElementXpath(String locationTypeText)
    {
        return "//span[text()='"+locationTypeText+"']";
    }
    
    public static String LocationTypesElementHighlightValidationXpath(String locationTypeText)
    {
        return "//li[contains(@class, 'active')]//a//span[text()='"+locationTypeText+"']";
    }
    
    public static String LocationTypeHeaderChangeValidationXpath()
    {
        return "//div[@class='page-header']//ul[@class='breadcrumb pull-left']//strong";
    }
    
    public static String LocationsItemListAmountXpath()
    {
        return "//div[contains(@class, 'container-fixed-right')]//table//tbody//tr";
    }
    
    public static String LocationsItemListAmountHeaderXpath()
    {
        return "//div[@class='page-header']//ul//span";
    }
    
    public static String LocationListLastItemXpath(int itemsListSize)
    {
        return "//div[contains(@class, 'container-fixed-right')]//table//tbody//tr["+itemsListSize+"]";
    }
    
    public static String LocationsListItemCheckBoxXpath(int item)
    {
        return "//div[contains(@class, 'container-fixed-right')]//table//tbody//tr["+item+"]//td[2]//input";
    }
    
    public static String TableDataTagName()
    {
        return "td";
    }
    
    public static String LocationTypesHeadersValidationXpath(int counter)
    {
        return "//table//th["+counter+"]//span[2]";
    }
    
    public static String LastRefreshTextXpath()
    {
        return "//span[@class='last-refresh-timer']//span";
    }
    
    public static String RefreshButtonSpanTextXpath()
    {
        return "//span[text()='Refresh']";
    }
    
    public static String LocationsFilterTextBoxXpath()
    {
        return "//input[@placeholder=\"Filter\"]";
    }
    
    public static String ImportButtonXpath()
    {
        return "//i[@class=\"icon-import\"]";
    }
    
    public static String ImportTextBoxXpath()
    {
        return "//input[contains(@class,'filename')]";
    }
    
    public static String ChooseFileButtonXpath()
    {
        return "//span[text()='Choose file']";
    }
    
    public static String CloseButtonXpath()
    {
        return "//a[text()='Close']";
    }
    
    public static String DownloadButtonXpath()
    {
        return "//i[@class=\"icon-download-alt\"]";
    }
    
    public static String DownloadRadioButtonUpdateExistingRecordsForThisOrganisationSpanTextXpath()
    {
        return "//span[text()='Update existing records for this organisation']";
    }
    
    public static String DownloadRadioButtonImportTheseLocationsIntoAnotherOrganisationSpanTextXpath()
    {
        return "//span[text()='Import these locations into another organisation']";
    }
    
    public static String CancelButtonXpath()
    {
        return "//div[@class=\"modal-footer\"]//a[text()='Cancel']";
    }
    
    public static String DownloadButton2Xpath()
    {
        return "//div[@class=\"modal-footer\"]//a[text()='Download']";
    }
    
    public static String DeleteButtonXpath()
    {
        return "//i[@class=\"icon-trash\"]";
    }
    
    public static String DeleteMultipleLocationValidationTextXpath()
    {
        return "//span[text()='Deleting multiple locations']";
    }
    
    public static String AddLocationButtonXpath()
    {
        return "//i[contains(@class, 'icon-plus')]";
    }
    
    public static String AddCircleButtonXpath()
    {
        return "//a[@fleet-tooltip='Circle']";
    }
    
    public static String AddRectangleButtonXpath()
    {
        return "//a[@fleet-tooltip='Rectangle']";
    }
    
    public static String AddPolygonButtonXpath()
    {
        return "//a[@fleet-tooltip='Polygon']";
    }
    
    public static String AddPolylineButtonXpath()
    {
        return "//a[@fleet-tooltip='Polyline']";
    }
    
    public static String BackToLocationListButtonXpath()
    {
        return "//span[text()='Back to location list']";
    }
}
