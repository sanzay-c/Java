package Exception;

import java.util.Scanner;

public class ThrowException {
    public static void main(String[] args) {
        try{
            getInput();
        }catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    public static void getInput() throws Exception{
        try{
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int num = scan.nextInt();
            System.out.println("The number is: " + num);
            scan.close();
        } catch (Exception ex){
            throw (new Exception("Enter a valid input."));
        }
    }
}
