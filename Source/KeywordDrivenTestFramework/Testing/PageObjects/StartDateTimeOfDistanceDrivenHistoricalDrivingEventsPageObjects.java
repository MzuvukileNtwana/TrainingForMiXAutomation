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
public class StartDateTimeOfDistanceDrivenHistoricalDrivingEventsPageObjects {
    
    
    
    public static String PopoverStartTime()
    {
        return "//strong[text()='Start of distance driven:']/../../label[@ng-hide='$parent.hosTimeline.scope.getDrivingStartAndEndDates().startDate == null']";
    }
}
