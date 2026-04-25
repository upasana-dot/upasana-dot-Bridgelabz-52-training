package level_2;
import java.util.Scanner;

public class ques_7 {

    public static int[] findTrimIndexes(String str) {
        int start = 0, end = str.length() - 1;

        while (start < str.length() && str.charAt(start) == ' ') start++;
        while (end >= 0 && str.charAt(end) == ' ') end--;

        return new int[]{start, end + 1};
    }

    public static String substringUsingCharAt(String str, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) result += str.charAt(i);
        return result;
    }

    public static boolean compareUsingCharAt(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) if (s1.charAt(i) != s2.charAt(i)) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text with spaces: ");
        String text = sc.nextLine();

        int[] indexes = findTrimIndexes(text);
        String manualTrim = substringUsingCharAt(text, indexes[0], indexes[1]);
        String builtinTrim = text.trim();

        System.out.println("Manual trim: [" + manualTrim + "]");
        System.out.println("Built-in trim: [" + builtinTrim + "]");
        System.out.println("Comparison: " + compareUsingCharAt(manualTrim, builtinTrim));
    }
}
