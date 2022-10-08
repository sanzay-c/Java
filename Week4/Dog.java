public class Dog extends Mammal {

    private String breed;

    public Dog(String name, int age, double lifespan, String color, String breed) {
        super(name, age, lifespan, color);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void display() {
        super.display();
        System.out.println("The breed is "+ breed);
    }  
}