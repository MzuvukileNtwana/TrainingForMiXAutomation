/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects;

import static KeywordDrivenTestFramework.Core.BaseClass.currentEnvironment;

/**
 *
 * @author arala
 */
public class EventLibraryPageObject {
    
    public static String MixTelematicsURL() {
        return currentEnvironment.PageUrl;
    }
    
     //Manage Drop Down List
     public static String ItemManageXpath(){
         return "//a[text()='MANAGE ']";
     }
     
     //Groups Item
     public static String ItemConfigGroupsXpath(){
         return "//a[text()='Configuration groups']";
     }
     
    //  <editor-fold defaultstate="collapsed" desc="Libraries">   
    
    public static String ManageXpath()
    {
        return "//a[text()='MANAGE ']";
    }
    
    public static String LibrariesXpath()
    {
        return "//a[text()='Libraries'][@href='#/config-admin/libraries']";
    }
    
    public static String ParameterLibrariesXpath()
    {
        return "//a[text()='Parameter library']";
    }
    
    public static String ParameterLibrariesHeaderXpath()
    {
        return "//h5[text()='Parameter library']";
    }
    
    public static String ParameterLibrariesFilterXpath()
    {
        return "//input[@placeholder='Filter']";
    }
    
    public static String ParameterColumnXpath()
    {
        return "//span[text()='Parameter']";
    }
    
    public static String ParameterTypeColumnXpath()
    {
        return "//span[text()='Parameter type']";
    }
    
    public static String ParameterUnitsColumnXpath()
    {
        return "//span[text()='Units']";
    }
    
    public static String ChooseColumnXpath()
    {
        return "//i[@class='icon-choose-columns']";
    }
    
    public static String DisabledClickableCellXpath()
    {
        return "//a[@class='clickable-cell ng-scope disabled']";
    }
    
    public static String EnabledClickableCellXpath()
    {
        return "//a[@class='clickable-cell ng-scope']";
    }
    
    //  </editor-fold>   
     //-------Config Groups-------
     //Heading/Link
     public static String HeadingConfigGroupsXpath(){
         return "//a[text()='Configuration groups:']";
     }
     
     //Asset Heading/Link
     public static String HeadingAssetXpath(){
         return "//span[text()='Assets']";
     }
     
     // Table Filters table heading
     public static String TableHeadingFiltersXpath(){
         return "//td[text()='Filters']";
     }
    
     //Table Compile Fail Reason Heading
     public static String TableHeadingCompileFailReasonXpath(){
         return "//span[text()='Compile fail reason'][@class='title']";
     }
     
     //Config Groups Table [Left One]
     public static String TableConfigGroupsXpath(){
         return "//table[@class='table table-scroll table-condensed table-list no-text-clip']";
     }
     
     //Assets Table [Right One]
     public static String TableAssetsXpath(){
         return "//div[@class='paged-grid']";
     }
     
     //Add Config Group Button
     public static String ButtonAddConfigGroupButtonXpath(){
         return "//a[@class='btn btn-small btn-success']";
     }
     
     //Name Column
     public static String TableHeadingNameXPath(){
         return "//span[text()='Name'][@class='ng-binding']";
     }
     
     //Refers to the table rows and used to count the amount of rows
     public static String TableRowConfigGroupsXpath(){
         return "//table/tbody//tr";
     }
     
     //Filter Input Pane
     public static String InputFilterXpath(){
         return "//input[@placeholder='Filter'][@type='text']";
     }
    //Libraries tab
    public static String LibrariesTabXpath(){
         return "//span[text()='Libraries']";
     }
    //Event type
    public static String EventTypeTabXpath(){
         return "//span[text()='Event type']";
     }
    //Event Description
    public static String EventDescriptionXpath(){
         return "//span[text()='Event description']";
     }
    // Filter Textbox
    public static String filterTextBoxXpath(){
         return "//h5[text()='Event library']/../../div/form/div/input";
     }
    //last event type "SYSTEM"
    public static String LastEventTypeTabXpath(){
         return "//td/div/span[text()='System']";
     }
    public static String FirstEventTypeXpath(){
         return "//td/div/span[text()='Default']";
         
     }
    //Diagnostic; bat fault UnableToAddCharge
     public static String DiagnosticEventNamepath(){
         return "//span[text()='Diagnostic: Bat Fault: UnableToAddCharge']";
         
     }
   //Active Control - relay drive 2 ON
       public static String ActiveControlEventNameXpath(){
         return "//span[text()='Active Control - relay drive 2 ON']";
         
     }
     //Add Evend button
       public static String ButtonAddEventuttonXpath(){
         return "//h5[text()='Event library']/../div/div/span";
         
     }
       //Event description textbox
        public static String InputEventDescriptionXpath(){
         return "//span[text()='Event description']/../../input";
         
     }
        
        //EventId
        public static String InputEventIdXpath(){
         return "//Label[text()='Event ID']/../input";
         
     }
        //add condition button(+)
         public static String ButtonAddConditionXpath(){
         return "//p[text()='Event occurs when the following conditions are met']/../div//a";
     
         }
        //select Event parameter
           public static String selectEventParameterXpath(){
         return "//Label[text()='Event parameter']/../select";
         
     } 
          
           //Select value
           public static String selectValueXpath(){
         return "//Label[text()='Value']/../select";
         
     }
           //Record event Checkbox
           public static String checkboxRecordEventXpath(){
         return "//span[text()='Record event']/../input";
         
     }  
          
           
}
