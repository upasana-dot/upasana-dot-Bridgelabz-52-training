package level_3;
import java.util.Scanner;

public class EuclideanLine {

    // Method to calculate Euclidean Distance
    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return distance;
    }

    // Method to calculate slope and y-intercept of line
    public static double[] calculateLineEquation(double x1, double y1, double x2, double y2) {
        double[] result = new double[2]; // [slope, intercept]
        
        if (x2 - x1 == 0) {
            throw new ArithmeticException("Vertical line, slope is undefined.");
        }

        double slope = (y2 - y1) / (x2 - x1);
        double intercept = y1 - slope * x1;

        result[0] = slope;
        result[1] = intercept;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking inputs
        System.out.print("Enter x1: ");
        double x1 = sc.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();

        // Calculate distance
        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.println("Euclidean Distance between (" + x1 + "," + y1 + ") and (" + x2 + "," + y2 + ") is: " + distance);

        // Calculate slope & intercept
        try {
            double[] lineEq = calculateLineEquation(x1, y1, x2, y2);
            double slope = lineEq[0];
            double intercept = lineEq[1];

            System.out.println("Equation of line through given points: y = " + slope + "x + " + intercept);
        } catch (ArithmeticException e) {
            System.out.println("Equation of line: x = " + x1 + " (Vertical line)");
        }

        sc.close();
    }
}
