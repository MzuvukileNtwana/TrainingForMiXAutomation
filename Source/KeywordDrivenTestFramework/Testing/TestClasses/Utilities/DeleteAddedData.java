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
import KeywordDrivenTestFramework.Testing.PageObjects.ItemNotAvailableWhenNotHavingPermissionPageObject;

/**
 *
 * @author elebese
 */
public class DeleteAddedData extends BaseClass
{
    
    TestEntity testData;

    String globalErrorMessage = "";
    String roleName = "DVTRoleName_2016";
    String firstName = "DuplicateDMF379";
    String lastName = "TestMan_2016";
    String SecurityGroupName = "DVTSecurityGroupName_2016";

    public DeleteAddedData(TestEntity testData) 
    {
        this.testData = testData;
    }
    
     public TestResult executeTest()
    {
        this.setStartTime();
        
        
            if(!DeletedAddedData())
            {
                SeleniumDriverInstance.takeScreenShot("Failed to deleted all the data that was added to the system during the test", true);
                return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to deleted all the data that was added to the system during the test - " + globalErrorMessage, this.getTotalExecutionTime());
            
        }
        
        return new TestResult(testData, Enums.ResultStatus.PASS, "Successfully completed the usability of manage locations", this.getTotalExecutionTime());
    }
     
    public boolean DeletedAddedData()
    {
        //Navigate To Users Page
        /*if (!SeleniumDriverInstance.clickElementByXpath(ItemNotAvailableWhenNotHavingPermissionPageObject.AWithTextXpath("MANAGE "))) 
        {
            globalErrorMessage = "Failed to click the 'Manage' header";
            return false;
        }
        
        if (!SeleniumDriverInstance.waitForElementToBeClickableByXpath(ItemNotAvailableWhenNotHavingPermissionPageObject.AWithTextXpath("Users")))
        {
            globalErrorMessage = "Failed to wait for the users sub menu item to be clickable";
            return false;
        }
        
        SeleniumDriverInstance.pause(2000);
        
        if (!SeleniumDriverInstance.clickElementByXpath(ItemNotAvailableWhenNotHavingPermissionPageObject.AWithTextXpath("Users"))) 
        {
            globalErrorMessage = "Failed to click the 'Users' sub menu 2";
            return false;
        }
    
        SeleniumDriverInstance.pause(2000);
        if (!SeleniumDriverInstance.waitForElementByXpathVisibility(ItemNotAvailableWhenNotHavingPermissionPageObject.SpanWithTextXpath("Users"))) 
        {
            globalErrorMessage = "Failed to validate the 'Users' page was navigated to";
            return false;
        }
        
        SeleniumDriverInstance.pause(2000);
        
        SeleniumDriverInstance.takeScreenShot("Successfully navigated to the Users page", false);
        
        if (!SeleniumDriverInstance.enterTextByXpath(ItemNotAvailableWhenNotHavingPermissionPageObject.FilterTextBoxXpath(), firstName)) 
        {
            globalErrorMessage = "Failed to enter the first name into the filter field";
            return false;
        }
        //users spinner
       SeleniumDriverInstance.waitForElementByXpath(ItemNotAvailableWhenNotHavingPermissionPageObject.rolesTableSpinner(),45); 
       
        pause(1500);
        if (!SeleniumDriverInstance.waitForElementByXpath(ItemNotAvailableWhenNotHavingPermissionPageObject.UserActionsButtonXpath(),30))
        {
            globalErrorMessage = "Failed to wait for the actions button";
            return false;
        }
        if (!SeleniumDriverInstance.waitForElementToBeClickableByXpath(ItemNotAvailableWhenNotHavingPermissionPageObject.UserActionsButtonXpath()))
        {
            globalErrorMessage = "Failed to wait for the actions button for user to be clickable";
            return false;
        }
        
        if (!SeleniumDriverInstance.clickElementByXpath(ItemNotAvailableWhenNotHavingPermissionPageObject.UserActionsButtonXpath())) 
        {
            globalErrorMessage = "Failed to click the actions button for the added User";
            return false;
        }
        
        SeleniumDriverInstance.takeScreenShot("Successfully clicked the actions button for the added user", false);
        
        if (!SeleniumDriverInstance.clickElementByXpath(ItemNotAvailableWhenNotHavingPermissionPageObject.ActionsButtonRemoveItem())) 
        {
            globalErrorMessage = "Failed to click the remove button";
            return false;
        }
        
        if (!SeleniumDriverInstance.waitForElementByXpathVisibility(ItemNotAvailableWhenNotHavingPermissionPageObject.StrongContainsTextXpath(firstName))) 
        {
            globalErrorMessage = "Failed to validate the remove user dialog opened";
            return false;
        }
        
        SeleniumDriverInstance.takeScreenShot("Succcessfully clicked the delete button on the actions menu and navigated to the remove dialog", false);
        
        if (!SeleniumDriverInstance.selectByTextFromDropDownListusingXpath(ItemNotAvailableWhenNotHavingPermissionPageObject.UserDeletionReasonDropDownXpath(), "Other")) 
        {
            globalErrorMessage = "Failed to select a reason for deleting a user";
            return false;
        }
        
        if (!SeleniumDriverInstance.enterTextByXpath(ItemNotAvailableWhenNotHavingPermissionPageObject.UserDeletionReasonTextFieldXpath(), "Testing")) 
        {
            globalErrorMessage = "Failed to enter the reason for deleting";
            return false;
        }
        
        SeleniumDriverInstance.takeScreenShot("Successfully entered the reasons for deleting this user", false);
        
        if (!SeleniumDriverInstance.clickElementByXpath(ItemNotAvailableWhenNotHavingPermissionPageObject.ButtonWithTextXPath("Delete"))) 
        {
            globalErrorMessage = "Failed to click the delete button for user";
            return false;
        }
        
        SeleniumDriverInstance.pause(2000);
        
        if (!SeleniumDriverInstance.enterTextByXpath(ItemNotAvailableWhenNotHavingPermissionPageObject.FilterTextBoxXpath(), firstName)) 
        {
            globalErrorMessage = "Failed to enter the first name into the filter field";
            return false;
        }*/
    
        
        /*SeleniumDriverInstance.pause(2000);
        
        if (!SeleniumDriverInstance.waitForElementByXpath(ItemNotAvailableWhenNotHavingPermissionPageObject.SpanWithTextXpath("No items to display"),5)) 
        {
            globalErrorMessage = "Failed to validate the user was removed";
            return false;
        }
        else
        {
            testData.extractParameter("User deleted", firstName + " " + lastName, "PASS");
        }
        
        SeleniumDriverInstance.takeScreenShot("Successfully deleted the user", false);*/
    
        //Navigate To Roles Page
        if (!SeleniumDriverInstance.clickElementByXpath(ItemNotAvailableWhenNotHavingPermissionPageObject.AWithTextXpath("MANAGE "))) 
        {
            globalErrorMessage = "Failed to click the 'Manage' header";
            return false;
        }
        
        if (!SeleniumDriverInstance.waitForElementToBeClickableByXpath(ItemNotAvailableWhenNotHavingPermissionPageObject.AWithTextXpath("Roles")))
        {
            globalErrorMessage = "Failed to wait for the roles sub menu item to be clickable";
            return false;
        }
        
        SeleniumDriverInstance.pause(2000);
        
        if (!SeleniumDriverInstance.clickElementByXpath(ItemNotAvailableWhenNotHavingPermissionPageObject.AWithTextXpath("Roles"))) 
        {
            globalErrorMessage = "Failed to click the 'Roles' sub menu 2";
            return false;
        }
        
        if (!SeleniumDriverInstance.clickElementByXpath(ItemNotAvailableWhenNotHavingPermissionPageObject.ActionsButtonRemoveItem())) 
        {
            globalErrorMessage = "Failed to click the remove button";
            return false;
        }
        
        if (!SeleniumDriverInstance.waitForElementByXpathVisibility(ItemNotAvailableWhenNotHavingPermissionPageObject.SpanWithTextXpath("Roles"))) 
        {
            globalErrorMessage = "Failed to validate the 'Roles' page was navigated to";
            return false;
        }
    for(int i = 0; i < 100;i++)
    {
        SeleniumDriverInstance.pause(2000);
        SeleniumDriverInstance.waitForElementByXpath(ItemNotAvailableWhenNotHavingPermissionPageObject.rolesTableSpinner(),45);
        
        
        if (!SeleniumDriverInstance.enterTextByXpath(ItemNotAvailableWhenNotHavingPermissionPageObject.FilterTextBoxXpath(), roleName)) 
        {
            globalErrorMessage = "Failed to enter the role name into the filter field";
            return false;
        }
        
        if (!SeleniumDriverInstance.waitForElementToBeClickableByXpath(ItemNotAvailableWhenNotHavingPermissionPageObject.UserActionsButtonXpath()))
        {
            globalErrorMessage = "Failed to wait for the actions button for user to be clickable";
            return false;
        }
        
        if (!SeleniumDriverInstance.clickElementByXpath(ItemNotAvailableWhenNotHavingPermissionPageObject.UserActionsButtonXpath())) 
        {
            globalErrorMessage = "Failed to click the actions button for the added User";
            return false;
        }
        
        SeleniumDriverInstance.takeScreenShot("Successfully clicked the actions button for the added user", false);
        
        if (!SeleniumDriverInstance.clickElementByXpath(ItemNotAvailableWhenNotHavingPermissionPageObject.ActionsButtonRemoveItem())) 
        {
            globalErrorMessage = "Failed to click the remove button";
            return false;
        }
        
        SeleniumDriverInstance.pause(2000);
        
//        if (!SeleniumDriverInstance.waitForElementByXpathVisibility(ItemNotAvailableWhenNotHavingPermissionPageObject.StrongRoleValidationTextXpath(roleName))) 
//        {
//            globalErrorMessage = "Failed to valdiate the remove role dialog opened for role";
//            return false;
//        }
        
        if (!SeleniumDriverInstance.clickElementByXpath(ItemNotAvailableWhenNotHavingPermissionPageObject.ButtonWithTextXPath("Remove"))) 
        {
            globalErrorMessage = "Failed to click the remove button for Roles";
            return false;
        }
        
        SeleniumDriverInstance.pause(2000);
        
        if (!SeleniumDriverInstance.enterTextByXpath(ItemNotAvailableWhenNotHavingPermissionPageObject.FilterTextBoxXpath(), roleName)) 
        {
            globalErrorMessage = "Failed to enter the role name into the filter field";
            return false;
        }
    }
        /*SeleniumDriverInstance.pause(2000);
        
        if (!SeleniumDriverInstance.waitForElementByXpath(ItemNotAvailableWhenNotHavingPermissionPageObject.SpanWithTextXpath("No items to display"),5)) 
        {
            globalErrorMessage = "Failed to validate the user was removed";
            return false;
        }
        else
        {
            testData.extractParameter("Role deleted", roleName, "PASS");
        }
        
        //Navigate To Security Groups Page
        if (!SeleniumDriverInstance.clickElementByXpath(ItemNotAvailableWhenNotHavingPermissionPageObject.AWithTextXpath("MANAGE "))) 
        {
            globalErrorMessage = "Failed to click the 'Manage' header";
            return false;
        }
        
        if (!SeleniumDriverInstance.waitForElementToBeClickableByXpath(ItemNotAvailableWhenNotHavingPermissionPageObject.AWithTextXpath("Security groups")))
        {
            globalErrorMessage = "Failed to wait for the Security groups sub menu item to be clickable";
            return false;
        }
        
        SeleniumDriverInstance.pause(2000);
        
        if (!SeleniumDriverInstance.clickElementByXpath(ItemNotAvailableWhenNotHavingPermissionPageObject.AWithTextXpath("Security groups"))) 
        {
            globalErrorMessage = "Failed to click the 'Security groups' sub menu 2";
            return false;
        }
        
        if (!SeleniumDriverInstance.waitForElementByXpathVisibility(ItemNotAvailableWhenNotHavingPermissionPageObject.SpanWithTextXpath("Security groups"))) 
        {
            globalErrorMessage = "Failed to validate the 'Security groups' page was navigated to";
            return false;
        }
        
        SeleniumDriverInstance.pause(2000);
        
        SeleniumDriverInstance.waitForElementByXpath(ItemNotAvailableWhenNotHavingPermissionPageObject.rolesTableSpinner(),45); 
        
        
        SeleniumDriverInstance.takeScreenShot("Successfully navigated to the Security groups page", false);
        
        if (!SeleniumDriverInstance.enterTextByXpath(ItemNotAvailableWhenNotHavingPermissionPageObject.FilterTextBoxXpath(), SecurityGroupName)) 
        {
            globalErrorMessage = "Failed to enter the Security Group name into the filter field";
            return false;
        }
        
        if (!SeleniumDriverInstance.clickElementByXpath(ItemNotAvailableWhenNotHavingPermissionPageObject.UserActionsButtonXpath())) 
        {
            globalErrorMessage = "Failed to click the actions button for the added Security Group Name";
            return false;
        }
        
        SeleniumDriverInstance.takeScreenShot("Successfully clicked the actions button for the added user", false);
        
        if (!SeleniumDriverInstance.clickElementByXpath(ItemNotAvailableWhenNotHavingPermissionPageObject.ActionsButtonRemoveItem())) 
        {
            globalErrorMessage = "Failed to click the remove button";
            return false;
        }
        pause(2000);
//        if (!SeleniumDriverInstance.waitForElementByXpathVisibility(ItemNotAvailableWhenNotHavingPermissionPageObject.StrongWithTextXpath(SecurityGroupName)))
//        {
//            globalErrorMessage = "Failed to valdiate the remove security group dialog opened";
//            return false;
//        }
        
        if (!SeleniumDriverInstance.clickElementByXpath(ItemNotAvailableWhenNotHavingPermissionPageObject.ButtonWithTextXPath("Remove")))
        {
            globalErrorMessage = "Failed to click the remove button for security group";
            return false;
        }
        
//        SeleniumDriverInstance.pause(2000);
//        
//        if (!SeleniumDriverInstance.enterTextByXpath(ItemNotAvailableWhenNotHavingPermissionPageObject.FilterTextBoxXpath(), SecurityGroupName)) 
//        {
//            globalErrorMessage = "Failed to enter the role name into the filter field";
//            return false;
//        }
        
//        SeleniumDriverInstance.pause(2000);
//        
//        if (!SeleniumDriverInstance.waitForElementByXpath(ItemNotAvailableWhenNotHavingPermissionPageObject.SpanWithTextXpath("No items to display"),5)) 
//        {
//            globalErrorMessage = "Failed to validate the user was removed";
//            return false;
//        }
//        else
//        {
//            testData.extractParameter("Security Group deleted", SecurityGroupName, "PASS");
//        }
        
        SeleniumDriverInstance.takeScreenShot("Successfully removed the added data from the system", false);*/
        
        return true;
    }
}
