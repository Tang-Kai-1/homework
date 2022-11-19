package io.codelex.collections.practice;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int startingNumber = sc.nextInt();
        int tryCount = 0;
        while (tryCount <= 5000) {
            int sum = 0;
            String[] numbers = Integer.toString(startingNumber).split("");
            for (String number : numbers) {
                sum += Math.pow(Integer.parseInt(number), 2);
            }
            if (sum == 1) {
                System.out.println("Happy number");
                break;
            } else {
                startingNumber = sum;
                tryCount++;
            }
        }
        if (tryCount > 5000) {
            System.out.println("Not happy");
        }
    }
}
