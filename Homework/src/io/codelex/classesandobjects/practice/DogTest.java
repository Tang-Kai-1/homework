package io.codelex.classesandobjects.practice;

public class DogTest {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Max","male");
        Dog dog2 = new Dog("Rocky", "male");
        Dog dog3 = new Dog("Sparky","male");
        Dog dog4 = new Dog("Buster","male");
        Dog dog5 = new Dog("Sam","male");
        Dog dog6 = new Dog("Lady","female");
        Dog dog7 = new Dog( "Molly","female");
        Dog dog8 = new Dog("Coco","female");
        Dog[] dogs = {dog1,dog2,dog3,dog4,dog5,dog6,dog7,dog8};
        for(Dog dog:dogs){
            System.out.println(dog.toString());
        }
        System.out.println();
        dog1.setNameMother("Lady");
        dog1.setNameFather("Rocky");
        dog8.setNameMother("Molly");
        dog8.setNameFather("Buster");
        dog2.setNameMother("Molly");
        dog2.setNameFather("Sam");
        dog4.setNameMother("Lady");
        dog4.setNameFather("Sparky");
        for(Dog dog:dogs){
            System.out.println(dog.toString());
        }
        System.out.println();
        System.out.println(dog8.fathersName());
        System.out.println(dog3.fathersName());
        System.out.println("Coco has same mother as Rocky? " + dog8.hasSameMotherAs(dog2));
    }
}
