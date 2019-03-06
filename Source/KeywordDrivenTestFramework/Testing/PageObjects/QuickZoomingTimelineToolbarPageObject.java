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
public class QuickZoomingTimelineToolbarPageObject {
    
    public static String spinnerXpath()
    {
        return "//div[contains(@class,'loading-overlay')][@style='display: none;']";
    }
    
    public static String timelineEventsXpath()
    {
        return "//div[contains(@class,'events tooltip-bounding-box')]";
    }
    
    public static String timelineXpath()
    {
        return "//div[contains(@class,'timeline hos-timeline')]";
    }
    
    public static String dayXpath(String day)
    {
        return "//div[@class='current-days']/div[text()='" + day + "']";
    }
    
    public static String monthSelectorXpath()
    {
        return "//div[@class='datepicker-widget in']//div[@ng-click=\"directive.changeToMonthSelector()\"]";
    }
    
    public static String MonthXpath(String month)
    {
        return "//div[@class=\"month-selector zoomable\"]//div[text()='" + month + "']";
    }
    
    public static String yearSelectorXpath()
    {
        return "//div[@class='datepicker-widget in']//div[@ng-click=\"directive.changeToYearSelector()\"]";        
    }
    
    public static String yearXpath(String year)
    {
        return "//div[@ng-repeat='year in directive.years']/span[text()='" + year + "']";
    }
    
    public static String btnSelectedXpath(String name)
    {
        return "//div[@class=\"page-header\"]//div[@data-toggle=\"buttons-radio\"]/button[text()='" + name + "'][contains(@class, 'active')]";
    }
    
    public static String generalSelectedbuttonXpath()
    {
        return "//div[@class=\"page-header\"]//div[@data-toggle=\"buttons-radio\"]/button[contains(@class, 'active')]";
    }
    
    public static String getDateTimeTimelineXpath()
    {
        return "//span[@class='text ng-binding']";
    }   
    
    public static String btnNonSelectedXpath(String name)
    {
        return "//div[@class=\"page-header\"]//div[@data-toggle=\"buttons-radio\"]/button[text()='" + name + "']";
    }
    
    public static String timescaleAllLabelsXpath()
    {
        return "//div[contains(@class,'top-time-axis')]/span";
    } 
    
    public static String timescaleLabelsAtIndexXpath(String time)
    {
        //return "//div[contains(@class,'top-time-axis')]/span[text()='" + time + "']";
        return "//div//canvas[@class='axis-canvas']/../span[text()='" + time + "']";
    }
    
    public static String handleIconXpath()
    {
        return "//div[@class='grabber draggable']/div";
    }
    
    public static String image24h()
    {
        return "img24h.png";
    }
    
    public static String image12h()
    {
        return "img12h.png";
    }
    
    public static String image6h()
    {
        return "img6h.png";
    }
    
    public static String image3h()
    {
        return "img3h.png";
    }
    
    public static String image1h()
    {
        return "img1h.png";
    }
    
    public static String image30m()
    {
        return "img30m.png";
    }
    
    public static String image15m()
    {
        return "img15m.png";
    }
    
    public static String image10m()
    {
        return "img10m.png";
    }
    
    public static String image5m()
    {
        return "img5m.png";
    }
}
