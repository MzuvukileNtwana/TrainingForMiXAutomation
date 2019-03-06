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
public class NavigateAndSearchTestPack 
{
    static TestMarshall instance; 
    
     public NavigateAndSearchTestPack()
    {
        ApplicationConfig appConfig = new ApplicationConfig();
        
        instance.currentEnvironment = Enums.Environment.INT;  
    }
     
    @Test
    public void RunMixTelematicsNavivgateAndSearchTestPackIE() throws FileNotFoundException
    {
        System.out.println("Mix Telematics Test Pack");   
        instance = new TestMarshall("TestPacks\\NavigateToLibrariesTestPack.xls", Enums.BrowserType.IE);
        instance.runKeywordDrivenTests();
    }
 
    @Test
    public void RunMixTelematicsNavivgateAndSearchTestPackChrome() throws FileNotFoundException
    {
        System.out.println("Mix Telematics Test Pack");   
        instance = new TestMarshall("TestPacks\\NavigateAndSearchTestPack.xlsx", Enums.BrowserType.Chrome);
        instance.runKeywordDrivenTests();
    }
    
    @Test
    public void RunMixTelematicsNavivgateAndSearchTestPackFireFox() throws FileNotFoundException
    {
        System.out.println("Mix Telematics Test Pack");   
        instance = new TestMarshall("TestPacks\\NavigateToLibrariesTestPack.xlsx", Enums.BrowserType.FireFox);
        instance.runKeywordDrivenTests();
    }
    
}
