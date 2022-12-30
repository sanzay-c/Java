package Patterns;

public class Pyramid {
    public static void main(String[] args) {
        int n = 5;

        // outer loop
        for (int i = 1; i <= n; i++){
            // spaces
            for (int j = 1; j <= n - i; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
