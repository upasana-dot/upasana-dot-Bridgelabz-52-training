import java.util.Scanner;

public class ass_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter value of a: ");
        double a = sc.nextDouble();
        System.out.print("Enter value of b: ");
        double b = sc.nextDouble();
        System.out.print("Enter value of c: ");
        double c = sc.nextDouble();

        // Operations (same precedence applies for double)
        double result1 = a + b * c;
        double result2 = a * b + c;
        double result3 = c + a / b;
        double result4 = a % b + c;

        // Output
        System.out.printf("The results of Double Operations are %.2f, %.2f, %.2f, and %.2f\n",
                result1, result2, result3, result4);
    }
}

