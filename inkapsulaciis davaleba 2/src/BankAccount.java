public class BankAccount {
    private String accountHolderName;
    private double balance;
    private boolean accountLock = true;
    private String[] transactionHistory = new String[100];
    private int transactionCount = 0;

    public BankAccount(String accountHolderName, double balance) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        addTransaction("Account opened with balance: $" + balance);
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    private void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isAccountLock() {
        return accountLock;
    }

    public void setAccountLock(boolean accountLock) {
        this.accountLock = accountLock;
    }

    private void addTransaction(String transaction) {
        if (transactionCount < transactionHistory.length) {
            transactionHistory[transactionCount++] = transaction;
        } else {
            System.out.println("Transaction history is full.");
        }
    }

    public void printTransactionHistory() {
        System.out.println("Transaction History for " + accountHolderName + ":");
        for (int i = 0; i < transactionCount; i++) {
            if (transactionHistory[i] != null) {
                System.out.println(transactionHistory[i]);
            }
        }
    }

    public boolean transferMoney(BankAccount recipient, double amount) {
        if (!accountLock) {
            System.out.println("Account is blocked. Cannot perform transactions.");
            return false;
        }
        if (amount > 1000) {
            System.out.println("Cannot transfer more than $1000.");
            return false;
        }
        if (balance < amount) {
            System.out.println("Insufficient balance.");
            return false;
        }

        setBalance(this.balance - amount);
        recipient.setBalance(recipient.getBalance() + amount);

        addTransaction("Transferred $" + amount + " to " + recipient.getAccountHolderName());
        recipient.addTransaction("Received $" + amount + " from " + this.accountHolderName);
        return true;
    }

    public void blockAccount() {
        setAccountLock(false);
        System.out.println("Account has been blocked.");
    }

    public void unblockAccount() {
        setAccountLock(true);
        System.out.println("Account has been unblocked.");
    }

    public double depositCalculator(double amount, int months) {
        double finalAmount = amount;
        for (int i = 0; i < months; i++) {
            finalAmount += finalAmount * 0.01;
        }
        return finalAmount;
    }

    public void displayAccountInfo() {
        System.out.println("Account Holder: " + getAccountHolderName());
        System.out.println("Balance: $" + getBalance());
        System.out.println("Account Status: " + (isAccountLock() ? "Active" : "Blocked"));
    }
}
