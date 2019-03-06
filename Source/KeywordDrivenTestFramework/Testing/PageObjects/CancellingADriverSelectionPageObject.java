/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects;

/**
 *
 * @author lmgulwa
 */
public class CancellingADriverSelectionPageObject {
    
    public static String btnCancelXpath()
    {
        return "//a[text()='Cancel']";
    }
    
    public static String driverEventsXpath(String driver)
    {
        return "//div[@class=\"miller-selector\"]/a[@ng-click=\"$broadcast('openOrganisationSelectionMiller')\"]//span[text()='" + driver + "']/../../../../../..//a[@fleet-tooltip=\"Events\"]";
    }
    
    public static String driverTimelineXpath(String driver)
    {
        return "//div[@class=\"miller-selector\"]/a[@ng-click=\"$broadcast('openOrganisationSelectionMiller')\"]//span[text()='" + driver + "']/../../../../../../../../../../../..//div[contains(@class,'timeline-content')]";
    }
}
