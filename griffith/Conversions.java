// Dulgheru Cosmin Alexandru 3161052
package griffith;

public class Conversions {

    public double euroToDollar(double euro) {
        // negative values always fail
        if (euro < 0.0) { 
            return -1.0; 
 
        // 0 will always be converted to 0
        } else if (euro == 0.0) { 
            return 0.0;

        // default functionality
        } else {
            // return to 2 dp
            return Math.round(euro * 1.18 * 100.00) / 100.00;
        }
    }

    public double dollarToEuro(double dollar) {
        return 0.0;
    }

    public int stringToInteger(String val) {
        return 0;
    }

    public String integerToString(int val) {
        return "";
    }

    public String switchCase(String val) {
        return "";
    }
}