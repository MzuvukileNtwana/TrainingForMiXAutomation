/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package KeywordDrivenTestFramework.Utilities;

import KeywordDrivenTestFramework.Core.BaseClass;
import static KeywordDrivenTestFramework.Core.BaseClass.testCaseId;
import KeywordDrivenTestFramework.Entities.Enums;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.sikuli.basics.Settings;
import org.sikuli.script.Button;
import static org.sikuli.script.Button.WHEEL_UP;
import org.sikuli.script.Key;
import org.sikuli.script.Pattern;
import org.sikuli.script.Region;
import org.sikuli.script.Screen;
import org.sikuli.script.ScreenImage;

/**
 *
 * @author Ferdinand
 */
public class SikuliDriverUtility extends BaseClass 
{
    public Screen Desktop;
    
    public Region ScreenRegion;
    
    public String ScreenshotDirectory;
    
    Process seeTestManual;
    
    private Boolean _isDriverRunning = false;
    
    public SikuliDriverUtility(String screenShotDir)
    {
        this.Desktop = new Screen();
        this.ScreenshotDirectory = screenShotDir;
        Settings.OcrTextSearch = true;
        Settings.OcrTextRead = true;
        Settings.ObserveScanRate = (float) 7.5;
        _isDriverRunning = true;
      
       /* Settings.ObserveScanRate = 2;
        Settings.ObserveMinChangedPixels = 5;*/

    }
    
     public boolean isDriverRunning() {
        return _isDriverRunning;
    }
    
    //<editor-fold defaultstate="collapsed" desc="See Test Manual Scripts">
    
    public boolean openSeeTest()
    {
        try
        {
            Desktop = new Screen();
            
            String seeTestExecutablePath = ApplicationConfig.SeeTestExecutablePath();
            this.seeTestManual = Runtime.getRuntime().exec(seeTestExecutablePath);
            
            if(!this.WaitForElementToAppear("SeeTestManualWindowTitle.PNG"))
            {
                System.err.println("Error opening application - SeeTestManual - could not verify dialog window title");
                return false;
            }
            
            return true;
        }
        catch(Exception e)
        {
            System.err.println("Error opening application - SeeTestManual - please make sure that the application is installed and that the path is correclty set in the appConfig " + e.getMessage());
            return false;
        }
    }
    
    
    public boolean openDevice(String deviceListingRow, String deviceWindowTitle)
    {
        try
        {
            if(this.WaitForElementToAppearAdjacentTo(deviceListingRow, "deviceOfflineStatus.png", Enums.RelativePosition.Right))
            {
                System.err.println("Device disconnected - please connect device and confirm connection before running the test");
                return false;
            }
            
            
            
            if(!this.WaitForElementToAppearAdjacentTo(deviceListingRow,"ReadyStatus.png" ,Enums.RelativePosition.Right))
            {
                System.err.println("Device not ready for connection - please connect device and confirm connection before running the test");
                return false;
            }
            
            this.MouseClickElement(deviceListingRow);
            
            this.MouseClickElement("OpenDeviceIcon.png");
            
            this.WaitForElementToAppear(deviceWindowTitle);

            return true;
        }
        catch(Exception e)
        {
            System.err.println("Error opening device, check connection - " + e.getMessage());
            return false;
        }
    
    }
    
    public boolean verifyElementPresent(String elementImagePath, int timeOutInMiliseconds)
     {
         try
         { 
            this.ScreenRegion = Desktop.wait(elementImagePath, timeOutInMiliseconds);
            
            if(this.ScreenRegion != null)
            {
                this.ScreenRegion.highlight(1);
                return true;
            }
            else
            { 
                System.out.println("[Info] Element not present - " + elementImagePath);
                return false;
            }
         }
         catch(Exception e)
         {
             System.err.println("Error verifying element present - " + elementImagePath + " - Error - " + e.getMessage());
             return false;
         }
     }   
      
    public boolean exitSeeTest()
    {
        try
        {        
            this.seeTestManual.destroy();
            
            return true;
        }
        catch(Exception e)
        {
            System.err.println("Error closing application - SeeTest Manual - " + e.getMessage());
            return false;
        }
    
    }
    
    
    //</editor-fold>
    
    public void setScreenshotDirectory(String screenShotDir)
    {
        this.ScreenshotDirectory = screenShotDir;
    }
    
    public boolean MouseClickElement(String ImageFilePath)
    {
        try
        {
            if(this.WaitForElementToAppear(ImageFilePath))
            {
                
                this.Desktop.find(this.ScreenshotDirectory + ImageFilePath).click();

                return true;
            }
            else
                return false;     
        }
        catch(Exception e)
        {
            
            System.err.println("[Error] Failed to click element, image: {" + ImageFilePath + "}, error :" + e.getMessage());
            return false;
        }
    }
    
    
    
    public boolean MoveToElement(String ImageFilePath)
    {
        try
        {
            if(this.WaitForElementToAppear(ImageFilePath))
            {
                
                this.Desktop.find(this.ScreenshotDirectory + ImageFilePath).hover();

                return true;
            }
            else
                return false;     
        }
        catch(Exception e)
        {
            
            System.err.println("[Error] Failed to click element, image: {" + ImageFilePath + "}, error :" + e.getMessage());
            return false;
        }
    }
    
    public boolean MouseClickElementNoException(String ImageFilePath)
    {
        try
        {
            if(this.WaitForElementToAppear(ImageFilePath))
            {
                
                this.Desktop.find(this.ScreenshotDirectory + ImageFilePath).click();

                return true;
            }
            else
                return false;     
        }
        catch(Exception e)
        {
            return false;
        }
    }

    
    public boolean MouseDoubleClickElement(String ImageFilePath)
    {
        try
        {
            if(this.WaitForElementToAppear(ImageFilePath))
            {          
                this.Desktop.find(this.ScreenshotDirectory + ImageFilePath).highlight(1).doubleClick();
                return true;
            }
            else
                return false;     
        }
        catch(Exception e)
        {
            
            System.err.println("[Error] Failed to double click element, image: {" + ImageFilePath + "}, error :" + e.getMessage());
            return false;
        }
    }
    ////
    
    public boolean MouseDragWithDelay(String anchorPoint,int offset, Enums.RelativePosition relation) 
    {
        try
        {
            
            Region anchorPointRegion = this.Desktop.wait(this.ScreenshotDirectory + anchorPoint, ApplicationConfig.WaitTimeout()).highlight(1);
            
            if(anchorPointRegion == null)
                return false;
            
            
            switch(relation)
            {
                case Above:
                {
                    
                    float defaultsSettings = Settings.MoveMouseDelay;
                    anchorPointRegion.mouseMove(anchorPointRegion.above(offset));
                    anchorPointRegion.mouseDown(Button.LEFT);
                    Settings.MoveMouseDelay = 3;
                    anchorPointRegion.mouseMove(anchorPointRegion.below(offset));
                    anchorPointRegion.mouseUp(Button.LEFT);
                    Settings.MoveMouseDelay = defaultsSettings;
                    return true;
                }
                case Below:
                {
                    
                    float defaultsSettings = Settings.MoveMouseDelay;
                    anchorPointRegion.mouseMove(anchorPointRegion.below(offset));
                    anchorPointRegion.mouseDown(Button.LEFT);
                    Settings.MoveMouseDelay = 3;
                    anchorPointRegion.mouseMove(anchorPointRegion.above(offset));
                    anchorPointRegion.mouseUp(Button.LEFT);
                    Settings.MoveMouseDelay = defaultsSettings;
                    return true;
                    
                    
                }
                case Right:
                {
                    
                    float defaultsSettings = Settings.MoveMouseDelay;
                    anchorPointRegion.mouseMove(anchorPointRegion.right(offset));
                    anchorPointRegion.mouseDown(Button.LEFT);
                    Settings.MoveMouseDelay = 3;
                    anchorPointRegion.mouseMove(anchorPointRegion.left(offset));
                    anchorPointRegion.mouseUp(Button.LEFT);
                    Settings.MoveMouseDelay = defaultsSettings;
                    return true;
                }
                case Left:
                {
                    
                    float defaultsSettings = Settings.MoveMouseDelay;
                    anchorPointRegion.click(anchorPointRegion.left(offset));
                    anchorPointRegion.mouseDown(Button.LEFT);
                    Settings.MoveMouseDelay = 3;
                    anchorPointRegion.mouseMove(anchorPointRegion.left(offset));
                    anchorPointRegion.mouseUp(Button.LEFT);
                    Settings.MoveMouseDelay = defaultsSettings;
                    return true;
                    
                }
            }
            return false;   
        }
        catch(Exception e)
        {
            
            System.err.println("[Error] Failed to click element, image: {" + anchorPoint + "}, error :" + e.getMessage());
            return false;
        }
        
        
    }
    
    public boolean MouseMove(String anchorPoint,int offset,int moveTo, Enums.RelativePosition relation) 
    {
        try
        {
            Region anchorPointRegion = this.Desktop.wait(this.ScreenshotDirectory + anchorPoint, ApplicationConfig.WaitTimeout()).highlight(1);
           
            
            if(anchorPointRegion == null)
                return false;
            
            switch(relation)
            {
                case Above:
                {
                    
                    float defaultsSettings = Settings.MoveMouseDelay;
                    anchorPointRegion.mouseMove(anchorPointRegion.above(offset));
                    anchorPointRegion.mouseDown(Button.LEFT);
                    Settings.MoveMouseDelay = 3;
                    Desktop.mouseMove(anchorPointRegion.right(moveTo));
                    anchorPointRegion.mouseUp(Button.LEFT);
                    Settings.MoveMouseDelay = defaultsSettings;
                    return true;
                }
                
                case Below:
                {
                    
                    float defaultsSettings = Settings.MoveMouseDelay;
                    anchorPointRegion.mouseMove(anchorPointRegion.below(offset));
                    anchorPointRegion.mouseDown(Button.LEFT);
                    Settings.MoveMouseDelay = 3;
                    Desktop.mouseMove(anchorPointRegion.right(moveTo));
                    anchorPointRegion.mouseUp(Button.LEFT);
                    Settings.MoveMouseDelay = defaultsSettings;
                    return true;
                    
                    
                    
                }
                case Right:
                {
                    
                    float defaultsSettings = Settings.MoveMouseDelay;
                    anchorPointRegion.mouseMove(anchorPointRegion.right(offset));
                    anchorPointRegion.mouseDown(Button.LEFT);
                    Settings.MoveMouseDelay = 3;
                    Desktop.mouseMove(anchorPointRegion.right(moveTo));
                    anchorPointRegion.mouseUp(Button.LEFT);
                    Settings.MoveMouseDelay = defaultsSettings;
                    return true;
                }
                case Left:
                {
                    
                    float defaultsSettings = Settings.MoveMouseDelay;
                    anchorPointRegion.mouseMove(anchorPointRegion.left(offset));
                    anchorPointRegion.mouseDown(Button.LEFT);
                    Settings.MoveMouseDelay = 3;
                    Desktop.mouseMove(anchorPointRegion.right(moveTo));
                    anchorPointRegion.mouseUp(Button.LEFT);
                    Settings.MoveMouseDelay = defaultsSettings;
                    return true;
                    
                }
            }
            
            
            
    
            return false;   
        }
        catch(Exception e)
        {
            
            System.err.println("[Error] Failed to click element, image: {" + anchorPoint + "}, error :" + e.getMessage());
            return false;
        }
    
    }
    
    
    ///
    
    public boolean MouseTripleClickElement(String ImageFilePath, String regionFile, int x, int y) {
        try {

            Region otpRegion = this.Desktop.wait(this.ScreenshotDirectory + regionFile, 30).highlight(1);

            Pattern otpPattern = new Pattern(this.ScreenshotDirectory + ImageFilePath).targetOffset(x, y);

            otpRegion.above().find(otpPattern).highlight(1).click();

            otpRegion.above().find(otpPattern).mouseDown(Button.LEFT);
            otpRegion.above().find(otpPattern).mouseUp();

            otpRegion.above().find(otpPattern).mouseDown(Button.LEFT);
            otpRegion.above().find(otpPattern).mouseUp();

            return true;

        } catch (Exception e) {

            System.err.println("[Error] Failed to click element, image: {" + ImageFilePath + "}, error :" + e.getMessage());
            return false;
        }
    }
   
      
    
    public boolean WaitForEitherImageToAppear(String imageOne, String imageTwo) {
        boolean result = false;
        if(this.WaitForElementToAppearThrowsNoError(imageOne)){
            result = true;
        }
        else if(this.WaitForElementToAppearThrowsNoError(imageTwo)){
            result = true;
        }
        
        return result;
        
    }
    
    public boolean WaitSpecificTimeElementAppear(String ImageFilePath, int timeOut) {
        try {
            this.Desktop.wait(this.ScreenshotDirectory + ImageFilePath, timeOut).highlight(1);

            return true;
        } catch (Exception e) {
            System.err.println("[Error] Failed to find element on desktop, image: {" + ImageFilePath + "}, error :" + e.getMessage());
            return false;
        }
    }
    
    public boolean MouseRightClickElement(String ImageFilePath)
    {
        try
        {
            if(this.WaitForElementToAppear(ImageFilePath))
            {
                this.Desktop.find(this.ScreenshotDirectory + ImageFilePath).highlight(1).rightClick();
                return true;
            }
            else
                return false;     
        }
        catch(Exception e)
        {
            
            System.err.println("[Error] Failed to right click element, image: {" + ImageFilePath + "}, error :" + e.getMessage());
            return false;
        }
    }
    
    
    public boolean TypeTextAtElement(String ImageFilePath, String InputText)
    {
        try
        {
            if(this.WaitForElementToAppear(ImageFilePath))
            {
                this.Desktop.find(this.ScreenshotDirectory + ImageFilePath).type(InputText);
                return true;
            }
            else
                return false;     
        }
        catch(Exception e)
        {
            
            System.err.println("[Error] Failed to enter text at element, image: {" + ImageFilePath + "}, error :" + e.getMessage());
            return false;
        }
    }
    
    public boolean WaitForElementToAppear(String ImageFilePath)
    {
        try
        {
            this.Desktop.wait(this.ScreenshotDirectory + ImageFilePath, ApplicationConfig.WaitTimeout()).highlight(1);
    
            return true;
        }
        catch(Exception e)
        {
            System.err.println("[Error] Failed to find element on desktop, image: {" + ImageFilePath + "}, error :" + e.getMessage());
            return false;
        }
    }
    
    
    
    public String Readtextfromimage(String ImageFilePath, int position,Enums.RelativePosition relation)
    {
        String Retrievedtext = "";
        try
        {
            Region Anchorimage = this.Desktop.wait(this.ScreenshotDirectory + ImageFilePath).highlight(1);
            
           switch(relation)
            {
                case Above:
                {
                    Retrievedtext = Anchorimage.above(position).text();
                    return Retrievedtext;
                }
                case Below:
                {
                    Retrievedtext =  Anchorimage.below(position).text();
                    return Retrievedtext;
                }
                case Right:
                {
                    Retrievedtext =   Anchorimage.right(position).text();
                    return Retrievedtext;
                }
                case Left:
                {
                    Retrievedtext =   Anchorimage.left(position).text();
                    return Retrievedtext;
                }
            }
           
           return Retrievedtext;
        }
        catch(Exception e)
        {
            System.err.println("[Error] Failed to find element on desktop, image: {" + ImageFilePath + "}, error :" + e.getMessage());
            return e.getMessage();
        }
    }
    
    
    public String readTextFromActualImage(String ImageFilePath)
    {
        try
        {
            Region anchorimage = this.Desktop.wait(this.ScreenshotDirectory + ImageFilePath).highlight(1);
            
            return anchorimage.text();
        }
        catch(Exception e)
        {
            System.err.println("[Error] Failed to find element on desktop, image: {" + ImageFilePath + "}, error :" + e.getMessage());
            return e.getMessage();
        }
    }
    
    public void scrollUp()
    {
        try
        {          
            Desktop.wheel(WHEEL_UP, 10);
        }
        catch(Exception e)
        {
            System.err.println("[Error] Failed to scroll up " + e.getMessage());
        }
    }
    
    
    
    public void TakeScreenshot(String screenshotFileName, Boolean isError)
    {
        String imageFilePathString = "";
        
        if(testCaseId == null)
            return;

        try 
        {
            StringBuilder imageFilePathBuilder = new StringBuilder();
            // add date time folder and test case id folder
            imageFilePathBuilder.append(this.reportDirectory + "\\");
            
            relativeScreenShotPath = testCaseId.replace("#","") + "\\";

            if (isError) {
                relativeScreenShotPath += "F_";
            } else {
                relativeScreenShotPath += "P_";
            }
            
            relativeScreenShotPath += formatMessage(screenshotFileName) + ".png";

            imageFilePathBuilder.append(relativeScreenShotPath);

            //imageFilePathBuilder.append(this.generateDateTimeString() + ".png");
            imageFilePathString = imageFilePathBuilder.toString();
            
            setScreenshotPath(imageFilePathString);
        
            ScreenImage screenShot = this.Desktop.capture();

            FileUtils.copyFile(new File(screenShot.getFile()), new File(imageFilePathString.toString()));
            
            if(!isError)
            narrator.stepPassedUseExistingScreenshot(screenshotFileName);
            else
                narrator.testFailed(screenshotFileName);
        }
        catch(Exception e)
        {
            System.err.println(" could not take screenshot - " + imageFilePathString.toString() + " - " + e.getMessage());
        }
    }
    
    public String generateDateTimeString()
    {
      Date dateNow = new Date( );
      SimpleDateFormat dateFormat = new SimpleDateFormat ("yyyy-MM-dd_hh-mm-ss");
      
      return dateFormat.format(dateNow).toString();
    }
    public boolean copyToClipBoard()
    {
        try
        {
            this.Desktop.type("c", Key.C_CTRL);
    
            return true;
        }
        catch(Exception e)
        {
            System.err.println("[Error] Failed to copy content to clipboard via ctrl + C, error :" + e.getMessage());
            return false;
        }
    }
    
    public boolean pasteFromClipBoard()
    {
        
        try
        {
            this.Desktop.type("v", Key.C_CTRL);
    
            return true;
        }
        catch(Exception e)
        {
            System.err.println("[Error] Failed to paste content from clipboard via ctrl + V , error :" + e.getMessage());
            return false;
        }
    }
    
    public boolean setClipboardContents(String aString)
    {
        try
        {
            StringSelection stringSelection = new StringSelection(aString);
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(stringSelection , stringSelection);
    
            return true;
        }
        catch(Exception e)
        {
            System.err.println("[Error] Failed to clipboard contents , error :" + e.getMessage());
            return false;
        }
    }
    public String getClipboardContents() 
    {
      String result = "";
      Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
      //odd: the Object param of getContents is not currently used
      Transferable contents = clipboard.getContents(null);
      
      if (contents != null && contents.isDataFlavorSupported(DataFlavor.stringFlavor)) 
      {
        try 
        {
            
          result = (String)contents.getTransferData(DataFlavor.stringFlavor);
          
        }
        catch (Exception ex)
        {
          System.err.println("[ERROR] Failed to read from clipboard - " + ex);
        }
      }
      return result;
    }

    private boolean WaitForElementToAppearAdjacentTo(String anchorPoint, String adjacentImage, Enums.RelativePosition relation) 
    {
        try
        {
            Region anchorPointRegion = this.Desktop.wait(this.ScreenshotDirectory + anchorPoint, ApplicationConfig.WaitTimeout()).highlight(1);
            
            if(anchorPointRegion == null)
                return false;
            
            
            switch(relation)
            {
                case Above:
                {
                    anchorPointRegion.above().find(this.ScreenshotDirectory + adjacentImage).highlight(1);
                    return true;
                }
                case Below:
                {
                    anchorPointRegion.below().find(this.ScreenshotDirectory + adjacentImage).highlight(1);
                    return true;
                }
                case Right:
                {
                    anchorPointRegion.right().find(this.ScreenshotDirectory + adjacentImage).highlight(1);
                    return true;
                }
                case Left:
                {
                    anchorPointRegion.left().find(this.ScreenshotDirectory + adjacentImage).highlight(1);
                    return true;
                }
            }
            
    
            return false;
        }
        catch(Exception e)
        {
            System.err.println("[Error] Failed to find element on desktop, image: {" + adjacentImage + "} adjacent to: {" + anchorPoint + "}, error :" + e.getMessage());
            return false;
        }
    }
    
    public boolean WaitForElementToAppearThrowsNoError(String ImageFilePath) {
        try {
            this.Desktop.wait(this.ScreenshotDirectory + ImageFilePath, ApplicationConfig.WaitTimeout()).highlight(1);

            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean MouseClickHighlightedOrNormal(String normalPath, String highlightedPath) {
        try {
            if (this.WaitSpecificTimeElementAppear(normalPath, 5)) {

                this.Desktop.find(this.ScreenshotDirectory + normalPath).highlight(1).click();
                return true;

            } else if (this.WaitSpecificTimeElementAppear(highlightedPath, 5)) {

                this.Desktop.find(this.ScreenshotDirectory + highlightedPath).highlight(1).click();
                return true;

            }
            
            else{
                return false;
            }

        } catch (Exception e) {

            System.err.println("[Error] Failed to click element, image: {" + highlightedPath + "}, error :" + e.getMessage());
            return false;
        }

    }
    public boolean PressKey(String keytoPress) {
        try {
            
            this.Desktop.type(keytoPress);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean PressKeys(String keytoPress,String keytoPress2) {
        try {
            
            this.Desktop.keyDown(keytoPress);
            this.Desktop.type(keytoPress2);
            this.Desktop.keyUp();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean PressKey(String keytoPress, int numberOfPresses) {
        try 
        {
            for(int i =1; i<=numberOfPresses; i++)
            {
                this.Desktop.type(keytoPress);
            }
            
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean TypeTextAtElement( String InputText)
    {
        try
        {
                this.Desktop.type(InputText);
             
        }
        catch(Exception e)
        {
            
            System.err.println("[Error] Failed to enter text at element: }"+ e.getMessage());
            return false;
        }
        return true;
    }
    
     public boolean DragAndHighlightOnly(String element1,  Enums.RelativePosition  relativePosition1, int offSet1,
                             String element2,  Enums.RelativePosition  relativePosition2, int offSet2)
    {
        try
        {
            Region ScreenRegion1;
            Region ScreenRegion2;
            
            Region ScreenRegionWithOffset1 = null;
            Region ScreenRegionWithOffset2 = null;
            
            //Get ScreenRegionWithOffset1
            if(this.WaitForElementToAppear(element1))
            {
                ScreenRegion1 = this.Desktop.find(this.ScreenshotDirectory + element1);
                switch(relativePosition1)
                {
                    case Above:
                      ScreenRegion1.above(offSet1).highlight(1).click();
                      ScreenRegionWithOffset1=  ScreenRegion1.above(offSet1).highlight(1);
                        break;
                    case Below:
                        ScreenRegion1.below(offSet1).highlight(1).click();
                        ScreenRegionWithOffset1 = ScreenRegion1.below(offSet1).highlight(1);
                        break;
                    case Left:
                        ScreenRegion1.left(offSet1).highlight(1).click();
                        ScreenRegionWithOffset1 = ScreenRegion1.left(offSet1).highlight(1);
                        break;
                    case Right:
                       ScreenRegion1.right(offSet1).highlight(1).click();
                       ScreenRegionWithOffset1 = ScreenRegion1.right(offSet1).highlight(1);
                        break;
                }
                
                //Get ScreenRegionWithOffset2
                ScreenRegion2 = this.Desktop.find(this.ScreenshotDirectory + element2);
                switch(relativePosition2)
                {
                    case Above:
                      ScreenRegionWithOffset2 =  ScreenRegion2.above(offSet2).highlight(1);
                        break;
                    case Below:
                       ScreenRegionWithOffset2 = ScreenRegion2.below(offSet2).highlight(1);
                        break;
                    case Left:
                       ScreenRegionWithOffset2 = ScreenRegion2.left(offSet2).highlight(1);
                        break;
                    case Right:
                       ScreenRegionWithOffset2 = ScreenRegion2.right(offSet2).highlight(1);
                        break;
                }
                //Perform drag and drop
                 this.Desktop.drag(ScreenRegionWithOffset1);
                 this.Desktop.dropAt(ScreenRegionWithOffset2);
                 
                 return true;
           
            }
        } catch (Exception ex)
        {
             System.err.println("[Error] Failed to drag and highlight, images: {" + element1 + "} {" + element2 + "}, error :" + ex.getMessage());
            return false;
        }
       return false;
    }
    
      public String DragAndDropAndReturnText(String element1,  Enums.RelativePosition  relativePosition1, int offSet1,
                             String element2,  Enums.RelativePosition  relativePosition2, int offSet2)
    {
        try
        {
            //this.setClipboardContents("");
            Region ScreenRegion1;
            Region ScreenRegion2;
            
            Region ScreenRegionWithOffset1 = null;
            Region ScreenRegionWithOffset2 = null;
            
            //Get ScreenRegionWithOffset1
            if(this.WaitForElementToAppear(element1))
            {
                ScreenRegion1 = this.Desktop.find(this.ScreenshotDirectory + element1);
                switch(relativePosition1)
                {
                    case Above:
                      ScreenRegion1.above(offSet1).highlight(1).click();
                      ScreenRegionWithOffset1=  ScreenRegion1.above(offSet1).highlight(1);
                        break;
                    case Below:
                        ScreenRegion1.below(offSet1).highlight(1).click();
                        ScreenRegionWithOffset1 = ScreenRegion1.below(offSet1).highlight(1);
                        break;
                    case Left:
                        ScreenRegion1.left(offSet1).highlight(1).click();
                        ScreenRegionWithOffset1 = ScreenRegion1.left(offSet1).highlight(1);
                        break;
                    case Right:
                       ScreenRegion1.right(offSet1).highlight(1).click();
                       ScreenRegionWithOffset1 = ScreenRegion1.right(offSet1).highlight(1);
                        break;
                }
                
                //Get ScreenRegionWithOffset2
                ScreenRegion2 = this.Desktop.find(this.ScreenshotDirectory + element2);
                switch(relativePosition2)
                {
                    case Above:
                      ScreenRegionWithOffset2 =  ScreenRegion2.above(offSet2).highlight(1);
                        break;
                    case Below:
                       ScreenRegionWithOffset2 = ScreenRegion2.below(offSet2).highlight(1);
                        break;
                    case Left:
                       ScreenRegionWithOffset2 = ScreenRegion2.left(offSet2).highlight(1);
                        break;
                    case Right:
                       ScreenRegionWithOffset2 = ScreenRegion2.right(offSet2).highlight(1);
                        break;
                }
                //Perform drag and drop
                 this.Desktop.drag(ScreenRegionWithOffset1);
                 this.Desktop.dropAt(ScreenRegionWithOffset2);
                 
//                 this.Pause(1000);
//                 this.Desktop.find(this.ScreenshotDirectory + VisionPlusApplicationPage.Copy()).click();
//                 this.Pause(2000);
//                 String _enquiredInfo = this.getClipboardContents();
                 return "";
           
            }
        } catch (Exception ex)
        {
             System.err.println("[Error] Failed to click element, image: {" + element1 + "}, error :" + ex.getMessage());
            return null;
        }
       return null;
    }
     
    
      public String ReadTextUsingPatterns(String ImageFilePath, int position,Enums.RelativePosition relation)
    {
        try
        {
           
            Pattern p = new Pattern(ImageFilePath).similar((float)Settings.MinSimilarity);
            Region Anchorimage = this.Desktop.wait(p  + ImageFilePath).highlight(1);
            return SikuliDriverInstance.ReadtextfromimageUsingPatterns(Anchorimage.toString(), position, relation);
            
        } catch (Exception ex)
        {
             System.err.println("[Error] Failed to click element, image: {" + ImageFilePath + "}, error :" + ex.getMessage());
            return null;
        }
       
    }
      
     public String ReadtextfromimageUsingPatterns(String ImageFilePath, int position,Enums.RelativePosition relation)
    {
        String Retrievedtext = "";
        try
        {
            Region Anchorimage = this.Desktop.wait(this.ScreenshotDirectory + ImageFilePath).highlight(1);
            
           switch(relation)
            {
                case Above:
                {
                    Retrievedtext = Anchorimage.above(position).text();
                    return Retrievedtext;
                }
                case Below:
                {
                    Retrievedtext =  Anchorimage.below(position).text();
                    return Retrievedtext;
                }
                case Right:
                {
                    Retrievedtext =   Anchorimage.right(position).text();
                    return Retrievedtext;
                }
                case Left:
                {
                    Retrievedtext =   Anchorimage.left(position).text();
                    return Retrievedtext;
                }
            }
           
           return Retrievedtext;
        }
        catch(Exception e)
        {
            System.err.println("[Error] Failed to find element on desktop, image: {" + ImageFilePath + "}, error :" + e.getMessage());
            return e.getMessage();
        }
    }
    
      
      
              
              
     
}
