package io.codelex.polymorphism.practice.exercise6;

abstract class Food {
    protected Integer quantity;

    public Food(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ": " + quantity;
    }
}
