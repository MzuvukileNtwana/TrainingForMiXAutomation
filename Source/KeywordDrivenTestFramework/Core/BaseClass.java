/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Core;

import KeywordDrivenTestFramework.Entities.DataColumn;
import KeywordDrivenTestFramework.Entities.DataRow;
import KeywordDrivenTestFramework.Entities.Enums;
import KeywordDrivenTestFramework.Entities.TestEntity;
import KeywordDrivenTestFramework.Reporting.Narrator;
import KeywordDrivenTestFramework.Reporting.ReportGenerator;
import KeywordDrivenTestFramework.Utilities.AppiumDriverUtility;
import KeywordDrivenTestFramework.Utilities.ApplicationConfig;
import KeywordDrivenTestFramework.Utilities.ExcelReaderUtility;
import KeywordDrivenTestFramework.Utilities.OtpSmsUtility;
import KeywordDrivenTestFramework.Utilities.SeleniumDriverUtility;
import KeywordDrivenTestFramework.Utilities.SikuliDriverUtility;
import java.io.File;
import static java.lang.System.err;
import static java.lang.System.out;
import java.util.HashMap;
import java.util.LinkedList;

import org.joda.time.DateTime;
import org.joda.time.Duration;

import java.util.List;

/**
 *
 * @author fnell
 */
// All tests inherit from base class, 
// Base class contains initialisations of all neccessary utilities and 
// entities
public class BaseClass {

    public static List<TestEntity> testDataList;
    public static Enums.BrowserType browserType;
    public static ReportGenerator reportGenerator;
    public static SeleniumDriverUtility SeleniumDriverInstance;
    public static SikuliDriverUtility SikuliDriverInstance;
    public static OtpSmsUtility otpSms;
    public static ApplicationConfig appConfig = new ApplicationConfig();
    private DateTime startTime, endTime;
    private Duration testDuration;
    public static String testCaseId;
    public static String reportDirectory;
    public static String currentTestDirectory;
    public static Enums.Environment currentEnvironment;
    
    public static String screenshotPath;
    public static String relativeScreenShotPath;
    
    public static HashMap<String,String> customInputParameters;
    
    //Appium-specific config
    
    
    public static Enums.Device currentDevice;
    public static Enums.DeviceConfig currentDeviceConfig;
    public static Enums.MobilePlatform currentPlatform;
    public static AppiumDriverUtility AppiumDriverInstance;
    public static boolean requiresBrowser = true; //For appium set this false in the @Test
    public static boolean _isRemote = false; //For Remote Testing set to True in @Test
    //
    
    public static String inputFilePath;
    
    public static Narrator narrator;

    public BaseClass() 
    {
        if(customInputParameters == null)
        {
            customInputParameters = new HashMap<>();
            loadCustomInputParametersFromJenkinsDeployedExcelFile();
        }
        
        
        
        System.setProperty("java.awt.headless", "false");
    }
    
    
    private void loadCustomInputParametersFromJenkinsDeployedExcelFile()
    {
        try
        {
            File inputFile = new File("CustomRunParameters\\CustomRunDetails.xlsx");
            
            if(inputFile.exists())
            {
                LinkedList<DataRow> dataRows;
                
                
                // Read in the CustomRunDetails workbook
                ExcelReaderUtility excelReader = new ExcelReaderUtility();
               
                dataRows = excelReader.retrieveDataRowsFromSheet(inputFile.getAbsolutePath(), "Sheet1");
                
                
                //Convert DataRows to HashMap
                for(DataRow row : dataRows)
                {
                    for(DataColumn column : row.DataColumns)
                    {
                        out.println("[INFO] Adding record to global Custom Input Parameters List - " + column.columnHeader + " - Value : " + column.columnValue);
                        customInputParameters.put(column.columnHeader, column.columnValue);
                    }
                }
                
                
                


                inputFile.delete();
                
                out.println("[INFO] Custom Input Parameters file deleted");
               
               
            }
        }
        catch(Exception ex)
        {
            err.println("[ERROR] Failed to consume custom input parameters  - " + ex.getMessage());
        }
    }

    public void setStartTime() {
        this.startTime = new DateTime();
    }

    public long getTotalExecutionTime() {
        this.endTime = new DateTime();
        testDuration = new Duration(this.startTime, this.endTime);
        return testDuration.getStandardSeconds();
    }
    
    public static String getRelativeScreenshotPath() {
        return  "./" + relativeScreenShotPath;
    }

    public static void setScreenshotPath(String screenshotPath) {
        BaseClass.screenshotPath = screenshotPath;
    }
    
    
    public String formatMessage(String message) 
    {
        String newMessage = message.replace("\\.","");
        
        newMessage = newMessage.replace(":", "");
        
        newMessage = newMessage.replace("\\","");
        
        newMessage = newMessage.replace("/", "");
        
        newMessage = newMessage.replace("\\*", "");
        
        newMessage = newMessage.replace("\\?", "");
        
        newMessage = newMessage.replace("\"", "");
        
        newMessage = newMessage.replace("<", "");
        
        newMessage = newMessage.replace(">", "");
        
        newMessage = newMessage.replace("\\|", "");
        
        newMessage = newMessage.replace("\'", "");
        

        try
        {
            
        }
        catch(Exception ex)
        {
            
        }
        return newMessage;
    }

    public String resolveScenarioName() {
        String isolatedFileNameString;
        String[] splitFileName;
        String[] inputFileNameArray;
        String resolvedScenarioName = "";

        // Get file name from inputFilePath (remove file extension)
        inputFileNameArray = inputFilePath.split("\\.");
        isolatedFileNameString = inputFileNameArray[0];
        if (isolatedFileNameString.contains("/")) {
            inputFileNameArray = isolatedFileNameString.split("/");
        } else if (isolatedFileNameString.contains("\\")) {
            inputFileNameArray = isolatedFileNameString.split("\\\\");
        }

        isolatedFileNameString = inputFileNameArray[inputFileNameArray.length - 1];

        splitFileName = isolatedFileNameString.split("(?=\\p{Upper})");

        for (String word : splitFileName) {
            resolvedScenarioName += word + " ";
        }

        return resolvedScenarioName.trim();
    }

    public String retrieveTestParameterUsingTestCaseId(String testCaseId, String parameterName) {
        String defaultReturn = "parameter not found";
        for (TestEntity testEntity : this.testDataList) {
            if (testEntity.TestCaseId.toUpperCase().equals(testCaseId.toUpperCase())) {
                if (testEntity.TestParameters.containsKey(parameterName)) {
                    return testEntity.TestParameters.get(parameterName);
                } else {
                    return defaultReturn;
                }
            }
        }
        return defaultReturn;
    }
    
    public void pause(int milisecondsToWait) {
        try {
            Thread.sleep(milisecondsToWait);
        } catch (Exception e) {

        }
    }
    
    public String retrieveTestParameterUsingTestCaseId(String testCaseId, String parameterName, TestEntity testData) {
        String defaultReturn = "parameter not found";
        for (TestEntity testEntity : this.testDataList) {
            if (testEntity.TestCaseId.toUpperCase().equals(testCaseId.toUpperCase())) {
                if (testEntity.TestParameters.containsKey(parameterName)) {
                    return testEntity.TestParameters.get(parameterName);
                } else {
                    return defaultReturn;
                }
            }
        }
        return defaultReturn;
    }
    
    public String retrieveExtractedParameterByName(String parameterName, TestEntity testData) {
        String defaultReturn = "extracted parameter not found";
        for (TestEntity testEntity : this.testDataList) 
        {
            
            if (testEntity.ExtractedParameters == null) 
            {
            }
            else if (testEntity.ExtractedParameters.containsKey(parameterName))
            {
                return testEntity.ExtractedParameters.get(parameterName).get(0);
            }
            
        }
        return defaultReturn;
    }

}
