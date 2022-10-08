import java.util.ArrayList;

public class Human extends Mammal{

    private String address;
    private ArrayList<String> skills;

    public Human(String name, int age, double lifespan, String color, String address, ArrayList<String> skills) {
        super(name, age, lifespan, color);
        this.address = address;
        this.skills = skills;
    }

    public String getAddress() {
        return address;
    }

    public ArrayList<String> getSkills() {
        return skills;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSkills(ArrayList<String> skills) {
        this.skills = skills;
    }

    public void display() {
        super.display();
        System.out.println("The address is "+address);
        String personSkills = "";
        for(String skill: skills) {
            personSkills = personSkills + skill + ", ";
        }
        System.out.println("The skills are "+personSkills+"etc." );
    }
}