package io.codelex.collections.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        String input = "n";
        while (!input.equals("")) {
            System.out.print("Enter name: ");
            input = sc.nextLine();
            if (!names.contains(input)) {
                names.add(input);
            }
        }
        System.out.println("Unique name list: " + String.join(" ", names));
    }
}
