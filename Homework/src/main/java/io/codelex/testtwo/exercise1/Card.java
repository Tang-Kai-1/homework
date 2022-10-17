package io.codelex.testtwo.exercise1;

public abstract class Card {
    protected String cardNumber;
    protected String nameFull;
    protected String cvcCode;
    protected double balance = 0;

    public Card(String cardNumber, String nameFull, int cvcCode) {
        if (cvcCode > 999 || cvcCode < 0) {
            throw new IllegalArgumentException("Illegal CVC code!");
        } else {
            this.cardNumber = cardNumber;
            this.nameFull = nameFull;
            this.cvcCode = String.format("%03d", cvcCode);
        }
    }

    public void addMoney(double amount) {
        balance += amount;
    }

    public void removeMoney(double amount) throws NotEnoughFundsException {
        if (amount > balance) {
            throw new NotEnoughFundsException("Can't withdraw more than you have");
        } else {
            balance -= amount;
        }
    }
}
