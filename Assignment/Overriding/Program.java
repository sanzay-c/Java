package Assignment.Overriding;

public class Program {
    public static void main(String[] args) {
        Dog dog = new Dog();
        display(dog);

        Cat cat = new Cat();
        display(cat);

    }
    public static void display(Animal animal){
        animal.eat();
        animal.run();
        animal.sleep();
    }
}
