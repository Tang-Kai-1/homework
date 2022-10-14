package io.codelex.testtwo.exercise1;

public class DebitCard extends Card{
    public DebitCard(String cardNumber, String nameFull, int cvcCode) {
        super(cardNumber, nameFull, cvcCode);
    }

    @Override
    public void addMoney(double amount) {
        balance+=amount;
        if(balance>10000){
            System.out.println("Warning: Too much money");
        }
    }

    @Override
    public void removeMoney(double amount) throws NotEnoughFundsException {
        if(amount>balance){
            throw new NotEnoughFundsException("Can't withdraw more than you have");
        }else{
            balance-=amount;
        }
    }
}
