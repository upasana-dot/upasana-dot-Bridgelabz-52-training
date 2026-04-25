package level_2;
import java.util.Scanner;

public class ques_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] salary = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter salary of employee " + (i + 1) + ": ");
            double s = sc.nextDouble();

            System.out.print("Enter years of service of employee " + (i + 1) + ": ");
            double y = sc.nextDouble();

            if (s <= 0 || y < 0) {
                System.out.println("Invalid input. Enter again.");
                i--; 
                continue;
            }

            salary[i] = s;
            yearsOfService[i] = y;
        }

        // Calculation
        for (int i = 0; i < 10; i++) {
            if (yearsOfService[i] > 5)
                bonus[i] = 0.05 * salary[i];
            else
                bonus[i] = 0.02 * salary[i];

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i + 1) + " | Old Salary: " + salary[i] +
                               " | Bonus: " + bonus[i] + " | New Salary: " + newSalary[i]);
        }

        System.out.println("\nTotal Bonus Payout = " + totalBonus);
        System.out.println("Total Old Salary = " + totalOldSalary);
        System.out.println("Total New Salary = " + totalNewSalary);
    }
}

