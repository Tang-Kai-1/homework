package io.codelex.dateandtime.practice;

import java.time.LocalDate;

public class ExerciseThree {
    public static void main(String[] args) {
        LocalDate firstStart = LocalDate.of(2022, 1, 1);
        LocalDate firstEnd = LocalDate.of(2022, 1, 15);
        DatePeriod firstPeriod = new DatePeriod(firstStart, firstEnd);

        LocalDate secondStart = LocalDate.of(2022, 1, 10);
        LocalDate secondEnd = LocalDate.of(2022, 1, 25);
        DatePeriod secondPeriod = new DatePeriod(secondStart, secondEnd);

        DatePeriod overlap = firstPeriod.intersection(secondPeriod);
        if (overlap == null) {
            System.out.println("No overlap");
        } else {
            System.out.print("Overlap start: ");
            System.out.print(overlap.firstDate);
            System.out.println();
            System.out.print("Overlap end: ");
            System.out.print(overlap.secondDate);
        }

//overlap variable should have start date 10.01.2022 and end date 15.01.2022
    }
}
