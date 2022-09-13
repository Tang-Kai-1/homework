package io.codelex.loops.practice;

import java.util.Scanner;

public class ExerciseNine {
    public static void main(String[] args) {
        int dice1 = 0;
        int dice2 = 0;
        int sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Desired sum:");
        sum = sc.nextInt();
        while (dice1 + dice2 != sum) {
            dice1 = (int) (Math.random() * (6 - 1)) + 1;
            dice2 = (int) (Math.random() * (6 - 1)) + 1;
            System.out.println(dice1 + " and " + dice2 + " = " + (int) (dice1 + dice2));
        }
    }
}
