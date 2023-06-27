import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorConvertorTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("Should Convert Celsius To Kelvin")
    void shouldConvertCelsiusToKelvin() {
        double input = 32.5;

        double actualResult = CalculatorConvertor.convertCelsiusToKelvin(input);
        double expectedResult = 305.65;

        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Should Convert Celsius To Fahrenheit")
    void shouldConvertCelsiusToFahrenheit() {
        double input = 32.5;

        double actualResult = CalculatorConvertor.convertCelsiusToFahrenheit(input);
        double expectedResult = 90.5;

        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Should Throw Error When Input Lower Than Zero Absolut Celsius")
    void shouldThrowErrorWhenInputZeroAbsolutCelsius() {
        double input = -274.15;

        assertThrows(RuntimeException.class, () -> CalculatorConvertor.convertCelsiusToFahrenheit(input));
    }

    @Test
    @DisplayName("Should Convert Fahrenheit To Kelvin")
    void shouldConvertFahrenheitToKelvin() {
        double input = 32.5;

        double actualResult = CalculatorConvertor.convertFahrenheitToKelvin(input);
        double expectedResult = 273.43;

        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Should Convert Fahrenheit To Celsius")
    void shouldConvertFahrenheitToCelsius() {
        double input = 60;

        double actualResult = CalculatorConvertor.convertFahrenheitToCelsius(input);
        double expectedResult = 15.56;

        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Should Throw Error When Input Lower Than Zero Absolut Fahrenheit")
    void shouldThrowErrorWhenInputZeroAbsolutFahrenheit() {
        double invalidInput = -469.67;

        assertThrows(RuntimeException.class, () -> CalculatorConvertor.convertFahrenheitToCelsius(invalidInput));
    }

    @Test
    @DisplayName("Should Convert Kelvin To Fahrenheit")
    void shouldConvertKelvinToFahrenheit() {
        double input = 332.5;

        double actualResult = CalculatorConvertor.convertKelvinToFahrenheit(input);
        double expectedResult = 138.83;

        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Should Convert Kelvin To Celsius")
    void shouldConvertKelvinToCelsius() {
        double input = 332;

        double actualResult = CalculatorConvertor.convertKelvinToCelsius(input);
        double expectedResult = 58.85;

        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Should Throw Error When Input Lower Than Zero Absolut Kelvin")
    void shouldThrowErrorWhenInputZeroAbsolutKelvin() {
        double input = -2;

        assertThrows(RuntimeException.class, () -> CalculatorConvertor.convertKelvinToCelsius(input));
    }
}