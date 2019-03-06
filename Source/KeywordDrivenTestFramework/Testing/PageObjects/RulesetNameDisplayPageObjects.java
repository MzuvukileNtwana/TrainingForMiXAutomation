/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects;

/**
 *
 * @author elebese
 */
public class RulesetNameDisplayPageObjects 
{
    public static String InforIconXpath() 
    {
        return "//i[@class='icon-info-sign icon-grey']";
    }
    
    public static String TableLoaderXpath() 
    {
        return "//div/div[@class='loading-overlay'][@style='display: none;']";
    }
    
    public static String HOSRulesSetXpath() 
    {
        return "//select[@name='ruleId']";
    }
    
    public static String StartAndEndDistanseXpath(String LabelText) 
    {
        return "//strong[text()='" + LabelText + "']/../../label[3]";
    }
    
    public static String DrivingDistanceRowXpath(String LabelText)
    {
       return "//strong[text()='"+ LabelText +"']/../../..";
    }
    
   
    public static String DrivingDistanceRowValueXpath(String LabelText)
    {
       return"//strong[text()='"+ LabelText +"']/../../../div/label[@ng-show='$parent.hosTimeline.scope.getDrivingStartAndEndDates().startDate == null || $parent.hosTimeline.scope.getDrivingStartAndEndDates().endDate == null || $parent.hosTimeline.scope.getDrivingDistance().value == null']";
    }
    
    public static String DrivingDistanceXpath(String LabelText) 
    {
        return "//strong[text()='" + LabelText + "']/../../label[4]";
    }
    
    public static String RulesSetXpath(String LabelText) 
    {
        return "//strong[text()='"+LabelText+"']/../../div";
    }
    
    public static String ViewPeriodAndAssetDrivenXpath(String LabelText) 
    {
        return "//strong[text()='" + LabelText + "']/../../label[2]";
    }
}
