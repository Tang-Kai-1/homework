package io.codelex.loops.practice;

import java.util.Scanner;

public class ExerciseSeven {
    public static void main(String[] args) {
        int dice, score=0;
        char answer;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Piglet!");
        do{
            dice = (int)(Math.random()*(6-1))+1;
            System.out.println("You rolled a: "+dice);
            score+=dice;
            if(dice==1){
                System.out.println("You got 0 points.");
                break;
            }
            System.out.print("Do you want to continue[Y/N]: ");
            answer=sc.nextLine().charAt(0);
            if(answer=='n'){
                System.out.println("You got "+score+" points.");
                break;
            }
        }while(true);
    }
}
