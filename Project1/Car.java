import java.util.ArrayList;

public class Car {
    public String name;
    public String brand;
    public int gears;
    public String manufacturedDate;
    public ArrayList<String> features;

    public Car(String name, String brand, int gears, String manufacturedDate, ArrayList<String> features){
        this.name = name;
        this.brand = brand;
        this.gears = gears;
        this.manufacturedDate = manufacturedDate;
        this.features = features;
    }

    public void display(){
        System.out.println("The name of the Car is: " + name);
        System.out.println("The brand of the Car is: " + brand);
        System.out.println("The gears of the Car is: " + gears);
        System.out.println("The manufacturedDate of the Car is: " + manufacturedDate);

        for (String feature : features){
            System.out.println("The features of the Car are: " + feature);
        }
    }
}