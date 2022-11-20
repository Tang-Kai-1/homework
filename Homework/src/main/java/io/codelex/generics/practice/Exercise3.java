package io.codelex.generics.practice;

import java.util.List;

public class Exercise3 {
    public <T> void add(T value, List<T> list) {
        list.add(value);
    }//This solution would be more restrictive but wildcards are too unpredictable so using generics would be better.
    public <V> void addAllX(List<V> v, List<? super V> l) {
        for(V el : v) l.add(el);
    }//This method is less restrictive because it allows not just a single class but also it's predecessors.
    public <V> void addAllY(List<V> v, List<V> l) {
        for(V el : v) l.add(el);
    }
}
