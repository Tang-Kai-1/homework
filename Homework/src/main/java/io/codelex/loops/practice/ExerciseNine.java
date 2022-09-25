package io.codelex.loops.practice;

import java.util.Scanner;

import static io.codelex.loops.practice.ExerciseSeven.RollDice;

public class ExerciseNine {
    public static void main(String[] args) {
        int dice1 = 0;
        int dice2 = 0;
        int sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Desired sum:");
        sum = sc.nextInt();
        while (dice1 + dice2 != sum) {
            dice1 = RollDice();
            dice2 = RollDice();
            System.out.println(dice1 + " and " + dice2 + " = " + (int) (dice1 + dice2));
        }
    }
}
