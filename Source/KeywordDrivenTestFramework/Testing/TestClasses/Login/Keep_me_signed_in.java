/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.TestClasses.Login;

import KeywordDrivenTestFramework.Core.BaseClass;
import static KeywordDrivenTestFramework.Core.BaseClass.SeleniumDriverInstance;
import KeywordDrivenTestFramework.Entities.Enums;
import KeywordDrivenTestFramework.Entities.TestEntity;
import KeywordDrivenTestFramework.Entities.TestResult;
import KeywordDrivenTestFramework.Testing.PageObjects.MixTelematics_PageObjects;
import static java.lang.System.err;
import java.util.Set;

/**
 *
 * @author fnell
 */
public class Keep_me_signed_in extends BaseClass {

    int counter = 1;

    TestEntity testData;

    public Keep_me_signed_in(TestEntity testData) {
        this.testData = testData;
    }

    public TestResult executeTest() {

        this.setStartTime();
        

        if (!NavigatetoMixTelematics()) 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to navigate to Mix Telematics URL", true);
            counter++;
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to navigate to Mix Telematics URL", this.getTotalExecutionTime());
        }
        
                
        if (!EnterCorrectCredentials()) 
        {
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to Enter Correct Credentials to Mix Telematics URL", true);
            counter++;
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to Enter Correct Credentials to Mix Telematics URL", this.getTotalExecutionTime());
        }

          if(!checkKeepMeSignIn())
        {
             SeleniumDriverInstance.takeScreenShot(counter + " - Failed to keep me sign in cjech boxPage", true);
             counter++;
             return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to keep me sign in check box", this.getTotalExecutionTime());
        } 
          
        if(!ClickSignIn())
             {
                     SeleniumDriverInstance.takeScreenShot(counter + " - Failed to Click Sign In button", true);
                     counter++;
                     return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to Click Sign In button", this.getTotalExecutionTime());
            }
        
        
        if(!ValidateLandingPage())
            {
                SeleniumDriverInstance.takeScreenShot(counter + " - Failed to Validate Landing Page", true);
                counter++;
                return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to Validate Landing Page", this.getTotalExecutionTime());

            }
                   
        return new TestResult(testData, Enums.ResultStatus.PASS, "Successfully checked the keep me signed in check box using span.", this.getTotalExecutionTime());
    }
  
    public boolean NavigatetoMixTelematics() 
    {
        //Navigates to Mix Telematics URL
        if (!SeleniumDriverInstance.navigateTo(MixTelematics_PageObjects.MixTelematicsURL()))
        {
            return false;
        }
        
        //Logout
        if(this.stillSignedIn())
        {
            SeleniumDriverInstance.clickElementByXpath(MixTelematics_PageObjects.LogoutXpath());
        }
        //Take Screenshot
        SeleniumDriverInstance.takeScreenShot(counter + " - Navigation to Mix Telematics URL successful", false);
        counter++;

        return true;
    }
     public boolean checkKeepMeSignIn()
      {
          //Tick Keep me sign in Check box
          if (!SeleniumDriverInstance.clickElementbyXpath(MixTelematics_PageObjects.KeepMeSignedInXpath())){
              
              err.println("[ERROR] Failed to click the keep me sign in check box");
              return false;
          }
          //Take Screenshot
          SeleniumDriverInstance.takeScreenShot("Successfully checked the keep me signed in check box using span", false);
          return true;
      }
    
        public boolean stillSignedIn()
        {
            //Tick Keep me sign in Check box
            if(SeleniumDriverInstance.waitForElementByXpath(MixTelematics_PageObjects.AssetLabelXpath()))
            {
              //Take Screenshot
              SeleniumDriverInstance.takeScreenShot("Successfully checked user still signed in", false);
            }
              return true;
          
        }
    
         public boolean ClickSignIn()
         {
          //Tick Keep me sign in Check box
          if (!SeleniumDriverInstance.clickElementbyXpath(MixTelematics_PageObjects.SignInButtonXpath()))
          {
              err.println("[ERROR] Failed to click the keep me sign in check box");
              return false;
          }
        
          //Take Screenshot
          SeleniumDriverInstance.takeScreenShot("Successfully clicked the sign in button", false);
          return true; 
        }
     
    
    public boolean EnterCorrectCredentials()
    {      
        //Enter Username
        if (!SeleniumDriverInstance.enterTextByName(MixTelematics_PageObjects.UsernameClassname(), this.testData.getData("Username")))
        {
            err.println("[ERROR] Failed to enter the username");
            return false;
        }
        
        //Enter Password
        if(!SeleniumDriverInstance.enterTextByName(MixTelematics_PageObjects.PasswordClassname(), this.testData.getData("Password")))
        {
            err.println("[ERROR] Failed to enter password");
            return false;
        }

        return true;
    }
 
  public void CloseAndOpenBrowser()
  {
      //Get cookies and close browser the browser
      Set cookie = SeleniumDriverInstance.getCookiesAsSet();
      SeleniumDriverInstance.Driver.close();
      
      //Start the browser session
      SeleniumDriverInstance.startDriver();
      this.NavigatetoMixTelematics();
      
      //Set the cookies propieties
      SeleniumDriverInstance.setCookiesAsPropertySet(cookie);
      
      //JOptionPane.showMessageDialog(null,"Successfully imported cookies!");
      this.NavigatetoMixTelematics();
      SeleniumDriverInstance.waitForElementByClassName("leaflet-marker-pane", 10);
  }
  
  
  public boolean ValidateLandingPage()
      {
          //Validate Asset Label appears on the landing page //span[text()='Assets']
          if (!SeleniumDriverInstance.waitForElementByXpath(MixTelematics_PageObjects.AssetLabelXpath()))
              return false;
          
          if (!SeleniumDriverInstance.waitForElementByXpath(MixTelematics_PageObjects.AllLabelXpath()))
              return false;
          
          if (browserType != Enums.BrowserType.IE && !SeleniumDriverInstance.Driver.getCurrentUrl().contains("fleet-admin/assets"))
              return false;
          
          //Take Screenshot
          SeleniumDriverInstance.takeScreenShot("Successfully validated the landing page by checking the fleet-admin assets url", false);
          this.CloseAndOpenBrowser();
          return true;
      }
}
