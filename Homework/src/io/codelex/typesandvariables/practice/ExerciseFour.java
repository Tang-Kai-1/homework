package io.codelex.typesandvariables.practice;

public class ExerciseFour {
    public static void main(String[] args) {
        String name = "Toms Prūsis";
        int birthYear = 2000;
        printOutNameBirth(name,birthYear);
    }
    static void printOutNameBirth(String name, int birth){
        System.out.println("My name is " + name + " and I was born in " + birth + ".");
    }
}
