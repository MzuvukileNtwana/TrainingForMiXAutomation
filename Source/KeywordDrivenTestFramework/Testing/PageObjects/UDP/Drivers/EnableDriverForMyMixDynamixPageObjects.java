/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects.UDP.Drivers;

/**
 *
 * @author apeter
 */
public class EnableDriverForMyMixDynamixPageObjects 
{
    public static String addDriverButtonXpath()
    {
        return "//a[@fleet-tooltip='Add driver']";
    }
    public static String driverNameFieldXpath()
    {
        return "//input[@name='driverName']";
    }
    public static String siteDropdownXpath()
    {
        return "//select[@name='siteId']";
    }
    public static String saveButtonXpath()
    {
        return "//span[text()='Create new driver']/../..//button[@text='Save']";
    }
    public static String employeeNumberFieldXpath()
    {
        return "//input[@name='employeeNumber']";
    }
    public static String createDriverPageHeaderXpath()
    {
        return "//h5/span[text()='Create new driver']";
    }
    public static String driverDetailsFormHeaderXpath()
    {
        return "//legend[text()='Driver details']";
    }
    public static String driverPopUpAlertXpath()
    {
        return "//span[@id='pop-alert-message']";
    }
    public static String myMixTabXpath()
    {
        return "//li/a[text()='MyMiX']";
    }
    public static String myMixPageHeaderXpath()
    {
        return "//legend[text()='MyMiX Settings']";
    }
    public static String enableForMyMixCheckboxXpath()
    {
        return "//input[@name='driverPortalEnabled']";
    }
    public static String editDriverSaveButtonXpath()
    {
        return "//span[text()='Edit driver']/../..//button[@text='Save']";
    }
    public static String driverIdXpath()
    {
        return "//p[contains(text(),'Driver ID:')]";
    }
    public static String driverImageXpath()
    {
        return "//div[@id='fa-photo']//img";
    }
    public static String driverPortalUsernameFieldXpath()
    {
        return "//input[@name='driverPortalUsername']";
    }
    public static String temporaryPasswordFieldXpath()
    {
        return "//label[text()='Temporary password']/../input";
    }
    public static String temporaryPasswordExpiryDateFieldXpath()
    {
        return "//label[text()='Temporary password expiry date']/../input";
    }
    public static String driverPageClickableHeader()
    {
        return "//h5/a[contains(text(),'Drivers')]";
    }
    public static String actionsButtonXpath()
    {
        return "//a[@class='row-action']";
    }
    public static String removeXpath()
    {
        return "//ul[contains(@style,'block')]//span[text()='Remove']/..";
    }
    public static String removeButtonXpath()
    {
        return "//form[@name='modalForm']//button[text()='Remove']";
    }
    public static String noItemToDisplayXpath()
    {
        return "//span[text()='No items to display']";
    }
    public static String driverExistsXpath()
    {
        return "//span[text()='Driver name already in use']";
    }
    public static String newDriverXpath()
    {
        return "//span[text()='Driver name already in use']/../../span[contains(@style,'none')]";
    }

}
