package KeywordDrivenTestFramework.Testing.TestClasses.Assets;

import KeywordDrivenTestFramework.Core.BaseClass;
import static KeywordDrivenTestFramework.Core.BaseClass.SeleniumDriverInstance;
import KeywordDrivenTestFramework.Entities.Enums;
import KeywordDrivenTestFramework.Entities.TestEntity;
import KeywordDrivenTestFramework.Entities.TestResult;
import KeywordDrivenTestFramework.Testing.PageObjects.AddNewRolePageObjects;
import KeywordDrivenTestFramework.Testing.PageObjects.AssetsPageObject.DiagnosticsFunctionalityForAT_VT_assetsPageObjects;
import KeywordDrivenTestFramework.Testing.PageObjects.AssetsPageObject.LanguagingAppliedToAssetsPageObjects;
import KeywordDrivenTestFramework.Testing.TestClasses.Utilities.SelectBreadcrum;
import static java.lang.System.err;
import org.openqa.selenium.Keys;


/**
 *
 * @author yduma
 */
public class DMF_821_DiagnosticsFunctionalityForAssetsWithNon_FM_Units extends BaseClass {

    int counter = 1;
    TestEntity testData;
    SelectBreadcrum selectBreadcrum=new SelectBreadcrum(testData);
    
     public DMF_821_DiagnosticsFunctionalityForAssetsWithNon_FM_Units(TestEntity testData) {
        this.testData = testData;
    }
    
      public TestResult executeTest() {

        this.setStartTime();
       
        if (!selectBreadcrum()) 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To selectBreadcrum", true);
            counter++;
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To selectBreadcrum", this.getTotalExecutionTime());
        }
        
        if (!ClickActionButton()) 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To ClickActionButton", true);
            counter++;
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To ClickActionButton", this.getTotalExecutionTime());
        }
 
        if (!ClickDiagnosticsLinkText()) 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To ClickDiagnosticsLinkText", true);
            counter++;
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To ClickDiagnosticsLinkText", this.getTotalExecutionTime());
        }

        if (!SwitchToDiagnosticWindow()) 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To SwitchToDiagnosticWindow", true);
            counter++;
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To SwitchToDiagnosticWindow", this.getTotalExecutionTime());
        }
        
        if (!InspectDiagnosticPageSubHeadings()) 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To InspectDiagnosticPageSubHeadings", true);
            counter++;
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To InspectDiagnosticPageSubHeadings", this.getTotalExecutionTime());
        }
        
        if (!clickUnitDetails()) 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To clickUnitDetails", true);
            counter++;
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To clickUnitDetails", this.getTotalExecutionTime());
        }
                
        if (!inspectUnitDetailsColumns()) 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To inspectUnitDetailsColumns", true);
            counter++;
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To inspectUnitDetailsColumns", this.getTotalExecutionTime());
        }
        
        if (!clickFirmwareHistory()) 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To clickFirmwareHistory", true);
            counter++;
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To clickFirmwareHistory", this.getTotalExecutionTime());
        }
        
        if (!inspectFirmwareColumns()) 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To inspectFirmwareColumns", true);
            counter++;
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To inspectFirmwareColumns", this.getTotalExecutionTime());
        }
        
        if (!clickPeripheralStatusInformation()) 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To clickPeripheralStatusInformation", true);
            counter++;
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To clickPeripheralStatusInformation", this.getTotalExecutionTime());
        }
        
        if (!validatePeripheralStatusInformation()) 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To validatePeripheralStatusInformation", true);
            counter++;
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To validatePeripheralStatusInformation", this.getTotalExecutionTime());
        }
        
        if (!clickGPS_StatusInformation()) 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To clickGPS_StatusInformation", true);
            counter++;
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To clickGPS_StatusInformation", this.getTotalExecutionTime());
        }
        
        if (!validateGpsStatusInformation()) 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To validateGpsStatusInformation", true);
            counter++;
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To validateGpsStatusInformation", this.getTotalExecutionTime());
        }
        
        if (!clickLatestPositionInformation()) 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To clickLatestPositionInformation", true);
            counter++;
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To clickLatestPositionInformation", this.getTotalExecutionTime());
        }
        
        if (!inspectLastPositionColumnsData()) 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To inspectLastPositionColumnsData", true);
            counter++;
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To inspectLastPositionColumnsData", this.getTotalExecutionTime());
        }
        
        if(!SwitchToOriginalWindow())
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To SwitchToOriginalWindow", true);
            counter++;
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To SwitchToOriginalWindow", this.getTotalExecutionTime());
        }
                
        return new TestResult(testData, Enums.ResultStatus.PASS, testData.TestDescription, this.getTotalExecutionTime());
      }
      
    public boolean selectBreadcrum()
    {
                 
        if(!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.ButtonBreadcrumXpath(),30))
        {
            testData.extractParameter("Actual Result", "Failed to wait for the breadcrum", "FAIL");
            return false;
        }
             ClickOnBreadCrumb();
        
        return true;
    }
      
    public boolean ClickActionButton()
    {
        pause(1500);
        SeleniumDriverInstance.waitForElementByXpath(DiagnosticsFunctionalityForAT_VT_assetsPageObjects.spinnerXpath(),45);
        SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.ColumnChooser(),15);        
        SeleniumDriverInstance.clearTextByXpath(LanguagingAppliedToAssetsPageObjects.SearchFilterXpath());
        if (!SeleniumDriverInstance.moveToAndEnterTextByXpath(LanguagingAppliedToAssetsPageObjects.SearchFilterXpath(),testData.getData("AssetColumnName")))
          {
              err.println("[ERROR]: Failed to enter Asset Id");
              return false;
          }
        
//        SeleniumDriverInstance.clickElementByXpath(LanguagingAppliedToAssetsPageObjects.buttonSearchIconXpath());
//        SeleniumDriverInstance.clickElementByXpath(LanguagingAppliedToAssetsPageObjects.buttonSearchIconXpath());
        pause(1500);
        
        SeleniumDriverInstance.pressKey(Keys.ENTER);
        SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.ColumnChooser(),15);
        SeleniumDriverInstance.waitForElementByXpath(DiagnosticsFunctionalityForAT_VT_assetsPageObjects.spinnerXpath(), 90);
        
        //----------get the column and it row number
        String rowIndex =  SeleniumDriverInstance.getElementAttributeByXpath(LanguagingAppliedToAssetsPageObjects.ColumnDescriptionXpath(testData.getData("AssetColumnName")),"row-index");


        String mobileDevice = SeleniumDriverInstance.retrieveTextByXpath(LanguagingAppliedToAssetsPageObjects.ColumnAndRowIndexXpath(testData.getData("MobileDeviceColumn"), rowIndex));
        // String rowIndex_ = ManageAssetTable();
        if (!SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.ActionButtonXpath(rowIndex),15))
          {
              err.println("[ERROR]: Failed to wait for ActionButton");
              return false;
          } 
        
        
         if (!SeleniumDriverInstance.clickElementbyXpath(LanguagingAppliedToAssetsPageObjects.ActionButtonXpath(rowIndex)))
          {
              err.println("[ERROR]: Failed to ClickActionButton");
              return false;
          }
         testData.extractParameter("Mobile device",mobileDevice,"UNCHECKED");
         SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.ColumnChooser(),15);
         //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("ClickActionButton", false);  
        return true;
    }
    
    public boolean ClickOnBreadCrumb()
    {
          SeleniumDriverInstance.pause(1000);
          if (!SeleniumDriverInstance.clickElementbyXpath(AddNewRolePageObjects.ClickOnBreadCrumbXpath()))
              return false;
          
          if (!SeleniumDriverInstance.enterTextByXpath(AddNewRolePageObjects.ClickOnBreadCrumbFilterXpath(), this.testData.getData("BreadcrumColumn3")))
              return false;
                    
          if (!SeleniumDriverInstance.clickElementbyXpath(AddNewRolePageObjects.ClickOnSearchButtonOnBreadCrumbXpath()))
              return false;
                 
          SeleniumDriverInstance.pause(1000);
          
          String organization= SeleniumDriverInstance.retrieveValueByXpath(AddNewRolePageObjects.ClickOnBreadCrumbFilterXpath());
            
          if (!SeleniumDriverInstance.clickElementbyXpath(AddNewRolePageObjects.DynaSelectedOrganisationXpath(organization)))
              return false;
          
          if(!SeleniumDriverInstance.clickElementbyXpath(LanguagingAppliedToAssetsPageObjects.ButtonSelectEnglishXpath()))
              return false;
                
          
          //Take Screenshot
          SeleniumDriverInstance.takeScreenShot("Successfully Clicked on the Bread Crumb", false);
          return true;
      }
    
    public boolean ClickDiagnosticsLinkText()
    {
         //----------get the column and it row number
        String rowIndex =  SeleniumDriverInstance.getElementAttributeByXpath(LanguagingAppliedToAssetsPageObjects.mobileDeviceColumnXpath(),"row");
       

        String mobileDevice = SeleniumDriverInstance.retrieveTextByXpath(LanguagingAppliedToAssetsPageObjects.ColumnAndRowIndexXpath(testData.getData("MobileDeviceColumn"), rowIndex));
        // String rowIndex_ = ManageAssetTable();
         
         if (!SeleniumDriverInstance.clickElementbyXpath(DiagnosticsFunctionalityForAT_VT_assetsPageObjects.DiagnosticActionLinkXpath(testData.getData("Diagnostic"),rowIndex)))
          {
               err.println("[ERROR]: Failed to ClickDiagnosticsLinkText");
              return false;
          }
         testData.extractParameter("Non-FM Mobile device",mobileDevice,"UNCHECKED");
         SeleniumDriverInstance.waitForElementByXpath(LanguagingAppliedToAssetsPageObjects.ColumnChooser(),15);
         //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("ClickDiagnosticsLinkText", false);  
        return true;
    } 
    
    public boolean InspectDiagnosticPageSubHeadings()
    {
        waitForNewWindowSpinner();
        
        if (!SeleniumDriverInstance.waitForElementByXpath(DiagnosticsFunctionalityForAT_VT_assetsPageObjects.UnitDetailHeadingXpath()))
          {
              err.println("[ERROR]: Failed to wait for UnitDetailHeading");
              return false;
          }
        
        if (!SeleniumDriverInstance.waitForElementByXpath(DiagnosticsFunctionalityForAT_VT_assetsPageObjects.PeripheralStatusInformationHeadingXpath()))
          {
              err.println("[ERROR]: Failed to wait for PeripheralStatusInformationHeading");
              return false;
          }
        
        if (!SeleniumDriverInstance.waitForElementByXpath(DiagnosticsFunctionalityForAT_VT_assetsPageObjects.GPS_StatusInformationHeadingXpath()))
          {
              err.println("[ERROR]: Failed to wait for GPS_StatusInformationHeading");
              return false;
          }
        
        if (!SeleniumDriverInstance.waitForElementByXpath(DiagnosticsFunctionalityForAT_VT_assetsPageObjects.LatestPositionInformationHeadingXpath()))
          {
              err.println("[ERROR]: Failed to wait for LatestPositionInformation");
              return false;
          }
        
        if (!SeleniumDriverInstance.waitForElementByXpath(DiagnosticsFunctionalityForAT_VT_assetsPageObjects.FirmwareHistoryHeadingXpath()))
          {
              err.println("[ERROR]: Failed to wait for FirmwareHistoryHeading");
              return false;
          }
        
        SeleniumDriverInstance.takeScreenShot("InspectDiagnosticPageSubHeadings", false);  
        return true;
    }
    
    public boolean clickUnitDetails()
    {
        waitForNewWindowSpinner();
        
        if (!SeleniumDriverInstance.clickElementbyXpath(DiagnosticsFunctionalityForAT_VT_assetsPageObjects.UnitDetailHeadingXpath()))
          {
              err.println("[ERROR]: Failed to clickUnitDetails");
              return false;
          }
        
        SeleniumDriverInstance.takeScreenShot("clickUnitDetails", false);  
        return true;
    }
    
    public boolean clickFirmwareHistory()
    {
        if (!SeleniumDriverInstance.clickElementbyXpath(DiagnosticsFunctionalityForAT_VT_assetsPageObjects.FirmwareHistoryHeadingXpath()))
          {
              err.println("[ERROR]: Failed to clickFirmwareHistory");
              return false;
          }
        
        SeleniumDriverInstance.takeScreenShot("clickFirmwareHistory", false);  
        return true;
    }
    
    public boolean clickPeripheralStatusInformation()
    {
        if (!SeleniumDriverInstance.clickElementbyXpath(DiagnosticsFunctionalityForAT_VT_assetsPageObjects.PeripheralStatusInformationHeadingXpath()))
          {
              err.println("[ERROR]: Failed to clickPeripheralStatusInformation");
              return false;
          }
        
        SeleniumDriverInstance.takeScreenShot("clickPeripheralStatusInformation", false);  
        return true;
    }
    
    public boolean clickGPS_StatusInformation()
    {
        if (!SeleniumDriverInstance.clickElementbyXpath(DiagnosticsFunctionalityForAT_VT_assetsPageObjects.GPS_StatusInformationHeadingXpath()))
          {
              err.println("[ERROR]: Failed to clickGPS_StatusInformation");
              return false;
          }
        
        SeleniumDriverInstance.takeScreenShot("clickGPS_StatusInformation", false);  
        return true;
    }
    
    public boolean clickLatestPositionInformation()
    {
        if (!SeleniumDriverInstance.clickElementbyXpath(DiagnosticsFunctionalityForAT_VT_assetsPageObjects.LatestPositionInformationHeadingXpath()))
          {
              err.println("[ERROR]: Failed to clickLatestPositionInformation");
              return false;
          }
        
        SeleniumDriverInstance.takeScreenShot("clickLatestPositionInformation", false);  
        return true;
    }
    
    public boolean inspectUnitDetailsColumns()
    {
        
        if (!SeleniumDriverInstance.waitForElementByXpath(DiagnosticsFunctionalityForAT_VT_assetsPageObjects.ESN_td_Xpath(),10))
          {
              err.println("[ERROR]: Failed to wait for ESN");
              return false;
          }
        
        if (!SeleniumDriverInstance.waitForElementByXpath(DiagnosticsFunctionalityForAT_VT_assetsPageObjects.MobileID_td_Xpath(),10))
          {
              err.println("[ERROR]: Failed to wait for MobileID");
              return false;
          }
        
        if (!SeleniumDriverInstance.waitForElementByXpath(DiagnosticsFunctionalityForAT_VT_assetsPageObjects.FirstIDReportTime_td_Xpath(),10))
          {
              err.println("[ERROR]: Failed to wait for FirstIDReportTime");
              return false;
          }
        
        if (!SeleniumDriverInstance.waitForElementByXpath(DiagnosticsFunctionalityForAT_VT_assetsPageObjects.LastID_ReportTime_td_Xpath(),10))
          {
              err.println("[ERROR]: Failed to wait for LastID_ReportTime");
              return false;
          }
        
        if (!SeleniumDriverInstance.waitForElementByXpath(DiagnosticsFunctionalityForAT_VT_assetsPageObjects.LastConfigSyncTime_td_Xpath(),10))
          {
              err.println("[ERROR]: Failed to wait for LastConfigSyncTime");
              return false;
          }
        
        if (!SeleniumDriverInstance.waitForElementByXpath(DiagnosticsFunctionalityForAT_VT_assetsPageObjects.LastConfigUpdateTime_td_Xpath(),10))
          {
              err.println("[ERROR]: Failed to wait for LastConfigUpdateTime");
              return false;
          }
        
        if (!SeleniumDriverInstance.waitForElementByXpath(DiagnosticsFunctionalityForAT_VT_assetsPageObjects.IP_Address_td_Xpath(),10))
          {
              err.println("[ERROR]: Failed to wait for IP_Address");
              return false;
          }
        
        if (!SeleniumDriverInstance.waitForElementByXpath(DiagnosticsFunctionalityForAT_VT_assetsPageObjects.IMEI_td_Xpath(),10))
          {
              err.println("[ERROR]: Failed to wait for IMEI");
              return false;
          }
        
        if (!SeleniumDriverInstance.waitForElementByXpath(DiagnosticsFunctionalityForAT_VT_assetsPageObjects.IMSI_td_Xpath(),10))
          {
              err.println("[ERROR]: Failed to wait for IMSI");
              return false;
          }
        
        if (!SeleniumDriverInstance.waitForElementByXpath(DiagnosticsFunctionalityForAT_VT_assetsPageObjects.ICCID_td_Xpath(),10))
          {
              err.println("[ERROR]: Failed to wait for ICCID");
              return false;
          }
        
        if (!SeleniumDriverInstance.waitForElementByXpath(DiagnosticsFunctionalityForAT_VT_assetsPageObjects.ScriptVersion_td_Xpath(),10))
          {
              err.println("[ERROR]: Failed to wait for ScriptVersion");
              return false;
          }
        
        if (!SeleniumDriverInstance.waitForElementByXpath(DiagnosticsFunctionalityForAT_VT_assetsPageObjects.ConfigVersion_td_Xpath(),10))
          {
              err.println("[ERROR]: Failed to wait for ConfigVersion");
              return false;
          }
        
        if (!SeleniumDriverInstance.waitForElementByXpath(DiagnosticsFunctionalityForAT_VT_assetsPageObjects.ConfigStatus_td_Xpath(),10))
          {
              err.println("[ERROR]: Failed to wait for ConfigStatus");
              return false;
          }
        
        if (!SeleniumDriverInstance.waitForElementByXpath(DiagnosticsFunctionalityForAT_VT_assetsPageObjects.ConfigurationGroup_td_Xpath(),10))
          {
              err.println("[ERROR]: Failed to wait for ConfigurationGroup");
              return false;
          }
        
         if (!SeleniumDriverInstance.waitForElementByXpath(DiagnosticsFunctionalityForAT_VT_assetsPageObjects.ModemSelections_td_Xpath(),10))
          {
              err.println("[ERROR]: Failed to wait for ModemSelections");
              return false;
          }
         
          if (!SeleniumDriverInstance.waitForElementByXpath(DiagnosticsFunctionalityForAT_VT_assetsPageObjects.CustomerName_td_Xpath(),10))
          {
              err.println("[ERROR]: Failed to wait for CustomerName");
              return false;
          }
          
           if (!SeleniumDriverInstance.waitForElementByXpath(DiagnosticsFunctionalityForAT_VT_assetsPageObjects.Group_td_Xpath(),10))
          {
              err.println("[ERROR]: Failed to wait for Group");
              return false;
          }
           
          if (!SeleniumDriverInstance.waitForElementByXpath(DiagnosticsFunctionalityForAT_VT_assetsPageObjects.FirmwareStatus_td_Xpath(),10))
          {
              err.println("[ERROR]: Failed to wait for FirmwareStatus");
              return false;
          }
          
          if (!SeleniumDriverInstance.waitForElementByXpath(DiagnosticsFunctionalityForAT_VT_assetsPageObjects.FirmwareVersion_td_Xpath(),10))
          {
              err.println("[ERROR]: Failed to wait for FirmwareVersion");
              return false;
          }
        
        SeleniumDriverInstance.takeScreenShot("inspectUnitDetailsColumns", false);  
        return true;
    }
    

    public boolean inspectFirmwareColumns()
    {
        if (!SeleniumDriverInstance.waitForElementByXpath(DiagnosticsFunctionalityForAT_VT_assetsPageObjects.Request_th_FirmwareHistoryXpath(),10))
          {
              err.println("[ERROR]: Failed to wait for Request_th_FirmwareHistory column");
              return false;
          }
        
        if (!SeleniumDriverInstance.waitForElementByXpath(DiagnosticsFunctionalityForAT_VT_assetsPageObjects.Updated_th_FirmwareHistoryXpath(),10))
          {
              err.println("[ERROR]: Failed to wait for Updated_th_FirmwareHistory column");
              return false;
          }
        
        if (!SeleniumDriverInstance.waitForElementByXpath(DiagnosticsFunctionalityForAT_VT_assetsPageObjects.OldVersion_th_FirmwareHistoryXpath(),10))
          {
              err.println("[ERROR]: Failed to wait for OldVersion_th_FirmwareHistory column");
              return false;
          }
        
        if (!SeleniumDriverInstance.waitForElementByXpath(DiagnosticsFunctionalityForAT_VT_assetsPageObjects.NewVersion_th_FirmwareHistoryXpath(),10))
          {
              err.println("[ERROR]: Failed to wait for NewVersion_th_FirmwareHistory column");
              return false;
          }
        
        if (!SeleniumDriverInstance.waitForElementByXpath(DiagnosticsFunctionalityForAT_VT_assetsPageObjects.Status_th_FirmwareHistoryXpath(),10))
          {
              err.println("[ERROR]: Failed to wait for Status_th_FirmwareHistory column");
              return false;
          }
        
       SeleniumDriverInstance.takeScreenShot("clickLatestPositionInformation", false);  
       return true;
    }
    
    public boolean validatePeripheralStatusInformation()
    {
        if (!SeleniumDriverInstance.waitForElementByXpath(DiagnosticsFunctionalityForAT_VT_assetsPageObjects.NoDataAvailablePeripheralStatusXpath(),10))
          {
              err.println("[ERROR]: Failed to wait for NoDataAvailablePeripheralStatus");
              return false;
          }
        
        SeleniumDriverInstance.takeScreenShot("validatePeripheralStatusInformation", false);  
        return true;
    }
    
    public boolean validateGpsStatusInformation()
    {
        if (!SeleniumDriverInstance.waitForElementByXpath(DiagnosticsFunctionalityForAT_VT_assetsPageObjects.NoDataAvailableGPS_StatusXpath(),10))
          {
              err.println("[ERROR]: Failed to wait for NoDataAvailableGPS_Status");
              return false;
          }
        
        SeleniumDriverInstance.takeScreenShot("validateGpsStatusInformation", false);  
        return true;
    }
    
   
    public boolean inspectLastPositionColumnsData()
    {    
        
        String DateAndTimeOfLastPostion = SeleniumDriverInstance.retrieveTextByXpath(DiagnosticsFunctionalityForAT_VT_assetsPageObjects.DateAndTimeOfLastPositionXpath());
        String Longitude = SeleniumDriverInstance.retrieveTextByXpath(DiagnosticsFunctionalityForAT_VT_assetsPageObjects.LongitudeOfLastPosiotnXpath());
        String Latitude = SeleniumDriverInstance.retrieveTextByXpath(DiagnosticsFunctionalityForAT_VT_assetsPageObjects.LatitudeOfLastPosiotnXpath());
        String GpsVelocity = SeleniumDriverInstance.retrieveTextByXpath(DiagnosticsFunctionalityForAT_VT_assetsPageObjects.GpsVelocityOfLastPositionXpath());
        String Altitude = SeleniumDriverInstance.retrieveTextByXpath(DiagnosticsFunctionalityForAT_VT_assetsPageObjects.AltitudeOfLastPosiotnXpath());
        String Heading = SeleniumDriverInstance.retrieveTextByXpath(DiagnosticsFunctionalityForAT_VT_assetsPageObjects.HeadingOfLastPosiotnXpath());
        String NumberOfSatellites = SeleniumDriverInstance.retrieveTextByXpath(DiagnosticsFunctionalityForAT_VT_assetsPageObjects.NumberOfSatelliteOfLastPositionXpath());
        String HDOP = SeleniumDriverInstance.retrieveTextByXpath(DiagnosticsFunctionalityForAT_VT_assetsPageObjects.HDOPOfLastPosiotnXpath());
        String AgeOfData = SeleniumDriverInstance.retrieveTextByXpath(DiagnosticsFunctionalityForAT_VT_assetsPageObjects.AgeOfDataOfLastPosiotnXpath());
        String DistanceSinceLastRecord = SeleniumDriverInstance.retrieveTextByXpath(DiagnosticsFunctionalityForAT_VT_assetsPageObjects.DistanceSinceLastRecordOfLastPositionXpath());
        
         testData.extractParameter("Inspect Last Position Data: ", "Date And Time Of Last Position: "+DateAndTimeOfLastPostion
                                                                                     +"<br> Longitude: "+Longitude
                                                                                     +"<br> Latitude: "+Latitude
                                                                                     +"<br> GpsVelocity: "+GpsVelocity
                                                                                     +"<br> Altitude: "+Altitude
                                                                                     +"<br> Heading: "+Heading
                                                                                     +"<br> NumberOfSatellites: "+NumberOfSatellites
                                                                                     +"<br> HDOP: "+HDOP
                                                                                     +"<br> AgeOfData: "+AgeOfData
                                                                                     +"<br> DistanceSinceLastRecord: "+DistanceSinceLastRecord,"PASS");
        
        SeleniumDriverInstance.takeScreenShot("inspectLastPositionColumnsData", false);  
        
       
        return true;
    }
    String parentHandle; 
    public boolean SwitchToDiagnosticWindow()
    {
        // get the current window handle
         parentHandle = SeleniumDriverInstance.Driver.getWindowHandle(); 
          while(parentHandle.equalsIgnoreCase(SeleniumDriverInstance.Driver.getWindowHandle()))
        {
            for (String winHandle : SeleniumDriverInstance.Driver.getWindowHandles()) {
                
                // switch focus of WebDriver to the next found window handle (that's your newly opened window)
                SeleniumDriverInstance.Driver.switchTo().window(winHandle); 
            }
            
        }
        
        return true;
    }
    
    
    
    public boolean SwitchToOriginalWindow()
    {
                
        SeleniumDriverInstance.Driver.close(); // close newly opened window when done with it
        SeleniumDriverInstance.Driver.switchTo().window(parentHandle); // switch back to the original window
        //String winHandleBefore = SeleniumDriverInstance.Driver.getWindowHandle();
        
        // Switch back to original browser (first window)
       // SeleniumDriverInstance.Driver.switchTo().window(winHandleBefore);
        
        return true;
    }

    private boolean waitForNewWindowSpinner() 
    {
        pause(1500);
        
        if (!SeleniumDriverInstance.waitForElementByXpath(DiagnosticsFunctionalityForAT_VT_assetsPageObjects.frameSpinnerXpath(), 90))
          {
              err.println("[ERROR]: Failed to wait for new window spinner to finish loading");
              return false;
          }
        return true;
    }

}
