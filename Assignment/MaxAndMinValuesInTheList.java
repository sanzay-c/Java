package Assignment;

import java.util.Scanner;

public class MaxAndMinValuesInTheList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a list of numbers: ");
        String input = sc.nextLine();
        String[] numbers = input.split(",");

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (String number : numbers){
            int n = Integer.parseInt(number);
            if(n < min) {
                min = n;
            } else if(n > max){
                max = n;
            } 
        }
        System.out.println("The minimun value is: " + min);
        System.out.println("The maximum value is: " + max);

        sc.close();
    }
}
