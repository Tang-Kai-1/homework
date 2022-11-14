package io.codelex.loops.practice;

import java.util.Random;
import java.util.Scanner;

public class ExerciseSeven {
    public static void main(String[] args) {
        int dice;
        int score = 0;
        char answer;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Piglet!");
        while (true) {
            dice = RollDice();
            System.out.println("You rolled a: " + dice);
            score += dice;
            if (dice == 1) {
                System.out.println("You got 0 points.");
                break;
            }
            System.out.print("Do you want to continue[Y/N]: ");
            answer = sc.nextLine().toLowerCase().charAt(0);
            if (answer == 'n') {
                System.out.println("You got " + score + " points.");
                break;
            }
        }
    }

    public static int RollDice() {
        Random random = new Random();
        return random.nextInt(6 - 1) + 1;
    }
}
