public class Mammal {
    private String name;
    private int age;
    private double lifespan;
    private String color;

    public Mammal(String name, int age, double lifespan, String color) {
        this.name = name;
        this.age = age;
        this.lifespan = lifespan;
        this.color = color;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public double getLifespan() {
        return lifespan;
    }
    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;

    }

    public void setLifespan(double lifespan) {
        this.lifespan= lifespan;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void display() {
        System.out.println("The name is "+name);
        System.out.println("The age is "+age);
        System.out.println("The lifespan is "+lifespan);
        System.out.println("The color is "+color);
    }
}