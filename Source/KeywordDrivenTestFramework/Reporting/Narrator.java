/*
 * Developed By: James Joubert
 * ID: 9203165141087
 * Email: jjoubert@dvt.co.za
 */
package KeywordDrivenTestFramework.Reporting;

import KeywordDrivenTestFramework.Core.BaseClass;
import static KeywordDrivenTestFramework.Core.BaseClass.SeleniumDriverInstance;
import static KeywordDrivenTestFramework.Core.BaseClass.SikuliDriverInstance;
import static KeywordDrivenTestFramework.Core.BaseClass.getRelativeScreenshotPath;
import static KeywordDrivenTestFramework.Core.BaseClass.reportDirectory;
import KeywordDrivenTestFramework.Entities.Enums;
import KeywordDrivenTestFramework.Entities.TestEntity;
import KeywordDrivenTestFramework.Entities.TestResult;
import KeywordDrivenTestFramework.Utilities.ApplicationConfig;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.relevantcodes.extentreports.NetworkMode;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import static java.lang.System.err;
import static java.lang.System.out;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.FileUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

/**
 *
 * @author jjoubert
 */
public class Narrator extends BaseClass
{

    public TestEntity testData;
    private static final String formatStr = "%n%-24s %-20s %-60s %-25s";
    private String line = "______________________________________________________________________________________________________________________________________";
    private static String logMessage = "";
    private static int counter = 0;
    //private long totalTime = 0;
    private static final DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss:ms");
    //private static Date startDate;
    private static ExtentReports extentReports;
    private static ExtentTest extentTest;
    private String ExtentLocation;
    public static int ScreenShotCounter = 0;
    public static String ScreenShotName;

    String directory;
    String extentReportDirectory = "";

    //Initializes the Narrator class
    public Narrator(TestEntity testData)
    {
        this.testData = testData;
        this.setStartTime();
        directory = reportDirectory + "\\Narrator_Log.txt";
        File file = new File(directory);

        extentReportDirectory = reportDirectory + "\\extentReport.html";

        System.setProperty("LatestReportFolder", reportDirectory);

        extentReports = new ExtentReports(extentReportDirectory, false, NetworkMode.OFFLINE);  //Set to false so tests are appended
        extentReports.config()
                .documentTitle("DVT Automation Report")
                .reportName("DVT Report");
        String style = ".test { border: 2px solid #444; }";
        extentReports.config().insertCustomStyles(style);
        extentReports.loadConfig(new File("extent-config.xml"));
        extentTest = extentReports.startTest("<span style='font-weight:bold;font-family: \"Roboto\", sans-serif;font-size: 15px'>" + testData.TestCaseId + "</span>",
                "<span style='font-weight:bold;font-family: Times New Roman;font-size: 15px'>" + testData.TestDescription + "</span>");

        //checks if file exists if not, create it
        if (!file.exists())
        {
            createNewTextFile();
        }

        try
        {
            //initializes the text file with new test class data     
            counter = 0;
            PrintWriter writer = new PrintWriter(new FileWriter(file, true));
            //writer.println(" ");
            writer.println(String.format(formatStr, dateFormat.format(new Date()), "- [KEYS] START KEYWORD:", testData.TestCaseId, ""));
            writer.close();
                         
        }
        catch (IOException e)
        {
            System.out.printf(e.getMessage());
        }
      
        
    }

    public String getData(String parameterName)
    {
        String returnedValue = this.testData.TestParameters.get(parameterName);

        if (returnedValue == null)
        {
            Narrator.logError(" Parameter ' " + parameterName + " ' not found");
            returnedValue = "";
        }

        return returnedValue;
    }

    //Takes the screenshot
    public static void takeScreenShot(boolean testStatus, String message)
    {
        if (SeleniumDriverInstance != null && SeleniumDriverInstance.isDriverRunning())
        {
            SeleniumDriverInstance.takeScreenShot(++counter + " " + message, !testStatus);
        }
        else if (SikuliDriverInstance != null && SikuliDriverInstance.isDriverRunning())
        {
            SikuliDriverInstance.TakeScreenshot(++counter + " " + message, !testStatus);
        }

    }

    //Used when a test passes
    //Writes to the text file and writes the html file
    public void stepPassed(String message)
    {
        ScreenShotCounter++;
        ScreenShotName = ScreenShotCounter + "";
        logMessage = formatMessage(message);

        extentTest.log(LogStatus.PASS, "<span style='font-weight:bold;font-family: \"Roboto\", sans-serif; '>" + message + "</span>");
        //Writes info to the text file  
        logInfo("- [INFO] STEP " + ++counter + ":" + logMessage);

        takeScreenShot(true, ScreenShotName);
    }
    public String getLoc(){
        return reportDirectory + "\\Narrator_Log.txt";
    }
    public String getDir(){
        return reportDirectory;
    }

    public void stepPassedUseExistingScreenshot(String message)
    {
//        ScreenShotCounter ++;
//        ScreenShotName = ScreenShotCounter +"";

        if (testData.TestCaseId.contains("#") || ApplicationConfig.verboseReporting == true)
        {
            logMessage = message;

            String screenCapHTML = extentTest.addScreenCapture(getRelativeScreenshotPath());
            
            extentTest.log(LogStatus.PASS, "<span style='font-weight:bold;font-family: \"Roboto\", sans-serif; '>" + message + "</span><br>" + " Snapshot: " + screenCapHTML);
            //Writes info to the text file  
            logInfo("- [INFO] STEP " + ++counter + ":" + logMessage);

        }

    }

    //Failed message to display in extent report
    public void failedMessage(String message)
    {
        logMessage = formatMessage(message);
        extentTest.log(LogStatus.FAIL, "<span style='font-family: \"Roboto\", sans-serif; '>" + message + " (View screenshot below)</span>");
        //Writes info to the text file  
        logInfo("- [INFO] STEP " + ++counter + ":" + logMessage);
    }

    //Used where a test fails
    //Writes to the  text file and writes to the html file
    public TestResult testFailed(String message)
    {
        if (testData.TestCaseId.contains("#") || ApplicationConfig.verboseReporting == true)
        {
            logMessage = message;

            //String embeddedImage = convertPNGToBase64(getScreenshotPath());
            String screenCapHTML = extentTest.addScreenCapture(getRelativeScreenshotPath());
            

            extentTest.log(LogStatus.FAIL, logMessage + " <br> Snapshot:" + screenCapHTML);
            extentReports.endTest(extentTest);
            extentReports.flush();
            //Writes info to the text file

            logFailure(" STEP " + ++counter + ":" + logMessage);

        }
        //returns results
        return new TestResult(testData, Enums.ResultStatus.FAIL, message, this.getTotalExecutionTime());
    }
    public TestResult testSkipped(String message)
    {
        if (testData.TestCaseId.contains("#") || ApplicationConfig.verboseReporting == true)
        {
            logMessage = message+" skipped";

            //String embeddedImage = convertPNGToBase64(getScreenshotPath());
            String screenCapHTML = extentTest.addScreenCapture(getRelativeScreenshotPath());
            

            extentTest.log(LogStatus.WARNING, logMessage + " <br> Snapshot:" + screenCapHTML);
            extentReports.endTest(extentTest);
            extentReports.flush();
            //Writes info to the text file

            logSkip(" STEP " + ++counter + ":" + logMessage);

        }
        //returns results
        return new TestResult(testData, Enums.ResultStatus.WARNING, message, this.getTotalExecutionTime());
    }
    //Use at the end of a test class when everything passes
    //Writes to the text file and writes the html file
    public TestResult finalizeTest(String message)
    {
        logMessage = message;

        //String embeddedImage = convertPNGToBase64(getScreenshotPath());
//        String screenCapHTML = extentTest.addScreenCapture(getRelativeScreenshotPath());
        extentTest.log(LogStatus.PASS, "Test Complete: " + message);
        extractedParameters(testData);
        extentReports.endTest(extentTest);
        extentReports.flush();
        //Writes info to the text file

        logPass(" TEST " + testData.TestCaseId + " PASSED:" + logMessage);

        AppendHTML();

        copyReportFileForJenkins();
        //returns results
        return new TestResult(testData, Enums.ResultStatus.PASS, message, this.getTotalExecutionTime());
    }

    public void extractedParameters(TestEntity testData)
    {
        ArrayList keys = new ArrayList();
        ArrayList values = new ArrayList();
        ArrayList status = new ArrayList();
        if (testData.ExtractedParameters != null)
        {
            logMessage = "Extracted Parameters:";

            String extractedParameters = "<span style='font-weight:bold;font-family: Georgia;'>" + logMessage + "</span></br><table>";

            for (String key : testData.ExtractedParameters.keySet())
            {
                keys.add(key);
                for (String value : testData.ExtractedParameters.get(key))
                {
                    status.add(testData.ExtractedParameters.get(key).get(1));
                    values.add(value);
                    break;
                }
            }

            for (int i = 0; i < keys.size(); i++)
            {
                if (status.get(i).equals("PASS"))
                {
                    extractedParameters += "<tr style='background: #60A84D;'><td>" + keys.get(i) + "</td><td>" + values.get(i) + "</td></tr>";
                }
                else if (status.get(i).equals("FAIL"))
                {
                    extractedParameters += "<tr style='background: #FF4536;'><td>" + keys.get(i) + "</td><td>" + values.get(i) + "</td></tr>";
                }
                else if (status.get(i).equals("WARNING"))
                {
                    extractedParameters += "<tr style='background: #FF8E1A;'><td>" + keys.get(i) + "</td><td>" + values.get(i) + "</td></tr>";
                }
                else
                {
                    extractedParameters += "<tr><td>" + keys.get(i) + "</td><td>" + values.get(i) + "</td></tr>";
                }
            }

            extractedParameters += "</table>";

            extentTest.log(LogStatus.PASS, extractedParameters);
        }
    }

    //Creating a new text file
    public static void createNewTextFile()
    {
        //Creates the file and initializes the header
        try
        {
            String directory = reportDirectory + "\\Narrator_Log.txt";
            File file = new File(directory);
            file.createNewFile();
            PrintWriter writer = new PrintWriter(new FileWriter(file, true));
            writer.println(String.format(formatStr, "", "-- NARRATOR LOG FILE --", "", ""));
            writer.close();
        }
        catch (IOException e)
        {
            System.out.printf(e.getMessage());
        }
    }

    //Returns data from the spreadsheet
//    public String getData(String data) {
//        return testData.getData(data);
//    }
    //Checks the length of the message
    //Called to Calculate the total run time of all the tests and to write the final data from the Error and Info log.
//    public static void finishFile()
//    {                
//        //writeErrorInfo();
//        
//        Date endDate = new Date();
//        Date testDate = new Date();
//        testDate.setSeconds(endDate.getSeconds()-startDate.getSeconds());
//        testDate.setMinutes(endDate.getMinutes()-startDate.getMinutes());
//        testDate.setHours(endDate.getHours()-startDate.getHours());
//        
//        long secs = testDate.getSeconds();
//        long mins = testDate.getMinutes();
//        long hour = testDate.getHours();
//        
//        try
//        {
//            PrintWriter writer = new PrintWriter(new FileWriter(new File(reportDirectory + "\\Narrator_Log.txt"),true));
//            writer.println(String.format("%n%-35s %-60s%n%n", "TOTAL RUN TIME: ", hour+"H:"+mins+"M:"+secs+"S"));
//            writer.close();
//        }
//        catch(IOException e)
//        {
//            e.getMessage();
//        }
//    }
    public static void logError(String error)
    {
        writeToLogFile("- [EROR] " + error);
    }

    public static void logDebug(String debug)
    {
        writeToLogFile("- [DBUG] " + debug);

    }

    public static void logPass(String failure)
    {
        writeToLogFile("- [PASS] " + failure);

    }

    public static void logFailure(String failure)
    {
        writeToLogFile("- [FAIL] " + failure);

    }
    public static void logSkip(String failure)
    {
        writeToLogFile("- [SKIP] " + failure);

    }

    public static void logInfo(String info)
    {
        writeToLogFile("- [INFO] " + info);

    }

    private static void writeToLogFile(String logMessage)
    {
        String directory = reportDirectory + "\\Narrator_Log.txt";
        File file = new File(directory);

        if (!file.exists())
        {
            createNewTextFile();
        }

        //Writes info to the text file        
        try
        {
            PrintWriter writer = new PrintWriter(new FileWriter(file, true));
            writer.println(String.format(formatStr, dateFormat.format(new Date()), logMessage, "", ""));
            writer.close();
        }
        catch (IOException e)
        {
            System.out.printf(e.getMessage());
        }
    }

    public String convertPNGToBase64(String imageFilePath)
    {
        String base64ReturnString = "";

        try
        {
            out.println("[INFO] Converting error screenshot to Base64 format...");
            File image = new File(imageFilePath);

            FileInputStream imageInputStream = new FileInputStream(image);

            byte imageByteArray[] = new byte[(int) image.length()];

            imageInputStream.read(imageByteArray);

            base64ReturnString = Base64.encodeBase64String(imageByteArray);

            out.println("[INFO] Converting completed, image ready for embedding.");
        }
        catch (Exception ex)
        {
            out.println("[ERROR] Failed to convert image to Base64 format - " + ex.getMessage());
        }

        return base64ReturnString;
    }

    public void stepPassedWithScreenShot(String message)
    {

        logMessage = formatMessage(message);
//        extentTest.log(LogStatus.PASS, "<span style='font-weight:bold;font-family: \"Roboto\", sans-serif; '>" + message + "</span>");
        //Writes info to the text file  
        logInfo("- [INFO] STEP " + ++counter + ":" + logMessage);
        ScreenShotCounter++;
        ScreenShotName = ScreenShotCounter + "";

        takeScreenShot(true, ScreenShotName);
        String screenCapHTML = extentTest.addScreenCapture(getRelativeScreenshotPath());

        extentTest.log(LogStatus.PASS, "Snapshot: " + message + screenCapHTML);
    }

    public void AppendHTML()
    {
        //Finds Location of Report

        ExtentLocation = reportDirectory + "\\extentReport.html";

        //Appends Extent with Logo
        try
        {
            //Reads in the html file    
            File input = new File(ExtentLocation);
            Document doc = Jsoup.parse(input, "UTF-8", "");
            //Edits the Broken Time display, to show an Image instead
            Element Panel = doc.getElementsByAttributeValue("class", "card suite-total-time-overall").first();
            Panel.text("");

            String workingDir = System.getProperty("user.dir");
            //Convert the Logo to Base64
            String Image64 = convertPNGToBase64(workingDir + "\\DVT Logo.png");
            //Embeds the Base64Image to the HTML
            Panel.appendElement("img").attr("src", "data:image/png;base64," + Image64);

            //Removes Redundant tabs
//        String[] categories = {"categories-view","exceptions-view","testrunner-logs-view"};
//        
//            for (int i = 0; i < categories.length; i++)
//            {
//                Element Category = doc.getElementsByAttributeValue("class", categories[i]).first();
//                Category.remove();
//            }
            //Writes the Changes over the old file
            BufferedWriter htmlWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(ExtentLocation), "UTF-8"));
//        System.out.println("\n" + doc.outerHtml());
            htmlWriter.write(doc.toString());
            htmlWriter.flush();
            htmlWriter.close();

        }
        catch (Exception e)
        {
            logError("Failed to Create an appened ExtentReport, error message -  " + e.getMessage());
        }
    }

    public void copyReportFileForJenkins()
    {
        try
        {
            File extentReport = new File(extentReportDirectory);

            File extentReportDependancies = new File(reportDirectory);

            File htmlReportDirectory = new File("HTMLTestReport");

            if (!htmlReportDirectory.exists())
            {
                htmlReportDirectory.mkdirs();
            }

            FileUtils.copyFileToDirectory(extentReport, htmlReportDirectory);

            if (extentReportDependancies.exists())
            {
                FileUtils.copyDirectory(extentReportDependancies, htmlReportDirectory);
            }

        }
        catch (Exception ex)
        {
            err.println("[ERROR] Failed to copy extentReport file to HTML Test Report Directory - " + ex.getMessage());
        }
    }

}
