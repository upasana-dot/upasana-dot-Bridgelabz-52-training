interface Discountable {
    void applyDiscount(double percent);
    double getDiscountDetails();
}

abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() { return itemName; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }

    public abstract double calculateTotalPrice();

    public void getItemDetails() {
        System.out.println(itemName + " | Price: " + price + " | Quantity: " + quantity);
    }
}

class VegItem extends FoodItem implements Discountable {
    private double discount = 0;

    public VegItem(String name, double price, int quantity) { super(name, price, quantity); }

    @Override
    public double calculateTotalPrice() { return getPrice() * getQuantity() - discount; }

    @Override
    public void applyDiscount(double percent) { discount = getPrice() * getQuantity() * percent / 100; }

    @Override
    public double getDiscountDetails() { return discount; }
}

class NonVegItem extends FoodItem implements Discountable {
    private double discount = 0;

    public NonVegItem(String name, double price, int quantity) { super(name, price, quantity); }

    @Override
    public double calculateTotalPrice() { return getPrice() * getQuantity() * 1.10 - discount; } // 10% extra

    @Override
    public void applyDiscount(double percent) { discount = getPrice() * getQuantity() * percent / 100; }

    @Override
    public double getDiscountDetails() { return discount; }
}

// Main
public class FoodDeliverySystem {
    public static void main(String[] args) {
        FoodItem[] order = {
            new VegItem("Paneer Curry", 200, 2),
            new NonVegItem("Chicken Biryani", 300, 1)
        };

        for (FoodItem item : order) {
            item.getItemDetails();
            if (item instanceof Discountable) ((Discountable) item).applyDiscount(10);
            System.out.println("Total Price: " + item.calculateTotalPrice());
            System.out.println("-------------------");
        }
    }
}
