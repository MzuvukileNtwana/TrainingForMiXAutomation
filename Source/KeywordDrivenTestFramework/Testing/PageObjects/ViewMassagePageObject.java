/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects;

/**
 *
 * @author arala
 */
public class ViewMassagePageObject {
   public static String MonitorMenuRelativeXpath() 
    {
        return "//a[text()='MONITOR ']";
    }
    public static String MessageBoxRelativeXpath() 
    {
        return "//a[text()='Message box']";
    }
   public static String CreatNEWRelativeXpath() 
    {
        return "//span[text()='CREATE NEW']";
    }
    public static String SentItemsRelativeXpath() 
    {
        return "//a[text()='Sent items']";
    }
    public static String ActionButtonRelativeXpath() 
    {
  
        return "//div[@ng-show='rowActions']/ul/li[2]/div/div/a[@fleet-tooltip='Actions']";
    }
    public static String ViewRelativeXpath() 
    {
        return "//div[@ng-show='rowActions']/ul/li[2]/div/div/a[@fleet-tooltip='Actions']/../../../../../../../../../../../../../../../../../../../../../../..//ul[3]/li//a/span[text()='View']";
    }
    public static String EditRelativeXpath() 
    {
        return "//div[@ng-show='rowActions']/ul/li[2]/div/div/a[@fleet-tooltip='Actions']/../../../../../../../../../../../../../../../../../../../../../../..//ul[contains(@style,'block')]/li[1]/a/span[text()='Edit']";
    }
    
    //ul[@class='dropdown-menu pull-right']//span[text()='Remove']
    //ul[contains(@style,'block')]//span[text()='Remove']
    public static String RemoveDraft()
    {
        return "//ul[contains(@style,'block')]//span[text()='Remove']";
    }
     public static String RemoveRelativeXpath() 
    {
        return "  //div[@ng-show='rowActions']/ul/li[2]/div/div/a[@fleet-tooltip='Actions']/../../../../../../../../../../../../../../../../../../../../../../..//ul[contains(@style,'block')]/li[3]/a/span[text()='Remove']";
    }
    
    public static String FromRelativeXpath() 
    {
        return "//h5[text()='From:']/../../td[2]";
    }
    public static String SubjectRelativeXpath() 
    {
        return "//td/h5[text()='Subject:']/../../td[2]";
    }
    public static String ToRelativeXpath() 
    {
        return "//td/strong[text()='To:']/../../td[2]";
    }
    public static String StatusChangedToRelativeXpath() 
    {
        return "//span[text()='Status changed to ']/strong";
    }
    public static String statusRelativeXpath() 
    {
        return "//div[@class='btn-group pull-right']/span[@class='badge badge-success access-control-green mr-5 ng-binding']";
    }
    public static String ReplyIconRelativeXpath() 
    {
        return "//button[@class='btn btn-small dropdown-toggle']";
    }
    public static String ReplyRelativeXpath() 
    {
        return "//button[@class='btn btn-small dropdown-toggle']/../ul/li/a[text()='Reply']";
    }
        
    public static String CancelRelativeXpath() 
    {
        return "//div[@class='selection-btn-right pull-right']/button[text()='Cancel']";
    }
        
    public static String CREATENEWRelativeXpath() 
    {
        return "//span[text()='CREATE NEW']";
    }
       
    public static String MessageDetailsRelativeXpath() 
    {
        return "//div/legend[text()='Message details']";
    }
    public static String ForwardRelativeXpath() 
    {
        return "//button[@class='btn btn-small dropdown-toggle']/../ul/li/a[text()='Forward']";
    }
    public static String ChangesNotSavedRelativeXpath() 
    {
        return "//div/h5[text()='Create new message']";
    }
     public static String creatNewMessageRelativeXpath() 
    {
        return "//h5[text()='Changes not saved']";
    }
      public static String yesButtonRelativeXpath() 
    {
        return "//button[text()='Yes']";
    }
      public static String clickCancelRelativeXpath() 
    {
        return "//h5[text()='Edit job']/..//button[text()='Cancel'] ";
    }
      public static String ChangesNotSaveRelativeXpath() 
    {
        return "//h5[text()='Changes not saved']";
    }
      public static String clickYesRelativeXpath() 
    {
        return "//div[text()='Are you sure you would like to discard your changes?']/../../../../../div[@class='modal-footer']/div/button[text()='Yes']";
    }
         public static String RemovingTextDisplayedRelativeXpath() 
    {
        return "//p[text()='Removing a job draft will remove it from the message box and will make it unavailable to send to the display device. Please confirm that you would like to proceed.']";
    }
            public static String ContinueRelativeXpath() 
    {
        return "//button[text()='Continue']";
    }
               public static String removePopUpAlertRelativeXpath() 
    {
        return "//span[@id='pop-alert-message']";
    }
    public static String columnChooserULXpath()
    {
        return "//ul[contains(@class, 'column-chooser-dropdown')][contains(@style, 'block')]";
    }
    public static String columnChooserXpath()
    {
        return "//div[@class='row-actions']//a[@ng-click='toggleColumnChooser($event)']";
    }
    public static String columnChooserXpath(String ColumnName)
    {
        return "//span[text()='"+ColumnName+"']/../span[@ng-hide='column.visible']/../..//a";
    }
      /*
      
      SeleniumDriverInstance.waitForElementByXpath("//p[text()='Removing a job draft will remove it from the message box and will make it unavailable to send to the display device. Please confirm that you would like to proceed.']");
            if (!SeleniumDriverInstance.clickElementbyXpath("//button[text()='Continue']"))
            {
                err.println("[ERROR] Failed to click Continue");
                return false;
            }
            SeleniumDriverInstance.waitForElementByXpath("//span[@id='pop-alert-message']");
      */
        
}
