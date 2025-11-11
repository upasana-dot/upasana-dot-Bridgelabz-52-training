package map;
import java.util.*;

public class Q7 {
    public static void main(String[] args) {
        Map<String, Integer> stock = new HashMap<>();
        stock.put("Apple", 10);
        stock.put("Banana", 5);

        stock.put("Apple", stock.get("Apple") - 2); // sell 2
        stock.put("Banana", stock.get("Banana") + 10); // restock

        stock.entrySet().removeIf(e -> e.getValue() <= 0);
        System.out.println(stock);
    }
}
