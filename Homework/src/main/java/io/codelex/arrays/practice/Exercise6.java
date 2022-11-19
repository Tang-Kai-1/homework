package io.codelex.arrays.practice;

import java.util.Random;

public class Exercise6 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] array1 = new int[10];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = rand.nextInt(100 - 1) + 1;
        }
        int[] array2 = array1.clone();

        System.out.print("Array 1: ");
        printArr(array1);
        System.out.print("Array 2: ");
        printArr(array2);

    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            if (i != arr.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
