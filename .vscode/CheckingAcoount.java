public class CheckingAccount extends Account {
    // abstract
    /**
     * function to deposit funds as long as the amount parameter is>0
     */
    // default transaction fee

    private static double FEE = 2.5;

    // default constructor
    public CheckingAccount() {
        super();
    }

    /**
     * 
     * @param accountNumber
     * @param fee           initialize CheckingAccount with a custome Account Number
     *                      and a Customer Transc fee
     */
    public CheckingAccount(int accountNumber, double fee) {
        super(accountNumber);
        FEE = fee;

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
