package io.codelex.arrays.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise2 {

    //TODO: Write a Java program to sum values of an array.
    // Array values are starting from min (including) till max (including) number.


    // Using an array in this case seems redundant. A simple for loop would suffice to acquire the sum of integers in range.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a min number");
        int minNumber = input.nextInt();

        System.out.println("Please enter a max number");
        int maxNumber = input.nextInt();


        if (maxNumber >= minNumber) {
            int myArray[] = new int[maxNumber - minNumber + 1];
            int sum = 0;
            int j = 0;
            for (int i = minNumber; i <= maxNumber; i++) {
                sum += i;
                myArray[j] = i;
                j++;
            }

            System.out.println("The sum is " + sum);
        } else {
            System.out.println("Invalid input! Max larger than min.");
        }
    }
}
