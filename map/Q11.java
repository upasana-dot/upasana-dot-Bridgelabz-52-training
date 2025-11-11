package map;
import java.util.*;

public class Q11 {
    public static void main(String[] args) {
        Map<String, Integer> attendance = new HashMap<>();
        List<String> students = Arrays.asList("Aman", "Riya", "Kunal", "Meena", "Tina");

        // Initialize with 0
        for (String s : students) attendance.put(s, 0);

        Random rand = new Random();
        int days = 15;

        // Simulate attendance for 15 days
        for (int d = 1; d <= days; d++) {
            System.out.println("\nDay " + d + " attendance:");
            for (String s : students) {
                if (rand.nextBoolean()) { // Random present
                    attendance.put(s, attendance.get(s) + 1);
                    System.out.println(s + " is present");
                }
            }
        }

        // Print under-attending students (<10)
        System.out.println("\nStudents with <10 days attendance:");
        for (Map.Entry<String, Integer> e : attendance.entrySet()) {
            if (e.getValue() < 10)
                System.out.println(e.getKey() + " → " + e.getValue() + " days");
        }
    }
}
