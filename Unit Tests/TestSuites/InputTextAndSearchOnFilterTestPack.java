/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestSuites;

import KeywordDrivenTestFramework.Entities.Enums;
import KeywordDrivenTestFramework.Testing.TestMarshall;
import KeywordDrivenTestFramework.Utilities.ApplicationConfig;
import static TestSuites.Navigate_to_TemplateTestPack.instance;
import java.io.FileNotFoundException;
import org.junit.Test;



/**
 *
 * @author MsimeleloG
 */
public class InputTextAndSearchOnFilterTestPack {
    
    static TestMarshall instance;
    
    public InputTextAndSearchOnFilterTestPack()
    {
        ApplicationConfig appConfig = new ApplicationConfig();
        
        instance.currentEnvironment = Enums.Environment.INT;  
    }
     
    @Test
    public void RunMixTelematicsInputTextAndSearchOnFilterTestPackIE() throws FileNotFoundException
    {
        System.out.println("Mix Telematics Test Pack");   
        instance = new TestMarshall("TestPacks\\InputTextAndSearchOnFilterTestPack.xls", Enums.BrowserType.IE);
        instance.runKeywordDrivenTests();
    }
 
    @Test
    public void RunMixTelematicsInputTextAndSearchOnFilterTestPackChrome() throws FileNotFoundException
    {
        System.out.println("Mix Telematics Test Pack");   
        instance = new TestMarshall("TestPacks\\InputTextAndSearchOnFilterTestPack.xlsx", Enums.BrowserType.Chrome);
        instance.runKeywordDrivenTests();
    }
    
    @Test
    public void RunMixTelematicsInputTextAndSearchOnFilterTestPackFireFox() throws FileNotFoundException
    {
        System.out.println("Mix Telematics Test Pack");   
        instance = new TestMarshall("TestPacks\\InputTextAndSearchOnFilterTestPack.xls", Enums.BrowserType.FireFox);
        instance.runKeywordDrivenTests();
    }
}
