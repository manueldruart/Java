package com.company.InterneAnonyme.BankAccount;

public class BankAccount {
    private int accountNumber;
    private int amount;
    private Transaction lastTransaction;

   public void addMoney(int montant){
       this.amount += montant;
       lastTransaction = new Transaction("Add",montant);
    }

   public void removeMoney(int montant) {
       this.amount -= montant;
       lastTransaction = new Transaction("remove",montant);
   }

    public BankAccount(int accountNumber, int amount) {
        this.accountNumber = accountNumber;
        this.amount = amount;
        lastTransaction = new Transaction("open",amount);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    protected Transaction getLastTransaction() {
        return lastTransaction;
    }

    public void setLastTransaction(Transaction lastTransaction) {
        this.lastTransaction = lastTransaction;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber=" + accountNumber +
                ", amount=" + amount +
                ", lastTransaction=" + lastTransaction +
                '}';
    }

    protected class Transaction  {
       private String type;
       private int amount;

      public Transaction(String type, int amount) {
          this.type = type;
          this.amount = amount;
      }

      @Override
      public String toString() {
          return "transaction{" +
                  "type='" + type + '\'' +
                  ", amount=" + amount +
                  '}';
      }


  }
}
