class Address {
    String country;
    String city;
    int pin;

    Address(String country, String city, int pin) {
        this.country = country;
        this.city = city;
        this.pin = pin;
    }

}

class Student {
    String name;
    int roll;
    Address add;

    void set(String name, int roll, Address add) {
        this.name = name;
        this.roll = roll;
        this.add = add;
    }

    void display() {
        System.out.println("The name of Student is " + name);
        System.out.println("The roll no. is " + roll);
        System.out.println("And the address is " + add.country+" "+add.city+" "+add.pin);
    }
}

public class Aggregation {
    public static void main(String[] args) {
        Address add = new Address("india", "Manipal", 8511);
        Student s1 = new Student();
        s1.set("Rahul", 054, add);

        s1.display();
    }

}