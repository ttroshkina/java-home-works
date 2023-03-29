package ru.qiwi.accounts;

public abstract class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    protected abstract double getAmountWithCommission(double amount);

    public double getAmount() {
        return balance;
    }

    public void getMoney(double amount) {
        balance -= getAmountWithCommission(amount);
    }
}
