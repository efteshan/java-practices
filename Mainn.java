// Draw a UML class diagram for a Student class. The class must include:
// Three private attributes: id (String), name (String), and cgpa (double).
// A constructor to initialize all three attributes.
// A public method named display() that prints the student's details.

// Part B
// Write the Java code for the Student class exactly as designed in your UML diagram. 
// Ensure the data attributes are protected using the appropriate visibility modifiers 
// and initialized using the constructor.
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
            System.out.println(" ID: "+id+" Name: "+name+" cgpa: "+cgpa);
    }
}

public class Mainn{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter Student ID: ");
        String userId = input.next();

    System.out.print("Enter Student Name: ");
        String userName = input.next();
    
    System.out.print("Enter Student's CGPA: ");
        double userCgpa = input.nextDouble();


    System.out.print("Enter Student ID: ");
        String userId2 = input.next();

    System.out.print("Enter Student Name: ");
        String userName2 = input.next();
    
    System.out.print("Enter Student's CGPA: ");
        double userCgpa2 = input.nextDouble();

    Student s1 = new Student(userId, userName, userCgpa);
    Student s2 = new Student(userId2, userName2, userCgpa2);

        System.out.println("---Student Details Below---");

    s1.display();
    s2.display();

    }
}