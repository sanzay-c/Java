package Abstraction;

public class Penguin implements Bird {
    public void eat(){
        System.out.println("The penguin is eating.");
    }
    
    public void sleep(){
        System.out.println("The penguin is sleeping.");
    }
    
    public void run(){
        System.out.println("The penguin is running.");
    }
}