/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Reporting;

import KeywordDrivenTestFramework.Entities.TestResult;
import KeywordDrivenTestFramework.Utilities.ApplicationConfig;
import org.joda.time.DateTime;
import org.joda.time.Duration;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fnell
 */
public class TestReportEmailerTest 
{
    static TestReportEmailerUtility generateReport;
    ApplicationConfig config;
    List<TestResult> testResults;
    public TestReportEmailerTest() 
    {
        
    }
   
    @Test
    public void parameterToStringMethodTest() 
    {
            config = new ApplicationConfig();
            testResults = new ArrayList<TestResult>(); 
            Duration testDuration = new Duration(new DateTime(), new DateTime().plusSeconds(20));
            generateReport = new TestReportEmailerUtility(testResults);
            generateReport.SendResultsEmail();
    }
    
}
