package level_1;
import java.util.Scanner;
public class ques_3 {
    public static char[] manualToCharArray(String str) {
        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        return arr;
    }

    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

        char[] arr1 = manualToCharArray(text);
        char[] arr2 = text.toCharArray();

        System.out.println("Manual conversion: " + new String(arr1));
        System.out.println("Built-in conversion: " + new String(arr2));
        System.out.println("Comparison: " + compareCharArrays(arr1, arr2));
    }
}

