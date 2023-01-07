package Assignment;

import java.util.Scanner;

public class LongestSubstring{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();

        String longest = "";
        for(int i = 0; i < str.length(); i++){
            for(int j = i + 1; j <= str.length(); j++){
                String sub = str.substring(i ,j);
                if (isUnique(sub) && sub.length() > longest.length()){
                    longest = sub;
                }
            }
        }
        System.out.println("The longest substring with unique character is: " + longest);
        sc.close();
    }
    public static boolean isUnique(String str){
        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if (str.indexOf(c) != str.lastIndexOf(c)){
                return false;
            }
        }
        return true;
    }
}