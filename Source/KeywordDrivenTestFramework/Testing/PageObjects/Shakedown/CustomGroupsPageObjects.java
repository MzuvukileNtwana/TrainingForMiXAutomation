/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects.Shakedown;

/**
 *
 * @author sscholtz
 */
public class CustomGroupsPageObjects {
    
    public static String CustomGroupSpinner()
    {
        return "//div[@class='span12 full-height']/div[@class='loading-overlay ng-scope'][@style='display: none;']";
    }
    public static String AddCustomGroupSpinner()
    {
        return "//form[@name=\"customGroupDetailsForm\"]/../div[@class=\"loading-overlay ng-scope\"][@style=\"display: none;\"]";
    }
    
    public static String AddButton()
    {
        return "//a[@fleet-tooltip='Add custom group']";
    }
    
    public static String GroupDetailsHeading()
    {
        return "//legend[text()='Group details']";
    }
    
    public static String GroupNameHeading()
    {
        return "//span[text()='Group name']";
    }
    
    public static String GroupName()
    {
        return "//input[@name='groupName']";
    }
    
    public static String GroupType()
    {
        return "//select[@ng-model='group.groupTypeId']";
    }
    
    public static String Description()
    {
        return "//textarea[@ng-model='group.description']";
    }
    
    public static String NextButton()
    {
        return "//button[text()='Next']";
    }
    
      public static String SaveButtonMessage()
    {
        return "//span[text()='Group updated successfully']";
    }
      
       public static String MessageClearence()
    {
        return "//div[@class='notification-wrapper notification-modal ng-scope'][@style='display: none;']";
    }
      
       public static String GroupMembershipHeading()
    {
        return "//legend[text()='Group membership']";
    }
      
       public static String Expand()
    {
        return "//span[@class='daredevel-tree-anchor ui-icon icon-plus ng-scope']";
    }
       
    public static String SiteExpand(String name)
    {
        return "//span[text()='"+name+"']/../../../span";
    }
       
    public static String SelectAsset(String asset)
    {
        return "//span[text()='"+asset+"']/..";
    }
    
    public static String SelectAssetcheck(String asset)
    {
        return "//span[text()='"+asset+"']/../input";
    }
    
    public static String SaveButton()
    {
        return "//button[text()='Save']";
    }
    
    public static String Filter()
    {
        return "//input[@placeholder='Filter']";
    }
    
    public static String CustomGroupName(String name)
    {
        return "//span[text()='"+name+"']";
    }
    
    public static String GroupMembership()
    {
        return "//a[text()='Group membership']";
    }
    
    public static String CancelButton()
    {
        return "//button[text()='Cancel']";
    }
    
    public static String RemoveMessage()
    {
        return "//span[text()='Group removed successfully']";
    }
    
    public static String RemoveMessageClear()
    {
        return "//div[@class='notification-wrapper notification-modal ng-scope'][@style='display: none;']";
    }

    //Select Assest
}
