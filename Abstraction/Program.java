package Abstraction;

public class Program {
    public static void main(String[] args) {
        Eagle eagle = new Eagle();
        display(eagle);
        fly(eagle);

        Penguin penguin = new Penguin();
        display(penguin);
    }

    public static void display(Bird bird){
        bird.eat();
        bird.sleep();
        bird.run();
    }

    public static void fly(FlightFulBird flightfulbird){
        flightfulbird.fly();
    }
}