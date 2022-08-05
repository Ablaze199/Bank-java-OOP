
import java.util.Scanner;

public class AccountDriver {
    // Entry point of program
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        // create an array of Acounts
        Account account[] = new Account[10];

    }

    /**
     * Account choice
     * 
     * @param keyboard
     * @return Chioce
     */
    public static int accountMenu(Scanner keyboard) {
        System.out.println("Select Account type");
        System.out.println("1. Checking Account");
        System.out.println("2. Savings Account");
        int choice;

        do {
            System.out.println("Enter choice: ");
            choice = keyboard.nextInt();
        } while (choice < 1 || choice > 2);
        return choice;
    }

    public static int searchAccount(Account accounts[], int count, int accountNumber) {

        for (int i = 0; i < count; i++) {
            if (accounts[i].getAccountNumber() == accountNumber) {
                return i;
            }
        }

        return -1;
    }

    /**
     * Function to perform deposit on a seleceted account
     * 
     * @param doDeposit
     * @return
     */
    public void doDeposit(Account accounts[], int count, Scanner Keyboard) {
        // Get the account Number
        System.out.print("\nPlease enter account number: ");
        int accountNumber = Keyboard.nextInt();

        // Search for Account
        int index = searchAccount(accounts, count, accountNumber);

        if (index >= 0) {
            // amount
            System.out.print("Please enter withdraw Amount: ");
            double amount = Keyboard.nextDouble();
            accounts[index].deposit(amount);
        } else {
            System.out.println("No account exixt with AccountNumber: " + accountNumber);
        }

    }

    public void doWithdraw(Account accounts[], int count, Scanner keyboard) {

        System.out.print("\nPlease enter account number: ");
        int accountNumber = keyboard.nextInt();

        // Search for Account
        int index = searchAccount(accounts, count, accountNumber);

        if (index >= 0) {
            // amount
            System.out.print("Please enter Deposit Amount: ");
            double amount = keyboard.nextDouble();
            accounts[index].deposit(amount);
        } else {
            System.out.println("No account exixt with AccountNumber: " + accountNumber);
        }

    }

    /**
     * function to create a new Account
     */
    public static Account createAccount(Scanner keyboard) {
        Account account = null;
        int choice = accountMenu(keyboard);
        int accountNumber;
        System.out.println("Enter Account Number: ");
        accountNumber = keyboard.nextInt();

        if (choice == 1) { // checking account
            System.out.println("Enter Transaction Fee: ");
            double fee = keyboard.nextDouble();
            account = new CheckingAccount(accountNumber, fee);
        } else { // savings account
            System.out.println("Please enter Interest Rate: ");
            double ir = keyboard.nextDouble();
            account = new SavingsAccount(accountNumber, ir);
        }
        return account;
    }

    /**
     * menu to display options and get the users selection
     * 
     * @param keyboard
     * @return chioce
     */

    public static int menu(Scanner keyboard) {
        System.out.println("Bank Account Menu");
        System.out.println("1. Create NEW Account");
        System.out.println("2. Deposit funds");
        System.out.println("3. Withdraw funds");
        System.out.println("4.Quit");

        int choice;
        do {
            System.out.println("Enter choice: ");
            choice = keyboard.nextInt();
        } while (choice < 1 || choice > 4);
        return choice;
    }

}
