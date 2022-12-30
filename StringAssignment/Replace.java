package StringAssignment;

import java.util.Scanner;

public class Replace {
    public static void main(String[] args) {
        display();
    }
    public static void display(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String str = sc.nextLine();
        System.out.println("Name: " + str.replace("a", ""));
        sc.close();
    }
}