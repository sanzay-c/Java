import java.util.ArrayList;

public class Showroom {
    public String name;
    public String address;
    public String openingTime;
    public String closingTime;
    public ArrayList<Car> cars;

    public Showroom(String name, String address, String openingTime, String closingTime, ArrayList<Car> cars){
        this.name = name;
        this.address = address;
        this.openingTime = openingTime;
        this.closingTime = closingTime;
        this.cars = cars;
    }

    public void display(){
        System.out.println("The name of the Showroom is: " + name);
        System.out.println("The address of the Showroom is: " + address);
        System.out.println("The openingtime of the Showroom is: " + openingTime);
        System.out.println("The closingtime of the Showroom is: " + closingTime);

        for(Car car : cars){
            car.display();
        }
    }
}