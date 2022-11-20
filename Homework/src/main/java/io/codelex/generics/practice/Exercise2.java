package io.codelex.generics.practice;

import java.util.ArrayList;
import java.util.List;

public class Exercise2 {
    public static String concatenate(List<?> list) {
        String result = "";
        String separator = "";
        Object first = list.get(0);
        if (first instanceof String) {
            result = "String:";
            separator = " ";
        } else if (first instanceof Integer) {
            result = "Integers:";
            separator = "+";
        }
        for (Object el : list)
            result = result + separator + el.toString();
        return result;
    }
}
