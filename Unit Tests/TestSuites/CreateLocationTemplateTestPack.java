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
public class CreateLocationTemplateTestPack {
    
    static TestMarshall instance;
    
    public CreateLocationTemplateTestPack()
    {
        ApplicationConfig appConfig = new ApplicationConfig();
        
        instance.currentEnvironment = Enums.Environment.INT;  
    }
     
    @Test
    public void RunMixTelematicsCreateLocationTemplateTestPackIE() throws FileNotFoundException
    {
        System.out.println("Mix Telematics Test Pack");   
        instance = new TestMarshall("TestPacks\\CreateLocationTemplateTestPack.xls", Enums.BrowserType.IE);
        instance.runKeywordDrivenTests();
    }
 
    @Test
    public void RunMixTelematicsCreateLocationTemplateTestPackChrome() throws FileNotFoundException
    {
        System.out.println("Mix Telematics Test Pack");   
        instance = new TestMarshall("TestPacks\\CreateLocationTemplateTestPack.xlsx", Enums.BrowserType.Chrome);
        instance.runKeywordDrivenTests();
    }
    
    @Test
    public void RunMixTelematicsCreateLocationTemplateTestPackFireFox() throws FileNotFoundException
    {
        System.out.println("Mix Telematics Test Pack");   
        instance = new TestMarshall("TestPacks\\CreateLocationTemplateTestPack.xls", Enums.BrowserType.FireFox);
        instance.runKeywordDrivenTests();
    }
}
