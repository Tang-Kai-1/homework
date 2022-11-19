package io.codelex.arithmetic.practice;

import java.util.Scanner;

//Program must accept metric units but in what way? MM, CM, DM, M? g, kg, T?

public class ExerciseNine {
    public static void main(String[] args) {
        int height = 0;
        int weight = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Input height in cm:");
            try {
                height = sc.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Input only whole integers!");
                sc.next();
            }
        }
        while (true) {
            System.out.println("Input weight in kg:");
            try {
                weight = sc.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Input only whole integers!");
                sc.next();
            }
        }
        System.out.println(checkBMI(height, weight));
    }

    static String checkBMI(int height, int weight) {
        double heightInInches = (double) height * 0.393700787;
        double weightInPounds = (double) weight / 0.45359237;
        double BMI = ((double) weightInPounds * 703) / Math.pow(heightInInches, 2);
        if (BMI <= 25 && BMI >= 18.5) {
            return "Optimal BMI";
        } else if (BMI > 25) {
            return "You too fat!";
        } else {
            return "You too skinny!";
        }
    }
}
