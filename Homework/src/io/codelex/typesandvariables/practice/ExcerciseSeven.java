package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class ExcerciseSeven {
    public static void main(String[] args) {
        String input;
        int len = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Insert a string:");
            input = sc.nextLine();
            if (input.length()>0) break;
            else System.out.println("Empty strings do not count! Try again.");
        } while (true);
        for (int i = 0; i < input.length(); i++) if (Character.isUpperCase(input.charAt(i))) len++;
        System.out.println("There are " + len + " uppercase letters in string.");
    }
}
