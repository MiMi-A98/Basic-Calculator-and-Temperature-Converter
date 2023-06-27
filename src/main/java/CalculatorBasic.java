public class CalculatorBasic {

    static double sum(double... numbers) {
        double result = 0.0;
        for (double i : numbers) {
            result += i;
        }
        return roundNumberToTwoDecimals(result);
    }

    static double subtraction(double... numbers) {
        double result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result -= numbers[i];
        }
        return roundNumberToTwoDecimals(result);
    }

    static double multiply(double... numbers) {
        double result = 1;
        for (double i : numbers) {
            result *= i;
        }
        return roundNumberToTwoDecimals(result);
    }

    static double divide(double... numbers) {
        double result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                throw new ArithmeticException("This operation does not support division by 0");
            }
            result /= numbers[i];
        }
        return roundNumberToTwoDecimals(result);
    }

    static double circleArea(double radius) {
        double pi = 3.14;
        if (radius <= 0) {
            throw new RuntimeException("This operation does not support a radius that is equal or less than 0");
        }
        double result = pi * (radius * radius);
        return roundNumberToTwoDecimals(result);
    }

    static double powerOfANumber(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }

        double result = 1;
        int power = exponent < 0 ? -exponent : exponent;

        for (int i = 0; i < power; i++) {
            result *= base;
        }

        if (exponent < 0) {
            result = 1 / result;
        }

        return result;
    }

    static double percentage(double number, double percentage) {
        if (number == 0 || percentage == 0) {
            return 0;
        } else {

            double result = (percentage / 100) * number;
            return roundNumberToTwoDecimals(result);

        }
    }

    static double roundNumberToTwoDecimals(double number) {
        double result = (int) (number * 1000);
        int remainder = (int) (result % 10);

        if (remainder >= 5) {
            result = result + 10;
        }

        result = (int) (result / 10);
        result = result / 100;

        return result;
    }

}
