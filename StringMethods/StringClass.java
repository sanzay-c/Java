package StringMethods;

public class StringClass {
    public static void main(String[] args) {
        try{
            String s = "Hello World";
            System.out.println(s); 
            
            // .charAt() -> returns char value for the particular index.
            System.out.println(s.charAt(6));

            // .toLowerCase() -> returns string to lower case.
            System.out.println(s.toUpperCase());
            
            // .toUpperCase() -> returns string to UPPER case.
            System.out.println(s.toLowerCase());
            
            // .replace() -> .replace(target: ".....", replacement: "......").
            System.out.println(s.replace("Hello", "Hi"));

            // .substring -> .substring(beginIndex: 0, endIndex: 3).
            System.out.println(s.substring(0, 3));
            
            // .length -> returns string length.
            System.out.println(s.length());

            // .indexOf -> returns the position of the first occurance of specified character(s). 
            System.out.println(s.indexOf("W"));

            String a = "10";
            String b = "20";
            
            // .equals compares two strings, and returns true if the strings are equal, and false if not.
            if (a.equals(b)){    
                System.out.println("Equal");
            } else {
                System.out.println("Not Equal");
            }
        } catch (Exception ex){
            System.out.println("Error Detected.");
        }
    }
}