// The Question: Write a Java program to: 
// 1. Display multiplication table of a number, and 
// 2. Calculate total sum of multiplication results

import java.util.Scanner;
public class TableSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int sum = 0;
        for (int i = 1; i<11; i++) {
        int result = number*i;
        System.out.println(result);
        sum = sum+result;
        }
        System.out.println(sum);
    }
}