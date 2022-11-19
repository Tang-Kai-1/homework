package io.codelex.exceptions.practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        while (true) {
            int numerator = 0;
            int divisor = 0;
            String numeratorString = "";
            String divisorString = "";
            try {
                System.out.println("Enter the numerator");
                numeratorString = scanner.nextLine();
                numerator = Integer.parseInt(numeratorString);
                System.out.println("Enter the divisor");
                divisorString = scanner.nextLine();
                divisor = Integer.parseInt(divisorString);
            } catch (NumberFormatException e) {
                if (numeratorString.toLowerCase().startsWith("q") || divisorString.toLowerCase().startsWith("q")) {
                    break;
                } else {
                    System.out.println("You entered bad data.\n" + "Please try again.");
                    continue;
                }
            }
            try {
                System.out.println(numerator + " / " + divisor + " = " + numerator / divisor);
            } catch (ArithmeticException e) {
                System.out.println("You can't divide 12 by 0");
            }
        }
    }
}
