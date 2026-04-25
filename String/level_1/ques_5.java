package level_1;
import java.util.Scanner;
public class ques_5 {
    public static void generateException(String text) {
        System.out.println(text.charAt(text.length())); // out of bounds
    }
    public static void handleException(String text) {
        try {
            System.out.println(text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Handled Exception: " + e);
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

