package hillel.elementary.hometask1;

/**
 * Task 2: Display Coordinates
 *
 * Description:
 * Create two variables to store the latitude and longitude of your current location
 * or any famous landmark in the world. The program should print these coordinates
 * to the console.
 *
 * Example output:
 * Location coordinates:
 * Latitude: 48.8584
 * Longitude: 2.2945
 *
 * @author Nikolay Katrosha
 * @version 1.0
 */
public class DisplayCoordinatesTask {
    public static void main(String[] args) {
        createCoordinates(40.234023, 10.3249);
    }

    public static void createCoordinates(double latitude, double longitude) {
        if (latitude >= -90 && latitude <= 90 && longitude >= -180 && longitude <= 180) {
            System.out.println("Your coordinates are: \nLatitude: " + latitude +
                    "\nLongitude: " + longitude);
        } else {
            System.out.println("The provided coordinates are not valid. " +
                    "Please double check provided data");
        }
    }
}
