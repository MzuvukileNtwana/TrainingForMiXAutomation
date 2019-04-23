/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.UserAdimn;

import KeywordDrivenTestFramework.Core.BaseClass;
import static KeywordDrivenTestFramework.Core.BaseClass.SeleniumDriverInstance;
import static KeywordDrivenTestFramework.Core.BaseClass.narrator;
import KeywordDrivenTestFramework.Entities.Enums;
import KeywordDrivenTestFramework.Entities.TestEntity;
import KeywordDrivenTestFramework.Entities.TestResult;

/**
 *
 * @author AnelisiweC
 */
public class SecurityGroup extends BaseClass{
    
    int counter = 1;
    String errorMessage;
    TestEntity testData;
    
    public SecurityGroup (TestEntity testData){
            
        this.testData = testData;
    }
    
  public TestResult executeTest() throws InterruptedException{
        
        this.setStartTime();
         pause(3000);
        if(!ClickManage()){
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on Manage Tab", false);
            counter++;
            narrator.failedMessage("Failed to click on Manage Tab - "+errorMessage);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on Manage Tab", this.getTotalExecutionTime());
        }
        
          pause(3000);
        if(!ClickSecurityGroup()){
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on Manage Tab", false);
            counter++;
            narrator.failedMessage("Failed to click on Manage Tab - "+errorMessage);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on Manage Tab", this.getTotalExecutionTime());
        }
        
        
         pause(3000);
        if(!DeleteDetails()){
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on Manage Tab", false);
            counter++;
            narrator.failedMessage("Failed to click on Manage Tab - "+errorMessage);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on Manage Tab", this.getTotalExecutionTime());
        }
        
        pause(3000);
        if(!ClickAdd()){
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on Manage Tab", false);
            counter++;
            narrator.failedMessage("Failed to click on Manage Tab - "+errorMessage);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on Manage Tab", this.getTotalExecutionTime());
        }
        
         pause(3000);
        if(!AddSecurityGroup()){
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on Manage Tab", false);
            counter++;
            narrator.failedMessage("Failed to click on Manage Tab - "+errorMessage);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on Manage Tab", this.getTotalExecutionTime());
        }
        
         pause(3000);
        if(!clickIcon()){
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on Manage Tab", false);
            counter++;
            narrator.failedMessage("Failed to click on Manage Tab - "+errorMessage);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on Manage Tab", this.getTotalExecutionTime());
        }
        
         pause(3000);
        if(!SelectAutomation()){
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on Manage Tab", false);
            counter++;
            narrator.failedMessage("Failed to click on Manage Tab - "+errorMessage);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on Manage Tab", this.getTotalExecutionTime());
        }
        
         pause(3000);
        if(!SelectALL()){
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on Manage Tab", false);
            counter++;
            narrator.failedMessage("Failed to click on Manage Tab - "+errorMessage);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on Manage Tab", this.getTotalExecutionTime());
        }
        
        
         pause(3000);
        if(!SelectXMixRole()){
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on Manage Tab", false);
            counter++;
            narrator.failedMessage("Failed to click on Manage Tab - "+errorMessage);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on Manage Tab", this.getTotalExecutionTime());
        }
    return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click close button", this.getTotalExecutionTime());
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
  
   public boolean ClickSecurityGroup(){
    
    if(!SeleniumDriverInstance.clickElementByXpath("(//a[@class='ng-binding'])[43]")){
        
       errorMessage = "could not click on Manage button";
        return false;
    }
     pause(2000);
   SeleniumDriverInstance.takeScreenShot(counter + "- Clicked Manage tab successfully -", false);
   counter++;
    return true;
}
  public boolean ClickAdd(){
    
    if(!SeleniumDriverInstance.clickElementByXpath("//i[@class='icon-plus icon-white']")){
        
       errorMessage = "could not click on Manage button";
        return false;
    }
     pause(2000);
   SeleniumDriverInstance.takeScreenShot(counter + "- Clicked Manage tab successfully -", false);
   counter++;
    return true;
} 
  
    public boolean AddSecurityGroup(){
    
    if(!SeleniumDriverInstance.EnterTextByXpath("//input[@type='text']", "Anelisiwe")){
        
       errorMessage = "could not click on Manage button";
        return false;
    }
    
      pause(1000);
      if(!SeleniumDriverInstance.clickElementByXpath("//a[@class='btn btn-success pull-right mt-5 btn-small']")){
        
       errorMessage = "could not click on Manage button";
        return false;
    }
      pause(1000);
      if(!SeleniumDriverInstance.EnterTextByXpath("(//input[@type='text'])[4]", "Security")){
        
       errorMessage = "could not click on Manage button";
        return false;
    }  
      pause(1000);
      if(!SeleniumDriverInstance.clickElementByXpath("//TH[@ng-show='allowRowSelection && allowSelectAll']")){
        
       errorMessage = "could not click on Manage button";
        return false;
    }
      
      pause(1000);
      if(!SeleniumDriverInstance.clickElementByXpath("//button[@class='btn ng-scope ng-binding btn-wide btn-success']")){
        
       errorMessage = "could not click on Manage button";
        return false;
    }
      
      pause(1000);
      if(!SeleniumDriverInstance.clickElementByXpath("//button[@class='btn-wide btn-small btn-success btn ng-scope ng-binding']")){
        
       errorMessage = "could not click on Manage button";
        return false;
    }
      
      pause(1000);
      if(!SeleniumDriverInstance.clickElementByXpath("//a[@class='btn btn-small btn-success pull-right']")){
        
       errorMessage = "could not click on Manage button";
        return false;
    }
//      pause(1000);
//      if(!SeleniumDriverInstance.clickElementByXpath("(//A[@ng-class='$directive.itemClass(item)'])[1]")){
//        
//       errorMessage = "could not click on Manage button";
//        return false;
//    }
//      
//      pause(1000);
//      if(!SeleniumDriverInstance.clickElementByXpath("(//a[@class='btn btn-small btn-success btn-wide ng-binding'])[2]")){
//        
//       errorMessage = "could not click on Manage button";
//        return false;
//    }
      
   pause(2000);
   SeleniumDriverInstance.takeScreenShot(counter + "- Clicked Manage tab successfully -", false);
   counter++;
    return true;
}
    
    
     public boolean clickIcon(){
        int c=1;
     while(!SeleniumDriverInstance.getElementTextByXpath("(//A[@ng-class='$directive.itemClass(item)'])["+c+"]").equals("MiX Automation")){
         c++;
     }    
 pause(2000);
     if(!SeleniumDriverInstance.clickElementByXpath("(//A[@ng-class='$directive.itemClass(item)'])["+c+"]")){
         errorMessage = "Failed to find MiX Automation button";
         return false;  
     } 
     
       pause(1000);
      if(!SeleniumDriverInstance.clickElementByXpath("(//a[@class='btn btn-small btn-success btn-wide ng-binding'])[2]")){
        
       errorMessage = "could not click on Manage button";
        return false;
    }
     
//     pause(2000);
//     if(!SeleniumDriverInstance.selectByTextFromDropDownListUsingXpath("//SELECT[@class='span12 no-margins ng-valid ng-dirty']", "x. MiX Role")){
//         errorMessage = "Failed to find MiX Automation button";
//         return false;  
//     }
//      pause(1000);
//      if(!SeleniumDriverInstance.clickElementByXpath("//BUTTON[@class='btn-wide btn-small btn-success btn ng-scope ng-binding'][text()='Save']")){
//        
//       errorMessage = "could not click on Manage button";
//        return false;
//    }
     
      pause(2000);
   SeleniumDriverInstance.takeScreenShot(counter + "- Clicked Security Groups successfully -", false);
   counter++;
    return true; 

}
     
     
//public boolean SelectAutomation(){
//   
//    if(!SeleniumDriverInstance.clickElementByXpath("(//a[@class='btn btn-small btn-success btn-wide ng-binding'])[2]")){
//        
//       errorMessage = "could not click on a Security Groups";
//        return false;
//        
//    }
//   SeleniumDriverInstance.takeScreenShot(counter + "- Clicked Security Groups successfully -", false);
//   counter++;
//    return true; 
//
//}
     
     public boolean SelectAutomation(){
   
    if(!SeleniumDriverInstance.clickElementByXpath("(//a[@class='btn btn-small btn-success btn-wide ng-binding'])[2]")){
        
       errorMessage = "could not click on a Security Groups";
        return false;
        
    }
   SeleniumDriverInstance.takeScreenShot(counter + "- Clicked Security Groups successfully -", false);
   counter++;
    return true; 

}
    
    public boolean SelectALL(){
   
    if(!SeleniumDriverInstance.clickElementByXpath("//select[@class='span12 ng-pristine ng-valid']")){
        
       errorMessage = "could not click on a Security Groups";
        return false;
        
    }
   SeleniumDriverInstance.takeScreenShot(counter + "- Clicked Security Groups successfully -", false);
   counter++;
    return true; 
}
    
    
    public boolean SelectXMixRole(){
         if(!SeleniumDriverInstance.selectFromDropDownListUsingXpath("//select[@name = 'selectedRoleId']", "x. MiX Role")){
             errorMessage = "could not on add details";
             return false;
         }
  
   SeleniumDriverInstance.takeScreenShot(counter + "- Clicked Security Groups successfully -", false);
   counter++;
    return true; 
}
    
    public boolean DeleteDetails(){
        
   if(!SeleniumDriverInstance.enterTextByXpath("(//input[@type='text'])[1]", "Anelisiwe")){
       errorMessage = "could not on add details";
        return false;
    }
   pause(2000);
   String text = SeleniumDriverInstance.retrieveTextByXpath("(//td)[5]");
    System.out.println(text);
    if(!SeleniumDriverInstance.CheckIfElementDisplayedByXpath("//div//span[text() = 'No items to display']")){
        if(!text.contains("0")){
            SeleniumDriverInstance.clickElementByXpath("(//a[contains(@class, 'clickable')])[1]");
            while(SeleniumDriverInstance.clickElementByXpath("(//a[contains(@ng-click, 'removeItem')])[1]")){
                 pause(2000);
             }
             pause(2000);
             SeleniumDriverInstance.clickElementByXpath("//button[text() = 'Save']");
             pause(2000);
             SeleniumDriverInstance.clickElementByXpath("//button[text() = 'Close']");
             pause(2000);
             SeleniumDriverInstance.enterTextByXpath("(//input[@type='text'])[1]", "Anelisiwe");
             pause(2000);
             SeleniumDriverInstance.clickElementByXpath("//a[@fleet-tooltip = 'Actions']");
             pause(2000);
             SeleniumDriverInstance.clickElementByXpath("//a//span[text() = 'Remove']");
             pause(2000);
             SeleniumDriverInstance.clickElementByXpath("//button[text() = 'Remove']");
        }else{
            SeleniumDriverInstance.clickElementByXpath("//a[@fleet-tooltip = 'Actions']");
             pause(2000);
             SeleniumDriverInstance.clickElementByXpath("//a//span[text() = 'Remove']");
             pause(2000);
             SeleniumDriverInstance.clickElementByXpath("//button[text() = 'Remove']");
        }
    }
   
   SeleniumDriverInstance.takeScreenShot(counter + "- Clicked Security Groups successfully -", false);
   counter++;
        return true;
    }
  
}
