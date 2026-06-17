import java.util.Scanner;

// 1. The Blueprint (Class)
class Book {
    // Attributes
    int bookId;
    String bookTitle;
    String author;

    // Method to Input Information
    void inputInfo() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Book ID: ");
        bookId = input.nextInt();
        input.nextLine(); // Fixes a tiny Java glitch when mixing nextInt and nextLine
        
        System.out.print("Enter Book Title: ");
        bookTitle = input.nextLine();
        
        System.out.print("Enter Author Name: ");
        author = input.nextLine();
    }

    // Method to Display Information
    void displayInfo() {
        System.out.println("ID: " + bookId + " Title: " + bookTitle + " Author: " + author);
    }
}

// 2. The Execution (Creating the Object)
public class TestBook {
    public static void main(String[] args) {
        // We use the 'new' keyword to build an actual physical book from our blueprint
        Book myBook = new Book(); 
        
        System.out.println("--- Enter Book Details ---");
        myBook.inputInfo(); // Trigger the input method
        
        System.out.println("--- Book Details ---");
        myBook.displayInfo(); // Trigger the display method
    }
}