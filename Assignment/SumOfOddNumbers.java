package Assignment;

import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args){
        int num, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = sc.nextInt();

        for (int i = 0; i <= num; i++){
            if((i % 2) == 1){
                sum += i;
            }
        }
        System.out.println("Sum of all odd numbers from 0 to " + num + " = " + sum);
        sc.close();
    }
}
