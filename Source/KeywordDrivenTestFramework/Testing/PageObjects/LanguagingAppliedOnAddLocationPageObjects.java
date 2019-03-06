/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects;

/**
 *
 * @author elebese
 */
public class LanguagingAppliedOnAddLocationPageObjects 
{
    public static String AddLocationXpath()
    {
        return "//i[@class='icon-plus icon-white']/..";
    }
    
    public static String CancelButtonXpath()
    {
        return "//div[@class='pull-right']/button[text()='Ancelcay']";
    }
    
    public static String CancelButtonLocationDetailsXpath()
    {
        return "//div[@class='modal-footer']/button[text()='Ancelcay']";
    }
    
    public static String SaveButtonXpath()
    {
        return "//div[@class='pull-right']/button[text()='Avesay']";
    }
    
    public static String SaveButtonLocationDetailsXpath()
    {
        return "//div[@class='modal-footer']/button[text()='Ubmitsay']";
    }
    
    public static String LocationNameXpath()
    {
        return "//span[text()='Ocationlay amenay']/../../input";
    }
    
    public static String LocationNameTextBoxWarningXpath()
    {
        return "//span[text()='Ocationlay amenay']/../../span[text()='Isthay ieldfay isway equiredray']";
    }
    
    public static String SiteXpath()
    {
        return "//span[text()='Itesay']/../../select";
    }
    
    public static String ColourChooser()
    {
        return "//a[@style='background: black;']";
    }
    
    public static String ColourChooserFirefoxXpath()
    {
        return "//a[@style='background: Black none repeat scroll 0% 0%;']";
    }
    
    public static String OpacityXpath()
    {
        return "//a[@class='ui-slider-handle ui-state-default ui-corner-all']";
    }
    
    public static String NotifyMeXpath()
    {
        return "//div/label[@class='checkbox pull-left']/input";
    }
    
    public static String LocationDetailsXpath()
    {
        return "//a[text()='Ocationslay etailsday']";
    }
    
    public static String SiteSubMenuXpath()
    {
        return "//span[text()='Itesay']/../../select/option[text()='Efaultday Itesay']";
    }
    
    public static String LocationTypeDropboxXpath(String index)
    {
        return "//span[text()='Ocationlay ypetay']/../../select/option[text()='"+index+"']";
    }
    
    public static String LocationTypeDropboxXpath()
    {
        return "//span[text()='Ocationlay ypetay']/../../select";
    }
    
    public static String LocationTypeSubMenuXpath()
    {
        return "//span[text()='Ocationlay ypetay']/../../select/option[text()='Itesay']";
    }
    
    public static String SiteTextboxWarningXpath()
    {
        return "//span[text()='Itesay']/../../span[text()='Isthay ieldfay isway equiredray']";
    }
    
    public static String LabelTwoXpath(String labelText)
    {
        return "//label[text()='"+ labelText +"']";
    }
    
    public static String InputTextXpath(String labelText)
    {
        return "//label[text()='"+ labelText +"']/../input";
    }
    
    public static String LabelXpath(String LabelText)
    {
        return "//span[text()='"+ LabelText +"']";
    }
    public static String FindAPlaceXpath()
    {
        return "//span[text()='Indfay away aceplay']";
    }
    
      
    public static String PreviousMapSelectedXpath()
    {
        return "//select[@class='input-medium ng-pristine ng-valid']";
    }
    
    public static String BackButtonXpath()
    {
        return "//span[text()='Ackbay otay ocationlay istlay']";
    }
    public static String ByXpath()
    {
        return "//strong[text()='Ybay:']";
    }
    
    public static String AddressXpath()
    {
        return "//span[text()='Anway addressway']";
    }
    
    public static String latitudeLongitudeXpath()
    {
        return "//span[text()='Away atitudelay/ongitudelay']";
    }
    
    public static String infoIconXpath()
    {
        return "//i[@class='icon-info-sign icon-grey']/..";
    }
    
    public static String ToolTipTextXpath(String text)
    {
        return "//span[text()='"+ text +"']";
    }
    
    
    
    public static String ShapesXpath(String className)
    {
        return "//i[@class='"+className+"']";
    }
}
