package io.codelex.testtwo.exercise1;

public class CreditCard extends Card {
    private double cardLimit;

    public CreditCard(String cardNumber, String nameFull, int cvcCode, double cardLimit) {
        super(cardNumber, nameFull, cvcCode);
        this.cardLimit = cardLimit;
    }


    @Override
    public void removeMoney(double amount) throws NotEnoughFundsException {
        super.removeMoney(amount);
        if (balance < 100) {
            System.out.println("Warning: Low funds");
        }
    }
}
