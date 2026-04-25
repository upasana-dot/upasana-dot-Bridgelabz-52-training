import java.util.*;
class Product {
    static double discount = 10; // percent
    final int productID;
    String productName;
    double price;
    int quantity;

    Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    void displayProductDetails() {
        if (this instanceof Product) {
            double discountedPrice = price - (price * discount / 100);
            System.out.println("Product ID: " + productID + ", Name: " + productName +
                               ", Price after " + discount + "% discount: " + discountedPrice +
                               ", Quantity: " + quantity);
        }
    }
}

public class MainProduct {
    public static void main(String[] args) {
        Product p1 = new Product(301, "Laptop", 50000, 2);
        Product p2 = new Product(302, "Headphones", 2000, 5);

        p1.displayProductDetails();
        p2.displayProductDetails();

        Product.updateDiscount(15);
        System.out.println("Updated discount: " + Product.discount);
    }
}

