package hillel.elementary.hometask2;

import java.util.Scanner;
import java.util.stream.DoubleStream;

/**
 * Task: Scholarship. Average grade calculation
 * <p>
 * Description:
 * Determine whether a student will receive an increased scholarship, a regular scholarship,
 * or no scholarship at all depending on their grades.
 * <p>
 * The user enters their grades for 5 subjects (any subjects) via the console.
 * <p>
 * Rules:
 * - For an increased scholarship, the average grade must be at least 10.
 * - For a regular scholarship, the average grade must be at least 8.
 * - Otherwise, the student receives no scholarship.
 * <p>
 * The program must output:
 * - the average grade
 * - which scholarship (if any) the student can receive
 *
 * @author Nikolay Katrosha
 * @version 1.0
 */


public class Scholarship {
    private static final int GRADES_AMOUNT = 5;
    private static final double MIN_GRADE = 1.0;
    private static final double MAX_GRADE = 12.0;
    private static final double INCREASED_THRESHOLD = 10.0;
    private static final double REGULAR_THRESHOLD = 8.0;

    public static void main(String[] args) {
        double[] grades = getUsersInput();
        double average = calculateAverage(grades);
        System.out.printf("The average of your grades is: %.2f%n", average);
        calculateScholarship(average);
    }

    public static double[] getUsersInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, provide your grades (space-separated), e.g. 10 9 8 7 6");
        double[] grades = new double[GRADES_AMOUNT];

        for (int i = 0; i < GRADES_AMOUNT; i++) {
            if (!scanner.hasNextDouble()) {
                throw new IllegalArgumentException("Provided input is invalid. Expected grade's value but got:" + scanner.next());
            }
            double value = scanner.nextDouble();
            if (value < MIN_GRADE || value > MAX_GRADE) {
                throw new IllegalArgumentException("Provided input is invalid. The possible values for grade is between 1 and 12 but you provided: " + value);
            }
            grades[i] = value;
        }
        return grades;
    }

    public static void calculateScholarship(double average) {
        System.out.print("Your scholarship is: ");
        if (average >= INCREASED_THRESHOLD) {
            System.out.println("Increased");
        } else if (average >= REGULAR_THRESHOLD) {
            System.out.println("Regular");
        } else {
            System.out.println("Absent");
        }
    }


    public static double calculateAverage(double[] grades) {
        return DoubleStream.of(grades).sum() / grades.length;
    }
}
