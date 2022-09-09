package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class ExcerciseNine {
    public static void main(String[] args) {
        int meters = 0, hours = 0, minutes = 0, seconds = 0;
        double miles, totalHours, kmh, kms, mph, totalSeconds, km;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Input distance in meters:");
            try {
                meters = sc.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Insert meters as whole numbers.");
                sc.next();
            }
        } while (true);
        do {
            System.out.println("Input hours:");
            try {
                hours = sc.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Insert hours as whole numbers.");
                sc.next();
            }
        } while (true);
        do {
            System.out.println("Input minutes:");
            try {
                minutes = sc.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Insert minutes as whole numbers.");
                sc.next();
            }
        } while (true);
        do {
            System.out.println("Input seconds:");
            try {
                seconds = sc.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Insert seconds as whole numbers.");
                sc.next();
            }
        } while (true);
        miles = (double)meters / 1609;
        km = (double)meters / 1000;
        totalHours = hours + (double)minutes / 60 + (double)seconds / 3600;
        totalSeconds = hours * 3600 + minutes * 60 + seconds;
        kms = meters / totalSeconds;
        kmh = km / totalHours;
        mph = miles / totalHours;
        System.out.println();
        System.out.println("Your speed in meters/second is " + kms);
        System.out.println("Your speed in km/h is " + kmh);
        System.out.println("Your speed in miles/h is " + mph);
    }
}
