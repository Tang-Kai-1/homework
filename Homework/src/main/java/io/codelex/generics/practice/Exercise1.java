package io.codelex.generics.practice;

import java.util.ArrayList;
import java.util.List;

public class Exercise1 {
    private List<Object> list;

    public Exercise1(){
        list = new ArrayList<>();
    }

    public void add(int i, Object el) {
        if(list.size()>=i) {
            list.add(i-1, el);
        }
        else{
            list.add(el);
        }
    }

    public Object get(int i) {
        return list.get(i-1);
    }
}
