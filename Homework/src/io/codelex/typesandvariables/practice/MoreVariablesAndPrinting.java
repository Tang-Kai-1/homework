package io.codelex.typesandvariables.practice;

public class MoreVariablesAndPrinting {
    public static void main(String[] args) {
        String name, eyes, teeth, hair;
        int age, height, weight;

        name = "Zed A. Shaw";
        age = 35;
        height = 74;  // inches
        weight = 180; // lbs
        eyes = "Blue";
        teeth = "White";
        hair = "Brown";
        double cmHeight = Math.round((height * 2.54)*100.0)/100.0;
        double kgWeight = Math.round((weight*0.453592)*100.0)/100.0;
        System.out.println("Let's talk about " + name + ".");
        System.out.println("He's " + cmHeight + " inches tall.");
        System.out.println("He's " + kgWeight + " pounds heavy.");
        System.out.println("Actually, that's not too heavy.");
        System.out.println("He's got " + eyes + " eyes and " + hair + " hair.");
        System.out.println("His teeth are usually " + teeth + " depending on the coffee.");

        System.out.println("If I add " + age + ", " + cmHeight + ", and " + kgWeight
                + " I get " + (age + height + weight) + ".");
    }
}