package com.company.InterneAnonyme.BankAccount;

public class SavingsAccount extends BankAccount{

    private Transaction beforeLastTransaction;

    public SavingsAccount(int accountNumber, int amount) {
        super(accountNumber, amount);
    }

    @Override
    public void addMoney(int montant) {

        super.addMoney(montant);
    }

    @Override
    public void removeMoney(int montant) {
        super.removeMoney(montant);
    }

    @Override
    public String toString() {
        return "SavingsAccount{" + super.toString() + " " +
                "beforeLastTransaction=" + beforeLastTransaction +
                '}';
    }
}
