
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.*;

/**
 * The test class TestTalkingNumbers.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TestTalkingNumbers
{
    /**
     * Default constructor for test class TestTalkingNumbers
     */
    public TestTalkingNumbers()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
    
    @Test
    public void test_sayOneNine() {
        assertEquals("", TalkingNumbers.sayOneNine(0));
        assertEquals("", TalkingNumbers.sayOneNine(-1));
        assertEquals("", TalkingNumbers.sayOneNine(100));
        assertEquals("one", TalkingNumbers.sayOneNine(1));
        assertEquals("two", TalkingNumbers.sayOneNine(2));
        assertEquals("three", TalkingNumbers.sayOneNine(3));
        assertEquals("four", TalkingNumbers.sayOneNine(4));
        assertEquals("five", TalkingNumbers.sayOneNine(5));
        assertEquals("six", TalkingNumbers.sayOneNine(6));
        assertEquals("seven", TalkingNumbers.sayOneNine(7));
        assertEquals("eight", TalkingNumbers.sayOneNine(8));
        assertEquals("nine", TalkingNumbers.sayOneNine(9));
    }
    
    @Test
    public void test_sayTenNineteen() {
        assertEquals("", TalkingNumbers.sayTenNineteen(0));
        assertEquals("", TalkingNumbers.sayTenNineteen(-1));
        assertEquals("", TalkingNumbers.sayTenNineteen(1));
        assertEquals("ten", TalkingNumbers.sayTenNineteen(10));
        assertEquals("eleven", TalkingNumbers.sayTenNineteen(11));
        assertEquals("twelve", TalkingNumbers.sayTenNineteen(12));
        assertEquals("thirteen", TalkingNumbers.sayTenNineteen(13));
        assertEquals("fourteen", TalkingNumbers.sayTenNineteen(14));
        assertEquals("fifteen", TalkingNumbers.sayTenNineteen(15));
        assertEquals("sixteen", TalkingNumbers.sayTenNineteen(16));
        assertEquals("seventeen", TalkingNumbers.sayTenNineteen(17));
        assertEquals("eighteen", TalkingNumbers.sayTenNineteen(18));
        assertEquals("nineteen", TalkingNumbers.sayTenNineteen(19));
    }
    
    @Test
    public void test_sayTwentyNinety() {
        assertEquals("", TalkingNumbers.sayTwentyNinety(0));
        assertEquals("", TalkingNumbers.sayTwentyNinety(-11));
        assertEquals("", TalkingNumbers.sayTwentyNinety(15));
        assertEquals("twenty", TalkingNumbers.sayTwentyNinety(2));
        assertEquals("thirty", TalkingNumbers.sayTwentyNinety(3));
        assertEquals("forty", TalkingNumbers.sayTwentyNinety(4));
        assertEquals("fifty", TalkingNumbers.sayTwentyNinety(5));
        assertEquals("sixty", TalkingNumbers.sayTwentyNinety(6));
        assertEquals("seventy", TalkingNumbers.sayTwentyNinety(7));
        assertEquals("eighty", TalkingNumbers.sayTwentyNinety(8));
        assertEquals("ninety", TalkingNumbers.sayTwentyNinety(9));
    }
    
    @Test
    public void test_sayNumber() {
        assertEquals("zero", TalkingNumbers.sayNumber(0));
        assertEquals("nine-thousand nine-hundred ninety-nine", TalkingNumbers.sayNumber(9999));
        assertEquals("seventy-five", TalkingNumbers.sayNumber(75));
        assertEquals("seven", TalkingNumbers.sayNumber(7));
        assertEquals("seventy", TalkingNumbers.sayNumber(70));
        assertEquals("five-hundred thirteen", TalkingNumbers.sayNumber(513));
        assertEquals("one-hundred fifty-eight", TalkingNumbers.sayNumber(158));
        assertEquals("one-thousand three-hundred fifty-nine", TalkingNumbers.sayNumber(1359));
        assertEquals("one-thousand nine", TalkingNumbers.sayNumber(1009));
        assertEquals("two-thousand forty-two", TalkingNumbers.sayNumber(2042));
    }
}
