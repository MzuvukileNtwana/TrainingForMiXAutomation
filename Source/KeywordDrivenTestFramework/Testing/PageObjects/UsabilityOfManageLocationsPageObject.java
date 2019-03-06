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
public class UsabilityOfManageLocationsPageObject 
{
    public static String A()
    {
        return "";
    }
    
    //left pane spinner
    public static String leftPaneSpinner()
    {
        return "//div[@class='left-pane']//div[@class='loading-overlay']";
    }
    public static String manageLoactionXpath()
    {
        return "//span[text()='Manage locations']";
    }
    public static String buttonRemoveXpath()
    {
        return "//div[@header-title='Remove location']//button[text()='Remove']";
    }
    public static String spanRemoveXpath()
    {
        return "//ul[contains(@style, 'block')]//li//span[text()='Remove']";
    }
     public static String buttonCancelXpath()
    {
        return "//div[@name='removeLocationConfirmation']//button[text()='Cancel']";
    }
    public static String buttonLocationRemoveXpath()
    {
        return "//div[@name='removeLocationConfirmation']//button[text()='Remove']";
    } 
     public static String spanEditXpath()
    {
        return "//ul[contains(@style, 'block')]//li//span[text()='Edit']";
    }
    public static String divRowActionXpath()
    {
        return "//li[2]//div[@column='rowActions']//a";
    }
    public static String inputDescriptionXpath()
    {
        return "//input[@type='text'][@name='description']";
    }
     public static String inputFilterQueryXpath()
    {
        return "//input[@ng-model='filterQuery']";
    }
    public static String openOrganisationSelectionMillerXpath()
    {
        return "//a[@ng-click=\"$broadcast('openOrganisationSelectionMiller')\"]";
    }
    public static String SelectorganisationgroupXpath()
    {
        return "//h5[text()='Select organisation group']";
    }
    public static String cancelButtonXpath()
    {
        return "//a[text()='Cancel']";
    }
    public static String filterTextBoxXpath()
    {
        return "//div[@class='pull-right']//input[@type='text']";
    }
    public static String searchIconXpath()
    {
        return "//i[@class='icon-search']";
    }
     public static String spanFindPlaceXpath()
    {
        return "//span[text()='Find a place']";
    }
    
    public static String selectXpath()
    {
        return "//a[text()='Select']";
    }
    public static String tableColumn4Xpath()
    {
        return "//tbody//tr//td[4]";
    }
    public static String tableColumn4SpanXpath(int i)
    {
        return "//table//tbody//tr//td["+i+"]//span";
    } 
    public static String tableColumn5SpanXpath()
    {
        return "//table//tbody//tr//td[5]//span";
    }
    
    public static String tableRowXpath()
    {
        return "//table//tbody//tr";
    } 
    public static String tableRow1InputXpath()
    {
        return "//tr[1]/td[2]//input";
    }
    public static String tableRow3Column2InputXpath()
    {
        return "//tr[3]/td[2]//input";
    }
    public static String tableRow1Column1InputXpath()
    {
        return "//table//tbody//tr[1]//td[1]";
    }
    public static String mapDivXpath()
    {
        return "//div[@id='map']";
    }
    public static String mapProviderXpath()
    {
        return "//select[@ng-model='mapProvider']";
    }
    
    //
    public static String MapProviderXpath()
    {
        return "//div//div[@class='map-types pull-right tracking-toolbar-item mr-10']//select[@ng-model='mapProvider']";
    }
    
    public static String editLocationLeftPaneSpinnerXpath()
    {
        return "//div[@class='left-pane']//div[@class='loading-overlay'][@style='display: none;']";
    }
    
     public static String iconShapeCircleXpath()
    {
        return "//i[@class='icon-shape-circle']";
    }
    public static String selectTypeXpath()
    {
        return "//select[@name='type']";
    } 
     public static String selectSiteXpath()
    {
        return "//select[@name='siteId']";
    } 
     public static String buttonSaveXpath()
    {
        return "//button[@text='Save']";
    }  
    public static String inputFilterXpath()
    {
        return "//input[@placeholder='Filter']";
    } 
    public static String inputNameDescriptionXpath()
    {
        return "//input[@name='description']";
    }   
    public static String iconShapeRectangleXpath()
    {
        return "//i[@class='icon-shape-rectangle']";
    }
     public static String spanBackLocationListXpath()
    {
        return "//span[text()='Back to location list']";
    }
    
     public static String backToLocationListXapth()
     {
         return "//a[@ng-click='backToList()']//span";
     }
     
     public static String spanNoItemsToDisplayXpath()
    {
        return "//span[text()='No items to display']";
    }
     public static String spanAreYouSureXpath()
    {
        return "//p[text()='Are you sure you want to remove ']";
    } 
    public static String iconShapeCustomXpath()
    {
        return "//i[@class='icon-shape-custom']";
    } 
    public static String iconShapeLineXpath()
    {
        return "//i[@class='icon-shape-line']";
    } 
    public static String tableBodyColumn4Xpath()
    {
        return "//table//tbody//tr//td[4]";
    }
    public static String tableBodyColumnXpath()
    {
        return "//table[@class='table table-scroll table-condensed table-list no-text-clip']/tbody/tr/td[4]";
    }
    public static String closeLeftPanelXpath()
    {
        return "//i[contains(@class, 'icon-chevron-left')]";
    }
    public static String rightPanelXpath()
    {
        return "//i[contains(@class, 'icon-chevron-right')]";
    }
    public static String modalCancelXpath()
    {
        return "//div[@class='modal-footer']//a[text()='Cancel']";
    }
    public static String AllFilterSpanXpath()
    {
        return "//span[text()='All']";
    }
    public static String iconTrashXpath()
    {
        return "//i[@class='icon-trash']";
    }
    public static String paragaphMultipleXpath()
    {
        return "//p[contains(text(), 'Multiple')]";
    }
     public static String tableRow3InputXpath()
    {
        return "//tr//th[3]//input";
    }
    public static String tableRow6InputXpath()
    {
        return "//tbody//tr[6]//td[2]//input";
    }
     public static String tableBodyRow5Column2InputXpath()
    {
        return "//tbody//tr[5]//td[2]//input";
    } 
    public static String tableRow5Column2InputXpath()
    {
        return "//tr[5]/td[2]//input";
    } 
     public static String tableBodyRow1Column2InputXpath()
    {
        return "//tbody//tr[1]//td[2]//input";
    } 
    public static String tableRow4Column2InputXpath()
    {
        return "//tbody//tr[4]//td[2]//input";
    }  
    public static String tableBodyRow3Column2InputXpath()
     {
        return "//tbody//tr[3]//td[2]//input";
    }
    public static String tableBodyRow2Column2InputXpath()
    {
        return "//tbody//tr[2]//td[2]//input";
    }
    
    public static String badgeXpath()
    {
        return "//div[@class='page-header']//li//span[contains(@class, 'badge')]";
    }
    public static String tableColumnHeadingXpath()
    {
        return "//table//thead//tr[1]//th[contains(@class, 'column-heading')]//span[2]";
    }
    public static String deleteMultipleLocationCancelXpath()
    {
        return "//div[@header-title='Deleting multiple locations']//div[@class='modal-footer']//button[text()='Cancel']";
    }
    public static String refreshLickXpath()
    {
        return "//span[text()='Refresh']";
    } 
    public static String tableColumsXpath()
    {
        return "//i[@class='icon-choose-columns']";
        
    }
    public static String tableHomeNUmberColumsXpath()
    {
        return "//ul//li//span[text()='Home number']";
    }
    public static String tableEmailAddresColumsXpath()
    {
        return "//ul//li//span[text()='Email address']";
    }
    public static String tableHeadersXpath()
    {
        return "//table//thead//tr//th";
    }
     public static String disabledRaidobuttonXpath()
    {
        return "//a[text()='Download'][@disabled='disabled']";
    }
   public static String tableContactNameColumsXpath()
    {
        return "//ul//li//span[text()='Contact name']";
    }
   public static String columnChooserDropdownXpath()
    {
        return "//ul[contains(@class, 'column-chooser-dropdown')]//li//a";
                //ul[contains(@class, 'column-chooser-dropdown')]//li//a
    }
   public static String dragColumnsLocationTypeXpath()
    {
        return "//th//span[text()='Location type']";
    }
    public static String dragColumnsWorkNumberXpath()
    {
        return "//ul//li//span[text()='Work number']";
    }
   
    public static String dragColumnsSiteXpath()
    {
        return "//th//span[text()='Site']";
    } 
    public static String dragLocationNameXpath()
    {
        return "//th//span[2][text()='Location name']/..";
    }
     public static String iconImportsXpath()
    {
        return "//i[@class='icon-import']";
    }
     public static String spanIconPlusXpath()
    {
        return "//span//i[contains(@class, 'icon-plus')]";
    } 
     public static String toolTipCircleXpath()
    {
        return "//a[@fleet-tooltip='Circle']";
    }  
     public static String manageLocationsFindAPlaceSpinnerXpath()
    {
        return "//div[@ng-hide='currentLocation']/..//div[@class='loading-overlay'][@style='display: none;']";
    }
    public static String iconPlusXpath()
    {
        return "//i[contains(@class, 'icon-plus')]";
    }  
    public static String closeXpath()
    {
        return "//a[text()='Close']";
    }
    public static String importOrganisationSpanXpath()
    {
        return "//span[text()='Import these locations into another organisation']";
    } 
    public static String updateorganisationSpanXpath()
    {
        return "//span[text()='Update existing records for this organisation']";
    }
    public static String iconDownloadAltXpath()
    {
        return "//i[@class='icon-download-alt']";
    }
    public static String textParagraphXpath()
    {
        return "//p[contains(text(), '2 types of location imports')]";
    }
    public static String iconRemoveSignXpath()
    {
        return "//button//i[@class='icon-remove-sign']";
    }
     public static String inputResetWrapperXpath()
    {
        return "//div[@class='input-reset-wrapper']//input[@type='text']";
    }
     
     //div//p[contains(text(),'Multiple locations will be deleted. Would you like to continue and delete these locations?')]
     
     //multiple "Remove button"
     public static String removeMultipleLocationsButtonXpath(String text)
     {
         return "//div[@header-title='Deleting multiple locations']//div[@class='modal-footer']//button[text()='"+text+"']";
     }
     
     public static String deleteMessageXpath(String text)
     {
         return "//div[@class='well no-margin']//h5[@class='font-normal muted ct']//span[contains(text(),'"+text+"')]";
     }
     
    public static String specificLocationCheckboxXpath()
    {
        return "//div//span[@class='ng-scope strong-grid-check-cell']//input";
    }
    
    public static String searchFilterXpath()
    {
        return "//div[@class='input-reset-wrapper']//input[@type='text']";
    }
    
    public static String locationsInUsePopUpXpath()
    {
        return "//h5[contains(text(),'Locations in use')]";
    }
    
    public static String okButtonXpath()
    {
        return "//button[@ng-show='$modal.okayButton']";
    }
    
    public static String locationPopUpMessageXpath(String text)
    {
        return "//div[@class='modal-content']//div//div[contains(text(),'"+text+"')][@ng-bind-html-unsafe='$modal.message | translate:$modal.data']";
        //return "//div[@class='modal-content']//div//div[contains(text(),'"+text+"')]";
    }
    
    public static String locationAddressXpath(String text)
    {
        return "//td//div//span[contains(text(),'"+text+"')]";
    }
    //div[@ng-hide="limitedRows.any() || loading"]//span[@class='badge ng-binding']
    //style="display: none;"
    
    public static String tableSpinnerXpath()
    {
        return "//div[@ng-show='contentLoadingStack && contentLoadingStack.length > 0'][@style='display: none;']";
    }
}