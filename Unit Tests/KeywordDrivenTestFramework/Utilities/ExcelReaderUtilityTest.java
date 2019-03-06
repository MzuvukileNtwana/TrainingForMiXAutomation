/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Utilities;

import KeywordDrivenTestFramework.Entities.TestEntity;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertNotNull;

/**
 *
 * @author fnell
 */
public class ExcelReaderUtilityTest 
{
    
    public ExcelReaderUtilityTest() 
    {
        ApplicationConfig appConfig;
    }

    @Test
    public void testGetTestDataFromExcelFile() {
        System.out.println("getTestDataFromExcelFile");
        String filePath = ApplicationConfig.InputFileName();
        ExcelReaderUtility instance = new ExcelReaderUtility();
        List expResult = null;
        List result = instance.getTestDataFromExcelFile(filePath);
        
        assertNotNull("The data retrieved from the spreadsheet was null", result);
        TestEntity testData = (TestEntity)result.get(0);
        System.out.println("First Test Retrieved: ");
        System.out.println("Test Method: "+testData.TestMethod);
        System.out.println("Parameters: " + testData.TestParameters.toString());
        System.out.println("End of test: Success");
       
    }
}