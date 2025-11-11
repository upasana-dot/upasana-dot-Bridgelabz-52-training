package map;
import java.util.*;

public class Q17 {
    public static void main(String[] args) {
        Map<String, Double> cart = new LinkedHashMap<>();
        cart.put("Phone", 25000.0);
        cart.put("Earphones", 2000.0);
        cart.put("Charger", 800.0);

        double total = cart.values().stream().mapToDouble(Double::doubleValue).sum();
        if (total > 5000) total *= 0.9; // 10% discount

        System.out.println("Total after discount: ₹" + total);
    }
}

