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
 * @author NicholasM
 */
public class Login_to_MyMiXTestPack 
{
    static TestMarshall instance; 
    
    public Login_to_MyMiXTestPack()
    {
        ApplicationConfig appConfig = new ApplicationConfig();
        TestMarshall.currentEnvironment = Enums.Environment.INT;    
    }
    @Test
    public void RunLogin_to_MyMiXTestPackIE() throws FileNotFoundException
    {
        System.out.println("MyMix : Login to MyMiX Web Page Test Pack");   
        instance = new TestMarshall("TestPacks\\Login_to_MyMiX.xlsx", Enums.BrowserType.IE);
        instance.runKeywordDrivenTests();
    }
    @Test
    public void RunLogin_to_MyMiXTestPackChrome() throws FileNotFoundException
    {
        System.out.println("MyMix : Login to MyMiX Web Page Test Pack");  
        instance = new TestMarshall("TestPacks\\Login_to_MyMiX.xlsx", Enums.BrowserType.Chrome);
        instance.runKeywordDrivenTests();
    }
    @Test
    public void RunLogin_to_MyMiXTestPackFireFox() throws FileNotFoundException
    {
        System.out.println("MyMix : Login to MyMiX Web Page Test Pack");  
        instance = new TestMarshall("TestPacks\\Login_to_MyMiX.xlsx", Enums.BrowserType.FireFox);
        instance.runKeywordDrivenTests();
    }
}
