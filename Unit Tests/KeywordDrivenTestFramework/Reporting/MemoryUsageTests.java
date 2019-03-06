/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Reporting;

import KeywordDrivenTestFramework.Entities.Enums;
import KeywordDrivenTestFramework.Entities.TestEntity;
import KeywordDrivenTestFramework.Entities.TestResult;
import KeywordDrivenTestFramework.Utilities.ApplicationConfig;
import KeywordDrivenTestFramework.Utilities.ExcelReaderUtility;
import org.joda.time.DateTime;
import org.joda.time.Duration;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author FerdinandN
 */
public class MemoryUsageTests 
{
    ReportGenerator generateReport;
    ApplicationConfig config;
    
    TestReportEmailerUtility generateReportEmail;

    List<TestResult> testResults;
    List<TestEntity> testData;
    
    ExcelReaderUtility excelInputReader;
    
    @Before
    public  void  setupTestParameters()
    {
        config = new ApplicationConfig();  

    }

    @Test
    public void parameterToStringMethodTest() 
    {
            Duration testDuration = new Duration(new DateTime(), new DateTime().plusSeconds(20));
            excelInputReader = new ExcelReaderUtility();
            
            testData = new ArrayList<TestEntity>();
            testResults = new ArrayList<TestResult>();
            
            generateReport = new ReportGenerator(config.InputFileName(),config.ReportFileDirectory());
            testData = excelInputReader.getTestDataFromExcelFile(ApplicationConfig.InputFileName());
            
            for(TestEntity test : testData)
            {
                TestResult result = new TestResult(test, Enums.ResultStatus.PASS, "Passed", testDuration.getStandardSeconds());
                generateReport.addResult(result);
                testResults.add(result);
                
            }
            
            Assert.assertTrue("Generate report failed", generateReport.generateTestReport());
            generateReportEmail = new TestReportEmailerUtility(testResults);
            generateReportEmail.SendResultsEmail();

    }
    
}
