// Draw a UML class diagram for a Student class. The class must include:
// Three private attributes: id (String), name (String), and cgpa (double).
// A constructor to initialize all three attributes.
// A public method named display() that prints the student's details.

// Part B
// Write the Java code for the Student class exactly as designed in your UML diagram. 
// Ensure the data attributes are protected using the appropriate visibility modifiers 
// and initialized using the constructor.

// STEP 1: Import the Scanner tool so Java knows how to use it
import java.util.Scanner;

class Student {
    private String id;
    private String name;
    private double cgpa;

    public Student(String id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public void display() {
        System.out.println("ID: " + id + " | Name: " + name + " | CGPA: " + cgpa);
    }
}

public class xsxz {
    public static void main(String[] args) {
        
        // STEP 2: Create the Scanner object (open the pipeline to the keyboard)
        Scanner input = new Scanner(System.in);
        
        System.out.println("--- Entering Student Data ---");

        // Ask for ID
        System.out.print("Enter Student ID: ");
        String userId = input.next(); // Catches text up to the first space

        // Ask for Name
        System.out.print("Enter Student Name: ");
        String userName = input.next(); // Catches the name text

        // Ask for CGPA
        System.out.print("Enter Student CGPA: ");
        double userCgpa = input.nextDouble(); // Catches a decimal number

        System.out.println("\n--- Creating and Displaying Student ---");
        
        // STEP 3: Pass those user variables directly into your constructor!
        Student s1 = new Student(userId, userName, userCgpa);
        
        // Show the result
        s1.display();
        
        // Close the scanner pipeline (good practice!)
        input.close();
    }
}