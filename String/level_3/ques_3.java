package level_3;
import java.util.Scanner;

public class ques_3 {

    public static char findFirstNonRepeating(String text) {
        int[] freq = new int[256]; 
        int len = text.length();

        for (int i = 0; i < len; i++) {
            freq[text.charAt(i)]++;
        }

        for (int i = 0; i < len; i++) {
            if (freq[text.charAt(i)] == 1) {
                return text.charAt(i);
            }
        }
        return '\0'; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        char result = findFirstNonRepeating(input);

        if (result != '\0')
            System.out.println("First non-repeating");
        else
            System.out.println("no non-repeateing character found");
    }
}
