package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class ExerciseFive {
    public static void main(String[] args) {
        int answer = (int) ((Math.random() * (100 - 1)) + 1);
        Scanner sc = new Scanner(System.in);
        System.out.println("I'm thinking of a number between 1-100. Try to guess it.");
        int guess = sc.nextInt();
        if (guess > answer) System.out.println("Sorry, you are too high. I was thinking of " + answer + ".");
        else if (guess < answer) System.out.println("Sorry, you are too low. I was thinking of " + answer + ".");
        else System.out.println("You guessed it! What are the odds?!?");
    }
}
