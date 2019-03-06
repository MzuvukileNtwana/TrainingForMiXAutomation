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
public class QueryPointLineBehaviourPageObjects {
   
    
    public static String QueryLineButton()
    {
        return "//i[@class='icon-query-line']";
    }
    
    public static String QueryLineRight()
    {
        return "//div[@class='time ng-binding right']";
    }
    
    public static String QueryLineLeft()
    {
        return "//div[@class='time ng-binding left']";
    }
    
    public static String Zoom30m()
    {
        return "//button[text()='30m']";
    }
    
    public static String QuerylineCursor()
    {
        return "//div[@class='query-line draggable']";
    }
    
    public static String ToolTip12Right()
    {
        return "//div[@class='ng-scope tooltip timeline-tooltip right in']/div[@class='tooltip-inner']//div[contains(text(),': 2016-04-04 11:56 AM')]";
    }
    
    public static String ToolTip12Right1()
    {
        return "//div[@class='ng-scope tooltip timeline-tooltip right in']/div[@class='tooltip-inner']//div[contains(text(),': 2016-09-27 05:28 AM')]";
    }
    
      public static String ToolTip12Left()
    {
        return "//div[@class='ng-scope tooltip timeline-tooltip left in']/div[@class='tooltip-inner']//div[contains(text(),': 2016-09-27 05:26 AM')]";
    }
      
      public static String ToolTip11Left()
      {
          return "//div[@class='ng-scope tooltip timeline-tooltip right in']/div[@class='tooltip-inner']//div[contains(text(),': 2016-09-27 05:23 AM')]";
      }
      
       public static String TooltipAfterHovering()
      {
         return "//strong[contains(text(),'Single sleeper')]";
      }
       
      public static String Zoom24h()
      {
          return "//button[text()='24h']";
      }
      
      public static String HarshAcceleration()
      {
          return "//span[text()='Harsh acceleration']";
      }
      
       public static String HarshBraking()
      {
          return "//span[text()='Harsh braking']";
      
      }
       
       public static String EditedClick()
       {
           return "//span[text()='Edited']";
       }
       
       public static  String EventsButton()
       {
           return "//i[@class='icon-flag']";
       }
       
       public static String Filter()
       {
           return "//input[@placeholder='Filter']";
       }
       
       public static String HarshBrakingCheckBox()
       {
           return "//div[@modal-body-class='white-box-padding fixed-full-height']//span[text()='Harsh braking']/../../../td/input[@type='checkbox']";
       }
       
        public static String HarshAccelerationCheckBox()
       {
           return "//div[@modal-body-class='white-box-padding fixed-full-height']//span[text()='Harsh acceleration']/../../../td/input[@type='checkbox']";
       }
    
        public static String SelectButton()
        {
            return "//div[@modal-body-class='white-box-padding fixed-full-height']//button[text()='Select']";
        }
        
        public static String EventSpinner()
        {
            return "//div[@class='timeline-content ng-scope']/div[@style='display: none;']";
        }
    
        public static String DisabledDownArrowCheck()
        {
            return "//a[@disabled='disabled'][@fleet-tooltip='Move event down']";
        }
    
        public static String DownButtonClick()
        {
            return "//a[@fleet-tooltip='Move event down']";
        }
       
        public static String RightTooltipTop()
        {
            return "//div[@class='ng-scope tooltip timeline-tooltip right in']//div[contains(text(), ': 2016-09-27 05:23 AM')]/../../../../../../div[@class='tooltip-arrow']";
        }
        
        public static String RightTooltipBottom()
        {
            //return "//div[@class='ng-scope tooltip timeline-tooltip right in']//strong[text()='Date range']/../../../../../../../../div[@class='tooltip-arrow']";
            return "//div[@class='ng-scope tooltip timeline-tooltip right in']/div[@class='tooltip-arrow']";
        }
        
        public static String LeftTooltipTop()
        {
            return "//div[@class='ng-scope tooltip timeline-tooltip left in']//div[contains(text(), ': 2016-09-27 05:26 AM')]/../../../../../../div[@class='tooltip-arrow']";
        }
        
          public static String LeftTooltipBottom()
        {
            //return "//div[@class='ng-scope tooltip timeline-tooltip left in']//strong[text()='Date range']/../../../../../../../../div[@class='tooltip-arrow']";
            return "//div[@class='ng-scope tooltip timeline-tooltip left in']/div[@class='tooltip-arrow']";
        }
          
          
        public static String DateXpath()
        {
            return "//div[@class='form-inline pull-left']//input[@type='text']";
        }
          
        public static String RefreshXpath()
        {
            return "//span[text()='Refresh']";
        }
        
        public static String RightTopConnectionPointOnQueryLine()
        {
            return "//div[@class='hos-series canvas-container draggable']/div";
        }
        
        public static String LeftTopConnectionPointOnQueryLine()
        {
           return "//div[@class='trip-series canvas-container draggable']/div";
        }
        
        public static String RightBottomConnectionPointOnQueryLine()
        {
            return "//span[text()='Harsh acceleration']/../div[@class='canvas-container']/div";
        }
        
        public static String LeftBottomConnectionPointOnQueryLine()
        {
           return "//span[text()='Harsh braking']/../div[@class='canvas-container']/div";
        }
        
        public static String TopRightTooltipDistance()
        {
            return "//div[text()=': 1,00 ']/..";
        }
        
        public static String TopLeftTooltipDistance()
        {
            return "//div[text()=': 3,00 km']/..";
        }
}
