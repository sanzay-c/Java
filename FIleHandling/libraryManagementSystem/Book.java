package FIleHandling.libraryManagementSystem;

public class Book {
    private int id;
    private String bookName;
    private String authorName;
    private int quantity;
    
    
    public Book(int id, String bookName, String authorName, int quantity) {
        this.id = id;
        this.bookName = bookName;
        this.authorName = authorName;
        this.quantity = quantity;
    }
    
    public int getId() {
        return id;
    }

    public boolean decreaseQuantity() {
        if(quantity >= 1) {
            quantity -- ;
            return true;
        } else {
            System.out.println("The book is not available");
            return false;
        }
    }

    public void increaseQuantity() {        
        quantity++;        
    }

    public void display() {
        System.out.printf("%-5s | %-30s | %-20s | %-5s\n", id, bookName, authorName, quantity);
    }

    @Override
    public String toString() {
        return id+","+bookName +","+authorName+","+quantity+"\n";
    }
}
