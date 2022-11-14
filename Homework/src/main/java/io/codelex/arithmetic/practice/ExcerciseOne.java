package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class ExcerciseOne {
    public static void main(String[] args) {
        int first = 0;
        int second = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Input two integers:");
            try {
                first = sc.nextInt();
                second = sc.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Input whole integers!");
                sc.next();
            }
        }
        System.out.println(checkForFiveteen(first, second));
    }

    static boolean checkForFiveteen(int num1, int num2) {
        return (num1 == 15 || num2 == 15 || num1 + num2 == 15 || Math.abs(num1 - num2) == 15);
    }
}
