import java.util.Scanner;

public class ass_17  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter value of b: ");
        int b = sc.nextInt();
        System.out.print("Enter value of c: ");
        int c = sc.nextInt();

        // Operations (follow operator precedence: *, /, % before +, -)
        int result1 = a + b * c;   // Multiplication happens first
        int result2 = a * b + c;   // Multiplication first, then addition
        int result3 = c + a / b;   // Division first, then addition
        int result4 = a % b + c;   // Modulus first, then addition

        // Output
        System.out.printf("The results of Int Operations are %d, %d, %d, and %d\n",
                result1, result2, result3, result4);
    }
}

