package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class ExcerciseEight {
    public static void main(String[] args) {
        int minutes=0,years=0,days=0;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Insert minutes:");
            try{
                minutes=sc.nextInt();
                break;
            }catch (Exception e) {
                System.out.println("Insert minutes as whole numbers.");
                sc.next();
            }
        }while(true);
        if(minutes>=525948){
            years=minutes/525948;
            minutes%=525948;
        }
        if(minutes>=1440){
            days=minutes/1440;
            minutes%=1440;
        }
        System.out.println("Converting from minutes there are " + years + " years, " + days + " days and " + minutes + " minutes");
    }
}
