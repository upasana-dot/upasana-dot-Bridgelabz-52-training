package lambda;
import java.util.*;
import java.util.stream.Collectors;

class Invoice {
    String transactionId;
    Invoice(String id) {
        this.transactionId = id;
    }
    public String toString() {
        return "Invoice for Transaction ID: " + transactionId;
    }
}

public class InvoiceGenerator {
    public static void main(String[] args) {
        List<String> transactionIds = Arrays.asList("TXN001", "TXN002", "TXN003");

        List<Invoice> invoices = transactionIds.stream()
                                               .map(Invoice::new)
                                               .collect(Collectors.toList());

        invoices.forEach(System.out::println);
    }
}

