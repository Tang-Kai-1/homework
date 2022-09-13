package main.io.codelex.loops.practice;

import java.util.Scanner;

public class ExerciseNine {
    public static void main(String[] args) {
        int dice1 = 0, dice2 = 0, sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Desired sum:");
        sum = sc.nextInt();
        do {
            dice1 = (int) (Math.random() * (6 - 1)) + 1;
            dice2 = (int) (Math.random() * (6 - 1)) + 1;
            System.out.println(dice1 + " and " + dice2 + " = " + (int)(dice1 + dice2));
        } while (dice1 + dice2 != sum);
    }
}
