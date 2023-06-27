import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorBasicTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("Should Add Mixed Input Number Types")
    void shouldAddMixedInputNumberTypes() {
        int firstInput = 1;
        double secondInput = 1.1d;
        float thirdInput = 1.1f;
        long fourthInput = 1L;
        short fifthInput = 1;
        byte sixthInput = 1;

        Number actualResult = CalculatorBasic.sum(firstInput, secondInput, thirdInput, fourthInput, fifthInput, sixthInput);

        Number expectedResult = 6.2;

        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Should Add Negative And Positive Numbers")
    void shouldAddNegativeAndPositiveNumbers() {
        double firstInput = -5;
        double secondInput = 3;

        double actualResult = CalculatorBasic.sum(firstInput, secondInput);

        double expectedResult = -2.0;

        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Should Subtract Mixed Input Number Types")
    void shouldSubtractMixedInputNumberTypes() {
        int firstInput = 1;
        double secondInput = 1.1d;
        float thirdInput = 1.1f;
        long fourthInput = 1L;
        short fifthInput = 1;
        byte sixthInput = 1;

        Number actualResult = CalculatorBasic.subtraction(firstInput, secondInput, thirdInput, fourthInput, fifthInput, sixthInput);

        Number expectedResult = -4.2;

        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Should Subtract Negative And Positive Numbers")
    void shouldSubtractNegativeAndPositiveNumbers() {
        double firstInput = -5;
        double secondInput = 3;

        double actualResult = CalculatorBasic.subtraction(firstInput, secondInput);

        double expectedResult = -8.0;

        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Should Multiply Mixed Input Number Types")
    void shouldMultiplyMixedInputNumberTypes() {
        int firstInput = 2;
        double secondInput = 1.2d;
        float thirdInput = 2.1f;
        long fourthInput = 2L;
        short fifthInput = 2;
        byte sixthInput = 2;

        Number actualResult = CalculatorBasic.multiply(firstInput, secondInput, thirdInput, fourthInput, fifthInput, sixthInput);

        Number expectedResult = 40.32;

        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Should Multiply Negative Number With Positive Number Return Negative")
    void shouldMultiplyNegativeNumberWithPositiveNumberReturnNegative() {
        double firstInput = -5;
        double secondInput = 3;

        double actualResult = CalculatorBasic.multiply(firstInput, secondInput);

        double expectedResult = -15.0;

        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Should Divide Mixed Input Number Types")
    void shouldDivideMixedInputNumberTypes() {
        int firstInput = 2;
        double secondInput = 1.2d;
        float thirdInput = 2.1f;
        long fourthInput = 2L;
        short fifthInput = 2;
        byte sixthInput = 2;

        Number actualResult = CalculatorBasic.divide(firstInput, secondInput, thirdInput, fourthInput, fifthInput, sixthInput);

        Number expectedResult = 0.1;

        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Should Divide Two Negative Numbers Return Positive")
    void shouldDivideTwoNegativeNumbersReturnPositive() {
        int firstInput = -15;
        int secondInput = -3;

        double actualResult = CalculatorBasic.divide(firstInput, secondInput);

        double expectedResult = 5;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Should Divide By Zero Return Exception")
    void shouldDivideByZeroReturnException() {
        int firstInput = 5;
        int secondInput = 0;

        assertThrows(ArithmeticException.class, () -> CalculatorBasic.divide(firstInput, secondInput));
    }

    @Test
    @DisplayName("Should Circle Area Negative Radius Return Exception")
    void shouldCircleAreaNegativeRadiusReturnException() {
        double input = -2.4;

        assertThrows(RuntimeException.class, () -> CalculatorBasic.circleArea(input));
    }

    @Test
    @DisplayName("Should Return 1 When Exponent 0")
    void shouldReturn1WhenExponent0() {
        int base = 2;
        int exponentZero = 0;

        double actualResult = CalculatorBasic.powerOfANumber(base, exponentZero);
        double expectedResult = 1;

        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Should Return Power Of A Number When Exponent Positive")
    void shouldReturnPowerOfANumberWhenExponentPositive() {
        int firstInput = 2;
        int secondInput = 3;

        double actualResult = CalculatorBasic.powerOfANumber(firstInput, secondInput);
        double expectedResult = 8;

        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Should Return Power Of A Number When Exponent Is Negative")
    void shouldReturnPowerOfANumberWhenExponentNegative() {
        int firstInput = 2;
        int secondInput = -2;

        double actualResult = CalculatorBasic.powerOfANumber(firstInput, secondInput);
        double expectedResult = 0.25;

        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Should Get Percentage From Whole")
    void shouldGetPercentageFromWhole() {
        double firstInput = 68;
        double secondInput = 12;

        double actualResult = CalculatorBasic.percentage(firstInput, secondInput);
        double expectedResult = 8.16;

        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Should Percentage Return 0 When Input 0")
    void shouldPercentageReturn0WhenInput0() {
        double firstInput = 12;
        double secondInput = 0;

        double actualResult = CalculatorBasic.percentage(firstInput,secondInput);
        double expectedResult = 0;

        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Should Round Number To Two Decimals")
    void shouldRoundNumberToTwoDecimals() {
        double input = 1.9876;

        double actualResult = CalculatorBasic.roundNumberToTwoDecimals(input);
        double expectedResult = 1.99;

        assertEquals(expectedResult, actualResult);
    }
}