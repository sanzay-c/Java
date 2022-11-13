package Exception;

import java.util.Scanner;

public class TryCatchException {
    public static void main(String[] args){
        try{
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int num = scan.nextInt();
            System.out.println("The Entered number is: " + num);
            scan.close();
        } catch(Exception ex){
            System.out.println("Enter the valid input.");
        }
    }
} 