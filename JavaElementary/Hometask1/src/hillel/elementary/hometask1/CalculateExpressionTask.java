package hillel.elementary.hometask1;

import static java.lang.Math.*;

/**
 * Task 3: Calculate a mathematical expression
 * <p>
 * Description:
 * This program calculates the result of the following mathematical expression:
 * <p>
 * |a - b| / (a + b)³ - √c
 * <p>
 * where:
 * - a, b, c are real numbers;
 * - |a - b| represents the absolute difference between a and b;
 * - √c represents the square root of c.
 * <p>
 * Notes:
 * - The denominator (a + b)³ must not be zero.
 * - The value of c must be non-negative.
 * <p>
 * The program prints the calculated result to the console.
 *
 * @author Nikolay Katrosha
 * @version 1.0
 */
public class CalculateExpressionTask {
    public static void main(String[] args) {
        double result =calculateExpression(0, 1, 1);
        System.out.println("The result = " + result);
    }

    public static double calculateExpression(double a, double b, double c) {
        if ((a + b == 0) || c < 0) {
            throw new IllegalArgumentException("Invalid expression");
        }

        return (abs(a - b) / pow((a + b), 3)) - sqrt(c);
    }
}
