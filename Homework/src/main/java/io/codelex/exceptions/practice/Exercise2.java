package io.codelex.exceptions.practice;

public class Exercise2 {
    public void methodA() throws ArithmeticException {
        try {
            methodB();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }

    public void methodB() throws ArithmeticException {
        try {
            methodC();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }

    public void methodC() throws ArithmeticException {
        try {
            System.out.println(12 / 0);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Exercise2 test = new Exercise2();
        test.methodA();
    }
}
