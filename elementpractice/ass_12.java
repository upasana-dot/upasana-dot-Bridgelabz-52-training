import java.util.Scanner;

public class ass_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base (in cm): ");
        double base = sc.nextDouble();
        System.out.print("Enter height (in cm): ");
        double height = sc.nextDouble();

        // area
        double areaCm = 0.5 * base * height;

        // Convert to inches (1 cm² = 0.1550 in² )
        double areaInch = areaCm * 0.1550;

        // Output
        System.out.printf("The area of triangle with base %.2f cm and height %.2f cm is %.2f cm² and %.2f in²\n",
                base, height, areaCm, areaInch);
    }
}
