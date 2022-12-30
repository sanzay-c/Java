package Programs;

public class EmptyOrNull {
    public static void main(String[] args) {
        String str1 = null;
        String str2 = "";
        String str3 = " ";

        // check if str1 is null or empty
        System.out.println("str1 is: " + isNullEmpty(str1));

        // check if str2 is null or empty
        System.out.println("str2 is: " + isNullEmpty(str2));

        // check if str3 is null or empty
        System.out.println("str3 is: " + isNullEmpty(str3));
    }

    public static String isNullEmpty(String str){
        // check if String is null
        if (str == null){
            return "NULL";
        } else if (str.isEmpty()){ //check if string is empty
            return "EMPTY";
        } else {
            return "neither NULL or EMPTY";
        }

    }
}
