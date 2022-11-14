package io.codelex.dateandtime.practice;

import java.time.LocalDate;
import java.util.Scanner;

import static io.codelex.dateandtime.practice.ExerciseOne.enterDate;

public class ExerciseTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Server start date");
        LocalDate startDate = enterDate();
        System.out.println("Enter year:");
        int year = sc.nextInt();
        System.out.println("Enter month:");
        int month = sc.nextInt();
        LocalDate lastMonth = LocalDate.of(year, month, 1).plusMonths(1);
        for (LocalDate date = startDate.plusDays(14); date.isBefore(lastMonth); date = date.plusDays(14)) {
            if (date.getMonth() == lastMonth.minusMonths(1).getMonth()) {
                System.out.println(date);
            }
        }
    }
}
