package io.codelex.loops.practice;

import java.util.Scanner;

public class ExerciseTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter min:");
        int min = sc.nextInt();
        System.out.println("Enter max:");
        int max = sc.nextInt();
        for(int i = 0; i<max-min; i++){
            for(int j = min; j<=max; j++) System.out.print(j);
            System.out.println();
        }
    }
}
