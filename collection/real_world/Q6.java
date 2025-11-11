package collection.real_world;
import java.util.*;

class Product {
    String name;
    int stock;
    double price;

    Product(String name, int stock, double price) {
        this.name = name; this.stock = stock; this.price = price;
    }

    @Override
    public String toString() {
        return name + " (Stock: " + stock + ", ₹" + price + ")";
    }
}

public class Q6 {
    public static void main(String[] args) {
        Set<String> productNames = new HashSet<>();
        List<Product> allProducts = new ArrayList<>();
        Queue<Product> restockQueue = new LinkedList<>();
        Stack<Product> restocked = new Stack<>();

        Product p1 = new Product("Milk", 2, 40);
        Product p2 = new Product("Bread", 1, 30);
        Product p3 = new Product("Milk", 2, 40); // duplicate

        productNames.add(p1.name);
        productNames.add(p2.name);
        productNames.add(p3.name);

        allProducts.add(p1);
        allProducts.add(p2);

        for (Product p : allProducts)
            if (p.stock < 3) restockQueue.offer(p);

        while (!restockQueue.isEmpty()) {
            Product p = restockQueue.poll();
            p.stock += 10;
            restocked.push(p);
        }

        System.out.println(" Restocked Items: " + restocked);
        System.out.println("↩ Undo Last Restock: " + restocked.pop());
    }
}
