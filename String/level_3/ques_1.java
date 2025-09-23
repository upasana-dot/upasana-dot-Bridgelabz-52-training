package level_3;
import java.util.Scanner;

public class ques_1 {

    public static String[] computeBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0; 
        double bmi = weight / (heightM * heightM);

        String status;
        if (bmi < 18.5) status = "Underweight";
        else if (bmi < 25) status = "Normal";
        else if (bmi < 30) status = "Overweight";
        else status = "Obese";

        return new String[]{
            String.format("%.2f", bmi), status
        };
    }

    public static String[][] processTeam(double[][] hw) {
        String[][] result = new String[hw.length][4];
        for (int i = 0; i < hw.length; i++) {
            double weight = hw[i][0];
            double height = hw[i][1];
            String[] bmiData = computeBMI(weight, height);
            result[i][0] = String.valueOf(weight);
            result[i][1] = String.valueOf(height);
            result[i][2] = bmiData[0];
            result[i][3] = bmiData[1];
        }
        return result;
    }

    public static void displayResults(String[][] data) {
        System.out.println("Person\tWeight(kg)\tHeight(cm)\tBMI\tStatus");
        for (int i = 0; i < data.length; i++) {
            System.out.println((i+1) + "\t" +
                               data[i][0] + "\t\t" +
                               data[i][1] + "\t\t" +
                               data[i][2] + "\t" +
                               data[i][3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] team = new double[10][2]; 

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) of person " + (i+1) + ": ");
            team[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm) of person " + (i+1) + ": ");
            team[i][1] = sc.nextDouble();
        }

        String[][] results = processTeam(team);
        displayResults(results);
    }
}

