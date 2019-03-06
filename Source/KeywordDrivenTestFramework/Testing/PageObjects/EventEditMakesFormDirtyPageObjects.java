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
public class EventEditMakesFormDirtyPageObjects {
    
    public static String NotificationsHeading()
    {
        return "//strong[text()='Notifications']";
    }
    
      public static String NotificationName()
    {
        return "//span[text()='Notification name'][@ng-hide='column.headingClass || !column.title']";
    }
    
      public static String NotificationsGrid()
    {
        return "//div[@class=\"fleet-grid full-height has-row-actions\"]";
    }
      
      
      public static String AddButton()
      {
          return "//span[@button-tooltip='Add notification']/a/i";
      }
      
      public static String AddNotificationHeading()
      {
          return "//span[text()='Add notification']";
      }
      
      public static String NotificationDetails()
      {
          return "//h5[text()='Notification details']";
      }
      
      public static String NameInput()
      {
          return "//input[@name='notificationName']";
      }
      
      public static String Next()
      {
          return "//button[@text='Next']";
      }
      
      public static String Asset()
      {
          return "//h5[text()='Assets']";
      }
      
      public static String GroupSelect()
      {
          return "//a/span[text()='DVT Automation']";
      }
      
      public static String Drivers()
      {
          return "//h5[text()='Drivers']";
      }
      
      public static String Events()
      {
          return "//h5/span[text()='Events']";
      }
      
      public static String Filter()
      {
          return "//div[@class='span12 input-reset-wrapper']/input[@type='text']";
      }
      
      public static String NextButtonDisabled()
      {
          return "//button[@disabled='disabled'][text()='Next']";
      }
      
      public static String NextButtonEnabled()
      {
          return "//button[not(@disabled='disabled')][text()='Next']";
      }
      
      public static String EventSelectionCheckBox()
      {
          return "//td/input[@type='checkbox']";
      }
      
      public static String spinner()
      {
          return "//div[@class='span12 tab-content']/div/div[@style='display: none;']";
      }
}
