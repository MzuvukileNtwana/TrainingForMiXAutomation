package KeywordDrivenTestFramework.UserAdimn;

import KeywordDrivenTestFramework.Core.BaseClass;
import static KeywordDrivenTestFramework.Core.BaseClass.SeleniumDriverInstance;
import static KeywordDrivenTestFramework.Core.BaseClass.narrator;
import KeywordDrivenTestFramework.Entities.Enums;
import KeywordDrivenTestFramework.Entities.TestEntity;
import KeywordDrivenTestFramework.Entities.TestResult;

public class UserRole extends BaseClass
{
 int counter= 1;
 String errorMessage;
 TestEntity testData;

 public UserRole (TestEntity testData){
     this.testData = testData;
 }
 public TestResult executeTest() throws InterruptedException{
     this.setStartTime();
      pause(1000);
      System.out.println("BRO!!!!!!!!!!!!!!!!!!");
        if(!ClickManage()){
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on Manage Tab", false);
            counter++;
            narrator.failedMessage("Failed to click on Manage Tab - "+errorMessage);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on Manage Tab", this.getTotalExecutionTime());
        }
         pause(5000);
         if(!ClickRole()){
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on Manage Tab", false);
            counter++;
            narrator.failedMessage("Failed to click on Manage Tab - "+errorMessage);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on Manage Tab", this.getTotalExecutionTime());
        }
         
         
         
         
           pause(5000);
         if(!ClickAdd()){
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on Manage Tab", false);
            counter++;
            narrator.failedMessage("Failed to click on Manage Tab - "+errorMessage);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on Manage Tab", this.getTotalExecutionTime());
        }
     
         
        pause(5000);
         if(!AddUserRole()){
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on Manage Tab", false);
            counter++;
            narrator.failedMessage("Failed to click on Manage Tab - "+errorMessage);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on Manage Tab", this.getTotalExecutionTime());
        }
         
             pause(5000);
         if(!SearchRole()){
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on Manage Tab", false);
            counter++;
            narrator.failedMessage("Failed to click on Manage Tab - "+errorMessage);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on Manage Tab", this.getTotalExecutionTime());
        }
         
//         pause(5000);
//         if(!checkTemplate("No items to display")){
//            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on Manage Tab", false);
//            counter++;
//            narrator.failedMessage("Failed to click on Manage Tab - "+errorMessage);
//            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on Manage Tab", this.getTotalExecutionTime());
//        }
         
          pause(5000);
         if(!Remove()){
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on Manage Tab", false);
            counter++;
            narrator.failedMessage("Failed to click on Manage Tab - "+errorMessage);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on Manage Tab", this.getTotalExecutionTime());
        }
         
      

     return new TestResult (testData,Enums.ResultStatus.PASS, "successfully Added my first asset", this.getTotalExecutionTime());
    }
 
 public boolean ClickManage(){
    
    if(!SeleniumDriverInstance.clickElementByXpath("(//a[@class='dropdown-toggle ng-binding'])[2]")){
        
       errorMessage = "could not click on Manage button";
        return false;
    }
     pause(2000);
   SeleniumDriverInstance.takeScreenShot(counter + "- Clicked Manage tab successfully -", false);
   counter++;
    return true;
}
 
 public boolean ClickRole(){
    
    if(!SeleniumDriverInstance.clickElementByXpath("(//a[@class='ng-binding'])[42]")){
        
       errorMessage = "could not click on Manage button";
        return false;
    }
     pause(2000);
   SeleniumDriverInstance.takeScreenShot(counter + "- Clicked Manage tab successfully -", false);
   counter++;
    return true;
}
 
  public boolean ClickAdd(){
    
    if(!SeleniumDriverInstance.clickElementByXpath("//a[@class='btn btn-small btn-success']")){
        
       errorMessage = "could not click on Manage button";
        return false;
    }
     pause(2000);
   SeleniumDriverInstance.takeScreenShot(counter + "- Clicked Manage tab successfully -", false);
   counter++;
    return true;
}
 
   public boolean SearchRole(){
     
         if(!SeleniumDriverInstance.enterTextByXpath("//input[@type='text']", "Anelisiwe")){
     errorMessage = "Could not search details";
     return false;
     
         }
         
          pause(1000);
      if(!SeleniumDriverInstance.clickElementByXpath("(//i[@class='icon-search'])[1]")){
        
       errorMessage = "could not click on Manage button";
        return false;
    }

         SeleniumDriverInstance.takeScreenShot(counter + "- Search details successfully -", false);
        counter++;
        return true;
         
     }
   
  public boolean AddUserRole(){
    
    if(!SeleniumDriverInstance.EnterTextByXpath("//input[@type='text']", "Anelisiwe")){
        
       errorMessage = "could not click on Manage button";
        return false;
    }
    
     pause(1000);
      if(!SeleniumDriverInstance.selectFromDropDownListUsingXpath("//SELECT[@ng-options='profile.id as (profile.name|translate) for profile in profiles']", "General administrator")){  
       
        
       errorMessage = "could not click on Manage button";
        return false;
    }
    
    pause(1000);
      if(!SeleniumDriverInstance.clickElementByXpath("//A[@class='btn btn-success btn-small'][text()='Make available']")){
        
       errorMessage = "could not click on Manage button";
        return false;
    }
    
      pause(1000);
      if(!SeleniumDriverInstance.clickElementByXpath("//SPAN[@ui-if='!item.expanded && hasSupportedChildren(item)']")){
        
       errorMessage = "could not click on Manage button";
        return false;
    }
      
      pause(1000);
      if(!SeleniumDriverInstance.clickElementByXpath("//SPAN[@class='ng-binding'][text()='MiX Automation']")){
        
       errorMessage = "could not click on Manage button";
        return false;
    }
      
      pause(3000);
      if(!SeleniumDriverInstance.clickElementByXpath("//BUTTON[@class='btn ng-scope ng-binding btn-wide btn-success'][text()='OK']")){
        
       errorMessage = "could not click on Manage button";
        return false;
    }
      
      pause(2000);
      if(!SeleniumDriverInstance.clickElementByXpath("//BUTTON[@class='btn-wide btn-small btn-success btn ng-binding'][text()='Next']")){
        
       errorMessage = "could not click on Manage button";
        return false;
    }
      
       pause(2000);
      if(!SeleniumDriverInstance.clickElementByXpath("(//I[@class='icon-ok-circle'])[1]")){
        
       errorMessage = "could not click on Manage button";
        return false;
    }
      
          pause(2000);
      if(!SeleniumDriverInstance.clickElementByXpath("(//label[@class='inline-block ml-10 pull-left ng-scope'])[1]")){
        
       errorMessage = "could not click on Manage button";
        return false;
    }
      
          pause(2000);
      if(!SeleniumDriverInstance.clickElementByXpath("//BUTTON[@class='btn-wide btn-small btn-success btn ng-binding'][text()='Save']")){
        
       errorMessage = "could not click on Manage button";
        return false;
    }
      
        pause(2000);
      if(!SeleniumDriverInstance.clickElementByXpath("//div[@class='pull-left page-section-header ng-scope']")){
        
       errorMessage = "could not click on Manage button";
        return false;
    }
      
         pause(2000);
   SeleniumDriverInstance.takeScreenShot(counter + "- Clicked Manage tab successfully -", false);
   counter++;
    return true;
}
  
//       public boolean checkTemplate(String textToCompare){
//         
//         String theText = SeleniumDriverInstance.retrieveTextByXpath("//SPAN[@class='badge ng-binding'][text()='No items to display']");
//         System.out.println(theText);
//         if(theText.equals(textToCompare)){
//             
//             ClickAdd();
//             pause(3000);
//             AddUserRole();
//             pause(3000);
//               
//         }
//         SeleniumDriverInstance.takeScreenShot(counter + "- Clicked add button successfully -", false);
//        counter++;
//        return true;
//     } 
       
       
         public boolean Remove(){
    
         SeleniumDriverInstance.clickElementByXpath("//a[@class='row-action']");
         pause(3000);
         SeleniumDriverInstance.clickElementByXpath("//a[@event='Remove']");
         pause(3000);
         SeleniumDriverInstance.clickElementByXpath("(//BUTTON[@class='btn ng-scope ng-binding btn-wide btn-success'][text()='Remove'][text()='Remove'])[2]");
         pause(3000);
//         SeleniumDriverInstance.clickElementByXpath("//BUTTON[@ng-show='$modal.okayButton'][text()='Remove']");
//         pause(3000);
         SeleniumDriverInstance.takeScreenShot(counter + "- Search details successfully -", false);
        counter++;
        return true;
    
//      pause(1000);
//        if(!SeleniumDriverInstance.clickElementByXpath("//a[@fleet-tooltip='Actions']")){
//          
//            return false;
//        }
//     
//        if(!SeleniumDriverInstance.clickElementByXpath("(//span[@class='ng-binding'])[11]")){
//         return false;
//        }
//        pause(1000);
//        if(!SeleniumDriverInstance.clickElementByXpath("(//button[@type='submit'])[1]")){
//         return false;
//        }
//    pause(3000);
//   SeleniumDriverInstance.takeScreenShot(counter + "-   successfully  added new location Template -", false);
//   counter++;
//    return true;
    }
 
}