import java.util.Scanner;

public class PhysicsBook {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--- Enter Book Details ---");


        System.out.print("Enter Book ID: ");
        int bookId = input.nextInt();
        input.nextLine(); 

        System.out.print("Enter Book Title: ");
        String bookTitle = input.nextLine();

        System.out.print("Enter Author Name: ");
        String author = input.nextLine();


        System.out.println("\n--- Book Details ---");
        System.out.println("ID: " + bookId + " Title: " + bookTitle + " Author: " + author);
        
        input.close();
    }
}