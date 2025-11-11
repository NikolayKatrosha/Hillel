package hillel.elementary.hometask1;

/**
 * Task 1: Swap Two Variables
 *
 * Description:
 * Given two integer variables a and b, the program prints their initial values,
 * swaps them using a temporary variable, and then prints the updated values.
 *
 * Example output:
 * Before swapping:
 * a = 10
 * b = 20
 *
 * After swapping:
 * a = 20
 * b = 10
 *
 * @author Nikolay Katrosha
 * @version 1.0
 */
public class SwapVariablesTask {

    public static void main(String[] args) {
        int firstValue = 10;
        int secondValue = 20;

        System.out.println("Before swapping:");
        System.out.println("firstValue = " + firstValue);
        System.out.println("secondValue = " + secondValue);

        int temp = firstValue;
        firstValue = secondValue;
        secondValue = temp;

        System.out.println("\nAfter swapping:");
        System.out.println("firstValue = " + firstValue);
        System.out.println("secondValue = " + secondValue);
    }
}
