package level_3;
import java.util.*;

public class EmployeeBonus {

    // Method to generate old salary and years of service for 10 employees
    public static int[][] generateEmployeeData(int numberOfEmployees) {
        int[][] data = new int[numberOfEmployees][2]; // [salary, years of service]
        Random rand = new Random();

        for (int i = 0; i < numberOfEmployees; i++) {
            int salary = 10000 + rand.nextInt(90000); // 5-digit salary between 10000–99999
            int years = 1 + rand.nextInt(15);         // years of service between 1–15
            data[i][0] = salary;
            data[i][1] = years;
        }
        return data;
    }

    // Method to calculate new salary and bonus
    public static double[][] calculateBonusAndNewSalary(int[][] employeeData) {
        int n = employeeData.length;
        double[][] result = new double[n][2]; // [newSalary, bonus]

        for (int i = 0; i < n; i++) {
            int salary = employeeData[i][0];
            int years = employeeData[i][1];

            double bonusRate = (years > 5) ? 0.05 : 0.02;
            double bonus = salary * bonusRate;
            double newSalary = salary + bonus;

            result[i][0] = newSalary;
            result[i][1] = bonus;
        }
        return result;
    }

    // Method to calculate totals
    public static void calculateAndDisplayTotals(int[][] employeeData, double[][] bonusData) {
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;

        System.out.printf("%-10s %-12s %-12s %-12s %-12s %-12s\n",
                "EmpID", "OldSalary", "Years", "Bonus", "NewSalary", "BonusRate");

        for (int i = 0; i < employeeData.length; i++) {
            int oldSalary = employeeData[i][0];
            int years = employeeData[i][1];
            double newSalary = bonusData[i][0];
            double bonus = bonusData[i][1];
            double bonusRate = (years > 5) ? 5 : 2;

            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;

            System.out.printf("%-10d %-12d %-12d %-12.2f %-12.2f %-10.0f%%\n",
                    (i + 1), oldSalary, years, bonus, newSalary, bonusRate);
        }

        System.out.println("---------------------------------------------------------------");
        System.out.printf("%-10s %-12.2f %-12s %-12.2f %-12.2f\n",
                "TOTAL", totalOldSalary, "", totalBonus, totalNewSalary);
    }

    public static void main(String[] args) {
        int[][] employeeData = generateEmployeeData(10);      // Step 1
        double[][] bonusData = calculateBonusAndNewSalary(employeeData); // Step 2
        calculateAndDisplayTotals(employeeData, bonusData);   // Step 3
    }
}

