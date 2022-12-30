package Programs;

import java.time.LocalDateTime;

public class DateAndTime {
    public static void main(String[] args) {
        LocalDateTime current = LocalDateTime.now();
        System.out.println("Current date and time is : " + current);
    }
}