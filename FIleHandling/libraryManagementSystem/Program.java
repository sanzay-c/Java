package FIleHandling.libraryManagementSystem;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Program {

    static final String FILEPATH = "C:\\Users\\acttive\\Desktop\\Java\\FIleHandling\\libraryManagementSystem\\MyContent.txt";

    static ArrayList<Book> books = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    static String input = "no";

    public static void main(String[] args) {
        try {

            FileReader fileReader = new FileReader(FILEPATH);
            // classname objectname = keyword constructor (parametrized)

            BufferedReader bReader = new BufferedReader(fileReader);
            // classname objectname = keyword constructor

            // Iterator

            // POJO
            // Plain Old Java Objects

            Iterator<String> lines = bReader.lines().iterator();
            // lines.
            while (lines.hasNext()) {
                String[] details = lines.next().split(",");
                int id = Integer.parseInt(details[0].trim());
                int quantity = Integer.parseInt(details[3].trim());
                // Deserialization
                Book book = new Book(id, details[1].trim(), details[2].trim(), quantity);
                books.add(book);
            }
            bReader.close();
            fileReader.close();

            while (input != "yes") {
                displayBookDetails();
                greetUser();
                String val = scanner.nextLine();
                useOption(val);
            }
            scanner.close();
            writeToFile();

        } catch (Exception ex) {
            System.out.println(ex.toString());
            System.out.println("Cannot open file");
        }
    }

    public static void displayBookDetails() {
        System.out.printf("%-5s | %-30s | %-20s | %-5s\n", "Id", "Name", "Author", "Quantity");

        for (Book book : books) {
            book.display();
        }
    }

    public static void greetUser() {
        System.out.println("Welcome to library management system!");
        System.out.println("Press 1 to withdraw book");
        System.out.println("Press 2 to deposit book");
        System.out.println("Press 0 to quit the program\n");
    }

    public static void useOption(String val) {
        switch (val) {
            case "0":
                input = "yes";
                writeToFile();
                break;
            case "1":
                withdrawBook();
                break;
            case "2":
                depositBook();
                break;
            default:
                System.out.println("Please enter a valid option");
                break;
        }
    }

    public static void withdrawBook() {
        try {
            System.out.print("Enter the book id: ");
            int id = Integer.parseInt(scanner.nextLine());

            for (Book book : books) {
                if (book.getId() == id) {
                    if (book.decreaseQuantity()) {
                        System.out.println("Successfull withdrawn");
                    }
                    return;
                }
            }
            System.out.println("No book with the matching id");
        } catch (Exception ex) {
            System.out.println("Please enter a valid id");
        }
    }

    public static void depositBook() {
        try {
            System.out.print("Enter the book id: ");
            int id = Integer.parseInt(scanner.nextLine());

            for (Book book : books) {
                if (book.getId() == id) {
                    book.increaseQuantity();
                    System.out.println("Successfull deposited book");
                    return;
                }
            }
            System.out.println("No book with the matching id");
        } catch (Exception ex) {
            System.out.println("Please enter a valid id");
        }
    }

    public static void writeToFile() {
        try {
            // Serialization
            FileWriter fileWriter = new FileWriter(FILEPATH);
            for (Book book : books) {
                fileWriter.write(book.toString());
            }
            System.out.println(":::---> Successfully written");
            fileWriter.close();
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }

}
// import java.io.BufferedReader;
// import java.io.FileReader;
// import java.io.FileWriter;
// import java.util.ArrayList;
// import java.util.Iterator;
// import java.util.Scanner;

// public class Program {

//     static final String FILEPATH = "C:\\Users\\acttive\\Desktop\\Java\\FIleHandling\\libraryManagementSystem\\MyContent.txt";
//     static ArrayList<Book> books = new ArrayList<>();
//     static Scanner scanner = new Scanner(System.in);
//     public static void main(String[] args) {
//         try{
//             FileReader fileReader = new FileReader(FILEPATH);
//             BufferedReader bufferReader = new BufferedReader(fileReader);
//             Iterator<String> lines = bufferReader.lines().iterator();
            
//             while (lines.hasNext()) {
//                 String[] details = lines.next().split(",");
//                 int id = Integer.parseInt(details[0].trim());
//                 int quantity = Integer.parseInt(details[3].trim());
//                 Book book = new Book(id, details[1].trim(), details[2].trim(), quantity);
//                 books.add(book);
//             }
           
//             bufferReader.close();
//             fileReader.close();
            
//             greetUser();
//             String val = scanner.nextLine();
//             chooseOption(val);
//             scanner.close();
//         } catch (Exception ex) {
//             System.out.println(ex.toString());
//             System.out.println("Cannot open file");
//         }
//     }

//     public static void greetUser() {
//         System.out.println("---------------Welcome to library management system---------------");
//         System.out.println("Press 1 to Display book Information");
//         System.out.println("Press 2 to Add book in Library.");
//         System.out.println("Press 3 to Borrow book from Library.");
//         System.out.println("Press 4 to Return book in Library.");
//     }

//     public static void chooseOption(String choose) {
//         switch(choose) {
//             case "1":
//                 displayBookInfo();
//                 break;
//             case "2":
//                 addBook();
//                 break;
//             case "3":
//                 // borrowBook();
//                 break;            
//             case "4":
//                 // returnBook();
//                 break;            
//             default:
//                 System.out.println("Enter a valid option");
//                 break;
//         }
//     }

//     public static void displayBookInfo(){
//         System.out.printf("%-5s | %-30s | %-20s | %-5s\n", "Id", "Name", "Author", "Quantity");

//         for (Book book : books) {
//             book.display();
//         }  
//     }

//     public static void addBook(){
//         try{
//             FileWriter fileWriter = new FileWriter(FILEPATH);            
//             for (Book book : books) {
//                 fileWriter.write(book.toString());
//             }
//             System.out.println("------Added Book------");
//             fileWriter.close();
//         } catch (Exception ex) {
//             System.out.println(ex.toString());
//         }
//     }

//     public static void borrowBook(){
//         try {
//             System.out.print("Enter the book id: ");
//             int id = Integer.parseInt(scanner.nextLine());

//             for (Book book : books) {
//                 if (book.getId() == id) {
//                     if (book.decreaseQuantity()) {
//                         System.out.println("Successfull withdrawn");
//                     }
//                     return;
//                 }
//             }
//             System.out.println("No book with the matching id");
//         } catch (Exception ex) {
//             System.out.println("Please enter a valid id");
//         }
//     }
    
//     public static void returnBook(){
//         try {
//             System.out.print("Enter the book id: ");
//             int id = Integer.parseInt(scanner.nextLine());

//             for (Book book : books) {
//                 if (book.getId() == id) {
//                     if (book.decreaseQuantity()) {
//                         System.out.println("Successfull withdrawn");
//                     }
//                     return;
//                 }
//             }
//             System.out.println("No book with the matching id");
//         } catch (Exception ex) {
//             System.out.println("Please enter a valid id");
//         }
//     }
// }