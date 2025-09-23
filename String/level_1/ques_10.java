package level_1;
import java.util.Scanner;

public class ques_10 {

    public static String manualToLower(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                result += (char)(ch + 32);
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

        String lower1 = manualToLower(text);
        String lower2 = text.toLowerCase();

        System.out.println("Manual Lowercase: " + lower1);
        System.out.println("Built-in Lowercase: " + lower2);
        System.out.println("Comparison: " + compareUsingCharAt(lower1, lower2));
    }
}

