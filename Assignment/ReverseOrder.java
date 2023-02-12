package Assignment;

import java.util.Scanner;

public class ReverseOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String str = sc.nextLine();

        String[] words = str.split(" ");           // Still left todo.......

        for (int i = 0; i < words.length / 2; i++){
            String temp = words[i];
            words[i] = words[words.length - i - 1];
            words[words.length - i - 1] = temp;
        }

        for (int i = 0; i < words.length; i++){
            System.out.println(words[i] + " ");
        }
        sc.close();
    }
}
