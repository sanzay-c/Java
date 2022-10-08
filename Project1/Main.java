import java.util.ArrayList;

public class Main { 
    public static void main(String[] args) {
        ArrayList<String> features = new ArrayList<String>();
        features.add("Blind spot monitor, Anti-lock braking system, Cruise control. \n");
        // features.add("Anti-lock braking system");
        // features.add("Cruise control");
        Car audi = new Car("Audi E-tron", "Audi", 5, "2019", features);
        //audi.display();
        features.clear();

        features.add("Panoramic Sunroof, Airbag, Forward collision warning, Backup camera. \n");
        Car mercedes = new Car("Mercedes G-Wagon", "Mercedes-Benz", 6, "2020", features);
        //mercedes.display();
        features.clear();

        features.add("Automatic Climate control, Fog light-Front, Forward collision warning \n");
        Car rollsRoyce = new Car("Rolls-Royce Phantom", "Rolls-Royce", 8, "2022", features);
        //rollsRoyce.display();

        ArrayList<Car> cars = new ArrayList<Car>();
        cars.add(audi);
        cars.add(rollsRoyce);

        Showroom abcd = new Showroom("ABCD", "Tinkune, Kathmandu", "10:00 AM", "7:00 PM", cars);
        abcd.display();
        cars.clear();

        cars.add(mercedes);
        Showroom xyz = new Showroom("XYZ", "Baneshwor, Kathmandu", "10:00 AM", "6:00 PM", cars);
        xyz.display();
    }
}