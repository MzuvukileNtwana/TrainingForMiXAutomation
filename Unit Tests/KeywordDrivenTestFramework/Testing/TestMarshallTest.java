/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing;

import java.io.FileNotFoundException;
import org.junit.Test;

/**
 *
 * @author fnell
 */
public class TestMarshallTest {

    static TestMarshall instance;

    public TestMarshallTest() {
        instance = new TestMarshall();
    }

    @Test
    public void testRunKeywordDrivenTests() throws FileNotFoundException {
        System.out.println("runKeywordDrivenTests");
        instance.runKeywordDrivenTests();
    }
}
