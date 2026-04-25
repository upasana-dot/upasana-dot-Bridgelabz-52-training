import java.util.Scanner;

public class ass_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter perimeter of square: ");
        double perimeter = sc.nextDouble();

        // Calculation
        double side = perimeter / 4;

        // Output
        System.out.printf("The length of the side is %.2f whose perimeter is %.2f\n", side, perimeter);
    }
}
