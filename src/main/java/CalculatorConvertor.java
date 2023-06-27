public class CalculatorConvertor {

    private static final double CELSIUS_ABSOLUTE_ZERO = -273.15;
    private static final double KELVIN_ABSOLUTE_ZERO = 0;
    private static final double FAHRENHEIT_ABSOLUTE_ZERO = -459.67;


    static double convertCelsiusToKelvin(double degrees) {
        validate(degrees, CELSIUS_ABSOLUTE_ZERO);
        double result = degrees + 273.15;
        return CalculatorBasic.roundNumberToTwoDecimals(result);
    }

    static double convertCelsiusToFahrenheit(double degrees) {
        validate(degrees, CELSIUS_ABSOLUTE_ZERO);
        double result = (degrees * 1.8) + 32;
        return CalculatorBasic.roundNumberToTwoDecimals(result);

    }

    static double convertFahrenheitToKelvin(double degrees) {
        validate(degrees, FAHRENHEIT_ABSOLUTE_ZERO);
        double result = (degrees + 459.67) * 5 / 9;
        return CalculatorBasic.roundNumberToTwoDecimals(result);
    }

    static double convertFahrenheitToCelsius(double degrees) {
        validate(degrees, FAHRENHEIT_ABSOLUTE_ZERO);
        double result = (degrees - 32) * 5 / 9;
        return CalculatorBasic.roundNumberToTwoDecimals(result);
    }

    static double convertKelvinToFahrenheit(double degrees) {
        validate(degrees, KELVIN_ABSOLUTE_ZERO);
        double result = (degrees - 273.15) * 1.8 + 32;
        return CalculatorBasic.roundNumberToTwoDecimals(result);
    }

    static double convertKelvinToCelsius(double degrees) {
        validate(degrees, KELVIN_ABSOLUTE_ZERO);
        double result = degrees - 273.15;
        return CalculatorBasic.roundNumberToTwoDecimals(result);
    }

    private static void validate(double degrees, double absoluteZero) {
        if (degrees < absoluteZero) {
            throw new RuntimeException("Can't have a value lower than " + absoluteZero);
        }
    }

}
