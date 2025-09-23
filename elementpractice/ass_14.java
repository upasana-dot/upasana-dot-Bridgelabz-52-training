import java.util.Scanner;

public class ass_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter distance in feet: ");
        double feet = sc.nextDouble();

        // Conversion
        double yards = feet / 3;
        double miles = yards / 1760;

        // Output
        System.out.printf("The distance %.2f feet is %.2f yards and %.5f miles\n", feet, yards, miles);
    }
}

