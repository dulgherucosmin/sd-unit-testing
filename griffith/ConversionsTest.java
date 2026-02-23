// Dulgheru Cosmin Alexandru 3161052
package griffith;

import org.junit.Test;
import static org.junit.Assert.*;

public class ConversionsTest {

    Conversions converter = new Conversions();

    @Test
    public void euroToDollarTest() {
        // positive tests
        assertEquals(11.8, converter.euroToDollar(10), 1e-6);
        assertEquals(23.6, converter.euroToDollar(20), 1e-6);
        assertEquals(118.0, converter.euroToDollar(100), 1e-6);

        // negative tests
        assertEquals(-1.0, converter.euroToDollar(-10), 1e-6);
        assertEquals(-1.0, converter.euroToDollar(-30), 1e-6);
        assertEquals(-1.0, converter.euroToDollar(-45), 1e-6);

        // 0 tests
        assertEquals(0, converter.euroToDollar(0), 1e-6);
        assertEquals(0, converter.euroToDollar(0), 1e-6);
        assertEquals(0, converter.euroToDollar(0), 1e-6);
    }

    @Test
    public void dollarToEuroTest() {
        // positive tests
        assertEquals(8.5, converter.dollarToEuro(10), 1e-6);
        assertEquals(25.5, converter.dollarToEuro(30), 1e-6);
        assertEquals(85.0, converter.dollarToEuro(100), 1e-6);

        // negative tests
        assertEquals(-1.0, converter.euroToDollar(-5), 1e-6);
        assertEquals(-1.0, converter.euroToDollar(-10), 1e-6);
        assertEquals(-1.0, converter.euroToDollar(-25), 1e-6);

        // 0 tests
        assertEquals(0, converter.euroToDollar(0), 1e-6);
    }

    @Test
    public void stringToIntegerTest() {
        // positive tests
        assertEquals(5, converter.stringToInteger("5"));
        assertEquals(20, converter.stringToInteger("20"));
        assertEquals(1000, converter.stringToInteger("1000"));

        // negative tests
        assertEquals(-5, converter.stringToInteger("-5"));
        assertEquals(-20, converter.stringToInteger("-20"));
        assertEquals(-1000, converter.stringToInteger("-1000"));

        // 0 test
        assertEquals(0, converter.stringToInteger("0"));
    }

    @Test(expected=IllegalArgumentException.class)
    public void stringToIntegerTestNull() {
        assertNull(converter.stringToInteger(null));
    }

    @Test
    public void integerToStringTest() {
        // positive tests
        assertEquals("10", converter.integerToString(10));
        assertEquals("250", converter.integerToString(250));
        assertEquals("10000", converter.integerToString(10000));

        // negative tests
        assertEquals("-10", converter.integerToString(-10));
        assertEquals("-250", converter.integerToString(-250));
        assertEquals("-10000", converter.integerToString(-10000));

        // 0 test
        assertEquals("0", converter.integerToString(0));
    }

    @Test
    public void switchCaseTest() {
        // test 1
        String test1 = "testWORD";
        Conversions conv1 = new Conversions(test1);
        assertEquals("TESTword", conv1.switchCase());

        // test 2
        String test2 = "aA";
        Conversions conv2 = new Conversions(test2);
        assertEquals("Aa", conv2.switchCase());

        // test 3
        String test3 = "switchCASEtesting";
        Conversions conv3 = new Conversions(test3);
        assertEquals("SWITCHcaseTESTING", conv3.switchCase());

        // test 4
        String test4 = "test SPACES";
        Conversions conv4 = new Conversions(test4);
        assertEquals("TEST spaces", conv4.switchCase());

    }

    @Test(expected=IllegalArgumentException.class)
    public void switchCaseTestNull() {
        assertNull(new Conversions(null));
    }
}