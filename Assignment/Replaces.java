package Assignment;

import java.util.Scanner;

public class Replaces {
    public static void main(String[] args) {    
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        System.out.println("Enter a String to replace: ");
        String oldStr = sc.nextLine();

        System.out.println("Enter a replacement of string: ");
        String newStr = sc.nextLine();

        String output = str.replaceAll(oldStr, newStr);

        System.out.println("Result is: " + output);
        
        sc.close();
    }
}


// public static void main(String[] args) {
// display();
// }
// public static void display(){
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter name: ");
//     String str = sc.nextLine();
//     System.out.println("Name: " + str.replace("a", ""));
//     sc.close();
// }



