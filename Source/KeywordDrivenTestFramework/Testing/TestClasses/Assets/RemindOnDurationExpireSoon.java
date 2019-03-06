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
import KeywordDrivenTestFramework.Testing.PageObjects.RemindOnDurationExpireSoonObjects;
import static java.lang.System.err;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

/**
 *
 * @author kmanakaza
 */
public class RemindOnDurationExpireSoon extends BaseClass
{

    int counter = 1;
    int randomNumber;
    String selectedLanguage;
    String measurementUnits;
    String odometer;
    String lastService;
    String StrandRandomNumber;
    String error;

    TestEntity testData;

    public RemindOnDurationExpireSoon(TestEntity testData)
    {
        this.testData = testData;
    }

    public TestResult executeTest()
    {
        this.setStartTime();

        if (!navigateToDatabaseAdministration())
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To Navigate To Database Administration Page", true);
            counter++;
            narrator.failedMessage("Failed To Navigate To Database Administration Page - " + error);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To Navigate To Database Administration Page", this.getTotalExecutionTime());
        }

        if (!expandOrganisationTree())
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To expand Test RSO tree", true);
            counter++;
            narrator.failedMessage("Failed To expand Test RSO tree - " + error);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To expand Test RSO tree", this.getTotalExecutionTime());
        }

        if (!selectOrganisation())
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To select Organisation", true);
            counter++;
            narrator.failedMessage("Failed To select Organisation - " + error);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To select Organisation", this.getTotalExecutionTime());
        }

        if (!selectMeasurementSettings())
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To select Measurement Settings", true);
            counter++;
            narrator.failedMessage("Failed To select Measurement Settings - " + error);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To select Measurement Settings", this.getTotalExecutionTime());
        }

        if (!inspectLanguageSelected())
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To inspect Language Selected", true);
            counter++;
            narrator.failedMessage("Failed To inspect Language Selected - " + error);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To inspect Language Selected", this.getTotalExecutionTime());
        }

        if (!inspectMeasurementUnits())
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To inspect Measurement Units", true);
            counter++;
            narrator.failedMessage("Failed To inspect Measurement Units - " + error);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To inspect Measurement Units", this.getTotalExecutionTime());
        }

        if (!navigateToAssetManagementPage())
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To Navigate To Asset Management Page", true);
            counter++;
            narrator.failedMessage("Failed To Navigate To Asset Management Page - " + error);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To Navigate To Asset Management Page", this.getTotalExecutionTime());
        }

        if (!selectAssetToEdit())
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to select asset", true);
            counter++;
            narrator.failedMessage("Failed to select asset - " + error);
            return new TestResult(testData, Enums.ResultStatus.FAIL, " Failed to select asset", this.getTotalExecutionTime());
        }

        if (!selectReminders())
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to select Reminders", true);
            counter++;
            narrator.failedMessage("Failed to select Reminders - " + error);
            return new TestResult(testData, Enums.ResultStatus.FAIL, " Failed to select Reminders", this.getTotalExecutionTime());
        }

        if (!inspectOdometer())
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To inspect Last Service", true);
            counter++;
            narrator.failedMessage("Failed To inspect Last Service - " + error);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To inspect Last Service", this.getTotalExecutionTime());
        }

        if (!inspectLastService())
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To inspect Last Service", true);
            counter++;
            narrator.failedMessage("Failed To inspect Last Service - " + error);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To inspect Last Service", this.getTotalExecutionTime());
        }

        if (!clickRemindOnDurationCheckbox())
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To click Remind On Duration Checkbox", true);
            counter++;
            narrator.failedMessage("Failed To click Remind On Duration Checkbox - " + error);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To click Remind On Duration Checkbox", this.getTotalExecutionTime());
        }

        if (!enterNextServiceDate())
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To enter Next Service Date", true);
            counter++;
            narrator.failedMessage("Failed To enter Next Service Date - " + error);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To enter Next Service Date", this.getTotalExecutionTime());
        }

        if (!enterServiceInterval())
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To enter Service Interval", true);
            counter++;
            narrator.failedMessage("Failed To enter Service Interval - " + error);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To enter Service Interval", this.getTotalExecutionTime());
        }

        if (!enterReminderPeriod())
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To enter Reminder Period", true);
            counter++;
            narrator.failedMessage("Failed To enter Reminder Period - " + error);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To enter Reminder Period", this.getTotalExecutionTime());
        }

        if (!clickSelectRecipientButton())
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To click Select Recipient Button", true);
            counter++;
            narrator.failedMessage("Failed To click Select Recipient Button - " + error);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To click Select Recipient Button", this.getTotalExecutionTime());
        }

        if (!clickRecipientCheckbox())
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To click Recipient Checkbox", true);
            counter++;
            narrator.failedMessage("Failed To click Recipient Checkbox - " + error);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To click Recipient Checkbox", this.getTotalExecutionTime());
        }

        if (!clickSelectButton())
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To click Select Button", true);
            counter++;
            narrator.failedMessage("Failed To click Select Button - " + error);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To click Select Button", this.getTotalExecutionTime());
        }

        if (!clickOnClickHere())
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To click On Click Here to add", true);
            counter++;
            narrator.failedMessage(" Failed To click On Click Here to add - " + error);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To click On Click Here to add", this.getTotalExecutionTime());
        }

        if (!AddNewContact())
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To Add New Contact", true);
            counter++;
            narrator.failedMessage(" Failed To Add New Contact - " + error);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To Add New Contact", this.getTotalExecutionTime());
        }

        if (!clickSelectRecipientButtonAgain())
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To click Select Recipient Button", true);
            counter++;
            narrator.failedMessage("Failed To click Select Recipient Button - " + error);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To click Select Recipient Button", this.getTotalExecutionTime());
        }

        if (!searchForRecipient())
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To search For Recipient", true);
            counter++;
            narrator.failedMessage("Failed To search For Recipient - " + error);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To search For Recipient", this.getTotalExecutionTime());
        }

        if (!clickNewRecipientCheckbox())
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To click New Recipient Checkbox", true);
            counter++;
            narrator.failedMessage(" Failed To click New Recipient Checkbox - " + error);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To click New Recipient Checkbox", this.getTotalExecutionTime());
        }

        if (!clickSelectButtonAgain())
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To click Select Button", true);
            counter++;
            narrator.failedMessage("Failed To click Select Button - " + error);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To click Select Button", this.getTotalExecutionTime());
        }

        if (!clickSaveButton())
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed To click Save Button", true);
            counter++;
            narrator.failedMessage("Failed To click Save Button - " + error);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed To click Save Button", this.getTotalExecutionTime());
        }

        return new TestResult(testData, Enums.ResultStatus.PASS, "Successful", this.getTotalExecutionTime());
    }

    private boolean navigateToDatabaseAdministration()
    {
        //Wait for Manage Menu
        SeleniumDriverInstance.waitForElementByXpath(RemindOnDurationExpireSoonObjects.ManageMenuRelativeXpath(), 30);

        //Click Manage Menu
        if (!SeleniumDriverInstance.clickElementbyXpath(RemindOnDurationExpireSoonObjects.ManageMenuRelativeXpath()))
        {
            err.println("[ERROR] Failed to click Manage menu");
            error = "Failed to click Manage menu";
            return false;
        }
        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("Manage Menu Clicked", false);

        //Click Database Administration Sub Menu
        if (!SeleniumDriverInstance.clickElementbyXpath(RemindOnDurationExpireSoonObjects.DatabaseAdministrationRelativeXpath()))
        {
            err.println("[ERROR] Failed to click Database Administration Sub Menu");
            error = "Failed to click Database Administration Sub Menu";
            return false;
        }

        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("Database Administration Menu Clicked", false);

        return true;
    }

    private boolean expandOrganisationTree()
    {
        //Wait for expand organisation
        SeleniumDriverInstance.waitForElementByXpath(RemindOnDurationExpireSoonObjects.TestRSOTreeRelativeXpath(), 30);

        //Click Organisation
        if (!SeleniumDriverInstance.clickElementbyXpath(RemindOnDurationExpireSoonObjects.TestRSOTreeRelativeXpath()))
        {
            err.println("[ERROR] Failed to click expand organisation");
            error = "Failed to click expand organisation";
            return false;
        }
        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("Test RSO tree expanded", false);

        return true;
    }

    private boolean selectOrganisation()
    {
        //Wait for organisation
        SeleniumDriverInstance.waitForElementByXpath(RemindOnDurationExpireSoonObjects.DVTAutomationOrgRelativeXpath(), 30);

        //Click Organisation
        if (!SeleniumDriverInstance.clickElementbyXpath(RemindOnDurationExpireSoonObjects.DVTAutomationOrgRelativeXpath()))
        {
            err.println("[ERROR] Failed to click organistaion");
            error = "Failed to click organistaion";
            return false;
        }
        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("DVT Automation Organisation selected", false);

        return true;
    }

    private boolean selectMeasurementSettings()
    {
        //Wait for measurement settings 
        SeleniumDriverInstance.waitForElementByXpath(RemindOnDurationExpireSoonObjects.MeasurementSettingsRelativeXpath(), 30);

        //Click Measurement Settings
        if (!SeleniumDriverInstance.clickElementbyXpath(RemindOnDurationExpireSoonObjects.MeasurementSettingsRelativeXpath()))
        {
            err.println("[ERROR] Failed to click Measurement Settings");
            error = "Failed to click Measurement Settings";
            return false;
        }
        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("Measurement Settings selected", false);

        return true;
    }

    private boolean inspectLanguageSelected()
    {
        //Wait for Languaging
        SeleniumDriverInstance.waitForElementByXpath(RemindOnDurationExpireSoonObjects.LanguageRelativeXpath(), 30);

        //Retrieve Language Selected
        selectedLanguage = SeleniumDriverInstance.retrieveTextByXpath(RemindOnDurationExpireSoonObjects.LanguageRelativeXpath());
        if (selectedLanguage.equals(""))
        {
            testData.extractParameter("Language Selected: " + selectedLanguage, "Measurement uniits: " + measurementUnits, "FAIL");
            error = "Failed to retrieve relative language";
            return false;
        }
        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("Language text inspected", false);

        return true;
    }

    private boolean inspectMeasurementUnits()
    {
        //Wait for Measurement units
        SeleniumDriverInstance.waitForElementByXpath(RemindOnDurationExpireSoonObjects.MeasurementUnitsRelativeXpath(), 30);

        //Retrieve Measurement Units
        measurementUnits = SeleniumDriverInstance.retrieveTextByXpath(RemindOnDurationExpireSoonObjects.MeasurementUnitsRelativeXpath());
        if (measurementUnits.equals(""))
        {
            testData.extractParameter("Language Selected: " + selectedLanguage, "Measurement uniits: " + measurementUnits, "FAIL");
            return false;
        }
        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("Measurement units inspected", false);

        return true;
    }

    private boolean navigateToAssetManagementPage()
    {
        //Click Monitor Menu
        if (!SeleniumDriverInstance.clickElementbyXpath(RemindOnDurationExpireSoonObjects.MonitorMenuRelativeXpath()))
        {
            err.println("[ERROR] Failed to click monitor");
            error = "Failed to click monitor";
            return false;
        }
        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("ManageMenuClicked", false);

        //Click Asset submenu
        if (!SeleniumDriverInstance.clickElementbyXpath(RemindOnDurationExpireSoonObjects.AssetSubMenuRelativeXpath()))
        {
            err.println("[ERROR] Failed to click asset submenu");
            error = "Failed to click asset submenu";
            return false;
        }
        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("AssetSubMenuClicked", false);

        //Click TripTimeline Menu
        if (!SeleniumDriverInstance.waitForElementByXpath(RemindOnDurationExpireSoonObjects.AddAssetButtonRelativeXpath()))
        {
            err.println("[ERROR] Failed to click Asset");
            error = "Failed to click Asset";
            return false;
        }
        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("LandedOnAssetManagementPage", false);

        return true;
    }

    private boolean selectAssetToEdit()
    {
        //Wait for Asset 
        SeleniumDriverInstance.waitForElementByXpath(RemindOnDurationExpireSoonObjects.AssetRelativeXpath(), 30);

        //Click Asset Menu
        if (!SeleniumDriverInstance.clickElementbyXpath(RemindOnDurationExpireSoonObjects.AssetRelativeXpath()))
        {
            err.println("[ERROR] Failed to click Asset");
            error = "Failed to click Asset";
            return false;
        }
        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("Asset selected", false);

        return true;
    }

    private boolean selectReminders()
    {
        //Wait for Odometer 
        SeleniumDriverInstance.waitForElementByXpath(RemindOnDurationExpireSoonObjects.RemindersRelativeXpath(), 30);

        //Click Reminders Menu
        if (!SeleniumDriverInstance.clickElementbyXpath(RemindOnDurationExpireSoonObjects.RemindersRelativeXpath()))
        {
            err.println("[ERROR] Failed to click reminders");
            error = "Failed to click reminders ";
            return false;
        }
        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("Reminders selected", false);

        return true;
    }

    private boolean inspectOdometer()
    {
        //Wait for Odometer 
        SeleniumDriverInstance.waitForElementByXpath(RemindOnDurationExpireSoonObjects.OdometerRelativeXpath(), 30);

        //Retrieve Current Odometer
        odometer = SeleniumDriverInstance.retrieveTextByXpath(RemindOnDurationExpireSoonObjects.OdometerRelativeXpath());
        if (selectedLanguage.equals(""))
        {
            testData.extractParameter("Language Selected: " + selectedLanguage + "<br>Measurement units: " + measurementUnits, "Odometer: " + odometer + "<br>Last service: " + lastService, "FAIL");
            return false;
        }
        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("Current odometer inspected", false);

        return true;
    }

    private boolean inspectLastService()
    {
        //Wait for inspect Last
        SeleniumDriverInstance.waitForElementByXpath(RemindOnDurationExpireSoonObjects.LastServiceRelativeXpath(), 30);

        //Retrieve Last Service
        lastService = SeleniumDriverInstance.retrieveTextByXpath(RemindOnDurationExpireSoonObjects.LastServiceRelativeXpath());
        if (measurementUnits.equals(""))
        {
            testData.extractParameter("Language Selected: " + selectedLanguage + "<br>Measurement units: " + measurementUnits, "Odometer: " + odometer + "<br>Last service: " + lastService, "FAIL");
            return false;
        }
        testData.extractParameter("Language Selected: " + selectedLanguage + "<br>Measurement units: " + measurementUnits, "Odometer: " + odometer + "<br>Last service: " + lastService, "PASS");
        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("Last service inspected", false);

        return true;
    }

    private boolean clickRemindOnDurationCheckbox()
    {

        if (!SeleniumDriverInstance.waitForElementByXpath(RemindOnDurationExpireSoonObjects.ValidateServiceFormXpath(), 15))
        {
            return true;
        }
        else if (!SeleniumDriverInstance.clickElementbyXpath(RemindOnDurationExpireSoonObjects.RemindOnDurationRelativeXpath()))
        {
            err.println("[ERROR] Failed to Click on Enable Remind On Duration reminders");
            error = " Failed to Click on Enable Remind On Duration reminders";
            return false;
        }
        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("Remind On Duration checked", false);

        return true;
    }

    private boolean enterNextServiceDate()
    {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.MONTH, 1);
        cal.set(Calendar.DAY_OF_MONTH, 25);
        Date result = cal.getTime();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String effectiveDate = dateFormat.format(result);

        //Enter Next service interval
        if (!SeleniumDriverInstance.enterTextByXpath(RemindOnDurationExpireSoonObjects.NextServiceRelativeXpath(), effectiveDate))
        {
            err.println("[ERROR] Failed to enter next service interval");
            error = " Failed to enter next service interval";
            return false;
        }
        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("Next Service date entered", false);

        return true;
    }

    private boolean enterServiceInterval()
    {
        //Wait for Service Interval
        SeleniumDriverInstance.waitForElementByXpath(RemindOnDurationExpireSoonObjects.ServiceIntervalRelativeXpath(), 30);

        //Enter service interval
        if (!SeleniumDriverInstance.enterTextByXpath(RemindOnDurationExpireSoonObjects.ServiceIntervalRelativeXpath(), testData.getData("ServiceInterval")))
        {
            err.println("[ERROR] Failed to enter service interval");
            error = "Failed to enter service interval";
            return false;
        }
        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("Service interval entered", false);

        return true;
    }

    private boolean enterReminderPeriod()
    {
        //Wait for Reminder
        SeleniumDriverInstance.waitForElementByXpath(RemindOnDurationExpireSoonObjects.ReminderPeriodRelativeXpath(), 30);

        //Enter reminder period
        if (!SeleniumDriverInstance.enterTextByXpath(RemindOnDurationExpireSoonObjects.ReminderPeriodRelativeXpath(), testData.getData("ReminderPeriod")))
        {
            err.println("[ERROR] Failed to enter reminder period");
            error = "Failed to enter reminder period";
            return false;
        }
        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("Reminder period entered", false);

        return true;
    }

    private boolean clickSelectRecipientButton()
    {
        //Wait for Recipient buton
        SeleniumDriverInstance.waitForElementByXpath(RemindOnDurationExpireSoonObjects.SelectRecipientsRelativeXpath(), 30);

        //Click Select Recipient Button
        if (!SeleniumDriverInstance.clickElementbyXpath(RemindOnDurationExpireSoonObjects.SelectRecipientsRelativeXpath()))
        {
            err.println("[ERROR] Failed to click Recipient");
            error = "Failed to click Recipient";
            return false;
        }
        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("Select recipient successfully clicked", false);

        return true;
    }

    private boolean clickRecipientCheckbox()
    {
        //Wait for Recipient check box
        SeleniumDriverInstance.waitForElementByXpath(RemindOnDurationExpireSoonObjects.RecipientsCheckboxRelativeXpath(), 30);

        //Click Recipient Checkbox
        if (!SeleniumDriverInstance.clickElementbyXpath(RemindOnDurationExpireSoonObjects.RecipientsCheckboxRelativeXpath()))
        {
            err.println("[ERROR] Failed to click Recipient check box");
            error = "Failed to click Recipient check box";
            return false;
        }
        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("Recipient Checkbox checked", false);

        return true;
    }

    private boolean clickSelectButton()
    {
        //Wait for Select button
        SeleniumDriverInstance.waitForElementByXpath(RemindOnDurationExpireSoonObjects.SelectButtonRelativeXpath(), 30);

        //Click Select Button
        if (!SeleniumDriverInstance.clickElementbyXpath(RemindOnDurationExpireSoonObjects.SelectButtonRelativeXpath()))
        {
            err.println("[ERROR] Failed to click Select Button");
            error = "Failed to click Select Button";
            return false;
        }
        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("SelectButton clicked", false);

        return true;
    }

    private boolean clickOnClickHere()
    {
        SeleniumDriverInstance.pause(3000);

        //Click on Click here
        if (!SeleniumDriverInstance.clickElementbyXpath(RemindOnDurationExpireSoonObjects.ClickHereRelativeXpath()))
        {
            err.println("[ERROR] Failed to click Click Here");
            error = "Failed to click Click Here";
            return false;
        }
        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("Click here to add clicked", false);

        return true;
    }

    public boolean AddNewContact()
    {
        Random rand = new Random();
        randomNumber = rand.nextInt(900) + 100;
        StrandRandomNumber = Integer.toString(randomNumber);

        //Enter First Name from spreadsheet
        if (!SeleniumDriverInstance.enterTextByXpath(RemindOnDurationExpireSoonObjects.FirstNameTextboxRelativeXpath(), this.testData.getData("FirstName") + StrandRandomNumber))
        {
            testData.extractParameter("Test result: ", "Failed to Enter First Name", "FAIL");
            err.println("[ERROR] Failed to Enter First Name");
            error = "Failed to Enter First Name";
            return false;
        }

        //Enter Last Name from spreadsheet
        if (!SeleniumDriverInstance.enterTextByXpath(RemindOnDurationExpireSoonObjects.LastNameTextboxRelativeXpath(), this.testData.getData("LastName") + StrandRandomNumber))
        {
            testData.extractParameter("Test result: ", "Failed to Enter Last Name", "FAIL");
            err.println("[ERROR] Failed to Enter Last Name");
            error = "Failed to Enter Last Name";
            return false;
        }

        //Enter Employer from spreadsheet
        if (!SeleniumDriverInstance.enterTextByXpath(RemindOnDurationExpireSoonObjects.EmployerTextboxRelativeXpath(), this.testData.getData("Employer")))
        {
            testData.extractParameter("Test result: ", "Failed to Enter Employer", "FAIL");
            err.println("[ERROR] Failed to Enter Employer");
            error = "Failed to Enter Employer";
            return false;
        }

        //Enter Position from spreadsheet  
        if (!SeleniumDriverInstance.enterTextByXpath(RemindOnDurationExpireSoonObjects.PositionTextboxRelativeXpath(), this.testData.getData("Position")))
        {
            testData.extractParameter("Test result: ", "Failed to Enter Position", "FAIL");
            err.println("[ERROR] Failed to Enter Position");
            error = "Failed to Enter Position";
            return false;
        }

        //Enter Home Number from spreadsheet
        if (!SeleniumDriverInstance.enterTextByXpath(RemindOnDurationExpireSoonObjects.HomeNumberTextboxRelativeXpath(), this.testData.getData("HomeNumber")))
        {
            testData.extractParameter("Test result: ", "Failed to enter Enter Home Number", "FAIL");
            err.println("[ERROR] Failed to enter Enter Home Number");
            error = "Failed to enter Enter Home Number";
            return false;
        }

        //Enter Work Number from spreadsheet
        if (!SeleniumDriverInstance.enterTextByXpath(RemindOnDurationExpireSoonObjects.WorkNumberTextboxRelativeXpath(), this.testData.getData("WorkNumber")))
        {
            testData.extractParameter("Test result: ", "Failed to Enter Work Number", "FAIL");
            err.println("[ERROR] Failed to Enter Work Number");
            error = "Failed to Enter Work Number";
            return false;
        }

        //Enter Mobile Number from spreadsheet
        if (!SeleniumDriverInstance.enterTextByXpath(RemindOnDurationExpireSoonObjects.MobileNumberTextboxRelativeXpath(), this.testData.getData("MobileNumber")))
        {
            testData.extractParameter("Test result: ", "Failed to Enter Mobile Number", "FAIL");
            err.println("[ERROR] Failed to Enter Mobile Number");
            error = "Failed to Enter Mobile Number";
            return false;
        }

        //Enter Email Address from spreadsheet
        if (!SeleniumDriverInstance.enterTextByXpath(RemindOnDurationExpireSoonObjects.EmailTextboxRelativeXpath(), this.testData.getData("EmailAddress")))
        {
            testData.extractParameter("Test result: ", "Failed to Enter Email Address", "FAIL");
            err.println("[ERROR] Failed to Enter Email Address");
            error = "Failed to Enter Email Address";
            return false;
        }
        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("Successfully Completed the fields, and submit button is enabled", false);

        SeleniumDriverInstance.pause(3000);

        //Click on the Save button
        if (!SeleniumDriverInstance.clickElementByXpath(RemindOnDurationExpireSoonObjects.SubmitButtonRelativeXpath()))
        {
            testData.extractParameter("Test result: ", "Failed to Click Submit Button", "FAIL");
            err.println("[ERROR] Failed to Click Submit Button");
            error = "Failed to Click Submit Button";
            return false;
        }
        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("Save button clicked successfully", false);

        return true;
    }

    private boolean clickSelectRecipientButtonAgain()
    {
        SeleniumDriverInstance.pause(3000);

        //Wait for Select Recipient
        SeleniumDriverInstance.waitForElementByXpath(RemindOnDurationExpireSoonObjects.SelectRecipientsRelativeXpath(), 30);

        //Click Select Recipient Button
        if (!SeleniumDriverInstance.clickElementbyXpath(RemindOnDurationExpireSoonObjects.SelectRecipientsRelativeXpath()))
        {
            err.println("[ERROR] Failed to click Select Recipient");
            error = "Failed to click Select Recipient";
            return false;
        }
        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("Select recipient successfully clicked", false);

        return true;
    }

    private boolean searchForRecipient()
    {
        //Wait for filter textbox
        SeleniumDriverInstance.waitForElementByXpath(RemindOnDurationExpireSoonObjects.FilterTextboxRelativeXpath(), 30);

        //Click Select Recipient Button
        if (!SeleniumDriverInstance.enterTextByXpath(RemindOnDurationExpireSoonObjects.FilterTextboxRelativeXpath(), this.testData.getData("LastName") + StrandRandomNumber))
        {
            err.println("[ERROR] Failed to enter last name");
            error = "Failed to enter last name";
            return false;
        }
        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("Select recipient successfully clicked", false);

        return true;
    }

    private boolean clickNewRecipientCheckbox()
    {
        //Wait for New recipient check box
        SeleniumDriverInstance.waitForElementByXpath(RemindOnDurationExpireSoonObjects.RecipientsCheckboxRelativeXpath(), 30);

        //Click Recipient Checkbox
        if (!SeleniumDriverInstance.clickElementbyXpath(RemindOnDurationExpireSoonObjects.RecipientsCheckboxRelativeXpath()))
        {
            err.println("[ERROR] Failed to click recipient checkbox");
            error = "Failed to click recipient checkbox";
            return false;
        }
        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("Recipient Checkbox checked", false);

        return true;
    }

    private boolean clickSelectButtonAgain()
    {
        //Wait for select button
        SeleniumDriverInstance.waitForElementByXpath(RemindOnDurationExpireSoonObjects.SelectButtonRelativeXpath(), 30);

        //Click Select Button
        if (!SeleniumDriverInstance.clickElementbyXpath(RemindOnDurationExpireSoonObjects.SelectButtonRelativeXpath()))
        {
            err.println("[ERROR] Failed to click Submit Button");
            error = "Failed to click Submit Button";
            return false;
        }
        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("SelectButton clicked", false);

        return true;
    }

    private boolean clickSaveButton()
    {
        if (!SeleniumDriverInstance.isElementEnabled(RemindOnDurationExpireSoonObjects.SaveButtonRelativeXpath()))
        {
            err.println("[ERROR] Failed to check if save button is enabled");
            error = "Failed to check if save button is enabled";
            return false;
        }
        //Wait for save button
        SeleniumDriverInstance.waitForElementByXpath(RemindOnDurationExpireSoonObjects.SaveButtonRelativeXpath(), 30);

        //Click Save Button
        if (!SeleniumDriverInstance.clickElementbyXpath(RemindOnDurationExpireSoonObjects.SaveButtonRelativeXpath()))
        {
            err.println("[ERROR] Failed to click save button");
            error = "Failed to click save button";
            return false;
        }

        //Take Screenshot 
        if (!SeleniumDriverInstance.waitForElementByXpath(RemindOnDurationExpireSoonObjects.SaveBannerdisappearXpath(), 30))
        {
            err.println("[ERROR] Failed to wait for save banner");
            error = "Failed to wait for save banner";
            return false;
        }
        SeleniumDriverInstance.takeScreenShot("Save Button clicked", false);

        return true;
    }

}
