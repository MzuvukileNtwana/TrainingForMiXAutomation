/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Reporting;

import KeywordDrivenTestFramework.Utilities.ApplicationConfig;
import org.joda.time.DateTime;
import org.joda.time.Duration;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


/**
 *
 * @author Ferdi
 */
public class ReportGeneratorTest 
{
    static ReportGenerator generateReport;
    ApplicationConfig config;
    public ReportGeneratorTest() 
    {
        
    }
    
    @Before
    public  void  setupTestParameters()
    {
            config = new ApplicationConfig();
            generateReport = new ReportGenerator(config.InputFileName(),config.ReportFileDirectory());
    }

    @Test
    public void parameterToStringMethodTest() 
    {
            Duration testDuration = new Duration(new DateTime(), new DateTime().plusSeconds(20));
            Assert.assertTrue("Generate report failed", generateReport.generateTestReport());
    }
    
}