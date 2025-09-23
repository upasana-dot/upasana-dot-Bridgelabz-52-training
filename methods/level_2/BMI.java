package level_2;
import java.util.*;

public class BMI {
    public static double calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0;
        return weight / (heightM * heightM);
    }

    public static String getStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 24.9) return "Normal";
        else if (bmi < 29.9) return "Overweight";
        else return "Obese";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] members = new double[10][3];
        for (int i = 0; i < 10; i++) {
            double weight = sc.nextDouble();
            double height = sc.nextDouble();
            double bmi = calculateBMI(weight, height);
            members[i][0] = weight;
            members[i][1] = height;
            members[i][2] = bmi;
            System.out.println("Person " + (i+1) + ": Weight=" + weight + " Height=" + height + " BMI=" + bmi + " Status=" + getStatus(bmi));
        }
    }
}
