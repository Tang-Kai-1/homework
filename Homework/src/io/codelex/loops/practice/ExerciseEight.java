package io.codelex.loops.practice;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class ExerciseEight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int levels;
        for (int i = 0; i < 5; i++) {
            System.out.print(StringUtils.repeat('/', 16 - i * 4));
            System.out.print(StringUtils.repeat('*', i * 8));
            System.out.print(StringUtils.repeat('\\', 16 - i * 4));
            System.out.println();
        }
        System.out.println("Enter an integer:");
        levels = sc.nextInt();
        for (int i = 0; i < levels; i++) {
            System.out.print(StringUtils.repeat('/', ((levels-1)*4) - i * 4));
            System.out.print(StringUtils.repeat('*', i * 8));
            System.out.print(StringUtils.repeat('\\', ((levels-1)*4) - i * 4));
            System.out.println();
        }
    }
}
