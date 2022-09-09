package io.codelex.arithmetic.practice;

public class ExcerciseTwo {
    public static void main(String[] args) {
        CheckOddEven(8);
    }
    static void CheckOddEven(int num){
        if(num%2==0) System.out.println("Even Number");
        else System.out.println("Odd Number");
        System.out.println("Bye!");
    }
}
