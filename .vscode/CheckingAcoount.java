// Base class
// Abstract

public abstract class Account {

    private int accountNumber;
    private double balance;

    // default constructor
    public Account() {
    }

    public Account(int accountNumber) {
        this.accountNumber = accountNumber;
        balance = 0;
    }

    // Getter method
    public double getBalance() {
        return this.balance;
    }

}