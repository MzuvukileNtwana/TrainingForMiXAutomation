/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects;

/**
 *
 * @author arala
 */
public class FleetAdminEditAssetPageObject {
    public static String monitorXpath()
    {
        return"//a[text()='MONITOR ']";
    }
    public static String fleetAdminXpath()
    {
        return"//h4[text()='FLEET ADMIN']";
    }
    public static String assetsXpath()
    {
        return"//h4[text()='FLEET ADMIN']/..//li/a[text()='Assets']";
    }
    public static String driversXpath()
    {
        return"//h4[text()='FLEET ADMIN']/..//li/a[text()='Drivers']";
    }
    public static String passengersXpath()
    {
        return"//h4[text()='FLEET ADMIN']/..//li/a[text()='Passengers']";
    }
    public static String organisationGroupsXpath()
    {
        return"//h4[text()='FLEET ADMIN']/..//li/a[text()='Organisation groups']";
    }
    public static String customGroupsXpath()
    {
        return"//h4[text()='FLEET ADMIN']/..//li/a[text()='Custom groups']";
    }
    public static String serverSideEventsXpath()
    {
        return"//h4[text()='FLEET ADMIN']/..//li/a[text()='Server-side events']";
    }
     public static String assetPageXpath()
    {
        return"//span[text()='Assets']";
    }
    public static String allXpath()
    {
        return"//strong[text()='All']";
    }
    public static String accessControlXpath()
    {
        return "//a[text()='Access control']";
    }
    public static String countryXpath()
    {
        return " //span[text()='Country']";
    }
    public static String assetStateXpath()
    {
        return "//span[text()='DVT-Live']/../../../../td[3]/div/i";
    }

}
