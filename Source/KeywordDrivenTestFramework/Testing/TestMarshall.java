package KeywordDrivenTestFramework.Testing;

import KeywordDrivenTestFramework.Core.BaseClass;
import static KeywordDrivenTestFramework.Core.BaseClass.narrator;
import KeywordDrivenTestFramework.Entities.Enums;
import static KeywordDrivenTestFramework.Entities.Enums.Environment.*;
import KeywordDrivenTestFramework.Entities.TestEntity;
import KeywordDrivenTestFramework.Entities.TestResult;
import static KeywordDrivenTestFramework.Core.BaseClass.reportGenerator;
import KeywordDrivenTestFramework.Reporting.Narrator;
import KeywordDrivenTestFramework.Reporting.ReportGenerator;
import KeywordDrivenTestFramework.Reporting.TestReportEmailerUtility;
import KeywordDrivenTestFramework.Testing.TestClasses.Login.Login_to_MixTelematics;
import KeywordDrivenTestFramework.Testing.TestClasses.Login.Login_LookandFeel;
import KeywordDrivenTestFramework.Testing.TestClasses.Login.LogInNewUserValidation;
import KeywordDrivenTestFramework.Utilities.ApplicationConfig;
import KeywordDrivenTestFramework.Utilities.ExcelReaderUtility;
import KeywordDrivenTestFramework.Utilities.MultiOutputStream;
import KeywordDrivenTestFramework.Utilities.SeleniumDriverUtility;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import KeywordDrivenTestFramework.Reporting.Parser;
import KeywordDrivenTestFramework.Testing.TestClasses.Utilities.SelectBreadcrum;
import KeywordDrivenTestFramework.Testing.TestClasses.Utilities.SelectDriver;
import KeywordDrivenTestFramework.Testing.TestClasses.Login.Login_to_MixTelematicsEU;
import KeywordDrivenTestFramework.Testing.TestClasses.Login.Navigate;
import KeywordDrivenTestFramework.Monitor.FleetAdmin.Assets.CheckDiagnosticWindowLoadInfo;
import KeywordDrivenTestFramework.Monitor.FleetAdmin.Assets.ExportDiagnosticsInformation;


/**
 *
 * @author fnell
 */
public class TestMarshall extends BaseClass
{

    // Handles calling test methods based on test parameters , instantiates Selenium Driver object   
    ExcelReaderUtility excelInputReader;
    //CSVReportUtility cSVReportUtility;
    public static double multiple;
    public TestReportEmailerUtility reportEmailer;
    PrintStream errorOutputStream;
    PrintStream infoOutputStream;
    private String dateTime;
    public static boolean skip=false;
    public static boolean skippedtest = false;
    private Integer screenShotCounter = 1;

    public TestMarshall()
    {
        inputFilePath = ApplicationConfig.InputFileName();
        testDataList = new ArrayList<>();
        excelInputReader = new ExcelReaderUtility();
        browserType = ApplicationConfig.SelectedBrowser();
        reportGenerator = new ReportGenerator(inputFilePath, ApplicationConfig.ReportFileDirectory());
        SeleniumDriverInstance = new SeleniumDriverUtility(browserType);

    }

    public TestMarshall(String inputFilePathIn)
    {
        inputFilePath = inputFilePathIn;
        testDataList = new ArrayList<>();
        excelInputReader = new ExcelReaderUtility();
        //cSVReportUtility = new CSVReportUtility(inputFilePath);
        //cSVReportUtility.createCSVReportDirectoryAndFile();
        browserType = ApplicationConfig.SelectedBrowser();
        reportGenerator = new ReportGenerator(inputFilePath, ApplicationConfig.ReportFileDirectory());
        SeleniumDriverInstance = new SeleniumDriverUtility(browserType);

    }

    public TestMarshall(String inputFilePathIn, Enums.BrowserType browserTypeOverride)
    {
        inputFilePath = inputFilePathIn;
        testDataList = new ArrayList<>();
        excelInputReader = new ExcelReaderUtility();
        //cSVReportUtility = new CSVReportUtility(inputFilePath);
        //cSVReportUtility.createCSVReportDirectoryAndFile();
        browserType = browserTypeOverride;
        reportGenerator = new ReportGenerator(inputFilePath, ApplicationConfig.ReportFileDirectory());
        SeleniumDriverInstance = new SeleniumDriverUtility(browserType);

    }

    public void runKeywordDrivenTests() throws FileNotFoundException
    {

        int numberOfTest = 0;
        if(inputFilePath.contains("SkippedTestPack"))
        {
            skippedtest=true;
        }
        testDataList = loadTestData(inputFilePath);
        this.generateReportDirectory();
        this.redirectOutputStreams();

        if (testDataList.size() < 1)
        {
            System.err.println("Test data object is empty - spreadsheet not found or is empty");
        }
        else
        {
            // Each case represents a test keyword found in the excel spreadsheet
            for (TestEntity testData : testDataList)
            {
                testCaseId = testData.TestCaseId;
                // Make sure browser is not null - could have thrown an exception and terminated
                CheckBrowserExists();
                // Skip test methods and test case id's starting with ';'
                if (!testData.TestMethod.startsWith(";") && !testData.TestCaseId.startsWith(";"))
                {
                    System.out.println("Executing test - " + testData.TestMethod + " | " + (numberOfTest+1) + " of " + testDataList.size());
                    if(null!=currentEnvironment)
                    {
                        switch (currentEnvironment)
                        {
                            case CPT:
                                multiple=2;
                                break;
                            case UK:
                                multiple=2.5;
                                break;
                            case ENT:
                                multiple=1.5;
                                break;
                            case US:
                                multiple=2;
                                break;
                            case OMAN:
                                multiple=2.5;
                                break;
                            case AU:
                                multiple=2.5;
                                break;
                            case ALG:
                                multiple=2.5;
                                break;
                            case UAT:
                                multiple=1;
                                break;
                            case UATDP:
                                multiple=2;
                                break;
                            case INTDP:
                                multiple=2;
                                break;
                            case INT:
                                multiple=1;
                                break;
                            case CONFIG:
                                multiple=1;
                                break;
                            default:
                                multiple=1;
                                break;
                        }
                    }
                    System.out.println("Time multiple for this environment is "+multiple);
                    try
                    {
                        if (testData.TestCaseId.contains("#") || ApplicationConfig.verboseReporting == true)
                        {
                            narrator = new Narrator(testData);
                        }

                        switch (testData.TestMethod)
                        {
                            // A login test starts with a fresh Driver instance

                            case "Login to Mix Telematics Web Page":
                            {
                                ensureNewBrowserInstance();
                                Login_to_MixTelematics MXTEL = new Login_to_MixTelematics(testData);
                                reportGenerator.addResult(MXTEL.executeTest());
                                numberOfTest++;
                                break;
                            }
                            case "CheckDiagnosticWindowLoadInfo":
                            {
                                CheckDiagnosticWindowLoadInfo checkDiagnosticWindow = new CheckDiagnosticWindowLoadInfo(testData);
                                reportGenerator.addResult(checkDiagnosticWindow.executeTest());
                                numberOfTest++;
                                break;
                            }
                            case "ExportDiagnosticsInformation":
                            {
                                ExportDiagnosticsInformation exportDiagnosticInfo = new ExportDiagnosticsInformation(testData);
                                reportGenerator.addResult(exportDiagnosticInfo.executeTest());
                                numberOfTest++;
                                break;
                            }
                            case "Navigate":
                            {
                                ensureNewBrowserInstance();
                                Navigate MXTEL = new Navigate(testData);
                                reportGenerator.addResult(MXTEL.executeTest());
                                numberOfTest++;
                                break;
                            }
                            case "Login to Mix Telematics New User":
                            {
                                ensureNewBrowserInstance();
                                LogInNewUserValidation logInNewUserValidation = new LogInNewUserValidation(testData);
                                reportGenerator.addResult(logInNewUserValidation.executeTest());
                                numberOfTest++;
                                break;
                            }
                            case "SkipCPT":
                            {
                                if(currentEnvironment==CPT)
                                {
                                    skip=true;
                                    break;
                                }
                                break;
                            }
                            case "SkipENT1":
                            {
                                if(currentEnvironment==ENT1)
                                {
                                    skip=true;
                                    break;
                                }
                                break;
                            }
                            case "SkipUAT":
                            {
                                if(currentEnvironment==UAT)
                                {
                                    skip=true;
                                    break;
                                }
                                break;
                            }
                            case "SkipINT":
                            {
                                if(currentEnvironment==INT)
                                {
                                    skip=true;
                                    break;
                                }
                                break;
                            }
                            case "SkipCONFIG":
                            {
                                if(currentEnvironment==CONFIG)
                                {
                                    skip=true;
                                    break;
                                }
                                break;
                            }
                            case "SkipUK":
                            {
                                if(currentEnvironment==UK)
                                {
                                    skip=true;
                                    break;
                                }
                                break;
                            }
                            case "SkipUS":
                            {
                                if(currentEnvironment==US)
                                {
                                    skip=true;
                                    break;
                                }
                                break;
                            }
                            case "SkipOMAN":
                            {
                                if(currentEnvironment==OMAN)
                                {
                                    skip=true;
                                    break;
                                }
                                break;
                            }
                            case "SkipAU":
                            {
                                if(currentEnvironment==AU)
                                {
                                    skip=true;
                                    break;
                                }
                                break;
                            }
                            case "SkipENT":
                            {
                                if(currentEnvironment==ENT)
                                {
                                    skip=true;
                                    break;
                                }
                                break;
                            }
                            case "SkipALG":
                            {
                                if(currentEnvironment==ALG)
                                {
                                    skip=true;
                                    break;
                                }
                                break;
                            }
                            case "LoginEU":
                            {
                                if(skip==true)
                                {
                                    System.out.println("[SKIP] Skipping this test");                                    
                                    //narrator.testSkipped(testCaseId);
                                    reportGenerator.addResult(Skip(testData));                                    
                                    skip=false;
                                    break;
                                }
                                ensureNewBrowserInstance();
                                Login_to_MixTelematicsEU MXTEL = new Login_to_MixTelematicsEU(testData);
                                reportGenerator.addResult(MXTEL.executeTest());
                                numberOfTest++;
                                break;
                            }
                            case "Login Look and Feel":
                            {
                                ensureNewBrowserInstance();
                                Login_LookandFeel login_LookandFeel = new Login_LookandFeel(testData);
                                reportGenerator.addResult(login_LookandFeel.executeTest());
                                // System.out.println(login_LookandFeel.executeTest());
                                numberOfTest++;
                                break;
                            }
                            
                            case "SelectBreadcrum":
                            {
                                SelectBreadcrum selectBreadcrum = new SelectBreadcrum(testData);
                                reportGenerator.addResult(selectBreadcrum.executeTest());
                                numberOfTest++;
                                break;
                            }

                            case "SelectDriverBreadcrum":
                            {
                                SelectDriver selectDriver = new SelectDriver(testData);
                                reportGenerator.addResult(selectDriver.executeTest());
                                numberOfTest++;
                                break;
                            }
                            
                           
                        }       
                    }
                    catch (Exception ex)
                    {
                        System.err.println("[ERROR] Exception was thrown TestMarshall" + ex.toString());
                    }

                    System.out.println("Continuing to next test method");
                    System.out.println("===========================================================================================================");
                    SeleniumDriverUtility.resetScreenShotCounter(screenShotCounter);
                    SeleniumDriverUtility.incrementScreenShotFolderCounter();
                }
            }
            Parser p = new Parser();
            try 
            {
                p.TXTReader(narrator.getLoc(),narrator.getDir());
            }
            catch (IOException ex) 
            {
                Logger.getLogger(TestMarshall.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("-- END OF TEST PACK EXECUTION --");
            SeleniumDriverUtility.resetScreenShotFolderCounter(screenShotCounter);
        }

        if (SeleniumDriverInstance != null && SeleniumDriverInstance.isDriverRunning())
        {
            SeleniumDriverInstance.shutDown();
        }
        if (AppiumDriverInstance != null && AppiumDriverInstance.isDriverRunning())
        {
            AppiumDriverInstance.shutDown();
        }

        PrintWriter pw = new PrintWriter(new File("NumberOfTestsRun.txt"));
        pw.write((numberOfTest - 1) + "");
        pw.close();

        reportGenerator.generateTestReport();
        reportEmailer = new TestReportEmailerUtility(reportGenerator.testResults);
        reportEmailer.GenerateTestReport();

        this.flushOutputStreams();
        narrator.copyReportFileForJenkins();
    }
    private TestResult Skip(TestEntity t)
    {
        return new TestResult(t, Enums.ResultStatus.WARNING, "Skipped this test", this.getTotalExecutionTime());
    }

    private List<TestEntity> loadTestData(String inputFilePath)
    {
        return excelInputReader.getTestDataFromExcelFile(inputFilePath);
    }

    public static void CheckBrowserExists()
    {
        if (SeleniumDriverInstance == null)
        {
            SeleniumDriverInstance = new SeleniumDriverUtility(browserType);
            SeleniumDriverInstance.startDriver();
        }
    }


    public static void ensureNewBrowserInstance()
    {
        if (SeleniumDriverInstance.isDriverRunning())
        {
            SeleniumDriverInstance.shutDown();
        }
        SeleniumDriverInstance.startDriver();
    }

    public String generateDateTimeString()
    {
        Date dateNow = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd_hh-mm-ss");
        dateTime = dateFormat.format(dateNow).toString();
        return dateTime;
    }

    public void generateReportDirectory()
    {
        reportDirectory = ApplicationConfig.ReportFileDirectory() + "\\" + resolveScenarioName() + "_" + this.generateDateTimeString();
        String[] reportsFolderPathSplit = this.reportDirectory.split("\\\\");
        this.currentTestDirectory = ApplicationConfig.ReportFileDirectory() + "\\" + reportsFolderPathSplit[reportsFolderPathSplit.length - 1];
    }

    public void redirectOutputStreams()
    {
        try
        {
            File reportDirectoryFile = new File(reportDirectory);
            reportDirectoryFile.mkdirs();

            FileOutputStream infoFile = new FileOutputStream(reportDirectory + "\\" + "InfoTestLog.txt");
            FileOutputStream errorFile = new FileOutputStream(reportDirectory + "\\" + "ErrorTestLog.txt");

            MultiOutputStream multiOut = new MultiOutputStream(System.out, infoFile);
            MultiOutputStream multiErr = new MultiOutputStream(System.err, errorFile);

            infoOutputStream = new PrintStream(multiOut);
            errorOutputStream = new PrintStream(multiErr);

            System.setOut(infoOutputStream);
            System.setErr(errorOutputStream);
        }
        catch (FileNotFoundException ex)
        {
            System.err.println("[Error] could not create log files - " + ex.getMessage());
        }
    }
   

    public void flushOutputStreams()
    {

        errorOutputStream.flush();
        infoOutputStream.flush();

        errorOutputStream.close();
        infoOutputStream.close();

    }
}
