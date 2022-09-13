package io.codelex.flowcontrol.practice;

import java.util.Scanner;

public class ExerciseFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a day (0-6):");
        int day = sc.nextInt();
        if(day>=0 && day<=6){
            if(day==0) System.out.println("Sunday");
            else if(day==1) System.out.println("Monday");
            else{
                switch (day){
                    case 2:
                        System.out.println("Tuesday");
                        break;
                    case 3:
                        System.out.println("Wednesday");
                        break;
                    case 4:
                        System.out.println("Thursday");
                        break;
                    case 5:
                        System.out.println("Friday");
                        break;
                    default:
                        System.out.println("Saturday");
                }
            }
        }else System.out.println("Not a valid day.");
    }
}
