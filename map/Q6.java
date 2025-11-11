package map;
import java.util.*;

public class Q6 {
    public static void main(String[] args) {
        Map<String, Double> grades = new TreeMap<>();
        grades.put("Aman", 85.0);
        grades.put("Riya", 90.0);
        grades.put("Karan", 70.0);

        grades.put("Karan", 80.0); // update
        grades.remove("Riya"); // remove

        System.out.println("Students & Grades:");
        grades.forEach((name, grade) -> System.out.println(name + " → " + grade));
    }
}
