package level_2;
import java.util.Scanner;
import java.util.Random;

public class ques_8 {

    public static int[] generateAges(int n) {
        Random rand = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = rand.nextInt(90); 
        }
        return ages;
    }

    public static String[][] checkVoting(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) result[i][1] = "False";
            else if (ages[i] >= 18) result[i][1] = "True";
            else result[i][1] = "False";
        }
        return result;
    }

    public static void display(String[][] data) {
        System.out.println("Age\tCan Vote?");
        for (String[] row : data) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 10; // fixed 10 students
        int[] ages = generateAges(n);
        String[][] result = checkVoting(ages);

        display(result);
    }
}

