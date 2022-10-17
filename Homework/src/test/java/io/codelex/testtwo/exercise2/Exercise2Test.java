package io.codelex.testtwo.exercise2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Exercise2Test {
    @Test
    void TestAppleEmptyBasket() {
        Basket<Apple> basket = new Basket<>();
        Exception exception = assertThrows(BasketEmptyException.class, () -> {
            basket.removeFromBasket();
        });

        String expectedMessage = "Basket is empty!";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void TestMushroomEmptyBasket() {
        Basket<Mushroom> basket = new Basket<>();
        Exception exception = assertThrows(BasketEmptyException.class, () -> {
            basket.removeFromBasket();
        });

        String expectedMessage = "Basket is empty!";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void TestAppleFullBasket() {
        Basket<Apple> basket = new Basket<>();
        Exception exception = assertThrows(BasketFullException.class, () -> {
            for (int i = 0; i <= 10; i++) {
                basket.addToBasket(new Apple());
            }
        });

        String expectedMessage = "Basket is full!";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void TestMushroomFullBasket() {
        Basket<Mushroom> basket = new Basket<>();
        Exception exception = assertThrows(BasketFullException.class, () -> {
            for (int i = 0; i <= 10; i++) {
                basket.addToBasket(new Mushroom());
            }
        });

        String expectedMessage = "Basket is full!";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
}
