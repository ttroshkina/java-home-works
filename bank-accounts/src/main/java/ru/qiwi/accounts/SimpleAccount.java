package ru.qiwi.accounts;

public class SimpleAccount extends BankAccount{

    public SimpleAccount(double balance) {
        super(balance);
    }

    public double getAmountWithCommission(double amount) {
        return amount * 1.05;
    }
}
