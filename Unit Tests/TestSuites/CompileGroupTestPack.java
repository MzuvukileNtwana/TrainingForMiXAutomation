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
 * @author fnell
 */
public class CompileGroupTestPack{
    static TestMarshall instance; 
    
     public CompileGroupTestPack()
    {
        ApplicationConfig appConfig = new ApplicationConfig();
        
        instance.currentEnvironment = Enums.Environment.INT;  
    }
     
    @Test
    public void RunMixTelematicsCreateConfigGroupTestPackIE() throws FileNotFoundException
    {
        System.out.println("Mix Telematics Test Pack");   
        instance = new TestMarshall("TestPacks\\NavigateAndEditLocationTestPack.xls", Enums.BrowserType.IE);
        instance.runKeywordDrivenTests();
    }
 
    @Test
    public void RunMixTelematicsCreateConfigGroupTestPackChrome() throws FileNotFoundException
    {
        System.out.println("Mix Telematics Test Pack");   
        instance = new TestMarshall("TestPacks\\CompileConfigTestPack.xlsx", Enums.BrowserType.Chrome);
        instance.runKeywordDrivenTests();
    }
    
    @Test
    public void RunMixTelematicsCreateConfigGroupTestPackFireFox() throws FileNotFoundException
    {
        System.out.println("Mix Telematics Test Pack");   
        instance = new TestMarshall("TestPacks\\NavigateAndEditLocationTestPack.xlsx", Enums.BrowserType.FireFox);
        instance.runKeywordDrivenTests();
    }
    
}
