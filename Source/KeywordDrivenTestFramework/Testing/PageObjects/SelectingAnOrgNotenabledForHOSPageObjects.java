/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects;

import KeywordDrivenTestFramework.Core.BaseClass;

/**
 *
 * @author smbiko
 */
public class SelectingAnOrgNotenabledForHOSPageObjects extends BaseClass
{
    
    public static String messageDisplayXpath()
    {
        return "//div[@class='well-attention']";
    }
    public static String validateTripTimelineLoadedXpath()
    {
        return "//div[@class='timeline-content']//div[@class='current-date']//span[@class='text ng-binding']";
    }
     public static String lastTripIconXpath()
     {
         return "//a[@ng-show='isLastTripEnabled==true']//i";
     }
    
    //Select Organisation Group Heading
    public static String HeadingSelectingAnAssetXpath() 
    {
        return "//h5[text()='Select asset']";
    }
     public static String ButtonBreadcrumXpath() 
     {
        return "//div[@class='miller-selector']//a[@ng-click=\"$broadcast('openOrganisationSelectionMiller')\"]/..";
    }
    public static String InputFieldSelectOrginisationGroupXpath() {
        return "//h5/../../../div[@class='page-header']/div[@class='pull-right']/input";
    }
    public static String validateSelectedAssetXpath(String asset) 
    {
        return "//div[@class='miller-selector']/a/span[contains(@ng-repeat,'Breadcrumbs')]/span[text()='"+asset+"']";
    }
    
    public static String BreadcrumTreeItemXpath(String itemName) 
    {
        return "//a/span[text()='"+itemName+"']/..";
    }

    
}
