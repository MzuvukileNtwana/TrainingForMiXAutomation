/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects.Manage.Operation.OrganisationSettings;

import KeywordDrivenTestFramework.Core.BaseClass;

/**
 *
 * @author smncwabe
 */
public class IridiumAirtimeContractsAccessAndUpdatePermissiontPageObjects extends  BaseClass{
    
    public static String OrganisationSettingsLinkXpath(){
     return "//li/a[text()='Organisation settings']";
    }
    
    public static String SpinnerXpath(){
        return "//div[@class='loading-overlay ng-scope'][@style='display: none;']";
    }
    
    //tab Driver defaults
    public static String DriverDefaultsTabXpath(){
        return "//ul/li/a[text()='Driver defaults']";
    }
    
    public static String AssetIntervalReminderDefaultsTabXpath(){
        return "//ul/li/a[text()='Asset interval and reminder defaults']";
    }
    
    public static String SaveButtonXpath(){
        return "//Button[@class='btn-wide btn-small btn-success btn ng-scope ng-binding'][text()='Save']";
    }
    
    public static String CostCategoriesLinkXpath(){
        return "//ul/li/a[text()='Cost categories']";
    }
    
    public static String CostCategoriesGridXpath(){
        //return "//table/thead/tr/th";
        return "//table[@class='table table-scroll table-condensed table-list no-text-clip']/thead/tr//th[contains(@class,'column-heading')]";
    }
    
    public static String AddCategoryButtonXpath(){
        return "//div/span//a[text()='Add category']";
    }
    
    public static String CategoryNameInputXpath(){
        return "//div[@class='control-group']//label/span[text()='Category name']/../../input";
    }
    
    public static String CategoryTypeDropDownXpath(){
        return "//div[@class='span6']//select";
    }
    
    
    public static String DefaultMemoTextAreaXpath(){
        return "//div[@class='span12']//textarea";
    }
    
    public static String PopUpXpath(){
        return "//div/span[text()='Organisation updated successfully']";
    }
    
    public static String GridcategoryNameXpath(){
        return "//tbody/tr/td[@column-field='description']";
        //return "//tbody/tr/td[2]";
    }
    
    public static String ActionButtonRowXpath(){
        return "//div[@ng-show=\"rowActions\"]/ul//li";
    }
    
    public static String ActionButtonByIndexXpath(String rowIndex)
    {
        return "//div[@ng-show=\"rowActions\"]/ul//li[@ng-show]["+rowIndex+"]/div/div/a";
    }
    
    
    public static String RemoveLinkXpath(){
        return "//ul/li/a//span[text()='Remove']";
    }
    
    public static String RemoveButtonPopUpXpath(){
        return "//button[text()='Remove']";
    }
    
    //IridiumAirtime
    
    public static String ValidateTabsXpath(String tabName){
        return "//a[text()='"+tabName+"']/..";
    }
     
    public static String IridiumPageheader(){
        return "//h5[text()='Iridium airtime contracts']";
    }
    
    public static String AirtimeContractXpath(){
        return "//strong[text()='1']/../../a[1]";
    }
    
    public static String IridiumAirtimeContractXpath(){
        //return "//strong[text()='1']/../../a/../span[text()='Iridium airtime contract']";
        return "//strong[text()='1']/../../a/../span[text()='Iridium airtime contract']/..";
    }
    
    public static String ParagraphXpath() 
    {
        return "//p[text()='The airtime contract '][text()=' is currently in use by:']/strong";
    }
    
    public static String IridiumAirtimeSelectedXpath(){
        return "//p[contains(text(), 'The airtime contract ')]/strong";
    }
    
    public static String NumberOfAssestsXpath(){
        return "//a[contains(text(), 'assets')]";
    }
    
    public static String XbuttonXpath(){
        return "//button[@class='close']/../h5/span[text()='Airtime contract in use']/../../button";
    }
    
    public static String CloseButtonXpath(){
        return "//button[text()='Close']";
    }
   
   public static String SelectContractXpath(){
       return "//a[text()='Click to select contract']";
   }
   
   public static String SelectContactHeadingXpath(){
       return "//span[text()='Select contract']";
   }
   
   public static String CountractTypeDropDownXpath(){
       return "//select[@ng-model='contractModalTemplate.contractTypeId']";
   }
   
    public static String CountractDropDownXpath(){
       return "//select[@ng-model='contractModalTemplate.contractId']";
   }
     
   public static String ContractspinnerXpath(){
       return "//div[@class=\"modal-body\"]/div/div/div/div[@class=\"loading-overlay ng-scope\"][@style=\"display: none;\"]";
   }
   
   public static String SelectContractButtonXpath(){
       return "//button[text()='Select']";
   }
   
   public static String NewAddedIridiumXpath(String contract){
       return "//a[text()='"+contract+"']";
   }
   
   public static String RemoveTheNewAddedIridiumXpath(String contract){
       return "//a[text()='"+contract+"']/../a[@ng-click=\"removeContract(contract)\"]/i";
   }
   
   public static String ConfirmTextXpath(){
       return "//p[text()='This action will remove this contract from the available contract list. Are you sure you would like to continue?']";
   }
   
   public static String CancelButtonXpath(){
       return " //div[@class='modal hide fade modal-mini in']/div/button[text()='Cancel']";
   }
   
   public static String RemoveButtonXpath(){
       return "//div[@class='modal hide fade modal-mini in']/div/button[text()='Remove']";
   }
   
   
  
   
}
