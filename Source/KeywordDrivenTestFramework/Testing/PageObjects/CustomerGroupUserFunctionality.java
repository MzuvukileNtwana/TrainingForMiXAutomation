/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects;

import KeywordDrivenTestFramework.Core.BaseClass;

/**
 *
 * @author smnisi
 */
public class CustomerGroupUserFunctionality extends BaseClass{
    
    public static String totalNumberOfCustomGroup()
    {
        return "//li/span[@class='badge badge-grey ng-binding']";
    }
    
    public static String clickingToViewAllCustomerGroups()
    {
        return "//span[text()='All']";
    }

    public static String groupNameReading1()
    {
         return "//tr/td[3]";
    }
    
    public static String columnName()
    {
        return "//th/span[text()='Group name']";
    }
    
    public static String sortingByGroupName()
    {
        return "//tbody[@fleet-draggable-group='draggable']";
    }
    
    
    public static String assertColumn()
    {
        return "//body/ul/li/a/span[text()='Assets']";
    }
    
    public static String groupNameColumn()
    {
        return"//body/ul/li/a/span[text()='Group name']";
    }
    
    public static String descriptionColumn()
    {
        return"//body/ul/li/a/span[text()='Description']";
    }
    
    public static String driverColumn()
    {
        return "//body/ul/li/a/span[text()='Drivers']";
    }
    
    public static String groupTypeColumn()
    {
        return "//body/ul/li/a/span[text()='Group type']";
    }
    
    
    public static String editButton()
    {
        return "//li/a/span[text()='Edit']";
    }
    public static String removeButton()
    {
        return "//li/a/span[text()='Remove']";
    }
    
    public static String AssertHeading()
    {
        return "//ul/li/strong[text()='Assets']";
    }
    
    public static String selectAllColunms()
    {
        return "//body/ul[@class='dropdown-menu pull-right column-chooser-dropdown']";
    }
    
    public static String columns()
    {
        return "//ul[@class='dropdown-menu pull-right column-chooser-dropdown'] [contains(@style,'block')]/li/a";
    }
    
    
    public static String SelectAllGridFlitterXpath()
    {
        return"//div/ul/li[@class='ng-scope tab-top active']";
    }
    
    public static String customerGroupHead()
    {
        return "//*[@id=\"sub-menu\"]/div/div[1]/h5/span";
    }
    
    public static String columnSelection()
    {
        return"//*[@id=\"sub-menu\"]/div/div[3]/div/div[2]/a/b";
    }
    
    public static String selectButton()
    {
        return "/html/body/div[20]/div[3]/div/a[2]";
    }        
    
    public static String AssertGridSelect()
    {
        return "//*[@id=\"MainView\"]/div[1]/div/div[1]/ul/li[2]/a";
    }
   
    public static String hoverAddButton()
    {
        return "//span/a[@fleet-tooltip='Add custom group']/i/..";
    }
    
    public static String cancelButton()
    {
        return "//button[text()='Cancel']";
    }
    
    public static String PSG_loader()
    {
        return "//h5/span[text()='Add new custom group']";
    }
    
    public static String actionButtonXpath()
    {
        return "//div/a[@fleet-tooltip='Actions']";
    }
    
    public static String editButtonXpath()
    {
        //return"/html/body/ul[5]/li[1]/a";
        return "//span[@class='ng-binding'][text()='Edit']";
               
    }
    
    public static String removeButtonXpath()
    {
        return "/html/body/ul[5]/li[2]/a";
    }
    
    public static String groupName()
    {
        return "//th/span[text()='Group name']";
    }
    
    public static String columnButton()
    {
        return "//li/a/i[@class='icon-choose-columns']";
    }
    
    public static String sortingDesending()
    {
        return "//*[@id=\"MainView\"]/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/div[1]/table/thead/tr/th[2]/span[4]";
    }
    
    
    public static String descendingXpath()
    {
        return"//*[@id=\"MainView\"]/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/div[1]/table/thead/tr/th[2]/span[5]";
    }
    
    public static String editClickXpath()
    {
        return "//div/a[@class='clickable-cell ng-scope']";
    }
     public static String GroupNameRowsXpath()
    {
        return "//td[@column-field=\"name\"]";
    }
    
   
}
