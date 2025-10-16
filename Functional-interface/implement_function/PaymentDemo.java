interface PaymentMethod {
    void pay(double amount);
}

class UPI implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI");
    }
}

class CreditCard implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card");
    }
}

class Wallet implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Wallet");
    }
}

public class PaymentDemo {
    public static void main(String[] args) {
        PaymentMethod upi = new UPI();
        upi.pay(500);
    }
}
