package Exception;

import java.util.ArrayList;

public class TryAndCatch {
    public static void main(String[] args) {
        try{
            ArrayList<String> names = new ArrayList<>();
            names.add("Balerion");
            names.add("Arrax");
            names.add("Syrax");
            names.add("Vhagar");

            System.out.println(names);

            System.out.println(names.get(0));
            System.out.println("The size is: " + names.size());

            names.add("Moondancer");
            System.out.println(names.get(4));
            System.out.println("The size is: " + names.size());

        } catch(Exception ex){
            System.out.println("You are trying to access the index which is not present in the list.");

        } finally{ 
            display();
        }
    }

    public static void display(){
        System.out.println("The program has ended successfully.");
    }
}
