interface SecurityUtils {
    static boolean isStrongPassword(String password) {
        return password.length() >= 8 &&
               password.matches(".*[A-Z].*") &&
               password.matches(".*[a-z].*") &&
               password.matches(".*\\d.*") &&
               password.matches(".*[@#$%^&+=].*");
    }
}

public class PasswordCheck {
    public static void main(String[] args) {
        String pwd = "Admin@123";
        if (SecurityUtils.isStrongPassword(pwd))
            System.out.println("Strong Password");
        else
            System.out.println("Weak Password");
    }
}
