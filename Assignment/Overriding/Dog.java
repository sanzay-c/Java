package Assignment.Overriding;

public class Dog  implements Animal {

    @Override
    public void eat() {
        System.out.println("The dog is eating.");        
    }

    @Override
    public void run() {
        System.out.println("The dog is running.");
    }

    @Override
    public void sleep() {
        System.out.println("The dog is sleeping.");        
    }
    
}
