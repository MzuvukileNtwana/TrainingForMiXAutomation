/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects;


/**
 *
 * @author sscholtz
 */
public class PopoverRenderingPageObjects {
    
    public static String Icon()
    {
        return "//a[@id='toolbarInfoIcon']/i";
    }
    
    public static String PopoverHeadings(String name)
    {
        return "//label[@class='pull-left']/strong[text()='"+name+"']";
    }
    
    public static String StartOfDay()
    {
        return "//a[@class='btn btn-small']/i[@class='icon-alarmclock']";
    }
    
    public static String PopOverContent()
    {
        return "//div[@style=\"display: none;\"]/div[@modal-data=\"toolbarModal\"]//div/div[@class=\"popover-inner\"]";
    }
    
    public static String ClickOffPopover()
    {
        return "//strong[text()='Co-Drivers:']";
    }
    
    public static String ZoomTimeCheck()
    {
        return "//div[@class='current-date']/span[@class='text ng-binding']";
        //return "//span[@class='text ng-binding']";
    }
    
    public static String StartOfDistanceDriven()
    {
        return "//label[@ng-show='$parent.hosTimeline.scope.getDrivingStartAndEndDates().startDate == null'][text()='n/a']";
    }
    
    public static String Day26()
    {
        return "//div[@class='current-days']/div[text()='26']";
    }
}
