package io.codelex.testtwo.exercise1;

public class CreditCard extends Card {


    public CreditCard(String cardNumber, String nameFull, int cvcCode) {
        super(cardNumber, nameFull, cvcCode);
    }


    @Override
    public void removeMoney(double amount) throws NotEnoughFundsException {
        super.removeMoney(amount);
        if (balance < 100) {
            System.out.println("Warning: Low funds");
        }
    }
}
