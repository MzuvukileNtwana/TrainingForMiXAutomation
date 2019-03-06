/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.TestClasses.Assets;

import KeywordDrivenTestFramework.Core.BaseClass;
import static KeywordDrivenTestFramework.Core.BaseClass.SeleniumDriverInstance;
import static KeywordDrivenTestFramework.Core.BaseClass.browserType;
import KeywordDrivenTestFramework.Entities.Enums;
import KeywordDrivenTestFramework.Entities.TestEntity;
import KeywordDrivenTestFramework.Entities.TestResult;
import KeywordDrivenTestFramework.Testing.PageObjects.AssetsPageObjects;
import KeywordDrivenTestFramework.Testing.PageObjects.PassengersPageObjects;
import static java.lang.System.err;
import static java.lang.System.out;
import java.util.Random;

/**
 *
 * @author lmkhontwana
 */
public class MergeSiteTestClass extends BaseClass
{

    TestEntity testData;
    String failedMessage = "";
    String systemDefaultDate = "";
    String regNo = "";

    public MergeSiteTestClass(TestEntity testData)
    {
        this.testData = testData;
    }

    public TestResult executeMergeSiteTest()
    {

        this.setStartTime();

        if (!mergeSiteTest())
        {
            SeleniumDriverInstance.takeScreenShot("FailedToMergeSiteIntoAnother", true);
            narrator.failedMessage("Failed To Merge Site Into Another - " + failedMessage);
            return new TestResult(testData, Enums.ResultStatus.FAIL, failedMessage, this.getTotalExecutionTime());
        }

        return new TestResult(testData, Enums.ResultStatus.PASS, "Successfully Merged Site Into Another", this.getTotalExecutionTime());
    }

    private boolean performMergeSite()
    {
        //Wait for Collapse Icon
        if (!SeleniumDriverInstance.waitForfElementToBeClickableByXpath(PassengersPageObjects.CollapseIconSpanXpath(), 15))
        {
            if (!SeleniumDriverInstance.waitForElementByXpathClickable(PassengersPageObjects.ExpandIconSpanXpath()))
            {
                failedMessage = "Failed to wait for the expand icon";
                return false;
            }

            //Click Expand Icon
            if (!SeleniumDriverInstance.clickElementbyXpath(PassengersPageObjects.ExpandIconSpanXpath()))
            {
                failedMessage = "Failed to click on the expand icon";
                return false;
            }
            //Wait for Collapse Icon
            if (!SeleniumDriverInstance.waitForfElementToBeClickableByXpath(PassengersPageObjects.CollapseIconSpanXpath(), 30))
            {
                failedMessage = "Failed to wait for the collapse icon";
                return false;
            }

        }
        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("SitesExpanded", false);
        String siteToDrag = "";
        String DraggedOnSite = "";
        String sitesToMerge = "";
        if ((testData.getData("Site To Merge").equals("")) && (testData.getData("Site").equals("")))
        {
            sitesToMerge = SeleniumDriverInstance.extractSiteFromOrganisationGroupByXpath(PassengersPageObjects.SiteListUlXpath(), "Default Site");
            siteToDrag = sitesToMerge.split(";")[0];
            DraggedOnSite = sitesToMerge.split(";")[1];
        }
        else
        {
            siteToDrag = SeleniumDriverInstance.extractSiteDetailsFromOrganisationGroupByXpath(PassengersPageObjects.getSiteDetailsOnListXpath(testData.getData("Site To Merge")));
            DraggedOnSite = SeleniumDriverInstance.extractSiteDetailsFromOrganisationGroupByXpath(PassengersPageObjects.getSiteDetailsOnListXpath(testData.getData("Site")));
        }
        try
        {
            int totalDrivers = Integer.parseInt(siteToDrag.split("#")[2]) + Integer.parseInt(DraggedOnSite.split("#")[2]);
            int totalAssets = Integer.parseInt(siteToDrag.split("#")[1]) + Integer.parseInt(DraggedOnSite.split("#")[1]);
            int totalLocations = Integer.parseInt(siteToDrag.split("#")[3]) + Integer.parseInt(DraggedOnSite.split("#")[3]);

            testData.extractParameter("Site To Drag Details", "Name: " + siteToDrag.split("#")[0] + "  Assets: " + siteToDrag.split("#")[1] + "  Driver: " + siteToDrag.split("#")[2] + "  Locations: " + siteToDrag.split("#")[3], "PASS");
            testData.extractParameter("Dragged On Site Details", "Name: " + DraggedOnSite.split("#")[0] + "  Assets: " + DraggedOnSite.split("#")[1] + "  Driver: " + DraggedOnSite.split("#")[2] + "  Locations: " + DraggedOnSite.split("#")[3], "PASS");

            //Adding a site before its merged
            int i;

            for (i = 0; i < 1; i++)
            {
                addsite();

                boolean error = SeleniumDriverInstance.waitForElementByXpath(PassengersPageObjects.ErrorXpath(), 10);

                if (error)
                {
                    if (!SeleniumDriverInstance.clickElementbyXpath(PassengersPageObjects.OkXpath()))
                    {
                        failedMessage = "Failed to click OK";
                        err.println(failedMessage);
                        return false;
                    }

                    addsite();
                }

            }

            //Drag to Close
            if (!SeleniumDriverInstance.dragElementToRelativeElementByXpath(PassengersPageObjects.getSiteOnListXpath(siteToDrag.split("#")[0]), PassengersPageObjects.getSiteOnListXpath(DraggedOnSite.split("#")[0])))
            {
                failedMessage = "Failed to drag the site";
                err.println(failedMessage);
                return false;
            }
            //Wait for header
            if (!SeleniumDriverInstance.waitForElementByXpath(PassengersPageObjects.MergeSitesHeaderTextXpath(), 30))
            {
                failedMessage = "Failed to wait for the Merge sites header";
                err.println(failedMessage);
                return false;
            }
            //Close
            if (!SeleniumDriverInstance.clickElementbyXpath(PassengersPageObjects.PassengersTemplateCloseButtonRelativeXpath()))
            {
                failedMessage = "Failed to click on the passengers template close button";
                err.println(failedMessage);
                return false;
            }
            //Take Screenshot
            SeleniumDriverInstance.takeScreenShot("CloseButtonClicked", false);

            if (!SeleniumDriverInstance.waitForInvisibilityOfElementByXpath(PassengersPageObjects.ModalBackdropRelativeXpath(), 15))
            {
                failedMessage = "Failed to wait for the modal back drop ";
                err.println(failedMessage);
                return false;
            }

            //Drag to Cancel
            if (!SeleniumDriverInstance.dragElementToRelativeElementByXpath(PassengersPageObjects.getSiteOnListXpath(siteToDrag.split("#")[0]), PassengersPageObjects.getSiteOnListXpath(DraggedOnSite.split("#")[0])))
            {
                failedMessage = "Failed to drag the site ";
                err.println(failedMessage);
                return false;
            }
            
            SeleniumDriverInstance.pause(2000);
            //Wait for header
            if (!SeleniumDriverInstance.waitForElementByXpath(PassengersPageObjects.MergeSitesHeaderTextXpath(), 30))
            {
                failedMessage = "Failed to wait for the Merge Sites Header";
                err.println(failedMessage);
                return false;
            }
            //Cancel
            if (!SeleniumDriverInstance.clickElementbyXpath(PassengersPageObjects.MergeSiteCancelButtonRelativeXpath()))
            {
                failedMessage = "Failed to click on the Merge site cancel button";
                err.println(failedMessage);
                return false;
            }
            //Take Screenshot
            SeleniumDriverInstance.takeScreenShot("CancelButtonClicked", false);

            if (!SeleniumDriverInstance.waitForInvisibilityOfElementByXpath(PassengersPageObjects.ModalBackdropRelativeXpath(), 15))
            {
                failedMessage = "Failed to wait for modal back drop";
                err.println(failedMessage);
                return false;
            }

            //Drag to Merge
            if (!SeleniumDriverInstance.dragElementToRelativeElementByXpath(PassengersPageObjects.getSiteOnListXpath(siteToDrag.split("#")[0]), PassengersPageObjects.getSiteOnListXpath(DraggedOnSite.split("#")[0])))
            {
                failedMessage = "Failed to drag the Site ";
                err.println(failedMessage);
                return false;
            }
            //Wait for header
            if (!SeleniumDriverInstance.waitForElementByXpath(PassengersPageObjects.MergeSitesHeaderTextXpath(), 30))
            {
                failedMessage = "Failed to wait for the Merge Sites Header";
                err.println(failedMessage);
                return false;
            }
            //Merge
            if (!SeleniumDriverInstance.clickElementbyXpath(PassengersPageObjects.MergeSiteMergeButtonRelativeXpath()))
            {
                failedMessage = "Failed to click on the Merge button";
                err.println(failedMessage);
                return false;
            }
            //Take Screenshot
            SeleniumDriverInstance.takeScreenShot("MergeButtonClicked", false);

            if (!SeleniumDriverInstance.waitForInvisibilityOfElementByXpath(PassengersPageObjects.ModalBackdropRelativeXpath(), 15))
            {
                failedMessage = "Failed to wait for the modal drop";
                err.println(failedMessage);
                return false;
            }

            //Wait for Success text
            if (!SeleniumDriverInstance.waitForElementByXpath(PassengersPageObjects.SitesMergedSuccessfullyTextXpath()))
            {
                failedMessage = "Failed to wait for the 'Sites merged successfully' message";
                err.println("Failed - Merge success message didn't appear");
                return false;
            }

            SeleniumDriverInstance.pause(2000);
            if (!SeleniumDriverInstance.clickElementbyXpath(PassengersPageObjects.getSiteDetailsOnListXpath(DraggedOnSite.split("#")[0])))
            {
                failedMessage = "Failed to click on the site details on the list";
                err.println(failedMessage);
                return false;
            }
            //Take Screenshot
            SeleniumDriverInstance.takeScreenShot("SiteMergedClicked", false);

            //Validate dropped site is removed
            if (SeleniumDriverInstance.waitForElementByXpath(PassengersPageObjects.getSiteDetailsOnListXpath(siteToDrag.split("#")[0]), 15))
            {
                testData.extractParameter("Site Not Removed After Merge", "Name: " + siteToDrag.split("#")[0], "FAIL");
                out.println("Site Not Removed After Merge- Name: " + siteToDrag.split("#")[0]);
            }
            else
            {
                testData.extractParameter("Site Removed After Merge", "Name: " + siteToDrag.split("#")[0], "PASS");
            }

            //Get Merged Site details
            String mergedSiteDetails = SeleniumDriverInstance.extractSiteDetailsFromOrganisationGroupByXpath(PassengersPageObjects.getSiteDetailsOnListXpath(DraggedOnSite.split("#")[0]));
            if ((mergedSiteDetails.contains(String.valueOf(totalDrivers))) && (mergedSiteDetails.contains(String.valueOf(totalAssets))) && (mergedSiteDetails.contains(String.valueOf(totalLocations))))
            {
                testData.extractParameter("Merged Site Details", "Name: " + mergedSiteDetails.split("#")[0] + "  Assets: " + mergedSiteDetails.split("#")[1] + "  Driver: " + mergedSiteDetails.split("#")[2] + "  Locations: " + mergedSiteDetails.split("#")[3], "PASS");
            }
            else
            {
                testData.extractParameter("Merged Site Details", "Name: " + mergedSiteDetails.split("#")[0] + "  Assets: " + mergedSiteDetails.split("#")[1] + "  Driver: " + mergedSiteDetails.split("#")[2] + "  Locations: " + mergedSiteDetails.split("#")[3], "FAIL");
                return false;
            }
        }
        catch (Exception e)
        {
            System.err.println("[ERROR] Exception caught on merge site. " + e);
        }

        return true;
    }

    public boolean addsite()
    {
        Random rand = new Random();
        int randNum = rand.nextInt(99) + 1;
        String StrRandNum = Integer.toString(randNum);

        if (browserType.equals(Enums.BrowserType.IE))
        {
            if (!SeleniumDriverInstance.moveToAndClickElementByXpath(PassengersPageObjects.AddSitebtnXpath()))
            {
                failedMessage = "Failed to move to and click on the Add site button";
                err.println(failedMessage);
                return false;
            }

            if (!SeleniumDriverInstance.waitForElementByXpathVisibility(PassengersPageObjects.SiteXpath()))
            {
                failedMessage = "Failed to wait for the site";
                err.println(failedMessage);
                return false;
            }

            if (!SeleniumDriverInstance.clickElementByXpath(PassengersPageObjects.SiteXpath()))
            {
                failedMessage = "Failed click on the site";
                err.println(failedMessage);
                return false;
            }

            if (!SeleniumDriverInstance.waitForElementByXpath(PassengersPageObjects.SiteNameXpath(), 30))
            {
                failedMessage = "Failed to wait for the site name";
                err.println(failedMessage);
                return false;
            }

            if (!SeleniumDriverInstance.enterTextByXpath(PassengersPageObjects.SiteNameXpath(), "DVT Site" + StrRandNum))
            {
                failedMessage = "Failed to enter the site name";
                err.println(failedMessage);
                return false;
            }

            if (!SeleniumDriverInstance.clickElementByXpath(PassengersPageObjects.SavebtnXpath()))
            {
                failedMessage = "Failed to click the save button";
                err.println(failedMessage);
                return false;
            }
        }
        else
        {
            if (!SeleniumDriverInstance.waitForElementByXpath(PassengersPageObjects.AddSitebtnXpath(), 30))
            {
                if (!SeleniumDriverInstance.isElementEnabled(PassengersPageObjects.AddSitebtnXpath()))
                {
                    failedMessage = "Failed to wait for the add site button";
                    err.println(failedMessage);
                    return false;
                }
            }

            if (!SeleniumDriverInstance.clickElementByXpath(PassengersPageObjects.AddSitebtnXpath()))
            {
                failedMessage = "Failed to click add site button";
                err.println(failedMessage);
                return false;
            }

            if (!SeleniumDriverInstance.waitForElementByXpath(PassengersPageObjects.SiteXpath(), 10))
            {
                failedMessage = "Failed to wait for sites";
                err.println(failedMessage);
                return false;
            }

            if (!SeleniumDriverInstance.clickElementByXpath(PassengersPageObjects.SiteXpath()))
            {
                failedMessage = "Failed to click on Sites";
                err.println(failedMessage);
                return false;
            }

            if (!SeleniumDriverInstance.waitForElementByXpath(PassengersPageObjects.SiteNameXpath(), 30))
            {
                failedMessage = "Failed to wait for site names";
                err.println(failedMessage);
                return false;
            }

            if (!SeleniumDriverInstance.enterTextByXpath(PassengersPageObjects.SiteNameXpath(), "DVT Site" + StrRandNum))
            {
                failedMessage = "Failed to enter site name";
                err.println(failedMessage);
                return false;
            }

            if (!SeleniumDriverInstance.clickElementByXpath(PassengersPageObjects.SavebtnXpath()))
            {
                failedMessage = "Failed to click save button";
                err.println(failedMessage);
                return false;
            }
        }

        return true;
    }

    private boolean mergeSiteTest()
    {

        if (!navigateToOrgabizationPage())
        {
            failedMessage = "Failed to navigate To Organization Page - " + failedMessage;
            System.err.println(failedMessage);
            return false;
        }
        if (!performMergeSite())
        {
            failedMessage = "Failed to Merge Site Into Another - " + failedMessage;
            System.err.println(failedMessage);
            return false;
        }
        return true;
    }

    private boolean navigateToOrgabizationPage()
    {

        //Click Monitor Menu
        if (!SeleniumDriverInstance.clickElementbyXpath(AssetsPageObjects.MonitorMenuRelativeXpath()))
        {
            failedMessage = "Failed to click on the Monitor menu ";
            return false;
        }

        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("MonitorMenuClicked", false);

        //Click TripTimeline Menu
        if (!SeleniumDriverInstance.clickElementbyXpath("//a[text()='Organisation groups']"))
        {
            failedMessage = "Failed to click on the Organisation groups menu option";
            return false;
        }

        //Check If Save changes pop up is present
        if (SeleniumDriverInstance.waitForfElementToBeClickableByXpath(AssetsPageObjects.ChangesNotSavedTextXpath(), 4))
        {
            if (!SeleniumDriverInstance.clickElementbyXpath(AssetsPageObjects.YesButtonXpath()))
            {
                failedMessage = "Failed to click the Yes button";
                return false;
            }

        }

        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("OrganisationGroupClicked", false);

        //Wait
        SeleniumDriverInstance.waitForPresenceOfElementByXpath(AssetsPageObjects.TableLoadingSpinnerXpath(), 30);
        SeleniumDriverInstance.waitForElementByXpath(AssetsPageObjects.leftSpinnerXpath(), 60);
        SeleniumDriverInstance.waitForElementByXpath(AssetsPageObjects.rightSpinnerXpath(), 60);
        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot("LandedOnOrganisationGroupPage", false);

        return true;
    }

}
