import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class AccountDriver {
    // Entry point of program
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        // create an array of Acounts
        Account account[] = new Account[10];

    }

    public int menu(Scanner keyboard) {
        System.out.println("Bank Account Menu");
        System.out.println("1. Create NEW Account");
        System.out.println("2. Deposit funds");
        System.out.println("3. Withdraw funds");
        System.out.println("4.Quit");

    }

}
