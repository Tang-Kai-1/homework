package io.codelex.classesandobjects.practice;

// Each BankAccount object represents one user's account
// information including name and balance of money.

public class BankAccount {
    public String name;
    public double balance;

    public final void deposit(double amount) {
        balance += amount;
    }

    public final void withdraw(double amount) {
        balance -= amount;
    }

    public String toString() {
        String balanceFormatted = Double.toString(Math.abs(balance)).format("%.2f");
        if (balance < 0) {
            return name + ", -$" + balanceFormatted;
        } else {
            return name + ", $" + balanceFormatted;
        }
    }

}
