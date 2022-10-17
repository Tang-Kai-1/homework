package io.codelex.testtwo.exercise2;

import java.util.ArrayList;
import java.util.List;

public class Basket<T> {
    private List<T> list;
    private int elementCount = 0;

    public Basket() {
        list = new ArrayList<>();
    }

    public void addToBasket(T insertedObject) throws BasketFullException {
        if (list.size() == 10) {
            throw new BasketFullException("Basket is full!");
        } else {
            list.add(insertedObject);
        }
    }

    public void removeFromBasket() throws BasketEmptyException {
        if (elementCount == 0) {
            throw new BasketEmptyException("Basket is empty!");
        } else {
            list.remove(list.size() - 1);
        }
    }
}
