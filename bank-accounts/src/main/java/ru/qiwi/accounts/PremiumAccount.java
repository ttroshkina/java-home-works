package ru.qiwi.accounts;

public class PremiumAccount extends BankAccount{

    public PremiumAccount(double balance) {
        super(balance);
    }

    public double getAmountWithCommission(double amount) {
        return amount + 1;
    }
}
