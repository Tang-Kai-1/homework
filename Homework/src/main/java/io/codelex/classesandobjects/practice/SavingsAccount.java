package io.codelex.classesandobjects.practice;

import java.util.Scanner;

public class SavingsAccount {
    private double monthlyInterest;
    private double balance;
    private double amountWithdrawn = 0;
    private double amountDeposited = 0;
    private double interestEarned = 0;

    public SavingsAccount(double interest, double balance) {
        this.monthlyInterest = interest / 12.0;
        this.balance = balance;
    }

    public void deposit(double depositAmount) {
        balance += depositAmount;
        amountDeposited += depositAmount;
    }

    public void withdraw(double withdrawAmount) {
        balance -= withdrawAmount;
        amountWithdrawn += withdrawAmount;
    }

    public void interestGrowth() {
        double interestGrowthMonth = balance * monthlyInterest;
        interestEarned += interestGrowthMonth;
        balance += interestGrowthMonth;
    }

    public double getBalance() {
        return balance;
    }

    public double getAmountWithdrawn() {
        return amountWithdrawn;
    }

    public double getAmountDeposited() {
        return amountDeposited;
    }

    public double getInterestEarned() {
        return interestEarned;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How much money is in the account?: ");
        double amount = sc.nextDouble();
        System.out.print("Enter the annual interest rate: ");
        double interest = sc.nextDouble();
        System.out.print("How long has the account been opened? ");
        int months = sc.nextInt();
        SavingsAccount account = new SavingsAccount(interest, amount);
        for (int i = 1; i <= months; i++) {
            System.out.print("Enter amount deposited for month " + i + ": ");
            double deposited = sc.nextDouble();
            System.out.print("Enter amount withdrawn for month " + i + ": ");
            double withdrawn = sc.nextDouble();
            account.deposit(deposited);
            account.withdraw(withdrawn);
            account.interestGrowth();
        }
        System.out.println("Total deposited: " + account.getAmountDeposited());
        System.out.println("Total withdrawn: " + account.getAmountWithdrawn());
        System.out.println("Interest earned: " + account.getInterestEarned());
        System.out.println("Ending balance: " + account.getBalance());
    }
}
