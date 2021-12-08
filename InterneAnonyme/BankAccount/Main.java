package com.company.InterneAnonyme.BankAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(123456789,100);
        System.out.println(bankAccount);
        bankAccount.addMoney(50);
        System.out.println(bankAccount);
        bankAccount.removeMoney(30);
        System.out.println(bankAccount);

        SavingsAccount savingsAccount = new SavingsAccount(456789,100);
        System.out.println(savingsAccount);
        savingsAccount.addMoney(20);
        System.out.println(savingsAccount);
        savingsAccount.removeMoney(30);
        System.out.println(savingsAccount);
    }
}
