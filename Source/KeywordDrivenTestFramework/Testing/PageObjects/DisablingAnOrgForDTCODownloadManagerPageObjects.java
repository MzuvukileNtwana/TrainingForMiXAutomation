/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects;

/**
 *
 * @author apeter
 */
public class DisablingAnOrgForDTCODownloadManagerPageObjects 
{
    public static String enableDTCODownloadManagerCheckboxXpath()
    {
        return "//span[text()='Enable DTCO Download Manager']/../input";
    }
    public static String saveButtonXpath()
    {
        return "//button[@text='Save']";
    }
    public static String onScreenMessagePart1Xpath()
    {
        return "//div[@id='dtco-attention']/h3";
    }
    public static String onScreenMessagePart2Xpath()
    {
        return "//div[@id='dtco-attention']/h4";
    }
    public static String AuthenticationServiceTabXpath()
    {
        return "//a[text()='Authentication service']";
    }
    public static String organisationDetailsSpinnerXpath()
    {
        return "//div[@class='tab-pane active ng-scope']/div[contains(@class,'loading-overlay')][contains(@style,'none')]";
    }
    public static String activeOrganisationSpinnerXpath()
    {
        return "//div[@class='row-fluid']/div[@class='loading-overlay ng-scope'][@style='display: none;']";
    }
    public static String successfullyUpdatedSpanXpath()
    {
        return "//div//span[text()='Organisation updated successfully']";
    }
}
