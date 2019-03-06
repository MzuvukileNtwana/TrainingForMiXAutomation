/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects;

/**
 *
 * @author smnisi
 */
public class StandardScoringPageObject {
    
    public static String OrganisationHeader()
    {
        return "//h5/span[text()='Organisation settings']";
    }
    public static String OrganisationDefaultHeader()
    {
        return "//h5/span[text()='Organisation settings']";
    }
    
    public static String DriverDefaultsHeader()
    {
        return "//legend[text()='Driver defaults']";
    }
    
    public static String standardScoringButton()
    {
        return "//li/a[text()='Standard scoring']";
    }
    
    public static String standardScoringHeader()
    {
        return "//h5[text()='Standard scoring']";
    }
    
    public static String OverSpeedingWeight()
    {
        return "//tr[2]/td[2]/input";
    }
    
    public static String OverSpeedingDuration()
    {
        return "//tr[2]/td[3]/input";
    }
    
    public static String OverSpeedingSeverity()
    {
        return "//tr[2]/td[4]/input";
    }
    //************OverRevving
    public static String OverRavvingWeight()
    {
        return "//tr[3]/td[2]/input";
    }
    
    public static String OverRavvingDuration()
    {
        return "//tr[3]/td[3]/input";
    }
    
    public static String OverRavvingSeverity()
    {
        return "//tr[3]/td[4]/input";
    }
    
    
    //************Harsh Braking
    public static String HarshBreakingWeight()
    {
         return "//tr[4]/td[2]/input";
    }
    
    public static String HarshBreakingDuration()
    {
         return "//tr[4]/td[3]/input";
    }
     
    public static String HarshBreakingSeverity()
    {
         return "//tr[4]/td[4]/input";
    }
    
    //************Hash Acceleration
    public static String HashAccelerationWeight()
    {
        return "//tr[5]/td[2]/input";
    }
            
     public static String HashAccelerationDuration()
    {
        return "//tr[5]/td[3]/input";
    }
     
      public static String HashAccelerationSeverity()
    {
        return "//tr[5]/td[4]/input";
    }
    
      
      //***************Out of green band driving
      public static String GreenBandDriveWeight()
      {
          return "//tr[6]/td[2]/input";
      }
      
      public static String GreenBandDriveDuration()
      {
          return "//tr[6]/td[3]/input";
      }
      
      //**************IDLE-excessive
        public static String IdleExcessiveWeight()
      {
          return "//tr[7]/td[2]/input";
      }
      
      public static String IdleExcessiveDuration()
      {
          return "//tr[7]/td[3]/input";
      }
      
      public static String RecalculateScoresHeader()
      {
          return "//span[text()='Recalculate scores']";
      }
      
      public static String SaveButton()
      {
          return "//span[text()='Recalculate scores']/../../../../../../div[2]/button[text()='Save']";
      }
      
      public static String StandardScoringSaveButton()
      {
          return "//h5/span[text()='DVT Automation']/../../div/div/button[text()='Save']";
      }
      
      public static String SuccessfullyPopMessage()
      {
          return "//div/span[text()='Organisation updated successfully']";
      }
    
}
