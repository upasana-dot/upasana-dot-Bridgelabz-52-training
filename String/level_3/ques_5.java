package level_3;
import java.util.Scanner;

public class ques_5 {

    public static String[][] findFrequency(String text) {
        int[] freq = new int[256];
        int len = text.length();

        for (int i = 0; i < len; i++) {
            freq[text.charAt(i)]++;
        }

        int uniqueCount = 0;
        for (int f : freq) {
            if (f > 0) uniqueCount++;
        }

        String[][] result = new String[uniqueCount][2];
        int idx = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                result[idx][0] = String.valueOf((char)i);
                result[idx][1] = String.valueOf(freq[i]);
                idx++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[][] freqTable = findFrequency(input);

        System.out.println("Character\tFrequency");
        for (String[] row : freqTable) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }
    }
}

