package StringAssignment;

import java.util.Scanner;

public class ToUpperCase{
    public static void main(String[] args) {
        display();
    }

    public static void display(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Name: " + name.toUpperCase());

        System.out.print("Enter address: ");
        String address = sc.nextLine();
        System.out.println("Address: " + address.toUpperCase());

        System.out.print("Enter Nation: ");
        String nation = sc.nextLine();
        System.out.println("Nation: " + nation.toUpperCase());

        sc.close();
    }
}