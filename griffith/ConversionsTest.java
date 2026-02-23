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
}