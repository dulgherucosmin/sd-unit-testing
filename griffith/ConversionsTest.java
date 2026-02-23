// Dulgheru Cosmin Alexandru 3161052
package griffith;

import org.junit.Test;
import static org.junit.Assert.*;

public class ConversionsTest {

    Conversions converter = new Conversions();

    @Test
    public void euroToDollarTest() {
        // positive tests
        assertEquals(11.79, converter.euroToDollar(10), 1e-6);
        assertEquals(23.58, converter.euroToDollar(20), 1e-6);
        assertEquals(117.9, converter.euroToDollar(100), 1e-6);

        // negative tests
        assertEquals(-1, converter.euroToDollar(10), 1e-6);
        assertEquals(-1, converter.euroToDollar(30), 1e-6);
        assertEquals(-1, converter.euroToDollar(45), 1e-6);

        // 0 tests
        assertEquals(0, converter.euroToDollar(5), 1e-6);
        assertEquals(0, converter.euroToDollar(25), 1e-6);
        assertEquals(0, converter.euroToDollar(50), 1e-6);
    }
}