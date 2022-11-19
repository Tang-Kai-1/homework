package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class ExcerciseSix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        int sum;
        while (true) {
            System.out.println("Insert 3 single digit integers:");
            try {
                num1 = sc.nextInt();
                num2 = sc.nextInt();
                num3 = sc.nextInt();
                if (num1 > 9 || num2 > 9 || num3 > 9 || num1 < -9 || num2 < -9 || num3 < -9) {
                    System.out.println("All integers must be single digits! Try again.");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Only integers are allowed! Try again.");
                sc.next();
            }
        }
        sc.close();
        sum = num1 + num2 + num3;
        System.out.println("Sum of all digits is: " + sum);
    }
}
