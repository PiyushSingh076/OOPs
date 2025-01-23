package EncapAbst_Intro;

import javax.security.auth.login.AccountException;

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.makeSound(); // Outputs: Woof
        myDog.sleep(); // Outputs: Zzz


        BankAccount account = new BankAccount("123456789", 1000.0);

        // Accessing public methods: encapsulation
        account.balance+=20;//directly also u can access like this
        System.out.println("Account Number: " + account.getAccountNumber()); //CAN ACCESS AC.NO NOW BY PUBLIC METHOD
        //(ENCAPSULATION)
        System.out.println("Initial Balance: " + account.getBalance());

        // Modifying balance using public methods: encapsulation
        account.deposit(500.0);
        account.withdraw(200.0);
        System.out.println("Final Balance: " + account.getBalance());

        // Direct access to private fields is not allowed: data hiding
        // account.balance = 1000.0; // This would cause a compilation error

        double a =account.balance;//not hiding we can access balance 
        double b=account.accountNumber;//cant acces (DATA HIDING) (Security)
        //Then how to access privavte then ??--> Getter setter that returns acno or let u set it



    }
    
}
