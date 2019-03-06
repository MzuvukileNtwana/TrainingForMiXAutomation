/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects;

/**
 *
 * @author sscholtz
 */
public class UsabilityOfEventsScreenForEventTypeDurationAtLocationPageObject {
    
    
    public static String PageHeaderCheck()
    {
        return "//div[@class='page-header']/ul/li/strong";
    }
    
    public static String AddServerSideEventButton()
    {
        return "//div[@class='pull-right selection-btn-right']/a";
    }
    
    public static String PageHeaderCreateNewEvents()
    {
        return "//div[@class='page-header-jm']/h5/span[text()='Create new event']";
    }
    
    public static String EventDescription()
    {
        return "//div[@class='span6']/input";
    }
    
    public static String ClickRecordEventForDropDown()
    {
        return "//div[@class='control-group']/select";
    }
    
    public static String SelectRecordEventForDropDown()
    {
        return "//div[@class='control-group']/select/option[text()='Both']";
    }
    
    public static String ClickNextButton()
    {
        return "//div[@class='selection-btn-right pull-right ml-10']/a";
    }
    
    public static String AssetHeading()
    {
        return "//div[@ng-show=\"$controller.pageData.serverSideEventDetails.assetsDrivers == 'Assets' || $controller.pageData.serverSideEventDetails.assetsDrivers == 'Both'\"]/h5";
    }
    
    public static String buttonAssetGroup(){
        return "//h5[text()='Assets']/../div[contains(@class,'well')]/div/div/div/ul/li[1]/div/div/a";
    }
    
    public static String buttonDriverGroup(){
        return "//h5[text()='Drivers']/../div[contains(@class,'well')]/div/div/div/div/ul/li[1]/div/div/a";
    }
    
    public static String ClickEventDropDown()
    {
        return "//div[@class='control-group span6']/select";
    }
    
    public static String SelectDropDownEventTypeOption(String text)
    {
        return "//div[@class='control-group span6']/select/option[text()='"+ text +"']";
    }
    
    
    public static String RecordEventParagraphCheck()
    {
        return "//div[@class='control-group']/label[text()='Record event when the asset or driver selected has been at selected locations']";
    }
    
    public static String ClickLocationButton()
    {
        return "//button [text()='Select locations']";
    }
    
    public static String ForLongerThanCheck()
    {
        return "//div[@class='text-tags']/../../../../../div[@class='control-group mt-10']/label[text()='For longer than']";
    }
    
    public static String MinutesCheck()
    {
        return "//label/input[@class='input-mini ng-pristine ng-valid ng-valid-dmx-integer ng-valid-number ng-valid-dmx-greater-than ng-valid-dmx-less-than']/../span[text()='minutes']";
    }
    
    public static String SaveButtonDisabledCheck()
    {
        return "//div[@class='selection-btn-right pull-right ml-10']/a[@disabled='disabled']";
    }
}
