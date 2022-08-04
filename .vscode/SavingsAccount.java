// Savings Account child class
// has an interest rate
//a method to apply interest + profit

public class SavingsAccount extends Account {
//interest rate
private double interestRate;

// default constructor
    public SavingsAccount() {
        super();
    }

    /**
     * 
     * @param accountNumber
     * @param fee initialize savings account 
     * with a customer account number and interest rate
     */
    public SavingsAccount(int accountNumber, double interestRate) {
        super(accountNumber);
        this.interestRate = interestRate;

    }
    //getter function
    public double getInterestRate(){
        return this.interestRate;
    }
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double calcInterest() {
        return balance * interestRate;
    }
      
    public void applyInterest(){
        
    }
    public void deposit(double amount) {
        // first check amount
        if (amount > 0) {
            balance += amount;
            System.out.printf("Amount %.2f deposited%n", amount);
            System.out.printf("Current Balance is %.2f%n", balance);
            // Apply Transaction fee
            balance -= FEE;
            System.out.printf("fee %.2f Applied%n", FEE);
        } else {
            System.out.println("A negative amount cannot be deposited");

        }

    }

    /**
     * @param
     * function        to withdraw funds from the Account as long as the amount to
     *                 withdraw must be > 0
     *                 must be <= 0
     */

    public void withdraw(double amount) {

        if (amount > 0) {
            // check sufficient balance
            if ((amount + FEE) < +balance) {

                System.out.printf("Amount  %.2f withdrawn from Account%n", amount);

                balance -= amount;
                balance -= FEE;
                System.out.printf("fee %.2f applied%n", fee);
                System.out.printf("Current Balance is  %.2f%n", balance);
            }
        } else {
            System.out.println("negative amount cannot be withdrawn!");
        }
    }
}


}
