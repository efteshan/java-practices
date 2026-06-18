/*
Draw a UML class diagram for a Rectangle class. The class must include:

Two private attributes: height (int) and width (int).

A constructor to initialize the height and width.

A public method named getArea() that calculates and returns the area as an integer.

A public method named display() that prints the height and width.

Part B (10 Marks)

Write the Java code for the Rectangle class based on your UML diagram.

Write a main test method. Inside the main method, instantiate a Rectangle object with a height of 10 and a width of 5.

Call the display() method to print the dimensions, and print the result of the getArea() method to the console.
 */
import java.util.Scanner;

class Rectangle{

    private int height;
    private int width;

    public Rectangle(int height, int width){
        this.height = height;
        this.width = width;
    }

    public int getArea(){
        return height * width;
    }

    public void display(){
        System.out.println(" Height: "+height+" Width: "+width);
    }
}

public class TestRec{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Height: ");
        int userHeight = input.nextInt();

        System.out.print("Enter Width: ");
        int userWidth = input.nextInt();

        Rectangle r = new Rectangle(userHeight, userWidth);
        
        System.out.println("---Your details here---");
        r.display();
        System.out.println(r.getArea());
        
    }
}
