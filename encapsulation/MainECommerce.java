import java.util.*;

// Interface
interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

// Abstract Class
abstract class Product {
    private int productId;
    private String name;
    private double price;

    // Constructor
    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Encapsulation: getters & setters
    public int getProductId() { return productId; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    // Abstract method
    public abstract double calculateDiscount();

    // Concrete method
    public void displayDetails() {
        System.out.println("Product ID: " + productId + ", Name: " + name + ", Price: " + price);
    }
}

// Electronics Class
class Electronics extends Product implements Taxable {
    private double warrantyDiscount; // extra discount for warranty

    public Electronics(int id, String name, double price, double warrantyDiscount) {
        super(id, name, price);
        this.warrantyDiscount = warrantyDiscount;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.10 + warrantyDiscount; // 10% discount + warranty
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.18; // 18% GST
    }

    @Override
    public String getTaxDetails() {
        return "Tax for Electronics: " + calculateTax();
    }
}

// Clothing Class
class Clothing extends Product implements Taxable {
    private String size;

    public Clothing(int id, String name, double price, String size) {
        super(id, name, price);
        this.size = size;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.15; // 15% discount
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.05; // 5% GST
    }

    @Override
    public String getTaxDetails() {
        return "Tax for Clothing: " + calculateTax();
    }
}

// Groceries Class
class Groceries extends Product {
    public Groceries(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.05; // 5% discount
    }
}

// Main Class
public class MainECommerce {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Electronics(101, "Laptop", 50000, 1000));
        products.add(new Clothing(102, "Shirt", 2000, "M"));
        products.add(new Groceries(103, "Rice", 1000));

        // Polymorphism: Product reference can point to all types
        for (Product p : products) {
            p.displayDetails();
            double discount = p.calculateDiscount();
            double tax = (p instanceof Taxable) ? ((Taxable)p).calculateTax() : 0;
            double finalPrice = p.getPrice() + tax - discount;
            System.out.println("Discount: " + discount);
            System.out.println("Tax: " + tax);
            System.out.println("Final Price: " + finalPrice);

            if (p instanceof Taxable) {
                System.out.println(((Taxable)p).getTaxDetails());
            }
            System.out.println("---------------------------");
        }
    }
}
