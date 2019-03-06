/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.TestClasses.NavigateTestClasses;

import KeywordDrivenTestFramework.Core.BaseClass;
import static KeywordDrivenTestFramework.Core.BaseClass.SeleniumDriverInstance;
import KeywordDrivenTestFramework.Entities.Enums;
import KeywordDrivenTestFramework.Entities.TestEntity;
import KeywordDrivenTestFramework.Entities.TestResult;
import KeywordDrivenTestFramework.Testing.PageObjects.SendStopActiveTrackingCommandPageObjects;

/**
 *
 * @author sscholtz
 */
public class NavigateToConfigurationGroups extends BaseClass{
    
      int counter = 1;
    TestEntity testData;
    
    public NavigateToConfigurationGroups(TestEntity testData) 
    {
        this.testData = testData;
    }
    
    public TestResult executeTest()
    {
        this.setStartTime();
        
            if(!NavigateToConfigGroups())
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to navigate to Configuration Groups", true);
            counter++;
            return new TestResult(testData, Enums.ResultStatus.FAIL, " Failed to navigate to Configuration Groups", this.getTotalExecutionTime());
        }

        return new TestResult(testData, Enums.ResultStatus.PASS, "Successfully navigated to Configuration Groups", this.getTotalExecutionTime());
    }
    
    public boolean NavigateToConfigGroups()
    {
        if (!SeleniumDriverInstance.waitForElementByXpath(SendStopActiveTrackingCommandPageObjects.ManageTab()))
        {
            return false;
        }
        if (!SeleniumDriverInstance.clickElementByXpath(SendStopActiveTrackingCommandPageObjects.ManageTab()))
        {
            return false;
        }
            SeleniumDriverInstance.takeScreenShot("MANAGE Menu Clicked", false);
        
        if (!SeleniumDriverInstance.waitForElementByXpath(SendStopActiveTrackingCommandPageObjects.ConfigGroups()))
        {
            return false;
        }
        
        if (!SeleniumDriverInstance.clickElementByXpath(SendStopActiveTrackingCommandPageObjects.ConfigGroups()))
        {
            return false;
        }
        
           SeleniumDriverInstance.takeScreenShot("Configuration Groups Clicked", false);
        
        if (!SeleniumDriverInstance.waitForElementByXpath(SendStopActiveTrackingCommandPageObjects.TableHeadingConfigGroupsWait()))
        {
            return false;
        }
        
        if (!SeleniumDriverInstance.waitForElementByXpath(SendStopActiveTrackingCommandPageObjects.AssetDescriptionWait()))
        {
            return false;
        }
          SeleniumDriverInstance.pause(500);
        
        SeleniumDriverInstance.takeScreenShot(counter + " - Successfully navigated to Configuration Groups", false);
        return true;
    }
    
}
