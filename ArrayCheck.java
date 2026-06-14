// Write a Java program to: 
// 1. Input 5 numbers into an array, and 
// 2. Find: Largest number, Smallest number, Average

import java.util.Scanner;

public class ArrayCheck{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter numbers: ");
        double sum = 0;
          for (int i=0; i<5; i++) {
          arr[i] = input.nextInt();
          sum = sum + arr[i];
        }
        int largest = arr[0];
        int smallest = arr[0];

            for (int i = 1; i<5; i++) {
            if (arr[i] > largest) { 
                largest = arr[i];
            }
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
            }
        double average = sum / 5;
        System.out.println("Largest: "+largest);
        System.out.println("Smallest: "+smallest);
        System.out.println("Average: "+average);
    }
}