package Exception;

public class ThrowsException {
    public static void main(String[] args) {
        try{
            display();
        } catch(Exception ex){
            System.out.println("Exception caught.");
        }
    }
    public static void display() throws Exception{
        throw (new Exception());
        // System.out.println("Null.");
    }
}
