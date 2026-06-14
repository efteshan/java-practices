// Write a Java program to: 
// 1. Input a number, 
// 2. Check whether the number is: Positive, Negative, or Zero

import java.util.Scanner;

public class CheckNumbers 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        if (number > 0) {
            System.out.println("The Number is positive");
        }
        else if (number < 0) {
            System.out.println("The Number is negative");
        }
        else {
            System.out.println("The number is Zero");
        }
    }
}