package level_1;
import java.util.Scanner;

public class AthleteRounds {
    public static double calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        double distance = 5000; // 5 km = 5000 meters
        return distance / perimeter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 sides of the triangular park: ");
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();

        System.out.println("The athlete must complete " + calculateRounds(a, b, c) + " rounds.");
    }
}
