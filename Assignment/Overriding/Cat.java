package Assignment.Overriding;

public class Cat implements Animal{

    @Override
    public void eat() {
        System.out.println("The cat is eating.");        
    }

    @Override
    public void run() {
        System.out.println("The cat is running.");
    }

    @Override
    public void sleep() {   
        System.out.println("The cat is sleeping.");
    }
    
}
