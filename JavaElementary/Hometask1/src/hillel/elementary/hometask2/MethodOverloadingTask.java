package hillel.elementary.hometask2;

/**
 * Task 5: Airplanes. Method overloading
 * <p>
 * Description:
 * An airline manufactures three types of airplanes:
 * <p>
 * 1) Fighter jets — do not have passenger seats.
 * 2) Passenger airplanes (type 1) — have economy class seats only.
 * 3) Passenger airplanes (type 2) — have both economy and business class seats.
 * <p>
 * It is required to implement three overloaded methods with the same name
 * printAirplaneInfo(), each of which prints information about an airplane.
 * <p>
 * Method overloads must differ by the number of input parameters:
 * <p>
 * - printAirplaneInfo(String model, String type)
 * - printAirplaneInfo(String model, String type, int economySeats)
 * - printAirplaneInfo(String model, String type, int economySeats, int businessSeats)
 * <p>
 * Output examples:
 * <p>
 * Type: Jet, model: F-22 Raptor
 * Type: Airliner, model: Airbus 737, economy seats: 120
 * Type: Airliner, model: Boeing 777, economy seats: 180, business seats: 28
 * <p>
 * The program should demonstrate the work of all three methods.
 *
 * @author Nikolay Katrosha
 * @version 1.0
 */

public class MethodOverloadingTask {
    public static void main(String[] args) {
        printAirplaneInfo("Jet", "F-22 Raptor");
        printAirplaneInfo("Airliner", "Airbus 737", 120);
        printAirplaneInfo("Airliner", "Boeing 777", 180, 28);
    }

    public static void printAirplaneInfo(String type, String model) {
        System.out.printf("Type: %s, model: %s%n", type, model);
    }

    public static void printAirplaneInfo(String type, String model, int economySeats) {
        System.out.printf("Type: %s, model: %s, economy seats: %d%n", type, model, economySeats);
    }

    public static void printAirplaneInfo(String type, String model, int economySeats, int businessSeats) {
        System.out.printf("Type: %s, model: %s, economy seats: %d, business seats: %d%n", type, model, economySeats, businessSeats);
    }

}
