package hillel.elementary.hometask1;

import java.text.DecimalFormat;

import static java.lang.Math.*;

/**
 * Task 4: Calculate the mass of a snowman
 * <p>
 * Description:
 * A snowman is built from three perfectly spherical snowballs.
 * The radii of the snowballs are 1.0 m, 0.5 m, and 0.2 m.
 * The density coefficient of the snow is 0.7 kg/m³.
 * Using the formula for the volume of a sphere, calculate the total mass of the snowman.
 * <p>
 * Notes:
 * Volume of a sphere: V = (4/3) * π * r³
 * Mass = density * volume
 *
 * @author Nikolay Katrosha
 * @version 1.0
 */
public class SnowmanTask {
    static final double DENSITY = 0.7;
    static final DecimalFormat NEW_FORMAT = new DecimalFormat("#.###");

    public static void main(String[] args) {
        double result = calculateSnowmanMass(1.0, 0.5, 0.2);
        System.out.println("The calculated mass of the snowman is: " + NEW_FORMAT.format(result));
    }

    public static double calculateSnowmanMass(double radiusTop, double radiusMiddle, double radiusBottom) {
        return calculateSnowballMass(radiusTop) + calculateSnowballMass(radiusMiddle) + calculateSnowballMass(radiusBottom);
    }

    public static double calculateSnowballMass(double radius) {
        return (calculateSnowballVolume(radius) * DENSITY);
    }

    public static double calculateSnowballVolume(double radius) {


        return (4.0 / 3.0) * PI * pow(radius, 3);
    }
}
