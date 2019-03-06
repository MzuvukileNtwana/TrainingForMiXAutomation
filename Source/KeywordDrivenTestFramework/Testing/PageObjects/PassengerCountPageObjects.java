/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects;

/**
 *
 * @author apeter
 */
public class PassengerCountPageObjects {
    
    public static String allPassengerCountXpath(){
        return "//div/ul/li/a/span[@dmx-compile='item.count']";
    }
    
    public static String rowCountXpath(){
        return "//td/div/a/span";
    }
    
    public static String lastPassengerXpath(int row)
    {
        return "//tr["+row+"]/td/div/a/span";
    }
    
    public static String currentPageXpath(){
        return "//div/span/div/div[@class='row-fluid container-content container-fixed ng-scope']";
    }
    public static String waitForTableLoadingSpinner(){
        return "//div[@class=\"row-fluid container-fixed-right\"]/div/div[@class=\"loading-overlay ng-scope\" and @style='display: none;']";
    }
    
    public static String loadingPassengerXpath()
    {
        return "//span[text()='Loading...']/../../div[@class='grid-no-items'][@ng-show='loading'][@style='display: none;']";
    } 
}
