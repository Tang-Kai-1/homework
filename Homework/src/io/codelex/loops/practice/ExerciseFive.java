package io.codelex.loops.practice;

import java.util.Scanner;

public class ExerciseFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first word:");
        String input1 = sc.nextLine();
        System.out.println("Enter second word:");
        String input2 = sc.nextLine();
        int dotLength = 30-input1.length()-input2.length();
        System.out.print(input1);
        for(int i = 0; i < dotLength; i++) System.out.print('.');
        System.out.print(input2);
    }
}
