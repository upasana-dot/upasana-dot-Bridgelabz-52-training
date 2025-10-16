interface SensitiveData {}

class BankAccount implements SensitiveData {
    String accountNumber = "1234567890";
}

public class EncryptionProcessor {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        if (acc instanceof SensitiveData) {
            System.out.println("Encrypting sensitive data before saving...");
        }
    }
}
