package level_2;
import java.util.*;

public class ArrayCheck {
    public static boolean isPositive(int n) { return n >= 0; }
    public static boolean isEven(int n) { return n % 2 == 0; }
    public static int compare(int a, int b) {
        if (a > b) return 1;
        else if (a == b) return 0;
        else return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
            if (isPositive(arr[i])) {
                System.out.println(arr[i] + " is Positive and " + (isEven(arr[i]) ? "Even" : "Odd"));
            } else {
                System.out.println(arr[i] + " is Negative");
            }
        }
        int cmp = compare(arr[0], arr[4]);
        System.out.println("First vs Last: " + (cmp == 0 ? "Equal" : cmp > 0 ? "First greater" : "Last greater"));
    }
}

