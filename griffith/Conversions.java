// Dulgheru Cosmin Alexandru 3161052
package griffith;

public class Conversions {

    private final double EURO_TO_DOLLAR = 1.18;
    private final double DOLLAR_TO_EURO = 0.85;

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
            return Math.round(euro * EURO_TO_DOLLAR * 100.00) / 100.00;
        }
    }

    public double dollarToEuro(double dollar) {
        // negative values always fail
        if (dollar < 0.0) { 
            return -1.0; 
 
        // 0 will always be converted to 0
        } else if (dollar == 0.0) { 
            return 0.0;

        // default functionality
        } else {
            // return to 2 dp
            return Math.round(dollar * DOLLAR_TO_EURO * 100.00) / 100.00;
        }
    }

    public int stringToInteger(String val) {

        // string value cannot be null
        if (val == null) {
            throw new IllegalArgumentException();
        }

        try {
            return Integer.parseInt(val);
        // string is not a valid integer
        } catch (NumberFormatException e) {
            return 0; 
        }
    }

    public String integerToString(int val) {
        return "";
    }

    public String switchCase(String val) {
        return "";
    }
}