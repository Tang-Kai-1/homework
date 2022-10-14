package io.codelex.testtwo.exercise1;

public class CreditCard extends Card {
    private double cardLimit;

    public CreditCard(String cardNumber, String nameFull, int cvcCode, double cardLimit) {
        super(cardNumber, nameFull, cvcCode);
        this.cardLimit = cardLimit;
    }

    @Override
    public void addMoney(double amount) {
        balance += amount;
    }

    @Override
    public void removeMoney(double amount) throws NotEnoughFundsException {
        if (Math.abs(balance-amount)>cardLimit){
            throw new NotEnoughFundsException("Can't withdraw more than your card limit!");
        }
        else {
            balance -= amount;
            if (balance < 100) {
                System.out.println("Warning: Low funds");
            }
        }
    }
}
