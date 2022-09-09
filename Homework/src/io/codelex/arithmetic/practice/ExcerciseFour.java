package io.codelex.arithmetic.practice;

//So does it have to compute !n or !10 ?

public class ExcerciseFour {
    public static void main(String[] args) {
        System.out.println(Product1ToN());
    }
    static int Product1ToN(){
        int sum=1;
        for(int i = 1; i<=10; i++)sum*=i;
        return sum;
    }
}
