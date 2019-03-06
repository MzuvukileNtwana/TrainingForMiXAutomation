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
public class MultiDeleteLinkedLocationPageObject {
    
    public static String locationTypeXpath()
    {
        return "//span[text()='Location type']/../../select//option";
    }
    
    public static String siteTypeXpath()
    {
        return "//span[text()='Site']/../../select//option";
    }
    
    public static String manageLinkXpath()
    {
        return "//a[text()='MANAGE ']";
    }
    
    public static String librariesLinkXpath()
    {
        return "//h4[text()='CONFIG ADMIN']/..//a[text()='Libraries']";
    }
    
    public static String librariesPageHeaderXpath()
    {
        return "//h5/span[text()='Libraries']";
    }
    
    public static String locationLibraryTabXpath()
    {
        return "//a[text()='Location library']";
    }
    
    public static String filterTextBoxXpath()
    {
        return "//input[contains(@class, 'filter-search')]";
    }
    
    public static String actionsButtonXpath()
    {
        return "//a[@class='btn-actions']";
    }
    
    public static String makeAvailableXpath()
    {
        return "//span[text()='Make available']/..";
    }
    
    public static String locationSuccessfullyMadeAvailableXpath()
    {
        return "//span[text()='Location is now available']";
    }
    
    public static String locationOnLibraryGridXpath(String locationName)
    {
        return "//span[text()='" + locationName + "']/..";
    }
    
    public static String validateLocationOnLibraryGridXpath(String locationName)
    {
        return "//span[text()='" + locationName + "']";
    }
    
    public static String sendActiveMessageCheckBoxXpath()
    {
        return "//span[text()='Send active message based on excessive speed']/../input";
    }
    
    public static String availableMissingParamsTextXpath()
    {
        return "//span[text()='Available - Missing parameters']";
    }
    
    //  <editor-fold defaultstate="collapsed" desc="Fill in missing parameters">
    
    public static String overSpeedTextboxXpath()
    {
        return "//span[text()='Over speeding value']/../..//input";
    }
    
    public static String allowBufferOfTextboxXpath()
    {
        return "//span[text()='Allow a buffer of']/../..//input";
    }
    
    public static String warningDelayMinutesTextboxXpath()
    {
        return "//label[text()='Warning delay']/..//div[text()='Minutes']/..//input";
    }
    
    public static String warningDelaySecondsTextboxXpath()
    {
        return "//label[text()='Warning delay']/..//div[text()='Seconds']/..//input";
    }
    
    public static String recordingDelayMinutesTextboxXpath()
    {
        return "//label[text()='Recording delay']/..//div[text()='Minutes']/..//input";
    }
    
    public static String recordingDelaySecondsTextboxXpath()
    {
        return "//label[text()='Recording delay']/..//div[text()='Seconds']/..//input";
    }
    
    public static String sendActiveMessageTextBoxXpath()
    {
        return "//div[@class='well well-small well-white']/div[@class='form-inline']/input";
    }
    
    public static String editLocationButtonSaveXpath()
    {
        return "//button[text()='Save']";
    }
    
    public static String locationDisplayedOnLibraryPageXpath(String locationName)
    {
        return "//span[text()='" + locationName + "']";
    }
    
    //  </editor-fold>
    
    //  <editor-fold defaultstate="collapsed" desc="Remove location">
    
    public static String removeLocationPopupHeaderXpath()
    {
        return "//span[text()='Remove location']";
    }
    
    public static String cancelButtonXpath()
    {
        return "//div[@class='modal hide fade ng-scope modal-mini in']//button[text()='Cancel']";
    }
    
    public static String locationInUsePopupXpath()
    {        
        return "//h5[text()='Location in use']";
    }
    
    public static String locationInUseButtonOKXpath()
    {
        return "//div[@title-class='alert-error']//button[text()='OK']";
    }
    
    public static String locationInUseWarningButtonOKXpath()
    {
        return "//div[@title-class='alert-warning']//button[text()='OK']";
    }
    
    public static String deleteMultipleLocationsPopupHeaderXpath()
    {
        return "//span[text()='Deleting multiple locations']";
    }
    
    public static String locationCheckBoxXpath(String locationName)
    {
        return "//span[text()='" + locationName + "']/../../../..//span/input";
    }
    
    public static String removeLocationTrashButtonXpath()
    {
        return "//i[@class='icon-trash']/..";
    }
    
    public static String makeUnavailableLinkXpath()
    {
        return "//span[text()='Make unavailable']/..";
    }
    
    public static String availableTextXpath()
    {
        return "//span[text()='Available']";
    }
    
    public static String successfullyRemovedLocationXpath()
    {
        return "//span[text()='Location removed successfully']";
    }
    
    // </editor-fold>
}
