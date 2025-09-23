package level_2;
import java.util.*;

public class Factors {
    public static int[] findFactors(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) if (num % i == 0) count++;
        int[] factors = new int[count];
        int idx = 0;
        for (int i = 1; i <= num; i++) if (num % i == 0) factors[idx++] = i;
        return factors;
    }

    public static int sumFactors(int[] arr) {
        int sum = 0;
        for (int f : arr) sum += f;
        return sum;
    }

    public static int productFactors(int[] arr) {
        int prod = 1;
        for (int f : arr) prod *= f;
        return prod;
    }

    public static double sumSquareFactors(int[] arr) {
        double sum = 0;
        for (int f : arr) sum += Math.pow(f, 2);
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] factors = findFactors(num);

        System.out.println("Factors: " + Arrays.toString(factors));
        System.out.println("Sum = " + sumFactors(factors));
        System.out.println("Sum of Squares = " + sumSquareFactors(factors));
        System.out.println("Product = " + productFactors(factors));
    }
}
