package level_3;
import java.util.Scanner;

public class ques_4 {

    public static char[] getUniqueChars(String text) {
        int len = text.length();
        char[] unique = new char[len];
        int count = 0;

        for (int i = 0; i < len; i++) {
            char c = text.charAt(i);
            boolean seen = false;
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == c) {
                    seen = true;
                    break;
                }
            }
            if (!seen) {
                unique[count++] = c;
            }
        }

        char[] result = new char[count];
        for (int i = 0; i < count; i++) result[i] = unique[i];
        return result;
    }

    // Method to get frequency for unique chars
    public static String[][] getFrequency(String text) {
        char[] uniqueChars = getUniqueChars(text);
        String[][] result = new String[uniqueChars.length][2];

        for (int i = 0; i < uniqueChars.length; i++) {
            char c = uniqueChars[i];
            int freq = 0;
            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(j) == c) freq++;
            }
            result[i][0] = String.valueOf(c);
            result[i][1] = String.valueOf(freq);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[][] freq = getFrequency(input);

        System.out.println("Character\tFrequency");
        for (String[] row : freq) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }
    }
}

