/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Utilities;

import KeywordDrivenTestFramework.Core.BaseClass;
import static KeywordDrivenTestFramework.Core.BaseClass.currentDevice;
import static KeywordDrivenTestFramework.Core.BaseClass.currentPlatform;
import static KeywordDrivenTestFramework.Core.BaseClass.testCaseId;
import KeywordDrivenTestFramework.Entities.Enums;
import java.net.URL;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import KeywordDrivenTestFramework.Entities.RetrievedTestValues;
import KeywordDrivenTestFramework.Entities.TestEntity;
import KeywordDrivenTestFramework.Reporting.Narrator;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.net.UrlChecker;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.Key;

/**
 *
 * @author drousseau
 */
public class AppiumDriverUtility extends BaseClass
{

//    public static AppiumDriver Driver;
    public static AndroidDriver Driver;
//    public RemoteWebDriver Driver;
    File fileIEDriver;
    public RetrievedTestValues retrievedTestValues;
    public String DriverExceptionDetail = "";
    public String Port = "";
    TestEntity testData;
    int time=0;
    public Boolean _isDriverRunning = false;
    Runtime rt = Runtime.getRuntime();
    public static boolean isCMDRunning = false;
    
    public AppiumDriverUtility(String a) throws MalformedURLException, IOException, InterruptedException
    {
        String pack,act;
//        try
//        {
//            stop();
//        }
//        catch(Exception e)
//        {
//            
//        }
//        pause(3000);
//        start();
        //TestMarshall.AppiumDriverInstance = this;
      	DesiredCapabilities capabilities = new DesiredCapabilities();
        if(a.equals("MiX Tabs"))
        {
            pack="com.mixtelematics.mixtabs.manager";
            act="md5f4d72c34b773bee392e8c06d40e70673.SplashScreenView";
        }
        else if(a.equals("MiX Go"))
        {
           pack = "com.mixtelematics.mix.go.main";
           act = "com.mixtelematics.mix.go.main.LoginActivity";
        }
        else if(a.equals("MyMiX"))
        {
           pack = "com.mixtelematics.driverportal";
           //act = "md5b32b91655174ef2263bf08ad2db8692d.SplashScreen";
           act = "mymix.droid.views.SplashScreenActivity";
        }
        else if(a.equals("MiXFleetManager"))
        {
           pack = "com.mixtelematics.mixfleet.manager";
           //act = "md5b32b91655174ef2263bf08ad2db8692d.SplashScreen";
           act = "md551b67431be43deb4fd4b1919c29fa655.SplashScreen";
        }
        else
        {
            pack=null;
            act=null;
        }
	capabilities.setCapability("BROWSER_NAME", "Android");
	capabilities.setCapability("VERSION", "6.0"); 
	capabilities.setCapability("deviceName","Android Device");
	capabilities.setCapability("platformName","Android"); 
        capabilities.setCapability("appPackage", pack);
   	capabilities.setCapability("appActivity",act);
           Driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
            //Driver = (AndroidDriver) setCapabilitiesRemoteRun(currentDevice.DeviceID, currentDevice.ServerURL);
            _isDriverRunning = true;

        
    }
    private void start() throws IOException, InterruptedException
    {
        
        rt.exec("cmd.exe /c start cmd.exe /k \"appium -a 127.0.0.1 -p 4723\"");
        System.out.println("Starting appium");
        Thread.sleep(20000);
        final String SERVER_URL = "http://127.0.0.1:4723/wd/hub";
        final URL status = new URL(SERVER_URL + "/sessions");
        try 
        {
            new UrlChecker().waitUntilAvailable(30, TimeUnit.SECONDS, status);
            System.out.println("Started Successfully");
        }
        catch (UrlChecker.TimeoutException e) {
            System.out.println("Error starting server");
        }
    
        isCMDRunning=true;
    }
    public void stop() throws IOException
    {
        
        rt.exec("taskkill /F /IM cmd.exe");
        isCMDRunning=false;
    }
    public AppiumDriverUtility()
    {
        if (_isRemote == false)
        {

            if (isCMDRunning == false)
            {
                this.startServer(currentDevice.ServerURL);
            }
        }
        else
        {
            
            Driver = (AndroidDriver) setCapabilitiesRemoteRun(currentDevice.DeviceID, currentDevice.ServerURL);
            _isDriverRunning = true;

        }

    }

    public WebDriver setCapabilitiesWithApk()
    {

        try
        {
            //The APK information is set in the appconfig
            File app = new File(currentDeviceConfig.ApplicationFilePath, currentDeviceConfig.ApplicationName);
            
            DesiredCapabilities capabilities = new DesiredCapabilities();

            capabilities.setCapability(currentDevice.CapabilityName, currentDevice.DeviceID);
            capabilities.setCapability("deviceName", currentDeviceConfig.deviceName);
            capabilities.setCapability("platformName", currentDeviceConfig.platformName);
            capabilities.setCapability("automationName", currentDeviceConfig.automationName);
            capabilities.setCapability(CapabilityType.VERSION, currentDeviceConfig.Version);
            //Call the following use RunActivity
//          capabilities.setCapability("appPackage", currentDeviceConfig.appPackage);
//          capabilities.setCapability("appActivity", currentDeviceConfig.appActivity);
            capabilities.setCapability("app", app.getAbsolutePath());
            capabilities.setCapability("newCommandTimeout", 360);
            isCMDRunning = true;
            Thread.sleep(60000);
            return new AndroidDriver(new URL(currentDevice.ServerURL), capabilities);
        }

        catch (Exception e)
        {
            Narrator.logError("Error setting Capabilities - " + e.getMessage());
            return null;
        }
    }
    
    public boolean isElementDisplayedXpath(String xpath) throws InterruptedException
    {
        boolean i=false;
        while(i==false)
        {
            Thread.sleep(2000);
            try 
            {
                if (AppiumDriverUtility.Driver.findElement(By.xpath(xpath)).isDisplayed())
                {
                    time=0;
                    return true;
                }
                else
                {
                    i=true;
                }
            }
            catch(Exception e)
            {
                if(time<15)
                {
                    time++;
                }
                else
                {
                    time=0;
                    return false;
                }
            }
       
        }
        return true;
    }
    public boolean ScrollToElement(String elementXpath) throws IOException, InterruptedException
    {
        boolean i =false;
        int time=0;
        System.out.println("[INFO] Scrolling to element xpath: "+elementXpath);
        while(i==false)
        {
            Thread.sleep(2000);
            try 
            {
                if (AppiumDriverUtility.Driver.findElement(By.xpath(elementXpath)).isDisplayed())
                {
                    AppiumDriverUtility.Driver.findElement(By.xpath(elementXpath)).click();
                    break;
                }
                else
                {
                    i=true;
                }
            }
            catch(Exception e)
            {
                if(time<15)
                {
                    this.VerticalScrollFromCenter("Down");  
                    time++;
                }
                else
                {
                    return false;
                }
            }
            

        }
        return true;
    }
    
    public boolean WaitForElementByXpath(String elementXpath) throws IOException, InterruptedException
    {
        boolean i =false;
        int time=0;
        System.out.println("[INFO] Waiting for element xpath: "+elementXpath);
        while(i==false)
        {
            Thread.sleep(2000);
            try 
            {
                if (AppiumDriverUtility.Driver.findElement(By.xpath(elementXpath)).isDisplayed())
                {
                    i=true;
                    break;
                }
            }
            catch(Exception e)
            {
                if(time<15)
                {
                    time++;
                }
                else
                {
                    return false;
                }
            }
            

        }
        return true;
    }
    
    public String GetElementTextByXpath(String elementXpath) throws IOException, InterruptedException
    {
        String v="";
        System.out.println("[INFO] Attempting to get text of element xpath: "+elementXpath);
        Thread.sleep(2000);
        try 
        {
            v=AppiumDriverUtility.Driver.findElement(By.xpath(elementXpath)).getText();
            System.out.println("[INFO] Text found");
        }
        catch(Exception e)
        {
            System.out.println("Unable to get text");
        }

        return v;
    }
    public String GetElementTextById(String id) throws IOException, InterruptedException
    {
        String v="";
        System.out.println("[INFO] Scrolling to element xpath: "+id);
        Thread.sleep(2000);
        try 
        {
            v=AppiumDriverUtility.Driver.findElement(By.id(id)).getText();
            System.out.println("[INFO] Text found");
        }
        catch(Exception e)
        {
            System.out.println("Unable to get text");
        }

        return v;
    }
    public WebDriver setCapabilitiesWithIpa()
    {

        try
        {
            //The IPA information is set in the appconfig
            File app = new File(currentDeviceConfig.ApplicationFilePath, currentDeviceConfig.ApplicationName);

            DesiredCapabilities capabilities = new DesiredCapabilities();

            capabilities.setCapability(currentDevice.CapabilityName, currentDevice.DeviceID);
            capabilities.setCapability("deviceName", currentDeviceConfig.deviceName);
            capabilities.setCapability("platformName", currentDeviceConfig.platformName);
            capabilities.setCapability("automationName", currentDeviceConfig.automationName);
            capabilities.setCapability(CapabilityType.VERSION, currentDeviceConfig.Version);
            capabilities.setCapability("appPackage", currentDeviceConfig.appPackage);
            capabilities.setCapability("appActivity", currentDeviceConfig.appActivity);
            capabilities.setCapability("app", app.getAbsolutePath());
            capabilities.setCapability("newCommandTimeout", 360);

            return new AndroidDriver(new URL(currentDevice.ServerURL), capabilities);
        }

        catch (Exception e)
        {
            Narrator.logError("Error setting Capabilities - " + e.getMessage());
            return null;
        }
    }

    public WebDriver setCapabilitiesRemoteRun(String deviceUDID, String serverURL)
    {

        try
        {
            DesiredCapabilities capabilities = new DesiredCapabilities();

            capabilities.setCapability("udid", deviceUDID);
            capabilities.setCapability("deviceName", deviceUDID);
            capabilities.setCapability("appPackage", currentDeviceConfig.appPackage);
            capabilities.setCapability("appActivity", currentDeviceConfig.appActivity);
            capabilities.setCapability("platformName", currentDevice.platform);
            capabilities.setCapability("newCommandTimeout", 360);
            capabilities.setCapability("onResetTimeout", 360);

            return new AndroidDriver(new URL(serverURL), capabilities)
            {
            };
        }

        catch (Exception e)
        {
            Narrator.logError("Error setting Capabilities - " + e.getMessage());
            return null;
        }
    }

    public boolean startServer(String directory)
    {
        try
        {
            Port = currentDevice.ServerURL;
            String new_dir = directory;
            String[] URLinfo = Port.split(":");
            String[] Portinfo = URLinfo[2].split("/");
            String PortNumber = Portinfo[0];

            rt.exec("cmd.exe /c start cmd.exe /k \"appium -a 127.0.0.1 -p 4723\"");

            pause(3000);
            this.selectPlatform();

        }
        catch (Exception e)
        {
            Narrator.logError("Failed to start server - " + e.getMessage());
        }

        return true;
    }

    public boolean isDriverRunning()
    {
        return _isDriverRunning;
    }

    public void selectPlatform()
    {
        switch (currentPlatform)
        {
            case Android:
                Driver = (AndroidDriver) setCapabilitiesWithApk();
                _isDriverRunning = true;
                break;
            case iOS:
                Driver = (AndroidDriver) setCapabilitiesWithIpa();
                _isDriverRunning = true;
                break;
        }
        retrievedTestValues = new RetrievedTestValues();
    }

    public void Reset()
    {
        try
        {

            Runtime close = Runtime.getRuntime();
            close.exec("taskkill /IM cmd.exe");
        }
        catch (Exception e)
        {
            Narrator.logError("Error restarting the driver - " + e.getMessage());
            this.DriverExceptionDetail = e.getMessage();
        }

    }

    public void shutDown()
    {
        retrievedTestValues = null;
        try
        {
            Runtime close = Runtime.getRuntime();
            Driver.quit();
            close.exec("taskkill /IM cmd.exe");

        }
        catch (Exception e)
        {
            Narrator.logError("Error shutting down driver - " + e.getMessage());
            this.DriverExceptionDetail = e.getMessage();
        }
        _isDriverRunning = false;
    }

    public String get(final String url)
    {
        Driver.get(url);
        return Driver.getPageSource();

    }

    public boolean elementGestureTest(String Id)
    {
        //SikuliDriverInstance.Desktop.find(SikuliDriverInstance.ScreenshotDirectory + ImageFilePath).sw;
        MobileElement e = (MobileElement) Driver.findElementById(Id);

        //SikuliDriverInstance.Desktop.find(SikuliDriverInstance.ScreenshotDirectory + ImageFilePath);
        e.swipe(io.appium.java_client.SwipeElementDirection.UP, 2000);
        e.swipe(io.appium.java_client.SwipeElementDirection.DOWN, 2000);
        return true;
    }
    public void Swipe(int startX, int startY, int endX, int endY, int duration) throws IOException 
    {
        System.out.println("[INFO] Scrolling from (" +startX+","+startY+") to ("+endX+","+endY+")");
        AppiumDriverUtility.Driver.swipe(startX,startY,endX,endY,duration);     
    }
    public void VerticalScrollFromEdge(String dir) throws IOException 
    {
        Dimension dimensions = AppiumDriverUtility.Driver.manage().window().getSize();
        System.out.println("[INFO] Scrolling vertically from edge "+dir);
        System.out.println("Size of screen= " +dimensions);
        if(dir.contains("Down"))
        {
            int Startpoint = (int) (dimensions.getHeight()*0.99);
            System.out.println("Size of scrollStart= " +Startpoint);
            int scrollEnd = (int) (dimensions.getHeight() * 0.2);
            System.out.println("Size of cscrollEnd= " + scrollEnd);
            AppiumDriverUtility.Driver.swipe((int)(dimensions.getWidth()*0.5), Startpoint,(int)(dimensions.getWidth()*0.5),scrollEnd,1000);     
        }
        else if(dir.contains("Up"))
        {
            int Startpoint = (int) (dimensions.getHeight() * 0.01);
            System.out.println("Size of scrollStart= " +Startpoint);
            int scrollEnd = (int) (dimensions.getHeight() * 0.99);
            System.out.println("Size of cscrollEnd= " + scrollEnd);
            AppiumDriverUtility.Driver.swipe((int)(dimensions.getWidth()*0.5), Startpoint,(int)(dimensions.getWidth()*0.5),scrollEnd,1000); 
        }
        else
        {
            System.out.println("No direction specified");
        }

    }
    public void VerticalScrollFromCenter(String dir) throws IOException 
    {
        Dimension dimensions = AppiumDriverUtility.Driver.manage().window().getSize();
        System.out.println("[INFO] Scrolling vertically from center "+dir);
        System.out.println("Size of screen= " +dimensions);
        if(dir.contains("Down"))
        {
            int Startpoint = (int) (dimensions.getHeight() * 0.5);
            System.out.println("Size of scrollStart= " +Startpoint);
            int scrollEnd = (int) (dimensions.getHeight() * 0.2);
            System.out.println("Size of cscrollEnd= " + scrollEnd);
            AppiumDriverUtility.Driver.swipe(0, Startpoint,0,scrollEnd,1000);     
        }
        else if(dir.contains("Up"))
        {
            int Startpoint = (int) (dimensions.getHeight() * 0.2);
            System.out.println("Size of scrollStart= " +Startpoint);
            int scrollEnd = (int) (dimensions.getHeight() * 0.5);
            System.out.println("Size of cscrollEnd= " + scrollEnd);
            AppiumDriverUtility.Driver.swipe(0, Startpoint,0,scrollEnd,1000); 
        }
        else
        {
            System.out.println("No direction specified");
        }

    }
    public void HorizontalScrollFromCenter(String dir) throws IOException 
    {
        Dimension dimensions = AppiumDriverUtility.Driver.manage().window().getSize();
        System.out.println("Size of screen= " +dimensions);
        int width =dimensions.getWidth();
        int height =dimensions.getHeight();
        System.out.println("[INFO] Scrolling horizontally from center "+dir);
        if(dir.contains("Right"))
        {
            int Startpoint = (int) (width * 0.5);
            System.out.println("Size of scrollStart= " +Startpoint);
            int scrollEnd = (int) (width * 0.9);
            System.out.println("Size of cscrollEnd= " + scrollEnd);
            AppiumDriverUtility.Driver.swipe(0, Startpoint,scrollEnd,Startpoint,1000);      
        }
        else if(dir.contains("Left"))
        {
            int Startpoint = (int) (width * 0.5);
            System.out.println("Size of scrollStart= " +Startpoint);
            int scrollEnd = (int) (width * 0.1);
            System.out.println("Size of cscrollEnd= " + scrollEnd);
            AppiumDriverUtility.Driver.swipe(0, Startpoint,scrollEnd,Startpoint,1000); 
        }
        else
        {
            System.out.println("No direction specified");
        }
    }
    public void HorizontalScrollFromEdge(String dir) throws IOException 
    {
        Dimension dimensions = AppiumDriverUtility.Driver.manage().window().getSize();
        System.out.println("Size of screen= " +dimensions);
        System.out.println("[INFO] Scrolling horizontally from edge "+dir);
        if(dir.contains("Right"))
        {
            int Startpoint = (int) (dimensions.getWidth() * 0.01);
            System.out.println("Size of scrollStart= " +Startpoint);
            int scrollEnd = (int) (dimensions.getWidth() * 0.9);
            System.out.println("Size of cscrollEnd= " + scrollEnd);
            AppiumDriverUtility.Driver.swipe(Startpoint, (int)(dimensions.getHeight()*0.5),scrollEnd,(int)(dimensions.getHeight()*0.5),1000);      
        }
        else if(dir.contains("Left"))
        {
            int Startpoint = (int) (dimensions.getWidth()*0.99);
            System.out.println("Size of scrollStart= " +Startpoint);
            int scrollEnd = (int) (dimensions.getWidth() * 0.1);
            System.out.println("Size of cscrollEnd= " + scrollEnd);
            AppiumDriverUtility.Driver.swipe(Startpoint, (int)(dimensions.getHeight()*0.5),scrollEnd,(int)(dimensions.getHeight()*0.5),1000);     
        }
        else
        {
            System.out.println("No direction specified");
        }
    }
    public boolean verifyIfScreenIsLoaded(String xpath, String verificationText)
    {
        try
        {
            String actionBarTitle = Driver.findElement(By.xpath(xpath)).getText();
            if (actionBarTitle.toUpperCase().trim().equals(verificationText.toUpperCase().trim()))
            {
                Narrator.logDebug("Verification text found...Screen loaded successfully");
                return true;
            }
            else
            {
                Narrator.logError("Could not find verification text - ");
                return false;
            }

        }
        catch (Exception e)
        {
            Narrator.logError("Could not find verification text - " + e.getMessage());
            return false;
        }
    }

    public boolean switchToFrameByXpath(String xpath)
    {
        int waitCount = 0;
        try
        {
            while (waitCount < ApplicationConfig.WaitTimeout())
            {
                try
                {
                    Driver.switchTo().frame(xpath);
                    return true;
                }
                catch (Exception e)
                {
                    Thread.sleep(500);
                    waitCount++;
                }
            }
            return false;
        }
        catch (Exception e)
        {
            Narrator.logError("Error switching to frame by Xpath - " + e.getMessage());
            this.DriverExceptionDetail = e.getMessage();
            return false;
        }
    }

    public boolean switchToLastDuplicateFrameByXpath(String Xpath)
    {
        int waitCount = 0;
        try
        {
            this.switchToDefaultContent();
            while (waitCount < ApplicationConfig.WaitTimeout())
            {
                try
                {
                    List<WebElement> iframes = Driver.findElements(By.xpath(Xpath));

                    Driver.switchTo().frame((WebElement) iframes.toArray()[iframes.size() - 1]);
                    return true;
                }
                catch (Exception e)
                {
                    Thread.sleep(500);
                    waitCount++;
                }
            }
            return false;
        }
        catch (Exception e)
        {
            Narrator.logError("Error switching to last duplicate frame by Xpath - " + e.getMessage());
            this.DriverExceptionDetail = e.getMessage();
            return false;
        }
    }

    public boolean switchToDefaultContent()
    {
        try
        {
            Driver.switchTo().defaultContent();
            return true;
        }
        catch (Exception e)
        {
            Narrator.logError("Error switching to default content  - " + e.getMessage());
            this.DriverExceptionDetail = e.getMessage();
            return false;
        }
    }

    public boolean moveToElementByXpath(String Xpath)
    {
        try
        {
            Actions moveTo = new Actions(Driver);
            moveTo.moveToElement(Driver.findElement(By.xpath(Xpath)));
            moveTo.perform();
            return true;
        }
        catch (Exception e)
        {
            Narrator.logError("Error moving to element - " + Xpath + " - " + e.getStackTrace());
            this.DriverExceptionDetail = e.getMessage();
            return false;
        }
    }

    public boolean switchToDefaultContentWhenElementNoLongerVisible(String previousFrameXpath)
    {
        try
        {
            waitForElementNoLongerPresentByXpath(previousFrameXpath);
            Driver.switchTo().defaultContent();
            System.out.println("Successfully switched to default content, current frame handle = " + Driver.getWindowHandle() + ", previous frameId - " + previousFrameXpath);
            return true;
        }
        catch (Exception e)
        {
            Narrator.logError("Error switching to default content when element is no longer visible - " + e.getMessage());
            this.DriverExceptionDetail = e.getMessage();
            return false;
        }
    }
    public boolean waitForElementById(String elementId) {
        boolean elementFound = false;
        System.out.println("[INFO] Waiting for element by id: "+elementId);
        try {
            int waitCount = 0;
            while (!elementFound && waitCount < ApplicationConfig.WaitTimeout()) {
                try {
                    WebDriverWait wait = new WebDriverWait(Driver, 1);
                    if (wait.until(ExpectedConditions.presenceOfElementLocated(By.id(elementId))) != null) {

                        elementFound = true;
                        break;
                    }
                } catch (Exception e) {
                    elementFound = false;
                }
                waitCount++;
            }
        } catch (Exception e) {
            System.err.println("Error waiting for element by ID  - " + e.getMessage());
            this.DriverExceptionDetail = e.getMessage();
        }
        return elementFound;
    }
    public boolean waitForElementNoLongerPresentByXpath(String elementXpath)
    {
        boolean elementFound = true;
        System.out.println("[INFO] Waiting for element to no longer be present by xpath: "+elementXpath);
        try
        {
            int waitCount = 0;
            while (elementFound && waitCount < ApplicationConfig.WaitTimeout())
            {
                try
                {
                    WebDriverWait wait = new WebDriverWait(Driver, 1);
                    if (wait.until(ExpectedConditions.presenceOfElementLocated(By.id(elementXpath))) == null)
                    {
                        elementFound = false;
                        break;
                    }
                }
                catch (Exception e)
                {
                    this.DriverExceptionDetail = e.getMessage();
                    elementFound = false;
                    break;
                }

                waitCount++;
            }
        }
        catch (Exception e)
        {
            Narrator.logError(" waiting for element to be no longer present by ID  - " + e.getMessage());
            this.DriverExceptionDetail = e.getMessage();
        }
        return elementFound;
    }

    public boolean acceptAlertDialog()
    {
        int waitCount = 0;
        try
        {
            while (waitCount < ApplicationConfig.WaitTimeout())
            {
                try
                {
                    Driver.switchTo().alert().accept();
                    return true;
                }
                catch (Exception e)
                {
                    Thread.sleep(500);
                    waitCount++;
                }
            }
            return false;
        }
        catch (Exception e)
        {
            Narrator.logError("Error accepting alert dialog - " + e.getMessage());
            this.DriverExceptionDetail = e.getMessage();
            return false;
        }
    }

    public boolean selectByValueFromDropDownListUsingXpath(String Xpath, String valueToSelect)
    {
        System.out.println("[INFO] Attempting to select value: "+valueToSelect+" by xpath: "+Xpath);
        try
        {
            this.waitForElementByXpath(Xpath);
            Select dropDownList = new Select(Driver.findElement(By.xpath(Xpath)));
            dropDownList.selectByValue(valueToSelect);
            return true;
        }
        catch (Exception e)
        {
            Narrator.logError("Error selecting from dropdownlist by value using Name - " + e.getMessage());
            this.DriverExceptionDetail = e.getMessage();
            return false;
        }
    }

    public boolean selectByTextFromDropDownListUsingXpath(String Xpath, String Text)
    {
        System.out.println("[INFO] Attempting to select text: "+Text+" by xpath: "+Xpath);
        try
        {
            this.waitForElementByXpath(Xpath);
            Select dropDownList = new Select(Driver.findElement(By.xpath(Xpath)));
            dropDownList.selectByVisibleText(Text);
            return true;
        }
        catch (Exception e)
        {
            Narrator.logError("Error selecting from dropdownlist by text using name - " + e.getMessage());
            this.DriverExceptionDetail = e.getMessage();
            return false;
        }
    }

    public void waitUntilElementEnabledByXpath(String ElementXpath)
    {
        System.out.println("[INFO] Waiting for element to be enabled with xpath: "+ElementXpath);
        try
        {
            int counter = 0;
            boolean isEnabled = false;
            WebElement elementToWaitFor = Driver.findElement(By.xpath(ElementXpath));
            isEnabled = elementToWaitFor.isEnabled();
            while (!isEnabled && counter < 60)
            {
                counter++;
                Thread.sleep(500);
            }
        }
        catch (Exception e)
        {
            Narrator.logError("Error waiting for element to be enabled - " + e.getMessage());
        }

    }
  
    public void clickDeviceHomeButton()
    {
        try
        {
            ((AndroidDriver)Driver).pressKeyCode(AndroidKeyCode.HOME);
            System.out.println("[INFO] Clicking home button");
        }
        catch (Exception e)
        {
            Narrator.logError("Failed to click device 'Home' button - " + e.getMessage());
        }

    }
    public void clickDeviceBackButton()
    {
        try
        {
            ((AndroidDriver)Driver).pressKeyCode(AndroidKeyCode.BACK);
            System.out.println("[INFO] Clicking back button");
        }
        catch (Exception e)
        {
            Narrator.logError("Failed to click device 'Back' button - " + e.getMessage());
        }

    }
    public void clickDeviceRecentAppsButton()
    {
        try
        {
            ((AndroidDriver)Driver).pressKeyCode(AndroidKeyCode.KEYCODE_APP_SWITCH);
            System.out.println("[INFO] Clicking recent apps button");
        }
        catch (Exception e)
        {
            Narrator.logError("Failed to click device 'Recent Apps' button - " + e.getMessage());
        }

    }

    public boolean checkBoxSelectionByXpath(String elementXpath, boolean mustBeSelected)
    {
        System.out.println("[INFO] Attempting to checkbox selection with xpath: "+elementXpath);
        try
        {
            Thread.sleep(2000);
            this.waitForElementByXpath(elementXpath);
            this.waitUntilElementEnabledByXpath(elementXpath);
            WebDriverWait wait = new WebDriverWait(Driver, 60);
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath(elementXpath)));
            WebElement checkBox = Driver.findElement(By.xpath(elementXpath));
            if (checkBox.isSelected() != mustBeSelected)
            {
                checkBox.click();
            }
            return true;
        }
        catch (Exception e)
        {
            Narrator.logError("Error selecting checkbox by Xpath - " + e.getMessage());
            this.DriverExceptionDetail = e.getMessage();
            return false;
        }
    }

    public boolean navigateToPreviousScreen()
    {
        try
        {
            Driver.navigate().back();
            System.out.println("[INFO] Navigating to previous screen");
            return true;
        }
        catch (Exception e)
        {
            Narrator.logError("Failed to navigate to the previous screen - " + e.getMessage());
            return false;
        }

    }

    public boolean validateElementTextValueByXpath(String elementXpath, String elementText)
    {
        System.out.println("[INFO] Attempting to validate text with xpath: "+elementXpath+" contains "+elementText);
        try
        {
            if (waitForElementByXpath(elementXpath))
            {
                WebElement elementToValidate = Driver.findElement(By.xpath(elementXpath));
                String textDetected = elementToValidate.getText();
                if (textDetected.contains(elementText))
                {
                    System.out.println("[INFO] Text validated");
                    return true;
                }
                else
                {
                    return false;
                }
            }
            else
            {
                System.out.println("[INFO] Text not validated");
                return false;
            }
        }
        catch (Exception e)
        {
            Narrator.logError("Error validating element text value by Xpath - " + e.getMessage());
            this.DriverExceptionDetail = e.getMessage();
            return false;
        }
    }

    public void WaitUntilDropDownListPopulatedByXpath(String elementXpath)
    {

        try
        {
            this.waitForElementByXpath(elementXpath);
            int waitCount = 0;
            List<WebElement> optionsList;
            while (waitCount < ApplicationConfig.WaitTimeout())
            {
                try
                {
                    Select dropDownList = new Select(Driver.findElement(By.xpath(elementXpath)));
                    optionsList = dropDownList.getOptions();
                    if (optionsList.size() > 0)
                    {
                        break;
                    }
                }
                catch (Exception e)
                {

                }
                Thread.sleep(500);
                waitCount++;
            }
        }
        catch (Exception e)
        {
            Narrator.logError("Error waiting for dropdownlist to be populated by Xpath - " + e.getMessage());
            this.DriverExceptionDetail = e.getMessage();
        }
    }

    public boolean clickElementbyXpath(String elementXpath)
    {
        try
        {
            waitForElementByXpath(elementXpath);
            WebDriverWait wait = new WebDriverWait(Driver, 60);
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath(elementXpath)));
            WebElement elementToClick = Driver.findElement(By.xpath(elementXpath));
            elementToClick.click();
            System.out.println("[INFO] Clicking element with xpath: "+elementXpath);
            return true;
        }
        catch (Exception e)
        {
            Narrator.logError("Error clicking element by Xpath - " + e.getMessage());
            this.DriverExceptionDetail = e.getMessage();
            return false;
        }
    }
    public boolean clickElementbyXpathException(String elementXpath)
    {
        try
        {
            waitForElementByXpath(elementXpath);
            WebDriverWait wait = new WebDriverWait(Driver, 60);
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath(elementXpath)));
            WebElement elementToClick = Driver.findElement(By.xpath(elementXpath));
            elementToClick.click();
            System.out.println("[INFO] Clicking element with xpath: "+elementXpath);
            return true;
        }
        catch (Exception e)
        {
            Narrator.logError("Error clicking element by Xpath - " + e.getMessage());
            this.DriverExceptionDetail = e.getMessage();
            throw e;
        }
    }
    public boolean clickElementbyId(String elementId)
    {
        try
        {
            waitForElementById(elementId);
            WebDriverWait wait = new WebDriverWait(Driver, 60);
            wait.until(ExpectedConditions.elementToBeClickable(By.id(elementId)));
            WebElement elementToClick = Driver.findElement(By.id(elementId));
            elementToClick.click();
            System.out.println("[INFO] Clicking element with id: "+elementId);
            return true;
        }
        catch (Exception e)
        {
            Narrator.logError("Error clicking element by Xpath - " + e.getMessage());
            this.DriverExceptionDetail = e.getMessage();
            return false;
        }
    }

    public boolean enterTextByXpath(String elementXPath, String textToEnter)
    {
        System.out.println("[INFO] Entering text "+textToEnter+" into element with xpath: "+elementXPath);
        try
        {
            this.waitForElementByXpath(elementXPath);
            WebElement elementToTypeIn = Driver.findElement(By.xpath(elementXPath));
            elementToTypeIn.sendKeys(textToEnter);

            return true;
        }
        catch (Exception e)
        {
            System.err.println("Error entering text - " + elementXPath + " - " + e.getMessage());
            this.DriverExceptionDetail = e.getMessage();
            return false;
        }
    }
    public boolean enterTextById(String elementId, String textToEnter)
    {
        System.out.println("[INFO] Entering text "+textToEnter+" into element with id: "+elementId);
        try
        {
            this.waitForElementById(elementId);
            WebElement elementToTypeIn = Driver.findElement(By.id(elementId));
            elementToTypeIn.sendKeys(textToEnter);

            return true;
        }
        catch (Exception e)
        {
            System.err.println("Error entering text - " + elementId + " - " + e.getMessage());
            this.DriverExceptionDetail = e.getMessage();
            return false;
        }
    }

    public boolean waitForElementByXpath(String elementXpath)
    {
        System.out.println("[INFO] Waiting for element with xpath: "+elementXpath);
        boolean elementFound = false;
        try
        {
            int waitCount = 0;
            while (!elementFound && waitCount < ApplicationConfig.WaitTimeout())
            {
                try
                {
                    WebDriverWait wait = new WebDriverWait(Driver, 1);
                    if (wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(elementXpath))) != null)
                    {
                        elementFound = true;
                        System.out.println("[INFO] Element found");
                        break;
                    }
                }
                catch (Exception e)
                {
                    elementFound = false;
                }
                //Thread.sleep(500);
                waitCount++;
            }

        }
        catch (Exception e)
        {
            Narrator.logError(" waiting for element by Xpath '" + elementXpath + "' - " + e.getMessage());
            this.DriverExceptionDetail = e.getMessage();
        }
        return elementFound;
    }
    


    public void pause(int milisecondsToWait)
    {
        try
        {
            Thread.sleep(milisecondsToWait);
        }
        catch (Exception e)
        {

        }
    }

    public void takeScreenShot(String screenShotDescription, boolean isError)
    {
        String imageFilePathString = "";

        if (testCaseId == null)
        {
            return;
        }

        try
        {
            StringBuilder imageFilePathBuilder = new StringBuilder();
            // add date time folder and test case id folder
            imageFilePathBuilder.append(this.reportDirectory + "\\");

            relativeScreenShotPath = testCaseId.replace("#","") + "\\";

            if (isError)
            {
                relativeScreenShotPath += "F_";
            }
            else
            {
                relativeScreenShotPath += "P_";
            }

            relativeScreenShotPath += formatMessage(screenShotDescription) + ".png";

            imageFilePathBuilder.append(relativeScreenShotPath);

            //imageFilePathBuilder.append(this.generateDateTimeString() + ".png");
            imageFilePathString = imageFilePathBuilder.toString();

            setScreenshotPath(imageFilePathString);

            File screenShot = ((TakesScreenshot) Driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenShot, new File(imageFilePathString.toString()));
            
            if(!isError)
            narrator.stepPassedUseExistingScreenshot(screenShotDescription);
            
        }
        catch (Exception e)
        {
            System.err.println(" could not take screenshot - " + imageFilePathString.toString() + " - " + e.getMessage());
        }
    }

    public String generateDateTimeString()
    {
        Date dateNow = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd_hh-mm-ss");

        return dateFormat.format(dateNow).toString();
    }
    
    public void CloseChromeInstances() throws IOException
    {
        if (browserType.equals(Enums.BrowserType.Chrome))
        {
            String TASKLIST = "tasklist";
            String KILL = "taskkill /IM ";
            String line;
            String serviceName = "chrome.exe";
            Process p = Runtime.getRuntime().exec(TASKLIST);
            BufferedReader reader = new BufferedReader(new InputStreamReader(
                    p.getInputStream()));
            Narrator.logDebug("Closing Chrome tasks...");
            while ((line = reader.readLine()) != null)
            {

                if (line.contains(serviceName))
                {
                    Runtime.getRuntime().exec(KILL + serviceName);
                }
            }
        }
    }

    public boolean TabAndEnterText(String textToEnter)
    {
        try
        {
            Actions action = new Actions(Driver);
            action.sendKeys(Key.TAB, textToEnter);
            action.perform();
            return true;

        }
        catch (Exception e)
        {
            Narrator.logError(" Failed to Tab " + e.getMessage());
            this.DriverExceptionDetail = e.getMessage();
            return false;
        }
    }

    public String retrieveTextByXpath(String xpath)
    {
        System.out.println("[INFO] Attempting to retrieve text from element with xpath: "+xpath);
        String retrievedText = "";
        try
        {
            waitForElementByXpath(xpath);
            WebElement elementToRead = Driver.findElement(By.xpath(xpath));
            retrievedText = elementToRead.getText();
            System.out.println("[INFO] Text found");
            return retrievedText;
        }
        catch (Exception e)
        {
            System.err.println("Error reading text from element - " + e.getMessage());
            this.DriverExceptionDetail = e.getMessage();
            return retrievedText;
        }
    }

    public boolean RunActivity(String Package, String Activity)
    {
        try
        {
            Driver.startActivity(Package, Activity);
            return true;
        }
        catch (Exception e)
        {
            Narrator.logError("Failed to run activity, error - " + e.getMessage());
            return false;
        }

    }

    public boolean SetOrientationPortrait()
    {
        try
        {
            ScreenOrientation orientation = Driver.getOrientation();
            if (orientation.value().equals(ScreenOrientation.PORTRAIT))
            {
                narrator.logDebug("Tried to change orientation to Portrait, but Orientation already was Portrait.");
                return true;
            }
            else
            {
                Driver.rotate(ScreenOrientation.PORTRAIT);
                narrator.logDebug("Screen orientation set to portrait.");
                return true;
            }
        }
        catch (Exception e)
        {
            narrator.logError("Failed to change screen orientation to Portrait.");
            return false;
        }
    }

    public boolean SetOrientationLandscape()
    {
        try
        {
            ScreenOrientation orientation = Driver.getOrientation();
            if (orientation.value().equals(ScreenOrientation.LANDSCAPE))
            {
                narrator.logDebug("Tried to change orientation to Landscape, but Orientation already was Landscape.");
                return true;
            }
            else
            {
                Driver.rotate(ScreenOrientation.PORTRAIT);
                narrator.logDebug("Screen orientation set to Landscape.");
                return true;
            }
        }
        catch (Exception e)
        {
            narrator.logError("Failed to change screen orientation to Landscape.");
            return false;
        }
    }
    
    public boolean isElementEnabled(String elementXpath)
    {
        waitForElementByXpath(elementXpath);
        
        WebElement element = Driver.findElement(By.xpath(elementXpath));
        
        boolean t = element.isEnabled();
        System.out.println("[INFO] Element: "+elementXpath+" enabled? "+t);
        return t;
    }
    
    public boolean tapElementByXpath(String elementXpath)
    {
        try
        {
            waitForElementByXpath(elementXpath);
            
            MobileElement elementTap = (MobileElement)Driver.findElement(By.xpath(elementXpath));
            
            elementTap.tap(1, 1);
        }
        catch(Exception ex)
        {
            Narrator.logError("Failed to tap on the supplied element.");
            Narrator.logError(ex.getMessage());
            return false;
        }
        
        return true;
    }
    
    public boolean waitForInvisibilityOfElementByXpath(String elementXpath, Integer timeout)
    {
        boolean elementFound = false;
        System.out.println("[INFO] Waiting for invisibility of element with xpath: "+elementXpath);
        try {
            int waitCount = 0;
            while (!elementFound && waitCount < timeout) 
            {
                try 
                {
                    WebDriverWait wait = new WebDriverWait(Driver, 1);
                    if (wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(elementXpath))) != null) 
                    {
                        elementFound = true;
                        break;
                    }
                }
                catch (Exception e) 
                {
                    elementFound = false;
                }
                waitCount++;
            }

        }
        catch (Exception e)
        {
            System.err.println("[Error] waiting for element by Xpath '" + elementXpath + "' - " + e.getMessage());
            this.DriverExceptionDetail = e.getMessage();
        }
        return elementFound;
    }
}
