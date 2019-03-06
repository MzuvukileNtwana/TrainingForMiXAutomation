/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects.FleetAdmin.Passengers;

/**
 *
 * @author arala
 */
public class PassengersColumnsPageObject {
    
    public static String passengersXpath() 
    {
        return "//a[text()='Passengers']";
    }
    public static String PassengerNameXpath() 
    {
        return "//strong[text()='All']/../../../../../div[@class='row-fluid container-fixed-right']/div/div/div/div/table/thead/tr/th[3]/span[2][text()='Passenger name']";
    }
    public static String passengersIdXpath() 
    {
        return "//strong[text()='All']/../../../../../div[@class='row-fluid container-fixed-right']/div/div/div/div/table/thead/tr/th[4]/span[2][text()='Passenger ID']";
    }
    public static String columnHolderXpath() 
    {
        return "//i[@class='icon-choose-columns']";
    }
    public static String columnHolderPassengerIdXpath() 
    {
        return "//span[@class='title ng-binding'][text()='Passenger ID']";
    }
    public static String PassengerNameHeadingXpath() 
    {
        return "//strong[text()='All']/../../../../../div[@class='row-fluid container-fixed-right']/div/div/div/div/table/thead/tr/th[3]/span[2]";
    }
    public static String PassengerIdHeadingXpath ()
    {
        return "//strong[text()='All']/../../../../../div[@class='row-fluid container-fixed-right']/div/div/div/div/table/thead/tr/th[4]/span[2]";
    }
    public static String OriginWidthXpath() 
    {
        return "//tr[16]/td[2]/div/a[@class='clickable-cell ng-scope']";
    }
    public static String OriginWidthIdXpath() 
    {
        return "//tr[16]/td[2]/div/a[@class='clickable-cell ng-scope']/span/../../../../td[3]";
    }
    public static String clickPassengerXpath() 
    {
        return "//strong[text()='All']/../../../../..//span[text()='Passenger name']/../../../../tbody/tr[1]/td[2]/div/a/span";
    }
    public static String PassengerDetailsXpath() 
    {
        return "//legend[text()='Passenger details']";
    }
    public static String inputFieldNameXpath() 
    {
        return "//span[text()='Name']/../../input";
    }
    public static String btnSaveXpath() 
    {
        return "//button[@class='btn-wide btn-small btn-success btn ng-scope ng-binding'][text()='Save']";
    }
    public static String updatedPopUpXpath() 
    {
        return "//span[@id='pop-alert-message'][text()='Passenger updated successfully']";
    }
    public static String clickPassengerEditedXpath(String text) 
    {
        return "//span[text()='"+text+"'";
    }
    public static String clickPassengerXpath(String text) 
    {
        return "//strong[text()='All']/../../../../..//span[text()='Passenger name']/../../../../tbody/tr/td[2]/div/a/span[text()='"+text+"']";
    }
    public static String retrievedFirstPassengertXpath() 
    {
        return "//strong[text()='All']/../../../../..//span[text()='Passenger name']/../../../../tbody/tr[1]/td[2]/div/a/span";
    }
    public static String lastRowIndexXpath() 
    {
        return "//strong[text()='All']/../../../../..//span[text()='Passenger name']/../../../../tbody/tr";
    }
    public static String retrieveLastPassengerXpath(String lastRowIndex) 
    {
        return "//strong[text()='All']/../../../../..//span[text()='Passenger name']/../../../../tbody/tr["+lastRowIndex+"]/td[2]/div/a/span";
    }
    public static String LastOnTopXpath(String retrieveLastPassenger) 
    {
        return "//strong[text()='All']/../../../../..//span[text()='Passenger name']/../../../../tbody/tr[1]/td[2]/div/a/span[text()='"+retrieveLastPassenger+"']";
    }
    
    public static String fistOnTopXpath(String retrievedFirstPassengert) 
    {
        return "//strong[text()='All']/../../../../..//span[text()='Passenger name']/../../../../tbody/tr[1]/td[2]/div/a/span[text()='"+retrievedFirstPassengert+"']";
    }
    public static String BigNumberXpath() 
    {
        return "//strong[text()='All']/../../../../..//span[text()='Passenger name']/../../../../tbody/tr[1]/td[3]/div/span[text()='24']";
    }
    
    public static String SmallNumberXpath() 
    {
        return "//strong[text()='All']/../../../../..//span[text()='Passenger name']/../../../../tbody/tr[1]/td[3]/div/span[text()='-24786']";
    }
     public static String inputFilterXpath() 
    {
        return "//strong[text()='All']/../../../form/div/input";
    }
     public static String NameXpath() 
    {
        return "//span[text()='Name']/../../input";
    }
      public static String PassengerNameColumnHeader()
    {
        return "//th/span[text()='Passenger name']";
    }
     public static String  PassengerNameRowsXpath()
    {
        return "//td[@column-field=\"name\"]";
    }
      public static String  PassengerIdRowsXpath()
    {
        return "//td[@column-field=\"fmPassengerId\"]";
    }
       public static String PassengerIdColumnXpath()
    {
        return "//th/span[text()='Passenger ID']";
    }
  
}
