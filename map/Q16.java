package map;
import java.util.*;

public class Q16 {
    public static void main(String[] args) {
        Map<String, Double> accounts = new HashMap<>();
        accounts.put("ACC001", 5000.0);
        accounts.put("ACC002", 10000.0);
        accounts.put("ACC003", 7500.0);
        accounts.put("ACC004", 12000.0);
        accounts.put("ACC005", 9500.0);

        // Deposit
        accounts.put("ACC001", accounts.get("ACC001") + 2000);

        // Withdraw
        double withdrawAmt = 8000;
        String acc = "ACC004";
        if (accounts.get(acc) >= withdrawAmt)
            accounts.put(acc, accounts.get(acc) - withdrawAmt);
        else
            System.out.println("Insufficient balance for " + acc);

        // Sort by descending balance
        System.out.println("\nCustomers sorted by balance:");
        accounts.entrySet().stream()
                .sorted((a, b) -> Double.compare(b.getValue(), a.getValue()))
                .forEach(e -> System.out.println(e.getKey() + " → ₹" + e.getValue()));

        // Top 3 customers
        System.out.println("\nTop 3 Customers:");
        accounts.entrySet().stream()
                .sorted((a, b) -> Double.compare(b.getValue(), a.getValue()))
                .limit(3)
                .forEach(e -> System.out.println(e.getKey() + " → ₹" + e.getValue()));
    }
}

