package io.codelex.generics.practice;

import java.util.List;

public class Exercise3 {
    public void add(Object value, List<?> list) {
        list.add(value);
    }
    public <V> void addAllX(List<V> v, List<? super V> l) {
        for(V el : v) l.add(el);
    }//This method is less restrictive because it allows not just a single class but also it's predecessors.
    public <V> void addAllY(List<V> v, List<V> l) {
        for(V el : v) l.add(el);
    }
}
