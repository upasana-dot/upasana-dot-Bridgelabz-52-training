import java.util.*;
class MainBankAccount {
    static String bankName = "ABC Bank";  // Static variable shared across all
    static int totalAccounts = 0;

    final int accountNumber;   // Final variable (cannot be changed)
    String accountHolderName;
    double balance;
    // Constructor using 'this' to resolve ambiguity
    MainBankAccount(String accountHolderName, int accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAccounts++;
    }
    // Static method
    static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }
    // Instance method
    void displayAccountDetails() {
        if (this instanceof MainBankAccount) {
            System.out.println("Bank: " + bankName + 
                               ", Holder: " + accountHolderName +
                               ", Account No: " + accountNumber + 
                               ", Balance: " + balance);
        }
    }
}

// Test class
public class Main {
    public static void main(String[] args) {
        MainBankAccount acc1 = new MainBankAccount("Rahul", 101, 5000);
        MainBankAccount acc2 = new MainBankAccount("Neha", 102, 10000);

        acc1.displayAccountDetails();
        acc2.displayAccountDetails();

        MainBankAccount.getTotalAccounts();
    }
}
