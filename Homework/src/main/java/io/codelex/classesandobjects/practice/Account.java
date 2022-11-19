package io.codelex.classesandobjects.practice;

public class Account {
    private double balance;
    private String owner;

    public Account(String owner, double balance) {
        this.balance = balance;
        this.owner = owner;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdrawal(double amount) {
        balance -= amount;
    }

    public double balance() {
        return balance;
    }

    @Override
    public String toString() {
        return owner + " balance: " + balance;
    }


    public static void main(String[] args) {
        Account first = new Account("first", 100);
        first.deposit(20);
        System.out.println(first.toString());

        Account mattsAccount = new Account("Matt's account", 1000.00);
        Account myAccount = new Account("My account", 0);

        mattsAccount.withdrawal(100);
        myAccount.deposit(100);
        System.out.println(mattsAccount.toString());
        System.out.println(myAccount.toString());

        Account A = new Account("A", 100);
        Account B = new Account("B", 0);
        Account C = new Account("C", 0);
        transfer(A, B, 50);
        transfer(A, C, 25);

    }

    private static void transfer(Account from, Account to, double howMuch) {
        from.withdrawal(howMuch);
        to.deposit(howMuch);
        System.out.println(from.toString());
        System.out.println(to.toString());
    }
}
