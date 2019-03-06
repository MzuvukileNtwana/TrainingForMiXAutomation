/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects;

import java.util.List;

/**
 *
 * @author mdevilliers
 */
public class UtilitiesPageObject {

    //  <editor-fold defaultstate="collapsed" desc="Usability of the Assets Screen"> 
    //--------Usability of the Assets Screen--------
    //Used to click on the tree items 
    public static String BreadcrumTreeItemXpath(String itemName) {
        //return "//div/div/a/span[text()='"+ itemName +"']";
        return "//a/span[text()='" + itemName + "']/..";
    }

    //Used to find the correct item from the filter search 
    public static String BreadcrumItemAfterFilterXpath(List<String> columns) {

        int size = columns.size();
        String output = "//span[text()='";
        for (int i = 0; i < size; i++) {

            if (i == size - 1) {
                output = output + "']/../../a/span[text()='" + columns.get(i) + "']";
            } else {
                output = output + columns.get(i) + " / ";
            }

        }

        return output;
    }
    public static String BreadcrumItemAfterFilteringXpath(String text) 
    {
        return "//div[@class='group ng-scope']/a/span[text()='" + text +"']";
    }

    //Used to find the correct item from the filter search 
    public static String BreadcrumAfterSelectionXpath(String columnItem) {

        String output = "//div[@class='miller-selector']/a/span[contains(@ng-repeat,'Breadcrumbs')]/span[text()='" + columnItem + "']";

        return output;
    }

    public static String InputFieldSelectOrginisationGroupXpath() {
        return "//h5/../../../div[@class='page-header']/div[@class='pull-right']/input";
    }

    //Breadcrum Link Opens Select Organisation Group
    public static String ButtonBreadcrumXpath() {
        return "//a[@ng-click=\"$broadcast('openOrganisationSelectionMiller')\"]";
    }
    public static String BreadcrumButtonXpath() {
        return "//div[@class='miller-selector']//a[@ng-click]";
    }
   
    //Select Button
    public static String ButtonSelectXpath() {
        return "//a[text()='Select']";
    }
    
    public static String ButtonSelectMultiLanguageXpath(String buttonText) {
        return "//a[text()='"+buttonText+"']";
    }

    //Select Organisation Group Heading
    public static String HeadingSelectOrganisationGroupXpath() {
        return "//h5[text()='Select organisation group']";
    }
    
    public static String HeadingSelectDriverXpath() {
        return "//h5[text()='Select driver']";
    }
    
    public static String DriverXpath() {
        return "//button[@class='btn btn-small ng-scope active']";
    }
    
    public static String HeadingSelectOrganisationMultiLanguageGroupXpath() 
    {
        return "//div[@class='page-header']//div[@class='pull-left']//h5";
    }

    //Breadcrum Label Displayed on page
    public static String BreadcrumLabelItemXpath(String itemXpath) {
        return "//div[@class='miller-selector']/a/span/span[text()='" + itemXpath + "']";
    }

    //Search results heading
    public static String BreadcrumSearchResultHeadingXpath() {
        return "//div[contains(@class,'filter')]/div//h5";
    }
    
    //Counts how many parts there are to the breadcrum. Usally the last item is the Organisation.
    //Thus you just pass the value count to the breadcrumXItemXpath to get the Xpath of the last breadcrum item
    //int count = SeleniumDriverInstance.getElementsCountByXpath(breadcrumItemXpath);
    //String orgName = SeleniumDriverInstance.retrieveTextByXpath(breadcrumXItemXpath(count));
    public static String breadcrumXItemXpath(int x) {
        return "//div[@class='miller-selector']/a/span[contains(@ng-repeat,'Breadcrumbs')][3]/span[@class='text-overflow ng-binding']";
    }

    public static String breadcrumItem() {
        return "//div[@class='miller-selector']/a/span[contains(@ng-repeat,'Breadcrumbs')]";

    }

     //  </editor-fold>   
}
