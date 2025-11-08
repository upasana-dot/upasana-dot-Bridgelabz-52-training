
interface Payment {
    void pay(double amount);
}
class UPI implements Payment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}
class CreditCard implements Payment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card");
    }
}
class wallet implements Payment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Wallet");
    }
}
public class Main {
    public static void main(String[] args) {
        Payment p1 = new UPI();
        Payment p2 = new CreditCard();
        Payment p3 = new wallet();
        p1.pay(500.0);
        p2.pay(1500.0);
        p3.pay(300.0);
    }
}