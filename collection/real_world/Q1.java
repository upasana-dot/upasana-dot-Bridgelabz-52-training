package collection.real_world;
import java.util.*;

class Order {
    int orderId;
    String customerName;

    public Order(int orderId, String customerName) {
        this.orderId = orderId;
        this.customerName = customerName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;
        Order order = (Order) o;
        return orderId == order.orderId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId);
    }

    @Override
    public String toString() {
        return "Order ID: " + orderId + ", Customer: " + customerName;
    }
}

public class Q1{
    public static void main(String[] args) {
        // 1️⃣ List - store all orders
        List<Order> orderList = new ArrayList<>();
        orderList.add(new Order(101, "Alice"));
        orderList.add(new Order(102, "Bob"));
        orderList.add(new Order(101, "Alice")); // duplicate

        // 2️⃣ Set - remove duplicates
        Set<Order> uniqueOrders = new HashSet<>(orderList);

        // 3️⃣ Queue - process orders (FIFO)
        Queue<Order> orderQueue = new LinkedList<>(uniqueOrders);

        // 4️⃣ Stack - failed orders
        Stack<Order> failedOrders = new Stack<>();

        System.out.println("Processing Orders...");
        while (!orderQueue.isEmpty()) {
            Order order = orderQueue.poll();
            System.out.println("Processing: " + order);

            if (order.orderId == 102) { // Simulate failure
                System.out.println(" Order Failed: " + order.orderId);
                failedOrders.push(order);
            } else {
                System.out.println("Order Successful: " + order.orderId);
            }
        }

        // Reprocess failed orders
        System.out.println("\nReprocessing Failed Orders...");
        while (!failedOrders.isEmpty()) {
            Order failed = failedOrders.pop();
            System.out.println("Retrying: " + failed);
            System.out.println(" Order Successful on Retry: " + failed.orderId);
        }
    }
}
