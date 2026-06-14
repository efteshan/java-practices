// Write a Java program to: 
// 1. Display multiplication table of a number, and 
// 2. Calculate total sum of multiplication results

import java.util.Scanner;

public class Table {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int sum = 0;
    int number = input.nextInt();
    for (int i = 1; i <=10; i++) {
int results = number*i;
        System.out.println(number+"*"+i+"="+results);
        sum = sum+results;
    }
    System.out.println("The total sum is: "+sum);
}
}