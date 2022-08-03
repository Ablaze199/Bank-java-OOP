// Base class
// Abstract

public abstract class Account {

    private int accountNumber;
    protected double balance;

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

    // abstract
    /**
     * function to deposit funds as long as the amount parameter is>0
     */

    public abstract void deposit(double amount);

    /**
     * @param
     * function        to withdraw funds from the Account as long as the amount to
     *                 withdraw must be > 0
     *                 must be <= 0
     */

    public abstract void withdraw(double amount);

}