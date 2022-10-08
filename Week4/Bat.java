public class Bat extends Mammal{    
    private int wings;

    public Bat(String name, int age, double lifespan, String color, int wings) {
        super(name, age, lifespan, color);
        this.wings = wings;
    }

    public int getWings() {
        return wings;
    }

    public void setWings(int wings) {
        this.wings = wings;
    }

    public void display() {
        System.out.println("The name of the bat is "+super.getName());
        System.out.println("The wings are "+wings);
    }
}