package hillel.elementary.hometask2.personTask;
/**
 * Task: Person. String formatting
 *
 * Description:
 * Create a Person class and implement the method personInfo().
 *
 * The method must accept four parameters:
 *
 * 1) firstName (String) — person's first name
 * 2) lastName (String) — person's last name
 * 3) city (String) — person's city
 * 4) phone (String) — person's phone number
 *
 * Inside the method, form a string in the following format:
 *
 * Call citizen + FIRST_NAME LAST_NAME + from the city + CITY + at the number + PHONE
 *
 * The method must return a String.
 *
 * In the main method, make three calls to personInfo(), each time passing a new person.
 *
 * Output examples:
 *
 * Call citizen Will Smith from the city New York at the number 2936729462846.
 * Call citizen Jackie Chan from the city Shanghai at the number 12312412412.
 * Call citizen Sherlock Holmes from the city London at the number 37742123513.
 *
 * @author Nikolay Katrosha
 * @version 1.0
 */

public class Person {
    private final String firstName;
    private final String lastName;
    private final String city;
    private final String phone;

    public Person(String firstName, String lastName, String city, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.phone = phone;
    }

    public String personInfo() {
        return String.format(
                "Call citizen %s %s from the city %s at the number %s.",
                firstName, lastName, city, phone
        );
    }
}
