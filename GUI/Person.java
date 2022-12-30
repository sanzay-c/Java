package GUI;

public class Person {
    private int age;
    private String name;
    private String address;
    private String phoneNumber;

    public Person(int age, String name, String address, String phoneNumber) {
        this.age = age;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" + "Age: " + age + "\n"  + "Address: " + address + "\n" + "Phone Number: "+ phoneNumber ;
    }
}