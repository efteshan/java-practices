// The Question: Write a Java program to: 
// 1. Input 5 numbers into an array, and 
// 2. Find: Largest number, Smallest number, Average.

import java.util.Scanner;
public class Array {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        int[] array = new int[5];
        double sum = 0;
        System.out.println("Enter numbers: ");
        for (int i = 0; i<5; i++) {
            array[i] = input.nextInt();
            sum = sum + array[i];
        }
        int largest = array[0];
        int smallest = array [0];
        double average = sum/5;
        for (int i=1; i<5; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
            if (array[i] < smallest) {
                smallest = array[i];
            } 
            }
            System.out.println(largest);
            System.out.println(smallest);
            System.out.println(average);
        }
    }
