package io.codelex.arithmetic.practice;

public class ExerciseEight {
    public static void main(String[] args) {
        int hoursWorked = 57;
        double payRate=9.5;
        calculatePay(hoursWorked, payRate);
    }
    static void calculatePay(int num, double rate){
        if(rate<8) System.out.println("Rate is lower than the State minimum. Pay more!");
        else if (num>60) System.out.println("The great Foo forbids you from working more than 60 hours per week!");
        else{
            int overtime = num%40;
            double pay = (double)(num-overtime)*rate + (double)overtime*(rate*1.5);
            System.out.println("This employee shall receive " + pay);
        }
    }
}
