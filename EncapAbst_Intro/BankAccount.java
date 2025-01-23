package EncapAbst_Intro;

import java.util.ArrayList;

public class BankAccount {
    // Private fields: data hiding
    private String accountNumber; //ENCAPSULATION HIDES THE INTERNAL VARIAB;ES AND SO IT CANNOT BE ACCSESSED DIRECTLY 
    //FROM OUT SIDE IN ORDER TO ACCES AND MODIFY IT PROVIDES PUBLIC FUNCTIONS
    double balance;

    // Constructor: encapsulation
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Public method to get account number: encapsulation
    public String getAccountNumber() {
        return accountNumber;
    }

    // Public method to get balance: encapsulation
    public double getBalance() {
        return balance;
    }

    // Public method to deposit money: encapsulation
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Public method to withdraw money: encapsulation
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
        }
    }

    ArrayList<Integer> list =new ArrayList<>();
    //list.DEFAULT_CAPACITY=20; //private hence cant access
}

