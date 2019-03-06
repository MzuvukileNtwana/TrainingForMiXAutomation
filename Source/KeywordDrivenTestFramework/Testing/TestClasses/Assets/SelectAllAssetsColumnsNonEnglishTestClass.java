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
import KeywordDrivenTestFramework.Testing.PageObjects.AssetsPageObjects;
import KeywordDrivenTestFramework.Testing.PageObjects.ExportAssetsNonEnglishPageObjects;

/**
 *
 * @author lmkhontwana
 */
public class SelectAllAssetsColumnsNonEnglishTestClass extends BaseClass {
    int counter = 1;
    TestEntity testData;
    String failedMessage = "";
     public SelectAllAssetsColumnsNonEnglishTestClass(TestEntity testData) {
        this.testData = testData;
    }
    
     public TestResult executeSelectAllColumnsTest() {

        this.setStartTime();
        if (!selectAllColumns()) 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To Select All Assets Columns", true);
            counter++;
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To Select All Assets Columns", this.getTotalExecutionTime());
        }
        return new TestResult(testData, Enums.ResultStatus.PASS, "All Assets Columns successfully", this.getTotalExecutionTime());
      }
    
     private boolean selectAllColumns()
    {
        SeleniumDriverInstance.pause(6000);
        if (!SeleniumDriverInstance.waitForElementByXpath(AssetsPageObjects.DownloadImportButtonRelativeXpath()))
            return false;
        
           //Select all columns
            if (!SeleniumDriverInstance.clickOnColumnChooserList(AssetsPageObjects.ColumnChooserButtonRelativeXpath(),
                                                                           AssetsPageObjects.AssetIDRelativeXpath()))
                return false;
        
            if(!SeleniumDriverInstance.clickElementbyXpath(ExportAssetsNonEnglishPageObjects.AssetsHeaderLabelRelativeXpathText()))
                return false;
            
            if (!SeleniumDriverInstance.clickOnColumnChooserList(AssetsPageObjects.ColumnChooserButtonRelativeXpath(),
                                                                           AssetsPageObjects.AssetTypeRelativeXpath()))
                return false;
            
             if(!SeleniumDriverInstance.clickElementbyXpath(ExportAssetsNonEnglishPageObjects.AssetsHeaderLabelRelativeXpathText()))
                return false;
            
            if(!SeleniumDriverInstance.clickOnColumnChooserList(AssetsPageObjects.ColumnChooserButtonRelativeXpath(),
                                                                           AssetsPageObjects.CountryRelativeXpath()))
                return false;
            
             if(!SeleniumDriverInstance.clickElementbyXpath(ExportAssetsNonEnglishPageObjects.AssetsHeaderLabelRelativeXpathText()))
                return false;
            
            if(!SeleniumDriverInstance.clickOnColumnChooserList(AssetsPageObjects.ColumnChooserButtonRelativeXpath(),
                                                                           AssetsPageObjects.ConfigUploadDateRelativeXpath()))
                return false;
            
             if(!SeleniumDriverInstance.clickElementbyXpath(ExportAssetsNonEnglishPageObjects.AssetsHeaderLabelRelativeXpathText()))
                return false;
            
            if (!SeleniumDriverInstance.clickOnColumnChooserList(AssetsPageObjects.ColumnChooserButtonRelativeXpath(),
                                                                           AssetsPageObjects.ConfigurationGroupRelativeXpath()))
                return false;
            
            if(!SeleniumDriverInstance.clickElementbyXpath(ExportAssetsNonEnglishPageObjects.AssetsHeaderLabelRelativeXpathText()))
                return false;
            
            if (!SeleniumDriverInstance.clickOnColumnChooserList(AssetsPageObjects.ColumnChooserButtonRelativeXpath(),
                                                                           AssetsPageObjects.CountryRelativeXpath()))
                return false;
            
            if(!SeleniumDriverInstance.clickElementbyXpath(ExportAssetsNonEnglishPageObjects.AssetsHeaderLabelRelativeXpathText()))
                return false;
            
            if (!SeleniumDriverInstance.clickOnColumnChooserList(AssetsPageObjects.ColumnChooserButtonRelativeXpath(),
                                                                           AssetsPageObjects.EngineHoursRelativeXpath()))
                return false;
            
            if(!SeleniumDriverInstance.clickElementbyXpath(ExportAssetsNonEnglishPageObjects.AssetsHeaderLabelRelativeXpathText()))
                return false;
            
            if (!SeleniumDriverInstance.clickOnColumnChooserList(AssetsPageObjects.ColumnChooserButtonRelativeXpath(),
                                                                           AssetsPageObjects.FleetNumberRelativeXpath()))
                return false;
            
            if(!SeleniumDriverInstance.clickElementbyXpath(ExportAssetsNonEnglishPageObjects.AssetsHeaderLabelRelativeXpathText()))
                return false;
            
            if (!SeleniumDriverInstance.clickOnColumnChooserList(AssetsPageObjects.ColumnChooserButtonRelativeXpath(),
                                                                           AssetsPageObjects.ImeiRelativeXpath()))
                return false;
            
            
             if(!SeleniumDriverInstance.clickElementbyXpath(ExportAssetsNonEnglishPageObjects.AssetsHeaderLabelRelativeXpathText()))
                return false;
            
            if (!SeleniumDriverInstance.clickOnColumnChooserList(AssetsPageObjects.ColumnChooserButtonRelativeXpath(),
                                                                           AssetsPageObjects.ImsiRelativeXpath()))
                return false;
            
            if(!SeleniumDriverInstance.clickElementbyXpath(ExportAssetsNonEnglishPageObjects.AssetsHeaderLabelRelativeXpathText()))
                return false;
            
            if (!SeleniumDriverInstance.clickOnColumnChooserList(AssetsPageObjects.ColumnChooserButtonRelativeXpath(),
                                                                           AssetsPageObjects.LastAvlRelativeXpath()))
                return false;
            
            if(!SeleniumDriverInstance.clickElementbyXpath(ExportAssetsNonEnglishPageObjects.AssetsHeaderLabelRelativeXpathText()))
                return false;
            
            if (!SeleniumDriverInstance.clickOnColumnChooserList(AssetsPageObjects.ColumnChooserButtonRelativeXpath(),
                                                                           AssetsPageObjects.LastTripRelativeXpath()))
                return false;
            
            if(!SeleniumDriverInstance.clickElementbyXpath(ExportAssetsNonEnglishPageObjects.AssetsHeaderLabelRelativeXpathText()))
                return false;
            
            if (!SeleniumDriverInstance.clickOnColumnChooserList(AssetsPageObjects.ColumnChooserButtonRelativeXpath(),
                                                                           AssetsPageObjects.MobileDeviceTypeRelativeXpath()))
                return false;
            
            
            if(!SeleniumDriverInstance.clickElementbyXpath(ExportAssetsNonEnglishPageObjects.AssetsHeaderLabelRelativeXpathText()))
                return false;
            
            if (!SeleniumDriverInstance.clickOnColumnChooserList(AssetsPageObjects.ColumnChooserButtonRelativeXpath(),
                                                                           AssetsPageObjects.MsisdnRelativeXpath()))
                return false;
            
            if(!SeleniumDriverInstance.clickElementbyXpath(ExportAssetsNonEnglishPageObjects.AssetsHeaderLabelRelativeXpathText()))
                return false;
            
            if (!SeleniumDriverInstance.clickOnColumnChooserList(AssetsPageObjects.ColumnChooserButtonRelativeXpath(),
                                                                           AssetsPageObjects.OdometerRelativeXpath()))
                return false;
            
            if(!SeleniumDriverInstance.clickElementbyXpath(ExportAssetsNonEnglishPageObjects.AssetsHeaderLabelRelativeXpathText()))
                return false;
            
            if (!SeleniumDriverInstance.clickOnColumnChooserList(AssetsPageObjects.ColumnChooserButtonRelativeXpath(),
                                                                           AssetsPageObjects.RegistrationNumberRelativeXpath()))
                return false;
            
            if(!SeleniumDriverInstance.clickElementbyXpath(ExportAssetsNonEnglishPageObjects.AssetsHeaderLabelRelativeXpathText()))
                return false;
            
            if (!SeleniumDriverInstance.clickOnColumnChooserList(AssetsPageObjects.ColumnChooserButtonRelativeXpath(),
                                                                           AssetsPageObjects.SiterRelativeXpath()))
                return false;
            
            if(!SeleniumDriverInstance.clickElementbyXpath(ExportAssetsNonEnglishPageObjects.AssetsHeaderLabelRelativeXpathText()))
                return false;
            
            if (!SeleniumDriverInstance.clickOnColumnChooserList(AssetsPageObjects.ColumnChooserButtonRelativeXpath(),
                                                                           AssetsPageObjects.CurrentStateRelativeXpath()))
                return false;
            
            
        if(!SeleniumDriverInstance.clickElementbyXpath(AssetsPageObjects.ColumnChooserButtonRelativeXpath()))
            return false;
           //Take Screenshot
            SeleniumDriverInstance.takeScreenShot("AllColumnsSelected", false);
        
        return true;
    }
     
}
