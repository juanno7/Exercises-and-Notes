package org.example;

public class Account {
    private int balance;
    private String accountNumber;
    private Customer owner;

    public Account(int balance, String accountNumber, Customer owner) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.owner = owner;
    }

    public Customer getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withDraw(double amountToWithdraw){
        if(amountToWithdraw <= balance){
            balance -= amountToWithdraw;
        } else{
            System.out.println("Insufficient funds.");
        }
    }
}
