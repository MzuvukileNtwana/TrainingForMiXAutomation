/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestSuites;

import KeywordDrivenTestFramework.Entities.Enums;
import KeywordDrivenTestFramework.Testing.TestMarshall;
import KeywordDrivenTestFramework.Utilities.ApplicationConfig;
import java.io.FileNotFoundException;
import org.junit.Test;

/**
 *
 * @author MsimeleloG
 */
public class CheckDiagnosticWindowLoadInfoTestPack {
    
    static TestMarshall instance;
    
    public CheckDiagnosticWindowLoadInfoTestPack()
    {
        ApplicationConfig appConfig = new ApplicationConfig();
        
        instance.currentEnvironment = Enums.Environment.INT;  
    }
     
    @Test
    public void RunMixTelematicsCheckDiagnosticWindowLoadInfoTestPackIE() throws FileNotFoundException
    {
        System.out.println("Mix Telematics Test Pack");   
        instance = new TestMarshall("TestPacks\\CheckDiagnosticWindowLoadInfoTestPack.xls", Enums.BrowserType.IE);
        instance.runKeywordDrivenTests();
    }
 
    @Test
    public void RunMixTelematicsCheckDiagnosticWindowLoadInfoTestPackChrome() throws FileNotFoundException
    {
        System.out.println("Mix Telematics Test Pack");   
        instance = new TestMarshall("TestPacks\\CheckDiagnosticWindowLoadInfoTestPack.xlsx", Enums.BrowserType.Chrome);
        instance.runKeywordDrivenTests();
    }
    
    @Test
    public void RunMixTelematicsCheckDiagnosticWindowLoadInfoTestPackFireFox() throws FileNotFoundException
    {
        System.out.println("Mix Telematics Test Pack");   
        instance = new TestMarshall("TestPacks\\CheckDiagnosticWindowLoadInfoTestPack.xls", Enums.BrowserType.FireFox);
        instance.runKeywordDrivenTests();
    }
}
