package hillel.elementary.hometask2.personTask;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Will", "Smith", "New York", "2936729462846");
        Person p2 = new Person("Jackie", "Chan", "Shanghai", "12312412412");
        Person p3 = new Person("Sherlock", "Holmes", "London", "37742123513");

        System.out.println(p1.personInfo());
        System.out.println(p2.personInfo());
        System.out.println(p3.personInfo());
    }
}
