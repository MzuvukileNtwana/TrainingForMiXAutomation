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
import KeywordDrivenTestFramework.Testing.PageObjects.AccessControlDefaultDriverForNonFMUnitsPAgeObjects;
import KeywordDrivenTestFramework.Testing.PageObjects.AssetsPageObjects;
import KeywordDrivenTestFramework.Testing.PageObjects.AssetsRequiredDriverCertificationsPageObject;
import static java.lang.System.err;

/**
 *
 * @author arala
 */
public class AssetsRequiredDriverCertifications extends BaseClass{
    
    int counter = 1;
    TestEntity testData;
    //boolean isNegative;
    String StrRandNum;
    int randNum;
    String generatedNumber;
    String StrCertificationName;
    String error = "";
    public AssetsRequiredDriverCertifications(TestEntity testData) {
        this.testData = testData;
        

    }

    public TestResult executeTest() {

        this.setStartTime(); 
        if (!EditAsset()) 
       {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To Navigate To Edit Asset", true);
            counter++;
            narrator.failedMessage("Failed To Navigate To Edit Asset - "+error);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To Navigate To Edit Asset - "+error, this.getTotalExecutionTime());
       }  
        return new TestResult(testData, Enums.ResultStatus.PASS, "Successfully  managed the drivers Certifications and their Reminders.", this.getTotalExecutionTime());
    }
    
     private boolean EditAsset()
      {
          
         //Get rowID from the excel spreadsheet   
        String rowNumber = testData.getData("RowID");
         
        //Click Action Button
         SeleniumDriverInstance.pause(3000);
        if (!SeleniumDriverInstance.clickElementbyXpath(AssetsPageObjects.ActionButtonByRowXpath(rowNumber)))
        {   
            error = "Could retrieve row number: "+ testData.getData("RowID");
            testData.extractParameter("Actual Results: ", "Could retrieve row number: "+ testData.getData("RowID"), "FAIL");
            err.println("[ERROR] Failed to click action button");
            return false;
        }
         
        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("Clicked the action button", false);
       
        SeleniumDriverInstance.pause(2000);
        
        //Click Edit link
        SeleniumDriverInstance.pause(3000);
        if (!SeleniumDriverInstance.clickElementByXpathUsingActions(AssetsPageObjects.ActionEditButtonsByRowXpath(rowNumber)))
        {
            error = "Failed to click edit on the actions buttton";
           err.println("[ERROR] Failed to click edit on the actions buttton");
           return false;
        }
    
        //Take Screenshot 
        SeleniumDriverInstance.takeScreenShot("Clicked edit link on the action button", false);
        
        //Wait for the access tab element xpath
        SeleniumDriverInstance.waitForElementByXpath(AssetsRequiredDriverCertificationsPageObject.AssetDetailsXpath());
        if(!SeleniumDriverInstance.waitForElementByXpath(AccessControlDefaultDriverForNonFMUnitsPAgeObjects.AccessTabXpath()))
        {
            error = "Failed to validate edit page";
           err.println("[ERROR] Failed to validate edit page");
           return false; 
        }
        if (!SeleniumDriverInstance.clickElementByXpathUsingActions(AssetsRequiredDriverCertificationsPageObject.RequiredDriverCertificatesXpath()))
        {
            error = "Failed to click Required driver certificates";
           err.println("[ERROR] Failed to click Required driver certificates");
           return false;
        }
        
         //Wait for the access tab element xpath
        if(!SeleniumDriverInstance.waitForElementByXpath(AssetsRequiredDriverCertificationsPageObject.CertificationTypesXpath()))
        {
            error = "Failed to validate edit page";
           err.println("[ERROR] Failed to validate edit page");
           return false; 
        }
        //CertificationTypesXpath()
        SeleniumDriverInstance.pause(2000);
        if (SeleniumDriverInstance.waitForElementByXpath(AssetsRequiredDriverCertificationsPageObject.AddCertificationDisabledXpath(),3))
        {
              if (!SeleniumDriverInstance.clickElementbyXpath(AssetsRequiredDriverCertificationsPageObject.CertificationTypesXpath()))
            {   
                error = "Failed to click Certification types";
                testData.extractParameter("Test result: ", "Failed to click Certification types", "FAIL");
                err.println("[ERROR] Failed to click Certification types");
                return false;
            }
            if (!SeleniumDriverInstance.waitForElementByXpath(AssetsRequiredDriverCertificationsPageObject.btnAddTypeXpath()))
            {   
                error = "Failed to find Certification types";
                testData.extractParameter("Test result: ", "Failed to find Certification types", "FAIL");
                err.println("[ERROR] Failed to find Certification types");
                return false;
            }
            if (!SeleniumDriverInstance.clickElementbyXpath(AssetsRequiredDriverCertificationsPageObject.btnAddTypeXpath()))
            {   
                error = "Failed to click Certification types";
                testData.extractParameter("Test result: ", "Failed to click Certification types", "FAIL");
                err.println("[ERROR] Failed to click Certification types");
                return false;
            }

            if (!SeleniumDriverInstance.waitForElementByXpath(AssetsRequiredDriverCertificationsPageObject.AddCertificationTypeXpath()))
            {   
                error = "Failed to find Add certification type form";
                testData.extractParameter("Test result: ", "Failed to find Add certification type form", "FAIL");
                err.println("[ERROR] Failed to find Add certification type form");
                return false;
            }

            SeleniumDriverInstance.pause(3000);
            enterCerfiticationName();
            if (!SeleniumDriverInstance.enterTextByXpath(AssetsRequiredDriverCertificationsPageObject.inputFieldValidityPeriodXpath(), this.testData.getData("ValidityPeriod")))
            {
                error = "Failed to enter Validity Period";
                testData.extractParameter("Test result: ", "Failed to enter Validity Period", "FAIL");
                err.println("[ERROR] Failed to enter Certification Name");
                return false;
            }
            if (!SeleniumDriverInstance.enterTextByXpath(AssetsRequiredDriverCertificationsPageObject.inputFieldReminderPeriodXpath(), this.testData.getData("ReminderPeriod")))
            {
                error = "Failed to enter Reminder Period";
                testData.extractParameter("Test result: ", "Failed to enter Reminder Period", "FAIL");
                err.println("[ERROR] Failed to enter Certification Name");
                return false;
            }
            if (!SeleniumDriverInstance.clickElementbyXpath(AssetsRequiredDriverCertificationsPageObject.checkBoxXpath()))
            {   
                error = "Failed to click mandatory certification check Box";
                testData.extractParameter("Test result: ", "Failed to click mandatory certification check Box", "FAIL");
                err.println("[ERROR] Failed to click mandatory certification check Box");
                return false;
            }
            if (!SeleniumDriverInstance.clickElementbyXpath(AssetsRequiredDriverCertificationsPageObject.btnCertificationSaveXpath()))
            {   
                error = "Failed to click mandatory certification check Box";
                testData.extractParameter("Test result: ", "Failed to click mandatory certification check Box", "FAIL");
                err.println("[ERROR] Failed to click mandatory certification check Box");
                return false;
            } 
            //span[text()='Available']
            if (!SeleniumDriverInstance.waitForElementByXpath(AssetsRequiredDriverCertificationsPageObject.AvailableXpath()))
            {   
                error = "Failed to find Certification types";
                testData.extractParameter("Test result: ", "Failed to find Certification types", "FAIL");
                err.println("[ERROR] Failed to find Certification types");
                return false;
            }   
            SeleniumDriverInstance.pause(3000);
            if (!SeleniumDriverInstance.waitForElementByXpath(AssetsRequiredDriverCertificationsPageObject.selectCertificationXpath()))
            {   
                error = "Failed to find Certification types";
                testData.extractParameter("Test result: ", "Failed to find Certification types", "FAIL");
                err.println("[ERROR] Failed to find Certification types");
                return false;
            }   
             if (!SeleniumDriverInstance.clickElementbyXpath(AssetsRequiredDriverCertificationsPageObject.selectCertificationXpath()))
            {   
                error = "Failed to click Certification types";
                testData.extractParameter("Test result: ", "Failed to click Certification types", "FAIL");
                err.println("[ERROR] Failed to find Certification types");
                return false;
            }  
            
           if (!SeleniumDriverInstance.clickElementbyXpath(AssetsRequiredDriverCertificationsPageObject.addCertificationXpath()))
            {   
                error = "Failed to click add Certification";
                testData.extractParameter("Test result: ", "Failed to click add Certification", "FAIL");
                err.println("[ERROR] Failed to click add Certification");
                return false;
            }
             SeleniumDriverInstance.pause(3000);
              if (!SeleniumDriverInstance.selectByTextFromDropDownListusingXpath(AssetsRequiredDriverCertificationsPageObject.certificationTypeXpath(), StrCertificationName))
            {
                error = "Failed to select certification Type";
                testData.extractParameter("Test result: ", "Failed to select certification Type", "FAIL");
                err.println("[ERROR] Failed to select certification Type");
                return false;
            }
            SeleniumDriverInstance.pause(3000);
            if (!SeleniumDriverInstance.clickElementbyXpath(AssetsRequiredDriverCertificationsPageObject.btnSaveXpath()))
            {   
                error = "Failed to click save button";
                err.println("[ERROR] Failed to click save button");
                return false;
            }
            SeleniumDriverInstance.pause(3000);
             if (!SeleniumDriverInstance.clickElementbyXpath(AssetsRequiredDriverCertificationsPageObject.clickCertificationTypeXpath()))
            {   
                error = "Failed to click Certification Type";
                err.println("[ERROR] Failed to click Certification Type");
                return false;
            }
             String CertificationType = SeleniumDriverInstance.retrieveMixTelematicTextByXpath(AssetsRequiredDriverCertificationsPageObject.CertificationTypeTabXpath());
            if (!CertificationType.equals(this.testData.getData("CertificationtypeTab")))
            {
                testData.extractParameter("Test result: ", "Failed to verify Certification type", "FAIL");
                err.println("[ERROR] Failed to verify Failed to verify Certification type");
                return false;
            }
             String NecessityTab = SeleniumDriverInstance.retrieveMixTelematicTextByXpath(AssetsRequiredDriverCertificationsPageObject.necessityXpath());
            if (!NecessityTab.equals(this.testData.getData("NecessityTab")))
            {
                testData.extractParameter("Test result: ", "Failed to verify Necessity", "FAIL");
                err.println("[ERROR] Failed to verify Failed to verify Necessity");
                return false;
            }
            String ValidityTab= SeleniumDriverInstance.retrieveMixTelematicTextByXpath(AssetsRequiredDriverCertificationsPageObject.validityXpath());
            if (!ValidityTab.equals(this.testData.getData("ValidityTab")))
            {
                testData.extractParameter("Test result: ", "Failed to verify Validity", "FAIL");
                err.println("[ERROR] Failed to verify Failed to verify Validity");
                return false;
            }
            String Addtype = SeleniumDriverInstance.retrieveMixTelematicTextByXpath(AssetsRequiredDriverCertificationsPageObject.AddTypeXpath());
            if (!Addtype.equals(this.testData.getData("Addtype")))
            {
                testData.extractParameter("Test result: ", "Failed to verify Add type", "FAIL");
                err.println("[ERROR] Failed to verify add type");
                return false;
            }
            SeleniumDriverInstance.pause(3000);
            if (!SeleniumDriverInstance.clickElementbyXpath(AssetsRequiredDriverCertificationsPageObject.CancelXpath()))
            {   
                error = "Failed to click Cancel";
                err.println("[ERROR] Failed to click Cancel");
                return false;
            }
            testData.extractParameter("Test result: " + "successfully  managed Drivers Certifications for :", "Certification types : " + StrCertificationName, "PASS");
            
        }else{
            if (!SeleniumDriverInstance.clickElementbyXpath(AssetsRequiredDriverCertificationsPageObject.addCertificationXpath()))
            {   
                error = "Failed to click add Certification";
                err.println("[ERROR] Failed to click add Certification");
                return false;
            }
            SeleniumDriverInstance.pause(3000);
            String CertificationName = SeleniumDriverInstance.retrieveMixTelematicTextByXpath(AssetsRequiredDriverCertificationsPageObject.CertificationNameXpath());
            if (!SeleniumDriverInstance.selectByTextFromDropDownListusingXpath(AssetsRequiredDriverCertificationsPageObject.certificationTypeXpath(), CertificationName))
            {
                error = "Failed to select certification Type";
                err.println("[ERROR] Failed to select certification Type");
                return false;
            }
            SeleniumDriverInstance.pause(3000);
            if (!SeleniumDriverInstance.clickElementbyXpath(AssetsRequiredDriverCertificationsPageObject.btnSaveXpath()))
            {   
                error = "Failed to click save button";
                err.println("[ERROR] Failed to click save button");
                return false;
            }
            SeleniumDriverInstance.pause(3000);
             if (!SeleniumDriverInstance.clickElementbyXpath(AssetsRequiredDriverCertificationsPageObject.clickCertificationTypeXpath()))
            {   
                error = "Failed to click Certification Type";
                err.println("[ERROR] Failed to click Certification Type");
                return false;
            }
             String CertificationType = SeleniumDriverInstance.retrieveMixTelematicTextByXpath(AssetsRequiredDriverCertificationsPageObject.CertificationTypeTabXpath());
            if (!CertificationType.equals(this.testData.getData("CertificationtypeTab")))
            {
                testData.extractParameter("Test result: ", "Failed to verify Certification type", "FAIL");
                err.println("[ERROR] Failed to verify Failed to verify Certification type");
                return false;
            }
             String NecessityTab = SeleniumDriverInstance.retrieveMixTelematicTextByXpath(AssetsRequiredDriverCertificationsPageObject.necessityXpath());
            if (!NecessityTab.equals(this.testData.getData("NecessityTab")))
            {
                testData.extractParameter("Test result: ", "Failed to verify Necessity", "FAIL");
                err.println("[ERROR] Failed to verify Failed to verify Necessity");
                return false;
            }
            String ValidityTab= SeleniumDriverInstance.retrieveMixTelematicTextByXpath(AssetsRequiredDriverCertificationsPageObject.validityXpath());
            if (!ValidityTab.equals(this.testData.getData("ValidityTab")))
            {
                testData.extractParameter("Test result: ", "Failed to verify Validity", "FAIL");
                err.println("[ERROR] Failed to verify Failed to verify Validity");
                return false;
            }
            String Addtype = SeleniumDriverInstance.retrieveMixTelematicTextByXpath(AssetsRequiredDriverCertificationsPageObject.AddTypeXpath());
            if (!Addtype.equals(this.testData.getData("Addtype")))
            {
                testData.extractParameter("Test result: ", "Failed to verify Add type", "FAIL");
                err.println("[ERROR] Failed to verify add type");
                return false;
            }
            SeleniumDriverInstance.pause(3000);
            if (!SeleniumDriverInstance.clickElementbyXpath(AssetsRequiredDriverCertificationsPageObject.AddTypeXpath()))
            {   
                error = "Failed to click Add type";
                err.println("[ERROR] Failed to click Add type");
                return false;
            }

            SeleniumDriverInstance.pause(3000);
            enterCerfiticationName();
            if (!SeleniumDriverInstance.enterTextByXpath(AssetsRequiredDriverCertificationsPageObject.inputFieldValidityPeriodXpath(), this.testData.getData("ValidityPeriod")))
            {
                error = "Failed to enter Validity Period";
                err.println("[ERROR] Failed to enter Validity Period");
                return false;
            }
            if (!SeleniumDriverInstance.enterTextByXpath(AssetsRequiredDriverCertificationsPageObject.inputFieldReminderPeriodXpath(), this.testData.getData("ReminderPeriod")))
            {
                error = "Failed to enter Reminder Period";
                err.println("[ERROR] Failed to enter Reminder Period");
                return false;
            }
            if (!SeleniumDriverInstance.clickElementbyXpath(AssetsRequiredDriverCertificationsPageObject.checkBoxXpath()))
            {   
                error = "Failed to click mandatory certification check Box";
                err.println("[ERROR] Failed to click mandatory certification check Box");
                return false;
            }
            if (!SeleniumDriverInstance.clickElementbyXpath(AssetsRequiredDriverCertificationsPageObject.btnCertificationSaveXpath()))
            {   
                error = "Failed to click Certification Save";
                err.println("[ERROR] Failed to click Certification Save");
                return false;
            }       
            if (!SeleniumDriverInstance.waitForElementByXpath(AssetsRequiredDriverCertificationsPageObject.CertificationTypeCreatedSuccessfullyXpath()))
            {   
                error = "Failed to wait for Certification type created successfully pop up";
                err.println("[ERROR] Failed to wait for Certification type created successfully pop up");
                return false;
            }       
            testData.extractParameter("Test result: " + "successfully  managed Drivers Certifications for :", "Certification types : " + CertificationName, "PASS");  
           
          }
            SeleniumDriverInstance.pause(3000);
            if (!SeleniumDriverInstance.clickElementbyXpath(AssetsRequiredDriverCertificationsPageObject.CancelXpath()))
            {   
                error = "Failed to click Cancel";
                err.println("[ERROR] Failed to click Cancel");
                return false;
            }
        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("Landed on access control page", false);

        return true;
       } 
    
    public boolean enterCerfiticationName(){
        String  generatedNumber = SeleniumDriverInstance.generateDateTimeStampVaule();
        StrCertificationName  = this.testData.getData("CertificationName")+generatedNumber ;
        if (!SeleniumDriverInstance.enterTextByXpath(AssetsRequiredDriverCertificationsPageObject.inputFieldCertificationName(), StrCertificationName))    
            {
                error = "Failed to enter Certification Name";
                err.println("[ERROR] Failed to enter Certification Name");
                return false;
            }
        return true;
    }
     
    
}
