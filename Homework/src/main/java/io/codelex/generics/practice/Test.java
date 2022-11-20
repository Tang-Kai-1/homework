package io.codelex.generics.practice;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Exercise1 list = new Exercise1();
        list.add(1,new Integer(2));
        System.out.println(list.get(1));
        System.out.println(list.get(1).getClass().getSimpleName());

        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Object> list3 = new ArrayList<>();
        list1.add("word");
        list2.add(1);
        list3.add(new Object());
        System.out.println(Exercise2.concatenate(list1));
        System.out.println(Exercise2.concatenate(list2));
        System.out.println(Exercise2.concatenate(list3));
    }
}
