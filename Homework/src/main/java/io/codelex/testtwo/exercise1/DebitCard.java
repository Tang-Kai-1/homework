package io.codelex.testtwo.exercise1;

public class DebitCard extends Card {
    public DebitCard(String cardNumber, String nameFull, int cvcCode) {
        super(cardNumber, nameFull, cvcCode);
    }

    @Override
    public void addMoney(double amount) {
        super.addMoney(amount);
        if (balance > 10000) {
            System.out.println("Warning: Too much money");
        }
    }

}
