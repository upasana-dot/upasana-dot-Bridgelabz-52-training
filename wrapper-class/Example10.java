import java.util.*;

public class Example10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a numeric string: ");
        String input = sc.nextLine();

        Integer num = Integer.valueOf(input);
        System.out.println("Square: " + (num * num));
    }
}
