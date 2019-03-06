/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects;

import KeywordDrivenTestFramework.Core.BaseClass;

/**
 *
 * @author smbiko
 */
public class DatabaseAdministrationRemovingMLOPageObjects extends BaseClass
{
    public static String editTestRSOXpath() 
    {
//        return "//strong[text()='AutoTestRSO_DBRemove']/..";
        return "//div[@ng-click='select()']//strong[text()='AutoTestRSO_DBRemove']/../..";
    }
    public static String selectMLODropdownXpath() 
    {
        return "//a[@ng-click='add(groupType)'][text()='Multi-level organisation']";
    }
    public static String rolesXpath() 
    {
        return "//a[text()='Roles']";
    }
    public static String securityGroupXpath() 
    {
        return "//a[text()='Security groups']";
    }
    public static String SpanWithTextXpath()
    {
        return "//div[@ng-class='popAlert.cssClass']//span[text()='Role updated successfully']";
    }
    public static String securityGroupsHeaderXpath()
    {
        return "//h5//span[text()='Select security groups for user']";
    }
    public static String securityFilterXpath()
    {
        return "//input[@placeholder='Filter']";
    }
    
    public static String newSecurityGroupCheckboxXpath(){
        return "//th/span[text()='Security group']/../../../../tbody/tr/td/input[@type='checkbox']";
    }
    public static String roleToEditXpath(){
        return "//span[text()='AutoTest1']";
    }
    public static String roleNameEditXpath(){
        return "//input[@ng-model='form.roleName']";
    }
    public static String newMLONameXpath() 
    {
        return "//input[@ng-model='form.multiOrgName']";
    }
    
    public static String TestRSOTreeXpath(){
        return "//span[text()='Test RSO']/../../../..//span[@ui-if='!!item.expanded && hasSupportedChildren(item)']";
    }
}
