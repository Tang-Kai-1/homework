package io.codelex.oop.persons;

public class Customer extends Person {
    private int purchaseCount;
    private String customerId;

    public Customer(String firstName, String lastName, String id, String customerId, int age, int purchaseCount) {
        super(firstName, lastName, id, age);
        this.purchaseCount = purchaseCount;
        this.customerId = customerId;
    }

    public int getPurchaseCount() {
        return purchaseCount;
    }

    public void setPurchaseCount(int purchaseCount) {
        this.purchaseCount = purchaseCount;
    }

    @Override
    public String getInfo() {
        return getFirstName() + " " + getLastName() + ", " + customerId + " (" + purchaseCount + " purchases).";
    }
}
