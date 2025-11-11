package map;
import java.util.*;

public class Q13 {
    public static void main(String[] args) {
        Map<String, Integer> courses = new HashMap<>();

        courses.put("CS101", 45);
        courses.put("AI202", 3);
        courses.put("DS303", 55);
        courses.put("ML404", 52);
        courses.put("WD505", 2);

        // Add/drop students
        courses.put("CS101", courses.get("CS101") + 5); // add
        courses.put("WD505", Math.max(0, courses.get("WD505") - 1)); // drop safely

        System.out.println("Near full courses (≥50):");
        for (Map.Entry<String, Integer> e : courses.entrySet()) {
            if (e.getValue() >= 50)
                System.out.println(e.getKey() + " → " + e.getValue());
        }

        System.out.println("\nUnder-subscribed (<5):");
        for (Map.Entry<String, Integer> e : courses.entrySet()) {
            if (e.getValue() < 5)
                System.out.println(e.getKey() + " → " + e.getValue());
        }
    }
}
