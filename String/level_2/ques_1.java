package level_2;
import java.util.Scanner;

public class ques_1 {

    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count); 
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

        int manualLength = findLength(text);
        int builtinLength = text.length();

        System.out.println("Manual length: " + manualLength);
        System.out.println("Built-in length(): " + builtinLength);
    }
}

