package level_1;
import java.util.Scanner;
public class ques_6 {
    public static void generateException(String text) {
        System.out.println(text.substring(5, 2)); // invalid indices
    }

    public static void handleException(String text) {
        try {
            System.out.println(text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Handled IllegalArgumentException: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();

        // generateException(str);
        handleException(str);
    }
}
