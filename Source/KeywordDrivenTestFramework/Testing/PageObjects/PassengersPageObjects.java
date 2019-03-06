/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package KeywordDrivenTestFramework.Testing.PageObjects;

/**
 *
 * @author lmkhontwana
 */
public class PassengersPageObjects {
    
    
     public static String PassengersSubMenuRelativeXpath() 
    {
        return "//a[text()='Passengers']";
    }
    
     public static String AddSitebtnXpath() 
    {
        return "//a[contains(@class, 'btn-success dropdown-toggle')]";
    }
     
     public static String SiteXpath() 
    {
        return "//a[text()='Site']";
    }
     
     public static String SiteNameXpath() 
    {
        return "//input[contains(@name,'siteName')]";
    }
     
      public static String SavebtnXpath() 
    {
        return "//button[text()='Save']";
    }
      
    public static String ErrorXpath() 
    {
        return "//div[@class='modal-inner-body white-box-padding']//div[@class='alert alert-error']";
    }
    public static String filterBoxXpath() 
    {
        return "//input[@placeholder=\"Filter\"]";
    }
    public static String columnNameOnColumnChooserXpath(String column) 
    {
        return "//ul[contains(@class, 'column-choose')][contains(@style,'block')]//span[text()='" + column + "']/..";
    }
    
    public static String OkXpath() 
    {
        return "//button[text()='OK']";
    }
     
     public static String AddPassengerButtonRelativeXpath() 
    {
        return "//a[@fleet-tooltip='Add passenger']";
    } 
     public static String LastRefreshTimeRelativeXpath() 
    {
        return "//span[@class='last-refresh-timer']/span";
    }
     
     public static String RefreshButtonRelativeXpath() 
    {
        return "//a/span[text()='Refresh']";
    }
     
     public static String PassengersTablRelativeXpath() 
    {
        return "//div[@id-property=\"'passengerId'\"]//table";
    }
     
      public static String ExportPassengersButtonRelativeXpath() 
    {
        return "//a[@fleet-tooltip='Export passengers']";
    }
      public static String GetSelectedOrganisationRelativeXpath() 
    {
        return " //div[@class='column ps-container ps-active-y']//a[@class='ng-scope active selected']//span[contains(@ui-if,'item.name')]";
    } 
      
      public static String DownloadImportTemplatedPassengersButtonRelativeXpath() 
    {
        return "//a[@fleet-tooltip='Download import template']";
    }
     public static String PassengersImportNewRecordsRadioButtonRelativeXpath() 
    {
        return "//div[@class='modal hide fade hidden-phone modal-mini in']//form[@name='modalForm']//input[@value='importNewRecords']";
    }
     public static String PassengersUpdateExistingRecordsRadioButtonRelativeXpath() 
    {
        return "//div[@class='modal hide fade hidden-phone modal-mini in']//form[@name='modalForm']//input[@value='updateExistingRecords']";
    }
      public static String PassengersTemplateDownloadButtonRelativeXpath() 
    {
        return "//div[@class='modal hide fade hidden-phone modal-mini in']//form[@name='modalForm']//a[text()='Download']";
    }
      public static String PassengersTemplateCancelButtonRelativeXpath() 
    {
        return "//div[@class='modal hide fade hidden-phone modal-mini in']//form[@name='modalForm']//a[text()='Cancel']";
    }
      public static String PassengersTemplateCloseButtonRelativeXpath() 
    {
        return "//div[@class='modal hide fade hidden-phone modal-mini in']//form[@name='modalForm']//button[@class='close']";
    }
     public static String ModalBackdropRelativeXpath() 
    {
      return "//div[@class='modal-backdrop fade in']";
    }
      public static String AddFuelEntryDateInputRelativeXpath() 
    {
      return "//div[@name='date']/input";
    }
       public static String AddFuelEntryVolumeInputRelativeXpath() 
    {
      return "//input[@name='volume']";
    }
        public static String FuelEntrySavedRelativeXpathText() 
    {
        return "//span[text()='Fuel entry saved successfully']";
    }
        public static String MeasureMenuRelativeXpath() 
    {
        return "//a[text()='MEASURE ']";
    }
        public static String ReportsSubMenuRelativeXpath() 
    {
        return "//a[text()='Reports']";
    }
    
     public static String ReportCategorySelectRelativeXpath() 
    {
        return "//select[@ng-model='$controller.currentFolder']";
    }
     public static String SelectFuelReportRelativeXpath() 
    {
        return "//option[text()='Fuel Reports']";
    } 
     public static String EnteredFuelReportRelativeXpath() 
    {
        return "//td//span[text()='Entered Fuel Report']";
    }    
    public static String ExpandSiteAssetsRelativeXpath() 
    {
        return "//li[@class='ng-scope']//span[contains(@ng-click,'item.expanded')]";
                
    } 
     public static String SelectAssetOnTreeRelativeXpath(String regNo) 
    {
        return "//li//span[contains(text(),'"+regNo+"')]";
    } 
     public static String ReportNextButtonXpath() 
    {
        return "//div[@class='selection-btn-right pull-right']/button[text()='Next']";
    }
     
     public static String ReportPeriodSelectRelativeXpath() 
    {
        return "//select[@ng-model='$controller.currentPage.selectedDateRange']";
    }
     public static String ReportPeriodOptionRelativeXpath(String period) 
    {
        return "//option[text()='"+period+"']";
    } 
     
     public static String ReportActionSelectRelativeXpath() 
    {
        return "//span[@class='report-parameter']//select";
    }
     public static String ReportActionOptionRelativeXpath(String option) 
    {
        return "//option[text()='"+option+"']";
    } 
     public static String ReportRunButtonXpath() 
    {
        return "//div[@class='selection-btn-right pull-right']/button[text()='Run']";
    }  
      public static String ExpandIconSpanXpath() 
    {
        return "//span[contains(@class,' icon-plus')]";
    }
      public static String CollapseIconSpanXpath() 
    {
        return "//span[contains(@class,' icon-minus')]";
    }  
      public static String SiteListUlXpath() 
    {
        return "//ul[@class='fleet-strong-tree daredevel-tree tree full-block ng-scope'][@fleet-draggable-group='draggable']//ul";
    }
      public static String getSiteOnListXpath(String siteName) 
    {
        return "//div[@item='item']//span[text()='"+siteName+"']";
    }  
       public static String MergeSitesHeaderTextXpath() 
    {
        return "//h5[text()='Merge sites']";
    }  
    
    public static String MergeSiteCancelButtonRelativeXpath() 
    {
        return "//div[@class='modal hide fade hidden-phone modal-mini in']//form[@name='modalForm']//button[text()='Cancel']";
    }
    public static String MergeSiteMergeButtonRelativeXpath() 
    {
        return "//div[@class='modal hide fade hidden-phone modal-mini in']//form[@name='modalForm']//button[text()='Merge']";
    }
    public static String SitesMergedSuccessfullyTextXpath() 
    {
        return "//span[text()='Sites merged']";
    }  
    public static String unorderedListColumnChooserXpath() 
    {
        return "//ul[contains(@class, 'column-choose')][contains(@style,'block')]";
    }  
     
    public static String getSiteDetailsOnListXpath(String siteName) 
    {
        return "//div[@item='item']//span[text()='"+siteName+"']/..";
    }  
    
    public static String ColumnChooserButtonRelativeXpath() 
    {
        return "//div/ul/li/a/i[@class='icon-choose-columns']";
    }
    public static String passengerIDFromColumnSelector(){
        return "//ul[@class='dropdown-menu pull-right column-chooser-dropdown'] [contains(@style,'block')]//span[text()='Passenger ID']/..";
    }
    
    public static String mobileNumberFromColumnSelector(){
        return "//ul[@class='dropdown-menu pull-right column-chooser-dropdown'] [contains(@style,'block')]//span[text()='Mobile number']/..";
    }
    
    public static String emailAddressFromColumnSelector(){
        return "//ul[@class='dropdown-menu pull-right column-chooser-dropdown'] [contains(@style,'block')]//span[text()='Email address']/..";
    }
    
    public static String PassengersHeaderLabelRelativeXpathText() {
        return "//h5/span[text()='Passengers']";
    }
    public static String waitForPassengerLoadingSpinner() {
        return "//div[@class=\"span12 full-height\"]/div[@class=\"loading-overlay ng-scope\"][@style=\"display: none;\"]";
    }
    public static String columnChooserULXpath()
    {
        return "//ul[contains(@class, 'column-chooser-dropdown')][contains(@style, 'block')]";
    }
    public static String columnChoosersXpath()
    {
        return "//div[@class='row-actions']//a[@ng-click='toggleColumnChooser($event)']";
    }
    public static String columnChooserXpath(){
        return "//a[@class='btn btn-small column-chooser']";
    }
    public static String columnChooserXpath(String ColumnName)
    {
        return "//span[text()='"+ColumnName+"']/../span[@ng-hide='column.visible']/../..//a";
    }
}
