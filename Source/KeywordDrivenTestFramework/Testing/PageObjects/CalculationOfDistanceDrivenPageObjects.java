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
public class CalculationOfDistanceDrivenPageObjects 
{
    public static String DistanceXpath() 
    {
        return "//strong[text()='Distance']/../span[text()='n/a']";
    }
    public static String EndDateXpath() 
    {
        return "//strong[text()='End date']/../span[text()='In Progress']";
    }
    
    public static String LeftArrowIconXpath()
    {           
        return "//a[@class='mr-5']";
    }//i[@class=' icon-chevron-left icon-grey']
    
    public static String InfoIconXpath() 
    {
        return "//i[@class='icon-info-sign icon-grey']";
    }
    
    public static String StartOfDayXpath()
    {
    return "//div[@class='selection-btn-right pull-right']/a[@fleet-tooltip='Start of day']";
    }
    
}
