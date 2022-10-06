package io.codelex.collections.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Origination:
 * Audi -> Germany
 * BMW -> Germany
 * Honda -> Japan
 * Mercedes -> Germany
 * VolksWagen -> Germany
 * Tesla -> USA
 */
public class Exercise1 {
    public static void main(String[] args) {
        String[] array = {"Audi", "BMW", "Honda", "Mercedes", "VolksWagen", "Mercedes", "Tesla"};

        //todo - replace array with an ArrayList and print out the results
        ArrayList<String> list = new ArrayList<>();
        for (String car : array) {
            list.add(car);
        }
        System.out.println(list);
        //todo - replace array with a HashSet and print out the results
        HashSet<String> hashSet = new HashSet<>();
        for (String car : array) {
            hashSet.add(car);
        }
        System.out.println(hashSet);
        //todo - replace array with a HashMap (use brand as key and origination as value) an print out the results
        HashMap<String, String> hashMap = new HashMap<>();
        for (String car : array) {
            if (car.equals("Tesla")) {
                hashMap.put(car, "USA");
            } else if (car.equals("Honda")) {
                hashMap.put(car, "Japan");
            } else {
                hashMap.put(car, "Germany");
            }
        }
        System.out.println(hashMap);
    }
}
