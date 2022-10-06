package io.codelex.collections.practice.lists;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExercise11 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("This");
        list.add("is");
        list.add("a");
        list.add("ten");
        list.add("element");
        list.add("arraylist");
        list.add("that");
        list.add("contains");
        list.add("word");
        list.add("Foobar");
        System.out.println(list);
        list.set(4, "word");
        System.out.println(list);
        list.set(list.size() - 1, "notFoobar");
        System.out.println(list);
        Collections.sort(list);
        if (list.contains("Foobar")) {
            System.out.println("contains Foobar");
        } else {
            System.out.println("doesn't contain Foobar");
        }
        for (String word : list) {
            System.out.println(word);
        }
    }

}
