interface PaymentProcessor {
    void processPayment(double amount);
}
default void generateReceipt(double amount) {
    System.out.println("Receipt: Payment of " + amount + " processed.");
}
class PayPalProcessor implements PaymentProcessor {
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of " + amount);;
    }
}
class StripeProcessor implements PaymentProcessor {
    public void processPayment(double amount) { 
        System.out.println("Processing Stripe payment of " + amount);;
    }           
}
class SquareProcessor implements PaymentProcessor {
    public void processPayment(double amount) { 
        System.out.println("Processing Square payment of " + amount);;
    }           
}
public class PaymentProcessorMain {
    public static void main(String[] args) {
        PaymentProcessor p1 = new PayPalProcessor();
        PaymentProcessor p2 = new StripeProcessor();
        PaymentProcessor p3 = new SquareProcessor();                                
    }
}