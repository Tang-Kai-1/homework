package io.codelex.dateandtime.practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ExerciseOne {
    public static void main(String[] args) {
        LocalDate firstDate = enterDate();
        LocalDate secondDate = enterDate();
        int workingHours = 0;
        for (LocalDate day = firstDate; day.isBefore(secondDate); day = day.plusDays(1)) {
            if (day.getDayOfWeek().getValue() <= 5) {
                workingHours += 8;
            }
        }
        System.out.println("You have worked " + workingHours + " office hours in this time period.");
    }

    public static LocalDate enterDate() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter date (DD/MM/YYYY):");
            String dateString = sc.nextLine();
            try {
                DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate date = LocalDate.parse(dateString, format);
                return date;
            } catch (Exception e) {
                System.out.println("Incorrect format. Try again.");
            }
        }
    }
}
