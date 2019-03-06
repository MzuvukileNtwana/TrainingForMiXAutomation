/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package KeywordDrivenTestFramework.Testing.TestClasses.Assets;

import KeywordDrivenTestFramework.Core.BaseClass;
import static KeywordDrivenTestFramework.Core.BaseClass.SeleniumDriverInstance;
import KeywordDrivenTestFramework.Entities.Enums;
import KeywordDrivenTestFramework.Entities.TestEntity;
import KeywordDrivenTestFramework.Entities.TestResult;
import KeywordDrivenTestFramework.Testing.PageObjects.ExportAssetsNonEnglishPageObjects;
import KeywordDrivenTestFramework.Testing.PageObjects.TripTimelinePageObjects;

/**
 *
 * @author lmkhontwana
 */
public class SelectSiteTestClass extends BaseClass {

    int counter = 1;
    TestEntity testData;
    
     public SelectSiteTestClass(TestEntity testData) {
        this.testData = testData;
    }
    
      public TestResult executeSelectSiteTest() {

        this.setStartTime();
        
         if (!selectSiteToUse()) 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To Select Site", true);
            counter++;
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To Select Site", this.getTotalExecutionTime());
        }
        
        return new TestResult(testData, Enums.ResultStatus.PASS, "Site Selected Successfully", this.getTotalExecutionTime());
      }
      
     private boolean selectSiteToUse()
    {
        SeleniumDriverInstance.pause(3000);
        //Click Mix Telematics BreadCrumb Menu
        if (!SeleniumDriverInstance.clickElementbyXpath(TripTimelinePageObjects.MiXTelematicsBreadcrumbRelativeXpath()))
            return false;
        
        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("MiXTelematicsBreadcrumbClicked", false);
        
        //Cancel Previous Selected Asset 
        //SeleniumDriverInstance.pause(3000);
             SeleniumDriverInstance.scrollToElement(TripTimelinePageObjects.DataCentreRelativeXpath(this.testData.getData("Trip Data Centre")));
        if (!SeleniumDriverInstance.clickElementbyXpath(TripTimelinePageObjects.DataCentreRelativeXpath(this.testData.getData("Trip Data Centre"))))
            return false;
        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("DataCentreClicked", false);
        
         //Click RegionalSalesOrganistaion
        //SeleniumDriverInstance.pause(3000);
             SeleniumDriverInstance.scrollToElement(TripTimelinePageObjects.RegionalSalesOrganistaionRelativeXpath(this.testData.getData("Trip Regional")));
        if (!SeleniumDriverInstance.clickElementbyXpath(TripTimelinePageObjects.RegionalSalesOrganistaionRelativeXpath(this.testData.getData("Trip Regional"))))
            return false;
        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("RegionalSalesOrganistaionClicked", false);
        
         //Click Organistaion
             SeleniumDriverInstance.scrollToElement(TripTimelinePageObjects.OrganistaionRelativeXpath(this.testData.getData("Trip Organistaion")));
        if (!SeleniumDriverInstance.clickElementbyXpath(TripTimelinePageObjects.OrganistaionRelativeXpath(this.testData.getData("Trip Organistaion"))))
            return false;
        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("OrganistaionClicked", false);
        
         //Click Site
             SeleniumDriverInstance.scrollToElement(TripTimelinePageObjects.SiteRelativeXpath(this.testData.getData("Trip Site")));
        if (!SeleniumDriverInstance.clickElementbyXpath(TripTimelinePageObjects.SiteRelativeXpath(this.testData.getData("Trip Site"))))
            return false;
        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("SiteClicked", false);
        
        if(SeleniumDriverInstance.waitForElementByXpath(ExportAssetsNonEnglishPageObjects.ItalianButtonSelectXpath(),10)) {
             //Click SelectAssetButton in Italian
            if (!SeleniumDriverInstance.clickElementbyXpath(ExportAssetsNonEnglishPageObjects.ItalianButtonSelectXpath()))
                return false;
            
            if (!SeleniumDriverInstance.waitForElementByXpath(ExportAssetsNonEnglishPageObjects.AssetGridAllButtonRelativeXpath()))
            return false;
            
        }else{
              //Click SelectAssetButton
            if (!SeleniumDriverInstance.clickElementbyXpath(TripTimelinePageObjects.SelectAssetButtonRelativeXpath()))
                return false;
            
            if (!SeleniumDriverInstance.waitForElementByXpath(TripTimelinePageObjects.AssetGridAllButtonRelativeXpath()))
            return false;
        }
        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("SelectSiteButtonClicked", false);
         testData.extractParameter("Selected Site", testData.getData("Trip Site"),"PASS");
        return true;
    }
}
