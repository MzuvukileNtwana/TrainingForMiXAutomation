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
public class ListViewPageObjects extends BaseClass
{
    public static String expandAssetXpath()
    {
        return "//div[@ng-class='mobitechTrackingClass()']/table/tbody/tr/td/a[@ng-click='expandOrCollapseAsset(asset)']/i";
    }
    public static String actionsButton()
    {
        return "//td/div[@ng-show='asset.expanded && enableVehicleLevelTrips']/a";
    }
    public static String assetActionsButtonXpath()
    {
        return "//div[@ng-show='asset.expanded && enableVehicleLevelTrips']/a[@class='btn-actions dropdown-toggle']/..";
    }
    public static String showOnMapXpath()
    {
        return "//a[@ng-click='showTripOnMapForVehicle(asset.trips, asset)']/span[text()='Show on map']";
    }
    public static String tripsForAssetXpath()
    {
        return " //div[@class='well well-small well-white no-margin']";
    }
    
    public static String trailOnMapXpath()
    {
//        return "//*[local-name()='path'][contains(@marker-end, 'url(#')]";
        return "//*[local-name()='path'][contains(@marker-end, 'url(#')]/../..";
    }
   
    public static String WaitTableSpinnerhistoricalXpath()
    {
        return "//div[@class='loading-overlay ng-scope'][@style='display: none;']";
    }
     public static String toggleExpandXpath()
    {
//        return "//table/tbody[1]//a[@ng-click='expandOrCollapseAsset(asset)']/i";
        return "//table/tbody[1]//a[@ng-click='expandOrCollapseAsset(asset)']/i/../../..";
    }
      public static String NewtoggleExpandXpath()
    {
        return "//table/tbody[1]//a[@ng-click='expandOrCollapseAsset(asset)']/i/..";
//        return "//table/tbody[1]//a[@ng-click='expandOrCollapseAsset(asset)']/i/../../..";
    }
      public static String startDateXpath()
      {
          return "//tbody[1][contains(@ng-repeat,'trip in asset.trips')]/tr[contains(@ng-class,'')]/td[3][@bind-once]";
      }
      
      public static String saveButtonXpath()
      {
          return "//a[contains(@ng-click,'save()')]";
      }
      
       public static String todayXpath()
      {
          return "//select/option[text()='Today']/..";
      }
       public static String yesterdayTodayXpath()
      {
          return "//select/option[text()='Yesterday and today']/..";
      }
      
      public static String yesterdayXpath()
      {
          return "//select/option[text()='Yesterday']/..";
      }
      public static String last3DaysXpath()
      {
          return "//select/option[text()='Last 3 days']/..";
      }
      public static String weektodateXpath()
      {
          return "//select/option[text()='Week to date']/..";
      }
      public static String lastWeekXpath()
      {
          return "//select/option[text()='Last week']/..";
      }
      
      
      
      //select/option[text()='Yesterday and today']
  
}
