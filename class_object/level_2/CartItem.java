package level_2;
class CartItem {
    String itemName;
    double price;
    int quantity;

    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    void addItem(int qty) {
        quantity += qty;
        System.out.println(qty + " items added. Total quantity: " + quantity);
    }

    void removeItem(int qty) {
        if (qty <= quantity) {
            quantity -= qty;
            System.out.println(qty + " items removed. Total quantity: " + quantity);
        } else {
            System.out.println("Cannot remove more than available quantity!");
        }
    }

    void displayTotalCost() {
        System.out.println("Item: " + itemName);
        System.out.println("Price per item: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + (price * quantity));
    }
    public static void main(String[] args) {
        CartItem cart = new CartItem("Shoes", 1500, 2);
        cart.addItem(1);
        cart.removeItem(1);
        cart.displayTotalCost();
    }
}

