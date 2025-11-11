package collection.real_world;
import java.util.*;

class Account {
    int id;
    String name;

    Account(int id, String name) {
        this.id = id; this.name = name;
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Account)) return false;
        return id == ((Account) o).id;
    }

    @Override
    public String toString() { return name + " (ID:" + id + ")"; }
}

class Transaction {
    int txnId;
    int accountId;
    double amount;

    Transaction(int txnId, int accountId, double amount) {
        this.txnId = txnId; this.accountId = accountId; this.amount = amount;
    }

    @Override
    public String toString() {
        return "Txn#" + txnId + " AccID:" + accountId + " Amount:" + amount;
    }
}

public class Q4 {
    public static void main(String[] args) {
        List<Transaction> allTxns = new ArrayList<>();
        Queue<Transaction> pendingTxns = new LinkedList<>();
        Set<Account> validAccounts = new HashSet<>();
        Stack<Transaction> rollbackStack = new Stack<>();

        validAccounts.add(new Account(1001, "Alice"));
        validAccounts.add(new Account(1002, "Bob"));

        pendingTxns.offer(new Transaction(1, 1001, 5000));
        pendingTxns.offer(new Transaction(2, 9999, 3000)); // invalid account

        while (!pendingTxns.isEmpty()) {
            Transaction txn = pendingTxns.poll();
            boolean valid = validAccounts.stream().anyMatch(a -> a.id == txn.accountId);

            if (valid) {
                System.out.println(" Processed: " + txn);
                allTxns.add(txn);
            } else {
                System.out.println(" Failed: " + txn);
                rollbackStack.push(txn);
            }
        }

        System.out.println("\nUndo last failed transaction:");
        if (!rollbackStack.isEmpty())
            System.out.println("Rolling back: " + rollbackStack.pop());
    }
}
