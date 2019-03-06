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
import java.util.Random;

/**
 *
 * @author lmkhontwana
 */
public class TargetCostPerDistanceTestClass extends BaseClass {
    int counter = 1;
    TestEntity testData;
    String failedMessage = "";
    String regNo = "";
     public TargetCostPerDistanceTestClass(TestEntity testData) {
        this.testData = testData;
        regNo=testData.getData("Registration Number");
    }
     
     public TestResult executeTargetCostPerDistanceTest() {

        this.setStartTime();
         
        if (!addOtherCostData()) 
        {
            SeleniumDriverInstance.takeScreenShot(failedMessage, true);
            counter++;
            return new TestResult(testData, Enums.ResultStatus.FAIL, failedMessage, this.getTotalExecutionTime());
        }
        return new TestResult(testData, Enums.ResultStatus.PASS, "Target Cost Per Distance Added Successfully", this.getTotalExecutionTime());
      }
     
     
     
    private boolean clickEditButton(String _assetID)
    {
       
        String rowNumber = SeleniumDriverInstance.getElementAttributeByXpath(AssetsPageObjects.AssetIdXpath(_assetID), "row");
        //Click Action Button
        if (!SeleniumDriverInstance.waitForElementByXpath(AssetsPageObjects.ActionButtonByRowXpath(rowNumber)))
            return false;
        
        if (!SeleniumDriverInstance.clickElementByXpathUsingActions(AssetsPageObjects.ActionButtonByRowXpath(rowNumber)))
            return false;
        
        if(!SeleniumDriverInstance.waitForfElementToBeClickableByXpath(AssetsPageObjects.EditAssetButtonFirstOnListRelativeXpathText(), 15)
                && browserType.equals(browserType.IE))
        {
             if (!SeleniumDriverInstance.clickElementByXpathUsingActions(AssetsPageObjects.ActionButtonFirstOnListRelativeXpathText()))
                    return false;
        }
        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("ActionButtonClicked", false);
        
        if (!SeleniumDriverInstance.clickElementByXpathUsingActions(AssetsPageObjects.EditAssetButtonRelativeXpath(rowNumber)))
            return false;
        
        SeleniumDriverInstance.takeScreenShot("EditButtonClicked", false);
        
        return true;
    }
    
    private boolean clickEditButton()
    {
        //Click Action Button
        if(!SeleniumDriverInstance.waitForPresenceOfElementByXpath(AssetsPageObjects.TableLoadingSpinnerXpath(), 30))
            return false;
        
        if(!SeleniumDriverInstance.waitForElementByXpath(AssetsPageObjects.ActionButtonFirstOnListRelativeXpathText()))
            return false;
         
        
        if (!SeleniumDriverInstance.clickElementByXpathUsingActions(AssetsPageObjects.ActionButtonFirstOnListRelativeXpathText()))
            return false;
        
        if(!SeleniumDriverInstance.waitForfElementToBeClickableByXpath(AssetsPageObjects.EditAssetButtonFirstOnListRelativeXpathText(), 15)
                && browserType.equals(browserType.IE))
        {
             if (!SeleniumDriverInstance.clickElementByXpathUsingActions(AssetsPageObjects.ActionButtonFirstOnListRelativeXpathText()))
                    return false;
        }
        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("ActionButtonClicked", false);
        
        if (!SeleniumDriverInstance.clickElementByXpathUsingActions(AssetsPageObjects.EditAssetButtonFirstOnListRelativeXpathText()))
            return false;
        
        SeleniumDriverInstance.takeScreenShot("EditButtonClicked", false);
        
        return true;
    }
    
    private boolean searchAsset(String assetToSearch)
    {
        SeleniumDriverInstance.waitForPresenceOfElementByXpath(AssetsPageObjects.TableLoadingSpinnerXpath(), 30);
        
         SeleniumDriverInstance.clearTextByXpath(AssetsPageObjects.SearchBoxRelativeXpath());
        if (!SeleniumDriverInstance.enterTextByXpath(AssetsPageObjects.SearchBoxRelativeXpath(),assetToSearch))
            return false;
        
        if (!SeleniumDriverInstance.clickElementbyXpath(AssetsPageObjects.SearchButtonRelativeXpath()))
            return false;
        
        if(!SeleniumDriverInstance.waitForPresenceOfElementByXpath(AssetsPageObjects.TableLoadingSpinnerXpath(), 30))
            return false;
        
        if (!SeleniumDriverInstance.waitForElementByXpath(AssetsPageObjects.SearchTextRelativeXpath(assetToSearch)))
            return false;
        
        SeleniumDriverInstance.takeScreenShot("AssetSearched", false);
        
        return true;
    }
    
  
    private boolean addTargetCost()
    {
         //Wait for asset status
        if(!SeleniumDriverInstance.waitForElementByXpath(AssetsPageObjects.AssetStatusLabelRelativeXpathText()))
            return false;
       
        if (regNo.equals("")){
            regNo = SeleniumDriverInstance.retrieveEnteredTextByXpath(AssetsPageObjects.RegNoTextBoxRelativeXpath());
        }
        
        testData.extractParameter("Registration Number Used", regNo,"PASS");
        
        String targetCostValue="";
        
        //Click Other Cost Data Tab
        if(!SeleniumDriverInstance.clickElementbyXpath(AssetsPageObjects.OtherCostDataTabTextXpath()))
            return false;
        
        if(!SeleniumDriverInstance.waitForElementByXpath(AssetsPageObjects.EditTargetCostButtonXpath()))
            return false;
        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("OtherCostDataTabClicked", false);
        
         //Click Edit Target Cost Button
        if(!SeleniumDriverInstance.clickElementbyXpath(AssetsPageObjects.EditTargetCostButtonXpath()))
             return false;
         
        if(!SeleniumDriverInstance.waitForfElementToBeClickableByXpath(AssetsPageObjects.UpdateCostPerDistanceTextXpath()))
            return false;
        
        
        
       //Enter Target Cost
        if (!testData.getData("Target Cost").equals("")) {
                SeleniumDriverInstance.clearTextByXpath(AssetsPageObjects.TargetCostInputXpath());
                targetCostValue = testData.getData("Target Cost");
                if(!SeleniumDriverInstance.enterTextByXpath(AssetsPageObjects.TargetCostInputXpath(),targetCostValue))
                    return false;
        }
        else
        {
             Random rand = new Random();
                int randNum = rand.nextInt(50) + 1;
                targetCostValue = Integer.toString(randNum);
            if(!SeleniumDriverInstance.enterTextByXpath(AssetsPageObjects.TargetCostInputXpath(),targetCostValue))
                 return false;
        }
        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("TargetCostValueEntered", false);
        //Click Save
        if(!SeleniumDriverInstance.clickElementbyXpath(AssetsPageObjects.SaveTargetCostButtonXpath()))
             return false;
        
        //Wait for save popup
        if(!SeleniumDriverInstance.waitForfElementToBeClickableByXpath(AssetsPageObjects.TargetCostSaveTextXpath()))
            return false;
        
        SeleniumDriverInstance.takeScreenShot("TargetCostSaved", false);
        
        //Click Cancel to return to landing page.
        testData.extractParameter("Target Cost Per Distance - Parameter", targetCostValue,"PASS");
        if (!SeleniumDriverInstance.retrieveTextByXpath(AssetsPageObjects.TargetCostTextXpath()).contains(targetCostValue)){
            testData.extractParameter("Target Cost Per Distance", SeleniumDriverInstance.retrieveTextByXpath(AssetsPageObjects.TargetCostTextXpath()),"FAIL");
            SeleniumDriverInstance.takeScreenShot("TargetCostPerDistance", true);
            return false;
        }
        else{
            testData.extractParameter("Target Cost Per Distance", SeleniumDriverInstance.retrieveTextByXpath(AssetsPageObjects.TargetCostTextXpath()),"PASS");
            SeleniumDriverInstance.takeScreenShot("TargetCostPerDistance", false);
        }
        
         //Click Cancel to return to landing page.
        if(!SeleniumDriverInstance.clickElementbyXpath(AssetsPageObjects.ServiceHistoryCancelButtonXpath()))
             return false;
        
        
        SeleniumDriverInstance.waitForPresenceOfElementByXpath(AssetsPageObjects.TableLoadingSpinnerXpath(), 30);
        
        return true;
    }
    
    private boolean addOtherCostData() 
    {
        
        //regNo = testData.getData("Registration Number");
        //If Registration Number provided, search and select asset
        if (!regNo.equals("")) 
        {
                if(!searchAsset(regNo))
            {
               failedMessage = "Failed to Search Asset";
               System.err.println(failedMessage);
               return false;
            }
            if(!clickEditButton(regNo))
            {
               failedMessage = "Failed to Click Edit Button";
               System.err.println(failedMessage);
               return false;
            }
            
        }
        //Select First Asset on list
        else
        {
            if(!clickEditButton())
            {
               failedMessage = "Failed to Click Edit Button";
               return false;
            }
        }
        //Add Target Cost
        if(!addTargetCost())
            {
               failedMessage = "Failed to add Target Cost Data";
               return false;
            }
        
        return true;
    }
    
    
   
     
}
