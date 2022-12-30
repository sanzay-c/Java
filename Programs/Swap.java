package Programs;

public class Swap {
    public static void main(String[] args) {
        
        float first = 1.20f, second = 2.45f, temporary;
        
        System.out.println("--Before swap--");
        System.out.println("First number is: " + first);
        System.out.println("Second number is: " + second);
        
        // value of first is assigned to temporary
        temporary = first;
        
        // value of second is assigned to first
        first = second;
        
        // value of temporary (Which contains the initial value of first) is assigned to second
        second = temporary;
        
        System.out.println("--After swap--");
        System.out.println("First number is: " + first);
        System.out.println("Second number is: " + second);
    }
}
