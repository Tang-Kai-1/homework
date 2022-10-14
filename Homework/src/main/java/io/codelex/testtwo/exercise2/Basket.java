package io.codelex.testtwo.exercise2;

import java.util.ArrayList;
import java.util.List;

public class Basket<T> {
    private List<T> list;
    private int elementCount=0;
    private T object;
    public Basket(T object){
        list = new ArrayList<>();
        this.object=object;
    }
    public <E> void addToBasket(E insertedObject) throws BasketFullException,IllegalArgumentException{
        if(insertedObject.getClass().equals(object.getClass())) {
            if (elementCount == 10) {
                throw new BasketFullException("Basket is full!");
            } else {
                elementCount += 1;
            }
        }
        else{
            throw new IllegalArgumentException("Input mismatch!");
        }
    }
    public void removeFromBasket() throws BasketEmptyException{
        if(elementCount==0){
            throw new BasketEmptyException("Basket is empty!");
        }else{
            elementCount-=1;
        }
    }
}
