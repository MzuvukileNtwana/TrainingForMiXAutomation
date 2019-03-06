/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects;

/**
 *
 * @author RauvounW
 */
public class ManageTabPageObjects {
    public static String getWaitObject(){
        return "//*[@id=\"MainView\"]/div/div/div/div[2]/div/div/div/div";
    }
     public static String getPeripheralGrid(){
        return "//*[@id=\"cnfPeripherallLibraryGrid\"]/div[1]/div[1]/table/tbody";
    }
    public static String getPeripheralButton(){
        return  "//*[@id=\"MainView\"]/div/div/div/div[2]/div/div//ul/li[6]/a";
    } 
    
      public static String getParameterButton(){
        return "//*[@id=\"MainView\"]/div/div/div/div[2]/div/div//ul/li[5]/a";
    }
     public static String getParameterGrid(){
        return "//*[@id=\"cnfParamaterLibraryGrid\"]/div[1]/div[1]/table/tbody";
    }
     
     
       public static String getMobDevButton(){
        return  "//*[@id=\"MainView\"]/div/div/div/div[2]/div/div//ul/li[4]/a";
    }
     public static String getMobDevGrid(){
        return "//*[@id=\"cnfMobileDeviceLibraryGrid\"]/div[1]/div[1]/table/tbody";
    }
     
   public static String getFirmButton(){
        return  "//*[@id=\"MainView\"]/div/div/div/div[2]/div/div//ul/li[2]/a";
    }
     public static String getFirmGrid(){
        return "//*[@id=\"cnfFirmwareLibraryGrid\"]/div[1]/div[1]/table/tbody";
    }
 
      public static String getEventButton(){
        return  "//*[@id=\"MainView\"]/div/div/div/div[2]/div/div//ul/li[1]/a";
    }
     public static String getEventGrid(){
        return "//*[@id=\"cnfEventLibraryGrid\"]/div[1]/div[1]/table/tbody";
    }
    
         public static String getLocButton(){
        return    "//*[@id=\"MainView\"]/div/div/div/div[2]/div/div//ul/li[3]/a";
    }
     public static String getLocGrid(){
        return "//*[@id=\"cnfLocationLibraryGrid\"]/div[1]/div[1]/table/tbody";
    }
     
     public static String getLibrariesFilterBox(){
         return "//*[@id=\"MainView\"]/div[1]/div/div/div[1]/div/form/div/input";
     }
     
     public static String getLibrariesFirstElement(){
         return "//*[@id=\"cnfEventLibraryGrid\"]/div[1]/div[1]/table/tbody/tr/td[2]/div/a";
     }
     public static String getAddTask(){
         return "//*[@id=\"MainView\"]/div[1]/div/div/div[1]/div/div/div[1]/span/a/i";
     }
    public static String getDesc(){
         return "//INPUT[@name='description']";
     }
      public static String getArrow(){
         return "//I[@class='icon-plus icon-green']";
     }
           public static String Drop(){
         return "//*[@id=\"MainView\"]/div/div/div/div[2]/div/div/div/div/div/form/div[2]/div/div[2]/div/ul/li/div//span/span[2]/select";}
     public static String Para(){
         return "//*[@id=\"MainView\"]/div/div/div/div[2]/div/div/div/div/div/form/div[2]/div/div[2]/div/ul/li/div//span/span[2]/select/option[2]";}
       public static String Save(){
         return  "//*[@id=\"MainView\"]/div/div/div/div[1]/div/div/div[1]/button[2]";}
        public static String OK2(){
         return   "/html/body/div[11]/div/div/form/div[2]/div/button[2]";}
   
} 
