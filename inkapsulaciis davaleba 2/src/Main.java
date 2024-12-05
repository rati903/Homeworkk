import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Rati", 7000);
        BankAccount account2 = new BankAccount("Dachi", 2000);

        account1.displayAccountInfo();
        account2.displayAccountInfo();


        System.out.println("Attempting to transfer $500 from Rati to Dachi...");
        account1.transferMoney(account2, 500);


        account1.printTransactionHistory();
        account2.printTransactionHistory();

        System.out.println("Blocking Rati's account...");
        account1.blockAccount();

        System.out.println("Attempting to transfer $300 from Rati to Dachi ...");
        account1.transferMoney(account2, 300);

        System.out.println("Unblocking Rati's account...");
        account1.unblockAccount();


        System.out.println("Attempting to transfer $1200 from Rati to Dachi ...");
        account1.transferMoney(account2, 1200);

        System.out.println("Calculating deposit growth...");
        double finalAmount = account1.depositCalculator(1000, 12);
        System.out.println("Final amount after 12 months: $" + finalAmount);

        System.out.println("Final account details:");
        account1.displayAccountInfo();
        account2.displayAccountInfo();
    }
}
