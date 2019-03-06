/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.TestClasses.Utilities;

import KeywordDrivenTestFramework.Core.BaseClass;
import static KeywordDrivenTestFramework.Core.BaseClass.SeleniumDriverInstance;
import KeywordDrivenTestFramework.Entities.Enums;
import KeywordDrivenTestFramework.Entities.TestEntity;
import KeywordDrivenTestFramework.Entities.TestResult;
import KeywordDrivenTestFramework.Testing.PageObjects.AssetsPageObjects;
import KeywordDrivenTestFramework.Testing.PageObjects.navigateToDatabaseAdminPageObjects;
import static java.lang.System.err;

/**
 *
 * @author elebese
 */
public class SelectMapTypeLanguaged extends BaseClass
{
    TestEntity testData;
    int counter = 1;

    public SelectMapTypeLanguaged(TestEntity testData) 
    {
        this.testData = testData;
    }
    
    
    
    public TestResult executeTest() 
    {

        this.setStartTime();
         if(!navigateToDatabaseAdmin())
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to Changed mapType", true);
            counter++;
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to Changed mapType", this.getTotalExecutionTime());
        }
        return new TestResult(testData, Enums.ResultStatus.PASS, "Successfully Changed mapType ", this.getTotalExecutionTime());
    }
    
    private boolean navigateToDatabaseAdmin()
    {
        if(!SeleniumDriverInstance.waitForElementByXpath(AssetsPageObjects.TableLoadingSpinnerXpath(),15))
        {
           err.println("[ERROR] Failed to validate refresh button");
           return false; 
        }
        if(!SeleniumDriverInstance.waitForElementByXpath(navigateToDatabaseAdminPageObjects.ManageLanguaged()))
        {
            err.println("[ERROR] Failed to validate manage header");
            return false;
        }
        
        if(!SeleniumDriverInstance.clickElementByXpath(navigateToDatabaseAdminPageObjects.ManageLanguaged()))
        {
            err.println("[ERROR] Failed to click manage header");
            return false;
        }
        pause(1500);
        if(!SeleniumDriverInstance.clickElementByXpath(navigateToDatabaseAdminPageObjects.DataBaseAdminLanguaged()))
        {
            err.println("[ERROR] Failed to click database admin");
            return false;
        }
        
        if(!SeleniumDriverInstance.waitForElementByXpath(navigateToDatabaseAdminPageObjects.DataBaseAdminHeaderLanguaged()))
        {
            err.println("[ERROR] Failed to validate database admin page");
            return false;
        }
        
        if(!SeleniumDriverInstance.clickElementByXpath(navigateToDatabaseAdminPageObjects.GroupNameLink()))
        {
            err.println("[ERROR] Failed to click collapse group");
            return false;
        }
        
         if(!SeleniumDriverInstance.waitForElementByXpath(navigateToDatabaseAdminPageObjects.OrganisationGroup()))
        {
            err.println("[ERROR] Failed to validate group");
            return false;
        }
       
        if(!SeleniumDriverInstance.clickElementByXpath(navigateToDatabaseAdminPageObjects.OrganisationGroup()))
        {
            err.println("[ERROR] Failed to click group");
            return false;
        }
        
        if(!SeleniumDriverInstance.waitForElementByXpath(navigateToDatabaseAdminPageObjects.mapSettingsLanguaged()))
        {
            err.println("[ERROR] Failed to validate map settings");
            return false;
        }
        
        if(!SeleniumDriverInstance.clickElementByXpath(navigateToDatabaseAdminPageObjects.mapSettingsLanguaged()))
        {
            err.println("[ERROR] Failed to click map settings");
            return false;
        }
        
        if(!SeleniumDriverInstance.waitForElementByXpath(navigateToDatabaseAdminPageObjects.mapSettingsHeaderLanguaged()))
        {
            err.println("[ERROR] Failed to validate map settings header");
            return false;
        }
        String mapType = SeleniumDriverInstance.retrieveSelectedText(navigateToDatabaseAdminPageObjects.mapProviderLanguaged());
        if(!mapType.equalsIgnoreCase("decarta"))
        {
            pause(1500);
            if(!SeleniumDriverInstance.selectByValueFromDropDownListUsingXpath(navigateToDatabaseAdminPageObjects.mapProviderLanguaged(),testData.getData("MapType")))
            {
                err.println("[ERROR] Failed to select map provider");
                return false;
            }

            if(!SeleniumDriverInstance.selectByValueFromDropDownListUsingXpath(navigateToDatabaseAdminPageObjects.SetelliteMapProviderLanguaged(),testData.getData("SatelliteMapType")))
            {
                err.println("[ERROR] Failed to select satellite map provider");
                return false;
            }

            if(!SeleniumDriverInstance.selectByValueFromDropDownListUsingXpath(navigateToDatabaseAdminPageObjects.defaultMapViewLanguaged(),testData.getData("DefaultMapView")))
            {
                err.println("[ERROR] Failed to select default map view");
                return false;
            }

            if(!SeleniumDriverInstance.clickElementByXpath(navigateToDatabaseAdminPageObjects.SaveButtonLanguaged()))
            {
                err.println("[ERROR] Failed to click Save");
                return false;
            }
        }
        
        return true;
    }
}
