package level_1;
import java.util.Scanner;

public class ques_9 {

    public static String manualToUpper(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                result += (char)(ch - 32);
            } else {
                result += ch;
            }
        }
        return result;
    }

    public static boolean compareUsingCharAt(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String upper1 = manualToUpper(text);
        String upper2 = text.toUpperCase();

        System.out.println("Manual Uppercase: " + upper1);
        System.out.println("Built-in Uppercase: " + upper2);
        System.out.println("Comparison: " + compareUsingCharAt(upper1, upper2));
    }
}

